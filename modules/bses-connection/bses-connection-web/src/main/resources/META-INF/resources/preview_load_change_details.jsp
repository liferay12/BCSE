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

	<%
		long connectionRequestId = ParamUtil.getLong(request, "connectionRequestId", 0);
		if (connectionRequestId == 0 && portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID) != null) {
			connectionRequestId = (Long) portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID);
		}

		ConnectionRequest connectionRequest = ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
		ConnectionRequest oldEntity =ConnectionRequestLocalServiceUtil.convertToConnectionRequest(connectionRequest.getOldData());
		if(oldEntity == null){
			oldEntity = connectionRequest;
		}

		List<ConnectionDocument> connectionDocumentList = ConnectionDocumentLocalServiceUtil.getConnectionDocumentByConnectionRequestId(connectionRequestId);

		String idProofDocumentName = "ID Proof";
		long photoDocumentId = 0;
		try {
			ConnectionDocument connectionDocument = ConnectionDocumentLocalServiceUtil
					.getConnectionDocumentByConnectionRequestIdAndDocumentType(
							connectionRequest.getConnectionRequestId(), "Applicant_Photo");
			idProofDocumentName = connectionDocument.getDocumentName();
			photoDocumentId = connectionDocument.getConnectionDocumentId();
		} catch (Exception e) {
			System.out.println("Error - preview_request.jsp get photo " + e.getMessage());
		}
		
		boolean isOnline = StringUtils.equals(connectionRequest.getRequestMode(),	RequestTypeModeStatus.MODE_ONLINE);
		String sdw = StringUtils.trim(connectionRequest.getSonDaughterWife());
		boolean isIndividual = !StringUtils.equalsIgnoreCase(connectionRequest.getConsumerType(), MasterData.ConsumerTypes.Firm.name());
		
		String circle_dot=request.getContextPath()+"/images/circle-dot.png";
		String circle_blank=request.getContextPath()+"/images/circle-blank.png";
	
		String consumerType=StringUtils.trim(oldEntity.getConsumerType());

		String consumerName = "";
		if(StringUtils.equalsIgnoreCase(consumerType, "Firm")){
			consumerName =oldEntity.getFirmName();
		}else{
			consumerName=ViewHelper.getFullName(oldEntity);
		}
		
		boolean isEnhancement = StringUtils.equals(connectionRequest.getChangeRequestType(),RequestTypeModeStatus.TYPE_LOAD_INCREASE);
	%>
	<div class="row m-2 p-2" style="border: 1px solid black;">
		<div class="col-md-9 " >
			<div class="pt-2 pb-2">
				<label for="applicationNo" class="font-weight-bold text-uppercase form-check-inline" style="color: black; font-size: 1.5rem;">Application No :
					<%if(connectionRequest.getRequestStatus().equalsIgnoreCase("draft")) {%>
						Request yet to be submitted
					<%}else{ %>
						<%=connectionRequest.getOrderNo() %>
					<%} %>
			</div>
			
		</div>
		<div class="col-md-3 pr-5">

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
	<%if(isEnhancement){ 
		float loadRequired = connectionRequest.getLoadKw()-oldEntity.getLoadKw();
		if(loadRequired<0){
			loadRequired = 0;
		}
		float totalLoad = loadRequired +oldEntity.getLoadKw();
	%>
		<div class="row ml-2 mr-2">
			<div class="col-md-4 data-border" style="text-align: center;">
				<label>Existing Load</label><br>
				<label><%=oldEntity.getLoadKw()>0?oldEntity.getLoadKw():"________"%> KW</label>
			</div>
			<div class="col-md-4 data-border" style="text-align: center;">
				<label>Additional Load Required</label><br>
				<label><%=loadRequired>0?loadRequired:"________"%> KW</label>
			</div>
			<div class="col-md-4 data-border" style="text-align: center;">
				<label>Total Load</label><br>
				<label><%=totalLoad>0?totalLoad:"________"%> KW</label><br>
				<label>after enhancement</label>
			</div>
		</div>
	<%} else{
	
		float loadRequired = oldEntity.getLoadKw()-connectionRequest.getLoadKw();
		if(loadRequired<0){
			loadRequired = 0;
		}
		float totalLoad = oldEntity.getLoadKw()-loadRequired;
	%>
		<div class="row ml-2 mr-2">
			<div class="col-md-12 data-border" >
				<label>Load Reduction</label>
			</div>
			<div class="col-md-4 data-border" style="text-align: center;">
				<label>Existing Load</label><br>
				<label><%=oldEntity.getLoadKw()>0?oldEntity.getLoadKw():"________"%> KW</label>
			</div>
			<div class="col-md-4 data-border" style="text-align: center;">
				<label>Load Reduction Required</label><br>
				<label><%=loadRequired>0?loadRequired:"________"%> KW</label>
			</div>
			<div class="col-md-4 data-border" style="text-align: center;">
				<label>Total Load</label><br>
				<label><%=totalLoad>0?totalLoad:"________"%> KW</label><br>
				<label>after reduction</label>
			</div>
		</div>
	<%} %>
	
	
	<div class="row ml-2 mr-2">
		<div class="col-md-6 p-4 data-border">
			<label>Existing Consumer No.:</label>
		</div>
		<div class="col-md-6 p-4 data-border" >
			<label><%=oldEntity.getCaNumber() %></label>
		</div>
	</div>
	<div class="row ml-2 mr-2">
		<div class="col-md-6 p-4 data-border">
			<label>Name of the applicant / organization:</label>
		</div>
		<div class="col-md-6 p-4 data-border" >
			<label class="text-uppercase"><%=consumerName %></label>
		</div>
	</div>
	
	<div class="row ml-2 mr-2">
		<div class="col-md-6 p-4 data-border">
			<%if(isEnhancement){ %>
				<label>Address at which load enhancement is required:</label>
			<%}else{ %>
				<label>Address at which load reduction is required:</label>
			<%} %>
		</div>
		<div class="col-md-6 p-4 data-border" >
			<p style="font-size: 13px !important;">
					<%=ViewHelper.getViewAddress(oldEntity) %><br>
					Mobile: <%=oldEntity.getMobileNo()%><br>
					Email: <%=oldEntity.getEmailId()%>
			</p>
		</div>
	</div>
