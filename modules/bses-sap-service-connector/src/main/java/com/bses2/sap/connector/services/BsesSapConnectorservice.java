package com.bses2.sap.connector.services;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.tempuri.ZBAPI_CNT_APP_DETAIL_MOBResponseZBAPI_CNT_APP_DETAIL_MOBResult;
import org.tempuri.ZBAPI_CS_MOBILE_APPCNTResponseZBAPI_CS_MOBILE_APPCNTResult;
import org.tempuri.ZBAPI_CS_ORD_STATResponseZBAPI_CS_ORD_STATResult;
import org.tempuri.ZBAPI_EXEMPT_MOBILEResponseZBAPI_EXEMPT_MOBILEResult;
import org.tempuri.ZBAPI_MDI_RES_ORDERResponseZBAPI_MDI_RES_ORDERResult;
import org.tempuri.ZBAPI_PREPAID_RTGSResponseZBAPI_PREPAID_RTGSResult;
import org.tempuri.ZBAPI_ZCAL_HIGH_AVG_MDIResponseZBAPI_ZCAL_HIGH_AVG_MDIResult;
import org.tempuri.ZCSUPDAT_PERSONAL_DETAILSResponseZCSUPDAT_PERSONAL_DETAILSResult;
import org.tempuri.Z_BAPI_CA_DISPLAY_WHATSAPPResponseZ_BAPI_CA_DISPLAY_WHATSAPPResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.bses2.common.constant.CommonUtilConstant;
import com.bses2.sap.connector.services.helper.BsesSapConnectorServiceHelper;
import com.bses2.sap.constant.BsesSapConnectorServiceConstant;
import com.bses2.sap.model.AdharUpdateRequest;
import com.bses2.sap.model.AdharUpdateResponse;
import com.bses2.sap.model.CSOrderStatusResponse;
import com.bses2.sap.model.CmsDisplayBillWebRequest;
import com.bses2.sap.model.CmsDisplayBillWebResponse;
import com.bses2.sap.model.CmsISUCADisplayRequest;
import com.bses2.sap.model.CmsISUCADisplayResponse;
import com.bses2.sap.model.CntAppDetailMobResponse;
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
import com.bses2.sap.model.RegisterWebComplaintRequest;
import com.bses2.sap.model.RegisterWebComplaintResponse;
import com.bses2.sap.model.UpdateTNORequest;
import com.bses2.sap.model.UpdateTNOResponse;
import com.bses2.sap.model.WebBillHisResponse;
import com.bses2.sap.model.WebBillHistoryRequest;
import com.bses2.sap.model.WebBillHistoryResponse;
import com.bses2.sap.model.ZBapiCSMobileAppcntResponse;
import com.bses2.sap.model.ZBapiCaDisplayWhatsApp;
import com.bses2.sap.model.ZBapiFicaDemandDetailsError;
import com.bses2.sap.model.ZBapiFicaDemandRequest;
import com.bses2.sap.model.ZBapiFicaDemandResponse;
import com.bses2.sap.model.ZCalHighAvgMDIResponse;
import com.bses2.sap.model.ZbapiCreateSOPostDetailResponse;
import com.bses2.sap.model.ZbapiCreateSOPostErrorResponse;
import com.bses2.sap.model.ZbapiCreateSOPostRequest;
import com.bses2.sap.model.ZbapiCreateSOPostResponse;
import com.bses2.sap.model.ZcsUpdatePersonalDetailsResponse;
import com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult;
import com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult;
import com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult;
import com.bses2.sap.ws.GetAreasFromDivisionResponseGetAreasFromDivisionResult;
import com.bses2.sap.ws.GetComplaintStatusResponseGetComplaintStatusResult;
import com.bses2.sap.ws.GetDivisionsFromCompanyResponseGetDivisionsFromCompanyResult;
import com.bses2.sap.ws.GetFaultCatResponseGetFaultCatResult;
import com.bses2.sap.ws.GetFaultCategoriesWebResponseGetFaultCategoriesWebResult;
import com.bses2.sap.ws.GetFaultTypesFromCatResponseGetFaultTypesFromCatResult;
import com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult;
import com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult;
import com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult;
import com.bses2.sap.ws.RegisterWebComplaintResponseRegisterWebComplaintResult;
import com.bses2.sap.ws.Service1Locator;
import com.bses2.sap.ws.Service1Soap;
import com.bses2.sap.ws.WebGISServiceLocator;
import com.bses2.sap.ws.WebGISServiceSoap;
import com.bses2.sap.ws.WebServiceLocator;
import com.bses2.sap.ws.WebServiceSoap;
import com.bses2.sap.ws.ZBAPI_CREATESO_POSTResponseZBAPI_CREATESO_POSTResult;
import com.bses2.sap.ws.ZBAPI_DISPLAY_BILL_WEBResponseZBAPI_DISPLAY_BILL_WEBResult;
import com.bses2.sap.ws.ZBAPI_FICA_DEMAND_NOTEResponseZBAPI_FICA_DEMAND_NOTEResult;
import com.bses2.sap.ws.ZBAPI_IDENTIFICATIONResponseZBAPI_IDENTIFICATIONResult;
import com.bses2.sap.ws.ZBAPI_IVR_CREATESO_ISUResponseZBAPI_IVR_CREATESO_ISUResult;
import com.bses2.sap.ws.ZBAPI_ONLINE_BILL_PDFResponseZBAPI_ONLINE_BILL_PDFResult;
import com.bses2.sap.ws.ZBAPI_UPDATE_TNOResponseZBAPI_UPDATE_TNOResult;
import com.bses2.sap.ws.ZBI_WEBBILL_HISTResponseZBI_WEBBILL_HISTResult;
import com.bses2.sap.ws.Z_BAPI_CMS_ISU_CA_DISPLAYResponseZ_BAPI_CMS_ISU_CA_DISPLAYResult;
import com.bses2.sap.ws.Z_BAPI_DSS_ISU_CA_DISPLAYResponseZ_BAPI_DSS_ISU_CA_DISPLAYResult;
import com.bses2.sap.ws.Z_BAPI_ZDSS_WEB_LINKResponseZ_BAPI_ZDSS_WEB_LINKResult;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;

/**
 * The Class BsesSapConnectorservice.
 */

@Component(immediate = true,
		service = SapConnctorServiceApi.class)
@ProviderType
public class BsesSapConnectorservice implements SapConnctorServiceApi {
	/** The Constant LOG. */
	private static final Log LOG = LogFactoryUtil.getLog(BsesSapConnectorservice.class);

	private static final String ISUSTDTable = "ISUSTDTable";
	
	private static String isuServiceHost = "http://125.22.84.50:7850/delhiv21/ISUService.asmx";
	private static String gisServiceHost = "http://125.22.84.50:7850/delhiv2/ISUService.asmx";
	private static String service1ServiceHost = "http://125.22.84.50:7850/delhiv2/ISUService.asmx";

	/** The isu service soap. */
	private WebGISServiceSoap webGISServiceSoap = null;
	private WebServiceSoap webServiceSoap = null;
	private org.tempuri.WebServiceSoap webServiceSoapWS = null;
	private Service1Soap service1Soap = null;

	/**
	private BsesCommonUtilApi bsesCommonUtilApi;

	@Reference
	public void setBsesCommonUtilApi(BsesCommonUtilApi bsesCommonUtilApi) {
		this.bsesCommonUtilApi = bsesCommonUtilApi;

		try {
			WebServiceLocator webServiceLocator = new WebServiceLocator();
			org.tempuri.WebServiceLocator webServiceLocatorWs = new org.tempuri.WebServiceLocator();
			WebGISServiceLocator webGISServiceLocator = new WebGISServiceLocator();
			Service1Locator service1Locator = new Service1Locator();

			webServiceLocator.setWebServiceSoapEndpointAddress(bsesCommonUtilApi.getIsuServiceHost());
//			webServiceLocatorWs.setWebServiceSoapEndpointAddress(bsesCommonUtilApi.getIsuServiceHostWs());
			webGISServiceLocator.setWebGISServiceSoapEndpointAddress(bsesCommonUtilApi.getGISServiceHost());
			service1Locator.setService1SoapEndpointAddress(bsesCommonUtilApi.getService1ServiceHost());

			webServiceSoap = webServiceLocator.getWebServiceSoap();
			webServiceSoapWS = webServiceLocatorWs.getWebServiceSoap();
			webGISServiceSoap = webGISServiceLocator.getWebGISServiceSoap();
			service1Soap = service1Locator.getService1Soap();
			
//			LOG.info(webServiceSoap);
//			LOG.info(webServiceSoapWS);
//			LOG.info(webGISServiceSoap);
//			LOG.info(service1Soap);

		} catch (ServiceException e) {
			LOG.error("error occured while initializing soap objects " + e + e.getMessage());
		}
	}
*/
	// Constructor
	public BsesSapConnectorservice() {
		
		try {
			WebServiceLocator webServiceLocator = new WebServiceLocator();
			
			WebGISServiceLocator webGISServiceLocator = new WebGISServiceLocator();
			Service1Locator service1Locator = new Service1Locator();

			webServiceLocator.setWebServiceSoapEndpointAddress(isuServiceHost);
			webServiceSoap = webServiceLocator.getWebServiceSoap();

			webGISServiceLocator.setWebGISServiceSoapEndpointAddress(gisServiceHost);
			webGISServiceSoap = webGISServiceLocator.getWebGISServiceSoap();
			
			service1Locator.setService1SoapEndpointAddress(service1ServiceHost);
			service1Soap = service1Locator.getService1Soap();

			org.tempuri.WebServiceLocator webServiceLocatorWs = new org.tempuri.WebServiceLocator();
			webServiceSoapWS = webServiceLocatorWs.getWebServiceSoap();
			
			
			
//			LOG.info(webServiceSoap);
//			LOG.info(webServiceSoapWS);
//			LOG.info(webGISServiceSoap);
//			LOG.info(service1Soap);

		} catch (ServiceException e) {
			LOG.error("error occured while initializing soap objects " + e + e.getMessage());
		}

	}

