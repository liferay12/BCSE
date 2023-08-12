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
</style>
<%
	ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
	String requestType=requestEntity.getRequestType();
	
%>
<portlet:actionURL name="saveForm" var="saveFormActionURL">
	<portlet:param name="formAction" value="saveAddress" />
</portlet:actionURL>

<div class="container-fluid bg-white shadow p-5 my-3">
		<div class="row">
			<div class="col-md-12">
				<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="address-section-title" /></h6>	
			</div>
		</div>
<div class="row">			

<aui:form cssClass="custom-form form-auto-save" role="form" name="addressForm" id="addressForm" section-attr="address">
	<div class="container-fluid my-3">
		<div class="row">
			<div class="col-md-12">
<%
	if(StringUtils.equals(requestType, RequestTypeModeStatus.TYPE_NEW_CONNECTION)){
%>				
				<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="communication-address-section-title" /></h6>	
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
			
			<div class="form-group col-md-3">
				<%--<label>House No. <span class="text-danger">*</span></label>--%> 
				<aui:input type="text" name="houseNo" label="address-house-no" value="<%=requestEntity.getHouseNo()%>" maxlength="10">
					<aui:validator name="required"/>
				</aui:input>
			</div>

			<div class="form-group col-md-3">
				<%--<label>Floor <span class="text-danger">*</span></label>--%> 
				<aui:select class="form-control select2" name="floor" label="address-floor" >
					<aui:option value="" label="-Select-" />
<%
		for(Map.Entry<String, String> entry:MasterData.getFloors().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getFloor(), entry.getKey())%>"/>
<%
		}
%>
				
				</aui:select>
			</div>

			<div class="form-group col-md-3">
				<%--<label>Building Name</label>--%> 
				<aui:input type="text" class="form-control" name="buildingName" label="address-building-name" value="<%=requestEntity.getBuildingName()%>" maxlength="50">
					<%--<aui:validator name="required"/> --%>
				</aui:input>
			</div>

			<div class="form-group col-md-3">
				<%--<label>Street <span class="text-danger">*</span></label>--%> 
				<aui:input type="text" class="form-control" name="street" label="address-street" value="<%=requestEntity.getStreet() %>" maxlength="50">
					<aui:validator name="required"/>
				</aui:input>
			</div>

			<div class="form-group col-md-3">
				<%--<label>Colony/Area <span class="text-danger">*</span></label>--%> 
				<aui:input type="text" class="form-control" name="colonyArea" label="address-colony-area" value="<%=requestEntity.getColonyArea()%>" maxlength="50">
					<aui:validator name="required"/>
				</aui:input>
			</div>

			<div class="form-group col-md-3">
				<%--<label>Landmark</label>--%> 
				<aui:select type="text" class="form-control" name="landmark" label="address-landmark">
					<aui:option value="" label="-Select-" />
<%
		for(Map.Entry<String, String> entry:MasterData.getLandmarks().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getLandmark(), entry.getKey())%>"/>
<%
		}
%>
				</aui:select>
			</div>

			<div class="form-group col-md-3">
				<%--<label>Landmark Details</label>--%> 
				<aui:input type="text" class="form-control" name="landmarkDetail" label="address-landmark-detail" value="<%=requestEntity.getLandmarkDetails()%>" maxlength="50">
				
				</aui:input>
			</div>

			<div class="form-group col-md-3">
				<%--<label>City Postal Code <span class="text-danger">*</span></label>--%>
				<aui:input type="text" class="form-control" name="pinCode" label="address-pin-code" value="<%=requestEntity.getPinCode()%>" maxlength="6" oninput="javascript: this.value = this.value.replace(/[^0-9]/g, '');">
					<aui:validator name="required"/>
					<aui:validator name="min" errorMessage="Please enter a valid pin code!">110001</aui:validator>
					<aui:validator name="max" errorMessage="Please enter a valid pin code!">110110</aui:validator>
				</aui:input>
			</div>
		</div>
		<div class="row firm-detail" id="registered-address-row">
			<div class="form-group col-md-6">
				<%--<label>Building Name</label>--%> 
				<aui:input type="textarea" class="form-control" name="registeredAddress" col="300" row="5" label="address-registered-address" value="<%=requestEntity.getRegisteredAddress() %>" maxlength="255">
				</aui:input>
			</div>
		</div>				
	</div>
</aui:form>
	</div>
	<div class="row">
		<liferay-util:include page="/address2.jsp" servletContext="<%=application%>" /> 
	</div>
</div>


<aui:script use="aui-base,aui-modal,aui-overlay-manager">

$(document).ready(function(){
<%
	if(StringUtils.equals(requestEntity.getConsumerType(), MasterData.ConsumerTypes.Individual.name())){
%>
		$(".firm-detail").hide();
<%
	}
%>
	
});

</aui:script>
