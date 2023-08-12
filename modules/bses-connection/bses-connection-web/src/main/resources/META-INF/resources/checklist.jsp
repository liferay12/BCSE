<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.bses.connection2.model.ConnectionDocument"%>
<%@page import="com.bses.connection2.service.ConnectionDocumentLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="java.util.Calendar"%>
<%@ include file="/init.jsp"%>
<style>
.checklist-modal
 {
  position: fixed;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  z-index: 1050;
  display: none; 
  overflow: hidden;
  -webkit-overflow-scrolling: touch;
  outline: 0;
	}  
</style>
<%
long connectionDocumentId=0;
//Calendar calendar=Calendar.getInstance();
ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
long connectionRequestId=requestEntity.getConnectionRequestId();
String requestMode=requestEntity.getRequestMode();
String requestType=requestEntity.getRequestType();
boolean onlineMode=StringUtils.equals(requestMode, BsesConnectionPortletKeys.REQUEST_MODE_ONLINE);
boolean isDomesticTariff=StringUtils.equals(requestEntity.getTariffCategory(), "0100");
String email = requestEntity.getEServiceMailId();
if(StringUtils.isBlank(email)){
	email = requestEntity.getEmailId();
}
if(email == null){
	email="";
}

boolean showFcc = false;

if(!requestEntity.getHeight9Mtr() || !requestEntity.getHeight12Mtr() || !requestEntity.getHeight15Mtr() || !requestEntity.getHeight17Mtr()){
	showFcc = true;
}

//String folder="/Users/arjun/Documents/tools/liferay7/liferay-dxp-7.0.10.17-sp17/bses/application/newconnection_docs/"+calendar.get(Calendar.YEAR)+"/"+(calendar.get(Calendar.MONTH)+1)+"/RQ005";
%>
<aui:form cssClass="custom-form" role="form" name="checklistForm" section-attr="checklist" >
	<div class="container-fluid bg-white shadow p-5 my-3">
		<div class="row">
			<div class="col-md-12">
				<h6 class="text-uppercase text-body font-weight-bold bg-light p-3"><liferay-ui:message key="checklist-section-title" /></h6>
			</div>
		</div>
		
		<%-- ELCB INSTALLATION CERTIFICATE --%>
		<div class="form-group row align-items-center" id="elcbdiv" style="display:<%=requestEntity.getLoadKw()<2?"none":"block"%>;">
			<div class="col-sm-6">
				<label for="elcbInstalled" class="col-form-label">
					<liferay-ui:message key="checklist-elcb" />
				</label>
				<p id="elcbblink" class="blink">
					<liferay-ui:message key="checklist-elcb-blink" />
				</p>
			</div>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio"  name="elcbInstalled" value="1" label="Yes" checked="<%=requestEntity.getElcbInstalled() %>"  /> <%--<label class="form-check-label font-weight-bold"> Yes
					</label>--%>
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio"  name="elcbInstalled" value="0" label="No" checked="<%=!requestEntity.getElcbInstalled() %>"/> <%--<label class="form-check-label font-weight-bold"> No </label>--%>
				</div>
			</div>
<%
	if(onlineMode){
%>				
			<div class="col-md-4">

				<div id="elcbuploaddiv" style="display:<%=requestEntity.getElcbInstalled()?"block":"none"%>; width:100%;">
					<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
						<liferay-util:param name="elementName" value="elcbDocument" />
						<liferay-util:param name="documentType" value="ELCB_Document" />
						<liferay-util:param name="documentName" value="ELCB Document" />
						<liferay-util:param name="fileTypes" value="application/pdf" />
						<liferay-util:param name="tooltip" value="Photo of Installed ELCB to be uploaded"/>
					</liferay-util:include>
				</div>
				<div id="elcbuploaderrordiv" class="bg-warning text-danger p-3" style="display:<%=!requestEntity.getElcbInstalled()?"block":"none"%>;">
					Earth Leakage Circuit Breaker(ELCB) installation is mandatory for connections with load >= 2 KW.
				</div>
			</div>
<%
	}
%>			
		</div>	
			
		<%-- WIRING TEST CERTIFICATE --%>
		
		<div class="form-group row d-flex align-items-center">
			<div class="col-sm-6">
				<label for="wiringTest" class="col-form-label">
					<liferay-ui:message key="checklist-wiring-test" />
				</label>
				<p id="wiringblink" class="blink font-weight-bold col-form-label">
					<liferay-ui:message key="checklist-wiring-test-blink" />
				</p>
			</div>
			
			<div class="col-sm-2">			
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="wiringTest" label="Yes" value="1" checked="<%=requestEntity.getWiringTest()%>" />
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="wiringTest" label="No" value="0" checked="<%=!requestEntity.getWiringTest()%>"/>
				</div>
			</div>
<%
	if(onlineMode){
%>			
			<div class="col-md-4">
				<div id="wiringuploaddiv" style="display:<%=requestEntity.getWiringTest()?"block":"none"%>; width:100%;">
					<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
						<liferay-util:param name="elementName" value="wiringCertificate" />
						<liferay-util:param name="documentType" value="Wiring_Certificate" />
						<liferay-util:param name="documentName" value="Wiring Certificate" />
						<liferay-util:param name="fileTypes" value="application/pdf" />
						<liferay-util:param name="tooltip" value="Upload photo of Installation Test Report"/>
					</liferay-util:include>
				</div>
				<div id="wiringuploaderrordiv" class="bg-warning text-danger p-3" style="display:<%=!requestEntity.getWiringTest()?"block":"none"%>;">
					For all permanent connection request, structure and wiring at applied premises should be completed and duly tested by Licensed Electrical Contractor.
				</div>
			</div>
<%
	}
