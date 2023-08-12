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
	
	ConnectionRequest cr = ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
	String consumerType=cr.getConsumerType();
	
	String consumerName = "";
	if(StringUtils.equalsIgnoreCase(consumerType, "Firm")){
		consumerName =cr.getFirmName();
	}else{
		consumerName=ViewHelper.getFullName(cr);
	}
	
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
<div class="container-fluid mt-3">
		<div class="row">
			<div class="col-md-12">
				<h6 class="text-uppercase text-body font-weight-bold bg-light text-center">
					<liferay-ui:message key="declaration-section-title" />
				</h6>
			</div>
		</div>
		<div class="row">
		
		<div class="col-md-12 declaration-view"  id="declarationDiv">
				<p>
					I, <a id="firstName1" style="font-weight: bold;"><%=ph.getIndividualName() %></a> Son/Daughter/Wife of <a id="fatherName1" style="font-weight: bold;"><%=ph.getFatherName() %></a>
					Resident of <a id="address1" style="font-weight: bold;"><%=ph.getIndividualAddress() %></a> (hereinafter
					referred to as "Applicant", which term shall mean and include executors, administrators, heirs, successors and assigns), do hereby swear and
					declare as under:
				</p>
				Or
				<p>
					The <a id="firmName1" style="font-weight: bold;"><%=ph.getFirmName() %></a>, a company incorporated under the provisions of the Companies Act, 2013 or as amended,
					having its registered office at <a id="registeredOffice1" style="font-weight: bold;"><%=ph.getFirmAddress() %></a> (hereinafter referred to as "Applicant", which
					expression shall, unless repugnant to the context or meaning thereof, include its successors and assigns), through its duly Authorized
					Representative Mr. <a id="authorizedSignature1" style="font-weight: bold;"><%=ph.getAuthorizedSignatory() %></a> do hereby swear and declare as under:
				</p>
				Or
				<p>
					A Sole proprietorship/ a partnership firm having its office at <a id="address2" style="font-weight: bold;"><%=ph.getFirmAddress() %></a> (hereinafter referred to as
					the applicant which unless the context otherwise provides includes its successors and assigns), through Mr. <a id="authorizedSignature2"
						style="font-weight: bold;"><%=ph.getAuthorizedSignatory() %></a> , who is a partner or a duly authorized representative do hereby swear and declare as under:
				</p>
				
				<p>
				THAT the Applicant is a lawful occupant of the premises at <span id="address3"  class="dec_firm_address" style="font-weight: bold;"><%=ph.getIndividualOrFirmAddress() %></span>(hereinafter the "Premises").
				</p>
<!-- inclue static part -->
			<%@ include file="/declaration_part_1_static_content.jsp" %>  
	
		</div>
	</div>

	<div class="row">
		<div class="col-md-12 mt-3 mb-2">
		<aui:form role="form"  name ="declarationForm"  >
			<div class="form-check-inline">
					<aui:input cssClass="mr-2" type="checkbox" style="cursor:default !important" value="1" name="selfDeclaration" label="declaration-check" disabled="true"/>
			</aui:form>
		</div>
	</div>
	
</div>

<script>
$(document).ready(function() {
var checked=<%=cr.isSelfDeclaration()%>;
	if(checked==true){
		$("#<portlet:namespace/>selfDeclaration").prop( "checked", true );
	}	
});
</script>
