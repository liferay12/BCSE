package com.bses2.sap.ws;

import java.rmi.RemoteException;

public class WebServiceSoapProxy implements com.bses2.sap.ws.WebServiceSoap {
  private String _endpoint = null;
  private com.bses2.sap.ws.WebServiceSoap webServiceSoap = null;
  
  public WebServiceSoapProxy() {
    _initWebServiceSoapProxy();
  }
  
  public WebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceSoapProxy();
  }
  
  private void _initWebServiceSoapProxy() {
    try {
      webServiceSoap = (new com.bses2.sap.ws.WebServiceLocator()).getWebServiceSoap();
      if (webServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceSoap != null)
      ((javax.xml.rpc.Stub)webServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.bses2.sap.ws.WebServiceSoap getWebServiceSoap() {
    if (webServiceSoap == null)
      _initWebServiceSoapProxy();
    return webServiceSoap;
  }

@Override
public ZBAPIDOCLISTResponseZBAPIDOCLISTResult ZBAPIDOCLIST(String strAufnr, String strC_001, String strC_002,
		String strC_003, String strC_004, String strC_005, String strC_007, String strC_008, String strC_009,
		String strC_010, String strC_011, String strC_012, String strC_013, String strC_014, String strC_015,
		String strC_016, String strC_017, String strC_018, String strC_019, String strC_020, String strC_021,
		String strC_022, String strC_023, String strC_024, String strC_025, String strC_026, String strC_027,
		String strC_028, String strC_029, String strC_030, String strC_031, String strC_032, String strC_033,
		String strC_034, String strC_035, String strC_036, String strC_037, String strC_038, String strC_039,
		String strC_040, String strC_041, String strC_070, String strR_Cdll, String strR_Occ, String strR_Own,
		String strZ_Appltype) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPIDOCLIST(strAufnr, strC_001, strC_002, strC_003, strC_004, strC_005, strC_007, strC_008, strC_009, strC_010, strC_011, strC_012, strC_013, strC_014, strC_015, strC_016, strC_017, strC_018, strC_019, strC_020, strC_021, strC_022, strC_023, strC_024, strC_025, strC_026, strC_027, strC_028, strC_029, strC_030, strC_031, strC_032, strC_033, strC_034, strC_035, strC_036, strC_037, strC_038, strC_039, strC_040, strC_041, strC_070, strR_Cdll, strR_Occ, strR_Own, strZ_Appltype);
}

@Override
public ZBAPI_DISPLAY_BILL_WEBResponseZBAPI_DISPLAY_BILL_WEBResult ZBAPI_DISPLAY_BILL_WEB(String strCANumber,
		String strBillMonth) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_DISPLAY_BILL_WEB(strCANumber, strBillMonth);
}

@Override
public ZBAPI_IVR_CREATESO_ISUResponseZBAPI_IVR_CREATESO_ISUResult ZBAPI_IVR_CREATESO_ISU(String strCANumber,
		String strCACrn, String strCAKNumber, String strMeterNumber, String strISUOrder, String strComplaintType,
		String strContractNumber, String strTelephoneNo, String strDescription) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_IVR_CREATESO_ISU(strCANumber, strCACrn, strCAKNumber, strMeterNumber, strISUOrder, strComplaintType, strContractNumber, strTelephoneNo, strDescription);
}

@Override
public Z_BAPI_CMS_ISU_CA_DISPLAYResponseZ_BAPI_CMS_ISU_CA_DISPLAYResult z_BAPI_CMS_ISU_CA_DISPLAY(String strCANumber,
		String strSerialNumber, String strConsumerNumber, String strTelephoneNumber, String strKNumber,
		String strContractNumber) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.z_BAPI_CMS_ISU_CA_DISPLAY(strCANumber, strSerialNumber, strConsumerNumber, strTelephoneNumber, strKNumber, strContractNumber);
}