%>			
		</div>
		
		<%-- STILT PARKING --%>
		<div class="form-group row align-items-center" style="margin-bottom: 0 !important;" id="stiltparkingdiv">
			<label for="stiltParking" class="col-sm-6 col-form-label">
				<liferay-ui:message key="checklist-stilt-parking" />
			</label>
			<div class="col-sm-6">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="stiltParking" value="1" label="Yes" checked="<%=requestEntity.getStiltParking() %>"/>
					
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="stiltParking" value="0" label="No" checked="<%=!requestEntity.getStiltParking() %>" /> 
				</div>
			</div>
		</div>
		<%-- BUILDING HEIGHT 9 MTR --%>
		<div class="form-group row align-items-center" style="margin-bottom: 0 !important;" id="building9div">
			<label for="height9Mtr" class="col-sm-6 col-form-label">
				<liferay-ui:message key="checklist-stilt-parking-building-9" />
			</label>
			
			<div class="col-sm-6">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="height9Mtr" value="1" label="Yes" />
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="height9Mtr" value="0" label="No" />
				</div>

			</div>
		</div>
		<%-- BUILDING HEIGHT 12 MTR --%>
		<div class="form-group row align-items-center" style="margin-bottom: 0 !important;" id="building12div">
			<label for="height12Mtr" class="col-sm-6 col-form-label" id="building12domesticlabel">
				<liferay-ui:message key="checklist-stilt-parking-building-12" />
			</label>
			
			<div class="col-sm-6">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="height12Mtr" value="1" label="Yes" />
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="height12Mtr" value="0" label="No" />
				</div>

			</div>
		</div>

		<%-- BUILDING HEIGHT 15 MTR --%>
		<div class="form-group row align-items-center" style="margin-bottom: 0 !important;" id="building15div">
			<label for="height15Mtr" class="col-sm-6 col-form-label" id="building15domesticlabel">
				<liferay-ui:message key="checklist-stilt-parking-building-15-domestic" />
			</label>
			<label for="height15Mtr" class="col-sm-6 col-form-label pl-3" id="building15nondomesticlabel">
				<liferay-ui:message key="checklist-stilt-parking-building-15-non-domestic" />
			</label>
			<div class="col-sm-6">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="height15Mtr" value="1" label="Yes" />
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="height15Mtr" value="0" label="No" />
				</div>

			</div>
		</div>

		<%-- BUILDING HEIGHT 17 MTR --%>
		<div class="form-group row align-items-center" style="margin-bottom: 0 !important;" id="building17div">
			<label for="height17Mtr" class="col-sm-6 col-form-label pl-3" id="stilt-parking-building-17">
				<liferay-ui:message key="checklist-stilt-parking-building-17" />
			</label>
			<div class="col-sm-6">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="height17Mtr" value="1" label="Yes" />
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="height17Mtr" value="0" label="No" />
				</div>

			</div>
		</div>

		<%-- FCC DOCUMENT --%>
		<div class="form-group row align-items-center" id="fccdiv" style="display:<%=showFcc?"block":"none"%>">
			<div class="col-sm-6">
				<label for="inputEmail3" class="col-form-label pl-3" style="line-height: 1 !important;">
					<liferay-ui:message key="checklist-stilt-parking-fcc" />
				</label>
				<p id="fccblink" class="blink pl-5">
					<liferay-ui:message key="checklist-stilt-parking-fcc-blink" />
				</p>
			</div>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" id="fcc"  name="fcc" value="1" label="Yes" checked="<%=requestEntity.getFcc() %>" /> 
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" id="fcc" name="fcc" value="0" label="No" checked="<%=!requestEntity.getFcc() %>" />
				</div>
				<p></p>
			</div>
<%
	if(onlineMode){
%>			<div class="col-md-4">
				<div id="fccuploaddiv">
					<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
						<liferay-util:param name="elementName" value="fccCertificate" />
						<liferay-util:param name="documentType" value="FCC_Certificate" />
						<liferay-util:param name="documentName" value="FCC Certificate" />
						<liferay-util:param name="fileTypes" value="application/pdf" />		
						<liferay-util:param name="tooltip" value="Upload valid Fire Clearance Certificate"/>
					</liferay-util:include>
				</div>
				
				<div id="fccuploaderrordiv" class="bg-warning text-danger p-3" style="display:<%=!requestEntity.getFcc()?"block":"none"%>;">
						Valid Fire Clearance Certificate is mandatory to process the request.
				</div>
			</div>
<%
	}
%>			
		</div>
		
		
		<%-- IS LIFT INSTALLED --%>
		<div class="form-group row d-flex align-items-center" style="margin-bottom: 0 !important;">
			<div class="col-sm-6">
				<label for="liftInstalled" class="col-form-label">
					<liferay-ui:message key="checklist-lift-is-installed" />
				</label>
			</div>
			<div class="col-sm-6">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="liftInstalled" value="1" label="Yes" checked="<%=requestEntity.getLift() %>" />
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="liftInstalled" value="0" label="No" checked="<%=!requestEntity.getLift() %>" />
				</div>

			</div>

		
		<%-- LIFT DOCUMENT --%>
		<div class="form-group row align-items-center " id="liftDocumentDiv" style="display:<%=requestEntity.getLift()?"block":"none"%>;">
			<div class="col-sm-6">
				<label for="inputEmail3" class="col-form-label">
					<liferay-ui:message key="checklist-lift-document" />
				</label>
				<p id="liftblink" class="blink">
					<liferay-ui:message key="checklist-lift-blink" />
				</p>
			</div>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" id="hasLiftCertificate" name="hasLiftCertificate" value="1" label="Yes" checked="<%=requestEntity.getHasLiftCertificate() %>" />
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" id="hasLiftCertificate" name="hasLiftCertificate" value="0" label="No" checked="<%=!requestEntity.getHasLiftCertificate() %>"/>
				</div>
			</div>
<%
	if(onlineMode){
%>				<div class="col-md-4">
				<div  id="liftuploaddiv" style="display:<%=requestEntity.getHasLiftCertificate()?"block":"none"%>;">
					<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>" >
						<liferay-util:param name="elementName" value="liftCertificate" />
						<liferay-util:param name="documentType" value="Lift_Certificate" />
						<liferay-util:param name="documentName" value="Lift Certificate" />
						<liferay-util:param name="fileTypes" value="application/pdf" />	
						<liferay-util:param name="tooltip" value="Upload valid Lift Fitness Certificate" />					
					</liferay-util:include>
					<%--<label class="font-weight-bold">Upload lift fitness certificate </label>
					 <aui:input type="file" style="border:0px; padding:0;" name="liftCertificate" label="checklist-lift-certificate" />
					 --%>
				</div>
				<div id="liftuploaderrordiv" class="bg-warning text-danger p-3" style="display:<%=!requestEntity.getHasLiftCertificate()?"block":"none"%>;">
						Valid Lift license is mandatory to process the request
				</div>
			</div>
<%
	}
%>			
		</div>
		
		
	</div>
	
	<%-- industrialLicense CERTIFICATE --%>
	<%
	boolean indFlag =(StringUtils.equalsIgnoreCase(requestEntity.getTariffCategory(),"0320") 
			|| StringUtils.equalsIgnoreCase(requestEntity.getTariffCategory(),"0290" )
			|| StringUtils.equalsIgnoreCase(requestEntity.getBuildingType(),"Hotel/Guest House") ); 
	indFlag =StringUtils.equalsIgnoreCase(requestEntity.getTariffCategory(),"0320") ;
	%>
		<div class="form-group row align-items-center" id="industrialLicenseDiv" style="display:<%=indFlag?"block":"none"%>;">
			<div class="col-sm-6">
				<label for="elcbInstalled" class="col-form-label">
					<liferay-ui:message key="checklist-industrial-license" />
				</label>
			</div>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio"  name="industrialLicense" value="1" label="Yes" checked="<%=requestEntity.getIndustrialLicense() %>"  /> <%--<label class="form-check-label font-weight-bold"> Yes
					</label>--%>
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio"  name="industrialLicense" value="0" label="No" checked="<%=!requestEntity.getIndustrialLicense() %>"/> <%--<label class="form-check-label font-weight-bold"> No </label>--%>
				</div>
			</div>
<%
	if(onlineMode){
%>				
			<div class="col-md-4">
				<div id="industrialLicenseUploadDiv" style="display:<%=requestEntity.getIndustrialLicense()?"block":"none"%>; width:100%;">
					<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
						<liferay-util:param name="elementName" value="industrialLicenseCertificate" />
						<liferay-util:param name="documentType" value="Industrial_License_Certificate" />
						<liferay-util:param name="documentName" value="Industrial License Certificate" />
						<liferay-util:param name="fileTypes" value="application/pdf" />
						<liferay-util:param name="tooltip" value="Upload valid Industrial License Certificate" />		
					</liferay-util:include>
				</div>
				<div id="industrialLicenseuploaderrordiv" class="bg-warning text-danger p-3" style="display:<%=!requestEntity.getIndustrialLicense()?"block":"none"%>;">
						Valid Industrial License is mandatory to get Industrial connection.
				</div>
			</div>
<%
	}
