<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.bses.connection2.web.constants.BsesConnectionPortletKeys"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="com.bses.connection2.service.LocalityDivisionLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.LocalityDivision"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ include file="init.jsp"%>
<div class="portlet-inner">

	<!-- 	<div class="row mb-15">
		<div class="col-md-12">
			<div class="col-md-10"></div>
			<div class="col-md-2">
			<button class="showButton" onclick="showlink()">Need Help?</a>
			</button>
			</div>
		</div>
	</div> -->

	<!-- <div class="row mb-15">
		<div class="col-md-12">
			<div class="col-md-10"></div>
			<div class="col-md-2">
				 <button class="toolclass" title="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas bibendum ac felis id commodo. Etiam mauris purus, fringilla id tempus in, mollis vel orci. Duis ultricies at erat eget iaculis.">i</button>
			</div>
		</div>
	</div> -->

	<!-- <span class="icon icon-info"
		style="border: 2px solid #000; width: 30px; height: 30px; text-align: center; border-radius: 50%; display: inline-block; line-height: 25px; padding-left: 4px;">&nbsp;</span>
 -->

	<h4 style="text-align: center; text-decoration: underline;">
		<b>Apply Online for New Connection</b>
	</h4>
	<p>
		<b>Dear Consumer,</b>
	</p>
	<p>
		<b>Kindly scroll down to view document checklist &amp; apply for new connection. For further assistance on "How to Apply Online for New
			Connection" Call us at 19123 (24 x7 Toll-Free)</b>
	</p>
	<p style="text-decoration: underline;">
		<b>DOCUMENTS REQUIRED FOR NEW CONNECTION INCLUDING THE REQUIREMENTS AS SPECIFIED IN DERC (SUPPLY CODE AND PERFORMANCE STANDARDS) REGULATIONS
			2017.</b>
	</p>

	<table class="table table-bordered table-sm">
		<thead>
			<tr style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35);">
				<th style="color: white;">S.No.</th>
				<th style="text-align: center; color: white;">Identity Proof Documents required for new connection</th>

			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1)</td>
				<td>One recent passport size photograph</td>
			</tr>
			<tr>
				<td>2)</td>
				<td>Photo Identity Proof ( any one of the following )</td>
			</tr>
			<tr>
				<td>2a</td>
				<td>Valid Driving license</td>
			</tr>
			<tr>
				<td>2b</td>
				<td>Electoral Photo ID card</td>
			</tr>
			<tr>
				<td>2c</td>
				<td>Aadhar Card</td>
			</tr>
			<tr>
				<td>2d</td>
				<td>Photo Identity card issued by any Govt. Authority</td>
			</tr>
			<tr>
				<td>2e</td>
				<td>Valid Passport</td>
			</tr>
			<tr>
				<td>2f</td>
				<td>Pan Card</td>
			</tr>
			<tr>
				<td>2g</td>
				<td>Ration Card with applicant Photo</td>
			</tr>
			<tr>
				<td>2h</td>
				<td>If the applicant is an organization (including Company, Firm, LLP etc.), certificate of incorporation/ registration issued by the
					Registrar and proof of authorization /resolution of Board for authorizing the person. The authorized person applying the connection for an
					organization, shall also be required to submit his/her One recent passport size photograph along with any one of the identity proof as mentioned
					in S.No. 2 (2a-2g) above. (Authorisation documents/extract of board resolution should be on the Letter Head of organisation, duly signed and
					sealed)</td>
			</tr>
		</tbody>
	</table>
	<table class="table table-bordered table-sm">
		<thead>
			<tr style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35);">
				<th style="color: white; line-height: 68px;"><span style="vertical-align: inherit;">3)</span></th>
				<!-- 	<th style="text-align: center;color: white;">Proof of ownership or occupancy of premises ( any one of the following ) in favour of applicant &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <span class="icon icon-info" onclick="openModal()" title="Click here for more information"
		style="border: 2px solid #000; width: 30px; background-color:white; color:black; height: 30px; text-align: center; border-radius: 50%; display: inline-block; line-height: 25px; padding-left: 4px;">&nbsp;</span>
						</th> -->
				<th style="text-align: center; color: white;"><div style="display: flex; justify-content: space-evenly; align-items: center;">
						<span style="vertical-align: inherit;">Proof of ownership or occupancy of premises ( any one of the following ) in favour of applicant</span>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="i-style" onclick="openModal()" title=""
							data-original-title="Click here for document description"><i>i</i></span>
					</div></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>a</td>
				<td>Certified copy of title deed (Sale Deed)</td>
			</tr>
			<tr>
				<td>b</td>
				<td>Certified copy of conveyance deed</td>
			</tr>
			<tr>
				<td>c</td>
				<td>General Power of Attorney (GPA)</td>
			</tr>
			<tr>
				<td>d</td>
				<td>Copy of allotment letter/possession letter</td>
			</tr>
			<tr>
				<td>e</td>
				<td>Mutation certificate issued by a Government body such as Local Revenue Authorities or Municipal Corporation or land owning agencies like
					DDA/L&amp;DO</td>
			</tr>
			<tr>
				<td>f</td>
				<td>Sub-division agreement (along with ownership documents of premises) (In case of relinquishment deed/authorisation- NOC issued by other
					co-owners of premises)</td>
			</tr>
			<tr>
				<td>g</td>
				<td>For bonafide consumers residing in JJ clusters or in other areas with no specific municipal address, the licensee may accept either
					ration card or electoral identity card mandatorily having the same address as a proof of occupancy of the premises</td>
			</tr>
			<tr>
				<td>h</td>
				<td>Will + NOC from legal heirs along with ownership document of will executioner <i><b>(Additional Info :Will is not valid if
							executioner of will is alive)</b></i></td>
			</tr>
			<tr>
				<td>i</td>
				<td>Mutation Letter from DDA/Concerned MCD/ Land &amp; Development officer</td>
			</tr>
			<tr>
				<td>j</td>
				<td>Copy of Gift Deed (along with title deed of doner)</td>
			</tr>
			<tr>
				<td>k</td>
				<td>In case Applicant is a Tenant : Valid lease agreement along with undertaking that the lease agreement has been signed by the owner or his
					authorized representative<br>Or<br>Rent receipt not earlier than 3 (three) months along with undertaking that the rent receipt has been
					signed by the owner or his authorized representative
				</td>
			</tr>
			<tr>
				<td>l</td>
				<td>In case of temporary connection additional documents required:<br> Applicant's cancel cheque <br> Guarantor's undertaking, self
					attested ID proof &amp; BRPL Bill<br> <b><i>(Additional Info : In case of postpaid temporary connection other than above mentioned ,
							additional documents will be reqd.)</i></b>

				</td>
			</tr>
			<tr>
				<td colspan="2"><b>Please Note :</b>
					<ul>
						<li>Chain of title documents is required in case where the new title deed submitted by the applicant is not executed by the earlier
							registered consumer in the system of BSES. In case of premises, for which the connection has been sought has never been energized earlier, no
							chain of documents is required.</li>
						<li>Ensure all pages (front and back side) of the relevant document are uploaded.</li>
						<li>All uploaded documents should be self-attested by applicants(s) on photocopy of original documents.</li>
						<li>All uploaded documents should be clear &amp; readable.</li>
						<li>Uploaded ownership document should be in Pdf format &amp; within size limit of 25 MB</li>
						<li>In case colored photograph is taken from original document, self-attestation will not be required</li>
						<li>For all permanent new connections, structure and wiring at applied premises should be complete. Also, ELCB should be installed at
							premises where applied load is 2 KW and above. Failing to comply the same, shall result in rejection of the request</li>
					</ul></td>
			</tr>

		</tbody>
	</table>
	<h4 style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35); text-align: center; color: white;">CATEGORY WISE OWNERSHIP PROOF</h4>
	<h4 style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35); text-align: center; color: white;">OWNER AS PRIMARY APPLICANT</h4>

	<table class="table table-bordered table-sm">
		<thead>
		</thead>
		<tbody>
			<tr>
				<td>1.1</td>
				<td>In case connection applied by individual/Co-owner</td>
				<td>Ownership Proof of applied address: Sale Deed /GPA/ Partition Deed/ Relinquishment or Release Deed /Conveyance Deed/ Khatoni <br>
				<br> In case of joint property, NOC required from other co-owners along with self attested ID proof of the co-owner.
				</td>
			</tr>
			<tr>
				<td>1.2</td>
				<td>If applicant is the legal heir and is a owner/co-owner</td>
				<td>Ownership Proof of applied address: Sale Deed /GPA/ Will/Partition Deed/ Relinquishment or Release Deed/Conveyance Deed/ NOC required
					from other legal heirs/ Undertaking as <i> I am the only heir</i> sufficient or more information in undertaking required along with self attested
					ID proof of the co-owner . <br>
				<br>Death Certificate reqd. of testator (if unregistered/ notarized/ un probated will is submitted)
				</td>
			</tr>
			<tr>
				<td>1.3</td>
				<td>Govt. /DDA flats/CGHS (original allottee)</td>
				<td>Ownership Proof of applied address: Allotment Letter by Govt. Dept./Sale Deed /GPA/ Relinquishment or Release Deed/Conveyance Deed<br>
				<br>In case of joint property , NOC required from other co-owners (other than Govt.) along with self attested ID proof of the co-owner
				</td>
			</tr>
			<tr>
				<td>1.4</td>
				<td>Connections for Garage in the name of Original Allottee or owner (if garage sold separately)</td>
				<td>Ownership Proof of applied address: Allotment / Possession Letter of original flat/Sale Deed/GPA.<br>
				<br>In case of joint property , NOC required from other co-owners along with self attested ID proof of the co-owner.
				</td>
			</tr>
			<tr>
				<td>1.5</td>
				<td>Agriculture Connection (Tube well /Kutti cutting/Threshing)</td>
				<td>(i)Ownership Proof of applied address: Sale Deed/GPA/Khatoni issued by SDM office/Khasra-Girdwari <br>
				<br>Certificate of Residence from Block Development Officer <br>
				<br>In case of joint property , NOC required from other co-owners along with self attested ID proof of the co-owner
				</td>
			</tr>
			<tr>
				<td>1.6</td>
				<td>For Industrial connections organization (including Company, Firm, LLP etc.) if applied in the name of Firm/Individual (same owner)</td>
				<td>(i) Ownership Proof of applied address: Sale Deed /GPA/Allotment Letter/Possession Letter/Conveyance Deed/Khatoni/Khasra-Girdwari/
					Memorandum of Association of organization either in the name of firm/Co. or in the name of individual.<br> <br>In case of joint
					property , NOC required from other co-owners along with self attested ID proof of the co-owner<br> <br>(ii) Valid Industrial / Factory
					License / MSME Certificate<br>
				<br> (iii) DPCC permission (if required), Undertaking required that DPCC permission shall be submitted before the use of such nature
					requiring DPCC permission - where activity still not defined (Annex.4)
				</td>
			</tr>
		</tbody>
	</table>
	<h4 style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35); text-align: center; color: white;">THE APPLICANT IS NOT THE OWNER OF
		PREMISES</h4>
	<table class="table table-bordered table-sm">
		<thead>
		</thead>
		<tbody>
			<tr>
				<td>2.1</td>
				<td>Tower / Booster / Giga Fiber Cases</td>
				<td>(i)Ownership Proof of applied address: Sale Deed /GPA/ Partition Deed/ Relinquishment or Release Deed/Conveyance Deed/Khatoni issued by
					SDM office <br> (ii) NOC from owner for applied address (Annex.1)<br> (iii) Lease agreement between landlord and Co.<br> (iv) MOA
					( Memorandum of Association)<br> (v) Board of resolution / Authorization letter in favor of signing authority<br> (vi) In case of
					Tower/Booster cases -<br>
				<br> Permission from MCD or Undertaking cum Affidavit ( Annex. 5) from consumer stating the MCD permission will be submitted within 90 days
					from date of electricity connection<br>
				<br> <b>In case of Giga Fiber Cases-</b> Undertaking cum Affidavit ( Annex. 6) required . MCD permission not required for giga fiber cases .

				</td>
			</tr>
			<tr>
				<td>2.2</td>
				<td>If applicant is Tenant</td>
				<td>Valid lease agreement along with undertaking that the lease agreement has been signed by the owner or his authorized representative<br>
				<br> Or <br>
				<br> Rent receipt not earlier than 3 (three) months along with undertaking that the rent receipt has been signed by the owner or his
					authorized representative <br>
				<br> (Annex.3)
				</td>
			</tr>
		</tbody>
	</table>
	<h4 style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35); text-align: center; color: white;">CONNECTION FOR COMMON SERVICES</h4>
	<table class="table table-bordered table-sm">
		<thead>
		</thead>
		<tbody>
			<tr>
				<td>3.1</td>
				<td>In case connection applied by RWA Society/Association(Common Services)</td>
				<td>(i) List of Committee Members<br> (ii) Authority letter in favor of signatory authority on RWA letter head<br>
				<br> Note: DL-NH rate category will be issued only.
				</td>
			</tr>
			<tr>
				<td>3.2</td>
				<td>For Parking/Lift connections/Staircase Lighting/Compound Lighting (private/unregistered consumer)</td>
				<td>Ownership Proof of applied address (any floor): Sale Deed / GPA / Partition Deed/ Relinquishment or Release Deed/Conveyance Deed.<br>
				<br> Lift certificate issued by Inspector of lift GNCT Delhi<br>
				<br> <i><b>(Additional Info: <br>
						<br> i) If applicant is one of the owner, NOC with Id proof along with ownership documents are required from other owners with copy of BRPL
							Bill . <br>
						<br> ii) If applied for an individual flat where lift provision exists -Undertaking Reqd. that this connection will not be used for lift
							purpose in future / Lift Non Usage Undertaking in case of connection applied in premises with Lift Provision<br>
						<br> iii) Undertaking required -In case lift is installed but not working <br>
						<br> iv) In case lift is installed and in working condition, lift certificate will be required<br>
						<br> v) If connection applied for common area with lift provision, undertaking reqd. that this connection will not be used for lift purpose
							in future.)
					</b></i>
				</td>
			</tr>
			<tr>
				<td>3.3</td>
				<td>Street Light cases</td>
				<td>Govt. issued covering letter for purpose of the connection with location address.</td>
			</tr>
		</tbody>
	</table>
	<h4 style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35); text-align: center; color: white;">OUTDOOR CONNECTIONS</h4>
	<table class="table table-bordered table-sm">
		<thead>
		</thead>
		<tbody>
			<tr>
				<td>4.1</td>
				<td>Construction projects ( Pvt./ Govt.)</td>
				<td>(i)Ownership Proof of applied address: Tender Acceptance Letter / Offer Letter / Letter of Commencement<br>
				<br> (ii)MOA ( Memorandum of Association)<br>
				<br> (iii) Resolution in favor of signing authority passed in compliance of law in this regard.

				</td>
			</tr>
			<tr>
				<td>4.2</td>
				<td>For Advertisement/Hoardings/Bus Shelters</td>
				<td>(i)Ownership Proof of applied address: Allotment Letter / Offer Letter / Letter of Commencement<br>
				<br> (ii)MOA ( Memorandum of Association)<br>
				<br> (iii)Resolution in favor of signing authority passed in compliance of law in this regard.
				</td>
			</tr>
			<tr>
				<td>4.3</td>
				<td>Connection for weekly markets (connection to be given in the in the name of association whose id documents will be collected)</td>
				<td>(i)Ownership Proof of applied address: MCD Allotment Letter in the name of association for applied market.<br>
				<br></td>
			</tr>
			<tr>
				<td>4.4</td>
				<td>Tehbazari/Khoka (Single Shop)</td>
				<td>Ownership Proof of applied address: MCD Allotment Letter in the name of applicant/ tehbazari receipt with address<br>
				<br> NOC for Khokha/ Temporary structure from concerned MCD or DDA or any other concerned land owing agency <br>
				<br></td>
			</tr>
			<tr>
				<td>4.5</td>
				<td>EV Charging Point for
					<ul>
						<li>Individual</li>
						<li>E-rickshaw</li>
						<li>Commercial Purpose</li>
					</ul>
				</td>
				<td>Ownership Proof of applied address: (Sale Deed / GPA / Partition Deed / Relinquishment or Release Deed / Conveyance Deed / Khatoni /
					Certificate issued by SDM office) / Lease Agreement along with Undertaking of owner<br>
				<br> Indemnity Bond<br>
				<br> Safety Checklist<br>
				<br> Technical evaluation / test report charger<br>
				<br> In case applicant do not possess Ownership: MCD Alottment Receipt/Challan of same address in the name of applicant &amp; Guarantor
					affidavit with CA no. along with copy of last month bill and Guarantor ID proof required with initials of both guarantor and applicant along with
					Guarantor ownership proof of Guarantor supply address.<br>
				<br> Note:- <br>
				<br> Supply Address to be maintained with Pole No. as well as other landmark. <br>
				<br> Billing Address: - Billing address to be maintained as mentioned in Guarantor CA no.
				</td>
			</tr>
		</tbody>
	</table>
	<h4 style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35); text-align: center; color: white;">AREAS WHERE REGISTERED OWNERSHIP
		DOCUMENTS ARE NOT PERMITTED</h4>
	<table class="table table-bordered table-sm">
		<thead>
		</thead>
		<tbody>
			<tr>
				<td>5.1</td>
				<td>JJ clusters/Camp /Resettlement colony</td>
				<td>For bonafide consumers residing in JJ clusters or in other areas with no specific municipal address, ration card or electoral identity
					card mandatorily having the same address as a proof of occupancy of the premises .</td>
			</tr>
			<tr>
				<td>5.2</td>
				<td>Village</td>
				<td>Ownership Proof of applied address: Same address ID proof <br>
				<br> or<br>
				<br> Khatoni / Khasra-Girdwari -issued by SDM office
				</td>
			</tr>
			<tr>
				<td>5.3</td>
				<td>Connection for Religious Places</td>
				<td>(i) Ownership Proof of applied address: Sale Deed/GPA/Partition Deed/ Relinquishment or Release Deed/Conveyance Deed/ Certf issued by SDM
					office./Khatoni issued by SDM office <br>
				<br> (ii) List of Committee Member(s)<br>
				<br> (iii) Authority letter in favor of authorized signatory. <br>
				<br> Note:- Connection to be released in the name of Mandir/Masjid/Gurdwara/Church etc
				</td>
			</tr>
		</tbody>
	</table>

	<h4 style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35); text-align: center; color: white;">SECURITY DEPOSIT CHARGES FOR
		PERMANENT CONNECTIONS (REFUNDABLE)</h4>
	<table class="table table-bordered table-sm">
		<thead>
			<tr>
				<th>S.No.</th>
				<th>Tariff Category (as per Tariff Order)</th>
				<th>Security Deposit for Permanent Connection(Rs per kW or per kVA as the case may be)</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>(1)</td>
				<td>(2)</td>
				<td>(3)</td>
			</tr>
			<tr>
				<td>1</td>
				<td>Domestic</td>
				<td></td>
			</tr>
			<tr>
				<td>(i)</td>
				<td>Upto 2 kW</td>
				<td>600</td>
			</tr>
			<tr>
				<td>(ii)</td>
				<td>Above 2 Kw upto 5 kW</td>
				<td>900</td>
			</tr>
			<tr>
				<td>(iii)</td>
				<td>Above 5 kW</td>
				<td>1200</td>
			</tr>
			<tr>
				<td>2</td>
				<td>Non-Domestic</td>
				<td>4500</td>
			</tr>
			<tr>
				<td>3</td>
				<td>Industrial</td>
				<td>4500</td>
			</tr>
			<tr>
				<td>4</td>
				<td>Agriculture</td>
				<td>300</td>
			</tr>
			<tr>
				<td>5</td>
				<td>Public Lighting</td>
				<td>3000</td>
			</tr>
			<tr>
				<td>6</td>
				<td>Railway, DMRC, DIAL, DJB</td>
				<td>3000</td>
			</tr>
			<tr>
				<td>7</td>
				<td>Mushroom, Cultivation</td>
				<td>600</td>
			</tr>
			<tr>
				<td>8</td>
				<td>Advertisement and Hoarding</td>
				<td>4500</td>
			</tr>
			<tr>
				<td>9</td>
				<td>Any other category not specified above</td>
				<td>To be decided by the Commission</td>
			</tr>
			<tr>
				<td>10</td>
				<td>EV Connections</td>
				<td>2500</td>
			</tr>
		</tbody>
	</table>
	<h4 style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35); text-align: center; color: white;">SERVICE LINE CUM DEVELOPMENT
		CHARGE (NON REFUNDABLE)</h4>
	<table class="table table-bordered table-sm">
		<thead>
			<tr>
				<th>Sr.No.</th>
				<th>Type of Area</th>
				<th>Sanctioned Load</th>
				<th>Amount(Rs.)</th>
				<th>Road Restoration Charges</th>
				<th>Total</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>
				<td>6</td>
			</tr>
			<tr>
				<td>(i)</td>
				<td>Electrified Area</td>
				<td>Upto 5 kW</td>
				<td>Rs.3000</td>
				<td>Actual RR charges for service line</td>
				<td>4+5</td>
			</tr>
			<tr>
				<td>(ii)</td>
				<td></td>
				<td>More than 5 kW and upto 150 kW</td>
				<td>(Rs. 3000 + Rs. 500 per kW or per kVA as the case may be for load beyond 5 kW)limited to a maximum of Rs.2500/-</td>
				<td>Actual RR charges for service line</td>
				<td>4+5</td>
			</tr>
		</tbody>
	</table>
	<h4 style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35); text-align: center; color: white;">ANNEXURES</h4>
	<div>

		<table class="table table-bordered table-sm">
			<thead>
				<tr style="background-image: linear-gradient(to bottom, #ec5f67, #b82d35);">
					<th style="color: white;">Annexure Number / Name</th>
					<th style="color: white;">Information</th>
					<th style="color: white;">Download</th>
				</tr>
			</thead>
			<tbody>

				<tr>
					<td>Annexure 1 - NOC format</td>
					<td>Where applicant is not the owner of the applied premise and NOC from original owner is required in favor of applicant and signed by the
						Owner along with self-attested ID proof of owner</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/Annex_1.pdf/4a5b6c46-21ca-eae2-6a09-d53facb73aa2?t=1643977615977&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>Annexure 2- Legal heirs certificate cum NOC</td>
					<td>Where the owner of the applied premise is no more, collective NOC from all the legal heirs of the deceased is required in favor of
						applicant and signed by all the legal heirs along with self-attested ID proof of legal heir.</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/Annex_2.pdf/1a45d17e-f820-9247-28d6-2544d0c82fab?t=1643977616213&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>Annexure 3- Undertaking from Tenant</td>
					<td>The said undertaking is applicable for all the cases where the applicant is tenant.</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/Annex_3.pdf/b409b388-f8c7-b28b-30fe-e33aaf672e56?t=1643977616430&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>Annexure 4- Undertaking for DPCC Clearance</td>
					<td>Undertaking for DPCC Clearance where activity not defined</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/Annex_4_DPCC.pdf/d3f47d89-eb79-a0c1-9f60-6528aadf39b7?t=1643977705103&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>Annexure 5- Undertaking for Tower &amp; Booster Connection</td>
					<td>Applicant undertaking for tower and booster connection</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/Annex_5.pdf/2f42fcb6-8391-22c2-95e6-3fe8e78f53b6?t=1649321231302&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>Annexure 6 - Undertaking for Giga Fiber Connection</td>
					<td>Applicant undertaking for switch box connection ( Giga Fiber)</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/Annex_6.pdf/0699e471-80de-5b0a-7588-1a15dca1a420?t=1649321231683&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>EV Charging certification</td>
					<td>Mandatory documents for EV Charging point</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/EVcharging_Grid_Certification_Technical_specifiation.pdf/77b3dbe2-7486-0254-1589-301cd487f53a?t=1644580857665&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>EV Checklist of activities to be performed</td>
					<td>Mandatory documents for EV Charging point</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/Safety_Checklist_of_activities.pdf/3336ac23-fdf8-1028-47a0-ca282365ac1c?t=1644580858877&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>EV Indemnity bond</td>
					<td>Mandatory documents for EV Charging point</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/Indemnity_bond_310321.pdf/0ffc9205-4b1e-b63a-0275-13f91952737d?t=1644580858452&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>Guarantor Undertaking (for Temporary Connection)</td>
					<td>The said undertaking is applicable for all the cases where the applicant is applying for temporary connection.</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/GUARANTOR_UNDERTAKING.pdf/3f97a6c0-620a-67db-e5cc-60971b6042e3?t=1643977617376&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>NOC format- New Connection</td>
					<td>In case of Single Applicant of a joint ownership property</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/NOC_NEW_CONNECTION_Single_Applicant_Joint_Owner.pdf/5bfed1ac-bfb8-b794-9b5f-8ac3fbfec37f?t=1643977618577&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>New Connection User Manual</td>
					<td>User Manual for New Connection</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/New_Connection_User_Manual.pdf/6f57ff42-240b-a6e9-14a9-d42b61aaeddd?t=1643977617812&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>Safety Undertaking (for Temporary Connection)</td>
					<td>The said undertaking is applicable for all the cases where the applicant is applying for temporary connection.</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/Safety_Undertaking_Temporary_Connection.pdf/dfea7a8b-9ba3-e4c6-638a-718c2fbf830a?t=1643977618786&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>Self Declaration of Building Height</td>
					<td>Self declaration that the building height does not exceed 15mtrs without stilt parking and 17.5 mtrs with stilt parking</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/self_declaration_of_height.pdf/1bebeaf1-6629-fed8-8c6b-6ce637deec1f?t=1643977618960&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>Test Report</td>
					<td>Test Report format</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/Test_Report_format_Supply_Code_2007.pdf/c550fc5f-e165-9922-e1e6-9e72d967bccb?t=1654595230369&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

				<tr>
					<td>Undertaking for DT Space</td>
					<td>Undertaking for space is to be provided for installation of Distribution Transformer and signed by the Owner/s.</td>
					<td><a
						href="https://www.bsesdelhi.com/documents/55701/1970489172/Undertaking_of_DT_Space.pdf/ac9d1b8f-5eb5-dd1a-7bef-f0abacaa6169?t=1643977619630&amp;download=true"
						target="_blank">Download PDF</a></td>
				</tr>

			</tbody>
		</table>

	</div>
</div>