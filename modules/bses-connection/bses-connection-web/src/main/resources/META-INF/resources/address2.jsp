<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="java.util.Map"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.bses.connection2.service.LocalityDivisionLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.LocalityDivision"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<style>
	.yui3-aclist-list{
		height: 250px;
    	overflow-y: scroll;
	}
	.select-disable{
		pointer-events: none;
	}
</style>
<%
	ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
	String requestType=requestEntity.getRequestType();
	List<LocalityDivision> localityList=LocalityDivisionLocalServiceUtil.getLocalityDivisions(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	LocalityDivision localityDistrict=null;
	String localityId=null;
	String locality=null;
	if(StringUtils.isNotBlank(requestEntity.getLocality())){
		localityDistrict=LocalityDivisionLocalServiceUtil.getLocalityDivision(Long.parseLong(requestEntity.getLocality()));	
	}else if(StringUtils.isNotBlank(requestEntity.getDistrict())){
		localityDistrict = LocalityDivisionLocalServiceUtil.getLocalityDivisionByDivisionCode(requestEntity.getDistrict());
	}
	
	String district = "";
	String districtName ="";
	if(localityDistrict!=null){
		district = localityDistrict.getDivisionCode();
		districtName=localityDistrict.getDivisionName();
		localityId = String.valueOf(localityDistrict.getLocalityDivisionId());
		locality = localityDistrict.getLocalityName();
	}else{
		district = requestEntity.getDistrict();
		districtName = requestEntity.getDistrict();
	}
	
	System.out.println("district-"+district+"  :districtNmae"+districtName);
	
%>
<portlet:actionURL name="saveForm" var="saveFormActionURL">
	<portlet:param name="formAction" value="saveAddress" />
</portlet:actionURL>

<aui:form cssClass="custom-form form-auto-save" role="form" name="addressForm2" section-attr="address2">
	<div class="container-fluid my-3">
		<div class="row">
			<div class="col-md-12">
<%
	if(StringUtils.equals(requestType, RequestTypeModeStatus.TYPE_NEW_CONNECTION)){
%>				
				<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="supply-address-title" /></h6>	
<%
	}else{
%>				
				<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="address-section-address-change-title" /></h6>
<%
	}
%>			
			</div>
		</div>
		
		<div class="row">
			
			<div class="address-locality col-md-6">
				<aui:input class="form-control" id="localityName" name="localityName" label="address-locality" placeholder="Type your locality name here" maxlength="50"
					value="<%=locality %>">
					<aui:validator name="required" errorMessage="Please enter your Locality Name"></aui:validator>
				</aui:input>
				<aui:input type="hidden" name="locality" label="" value="<%=localityId%>" />
			</div>
			
			<div class="form-group col-md-6">
				<aui:input type="hidden" name="district" label="" value="<%=district%>" />
				<aui:input type="text" name="districtName" label="address-district" value="<%=districtName%>" readonly="true" maxlength="50"/>
			</div>
			
		<div class="col-md-12 p-5">
		
			<div class="row">
				<div class="col-md-12  bg-light" >
					<div class="row">
						<div class="col-md-12">
							<aui:input type="checkbox" style="cursor:default !important ; z-index:0 !important" value="1" name="sameAddressCheck" label="same-as-communication-address"  />	
						</div>
					</div>
				</div>
			</div>	
			<div class="row">
				<div class="row">
					<div class="form-group col-md-3">
						<%--<label>House No. <span class="text-danger">*</span></label>--%> 
						<aui:input type="text" name="houseNo2" label="address-house-no" value="<%=requestEntity.getHouseNo2()%>" maxlength="10">
							<aui:validator name="required"/>
						</aui:input>
					</div>
					
					<div class="form-group col-md-3">
					<%--<label>Floor <span class="text-danger">*</span></label>--%> 
					<aui:select class="form-control select2" name="floor2" label="address-floor" >
						<aui:option value="" label="-Select-" />
	<%
			for(Map.Entry<String, String> entry:MasterData.getFloors().entrySet()){
	%>	
				<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getFloor2(), entry.getKey())%>"/>
	<%
			}
	%>
					</aui:select>
					</div>
					
					<div class="form-group col-md-3">
						<%--<label>Building Name</label>--%> 
						<aui:input type="text" class="form-control" name="buildingName2" label="address-building-name" value="<%=requestEntity.getBuildingName2()%>" maxlength="50">
							<%--<aui:validator name="required"/> --%>
						</aui:input>
					</div>
	
					<div class="form-group col-md-3">
						<%--<label>Street <span class="text-danger">*</span></label>--%> 
						<aui:input type="text" class="form-control" name="street2" label="address-street" value="<%=requestEntity.getStreet2() %>" maxlength="50">
							<aui:validator name="required"/>
						</aui:input>
					</div>
		
					<div class="form-group col-md-3">
						<%--<label>Colony/Area <span class="text-danger">*</span></label>--%> 
						<aui:input type="text" class="form-control" name="colonyArea2" label="address-colony-area" value="<%=requestEntity.getColonyArea2()%>" maxlength="50">
							<aui:validator name="required"/>
						</aui:input>
					</div>
					
					<div class="form-group col-md-3">
						<%--<label>Landmark</label>--%> 
						<aui:select type="text" class="form-control" name="landmark2" label="address-landmark">
							<aui:option value="" label="-Select-" />
		<%
				for(Map.Entry<String, String> entry:MasterData.getLandmarks().entrySet()){
		%>	
					<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getLandmark2(), entry.getKey())%>"/>
		<%
				}
		%>
						</aui:select>
					</div>
	
					<div class="form-group col-md-3">
						<%--<label>Landmark Details</label>--%> 
						<aui:input type="text" class="form-control" name="landmarkDetail2" label="address-landmark-detail" value="<%=requestEntity.getLandmarkDetails2()%>" maxlength="50">
						
						</aui:input>
					</div>
		
					<div class="form-group col-md-3">
						<%--<label>City Postal Code <span class="text-danger">*</span></label>--%>
						<aui:input type="text" class="form-control" name="pinCode2" label="address-pin-code" value="<%=requestEntity.getPinCode2()%>" maxlength="6" oninput="javascript: this.value = this.value.replace(/[^0-9]/g, '');">
							<aui:validator name="required"/>
							<aui:validator name="min" errorMessage="Please enter a valid pin code!">110001</aui:validator>
							<aui:validator name="max" errorMessage="Please enter a valid pin code!">110110</aui:validator>
						</aui:input>
					</div>
					
					<div class="p-4 col-md-12">
						<div class="  bg-light" >
							<div class="row  p-2">
								<div class="col-md-12">
									<h6 class="font-weight-bold text-uppercase"><liferay-ui:message key="indicate-landmark" /></h6>
								</div>
							</div>
						</div>
						<div class="form-group col-md-6 p-1">
							<%--<label>Indicate Landmark Details</label>--%> 
							<aui:input type="text" class="form-control" name="indicateLandmark" label="indicate-landmark-detail" value="<%=requestEntity.getIndicateLandmark()%>"  maxlength="50"/>
						</div>
					</div>
					
				</div>
				
				</div>
			</div>
		</div>
	</div>