%>			
		</div>		
	<%-- DPCC Clearance required --%>
		<div class="form-group row align-items-center" id="dpccClearanceRequiredDiv"  style="display:<%=StringUtils.equalsIgnoreCase(requestEntity.getTariffCategory(), "0290")?"block":"none"%>;">
			<div class="col-sm-6">
				<label for="inputEmail3" class="col-form-label"> 
					<liferay-ui:message key="checklist-dpcc-clearance-required" /> 
				</label>
			</div>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="dpccClearanceRequired" value="1" label="Yes" checked="<%=requestEntity.isDpccClearanceRequired()%>"/>
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="dpccClearanceRequired" value="0" label="No"  checked="<%=!requestEntity.isDpccClearanceRequired()%>"/>
				</div>
			</div>
		</div>

<%-- DPCC LICENSE --%>
	<%boolean dpccFlag = (StringUtils.equalsIgnoreCase(requestEntity.getTariffCategory(),"0320") 
			|| (StringUtils.equalsIgnoreCase(requestEntity.getTariffCategory(),"0290") && requestEntity.isDpccClearanceRequired())
			|| (!StringUtils.equalsIgnoreCase(requestEntity.getTariffCategory(),"0290") && StringUtils.equalsIgnoreCase(requestEntity.getBuildingType(),"Hotel/Guest House") ));
		%>
		<div class="form-group row align-items-center" id="dpccCertificateDiv"   style="display:<%=!dpccFlag?"none":"block"%>;">
			<div class="col-sm-6">
				<label for="inputEmail3" class="col-form-label"> 
					<liferay-ui:message key="checklist-dpcc-license" /> 
				</label>
			</div>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="hasDpccCertificate" value="1" label="Yes" checked="<%=requestEntity.getHasDpccCertificate()%>"/>
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="hasDpccCertificate" value="0" label="No"  checked="<%=!requestEntity.getHasDpccCertificate()%>"/>
				</div>
			</div>
<%
	if(onlineMode){
%>			
		<div class="col-md-4">
			<div  id="dpccCertificateUploadDiv" style="width:100%;display:<%=requestEntity.getHasDpccCertificate()?"block":"none"%>;">
				<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="dpccLicense" />
					<liferay-util:param name="documentType" value="DPCC_License" />
					<liferay-util:param name="documentName" value="DPCC License" />
					<liferay-util:param name="required" value="true" />
					<liferay-util:param name="requiredFunction" value="isDpccCertificateUploadRequired" />
					<liferay-util:param name="fileTypes" value="application/pdf" />	
					<liferay-util:param name="tooltip" value="Upload valid DPCC Certificate" />				
				</liferay-util:include>			
			</div>
				
			<div id="dpccuploaderrordiv" class="bg-warning text-danger p-3" style="display:<%=!requestEntity.getHasDpccCertificate()?"block":"none"%>;">
					Valid DPCC Certificate is mandatory.
			</div>
		</div>
<%
	}
%>			
	</div>
	
	<!-- ------------------ --------->
	<%--Non-Confirming Area- --%>
	<div>
		<div class="form-group row align-items-center" id="nonConfirmingAreaDiv"  style="display:<%=StringUtils.equalsIgnoreCase(requestEntity.getTariffCategory(), "0290")?"block":"none"%>;">
			<div class="col-sm-6">
				<label for="inputEmail3" class="col-form-label"> 
					<liferay-ui:message key="checklist-non-confirming-area" /> 
				</label>
			</div>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="nonConfirmingArea" value="1" label="Yes" checked="<%=requestEntity.isNonConfirmingArea()%>"/>
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="nonConfirmingArea" value="0" label="No"  checked="<%=!requestEntity.isNonConfirmingArea()%>"/>
				</div>
			</div>
		</div>

<%-- Trade License--%>
		<div class="form-group row align-items-center" id="tradeLicenseDiv"   style="display:<%=StringUtils.equalsIgnoreCase(requestEntity.getTariffCategory(), "0290") && requestEntity.isNonConfirmingArea()?"block":"none"%>;">
			<div class="col-sm-6">
				<label for="inputEmail3" class="col-form-label"> 
					<liferay-ui:message key="checklist-trade-license" /> 
				</label>
			</div>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="hasTradeLicense" value="1" label="Yes" checked="<%=requestEntity.getHasTradeLicense()%>"/>
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="hasTradeLicense" value="0" label="No"  checked="<%=!requestEntity.getHasTradeLicense()%>"/>
				</div>
			</div>
<%
	if(onlineMode){
%>			
		<div class="col-md-4">
			<div  id="tradeLicenseUploadDiv" style="width:100%;display:<%=requestEntity.getHasTradeLicense()?"block":"none"%>;">
				<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="tradeLicense" />
					<liferay-util:param name="documentType" value="Trade_License" />
					<liferay-util:param name="documentName" value="Trade License" />
					<liferay-util:param name="fileTypes" value="application/pdf" />	
					<liferay-util:param name="tooltip" value="Upload valid Trade License Certificate" />				
				</liferay-util:include>			
			</div>
				
			<div id="tradelicenseuploaderrordiv" class="bg-warning text-danger p-3" style="display:<%=!requestEntity.getHasTradeLicense()?"block":"none"%>;">
					Valid Trade License is mandatory in Non-Confirming area.
			</div>
		</div>
<%
	}
%>			
	  </div>
	  
	</div>
		
	<!-- ----------------------- -->
		<%-- BDO CERTIFICATE --%>
		<div class="form-group row align-items-center" id="bdocertdiv">
			<div class="col-sm-6">
				<label for="inputEmail3" class="col-form-label">
					<liferay-ui:message key="checklist-agri-consumer-bdo" /> 
				</label>
				<p id="bdocertblink" class="blink pl-3">
					<liferay-ui:message key="checklist-agri-consumer-bdo-blink" /> 
				</p>
			</div>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio"  name="hasBdoCertificate" value="1" label="Yes" checked="<%=requestEntity.getHasBdoCertificate() %>"/>
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio"  name="hasBdoCertificate" value="0" label="No" checked="<%=!requestEntity.getHasBdoCertificate() %>"/> 
				</div>

			</div>
<%
	if(onlineMode){
%>			
			<div class="col-md-4">
				<div id="bdocertuploaddiv">
					<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
						<liferay-util:param name="elementName" value="bdoCertificate" />
						<liferay-util:param name="documentType" value="BDO_Certificate" />
						<liferay-util:param name="documentName" value="BDO Certificate" />
						<liferay-util:param name="required" value="true" />
						<liferay-util:param name="requiredFunction" value="isBdoCertUploadRequired" />
						<liferay-util:param name="fileTypes" value="application/pdf" />		
						<liferay-util:param name="tooltip" value="Upload valid BDO Certificate" />				
					</liferay-util:include>
					<%--<label class="font-weight-bold">Upload Certificate from BDO <span class="text-danger" id="agconsumeruploadmandatory">*</span>
					</label> 
					<aui:input type="file" style="border:0px; padding:0;" name="bdoCertificate" label="checklist-agri-consumer-bdo-certificate" />
					--%>
				</div>
				
				<div id="bdouploaderrordiv" class="bg-warning text-danger p-3" style="display:<%=!requestEntity.getHasBdoCertificate()?"block":"none"%>;">
						BDO certificate is mandatory to get agriculture connection.
				</div>
			</div>
<%
	}
