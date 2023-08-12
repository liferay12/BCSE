<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="java.util.Map"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<%!
private static final Log LOGGER = LogFactoryUtil.getLog("load_change_form.jsp");
private static final DateFormat dateFieldFormat=new SimpleDateFormat("yyyy-MM-dd");
%>
<%
ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
String requestType=requestEntity.getRequestType();
String loadKW=Float.toString(requestEntity.getLoadKw());
String kvaToKw = PropsUtil.get("connection.request.kva.to.kw");
if(StringUtils.isBlank(kvaToKw)){
	kvaToKw="0.93";
}

%>
<portlet:actionURL name="saveForm" var="saveFormActionURL">
	<portlet:param name="formAction" value="saveConnection" />
</portlet:actionURL>

<aui:form role="form" cssClass="custom-form form-auto-save" name ="loadChangeForm" id="loadChangeForm" section-attr="loadChange">
	<div class="container-fluid bg-white shadow p-5 my-3">
		<div class="row">
			<div class="col-md-12">
				<h6 class="font-weight-bold my-3 text-uppercase bg-light p-3"><liferay-ui:message key="load-change.title" /></h6>				
			</div>
		</div>

<!-- Load Enhancement & Reduction -->
		<div class="row">
			<div class="form-group col-md-6">
				<div class="form-check form-check-inline">
					<aui:input class="form-check-input" type="radio" name="changeRequestType" value="<%=RequestTypeModeStatus.TYPE_LOAD_INCREASE %>" checked="<%=StringUtils.equals(requestEntity.getChangeRequestType(),RequestTypeModeStatus.TYPE_LOAD_INCREASE)%>" label="load-change.enhancement" />
				</div>
				<div class="form-check form-check-inline">
					<aui:input class="form-check-input" type="radio" name="changeRequestType" value="<%=RequestTypeModeStatus.TYPE_LOAD_DECREASE %>" checked="<%=!StringUtils.equals(requestEntity.getChangeRequestType(),RequestTypeModeStatus.TYPE_LOAD_INCREASE)%>" label="load-change.reduction" />
				</div>
			</div>
		</div>

<!-- Tariff Category -->
		<div class="row">
			<div class="form-group col-md-6" hidden="true">
				<aui:select class="form-control" name="tariffCategory" label="connection-tariff-category" hidden="true">
					<aui:option value="" label="-Select-" />
<%
		for(Map.Entry<String, String> entry:MasterData.getTariffCategories().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equals(requestEntity.getTariffCategory(), entry.getKey())%>"/>
<%
		}
