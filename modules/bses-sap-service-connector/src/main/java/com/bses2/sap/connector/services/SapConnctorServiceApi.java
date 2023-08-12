package com.bses2.sap.connector.services;

import com.bses2.sap.model.AdharUpdateRequest;
import com.bses2.sap.model.AdharUpdateResponse;
import com.bses2.sap.model.CSOrderStatusResponse;
import com.bses2.sap.model.CmsDisplayBillWebRequest;
import com.bses2.sap.model.CmsDisplayBillWebResponse;
import com.bses2.sap.model.CmsISUCADisplayRequest;
import com.bses2.sap.model.CmsISUCADisplayResponse;
import com.bses2.sap.model.ComplaintRegistrationWebAreaDetailResponse;
import com.bses2.sap.model.ComplaintRegistrationWebAreaRequest;
import com.bses2.sap.model.ComplaintRegistrationWebAreaResponse;
import com.bses2.sap.model.ComplaintRegistrationWebDetailResponse;
import com.bses2.sap.model.ComplaintRegistrationWebRequest;
import com.bses2.sap.model.ComplaintRegistrationWebResponse;
import com.bses2.sap.model.ComplaintStatusRequest;
import com.bses2.sap.model.ComplaintStatusResponse;
import com.bses2.sap.model.DemandOnlineBillPdfResponse;
import com.bses2.sap.model.DemandOnlineBillPdfResquest;
import com.bses2.sap.model.DskAddUpdateConnectionRequest;
import com.bses2.sap.model.DskAddUpdateConnectionResponse;
import com.bses2.sap.model.DssISUCADisplayRequest;
import com.bses2.sap.model.DssISUCADisplayResponse;
import com.bses2.sap.model.DssWebLinkRequest;
import com.bses2.sap.model.DssWebLinkResponse;
import com.bses2.sap.model.ExemptMobileResponse;
import com.bses2.sap.model.GetAreaDetailsCircleRequest;
import com.bses2.sap.model.GetAreaDetailsCircleResponse;
import com.bses2.sap.model.GetAreaDetailsRequest;
import com.bses2.sap.model.GetAreaDetailsResponse;
import com.bses2.sap.model.GetAreaFromDivisionRequest;
import com.bses2.sap.model.GetAreaFromDivisionResponse;
import com.bses2.sap.model.GetComplaintStatusRequest;
import com.bses2.sap.model.GetComplaintStatusResponse;
import com.bses2.sap.model.GetDivisionsFromCompanyRequest;
import com.bses2.sap.model.GetDivisionsFromCompanyResponse;
import com.bses2.sap.model.GetFaultCatResponse;
import com.bses2.sap.model.GetFaultCategoriesWebRequest;
import com.bses2.sap.model.GetFaultCategoriesWebResponse;
import com.bses2.sap.model.GetFaultTypesFromCatRequest;
import com.bses2.sap.model.GetFaultTypesFromCatResponse;
import com.bses2.sap.model.GetSubFaultCategoryRequest;
import com.bses2.sap.model.GetSubFaultCategoryResponse;
import com.bses2.sap.model.ItDataTableResponse;
import com.bses2.sap.model.IvrCreatesoISURequest;
import com.bses2.sap.model.IvrCreatesoISUResponse;
import com.bses2.sap.model.MDIResOrderResponse;
import com.bses2.sap.model.OnlineBillPdfResponse;
import com.bses2.sap.model.OnlineBillPdfResquest;
import com.bses2.sap.model.PrepaidRtgsResponse;
import com.bses2.sap.model.PrepaidRtgsSyrucOutResponse;
import com.bses2.sap.model.RegisterWebComplaintRequest;
import com.bses2.sap.model.RegisterWebComplaintResponse;
import com.bses2.sap.model.UpdateTNORequest;
import com.bses2.sap.model.UpdateTNOResponse;
import com.bses2.sap.model.WebBillHisResponse;
import com.bses2.sap.model.WebBillHistoryRequest;
import com.bses2.sap.model.ZBapiCSMobileAppcntResponse;
import com.bses2.sap.model.ZBapiCaDisplayWhatsApp;
import com.bses2.sap.model.ZBapiFicaDemandRequest;
import com.bses2.sap.model.ZBapiFicaDemandResponse;
import com.bses2.sap.model.ZCalHighAvgMDIResponse;
import com.bses2.sap.model.ZbapiCreateSOPostRequest;
import com.bses2.sap.model.ZbapiCreateSOPostResponse;
import com.bses2.sap.model.ZcsUpdatePersonalDetailsResponse;

import java.util.List;

public interface SapConnctorServiceApi {

	CmsISUCADisplayResponse getCmsISUCADisplay(CmsISUCADisplayRequest request);

	CmsDisplayBillWebResponse getDisplayBillWeb(CmsDisplayBillWebRequest request);

	IvrCreatesoISUResponse getIvrCreatesoISU(IvrCreatesoISURequest request);


	OnlineBillPdfResponse getOnlineBillPdf(OnlineBillPdfResquest request);
	
