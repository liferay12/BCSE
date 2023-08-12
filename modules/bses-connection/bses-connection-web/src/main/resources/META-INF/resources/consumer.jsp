<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>
<%@page import="java.util.Map"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<%!
DateFormat dateFieldFormat=new SimpleDateFormat("yyyy-MM-dd");
%>
<%
ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
System.out.println("ConsumerType.jsp>requestEntity.getConsumerType()>"+requestEntity.getConsumerType());
String consumerType=StringUtils.trim(requestEntity.getConsumerType());
boolean online=StringUtils.equals(requestEntity.getRequestMode(), BsesConnectionPortletKeys.REQUEST_MODE_ONLINE);
String requestType=requestEntity.getRequestType();
%>
<portlet:actionURL name="saveForm" var="saveFormActionURL">
	<portlet:param name="formAction" value="saveConsumer" />
</portlet:actionURL>

<aui:form cssClass="custom-form form-auto-save" role="form" id ="consumerForm" name="consumerForm" section-attr="consumer">
	<div class="container-fluid bg-white shadow p-5 my-3">
		<div class="row">
			<div class="col-md-12">
<%
	if(StringUtils.equals(requestType, RequestTypeModeStatus.TYPE_NEW_CONNECTION)){
%>				
				<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="consumer-section-title" /></h6>	
<%
	}else{
%>				
				<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="consumer-section-name-change-title" /></h6>
<%
	}
