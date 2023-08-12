<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>
<%@page import="java.util.Map"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<%
ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
String consumerType=StringUtils.trim(requestEntity.getConsumerType());
System.out.println("ConsumerType.jsp>requestEntity.getConsumerType()>"+requestEntity.getConsumerType());
String sdw=StringUtils.trim(requestEntity.getSonDaughterWife());
if(StringUtils.isBlank(sdw)){
	sdw="S";
}
//consumerType="Firm"; //This is to test different consumer type

%>
<portlet:actionURL name="saveForm" var="saveFormActionURL">
	<portlet:param name="formAction" value="saveConsumer" />
</portlet:actionURL>

<div class="container-fluid bg-white shadow p-5 my-3">
	<div class="row">
		<div class="col-md-12">
			<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="consumer-section-title" /></h6>
		</div>
	</div>

	<div class="row">
		<div class="form-group col-md-4">
			<label class="control-label" for="consumerType"><liferay-ui:message key="consumer-type" /><span class="text-danger">*</span></label> 
			<span class="form-control" readonly><%=StringUtils.trim(MasterData.getConsumerTypeName(requestEntity.getConsumerType())) %></span>
		</div>
	</div>

	<div class="row individual-detail">
		<div class="form-group col-md-2">
			<label><liferay-ui:message key="consumer-title" /> <span class="text-danger">*</span></label>
			<span class="form-control" readonly><%=StringUtils.trim(MasterData.getTitleValue(requestEntity.getTitle())) %></span>
		</div>
		<div class="form-group col-md-4">
			<label><liferay-ui:message key="consumer-first-name" /> <span class="text-danger">*</span></label>
			<span class="form-control" readonly><%=requestEntity.getFirstName() %></span>
		</div>

		<div class="form-group col-md-3">
			<label><liferay-ui:message key="consumer-middle-name" /></label>
			<span class="form-control" readonly><%=StringUtils.trim(requestEntity.getMiddleName()) %></span>
		</div>

		<div class="form-group col-md-3">
			<label><liferay-ui:message key="consumer-last-name" /></label>
			<span class="form-control" readonly><%=StringUtils.trim(requestEntity.getLastName()) %></span>
		</div>
		
		<div class="form-group col-md-6">
			<label>
			<span class="mr-3"><i class="<%=(sdw.equals("S")?"icon-ok-sign":"icon-circle-blank")%> mr-2"></i>Son Of</span><span class="mr-3"><i class="<%=(sdw.equals("D")?"icon-ok-sign":"icon-circle-blank")%> mr-2"></i>Daughter Of</span><span><i class="<%=(sdw.equals("W")?"icon-ok-sign":"icon-circle-blank")%> mr-2"></i>Wife Of</span>
			</label>
			 <span class="form-control" readonly><%=requestEntity.getFatherOrHusbandName() %></span>
		</div>
	</div>

	<div class="row firm-detail">
		<div class="form-group col-md-6">
			<label><liferay-ui:message key="consumer-firm-name" /></label>
			<span class="form-control" readonly><%=requestEntity.getFirmName()%></span>
		</div>

		<div class="form-group col-md-3">
			<label><liferay-ui:message key="consumer-signatory-name" /></label>
			<span class="form-control" readonly><%=requestEntity.getSignatoryName()%></span>
		</div>

		<div class="form-group col-md-3">
			<label><liferay-ui:message key="consumer-signatory-designation" /></label>
			<span class="form-control" readonly><%=requestEntity.getSignatoryDesignation()%></span>
		</div>

		<div class="form-group col-md-3">
			<label><liferay-ui:message key="consumer-organization-type" /></label>
			<span class="form-control" readonly><%=StringUtils.trim(requestEntity.getOrganizationType())%></span>
		</div>
		<div class="form-group col-md-3">
			<label><liferay-ui:message key="consumer-incorporation-date" /></label>
			<span class="form-control" readonly><%=requestEntity.getIncorporationDate()%></span>
		</div>

		<div class="form-group col-md-3">
			<label><liferay-ui:message key="consumer-gst-no" /></label>
			<span class="form-control" readonly><%=StringUtils.trim(requestEntity.getGstIn())%></span>
		</div>

		<div class="form-group col-md-3">
			<label><liferay-ui:message key="consumer-pan-no" /></label>
			<span class="form-control" readonly><%=StringUtils.trim(requestEntity.getPanNo())%></span>
		</div>
	</div>
</div>
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