%>			
		</div>
		

		<%-- POLUTION CERTIFICATE --%>		
		<div class="form-group row align-items-center d-none" id="polutiondiv">
			<div class="col-sm-6">
				<label for="inputEmail3" class="col-sm-6 col-form-label">
					<liferay-ui:message key="checklist-polution-free" /> 
				</label>
				<p id="bdocertblink" class="blink pl-3">
					<liferay-ui:message key="checklist-polution-free-blink" /> 
				</p>
			</div>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="hasPollutionCertificate" value="1" label="Yes" checked="<%=requestEntity.getHasPollutionCertificate()%>" /> 
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" name="hasPollutionCertificate" value="0" label="No" checked="<%=!requestEntity.getHasPollutionCertificate()%>" /> 
				</div>
			</div>
<%
	if(onlineMode){
%>				
			<div class="col-md-4" >
			<div  id="polutionuploaddiv">
				<liferay-util:include page="/document-upload-element.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="pollutionCertificate" />
					<liferay-util:param name="documentType" value="Pollution_Certificate" />
					<liferay-util:param name="documentName" value="Pollution Certificate" />
					<liferay-util:param name="fileTypes" value="application/pdf" />					
				</liferay-util:include>
				
				<%--<label class="font-weight-bold">Upload Certificate from BDO <span class="text-danger">*</span>
				</label>
				 <aui:input type="file" style="border:0px; padding:0;" name="polutionCertificate"  label="checklist-polution-free-certificate" />
				--%>
			</div>
			
				<div id="polutionuploaderrordiv" class="bg-warning text-danger p-3" style="display:<%=!requestEntity.getHasPollutionCertificate()?"block":"none"%>;">
						Polution certificate is mandatory to process the request
				</div>
			</div>
<%
	}
%>			
		</div>
		
		<%-- EMAIL E-SERVICE --%>			
		<div class="form-group row d-flex align-items-center">
			<label for="inputEmail3" class="col-sm-6 col-form-label"> 
				<liferay-ui:message key="checklist-eservice" /> 
			</label>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" value="1" name="eServiceOnMail" label="Yes" checked="<%=true%>" />
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" value="0" name="eServiceOnMail" label="No" checked="<%=false%>"/>
				</div>
			</div>
			<div class="col-sm-4" id="emailservicediv">
				<aui:input type="email"
					class="form-control" placeholder="Enter your email Id" style="font-size: small !important; line-height: 1 !important;" name="eServiceMailId" label="checklist-eservice-email" value="<%=email%>">
						<aui:validator name="required">
		                function() {
		                	var isLoadReduction = false;
							try{
								if($("input[name=<portlet:namespace />changeRequestType]:checked").val()=="U04"){
									isLoadReduction=true;
								}
							}catch(err){}
		                	if(!isLoadReduction){
			                	return AUI.$('input[name=<portlet:namespace />eServiceOnMail]:checked').val()=="1";
		                	}else{
		                		return false;
		                	}
		                }
		        		</aui:validator>
		        		<aui:validator name="email" />
					</aui:input>
			</div>
		</div>
		
		<%-- SUBSIDY BENEFITS --%>			
		<div class="form-group row align-items-center" style="display:none">
			<label class="col-sm-6 col-form-label"> 
				<liferay-ui:message key="checklist-opt-subsidy" /> 
			</label>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" value="1" name="optSubsidy" label="Yes" checked="<%=requestEntity.getOptSubsidy()%>"/>
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" value="0" name="optSubsidy" label="No" checked="<%=!requestEntity.getOptSubsidy()%>"/>
				</div>
			</div>
		</div>
		
		<%-- CEA APPROVED METER --%>			
		<div class="form-group row d-flex align-items-center">
			<label class="col-sm-6 col-form-label"> 
				<liferay-ui:message key="checklist-purchase-meter" /> 
			</label>
			<div class="col-sm-2">
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" value="1" name="purchaseMeter" label="Yes" checked="<%=requestEntity.getPurchaseMeter()%>" />
				</div>
				<div class="form-check-inline">
					<aui:input class="form-check-input" type="radio" value="0" name="purchaseMeter" label="No" checked="<%=!requestEntity.getPurchaseMeter()%>"/>
				</div>
			</div>
		</div>
		
	</div>
</aui:form>

<div class="checklist-modal" id="checklist-alert-modal">
	<div class="modal-dialog modal-dialog-centered">
		<div class="modal-content">
			<div class="modal-header bg-danger">
				<h5 class="modal-title font-weight-bold text-white">Change Action?</h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body align-items-center justify-content-center" style="padding-top:25px; padding-bottom:25px;">
				<div class="help-text text-danger text-center fs-18" id="checklist-alert-message">
					<!-- i class="far fa-paper-plane fa-fw text-danger"></i--> 
					You have already uploaded <span id="checklist-alert-document-type-name"></span>. Plese delete the document before changing the option.
				</div>
			</div>
			<div class="modal-footer align-items-center justify-content-center">
				<div class="text-danger text-center">
					<button type="button" class="btn btn-danger btn-sm" id="checklist-alert-ok-btn" value="Ok" data-id="">OK</button>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
	function getDocChkList() {
		var checklist=[];
		checklist[0]={checkOption:"wiringTest", docElement:"wiringCertificate"};
		checklist[1]={checkOption:"elcbInstalled", docElement:"elcbDocument"};
		checklist[2]={checkOption:"industrialLicense", docElement:"industrialLicenseCertificate"};
		checklist[3]={checkOption:"fcc", docElement:"fccCertificate"};
		checklist[4]={checkOption:"hasLiftCertificate", docElement:"liftCertificate"};
		checklist[5]={checkOption:"hasDpccCertificate", docElement:"dpccLicense"};
		checklist[6]={checkOption:"hasTradeLicense", docElement:"tradeLicense"};
		checklist[7]={checkOption:"hasPollutionCertificate", docElement:"pollutionCertificate"};
		checklist[8]={checkOption:"hasBdoCertificate", docElement:"bdoCertificate"};
		return checklist;
	
	}
</script>

<aui:script use="aui-base,aui-modal,aui-overlay-manager"> 

var requestMode='<%=requestMode%>';
var height9 =<%=requestEntity.getHeight9Mtr() %>;
var height12 =<%=requestEntity.getHeight12Mtr() %>;
var height15=<%=requestEntity.getHeight15Mtr() %>;
var height17=<%=requestEntity.getHeight17Mtr() %>;
var stiltParking = <%=requestEntity.getStiltParking() %>;
var heightSet =false;

Liferay.provide(window,'getValue', function (eleId) {
	var value;
	try{
		value=$("#"+eleId).val();
	}catch(err){
		try{
			value=$("#"+eleId).text();
		}catch(e){	}
	}
	return value;
});

Liferay.provide(window,'clearChkListDocs', function () {
		let clist = getDocChkList();
		$(clist).each(function(i, e){
			var checkOption = $("input[name=<portlet:namespace/>"+e["checkOption"]+"]:checked").val();
			if(checkOption==0){
				try{
					var fn = "<portlet:namespace/>"+e["docElement"]+"_deleteDoc";
					window[fn]();
				}catch(err){}
			}
		});
});