%>
			</div>
		</div>
		<div class="row">
			<div class="col-md-9" style="padding:0px !important; marging:0px !important;">	
				<div class="container-fluid">
					<div class="row">
						<div class="form-group col-md-6">
							<%--<label class="control-label font-weight-bold" for="consumerType">Consumer Type <span class="text-danger">*</span></label>--%> 
							<%--if(!ViewHelper.canEditConsumerType(requestEntity)){%>
								<aui:input type="text" name="consumerType" value="<%=requestEntity.getConsumerType()%>" readOnly="true"/>
							<%}else{ --%>
							<aui:select class="form-control" name="consumerType" label="consumer-type" >
								<aui:option value="" label="-Select-" />
								<aui:option value="<%=MasterData.ConsumerTypes.Individual.name() %>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getConsumerType(), MasterData.ConsumerTypes.Individual.name())%>" label="Individual" />
								<aui:option value="<%=MasterData.ConsumerTypes.Firm.name() %>" selected="<%=StringUtils.equalsIgnoreCase(requestEntity.getConsumerType(), MasterData.ConsumerTypes.Firm.name())%>" label="Firm/Trust/Company/Others" />
								<aui:validator name="required" />
							</aui:select>
							<%--} --%>
						</div>
					</div>
		
					<div class="row individual-detail">
						<div class="form-group col-md-4">
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
								<aui:validator name="required" >
								function() {
					                	return AUI.$('#<portlet:namespace />consumerType').val()=="Individual";
					                }
					              </aui:validator>  
							</aui:select>
						</div>
						<div class="form-group col-md-8"></div>
						
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
				
						<div class="form-group col-md-4">
							<%--<label>Middle Name</label>--%> 
							<aui:input type="text" class="form-control" name="middleName" label="consumer-middle-name" value="<%=requestEntity.getMiddleName()%>" maxlength="50"/>
						</div>
			
						<div class="form-group col-md-4">
							<%--<label>Last Name <span class="text-danger">*</span></label>--%> 
							<aui:input type="text" class="form-control" name="lastName" label="consumer-last-name" value="<%=requestEntity.getLastName() %>" maxlength="50"/>
						</div>
						
						<div class="form-group  col-md-8">
							<%--<label>Middle Name</label>--%>
							<div class="form-check-inline">
								<aui:input class="form-check-input" type="radio" name="sonDaughterWife" label="Son Of" value="S" checked="<%=(StringUtils.isBlank(requestEntity.getSonDaughterWife()) || StringUtils.equalsIgnoreCase(requestEntity.getSonDaughterWife(),"S"))%>" />
							</div>
							<div class="form-check-inline">
								<aui:input class="form-check-input" type="radio" name="sonDaughterWife" label="Daughter Of" value="D" checked="<%=StringUtils.equalsIgnoreCase(requestEntity.getSonDaughterWife(),"D")%>"/>
							</div>
							<div class="form-check-inline">
								<aui:input class="form-check-input" type="radio" name="sonDaughterWife" label="Wife Of" value="W" checked="<%=StringUtils.equalsIgnoreCase(requestEntity.getSonDaughterWife(),"W")%>"/>
							</div>
						
							 <aui:input type="text" class="form-control" name="fatherOrHusbandName" label="consumer-father-husband-name" placeholder="Father or Husband's Name" value="<%=requestEntity.getFatherOrHusbandName() %>" maxlength="50">
							 	<aui:validator name="required">
					                function() {
					                	var ct=AUI.$('#<portlet:namespace />consumerType').val();
					                	return (ct=="Individual" || ct=="");
					                }
					        	</aui:validator>
							 </aui:input>					
						</div>
					</div>
			
					<div class="row firm-detail">
						<div class="form-group col-md-8">
							<%--<label>Firm/Trust/Company/Others Name <span class="text-danger">*</span></label>--%> 
							<aui:input type="text" class="form-control" name="firmName" label="consumer-firm-name" value="<%=requestEntity.getFirmName()%>" maxlength="75">
								<aui:validator name="required">
					                function() {
					                	return AUI.$('#<portlet:namespace />consumerType').val()=="Firm";
					                }
					        	</aui:validator>
							</aui:input>
						</div>
						<div class="form-group col-md-4"></div>
						<div class="form-group col-md-4">
							<%--<label>Name of Authorized Signatory <span class="text-danger">*</span></label>--%> 
							<aui:input type="text" class="form-control" name="signatoryName" label="consumer-signatory-name" value="<%=requestEntity.getSignatoryName()%>" maxlength="50">
								<aui:validator name="required">
									function() {
						            	return AUI.$('#<portlet:namespace />consumerType').val()=="Firm";
						            }
					            </aui:validator>
							</aui:input>
						</div>
			
						<div class="form-group col-md-4">
							<%--<label>Designation of Signatory</label>--%> 
							<aui:input type="text" class="form-control" name="signatoryDesignation" label="consumer-signatory-designation" value="<%=requestEntity.getSignatoryDesignation()%>" maxlength="50">
								<aui:validator name="required">
									function() {
						            	return AUI.$('#<portlet:namespace />consumerType').val()=="Firm";
						            }
					            </aui:validator>				
							</aui:input>
						</div>
			
						<div class="form-group col-md-4">
							<%--<label>Type of Organization </label>--%> 
							<aui:input type="text" class="form-control" name="organizationType" label="consumer-organization-type" value="<%=requestEntity.getOrganizationType()%>" maxlength="50"/>
						</div>
						<div class="form-group col-md-4">
							<%--<label>Date of Incorporation </label>--%> 
							<aui:input type="date" class="form-control" name="incorporationDate" label="consumer-incorporation-date" value="<%=(requestEntity.getIncorporationDate()!=null?dateFieldFormat.format(requestEntity.getIncorporationDate()):null)%>">
								<aui:validator errorMessage="Incorporation date must be before today's date."  name="custom">
					                function(val, fieldNode, ruleValue) {
					                	var consumerType=AUI.$("#<portlet:namespace/>consumerType").val();
					                	if(consumerType!="Firm"){
					                		return true;
					                	}
					                	
					                	var d1=yyyyMMddStrToDate(val);
					                	var d2=onlyDate(new Date());
				                        var result=dateDiff(d1, d2);
										if(result<0){
											return true;
										}else{
											return false;
										}
					                }
					        	</aui:validator>								
							</aui:input>
						</div>
			
						<div class="form-group col-md-4">
							<%--<label>GST No. </label>--%> 
							<aui:input type="text" class="form-control" name="gstNo" label="consumer-gst-no" value="<%=requestEntity.getGstIn()%>" maxlength="15"/>
						</div>
			
						<div class="form-group col-md-4">
							<%--<label>PAN No. <span class="text-danger">*</span></label>--%> 
							<aui:input type="text" class="form-control" name="panNo" label="consumer-pan-no" value="<%=requestEntity.getPanNo()%>" maxlength="10">
								<aui:validator name="required">
									function() {
						            	return AUI.$('#<portlet:namespace />consumerType').val()=="Firm";
						            }
					            </aui:validator>	
					             <aui:validator name="custom" errorMessage="Invalid PAN">	
					             	function(val, fieldNode, ruleValue) {
			                        	var consumerType=AUI.$("#<portlet:namespace/>consumerType").val();
					                	if(consumerType!="Firm"){
					                		return true;
					                	}
			                        	
			                        	var regex = new RegExp(/^([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$/);
			                       		return regex.test(val);
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
			</div>
			<div class="col-md-3" style="justify-content: center;">	
				<div style="margin:0 auto; justify-content: center;">
<%
	if(!online){
%>		
					<div style="width:140px;height:165px; background-color: #ced4da; text-align:center; vertical-align:middle; padding:2px; margin:auto; display:none;" class="mb-2 mt-2">
						<p style="vertical-align:middle;margin-top:45%;">Applicant's Photo</p>
					</div>
<%
	}else{
%>				
					<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
						<liferay-util:param name="elementName" value="applicantPhoto" />
						<liferay-util:param name="documentType" value="Applicant_Photo" />
						<liferay-util:param name="documentName" value="Applicant Photo" />
						<liferay-util:param name="fileTypes" value="image/png,image/jpeg" />
						<liferay-util:param name="thumbnail" value="true" />
						<liferay-util:param name="placeHolder" value="<%=request.getContextPath()+"/images/user-profile.png" %>" />
						<liferay-util:param name="width" value="140" />
						<liferay-util:param name="height" value="165" />
						<liferay-util:param name="maxFileSize" value="102400" />
						<liferay-util:param name="required" value="true" />
						<liferay-util:param name="tooltip" value="Allows only jpg/png files upto 100kb size." />
						<liferay-util:param name="label" value="Applicant's Photo" />
					</liferay-util:include>
<%
	}
%>						
				</div>
				<div class="mt-5" style="margin:0 auto;justify-content: center;">
<%
	if(!online){
%>				
					<div style="width:200px;height:62px; background-color:#ced4da; text-align:center; vertical-align:middle; padding:2px; margin:auto; display:none;">
						<p style="vertical-align:middle;margin-top:10%;">Applicant's Signature<p>
					</div>
<%
	}else{
%>					
					<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
						<liferay-util:param name="elementName" value="applicantSignature" />
						<liferay-util:param name="documentType" value="Applicant_Signature" />
						<liferay-util:param name="documentName" value="Applicant Signature" />
						<liferay-util:param name="fileTypes" value="image/png,image/jpeg" />
						<liferay-util:param name="thumbnail" value="true" />
						<liferay-util:param name="placeHolder" value="<%=request.getContextPath()+"/images/signature.png" %>" />
						<liferay-util:param name="width" value="200" />
						<liferay-util:param name="height" value="62" />
						<liferay-util:param name="maxFileSize" value="51200" />
						<liferay-util:param name="required" value="true" />
						<liferay-util:param name="tooltip" value="Allows only jpg/png files upto 50kb size." />
						<liferay-util:param name="label" value="Applicant's Signature" />
					</liferay-util:include>
<%
	}
%>					
				</div>
			</div>
		</div>
	</div>
</aui:form>

<aui:script use="aui-base,aui-modal,aui-overlay-manager"> 

var portletNamespace="<portlet:namespace/>";
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

Liferay.provide(window,'showHideConsumerTypeDiv', function () {
		
	$('#firmDiv').hide();
	var consumerType=$('#'+portletNamespace+'consumerType').val();
	if (consumerType != 'Firm') {
		$('.individual-detail').show();
		$('.firm-detail').hide();
		
	} else {
		$('.individual-detail').hide();
		$('.firm-detail').show();
	}
	
	if(consumerType != "")
	{
		//pupulateIdAndOwnerProofTypes defined in documents.jsp
		pupulateIdAndOwnerProofTypes(consumerType);
	}
});

Liferay.provide(window,'handleConsumerTypeChange', function () {	
	
	$('#'+portletNamespace+'consumerType').change(function() {
		showHideConsumerTypeDiv();
		$(".firm-documents").css("display", ($(this).val()=="Individual"?"none":"block"));
	});
});
</aui:script>