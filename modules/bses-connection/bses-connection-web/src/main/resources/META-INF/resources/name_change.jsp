<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="javax.portlet.PortletSession"%>
<%@ include file="/init.jsp"%>
<%!private static final Log LOGGER = LogFactoryUtil.getLog("name_change.jsp");%>
<%
	long connectionRequestId = ParamUtil.getLong(request, BsesConnectionPortletKeys.REQUEST_ID, 0);
	if (connectionRequestId == 0 && portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID) != null) {
		connectionRequestId = (Long) portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID);
	}

	LOGGER.info("connectionRequestId - " + connectionRequestId);

	ConnectionRequest requestEntity = ConnectionRequestLocalServiceUtil
			.getConnectionRequest(connectionRequestId);
	request.setAttribute(ConnectionRequest.class.getName(), requestEntity);
	
	String requestMode=requestEntity.getRequestMode();
	boolean appointmentMode=StringUtils.equals(requestMode, BsesConnectionPortletKeys.REQUEST_MODE_APPOINTMENT);
%>
<style>
.lexicon-icon-asterisk {
	color: red;
	width: 5px !important;
	height: 5px !important;
	display: inline-block !important;
	vertical-align: top !important;
}

input[type="radio"] {
	opacity: 1 !important;
	margin-top: 0 !important;
}

input[type="checkbox"] {
	opacity: 1 !important;
	margin-top: 10 !important;
}

.radio label::before {
	content: none !important;
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
	content: none !important;
}

.upload-btn {
	font-size: 1.5rem !important;
	font-weight: bold;
}

.bg-yellow {
	background-color: yellow;
}

.close {
	color: #aaaaaa;
	float: right;
	font-size: 28px;
	font-weight: bold;
}

.close:hover, .close:focus {
	color: #000;
	text-decoration: none;
	cursor: pointer;
}

<%if(appointmentMode){ %>
	.modal{
		display:none;
	}
<%} %>
</style>
<portlet:resourceURL var="documentUploadURL" id="documentUpload">
</portlet:resourceURL>
<%--
<portlet:resourceURL id="/document/upload" var="documentUploadURL" />
<portlet:resourceURL id="/document/download" var="documentDownloadURL" />
--%>


<portlet:renderURL var="emailVerificationURL">
	<portlet:param name="mvcPath" value="/email_verification.jsp" />
	<portlet:param name="connectionRequestId" value="<%=String.valueOf(connectionRequestId)%>" />
</portlet:renderURL>


<portlet:renderURL var="acknowledgementURL">
	<portlet:param name="mvcPath" value="/acknowledgement.jsp" />
	<portlet:param name="connectionRequestId" value="<%=String.valueOf(requestEntity.getConnectionRequestId())%>" />
</portlet:renderURL>

<div class="card card-primary bg-light mb-2">
	<div class="card-header">
		<liferay-util:include page="/request_header.jsp" servletContext="<%=application%>" />
	</div>
	<div class="card-body">

		<liferay-util:include page="/consumer_details.jsp" servletContext="<%=application%>" />

		<liferay-util:include page="/consumer.jsp" servletContext="<%=application%>" />

		<%if(appointmentMode){ %>
			<liferay-util:include page="/appointment_schedule.jsp" servletContext="<%=application%>" />
		<%} %>
		
		<liferay-util:include page="/name_change_declaration.jsp" servletContext="<%=application%>" />

		<liferay-util:include page="/documents.jsp" servletContext="<%=application%>" />

	</div>
	<div class="card-footer">
		<liferay-util:include page="/actions.jsp" servletContext="<%=application%>" >
			<liferay-util:param name="showPreview" value="true" />
		</liferay-util:include>
	</div>
</div>

<liferay-util:include page="/document_viewer.jsp" servletContext="<%=application%>" />

<%@ include file="/change_request_common_js.jsp"%>
