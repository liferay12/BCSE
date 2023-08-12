<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@ include file="/init.jsp"%>

<portlet:actionURL name="createChangeRequestAction" var="createChangeRequestActionURL" />

<%--portlet:actionURL name="newConnectionApplyAppointmentView" var="applyAppointmentURL" /> --%>

<style>
	.modal {
		display: none;
	}
</style>

<%
	boolean includedAsChild=ParamUtil.getBoolean(request, "includedAsChild", false);
%>
<!-- START CONNECTION TYPE START -->

<div class="modal" id="connection-mode-type-modal">
	<div class="modal-dialog modal-dialog-centered">
		<div class="modal-content">
			<div class="modal-header bg-danger">
				<h6 class="modal-title font-weight-bold text-white">Change Request</h6>
				<button type="button" class="close text-white" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body align-items-center justify-content-center shadow px-4 py-3 rounded" style="min-height: 200px;">
				<%--aui:form role="form" action="<%=createChangeRequestActionURL.toString()%>" name="changeRequestForm"> --%>
					<div class="help-text text-center fs-18 my-3">
						<aui:select name="requestType" class="field form-control" label="request-options-change-request-type">
							<option value="" >--Select--</option>
							<option value="<%=RequestTypeModeStatus.TYPE_NAME_CHANGE %>" >Name Change</option>
							<option value="U0304" >Load Change</option>
							<option value="U0506" >Category Change</option>
							<option value="<%=RequestTypeModeStatus.TYPE_ADDRESS_CHANGE %>" >Address Correction</option>
							<aui:validator name="required"/>						
						</aui:select>
					</div>
					<div class="text-danger text-center my-5">
						<aui:input type="hidden" name="requestMode" value=""/>
						<button class="btn btn-primary mx-2" id="<portlet:namespace/>appointmentBtn">Request for Appointment</button> 
						<button class="btn btn-danger" id="<portlet:namespace/>applyOnlineBtn">Apply Online</button>
					</div>
				<%--</aui:form> --%>
			</div>
		</div>
	</div>
</div>
<!-- START CONNECTION TYPE END -->

<aui:script use="aui-base liferay-form aui-modal aui-overlay-manager">
$(document).ready(function(){
<%
	if(!includedAsChild){
%>
	$('#connection-mode-type-modal').modal('show'); 
<%
	}
%>
	
	$('#<portlet:namespace/>appointmentBtn').click(function(){
		handleClick("Appointment");
	})
	$('#<portlet:namespace/>applyOnlineBtn').click(function(){
		
		var isRequestAllowedNow = <%=ViewHelper.isRequestAllowedNow() %>;
		if(isRequestAllowedNow){
				handleClick("Online");
		}else{
			alert("This service is available Monday to Friday between 9:00 AM-5:30 PM (except Public Holidays)");
		}
	
	});
	
	function handleClick(requestMode){
		var requestType=$('#<portlet:namespace/>requestType').val();
		if(requestType==''){
			alert('Select a change request type.');
			return;
		}
		
		if(requestType == "U07"){
			alert("Address correction service is not available currently, please contact BSES office.")
			return;
		}
		
		$('#connection-mode-type-modal').modal('hide').data('bs.modal', null );
		$("#<portlet:namespace/>requestMode").val(requestMode);
		var url="<%=createChangeRequestActionURL.toString()%>&<portlet:namespace/>requestType="+requestType+"&<portlet:namespace/>requestMode="+requestMode;
		window.location.href=url;
		<%--$("#<portlet:namespace/>changeRequestForm").submit();--%>
	}
});
</aui:script>


