<%@page import="com.bses.connection2.web.portlet.PreviewHelper"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp"%>
<%
	long connectionRequestId = ParamUtil.getLong(request, "connectionRequestId", 0);
	if(connectionRequestId==0 && portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID)!=null){
		connectionRequestId=(Long)portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID);
	}
	
	ConnectionRequest cr = ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
	
	ConnectionRequest oldEntity =ConnectionRequestLocalServiceUtil.convertToConnectionRequest(cr.getOldData());
	if(oldEntity == null){
		oldEntity = cr;
	}
	
	PreviewHelper ph = new PreviewHelper(cr);
		
%>

<style>
.declaration-view {
	margin: 4px;
	padding: 4px;
	border: 2px solid #ced4da;
	width: 100%;
	text-align: justify;
}

table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}

table.center {
  margin-left: auto; 
  margin-right: auto;
}
</style>
<div class="container-fluid bg-white shadow p-5 my-3">
		<div class="row">
			<div class="col-md-12">
				<h6 class="text-uppercase text-body font-weight-bold bg-light p-3 text-center">
					<liferay-ui:message key="declaration-section-title" />
				</h6>
			</div>
		</div>
		<div class="row">
		
		<div class="col-md-12" style="border: solid 1px;overflow: scroll;height: 350px;" id="declarationDiv">
				<p>
					I, <a id="dec_individual_name" class="dec_individual_name" style="font-weight: bold;">____</a> Son/Daughter/Wife of <a id="dec_individual_father_name" class="dec_individual_father_name" style="font-weight: bold;">_____</a>
					Resident of <a id="dec_individual_address" class="dec_individual_address" style="font-weight: bold;">____</a> (hereinafter
					referred to as "Applicant", which term shall mean and include executors, administrators, heirs, successors and assigns), do hereby swear and
					declare as under:
				</p>
				Or
				<p>
					The <a id="dec_firm_name"  class="dec_firm_name" style="font-weight: bold;">___</a>, a company incorporated under the provisions of the Companies Act, 1956 or as amended,
					having its registered office at <a id="dec_firm_address" class="dec_firm_address" style="font-weight: bold;">___</a> (hereinafter referred to as "Applicant", which
					expression shall, unless repugnant to the context or meaning thereof, include its successors and assigns), through its Authorized
					representative Mr. <a id="dec_authorized_signatory"  class ="dec_authorized_signatory" style="font-weight: bold;">___</a> do hereby swear and declare as under:
				</p>
				Or
				<p>
					A Sole proprietorship/ a partnership firm having its office at <a id="address2" class="dec_firm_address" style="font-weight: bold;">___</a> (hereinafter referred to as
					the applicant which unless the context otherwise provides includes its successors and assigns), through Mr. <a id="authorizedSignature2" class ="dec_authorized_signatory"
						style="font-weight: bold;">___</a> , who is a partner or an authorized representative do hereby swear and declare as under:
				</p>
				<p>
				THAT the Applicant is a lawful occupant of the premises at <a id="address3"  class="dec_connection_address" style="font-weight: bold;">___</a>(hereinafter the "Premises").
				</p>
<!-- inclue static part -->
			<%@ include file="/declaration_part_1_static_content.jsp" %>  
	
																									 
	
	</div>
		</div>
	<div class="row">
		<div class="col-md-12 mt-3 mb-2">
		<aui:form cssClass="custom-form form-auto-save" role="form" name="declarationForm" section-attr="declaration">
			<div class="form-check-inline">
					<aui:input cssClass="mr-2" type="checkbox" value="1" name="selfDeclaration" label="declaration-check">
						<aui:validator name="required" />
					</aui:input> 
			</div>
			</aui:form>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12 ml-5 mb-2" style="color:red;">
			<liferay-ui:message key="document-read-note" />
		</div>
	</div>
</div>

<script>  

var address = "<%=ViewHelper.getViewAddress(oldEntity,", ") %>";

$(document).ready(function(){  
	
	$('#<portlet:namespace/>selfDeclaration').attr("disabled", true);
	if($("#<portlet:namespace/>consumerType")){
		$("#<portlet:namespace/>consumerType").change(function() {
			updateName();
			updateAddress();
		});
	}
	
	
	updateName();
	updateAddress();
}); 


	
function updateName()
{
	var consumerType = $("#<portlet:namespace/>consumerType").val();
	if(consumerType == "Individual")
	{
		updateNameDetails();
	}
	else
	{
		updateFirmNameDetails();
	}
}

function updateFirmNameDetails(){
	var signatoryName = "<%=ViewHelper.getFullName(oldEntity) %>";
	var firmName= "<%=oldEntity.getFirmName()%>";

	if(signatoryName == ""){
		signatoryName = "____";
	}
	
	if(firmName == ""){
		firmName = "____";
	}
	updateFieldValue("dec_applicant_name", signatoryName); //dec_applicant_name -  detail1
	updateFieldValue("dec_firm_or_father_name", firmName); 
	updateFieldValue("dec_authorized_signatory", signatoryName); 
	updateFieldValue("dec_firm_name", firmName);
	
	updateFieldValue("dec_individual_name","____");
	updateFieldValue("dec_individual_father_name","____");
}

function updateNameDetails(){

	var fullname= "<%=ViewHelper.getFullName(oldEntity) %>";
	
	if(fullname == ""){
		fullname = "____";
	}
	
	var fatherName= "<%=oldEntity.getFatherOrHusbandName()%>";
	if(fatherName == ""){
		fatherName = "____";
	}
	
	updateFieldValue("dec_individual_name", fullname); 
	updateFieldValue("dec_individual_father_name", fatherName);
	updateFieldValue("dec_applicant_name", fullname);
	updateFieldValue("dec_firm_or_father_name",fatherName);
	updateFieldValue("dec_applicant_father_name",fatherName);
	
	updateFieldValue("dec_firm_name","___");
	updateFieldValue("dec_authorized_signatory","___");
}

function updateFieldValue(fieldClass,fieldValue){
	try{
		$("."+fieldClass).text(function(i){
			  return fieldValue;
		});
	}catch(err){}
}

function updateAddress(){
	var consumerType = $("#<portlet:namespace/>consumerType").val();
	
	if(consumerType == "Firm"){
		 updateFieldValue("dec_firm_address",address);
		 updateFieldValue("dec_individual_address","____");
	}else {
		 	updateFieldValue("dec_individual_address",address);
			updateFieldValue("dec_firm_address","____");
	}
	
	updateFieldValue("dec_applicant_address",address);
	updateFieldValue("dec_connection_address",address);
}



var myDiv = $("#declarationDiv");
var scrollHeight = $("#declarationDiv").prop('scrollHeight');
myDiv.scroll(function() {
	 if(($(this).scrollTop() + $(this).innerHeight()+5) >= scrollHeight) {
        $('#<portlet:namespace/>selfDeclaration').attr("disabled", false);
    } 
});


</script>