</aui:form>
<aui:script use="aui-base,aui-modal,aui-overlay-manager">
var portletNamespace="<portlet:namespace/>";
var checked=<%=ViewHelper.isSameAddress(requestEntity)%>;

$(document).ready(function() {
	if(checked==true){
		$("#<portlet:namespace/>sameAddressCheck").prop( "checked", true );
		disableSupplyAddressFields(true);
	}else{
		disableSupplyAddressFields(false);
	}
	
});



Liferay.provide(window,'handleLocalityChange', function () {
	
	$('#'+portletNamespace+'locality').change(function() {
		showDistrict();
	});
});

Liferay.provide(window,'showDistrict', function () {
	$('#'+portletNamespace+'districtName').val('');
	
	var localityDivisionId=$('#'+portletNamespace+'locality').val();
	
	if(localityDivisionId==''){
		return;
	}
	
	Liferay.Service(
		'/bsesconn.localitydivision/get-locality-division',
		{
		 localityDivisionId: localityDivisionId
		},
		function(obj) {
		  console.log(obj);
		  $('#'+portletNamespace+'district').val(obj.divisionCode);
		  $('#'+portletNamespace+'districtName').val(obj.divisionName);
		}
	)
});


$("#<portlet:namespace/>houseNo").keyup(function() {
	var isChecked=$("#<portlet:namespace/>sameAddressCheck").is(":checked")
	if(isChecked==true){
		var houseNo=$("#<portlet:namespace/>houseNo").val();
		$("#<portlet:namespace/>houseNo2").val(houseNo);
	}
});

$("#<portlet:namespace/>floor").on('change',function() {
	var isChecked=$("#<portlet:namespace/>sameAddressCheck").is(":checked")
	if(isChecked==true){
		var floor=$("#<portlet:namespace/>floor").val();
		$("#<portlet:namespace/>floor2").val(floor);
	}
});

$("#<portlet:namespace/>street").keyup(function() {
	var isChecked=$("#<portlet:namespace/>sameAddressCheck").is(":checked")
	if(isChecked==true){
		var street=$("#<portlet:namespace/>street").val();
		$("#<portlet:namespace/>street2").val(street);
	}
});
			