Liferay.provide(window,'validateChecklist', function () {
	if(requestMode=="<%=BsesConnectionPortletKeys.REQUEST_MODE_APPOINTMENT%>"){
		return true;
	}
	
	var errorCount=0;
	var errorElement=[];
	var checklist = getDocChkList();
	//eServiceOnMail//
	//eServiceMailId
	$(checklist).each(function(i, e){
		var checkOption = $("input[name=<portlet:namespace/>"+e["checkOption"]+"]:checked").val();
		if(checkOption=='1'){
			var docId=getValue("<portlet:namespace/>"+e["docElement"]+"_connectionDocumentId");
			if(docId!=null && docId=='0'){
				errorElement[errorCount++]=e["docElement"];
				console.log(e["docElement"]+" failed..");
			}
		}
	});
	if(errorCount>0){
		$(errorElement).each(function(i, e){
			$("#<portlet:namespace/>"+e+"_errorMessage").html('Please upload a valid document.');
		});
	}

	return (errorCount<=0);
});

Liferay.provide(window,'checkDocumentUploaded', function (checkListValue, documentId, checkInputName, documentName) {
	
	if(documentId>0)
	{
		var message="You have already uploaded the "+documentName+". Plese delete the document before changing the option."
		$("#checklist-alert-message").html(message);
		$("#checklist-alert-modal").modal("show");
		var otherCheckValue=(checkListValue==1?0:1)
		$("input[name=<portlet:namespace/>"+checkInputName+"][value="+otherCheckValue+"]").prop('checked',true);
			
	}
});

$("#checklist-alert-ok-btn").click(function(){
	$("#checklist-alert-modal").modal("hide").data('bs.modal', null );
});

Liferay.provide(window,'elcbOnChange', function () {
	$("input[name=<portlet:namespace/>elcbInstalled]").change(function() {
		var elcb = $(this).val();

		var documentId = getValue("<portlet:namespace />elcbDocument_connectionDocumentId");
		if(documentId!=null && documentId!='' && documentId!='0'){
			if(elcb==0){
				checkDocumentUploaded(elcb, documentId,"elcbInstalled", "ELCB certificate");
			}else{
				showElcbUploadError(false);
				showHideElcbUpload(true);
			}
		}else{
			var loadKw=$("#<portlet:namespace />loadKw").val();
			if(elcb=='0'){
				showElcbUploadError(loadKw>=2);
				showHideElcbUpload(false);
			}else{
				showElcbUploadError(false);
				showHideElcbUpload(true);
			}
		}
	});
});

Liferay.provide(window,'showHideElcbUpload', function () {

	var elcb = $("input[name=<portlet:namespace/>elcbInstalled]:checked").val();
	if (elcb == "1") {
		showElcbUpload(true);
		$("#elcbblink").show();
	} else {
		showElcbUpload(false);
		$("#elcbblink").hide();
		var kw = $("#<portlet:namespace/>loadKw").val();
		if (kw != "" && kw != "0" && kw >= 2) {
			showElcbUploadError(true);
		}else{
			showElcbUploadError(false);
		}
	}
});

Liferay.provide(window,'stiltParkingOnChange', function () {	

	$("input[name=<portlet:namespace/>stiltParking]").change(function() {
		var documentId = getValue("<portlet:namespace />fccCertificate_connectionDocumentId");
		if(documentId!=null && documentId!='' && documentId!='0'){
			//checkDocumentUploaded is defined in checklist.jsp
			checkDocumentUploaded($(this).val(), documentId, "stiltParking", "fire clearance certificate(FCC)");
		}else{
			showHideBuilding15_17();
		}
		//$("#building15nondomesticlabel").show();
	});
});

Liferay.provide(window,'showHideBuilding15_17', function () {	
	var stiltParking = $("input[name=<portlet:namespace/>stiltParking]:checked").val();
	if (stiltParking == "1") {
		showBuilding15(false);
		showBuilding17(true);
		showFcc(false);
	} else {
		showBuilding15(true);
		showBuilding17(false);
		showFcc(false);
	}
});

Liferay.provide(window,'building15OnChange', function () {
	$("input[name=<portlet:namespace/>height15Mtr]").change(function() {
		var documentId = getValue("<portlet:namespace />fccCertificate_connectionDocumentId");
		if(documentId!=null && documentId!='' && documentId!='0'){
			//checkDocumentUploaded is defined in checklist.jsp
			checkDocumentUploaded($(this).val(), documentId, "height15Mtr", "fire clearance certificate(FCC)");
		}else{
			showHideFcc15();
		}
	});
});

Liferay.provide(window,'building9OnChange', function () {
	$("input[name=<portlet:namespace/>height9Mtr]").change(function() {
		var documentId = getValue("<portlet:namespace />fccCertificate_connectionDocumentId");
		if(documentId!=null && documentId!='' && documentId!='0'){
			//checkDocumentUploaded is defined in checklist.jsp
			checkDocumentUploaded($(this).val(), documentId, "height9Mtr", "fire clearance certificate(FCC)");
		}else{
			showHideFcc9();
		}
	});
});

Liferay.provide(window,'building12OnChange', function () {
	$("input[name=<portlet:namespace/>height12Mtr]").change(function() {
		var documentId = getValue("<portlet:namespace />fccCertificate_connectionDocumentId");
		if(documentId!=null && documentId!='' && documentId!='0'){
			//checkDocumentUploaded is defined in checklist.jsp
			checkDocumentUploaded($(this).val(), documentId, "height12Mtr", "fire clearance certificate(FCC)");
		}else{
			showHideFcc12();
		}
	});
});

Liferay.provide(window,'showHideFcc9', function () {

		var heightVal = $("input[name=<portlet:namespace/>height9Mtr]:checked").val();
		if (heightVal == "0") {
			showFcc(true);
		} else {
			showFcc(false);
		}
});

Liferay.provide(window,'showHideFcc12', function () {

		var heightVal = $("input[name=<portlet:namespace/>height12Mtr]:checked").val();
		if (heightVal == "0") {
			showFcc(true);
		} else {
			showFcc(false);
		}
});

Liferay.provide(window,'showHideFcc15', function () {

	var stiltParking = $("input[name=<portlet:namespace/>stiltParking]:checked").val();
	if(stiltParking=='0'){
		var height15 = $("input[name=<portlet:namespace/>height15Mtr]:checked").val();
		if (height15 == "0") {
			showFcc(true);
		} else {
			showFcc(false);
		}
	}
});

Liferay.provide(window,'building17OnChange', function () {	

	$("input[name=<portlet:namespace/>height17Mtr]").change(function() {
		var documentId = getValue("<portlet:namespace />fccCertificate_connectionDocumentId");
		if(documentId!=null && documentId!='' && documentId!='0'){
			//checkDocumentUploaded is defined in checklist.jsp
			checkDocumentUploaded($(this).val(), documentId, "height17Mtr", "fire clearance certificate(FCC)");
		}else{
			showHideFcc17();
		}
	});
});
	
Liferay.provide(window,'showHideFcc17', function () {	

	var stiltParking = $("input[name=<portlet:namespace/>stiltParking]:checked").val();
	if(stiltParking=='1'){
		var height17 = $("input[name=<portlet:namespace/>height17Mtr]:checked").val();
		if (height17 == "0") {
			showFcc(true);
		} else {
			showFcc(false);
		}
	}
});
	
Liferay.provide(window,'fccOnChange', function () {	

	$("input[name=<portlet:namespace/>fcc]").change(function() {
		var fcc = $(this).val();
		var documentId = getValue("<portlet:namespace />fccCertificate_connectionDocumentId");
		if(documentId != null && documentId!='' && documentId!='0'){	
			checkDocumentUploaded(fcc, documentId,"fcc", "FCC certificate");
		}else{
			showHideFccUpload();
		}
	});
});

