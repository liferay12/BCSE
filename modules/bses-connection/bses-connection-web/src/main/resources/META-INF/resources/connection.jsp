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
private static final Log LOGGER = LogFactoryUtil.getLog("connection.jsp");
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
LOGGER.info("requestEntity.getLoadKw(): "+requestEntity.getLoadKw()+"requestEntity.getUpicAvailable(): "+requestEntity.getUpicAvailable());
%>
<portlet:actionURL name="saveForm" var="saveFormActionURL">
	<portlet:param name="formAction" value="saveConnection" />
</portlet:actionURL>

<aui:form role="form" cssClass="custom-form form-auto-save" name ="connectionForm" id="connectionForm" section-attr="connection">
	<div class="container-fluid bg-white shadow p-5 my-3">
		<div class="row">
			<div class="col-md-12">
<%
	if(StringUtils.equals(requestType, RequestTypeModeStatus.TYPE_NEW_CONNECTION)){
%>				
				<h6 class="font-weight-bold my-3 text-uppercase bg-light p-3"><liferay-ui:message key="connection-section-title" /></h6>	
<%
	}else if(StringUtils.equals(requestType, RequestTypeModeStatus.TYPE_CATEGORY_CHANGE) || 
			StringUtils.equals(requestType, RequestTypeModeStatus.TYPE_CATEGORY_CHANGE_HTL) ||
			StringUtils.equals(requestType, RequestTypeModeStatus.TYPE_CATEGORY_CHANGE_LTH)){
%>				
				<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="connection-section-category-change-title" /></h6>
<%
	}else if(StringUtils.equals(requestType, RequestTypeModeStatus.TYPE_LOAD_CHANGE) || 
			StringUtils.equals(requestType, RequestTypeModeStatus.TYPE_LOAD_INCREASE) ||
			StringUtils.equals(requestType, RequestTypeModeStatus.TYPE_LOAD_DECREASE)){
%>				
				<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="connection-section-load-change-title" /></h6>
<%
	}