$("#<portlet:namespace/>colonyArea").keyup(function() {
	var isChecked=$("#<portlet:namespace/>sameAddressCheck").is(":checked")
	if(isChecked==true){
		var colonyArea=$("#<portlet:namespace/>colonyArea").val();
		$("#<portlet:namespace/>colonyArea2").val(colonyArea);
	}
});

$("#<portlet:namespace/>landmark").on('change',function() {
	var isChecked=$("#<portlet:namespace/>sameAddressCheck").is(":checked")
	if(isChecked==true){
		var landmark=$("#<portlet:namespace/>landmark").val();
		$("#<portlet:namespace/>landmark2").val(landmark);
	}
});
			
$("#<portlet:namespace/>landmarkDetail").keyup(function() {
	var isChecked=$("#<portlet:namespace/>sameAddressCheck").is(":checked")
	if(isChecked==true){
		var landmarkDetail=$("#<portlet:namespace/>landmarkDetail").val();
		$("#<portlet:namespace/>landmarkDetail2").val(landmarkDetail);
	}
});

$("#<portlet:namespace/>pinCode").keyup(function() {
	var isChecked=$("#<portlet:namespace/>sameAddressCheck").is(":checked")
	if(isChecked==true){
		var pinCode=$("#<portlet:namespace/>pinCode").val();
		$("#<portlet:namespace/>pinCode2").val(pinCode);
	}
});

$("#<portlet:namespace/>buildingName").keyup(function() {
	var isChecked=$("#<portlet:namespace/>sameAddressCheck").is(":checked")
	if(isChecked==true){
		var buildingName=$("#<portlet:namespace/>buildingName").val();
		$("#<portlet:namespace/>buildingName2").val(buildingName);
	}
});

Liferay.provide(window,'sameAddressCheckOnChange', function () {
	$("#<portlet:namespace/>sameAddressCheck").change(function() {
		var isChecked=$("#<portlet:namespace/>sameAddressCheck").is(":checked")
		if(isChecked==true){
			disableSupplyAddressFields(true);
		}else{
			disableSupplyAddressFields(false);
		}
	});
});

Liferay.provide(window,'disableSupplyAddressFields', function (disable) {
	if (disable==true) {
		$('#<portlet:namespace/>houseNo2').attr('readonly',true);
		var houseNo=$("#<portlet:namespace/>houseNo").val();
		$("#<portlet:namespace/>houseNo2").val(houseNo);
		
		$('#<portlet:namespace/>floor2').addClass("select-disable");
		var floor=$("#<portlet:namespace/>floor").val();
		$("#<portlet:namespace/>floor2").val(floor);
		
		$('#<portlet:namespace/>buildingName2').attr('readonly',true);
		var buildingName=$("#<portlet:namespace/>buildingName").val();
		$("#<portlet:namespace/>buildingName2").val(buildingName);
		
		$('#<portlet:namespace/>street2').attr('readonly',true);
		var street=$("#<portlet:namespace/>street").val();
		$("#<portlet:namespace/>street2").val(street);
		 
		$('#<portlet:namespace/>colonyArea2').attr('readonly',true);
		var colonyArea=$("#<portlet:namespace/>colonyArea").val();
		$("#<portlet:namespace/>colonyArea2").val(colonyArea);
		
		$('#<portlet:namespace/>landmark2').addClass("select-disable");
		var landmark=$("#<portlet:namespace/>landmark").val();
		$("#<portlet:namespace/>landmark2").val(landmark);
		
		$('#<portlet:namespace/>landmarkDetail2').attr('readonly',true);
		var landmarkDetail=$("#<portlet:namespace/>landmarkDetail").val();
		$("#<portlet:namespace/>landmarkDetail2").val(landmarkDetail);
		
		$('#<portlet:namespace/>pinCode2').attr('readonly',true);
		var pinCode=$("#<portlet:namespace/>pinCode").val();
		$("#<portlet:namespace/>pinCode2").val(pinCode);
		
	} else if (disable==false) {
		$('#<portlet:namespace/>houseNo2').removeAttr('readonly');
		$('#<portlet:namespace/>floor2').removeClass("select-disable");
		$('#<portlet:namespace/>buildingName2').removeAttr('readonly');
		$('#<portlet:namespace/>street2').removeAttr('readonly'); 
		$('#<portlet:namespace/>colonyArea2').removeAttr('readonly');
		$('#<portlet:namespace/>landmark2').removeClass("select-disable");
		$('#<portlet:namespace/>landmarkDetail2').removeAttr('readonly');
		$('#<portlet:namespace/>pinCode2').removeAttr('readonly');
	}
});


</aui:script>