Liferay.provide(window,'showHideFccUpload', function () {

	var fcc = $("input[name=<portlet:namespace/>fcc]:checked").val();
	if (fcc == "1") {
		showFccUpload(true);
		showHideElement("#fccblink",true);
	} else {
		showFccUpload(false);
		showHideElement("#fccblink",false);
	}
});


Liferay.provide(window,'liftInstalledOnChange', function () {
	$("input[name=<portlet:namespace/>liftInstalled]").change(function() {
		var lift = $("input[name=<portlet:namespace/>liftInstalled]:checked").val();
		if(lift!="0"){
			showHideLiftDocument(true);
		}else{
			showHideLiftDocument(false);
		}
	
	});
});

Liferay.provide(window,'showHideLiftDocument', function (showHide) {
	if (showHide) {
		showHideElement("#liftDocumentDiv",true);
		var hasLiftCertificate  = $("input[name=<portlet:namespace/>hasLiftCertificate]:checked").val(); 
		if(hasLiftCertificate==1){
			showHideElement("#liftuploaderrordiv", false);
		}else{
			showHideElement("#liftuploaderrordiv", true);
		}
		showHideLiftUpload();
	} else {
		showHideElement("#liftDocumentDiv",false);
		showHideLiftUpload();
	}
	
});

Liferay.provide(window,'liftCertOnChange', function () {

	$("input[name=<portlet:namespace/>hasLiftCertificate]").change(function() {
		
		var lift = $("input[name=<portlet:namespace/>hasLiftCertificate]:checked").val(); 
		var documentId = getValue("<portlet:namespace />liftCertificate_connectionDocumentId");
		
		console.log("lift.lift == "+lift+",   lift.documentId == "+documentId);
		
		if(documentId!=null &&  documentId!='' && documentId!='0'){
			checkDocumentUploaded(lift, documentId,"lift", "LIFT certificate");
		}else{
			showHideLiftUpload();
		}
	});
});

Liferay.provide(window,'showHideLiftUpload', function () {

	var lift = $("input[name=<portlet:namespace/>hasLiftCertificate]:checked").val();

	if (lift == "1") {
		showLiftUpload(true);
		$("#liftblink").show();
	} else {
		showLiftUpload(false);
		$("#liftblink").hide();
	}
});

Liferay.provide(window,'wiringOnChange', function () {	

	$("input[name=<portlet:namespace/>wiringTest]").change(function() {
		var wiring = $(this).val();
		var documentId = getValue("<portlet:namespace />wiringCertificate_connectionDocumentId");
		if(documentId!=null && documentId!='' && documentId!='0'){
			checkDocumentUploaded(wiring, documentId, "wiringTest", "Wiring certificate");
		}else{
			showHideWiringUpload();
		}
	});
});

Liferay.provide(window,'showHideWiringUpload', function () {

	var wiring = $("input[name=<portlet:namespace/>wiringTest]:checked").val();
	if (wiring == "1") {
		showWiringUpload(true);
		showWiringUploadError(false);
		$("#wiringblink").show();
	} else {
		showWiringUpload(false);
		showWiringUploadError(true);
		$("#wiringblink").hide();
	}
});
	
Liferay.provide(window,'bdoCertOnChange', function () {	

	$("input[name=<portlet:namespace/>hasBdoCertificate]").change(function() {
		
		var bdo = $(this).val();
		var documentId = getValue("<portlet:namespace />bdoCertificate_connectionDocumentId");
		if(documentId!=null && documentId!='' && documentId!='0'){
			checkDocumentUploaded(bdo,documentId,"hasBdoCertificate", "BDO certificate");
		}else{
			showHideBDOCertUpload();
		}
	});
});

Liferay.provide(window,'showHideBDOCertUpload', function () {
	var bdocert = $("input[name=<portlet:namespace/>hasBdoCertificate]:checked").val();
	if (bdocert == "1") {
		showBDOCertUpload(true);
		$("#bdocertblink").show();
	} else {
		showBDOCertUpload(false);
		$("#bdocertblink").hide();
	}
});
	
Liferay.provide(window,'emailServiceOnChange', function () {

	$("input[name=<portlet:namespace/>eServiceOnMail]").change(function() {
		
		try{
			$("#<portlet:namespace/>eServiceMailId").text("");
		}catch(er){	}
		try{
			$("#<portlet:namespace/>eServiceMailId").val("");
		}catch(er){	}
		
		showHideEmailServiceDiv();
	});
});

Liferay.provide(window,'showHideEmailServiceDiv', function () {

	var emailservice = $("input[name=<portlet:namespace/>eServiceOnMail]:checked").val();
	if (emailservice == "1") {
		showEmailServiceDiv(true);
	} else {
		showEmailServiceDiv(false);
	}
});

Liferay.provide(window,'showElcb', function (showHide) {

	showHideElement("#elcbdiv", showHide);
	if(showHide){
		var elcbInstalled=$("input[name=<portlet:namespace/>elcbInstalled]:checked").val();
		showHideElement("#elcbuploaddiv", (elcbInstalled==1));
	}
	/*if (!showHide) {
		$("input[name=<portlet:namespace/>elcbInstalled][value='0']").prop("checked", true);
		showHideElement("#elcbuploaddiv", showHide);
		clearDocument("elcbDocument");
	}*/
});


Liferay.provide(window,'industrialLicenseOnChange', function () {
	$("input[name=<portlet:namespace/>industrialLicense]").change(function() {
		var industrialLicense = $(this).val();
		showHideIndustrialLicenseUpload();

	/*	var documentId = getValue("<portlet:namespace />industrialLicenseCertificate_connectionDocumentId");
		if(documentId!=null && documentId!='' && documentId!='0'){
			if(industrialLicense==0){
				checkDocumentUploaded(industrialLicense, documentId,"industrialLicense", "Industrial license certificate");
			}else{
				showHideIndustrialLicenseUpload(true);
			}
		}else{
			if(industrialLicense=='0'){
				showHideIndustrialLicenseUpload(false);
			}else{
				showHideIndustrialLicenseUpload(true);
			}
		}
		*/
	});
});

Liferay.provide(window,'showHideIndustrialLicenseUpload', function () {

	var industrialLicense = $("input[name=<portlet:namespace/>industrialLicense]:checked").val();
	if (industrialLicense == "1") {
		//	showIndustrialLicenseUpload(true);
		showHideElement("#industrialLicenseUploadDiv", true);
		showHideElement("#industrialLicenseuploaderrordiv", false);
	} else {
		//	showIndustrialLicenseUpload(false);
		showHideElement("#industrialLicenseUploadDiv", false);
		showHideElement("#industrialLicenseuploaderrordiv", true);
	}
});


Liferay.provide(window,'showIndustrialLicense', function (showHide) {

	showHideElement("#industrialLicenseDiv", showHide);
	if(showHide){
		var isIndustrialLicense=$("input[name=<portlet:namespace/>industrialLicense]:checked").val();
		showHideElement("#industrialLicenseUploadDiv", (isIndustrialLicense==1));
	}
});


Liferay.provide(window,'showIndustrialLicenseUpload', function (showHide) {
	
	if (showHide) {
		$("#industrialLicenseUploadDiv").show();
	} else {
		$("#industrialLicenseUploadDiv").hide();
	}
});

