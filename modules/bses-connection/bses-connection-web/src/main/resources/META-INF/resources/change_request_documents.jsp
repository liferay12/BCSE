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
long connectionDocumentId=0;
ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
long connectionRequestId=requestEntity.getConnectionRequestId();
String requestMode=requestEntity.getRequestMode();
String requestType=requestEntity.getRequestType();
String consumerType=requestEntity.getConsumerType();

boolean isOnline=StringUtils.equals(RequestTypeModeStatus.MODE_ONLINE, requestMode);
boolean photoAndSignatureRequired= true;//(requestType.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NEW_CONNECTION) || requestMode.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NAME_CHANGE));
boolean idProofRequired= true;//(requestType.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NEW_CONNECTION) || requestMode.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NAME_CHANGE));
boolean ownershipProofRequired=(requestType.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NEW_CONNECTION) || requestType.equalsIgnoreCase(RequestTypeModeStatus.TYPE_ADDRESS_CHANGE) || requestType.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NAME_CHANGE));
boolean isFirmConsumer=(consumerType.equalsIgnoreCase(MasterData.ConsumerTypes.Firm.name()));
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
	.firm-documents{
		display:<%=(isFirmConsumer?"block":"none")%>;
	}
</style>
<aui:form cssClass="custom-form" role="form" name="documentForm" id="documentForm" section-attr="document">
	<div class="container-fluid bg-white shadow p-5 my-3">
		<div class="row">
			<div class="col-md-12">
				<h6 class="text-uppercase text-body font-weight-bold bg-light p-3"><liferay-ui:message key="document-section-title" /></h6>
			</div>
		</div>
<%
	if(isOnline){
%>		
		<div class="row">
			<div class="col-md-12">
				<div class="note text-danger">
					<h6 class="font-weight-bold">Important Note :</h6>
					<ul>
						<li class="note-point">
						For ownership proof - Sale Deed/Conveyance Deed/Allotment Letter/Valid Lease agreement/Mutation certificate issued by Govt authority/sub division agreement/ GPA.
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
<%
	}
%>
<%--
	if(photoAndSignatureRequired){
%>			
		
		<div class="row">
			<div class="col-md-12">
				<h6 class="font-weight-bold" style="border-radius: 4px 4px 0 0;">
					<liferay-ui:message key="document-photo-signature" />
				</h6>
			</div>
		</div>
		
		<div class="row mb-3">
			<div class="col-md-6 pl-5">
				<label class="justify-content-start"><liferay-ui:message key="document-photo" /></label>
			</div>
<%
		if(isOnline){
%>			
			<div class="col-sm-6">
				<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="applicantPhoto" />
					<liferay-util:param name="documentType" value="Applicant Photo" />
					<liferay-util:param name="documentName" value="Applicant Photo" />
					<liferay-util:param name="fileTypes" value="image/png,image/jpeg" />
					<liferay-util:param name="thumbnail" value="true" />
				</liferay-util:include>
			</div>
<%
		}
%>			
		</div>

		<div class="row mb-3">
			<div class="col-md-6 pl-5">
				<label class="justify-content-start"><liferay-ui:message key="document-signature" /></label>
			</div>
<%
		if(isOnline){
%>			
			<div class="col-md-6">
				<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="applicantSignature" />
					<liferay-util:param name="documentType" value="Applicant Signature" />
					<liferay-util:param name="documentName" value="Applicant Signature" />
					<liferay-util:param name="fileTypes" value="image/png,image/jpeg" />
					<liferay-util:param name="thumbnail" value="true" />					
				</liferay-util:include>
			</div>
<%
		}
%>			
		</div>
<%
	}
--%>	
<%
	if(idProofRequired){
%>
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
	String idProofDocumentName="ID Proof";
	try{
		ConnectionDocument connectionDocument=ConnectionDocumentLocalServiceUtil.getConnectionDocumentByConnectionRequestIdAndDocumentType(requestEntity.getConnectionRequestId(), "ID Proof");
		idProofDocumentName=connectionDocument.getDocumentName();
	}catch(Exception e){
		LOGGER.error(e.getMessage());
	}
%>			
				<aui:select class="form-control d-block w-100" name="idProofType" label="document-id-proof-type">
					<aui:option value="" label="-Select-" />
<%
		for(Map.Entry<String, String> entry:MasterData.getIDProofTypes().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getIdProofType(), entry.getKey())%>"/>
<%
		}
