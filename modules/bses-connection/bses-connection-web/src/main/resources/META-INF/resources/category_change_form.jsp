<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
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
private static final Log LOGGER = LogFactoryUtil.getLog("category_change_form.jsp");
private static final DateFormat dateFieldFormat=new SimpleDateFormat("yyyy-MM-dd");
%>
<%
ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
String requestType=requestEntity.getRequestType();
String kvaToKw = PropsUtil.get("connection.request.kva.to.kw");
if(StringUtils.isBlank(kvaToKw)){
	kvaToKw="0.93";
}

String requestMode=requestEntity.getRequestMode();
boolean appointmentMode=StringUtils.equals(requestMode, BsesConnectionPortletKeys.REQUEST_MODE_APPOINTMENT);

boolean isIndustrial=StringUtils.equalsIgnoreCase(requestEntity.getTariffCategory(), "0320");

requestEntity.setConnectionType("1"); //default permanent

%>
<portlet:actionURL name="saveForm" var="saveFormActionURL">
	<portlet:param name="formAction" value="saveConnection" />
</portlet:actionURL>

<aui:form role="form" cssClass="custom-form form-auto-save" name ="connectionForm" id="connectionForm" section-attr="connection">
	<div class="container-fluid bg-white shadow p-5 my-3">
		<div class="row">
			<div class="col-md-12">
				<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="connection-section-category-change-title" /></h6>			
			</div>
		</div>

		<div class="row" style="display:none">
			<div class="form-group col-md-3" >
				<div class="form-check form-check-inline">
					<aui:input class="form-check-input" type="radio" name="connectionType" value="1" checked="<%=!StringUtils.equals(requestEntity.getConnectionType(),"2")%>" label="connection-type.permanent" />
				</div>
				<div class="form-check form-check-inline">
					<aui:input class="form-check-input" type="radio" name="connectionType" value="2" checked="<%=StringUtils.equals(requestEntity.getConnectionType(),"2")%>" label="connection-type.temporary" />
				</div>
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
		</div>
		
		
		<div class="row">
			<div class="form-group col-md-3">
				<aui:select class="form-control" name="tariffCategory" label="connection-applied-tariff-category">
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
			
			<div class="form-group col-md-3" id="evUsageDiv">
				<aui:select class="form-control" name="evUsage" label="connection-ev-usage">
					<aui:option value="" label="-Select-" />
<%
		for(Map.Entry<String, String> entry:MasterData.getEvUsages().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equals(requestEntity.getEvUsage(), entry.getKey())%>"/>
<%
		}
