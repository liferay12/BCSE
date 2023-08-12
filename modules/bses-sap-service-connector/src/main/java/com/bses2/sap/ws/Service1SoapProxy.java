package com.bses2.sap.ws;

public class Service1SoapProxy implements com.bses2.sap.ws.Service1Soap {
  private String _endpoint = null;
  private com.bses2.sap.ws.Service1Soap service1Soap = null;
  
  public Service1SoapProxy() {
    _initService1SoapProxy();
  }
  
  public Service1SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initService1SoapProxy();
  }
  
  private void _initService1SoapProxy() {
    try {
      service1Soap = (new com.bses2.sap.ws.Service1Locator()).getService1Soap();
      if (service1Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service1Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service1Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service1Soap != null)
      ((javax.xml.rpc.Stub)service1Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bses2.sap.ws.Service1Soap getService1Soap() {
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap;
  }
  
  public com.bses2.sap.ws.RegisterIVRSComplaintResponseRegisterIVRSComplaintResult registerIVRSComplaint(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String code) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.registerIVRSComplaint(key, CA, phone, code);
  }
  
  public com.bses2.sap.ws.RegisterIVRSComplaintTestResponseRegisterIVRSComplaintTestResult registerIVRSComplaintTest(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String code) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.registerIVRSComplaintTest(key, CA, phone, code);
  }
  
  public com.bses2.sap.ws.RegisterSMSComplaintResponseRegisterSMSComplaintResult registerSMSComplaint(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String code) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.registerSMSComplaint(key, CA, phone, code);
  }
  
  public com.bses2.sap.ws.RegisterWhatsappComplaintResponseRegisterWhatsappComplaintResult registerWhatsappComplaint(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String code) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.registerWhatsappComplaint(key, CA, phone, code);
  }
  
  public com.bses2.sap.ws.RegisterWebComplaintResponseRegisterWebComplaintResult registerWebComplaint(java.lang.String key, java.lang.String callerName, java.lang.String phone, java.lang.String address, java.lang.String email, java.lang.String CA, java.lang.String area, java.lang.String faultCategory, java.lang.String subFaultType, java.lang.String remarks, java.lang.String poleNo) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.registerWebComplaint(key, callerName, phone, address, email, CA, area, faultCategory, subFaultType, remarks, poleNo);
  }
  
  public com.bses2.sap.ws.RegisterSmartAppComplaintResponseRegisterSmartAppComplaintResult registerSmartAppComplaint(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String faultCategory, java.lang.String subFaultType, java.lang.String callerName, java.lang.String address, java.lang.String email, java.lang.String remarks) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.registerSmartAppComplaint(key, CA, phone, faultCategory, subFaultType, callerName, address, email, remarks);
  }
  
  public com.bses2.sap.ws.RegisterChatbotComplaintResponseRegisterChatbotComplaintResult registerChatbotComplaint(java.lang.String key, java.lang.String CA, java.lang.String phone, java.lang.String code) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.registerChatbotComplaint(key, CA, phone, code);
  }
  
  public com.bses2.sap.ws.GetComplaintStatusResponseGetComplaintStatusResult getComplaintStatus(java.lang.String key, java.lang.String complaintNo, java.lang.String imeiNo) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getComplaintStatus(key, complaintNo, imeiNo);
  }
  
  public com.bses2.sap.ws.GetComplaintDetailsCAResponseGetComplaintDetailsCAResult getComplaintDetailsCA(java.lang.String key, java.lang.String CANo) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getComplaintDetailsCA(key, CANo);
  }
  
  public com.bses2.sap.ws.GetDivisionsFromCompanyResponseGetDivisionsFromCompanyResult getDivisionsFromCompany(java.lang.String key, java.lang.String company) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getDivisionsFromCompany(key, company);
  }
  
  public com.bses2.sap.ws.GetCompCentersFromDivisionResponseGetCompCentersFromDivisionResult getCompCentersFromDivision(java.lang.String key, java.lang.String division) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getCompCentersFromDivision(key, division);
  }
  
  public com.bses2.sap.ws.GetAreasFromDivisionResponseGetAreasFromDivisionResult getAreasFromDivision(java.lang.String key, java.lang.String division) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getAreasFromDivision(key, division);
  }
  
  public com.bses2.sap.ws.GetFaultCategoriesResponseGetFaultCategoriesResult getFaultCategories(java.lang.String key) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getFaultCategories(key);
  }
  
  public com.bses2.sap.ws.GetFaultCategoriesWebResponseGetFaultCategoriesWebResult getFaultCategoriesWeb(java.lang.String key) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getFaultCategoriesWeb(key);
  }
  
  public com.bses2.sap.ws.GetFaultTypesFromCatResponseGetFaultTypesFromCatResult getFaultTypesFromCat(java.lang.String key, java.lang.String categoryCode) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getFaultTypesFromCat(key, categoryCode);
  }
  
  public com.bses2.sap.ws.GetAssignedComplaintsToTeamResponseGetAssignedComplaintsToTeamResult getAssignedComplaintsToTeam(java.lang.String key, java.lang.String IMEINO) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getAssignedComplaintsToTeam(key, IMEINO);
  }
  
  public com.bses2.sap.ws.GetClosingRemarksFromCategoryResponseGetClosingRemarksFromCategoryResult getClosingRemarksFromCategory(java.lang.String key, java.lang.String category) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getClosingRemarksFromCategory(key, category);
  }
  
  public com.bses2.sap.ws.CloseComplaintResponseCloseComplaintResult closeComplaint(java.lang.String key, java.lang.String complaintNo, java.lang.String CA, java.lang.String faultCategory, java.lang.String faultType, java.lang.String closingRemark, java.lang.String otherRemarks, java.lang.String IMEI, java.lang.String latitude, java.lang.String longitude, byte[] signatureData) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.closeComplaint(key, complaintNo, CA, faultCategory, faultType, closingRemark, otherRemarks, IMEI, latitude, longitude, signatureData);
  }
  
  public com.bses2.sap.ws.UpdateComplaintResolutiontimeResponseUpdateComplaintResolutiontimeResult updateComplaintResolutiontime(java.lang.String key, java.lang.String complaintNo, java.lang.String imeino, java.lang.String faultType, java.lang.String latitude, java.lang.String longitude, java.lang.String remarks, java.lang.String resolutionStatus, java.lang.String resolution_Time, java.lang.String area_Power_Restored, java.lang.String restoration_Time) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.updateComplaintResolutiontime(key, complaintNo, imeino, faultType, latitude, longitude, remarks, resolutionStatus, resolution_Time, area_Power_Restored, restoration_Time);
  }
  
  public com.bses2.sap.ws.MarkComplaintReadResponseMarkComplaintReadResult markComplaintRead(java.lang.String key, java.lang.String complaintNo) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.markComplaintRead(key, complaintNo);
  }
  
  public com.bses2.sap.ws.BackGroundTestResponseBackGroundTestResult backGroundTest(java.lang.String key, java.lang.String _switch, java.lang.String passage) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.backGroundTest(key, _switch, passage);
  }
  
  public com.bses2.sap.ws.UpdateIMEILocationResponseUpdateIMEILocationResult updateIMEILocation(java.lang.String key, java.lang.String IMEINO, java.lang.String latitude, java.lang.String longitude, java.lang.String remarks) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.updateIMEILocation(key, IMEINO, latitude, longitude, remarks);
  }
  
  public com.bses2.sap.ws.TestMethodResponseTestMethodResult testMethod(java.lang.String key, java.lang.String _switch, java.lang.String complaintNo, java.lang.String CA, java.lang.String faultCategory, java.lang.String faultType, java.lang.String closingRemark, java.lang.String otherRemarks, java.lang.String IMEI, java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.testMethod(key, _switch, complaintNo, CA, faultCategory, faultType, closingRemark, otherRemarks, IMEI, latitude, longitude);
  }
  
  public java.lang.String insertAndroidData(java.lang.String key, java.lang.String LATITUDE, java.lang.String LONGITUDE, java.lang.String IMAGE, java.lang.String NAME, java.lang.String CA_NO, java.lang.String EQUIPMENT_NO, java.lang.String CONTACT_NO, java.lang.String SUB_DIVISION, java.lang.String DIVISION, java.lang.String ELEMENT, java.lang.String TYPE_RISK, java.lang.String ADDRESS, java.lang.String MCD_ZONE) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.insertAndroidData(key, LATITUDE, LONGITUDE, IMAGE, NAME, CA_NO, EQUIPMENT_NO, CONTACT_NO, SUB_DIVISION, DIVISION, ELEMENT, TYPE_RISK, ADDRESS, MCD_ZONE);
  }
  
  public com.bses2.sap.ws.GisLatLongResponseGisLatLongResult gisLatLong(java.lang.String key, java.lang.String longitude, java.lang.String latitude) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.gisLatLong(key, longitude, latitude);
  }
  
  public com.bses2.sap.ws.UpdateSMSStatusResponseUpdateSMSStatusResult updateSMSStatus(java.lang.String key, java.lang.String REQUESTID, java.lang.String SENDER_ID, java.lang.String a2W_ACCEPT_DATE, java.lang.String a2W_STATUS, java.lang.String CARRIER_ACCEPT_DATE, java.lang.String a2W_REASON, java.lang.String CARRIER_DELIVERED_DATE, java.lang.String CARRIER_STATUS, java.lang.String CARRIER_STATUS_DESC) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.updateSMSStatus(key, REQUESTID, SENDER_ID, a2W_ACCEPT_DATE, a2W_STATUS, CARRIER_ACCEPT_DATE, a2W_REASON, CARRIER_DELIVERED_DATE, CARRIER_STATUS, CARRIER_STATUS_DESC);
  }
  
  public com.bses2.sap.ws.GetOutageAreasResponseGetOutageAreasResult getOutageAreas(java.lang.String key) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getOutageAreas(key);
  }
  
  public com.bses2.sap.ws.OMSLoginResponseOMSLoginResult OMSLogin(java.lang.String key, java.lang.String uname, java.lang.String pwd) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.OMSLogin(key, uname, pwd);
  }
  
  public com.bses2.sap.ws.Get_CMS_MISResponseGet_CMS_MISResult get_CMS_MIS(java.lang.String key, java.lang.String division, java.lang.String category, java.lang.String start_date, java.lang.String end_date) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.get_CMS_MIS(key, division, category, start_date, end_date);
  }
  
  public com.bses2.sap.ws.FetchDivisionListResponseFetchDivisionListResult fetchDivisionList(java.lang.String key, java.lang.String circlename) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.fetchDivisionList(key, circlename);
  }
  
  public com.bses2.sap.ws.Get_BD_MISResponseGet_BD_MISResult get_BD_MIS(java.lang.String key, java.lang.String circle, java.lang.String division, java.lang.String voltage, java.lang.String start_date, java.lang.String end_date, java.lang.String bd_type) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.get_BD_MIS(key, circle, division, voltage, start_date, end_date, bd_type);
  }
  
  public com.bses2.sap.ws.Get_FC_MISResponseGet_FC_MISResult get_FC_MIS(java.lang.String key, java.lang.String circle, java.lang.String division, java.lang.String voltage, java.lang.String start_date, java.lang.String end_date, java.lang.String bd_type) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.get_FC_MIS(key, circle, division, voltage, start_date, end_date, bd_type);
  }
  
  public com.bses2.sap.ws.GetDivisionPerformanceSummaryResponseGetDivisionPerformanceSummaryResult getDivisionPerformanceSummary(java.lang.String key, java.lang.String start_date, java.lang.String end_date, java.lang.String dps_type) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getDivisionPerformanceSummary(key, start_date, end_date, dps_type);
  }
  
  public com.bses2.sap.ws.GetRealTimeSummaryResponseGetRealTimeSummaryResult getRealTimeSummary(java.lang.String key, java.lang.String summary_type) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getRealTimeSummary(key, summary_type);
  }
  
  public com.bses2.sap.ws.Ps_recommendation_approvalResponsePs_recommendation_approvalResult ps_recommendation_approval(java.lang.String key, java.lang.String div_rights, java.lang.String role) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.ps_recommendation_approval(key, div_rights, role);
  }
  
  public java.lang.String update_ps_recommendation_approval(java.lang.String key, java.lang.String ps_id, java.lang.String status, java.lang.String user, java.lang.String role) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.update_ps_recommendation_approval(key, ps_id, status, user, role);
  }
  
  public com.bses2.sap.ws.FetchCurrentTotalFaultsResponseFetchCurrentTotalFaultsResult fetchCurrentTotalFaults(java.lang.String key, java.lang.String division_rights) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.fetchCurrentTotalFaults(key, division_rights);
  }
  
  public java.lang.String get_Bill(java.lang.String key, java.lang.String month_MMM, java.lang.String year_YY, java.lang.String CANumber, java.lang.String phone) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.get_Bill(key, month_MMM, year_YY, CANumber, phone);
  }
  
  public java.lang.String get_CANo_From_Phone(java.lang.String key, java.lang.String phone) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.get_CANo_From_Phone(key, phone);
  }
  
  public java.lang.String update_OBD_Feedback(java.lang.String key, java.lang.String complaintNo, java.lang.String feedback) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.update_OBD_Feedback(key, complaintNo, feedback);
  }
  
  public com.bses2.sap.ws.GetbreakdowndetailsResponseGetbreakdowndetailsResult getbreakdowndetails(java.lang.String key, java.lang.String IMEINO) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getbreakdowndetails(key, IMEINO);
  }
  
  public java.lang.String updatebreakdownreadstatsu(java.lang.String key, java.lang.String BD_ID) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.updatebreakdownreadstatsu(key, BD_ID);
  }
  
  public java.lang.String getbreakdownstatus(java.lang.String key, java.lang.String BD_ID) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getbreakdownstatus(key, BD_ID);
  }
  
  public java.lang.String updatebreakdown(java.lang.String key, java.lang.String BD_ID, int newhour, int newminutes) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.updatebreakdown(key, BD_ID, newhour, newminutes);
  }
  
  public com.bses2.sap.ws.GetbreakdownbackfeedlistResponseGetbreakdownbackfeedlistResult getbreakdownbackfeedlist(java.lang.String key, java.lang.String BD_ID) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getbreakdownbackfeedlist(key, BD_ID);
  }
  
  public java.lang.String updatebreakdownbackfeed(java.lang.String key, java.lang.String BD_ID, java.lang.String restoreddate, java.lang.String restoredload, java.lang.String restoresource, java.lang.String restoretype, java.lang.String remarks, java.lang.String selectedsource) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.updatebreakdownbackfeed(key, BD_ID, restoreddate, restoredload, restoresource, restoretype, remarks, selectedsource);
  }
  
  public com.bses2.sap.ws.UpdateBD_AndroidResponseUpdateBD_AndroidResult updateBD_Android(java.lang.String key, java.lang.String bd_id, java.lang.String android_time, java.lang.String latitude, java.lang.String longitude, java.lang.String remarks) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.updateBD_Android(key, bd_id, android_time, latitude, longitude, remarks);
  }
  
  public com.bses2.sap.ws.GetNearByComplaintCentersResponseGetNearByComplaintCentersResult getNearByComplaintCenters(java.lang.String key, java.lang.String lat, java.lang.String _long) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getNearByComplaintCenters(key, lat, _long);
  }
  
  public com.bses2.sap.ws.GetConsumerDetailsFromCAResponseGetConsumerDetailsFromCAResult getConsumerDetailsFromCA(java.lang.String key, java.lang.String CANumber) throws java.rmi.RemoteException{
    if (service1Soap == null)
      _initService1SoapProxy();
    return service1Soap.getConsumerDetailsFromCA(key, CANumber);
  }
  
  
}