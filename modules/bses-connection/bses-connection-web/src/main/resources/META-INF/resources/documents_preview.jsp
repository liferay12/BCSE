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
<%!
	private static final Log LOGGER = LogFactoryUtil.getLog("org.apache.jsp.components.documents_005f_jsp");
%>

<%

ConnectionRequest connectionRequest = (ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
long connectionDocumentId=0;
//	ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
//	long connectionRequestId=requestEntity.getConnectionRequestId();
String requestMode=connectionRequest.getRequestMode();
String requestType=connectionRequest.getRequestType();
String consumerType=connectionRequest.getConsumerType();

boolean isOnline=StringUtils.equals(RequestTypeModeStatus.MODE_ONLINE, requestMode);
boolean photoAndSignatureRequired= true;//(requestType.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NEW_CONNECTION) || requestMode.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NAME_CHANGE));
boolean idProofRequired= true;//(requestType.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NEW_CONNECTION) || requestMode.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NAME_CHANGE));
boolean ownershipProofRequired=(requestType.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NEW_CONNECTION) || requestMode.equalsIgnoreCase(RequestTypeModeStatus.TYPE_ADDRESS_CHANGE) || requestType.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NAME_CHANGE));
boolean isFirmConsumer=(consumerType.equalsIgnoreCase(MasterData.ConsumerTypes.Firm.name()));
%>


<style>
	.note{
		padding:15px;
		margin-bottom:15px;
	}
	li.note-point{
		line-height:20px;
		margin-bottom:10px;
	}
	.firm-documents{
		display:<%=(isFirmConsumer?"block":"none")%>;
	}
	.h6, h6 {
    	font-size: 1.5rem;
	}
</style>


<div class="row mt-5">
	<div class="col-md-6">
		<h5 class="font-weight-bold">Important Documents</h5>
	</div>
</div>

<div class="row mt-3 mb-5">
	<div class="col-md-12">
		<div class="container-fluid section-container">			
		<aui:form cssClass="custom-form" role="form" name="documentForm" section-attr="document">
		<div class="row">
			<div class="col-md-12">
				<div class="note text-danger">
					<h6 class="font-weight-bold">Important Note :</h6>
					<ul>
						<li class="note-point">
						For ownership proof - Sale Deed/Conveyance Deed/Allotment Letter/Valid Lease agreement/Mutation certificate issued by Govt authority/sub division agreement/GPA.
						</li>
						<li class="note-point">
						Ensure all pages (front and back side) of the relevant document are uploaded.
						</li>
						<li class="note-point">
						All uploaded documents should be self-attested by applicants(s) on photocopy of original documents.
						</li>
						<li class="note-point">
						
						All uploaded documents should be clear & readable.
						</li>
						<li class="note-point">
						Uploaded documents should be in Pdf format . Ownership proof document within size limit of 25 MB & other documents within size limit of 5 MB .
						</li>
					</ul>
				</div>
			</div>
		</div>
		
		<div class="row mb-3">
			<div class="col-md-12">
				<h6 class="font-weight-bold mb-0 " style="border-radius: 4px 4px 0 0;">
					<liferay-ui:message key="document-id-proof" />
				</h6>
			</div>
		</div>
		
		<div class="row mb-3">
			<div class="col-md-6 pl-5">
<%
	String idProofDocumentName="ID_Proof";
	try{
		ConnectionDocument connectionDocument=ConnectionDocumentLocalServiceUtil.getConnectionDocumentByConnectionRequestIdAndDocumentType(connectionRequest.getConnectionRequestId(), "ID_Proof");
		idProofDocumentName=connectionDocument.getDocumentName();
	}catch(Exception e){
		LOGGER.error(e.getMessage());
	}
	
%>			
<%-- 				<aui:select class="form-control d-block w-100" name="idProofType" label="document-id-proof-type">
					<aui:option value="" label="-Select-" />
<%
		for(Map.Entry<String, String> entry:MasterData.getIDProofTypes().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equalsIgnoreCase(connectionRequest.getIdProofType(), entry.getKey())%>"/>
<%
		}
