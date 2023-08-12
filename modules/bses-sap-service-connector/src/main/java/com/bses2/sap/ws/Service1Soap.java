/**
 * Service1Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public interface Service1Soap extends java.rmi.Remote {
    public com.bses2.sap.ws.RegisterIVRSComplaintResponseRegisterIVRSComplaintResult registerIVRSComplaint(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String code) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.RegisterIVRSComplaintTestResponseRegisterIVRSComplaintTestResult registerIVRSComplaintTest(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String code) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.RegisterSMSComplaintResponseRegisterSMSComplaintResult registerSMSComplaint(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String code) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.RegisterWhatsappComplaintResponseRegisterWhatsappComplaintResult registerWhatsappComplaint(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String code) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.RegisterWebComplaintResponseRegisterWebComplaintResult registerWebComplaint(java.lang.String key, java.lang.String callerName, java.lang.String phone, java.lang.String address, java.lang.String email, java.lang.String CA, java.lang.String area, java.lang.String faultCategory, java.lang.String subFaultType, java.lang.String remarks, java.lang.String poleNo) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.RegisterSmartAppComplaintResponseRegisterSmartAppComplaintResult registerSmartAppComplaint(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String faultCategory, java.lang.String subFaultType, java.lang.String callerName, java.lang.String address, java.lang.String email, java.lang.String remarks) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.RegisterChatbotComplaintResponseRegisterChatbotComplaintResult registerChatbotComplaint(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String code) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetComplaintStatusResponseGetComplaintStatusResult getComplaintStatus(java.lang.String key, java.lang.String complaintNo, java.lang.String imeiNo) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetComplaintDetailsCAResponseGetComplaintDetailsCAResult getComplaintDetailsCA(java.lang.String key, java.lang.String CANo) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetDivisionsFromCompanyResponseGetDivisionsFromCompanyResult getDivisionsFromCompany(java.lang.String key, java.lang.String company) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetCompCentersFromDivisionResponseGetCompCentersFromDivisionResult getCompCentersFromDivision(java.lang.String key, java.lang.String division) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetAreasFromDivisionResponseGetAreasFromDivisionResult getAreasFromDivision(java.lang.String key, java.lang.String division) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetFaultCategoriesResponseGetFaultCategoriesResult getFaultCategories(java.lang.String key) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetFaultCategoriesWebResponseGetFaultCategoriesWebResult getFaultCategoriesWeb(java.lang.String key) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetFaultTypesFromCatResponseGetFaultTypesFromCatResult getFaultTypesFromCat(java.lang.String key, java.lang.String categoryCode) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetAssignedComplaintsToTeamResponseGetAssignedComplaintsToTeamResult getAssignedComplaintsToTeam(java.lang.String key, java.lang.String IMEINO) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetClosingRemarksFromCategoryResponseGetClosingRemarksFromCategoryResult getClosingRemarksFromCategory(java.lang.String key, java.lang.String category) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.CloseComplaintResponseCloseComplaintResult closeComplaint(java.lang.String key, java.lang.String complaintNo, java.lang.String CA, java.lang.String faultCategory, java.lang.String faultType, java.lang.String closingRemark, java.lang.String otherRemarks, java.lang.String IMEI, java.lang.String latitude, java.lang.String longitude, byte[] signatureData) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.UpdateComplaintResolutiontimeResponseUpdateComplaintResolutiontimeResult updateComplaintResolutiontime(java.lang.String key, java.lang.String complaintNo, java.lang.String imeino, java.lang.String faultType, java.lang.String latitude, java.lang.String longitude, java.lang.String remarks, java.lang.String resolutionStatus, java.lang.String resolution_Time, java.lang.String area_Power_Restored, java.lang.String restoration_Time) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.MarkComplaintReadResponseMarkComplaintReadResult markComplaintRead(java.lang.String key, java.lang.String complaintNo) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.BackGroundTestResponseBackGroundTestResult backGroundTest(java.lang.String key, java.lang.String _switch, java.lang.String passage) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.UpdateIMEILocationResponseUpdateIMEILocationResult updateIMEILocation(java.lang.String key, java.lang.String IMEINO, java.lang.String latitude, java.lang.String longitude, java.lang.String remarks) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.TestMethodResponseTestMethodResult testMethod(java.lang.String key, java.lang.String _switch, java.lang.String complaintNo, java.lang.String CA, java.lang.String faultCategory, java.lang.String faultType, java.lang.String closingRemark, java.lang.String otherRemarks, java.lang.String IMEI, java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException;
    public java.lang.String insertAndroidData(java.lang.String key, java.lang.String LATITUDE, java.lang.String LONGITUDE, java.lang.String IMAGE, java.lang.String NAME, java.lang.String CA_NO, java.lang.String EQUIPMENT_NO, java.lang.String CONTACT_NO, java.lang.String SUB_DIVISION, java.lang.String DIVISION, java.lang.String ELEMENT, java.lang.String TYPE_RISK, java.lang.String ADDRESS, java.lang.String MCD_ZONE) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GisLatLongResponseGisLatLongResult gisLatLong(java.lang.String key, java.lang.String longitude, java.lang.String latitude) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.UpdateSMSStatusResponseUpdateSMSStatusResult updateSMSStatus(java.lang.String key, java.lang.String REQUESTID, java.lang.String SENDER_ID, java.lang.String a2W_ACCEPT_DATE, java.lang.String a2W_STATUS, java.lang.String CARRIER_ACCEPT_DATE, java.lang.String a2W_REASON, java.lang.String CARRIER_DELIVERED_DATE, java.lang.String CARRIER_STATUS, java.lang.String CARRIER_STATUS_DESC) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetOutageAreasResponseGetOutageAreasResult getOutageAreas(java.lang.String key) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.OMSLoginResponseOMSLoginResult OMSLogin(java.lang.String key, java.lang.String uname, java.lang.String pwd) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.Get_CMS_MISResponseGet_CMS_MISResult get_CMS_MIS(java.lang.String key, java.lang.String division, java.lang.String category, java.lang.String start_date, java.lang.String end_date) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.FetchDivisionListResponseFetchDivisionListResult fetchDivisionList(java.lang.String key, java.lang.String circlename) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.Get_BD_MISResponseGet_BD_MISResult get_BD_MIS(java.lang.String key, java.lang.String circle, java.lang.String division, java.lang.String voltage, java.lang.String start_date, java.lang.String end_date, java.lang.String bd_type) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.Get_FC_MISResponseGet_FC_MISResult get_FC_MIS(java.lang.String key, java.lang.String circle, java.lang.String division, java.lang.String voltage, java.lang.String start_date, java.lang.String end_date, java.lang.String bd_type) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetDivisionPerformanceSummaryResponseGetDivisionPerformanceSummaryResult getDivisionPerformanceSummary(java.lang.String key, java.lang.String start_date, java.lang.String end_date, java.lang.String dps_type) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetRealTimeSummaryResponseGetRealTimeSummaryResult getRealTimeSummary(java.lang.String key, java.lang.String summary_type) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.Ps_recommendation_approvalResponsePs_recommendation_approvalResult ps_recommendation_approval(java.lang.String key, java.lang.String div_rights, java.lang.String role) throws java.rmi.RemoteException;
    public java.lang.String update_ps_recommendation_approval(java.lang.String key, java.lang.String ps_id, java.lang.String status, java.lang.String user, java.lang.String role) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.FetchCurrentTotalFaultsResponseFetchCurrentTotalFaultsResult fetchCurrentTotalFaults(java.lang.String key, java.lang.String division_rights) throws java.rmi.RemoteException;
    public java.lang.String get_Bill(java.lang.String key, java.lang.String month_MMM, java.lang.String year_YY, java.lang.String CANumber, java.lang.String phone) throws java.rmi.RemoteException;
    public java.lang.String get_CANo_From_Phone(java.lang.String key, java.lang.String phone) throws java.rmi.RemoteException;
    public java.lang.String update_OBD_Feedback(java.lang.String key, java.lang.String complaintNo, java.lang.String feedback) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetbreakdowndetailsResponseGetbreakdowndetailsResult getbreakdowndetails(java.lang.String key, java.lang.String IMEINO) throws java.rmi.RemoteException;
    public java.lang.String updatebreakdownreadstatsu(java.lang.String key, java.lang.String BD_ID) throws java.rmi.RemoteException;
    public java.lang.String getbreakdownstatus(java.lang.String key, java.lang.String BD_ID) throws java.rmi.RemoteException;
    public java.lang.String updatebreakdown(java.lang.String key, java.lang.String BD_ID, int newhour, int newminutes) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetbreakdownbackfeedlistResponseGetbreakdownbackfeedlistResult getbreakdownbackfeedlist(java.lang.String key, java.lang.String BD_ID) throws java.rmi.RemoteException;
    public java.lang.String updatebreakdownbackfeed(java.lang.String key, java.lang.String BD_ID, java.lang.String restoreddate, java.lang.String restoredload, java.lang.String restoresource, java.lang.String restoretype, java.lang.String remarks, java.lang.String selectedsource) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.UpdateBD_AndroidResponseUpdateBD_AndroidResult updateBD_Android(java.lang.String key, java.lang.String bd_id, java.lang.String android_time, java.lang.String latitude, java.lang.String longitude, java.lang.String remarks) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetNearByComplaintCentersResponseGetNearByComplaintCentersResult getNearByComplaintCenters(java.lang.String key, java.lang.String lat, java.lang.String _long) throws java.rmi.RemoteException;
    public com.bses2.sap.ws.GetConsumerDetailsFromCAResponseGetConsumerDetailsFromCAResult getConsumerDetailsFromCA(java.lang.String key, java.lang.String CANumber) throws java.rmi.RemoteException;
}