@Override
public ZBAPI_CREATESO_POSTResponseZBAPI_CREATESO_POSTResult ZBAPI_CREATESO_POST(String strPMAufart, String strPlanPlant,
		String strRegioGroup, String strShortText, String strILA, String strMFText, String strUserFieldCH20,
		String strControkey, String strSerialNumber, String strComplaintGroup, String strCANumber, String strContract,
		String strMFText1) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_CREATESO_POST(strPMAufart, strPlanPlant, strRegioGroup, strShortText, strILA, strMFText, strUserFieldCH20, strControkey, strSerialNumber, strComplaintGroup, strCANumber, strContract, strMFText1);
}

@Override
public ZBAPI_CALERTResponseZBAPI_CALERTResult ZBAPI_CALERT(String strCompanyCode, String strDate, String strDivision,
		String strUnit) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_CALERT(strCompanyCode, strDate, strDivision, strUnit);
}

@Override
public ZBAPI_ONLINE_BILL_PDFResponseZBAPI_ONLINE_BILL_PDFResult ZBAPI_ONLINE_BILL_PDF(String strCANumber,
		String strEBSKNO) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_ONLINE_BILL_PDF(strCANumber, strEBSKNO);
}

@Override
public ZBAPI_DSS_SOResponseZBAPI_DSS_SOResult ZBAPI_DSS_SO(String PARTNERCATEGORY, String PARTNERTYPE, String TITLE_KEY,
		String FIRSTNAME, String LASTNAME, String MIDDLENAME, String FATHERSNAME, String HOUSE_NO, String BUILDING,
		String STR_SUPPL1, String STR_SUPPL2, String STR_SUPPL3, String POSTL_COD1, String CITY, String e_MAIL,
		String LANDLINE, String MOBILE, String FEMALE, String MALE, String JOBGR, String LEGITTYPE, String IDNUMBER,
		String ORDER_TYPE, String SHORTTEXT, String PLANNINGPLANT, String WORKCENTRE, String SYSTEMCOND,
		String PMACTIVITYTYPE, String REQUESTNUM, String NNUMBER, String APPLIEDCAT, String APPLIEDLOAD,
		String CONNECTIONTYPE, String ORDERID, String FLAG) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_DSS_SO(PARTNERCATEGORY, PARTNERTYPE, TITLE_KEY, FIRSTNAME, LASTNAME, MIDDLENAME, FATHERSNAME, HOUSE_NO, BUILDING, STR_SUPPL1, STR_SUPPL2, STR_SUPPL3, POSTL_COD1, CITY, e_MAIL, LANDLINE, MOBILE, FEMALE, MALE, JOBGR, LEGITTYPE, IDNUMBER, ORDER_TYPE, SHORTTEXT, PLANNINGPLANT, WORKCENTRE, SYSTEMCOND, PMACTIVITYTYPE, REQUESTNUM, NNUMBER, APPLIEDCAT, APPLIEDLOAD, CONNECTIONTYPE, ORDERID, FLAG);
}

@Override
public ZBAPI_DSS_SO_ECCResponseZBAPI_DSS_SO_ECCResult ZBAPI_DSS_SO_ECC(String PARTNERCATEGORY, String PARTNERTYPE,
		String TITLE_KEY, String FIRSTNAME, String LASTNAME, String MIDDLENAME, String FATHERSNAME, String HOUSE_NO,
		String BUILDING, String STR_SUPPL1, String STR_SUPPL2, String STR_SUPPL3, String POSTL_COD1, String CITY,
		String e_MAIL, String LANDLINE, String MOBILE, String FEMALE, String MALE, String JOBGR, String IDTYPE,
		String IDNUMBER, String ORDER_TYPE, String SHORTTEXT, String PLANNINGPLANT, String WORKCENTRE,
		String SYSTEMCOND, String PMACTIVITYTYPE, String REQUESTNUM, String NNUMBER, String APPLIEDCAT,
		String APPLIEDLOAD, String CONNECTIONTYPE, String ORDERID, String FLAG) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_DSS_SO_ECC(PARTNERCATEGORY, PARTNERTYPE, TITLE_KEY, FIRSTNAME, LASTNAME, MIDDLENAME, FATHERSNAME, HOUSE_NO, BUILDING, STR_SUPPL1, STR_SUPPL2, STR_SUPPL3, POSTL_COD1, CITY, e_MAIL, LANDLINE, MOBILE, FEMALE, MALE, JOBGR, IDTYPE, IDNUMBER, ORDER_TYPE, SHORTTEXT, PLANNINGPLANT, WORKCENTRE, SYSTEMCOND, PMACTIVITYTYPE, REQUESTNUM, NNUMBER, APPLIEDCAT, APPLIEDLOAD, CONNECTIONTYPE, ORDERID, FLAG);
}