%>
					<aui:validator name="required"/>
				</aui:select>
			</div>
		</div>

		<div class="row">
		
			<div class="form-group col-md-3">
				<aui:select class="form-control" name="consumerType" label="consumer-type" >
					<aui:option value="" label="-Select-" />
					<aui:option value="<%=MasterData.ConsumerTypes.Individual.name() %>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getConsumerType(), MasterData.ConsumerTypes.Individual.name())%>" label="Individual" />
					<aui:option value="<%=MasterData.ConsumerTypes.Firm.name() %>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getConsumerType(), MasterData.ConsumerTypes.Firm.name())%>" label="Firm/Trust/Company/Others" />
					<aui:validator name="required" />
				</aui:select>
			</div>
		
			<div class="form-group col-md-3" id="loadkvadiv">
				<label class="control-label" for="<portlet:namespace/>loadKva">
					<liferay-ui:message key="connection-load-kva" arguments="<%=kvaToKw%>"/>
					<span class="hide-accessible">Required</span>
				</label> 
				<aui:input type="number" class="form-control" name="loadKva" label="" value="<%=Math.round(requestEntity.getLoadKva())>=1?Math.round(requestEntity.getLoadKva()):0%>">
					<aui:validator name="required">
						function() {
		                	return AUI.$('#<portlet:namespace />tariffCategory').val()!="0100";
		                }
					</aui:validator>
					<aui:validator name="min">1</aui:validator>
				</aui:input>
				
			</div>

			<div class="form-group col-md-3">
				<aui:input type="number" class="form-control" name="loadKw" label="connection-load-kw" value="<%=Math.round(requestEntity.getLoadKw()) %>">
					<aui:validator name="required">
						function() {
		                	return AUI.$('#<portlet:namespace />tariffCategory').val()=="0100";
		                }
					</aui:validator>
					<aui:validator name="min">1</aui:validator>
					<aui:validator name="custom" errorMessage="Applied load cannot be greater than or equal to existing load">
						function(){
							var loadKw=0;
							try{
								loadKw=parseInt($("#<portlet:namespace/>existingLoad").val());
							}catch(err){}
							var currentLoadKw = $("#<portlet:namespace/>loadKw").val();
							var changeRequestType = $("input[name=<portlet:namespace/>changeRequestType]:checked").val();
							if(changeRequestType=="U04" && currentLoadKw >= loadKw){
									return false;
							}
							return true;
						}
					</aui:validator>
					<aui:validator name="custom" errorMessage="Applied load cannot be less than or equal to existing load">
						function(){
							var loadKw=0;
							try{
								loadKw=parseInt($("#<portlet:namespace/>existingLoad").val());
							}catch(err){}
							var currentLoadKw = $("#<portlet:namespace/>loadKw").val();
							var changeRequestType = $("input[name=<portlet:namespace/>changeRequestType]:checked").val();
							if(changeRequestType=="U03" && currentLoadKw <= loadKw){
									return false;
							}
							return true;
						}
					</aui:validator>
				</aui:input>
				
			</div>
			<%
				String supplyTpyeDisplay ="none";
				if(requestEntity.getLoadKw()>100 && requestEntity.getLoadKw()<=200 && StringUtils.equals(requestEntity.getChangeRequestType(), RequestTypeModeStatus.TYPE_LOAD_INCREASE)){
					supplyTpyeDisplay ="block";
				}
			
			%>
			
			<div class="form-group col-md-3" id="supplytypediv" style="display:<%=supplyTpyeDisplay%>;">
				<aui:select class="form-control" name="supplyType" label="connection-supply-type">
					<aui:option value="" label="-Select-" />
					<aui:option value="<%=MasterData.SUPPLY_TYPE_HT%>" label="<%=MasterData.SUPPLY_TYPE_HT%>" selected="<%=StringUtils.equals(requestEntity.getSupplyType(), MasterData.SUPPLY_TYPE_HT) %>"/>
					<aui:option value="<%=MasterData.SUPPLY_TYPE_LT%>" label="<%=MasterData.SUPPLY_TYPE_LT%>" selected="<%=StringUtils.equals(requestEntity.getSupplyType(),MasterData.SUPPLY_TYPE_LT) %>"/>
					<aui:validator name="required">
						function() {
							var isEnhancement = false;
							var changeRequestType = $("input[name=<portlet:namespace/>changeRequestType]:checked").val();
							if(changeRequestType=="<%=RequestTypeModeStatus.TYPE_LOAD_INCREASE %>"){
									isEnhancement =true;
							}
		                	return (AUI.$('#<portlet:namespace />loadKw').val()>100 && AUI.$('#<portlet:namespace />loadKw').val()<=200 && isEnhancement);
		                }
					</aui:validator>
				</aui:select>
			</div>	
		</div>
		
		
		<div class="row" id="loadEnhancementDiv" style="dispaly:<%=StringUtils.equals(requestEntity.getChangeRequestType(), RequestTypeModeStatus.TYPE_LOAD_INCREASE)?"block":"none"%>"> 
			<div class="form-group col-md-3">
				<aui:select class="form-control" name="areaType" label="connection-area-type">
					<aui:option value="" label="-Select-" />
					<aui:option value="JJCLUSTER" label="JJ Clusters" selected="<%=StringUtils.equals(requestEntity.getAreaType(),"JJCLUSTER")%>" />
					<aui:option value="OTHR" label="Others" selected="<%=StringUtils.equals(requestEntity.getAreaType(),"OTHR")%>" />
					<aui:validator name="required">
						function(){
							if($("input[name=<portlet:namespace/>changeRequestType]:checked").val()=="U03"){
								return true;
							}
							return false;
						}
					</aui:validator>
				</aui:select>
			</div>

			<div class="form-group col-md-3">
				<aui:select class="form-control" name="premisesType" label="connection-premises-type">
					<aui:option value="" label="-Select-" />
<%
		for(Map.Entry<String, String> entry:MasterData.getPremisesTypes().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equals(requestEntity.getPremisesType(), entry.getKey())%>"/>
<%
		}
%>
				<aui:validator name="required">
					function(){
						if($("input[name=<portlet:namespace/>changeRequestType]:checked").val()=="U03"){
							return true;
						}
						return false;
					}
					</aui:validator>
				
				</aui:select>
			</div>
			
			<div class="form-group col-md-3">
				<aui:select class="form-control" name="buildingType" label="Type of Use/Building">
					<aui:option value="" label="-Select-" />
					<%
		for(Map.Entry<String, String> entry:MasterData.getBuildingTypes().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equals(requestEntity.getBuildingType(), entry.getKey())%>"/>
<%
		}
