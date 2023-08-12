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

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script src="js/select2.min.js"></script>
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
</style>
<link href="//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css" rel="stylesheet">

	<%
		long connectionRequestId = ParamUtil.getLong(request, "connectionRequestId", 0);
		if (connectionRequestId == 0 && portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID) != null) {
			connectionRequestId = (Long) portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID);
		}

		System.out.println("preview_request.jsp- connectionRequestId - " + connectionRequestId);
		ConnectionRequest connectionRequest = ConnectionRequestLocalServiceUtil
				.getConnectionRequest(connectionRequestId);
		request.setAttribute(ConnectionRequest.class.getName(), connectionRequest);
		System.out.println("preview_request.jsp connectionRequest >- " + connectionRequest);
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


	<%--<div class="card card-primary bg-light mb-2">
		<div class="card-header">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12 pt-2 mb-4">
						<img class="img-fluid" src="<%=request.getContextPath()%>/images/preview_logo.jpg" alt="Header Images" title="Header">
					</div>
				</div>
			</div>
		</div>
		<div class="card-body"> --%>
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12 pt-2 mb-4" style="margin-bottom:-13% !important">
						<img class="img-fluid" src="<%=request.getContextPath()%>/images/preview_logo.jpg" alt="Header Images" title="Header">
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-12 pt-2">
						<h2 class="font-weight-bold text-uppercase bg-light p-3 text-center">
							<%=(isOnline ? "ONLINE" : "APPOINTMENT FOR VISIT")%>
							<%=ViewHelper.getViewRequestType(connectionRequest.getRequestType()) %> SERVICE(S) FORM
						</h2>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12" style="justify-content: center; text-align: center;">
						<div class="pt-2 pb-2" style="margin: auto; border: 2px solid black; width: 32%;">
							<label for="alignRight" class="font-weight-bold text-uppercase form-check-inline" style="color: black; font-size: 1.5rem;">Request No :
								<%if(connectionRequest.getRequestStatus().equalsIgnoreCase("draft")) {%>
									Request yet to be submitted
								<%}else{ %>
									<%=connectionRequest.getOrderNo() %>
								<%} %>
						</div>
					</div>
				</div>
				
				<div class="row mt-5">
					<div class="col-md-6">
						<h5 class="font-weight-bold">Consumer Information</h5>
					</div>
				</div>
				
				<div class="row">
					<div class="col-md-12">
						<div class="container-fluid section-container">
							<div class="row">
								<div class="col-md-9">
									<div class="row">
										<div class="col-md-6 form-group">
											<label class="control-label" for="typeOfRegistration">Consumer Type </label>
											<span class="form-control" id="consumerType"><%=connectionRequest.getConsumerType()%></span>
										</div>
									</div>
									<%
										if (isIndividual) {
									%>
									<div class="row">
										<div class="col-md-4">
											<label class="control-label" for="title">Title</label> <span class="form-control" id="title"><%=StringUtils.defaultString(MasterData.getTitleValue(connectionRequest.getTitle())," - ")%></span>
										</div>
									</div>
			
									<div class="row">
										<div class="col-md-4">
											<label class="control-label" for="firstName">First Name</label><span class="form-control" id="firstName"><%=connectionRequest.getFirstName()%></span>
										</div>
			
										<div class="col-md-4">
											<label class="control-label" for="middleName">Middle Name</label><span class="form-control" name="middleName"><%=connectionRequest.getMiddleName()%></span>
										</div>
			
										<div class="col-md-4">
											<label class="control-label" for="lastName">Last Name</label><span class="form-control" name="lastName"><%=connectionRequest.getLastName()%></span>
										</div>
									</div>
			
									<div class="row">
										<div class="form-group col-md-6">
											<label> <span class="mr-3"><img src="<%=(sdw.equals("S") ? circle_dot:circle_blank)%>" class="checklist-option">Son Of</span><span
												class="mr-3"><img src="<%=(sdw.equals("D") ? circle_dot:circle_blank)%>" class="checklist-option">Daughter Of</span><span><img src="<%=(sdw.equals("W") ? circle_dot:circle_blank)%>" class="checklist-option">Wife Of</span>
											</label> <span class="form-control"><%=connectionRequest.getFatherOrHusbandName()%></span>
										</div>
									</div>
									<%
										} else {
									%>
									<div class="row">
										<div class="col-md-6">
											<label class="control-label" for="company">Firm/Trust/Company/Others Name </label> <span class="form-control" id="firmName"><%=connectionRequest.getFirmName()%></span>
										</div>
									</div>
			
									<div class="row">
										<div class="col-md-4">
											<label class="control-label" for="authorizedSignatory">Name Of Authorized Signatory </label> <span class="form-control" id="authorizedSignatory"><%=connectionRequest.getSignatoryName()%></span>
										</div>
										<div class="col-md-4">
											<label class="control-label" for="designationOfSignatory">Designation of Signatory </label> <span class="form-control" id="designationOfSignatory"><%=connectionRequest.getSignatoryDesignation()%></span>
										</div>
										<div class="col-md-4">
											<label class="control-label" for="typeOfOrganisation">Type Of Organisation </label> <span class="form-control" id="typeOfOrganisation"><%=connectionRequest.getOrganizationType()%></span>
										</div>
									</div>
									<div class="row">
										<div class="col-md-4">
											<label class="control-label" for="dateOfIncorporation">Date Of Incorporation </label> <span class="form-control" id="dateOfIncorporation"><%=(connectionRequest.getIncorporationDate()!=null?dateDisplayFormat.format(connectionRequest.getIncorporationDate()):"")%></span>
										</div>
										<div class="col-md-4">
											<label class="control-label" for="gstNo">GST No. </label><span class="form-control" id="gstNo"><%=connectionRequest.getGstIn()%></span>
										</div>
										<div class="col-md-4">
											<label class="control-label" for="panNo">Pan No. </label><span class="form-control" id="panNo"><%=connectionRequest.getPanNo()%></span>
										</div>
									</div>
									<%
										}
									%>
								</div>
								<!-- <div class="col-4" style="margin-top: 5%;"> -->
								<div class="col-md-3">
			
									<%
									if(isOnline){
										if (photoDocumentId == 0) {
									%>
									<div style="width:142px;height:167px; border:2px solid black; text-align:center; padding:2px; margin-right:15px; float:right;" class="mb-2 mt-2">
									</div>
									<%
										} else {
									%>
			
									<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
										<liferay-util:param name="elementName" value="applicantPhoto" />
										<liferay-util:param name="documentType" value="Applicant_Photo" />
										<liferay-util:param name="documentName" value="Applicant Photo" />
										<liferay-util:param name="fileTypes" value="image/png,image/jpeg" />
										<liferay-util:param name="thumbnail" value="true" />
										<liferay-util:param name="width" value="140" />
										<liferay-util:param name="height" value="165" />
										<liferay-util:param name="readOnly" value="true" />
									</liferay-util:include>
									<%
										}
									}
									%>
								</div>
							</div>
						</div>
					</div>
				</div>	
									
				<div class="row mt-5">
					<div class="col-md-6">
						<h5 class="font-weight-bold">Address</h5>
					</div>
				</div>

				<%
					String locality = " - ";
					String district = " - ";
					try {
						LocalityDivision localityDivision = LocalityDivisionLocalServiceUtil
								.getLocalityDivision(Long.parseLong(connectionRequest.getLocality()));
						locality = localityDivision.getLocalityName();
						district = localityDivision.getDivisionName();
					} catch (Exception ex) {
					}
				%>
				<div class="row mt-2">
					<div class="col-md-12">
						<div class="container-fluid section-container">
						
						
						<div class="row">
							<div class="col-md-12 pt-2">
								<h4 class="font-weight-bold bg-light p-3">
									<liferay-ui:message key="communication-address-section-title" />
								</h4>
							</div>
						</div>
						
							<div class="row">
								<div class="col-md-3">
									<label class="control-label">House No.</label> <span class="form-control" id="houseNo"><%=connectionRequest.getHouseNo()%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">Floor</label> <span class="form-control" id="floor"><%=StringUtils.defaultString(MasterData.getFloorValue(connectionRequest.getFloor())," - ")%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">Building Name</label><span class="form-control" id="buildingName"><%=connectionRequest.getBuildingName()%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">Street</label><span class="form-control" id="street"><%=connectionRequest.getStreet()%></span>
								</div>
							</div>
			
							<div class="row">
								<div class="col-md-3">
									<label class="control-label">Colony/Area</label> <span class="form-control" id="colonyArea"><%=connectionRequest.getColonyArea()%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">Landmark</label> <span class="form-control" id="landmark"><%=connectionRequest.getLandmark()%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">Landmark Details</label> <span class="form-control" id="landmarkDetails"><%=connectionRequest.getLandmarkDetails()%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">City Postal Code </label><span class="form-control" id="cityPostalCode"><%=connectionRequest.getPinCode()%></span>
								</div>
							</div>
							<%
							if (!isIndividual) {
							%>							
							<div class="row">
								<div class="col-md-6">
									<label class="control-label">Registered Address </label><span class="form-control" id="registeredAddress"><%=connectionRequest.getRegisteredAddress()%></span>
								</div>
							</div>
							<%
							}
							%>
							
							
						<div class="row">
							<div class="col-md-12 pt-2 mt-4">
								<h4 class="font-weight-bold bg-light p-3">
									<liferay-ui:message key="supply-address-title" /> 
								</h4>
							</div>
						</div>
						<div class="row">
								<div class="col-md-6">
									<label class="control-label">Locality</label> <span class="form-control"><%=locality%></span>
								</div>
								<div class="col-md-6">
									<label class="control-label">Division</label> <span class="form-control"><%=district%></span>
								</div>
						</div>
							
						<div class="row">
							<div class="col-md-12 pt-2 mt-4">
								<h4 class="font-weight-bold bg-light p-3">
								<aui:input type="checkbox" style="cursor:default !important ; z-index:0 !important" value="1" name="sameAddressCheck" label="same-as-communication-address"  disabled="true"/>
								</h4>
							</div>
						</div>
						
							<div class="row">
								<div class="col-md-3">
									<label class="control-label">House No.</label> <span class="form-control" id="houseNo"><%=connectionRequest.getHouseNo2()%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">Floor</label> <span class="form-control" id="floor"><%=StringUtils.defaultString(MasterData.getFloorValue(connectionRequest.getFloor2())," - ")%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">Building Name</label><span class="form-control" id="buildingName"><%=connectionRequest.getBuildingName2()%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">Street</label><span class="form-control" id="street"><%=connectionRequest.getStreet2()%></span>
								</div>
							</div>
			
							<div class="row">
								<div class="col-md-3">
									<label class="control-label">Colony/Area</label> <span class="form-control" id="colonyArea"><%=connectionRequest.getColonyArea2()%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">Landmark</label> <span class="form-control" id="landmark"><%=connectionRequest.getLandmark2()%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">Landmark Details</label> <span class="form-control" id="landmarkDetails"><%=connectionRequest.getLandmarkDetails2()%></span>
								</div>
								<div class="col-md-3">
									<label class="control-label">City Postal Code </label><span class="form-control" id="cityPostalCode"><%=connectionRequest.getPinCode2()%></span>
								</div>
							</div>
							
							<div class="row">
								<div class="col-md-12 pt-2 mt-4">
									<h4 class="font-weight-bold bg-light p-3">
										Indicate Landmarks 
									</h4>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label class="control-label"><liferay-ui:message key="indicate-landmark-detail" /></label><span class="form-control" id="indicateLandmark"><%=connectionRequest.getIndicateLandmark()%></span>
								</div>
							</div>
						</div>
					</div>
				</div>
			<div class="row mt-5">
				<div class="col-md-12">
					<h5 class="font-weight-bold">Connection Details</h5>
				</div>
			</div>
			
			<div class="row">
				<div class="col-md-12">
					<div class="container-fluid section-container">
						<div class="row mt-3">
							<div class="form-group col-md-6">
								<label> <span class="mr-3"><img src="<%=(!isTemp ? circle_dot:circle_blank)%>" class="checklist-option">Permanent</span><span class="mr-3">
								<img src="<%=(isTemp ? circle_dot:circle_blank)%>" class="checklist-option">Temporary</span>
								</label>
							</div>
							<%
								if(isTemp){
							%>							
							<div class="col-md-3 form-group">
								<label class="control-label" for="title">From Date</label> <span class="form-control" id="tempStartDate"><%=(connectionRequest.getTempStartDate()!=null?dateDisplayFormat.format(connectionRequest.getTempStartDate()):"")%></span>
							</div>
							<div class="col-md-3">
								<label class="control-label" for="title">To Date</label> <span class="form-control" id="tempEndDate"><%=(connectionRequest.getTempEndDate()!=null?dateDisplayFormat.format(connectionRequest.getTempEndDate()):"")%></span>
							</div>
							<%
								}
							%>	
						</div>
						<div class="row">
							<div class="col-md-6">
								<label class="control-label" for="title">Category of electricity usage</label> <span class="form-control" id="tariffCategory"><%=StringUtils.defaultString(MasterData.getTariffCategoryValue(connectionRequest.getTariffCategory())," - ") %></span>
							</div>
							<div class="col-md-4" style="display:<%=StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0700")?"block":"none"%>">
								<label class="control-label" for="title">Purpose/Usage</label> <span class="form-control"><%=StringUtils.defaultString(connectionRequest.getEvUsage()," - ") %></span>
							</div>
						</div>
						<div class="row">
							<%
								if(!StringUtils.equals(connectionRequest.getTariffCategory(),"0100")){
							%>						
							<div class="col-md-3">
								<label class="control-label" for="load">Load (KVA)</label> <span class="form-control" id="loadKva"><%=Math.round(connectionRequest.getLoadKva())%></span>
							</div>
							<%
								}
							%>							
							<div class="col-md-3">
								<label class="control-label" for="load">Load (KW)</label> <span class="form-control" id="loadKw"><%=Math.round(connectionRequest.getLoadKw())%></span>
							</div>
							<%
								if(connectionRequest.getLoadKw()>=100){
							%>	
							<div class="col-md-3">
								<label class="control-label" for="supplyType">Supply Type</label> <span class="form-control" id="supplyType"><%=connectionRequest.getSupplyType()%></span>
							</div>
							<%
								}
							%>
							<div class="col-md-3">
								<label class="control-label" for="Purpose of Supply">Purpose of Supply</label> <span class="form-control" id="Purpose of Supply"><%=connectionRequest.getPurposeOfSupply()%></span>
							</div>
						</div>
						<div class="row">
							<div class="col-md-3">
								<label class="control-label" for="title">Type Of Area</label> <span class="form-control" id="typeOfArea"> <%=(connectionRequest.getAreaType().equals("JJCLUSTER")?"Jhuggi Jhopri Cluster":"Others")%>
								</span>
							</div>
							<div class="col-md-3">
								<label class="control-label" for="title">Type of Premises</label> <span class="form-control" id="typeOfPremises"><%=StringUtils.defaultString(MasterData.getPremisesTypeValue(connectionRequest.getPremisesType())," - ") %></span>
							</div>
							<div class="col-md-3">
								<label class="control-label" for="Type of Use/Building">Type of Use/Building</label> <span class="form-control" id="Type of Use/Building"><%=connectionRequest.getBuildingType()%></span>
							</div>
							<div class="col-md-3" style="<%=(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Other"))?"display:block":"display:none" %>">
								<label class="control-label" for="Please Specify">Please Specify</label> <span class="form-control" id="Please Specify"><%=connectionRequest.getOtherBuildingType()%></span>
							</div>
							
						</div>
						
						<%
							if(isIndustrial){
						%>	
						<div class="row">
							<div class="col-md-3">
								<label class="control-label" for="title">Industrial License Certificate No</label><span class="form-control" id="licenseCertificateNo"><%=connectionRequest.getLicenseCertificateNo()%></span>
							</div>
							<div class="col-md-3">
								<label class="control-label" for="title">License Issue Date</label> <span class="form-control" id="licenseIssueDate"><%=(connectionRequest.getLicenseIssueDate()!=null?dateDisplayFormat.format(connectionRequest.getLicenseIssueDate()):"")%></span>
							</div>
							<div class="col-md-3 form-group">
								<label class="control-label" for="title">License Valdity From</label> <span class="form-control" id="licenseValidityFrom"><%=(connectionRequest.getLicenseValidityTo()!=null?dateDisplayFormat.format(connectionRequest.getLicenseValidityFrom()):"")%></span>
							</div>
							<div class="col-md-3">
								<label class="control-label" for="title">License Validity To</label> <span class="form-control" id="licenseValidityTo"><%=(connectionRequest.getLicenseValidityTo()!=null?dateDisplayFormat.format(connectionRequest.getLicenseValidityTo()):"")%></span>
							</div>
						</div>
						<%
							}
						%>
						<div class="row mt-4">
							<div class="col-md-6">
								<label for="title">Unique Property Identification Code (UPIC) available ? (A 15 digit alphanumeric code issued by MCD)</label> <label style="display:block;"> 
								<span class="mr-3"><img src="<%=(hasUpic ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!hasUpic ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							<%
								if(hasUpic){
							%>							
							<div class="col-md-6">
								<label for="alignRight"> UPIC No. </label> <span class="form-control" id="upicNo"><%=connectionRequest.getUpic()%></span>
							</div>
							<%
								}
							%>
						</div>
					</div>
				</div>
			</div>
			
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
			<liferay-util:include page="/documents_preview.jsp" servletContext="<%=application%>"/>
			
			<div class="row mt-5">
				<div class="col-md-6">
					<h5 class="font-weight-bold">Documents CheckList</h5>
				</div>
			</div>
			
			<div class="row">
				<div class="col-md-12">
					<div class="container-fluid section-container">
					<%
						if (connectionRequest.getLoadKw() >= 2) {
							boolean elcb=connectionRequest.isElcbInstalled();
					%>
					
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span> ELCB(Earth Leakage Circuit Breaker) installed ? </span></li>
								</label>
							</div>
							<div class="col-sm-2">
								<%--
								<label> <span class="mr-3"><img src="fa-regular <%=(elcb ? "fa-circle-dot" : "fa-circle")%>" class="checklist-option">Yes</span><span class="mr-3"><i
										class="fa-regular <%=(!elcb ? "fa-circle-dot" : "fa-circle")%> mr-2"></i>No</span>
								</label> 
								--%>
								<label> <span class="mr-3"><img src="<%=(elcb?circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
									<span class="mr-3"><img src="<%=(!elcb?circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label> 
							</div>
							<div class="col-md-3">
								<div id="elcbuploaddiv" style="display:<%=connectionRequest.getElcbInstalled()?"block":"none"%>; width:100%;">
									<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
										<liferay-util:param name="elementName" value="elcbDocument" />
										<liferay-util:param name="documentType" value="ELCB_Document" />
										<liferay-util:param name="documentName" value="ELCB Document" />
										<liferay-util:param name="fileTypes" value="application/pdf" />
										<liferay-util:param name="readOnly" value="true" />
									</liferay-util:include>
								</div>
							</div>
						</div>
					<%
						}
					
						boolean wiring=connectionRequest.getWiringTest();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
									<li>
										<span> Internal Wiring at the premises has been tested by a Licensed
										Electrical Contractor/designated officer of the Government and the test Certificate is available with the applicant. </span>
									</li>
								</label>
							</div>
			
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(wiring ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!wiring ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							<div class="col-md-3">
				<div id="wiringuploaddiv" style="display:<%=connectionRequest.getElcbInstalled()?"block":"none"%>; width:100%;">
					<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
						<liferay-util:param name="elementName" value="wiringCertificate" />
						<liferay-util:param name="documentType" value="Wiring_Certificate" />
						<liferay-util:param name="documentName" value="Wiring Certificate" />
						<liferay-util:param name="fileTypes" value="application/pdf" />
					</liferay-util:include>
				</div>
				<div id="wiringuploaderrordiv" class="bg-warning text-danger p-3" style="display:none;">
					For all permanent connection request, structure and wiring at applied premises should be completed and duly tested by Licensed Electrical Contractor.
				</div>
			</div>
						</div>
					<%
					boolean showFCC = false;
				if(isDomestic)  {
							boolean stilt=connectionRequest.isStiltParking();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
									<li><span> Do you have Stilt Parking? </span></li>
								</label>
			
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(stilt ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!stilt ?circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
						</div>
					<%if(stilt){
							boolean lt17mtr=connectionRequest.isHeight17Mtr();
							if(!lt17mtr){showFCC=true;}
		 			%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label ml-5"> 
									<li><span class="mr-2">
										Is your building height under 17.5 meters?</span>
									</li> 
								</label>
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(lt17mtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img  src="<%=(!lt17mtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
			 			</div>
						
					<%	}else{
					boolean lt15mtr=connectionRequest.isHeight15Mtr();
					if(!lt15mtr){showFCC=true;}
					%>	<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label ml-5"> 
			 							<li><span>Is your building height under 15 meters? </span></li>
			 						</label> 
			 					</div>
			 					<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(lt15mtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!lt15mtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
			 			</div>
				<%		
					}
				} else{
					
					if(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(),"Residential Building")){
						//$("#building15div").show();
						boolean ltmtr=connectionRequest.isHeight15Mtr();
						if(!ltmtr){showFCC=true;}
						%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
			 							<li><span>Is your building height under 15 meters? </span></li>
			 						</label> 
			 					</div>
			 					<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
			 			</div>
			 			
				<%	}else if(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Hotel/Guest House")){
					//$("#building12div").show();
					boolean ltmtr=connectionRequest.isHeight12Mtr();
					if(!ltmtr){showFCC=true;}
				%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
			 							<li><span>Is your building height under 12 meters? </span></li>
			 						</label> 
			 					</div>
			 					<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
			 			</div>
			 			
				<%	
				}else if(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Institutional Building")){
						//$("#building9div").show();
					boolean ltmtr=connectionRequest.isHeight9Mtr();
					if(!ltmtr){showFCC=true;}
					%>
							<div class="row mt-2">
								<div class="col-sm-7">
									<label for="" class="col-form-label"> 
				 							<li><span>Is your building height under 9 meters? </span></li>
				 						</label> 
				 					</div>
				 					<div class="col-sm-2">
									<label> <span class="mr-3"><img src="<%=(ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
									<span class="mr-3"><img src="<%=(!ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
									</label>
								</div>
				 			</div>
				 			
					<%	
					} else if(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Business Building")
							|| StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Other")){
					//	$("#building15div").show();
						boolean ltmtr=connectionRequest.isHeight15Mtr();
						if(!ltmtr){showFCC=true;}
						%>
								<div class="row mt-2">
									<div class="col-sm-7">
										<label for="" class="col-form-label"> 
					 							<li><span>Is your building height under 15 meters? </span></li>
					 						</label> 
					 					</div>
					 					<div class="col-sm-2">
										<label> <span class="mr-3"><img src="<%=(ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
										<span class="mr-3"><img src="<%=(!ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
										</label>
									</div>
					 			</div>
					 			
						<%	
					}
				}
							
				if(showFCC){
					boolean fcc=connectionRequest.isFcc();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label <%=isDomestic?"ml-5":""%>"> 
									<li class="<%=isDomestic?"ml-5":""%>"><span>Do you have fire
								clearance certificate(FCC) ? </span> </li>
								</label>
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(fcc ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!fcc ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							<div class="col-sm-3" id="fccuploaddiv">
								<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
									<liferay-util:param name="elementName" value="fccCertificate" />
									<liferay-util:param name="documentType" value="FCC_Certificate" />
									<liferay-util:param name="documentName" value="FCC Certificate" />
									<liferay-util:param name="fileTypes" value="application/pdf" />					
								</liferay-util:include>
							</div>
			 			</div>
					<%
						}
							
						boolean lift=connectionRequest.isLift();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span> Do you have lift installed? </span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(lift ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!lift ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
						</div>
						<%if(lift){ %>
						
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span> Lift is installed in premises and the applicant has obtained the lift fitness certificate from the Electrical Inspector
											for the lift in the said premises and the same is available with the applicant. </span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(connectionRequest.getHasLiftCertificate() ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!connectionRequest.getHasLiftCertificate() ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							<div class="col-md-3" id="liftuploaddiv">
				<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="liftCertificate" />
					<liferay-util:param name="documentType" value="Lift_Certificate" />
					<liferay-util:param name="documentName" value="Lift Certificate" />
					<liferay-util:param name="fileTypes" value="application/pdf" />					
				</liferay-util:include>
				<%--<label class="font-weight-bold">Upload lift fitness certificate </label>
				 <aui:input type="file" style="border:0px; padding:0;" name="liftCertificate" label="checklist-lift-certificate" />
				 --%>
			</div>
						</div>
						
						
						<%} %>
					<%
					boolean indFlag =(StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(),"0320") 
							|| StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(),"0290" )
							|| StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(),"Hotel/Guest House") ); 	
					indFlag =StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(),"0320") ;
					if (indFlag) {
							boolean industrialLicenseCert=connectionRequest.getIndustrialLicense();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span>Do you have valid industrial license?</span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
		
								<label> <span class="mr-3"><img src="<%=(industrialLicenseCert ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!industrialLicenseCert ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							<div class="col-md-3">
								<div id="industrialLicenseUploadDiv" style="display:<%=connectionRequest.getIndustrialLicense()?"block":"none"%>; width:100%;">
									<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
										<liferay-util:param name="elementName" value="industrialLicenseCertificate" />
										<liferay-util:param name="documentType" value="Industrial_License_Certificate" />
										<liferay-util:param name="documentName" value="Industrial License Certificate" />
										<liferay-util:param name="fileTypes" value="application/pdf" />
									</liferay-util:include>
								</div>
							</div>
						</div>
					<%
						}
					%>
					<%
					if(StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0290")){
					%>
					<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
									<li><span>Does your Industry/Trade requires DPCC Clearance?</span></li> 
								</label>
							</div>
							<div class="col-sm-2">
								<label> 
									<span class="mr-3"><img src="<%=(connectionRequest.isDpccClearanceRequired() ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
									<span class="mr-3"><img src="<%=(!connectionRequest.isDpccClearanceRequired() ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
					</div>
					<%
					}
					%>
					
					<%
						if (connectionRequest.getTariffCategory().equals("0320") 
								|| (StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0290") && connectionRequest.isDpccClearanceRequired())
								|| (!StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0290") && StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(),"Hotel/Guest House"))) {
							boolean flag=connectionRequest.getHasDpccCertificate();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span>Do you have valid DPCC Certificate?</span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
		
								<label> <span class="mr-3"><img src="<%=(flag ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!flag ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							<div class="col-md-3">
								<div id="dpccCertificateUploadDiv" style="display:<%=flag?"block":"none"%>; width:100%;">
									<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
										<liferay-util:param name="elementName" value="dpccLicense" />
										<liferay-util:param name="documentType" value="DPCC_License" />
										<liferay-util:param name="documentName" value="DPCC License" />
										<liferay-util:param name="fileTypes" value="application/pdf" />	
									</liferay-util:include>
								</div>
							</div>
						</div>
					<%
						}
					%>
					<div >
					<%
					if(StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0290")){
					%>
					<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
									<li><span>Is your premise falls under Non-Confirming Area?</span></li> 
								</label>
							</div>
							<div class="col-sm-2">
								<label> 
									<span class="mr-3"><img src="<%=(connectionRequest.isNonConfirmingArea() ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
									<span class="mr-3"><img src="<%=(!connectionRequest.isNonConfirmingArea() ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
					</div>
						<%
						if(connectionRequest.isNonConfirmingArea()){ 
							boolean flag = connectionRequest.getHasTradeLicense();
						%>
							<div class="row mt-2">
									<div class="col-sm-7">
										<label for="" class="col-form-label">
											<li><span>Do you have valid Trade License?</span></li>
										</label>
				
									</div>
									<div class="col-sm-2">
				
										<label> <span class="mr-3"><img src="<%=(flag ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
										<span class="mr-3"><img src="<%=(!flag ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
										</label>
									</div>
									<div class="col-md-3">
										<div id="tradeCertificateUploadDiv" style="display:<%=flag?"block":"none"%>; width:100%;">
											<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
												<liferay-util:param name="elementName" value="tradeLicense" />
												<liferay-util:param name="documentType" value="Trade_License" />
												<liferay-util:param name="documentName" value="Trade License" />
												<liferay-util:param name="fileTypes" value="application/pdf" />	
											</liferay-util:include>
										</div>
									</div>
								</div>
					<%
						}
					}
					%>
					</div>
					<%
						if (connectionRequest.getTariffCategory().equals("0250")) {
							boolean bdoCert=connectionRequest.getHasBdoCertificate();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span>Do you have Certificate of Residence from Block Development Officer(BDO)? </span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
		
								<label> <span class="mr-3"><img src="<%=(bdoCert ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!bdoCert ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							
							<div class="col-md-3" id="bdocertuploaddiv">
								<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
									<liferay-util:param name="elementName" value="bdoCertificate" />
									<liferay-util:param name="documentType" value="BDO_Certificate" />
									<liferay-util:param name="documentName" value="BDO Certificate" />
									<liferay-util:param name="fileTypes" value="application/pdf" />					
								</liferay-util:include>
								<%--<label class="font-weight-bold">Upload Certificate from BDO <span class="text-danger" id="agconsumeruploadmandatory">*</span>
								</label> 
								<aui:input type="file" style="border:0px; padding:0;" name="bdoCertificate" label="checklist-agri-consumer-bdo-certificate" />
								--%>
							</div>
						</div>
					<%
						}
					
						boolean emailService=connectionRequest.isEServiceOnMail();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span></i>Do you want to avail <span class="font-weight-bold">e-Bill Services(paperless)</span> on email?</span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(emailService ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!emailService ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							
								<div class="col-sm-3" id="emailservicediv">
			
									<label class="control-label">Email - <%=connectionRequest.getEServiceMailId()%></label>
					
								</div>

						</div>
						
						<%
							boolean optSubsidy=connectionRequest.isOptSubsidy();
						%>
						<div class="row mt-2" style="display:none">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span>Do you want to opt for voluntary subsidy benefits - Yes/No?</span></li>
								</label>
		
							</div>
							 <div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(optSubsidy ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!optSubsidy ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div> 
							
						</div>
						
						<%
							boolean purchaseMeter=connectionRequest.isPurchaseMeter();
						%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span>Do you want to purchase your own CEA approved meter having additional features as approved by Commission</span></li>
								</label>
		
							</div>
							 <div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(purchaseMeter ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!purchaseMeter ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div> 
							
						</div>
						
						
					</div>
				</div>
			</div>
<%
boolean showDocList = false;
if(isOnline && showDocList){ %>
			<div class="row mt-5">
				<div class="col-md-12">
					<h5 class="font-weight-bold">Uploaded Documents</h5>
				</div>
			</div>
			
			<div class="row">
				<div class="col-md-12" style="padding: 15px !important;">
					<table style="width: 100%">
						<tr>
							<th>S.No.</th>
							<th>Document Name</th>
							<th>Document Type</th>
							<th>Download/Show</th>

						</tr>
						<%
							int i = 1;
							int skipCtr=0;
							for (ConnectionDocument connectionDocument2 : connectionDocumentList) {
								if (connectionDocument2.getDocumentType().equalsIgnoreCase("Applicant_Photo")
										|| connectionDocument2.getDocumentType().equalsIgnoreCase("Applicant_Signature")){
									skipCtr++;
									continue;
								}
								if(isIndividual){
									if(MasterData.getFirmDocumentTypes().get(connectionDocument2.getDocumentType())!=null){
										skipCtr++;
										continue;
									}
								}
								
								String extn=connectionDocument2.getClientFileName();
								extn=extn.substring(extn.lastIndexOf(".")+1);
								
								String docType=connectionDocument2.getDocumentType();
								docType=docType.replace("_", " ");
						%>
						<tr>
							<td><%=i++%></td>
							<td><%=connectionDocument2.getDocumentName()%></td>
							<td><%=docType%></td>
							<td><button Class="btn-primary m-1" id="btnShow" value="Show" onClick="viewDocument(<%=connectionDocument2.getConnectionDocumentId()%>,'<%=extn%>')">View</button></td>
						</tr>
						<%
							}
							
							if(connectionDocumentList.isEmpty() || (connectionDocumentList.size()-skipCtr)==0){
						%>
							<tr><td colspan="4" style="text-align: center;">No documents uploaded.</td></tr>
						<% 
							}
						%>
					</table>
				</div>
			</div>
	<%} %>
			<liferay-util:include page="/preview_declaration.jsp" servletContext="<%=application%>">
				<liferay-util:param name="connectionRequestId" value="<%=String.valueOf(connectionRequestId)%>" />
			</liferay-util:include>

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
		
<%--		<div class="card-footer">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12 pt-2 mb-4" style="justify-content: center; text-align: center;">
						<button class="btn btn-primary" onclick="window.print()" style="font-size: 1.5rem !important;font-weight:bold !important; padding:5px 25px 5px 25px !important; margin:auto;">Print</button>
					</div>
				</div>
			</div>
		</div>
	</div> --%>
	
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
