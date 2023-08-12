<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<%!
	private static final Log LOGGER=LogFactoryUtil.getLog("category_change.jsp");
%>
<%
	long connectionRequestId=ParamUtil.getLong(request, BsesConnectionPortletKeys.REQUEST_ID, 0);
	if(connectionRequestId==0 && portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID)!=null){
		connectionRequestId=(Long)portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID);
	}
	
	LOGGER.info("connectionRequestId - " +connectionRequestId);
	
	ConnectionRequest requestEntity=ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
	request.setAttribute(ConnectionRequest.class.getName(),requestEntity);
	
	String requestMode=requestEntity.getRequestMode();
	boolean appointmentMode=StringUtils.equals(requestMode, BsesConnectionPortletKeys.REQUEST_MODE_APPOINTMENT);
	
%>
<style>
	input[type="radio"] {
    	opacity: 1 !important;
    	margin-top: 0 !important;	
	}
	
	input[type="checkbox"]{
    	opacity: 1 !important;
    	margin-top: 10 !important;	
	}
	
	.radio label::before{
		content:none !important;
	}
	
	label[for="<portlet:namespace/>selfDeclaration"] {
		font-size: 1em !important;
		font-weight: 700 !important;
	}
	
	input[type="checkbox"]+span {
   		background: none !important;
    	border: none !important;
    	margin-left: 0px !important;
    	margin-top: -10px !important;
    	color: #ca3e46 !important;
	}
	
	.text-warning {
   		color: #bf343c !important;
	}
	
	input[type='checkbox']:checked+span::after {
    	content:none !important;
	}
	.upload-btn{
		font-size: 1.5rem !important;
		font-weight: bold;
	}
	
	.lexicon-icon-asterisk {
		color:red;
		width:5px !important;
		height:5px !important;
	    display: inline-block !important;
	    vertical-align: top !important;
	}
	
	<%if(appointmentMode){ %>
		.modal{
			display:none;
		}
	<%} %>
	
</style>
<portlet:resourceURL var="fileUploadURL" id="fileUpload">
</portlet:resourceURL>

<div class="card card-primary bg-light mb-2">
	<div class="card-header">
		<liferay-util:include page="/request_header.jsp" servletContext="<%=application%>" />
	</div>
	<div class="card-body">
		<liferay-util:include page="/consumer_details.jsp" servletContext="<%=application%>" />
		<%if(!appointmentMode){ %>
			<liferay-util:include page="/consumer_photo.jsp" servletContext="<%=application%>" />
		<%} %>
		<liferay-util:include page="/category_change_form.jsp" servletContext="<%=application%>" />
		
		<%if(appointmentMode){ %>
			<liferay-util:include page="/appointment_schedule.jsp" servletContext="<%=application%>" />
		<%} %>

		<liferay-util:include page="/category_change_declaration.jsp" servletContext="<%=application%>" />
		
		<liferay-util:include page="/documents.jsp" servletContext="<%=application%>" />
			
		<liferay-util:include page="/checklist.jsp" servletContext="<%=application%>" />
	</div>
	<div class="card-footer">
		<liferay-util:include page="/actions.jsp" servletContext="<%=application%>" >
			<liferay-util:param name="showPreview" value="true" />
		</liferay-util:include>
	</div>
</div>

<liferay-util:include page="/document_viewer.jsp" servletContext="<%=application%>" />

<%@ include file="/change_request_common_js.jsp" %>

<script>
function isBdoCertUploadRequired(){
	try{
		var isOnlineRequest = <%=!appointmentMode%>;
		var tariffCategory = $("#<portlet:namespace/>tariffCategory").val();
		if(isOnlineRequest && tariffCategory == "0250"){
			return true;	
		}
	}catch(err){}
	
	return false;
}

function isDpccCertificateUploadRequired(){
	try{
		var isOnlineRequest = <%=!appointmentMode%>;
		if (!isOnlineRequest){
			return false;
		}
		
		var tariffCategory = $("#<portlet:namespace/>tariffCategory").val();
		var dpccClearanceRequired = $("input[name=<portlet:namespace/>dpccClearanceRequired]:checked").val();
		var buildingType =  $("#<portlet:namespace/>buildingType").val();
		
		if(tariffCategory=="0320" || (tariffCategory == "0290" && dpccClearanceRequired==1) || buildingType=="Hotel/Guest House") {
			return true;	
		}
	}catch(err){}
	
	return false;
}

</script>
