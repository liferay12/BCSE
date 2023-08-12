<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.bses.connection2.model.LocalityDivision"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="com.bses.connection2.service.LocalityDivisionLocalServiceUtil"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.bses.connection2.service.ConnectionDocumentLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionDocument"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>

<%@ include file="/init.jsp"%>
<%!
DateFormat dateDisplayFormat=new SimpleDateFormat("dd-MM-yyyy");
%>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<!-- script src='main.js'></script> -->

<style>

 th, td{
 	padding: 10px;
 	border: 1px solid #ced4da !important;
 }
 th{
 	background-color: #808080;
 	color: #fff;
 }
 .form-control{
 	font-size: 1.5rem !important;
 }
 label{
 	font-weight: normal !important;
 }
 li{
 	font-size: 1.5rem !important;
 }
 label, li, .h5, h5, th, td, .form-control, .declaration-view{
 	font-size: 1.5rem !important;
 }
 .declaration-view{
 	padding: 30px !important;
 }
 .section-container{
 	border:3px solid #ced4da !important; 
 	padding: 15px !important;
 }
 table{
 	border:3px solid #ced4da !important; 
 }
 .checklist-option{
 	width:16px !important;
 	margin-right:5px;
 }
 
.document-viewer-modal {
	display: none;
}

.img-fluid {
    max-width: 100%;
    height: 60% !important;
    width: 100% !important;
}