Liferay.provide(window,'showHideDpccClearanceRequired', function () {	
	var tariffCategory = $("#<portlet:namespace/>tariffCategory").val();
	if(tariffCategory == "0290"){
		showHideElement("#dpccClearanceRequiredDiv",true);
		handleDpccClearanceRequiredView();
	}else{
		showHideElement("#dpccClearanceRequiredDiv",false);
	}
});

Liferay.provide(window,'dpccClearanceRequiredOnChange', function () {	
	$("input[name=<portlet:namespace/>dpccClearanceRequired]").change(function() {
		var v=  $(this).val();
		handleDpccClearanceRequiredView();
	});
});

Liferay.provide(window,'handleDpccClearanceRequiredView', function () {	
	var tariffCategory = $("#<portlet:namespace/>tariffCategory").val();
	var dpccClearanceRequired = $("input[name=<portlet:namespace/>dpccClearanceRequired]:checked").val();
	var buildingTypes = $("#<portlet:namespace/>buildingType").val();
	if(tariffCategory == "0320" || (tariffCategory == "0290" && dpccClearanceRequired==1) || (tariffCategory != "0290" && buildingTypes == "Hotel/Guest House")){
		showDpccCertificate(true);
	}else{
		showDpccCertificate(false);
	}
});


//dpccCertificateDiv  

Liferay.provide(window,'dpccCertificateOnChange', function () {
	$("input[name=<portlet:namespace/>hasDpccCertificate]").change(function() {
		var hasCert = $(this).val();
		showHideDpccCertificateUpload();
	});
});

Liferay.provide(window,'showHideDpccCertificateUpload', function () {

	var license = $("input[name=<portlet:namespace/>hasDpccCertificate]:checked").val();
	if (license == "1") {
		showHideElement("#dpccCertificateUploadDiv",true);
		showHideElement("#dpccuploaderrordiv",false);
	} else {
		showHideElement("#dpccCertificateUploadDiv",false);
		showHideElement("#dpccuploaderrordiv",true);
	}
});


Liferay.provide(window,'showDpccCertificate', function (showHide) {

	showHideElement("#dpccCertificateDiv", showHide);
	if(showHide){
		var license=$("input[name=<portlet:namespace/>hasDpccCertificate]:checked").val();
		showHideElement("#dpccCertificateUploadDiv", (license==1));
	}
});


Liferay.provide(window,'showDpccCertificateUpload', function (showHide) {
	
	if (showHide) {
		showHideElement("#dpccCertificateUploadDiv",true);
	} else {
		showHideElement("#dpccCertificateUploadDiv",false);
	}
});
//dpcc end

//nonConfirmingAreaDiv
Liferay.provide(window,'showHideNonConfirmingArea', function () {	
	var tariffCategory = $("#<portlet:namespace/>tariffCategory").val();
	if(tariffCategory == "0290"){
		showHideElement("#nonConfirmingAreaDiv",true);
		handleTradeLicenseView();
	}else{
		showHideElement("#nonConfirmingAreaDiv",false);
	}
});

Liferay.provide(window,'nonConfirmingAreaOnChange', function () {	
	$("input[name=<portlet:namespace/>nonConfirmingArea]").change(function() {
		var v=  $(this).val();
		handleTradeLicenseView();
	});
});

Liferay.provide(window,'handleTradeLicenseView', function () {	
	var tariffCategory = $("#<portlet:namespace/>tariffCategory").val();
	var nonConfirmingArea = $("input[name=<portlet:namespace/>nonConfirmingArea]:checked").val();
	if(tariffCategory=="0290" && nonConfirmingArea==1){
		showTradeLicense(true);
	}else{
		showTradeLicense(false);
	}
});

Liferay.provide(window,'showTradeLicense', function (showHide) {

	showHideElement("#tradeLicenseDiv", showHide);
	if(showHide){
		var license=$("input[name=<portlet:namespace/>hasTradeLicense]:checked").val();
		showHideElement("#TradeLicenseUploadDiv", (license==1));
	}
});

Liferay.provide(window,'tradeLicenseOnChange', function () {
	$("input[name=<portlet:namespace/>hasTradeLicense]").change(function() {
		var hasCert = $(this).val();
		showHideTradeLicenseUpload();
	});
});

Liferay.provide(window,'showHideTradeLicenseUpload', function () {

	var license = $("input[name=<portlet:namespace/>hasTradeLicense]:checked").val();
	if (license == "1") {
		showHideElement("#tradeLicenseUploadDiv",true);
		showHideElement("#tradelicenseuploaderrordiv",false);
	} else {
		showHideElement("#tradeLicenseUploadDiv",false);
		showHideElement("#tradelicenseuploaderrordiv",true);
	}
});


//nonConfirmingAreaDiv End

Liferay.provide(window,'showBuilding15', function (showHide) {
	
	if (showHide) {
		$("#building15div").show();
	} else {
		$("input[name=<portlet:namespace/>height15Mtr][value=1]").prop("checked", true);
		$("input[name=<portlet:namespace/>fcc][value=0]").prop("checked", true);
		$("#building15div").hide();
	}
});

Liferay.provide(window,'showBuilding17', function (showHide) {
	if (showHide) {
		$("#building17div").show();
	} else {
		$("input[name=<portlet:namespace/>height17Mtr][value=1]").prop("checked", true);
		$("input[name=<portlet:namespace/>fcc][value=0]").prop("checked", true);
		$("#building17div").hide();
	}
});

Liferay.provide(window,'showFcc', function (showHide) {
	if (showHide) {
		$("#fccdiv").show();
	} else {
		$("#fccdiv").hide();
	}
});

Liferay.provide(window,'showFccUpload', function (showHide) {
	
	if (showHide) {
		showHideElement("#fccuploaddiv",true);
		showHideElement("#fccuploaderrordiv", false);
	} else {
		showHideElement("#fccuploaddiv",false);
		clearDocumentError("fccCertificate");
		showHideElement("#fccuploaderrordiv", true);
	}
});

Liferay.provide(window,'showLift', function (showHide) {
	if (showHide) {
		showHideElement("#liftInstalled",true);
	} else {
		showHideElement("#liftInstalled",false);
	}
});

Liferay.provide(window,'showLiftUpload', function (showHide) {

	if (showHide) {
		showHideElement("#liftuploaddiv",true);
		showHideElement("#liftuploaderrordiv",false);
	} else {
		showHideElement("#liftuploaddiv",false);
		clearDocumentError("liftCertificate");
		showHideElement("#liftuploaderrordiv",true);
	}
});

Liferay.provide(window,'showWiringUpload', function (showHide) {
	if (showHide) {
		showHideElement("#wiringuploaddiv",true);
	} else {
		showHideElement("#wiringuploaddiv",false);
		clearDocumentError("wiringCertificate");
	}
});

Liferay.provide(window,'showBDOCert', function (showHide) {
	if (showHide) {
		showHideElement("#bdocertdiv",true);
	} else {
		showHideElement("#bdocertdiv",false);
	}
});

Liferay.provide(window,'showBDOCertUpload', function (showHide) {
	if (showHide) {
		showHideElement("#bdocertuploaddiv",true);
		showHideElement("#bdouploaderrordiv",false);
	} else {
		showHideElement("#bdocertuploaddiv",false);
		clearDocumentError("bdoCertificate");
		showHideElement("#bdouploaderrordiv",true);
	}
});