%>
					<aui:validator name="required">
						function(){
							if($("input[name=<portlet:namespace/>changeRequestType]:checked").val()=="U03"){
								return true;
							}
							return false;
						}
					</aui:validator>
				</aui:select>
			</div>
			<div class="form-group col-md-3" id="otherBuildingTypeDiv" style="<%=(StringUtils.equalsIgnoreCase(requestEntity.getBuildingType(), "Other"))?"display:block":"display:none" %>">
				<aui:input type="text" class="form-control" name="otherBuildingType" label="Please Specify" value="<%=requestEntity.getOtherBuildingType()%>">
				<aui:validator name="required">
						function() {
		                	if($('#<portlet:namespace />buildingType').val()=="Other" && $("input[name=<portlet:namespace/>changeRequestType]:checked").val()=="U03"){
								return true;
							}
							return false;
		                }
					</aui:validator>
				</aui:input>
			</div>
		</div>

	</div>
</aui:form>
<aui:script use="aui-base aui-modal aui-overlay-manager"> 
var kvaToKw=<%=kvaToKw%>;

var selectedTariffType="<%=requestEntity.getTariffCategory()%>";

$(document).ready(function(){
	var changeRequestType=$("input[name=<portlet:namespace/>changeRequestType]:checked").val();
	showHideLoadEnhancementDiv(changeRequestType);
	showHideChecklistDiv(changeRequestType);
	showHideLoadKvaDiv(selectedTariffType);
	showHideOwnershipProofDiv();
	setCheckList();
});


Liferay.provide(window,'buildingTypeOnChange', function () {
	$("#<portlet:namespace/>buildingType").change(function() {
		var buildingTypes = $("#<portlet:namespace/>buildingType").val();
		var tariffCategory = $("#<portlet:namespace/>tariffCategory").val();
		var dpccClearanceRequired = $("input[name=<portlet:namespace/>dpccClearanceRequired]:checked").val();
		//if(tariffCategory == "0320" || tariffCategory == "0290"  || buildingTypes == "Hotel/Guest House"){
		if(tariffCategory == "0320"){
			showIndustrialLicense(true);
		} else {
			showIndustrialLicense(false);
		}
		if(tariffCategory == "0320" || (tariffCategory == "0290" && dpccClearanceRequired==1) || buildingTypes == "Hotel/Guest House"){
			showDpccCertificate(true);
		} else {
			showDpccCertificate(false);
		}
		
		resetBuildingHeightChk();
		
		if(buildingTypes == "Other"){
			$("#otherBuildingTypeDiv").show();
		}else{
			$("#otherBuildingTypeDiv").hide();
		}
	});
	
});

Liferay.provide(window,'setCheckList', function () {
		handleTariffCategoryChange();
		resetBuildingHeightChk();
		$("#<portlet:namespace/>loadKw").val("0");
		$("#<portlet:namespace/>loadKva").val("0");
});

Liferay.provide(window,'handleTariffCategoryChange', function () {
	var tariffCategory = $("#<portlet:namespace/>tariffCategory").val();
	
	if (tariffCategory == "0100") {
		showLoadKvaDiv(false);
		//showStiltParking(true);
		$("#<portlet:namespace/>loadKw").prop("readonly", false);
	} else {
		showLoadKvaDiv(true);
		//showStiltParking(false);
		$("#<portlet:namespace/>loadKva").prop("readonly", false);
		$("#<portlet:namespace/>loadKw").prop("readonly", true);
	}
	
	//handleKwChange();
	
	if (tariffCategory == "0250") {
		showBDOCert(true);
	} else {
		showBDOCert(false);
	}
	
	var buildingTypes = $("#<portlet:namespace/>buildingType").val();

	//if(tariffCategory == "0320" || tariffCategory == "0290" || buildingTypes == "Hotel/Guest House"){
	if(tariffCategory == "0320"){
		showIndustrialLicense(true);
	} else {
		showIndustrialLicense(false);
	}
	
	try{
		showHideDpccClearanceRequired();
	}catch(err){}
	
	try{
		showHideNonConfirmingArea();
	}catch(err){}
		
	var dpccClearanceRequired = $("input[name=<portlet:namespace/>dpccClearanceRequired]:checked").val();	
	if(tariffCategory == "0320" || (tariffCategory == "0290" && dpccClearanceRequired==1)  || buildingTypes == "Hotel/Guest House"){
		showDpccCertificate(true);
	} else {
		showDpccCertificate(false);
	}
	
	var declarationTariff = $("#declarationTariff");
	if(declarationTariff){
		declarationTariff.text( $("#<portlet:namespace/>tariffCategory").find(":selected").text());
		
	}

});


