<%@page import="java.util.Map"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%
String mobileNo=ParamUtil.getString(request, "caNumber", "");
 ConnectionRequest requestEntity=ConnectionRequestLocalServiceUtil.getConnectionRequestByMobileNoAndRequestNo(mobileNo, "R-TMP-1654931483518");
%>
<portlet:actionURL name="saveForm" var="saveFormActionURL">
	<portlet:param name="formAction" value="saveConsumer" />
</portlet:actionURL>

<aui:form cssClass="custom-form form-auto-save" role="form" id ="consumerForm" name="consumerForm" section-attr="consumer">
	<div class="container-fluid bg-white shadow p-5 my-3">
		<div class="row">
			<div class="col-md-12">
				<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="consumer-section-title" /></h6>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-4">
				<%--<label class="control-label font-weight-bold" for="consumerType">Consumer Type <span class="text-danger">*</span></label>--%> 
				<aui:select class="form-control" name="consumerType" label="consumer-type">
					<aui:option value="" label="-Select-" />
					<aui:option value="<%=MasterData.ConsumerTypes.Individual.name() %>" selected="<%=StringUtils.isBlank(requestEntity.getConsumerType()) || StringUtils.equalsIgnoreCase(requestEntity.getConsumerType(), MasterData.ConsumerTypes.Individual.name())%>" label="Individual" />
					<aui:option value="<%=MasterData.ConsumerTypes.Firm.name() %>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getConsumerType(), MasterData.ConsumerTypes.Firm.name())%>" label="Firm/Trust/Company/Others" />
					<aui:validator name="required" />
				</aui:select>
			</div>
		</div>

		<div class="row" id="indvDiv">
			<div class="form-group col-md-2">
				<%--<label>Title <span class="text-danger">*</span></label>--%> 
				<aui:select class="form-control" name="title" label="consumer-title">
					<aui:option value="" label="Select Title" />
<%
		for(Map.Entry<String, String> entry:MasterData.getTitles().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getTitle(), entry.getKey())%>"/>
<%
		}
%>
					<aui:validator name="required" />
				</aui:select>
			</div>
			<div class="form-group col-md-4">
				<%--<label>First Name <span class="text-danger">*</span></label>--%> 
				<aui:input type="text" class="form-control" name="firstName" label="consumer-first-name" value="<%=requestEntity.getFirstName() %>" maxlength="50">
					<aui:validator name="required">
		                function() {
		                	return AUI.$('#<portlet:namespace />consumerType').val()=="Individual";
		                }
		        	</aui:validator>
				</aui:input>
			</div>

			<div class="form-group col-md-3">
				<%--<label>Middle Name</label>--%> 
				<aui:input type="text" class="form-control" name="middleName" label="consumer-middle-name" value="<%=requestEntity.getMiddleName()%>" maxlength="50"/>
			</div>

			<div class="form-group col-md-3">
				<%--<label>Last Name <span class="text-danger">*</span></label>--%> 
				<aui:input type="text" class="form-control" name="lastName" label="consumer-last-name" value="<%=requestEntity.getLastName() %>" maxlength="50"/>
			</div>
			
			<div class="form-group  col-md-6">
				<%--<label>Middle Name</label>--%>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="sonDaughterWife" label="Son" value="S" checked="<%=(StringUtils.isBlank(requestEntity.getSonDaughterWife()) || StringUtils.equalsIgnoreCase(requestEntity.getSonDaughterWife(),"S"))%>" />
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="sonDaughterWife" label="Daughter" value="D" checked="<%=StringUtils.equalsIgnoreCase(requestEntity.getSonDaughterWife(),"D")%>"/>
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="sonDaughterWife" label="Wife Of" value="W" checked="<%=StringUtils.equalsIgnoreCase(requestEntity.getSonDaughterWife(),"W")%>"/>
				</div>
				
				 <aui:input type="text" class="form-control" name="fatherOrHusbandName" label="" placeholder="Father or Husband's Name" value="<%=requestEntity.getFatherOrHusbandName() %>">
				 	<aui:validator name="required">
		                function() {
		                	return AUI.$('#<portlet:namespace />consumerType').val()=="Individual";
		                }
		        	</aui:validator>
				 </aui:input>					
			</div>
		</div>

		<div class="row" id="firmDiv">
			<div class="form-group col-md-6">
				<%--<label>Firm/Trust/Company/Others Name <span class="text-danger">*</span></label>--%> 
				<aui:input type="text" class="form-control" name="firmName" label="consumer-firm-name" value="<%=requestEntity.getFirmName()%>"maxlength="75">
					<aui:validator name="required">
		                function() {
		                        return AUI.$('#<portlet:namespace />consumerType').val()=="Firm";
		                }
		        	</aui:validator>
				</aui:input>
			</div>

			<div class="form-group col-md-3">
				<%--<label>Name of Authorized Signatory <span class="text-danger">*</span></label>--%> 
				<aui:input type="text" class="form-control" name="signatoryName" label="consumer-signatory-name" value="<%=requestEntity.getSignatoryName()%>" maxlength="50">
					<aui:validator name="required">
						function() {
			            	return AUI.$('#<portlet:namespace />consumerType').val()=="Firm";
			            }
		            </aui:validator>
				</aui:input>
			</div>

			<div class="form-group col-md-3">
				<%--<label>Designation of Signatory</label>--%> 
				<aui:input type="text" class="form-control" name="signatoryDesignation" label="consumer-signatory-designation" value="<%=requestEntity.getSignatoryDesignation()%>" maxlength="50">
					<aui:validator name="required">
						function() {
			            	return AUI.$('#<portlet:namespace />consumerType').val()=="Firm";
			            }
		            </aui:validator>				
				</aui:input>
			</div>

			<div class="form-group col-md-3">
				<%--<label>Type of Organization </label>--%> 
				<aui:input type="text" class="form-control" name="organizationType" label="consumer-organization-type" value="<%=requestEntity.getOrganizationType()%>" maxlength="50"/>
			</div>
			<div class="form-group col-md-3">
				<%--<label>Date of Incorporation </label>--%> 
				<aui:input type="date" class="form-control" name="incorporationDate" label="consumer-incorporation-date" value="<%=requestEntity.getIncorporationDate()%>"/>
			</div>

			<div class="form-group col-md-3">
				<%--<label>GST No. </label>--%> 
				<aui:input type="text" class="form-control" name="gstNo" label="consumer-gst-no" value="<%=requestEntity.getGstIn()%>" maxlength="15"/>
			</div>

			<div class="form-group col-md-3">
				<%--<label>PAN No. <span class="text-danger">*</span></label>--%> 
				<aui:input type="text" class="form-control" name="panNo" label="consumer-pan-no" value="<%=requestEntity.getPanNo()%>" maxlength="10">
					<aui:validator name="required">
						function() {
			            	return AUI.$('#<portlet:namespace />consumerType').val()=="Firm";
			            }
		            </aui:validator>				
				</aui:input>
			</div>
		</div>
	</div>
</aui:form>