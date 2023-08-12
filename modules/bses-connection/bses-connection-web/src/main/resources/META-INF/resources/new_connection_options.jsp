<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@ include file="/init.jsp"%>

<portlet:actionURL name="handleCreateNewConnectionAction" var="newConnectionActionURL" >
	<portlet:param name="<%=BsesConnectionPortletKeys.REQUEST_TYPE%>" value="<%=RequestTypeModeStatus.TYPE_NEW_CONNECTION %>"/>
</portlet:actionURL>

<portlet:actionURL name="newConnectionApplyAppointmentView" var="applyAppointmentURL" />
<%
	boolean includedAsChild=ParamUtil.getBoolean(request, "includedAsChild", false);
%>
<style>
.modal {
	display: none;
}
</style>

<!-- START CONNECTION TYPE START -->

<div class="modal" id="connection-mode-type-modal">
	<div class="modal-dialog modal-dialog-centered">
		<div class="modal-content">
			<div class="modal-header bg-danger">
				<h6 class="modal-title font-weight-bold text-white">Apply for New Connection</h6>
				<button type="button" class="close text-white" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body align-items-center justify-content-center shadow px-4 py-3 rounded" style="min-height: 200px;">
				<div class="help-text text-danger text-center fs-18 my-3">
					<!-- i class="far fa-paper-plane fa-fw text-danger"></i-->
					<liferay-ui:message key="connection-request-dilogue-message" />
				</div>
				<div class="text-danger text-center my-5">
					<button class="btn btn-primary mx-2" id="<portlet:namespace/>appointmentBtn">Request for Appointment</a> 
					<button class="btn btn-danger" id="<portlet:namespace/>applyOnlineBtn">Apply Online</button>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- START CONNECTION TYPE END -->

<aui:script use="aui-base liferay-form">
$(document).ready(function(){
<%
	if(!includedAsChild){
%>
	$('#connection-mode-type-modal').modal('show'); 
<%
	}
%>
	$('#<portlet:namespace/>appointmentBtn').click(function(){
		window.location.href="<%=newConnectionActionURL.toString()%>&<portlet:namespace/>requestMode=Appointment";
	})
	$('#<portlet:namespace/>applyOnlineBtn').click(function(){
		var isRequestAllowedNow = <%=ViewHelper.isRequestAllowedNow() %>;
		if(isRequestAllowedNow){
			window.location.href="<%=newConnectionActionURL.toString()%>&<portlet:namespace/>requestMode=Online";
		}else{
			alert("This service is available Monday to Friday between 9:00 AM-5:30 PM (except Public Holidays)");
		}
	});
});
</aui:script>