@Override
public Z_BAPI_ZDSS_WEB_LINKResponseZ_BAPI_ZDSS_WEB_LINKResult z_BAPI_ZDSS_WEB_LINK(String i_ILART, String i_VKONT,
		String i_VKONA, String PARTNERCATEGORY, String PARTNERTYPE, String TITLE_KEY, String FIRSTNAME, String LASTNAME,
		String MIDDLENAME, String FATHERSNAME, String HOUSE_NO, String BUILDING, String STR_SUPPL1, String STR_SUPPL2,
		String STR_SUPPL3, String POSTL_COD1, String CITY, String e_MAIL, String LANDLINE, String MOBILE, String FEMALE,
		String MALE, String JOBGR, String IDTYPE, String IDNUMBER, String PLANNINGPLANT, String WORKCENTRE,
		String SYSTEMCOND, String APPLIEDCAT, String APPLIEDLOAD, String APPLIEDLOADKVA, String CONNECTIONTYPE,
		String STATEMENT_CA, String START_DATE, String START_TIME, String FINISH_DATE, String FINISH_TIME,
		String SORTFIELD, String ABKRS) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.z_BAPI_ZDSS_WEB_LINK(i_ILART, i_VKONT, i_VKONA, PARTNERCATEGORY, PARTNERTYPE, TITLE_KEY, FIRSTNAME, LASTNAME, MIDDLENAME, FATHERSNAME, HOUSE_NO, BUILDING, STR_SUPPL1, STR_SUPPL2, STR_SUPPL3, POSTL_COD1, CITY, e_MAIL, LANDLINE, MOBILE, FEMALE, MALE, JOBGR, IDTYPE, IDNUMBER, PLANNINGPLANT, WORKCENTRE, SYSTEMCOND, APPLIEDCAT, APPLIEDLOAD, APPLIEDLOADKVA, CONNECTIONTYPE, STATEMENT_CA, START_DATE, START_TIME, FINISH_DATE, FINISH_TIME, SORTFIELD, ABKRS);
}

@Override
public ZBAPI_ENFORCEMENTResponseZBAPI_ENFORCEMENTResult ZBAPI_ENFORCEMENT(String strCANumber, String strContract)
		throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_ENFORCEMENT(strCANumber, strContract);
}

@Override
public ZBI_WEBBILL_HISTResponseZBI_WEBBILL_HISTResult ZBI_WEBBILL_HIST(String strCANumber, String strBillMonth)
		throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBI_WEBBILL_HIST(strCANumber, strBillMonth);
}

@Override
public Z_BAPI_IVRSResponseZ_BAPI_IVRSResult z_BAPI_IVRS(String strContractAccountNumber) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.z_BAPI_IVRS(strContractAccountNumber);
}

@Override
public Z_BAPI_DSS_ISU_CA_DISPLAYResponseZ_BAPI_DSS_ISU_CA_DISPLAYResult z_BAPI_DSS_ISU_CA_DISPLAY(String strCANumber,
		String strCRNNumber) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.z_BAPI_DSS_ISU_CA_DISPLAY(strCANumber, strCRNNumber);
}

@Override
public ZBAPIEBIZORDSTATUSResponseZBAPIEBIZORDSTATUSResult ZBAPIEBIZORDSTATUS(String stOrderNumber)
		throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPIEBIZORDSTATUS(stOrderNumber);
}