	/**
	 * @author alok.pal
	 */
	public CmsISUCADisplayResponse getCmsISUCADisplay(CmsISUCADisplayRequest request) {
		CmsISUCADisplayResponse cmsISUCADisplayResponse = null;
		Z_BAPI_CMS_ISU_CA_DISPLAYResponseZ_BAPI_CMS_ISU_CA_DISPLAYResult response = null;
		try {
			response = webServiceSoap.z_BAPI_CMS_ISU_CA_DISPLAY(request.getCaNumber(), StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, StringPool.BLANK,
					StringPool.BLANK);
		} catch (RemoteException e1) {
			LOG.error("Error occured getCmsISUCADisplay while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			
			cmsISUCADisplayResponse = getISUCADisplay(xmlString);
		}
		return cmsISUCADisplayResponse;
	}

	/**
	 * 
	 * @param xmlString
	 * @return
	 */
	private CmsISUCADisplayResponse getISUCADisplay(String xmlString) {
		CmsISUCADisplayResponse cmsISUCADisplayResponse = null;
		if (Validator.isNotNull(xmlString)) {
			if (xmlString.contains(BsesSapConnectorServiceConstant.ISU_DISPALY_DATA_CONSTANT)) {
				cmsISUCADisplayResponse = getResponseAfterParser(xmlString);
			} else if (xmlString.contains(BsesSapConnectorServiceConstant.ISU_DISPALY_ERROR_CONSTANT)) {
				cmsISUCADisplayResponse = getErrorResponseAfterParser(xmlString);
			}
		}
		return cmsISUCADisplayResponse;
	}

	/**
	 * 
	 * @param xmlString
	 * @return
	 */
	private CmsISUCADisplayResponse getErrorResponseAfterParser(String xmlString) {
		CmsISUCADisplayResponse cmsISUCADisplayResponse = new CmsISUCADisplayResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		InputStream is = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			Document doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();

			NodeList msgList = doc.getElementsByTagName(BsesSapConnectorServiceConstant.ISU_DISPALY_ERROR_CONSTANT);
			if (msgList != null) {
				Node nNode = msgList.item(0);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String message = eElement.getElementsByTagName(BsesSapConnectorServiceConstant.MESSAGE).item(0).getTextContent();
					cmsISUCADisplayResponse.setMessage(message);
					cmsISUCADisplayResponse.setFlag(true);
				}
			}

		} catch (ParserConfigurationException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e);
		} catch (SAXException se) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + se);
		} catch (IOException e1) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e1);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponseAfterParser");
				}
			}
		}
		return cmsISUCADisplayResponse;
	}

	/**
	 * 
	 * @param xmlString
	 * @return
	 */
	private CmsISUCADisplayResponse getResponseAfterParser(String xmlString) {
		CmsISUCADisplayResponse cmsISUCADisplayResponse = null;

		List<String> elementNameLst = new ArrayList<String>();

		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("ISUSTDTable");

		xmlString = removeAttribute(xmlString, elementNameLst);

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"ISUSTDTable1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		// xmlString = xmlString.replace("<BAPI_RESULT xmlns=\"\">",
		// "").replace("</BAPI_RESULT>", "");
		xmlString = xmlString.replace("<BAPI_RESULT>", "").replace("</BAPI_RESULT>", "");

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
//		LOG.info(xmlString);
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			/*
			 * Implementation changed to Singleton by Liferay to avoid creation
			 * of Objects
			 */
			// JAXBContext jc =
			// JAXBContext.newInstance(CmsISUCADisplayResponse.class);
			JAXBContext jc = createInstance(CmsISUCADisplayResponse.class);

			Unmarshaller unmarshaller = jc.createUnmarshaller();
			cmsISUCADisplayResponse = (CmsISUCADisplayResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getResponseAfterParser");
				}
			}
		}
		return cmsISUCADisplayResponse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bses.sap.connector.services.SapConnctorServiceApi#getIvrCreatesoISU(
	 * com.bses.sap.model.IvrCreatesoISURequest)
	 */
	public IvrCreatesoISUResponse getIvrCreatesoISU(IvrCreatesoISURequest request) {
		IvrCreatesoISUResponse ivrCreatesoISUResponse = null;
		ZBAPI_IVR_CREATESO_ISUResponseZBAPI_IVR_CREATESO_ISUResult response = null;
		try {
			response = webServiceSoap.ZBAPI_IVR_CREATESO_ISU(request.getCaNumber(), StringPool.BLANK, StringPool.BLANK, StringPool.BLANK, request.getOrderNo(),
					request.getComplaintType(), StringPool.BLANK, StringPool.BLANK, request.getDescription());
		} catch (RemoteException ex) {
			LOG.error("Error occured getIvrCreatesoISU while getting response :::" + ex);
		}

		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			ivrCreatesoISUResponse = getCreatesoISU(xmlString);
		}

		return ivrCreatesoISUResponse;

	}

	/**
	 * @param xmlString
	 * @return
	 */
	private IvrCreatesoISUResponse getCreatesoISU(String xmlString) {
		IvrCreatesoISUResponse ivrCreatesoISUResponse = null;
		if (Validator.isNotNull(xmlString)) {
			if (xmlString.contains(BsesSapConnectorServiceConstant.ISU_COMP_DATA_CONSTANT) && xmlString.contains("SAPDATA_BAPIErrorDataTable ")) {
				ivrCreatesoISUResponse = getResponseAfterParse(xmlString);
			} else if (xmlString.contains(BsesSapConnectorServiceConstant.ISU_COMP_DATA_CONSTANT)) {
				ivrCreatesoISUResponse = getResponse(xmlString);
			} else if (xmlString.contains(BsesSapConnectorServiceConstant.ISU_DISPALY_ERROR_CONSTANT)) {
				ivrCreatesoISUResponse = getErrorResponseAfterParse(xmlString);
			}
		}

		return ivrCreatesoISUResponse;
	}

	/**
	 * @param xmlString
	 * @return
	 */
	private IvrCreatesoISUResponse getErrorResponseAfterParse(String xmlString) {
		IvrCreatesoISUResponse ivrCreatesoISUResponse = new IvrCreatesoISUResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		InputStream is = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			Document doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();

			NodeList msgList = doc.getElementsByTagName("SAPDATA_BAPIErrorDataTable");
			if (msgList != null) {
				Node nNode = msgList.item(0);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String message = eElement.getElementsByTagName("Message").item(0).getTextContent();
					ivrCreatesoISUResponse.setMessage(message);
					ivrCreatesoISUResponse.setFlag(true);
				}
			}

		} catch (ParserConfigurationException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e);
		} catch (SAXException se) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + se);
		} catch (IOException ioe) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + ioe);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponseAfterParse");
				}
			}
		}

		return ivrCreatesoISUResponse;
	}

	private IvrCreatesoISUResponse getResponseAfterParse(String xmlString) {
		IvrCreatesoISUResponse ivrCreatesoISUResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("ISUCOMP1Table");
		elementNameLst.add("SAPDATA_BAPIErrorDataTable");

		xmlString = removeAttribute(xmlString, elementNameLst);

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"ISUCOMP1Table1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		xmlString = xmlString.replace("diffgr:id=\"SAPDATA_BAPIErrorDataTable1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {

			/*
			 * Implementation changed to Singleton by Liferay to avoid creation
			 * of Objects
			 */
			// JAXBContext jc =
			// JAXBContext.newInstance(IvrCreatesoISUResponse.class);
			JAXBContext jc = createInstance(IvrCreatesoISUResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			ivrCreatesoISUResponse = (IvrCreatesoISUResponse) unmarshaller.unmarshal(wsResponse);

		} catch (JAXBException e) {
			LOG.error(BsesSapConnectorServiceConstant.XMLSTRING_ERROR_MSG + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getResponseAfterParse");
				}
			}
		}

		return ivrCreatesoISUResponse;
	}

	private IvrCreatesoISUResponse getResponse(String xmlString) {
		IvrCreatesoISUResponse ivrCreatesoISUResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("ISUCOMP1Table");
		elementNameLst.add("SAPDATA_BAPIErrorDataTable");

		xmlString = removeAttribute(xmlString, elementNameLst);

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"ISUCOMP1Table1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			/*
			 * Implementation changed to Singleton by Liferay to avoid creation
			 * of Objects
			 */
			// JAXBContext jc =
			// JAXBContext.newInstance(IvrCreatesoISUResponse.class);
			JAXBContext jc = createInstance(IvrCreatesoISUResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			ivrCreatesoISUResponse = (IvrCreatesoISUResponse) unmarshaller.unmarshal(wsResponse);

		} catch (JAXBException e) {
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getResponse");
				}
			}
		}
		return ivrCreatesoISUResponse;

	}

	/**
	 * @author payal.thummar This method will take request and get the response
	 *         for displayBillWeb
	 * 
	 * @param request
	 * @return object of CmsDisplayBillWebResponse
	 */
	@Override
	public CmsDisplayBillWebResponse getDisplayBillWeb(CmsDisplayBillWebRequest request) {
		CmsDisplayBillWebResponse cmsDisplayBillWebResponse = null;

		ZBAPI_DISPLAY_BILL_WEBResponseZBAPI_DISPLAY_BILL_WEBResult response = null;

		try {
//			LOG.info("webServiceSoap - "+webServiceSoap);
			response = webServiceSoap.ZBAPI_DISPLAY_BILL_WEB(request.getCaNumber(), "");
			//LOG.info("getZBAPI_DISPLAY_BILL_Web - "+response);
		} catch (RemoteException e1) {
			LOG.error("Error occured ZBAPI_DISPLAY_BILL_WEB while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error("Error occured  while getting msgElementArr :::" + e);
				}
			}
			// getting response while passing xmlString
			cmsDisplayBillWebResponse = getBillWeb(xmlString);

		}

		return cmsDisplayBillWebResponse;
	}

	/**
	 * @author payal.thummar This method will take xmlString and after parsing
	 *         it we get for response for data and error
	 * 
	 * @param xmlString
	 * @return object of CmsDisplayBillWebResponse
	 */
	private CmsDisplayBillWebResponse getBillWeb(String xmlString) {
		CmsDisplayBillWebResponse cmsDisplayBillWebResponse = null;
		if (Validator.isNotNull(xmlString)) {
			//LOG.info("xmlString---------************"+xmlString);
			if (xmlString.contains(BsesSapConnectorServiceConstant.DISPLAY_BILL_WEB_CONSTANT)) {
				cmsDisplayBillWebResponse = getBillWebResponseAfterParser(xmlString);
			} else if (xmlString.contains(BsesSapConnectorServiceConstant.DISPLAY_BILL_WEB_ERROR_CONSTANT)) {
				cmsDisplayBillWebResponse = getBillWebErrorResponseAfterParser(xmlString);
			}
		}
		return cmsDisplayBillWebResponse;
	}

	/**
	 * @author payal.thummar This method will take xmlString and after parsing
	 *         it we get it's error response
	 * 
	 * @param xmlString
	 * @return object of CmsDisplayBillWebResponse
	 */
	private CmsDisplayBillWebResponse getBillWebErrorResponseAfterParser(String xmlString) {
		CmsDisplayBillWebResponse cmsDisplayBillWebResponse = new CmsDisplayBillWebResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		InputStream is = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			Document doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();

			NodeList msgList = doc.getElementsByTagName(BsesSapConnectorServiceConstant.DISPLAY_BILL_WEB_ERROR_CONSTANT);
			if (msgList != null) {
				Node nNode = msgList.item(0);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String message = eElement.getElementsByTagName(BsesSapConnectorServiceConstant.MESSAGE).item(0).getTextContent();
					cmsDisplayBillWebResponse.setMessage(message);
					cmsDisplayBillWebResponse.setFlag(true);
				}
			}

		} catch (ParserConfigurationException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e);
		} catch (SAXException se) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + se);
		} catch (IOException e1) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e1);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getBillWebErrorResponseAfterParser");
				}
			}
		}
		return cmsDisplayBillWebResponse;
	}

	/**
	 * @author payal.thummar This method will take xmlString and after parsing
	 *         it we get it's response
	 * 
	 * @param xmlString
	 * @return object of CmsDisplayBillWebResponse
	 */
	private CmsDisplayBillWebResponse getBillWebResponseAfterParser(String xmlString) {
		CmsDisplayBillWebResponse cmsDisplayBillWebResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("billDetailsTable");
		elementNameLst.add("meterDetailsTable");

		xmlString = removeAttribute(xmlString, elementNameLst);

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"billDetailsTable1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);

		xmlString = xmlString.replaceAll("diffgr:id=\"meterDetailsTable([0-9]+\")", "");
		xmlString = xmlString.replaceAll("msdata:rowOrder=\"([0-9]+\")", "");
		xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {

			/*
			 * Implementation changed to Singleton by Liferay to avoid creation
			 * of Objects
			 */
			// JAXBContext jc =
			// JAXBContext.newInstance(CmsDisplayBillWebResponse.class);
			JAXBContext jc = createInstance(CmsDisplayBillWebResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			cmsDisplayBillWebResponse = (CmsDisplayBillWebResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponseAfterParser");
				}
			}
		}
		return cmsDisplayBillWebResponse;
	}

	/**
	 * OnlineBillPDF Service method call
	 * 
	 * @param request
	 * @return
	 */
	// Mukesh
	public OnlineBillPdfResponse getOnlineBillPdfFromInvoice(OnlineBillPdfResquest request) {
		OnlineBillPdfResponse onlineBillPdfResponse = null;

		ZBAPI_ONLINE_BILL_PDFResponseZBAPI_ONLINE_BILL_PDFResult response = null;

		try {

			StringBuilder str = new StringBuilder();
			str.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">").append("<soapenv:Header/>")
					.append("<soapenv:Body>").append("<tem:ZBAPI_ONLINE_BILL_PDF>").append("<!--Optional:-->").append("<tem:strCANumber>").append(request.getCaNumber())
					.append("</tem:strCANumber>").append("<!--Optional:-->").append("<tem:strEBSKNO>").append(request.getInvoiceNo()).append("</tem:strEBSKNO>")
					.append("</tem:ZBAPI_ONLINE_BILL_PDF>").append("</soapenv:Body></soapenv:Envelope>");
			String xmlString = str.toString();

			String responseString = getWSResponseWithPlainJavaAPI(CommonUtilConstant.ZBAPI_ONLINE_BILL_PDF, CommonUtilConstant.ISU_SERVICE_HOST, xmlString);
			if (Validator.isNotNull(responseString)) {
				String resultString = substringBetween(responseString, "</xs:schema>", "</ZBAPI_ONLINE_BILL_PDFResult>");
				onlineBillPdfResponse = getBillPDF(resultString);
			}
		} catch (Exception e) {

		}
		return onlineBillPdfResponse;
	}

	public OnlineBillPdfResponse getOnlineBillPdf(OnlineBillPdfResquest request) {
		OnlineBillPdfResponse onlineBillPdfResponse = null;

		ZBAPI_ONLINE_BILL_PDFResponseZBAPI_ONLINE_BILL_PDFResult response = null;

		try {
			StringBuilder str = new StringBuilder();
			str.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">").append("<soapenv:Header/>")
					.append("<soapenv:Body>").append("<tem:ZBAPI_ONLINE_BILL_PDF>").append("<!--Optional:-->").append("<tem:strCANumber>").append(request.getCaNumber())
					.append("</tem:strCANumber>").append("<!--Optional:-->").append("<tem:strEBSKNO>").append(StringPool.BLANK).append("</tem:strEBSKNO>")
					.append("</tem:ZBAPI_ONLINE_BILL_PDF>").append("</soapenv:Body></soapenv:Envelope>");
			String xmlString = str.toString();

			String responseString = getWSResponseWithPlainJavaAPI(CommonUtilConstant.ZBAPI_ONLINE_BILL_PDF, CommonUtilConstant.ISU_SERVICE_HOST, xmlString);
			if (Validator.isNotNull(responseString)) {
				String resultString = substringBetween(responseString, "</xs:schema>", "</ZBAPI_ONLINE_BILL_PDFResult>");
				onlineBillPdfResponse = getBillPDF(resultString);
			}
		} catch (Exception e) {

		}
		return onlineBillPdfResponse;
	}

	private OnlineBillPdfResponse getBillPDF(String xmlString) {
		OnlineBillPdfResponse onlineBillPdfResponse = new OnlineBillPdfResponse();
		if (Validator.isNotNull(xmlString)) {
			if (xmlString.contains(BsesSapConnectorServiceConstant.Z_BILL_PDF_TABLE)) {
				String output = xmlString;
				int startIndex = output.indexOf("<BAPI_RESULT");
				int endIndex = output.indexOf("</diffgr:diffgram>");
				output = output.substring(startIndex, endIndex);
				output = StringUtil.replace(output, "<BAPI_RESULT xmlns=\"\">", "");
				output = StringUtil.replace(output, "</BAPI_RESULT>", "");
				output = StringUtil.replace(output, "<Tdline>", "");
				output = StringUtil.replace(output, "</Tdline>", "");
				output = StringUtil.replace(output, "diffgr:hasChanges=\"inserted\"", "");
				output = StringUtil.replace(output, " diffgr:hasChanges=\"inserted\"", "");
				output = output.replaceAll("msdata:rowOrder=\"([0-9]+\")", "");
				output = output.replaceAll(" diffgr:id=\"ZPDFTable([0-9]+)\"", "");
				output = StringUtil.replace(output, "<ZPDFTable  >", "");
				output = StringUtil.replace(output, "</ZPDFTable>", "\n");
				output = StringUtil.replace(output, "<Tdline />", "");
				output = output.replaceAll("&#x0;", "");
				output = StringEscapeUtils.unescapeHtml4(output);
				byte[] bytes = output.getBytes();
				onlineBillPdfResponse.setBillContent(bytes);

			} else if (xmlString.contains(BsesSapConnectorServiceConstant.BILL_PDF_MESSAGE_ERROR_TAG)) {
				onlineBillPdfResponse = getBillPDFErrorResponseAfterParser(xmlString);
			}
		}
		return onlineBillPdfResponse;
	}

	private OnlineBillPdfResponse getBillPDFErrorResponseAfterParser(String xmlString) {
		OnlineBillPdfResponse onlineBillPdfResponse = new OnlineBillPdfResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		InputStream is = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			Document doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();

			NodeList msgList = doc.getElementsByTagName(BsesSapConnectorServiceConstant.BILL_PDF_MESSAGE_ERROR_TAG);
			if (msgList != null) {
				Node nNode = msgList.item(0);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String message = eElement.getElementsByTagName(BsesSapConnectorServiceConstant.MESSAGE_TEXT).item(0).getTextContent();
					onlineBillPdfResponse.setMessage(message);
					onlineBillPdfResponse.setFlag(true);
				}
			}

		} catch (ParserConfigurationException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e);
		} catch (SAXException se) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + se);
		} catch (IOException e1) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e1);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getBillPDFErrorResponseAfterParser");
				}
			}
		}
		return onlineBillPdfResponse;

	}

	@Override
	public GetFaultCatResponse getFaultCategory() {
		GetFaultCatResponse getFaultCatResponse = null;
		GetFaultCatResponseGetFaultCatResult response = null;
		try {
			response = webGISServiceSoap.getFaultCat();
		} catch (RemoteException ex) {
			LOG.error("Error Occoured in getFaultCategory while getting Response::::" + ex);
			ex.printStackTrace();
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();

				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString)) {
				if (xmlString.contains("Table1")) {
					xmlString = xmlString.replace(
							"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">",
							"<BAPI_RESULT>");
					xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
					xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
					xmlString = xmlString.replace("</diffgr:diffgram>", "</BAPI_RESULT>");
					xmlString = xmlString.replace(" xmlns=\"\"", "");
					InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
					try {

						/*
						 * Implementation changed to Singleton by Liferay to
						 * avoid creation of Objects
						 */
						// JAXBContext jc =
						// JAXBContext.newInstance(GetFaultCatResponse.class);
						JAXBContext jc = createInstance(GetFaultCatResponse.class);
						Unmarshaller unmarshaller = jc.createUnmarshaller();
						getFaultCatResponse = (GetFaultCatResponse) unmarshaller.unmarshal(wsResponse);
					} catch (JAXBException e) {
						LOG.error("Error occured  while getting xmlString :::" + e);
					} finally {
						if (Validator.isNotNull(wsResponse)) {
							try {
								wsResponse.close();
							} catch (IOException e) {
								LOG.error("Error Closing InputStream in getFaultCategory");
							}
						}
					}

				}
			}

		}

		return getFaultCatResponse;

	}

	@Override
	public GetSubFaultCategoryResponse getSubFaultCatResponse(GetSubFaultCategoryRequest request) {
		GetSubFaultCategoryResponse getSubFaultCategoryResponse = null;
		GetSubFaultCatResponseGetSubFaultCatResult response = null;
		try {
			response = webGISServiceSoap.getSubFaultCat(request.getFaultCategory());
		} catch (RemoteException ex) {
			LOG.error("Error Occoured in getFaultCategory while getting Response::::" + ex);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString)) {
				if (xmlString.contains("Table1")) {
					xmlString = xmlString.replace(
							"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">",
							"<BAPI_RESULT>");
					xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
					xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
					xmlString = xmlString.replace("</diffgr:diffgram>", "</BAPI_RESULT>");
					xmlString = xmlString.replace(" xmlns=\"\"", "");
					InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
					try {

						/*
						 * Implementation changed to Singleton by Liferay to
						 * avoid creation of Objects
						 */
						// JAXBContext jc =
						// JAXBContext.newInstance(GetSubFaultCategoryResponse.class);
						JAXBContext jc = createInstance(GetSubFaultCategoryResponse.class);
						Unmarshaller unmarshaller = jc.createUnmarshaller();
						getSubFaultCategoryResponse = (GetSubFaultCategoryResponse) unmarshaller.unmarshal(wsResponse);
					} catch (JAXBException e) {
						LOG.error("Error occured  while getting xmlString :::" + e);
					} finally {
						if (Validator.isNotNull(wsResponse)) {
							try {
								wsResponse.close();
							} catch (IOException e) {
								LOG.error("Error Closing InputStream in getSubFaultCatResponse");
							}
						}
					}

				}
			}
		}
		return getSubFaultCategoryResponse;

	}

	/**
	 * @author alok.pal
	 * 
	 */
	@Override
	public List<WebBillHisResponse> getWebBillHistory(WebBillHistoryRequest request) {
		List<WebBillHisResponse> webBillHistoryResponse = null;

		ZBI_WEBBILL_HISTResponseZBI_WEBBILL_HISTResult response = null;
		try {
			response = webServiceSoap.ZBI_WEBBILL_HIST(request.getCaNumber(), StringPool.BLANK);
		} catch (RemoteException e1) {
			LOG.error("Error occured WebBillHistoryResponse while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			webBillHistoryResponse = getWebBillHistory(xmlString);
		}

		return webBillHistoryResponse;
	}

	/**
	 * @author alok.pal
	 * @param xmlString
	 * @return
	 */
	private List<WebBillHisResponse> getWebBillHistory(String xmlString) {
		List<WebBillHisResponse> webBillHistoryResponseList = null;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		Document doc = null;
		InputStream is = null;
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();
		} catch (ParserConfigurationException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} catch (SAXException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} catch (IOException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getWebBillHistory");
				}
			}
		}
		if (Validator.isNotNull(xmlString)) {
			if (xmlString.contains(BsesSapConnectorServiceConstant.WEB_BILL_HIST_CONSTANT)) {
				webBillHistoryResponseList = getWebBillHistoryResponseAfterParser(xmlString);
			} else if (xmlString.contains(BsesSapConnectorServiceConstant.DISPLAY_BILL_WEB_ERROR_CONSTANT)) {
				webBillHistoryResponseList = getWebBillHistoryErrorResponseAfterParser(xmlString, doc);
			} else if (xmlString.contains(BsesSapConnectorServiceConstant.WEB_BILL_HIST_ERROR_CONNECT)) {
				webBillHistoryResponseList = getWebBillHistoryConnectionRefusedAfterParser(xmlString, doc);
			}
		}
		return webBillHistoryResponseList;
	}

	private List<WebBillHisResponse> getWebBillHistoryConnectionRefusedAfterParser(String xmlString, Document doc) {
		List<WebBillHisResponse> webBillHistoryResponseList = new ArrayList<>();
		WebBillHisResponse webBillHistoryResponse = new WebBillHisResponse();
		try {

			NodeList msgList = doc.getElementsByTagName(BsesSapConnectorServiceConstant.WEB_BILL_HIST_ERROR_CONNECT);
			if (msgList != null) {
				Node nNode = msgList.item(0);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String message = eElement.getElementsByTagName(BsesSapConnectorServiceConstant.MESSAGE_TEXT).item(0).getTextContent();
					webBillHistoryResponse.setMessage(message);
					webBillHistoryResponse.setFlag(true);
					webBillHistoryResponseList.add(webBillHistoryResponse);
				}
			}

		} catch (Exception e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e);
		}
		return webBillHistoryResponseList;
	}

	/**
	 * @author alok.pal
	 * @param xmlString
	 * @return
	 */
	private List<WebBillHisResponse> getWebBillHistoryErrorResponseAfterParser(String xmlString, Document doc) {
		List<WebBillHisResponse> webBillHistoryResponseList = new ArrayList<>();
		WebBillHisResponse webBillHistoryResponse = new WebBillHisResponse();
		try {
			NodeList msgList = doc.getElementsByTagName(BsesSapConnectorServiceConstant.DISPLAY_BILL_WEB_ERROR_CONSTANT);
			if (msgList != null) {
				Node nNode = msgList.item(0);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String message = eElement.getElementsByTagName(BsesSapConnectorServiceConstant.MESSAGE).item(0).getTextContent();
					webBillHistoryResponse.setMessage(message);
					webBillHistoryResponse.setFlag(true);
					webBillHistoryResponseList.add(webBillHistoryResponse);
				}
			}

		} catch (Exception e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e);
		}
		return webBillHistoryResponseList;
	}

	/**
	 * @author alok.pal
	 * @param xmlString
	 * @return
	 */
	private List<WebBillHisResponse> getWebBillHistoryResponseAfterParser(String xmlString) {
		List<WebBillHisResponse> webBillHistoryResponseList = null;
		WebBillHistoryResponse webBillHistoryResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");

		xmlString = removeAttribute(xmlString, elementNameLst);

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		xmlString = xmlString.replaceAll("diffgr:id=\"webBillHistoryTable([0-9]+)\" msdata:rowOrder=\"([0-9]+)\" diffgr:hasChanges=\"inserted\"", StringPool.BLANK);
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {

			/*
			 * Implementation changed to Singleton by Liferay to avoid creation
			 * of Objects
			 */
			// JAXBContext jc =
			// JAXBContext.newInstance(WebBillHistoryResponse.class);
			JAXBContext jc = createInstance(WebBillHistoryResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			webBillHistoryResponse = (WebBillHistoryResponse) unmarshaller.unmarshal(wsResponse);
			webBillHistoryResponseList = webBillHistoryResponse.getWebBillHistoryResponse();
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponseAfterParser");
				}
			}
		}
		return webBillHistoryResponseList;
	}

	@Override
	public GetAreaDetailsResponse getAreaDetailsResponse(GetAreaDetailsRequest request) {
		GetAreaDetailsResponse getAreaDetailsResponse = null;
		Get_Area_listResponseGet_Area_listResult response = null;
		try {

			response = webGISServiceSoap.get_Area_list(request.getObjectID());

		} catch (RemoteException ex) {
			LOG.debug("Error Occoured in getFaultCategory while getting Response::::" + ex);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString) && xmlString.contains("Table1")) {

				xmlString = xmlString.replace(
						"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">",
						"<BAPI_RESULT>");
				xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "</BAPI_RESULT>");
				xmlString = xmlString.replace(" xmlns=\"\"", "");
				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());

				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(GetAreaDetailsResponse.class);
					JAXBContext jc = createInstance(GetAreaDetailsResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					getAreaDetailsResponse = (GetAreaDetailsResponse) unmarshaller.unmarshal(wsResponse);
				} catch (JAXBException e) {
					LOG.error(BsesSapConnectorServiceConstant.XMLSTRING_ERROR_MSG + e);
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in getAreaDetailsResponse");
						}
					}
				}

			}

		}

		return getAreaDetailsResponse;
	}

	@Override
	public GetAreaDetailsCircleResponse getAreaDetailsCircleResponse(GetAreaDetailsCircleRequest request) {
		GetAreaDetailsCircleResponse getAreaDetailsCircleResponse = null;
		Get_area_details_CircleResponseGet_area_details_CircleResult response = null;

		try {

			response = webGISServiceSoap.get_area_details_Circle(request.getObjectID());

		} catch (RemoteException ex) {
			LOG.error("Error Occoured in getFaultCategory while getting Response::::" + ex);
		}

		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString) && xmlString.contains("Table1")) {

				xmlString = xmlString.replace(
						"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">", "");
				xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
				xmlString = xmlString.replace(" xmlns=\"\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "");
				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());

				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(GetAreaDetailsCircleResponse.class);
					JAXBContext jc = createInstance(GetAreaDetailsCircleResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					getAreaDetailsCircleResponse = (GetAreaDetailsCircleResponse) unmarshaller.unmarshal(wsResponse);
				} catch (JAXBException e) {
					LOG.error(BsesSapConnectorServiceConstant.XMLSTRING_ERROR_MSG + e);
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in getErrorResponseAfterParser");
						}
					}
				}

			}

		}

		return getAreaDetailsCircleResponse;
	}

	@Override
	public ComplaintRegistrationWebAreaResponse getComplaintRegistrationWebAreaResponse(ComplaintRegistrationWebAreaRequest request) {
		ComplaintRegistrationWebAreaResponse complaintRegistrationWebAreaResponse = null;
		ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult response = null;
		try {

			response = webGISServiceSoap.complaintRegistrationWeb_Area(request.getAreaName(), request.getCallerName(), request.getCallerphone(), "",
					request.getFaultCat(), request.getFaultType(), request.getComplaintCentreCode(), request.getCircle(), request.getDivision(),
					request.getAreaObjectID(), request.getStreetLightLocation(), request.getRemarks(), request.getSource());
		} catch (RemoteException ex) {
			LOG.error("Error Occoured in getFaultCategory while getting Response::::" + ex);
		}

		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString) && xmlString.contains("CMS_x0020_Complaint")) {
				xmlString = xmlString.replace(
						"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">", "");
				xmlString = xmlString.replaceAll(" diffgr:id=\"CMS Complaint1\"", "");
				xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
				xmlString = xmlString.replace(" xmlns=\"\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "");

				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());

				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(ComplaintRegistrationWebAreaResponse.class);
					JAXBContext jc = createInstance(ComplaintRegistrationWebAreaResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					complaintRegistrationWebAreaResponse = (ComplaintRegistrationWebAreaResponse) unmarshaller.unmarshal(wsResponse);
				} catch (JAXBException e) {
					LOG.error(BsesSapConnectorServiceConstant.XMLSTRING_ERROR_MSG + e);
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in getComplanintRegistrationWebAreaResponse");
						}
					}
				}

			}

		}
		return complaintRegistrationWebAreaResponse;
	}

	@Override
	public ComplaintRegistrationWebResponse getComplaintRegistrationWebResponse(ComplaintRegistrationWebRequest request) {
		ComplaintRegistrationWebResponse complaintRegistrationWebResponse = null;
		ComplaintRegistrationWebResponseComplaintRegistrationWebResult response = null;
		try {

			response = webGISServiceSoap.complaintRegistrationWeb(request.getKey(), request.getCallerName(), request.getCallerphone(), request.getAddress(),
					request.getCallerEmail(), request.getCaNo(), request.getArea(), request.getFaultCat(), request.getFaultType(), request.getRemarks(),
					request.getSource(), request.getPoleNum());

		} catch (RemoteException ex) {
			LOG.error("Error Occoured in getFaultCategory while getting Response::::" + ex);
		}

		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString) && xmlString.contains("CMS_x0020_Complaint")) {
				xmlString = xmlString.replace(
						"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">", "");
				xmlString = xmlString.replaceAll(" diffgr:id=\"CMS Complaint1\"", "");
				xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
				xmlString = xmlString.replace(" xmlns=\"\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "");

				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());

				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(ComplaintRegistrationWebResponse.class);
					JAXBContext jc = createInstance(ComplaintRegistrationWebResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					complaintRegistrationWebResponse = (ComplaintRegistrationWebResponse) unmarshaller.unmarshal(wsResponse);
				} catch (JAXBException e) {
					LOG.error(BsesSapConnectorServiceConstant.XMLSTRING_ERROR_MSG + e);
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in getComplaintRegistrationWebResponse");
						}
					}
				}

			}

		}
		return complaintRegistrationWebResponse;
	}

	/**
	 * @author alok.pal
	 * @param isucaDisplayRequest
	 */
	public UpdateTNOResponse addZBapiUpdateInfo(UpdateTNORequest request) {
		UpdateTNOResponse updateTNOResponse = null;
		ZBAPI_UPDATE_TNOResponseZBAPI_UPDATE_TNOResult response = null;
		try {
			response = webServiceSoap.ZBAPI_UPDATE_TNO(request.getCaNumber(), request.getStrTelephone(), request.getStrMobile(), request.getStrEmail(),
					request.getStrLandmark(), request.getDispatchControl());
		} catch (RemoteException e) {
			LOG.error("Error occured in updating ZBAPI_UPDATE_INFO in SAP Services :::" + e);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			updateTNOResponse = getISUCADispAfterUpdResp(xmlString);
		}

		return updateTNOResponse;
	}

	/**
	 * @author alok.pal
	 * @param xmlString
	 * @return
	 */
	private UpdateTNOResponse getISUCADispAfterUpdResp(String xmlString) {
		UpdateTNOResponse updateTNOResponse = null;
		if (Validator.isNotNull(xmlString) && xmlString.contains("OutputTable")) {
			updateTNOResponse = getResponseAfterUpdate(xmlString);
		}
		return updateTNOResponse;
	}

	/**
	 * @author alok.pal
	 * @param xmlStrings
	 * @return
	 */
	private UpdateTNOResponse getResponseAfterUpdate(String xmlString) {
		UpdateTNOResponse updateTNOResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("OutputTable");

		xmlString = removeAttribute(xmlString, elementNameLst);

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"OutputTable1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		// xmlString = xmlString.replace("<BAPI_RESULT xmlns=\"\">",
		// "").replace("</BAPI_RESULT>", "");
		xmlString = xmlString.replace("<BAPI_RESULT>", "").replace("</BAPI_RESULT>", "");

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);

		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {

			/*
			 * Implementation changed to Singleton by Liferay to avoid creation
			 * of Objects
			 */
			// JAXBContext jc =
			// JAXBContext.newInstance(UpdateTNOResponse.class);
			JAXBContext jc = createInstance(UpdateTNOResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			updateTNOResponse = (UpdateTNOResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getResponseAfterUpdate");
				}
			}
		}
		return updateTNOResponse;
	}

	/**
	 * @author alok.pal
	 * @param update
	 *            adhar card no using ZBAPI_IDENTIFICATION
	 */
	public AdharUpdateResponse updateAdharNoInSAP(AdharUpdateRequest request) {
		AdharUpdateResponse adharUpdateResponse = null;
		ZBAPI_IDENTIFICATIONResponseZBAPI_IDENTIFICATIONResult response = null;
		try {
			response = webServiceSoap.ZBAPI_IDENTIFICATION(request.getStrBpNo(), request.getStrTypeId(), request.getAdharNo());
		} catch (Exception e) {
			LOG.error("Error occured in updating ZBAPI_IDENTIFICATION in SAP Services :::" + e);
		}

		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			adharUpdateResponse = getAdharResponseAfterParser(xmlString);
		}
		return adharUpdateResponse;

	}

	private AdharUpdateResponse getAdharResponseAfterParser(String xmlString) {
		AdharUpdateResponse adharUpdateResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("OutputTable");

		xmlString = removeAttribute(xmlString, elementNameLst);

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"OutputTable1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		// xmlString = xmlString.replace("<BAPI_RESULT xmlns=\"\">",
		// "").replace("</BAPI_RESULT>", "");
		xmlString = xmlString.replace("<BAPI_RESULT>", "").replace("</BAPI_RESULT>", "");

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);

		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {

			/*
			 * Implementation changed to Singleton by Liferay to avoid creation
			 * of Objects
			 */
			// JAXBContext jc =
			// JAXBContext.newInstance(AdharUpdateResponse.class);
			JAXBContext jc = createInstance(AdharUpdateResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			adharUpdateResponse = (AdharUpdateResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getAdharResponseAfterParser");
				}
			}
		}
		return adharUpdateResponse;
	}

	@Override
	public GetFaultCategoriesWebResponse getFaultCategoriesWeb(GetFaultCategoriesWebRequest getFaultCategoriesWebRequest) {
		GetFaultCategoriesWebResponse getFaultCategoriesWebResponse = null;
		GetFaultCategoriesWebResponseGetFaultCategoriesWebResult response = null;
		try {
			response = service1Soap.getFaultCategoriesWeb(getFaultCategoriesWebRequest.getByplWebServiceKey());
		} catch (RemoteException ex) {
			LOG.error("Error Occoured in getFaultCategoriesWeb while getting Response::::" + ex);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();

				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString) && xmlString.contains("Table1")) {

				xmlString = xmlString.replace(
						"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">",
						"<BAPI_RESULT>");
				xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "</BAPI_RESULT>");
				xmlString = xmlString.replace(" xmlns=\"\"", "");

				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(GetFaultCategoriesWebResponse.class);
					JAXBContext jc = createInstance(GetFaultCategoriesWebResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					getFaultCategoriesWebResponse = (GetFaultCategoriesWebResponse) unmarshaller.unmarshal(wsResponse);
				} catch (JAXBException e) {
					LOG.error("Error occured  while getting xmlString :::" + e);
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in getFaultCategoriesWeb");
						}
					}
				}

			}

		}

		return getFaultCategoriesWebResponse;

	}

	@Override
	public GetFaultTypesFromCatResponse getFaultTypesFromCat(GetFaultTypesFromCatRequest getFaultTypesFromCatRequest) {
		GetFaultTypesFromCatResponse getFaultTypesFromCatResponse = null;
		GetFaultTypesFromCatResponseGetFaultTypesFromCatResult response = null;
		try {
			response = service1Soap.getFaultTypesFromCat(getFaultTypesFromCatRequest.getByplWebServiceKey(), getFaultTypesFromCatRequest.getFaultCategory());
		} catch (RemoteException ex) {
			LOG.error("Error Occoured in getFaultTypesFromCat while getting Response::::" + ex);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();

				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString) && xmlString.contains("Table1")) {

				xmlString = xmlString.replace(
						"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">",
						"<BAPI_RESULT>");
				xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "</BAPI_RESULT>");
				xmlString = xmlString.replace(" xmlns=\"\"", "");

				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(GetFaultTypesFromCatResponse.class);
					JAXBContext jc = createInstance(GetFaultTypesFromCatResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					getFaultTypesFromCatResponse = (GetFaultTypesFromCatResponse) unmarshaller.unmarshal(wsResponse);
				} catch (JAXBException e) {
					LOG.error("Error occured  while getting xmlString :::" + e);
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in getFaultTypesForCat");
						}
					}
				}

			}
		}

		return getFaultTypesFromCatResponse;
	}

	@Override
	public GetDivisionsFromCompanyResponse getDivisionsFromCompany(GetDivisionsFromCompanyRequest getDivisionsFromCompanyRequest) {
		GetDivisionsFromCompanyResponse getDivisionsFromCompanyResponse = null;
		GetDivisionsFromCompanyResponseGetDivisionsFromCompanyResult response = null;
		try {
			response = service1Soap.getDivisionsFromCompany(getDivisionsFromCompanyRequest.getByplWebServiceKey(), getDivisionsFromCompanyRequest.getCompanyName());
		} catch (RemoteException ex) {
			LOG.error("Error Occoured in getDivisionsFromCompany while getting Response::::" + ex);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();

				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString) && xmlString.contains("Table1")) {

				xmlString = xmlString.replace(
						"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">",
						"<BAPI_RESULT>");
				xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "</BAPI_RESULT>");
				xmlString = xmlString.replace(" xmlns=\"\"", "");

				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());

				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(GetDivisionsFromCompanyResponse.class);
					JAXBContext jc = createInstance(GetDivisionsFromCompanyResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					getDivisionsFromCompanyResponse = (GetDivisionsFromCompanyResponse) unmarshaller.unmarshal(wsResponse);
				} catch (JAXBException e) {
					LOG.error("Error occured  while getting xmlString :::" + e);
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in getDivisionsFromCompany");
						}
					}
				}

			}
		}

		return getDivisionsFromCompanyResponse;
	}

	@Override
	public GetAreaFromDivisionResponse getAreaFromDivisionResponse(GetAreaFromDivisionRequest getAreaFromDivisionRequest) {
		GetAreaFromDivisionResponse getAreaFromDivisionResponse = null;
		GetAreasFromDivisionResponseGetAreasFromDivisionResult response = null;
		try {

			response = service1Soap.getAreasFromDivision(getAreaFromDivisionRequest.getByplWebServiceKey(), getAreaFromDivisionRequest.getDivisionCode());

		} catch (RemoteException ex) {
			LOG.debug("Error Occoured in getAreasFromDivision while getting Response::::" + ex);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();

				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString) && xmlString.contains("Table1")) {

				xmlString = xmlString.replace(
						"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">",
						"<BAPI_RESULT>");
				xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "</BAPI_RESULT>");
				xmlString = xmlString.replace(" xmlns=\"\"", "");

				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(GetAreaFromDivisionResponse.class);
					JAXBContext jc = createInstance(GetAreaFromDivisionResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					getAreaFromDivisionResponse = (GetAreaFromDivisionResponse) unmarshaller.unmarshal(wsResponse);

				} catch (JAXBException e) {
					LOG.error("Error occured  while getting xmlString :::" + e);
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in getAreaFromDivisionResponse");
						}
					}
				}

			}
		}

		return getAreaFromDivisionResponse;
	}

	@Override
	public RegisterWebComplaintResponse registerWebComplaintResponse(RegisterWebComplaintRequest registerWebComplaintRequest) {
		RegisterWebComplaintResponse registerWebComplaintResponse = null;
		RegisterWebComplaintResponseRegisterWebComplaintResult response = null;
		try {
			response = service1Soap.registerWebComplaint(registerWebComplaintRequest.getByplWebServiceKey(), registerWebComplaintRequest.getName(),
					registerWebComplaintRequest.getPhone(), registerWebComplaintRequest.getAddress(), registerWebComplaintRequest.getEmail(),
					registerWebComplaintRequest.getCano(), registerWebComplaintRequest.getArea(), registerWebComplaintRequest.getFaultCat(),
					registerWebComplaintRequest.getFaultType(), registerWebComplaintRequest.getRemarks(), registerWebComplaintRequest.getPoleno());
		} catch (RemoteException ex) {
			LOG.error("Error Occoured in registerWebComplaint while getting Response::::" + ex);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString) && xmlString.contains("Table1")) {

				xmlString = xmlString.replace(
						"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">", "");
				xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "");
				xmlString = xmlString.replace("<NewDataSet xmlns=\"\">", "");
				xmlString = xmlString.replace("</NewDataSet>", "");
				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(RegisterWebComplaintResponse.class);
					JAXBContext jc = createInstance(RegisterWebComplaintResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					registerWebComplaintResponse = (RegisterWebComplaintResponse) unmarshaller.unmarshal(wsResponse);
				} catch (JAXBException e) {
					LOG.error("Error occured  while getting xmlString :::" + e);
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in getRegisterWebComanplaintResponse");
						}
					}
				}

			}
		}

		return registerWebComplaintResponse;
	}

	@Override
	/**
	 * @author Deval Mehta
	 * @param
	 * @return
	 */
	public DskAddUpdateConnectionResponse addUpdateConnection(DskAddUpdateConnectionRequest dskAddUpdateConnectionRequest) {
		DskAddUpdateConnectionResponse dskAddUpdateConnectionResponse = new DskAddUpdateConnectionResponse();
		Z_BAPI_ZDSS_WEB_LINKResponseZ_BAPI_ZDSS_WEB_LINKResult response = null;
		try {
			response = webServiceSoap.z_BAPI_ZDSS_WEB_LINK(dskAddUpdateConnectionRequest.getRequestTypeCode(), dskAddUpdateConnectionRequest.getsCaNumber(),
					dskAddUpdateConnectionRequest.getsConsRef(), dskAddUpdateConnectionRequest.getBussinessPartnerCategory(),
					dskAddUpdateConnectionRequest.getBussinessPartnerType(), dskAddUpdateConnectionRequest.getTitleText(), dskAddUpdateConnectionRequest.getFirstName(),
					dskAddUpdateConnectionRequest.getLastName(), dskAddUpdateConnectionRequest.getMiddleName(), dskAddUpdateConnectionRequest.getFathersName(),
					dskAddUpdateConnectionRequest.getHouseNo(), dskAddUpdateConnectionRequest.getBuidlingName(), dskAddUpdateConnectionRequest.getStreet(),
					dskAddUpdateConnectionRequest.getArea(), dskAddUpdateConnectionRequest.getLandMark(), dskAddUpdateConnectionRequest.getPinCode(),
					dskAddUpdateConnectionRequest.getCity(), dskAddUpdateConnectionRequest.getEmail(), dskAddUpdateConnectionRequest.getPhoneNo(),
					dskAddUpdateConnectionRequest.getMobileNo(), dskAddUpdateConnectionRequest.getFemale(), dskAddUpdateConnectionRequest.getMale(),
					dskAddUpdateConnectionRequest.getOccupation(), dskAddUpdateConnectionRequest.getIdType(), dskAddUpdateConnectionRequest.getIdNumaber(),
					dskAddUpdateConnectionRequest.getPlanningPlant(), dskAddUpdateConnectionRequest.getWorkCenter(), dskAddUpdateConnectionRequest.getSystemCond(),
					dskAddUpdateConnectionRequest.getCategory(), dskAddUpdateConnectionRequest.getAppliedLoadKw(), dskAddUpdateConnectionRequest.getAppliedLoadKva(),
					dskAddUpdateConnectionRequest.getConnectionType(), dskAddUpdateConnectionRequest.getStatementCode(), dskAddUpdateConnectionRequest.getStartDate(),
					dskAddUpdateConnectionRequest.getStartTime(), dskAddUpdateConnectionRequest.getFinishDate(), dskAddUpdateConnectionRequest.getFinishTime(),
					dskAddUpdateConnectionRequest.getSortField(), dskAddUpdateConnectionRequest.getAbkrs());
			if (Validator.isNotNull(response) && response != null) {
				MessageElement[] msgElementArr = response.get_any();
				String xmlString = StringPool.BLANK;
				if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
					try {
						xmlString = msgElementArr[1].getAsString();
					} catch (Exception e) {
						LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
					}
				}

				List<String> elementNameLst = new ArrayList<String>();
				elementNameLst.add("diffgr:diffgram");
				elementNameLst.add("BAPI_RESULT");
				elementNameLst.add("ISUSTDTable");

				xmlString = removeAttribute(xmlString, elementNameLst);

				dskAddUpdateConnectionResponse = BsesSapConnectorServiceHelper.getResponseForAddUpdateConnection(xmlString, dskAddUpdateConnectionResponse);
			}
		} catch (RemoteException e1) {
			LOG.error("Error occured addUpdateConnection while getting response :::" + e1);
		}
		return dskAddUpdateConnectionResponse;
	}

	/**
	 * @author alok.pal
	 * @param orderNo
	 * 
	 */
	@Override
	public ZBapiFicaDemandResponse getBillDetailsByOrderNo(ZBapiFicaDemandRequest request) {
		ZBapiFicaDemandResponse zBapiFicaDemandResponse = null;

		ZBAPI_FICA_DEMAND_NOTEResponseZBAPI_FICA_DEMAND_NOTEResult response = null;

		try {
			response = webServiceSoap.ZBAPI_FICA_DEMAND_NOTE(request.getStrORDER_NO());
		} catch (RemoteException e1) {
			LOG.error("Error occured getCmsISUCADisplay while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			zBapiFicaDemandResponse = getFicaBillDetails(xmlString);
		}

		return zBapiFicaDemandResponse;
	}

	/**
	 * @author alok.pal
	 * @param xmlString
	 * @return
	 */
	private ZBapiFicaDemandResponse getFicaBillDetails(String xmlString) {
		ZBapiFicaDemandResponse zBapiFicaDemandResponse = null;
		if (Validator.isNotNull(xmlString)) {
			if (xmlString.contains(BsesSapConnectorServiceConstant.ZBAPI_FICA_DETAILS)) {
				zBapiFicaDemandResponse = getResponseAfterParserForFica(xmlString);
			} else if (xmlString.contains(BsesSapConnectorServiceConstant.ZBAPI_FICA_ERROR_CONSTANT)) {
				zBapiFicaDemandResponse = getErrorResponseAfterParserForFica(xmlString);
			} else if (xmlString.contains(BsesSapConnectorServiceConstant.MESSAGE_TABLE)) {
				zBapiFicaDemandResponse = getErrorResponse(xmlString);
			}
		}
		return zBapiFicaDemandResponse;
	}

	private ZBapiFicaDemandResponse getErrorResponse(String xmlString) {
		ZBapiFicaDemandResponse zBapiFicaDemandResponse = new ZBapiFicaDemandResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		List<ZBapiFicaDemandDetailsError> zBapiFicaDemandDetailsErrorList = new ArrayList<>();
		ZBapiFicaDemandDetailsError zBapiFicaDemandDetailsError = new ZBapiFicaDemandDetailsError();
		InputStream is = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			Document doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();

			NodeList msgList = doc.getElementsByTagName(BsesSapConnectorServiceConstant.MESSAGE_TABLE);
			if (msgList != null) {
				Node nNode = msgList.item(0);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String message = eElement.getElementsByTagName(BsesSapConnectorServiceConstant.MESSAGE_TEXT).item(0).getTextContent();
					zBapiFicaDemandDetailsError.setMessage(message);
					zBapiFicaDemandDetailsErrorList.add(zBapiFicaDemandDetailsError);
					zBapiFicaDemandResponse.setzBapiFicaDemandDetailsErrorList(zBapiFicaDemandDetailsErrorList);
				}
			}

		} catch (ParserConfigurationException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e);
		} catch (SAXException se) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + se);
		} catch (IOException e1) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e1);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponse");
				}
			}
		}
		return zBapiFicaDemandResponse;

	}

	/**
	 * @author alok.pal
	 * @param xmlString
	 * @return
	 */
	private ZBapiFicaDemandResponse getErrorResponseAfterParserForFica(String xmlString) {
		ZBapiFicaDemandResponse zBapiFicaDemandResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("SAPDATA_ErrorDataTable");

		xmlString = removeAttribute(xmlString, elementNameLst);

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		xmlString = xmlString.replaceAll("diffgr:id=\"SAPDATA_ErrorDataTable([0-9]+)\" msdata:rowOrder=\"([0-9]+)\" diffgr:hasChanges=\"inserted\"", StringPool.BLANK);
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {

			/*
			 * Implementation changed to Singleton by Liferay to avoid creation
			 * of Objects
			 */
			// JAXBContext jc =
			// JAXBContext.newInstance(ZBapiFicaDemandResponse.class);
			JAXBContext jc = createInstance(ZBapiFicaDemandResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			zBapiFicaDemandResponse = (ZBapiFicaDemandResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponseAfterParserForFica");
				}
			}
		}
		return zBapiFicaDemandResponse;
	}

	/**
	 * @author alok.pal
	 * @param xmlStrings
	 * @return this will return response which contains message
	 */
	private ZBapiFicaDemandResponse getResponseAfterParserForFica(String xmlString) {
		ZBapiFicaDemandResponse zBapiFicaDemandResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("OutputTable");

		xmlString = removeAttribute(xmlString, elementNameLst);

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		xmlString = xmlString.replaceAll("diffgr:id=\"OutputTable([0-9]+)\" msdata:rowOrder=\"([0-9]+)\" diffgr:hasChanges=\"inserted\"", StringPool.BLANK);
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {

			/*
			 * Implementation changed to Singleton by Liferay to avoid creation
			 * of Objects
			 */
			// JAXBContext jc =
			// JAXBContext.newInstance(ZBapiFicaDemandResponse.class);
			JAXBContext jc = createInstance(ZBapiFicaDemandResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			zBapiFicaDemandResponse = (ZBapiFicaDemandResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getResponseAfterParserForFica");
				}
			}
		}
		return zBapiFicaDemandResponse;
	}

	@Override
	public ComplaintStatusResponse getComplaintStatus(ComplaintStatusRequest request) {
		ComplaintStatusResponse complaintStatusResponse = null;
		ComplaintStatusResponseComplaintStatusResult response = null;
		try {
			response = webGISServiceSoap.complaintStatus(request.getCaOrCompalintNo());

		} catch (RemoteException ex) {
			LOG.error("Error Occoured in getComplaintStatus while getting Response::::" + ex);
		}

		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString) && xmlString.contains("CMS_x0020_Complaint_x0020_Status")) {

				xmlString = xmlString.replace(
						"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">", "");

				xmlString = xmlString.replaceAll("<DocumentElement xmlns=\"\">", "");
				xmlString = xmlString.replaceAll("</DocumentElement>", "");
				xmlString = xmlString.replaceAll(" diffgr:id=\"CMS Complaint Status1\" ", "");
				xmlString = xmlString.replaceAll("msdata:rowOrder=\"0\"", "");
				xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "");
				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(ComplaintStatusResponse.class);
					JAXBContext jc = createInstance(ComplaintStatusResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					complaintStatusResponse = (ComplaintStatusResponse) unmarshaller.unmarshal(wsResponse);
				} catch (JAXBException e) {
					LOG.error("Error occured  while getting xmlString :::" + e);
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in getComplaintStatus");
						}
					}
				}

			}
		}

		return complaintStatusResponse;
	}

	@Override
	public GetComplaintStatusResponse getComplaintStatusResponse(GetComplaintStatusRequest request) {
		GetComplaintStatusResponse getComplaintStatusResponse = null;
		GetComplaintStatusResponseGetComplaintStatusResult response = null;

		try {
			response = service1Soap.getComplaintStatus(request.getByplWebServiceKey(), request.getComplaintNo(), "");

		} catch (RemoteException ex) {
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			if (Validator.isNotNull(xmlString) && xmlString.contains("Table1")) {

				xmlString = xmlString.replace(
						"<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">", "");

				xmlString = xmlString.replaceAll("<NewDataSet xmlns=\"\">", "");
				xmlString = xmlString.replaceAll("</NewDataSet>", "");
				xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "");
				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(GetComplaintStatusResponse.class);
					JAXBContext jc = createInstance(GetComplaintStatusResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					getComplaintStatusResponse = (GetComplaintStatusResponse) unmarshaller.unmarshal(wsResponse);
				} catch (JAXBException e) {
					LOG.error("Error occured  while getting xmlString :::" + e);
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in getComplaintStatusResponse");
						}
					}
				}

			}

		}
		return getComplaintStatusResponse;
	}

	/**
	 * @author alok.pal
	 */
	@Override
	public DemandOnlineBillPdfResponse getDemandNoteOnlinePDF(DemandOnlineBillPdfResquest request) {
		DemandOnlineBillPdfResponse demandBillPdfResponse = null;
		try {
			/*
			 * String xmlString =
			 * "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">"
			 * + "<soapenv:Header/>" + "<soapenv:Body>" +
			 * "<tem:ZBAPI_DEMAND_NOTE_ONLINE>" + "<tem:strOrder>" +
			 * request.getOrderNumber() + "</tem:strOrder>" +
			 * "</tem:ZBAPI_DEMAND_NOTE_ONLINE>" + "</soapenv:Body>" +
			 * "</soapenv:Envelope>";
			 */
			StringBuilder str = new StringBuilder();
			str.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">").append("<soapenv:Header/>")
					.append("<soapenv:Body>").append("<tem:ZBAPI_DEMAND_NOTE_ONLINE>").append("<tem:strOrder>").append(request.getOrderNumber()).append("</tem:strOrder>")
					.append("</tem:ZBAPI_DEMAND_NOTE_ONLINE>").append("</soapenv:Body>").append("</soapenv:Envelope>");
			String xmlString = str.toString();

			String responseString = getWSResponseWithPlainJavaAPI(CommonUtilConstant.ZBAPI_DEMAND_NOTE_ONLINE, CommonUtilConstant.ISU_SERVICE_HOST, xmlString);
			if (Validator.isNotNull(responseString)) {
				String resultString = substringBetween(responseString, "</xs:schema>", "</ZBAPI_DEMAND_NOTE_ONLINEResult>");
				demandBillPdfResponse = getDemandOnlineBillPDF(resultString);
			}
		} catch (Exception e1) {
			LOG.error("Error occured while updateZ_BAPI_ZDSS_WEB_LINK :::" + e1);
		}

		return demandBillPdfResponse;
	}

	private DemandOnlineBillPdfResponse getDemandOnlineBillPDF(String xmlString) {
		DemandOnlineBillPdfResponse onlineBillPdfResponse = new DemandOnlineBillPdfResponse();
		if (Validator.isNotNull(xmlString)) {
			if (xmlString.contains(BsesSapConnectorServiceConstant.Z_DEMAND_BILL_PDF_TABLE)) {
				String output = xmlString;
				int startIndex = output.indexOf("<BAPI_RESULT");
				int endIndex = output.indexOf("</diffgr:diffgram>");
				output = output.substring(startIndex, endIndex);
				output = StringUtil.replace(output, "<BAPI_RESULT xmlns=\"\">", "");
				output = StringUtil.replace(output, "</BAPI_RESULT>", "");
				output = StringUtil.replace(output, "diffgr:hasChanges=\"inserted\"", "");
				output = StringUtil.replace(output, " diffgr:hasChanges=\"inserted\"", "");
				output = output.replaceAll("msdata:rowOrder=\"([0-9]+\")", "");
				output = output.replaceAll("msdata:rowOrder=\"([0-9]+\")", "");
				output = output.replaceAll(" diffgr:id=\"ZPDFTable([0-9]+)\"", "");
				output = StringUtil.replace(output, "<ZPDFTable  >", "");
				output = StringUtil.replace(output, "</ZPDFTable>", "");
				output = StringUtil.replace(output, "<Tdline>", "");
				output = StringUtil.replace(output, "</Tdline>", "\n");
				output = StringUtil.replace(output, "<Tdline />", "");
				output = output.replaceAll("&#x0;", "");
				output = StringEscapeUtils.unescapeHtml4(output);
				output = output.substring(0, output.indexOf("%EOF") + 4);
				/*
				 * byte[] bytes1 = output.getBytes(); Path path1 = Paths.get(
				 * "C:\\Users\\alok.pal.KADC\\Desktop\\BsesPDF\\DemandNotePDF\\ResponseAfterUnEscape.pdf"
				 * ); try { Files.write(path1, bytes1); } catch (IOException e){
				 * }
				 */
				onlineBillPdfResponse.setBillContent(output.getBytes());

			} else if (xmlString.contains(BsesSapConnectorServiceConstant.DEMAND_BILL_PDF_MESSAGE_ERROR_TAG)) {
				onlineBillPdfResponse = getDemandOnlineBillPDFErrorResAftPar(xmlString);
			} else if (xmlString.contains(BsesSapConnectorServiceConstant.DEMAND_BILL_PDF_OUTABLE_ERROR_TAG)) {
				onlineBillPdfResponse = getDemandOnlineBillPDFErrorResAftPar(xmlString);
			}
		}
		return onlineBillPdfResponse;
	}

	private DemandOnlineBillPdfResponse getDemandOnlineBillPDFErrorResAftPar(String xmlString) {
		DemandOnlineBillPdfResponse onlineBillPdfResponse = new DemandOnlineBillPdfResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		InputStream is = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			Document doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();
			NodeList msgList = null;
			if (xmlString.contains(BsesSapConnectorServiceConstant.DEMAND_BILL_PDF_MESSAGE_ERROR_TAG)) {
				msgList = doc.getElementsByTagName(BsesSapConnectorServiceConstant.DEMAND_BILL_PDF_MESSAGE_ERROR_TAG);
			} else if (xmlString.contains(BsesSapConnectorServiceConstant.DEMAND_BILL_PDF_OUTABLE_ERROR_TAG)) {
				msgList = doc.getElementsByTagName(BsesSapConnectorServiceConstant.DEMAND_BILL_PDF_OUTABLE_ERROR_TAG);
			}

			if (msgList != null) {
				Node nNode = msgList.item(0);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String message = eElement.getElementsByTagName(BsesSapConnectorServiceConstant.MESSAGE_TEXT).item(0).getTextContent();
					onlineBillPdfResponse.setMessage(message);
					onlineBillPdfResponse.setFlag(true);
				}
			}

		} catch (ParserConfigurationException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e);
		} catch (SAXException se) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + se);
		} catch (IOException e1) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e1);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getDemandOnlinePDFErrorAftPar");
				}
			}
		}
		return onlineBillPdfResponse;
	}

	/**
	 * @author alok.pal updating DssWeblinkServices
	 */
	@Override
	public DssWebLinkResponse addZ_BAPI_ZDSS_WEB_LINK(DssWebLinkRequest webLinkRequest) {
		DssWebLinkResponse webLinkWebResponse = null;
		try {
			/*
			 * String xmlString =
			 * "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">"
			 * + "<soapenv:Header/>" + "<soapenv:Body>" +
			 * "<tem:Z_BAPI_ZDSS_WEB_LINK>" + "<tem:I_ILART>" +
			 * webLinkRequest.getiIlart() + "</tem:I_ILART>" + "<tem:I_VKONT>" +
			 * webLinkRequest.getiVkont() + "</tem:I_VKONT>" + "<tem:I_VKONA>" +
			 * webLinkRequest.getiVkona() + "</tem:I_VKONA>" +
			 * "<tem:PARTNERCATEGORY>" + webLinkRequest.getParentCategory() +
			 * "</tem:PARTNERCATEGORY>" + "<tem:PARTNERTYPE>" +
			 * webLinkRequest.getPartnerType() + "</tem:PARTNERTYPE>" +
			 * "<tem:TITLE_KEY>" + webLinkRequest.getTitleKey() +
			 * "</tem:TITLE_KEY>" + "<tem:FIRSTNAME>" +
			 * webLinkRequest.getFirstName() + "</tem:FIRSTNAME>" +
			 * "<tem:LASTNAME>" + webLinkRequest.getLastName() +
			 * "</tem:LASTNAME>" + "<tem:MIDDLENAME>" +
			 * webLinkRequest.getMiddleName() + "</tem:MIDDLENAME>" +
			 * "<tem:FATHERSNAME>" + webLinkRequest.getFathersName() +
			 * "</tem:FATHERSNAME>" + "<tem:HOUSE_NO>" +
			 * webLinkRequest.getHouseNo() + "</tem:HOUSE_NO>" +
			 * "<tem:BUILDING>" + webLinkRequest.getBuilding() +
			 * "</tem:BUILDING>" + "<tem:STR_SUPPL1>" +
			 * webLinkRequest.getStrSupp1() + "</tem:STR_SUPPL1>" +
			 * "<tem:STR_SUPPL2>" + webLinkRequest.getStrSupp2() +
			 * "</tem:STR_SUPPL2>" + "<tem:STR_SUPPL3>" +
			 * webLinkRequest.getStrSupp3() + "</tem:STR_SUPPL3>" +
			 * "<tem:POSTL_COD1>" + webLinkRequest.getPostlCod1() +
			 * "</tem:POSTL_COD1>" + "<tem:CITY>" + webLinkRequest.getCity() +
			 * "</tem:CITY>" + "<tem:E_MAIL>" + webLinkRequest.getEmail() +
			 * "</tem:E_MAIL>" + "<tem:LANDLINE>" + webLinkRequest.getLandLine()
			 * + "</tem:LANDLINE>" + "<tem:MOBILE>" + webLinkRequest.getMobile()
			 * + "</tem:MOBILE>" + "<tem:FEMALE>" + webLinkRequest.getFemale() +
			 * "</tem:FEMALE>" + "<tem:MALE>" + webLinkRequest.getMale() +
			 * "</tem:MALE>" + "<tem:JOBGR>" + webLinkRequest.getJobGr() +
			 * "</tem:JOBGR>" + "<tem:IDTYPE>" + webLinkRequest.getIdType() +
			 * "</tem:IDTYPE>" + "<tem:IDNUMBER>" + webLinkRequest.getIdNumber()
			 * + "</tem:IDNUMBER>" + "<tem:PLANNINGPLANT>" +
			 * webLinkRequest.getPlanningPlant() + "</tem:PLANNINGPLANT>" +
			 * "<tem:WORKCENTRE>" + webLinkRequest.getWorkCenter() +
			 * "</tem:WORKCENTRE>" + "<tem:SYSTEMCOND>" +
			 * webLinkRequest.getSystemCond() + "</tem:SYSTEMCOND>" +
			 * "<tem:APPLIEDCAT>" + webLinkRequest.getAppliedCat() +
			 * "</tem:APPLIEDCAT>" + "<tem:APPLIEDLOAD>" +
			 * webLinkRequest.getAppliedLoad() + "</tem:APPLIEDLOAD>" +
			 * "<tem:APPLIEDLOADKVA>" + webLinkRequest.getAppliedLoadDkva() +
			 * "</tem:APPLIEDLOADKVA>" + "<tem:CONNECTIONTYPE>" +
			 * webLinkRequest.getConnectionType() + "</tem:CONNECTIONTYPE>" +
			 * "<tem:STATEMENT_CA>" + webLinkRequest.getStatementCA() +
			 * "</tem:STATEMENT_CA>" + "<tem:START_DATE>" +
			 * webLinkRequest.getStartDate() + "</tem:START_DATE>" +
			 * "<tem:START_TIME>" + webLinkRequest.getStartTime() +
			 * "</tem:START_TIME>" + "<tem:FINISH_DATE>" +
			 * webLinkRequest.getFinishDate() + "</tem:FINISH_DATE>" +
			 * "<tem:FINISH_TIME>" + webLinkRequest.getFinishTime() +
			 * "</tem:FINISH_TIME>" + "<tem:SORTFIELD>" +
			 * webLinkRequest.getSortField() + "</tem:SORTFIELD>" +
			 * "<tem:ABKRS>" + webLinkRequest.getAbkrs() + "</tem:ABKRS>" +
			 * "</tem:Z_BAPI_ZDSS_WEB_LINK>" + "</soapenv:Body>" +
			 * "</soapenv:Envelope>";
			 */
			StringBuilder str = new StringBuilder();
			str.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">").append("<soapenv:Header/>")
					.append("<soapenv:Body>").append("<tem:Z_BAPI_ZDSS_WEB_LINK>").append("<tem:I_ILART>").append(webLinkRequest.getiIlart()).append("</tem:I_ILART>")
					.append("<tem:I_VKONT>").append(webLinkRequest.getiVkont()).append("</tem:I_VKONT>").append("<tem:I_VKONA>").append(webLinkRequest.getiVkona())
					.append("</tem:I_VKONA>").append("<tem:PARTNERCATEGORY>").append(webLinkRequest.getParentCategory()).append("</tem:PARTNERCATEGORY>")
					.append("<tem:PARTNERTYPE>").append(webLinkRequest.getPartnerType()).append("</tem:PARTNERTYPE>").append("<tem:TITLE_KEY>")
					.append(webLinkRequest.getTitleKey()).append("</tem:TITLE_KEY>").append("<tem:FIRSTNAME>").append(webLinkRequest.getFirstName())
					.append("</tem:FIRSTNAME>").append("<tem:LASTNAME>").append(webLinkRequest.getLastName()).append("</tem:LASTNAME>").append("<tem:MIDDLENAME>")
					.append(webLinkRequest.getMiddleName()).append("</tem:MIDDLENAME>").append("<tem:FATHERSNAME>").append(webLinkRequest.getFathersName())
					.append("</tem:FATHERSNAME>").append("<tem:HOUSE_NO>").append(webLinkRequest.getHouseNo()).append("</tem:HOUSE_NO>").append("<tem:BUILDING>")
					.append(webLinkRequest.getBuilding()).append("</tem:BUILDING>").append("<tem:STR_SUPPL1>").append(webLinkRequest.getStrSupp1())
					.append("</tem:STR_SUPPL1>").append("<tem:STR_SUPPL2>").append(webLinkRequest.getStrSupp2()).append("</tem:STR_SUPPL2>").append("<tem:STR_SUPPL3>")
					.append(webLinkRequest.getStrSupp3()).append("</tem:STR_SUPPL3>").append("<tem:POSTL_COD1>").append(webLinkRequest.getPostlCod1())
					.append("</tem:POSTL_COD1>").append("<tem:CITY>").append(webLinkRequest.getCity()).append("</tem:CITY>").append("<tem:E_MAIL>")
					.append(webLinkRequest.getEmail()).append("</tem:E_MAIL>").append("<tem:LANDLINE>").append(webLinkRequest.getLandLine()).append("</tem:LANDLINE>")
					.append("<tem:MOBILE>").append(webLinkRequest.getMobile()).append("</tem:MOBILE>").append("<tem:FEMALE>").append(webLinkRequest.getFemale())
					.append("</tem:FEMALE>").append("<tem:MALE>").append(webLinkRequest.getMale()).append("</tem:MALE>").append("<tem:JOBGR>")
					.append(webLinkRequest.getJobGr()).append("</tem:JOBGR>").append("<tem:IDTYPE>").append(webLinkRequest.getIdType()).append("</tem:IDTYPE>")
					.append("<tem:IDNUMBER>").append(webLinkRequest.getIdNumber()).append("</tem:IDNUMBER>").append("<tem:PLANNINGPLANT>")
					.append(webLinkRequest.getPlanningPlant()).append("</tem:PLANNINGPLANT>").append("<tem:WORKCENTRE>").append(webLinkRequest.getWorkCenter())
					.append("</tem:WORKCENTRE>").append("<tem:SYSTEMCOND>").append(webLinkRequest.getSystemCond()).append("</tem:SYSTEMCOND>").append("<tem:APPLIEDCAT>")
					.append(webLinkRequest.getAppliedCat()).append("</tem:APPLIEDCAT>").append("<tem:APPLIEDLOAD>").append(webLinkRequest.getAppliedLoad())
					.append("</tem:APPLIEDLOAD>").append("<tem:APPLIEDLOADKVA>").append(webLinkRequest.getAppliedLoadDkva()).append("</tem:APPLIEDLOADKVA>")
					.append("<tem:CONNECTIONTYPE>").append(webLinkRequest.getConnectionType()).append("</tem:CONNECTIONTYPE>").append("<tem:STATEMENT_CA>")
					.append(webLinkRequest.getStatementCA()).append("</tem:STATEMENT_CA>").append("<tem:START_DATE>").append(webLinkRequest.getStartDate())
					.append("</tem:START_DATE>").append("<tem:START_TIME>").append(webLinkRequest.getStartTime()).append("</tem:START_TIME>").append("<tem:FINISH_DATE>")
					.append(webLinkRequest.getFinishDate()).append("</tem:FINISH_DATE>").append("<tem:FINISH_TIME>").append(webLinkRequest.getFinishTime())
					.append("</tem:FINISH_TIME>").append("<tem:SORTFIELD>").append(webLinkRequest.getSortField()).append("</tem:SORTFIELD>").append("<tem:ABKRS>")
					.append(webLinkRequest.getAbkrs()).append("</tem:ABKRS>").append("</tem:Z_BAPI_ZDSS_WEB_LINK>").append("</soapenv:Body>")
					.append("</soapenv:Envelope>");
			String xmlString = str.toString();
			String responseString = getWSResponseWithPlainJavaAPI(CommonUtilConstant.Z_BAPI_ZDSS_WEB_LINK, CommonUtilConstant.ISU_SERVICE_HOST, xmlString);
			if (Validator.isNotNull(responseString)) {
				String resultString = substringBetween(responseString, "</xs:schema>", "</Z_BAPI_ZDSS_WEB_LINKResult>");
				webLinkWebResponse = getDssWebLinkResponse(resultString);
			}
		} catch (Exception e1) {
			LOG.error("Error occured while updateZ_BAPI_ZDSS_WEB_LINK :::" + e1);
		}
		return webLinkWebResponse;
	}

	/**
	 * @author alok.pal
	 * @param xmlString
	 * @return
	 */
	private DssWebLinkResponse getDssWebLinkResponse(String xmlString) {
		DssWebLinkResponse webLinkWebResponse = null;
		if (xmlString.contains("outputFlagsTable")) {
			xmlString = xmlString
					.replace("<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">", "");
			xmlString = xmlString.replace("diffgr:id=\"outputFlagsTable1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
			// xmlString = xmlString.replace("<BAPI_RESULT xmlns=\"\">",
			// "").replace("</BAPI_RESULT>","");
			xmlString = xmlString.replace("</diffgr:diffgram>", "");

			xmlString = xmlString.replace("diffgr:id=\"SAPDATA_ErrorDataTable1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");

			xmlString = xmlString.replaceAll("diffgr:id=\"ErrorTable([0-9]+\")", "");
			xmlString = xmlString.replaceAll("msdata:rowOrder=\"([0-9]+\")", "");
			xmlString = xmlString.replaceAll("diffgr:hasChanges=\"inserted\"", "");

			InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
			try {

				/*
				 * Implementation changed to Singleton by Liferay to avoid
				 * creation of Objects
				 */
				// JAXBContext jc =
				// JAXBContext.newInstance(DssWebLinkResponse.class);
				JAXBContext jc = createInstance(DssWebLinkResponse.class);
				Unmarshaller unmarshaller = jc.createUnmarshaller();
				webLinkWebResponse = (DssWebLinkResponse) unmarshaller.unmarshal(wsResponse);
			} catch (JAXBException e) {
				e.printStackTrace();
			} finally {
				if (Validator.isNotNull(wsResponse)) {
					try {
						wsResponse.close();
					} catch (IOException e) {
						LOG.error("Error Closing InputStream in getDssWebLinkResponse");
					}
				}
			}

		}
		return webLinkWebResponse;
	}

	public DssISUCADisplayResponse getDssISUCADisplay(DssISUCADisplayRequest request) {
		
		DssISUCADisplayResponse dssISUCADisplayResponse = null;

		Z_BAPI_DSS_ISU_CA_DISPLAYResponseZ_BAPI_DSS_ISU_CA_DISPLAYResult response = null;

		try {
			response = webServiceSoap.z_BAPI_DSS_ISU_CA_DISPLAY(request.getCaNumber(), null);
		} catch (RemoteException e1) {
			LOG.error("Error occured getDssISUCADisplay while getting response ::> " + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			dssISUCADisplayResponse = getDssISUCADisplay(xmlString);
		}

		return dssISUCADisplayResponse;
	}

	/**
	 * 
	 * @param xmlString
	 * @return
	 */
	private DssISUCADisplayResponse getDssISUCADisplay(String xmlString) {
		DssISUCADisplayResponse dssISUCADisplayResponse = null;
		if (Validator.isNotNull(xmlString)) {
			if (xmlString.contains(BsesSapConnectorServiceConstant.ISU_DISPALY_DATA_CONSTANT)) {
				dssISUCADisplayResponse = getDssResponseAfterParser(xmlString);
			} else if (xmlString.contains(BsesSapConnectorServiceConstant.ISU_DISPALY_ERROR_CONSTANT)) {
				dssISUCADisplayResponse = getDssErrorResponseAfterParser(xmlString);
			}
		}
		return dssISUCADisplayResponse;
	}

	/**
	 * 
	 * @param xmlString
	 * @return
	 */
	private DssISUCADisplayResponse getDssResponseAfterParser(String xmlString) {
		DssISUCADisplayResponse dssISUCADisplayResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("ISUSTDTable");

		xmlString = removeAttribute(xmlString, elementNameLst);

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"ISUSTDTable1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		// xmlString = xmlString.replace("<BAPI_RESULT xmlns=\"\">",
		// "").replace("</BAPI_RESULT>", "");
		xmlString = xmlString.replace("<BAPI_RESULT>", "").replace("</BAPI_RESULT>", "");

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			/*
			 * Implementation changed to Singleton by Liferay to avoid creation
			 * of Objects
			 */
			// JAXBContext jc =
			// JAXBContext.newInstance(DssISUCADisplayResponse.class);
			JAXBContext jc = createInstance(DssISUCADisplayResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			dssISUCADisplayResponse = (DssISUCADisplayResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getDssResponseAfterParser");
				}
			}
		}
		return dssISUCADisplayResponse;
	}

	/**
	 * 
	 * @param xmlString
	 * @return
	 */
	private DssISUCADisplayResponse getDssErrorResponseAfterParser(String xmlString) {
		DssISUCADisplayResponse dssISUCADisplayResponse = new DssISUCADisplayResponse();
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		InputStream is = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			Document doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();

			NodeList msgList = doc.getElementsByTagName(BsesSapConnectorServiceConstant.ISU_DISPALY_ERROR_CONSTANT);
			if (msgList != null) {
				Node nNode = msgList.item(0);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					String message = eElement.getElementsByTagName(BsesSapConnectorServiceConstant.MESSAGE).item(0).getTextContent();
					dssISUCADisplayResponse.setMessage(message);
					dssISUCADisplayResponse.setFlag(Boolean.TRUE);
				}
			}

		} catch (ParserConfigurationException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e);
		} catch (SAXException se) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + se);
		} catch (IOException e1) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e1);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getDssErrorResponseParser");
				}
			}
		}
		return dssISUCADisplayResponse;
	}

	/**
	 * This method will make web service call with Pure JAVA API.
	 * 
	 * @param wsMethodName
	 * @param endPointName
	 * @param requestXML
	 * @return Response.
	 */
	public String getWSResponseWithPlainJavaAPI(String wsMethodName, String endPointName, String requestXML) {

		String wsURL = StringPool.BLANK;
		String responseString = StringPool.BLANK;
		StringBuffer outputSb = new StringBuffer();
		if (Validator.isNotNull(endPointName) && Validator.isNotNull(requestXML)) {

			if (CommonUtilConstant.ISU_SERVICE_HOST.equalsIgnoreCase(endPointName)) {
				wsURL =isuServiceHost;
			} else if (CommonUtilConstant.GIS_SERVICE_HOST.equalsIgnoreCase(endPointName)) {
				wsURL = gisServiceHost;
			} else if (CommonUtilConstant.SERVICE1_SERVICE_HOST.equalsIgnoreCase(endPointName)) {
				wsURL = service1ServiceHost;
			}

			if (Validator.isNotNull(wsURL)) {
				InputStreamReader isr = null;
				try {
					URL url = new URL(wsURL);
					URLConnection connection = url.openConnection();
					HttpURLConnection httpConn = (HttpURLConnection) connection;
					ByteArrayOutputStream bout = new ByteArrayOutputStream();
					byte[] buffer = new byte[requestXML.length()];
					buffer = requestXML.getBytes();
					bout.write(buffer);
					byte[] b = bout.toByteArray();
					String SOAPAction = "http://tempuri.org/" + wsMethodName;
					httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
					httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
					httpConn.setRequestProperty("SOAPAction", SOAPAction);
					httpConn.setRequestMethod("POST");
					httpConn.setDoOutput(true);
					httpConn.setDoInput(true);
					OutputStream out = httpConn.getOutputStream();
					// Write the content of the request to the outputstream of
					// the HTTP Connection.
					out.write(b);
					out.close();
					// Ready with sending the request.
					isr = new InputStreamReader(httpConn.getInputStream());
					BufferedReader in = new BufferedReader(isr);
					while ((responseString = in.readLine()) != null) {
						outputSb.append(responseString);
					}
				} catch (Exception e) {
					LOG.error("Error occured while calling web service with pure JAVA API : " + e);
				} finally {
					if (Validator.isNotNull(isr)) {
						try {
							isr.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStreamReader in getWSResponseWithPlainJavaAPI ");
						}
					}
				}
			}
		}

		return outputSb.toString();
	}

	public static String substringBetween(String str, String open, String close) {
		if (str == null || open == null || close == null) {
			return null;
		}
		int start = str.indexOf(open);
		if (start != -1) {
			int end = str.indexOf(close, start + open.length());
			if (end != -1) {
				return str.substring(start + open.length(), end);
			}
		}
		return null;
	}

	@Override
	public ZbapiCreateSOPostResponse myAccountComplaintRegistration(ZbapiCreateSOPostRequest request) {

		ZbapiCreateSOPostResponse zbapiCreateSOPostResponse = null;
		ZBAPI_CREATESO_POSTResponseZBAPI_CREATESO_POSTResult response = null;
		// Date startDate = new Date();
		try {

			response = webServiceSoap.ZBAPI_CREATESO_POST(request.getPmaufart(), request.getPlanPlant(), request.getRegioGroup(), request.getShortText(),
					request.getIla(), request.getMfText(), request.getUserFieldCH20(), request.getControkey(), request.getSerialNumber(), request.getComplaintGroup(),
					request.getCanumber(), request.getContract(), request.getMfText1());

		} catch (RemoteException e1) {
			LOG.error("Error occured myAccountComplaintRegistration while getting response ::> " + e1);
		}
		// Date endDate = new Date();

		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}

			List<String> elementNameLst = new ArrayList<String>();
			elementNameLst.add("diffgr:diffgram");
			elementNameLst.add("BAPI_RESULT");
			elementNameLst.add("OutputTable");
			elementNameLst.add("SAPDATA_ErrorDataTable");

			xmlString = removeAttribute(xmlString, elementNameLst);

			if (Validator.isNotNull(xmlString) && xmlString.contains("BAPI_RESULT")) {
				xmlString = xmlString.replace(
						/*
						 * "<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">"
						 * , "");
						 */
						"<diffgr:diffgram>", "");

				xmlString = xmlString.replaceAll(" diffgr:id=\"OutputTable1\"", "");
				xmlString = xmlString.replaceAll(" diffgr:id=\"SAPDATA_ErrorDataTable([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
				xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
				xmlString = xmlString.replace(" xmlns=\"\"", "");
				xmlString = xmlString.replace("</diffgr:diffgram>", "");

				InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
				try {

					/*
					 * Implementation changed to Singleton by Liferay to avoid
					 * creation of Objects
					 */
					// JAXBContext jc =
					// JAXBContext.newInstance(ZbapiCreateSOPostResponse.class);
					JAXBContext jc = createInstance(ZbapiCreateSOPostResponse.class);
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					zbapiCreateSOPostResponse = (ZbapiCreateSOPostResponse) unmarshaller.unmarshal(wsResponse);
					ZbapiCreateSOPostDetailResponse successResponse = zbapiCreateSOPostResponse.getZbapiCreateSOPostDetailResponse();
					ZbapiCreateSOPostErrorResponse errorResponse = zbapiCreateSOPostResponse.getZbapiCreateSOPostErrorResponse();
					if (Validator.isNotNull(successResponse) && Validator.isNotNull(errorResponse)) {
						if (Validator.isNotNull(successResponse.getOrderID())) {
							zbapiCreateSOPostResponse.setFlag(true);
						}
					} else if (Validator.isNotNull(errorResponse) && Validator.isNull(successResponse)) {
					}
				} catch (JAXBException e) {
					LOG.error(BsesSapConnectorServiceConstant.XMLSTRING_ERROR_MSG + e);
				}

				catch (Exception e) {
					LOG.error("error in ngetting error message:::" + e.getMessage());
				} finally {
					if (Validator.isNotNull(wsResponse)) {
						try {
							wsResponse.close();
						} catch (IOException e) {
							LOG.error("Error Closing InputStream in  myAccountComplaintRegistration");
						}
					}
				}

			}
		}

		return zbapiCreateSOPostResponse;
	}

	/**
	 * This method will remove all attribute and non required xml elements
	 * 
	 * @param xmlString
	 * @param elementNameLst
	 * @return
	 */
	private static String removeAttribute(String xmlString, List<String> elementNameLst) {
		StringBuffer returnString = new StringBuffer(xmlString);

		int elementIndex = 0;
		int startIndex = 0;
		int endIndex = 0;

		if (Validator.isNotNull(xmlString)) {
			if (Validator.isNotNull(elementNameLst) && !elementNameLst.isEmpty()) {
				for (String element : elementNameLst) {
					if (xmlString.contains(element)) {
						elementIndex = returnString.toString().indexOf(element);
						startIndex = elementIndex + element.length();
						endIndex = returnString.toString().indexOf((int) ('>'), startIndex);
						returnString.replace(startIndex, endIndex, "").toString();
					}
				}
			}
		}

		return returnString.toString();
	}

	/*
	 * The purpose of this method is to retrieve JAXBContext either from
	 * existing Map or creates new instance.
	 * 
	 * @param c
	 * 
	 * @return
	 */
	private JAXBContext createInstance(Class c) {
		return BsesJAXBConnector.getJAXBInstance(c);
	}

	@Override
	public ExemptMobileResponse getZBAPI_EXEMPT_MOBILE(String mobileNo) {
		ExemptMobileResponse exemptMobileResponse = null;
		ZBAPI_EXEMPT_MOBILEResponseZBAPI_EXEMPT_MOBILEResult response = null;
		try {
			response = webServiceSoapWS.ZBAPI_EXEMPT_MOBILE(mobileNo);
		} catch (RemoteException e1) {
			LOG.error("Error occured getZBAPI_EXEMPT_MOBILE while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			// LOG.info(msgElementArr);
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
					// LOG.info(xmlString);
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			exemptMobileResponse = getExemptMobile(xmlString);
		}
		return exemptMobileResponse;
	}

	private ExemptMobileResponse getExemptMobile(String xmlString) {
		ExemptMobileResponse exemptMobileResponse = null;
		if (Validator.isNotNull(xmlString)) {
			exemptMobileResponse = getResponseAfterParserExemptMobile(xmlString);
		}
		return exemptMobileResponse;
	}

	private ExemptMobileResponse getResponseAfterParserExemptMobile(String xmlString) {
		ExemptMobileResponse exemptMobileResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("FlagTable");

		xmlString = removeAttribute(xmlString, elementNameLst);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"FlagTable1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		xmlString = xmlString.replace("<BAPI_RESULT>", "").replace("</BAPI_RESULT>", "");
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);

		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			JAXBContext jc = createInstance(ExemptMobileResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			exemptMobileResponse = (ExemptMobileResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getResponseAfterParser");
				}
			}
		}
		return exemptMobileResponse;
	}

	@Override
	public ZBapiCSMobileAppcntResponse getZBAPI_CS_MOBILE_APPCNT(String mobileNo, String pmActivity, String priod, String VAPLZ) {

		ZBapiCSMobileAppcntResponse appcntResponse = null;
		ZBAPI_CS_MOBILE_APPCNTResponseZBAPI_CS_MOBILE_APPCNTResult response = null;
		try {
			response = webServiceSoapWS.ZBAPI_CS_MOBILE_APPCNT(mobileNo, pmActivity, priod, VAPLZ);
		} catch (RemoteException e1) {
			LOG.error("Error occured ZBAPI_CS_MOBILE_APPCNT while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			// LOG.info(msgElementArr);
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
					// LOG.info(xmlString);
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			appcntResponse = getCS_MOBILE_APPCNT(xmlString);
		}
		return appcntResponse;
	}

	private ZBapiCSMobileAppcntResponse getCS_MOBILE_APPCNT(String xmlString) {
		ZBapiCSMobileAppcntResponse appcntResponse = null;
		if (Validator.isNotNull(xmlString)) {
			appcntResponse = getResponseAfterParserAppcnt(xmlString);
		}
		return appcntResponse;
	}

	private ZBapiCSMobileAppcntResponse getResponseAfterParserAppcnt(String xmlString) {
		ZBapiCSMobileAppcntResponse appcntResponse = null;
		// LOG.info(xmlString);
		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("COUNT");

		xmlString = removeAttribute(xmlString, elementNameLst);

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"COUNT1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");

		xmlString = xmlString.replace("<BAPI_RESULT>", "").replace("</BAPI_RESULT>", "");

		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);

		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			JAXBContext jc = createInstance(ZBapiCSMobileAppcntResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			appcntResponse = (ZBapiCSMobileAppcntResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getResponseAfterParser");
				}
			}
		}
		return appcntResponse;
	}

	@Override
	public List<ItDataTableResponse> getZBAPI_CNT_APP_DETAIL_MOB(String orderType, String divCode, String appointStartDate, String appointTime, String recCount) {
		List<ItDataTableResponse> itDataTableResponseList = null;
		ZBAPI_CNT_APP_DETAIL_MOBResponseZBAPI_CNT_APP_DETAIL_MOBResult response = null;
		String sa[] = appointTime.split(",");
		try {
			response = webServiceSoapWS.ZBAPI_CNT_APP_DETAIL_MOB(orderType, divCode, appointStartDate, appointTime, recCount);
			LOG.info("response---"+response);
		} catch (RemoteException e1) {
			LOG.error("Error occured ZBAPI_CNT_APP_DETAIL_MOB while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
					LOG.info("xmlString---"+xmlString);
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			itDataTableResponseList = getCNT_APP_DETAIL_MOB(xmlString, sa.length);
			LOG.info("itDataTableResponseList---"+itDataTableResponseList);
		}
		return itDataTableResponseList;
	}

	private List<ItDataTableResponse> getCNT_APP_DETAIL_MOB(String xmlString, int l) {
		List<ItDataTableResponse> itDataTableResponseList = null;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		Document doc = null;
		InputStream is = null;
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();
		} catch (ParserConfigurationException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} catch (SAXException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} catch (IOException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getCntAppDetailMob");
				}
			}
		}
		if (Validator.isNotNull(xmlString)) {
			itDataTableResponseList = getItDataTableResponseAfterParser(xmlString, l);
		}
		return itDataTableResponseList;
	}

	private List<ItDataTableResponse> getItDataTableResponseAfterParser(String xmlString, int l) {
		List<ItDataTableResponse> itDataTableResponseList = null;
		CntAppDetailMobResponse appDetailMobResponse = null;
		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");

		xmlString = removeAttribute(xmlString, elementNameLst);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		// xmlString =
		// xmlString.replaceAll("diffgr:id=\"webBillHistoryTable([0-9]+)\"
		// msdata:rowOrder=\"([0-9]+)\"
		// diffgr:hasChanges=\"inserted\"",StringPool.BLANK);

		xmlString = xmlString.replaceAll("diffgr:id=\"IT_DATA_TABLE([0-" + l + "]+)\" msdata:rowOrder=\"([0-" + l + "]+)\" diffgr:hasChanges=\"inserted\"",
				StringPool.BLANK);
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			JAXBContext jc = createInstance(CntAppDetailMobResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			appDetailMobResponse = (CntAppDetailMobResponse) unmarshaller.unmarshal(wsResponse);
			itDataTableResponseList = appDetailMobResponse.getItDataTableResponse();
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponseAfterParser");
				}
			}
		}
		return itDataTableResponseList;
	}

	@Override
	public MDIResOrderResponse getZBAPI_MDI_RES_ORDER(String ca) {
		MDIResOrderResponse mdiResOrderResponse = null;
		ZBAPI_MDI_RES_ORDERResponseZBAPI_MDI_RES_ORDERResult response = null;
		try {
			response = webServiceSoapWS.ZBAPI_MDI_RES_ORDER(ca);
		} catch (RemoteException e1) {
			LOG.error("Error occured ZBAPI_MDI_RES_ORDER while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			mdiResOrderResponse = getMDI_RES_ORDER_Res(xmlString);
		}
		return mdiResOrderResponse;
	}

	private MDIResOrderResponse getMDI_RES_ORDER_Res(String xmlString) {
		MDIResOrderResponse mdiResOrderResponse = null;
		if (Validator.isNotNull(xmlString)) {
			mdiResOrderResponse = getResponseAfterParserMdiResOrder(xmlString);
		}
		return mdiResOrderResponse;
	}

	private MDIResOrderResponse getResponseAfterParserMdiResOrder(String xmlString) {
		MDIResOrderResponse mdiResOrderResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("FLAG");
		elementNameLst.add("Return");

		xmlString = removeAttribute(xmlString, elementNameLst);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"FLAG1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"Return1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");

		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			JAXBContext jc = createInstance(MDIResOrderResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			mdiResOrderResponse = (MDIResOrderResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponseAfterParser");
				}
			}
		}
		return mdiResOrderResponse;
	}

	@Override
	public CSOrderStatusResponse getZBAPI_CS_ORD_STAT(String applicationNo) {
		CSOrderStatusResponse orderStatusResponse = null;
		ZBAPI_CS_ORD_STATResponseZBAPI_CS_ORD_STATResult response = null;
		try {
			response = webServiceSoapWS.ZBAPI_CS_ORD_STAT(applicationNo);
		} catch (RemoteException e1) {
			LOG.error("Error occured ZBAPI_CS_ORD_STAT while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			orderStatusResponse = getOrderStatus(xmlString);
		}
		return orderStatusResponse;
	}

	private CSOrderStatusResponse getOrderStatus(String xmlString) {
		CSOrderStatusResponse csOrderStatusResponse = null;
		if (Validator.isNotNull(xmlString)) {
			csOrderStatusResponse = getOrderStatusAfterParser(xmlString);
		}
		return csOrderStatusResponse;
	}

	private CSOrderStatusResponse getOrderStatusAfterParser(String xmlString) {
		CSOrderStatusResponse csOrderStatusResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("Result");

		xmlString = removeAttribute(xmlString, elementNameLst);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"Result1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		xmlString = xmlString.replace("<BAPI_RESULT>", "").replace("</BAPI_RESULT>", "");
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);

		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			JAXBContext jc = createInstance(CSOrderStatusResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			csOrderStatusResponse = (CSOrderStatusResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getResponseAfterParser");
				}
			}
		}
		return csOrderStatusResponse;
	}

	@Override
	public ZCalHighAvgMDIResponse getZBAPI_ZCAL_HIGH_AVG_MDI(String ca, String date, String load) {
		ZCalHighAvgMDIResponse zCalHighAvgMDIResponse = null;
		ZBAPI_ZCAL_HIGH_AVG_MDIResponseZBAPI_ZCAL_HIGH_AVG_MDIResult response = null;
		try {
			response = webServiceSoapWS.ZBAPI_ZCAL_HIGH_AVG_MDI(ca, date, load);
		} catch (RemoteException e1) {
			LOG.error("Error occured ZBAPI_ZCAL_HIGH_AVG_MDI while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			zCalHighAvgMDIResponse = getZcalHighAvgMDIResponse(xmlString);
		}
		return zCalHighAvgMDIResponse;
	}

	private ZCalHighAvgMDIResponse getZcalHighAvgMDIResponse(String xmlString) {
		ZCalHighAvgMDIResponse zCalHighAvgMDIResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("Table1");
		elementNameLst.add("OutputTable");

		xmlString = removeAttribute(xmlString, elementNameLst);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"Table11\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"OutputTable1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");

		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			JAXBContext jc = createInstance(ZCalHighAvgMDIResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			zCalHighAvgMDIResponse = (ZCalHighAvgMDIResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponseAfterParser");
				}
			}
		}
		return zCalHighAvgMDIResponse;
	}
	
	@Override
	public ZBapiCaDisplayWhatsApp getZ_BAPI_CA_DISPLAY_WHATSAPP(String caNo) {
		ZBapiCaDisplayWhatsApp caDisplayWhatsApp = null;
		Z_BAPI_CA_DISPLAY_WHATSAPPResponseZ_BAPI_CA_DISPLAY_WHATSAPPResult response = null;
		try {
			response = webServiceSoapWS.z_BAPI_CA_DISPLAY_WHATSAPP(caNo, "", "", "", "", "");
		} catch (RemoteException e1) {
			LOG.error("Error occured z_BAPI_CA_DISPLAY_WHATSAPP while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			caDisplayWhatsApp = getZ_BAPI_CA_DISPLAY_WHATSAPPResponse(xmlString);
		}
		return caDisplayWhatsApp;
	}
	
	private ZBapiCaDisplayWhatsApp getZ_BAPI_CA_DISPLAY_WHATSAPPResponse(String xmlString) {
		ZBapiCaDisplayWhatsApp zBapiCaDisplayWhatsApp = null;
		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("EXPORT_CADETAILS");

		xmlString = removeAttribute(xmlString, elementNameLst);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"EXPORT_CADETAILS1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		xmlString = xmlString.replace("<BAPI_RESULT>", "").replace("</BAPI_RESULT>", "");
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			JAXBContext jc = createInstance(ZBapiCaDisplayWhatsApp.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			zBapiCaDisplayWhatsApp = (ZBapiCaDisplayWhatsApp) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getResponseAfterParser");
				}
			}
		}
		return zBapiCaDisplayWhatsApp;
	}

	@Override
	public ZcsUpdatePersonalDetailsResponse getZCSUPDAT_PERSONAL_DETAILS(String bpNo, String whatsappNo) {
		ZcsUpdatePersonalDetailsResponse zcsUpdatePersonalDetailsResponse = null;
		ZCSUPDAT_PERSONAL_DETAILSResponseZCSUPDAT_PERSONAL_DETAILSResult response = null;
		try {
			response = webServiceSoapWS.ZCSUPDAT_PERSONAL_DETAILS(bpNo, "", "", "", "", "", "", "", "", "", "", "", whatsappNo);
		} catch (RemoteException e1) {
			LOG.error("Error occured ZBAPI_CS_ORD_STAT while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			zcsUpdatePersonalDetailsResponse = getZcsUpdatePersonalDetailsResponse(xmlString);
		}
		return zcsUpdatePersonalDetailsResponse;
	}

	private ZcsUpdatePersonalDetailsResponse getZcsUpdatePersonalDetailsResponse(String xmlString) {
		ZcsUpdatePersonalDetailsResponse zcsUpdatePersonalDetailsResponse = null;
		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("FLAG");

		xmlString = removeAttribute(xmlString, elementNameLst);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"FLAG1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		xmlString = xmlString.replace("<BAPI_RESULT>", "").replace("</BAPI_RESULT>", "");
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);

		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			JAXBContext jc = createInstance(ZcsUpdatePersonalDetailsResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			zcsUpdatePersonalDetailsResponse = (ZcsUpdatePersonalDetailsResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getResponseAfterParser");
				}
			}
		}
		return zcsUpdatePersonalDetailsResponse;
	}

	@Override
	public PrepaidRtgsResponse getZBAPI_PREPAID_RTGS(String company, String caNo, String accountType, String amount, String flag) {
		PrepaidRtgsResponse rtgsResponse = null;
		ZBAPI_PREPAID_RTGSResponseZBAPI_PREPAID_RTGSResult response = null;
		try {
			response = webServiceSoapWS.ZBAPI_PREPAID_RTGS(company, caNo, accountType, amount, flag);
		} catch (RemoteException e1) {
			LOG.error("Error occured ZBAPI_PREPAID_RTGS while getting response :::" + e1);
		}
		if (Validator.isNotNull(response) && response != null) {
			MessageElement[] msgElementArr = response.get_any();
			String xmlString = StringPool.BLANK;
			if (Validator.isNotNull(msgElementArr) && msgElementArr.length > 1) {
				try {
					xmlString = msgElementArr[1].getAsString();
				} catch (Exception e) {
					LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
				}
			}
			// getting response while passing xmlString
			rtgsResponse = getPrepaidRTGSResponse(xmlString);
		}
		return rtgsResponse;
	}

	private PrepaidRtgsResponse getPrepaidRTGSResponse(String xmlString) {
		PrepaidRtgsResponse prepaidRtgsResponse = null;

		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");
		elementNameLst.add("STRUC_OUT");
		elementNameLst.add("RETURN");

		xmlString = removeAttribute(xmlString, elementNameLst);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"STRUC_OUT1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"RETURN1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"", "");

		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			JAXBContext jc = createInstance(PrepaidRtgsResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			prepaidRtgsResponse = (PrepaidRtgsResponse) unmarshaller.unmarshal(wsResponse);
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponseAfterParser");
				}
			}
		}
		return prepaidRtgsResponse;
	}

	@Override
	public GetAreaDetailsResponse getAreaJson(GetAreaDetailsRequest request) {
		GetAreaDetailsResponse getAreaDetailsResponse = new GetAreaDetailsResponse();
		StringBuilder reqXML = new StringBuilder();
		reqXML.append(
				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" 	xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
				.append("<soap:Body>").append("<Get_Area_list xmlns=\"http://tempuri.org/\">").append("<divcd>").append(request.getObjectID()).append("</divcd>")
				.append("</Get_Area_list>").append("</soap:Body>").append("</soap:Envelope>");
		String requestXML = reqXML.toString();
		String wsURL = getWebGISServiceApiUrl();
//		String wsURL = "http://10.125.64.219:9880/GISServices/WebGISService.asmx";
		String responseString = StringPool.BLANK;
		StringBuffer outputSb = new StringBuffer();

		if (Validator.isNotNull(wsURL)) {
			InputStreamReader isr = null;
			try {
				URL url = new URL(wsURL);
				URLConnection connection = url.openConnection();
				HttpURLConnection httpConn = (HttpURLConnection) connection;
				ByteArrayOutputStream bout = new ByteArrayOutputStream();
				byte[] buffer = new byte[requestXML.length()];
				buffer = requestXML.getBytes();
				bout.write(buffer);
				byte[] b = bout.toByteArray();
				String SOAPAction = "http://tempuri.org/Get_Area_list";
				httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
				httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
				httpConn.setRequestProperty("SOAPAction", SOAPAction);
				httpConn.setRequestMethod("POST");
				httpConn.setDoOutput(true);
				httpConn.setDoInput(true);
				OutputStream out = httpConn.getOutputStream();
				// Write the content of the request to the outputstream of
				// the HTTP Connection.
				out.write(b);
				out.close();
				// Ready with sending the request.
				isr = new InputStreamReader(httpConn.getInputStream());
				BufferedReader in = new BufferedReader(isr);
				while ((responseString = in.readLine()) != null) {
					outputSb.append(responseString);
				}
			} catch (Exception e) {
				LOG.error("Error occured while calling ComplaintRegistrationWeb_Area with JAVA API : " + e);
			} finally {
				if (Validator.isNotNull(isr)) {
					try {
						isr.close();
					} catch (IOException e) {
						LOG.error(e);
					}
				}
			}
		}
		String xmlString = substringBetween(outputSb.toString(), "</xs:schema>", "</Get_Area_listResult");

		if (Validator.isNotNull(xmlString) && xmlString.contains("Table1")) {

			xmlString = xmlString
					.replace("<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">", "");
			xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
			xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
			xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
			xmlString = xmlString.replace("</diffgr:diffgram>", "");
			xmlString = xmlString.replace(" xmlns=\"\"", "");
			xmlString = xmlString.replaceAll("<NewDataSet>", "<BAPI_RESULT><NewDataSet>");
			xmlString = xmlString.replaceAll("</NewDataSet>", "</NewDataSet></BAPI_RESULT>");
			InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());

			try {
				JAXBContext jc = createInstance(GetAreaDetailsResponse.class);
				Unmarshaller unmarshaller = jc.createUnmarshaller();
				getAreaDetailsResponse = (GetAreaDetailsResponse) unmarshaller.unmarshal(wsResponse);
			} catch (JAXBException e) {
				LOG.error(BsesSapConnectorServiceConstant.XMLSTRING_ERROR_MSG + e);
			} finally {
				if (Validator.isNotNull(wsResponse)) {
					try {
						wsResponse.close();
					} catch (IOException e) {
						LOG.error("Error Closing InputStream in getAreaDetailsResponse");
					}
				}
			}
		}
		return getAreaDetailsResponse;
	}

	@Override
	public GetAreaDetailsCircleResponse getAreaData(GetAreaDetailsCircleRequest request) {

		GetAreaDetailsCircleResponse getAreaDetailsCircleResponse = null;
		StringBuilder reqXML = new StringBuilder();
		reqXML.append(
				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" 	xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
				.append("<soap:Body>").append("<get_area_details_Circle xmlns=\"http://tempuri.org/\">").append("<objectid>").append(request.getObjectID()).append("</objectid>")
				.append("</get_area_details_Circle>").append("</soap:Body>").append("</soap:Envelope>");
		String requestXML = reqXML.toString();

		String wsURL = getWebGISServiceApiUrl();
//		String wsURL = "http://10.125.64.219:9880/GISServices/WebGISService.asmx";
		String responseString = StringPool.BLANK;
		StringBuffer outputSb = new StringBuffer();

		if (Validator.isNotNull(wsURL)) {
			InputStreamReader isr = null;
			try {
				URL url = new URL(wsURL);
				URLConnection connection = url.openConnection();
				HttpURLConnection httpConn = (HttpURLConnection) connection;
				ByteArrayOutputStream bout = new ByteArrayOutputStream();
				byte[] buffer = new byte[requestXML.length()];
				buffer = requestXML.getBytes();
				bout.write(buffer);
				byte[] b = bout.toByteArray();
				String SOAPAction = "http://tempuri.org/get_area_details_Circle";
				httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
				httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
				httpConn.setRequestProperty("SOAPAction", SOAPAction);
				httpConn.setRequestMethod("POST");
				httpConn.setDoOutput(true);
				httpConn.setDoInput(true);
				OutputStream out = httpConn.getOutputStream();
				// Write the content of the request to the outputstream of
				// the HTTP Connection.
				out.write(b);
				out.close();
				// Ready with sending the request.
				isr = new InputStreamReader(httpConn.getInputStream());
				BufferedReader in = new BufferedReader(isr);
				while ((responseString = in.readLine()) != null) {
					outputSb.append(responseString);
				}
			} catch (Exception e) {
				LOG.error("Error occured while calling ComplaintRegistrationWeb_Area with JAVA API : " + e);
			} finally {
				if (Validator.isNotNull(isr)) {
					try {
						isr.close();
					} catch (IOException e) {
						LOG.error(e);
					}
				}
			}
		}
		String xmlString = substringBetween(outputSb.toString(), "</xs:schema>", "</get_area_details_CircleResult");

		if (Validator.isNotNull(xmlString) && xmlString.contains("Table1")) {

			xmlString = xmlString
					.replace("<diffgr:diffgram xmlns:msdata=\"urn:schemas-microsoft-com:xml-msdata\" xmlns:diffgr=\"urn:schemas-microsoft-com:xml-diffgram-v1\">", "");
			xmlString = xmlString.replaceAll(" diffgr:id=\"Table1([0-9]+)\"", "");
			xmlString = xmlString.replaceAll(" msdata:rowOrder=\"([0-9]+)\"", "");
			xmlString = xmlString.replaceAll(" diffgr:hasChanges=\"inserted\"", "");
			xmlString = xmlString.replace(" xmlns=\"\"", "");
			xmlString = xmlString.replace("</diffgr:diffgram>", "");
			InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());

			try {
				JAXBContext jc = createInstance(GetAreaDetailsCircleResponse.class);
				Unmarshaller unmarshaller = jc.createUnmarshaller();
				getAreaDetailsCircleResponse = (GetAreaDetailsCircleResponse) unmarshaller.unmarshal(wsResponse);
			} catch (JAXBException e) {
				LOG.error(BsesSapConnectorServiceConstant.XMLSTRING_ERROR_MSG + e);
			} finally {
				if (Validator.isNotNull(wsResponse)) {
					try {
						wsResponse.close();
					} catch (IOException e) {
						LOG.error("Error Closing InputStream in getErrorResponseAfterParser");
					}
				}
			}

		}
		return getAreaDetailsCircleResponse;
	}
	
	@Override
	public ComplaintRegistrationWebAreaDetailResponse getComplaintRegistrationWebArea(ComplaintRegistrationWebAreaRequest request) {


		ComplaintRegistrationWebAreaDetailResponse areaResponse = new ComplaintRegistrationWebAreaDetailResponse();

		StringBuilder reqXML = new StringBuilder();
		reqXML.append(
				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" 	xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
				.append("<soap:Body>").append("<ComplaintRegistrationWeb_Area xmlns=\"http://tempuri.org/\">").append("<AreaName>").append(request.getAreaName())
				.append("</AreaName>").append("<CallerName>").append(request.getCallerName()).append("</CallerName>").append("<CallerPhone>")
				.append(request.getCallerphone()).append("</CallerPhone>").append("<address>").append(request.getAddress()).append("</address>").append("<FAULT_CAT>")
				.append(request.getFaultCat()).append("</FAULT_CAT>").append("<FAULT_TYPE>").append(request.getFaultType()).append("</FAULT_TYPE>")
				.append("<Comp_Center_Code>").append(request.getComplaintCentreCode()).append("</Comp_Center_Code>").append("<Circle>").append(request.getCircle())
				.append("</Circle>").append("<Division>").append(request.getDivision()).append("</Division>").append("<AREA_OBJECTID>").append(request.getAreaObjectID())
				.append("</AREA_OBJECTID>").append("<St_Light_Location>").append(request.getStreetLightLocation()).append("</St_Light_Location>").append("<Remarks>")
				.append(request.getRemarks()).append("</Remarks>").append("<Source>").append(request.getSource()).append("</Source>")
				.append("</ComplaintRegistrationWeb_Area>").append("</soap:Body>").append("</soap:Envelope>");
		String requestXML = reqXML.toString();
		// System.out.println(requestXML);

		String wsURL = getWebGISServiceApiUrl();
//		String wsURL = "http://10.125.64.219:9880/GISServices/WebGISService.asmx";
		String responseString = StringPool.BLANK;
		StringBuffer outputSb = new StringBuffer();

		if (Validator.isNotNull(wsURL)) {
			InputStreamReader isr = null;
			try {
				URL url = new URL(wsURL);
				URLConnection connection = url.openConnection();
				HttpURLConnection httpConn = (HttpURLConnection) connection;
				ByteArrayOutputStream bout = new ByteArrayOutputStream();
				byte[] buffer = new byte[requestXML.length()];
				buffer = requestXML.getBytes();
				bout.write(buffer);
				byte[] b = bout.toByteArray();
				String SOAPAction = "http://tempuri.org/ComplaintRegistrationWeb_Area";
				httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
				httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
				httpConn.setRequestProperty("SOAPAction", SOAPAction);
				httpConn.setRequestMethod("POST");
				httpConn.setDoOutput(true);
				httpConn.setDoInput(true);
				OutputStream out = httpConn.getOutputStream();
				// Write the content of the request to the outputstream of
				// the HTTP Connection.
				out.write(b);
				out.close();
				// Ready with sending the request.
				isr = new InputStreamReader(httpConn.getInputStream());
				BufferedReader in = new BufferedReader(isr);
				while ((responseString = in.readLine()) != null) {
					outputSb.append(responseString);
				}
			} catch (Exception e) {
				LOG.error("Error occured while calling ComplaintRegistrationWeb_Area with JAVA API : " + e);
			} finally {
				if (Validator.isNotNull(isr)) {
					try {
						isr.close();
					} catch (IOException e) {
						LOG.error(e);
					}
				}
			}
		}
		// log.info(outputSb.toString());
		String status = substringBetween(outputSb.toString(), "<Status>", "</Status>");
		String comment = substringBetween(outputSb.toString(), "<Comment>", "</Comment>");
		areaResponse.setComplaintStatus(status);
		areaResponse.setComplaintComment(comment);

		return areaResponse;
	}
	
	@Override
	public ComplaintRegistrationWebDetailResponse getComplaintRegistrationWeb(ComplaintRegistrationWebRequest request) {


		ComplaintRegistrationWebDetailResponse complaintWebResponse = new ComplaintRegistrationWebDetailResponse();
		StringBuilder reqXML = new StringBuilder();
		reqXML.append(
				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
				.append("<soap:Body>").append("<ComplaintRegistrationWeb xmlns=\"http://tempuri.org/\">").append("<Key>").append(checkNull(request.getKey()))
				.append("</Key>").append("<CallerName>").append(checkNull(request.getCallerName())).append("</CallerName>").append("<Phone>")
				.append(checkNull(request.getCallerphone())).append("</Phone>").append("<Add>").append(checkNull(request.getAddress())).append("</Add>").append("<Email>")
				.append(checkNull(request.getCallerEmail())).append("</Email>").append("<CA>").append(checkNull(request.getCaNo())).append("</CA>").append("<Area>")
				.append(checkNull(request.getArea())).append("</Area>").append("<FaultCategoryCode>").append(checkNull(request.getFaultCat()))
				.append("</FaultCategoryCode>").append("<SubFaultCategoryName>").append(checkNull(request.getFaultType())).append("</SubFaultCategoryName>")
				.append("<Remarks>").append(checkNull(request.getRemarks())).append("</Remarks>").append("<CODE>").append(checkNull(request.getSource()))
				.append("</CODE>").append("<poleNum>").append(checkNull(request.getPoleNum())).append("</poleNum>").append("</ComplaintRegistrationWeb>")
				.append("</soap:Body>").append("</soap:Envelope>");
		String requestXML = reqXML.toString();
//		log.info(requestXML);
		
		String wsURL = getWebGISServiceApiUrl();
//		String wsURL = "http://10.125.64.219:9880/GISServices/WebGISService.asmx";
		String responseString = StringPool.BLANK;
		StringBuffer outputSb = new StringBuffer();

		if (Validator.isNotNull(wsURL)) {
			InputStreamReader isr = null;
			try {
				URL url = new URL(wsURL);
				URLConnection connection = url.openConnection();
				HttpURLConnection httpConn = (HttpURLConnection) connection;
				ByteArrayOutputStream bout = new ByteArrayOutputStream();
				byte[] buffer = new byte[requestXML.length()];
				buffer = requestXML.getBytes();
				bout.write(buffer);
				byte[] b = bout.toByteArray();
				String SOAPAction = "http://tempuri.org/ComplaintRegistrationWeb";
				httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
				httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
				httpConn.setRequestProperty("SOAPAction", SOAPAction);
				httpConn.setRequestMethod("POST");
				httpConn.setDoOutput(true);
				httpConn.setDoInput(true);
				OutputStream out = httpConn.getOutputStream();
				// Write the content of the request to the outputstream of
				// the HTTP Connection.
				out.write(b);
				out.close();
				// Ready with sending the request.
				isr = new InputStreamReader(httpConn.getInputStream());
				BufferedReader in = new BufferedReader(isr);
				while ((responseString = in.readLine()) != null) {
					outputSb.append(responseString);
				}
			} catch (Exception e) {
				LOG.error("Error occured while calling ComplaintRegistrationWeb web service with JAVA API : " + e);
			} finally {
				if (Validator.isNotNull(isr)) {
					try {
						isr.close();
					} catch (IOException e) {
						LOG.error(e);
					}
				}
			}
		}

		String status = substringBetween(outputSb.toString(), "<Status>", "</Status>");
		String comment = substringBetween(outputSb.toString(), "<Comment>", "</Comment>");
		complaintWebResponse.setComplaintStatus(status);
		complaintWebResponse.setComplaintComment(comment);
		// System.out.println(comment);
		return complaintWebResponse;
	
	}
	
	public String checkNull(String value) {
		if (value == null) {
			return "";
		} else {
			return value;
		}
	}
	
	public String getWebGISServiceApiUrl(){
	return "" ;
	//bsesCommonUtilApi.getSetupValueByCompanyGroupNameAndKey(CommonUtilConstant.WEB_SERVICE_COMPANY_NAME, CommonUtilConstant.WEB_SERVICE_GROUP_NAME,CommonUtilConstant.GIS_SERVICE_HOST);
	}
	/*
	 * private static String removeAttribute(String xmlString,String
	 * isuTableName){ //String updatedXMLStr = xmlString;ISUSTDTable String
	 * finalString = ""; if(Validator.isNotNull(xmlString) &&
	 * xmlString.contains("BAPI_RESULT")){ Matcher m =
	 * Pattern.compile("<(.*?)BAPI_RESULT(.*?)>(.*?)</BAPI_RESULT>").matcher(
	 * xmlString); if(m.find()){ String bapiResultContent = m.group(3); Matcher
	 * isusTableMatcher =
	 * Pattern.compile("<(.*?)"+isuTableName+"(.*?)>(.*?)</"+isuTableName+">").
	 * matcher(bapiResultContent); if(isusTableMatcher.find()){
	 * finalString="<"+isuTableName+">" + isusTableMatcher.group(3) +
	 * "</"+isuTableName+">"; }
	 * 
	 * } }else{ finalString = xmlString; } return finalString; }
	 */
	
	
	public DssISUCADisplayResponse getDssISUCADisplay2(DssISUCADisplayRequest request) {
		String xmlString = "";
		StringBuilder reqXML = new StringBuilder();
		reqXML.append(
		"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" 	xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
		.append("<soap:Body>")
		
		.append("<Z_BAPI_DSS_ISU_CA_DISPLAY_WEBSITE xmlns=\"http://tempuri.org/\">")
		.append("<CA_NUMBER>").append(request.getCaNumber()).append("</CA_NUMBER>")
		.append("</Z_BAPI_DSS_ISU_CA_DISPLAY_WEBSITE>")
		
		.append("</soap:Body>")
		.append("</soap:Envelope>");
		String wsURL=PropsUtil.get("CA_DISPLAY_SERVICE_URL");
		if(StringUtils.isBlank(wsURL)) {
			wsURL ="http://125.22.84.50:7850/delhiv2/ISUService.asmx";
		}
		String requestXML = reqXML.toString();
		String resXML = callService(requestXML,wsURL,"http://tempuri.org/Z_BAPI_DSS_ISU_CA_DISPLAY_WEBSITE","GET");
	
		//System.out.println("*****************************Get***********************************");
		//System.out.println(resXML);
		//System.out.println("*************************************************************");
			// getting response while passing xmlString
			//dssISUCADisplayResponse = getDssISUCADisplay(xmlString);
		LOG.info("--------------Service Responce----------------");
		LOG.info(resXML);
		
		try {
			xmlString = substringBetween(resXML, "</xs:schema>", "</Z_BAPI_DSS_ISU_CA_DISPLAY_WEBSITEResult>");
		} catch (Exception e) {
			System.out.println("Exception occured while fetching data from 1 st time");
		}
		
		DssISUCADisplayResponse resObj = getDssISUCADisplay(xmlString); //getDssResponseAfterParser(xmlString);
		
		//System.out.println("resObj.getCaNumber() - "+resObj.getCaNumber() +" name -"+resObj.getMobileNo());
		
		return resObj;
	}
	
	private String callService(String requestXML,String serviceURL, String actionURL,String method) {
		String xmlString = null;
		String responseString = StringPool.BLANK;
		StringBuffer outputSb = new StringBuffer();
		
		String wsURL=serviceURL;
		String SOAPAction=actionURL;
		
		if (Validator.isNotNull(wsURL)) {
			Date startDate = new Date();
			InputStreamReader isr = null;
			try {
				URL url = new URL(wsURL);
				URLConnection connection = url.openConnection();
				HttpURLConnection httpConn = (HttpURLConnection) connection;
				ByteArrayOutputStream bout = new ByteArrayOutputStream();
				byte[] buffer = new byte[requestXML.length()];
				buffer = requestXML.getBytes();
				bout.write(buffer);
				byte[] b = bout.toByteArray();

				httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
				httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
				httpConn.setRequestProperty("SOAPAction", SOAPAction);
				httpConn.setRequestMethod(method);
				httpConn.setDoOutput(true);
				httpConn.setDoInput(true);
				
				OutputStream out = httpConn.getOutputStream();

				// Write the content of the request to the outputstream of the HTTP Connection.
				out.write(b);
				out.close();
				// Ready with sending the request.
				isr = new InputStreamReader(httpConn.getInputStream());
				BufferedReader in = new BufferedReader(isr);
				while ((responseString = in.readLine()) != null) {
					outputSb.append(responseString);
				}
			
			} catch (Exception e) {
				System.out.println("Error occured while calling ZBAPI_CS_ORD_STAT with JAVA API : " + e);
				e.printStackTrace();
			} finally {
				if (Validator.isNotNull(isr)) {
					try {
						isr.close();
					} catch (IOException e) {
						e.printStackTrace();;
					}
				}
			}
		}
/*
		try {
			xmlString = substringBetween(outputSb.toString(), "<E_Service_Order>", "</E_Service_Order>");
		} catch (Exception e) {
			System.out.println("Exception occured while fetching data from 1 st time");
		}
		*/
		xmlString = outputSb.toString();
		return xmlString;
	}
	
	
	public CmsISUCADisplayResponse getCmsISUCADisplay(String ca) {
		CmsISUCADisplayResponse cmsISUCADisplayResponse = null;
		StringBuilder reqXML = new StringBuilder();
		reqXML.append(
				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" 	xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
				.append("<soap:Body>").append("<Z_BAPI_CMS_ISU_CA_DISPLAY xmlns=\"http://tempuri.org/\">").append("<strCANumber>").append(ca).append("</strCANumber>")
				.append("<strSerialNumber>").append("").append("</strSerialNumber>").append("<strConsumerNumber>").append("").append("</strConsumerNumber>")
				.append("<strTelephoneNumber>").append("").append("</strTelephoneNumber>").append("<strKNumber>").append("").append("</strKNumber>")
				.append("<strContractNumber>").append("").append("</strContractNumber>").append("</Z_BAPI_CMS_ISU_CA_DISPLAY>").append("</soap:Body>")
				.append("</soap:Envelope>");
		String requestXML = reqXML.toString();

		//String wsURL = "http://125.22.84.50:7850/delhiv2/ISUService.asmx";//"http://10.125.64.215:7850/delhiv2/ISUService.asmx";
		String wsURL=PropsUtil.get("CA_DISPLAY_SERVICE_URL");
		if(StringUtils.isBlank(wsURL)) {
			wsURL ="http://125.22.84.50:7850/delhiv2/ISUService.asmx";
		}
		String responseString = StringPool.BLANK;
		StringBuffer outputSb = new StringBuffer();

			InputStreamReader isr = null;
			try {
				URL url = new URL(wsURL);
				URLConnection connection = url.openConnection();
				HttpURLConnection httpConn = (HttpURLConnection) connection;
				ByteArrayOutputStream bout = new ByteArrayOutputStream();
				byte[] buffer = new byte[requestXML.length()];
				buffer = requestXML.getBytes();
				bout.write(buffer);
				byte[] b = bout.toByteArray();
				String SOAPAction = "http://tempuri.org/Z_BAPI_CMS_ISU_CA_DISPLAY";
				httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
				httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
				httpConn.setRequestProperty("SOAPAction", SOAPAction);
				httpConn.setRequestMethod("GET");
				httpConn.setDoOutput(true);
				httpConn.setDoInput(true);
				OutputStream out = httpConn.getOutputStream();
				// Write the content of the request to the outputstream of
				// the HTTP Connection.
				out.write(b);
				out.close();
				// Ready with sending the request.
				isr = new InputStreamReader(httpConn.getInputStream());
				BufferedReader in = new BufferedReader(isr);
				while ((responseString = in.readLine()) != null) {
					outputSb.append(responseString);
				}
			} catch (Exception e) {
				//logger.error("Error occured while calling ZBAPI_DISPLAY_BILL_WEB with JAVA API : " + e);
				e.printStackTrace();
			} finally {
				if (Validator.isNotNull(isr)) {
					try {
						isr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			System.out.println("************ Z_BAPI_CMS_ISU_CA_DISPLAYResult- Service Response ***********");
			System.out.println(outputSb.toString());
			String xmlString = substringBetween(outputSb.toString(), "</xs:schema>", "</Z_BAPI_CMS_ISU_CA_DISPLAYResult>");

			if (Validator.isNotNull(xmlString)) {
				cmsISUCADisplayResponse = getResponseAfterParser(xmlString);

			}

		return cmsISUCADisplayResponse;

	}
	
	
	public List<ItDataTableResponse> getCNT_APP_DETAIL_MOB2(String xmlString, int l) {
		List<ItDataTableResponse> itDataTableResponseList = null;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		Document doc = null;
		InputStream is = null;
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();
		} catch (ParserConfigurationException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} catch (SAXException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} catch (IOException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getCntAppDetailMob");
				}
			}
		}
		if (Validator.isNotNull(xmlString)) {
			itDataTableResponseList = getItDataTableResponseAfterParser2(xmlString, l);
		}
		return itDataTableResponseList;
	}

	public List<ItDataTableResponse> getZBAPI_CNTAPP_INTRADSK(String xmlString) {
		List<ItDataTableResponse> itDataTableResponseList = null;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		Document doc = null;
		InputStream is = null;
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();
		} catch (ParserConfigurationException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} catch (SAXException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} catch (IOException e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getCntAppDetailMob");
				}
			}
		}
		if (Validator.isNotNull(xmlString)) {
			itDataTableResponseList = getItDataTableResponseZBAPI_CNTAPP_INTRADSK(xmlString);
		}
		return itDataTableResponseList;
	}
	
	private List<ItDataTableResponse> getItDataTableResponseZBAPI_CNTAPP_INTRADSK(String xmlString) {
		List<ItDataTableResponse> itDataTableResponseList = null;
		CntAppDetailMobResponse appDetailMobResponse = null;
		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");

		xmlString = removeAttribute(xmlString, elementNameLst);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		// xmlString =
		// xmlString.replaceAll("diffgr:id=\"webBillHistoryTable([0-9]+)\"
		// msdata:rowOrder=\"([0-9]+)\"
		// diffgr:hasChanges=\"inserted\"",StringPool.BLANK);

		//xmlString = xmlString.replaceAll("diffgr:id=\"IT_DATA_TABLE([0-" + l + "]+)\" msdata:rowOrder=\"([0-" + l + "]+)\" diffgr:hasChanges=\"inserted\"",
		//		StringPool.BLANK);
		int length="<IT_DATA_TABLE1".length();
		while(true) {
			
			int start=xmlString.indexOf("<IT_DATA_TABLE1");
			if(start<0) {
				break;
			}
			start=start+length;
			int end=xmlString.indexOf(">", start);
			
			
			String replaceable=xmlString.substring(start, end);
			LOG.info("getItDataTableResponseZBAPI_CNTAPP_INTRADSK : start = "+start+", end = "+end+", replaceable = "+replaceable);
			
			xmlString = xmlString.replaceAll(replaceable, StringPool.BLANK);
			
			//xmlString = xmlString.replaceAll("msdata:rowOrder=\""+ i + "\"",StringPool.BLANK);
		}
		xmlString = xmlString.replaceAll("<IT_DATA_TABLE1", "<IT_DATA_TABLE");
		xmlString = xmlString.replaceAll("</IT_DATA_TABLE1>", "</IT_DATA_TABLE>");
		
		LOG.info("getItDataTableResponseZBAPI_CNTAPP_INTRADSK xmlString ============");
		LOG.info(xmlString);
		
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			JAXBContext jc = createInstance(CntAppDetailMobResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			appDetailMobResponse = (CntAppDetailMobResponse) unmarshaller.unmarshal(wsResponse);
			itDataTableResponseList = appDetailMobResponse.getItDataTableResponse();
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponseAfterParser");
				}
			}
		}
		return itDataTableResponseList;
	}

	private List<ItDataTableResponse> getItDataTableResponseAfterParser2(String xmlString, int l) {
		List<ItDataTableResponse> itDataTableResponseList = null;
		CntAppDetailMobResponse appDetailMobResponse = null;
		List<String> elementNameLst = new ArrayList<String>();
		elementNameLst.add("diffgr:diffgram");
		elementNameLst.add("BAPI_RESULT");

		xmlString = removeAttribute(xmlString, elementNameLst);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);
		// xmlString =
		// xmlString.replaceAll("diffgr:id=\"webBillHistoryTable([0-9]+)\"
		// msdata:rowOrder=\"([0-9]+)\"
		// diffgr:hasChanges=\"inserted\"",StringPool.BLANK);

		xmlString = xmlString.replaceAll("diffgr:id=\"IT_DATA_TABLE([0-" + l + "]+)\" msdata:rowOrder=\"([0-" + l + "]+)\" diffgr:hasChanges=\"inserted\"",
				StringPool.BLANK);
		for(int i=0 ;i<10;i++) {
			xmlString = xmlString.replaceAll("diffgr:id=\"IT_DATA_TABLE1" + i +"\"", StringPool.BLANK);
			
			xmlString = xmlString.replaceAll("msdata:rowOrder=\""+ i + "\"",StringPool.BLANK);
		}
		xmlString = xmlString.replaceAll("<IT_DATA_TABLE1", "<IT_DATA_TABLE");
		xmlString = xmlString.replaceAll("</IT_DATA_TABLE1>", "</IT_DATA_TABLE>");
		
		
		
		InputStream wsResponse = new ByteArrayInputStream(xmlString.getBytes());
		try {
			JAXBContext jc = createInstance(CntAppDetailMobResponse.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			appDetailMobResponse = (CntAppDetailMobResponse) unmarshaller.unmarshal(wsResponse);
			itDataTableResponseList = appDetailMobResponse.getItDataTableResponse();
		} catch (JAXBException e) {
			LOG.error("Error occured  while getting xmlStrings :::" + e);
		} finally {
			if (Validator.isNotNull(wsResponse)) {
				try {
					wsResponse.close();
				} catch (IOException e) {
					LOG.error("Error Closing InputStream in getErrorResponseAfterParser");
				}
			}
		}
		return itDataTableResponseList;
	}


}