%>
					<aui:validator name="required"/>
				</aui:select>
				
				</div>
				<div class="col-md-2">
					<aui:input type="text" class="form-control" name="idProofNo" label="document-id-proof-no" value="<%=requestEntity.getIdProofNo() %>">
						<aui:validator name="required"/>
					</aui:input>
				</div>
<%
		if(isOnline){
%>				
			<div class="col-md-4 pt-5">
				<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="idProof" />
					<liferay-util:param name="documentType" value="ID Proof" />
					<liferay-util:param name="documentName" value="<%=idProofDocumentName%>" />
					<liferay-util:param name="required" value="true" />
					<liferay-util:param name="fileTypes" value="application/pdf" />
				</liferay-util:include>
			</div>
<%
		}
%>			
		</div>
<%
	}
%>	

<%
	if(ownershipProofRequired){
%>		
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
		ConnectionDocument connectionDocument=ConnectionDocumentLocalServiceUtil.getConnectionDocumentByConnectionRequestIdAndDocumentType(requestEntity.getConnectionRequestId(), "ID Proof");
		ownershipProofDocumentName=connectionDocument.getDocumentName();
	}catch(Exception e){
		LOGGER.error(e.getMessage());
	}
%>	
				<aui:select class="form-control d-block w-100" name="ownershipProofType" label="">
					<aui:option value="" label="-Select-" />
<%
		for(Map.Entry<String, String> entry:MasterData.getOwnershipProofTypes().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getOwnershipProofType(), entry.getKey())%>"/>
<%
		}
%>
					<aui:validator name="required"/>
				</aui:select>
			</div>
			
			<div class="col-md-2"></div>
<%
	if(isOnline){
%>			
			<div class="col-sm-4">
				<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="ownershipProof" />
					<liferay-util:param name="documentType" value="Ownership Proof" />
					<liferay-util:param name="documentName" value="<%=ownershipProofDocumentName %>" />
					<liferay-util:param name="required" value="true" />
					<liferay-util:param name="fileTypes" value="application/pdf" />
				</liferay-util:include>
			</div>
<%
	}
%>			
		</div>
<%
	}
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
				<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="<%=entry.getKey()%>" />
					<liferay-util:param name="documentType" value="<%=entry.getValue()%>" />
					<liferay-util:param name="documentName" value="<%=entry.getValue()%>" />
					<liferay-util:param name="fileTypes" value="application/pdf" />
				</liferay-util:include>
			</div>
		</div>
<%
		}
%>	
		<div class="row mb-3">
			<div class="col-md-12">
				<h6 class="font-weight-bold mb-0" style="border-radius: 4px 4px 0 0;">
					<liferay-ui:message key="document-other-documents" />
				</h6>
			</div>
		</div>	
		<div class="row mt-3 mb-2">
			<div class="col-md-8">
				<label class="ml-3"><i class="icon-check mr-3"></i>NOC with self attested id proof of all other co-owners</label>
			</div>
			<div class="col-md-4">
				<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="nocOfCoowners" />
					<liferay-util:param name="documentType" value="NOC of Co-owners" />
					<liferay-util:param name="documentName" value="NOC of Co-owners" />
					<liferay-util:param name="fileTypes" value="application/pdf" />
				</liferay-util:include>
			</div>
		</div>
		
		<div class="row mt-3 mb-2">
			<div class="col-md-8">
				<label class="ml-3"><i class="icon-check mr-3"></i>In case of legal heir - Survival certificate along with NOC &amp; self attested id proof by other legal heirs</label>
			</div>
			<div class="col-md-4">
				<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="nocOfLegalHeir" />
					<liferay-util:param name="documentType" value="NOC of Legal Heirs" />
					<liferay-util:param name="documentName" value="NOC of Legal Heirs" />
					<liferay-util:param name="fileTypes" value="application/pdf" />
				</liferay-util:include>
			</div>
		</div>	
		<div class="row mt-3 mb-2">
			<div class="col-md-8">
				<label class="ml-3"><i class="icon-check mr-3"></i>In case of unregistered GPA - Ownership chain required</label>
			</div>
			<div class="col-md-4">
				<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="ownershipChain" />
					<liferay-util:param name="documentType" value="Ownership chain" />
					<liferay-util:param name="documentName" value="Ownership chain" />
					<liferay-util:param name="fileTypes" value="application/pdf" />
				</liferay-util:include>
			</div>
		</div>		
	</div>
