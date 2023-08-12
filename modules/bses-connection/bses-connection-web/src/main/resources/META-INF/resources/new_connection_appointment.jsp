<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="javax.portlet.PortletURL"%>
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
<%@ include file="/init.jsp"%>
<%!private static final Log LOGGER = LogFactoryUtil.getLog("new_connection_appointment.jsp");%>
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

.modal {
	display: none;
}

input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

input[type=number] {
  -moz-appearance: textfield !important;
}
</style>
<%--
<liferay-portlet:resourceURL id="searchLocality" var="searchLocalityURL" />
<portlet:resourceURL var="documentUploadURL" id="documentUpload">
</portlet:resourceURL>

<portlet:resourceURL id="/document/upload" var="documentUploadURL" />
<portlet:resourceURL id="/document/download" var="documentDownloadURL" />
--%>
<%
	long connectionRequestId = ParamUtil.getLong(request, BsesConnectionPortletKeys.REQUEST_ID, 0);
	if (connectionRequestId == 0 && portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID) != null) {
		connectionRequestId = (Long) portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID);
	}

	String mobileNo = ParamUtil.getString(request, BsesConnectionPortletKeys.MOBILE_NO, "");
	String emailId = ParamUtil.getString(request, BsesConnectionPortletKeys.EMAIL_ID, "");
	String requestMode = ParamUtil.getString(request, BsesConnectionPortletKeys.REQUEST_MODE);
	LOGGER.info("connectionRequestId - " + connectionRequestId);

	ConnectionRequest requestEntity = ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
	String homeURL = null;
	if(!StringUtils.equals(RequestTypeModeStatus.STATUS_DRAFT,requestEntity.getRequestStatus())){
			PortletURL actionUrl = renderResponse.createActionURL();
		 	actionUrl.setPortletMode(LiferayPortletMode.VIEW);
		 	actionUrl.setParameter("javax.portlet.action", "newConnectionHomeView");
		 	homeURL = actionUrl.toString();

	}
	request.setAttribute(ConnectionRequest.class.getName(), requestEntity);
%>

<portlet:renderURL var="emailVerificationURL">
	<portlet:param name="mvcPath" value="/email_verification.jsp" />
	<portlet:param name="connectionRequestId" value="<%=String.valueOf(connectionRequestId)%>" />
</portlet:renderURL>


<portlet:renderURL var="acknowledgementURL">
	<portlet:param name="mvcPath" value="/acknowledgement.jsp" />
	<portlet:param name="connectionRequestId" value="<%=String.valueOf(requestEntity.getConnectionRequestId())%>" />
</portlet:renderURL>

<%if(homeURL!=null){ %>
<div>
Invalid request, redirecting to home page!
</div>
	<script type="text/javascript">
		$(document).ready(function() {
			window.location.href="<%=homeURL %>";
		});
	</script>
<%}else{ %>
<div class="card card-primary bg-light mb-2">
	<div class="card-header">
		<liferay-util:include page="/request_header.jsp" servletContext="<%=application%>" />
	</div>
	<div class="card-body">
		<liferay-util:include page="/consumer.jsp" servletContext="<%=application%>" />

		<liferay-util:include page="/address.jsp" servletContext="<%=application%>" />
	
		<liferay-util:include page="/connection.jsp" servletContext="<%=application%>" />

		<liferay-util:include page="/appointment_schedule.jsp" servletContext="<%=application%>" />

		<liferay-util:include page="/declaration.jsp" servletContext="<%=application%>" />

		<liferay-util:include page="/documents.jsp" servletContext="<%=application%>" />

		<liferay-util:include page="/checklist.jsp" servletContext="<%=application%>" />

	</div>
	<div class="card-footer">
		<liferay-util:include page="/actions.jsp" servletContext="<%=application%>">
		</liferay-util:include>
	</div>
</div>
<%@ include file="/common_js.jsp"%>
<%}%>