%>				
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-6">
				<div class="form-check form-check-inline">
					<aui:input class="form-check-input" type="radio" name="connectionType" value="1" checked="<%=!StringUtils.equals(requestEntity.getConnectionType(),"2")%>" label="connection-type.permanent" />
				</div>
				<div class="form-check form-check-inline">
					<aui:input class="form-check-input" type="radio" name="connectionType" value="2" checked="<%=StringUtils.equals(requestEntity.getConnectionType(),"2")%>" label="connection-type.temporary" />
				</div>
			</div>
			
			<!-- Fromdate-Todate -->
			<div class="form-group col-md-6">
				<div class="form-group col-md-6 temp-connection-field" style="display:<%=(StringUtils.equals(requestEntity.getConnectionType(),"2")?"block":"none")%>;">
					<aui:input type="date" class="form-control" name="tempStartDate" label="connection-from-date" value="<%=(requestEntity.getTempStartDate()!=null?dateFieldFormat.format(requestEntity.getTempStartDate()):"")%>">
						<aui:validator  name="required">
			                function(val, fieldNode, ruleValue) {
			                	var conType=$("input[name=<portlet:namespace/>connectionType]:checked").val();
			                	if(conType=="2"){
			                		return true;
			                	}
			                	return false
			                }
			             </aui:validator>
						<aui:validator errorMessage="Start date must be after today's date."  name="custom">
			                function(val, fieldNode, ruleValue) {
			                	var conType=$("input[name=<portlet:namespace/>connectionType]:checked").val();
			                	if(conType!="2"){
			                		return true;
			                	}
			                	var d1=yyyyMMddStrToDate(val);
			                	var d2=onlyDate(new Date());
		                        var result=dateDiff(d1, d2);
								if(result>0){
									return true;
								}else{
									return false;
								}
			                }
			        	</aui:validator>
					</aui:input>
				</div>
				<div class="form-group col-md-6 temp-connection-field" style="display:<%=(StringUtils.equals(requestEntity.getConnectionType(),"2")?"block":"none")%>;">
					<aui:input type="date" class="form-control" name="tempEndDate" label="connection-to-date" value="<%=(requestEntity.getTempEndDate()!=null?dateFieldFormat.format(requestEntity.getTempEndDate()):"")%>">
						<aui:validator  name="required">
			                function(val, fieldNode, ruleValue) {
			                	var conType=$("input[name=<portlet:namespace/>connectionType]:checked").val();
			                	if(conType=="2"){
			                		return true;
			                	}
			                	return false
			                }
			             </aui:validator>
						
						<aui:validator errorMessage="End date must be greater than today and start date."  name="custom">
			                function(val, fieldNode, ruleValue) {
			                	var conType=$("input[name=<portlet:namespace/>connectionType]:checked").val();
			                	if(conType!="2"){
			                		return true;
			                	}
			                	var d1=yyyyMMddStrToDate(val);
			                	var strd2=$("#<portlet:namespace/>tempStartDate").val();
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
			        	
			        	<!-- One Year Validator -->
			        	<aui:validator  name="custom" errorMessage="Your End Date Should be less than one year from start date">
			                function(val, fieldNode, ruleValue) {
			                	var conType=$("input[name=<portlet:namespace/>connectionType]:checked").val();
			                	if(conType!="2"){
			                		return true;
			                	}
			                	var startDate=document.getElementById('<portlet:namespace/>tempStartDate').value;
			                	if(startDate == ""){
			                		return true;
			                	}
			                	var endDate=document.getElementById('<portlet:namespace/>tempEndDate').value;
			                	
			                	var sDate=new Date(startDate);
			                	var eDate=new Date(endDate);
			                	
			                	var nextYear = sDate.setFullYear(sDate.getFullYear()+1);
			                	if(eDate < nextYear){
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
		
		
		
		<div class="row">
			<div class="form-group col-md-6">
				<aui:select class="form-control" name="tariffCategory" label="connection-tariff-category">
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
			
			<div class="form-group col-md-4" id="evUsageDiv">
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
				<p class="help-text fs-13 mt-1 p-1 text-danger d-none" style="background: #ffff00;">Note: ELCB Bill copy is required for more then or equal to
					2 KW.</p>
			</div>

			<div class="form-group col-md-3">
				<aui:input type="number" class="form-control" name="loadKw" label="connection-load-kw" value="<%=Math.round(requestEntity.getLoadKw()) %>">
					<aui:validator name="required">
						function() {
		                	return AUI.$('#<portlet:namespace />tariffCategory').val()=="0100";
		                }
					</aui:validator>
					<aui:validator name="min">1</aui:validator>
					<%if(appointmentMode){ %>
						<aui:validator name="max" errorMessage="Request for Appointment is not applicable for connections with load greater than equal to 45 KW">44</aui:validator>
					<%} %>
				</aui:input>
				<p class="help-text fs-13 mt-1 p-1 text-danger d-none" style="background: #ffff00;">Note: ELCB Bill copy is required for more then or equal to
					2 KW.</p>
			</div>
			
			<div class="form-group col-md-3" id="supplytypediv" style="display:<%=((requestEntity.getLoadKw()>100 && requestEntity.getLoadKw()<=200)?"block":"none")%>;">
				<aui:select class="form-control" name="supplyType" label="connection-supply-type">
					<aui:option value="" label="-Select-" />
					<aui:option value="<%=MasterData.SUPPLY_TYPE_HT%>" label="<%=MasterData.SUPPLY_TYPE_HT%>" selected="<%=StringUtils.equals(requestEntity.getSupplyType(), MasterData.SUPPLY_TYPE_HT) %>"/>
					<aui:option value="<%=MasterData.SUPPLY_TYPE_LT%>" label="<%=MasterData.SUPPLY_TYPE_LT%>" selected="<%=StringUtils.equals(requestEntity.getSupplyType(),MasterData.SUPPLY_TYPE_LT) %>"/>
					<aui:validator name="required">
						function() {
		                	return (AUI.$('#<portlet:namespace />loadKw').val()>100 && AUI.$('#<portlet:namespace />loadKw').val()<=200);
		                }
					</aui:validator>
				</aui:select>
			</div>		
			
			<div class="form-group col-md-3" id="purposeofsupplydiv"  >
				<aui:input type="text" class="form-control" name="purposeOfSupply" label="connection-purpose-of-supply" value="<%=requestEntity.getPurposeOfSupply() %>"/>
		
			</div>	
		</div>
		
		
		<div class="row">
			<div class="form-group col-md-3">
				<aui:select class="form-control" name="areaType" label="connection-area-type">
					<aui:option value="" label="-Select-" />
					<aui:option value="JJCLUSTER" label="JJ Clusters" selected="<%=StringUtils.equals(requestEntity.getAreaType(),"JJCLUSTER")%>" />
					<aui:option value="OTHR" label="Others" selected="<%=StringUtils.equals(requestEntity.getAreaType(),"OTHR")%>" />
					<aui:validator name="required"/>
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
					<aui:validator name="required"/>
				</aui:select>
			</div>
<%--
		</div>
		<div class="row">
--%>		


			<!-- working on -->
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
		
		<div class="row" id="industrialDetailDiv" >
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
							
							<!-- One Year Validator -->
				        	<aui:validator  name="custom" errorMessage="Your End Date Should be less than one year from start date">
				                function(val, fieldNode, ruleValue) {
				                	var startDate=document.getElementById('<portlet:namespace/>licenseValidityFrom').value;
				                	if(startDate == ""){
				                		return true;
				                	}
				                	var endDate=document.getElementById('<portlet:namespace/>licenseValidityTo').value;
				                	
				                	var sDate=new Date(startDate);
				                	var eDate=new Date(endDate);
				                	
				                	var nextYear = sDate.setFullYear(sDate.getFullYear()+1);
				                	if(eDate < nextYear){
				                	return true;
				                	}else{
				                	return false;
				                	}
				                }
				             </aui:validator>
			             </aui:input>
					</div>
					
		</div>
		
		<div class="row">
			<div class="form-group col-md-8">
				<label class="control-label"><liferay-ui:message key="connection-upic-available" /></label>
				
				<div>
					<div class="form-check form-check-inline">
						<aui:input class="form-check-input" type="radio" name="upic"  value="1" label="Yes" checked="<%=requestEntity.getUpicAvailable()%>"/>
						
					</div>
					<div class="form-check form-check-inline">
						<aui:input class="form-check-input" type="radio" name="upic"  value="0" label="No" checked="<%=!requestEntity.getUpicAvailable()%>"/>
					</div>
				</div>
			</div>

			<div class="form-group col-md-3" id="upicnodiv" style="display:<%=requestEntity.getUpicAvailable()?"block":"none"%>;">
				<aui:input type="text" class="form-control" name="upicNo" label="connection-upic" value="<%=requestEntity.getUpic()%>" maxlength="15">
					<aui:validator name="required">
					function() {
		                	return AUI.$('input[name=<portlet:namespace />upic]:checked').val()=="1";
		                	}
		         </aui:validator>
				</aui:input>
			</div>
		</div>
<%
	if(!StringUtils.equals(requestEntity.getRequestType(), RequestTypeModeStatus.TYPE_NEW_CONNECTION)){
%>
		<liferay-util:include page="/reason_for_change.jsp" servletContext="<%=application%>" />
<%
	}
%>				
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
		$("#<portlet:namespace/>tariffCategory").change();
		handleKvaChange();
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
		$("#<portlet:namespace/>loadKw").val("0");
		$("#<portlet:namespace/>loadKva").val("0");
	});
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
})

Liferay.provide(window,'showLoadKvaDiv', function (showHide) {

	if (showHide) {
		$("#loadkvadiv").show();
	} else {
		$("#loadkvadiv").hide();
	}
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


</aui:script>
<script>
/**$(document).ready(function(){
	  $('#<portlet:namespace/>tempStartDate').datepicker({
	    format: "dd-MM-yyyy",
	    autoclose: true,
	    startDate: '0d'
	  });

	});
	*/
</script>