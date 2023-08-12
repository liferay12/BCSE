<%@page import="com.bses.connection2.service.LocalityDivisionLocalServiceUtil"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<style>
.modal{
	display:none;
}
</style>
<%
	String mobileNo=ParamUtil.getString(request, "mobileNo", "");
	String emailId=ParamUtil.getString(request, "emailId", "");
	if(StringUtils.isBlank(mobileNo)){
		if(portletSession.getAttribute(BsesConnectionPortletKeys.MOBILE_NO)!=null){
			mobileNo =(String) portletSession.getAttribute(BsesConnectionPortletKeys.MOBILE_NO);
		}
	}
	if(StringUtils.isBlank(emailId)){
		if(portletSession.getAttribute(BsesConnectionPortletKeys.EMAIL_ID)!=null){
			emailId =(String) portletSession.getAttribute(BsesConnectionPortletKeys.EMAIL_ID);
		}
	}
%>
<portlet:actionURL name="handleCreateNewConnectionAction" var="createNewRequestURL">
	<%--<portlet:param name="mvcPath" value="/new_connection.jsp" />
	<portlet:param name="mobileNo" value="<%=mobileNo%>" />
	<portlet:param name="emailId" value="<%=emailId%>" /> --%>
</portlet:actionURL>
<portlet:actionURL name="handleEditNewRequestAction" var="editNewRequestURL"/>

<portlet:renderURL var="editConnectionURL">
	<portlet:param name="mvcPath" value="/new_connection.jsp" />
	<portlet:param name="mobileNo" value="<%=mobileNo%>" />
	<portlet:param name="emailId" value="<%=emailId%>" />
</portlet:renderURL>

<portlet:renderURL var="deleteConnectionURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="mvcPath" value="/delete_connection.jsp" />
</portlet:renderURL>
<portlet:renderURL var="listConnectionURL">
	<portlet:param name="mvcPath" value="/list_connections.jsp" />
	<portlet:param name="mobileNo" value="<%=mobileNo%>" />
	<portlet:param name="emailId" value="<%=emailId%>" />
</portlet:renderURL>
<portlet:renderURL var="logoutBaseURL" >
</portlet:renderURL>
<portlet:renderURL var="guidelinesURL" >
	<portlet:param name="mvcPath" value="/guidelines.jsp" />
</portlet:renderURL>
<%
	portletSession.removeAttribute(BsesConnectionPortletKeys.REQUEST_ID);
	List<ConnectionRequest> connectionRequestList=ConnectionRequestLocalServiceUtil.getNewRequestsByMobileNo(mobileNo);
	//(List)request.getAttribute(BsesConnectionPortletKeys.REQUEST_LIST);
	/*if(connectionRequestList==null){
		connectionRequestList=ConnectionRequestLocalServiceUtil.getNewRequestsByMobileNo(mobileNo);
	}*/
	DateFormat dateFormat=new SimpleDateFormat(PropsUtil.get("display.datetime.format"));
%>
<div class="card card-primary bg-light mb-2">
	<div class="card-header">
		<div class="container-fluid p-1">
			<div class="row">
				<div class="col-md-6">
					<h6><liferay-ui:message key="list-connection-title" /></h6>
				</div>
				
				<div class="col-md-6">
					<div class="float-right">
						<a href="<%=guidelinesURL.toString() %>" class="btn btn-link text-danger" target="_blank"><i class="icon-check"></i> <liferay-ui:message key="important-guidelines" /></a>
						<a href="<%=logoutBaseURL.toString() %>&rtsx=logout" class="btn btn-link text-danger"><i class="icon-signout"></i> Logout</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="card-body">
		<div class="container-fluid">
		<div class="row">
			<div class="col-md-12 text-center font-weight-bold text-danger">
<%
	int count=5;
	try{
		count=Integer.parseInt(PropsUtil.get("connection.request.draft.max.count").trim());
	}catch(Exception e){}

	if(connectionRequestList.size()>0){
%>		
				<liferay-ui:message key="list-connection-existing-connection-alert" arguments="<%=connectionRequestList.size() %>"/>
<%
	}

	if(connectionRequestList.size()<count){
%>	
				<liferay-ui:message key="list-connection-create-new-connection"/>			
				<button class="btn-primary text-white p-2 ml-3" id="<portlet:namespace/>createNewRequest" value="New Connection">New Connection</button>
<%
	}
