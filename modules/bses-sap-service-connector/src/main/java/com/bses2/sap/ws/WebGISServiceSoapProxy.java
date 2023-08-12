package com.bses2.sap.ws;

public class WebGISServiceSoapProxy implements com.bses2.sap.ws.WebGISServiceSoap {
  private String _endpoint = null;
  private com.bses2.sap.ws.WebGISServiceSoap webGISServiceSoap = null;
  
  public WebGISServiceSoapProxy() {
    _initWebGISServiceSoapProxy();
  }
  
  public WebGISServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebGISServiceSoapProxy();
  }
  
  private void _initWebGISServiceSoapProxy() {
    try {
      webGISServiceSoap = (new com.bses2.sap.ws.WebGISServiceLocator()).getWebGISServiceSoap();
      if (webGISServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webGISServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webGISServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webGISServiceSoap != null)
      ((javax.xml.rpc.Stub)webGISServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bses2.sap.ws.WebGISServiceSoap getWebGISServiceSoap() {
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap;
  }
  
  public com.bses2.sap.ws.Get_Area_Details_forLcdResponseGet_Area_Details_forLcdResult get_Area_Details_forLcd(java.lang.String objectid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Area_Details_forLcd(objectid);
  }
  
  public com.bses2.sap.ws.GetassetreportbydivResponseGetassetreportbydivResult getassetreportbydiv(java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getassetreportbydiv(divcd);
  }
  
  public com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponseGetSensorOIL_TEMPHyperlinkResult getSensorOIL_TEMPHyperlink(java.lang.String IMEINO, java.lang.String DTTYPE) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getSensorOIL_TEMPHyperlink(IMEINO, DTTYPE);
  }
  
  public com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponseGetSensorR_TEMPHyperlinkResult getSensorR_TEMPHyperlink(java.lang.String IMEINO, java.lang.String DTTYPE) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getSensorR_TEMPHyperlink(IMEINO, DTTYPE);
  }
  
  public com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponseGetSensorY_TEMPHyperlinkResult getSensorY_TEMPHyperlink(java.lang.String IMEINO, java.lang.String DTTYPE) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getSensorY_TEMPHyperlink(IMEINO, DTTYPE);
  }
  
  public com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponseGetSensorB_TEMPHyperlinkResult getSensorB_TEMPHyperlink(java.lang.String IMEINO, java.lang.String DTTYPE) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getSensorB_TEMPHyperlink(IMEINO, DTTYPE);
  }
  
  public com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponseGetSensorN_TEMPHyperlinkResult getSensorN_TEMPHyperlink(java.lang.String IMEINO, java.lang.String DTTYPE) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getSensorN_TEMPHyperlink(IMEINO, DTTYPE);
  }
  
  public com.bses2.sap.ws.Get_EHVstatus_list_1ResponseGet_EHVstatus_list_1Result get_EHVstatus_list_1(java.lang.String gridid, java.lang.String feederkv, java.lang.String[] feederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_EHVstatus_list_1(gridid, feederkv, feederid);
  }
  
  public com.bses2.sap.ws.Get_EHV11Status_listResponseGet_EHV11Status_listResult get_EHV11Status_list(java.lang.String gridid, java.lang.String[] ptcd, java.lang.String feederkv, java.lang.String[] feederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_EHV11Status_list(gridid, ptcd, feederkv, feederid);
  }
  
  public java.lang.String get_Areabypole(java.lang.String polestr) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Areabypole(polestr);
  }
  
  public com.bses2.sap.ws.Get_PoleDetails_2ResponseGet_PoleDetails_2Result get_PoleDetails_2(java.lang.String gridid, java.lang.String feederid, java.lang.String sapfunctio, java.lang.String dtcode, java.lang.String ltfeeder) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_PoleDetails_2(gridid, feederid, sapfunctio, dtcode, ltfeeder);
  }
  
  public com.bses2.sap.ws.Get_poleDeatils_3ResponseGet_poleDeatils_3Result get_poleDeatils_3(java.lang.String dtcode) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_poleDeatils_3(dtcode);
  }
  
  public com.bses2.sap.ws.Get_ConsumerPoleDetails_2ResponseGet_ConsumerPoleDetails_2Result get_ConsumerPoleDetails_2(java.lang.String gridid, java.lang.String feederid, java.lang.String sapfunctio, java.lang.String dtcode, java.lang.String ltfeeder) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_ConsumerPoleDetails_2(gridid, feederid, sapfunctio, dtcode, ltfeeder);
  }
  
  public java.lang.String get_Areabypole_2Consumer(java.lang.String polestr) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Areabypole_2Consumer(polestr);
  }
  
  public java.lang.String[] get_Areabypole_2(java.lang.String polestr) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Areabypole_2(polestr);
  }
  
  public java.lang.String[] get_AreabyDT(java.lang.String polestr) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_AreabyDT(polestr);
  }
  
  public com.bses2.sap.ws.Get_status_listResponseGet_status_listResult get_status_list(java.lang.String gridid, java.lang.String feederid, java.lang.String[] subsid, java.lang.String[] dtid, java.lang.String[] ltfdrid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_status_list(gridid, feederid, subsid, dtid, ltfdrid);
  }
  
  public com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponseGet_AutoTrip_feederdetailsResult get_AutoTrip_feederdetails(java.lang.String switchid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_AutoTrip_feederdetails(switchid);
  }
  
  public com.bses2.sap.ws.Get_HT_feederSection_varResponseGet_HT_feederSection_varResult get_HT_feederSection_var(java.lang.String feederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_HT_feederSection_var(feederid);
  }
  
  public com.bses2.sap.ws.Get_HTgridlistResponseGet_HTgridlistResult get_HTgridlist(java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_HTgridlist(divcd);
  }
  
  public com.bses2.sap.ws.Get_HTgridlist_varResponseGet_HTgridlist_varResult get_HTgridlist_var(java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_HTgridlist_var(divcd);
  }
  
  public com.bses2.sap.ws.Get_HTgridlist_varAllDivisionsResponseGet_HTgridlist_varAllDivisionsResult get_HTgridlist_varAllDivisions(java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_HTgridlist_varAllDivisions(divcd);
  }
  
  public com.bses2.sap.ws.Get_HT_feederlist_varAllDivisionsResponseGet_HT_feederlist_varAllDivisionsResult get_HT_feederlist_varAllDivisions(java.lang.String stationfac, java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_HT_feederlist_varAllDivisions(stationfac, divcd);
  }
  
  public com.bses2.sap.ws.Get_PolelistResponseGet_PolelistResult get_Polelist(java.lang.String ltfeedercode) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Polelist(ltfeedercode);
  }
  
  public com.bses2.sap.ws.Get_backfeedlist_feederResponseGet_backfeedlist_feederResult get_backfeedlist_feeder(java.lang.String feederidz) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_backfeedlist_feeder(feederidz);
  }
  
  public com.bses2.sap.ws.Get_Cable_sectionResponseGet_Cable_sectionResult get_Cable_section(java.lang.String feederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Cable_section(feederid);
  }
  
  public com.bses2.sap.ws.Get_Cable_section_CloseResponseGet_Cable_section_CloseResult get_Cable_section_Close(java.lang.String feederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Cable_section_Close(feederid);
  }
  
  public com.bses2.sap.ws.Get_EHVstatus_listResponseGet_EHVstatus_listResult get_EHVstatus_list(java.lang.String gridid, java.lang.String feederkv, java.lang.String[] feederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_EHVstatus_list(gridid, feederkv, feederid);
  }
  
  public com.bses2.sap.ws.Get_Area_Details_forconstituencyResponseGet_Area_Details_forconstituencyResult get_Area_Details_forconstituency(java.lang.String objectid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Area_Details_forconstituency(objectid);
  }
  
  public com.bses2.sap.ws.GetMidasDisc_dataResponseGetMidasDisc_dataResult getMidasDisc_data(java.lang.String div) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getMidasDisc_data(div);
  }
  
  public com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponseGetSubstationDetailsPIsurveyResult getSubstationDetailsPIsurvey(java.lang.String facilityid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getSubstationDetailsPIsurvey(facilityid);
  }
  
  public com.bses2.sap.ws.Get_ConsumerListMultipleResponseGet_ConsumerListMultipleResult get_ConsumerListMultiple(java.lang.String poleid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_ConsumerListMultiple(poleid);
  }
  
  public com.bses2.sap.ws.Get_Poles_From_SubstationsResponseGet_Poles_From_SubstationsResult get_Poles_From_Substations(java.lang.String ltfeederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Poles_From_Substations(ltfeederid);
  }
  
  public com.bses2.sap.ws.GetRMUDetailsPIResponseGetRMUDetailsPIResult getRMUDetailsPI(java.lang.String subsid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getRMUDetailsPI(subsid);
  }
  
  public com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponseGet_ComplaintCenter_ContactNoResult get_ComplaintCenter_ContactNo(java.lang.String ccId) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_ComplaintCenter_ContactNo(ccId);
  }
  
  public com.bses2.sap.ws.Get_ConsumerLoadResponseGet_ConsumerLoadResult get_ConsumerLoad(java.lang.String[] ltFDRList) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_ConsumerLoad(ltFDRList);
  }
  
  public com.bses2.sap.ws.GetPolesbyAreaResponseGetPolesbyAreaResult getPolesbyArea(java.lang.String areas) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getPolesbyArea(areas);
  }
  
  public com.bses2.sap.ws.Get_dtAreaResponseGet_dtAreaResult get_dtArea(java.lang.String SAPFUNCTIO, java.lang.String poleno, java.lang.String CANumber) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_dtArea(SAPFUNCTIO, poleno, CANumber);
  }
  
  public com.bses2.sap.ws.Get_AreaforCAResponseGet_AreaforCAResult get_AreaforCA(java.lang.String DT, java.lang.String SAPFUNCTIO, java.lang.String poleno, java.lang.String CANumber) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_AreaforCA(DT, SAPFUNCTIO, poleno, CANumber);
  }
  
  public com.bses2.sap.ws.Z_BAPI_DSS_ISU_CA_DISPLAYResponseZ_BAPI_DSS_ISU_CA_DISPLAYResult z_BAPI_DSS_ISU_CA_DISPLAY(java.lang.String strCANumber) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.z_BAPI_DSS_ISU_CA_DISPLAY(strCANumber);
  }
  
  public com.bses2.sap.ws.Get_BD_DetailsResponseGet_BD_DetailsResult get_BD_Details(java.lang.String externalId) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_BD_Details(externalId);
  }
  
  public com.bses2.sap.ws.Get_Company_listResponseGet_Company_listResult get_Company_list() throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Company_list();
  }
  
  public com.bses2.sap.ws.Get_Circle_listResponseGet_Circle_listResult get_Circle_list(java.lang.String company) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Circle_list(company);
  }
  
  public com.bses2.sap.ws.Get_CirclebyDivisionResponseGet_CirclebyDivisionResult get_CirclebyDivision(java.lang.String divisionName) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_CirclebyDivision(divisionName);
  }
  
  public com.bses2.sap.ws.Get_Circle_DetailsResponseGet_Circle_DetailsResult get_Circle_Details(java.lang.String circle) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Circle_Details(circle);
  }
  
  public com.bses2.sap.ws.Get_Division_listResponseGet_Division_listResult get_Division_list(java.lang.String circle) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Division_list(circle);
  }
  
  public com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponseGet_Affected_ConsumerAndLoadResult get_Affected_ConsumerAndLoad(java.lang.String dtlist) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Affected_ConsumerAndLoad(dtlist);
  }
  
  public com.bses2.sap.ws.Get_Division_detailsResponseGet_Division_detailsResult get_Division_details(java.lang.String division_code) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Division_details(division_code);
  }
  
  public com.bses2.sap.ws.Get_Sub_Division_listResponseGet_Sub_Division_listResult get_Sub_Division_list(java.lang.String divsionCode) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Sub_Division_list(divsionCode);
  }
  
  public com.bses2.sap.ws.Get_Sub_Division_detailsResponseGet_Sub_Division_detailsResult get_Sub_Division_details(java.lang.String subdivision_code) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Sub_Division_details(subdivision_code);
  }
  
  public com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult get_Area_list(java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Area_list(divcd);
  }
  
  public com.bses2.sap.ws.Get_ltfeederlistResponseGet_ltfeederlistResult get_ltfeederlist(java.lang.String DTequipmentcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_ltfeederlist(DTequipmentcd);
  }
  
  public com.bses2.sap.ws.Get_Cable_sectionHTResponseGet_Cable_sectionHTResult get_Cable_sectionHT(java.lang.String feederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Cable_sectionHT(feederid);
  }
  
  public com.bses2.sap.ws.Get_Cable_sectionltResponseGet_Cable_sectionltResult get_Cable_sectionlt(java.lang.String feederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Cable_sectionlt(feederid);
  }
  
  public com.bses2.sap.ws.Get_Complaint_Center_listResponseGet_Complaint_Center_listResult get_Complaint_Center_list(java.lang.String divisioncode) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Complaint_Center_list(divisioncode);
  }
  
  public com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult get_area_details_Circle(java.lang.String objectid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_area_details_Circle(objectid);
  }
  
  public com.bses2.sap.ws.Get_EHVfeederName_1ResponseGet_EHVfeederName_1Result get_EHVfeederName_1(java.lang.String[] feederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_EHVfeederName_1(feederid);
  }
  
  public com.bses2.sap.ws.Get_EHVPTlistResponseGet_EHVPTlistResult get_EHVPTlist(java.lang.String gridid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_EHVPTlist(gridid);
  }
  
  public com.bses2.sap.ws.Get_EHVgridlistResponseGet_EHVgridlistResult get_EHVgridlist(java.lang.String circle) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_EHVgridlist(circle);
  }
  
  public com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponseGet_PoleDetailsbyltfeederResult get_PoleDetailsbyltfeeder(java.lang.String LTFeeder) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_PoleDetailsbyltfeeder(LTFeeder);
  }
  
  public com.bses2.sap.ws.Get_Poles_From_LTFeedersResponseGet_Poles_From_LTFeedersResult get_Poles_From_LTFeeders(java.lang.String LTFeeders) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Poles_From_LTFeeders(LTFeeders);
  }
  
  public com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponseGet_Area_DetailsmultiplebydivResult get_Area_Detailsmultiplebydiv(java.lang.String objectid, java.lang.String division) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Area_Detailsmultiplebydiv(objectid, division);
  }
  
  public com.bses2.sap.ws.Get_Subslist_varResponseGet_Subslist_varResult get_Subslist_var(java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Subslist_var(divcd);
  }
  
  public com.bses2.sap.ws.Get_Complaint_Center_DetailsResponseGet_Complaint_Center_DetailsResult get_Complaint_Center_Details(java.lang.String complaintCentre) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Complaint_Center_Details(complaintCentre);
  }
  
  public com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult complaintStatus(java.lang.String complaintNoOR_CANo) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.complaintStatus(complaintNoOR_CANo);
  }
  
  public com.bses2.sap.ws.ComplaintStatusDetailsResponseComplaintStatusDetailsResult complaintStatusDetails(java.lang.String CA) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.complaintStatusDetails(CA);
  }
  
  public com.bses2.sap.ws.GetFaultCatResponseGetFaultCatResult getFaultCat() throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getFaultCat();
  }
  
  public com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult getSubFaultCat(java.lang.String category) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getSubFaultCat(category);
  }
  
  public com.bses2.sap.ws.ComplaintRegistrationAppResponseComplaintRegistrationAppResult complaintRegistrationApp(java.lang.String key, java.lang.String callerName, java.lang.String phone, java.lang.String add, java.lang.String email, java.lang.String CA, java.lang.String area, java.lang.String faultCategoryCode, java.lang.String subFaultCategoryName, java.lang.String remarks, java.lang.String CODE) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.complaintRegistrationApp(key, callerName, phone, add, email, CA, area, faultCategoryCode, subFaultCategoryName, remarks, CODE);
  }
  
  public com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult complaintRegistrationWeb_Area(java.lang.String areaName, java.lang.String callerName, java.lang.String callerPhone, java.lang.String address, java.lang.String FAULT_CAT, java.lang.String FAULT_TYPE, java.lang.String comp_Center_Code, java.lang.String circle, java.lang.String division, java.lang.String AREA_OBJECTID, java.lang.String st_Light_Location, java.lang.String remarks, java.lang.String source) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.complaintRegistrationWeb_Area(areaName, callerName, callerPhone, address, FAULT_CAT, FAULT_TYPE, comp_Center_Code, circle, division, AREA_OBJECTID, st_Light_Location, remarks, source);
  }
  
  public com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult complaintRegistrationWeb(java.lang.String key, java.lang.String callerName, java.lang.String phone, java.lang.String add, java.lang.String email, java.lang.String CA, java.lang.String area, java.lang.String faultCategoryCode, java.lang.String subFaultCategoryName, java.lang.String remarks, java.lang.String CODE, java.lang.String poleNum) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.complaintRegistrationWeb(key, callerName, phone, add, email, CA, area, faultCategoryCode, subFaultCategoryName, remarks, CODE, poleNum);
  }
  
  public com.bses2.sap.ws.BRPL_OutletResponseBRPL_OutletResult BRPL_Outlet() throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.BRPL_Outlet();
  }
  
  public com.bses2.sap.ws.Get_substationindivResponseGet_substationindivResult get_substationindiv(java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_substationindiv(divcd);
  }
  
  public com.bses2.sap.ws.GetSubstationlistResponseGetSubstationlistResult getSubstationlist(java.lang.String subdivision) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getSubstationlist(subdivision);
  }
  
  public com.bses2.sap.ws.GetSubstationDetailsforsurveyResponseGetSubstationDetailsforsurveyResult getSubstationDetailsforsurvey(java.lang.String facilityid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getSubstationDetailsforsurvey(facilityid);
  }
  
  public com.bses2.sap.ws.Get_SubstationDetailsby_divResponseGet_SubstationDetailsby_divResult get_SubstationDetailsby_div(java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_SubstationDetailsby_div(divcd);
  }
  
  public com.bses2.sap.ws.Get_substation_detailsResponseGet_substation_detailsResult get_substation_details(java.lang.String stationFacilityid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_substation_details(stationFacilityid);
  }
  
  public com.bses2.sap.ws.Get_Poles_From_DTsResponseGet_Poles_From_DTsResult get_Poles_From_DTs(java.lang.String DTID) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Poles_From_DTs(DTID);
  }
  
  public java.lang.String forFeedername(java.lang.String feederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.forFeedername(feederid);
  }
  
  public com.bses2.sap.ws.Get_Feeder_StatusResponseGet_Feeder_StatusResult get_Feeder_Status(java.lang.String swids) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Feeder_Status(swids);
  }
  
  public com.bses2.sap.ws.Get_ltfeederlist1ResponseGet_ltfeederlist1Result get_ltfeederlist1(java.lang.String dtcode) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_ltfeederlist1(dtcode);
  }
  
  public java.lang.String get_cablesinltfdr(java.lang.String ltfdrcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_cablesinltfdr(ltfdrcd);
  }
  
  public com.bses2.sap.ws.Get_Cable_sectionlt1ResponseGet_Cable_sectionlt1Result get_Cable_sectionlt1(java.lang.String ltfdrID) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Cable_sectionlt1(ltfdrID);
  }
  
  public com.bses2.sap.ws.Get_backfeedlist_dtResponseGet_backfeedlist_dtResult get_backfeedlist_dt(java.lang.String[] dtcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_backfeedlist_dt(dtcd);
  }
  
  public com.bses2.sap.ws.Get_Cable_section_detailResponseGet_Cable_section_detailResult get_Cable_section_detail(java.lang.String cblID) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Cable_section_detail(cblID);
  }
  
  public com.bses2.sap.ws.Get_Cable_section_detail1ResponseGet_Cable_section_detail1Result get_Cable_section_detail1(java.lang.String cblID) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Cable_section_detail1(cblID);
  }
  
  public com.bses2.sap.ws.GetfeedernameResponseGetfeedernameResult getfeedername() throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getfeedername();
  }
  
  public com.bses2.sap.ws.GetfeederNMResponseGetfeederNMResult getfeederNM(java.lang.String feederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getfeederNM(feederid);
  }
  
  public com.bses2.sap.ws.GetDTNameResponseGetDTNameResult getDTName(java.lang.String dt) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getDTName(dt);
  }
  
  public com.bses2.sap.ws.GetCircuitBySubstationResponseGetCircuitBySubstationResult getCircuitBySubstation(java.lang.String substation) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getCircuitBySubstation(substation);
  }
  
  public com.bses2.sap.ws.Get_dtlistResponseGet_dtlistResult get_dtlist(java.lang.String SAPFUNCTIO) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_dtlist(SAPFUNCTIO);
  }
  
  public com.bses2.sap.ws.For_DT_FirResponseFor_DT_FirResult for_DT_Fir(java.lang.String stationFacilityid, java.lang.String dtcode) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.for_DT_Fir(stationFacilityid, dtcode);
  }
  
  public com.bses2.sap.ws.GetacbResponseGetacbResult getacb(java.lang.String subsid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getacb(subsid);
  }
  
  public com.bses2.sap.ws.ValidatepoleResponseValidatepoleResult validatepole(java.lang.String poleno) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.validatepole(poleno);
  }
  
  public com.bses2.sap.ws.GetCADetailsResponseGetCADetailsResult getCADetails(java.lang.String ca) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getCADetails(ca);
  }
  
  public com.bses2.sap.ws.Get_feederpillarResponseGet_feederpillarResult get_feederpillar(java.lang.String ltfeederid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_feederpillar(ltfeederid);
  }
  
  public com.bses2.sap.ws.Get_HT_feederlistResponseGet_HT_feederlistResult get_HT_feederlist(java.lang.String stationfac, java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_HT_feederlist(stationfac, divcd);
  }
  
  public com.bses2.sap.ws.Get_EHVfeederlist_1ResponseGet_EHVfeederlist_1Result get_EHVfeederlist_1(java.lang.String gridcd, java.lang.String feederkv) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_EHVfeederlist_1(gridcd, feederkv);
  }
  
  public com.bses2.sap.ws.Get_EHVfeederlist_TestResponseGet_EHVfeederlist_TestResult get_EHVfeederlist_Test() throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_EHVfeederlist_Test();
  }
  
  public com.bses2.sap.ws.Get_Area_list1ResponseGet_Area_list1Result get_Area_list1(java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_Area_list1(divcd);
  }
  
  public com.bses2.sap.ws.Get_EHV11FeederlistResponseGet_EHV11FeederlistResult get_EHV11Feederlist(java.lang.String ptcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_EHV11Feederlist(ptcd);
  }
  
  public com.bses2.sap.ws.GetgridnameResponseGetgridnameResult getgridname() throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getgridname();
  }
  
  public com.bses2.sap.ws.Getgridname1ResponseGetgridname1Result getgridname1() throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getgridname1();
  }
  
  public com.bses2.sap.ws.GetCCfromZoneResponseGetCCfromZoneResult getCCfromZone(java.lang.String zoneID) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getCCfromZone(zoneID);
  }
  
  public com.bses2.sap.ws.Get_EHVfeederlist_2ResponseGet_EHVfeederlist_2Result get_EHVfeederlist_2(java.lang.String gridcd, java.lang.String feederkv) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_EHVfeederlist_2(gridcd, feederkv);
  }
  
  public com.bses2.sap.ws.Get_HT_feederlist_varResponseGet_HT_feederlist_varResult get_HT_feederlist_var(java.lang.String stationfac, java.lang.String divcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_HT_feederlist_var(stationfac, divcd);
  }
  
  public com.bses2.sap.ws.GetMidas_dataResponseGetMidas_dataResult getMidas_data(java.lang.String div) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getMidas_data(div);
  }
  
  public com.bses2.sap.ws.Midas_breakdownResponseMidas_breakdownResult midas_breakdown(java.lang.String sapid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.midas_breakdown(sapid);
  }
  
  public com.bses2.sap.ws.Get_backfeedlist_substationResponseGet_backfeedlist_substationResult get_backfeedlist_substation(java.lang.String[] sapfunction) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_backfeedlist_substation(sapfunction);
  }
  
  public java.lang.String get_cableslength(java.lang.String sectionid, java.lang.String type) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_cableslength(sectionid, type);
  }
  
  public java.lang.String get_FDRNames(java.lang.String ltfdrcd) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_FDRNames(ltfdrcd);
  }
  
  public com.bses2.sap.ws.Get_HTFDRNamesResponseGet_HTFDRNamesResult get_HTFDRNames(java.lang.String feederID) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.get_HTFDRNames(feederID);
  }
  
  public com.bses2.sap.ws.GetrmuResponseGetrmuResult getrmu(java.lang.String subsid) throws java.rmi.RemoteException{
    if (webGISServiceSoap == null)
      _initWebGISServiceSoapProxy();
    return webGISServiceSoap.getrmu(subsid);
  }
  
  
}