.data-border{
	border:1px solid #ced4da;
}
</style>
<link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">

	<%
		long connectionRequestId = ParamUtil.getLong(request, "connectionRequestId", 0);
		if (connectionRequestId == 0 && portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID) != null) {
			connectionRequestId = (Long) portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID);
		}

		ConnectionRequest connectionRequest = ConnectionRequestLocalServiceUtil
				.getConnectionRequest(connectionRequestId);
		request.setAttribute(ConnectionRequest.class.getName(), connectionRequest);
		List<ConnectionDocument> connectionDocumentList = ConnectionDocumentLocalServiceUtil
				.getConnectionDocumentByConnectionRequestId(connectionRequestId);

		String idProofDocumentName = "ID Proof";
		long photoDocumentId = 0;
		long signDocumentId = 0;
		try {
			ConnectionDocument connectionDocument = ConnectionDocumentLocalServiceUtil
					.getConnectionDocumentByConnectionRequestIdAndDocumentType(
							connectionRequest.getConnectionRequestId(), "Applicant_Photo");
			idProofDocumentName = connectionDocument.getDocumentName();
			photoDocumentId = connectionDocument.getConnectionDocumentId();
		} catch (Exception e) {
			System.out.println("Error - preview_request.jsp get photo " + e.getMessage());
		}
		try {
			ConnectionDocument connectionDocument = ConnectionDocumentLocalServiceUtil
					.getConnectionDocumentByConnectionRequestIdAndDocumentType(connectionRequest.getConnectionRequestId(), "Applicant_Signature");
			signDocumentId = connectionDocument.getConnectionDocumentId();

		} catch (Exception e) {
			System.out.println("Error - preview_request.jsp  get signature" + e.getMessage());
		}

		boolean isOnline = StringUtils.equals(connectionRequest.getRequestMode(),	RequestTypeModeStatus.MODE_ONLINE);
		String sdw = StringUtils.trim(connectionRequest.getSonDaughterWife());
		boolean isIndividual = !StringUtils.equalsIgnoreCase(connectionRequest.getConsumerType(), MasterData.ConsumerTypes.Firm.name());
		
		boolean isIndustrial=StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0320");
		boolean isTemp=StringUtils.equalsIgnoreCase(connectionRequest.getConnectionType(), "2");
		boolean hasUpic=connectionRequest.isUpicAvailable();
		boolean isDomestic=(StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0100") 
				&&  StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Residential Building"));
		//ConnectionDocument connectionDocument = ConnectionDocumentLocalServiceUtil.getConnectionDocumentByConnectionRequestIdAndDocumentType(connectionRequestId,"Applicant Photo");
		//String docId = String.valueOf(connectionDocument.getConnectionDocumentId());
		
		String circle_dot=request.getContextPath()+"/images/circle-dot.png";
		String circle_blank=request.getContextPath()+"/images/circle-blank.png";
	%>
	<portlet:renderURL var="documentViewerURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
		<portlet:param name="mvcPath" value="/document_viewer.jsp" />
	</portlet:renderURL>

	<portlet:resourceURL var="photoDocumentDownloadURL" id="documentDownload">
		<portlet:param name="cmd" value="download" />
		<portlet:param name="connectionDocumentId" value="<%=String.valueOf(photoDocumentId)%>" />
	</portlet:resourceURL>

	<portlet:resourceURL var="signDocumentDownloadURL" id="documentDownload">
		<portlet:param name="cmd" value="download" />
		<portlet:param name="connectionDocumentId" value="<%=String.valueOf(signDocumentId)%>" />
	</portlet:resourceURL>

			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12 pt-2 mb-4" style="margin-bottom:-13% !important">
						<img class="img-fluid" src="<%=request.getContextPath()%>/images/preview_logo.jpg" alt="Header Images" title="Header">
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-12 pt-2">
						<h2 class="font-weight-bold text-uppercase bg-light p-3 text-center">
							<%=(isOnline ? "ONLINE" : "APPOINTMENT FOR VISIT")%> - Application Form - <%=ViewHelper.getViewRequestType(connectionRequest) %>
						</h2>
					</div>
				</div>
			<% 
			
			if(ViewHelper.isNameChangeRequest(connectionRequest.getRequestType())){ %>
				<liferay-util:include page="/preview_name_change_details.jsp" servletContext="<%=application%>">
					<liferay-util:param name="connectionRequestId" value="<%=String.valueOf(connectionRequestId)%>" />		
				</liferay-util:include>
			<%} else if(ViewHelper.isLoadChangeRequest(connectionRequest.getRequestType())){ %>
				<liferay-util:include page="/preview_load_change_details.jsp" servletContext="<%=application%>">
					<liferay-util:param name="connectionRequestId" value="<%=String.valueOf(connectionRequestId)%>" />		
				</liferay-util:include>
			<%} else if(ViewHelper.isCategoryChangeRequest(connectionRequest.getRequestType())){ %>
				<liferay-util:include page="/preview_category_change_details.jsp" servletContext="<%=application%>">
					<liferay-util:param name="connectionRequestId" value="<%=String.valueOf(connectionRequestId)%>" />		
				</liferay-util:include>
			<%} %>
			
		<%if(!isOnline) {%>
			<%
			LocalityDivision appointmentDivision=LocalityDivisionLocalServiceUtil.getLocalityDivisionByDivisionCode(connectionRequest.getAppointmentDistrict());
			String appointmentDistrictName="";
			if(appointmentDivision!=null){
				appointmentDistrictName=appointmentDivision.getDivisionName();
			}
			%>
			<div class="row mt-5">
				<div class="col-md-6">
					<h5 class="font-weight-bold">Appointment Schedule</h5>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="container-fluid section-container">
						<div class="col-md-3">
							<label class="control-label" for="appointmentDate">Appointment Date</label> <span class="form-control"><%=ViewHelper.getViewDate(connectionRequest.getAppointmentDate())%></span>
						</div>
						<div class="col-md-3">
							<label class="control-label" for="appointmentDistrict">Appointment District</label> <span class="form-control" ><%=appointmentDistrictName%></span>
						</div>
						<div class="col-md-3">
							<label class="control-label" for="appointmentTime">Appointment Time</label> <span class="form-control"><%=ViewHelper.getViewAppointmentTime(connectionRequest)%></span>
						</div>
					</div>
				</div>
			</div>
		<%
		}
		%>
		
	<liferay-util:include page="/preview_declaration_change_request.jsp" servletContext="<%=application%>">
			<liferay-util:param name="connectionRequestId" value="<%=String.valueOf(connectionRequestId)%>" />
	</liferay-util:include>
		
	<liferay-util:include page="/documents_preview.jsp" servletContext="<%=application%>"/>		

			
		<%if(!StringUtils.equals(connectionRequest.getChangeRequestType(), RequestTypeModeStatus.TYPE_LOAD_DECREASE) && !ViewHelper.isNameChangeRequest(connectionRequest.getRequestType())){ %> 
			<liferay-util:include page="/preview_check_list.jsp" servletContext="<%=application%>">
				<liferay-util:param name="connectionRequestId" value="<%=String.valueOf(connectionRequestId)%>" />
			</liferay-util:include>
		<%} %>


			
			<div class="row mt-5">
				<div class="col-md-12">
					<h5 class="font-weight-bold">Signature</h5>
				</div>
			</div>

			<div class="row mt-3 mb-5">
				<div class="col-md-12">
					<div class="container-fluid section-container">
						<div class="row">
							<div class="col-md-12" style="text-align: center; <%= !isOnline?"display:none;":""%>" >
							<%
								if (signDocumentId == 0) {
							%>
								<div style="width:300px; height:100px; border:1px solid black; background-color:#fff; text-align:center; padding-top:70px; margin:auto;">Applicant's Signature</div>
							<%
								}else{
							%>

								<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
									<liferay-util:param name="elementName" value="applicantSignature" />
									<liferay-util:param name="documentType" value="Applicant_Signature" />
									<liferay-util:param name="documentName" value="Applicant Signature" />
									<liferay-util:param name="fileTypes" value="image/png,image/jpeg" />
									<liferay-util:param name="thumbnail" value="true" />
									<liferay-util:param name="width" value="220" />
									<liferay-util:param name="height" value="70" />
									<liferay-util:param name="readOnly" value="true" />
								</liferay-util:include>
							<%
								}
							%>		
							</div>
						</div>
						<div class="row">
							<div class="col-md-12" style="text-align: center;">
								<label style="text-decoration: underline;"> Signature of Applicant/Authorized Signatory or Thumb Impression</label>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 pt-2 mb-4" style="justify-content: center; text-align: center;">
					<button class="btn btn-primary" onclick="window.print()" style="font-size: 1.5rem !important;font-weight:bold !important; padding:5px 25px 5px 25px !important; margin:auto;">Print</button>
				</div>
			</div>
		</div>
		
		<liferay-util:include page="/document_viewer.jsp" servletContext="<%=application%>" />
		
<portlet:resourceURL var="documentDownloadURL" id="documentDownload">
	<portlet:param name="cmd" value="download"/>
</portlet:resourceURL>

<aui:script use="aui-base, liferay-preview, liferay-util-window"> 
	Liferay.provide(window,'viewDocument', function (connectionDocumentId, extension) {
	
		<%--
		window.location.href='<%=documentViewerURL.toString()%>&<portlet:namespace/>connectionDocumentId='+connectionDocumentId;
		--%>
		var viewerUrl='<%=documentDownloadURL.toString()%>&<portlet:namespace/>connectionDocumentId='+connectionDocumentId;
		//alert(viewerUrl);
		
		//alert(viewerUrl);
		
		if(!extension.toLowerCase().endsWith("pdf")){
			window.open(viewerUrl);
		}else{
			$('#<portlet:namespace />document-viewer-iframe').attr("src", viewerUrl);
			$('#<portlet:namespace />document-viewer-modal').modal('show'); 
		}
	});
	var checked=<%=ViewHelper.isSameAddress(connectionRequest)%>;
	$(document).ready(function() {
	if(checked==true){
		$("#<portlet:namespace/>sameAddressCheck").prop( "checked", true );
	}
	
});
	

</aui:script>