@Override
public ZBAPI_UPDATE_TNOResponseZBAPI_UPDATE_TNOResult ZBAPI_UPDATE_TNO(String strCA_no, String strTelephone,
		String strMobile, String strEmail, String strLandmark, String strDISPATCH_CTRL) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_UPDATE_TNO(strCA_no, strTelephone, strMobile, strEmail, strLandmark, strDISPATCH_CTRL);
}

@Override
public ZBAPI_IDENTIFICATIONResponseZBAPI_IDENTIFICATIONResult ZBAPI_IDENTIFICATION(String strBP_NO, String strType_ID,
		String strID_Num) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_IDENTIFICATION(strBP_NO, strType_ID, strID_Num);
}

@Override
public ZBAPI_ZCS_CLI_WEBResponseZBAPI_ZCS_CLI_WEBResult ZBAPI_ZCS_CLI_WEB(String strTelephoneNumber)
		throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_ZCS_CLI_WEB(strTelephoneNumber);
}

@Override
public ZBAPI_TEAM_ALLOCATIONResponseZBAPI_TEAM_ALLOCATIONResult ZBAPI_TEAM_ALLOCATION(String strIEMINumber,
		String strILART, String strDate, String strTime) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_TEAM_ALLOCATION(strIEMINumber, strILART, strDate, strTime);
}

@Override
public ZBAPI_BI_EMAIL_COUNTResponseZBAPI_BI_EMAIL_COUNTResult ZBAPI_BI_EMAIL_COUNT(String strCRONAM, String strOBJTP,
		String strDateYYYYMMDD, String strTime) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_BI_EMAIL_COUNT(strCRONAM, strOBJTP, strDateYYYYMMDD, strTime);
}

@Override
public ZBAPI_EDISTRICTResponseZBAPI_EDISTRICTResult ZBAPI_EDISTRICT(String strCANumber, String strCRNNumber)
		throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_EDISTRICT(strCANumber, strCRNNumber);
}

@Override
public Z_BAPI_INPUT_CP_DETAILSResponseZ_BAPI_INPUT_CP_DETAILSResult z_BAPI_INPUT_CP_DETAILS(String new_Ca,
		String old_Ca, String theft_Type, String zbilled_Ratcat, String zbill_Days, String zbill_Type, String zcaseid,
		String zcomp_Id, String zconn_Load, String zinsp_Date, String zinsp_Mtrread, String znew_Meterno,
		String zold_Meterno, String zphase, Z_BAPI_INPUT_CP_DETAILSDsInputTable dsInputTable) throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.z_BAPI_INPUT_CP_DETAILS(new_Ca, old_Ca, theft_Type, zbilled_Ratcat, zbill_Days, zbill_Type, zcaseid, zcomp_Id, zconn_Load, zinsp_Date, zinsp_Mtrread, znew_Meterno, zold_Meterno, zphase, dsInputTable);
}

@Override
public ZBAPI_DEMAND_NOTE_ONLINEResponseZBAPI_DEMAND_NOTE_ONLINEResult ZBAPI_DEMAND_NOTE_ONLINE(String strOrder)
		throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_DEMAND_NOTE_ONLINE(strOrder);
}

@Override
public ZBAPI_ISUACCOUNT_CHANGEResponseZBAPI_ISUACCOUNT_CHANGEResult ZBAPI_ISUACCOUNT_CHANGE(String strCONTRACT_ACCOUNT,
		String strPartner, String strValidDAte, String strCONTRACTACCOUNTDATA, String strCONTRACTACCOUNTDATAX)
		throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_ISUACCOUNT_CHANGE(strCONTRACT_ACCOUNT, strPartner, strValidDAte, strCONTRACTACCOUNTDATA, strCONTRACTACCOUNTDATAX);
}

@Override
public ZBAPI_FICA_DEMAND_NOTEResponseZBAPI_FICA_DEMAND_NOTEResult ZBAPI_FICA_DEMAND_NOTE(String strORDER_NO)
		throws RemoteException {
	// TODO Auto-generated method stub
	return webServiceSoap.ZBAPI_FICA_DEMAND_NOTE(strORDER_NO);
}

}