<%@page import="com.bses.portal.newconnection.services.model.DssSevaKendraMst"%>
<%@page import="com.bses.portal.newconnection.services.service.DssSevaKendraMstLocalServiceUtil"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="com.bses.connection2.service.LocalityDivisionLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.LocalityDivision"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="init.jsp"%>
<%
		DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		long connectionRequestId = ParamUtil.getLong(request, "connectionRequestId", 0);
		boolean showHeader = ParamUtil.getBoolean(request, "showHeader", false);
		ConnectionRequest connectionRequest = ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
		String divisionName=StringPool.BLANK;
		String apptDivisionName=StringPool.BLANK;
		StringBuilder apptTime=new StringBuilder(StringPool.BLANK);
		
		DssSevaKendraMst dsk= DssSevaKendraMstLocalServiceUtil.isRegisteredKendra(connectionRequest.getDistrict(), null);
		
		LocalityDivision localityDivision=null;
		try{
			localityDivision=LocalityDivisionLocalServiceUtil.getLocalityDivisionByDivisionCode(connectionRequest.getDistrict());
			divisionName=localityDivision.getDivisionName();
		}catch(Exception e){}
		
		try{
			localityDivision=LocalityDivisionLocalServiceUtil.getLocalityDivisionByDivisionCode(connectionRequest.getAppointmentDistrict());
			apptDivisionName=localityDivision.getDivisionName();
		}catch(Exception e){}
		
		System.out.println("connectionRequest.getDistrict() > "+connectionRequest.getDistrict()+ "  - divisionName >"+divisionName);
		StringBuilder fullName=new StringBuilder(StringPool.BLANK);
		if(connectionRequest.getConsumerType().equalsIgnoreCase("Firm")){
			fullName.append(connectionRequest.getFirmName());
		}else{
			String title=MasterData.getTitleValue(connectionRequest.getTitle());
			if(StringUtils.isNotBlank(title)){
				fullName.append(title).append(StringPool.SPACE).append(connectionRequest.getFirstName());
			}
			else{
				fullName.append(connectionRequest.getFirstName());
			}
			if(StringUtils.isNotBlank(connectionRequest.getMiddleName())){
				fullName.append(StringPool.SPACE).append(connectionRequest.getMiddleName());
			}
			if(StringUtils.isNotBlank(connectionRequest.getLastName())){
				fullName.append(StringPool.SPACE).append(connectionRequest.getLastName());
			}
		}
	%>
<%if(showHeader){ %>
<portlet:renderURL var="baseURL" >
</portlet:renderURL>
<portlet:renderURL var="guidelinesURL" >
	<portlet:param name="mvcPath" value="/guidelines.jsp" />
</portlet:renderURL>
<portlet:actionURL name="requestListView" var="listActionURL" />

<div class="container-fluid p-1">
	<div class="row">
		<div class="col-md-12">
			<div class="float-right">
				<a href="<%=listActionURL.toString() %>" class="btn btn-link text-danger"><i class="icon-list"></i> My Requests</a>
				<a href="<%=guidelinesURL.toString() %>" class="btn btn-link text-danger" target="_blank"><i class="icon-check"></i> <liferay-ui:message key="important-guidelines" /></a>
				<a href="<%=baseURL.toString() %>&rtsx=logout" class="btn btn-link text-danger"><i class="icon-signout"></i> Logout</a>
			</div>
		</div>
	</div>
</div>

<%} %>

<div class="portlet-inner">
	<div class="row">
		<div class="col-xs-12">
			<div class="form-horizontal mt-30">
				<div class="col-md-12">
					<div id="detailedRec">
						<div class="table-responsive">
							<table class="table table-bordered table-striped">
								<tr>
									<th colspan='4'style="text-align: center;"><img src="${siteLogo}"></img><strong><h4>Acknowledgement
										for  <%=ViewHelper.getViewRequestType(connectionRequest.getRequestType()) %> Request - <%=connectionRequest.getRequestMode() %> Mode</h4></strong>
									</th> 
								</tr>
								<tr>
									<td><strong>Service Order Number</strong></td>
									<td><%=connectionRequest.getOrderNo()%></td>
									<td><strong>Order Date</strong></td>
									<td><fmt:formatDate type="date" pattern="dd-MMM-yyyy"
											value="<%=connectionRequest.getModifiedDate()%>"/></td>
								</tr>
								
								<tr>
									<td><strong>Name</strong></td>
									<td><%=fullName%></td>
									<td><strong>Mobile No</strong></td>
									<td><%=connectionRequest.getMobileNo()%></td>
								</tr>
								<tr>
									<td><strong>Division</strong></td>
									<td><%=divisionName%></td>
									<td><strong>Load(KW)</strong></td>
									<td><%=connectionRequest.getLoadKw() %></td>
								</tr>
