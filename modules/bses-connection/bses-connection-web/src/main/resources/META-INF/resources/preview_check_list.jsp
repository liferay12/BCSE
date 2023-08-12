<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.bses.connection2.model.LocalityDivision"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="com.bses.connection2.service.LocalityDivisionLocalServiceUtil"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.bses.connection2.service.ConnectionDocumentLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionDocument"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>

<%@ include file="/init.jsp"%>
<%!
DateFormat dateDisplayFormat=new SimpleDateFormat("dd-MM-yyyy");
%>
	<%
		long connectionRequestId = ParamUtil.getLong(request, "connectionRequestId", 0);
	
		ConnectionRequest connectionRequest = ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
		
		String idProofDocumentName = "ID Proof";
	
		boolean isOnline = StringUtils.equals(connectionRequest.getRequestMode(),	RequestTypeModeStatus.MODE_ONLINE);
		boolean isIndividual = !StringUtils.equalsIgnoreCase(connectionRequest.getConsumerType(), MasterData.ConsumerTypes.Firm.name());
		
		boolean isIndustrial=StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0320");
		boolean isDomestic=(StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0100") 
				&&  StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Residential Building"));
		String circle_dot=request.getContextPath()+"/images/circle-dot.png";
		String circle_blank=request.getContextPath()+"/images/circle-blank.png";
	%>
	<portlet:renderURL var="documentViewerURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
		<portlet:param name="mvcPath" value="/document_viewer.jsp" />
	</portlet:renderURL>

			
			<div class="row mt-5">
				<div class="col-md-6">
					<h5 class="font-weight-bold">Documents CheckList</h5>
				</div>
			</div>
			
			<div class="row">
				<div class="col-md-12">
					<div class="container-fluid section-container">
					<%
						if (connectionRequest.getLoadKw() >= 2) {
							boolean elcb=connectionRequest.isElcbInstalled();
					%>
					
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span> ELCB(Earth Leakage Circuit Breaker) installed ? </span></li>
								</label>
							</div>
							<div class="col-sm-2">
								<%--
								<label> <span class="mr-3"><img src="fa-regular <%=(elcb ? "fa-circle-dot" : "fa-circle")%>" class="checklist-option">Yes</span><span class="mr-3"><i
										class="fa-regular <%=(!elcb ? "fa-circle-dot" : "fa-circle")%> mr-2"></i>No</span>
								</label> 
								--%>
								<label> <span class="mr-3"><img src="<%=(elcb?circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
									<span class="mr-3"><img src="<%=(!elcb?circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label> 
							</div>
							<div class="col-md-3">
								<div id="elcbuploaddiv" style="display:<%=connectionRequest.getElcbInstalled()?"block":"none"%>; width:100%;">
									<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
										<liferay-util:param name="elementName" value="elcbDocument" />
										<liferay-util:param name="documentType" value="ELCB_Document" />
										<liferay-util:param name="documentName" value="ELCB Document" />
										<liferay-util:param name="fileTypes" value="application/pdf" />
										<liferay-util:param name="readOnly" value="true" />
									</liferay-util:include>
								</div>
							</div>
						</div>
					<%
						}
					
						boolean wiring=connectionRequest.getWiringTest();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
									<li>
										<span> Internal Wiring at the premises has been tested by a Licensed
										Electrical Contractor/designated officer of the Government and the test Certificate is available with the applicant. </span>
									</li>
								</label>
							</div>
			
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(wiring ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!wiring ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							<div class="col-md-3">
				<div id="wiringuploaddiv" style="display:<%=connectionRequest.getElcbInstalled()?"block":"none"%>; width:100%;">
					<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
						<liferay-util:param name="elementName" value="wiringCertificate" />
						<liferay-util:param name="documentType" value="Wiring_Certificate" />
						<liferay-util:param name="documentName" value="Wiring Certificate" />
						<liferay-util:param name="fileTypes" value="application/pdf" />
					</liferay-util:include>
				</div>
				<div id="wiringuploaderrordiv" class="bg-warning text-danger p-3" style="display:none;">
					For all permanent connection request, structure and wiring at applied premises should be completed and duly tested by Licensed Electrical Contractor.
				</div>
			</div>
						</div>
					<%
					boolean showFCC = false;
				if(isDomestic)  {
							boolean stilt=connectionRequest.isStiltParking();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
									<li><span> Do you have Stilt Parking? </span></li>
								</label>
			
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(stilt ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!stilt ?circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
						</div>
					<%if(stilt){
							boolean lt17mtr=connectionRequest.isHeight17Mtr();
							if(!lt17mtr){showFCC=true;}
		 			%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label ml-5"> 
									<li><span class="mr-2">
										Is your building height under 17.5 meters?</span>
									</li> 
								</label>
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(lt17mtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img  src="<%=(!lt17mtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
			 			</div>
						
					<%	}else{
					boolean lt15mtr=connectionRequest.isHeight15Mtr();
					if(!lt15mtr){showFCC=true;}
					%>	<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label ml-5"> 
			 							<li><span>Is your building height under 15 meters? </span></li>
			 						</label> 
			 					</div>
			 					<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(lt15mtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!lt15mtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
			 			</div>
				<%		
					}
				} else{
					
					if(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(),"Residential Building")){
						//$("#building15div").show();
						boolean ltmtr=connectionRequest.isHeight15Mtr();
						if(!ltmtr){showFCC=true;}
						%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
			 							<li><span>Is your building height under 15 meters? </span></li>
			 						</label> 
			 					</div>
			 					<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
			 			</div>
			 			
				<%	}else if(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Hotel/Guest House")){
					//$("#building12div").show();
					boolean ltmtr=connectionRequest.isHeight12Mtr();
					if(!ltmtr){showFCC=true;}
				%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
			 							<li><span>Is your building height under 12 meters? </span></li>
			 						</label> 
			 					</div>
			 					<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
			 			</div>
			 			
				<%	
				}else if(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Institutional Building")){
					boolean ltmtr=connectionRequest.isHeight9Mtr();
					if(!ltmtr){showFCC=true;}
					%>
							<div class="row mt-2">
								<div class="col-sm-7">
									<label for="" class="col-form-label"> 
				 							<li><span>Is your building height under 9 meters? </span></li>
				 						</label> 
				 					</div>
				 					<div class="col-sm-2">
									<label> <span class="mr-3"><img src="<%=(ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
									<span class="mr-3"><img src="<%=(!ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
									</label>
								</div>
				 			</div>
				 			
					<%	
					} else if(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Business Building")
							|| StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Other")){
					//	$("#building15div").show();
						boolean ltmtr=connectionRequest.isHeight15Mtr();
						if(!ltmtr){showFCC=true;}
						%>
								<div class="row mt-2">
									<div class="col-sm-7">
										<label for="" class="col-form-label"> 
					 							<li><span>Is your building height under 15 meters? </span></li>
					 						</label> 
					 					</div>
					 					<div class="col-sm-2">
										<label> <span class="mr-3"><img src="<%=(ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
										<span class="mr-3"><img src="<%=(!ltmtr ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
										</label>
									</div>
					 			</div>
					 			
						<%	
					}
				}
							
				if(showFCC){
					boolean fcc=connectionRequest.isFcc();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label <%=isDomestic?"ml-5":""%>"> 
									<li class="<%=isDomestic?"ml-5":""%>"><span>Do you have fire
								clearance certificate(FCC) ? </span> </li>
								</label>
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(fcc ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!fcc ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							<div class="col-sm-3" id="fccuploaddiv">
								<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
									<liferay-util:param name="elementName" value="fccCertificate" />
									<liferay-util:param name="documentType" value="FCC_Certificate" />
									<liferay-util:param name="documentName" value="FCC Certificate" />
									<liferay-util:param name="fileTypes" value="application/pdf" />					
								</liferay-util:include>
							</div>
			 			</div>
					<%
						}
							
						boolean lift=connectionRequest.isLift();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span> Do you have lift installed? </span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(lift ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!lift ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
						</div>
						<%if(lift){ %>
						
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span> Lift is installed in premises and the applicant has obtained the lift fitness certificate from the Electrical Inspector
											for the lift in the said premises and the same is available with the applicant. </span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(connectionRequest.getHasLiftCertificate() ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!connectionRequest.getHasLiftCertificate() ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							<div class="col-md-3" id="liftuploaddiv">
				<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
					<liferay-util:param name="elementName" value="liftCertificate" />
					<liferay-util:param name="documentType" value="Lift_Certificate" />
					<liferay-util:param name="documentName" value="Lift Certificate" />
					<liferay-util:param name="fileTypes" value="application/pdf" />					
				</liferay-util:include>
				
			</div>
						</div>
						
						
						<%} %>
					<%
					boolean indFlag =(StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(),"0320") 
							|| StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(),"0290" )
							|| StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(),"Hotel/Guest House") ); 	
					indFlag =StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(),"0320") ;
					if (indFlag) {
							boolean industrialLicenseCert=connectionRequest.getIndustrialLicense();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span>Do you have valid industrial license?</span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
		
								<label> <span class="mr-3"><img src="<%=(industrialLicenseCert ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!industrialLicenseCert ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							<div class="col-md-3">
								<div id="industrialLicenseUploadDiv" style="display:<%=connectionRequest.getIndustrialLicense()?"block":"none"%>; width:100%;">
									<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
										<liferay-util:param name="elementName" value="industrialLicenseCertificate" />
										<liferay-util:param name="documentType" value="Industrial_License_Certificate" />
										<liferay-util:param name="documentName" value="Industrial License Certificate" />
										<liferay-util:param name="fileTypes" value="application/pdf" />
									</liferay-util:include>
								</div>
							</div>
						</div>
					<%
						}
					%>
					<%
					if(StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0290")){
					%>
					<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
									<li><span>Does your Industry/Trade requires DPCC Clearance?</span></li> 
								</label>
							</div>
							<div class="col-sm-2">
								<label> 
									<span class="mr-3"><img src="<%=(connectionRequest.isDpccClearanceRequired() ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
									<span class="mr-3"><img src="<%=(!connectionRequest.isDpccClearanceRequired() ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
					</div>
					<%
					}
					%>
					
					<%
						if (connectionRequest.getTariffCategory().equals("0320") 
								|| (StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0290") && connectionRequest.isDpccClearanceRequired())
								|| (!StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0290")  && StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(),"Hotel/Guest House"))) {
							boolean flag=connectionRequest.getHasDpccCertificate();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span>Do you have valid DPCC Certificate?</span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
		
								<label> <span class="mr-3"><img src="<%=(flag ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!flag ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							<div class="col-md-3">
								<div id="dpccCertificateUploadDiv" style="display:<%=flag?"block":"none"%>; width:100%;">
									<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
										<liferay-util:param name="elementName" value="dpccLicense" />
										<liferay-util:param name="documentType" value="DPCC_License" />
										<liferay-util:param name="documentName" value="DPCC License" />
										<liferay-util:param name="fileTypes" value="application/pdf" />	
									</liferay-util:include>
								</div>
							</div>
						</div>
					<%
						}
					%>
					<div >
					<%
					if(StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0290")){
					%>
					<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label"> 
									<li><span>Is your premise falls under Non-Confirming Area?</span></li> 
								</label>
							</div>
							<div class="col-sm-2">
								<label> 
									<span class="mr-3"><img src="<%=(connectionRequest.isNonConfirmingArea() ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
									<span class="mr-3"><img src="<%=(!connectionRequest.isNonConfirmingArea() ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
					</div>
						<%
						if(connectionRequest.isNonConfirmingArea()){ 
							boolean flag = connectionRequest.getHasTradeLicense();
						%>
							<div class="row mt-2">
									<div class="col-sm-7">
										<label for="" class="col-form-label">
											<li><span>Do you have valid Trade License?</span></li>
										</label>
				
									</div>
									<div class="col-sm-2">
				
										<label> <span class="mr-3"><img src="<%=(flag ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
										<span class="mr-3"><img src="<%=(!flag ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
										</label>
									</div>
									<div class="col-md-3">
										<div id="tradeCertificateUploadDiv" style="display:<%=flag?"block":"none"%>; width:100%;">
											<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
												<liferay-util:param name="elementName" value="tradeLicense" />
												<liferay-util:param name="documentType" value="Trade_License" />
												<liferay-util:param name="documentName" value="Trade License" />
												<liferay-util:param name="fileTypes" value="application/pdf" />	
											</liferay-util:include>
										</div>
									</div>
								</div>
					<%
						}
					}
					%>
					</div>
					<%
						if (connectionRequest.getTariffCategory().equals("0250")) {
							boolean bdoCert=connectionRequest.getHasBdoCertificate();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span>Do you have Certificate of Residence from Block Development Officer(BDO)? </span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
		
								<label> <span class="mr-3"><img src="<%=(bdoCert ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!bdoCert ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							
							<div class="col-md-3" id="bdocertuploaddiv">
								<liferay-util:include page="/document-upload-element_preview.jsp" servletContext="<%=application%>">
									<liferay-util:param name="elementName" value="bdoCertificate" />
									<liferay-util:param name="documentType" value="BDO_Certificate" />
									<liferay-util:param name="documentName" value="BDO Certificate" />
									<liferay-util:param name="fileTypes" value="application/pdf" />					
								</liferay-util:include>
							</div>
						</div>
					<%
						}
					
						boolean emailService=connectionRequest.isEServiceOnMail();
					%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span></i>Do you want to avail <span class="font-weight-bold">e-Bill Services(paperless)</span> on email?</span></li>
								</label>
		
							</div>
							<div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(emailService ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!emailService ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div>
							
								<div class="col-sm-3" id="emailservicediv">
			
									<label class="control-label">Email - <%=connectionRequest.getEServiceMailId()%></label>
					
								</div>

						</div>
						
						<%
							boolean optSubsidy=connectionRequest.isOptSubsidy();
						%>
						<div class="row mt-2" style="display:none">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span>Do you want to opt for voluntary subsidy benefits - Yes/No?</span></li>
								</label>
		
							</div>
							 <div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(optSubsidy ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!optSubsidy ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div> 
							
						</div>
						
						<%
							boolean purchaseMeter=connectionRequest.isPurchaseMeter();
						%>
						<div class="row mt-2">
							<div class="col-sm-7">
								<label for="" class="col-form-label">
									<li><span>Do you want to purchase your own CEA approved meter having additional features as approved by Commission</span></li>
								</label>
		
							</div>
							 <div class="col-sm-2">
								<label> <span class="mr-3"><img src="<%=(purchaseMeter ? circle_dot:circle_blank)%>" class="checklist-option">Yes</span>
								<span class="mr-3"><img src="<%=(!purchaseMeter ? circle_dot:circle_blank)%>" class="checklist-option">No</span>
								</label>
							</div> 
							
						</div>
						
					</div>
				</div>
			</div>