%>
				</aui:select> --%>
				
				<h6><liferay-ui:message key="document-id-proof-type" /></h6> <span class="form-control"><%=connectionRequest.getIdProofType() %></span>
				
				</div>
				<div class="col-md-2">
					<%-- <aui:input type="text" class="form-control" name="idProofNo" label="document-id-proof-no" value="<%=connectionRequest.getIdProofNo() %>" maxlength="16">
						
					</aui:input> --%>
						<h6><liferay-ui:message key="document-id-proof-no" /></h6><span class="form-control"><%=connectionRequest.getIdProofNo() %></span>
								
				</div>
<%
		if(isOnline){
%>				
			<div class="col-md-4 pt-5">
				<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="idProof" />
					<liferay-util:param name="documentType" value="ID_Proof" />
					<liferay-util:param name="documentName" value="<%=idProofDocumentName%>" />
					<liferay-util:param name="required" value="false" />
					<liferay-util:param name="maxFileSize" value="5242880" />
					<liferay-util:param name="fileTypes" value="application/pdf" />
				</liferay-util:include>
			</div>
<%
		}
%>			
		</div>
	
		<div class="row mb-3">
			<div class="col-md-12">
				<h6 class="font-weight-bold mb-0" style="border-radius: 4px 4px 0 0;">
					<liferay-ui:message key="document-ownership-proof" />
				</h6>
			</div>
		</div>
		
		<div class="row mb-3">
			<div class="col-md-6 pl-5">
<%		
	String ownershipProofDocumentName="Ownership Proof";
	try{
		ConnectionDocument connectionDocument=ConnectionDocumentLocalServiceUtil.getConnectionDocumentByConnectionRequestIdAndDocumentType(connectionRequest.getConnectionRequestId(), "ID_Proof");
		ownershipProofDocumentName=connectionDocument.getDocumentName();
	}catch(Exception e){
		LOGGER.error(e.getMessage());
	}
%>	
<%-- 				<aui:select class="form-control d-block w-100" name="ownershipProofType" label="">
					<aui:option value="" label="-Select-" />
<%
		
		for(Map.Entry<String, String> entry:MasterData.getOwnershipProofTypes().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equalsIgnoreCase(connectionRequest.getOwnershipProofType(), entry.getKey())%>"/>
<%
		}
%>
				</aui:select> --%>
				
					<label class="control-label"></label> <span class="form-control"><%=connectionRequest.getOwnershipProofType() %></span>
			
			</div>
			
			<div class="col-md-2"></div>
<%
		if(isOnline){
%>			
			<div class="col-sm-4">
				<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="ownershipProof" />
					<liferay-util:param name="documentType" value="Ownership_Proof" />
					<liferay-util:param name="documentName" value="<%=ownershipProofDocumentName %>" />
					<liferay-util:param name="required" value="true" />
					<liferay-util:param name="maxFileSize" value="26214400" />
					<liferay-util:param name="fileTypes" value="application/pdf" />
				</liferay-util:include>
			</div>
<%
		}
%>			
		</div>
<%
if(isFirmConsumer){
%>	
		<div class="row mb-3 firm-documents">
			<div class="col-md-12">
				<h6 class="font-weight-bold mb-0" style="border-radius: 4px 4px 0 0;">
					<liferay-ui:message key="document-firm-document-title" />
				</h6>
			</div>
		</div>
<%
	for(Map.Entry<String, String> entry:MasterData.getFirmDocumentTypes().entrySet()){
%>	
		<div class="row mt-3 mb-2 firm-documents">
			<div class="col-md-8">
				<label class="ml-3"><i class="icon-check mr-3"></i><%=entry.getValue()%></label>
			</div>
			<div class="col-md-4">
<%
		if(isOnline){
%>			
				<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="<%=entry.getKey()%>" />
					<liferay-util:param name="documentType" value="<%=entry.getKey()%>" />
					<liferay-util:param name="documentName" value="<%=entry.getValue()%>" />
					<liferay-util:param name="consumerType" value="<%=MasterData.ConsumerTypes.Firm.name()%>" />
					<liferay-util:param name="fileTypes" value="application/pdf" />
					<liferay-util:param name="readOnly" value="true" />
				</liferay-util:include>
<%
		}
%>				
			</div>
		</div>
<%
		}
}
%>			
		</aui:form>
	</div>
	</div>
</div>