</aui:form>

<aui:script use="aui-base,aui-modal,aui-overlay-manager">
var indiIdProof=[];
var indiOwnershipProof=[];
var firmIdProof=[];
var firmOwnershipProof=[];

$(document).ready(function(){
	initIdAndOwnershipDocuments();
});

Liferay.provide(window,'initIdAndOwnershipDocuments', function () {

<%
	int i=0;
	for(Map.Entry<String, String> idProof:MasterData.getIDProofTypes().entrySet()){
%>		
		indiIdProof[<%=i++%>]={value:'<%=idProof.getKey()%>', text:'<%=idProof.getValue()%>'};
<%		
	}
	
	i=0;
	for(Map.Entry<String, String> idProof:MasterData.getFirmIDProofTypes().entrySet()){
%>		
		firmIdProof[<%=i++%>]={value:'<%=idProof.getKey()%>', text:'<%=idProof.getValue()%>'};
<%		
	}
	
	i=0;
	for(Map.Entry<String, String> ownProof:MasterData.getOwnershipProofTypes().entrySet()){
%>		
		indiOwnershipProof[<%=i++%>]={value:'<%=ownProof.getKey()%>', text:'<%=ownProof.getValue()%>'};
<%		
	}
	
	i=0;
	for(Map.Entry<String, String> ownProof:MasterData.getFirmOwnershipProofTypes().entrySet()){
%>		
		firmOwnershipProof[<%=i++%>]={value:'<%=ownProof.getKey()%>', text:'<%=ownProof.getValue()%>'};
<%		
	}
%>

});

Liferay.provide(window,'pupulateIdAndOwnerProofTypes', function (consumerType) {
	var idProofs=[];
	var ownProofs=[];
	
	if(consumerType=='Individual'){
		idProofs=indiIdProof;
		ownProofs=indiOwnershipProof;
	}else if(consumerType=='Firm'){
		idProofs=firmIdProof;
		ownProofs=firmOwnershipProof;
	}
	
	var idProofType=$("#<portlet:namespace/>idProofType");
	$(idProofType).empty();
	$(idProofType).append($('<option>', {value : ''}).text('-Select-'));
	
	$.each(idProofs, function(i, e){
		$(idProofType).append($('<option>', {value : e['value']}).text(e['text']));
	});
	
	var ownershipProofType=$("#<portlet:namespace/>ownershipProofType");
	$(ownershipProofType).empty();
	$(ownershipProofType).append($('<option>', {value : ''}).text('-Select-'));
	$.each(ownProofs, function(i, e){
		$(ownershipProofType).append($('<option>', {value : e['value']}).text(e['text']));
	});
});

Liferay.provide(window,'ownershipProofTypeOnChange', function () {

	$("#<portlet:namespace/>ownershipProofType").change(function() {
		handleOwnershipProofTypeChange();
	})
});

Liferay.provide(window,'handleOwnershipProofTypeChange', function () {

	var docName=$("#<portlet:namespace/>ownershipProofType option:selected" ).text();
	$("#<portlet:namespace/>ownershipProof_documentName").val(docName);
});

Liferay.provide(window,'idProofTypeOnChange', function () {

	$("#<portlet:namespace/>idProofType").change(function() {
		handleIdProofTypeChange();
	})
});

Liferay.provide(window,'handleIdProofTypeChange', function () {

	var docName=$("#<portlet:namespace/>idProofType option:selected" ).text();
	$("#<portlet:namespace/>idProof_documentName").val(docName);
});
</aui:script>