Liferay.provide(window,'kvaOnChange', function () {
	$("#<portlet:namespace/>loadKva").change(function() {
		handleKvaChange();
		$("#<portlet:namespace/>loadKw").change();
	});
});

Liferay.provide(window,'handleKvaChange', function () {
	var kva = $("#<portlet:namespace/>loadKva").val();
	var kw=0;
	if (kva != "" && kva != "0") {
		kw = Math.ceil(kva * kvaToKw);
		$("#<portlet:namespace/>loadKw").val(kw);
	}
	
	showElcb((kw>=2));
	//showElcbUploadError(kw>=2);
	
	showSupplyType(kw>100 && kw<=200);
});

Liferay.provide(window,'kwOnChange', function () {
	$("#<portlet:namespace/>loadKw").change(function() {
		handleKwChange();
	});
});

Liferay.provide(window,'handleKwChange', function () {
	var kw = $("#<portlet:namespace/>loadKw").val();
	if (kw != "" && kw != "0") {
		var kva = Math.round(kw / kvaToKw);
		console.log("kva : "+kva);
		$("#<portlet:namespace/>loadKva").val(kva);
	}
	showElcb(kw>=2);
	//showElcbUploadError(kw>=2);
	showSupplyType(kw>100 && kw<=200);
})

Liferay.provide(window,'showLoadKvaDiv', function (showHide) {

	if (showHide) {
		$("#loadkvadiv").show();
	} else {
		$("#loadkvadiv").hide();
	}
});

Liferay.provide(window,'showSupplyType', function (showHide) {
	var changeRequestType = $("input[name=<portlet:namespace/>changeRequestType]:checked").val();
	var isEnhancement = false;
	if(changeRequestType=="<%=RequestTypeModeStatus.TYPE_LOAD_INCREASE %>"){
			isEnhancement =true;
	}
	if (showHide && isEnhancement) {
		$("#supplytypediv").show();
	} else {
	
		$("#<portlet:namespace/>supplytype").val("");
	
		$("#supplytypediv").hide();
	}
});

$("input[name=<portlet:namespace/>changeRequestType]").change(function(){
	var changeRequestType=$("input[name=<portlet:namespace/>changeRequestType]:checked").val();
	$("#<portlet:namespace/>loadKva").val(0);
	$("#<portlet:namespace/>loadKw").val(0);
	handleKwChange();
	
	showHideLoadEnhancementDiv(changeRequestType);
	showHideChecklistDiv(changeRequestType);
	showHideOwnershipProofDiv();
	
});

Liferay.provide(window,'showHideLoadEnhancementDiv', function (changeRequestType) {
	if (changeRequestType=="U03") {
		$("#loadEnhancementDiv").show();
	} else {
		$("#<portlet:namespace/>areaType").val("");
		$("#<portlet:namespace/>buildingType").val("");
		$("#<portlet:namespace/>premisesType").val("");
		$("#loadEnhancementDiv").hide();
	}
});

Liferay.provide(window,'showHideLoadKvaDiv', function (selectedTariffType) {
	if (selectedTariffType == "0100") {
		$("#loadkvadiv").hide();
		$("#<portlet:namespace/>loadKw").prop("readonly", false);
	} else {
		$("#loadkvadiv").show();
		$("#<portlet:namespace/>loadKva").prop("readonly", false);
		$("#<portlet:namespace/>loadKw").prop("readonly", true);
	}
});


Liferay.provide(window,'showHideOwnershipProofDiv', function () {
	var changeRequestType=$("input[name=<portlet:namespace/>changeRequestType]:checked").val();
	if (changeRequestType == "U03") {
		showHideElement("#ownershipProofDiv",true);
	} else {
		showHideElement("#ownershipProofDiv",true);
	}
});

Liferay.provide(window,'isOwnershipProofRequired', function () {
	var changeRequestType=$("input[name=<portlet:namespace/>changeRequestType]:checked").val();
	if (changeRequestType=="U03") {
		return true;
	}
	return true;
});

Liferay.provide(window,'handleConsumerTypeChange', function () {	
	$('#<portlet:namespace/>consumerType').change(function() {
		$(".firm-documents").css("display", ($(this).val()=="Individual"?"none":"block"));
	});
});
</aui:script>
<script>

</script>