<%
					if(StringUtils.equals(connectionRequest.getRequestMode(), BsesConnectionPortletKeys.REQUEST_MODE_APPOINTMENT)){
%>
								<tr>
									<td><strong>Division for Document Submission</strong></td>
									<td colspan="3"><%=apptDivisionName%></td>
								</tr>

								<tr>
									<td><strong>Appointment Schedule</strong></td>
									<td colspan="3"><%=dateFormat.format(connectionRequest.getAppointmentDate())%>&nbsp;<%=ViewHelper.getViewAppointmentTime(connectionRequest)%></td>
								</tr>
								
								<tr>
									<td><strong>Visit Address for Documentation</strong></td>
									<td colspan="3">&nbsp;</td>
								</tr>
								
<%
					}
%>							
								<tr>
									<td colspan="4">
										<p>We acknowledge your online request for new connection. You will be contacted shortly.</p>
									</td>
								</tr>
							</table>
							<div><p>
							In case of any query pertaining to this application, please contact </br>
							</br>
							DSK Helpline No.</br>
							<%
							if(dsk !=null){
							
							%>
							<%=dsk.getDskManagerContactNo() %> </br>
							<%=dsk.getDskManager() %> </br>
							(DSK Manager) </br>
							<%=dsk.getDskTeleCallerNo() %></br>
							<%=dsk.getDskManagerEmailId() %></br>
							<%}else{ %>
								011- 49109931 </br>
								RAJEEV AWASTHI </br>
								(DSK Manager ) </br>
								011-49107593</br>
								rajeev.awasthi@relianceada.com</br>
							<%}%>
							</p>
							</div>

						</div>
						<div class="row">
							<div class="col-xs-12">
						      	<%-- <p><strong>Registered office: </strong></p>
						      	<br>
						      	<c:choose>
						      		<c:when test="${not empty noteForAck}">
						      			<p><strong>Note: </strong>${noteForAck}</p>
						      		</c:when>
						      		<c:otherwise>
						      			<p><strong>Note: </strong>Your request subject to submission of complete application form with requisite documents to our representative or at division office and completion of commercial formalities. <c:if test="${not empty contactNoOnAckReceipt}">For any Enquiry please call at ${contactNoOnAckReceipt}.</c:if></p>
						      			<p><strong>Note: </strong>The timeline starts after completion of commercial formalities . If there is any deficiency in documents , same will be
										communicated through defined channels of SMS and/or E-mail and/or Letter.</p>
						      		</c:otherwise>
						      	</c:choose> --%>
						      	<p><strong>Note: </strong>The timeline starts after completion of commercial formalities . If there is any deficiency in documents , 
						      	same will be <br>communicated through defined channels of SMS and/or E-mail and/or Letter.</p>
						        <br>	
					
						        <p>Please take either print or write the Service Order Number for future references</p>
						        <P><center><strong style="font-size: x-large;">Safety first! Installation of ELCB is mandatory for 2KW &amp; above connections.</strong></center></P> 
						        <br>  
						    </div>
						 </div>
					 </div>   
					<div class="row">
						<div class="col-xs-12 col-xs-offset-5">
							<aui:button type="button" value="Print" name="printPage"
								cssClass="btn-blue btn-md" onClick="printReceipt()"></aui:button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
	$(document).ready(function() {
		$("div.journal-content-article div.inner-title h1").html("<liferay-ui:message key='header.newconnection' />");
	});
	function printReceipt(){
		var printContent = $("#detailedRec").html();
		$("body div#wrapper").children().hide();
		$('<div id="printReceiptSection">'+printContent+'</div>').appendTo('body');
	    window.print();
	    $("#printReceiptSection").remove();
	    $("body div#wrapper").children().show();
	   hideModalOncePrintIsOver();
	}
</script>