%>
					<aui:validator name="required">
						function() {
		                	return AUI.$('#<portlet:namespace />tariffCategory').val()=="0700";
		                }
					</aui:validator>
				</aui:select>
			</div>
		</div>
		
		<div class="row">
			<div class="form-group col-md-3" id="loadkvadiv" style="display:none">
				<label class="control-label" for="<portlet:namespace/>loadKva">
					<liferay-ui:message key="connection-load-kva" arguments="<%=kvaToKw%>"/>
					<span class="hide-accessible">Required</span>
				</label> 
				<aui:input type="number" class="form-control" name="loadKva" label="" value="<%=Math.round(requestEntity.getLoadKva())>=1?Math.round(requestEntity.getLoadKva()):0%>">
				</aui:input>
			</div>

			<div class="form-group col-md-3" style="display:none">
				<aui:input type="number" class="form-control" name="loadKw" label="connection-load-kw" value="<%=Math.round(requestEntity.getLoadKw()) %>">
				</aui:input>
			</div>
			
			<div class="form-group col-md-3" id="supplytypediv" style="display:none">
				<aui:select class="form-control" name="supplyType" label="connection-supply-type">
					<aui:option value="" label="-Select-" />
					<aui:option value="<%=MasterData.SUPPLY_TYPE_HT%>" label="<%=MasterData.SUPPLY_TYPE_HT%>" selected="<%=StringUtils.equals(requestEntity.getSupplyType(), MasterData.SUPPLY_TYPE_HT) %>"/>
					<aui:option value="<%=MasterData.SUPPLY_TYPE_LT%>" label="<%=MasterData.SUPPLY_TYPE_LT%>" selected="<%=StringUtils.equals(requestEntity.getSupplyType(),MasterData.SUPPLY_TYPE_LT) %>"/>
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
					<aui:validator name="required"/>
				</aui:select>
			</div>
			<div class="form-group col-md-3" id="otherBuildingTypeDiv" style="<%=(StringUtils.equalsIgnoreCase(requestEntity.getBuildingType(), "Other"))?"display:block":"display:none" %>">
				<aui:input type="text" class="form-control" name="otherBuildingType" label="Please Specify" value="<%=requestEntity.getOtherBuildingType()%>">
					<aui:validator name="required">
						function() {
		                	return AUI.$('#<portlet:namespace />buildingType').val()=="Other";
		                }
					</aui:validator>
				</aui:input>
				
			</div>
			
		</div>
		
		
		<div class="row" id="industrialDetailDiv" style="<%=isIndustrial?"display:block":"display:none"%>">
					<div class="form-group col-md-3">
						<aui:input type="number" class="form-control" name="licenseCertificateNo" label="connection-license-certificate-no" value="<%=requestEntity.getLicenseCertificateNo()%>"/>
					</div>
		
					<div class="form-group col-md-3">
						<aui:input type="date" class="form-control" name="licenseIssueDate" label="connection-license-issue-date" value="<%=(requestEntity.getLicenseIssueDate()!=null?dateFieldFormat.format(requestEntity.getLicenseIssueDate()):"")%>"/>
					</div>
					
					<div class="form-group col-md-3">
						<aui:input type="date" class="form-control" name="licenseValidityFrom" label="connection-license-validity-from" value="<%=(requestEntity.getLicenseValidityFrom()!=null?dateFieldFormat.format(requestEntity.getLicenseValidityFrom()):"")%>"/>
					</div>
					<div class="form-group col-md-3">
						<aui:input type="date" class="form-control" name="licenseValidityTo" label="connection-license-validity-to" value="<%=(requestEntity.getLicenseValidityTo()!=null?dateFieldFormat.format(requestEntity.getLicenseValidityTo()):"")%>">
							<aui:validator errorMessage="End date must be greater than today and start date."  name="custom">
			                function(val, fieldNode, ruleValue) {
			                	var d1=yyyyMMddStrToDate(val);
			                	var strd2=$("#<portlet:namespace/>licenseValidityFrom").val();
			                	var result=0;
			                	if(strd2==''){
				                	var d2=onlyDate(new Date());
			                        result=dateDiff(d1, d2);
			                    }else{
			                		var d2=yyyyMMddStrToDate(strd2);
		                        	result=dateDiff(d1, d2);
		                        }
								if(result>0){
									return true;
								}else{
									return false;
								}
			                }
			        	</aui:validator>
						</aui:input>
					</div>
					
		</div>
		
	</div>
</aui:form>
<aui:script use="aui-base aui-modal aui-overlay-manager"> 
var kvaToKw=<%=kvaToKw%>;
var permTariffTypes=[];
var tempTariffTypes=[];
var selectedTariffType="<%=requestEntity.getTariffCategory()%>";
$(document).ready(function(){
	initTariffTypes();
	$("input[name=<portlet:namespace/>connectionType]").change(function(){
		pupulateTariffTypes();
	});
	pupulateTariffTypes(selectedTariffType);
	
});

Liferay.provide(window,'initTariffTypes', function () {
<%
	int i=0;
	for(Map.Entry<String, String> ttype:MasterData.getTariffCategories().entrySet()){
%>		
		permTariffTypes[<%=i++%>]={value:'<%=ttype.getKey()%>', text:'<%=ttype.getValue()%>'};
<%		
	}
%>		
	tempTariffTypes[0]={value:'0100', text:'<%=MasterData.getTariffCategoryValue("0100")%>'};
	tempTariffTypes[1]={value:'0290', text:'<%=MasterData.getTariffCategoryValue("0290")%>'};
});