%>
			</div>
		</div>
		</div>
		<div class="table-responsive shadow bg-white mx-3 p-4 mt-4 w-100">
			<table class="table table-sm table-bordered">
				<thead class="bg-light">
					<tr>
						<th scope="col">Request No</th>
						<th scope="col">Company</th>
						<th scope="col">District</th>
						<th scope="col">Request Type</th>
						<th scope="col">Name</th>
						<th scope="col">Email Id</th>
						<th scope="col">Mobile No</th>
						<th scope="col">Entry Date</th>
					</tr>
				</thead>
				<tbody>
<%
				for(ConnectionRequest r:connectionRequestList){
					
				//	String name=MasterData.getTitleValue(r.getTitle())+" "+r.getFirstName()+(StringUtils.isNotBlank(r.getMiddleName())?" "+r.getMiddleName():"")+(StringUtils.isNotBlank(r.getLastName())?" "+r.getLastName():"");
					String name = "";
					if(r.getConsumerType().equalsIgnoreCase("Individual"))
					{
						if(StringUtils.isNotBlank(r.getTitle())){
							name = MasterData.getTitleValue(r.getTitle())+" ";
						}
						name = name + r.getFirstName()+(StringUtils.isNotBlank(r.getMiddleName())?" "+r.getMiddleName():"")+(StringUtils.isNotBlank(r.getLastName())?" "+r.getLastName():"");
					}
					else if(r.getConsumerType().equalsIgnoreCase("Firm"))
					{
						name = r.getFirmName();
					}
				
				String divisionName="";
					try{
						divisionName=LocalityDivisionLocalServiceUtil.getLocalityDivisionByDivisionCode(r.getDistrict()).getDivisionName(); 
					}catch(Exception e){}
					
					if(StringUtils.isBlank(divisionName)){
						divisionName = r.getDistrict();
					}
					//System.out.println("name = "+name);
%>				
					<tr>
						<td class="d-flex align-items-center">
						<%if(StringUtils.equalsIgnoreCase(RequestTypeModeStatus.STATUS_DRAFT, r.getRequestStatus())){ %>
						<span class="text-primary"> <a href=""><%=r.getRequestNo() %></a></span>
						<span class="btn-group ml-2">
								<button type="button" class="btn btn-primary edit-connection-btn" data-toggle="tooltip" data-placement="top" title="Edit" value="Edit" data-id="<%=r.getConnectionRequestId()%>" data-rno="<%=r.getRequestNo()%>">
									<%--<i class="fas fa-pencil-alt fa-sm text-primary"></i> --%>
									<i class="icon-edit"></i>
								</button>
								
								<button type="button" class="btn btn-danger delete-connection-btn ml-1 " data-placement="top" data-toggle="tooltip" title="Delete" value="Delete" data-id="<%=r.getConnectionRequestId()%>" data-rno="<%=r.getRequestNo()%>">
									<%--<i class="far fa-trash-alt fa-sm text-danger"></i>--%>
									<i class="icon-trash"></i>
								</button>
						</span>
						<%}else if(StringUtils.equalsIgnoreCase(RequestTypeModeStatus.STATUS_ORDER_GENERATED, r.getRequestStatus())){ %>
							<portlet:renderURL var="previewURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>" >
								<portlet:param name="mvcPath" value="/preview_request.jsp" />
								<portlet:param name="connectionRequestId" value="<%=String.valueOf(r.getConnectionRequestId()) %>" />
							</portlet:renderURL>
							<portlet:renderURL var="acknowledgementURL" >
								<portlet:param name="mvcPath" value="/acknowledgement.jsp" />
								<portlet:param name="connectionRequestId" value="<%=String.valueOf(r.getConnectionRequestId()) %>" />
							</portlet:renderURL>
							<span class="text-primary"> <a href=""><%=r.getOrderNo() %></a></span>
							<span class="btn-group ml-2">
								<a href="<%=previewURL.toString()%>" class="btn btn-primary" title="Preview" target="_blank"><i class="icon-eye-open"></i></a>
							</span>
							<span class="btn-group ml-2">
								<a href="<%=acknowledgementURL.toString()%>" class="btn btn-primary" title="Acknowledgement" target="_blank"><i class="icon-file"></i></a>
							</span>
							
							<%if(StringUtils.equalsIgnoreCase(PropsUtil.get("connection.request.submit.delete"), "true")){ %>
								<button type="button" class="btn btn-danger delete-connection-btn ml-1 " data-placement="top" data-toggle="tooltip" title="Delete" value="Delete" data-id="<%=r.getConnectionRequestId()%>" data-rno="<%=r.getRequestNo()%>">
									<%--<i class="far fa-trash-alt fa-sm text-danger"></i>--%>
									<i class="icon-trash"></i>
								</button>
							<%}
						}%>
						</td>
						<td>BRPL</td>
						<td><%=divisionName %></td>
						<td><%=RequestTypeModeStatus.getRequestType(StringUtils.trim(r.getRequestType()))%></td>
						<td><%=StringUtils.trim(name)%></td>
						<td><%=StringUtils.trim(r.getEServiceMailId()) %></td>
						<td><%=StringUtils.trim(r.getMobileNo()) %></td>
						<td><%=dateFormat.format(r.getCreateDate())%></td>
					</tr>
<%
				}
				if(connectionRequestList==null || connectionRequestList.isEmpty()){
%>
					<td colspan="8" style="text-align:center;"><h6>No record(s) available.</h6></td>
<%
				}