	OnlineBillPdfResponse getOnlineBillPdfFromInvoice(OnlineBillPdfResquest request);
	
	List<WebBillHisResponse> getWebBillHistory(WebBillHistoryRequest request);


	GetFaultCatResponse getFaultCategory();
		
	GetSubFaultCategoryResponse getSubFaultCatResponse(GetSubFaultCategoryRequest request);
	
	GetAreaDetailsResponse getAreaDetailsResponse(GetAreaDetailsRequest request);
	
	GetAreaDetailsCircleResponse getAreaDetailsCircleResponse(GetAreaDetailsCircleRequest request);
	
	ComplaintRegistrationWebAreaResponse getComplaintRegistrationWebAreaResponse(ComplaintRegistrationWebAreaRequest request); 
	
	ComplaintRegistrationWebResponse getComplaintRegistrationWebResponse(ComplaintRegistrationWebRequest request);
	
	UpdateTNOResponse addZBapiUpdateInfo(UpdateTNORequest updateTNORequest);
	

    AdharUpdateResponse updateAdharNoInSAP(AdharUpdateRequest request);

	GetFaultCategoriesWebResponse  getFaultCategoriesWeb(GetFaultCategoriesWebRequest getFaultCategoriesWebRequest);
	
	GetFaultTypesFromCatResponse getFaultTypesFromCat(GetFaultTypesFromCatRequest getFaultTypesFromCatRequest );
	
	GetDivisionsFromCompanyResponse getDivisionsFromCompany(GetDivisionsFromCompanyRequest getDivisionsFromCompanyRequest);
	
	GetAreaFromDivisionResponse getAreaFromDivisionResponse(GetAreaFromDivisionRequest getAreaFromDivisionRequest);
	
	RegisterWebComplaintResponse registerWebComplaintResponse(RegisterWebComplaintRequest registerWebComplaintRequest);
	
	//Add Update Connection
	DskAddUpdateConnectionResponse addUpdateConnection(DskAddUpdateConnectionRequest dskAddUpdateConnectionRequest);
	
	//Add getDetails ZBapiFICA Bill details by order number
	ZBapiFicaDemandResponse getBillDetailsByOrderNo(ZBapiFicaDemandRequest request);

	ComplaintStatusResponse getComplaintStatus(ComplaintStatusRequest request);
	
	GetComplaintStatusResponse getComplaintStatusResponse(GetComplaintStatusRequest request); 
	
	DemandOnlineBillPdfResponse getDemandNoteOnlinePDF(DemandOnlineBillPdfResquest orderNumber);
	
	DssISUCADisplayResponse getDssISUCADisplay(DssISUCADisplayRequest request);
	DssISUCADisplayResponse getDssISUCADisplay2(DssISUCADisplayRequest request);
	List<ItDataTableResponse> getCNT_APP_DETAIL_MOB2(String xmlString, int l);
	List<ItDataTableResponse> getZBAPI_CNTAPP_INTRADSK(String xmlString);
	
	//add Z_BAPI_ZDSS_WEB_LINK services
	DssWebLinkResponse addZ_BAPI_ZDSS_WEB_LINK(DssWebLinkRequest request);
	
	ZbapiCreateSOPostResponse myAccountComplaintRegistration(ZbapiCreateSOPostRequest request);
	
	ExemptMobileResponse getZBAPI_EXEMPT_MOBILE(String mobileNo);
	
	ZBapiCSMobileAppcntResponse getZBAPI_CS_MOBILE_APPCNT(String mobileNo, String pmActivity, String priod, String VAPLZ);
	
	List<ItDataTableResponse> getZBAPI_CNT_APP_DETAIL_MOB(String orderType, String divCode, String appointStartDate, String appointTime, String recCount);
	
	MDIResOrderResponse getZBAPI_MDI_RES_ORDER(String ca);
	
	CSOrderStatusResponse getZBAPI_CS_ORD_STAT(String applicationNo);
	
	ZCalHighAvgMDIResponse getZBAPI_ZCAL_HIGH_AVG_MDI(String ca, String date, String load);
	
	ZcsUpdatePersonalDetailsResponse getZCSUPDAT_PERSONAL_DETAILS(String bpNo,  String whatsappNo);
	
	PrepaidRtgsResponse getZBAPI_PREPAID_RTGS(String company, String contractAccount, String accountType, String amount, String flag);

	GetAreaDetailsResponse getAreaJson(GetAreaDetailsRequest request);

	GetAreaDetailsCircleResponse getAreaData(GetAreaDetailsCircleRequest id);

	ComplaintRegistrationWebAreaDetailResponse getComplaintRegistrationWebArea(ComplaintRegistrationWebAreaRequest request);

	ComplaintRegistrationWebDetailResponse getComplaintRegistrationWeb(ComplaintRegistrationWebRequest request);

	ZBapiCaDisplayWhatsApp getZ_BAPI_CA_DISPLAY_WHATSAPP(String caNo);

	CmsISUCADisplayResponse getCmsISUCADisplay(String caNumber);

}
