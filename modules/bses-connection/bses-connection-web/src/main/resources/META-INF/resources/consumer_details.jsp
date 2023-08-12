<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>
<%@page import="java.util.Map"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<%
ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
ConnectionRequest oldEntity =ConnectionRequestLocalServiceUtil.convertToConnectionRequest(requestEntity.getOldData());
if(oldEntity == null){
	oldEntity = requestEntity;
}

String consumerType=StringUtils.trim(oldEntity.getConsumerType());
String sdw=StringUtils.trim(oldEntity.getSonDaughterWife());
if(StringUtils.isBlank(sdw)){
	sdw="S";
}

String tariffCategory = oldEntity.getDisplayCategory();

if(StringUtils.isBlank(tariffCategory)){
	tariffCategory = MasterData.getTariffCategoryValue(oldEntity.getTariffCategory());
}


if(StringUtils.isBlank(tariffCategory)){
	tariffCategory = oldEntity.getTariffCategory();
}

String consumerName = "";
if(StringUtils.equalsIgnoreCase(consumerType, "Firm")){
	consumerName =oldEntity.getFirmName();
}else{
	consumerName=ViewHelper.getFullName(oldEntity);
}

%>
<div class="container-fluid bg-white shadow p-5 my-3">
	<div class="row">
		<div class="col-md-12">
			<h6 class="font-weight-bold text-uppercase bg-light p-3">Existing Consumer/Connection Details</h6>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<div class="container-fluid" style="border:1px solid #ced4da;">
				<div class="row">
					<div class="col-md-12 bg-danger">
						<label class="font-weight-bold text-white">Name & Address</label>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<label class="font-weight-bold text-uppercase"><%=consumerName %></label>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<p>
							<%=ViewHelper.getViewAddress(oldEntity) %><br>
							Email: <%=oldEntity.getEmailId()%><br>
							Mobile: <%=oldEntity.getMobileNo()%>
						</p>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12 bg-danger" style="border:1px solid #ced4da;">
						<label class="font-weight-bold text-white">Account Details</label>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label class="font-weight-bold">CA Number</label>
					</div>
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label><%=oldEntity.getCaNumber() %></label>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label class="font-weight-bold">BP Number</label>
					</div>
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label><%=oldEntity.getBpNumber() %></label>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label class="font-weight-bold">Consumer Type</label>
					</div>
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label><%=StringUtils.trim(MasterData.getConsumerTypeName(oldEntity.getConsumerType())) %></label>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label class="font-weight-bold">&nbsp;</label>
					</div>
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label>&nbsp;</label>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="container-fluid" style="border:1px solid #ced4da;">
				<div class="row">
					<div class="col-md-12 bg-danger">
						<label class="font-weight-bold text-white">Load Details</label>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label class="font-weight-bold">Connection Type</label>
					</div>
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label><%=(StringUtils.equals(requestEntity.getConnectionType(),"2")?"Temporary":"Permanent")%></label>
					</div>
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label class="font-weight-bold">Tariff Category</label>
					</div>
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label><%=tariffCategory %></label>
					</div>
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label class="font-weight-bold">Sanctioned Load</label>
						 
					</div>
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label><%=oldEntity.getLoadKw()%> KW</label>
						<aui:input type="hidden" name="existingLoad" value="<%=oldEntity.getLoadKw()%>"/>
					</div>
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label class="font-weight-bold">&nbsp;</label>
					</div>
					<div class="col-md-6" style="border:1px solid #ced4da;">
						<label class="font-weight-bold">&nbsp;</label>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%--					<div class="row "> 
						<div class="form-group col-12">
							<label>Consumer name</label>
						</div>
						<div class="form-group col-12">
							<label><%=ViewHelper.getFullName(oldEntity) %></label>
						</div>
					</div>
					<div class="row "> 
						<div class="form-group col-12">
							<label>Father Name - </label>
						 </div>
						 <div class="form-group col-12">
							<label><%=oldEntity.getFatherOrHusbandName() %></label>
						 </div>
					</div>
				</div>
			</div>
			<div class="row firm-detail">
				<div class="form-group col-md-12">
					<label><liferay-ui:message key="consumer-firm-name" /> - <%=requestEntity.getFirmName()%></label>
				</div>
		
				<div class="form-group col-md-12">
					<label><liferay-ui:message key="consumer-signatory-name" /> - <%=requestEntity.getSignatoryName()%></label>
				</div>
		
				<div class="form-group col-md-12">
					<label><liferay-ui:message key="consumer-signatory-designation" /> - <%=requestEntity.getSignatoryDesignation()%></label>
				</div>
		
				<div class="form-group col-md-12">
					<label><liferay-ui:message key="consumer-organization-type" /> - <%=StringUtils.trim(requestEntity.getOrganizationType())%></label>
				</div>
				<div class="form-group col-md-3">
					<label><liferay-ui:message key="consumer-incorporation-date" /> - <%=requestEntity.getIncorporationDate()%></label>
				</div>
		
				<div class="form-group col-md-3">
					<label><liferay-ui:message key="consumer-gst-no" /> - <%=StringUtils.trim(requestEntity.getGstIn())%></label>
				</div>
		
				<div class="form-group col-md-3">
					<label><liferay-ui:message key="consumer-pan-no" /> - <%=StringUtils.trim(requestEntity.getPanNo())%></label>
				</div>
			</div>
		</div>
		
		<div class="form-group col-md-4">
				<div class="row "> 
					<div class="form-group col-md-12">
						<label>Address - </label>
					</div>
					<div class="form-group col-md-12">
						<label><%=ViewHelper.getViewAddress(oldEntity) %></label>
					</div>
				</div>
		</div>

		<div class="form-group col-md-4">
			<div class="form-group col-md-12">
				<label class="control-label" >CA Number - <%=oldEntity.getCaNumber() %></label> </br>
				<label class="control-label" >BP Number - <%=oldEntity.getBpNumber() %></label> </br>
				<label class="control-label" ><liferay-ui:message key="consumer-type" /> - <%=StringUtils.trim(MasterData.getConsumerTypeName(oldEntity.getConsumerType())) %></label></br>
				<label class="control-label" >Sanctioned Load - <%=oldEntity.getLoadKw()%> KW</label> </br> 
				<label class="control-label" >Tariff Category - <%=tariffCategory %></label> 
			</div>
		</div>
	</div>
</div>--%>
<aui:script use="aui-base,aui-modal,aui-overlay-manager"> 
<%
	if(StringUtils.equals(MasterData.ConsumerTypes.Firm.name(), consumerType)){
%>
		$(".individual-detail").hide();
<%
	}else{
%>
		$(".firm-detail").hide();
<%
	}
%>
</aui:script>
