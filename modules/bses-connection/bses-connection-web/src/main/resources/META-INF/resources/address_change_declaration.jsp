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
	if(connectionRequestId==0 && portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID)!=null){
		connectionRequestId=(Long)portletSession.getAttribute(BsesConnectionPortletKeys.REQUEST_ID);
	}
	
	System.out.println("preview_request.jsp- connectionRequestId - "+connectionRequestId);
	ConnectionRequest cr = ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
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
<div class="container-fluid bg-white shadow p-5 my-3">
		<div class="row">
			<div class="col-md-12">
				<h6 class="text-uppercase text-body font-weight-bold bg-light p-3 text-center">
					<liferay-ui:message key="declaration-section-title" />
				</h6>
			</div>
		</div>
		<div class="row">
		
		<div class="col-md-12" style="border: solid 1px;overflow: scroll;height: 350px;">
	
	<p>I/we, <a id="fullnameA" style="font-weight: bold;"><%=ph.getIndividualName() %></a> (hereinafter referred to as "Applicant", which term shall mean and include executors, administrators, heirs, successors and assigns), do hereby swear and declare as under:</p>  
	<p>(a)	That the applicant is a lawful occupant/owner of the premises at <a id="address" style="font-weight: bold;"><%=ph.getIndividualAddress() %></a> (hereinafter the "Premises"). The Applicant has requested BSES Rajdhani Power Ltd. to provide an electricity connection at the abovementioned premises in the Applicant's name under the consumer category mentioned in the Application Form. </p>
	<p>(b)	The applicant has deposited the scan copy of all requisite documents as specified in the application form.</p>
	<p>(c)	That the scan copies filed with the application form are made from the original by mechanical processes which in themselves ensure the accuracy of the copy and the applicant has himself compared the said scan copies with the original of said documents.</p>
	<p>(d)	That the applicant is in possession of the original of all the documents as filed with the application and shall submit/produce (as the case may be) as and when demanded by BRPL. </p>
	<p>(e)	That the certificates submitted by applicant with the application form have been issued by the respective authorities and the applicant has secured all those certificates in adherence of due process of law.  </p>    
	<p>(f) 	That the applicant confirms that in case any of the undertaking being found false or the documents as submitted by the applicant along with the application for electricity connection, being found forged, fabricated or secured in violation of the provisions of law or failure on the part of applicant in production of the original documents within the strict timeline as notified by BRPL, than irrespective to the fact, whether the applicant is guilty or not, BRPL shall be having full right to disconnect the said electricity connection, so released and the applicant shall, at all times, keep BRPL, its officers/Directors/employees indemnified from all losses/damages/penalties/liabilities associated with the installation of electricity connection, so released, based upon this instant undertaking and/or any other further breach by the applicant to the terms/conditions/Rules/Regulations etc.
	That I, the Applicant hereby agree and undertake :</p>
	
	<p>1. That no objection certificate for seeking electricity connection from the co-owner has been obtained (in case the applicant is not the sole owner of the premises).</p>
	
	<p>2. To indemnify the licensee against all proceedings, claims, demands, costs, damages, expenses that the licensee may incur by reason of a fresh service connection given to the Applicant.</p>
	
	<p>3. That to the best of applicants knowledge, all electrical works done within the premises are as per Central Electricity Authority (Measures relating to Safety and Electricity Supply) Regulations, 2010 as amended from time to time.</p>
	
	<p>4. That the internal Wiring at the premises has been tested by a Licensed Electrical Contractor/designated officer of the Government# and the test certificate is available with the applicant.</p>
		<p>#In case of Government Quarters/Offices,</p>
	<p>5. *That the building has been constructed as per prevalent building Bye-Laws and the total height of the building</p>
		<p>(i) does not exceed 15 meters without stilt parking or 17.5 meters with stilt parking. or</p>
		<p>(ii) is more than 15 meters without stilt parking or 17.5 meters with stilt parking and Fire Clearance Certificate is available with the applicant.</p>
	
	<p>6. *That there is a provision of lift in the premises and the applicant has obtained the lift fitness certificate from the Electrical Inspector for the lift in the said premises and the same is available with the applicant.</p>
		<p>*If Applicable</p>
	
	<p>7. That the applicant has applied for the correct category of tariff as per the applicable tariff schedule. For either of the following categories of connection, the applicant has the relevant documents available with him.</p>
		<p>A.Industrial (Tick whichever is available)</p>
		<p>a.(i)Valid Industrial License or</p>
		 <p>(ii)Factory License, or</p>
		 <p>(iii)Household Licence, or</p>
		 <p>(iv)Lal Dora Certificate in case of rural village, or</p>
		 <p>(v)Any other document authorizing the applicant to run the industry, OR</p>
	
		<p>b.(i)Occupancy-cum-completion certificate from concerned Municipal Corporation or DDA, or</p>
		<p> (ii)Consent to Establish from Delhi Pollution Control Committee (DPCC), or</p>
		 <p>(iii)Provisional Industrial License, or</p>
		 <p>(iv)Sanctioned building plan from concerned Municipal Corporation or DDA</p>
		
		<p>B.Agricultural Consumers
		</p><p> (i) Certificate of Residence from Block Development Officer, or</p>
		 <p>(ii) No Objection Certificate from Development Commissioner/Block Development Officer Delhi Jal Board for tube wells</p>
	
		<p>C.Non-domestic for Khokhas and Temporary Structure</p>
		<p> (i) The Bazaari Receipt Number, or</p>
		 <p>(ii) No Objection Certificate for Khokha/Temporary Structure from concerned Municipal Corporation of Delhi or Delhi Development Authority or any other concerned Land
		      Owning Agency Please provide following information in respect of certificate available with the applicant (Certificate No., issuing authority, date of issue, Purpose,validity, if applicable)</p>
	
		<p>D.Charging station for electric vehicles
			An undertaking by the applicant that the charging station for electric vehicles is as per the specifications as may be specified by Central Electricity Authority or Bureau of Indian Standards from time to time.</p>
	
	<p>8.*That the industrial connection is taken based on the documents mentioned in clause 7A(b) above and I shall obtain the valid document as mentioned in clause 7A(a) above within a period of 3 months from issue of electricity connection.</p>
			<p>*If applicable.</p>
	
	<p>9.That above referred applicable documents/certificates indicated at various points are available with me and can be inspected by the Licensee at any time. In case of failure or reluctance to produce/allow the inspection of said documents/certificates the licensee may disconnect the connection granted owing to such failure/, reluctance.</p>
	
	<p>10.That I shall provide a legible and certified copy of any of above applicable documents to the licensee pursuant to order/request of any government agency, judicial forum or any other authority seeking such information.</p>
	
	<p>11.That my industry/trade has not been declared to be releasing obnoxious hazardous/pollutant by any government agency and that no orders of any Court or judicial authority would be breached by running of my industry/trade or granting any electricity connection to the same. The licensee is indemnified against any loss accrued by the applicant on this account that on an Order issued by a Court of law or judicial authority or any government agency for disconnection of electricity, the licensee may disconnect the supply.</p>
	
	<p>12.That I shall indemnify and hold harmless, the licensee, in case of any injury or incident on account of any fault in electrical work in the premises, and the licensee shall not be liable for any mishap or incident occurring at the premises to the applicant on account of any faulty/defective/inferior quality wiring at the premises for which the connection is being applied.</p>
	
	<p>13.To pay the electricity consumption bills and all other charges at the rates set out in the licensee's Tariff Schedule and miscellaneous charges for supply as may be in force from time to time, regularly as and when the same becomes due for payment.</p>
	
	<p>14.To deposit the additional security deposit and additional service line cum development (SLD) charges, if any from time to time based on the prevailing Orders/rules, directions and Regulations of the Commission.</p>
	
	<p>15.To abide by the provisions of the Electricity Act, 2003, all applicable laws, conditions of Supply/Tariff Orders and any other Rules or Regulations as may be notified by the Commission, as applicable from time to time.</p>
	
	<p>16.That licensee shall be at liberty to adjust the electricity consumption charges due/outstanding along with any other charges against the Consumer Security Deposit paid by the Applicant, in the event of termination of the agreement prior to expiry of the contracted period or in case of any contractual default as per provisions of regulations/rules/ orders/directions of the Commission.</p>
	
	<p>17.That as per Delhi Electricity Regulatory Commission (Supply Code and Performance Standards) Regulations, 2017 or as amended from time to time, I shall provide suitable and adequate land space for installation of the meter/electrical equipments where the licensee may have ready access to the same.</p>
	
	<p>18. To allow clear and un-encumbered access to the meters for the purpose of meter reading and it's checking etc.</p>
	
	<p>19. That the licensee may disconnect the electric supply under reference, in the event of any default, non-compliance of statutory provisions and in the event of a legally binding directive by Statutory Authority (ies) to effect such an order. This shall be without prejudice to any other rights of the licensee including that of getting its payment as on the date of disconnection.</p>
	
	<p>20. All the above declaration given by the Applicant shall be construed to an Agreement between the licensee and the Applicant.</p>
	
	<p>21. That the applicant is having the approval for safety and/or fire clearance for EV charging station wherever applicable from the concerned department such as Petroleum and Explosives Safety Organization (PESO), Fire Department etc. </p>
																											 
	
	</div>
		</div>
	<div class="row">
		<div class="col-md-12 mt-3 mb-2">
		<aui:form role="form"  name ="declarationForm"  >
			<div class="form-check-inline">
					<aui:input cssClass="mr-2" type="checkbox" value="1" name="selfDeclaration" label="declaration-check">
						<aui:validator name="required" />
					</aui:input> 
			</div>
			</aui:form>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12 ml-5 mb-2" style="color:red;">
			<liferay-ui:message key="document-read-note" />
		</div>
	</div>
</div>

<script>  

$(document).ready(function(){  
	
	if($('#<portlet:namespace/>consumerForm')){
		$('#<portlet:namespace/>consumerForm').find('input:text','date')
		.each(function () {
			
			$(this).keyup(function(){  
					  updateName();
				}); 
			
		 });
	}
	
}); 


	
function updateName()
{
	var consumerType = $("#<portlet:namespace/>consumerType").val();
	if(consumerType == "Individual")
	{
		updateNameDetails();
	}
	else
	{
		updateFirmNameDetails();
	}
}

function updateNameDetails()
{
	var fname = $("#<portlet:namespace/>firstName").val();
	var mname = $("#<portlet:namespace/>middleName").val();
	var lname = $("#<portlet:namespace/>lastName").val();
	
	var arr1=[fname,mname,lname];
	var fullname=arr1.filter(function(x) {
	     return x !== undefined;
	}).join(' ');
	
	$("#fullnameA").text(fullname);
}

function updateFirmNameDetails()
{
	$("#fullName").text(($("#<portlet:namespace/>signatoryName").val()));
}


</script>