Liferay.provide(window,'showEmailServiceDiv', function (showHide) {
	if (showHide) {
		showHideElement("#emailservicediv",true);
	} else {
		showHideElement("#emailservicediv",false);
	}
});

Liferay.provide(window,'showElcbUpload', function (showHide) {
	//$("#elcberror").modal();
	if (showHide) {
		showHideElement("#elcbuploaddiv",true);
	} else {
		showHideElement("#elcbuploaddiv",false);
	}
});

Liferay.provide(window,'showElcbUploadError', function (showHide) {
	//$("#elcberror").modal();
	if (showHide) {
		showElcbUpload(false);
		//$("input[name=<portlet:namespace/>elcbInstalled][value=0]").prop("checked", true);
		showHideElement("#elcbuploaderrordiv",true);
	} else {
		showHideElement("#elcbuploaderrordiv",false);
	}
});
Liferay.provide(window,'showWiringUploadError', function (showHide) {
	//$("#elcberror").modal();
	if (showHide) {
		$("input[name=<portlet:namespace/>wiringTest][value=0]").prop("checked", true);
		showHideElement("#wiringuploaderrordiv",true);
	} else {
		showHideElement("#wiringuploaderrordiv",false);
	}
});


Liferay.provide(window,'showStiltParking', function (showHide) {
	//$("#elcberror").modal();
	$("input[name=<portlet:namespace/>stiltParking][value=0]").prop("checked", true);
	if (showHide) {
		$("#stiltparkingdiv").show();
		$("#building15domesticlabel").hide();
		$("#building15nondomesticlabel").show();
	} else {
		$("#stiltparkingdiv").hide();
		$("#building15domesticlabel").show();
		$("#building15nondomesticlabel").hide();
	}
	$("input[name=<portlet:namespace/>height15Mtr][value=1]").prop("checked", true);
	$("input[name=<portlet:namespace/>height17Mtr][value=1]").prop("checked", true);
	$("input[name=<portlet:namespace/>fcc][value=0]").prop("checked", true);
	$("#fccdiv").hide();
	$("#building17div").hide();
	$("#building15div").show();
});

Liferay.provide(window,'showStiltParkingOptions', function () {
	//$("#elcberror").modal();
	$("input[name=<portlet:namespace/>stiltParking][value=0]").prop("checked", true);
	
	$("#stiltparkingdiv").show();
	$("#building15domesticlabel").hide();
	$("#building15nondomesticlabel").show();
	 
	$("input[name=<portlet:namespace/>height15Mtr][value=1]").prop("checked", true);
	$("input[name=<portlet:namespace/>fcc][value=0]").prop("checked", true);
	$("#fccdiv").hide();
	$("#building15div").show();
});

Liferay.provide(window,'resetBuildingHeightChk', function () {
	$("input[name=<portlet:namespace/>stiltParking][value=0]").prop("checked", true);
	$("input[name=<portlet:namespace/>fcc][value=0]").prop("checked", true);
		
	$("input[name=<portlet:namespace/>height9Mtr][value=1]").prop("checked", true);
	$("input[name=<portlet:namespace/>height12Mtr][value=1]").prop("checked", true);
	$("input[name=<portlet:namespace/>height15Mtr][value=1]").prop("checked", true);
	$("input[name=<portlet:namespace/>height17Mtr][value=1]").prop("checked", true);
	
	$("#building9div").hide();
	$("#building12div").hide();
	$("#building15div").hide();
	$("#building17div").hide();
	$("#stiltparkingdiv").hide();
	$("#fccdiv").hide();
	
	$("#stiltparkingdiv").hide();
	$("#building15domesticlabel").hide();
	$("#building15nondomesticlabel").hide();
	
	var tariffCategory = $("#<portlet:namespace/>tariffCategory").val();
	var buildingType =  $("#<portlet:namespace/>buildingType").val();
	
	//alert("tariffCategory> "+tariffCategory +" |buildingType > "+buildingType);
	if (tariffCategory == "0100" && buildingType == "Residential Building") {
		showStiltParkingOptions(true);
	} else{
		if(buildingType == "Residential Building"){
			$("#building15div").show();
			$("#building15nondomesticlabel").show();
		}else if(buildingType == "Hotel/Guest House"){
			$("#building12div").show();
		}else if(buildingType == "Institutional Building"){
			$("#building9div").show();
		} else if(buildingType == "Business Building"){
			$("#building15div").show();
			$("#building15nondomesticlabel").show();
			$("#building15domesticlabel").hide();
		}else if(buildingType == "Other"){
			$("#building15div").show();
			$("#building15nondomesticlabel").show();
			$("#building15domesticlabel").hide();
		}
	}
});

Liferay.provide(window,'setBuildingHeightChk', function () {

	$("#building9div").hide();
	$("#building12div").hide();
	$("#building15div").hide();
	$("#building17div").hide();
	$("#stiltparkingdiv").hide();
	$("#fccdiv").hide();
	
	$("#stiltparkingdiv").hide();
	$("#building15domesticlabel").hide();
	$("#building15nondomesticlabel").hide();
	
	if(height9){
		$("input[name=<portlet:namespace/>height9Mtr][value=1]").prop("checked", true);
	}else{
		$("input[name=<portlet:namespace/>height9Mtr][value=0]").prop("checked", true);
		$("#fccdiv").show();
	}
	if(height12){
		$("input[name=<portlet:namespace/>height12Mtr][value=1]").prop("checked", true);
	}else{
		$("input[name=<portlet:namespace/>height12Mtr][value=0]").prop("checked", true);
		$("#fccdiv").show();
	}
	if(height15){
		$("input[name=<portlet:namespace/>height15Mtr][value='1']").prop("checked", true);
	}else{
		$("input[name=<portlet:namespace/>height15Mtr][value='0']").prop("checked", true);
		$("#fccdiv").show();
	}
	if(height17){
		$("input[name=<portlet:namespace/>height17Mtr][value='1']").prop("checked", true);
	}else{
		$("input[name=<portlet:namespace/>height17Mtr][value='0']").prop("checked", true);
		$("#fccdiv").show();
	}


	
	var tariffCategory = $("#<portlet:namespace/>tariffCategory").val();
	var buildingType =  $("#<portlet:namespace/>buildingType").val();
	if (tariffCategory == "0100" && buildingType == "Residential Building") {
		$("#stiltparkingdiv").show();
		if(stiltParking){
			$("input[name=<portlet:namespace/>stiltParking][value=1]").prop("checked", true);
			$("#building17div").show();
		}else{
			$("input[name=<portlet:namespace/>stiltParking][value=0]").prop("checked", true);
			$("#building15div").show();
			$("#building15domesticlabel").show();
			$("#building15nondomesticlabel").hide();
		}
	} else{
		if(buildingType == "Residential Building"){
			$("#building15div").show();
			$("#building15nondomesticlabel").show();
			$("#building15domesticlabel").hide();
		}else if(buildingType == "Hotel/Guest House"){
			$("#building12div").show();
		}else if(buildingType == "Institutional Building"){
			$("#building9div").show();
		} else if(buildingType == "Business Building"){
			$("#building15div").show();
			$("#building15nondomesticlabel").show();
			$("#building15domesticlabel").hide();
		}else if(buildingType == "Other"){
			$("#building15div").show();
			$("#building15nondomesticlabel").show();
			$("#building15domesticlabel").hide();
		}
	}
});

</aui:script>
