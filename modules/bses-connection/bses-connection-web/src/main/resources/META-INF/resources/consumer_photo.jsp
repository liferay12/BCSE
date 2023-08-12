<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.bses.connection2.service.ConnectionDocumentLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionDocument"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="java.util.Map"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="java.util.Calendar"%>
<%@ include file="/init.jsp"%>

<%
	long connectionDocumentId=0;
	ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
	long connectionRequestId=requestEntity.getConnectionRequestId();
	String requestMode=requestEntity.getRequestMode();
	String requestType=requestEntity.getRequestType();
	
	boolean isOnline=StringUtils.equals(RequestTypeModeStatus.MODE_ONLINE, requestMode);
%>
<style>
	.note{
		padding:15px;
		border: 2px solid #ced4da;
		margin-bottom:15px;
	}
	li.note-point{
		line-height:20px;
		margin-bottom:10px;
	}
</style>
<aui:form cssClass="custom-form form-auto-save" role="form" id="consumerForm" name="consumerForm" section-attr="consumer">
	<div class="container-fluid bg-white shadow p-5 my-3" style="height: 370px;">
		<div class="row">
			<div class="col-md-12">
				<h6 class="text-uppercase text-body font-weight-bold bg-light p-3"><liferay-ui:message key="document-photo-signature" /></h6>
			</div>
		</div>
			
		<div class="row">
			<div class="col-md-2">
				</div>
				<div class="col-md-2">	
					<div style="margin:0 auto; justify-content: center;">
						<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
							<liferay-util:param name="elementName" value="applicantPhoto" />
							<liferay-util:param name="documentType" value="Applicant_Photo" />
							<liferay-util:param name="documentName" value="Applicant Photo" />
							<liferay-util:param name="fileTypes" value="image/png,image/jpeg" />
							<liferay-util:param name="thumbnail" value="true" />
							<liferay-util:param name="placeHolder" value="<%=request.getContextPath()+"/images/user-profile.png" %>" />
							<liferay-util:param name="width" value="140" />
							<liferay-util:param name="height" value="165" />
							<liferay-util:param name="maxFileSize" value="102400" />
							<liferay-util:param name="required" value="true" />
							<liferay-util:param name="tooltip" value="Allows only jpg/png files upto 100kb size." />
							<liferay-util:param name="label" value="Applicant's Photo" />
						</liferay-util:include>
					</div>
				</div>
				
				<div class="col-md-3">
				</div>
				
				<div class="col-md-3 mt-5">
					<div class="mt-5">
						<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
							<liferay-util:param name="elementName" value="applicantSignature" />
							<liferay-util:param name="documentType" value="Applicant_Signature" />
							<liferay-util:param name="documentName" value="Applicant Signature" />
							<liferay-util:param name="fileTypes" value="image/png,image/jpeg" />
							<liferay-util:param name="thumbnail" value="true" />
							<liferay-util:param name="placeHolder" value="<%=request.getContextPath()+"/images/signature.png" %>" />
							<liferay-util:param name="width" value="200" />
							<liferay-util:param name="height" value="62" />
							<liferay-util:param name="maxFileSize" value="51200" />
							<liferay-util:param name="required" value="true" />
							<liferay-util:param name="tooltip" value="Allows only jpg/png files upto 50kb size." />
							<liferay-util:param name="label" value="Applicant's Signature" />
						</liferay-util:include>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-12">
			</div>
		</div>	
		
	</div>
</aui:form>

<aui:script use="aui-base,aui-modal,aui-overlay-manager">
$(document).ready(function(){

});

</aui:script>