%>
				</tbody>
			</table>
		</div>
	</div>
</div>

<div class="modal" id="delete-connection-modal">
	<div class="modal-dialog modal-dialog-centered">
		<div class="modal-content">
			<div class="modal-header bg-danger">
				<h5 class="modal-title font-weight-bold text-white">Delete Connection Request?</h5>
				<button type="button" class="close text-white" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body align-items-center justify-content-center" style="padding-top:25px; padding-bottom:25px;">
				<div class="help-text text-danger text-center fs-18">
					<!-- i class="far fa-paper-plane fa-fw text-danger"></i-->
					Are you sure you want to delete this request (no- <span class="font-weight-bold" id="delete-connection-request-no"></span>)?
				</div>
			</div>
			<div class="modal-footer align-items-center justify-content-center">
				<div class="text-danger text-center">
					<button type="button" class="btn btn-danger btn-sm" id="delete-connection-yes-btn" value="Yes" data-id="">Yes</button>
					<button type="button" class="btn btn-primary btn-sm" id="delete-connection-no-btn" value="No">No</button>
				</div>
			</div>
		</div>
	</div>
</div>

<liferay-util:include page="/new_connection_options.jsp" servletContext="<%=application%>">
	<liferay-util:param name="includedAsChild" value="true" />
</liferay-util:include>

<aui:script use="aui-modal aui-overlay-manager">
	$(document).ready(function() {
<%
		if(connectionRequestList.size()==0){
%>
			$('#connection-mode-type-modal').modal('show');
<%
		}
%>
		//$('[data-toggle="tooltip"]').tooltip();
		$("#<portlet:namespace/>createNewRequest").click(function(){
			$('#connection-mode-type-modal').modal('show');
		});
		
		$(".edit-connection-btn").click(function(){
			window.location.href='<%=editNewRequestURL.toString()%>&<portlet:namespace/>connectionRequestId='+$(this).attr("data-id");
		});
		
		$(".delete-connection-btn").click(function(){
			$('#delete-connection-yes-btn').attr('data-id', $(this).attr("data-id"));
			$('#delete-connection-request-no').html($(this).attr("data-rno"));
			$('#delete-connection-modal').modal('show');
		});
		
		$("#delete-connection-yes-btn").click(function(){
			deleteConnection($(this).attr('data-id'));
		});
		$("#delete-connection-no-btn").click(function(){
			$('#delete-connection-modal').modal('hide').data('bs.modal', null );
		})
		
		blinkText();
	});
	
	function deleteConnection(connectionRequestId){
		Liferay.Service('/bsesconn.connectionrequest/delete-by-connection-request-id', 
			{
				"connectionRequestId" : connectionRequestId
			},
			function(response) {	
				var message="Record deletion failed.";
				if(response!=true){
					message="Record deletion failed.";
				}
				$('#delete-connection-modal').modal('hide').data('bs.modal', null );
				if(response==true){
					window.location.href="<%=listConnectionURL.toString()%>";
				}
			}
		);	
	}
	
	function blinkText(){
		setInterval(function () {
			$(".blink").each(function( index ) {
				console.log($(this).css("opacity"));
	            $(this).css("opacity", 
	            ($(this).css("opacity") == 0 ? 1 : 0));
	       
			});
		}, 1000);
	}
	
	Liferay.provide(
		window,
		'<portlet:namespace />listConnections_closeDialog',
		function(data) {
			if(data){
				console.log(data);	
			}
			var dialog = Liferay.Util.Window.getById('<portlet:namespace/>'+data.dialogId);
			dialog.destroy();
			if(data.refresh){
				window.location.href='<%=listConnectionURL%>';
			}
		},
		['liferay-util-window']
	);
</aui:script>