Liferay.provide(window,'pupulateTariffTypes', function (selectedTariffType) {
	var tariffTypes=[];
	var connectionType=$("input[name=<portlet:namespace/>connectionType]:checked").val();
	
	if(connectionType=='1'){
		tariffTypes=permTariffTypes;
	}else if(connectionType=='2'){
		tariffTypes=tempTariffTypes;
	}
	
	var tariffCategory=$("#<portlet:namespace/>tariffCategory");
	$(tariffCategory).empty();
	$(tariffCategory).append($('<option>', {value : ''}).text('-Select-'));
	
	$.each(tariffTypes, function(i, e){
		var option=$('<option>', {value : e['value']}).text(e['text']);
		if(e['value']==selectedTariffType){
			$(option).prop('selected', true);
		}
		$(tariffCategory).append(option);
	});
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
		if(tariffCategory == "0320" || (tariffCategory == "0290" && dpccClearanceRequired==1) || (tariffCategory != "0290" && buildingTypes == "Hotel/Guest House")){
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

Liferay.provide(window,'tariffCategoryOnChange', function () {
	
	$("#<portlet:namespace/>tariffCategory").change(function() {
		handleTariffCategoryChange();
		resetBuildingHeightChk();
	});
});

Liferay.provide(window,'handleTariffCategoryChange', function () {
	var tariffCategory = $("#<portlet:namespace/>tariffCategory").val();
	
		
	//handleKwChange();
	
	if (tariffCategory == "0250") {
		showBDOCert(true);
	} else {
		showBDOCert(false);
	}
	
	if(tariffCategory == "0700"){
		showEvUsage(true);
	} else {
		showEvUsage(false);
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
	if(tariffCategory == "0320" || (tariffCategory == "0290" && dpccClearanceRequired==1)  || (tariffCategory != "0290" && buildingTypes == "Hotel/Guest House")){
		showDpccCertificate(true);
	} else {
		showDpccCertificate(false);
	}
	
	var declarationTariff = $("#declarationTariff");
	if(declarationTariff){
		declarationTariff.text( $("#<portlet:namespace/>tariffCategory").find(":selected").text());
		
	}
	
	if(tariffCategory == "0320"){
		showIndustrialDetail(true);
	} else {
		showIndustrialDetail(false);
	}
	
});

Liferay.provide(window,'connectionTypeOnChange', function () {	
	
	$("input[name=<portlet:namespace/>connectionType]").change(function() {
		var connectionType = "";
		var connectionType = $(this).val();
		if (connectionType == "2") {
			$(".temp-connection-field").show();
		} else {
			$(".temp-connection-field").hide();
			$("#<portlet:namespace/>tempStartDate").val("");
			$("#<portlet:namespace/>tempEndDate").val("");
		}
	});
});


Liferay.provide(window,'kvaOnChange', function () {
	$("#<portlet:namespace/>loadKva").change(function() {
		handleKvaChange();
	});
});

Liferay.provide(window,'handleKvaChange', function () {
	var kva = $("#<portlet:namespace/>loadKva").val();
	var kw=0;
	if (kva != "" && kva != "0") {
		kw = Math.ceil(kva * kvaToKw);
		console.log("kw : "+kw);
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
});

Liferay.provide(window,'showLoadKvaDiv', function (showHide) {
	
	$("#loadkvadiv").hide();
});

Liferay.provide(window,'upicAvailableOnChange', function () {
	$("input[name=<portlet:namespace/>upic]").change(function() {
		$("#<portlet:namespace/>upicNo").val("");
		showHideUpicNoDiv();
	});
});

Liferay.provide(window,'showHideUpicNoDiv', function () {
	
	var upic = $("input[name=<portlet:namespace/>upic]:checked").val();
	
	if (upic == "1") {
		showUpicNoDiv(true);
	} else {
		showUpicNoDiv(false);
	}
});

Liferay.provide(window,'showUpicNoDiv', function (showHide) {
	if (showHide) {
		$("#upicnodiv").show();
	} else {
		$("#upicnodiv").hide();
	}
});
Liferay.provide(window,'showSupplyType', function (showHide) {
	if (showHide) {
		$("#supplytypediv").show();
	} else {
	
		$("#<portlet:namespace/>supplytype").val("");
	
		$("#supplytypediv").hide();
	}
});

Liferay.provide(window,'showEvUsage', function (showHide) {
	if (showHide) {
		$("#evUsageDiv").show();
	} else {
		$("#<portlet:namespace/>evUsage").val("");
		$("#evUsageDiv").hide();
	}
});

Liferay.provide(window,'showIndustrialDetail', function (showHide) {
	if (showHide) {
		$("#industrialDetailDiv").show();
	} else {
		$("#<portlet:namespace/>licenseCertificateNo").val("");
		$("#<portlet:namespace/>licenseIssueDate").val("");
		$("#<portlet:namespace/>licenseValidityFrom").val("");
		$("#<portlet:namespace/>licenseValidityTo").val("");
		$("#industrialDetailDiv").hide();
	}
});



Liferay.provide(window,'handleConsumerTypeChange', function () {	
	$('#<portlet:namespace/>consumerType').change(function() {
		$(".firm-documents").css("display", ($(this).val()=="Individual"?"none":"block"));
	});
});


</aui:script>