package com.bses.connection2.helper;

import com.bses.connection2.model.ConnectionRequest;
import com.bses.connection2.service.ConnectionRequestLocalServiceUtil;
import com.bses2.sap.constant.BsesSapConnectorServiceConstant;
import com.bses2.sap.model.CmsISUCADisplayResponse;
import com.bses2.sap.model.ItDataTableResponse;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

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
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DigitalSevaKendraServiceHelper {
	private static final Log LOGGER=LogFactoryUtil.getLog(DigitalSevaKendraServiceHelper.class);
	private static final String STR_DOT=".";
	private static final String STR_OTHER="OTHR";
	
	public static String submitNewRequest(long connectionRequestId) {
		try {
			ConnectionRequest connectionRequest=ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
			LOGGER.info("connectionRequest - " + connectionRequest);
			return submitNewRequest(connectionRequest);
		}catch(Exception e) {}
		return null;
	}
	public static String submitNewRequest(ConnectionRequest connectionRequest) {

		if(StringUtils.equalsIgnoreCase(connectionRequest.getRequestMode(), "Online") && !isRequestAllowedNow()) {
			return "Error: This service is available Monday to Friday between 9:00 AM-5:30 PM (except Public Holidays)";
		}
		
		String serviceOrder = null;
		//check connection.request.submit is disabled
		if(StringUtils.equalsIgnoreCase(PropsUtil.get("connection.request.submit.soap"), "false")) {
			serviceOrder = "S-"+connectionRequest.getRequestNo();
			LOGGER.info("submitNewRequest: local order number generated - "+serviceOrder);
			
			return serviceOrder;
		}
		
		LOGGER.info("submitNewRequest send request to soap");

		try {
			LOGGER.info("connectionRequest - " + connectionRequest);
			
			String titleKey = StringPool.BLANK;
			String parentCategory = DigitalSevaKendraConstants.PARENT_CAT_1;
			String male = DigitalSevaKendraConstants.MALE;
			String female = StringPool.BLANK;
			String appliedLoadDkva = StringPool.BLANK;
			String appliedLoad = StringPool.BLANK;
			
			if (Validator.isNull(connectionRequest.getTitle()) || connectionRequest.getTitle().equals("")
					|| connectionRequest.getTitle().equals("-1")) {
				titleKey = "0001";
			} else {
				titleKey = connectionRequest.getTitle();
			}
			
			if (StringUtils.equalsIgnoreCase(connectionRequest.getConsumerType(),"Firm")) {
				parentCategory = DigitalSevaKendraConstants.PARENT_CAT_2;
			}
			
			appliedLoadDkva = String.valueOf(Math.round(connectionRequest.getLoadKva()));
			appliedLoad = String.valueOf(Math.round(connectionRequest.getLoadKw()));
			
			SimpleDateFormat wsDateFormat = new SimpleDateFormat("yyyyMMdd");
			
			String iIlart=connectionRequest.getRequestType();
			if(StringUtils.isBlank(iIlart)) {
				iIlart="U01"; 
			}
			
			String planningPlant="D021";
			
			String connectionType =getConnectionType(connectionRequest.getConnectionType());//STR_OTHER;
			
			
			String appointmentDistrict = connectionRequest.getAppointmentDistrict();
			if(StringUtils.isBlank(appointmentDistrict)) {
				appointmentDistrict = connectionRequest.getDistrict();
			}
			Date appointmentDate = connectionRequest.getAppointmentDate();
			if(appointmentDate == null) {
				appointmentDate = new Date();
			}
			
			
			String appDate = wsDateFormat.format(appointmentDate);
			String appStartTime = connectionRequest.getAppointmentTime();
			String appEndTime = connectionRequest.getAppointmentFinishTime();
			if(StringUtils.isBlank(appStartTime)) {
				appStartTime = "09:15:00";
			}
			if(StringUtils.isBlank(appEndTime)) {
				appEndTime = "10:30:00";
			}
			
			String SOAPAction=PropsUtil.get("Z_BAPI_ZDSS_WEB_LINK_SOAP_ACTION");
			if(StringUtils.isBlank(SOAPAction)) {
				SOAPAction = "Z_BAPI_ZDSS_WEB_LINK_CRM_WebSite";
			}
			
			int selectedHeight = getSelectedHeight(connectionRequest);
			
			StringBuilder reqXML = new StringBuilder();
			reqXML.append(
			"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" 	xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
			.append("<soap:Body>").append("<"+SOAPAction+" xmlns=\"http://tempuri.org/\">")
			.append("<I_ILART>").append(iIlart).append("</I_ILART>")
			.append("<I_VKONT>").append(StringPool.BLANK).append("</I_VKONT>")
			.append("<I_VKONA>").append(StringPool.BLANK).append("</I_VKONA>")
			.append("<PARTNERCATEGORY>").append(parentCategory).append("</PARTNERCATEGORY>")
			.append("<PARTNERTYPE>").append(DigitalSevaKendraConstants.PARTNER_TYPE).append("</PARTNERTYPE>")
			.append("<TITLE_KEY>").append(titleKey).append("</TITLE_KEY>")
			.append("<FIRSTNAME>").append(StringUtils.defaultString(connectionRequest.getFirstName())).append("</FIRSTNAME>")
			.append("<LASTNAME>").append(StringUtils.defaultString(connectionRequest.getLastName())).append("</LASTNAME>")
			.append("<MIDDLENAME>").append(StringUtils.defaultString(connectionRequest.getMiddleName())).append("</MIDDLENAME>")
			.append("<FATHERSNAME>").append(StringUtils.defaultString(connectionRequest.getFatherOrHusbandName())).append("</FATHERSNAME>")
			.append("<HOUSE_NO>").append((StringUtils.isNotBlank(connectionRequest.getHouseNo())?connectionRequest.getHouseNo():STR_DOT)).append("</HOUSE_NO>")
			.append("<BUILDING>").append((StringUtils.isNotBlank(connectionRequest.getBuildingName())?connectionRequest.getBuildingName():STR_DOT)).append("</BUILDING>")
			.append("<STR_SUPPL1>").append(StringUtils.defaultString(connectionRequest.getStreet())).append("</STR_SUPPL1>")
			.append("<STR_SUPPL2>").append(StringUtils.defaultString(connectionRequest.getColonyArea())).append("</STR_SUPPL2>")
			.append("<STR_SUPPL3>").append(StringUtils.defaultString(connectionRequest.getLandmarkDetails())).append("</STR_SUPPL3>")
			.append("<POSTL_COD1>").append(StringUtils.defaultString(connectionRequest.getPinCode())).append("</POSTL_COD1>")
			.append("<CITY>").append(DigitalSevaKendraConstants.CITY).append("</CITY>")
			.append("<E_MAIL>").append(StringUtils.defaultString(connectionRequest.getEServiceMailId())).append("</E_MAIL>")
			.append("<LANDLINE>").append(StringUtils.defaultString(connectionRequest.getMobileNo())).append("</LANDLINE>")
			.append("<MOBILE>").append(connectionRequest.getMobileNo()).append("</MOBILE>")
			.append("<FEMALE>").append(female).append("</FEMALE>")
			.append("<MALE>").append(male).append("</MALE>")
			.append("<JOBGR>").append(StringPool.BLANK).append("</JOBGR>")
			.append("<IDTYPE>").append(StringUtils.defaultString(connectionRequest.getIdProofType())).append("</IDTYPE>")
			.append("<IDNUMBER>").append(StringUtils.defaultString(connectionRequest.getIdProofNo())).append("</IDNUMBER>")
			.append("<PLANNINGPLANT>").append(planningPlant).append("</PLANNINGPLANT>")
			.append("<WORKCENTRE>").append(StringUtils.defaultString(connectionRequest.getDistrict())).append("</WORKCENTRE>")
			.append("<SYSTEMCOND>").append(DigitalSevaKendraConstants.SYSTEMCOND).append("</SYSTEMCOND>")
			.append("<APPLIEDCAT>").append(StringUtils.defaultString(connectionRequest.getTariffCategory())).append("</APPLIEDCAT>")
			.append("<APPLIEDLOAD>").append(appliedLoad).append("</APPLIEDLOAD>")
			.append("<APPLIEDLOADKVA>").append(appliedLoadDkva).append("</APPLIEDLOADKVA>")
			.append("<CONNECTIONTYPE>").append(connectionType).append("</CONNECTIONTYPE>")
			.append("<STATEMENT_CA>").append(StringPool.BLANK).append("</STATEMENT_CA>")
			.append("<START_DATE>").append(appDate).append("</START_DATE>")
			.append("<START_TIME>").append(StringUtils.defaultString(appStartTime)).append("</START_TIME>")
			.append("<FINISH_DATE>").append(appDate).append("</FINISH_DATE>")
			.append("<FINISH_TIME>").append(StringUtils.defaultString(appEndTime)).append("</FINISH_TIME>")
			.append("<SORTFIELD>").append(DigitalSevaKendraConstants.SORTFIELD).append("</SORTFIELD>")
			.append("<ABKRS>").append(DigitalSevaKendraConstants.ABKRS).append("</ABKRS>")
			.append("<LATITUDE>").append(StringPool.BLANK).append("</LATITUDE>")
			.append("<LONGITUDE>").append(StringPool.BLANK).append("</LONGITUDE>")
			.append("<GEOCOR_ADDRESS>").append(StringPool.BLANK).append("</GEOCOR_ADDRESS>")
			.append("<APPOINT_DIV>").append(StringUtils.defaultString(appointmentDistrict)).append("</APPOINT_DIV>")
			.append("<floor>").append(StringUtils.defaultString(connectionRequest.getFloor())).append("</floor>")
			.append("<tempStartDate>").append(getWsFormatDate(connectionRequest.getTempStartDate(),new Date())).append("</tempStartDate>")
			.append("<tempEndDate>").append(getWsFormatDate(connectionRequest.getTempEndDate(),new Date())).append("</tempEndDate>")
			.append("<SupplyType>").append(StringUtils.defaultString(connectionRequest.getSupplyType())).append("</SupplyType>")
			.append("<stilt_parking>").append(getBooleanFieldValue(connectionRequest.getStiltParking())).append("</stilt_parking>")
			.append("<lift_certificate>").append(getBooleanFieldValue(connectionRequest.getLift())).append("</lift_certificate>")
			.append("<bdo_certificate>").append(getBooleanFieldValue(connectionRequest.isHasBdoCertificate())).append("</bdo_certificate>")
			.append("<internal_wiring>").append(getBooleanFieldValue(connectionRequest.isWiringTest())).append("</internal_wiring>")
			.append("<email_services_required>").append(getBooleanFieldValue(connectionRequest.getEServiceMailValidated())).append("</email_services_required>")
			.append("<upic_available>").append(getBooleanFieldValue(connectionRequest.getUpicAvailable())).append("</upic_available>")
			.append("<gstin>").append(StringUtils.defaultString(connectionRequest.getGstIn())).append("</gstin>")
			.append("<PAN>").append(StringUtils.defaultString(connectionRequest.getPanNo())).append("</PAN>")
			.append("<elcb_certificate>").append(getBooleanFieldValue(connectionRequest.getElcbInstalled())).append("</elcb_certificate>")
			
			.append("<building_height_lt_15>").append(getBooleanFieldValue(selectedHeight==15?connectionRequest.getHeight15Mtr():false)).append("</building_height_lt_15>")
			.append("<building_height_lt_17>").append(getBooleanFieldValue(selectedHeight==17?connectionRequest.getHeight17Mtr():false)).append("</building_height_lt_17>")
			.append("<HEIGHT_9MTR>").append(getBooleanFieldValue(selectedHeight==9? connectionRequest.getHeight9Mtr():false)).append("</HEIGHT_9MTR>")
			.append("<HEIGHT_12MTR>").append(getBooleanFieldValue(selectedHeight==12?connectionRequest.getHeight12Mtr():false)).append("</HEIGHT_12MTR>")
			
			
			.append("<fcc_certificate>").append(getBooleanFieldValue(connectionRequest.getFcc())).append("</fcc_certificate>")
			.append("<ownership_proof_type>").append(StringUtils.defaultString(connectionRequest.getOwnershipProofType())).append("</ownership_proof_type>")
			
			.append("<buildingType>").append(StringUtils.defaultString(connectionRequest.getBuildingType())).append("</buildingType>")
			.append("<industrialLicense>").append(getBooleanFieldValue(connectionRequest.getIndustrialLicense())).append("</industrialLicense>")
			.append("<industrialLicenseCertificate>").append(StringUtils.defaultString(connectionRequest.getIndustrialLicenseCertificate())).append("</industrialLicenseCertificate>")
			.append("<hasLiftCertificate>").append(getBooleanFieldValue(connectionRequest.getHasLiftCertificate())).append("</hasLiftCertificate>")
			.append("<LICENSE_CRE_NO>").append(StringUtils.defaultString(connectionRequest.getLicenseCertificateNo())).append("</LICENSE_CRE_NO>")
			.append("<LICENSE_ISSU_DATE>").append(getWsFormatDate(connectionRequest.getLicenseIssueDate(),null)).append("</LICENSE_ISSU_DATE>")
			.append("<LICENSE_VALID_FRM>").append(getWsFormatDate(connectionRequest.getLicenseValidityFrom(),null)).append("</LICENSE_VALID_FRM>")
			.append("<LICENSE_VALID_TO>").append(getWsFormatDate(connectionRequest.getLicenseValidityTo(),null)).append("</LICENSE_VALID_TO>")
			.append("<OPT_SUBSIDY>").append(getBooleanFieldValue(connectionRequest.getOptSubsidy())).append("</OPT_SUBSIDY>")
			.append("<PURCHASE_METER>").append(getBooleanFieldValue(connectionRequest.getPurchaseMeter())).append("</PURCHASE_METER>")
			.append("<PURPOSE_SUPPLY>").append(StringUtils.defaultString(connectionRequest.getPurposeOfSupply())).append("</PURPOSE_SUPPLY>")
			
			.append("<HOUSENO2>").append(StringUtils.defaultString(connectionRequest.getHouseNo2())).append("</HOUSENO2>")
			.append("<FLOOR2>").append(StringUtils.defaultString(connectionRequest.getFloor2())).append("</FLOOR2>")
			.append("<BUILDINGNAME2>").append(StringUtils.defaultString(connectionRequest.getBuildingName2())).append("</BUILDINGNAME2>")
			.append("<STREET2>").append(StringUtils.defaultString(connectionRequest.getStreet2())).append("</STREET2>")
			.append("<COLONY_AREA2>").append(StringUtils.defaultString(connectionRequest.getColonyArea2())).append("</COLONY_AREA2>")
			.append("<LANDMARK2>").append(StringUtils.defaultString(connectionRequest.getLandmark2())).append("</LANDMARK2>")
			.append("<LANDMARK2_DT>").append(StringUtils.defaultString(connectionRequest.getLandmarkDetails2())).append("</LANDMARK2_DT>")
			.append("<PINCODE2>").append(StringUtils.defaultString(connectionRequest.getPinCode2())).append("</PINCODE2>")
			
			.append("<INDICATE_LANDMARK>").append(StringUtils.defaultString(connectionRequest.getIndicateLandmark())).append("</INDICATE_LANDMARK>")
			.append("<NON_CONFIRM_AREA>").append(getBooleanFieldValue(connectionRequest.getNonConfirmingArea())).append("</NON_CONFIRM_AREA>")
			.append("<dpccClearanceRequired>").append(getBooleanFieldValue(connectionRequest.getDpccClearanceRequired())).append("</dpccClearanceRequired>")
			.append("<hasTradeLicense>").append(getBooleanFieldValue(connectionRequest.getHasTradeLicense())).append("</hasTradeLicense>")
			.append("<tradeLicenseCertificate>").append(StringUtils.defaultString(connectionRequest.getTradeLicenseCertificate())).append("</tradeLicenseCertificate>")
			
			.append("<UPIC_NO>").append(StringUtils.defaultString(connectionRequest.getUpic())).append("</UPIC_NO>")
			.append("<FRIM_NAME>").append(StringUtils.defaultString(connectionRequest.getFirmName())).append("</FRIM_NAME>")
			.append("<NAME_AUTH_SIGNATORY>").append(StringUtils.defaultString(connectionRequest.getSignatoryName())).append("</NAME_AUTH_SIGNATORY>")
			.append("<DESG_SIGNATORY>").append(StringUtils.defaultString(connectionRequest.getSignatoryDesignation())).append("</DESG_SIGNATORY>")
			.append("<DOI>").append(getWsFormatDate(connectionRequest.getIncorporationDate(),null)).append("</DOI>") 
			.append("<TYPE_OF_ORG>").append(StringUtils.defaultString(connectionRequest.getOrganizationType())).append("</TYPE_OF_ORG>")
			.append("<REGED_ADDRESS>").append(StringUtils.defaultString(connectionRequest.getRegisteredAddress())).append("</REGED_ADDRESS>")
			.append("<CONSUMER_TYPE>").append(StringUtils.defaultString(connectionRequest.getConsumerType())).append("</CONSUMER_TYPE>")
			
			.append("</"+SOAPAction+">").append("</soap:Body>").append("</soap:Envelope>");
			
			String requestXML = reqXML.toString();			
			LOGGER.debug("requestXML----"+requestXML);

			
			serviceOrder = callService(requestXML);
			
			/*if (StringUtils.isBlank(serviceOrder) || serviceOrder.equalsIgnoreCase("null")) {
				serviceOrder = callService(requestXML);
			}*/

			LOGGER.info("submitNewRequest ServiceOrder from sap for req no '" + connectionRequest.getRequestNo() + "' is "+ serviceOrder);

		} catch (Exception e) {
			LOGGER.error(e);
		}
		return serviceOrder;
	}
	
	private static int getSelectedHeight(ConnectionRequest connectionRequest) {
		int height=0;
		boolean isDomestic=(StringUtils.equalsIgnoreCase(connectionRequest.getTariffCategory(), "0100") 
				&&  StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Residential Building"));
		if(isDomestic)  {
			boolean stilt=connectionRequest.isStiltParking();
			if(stilt){
				height=17;
			}else {
				height=15;
			}
		}else {
			if(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Hotel/Guest House")){
				height=12;
			}else if(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Institutional Building")){
				height=9;
			}else if(StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(),"Residential Building") 
					|| StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Business Building") 
					|| StringUtils.equalsIgnoreCase(connectionRequest.getBuildingType(), "Other")){
				
				height=15;
			}
		}
		return height;
	}
	private static String getConnectionType(String connectionType) {
		String value=null;
		if(StringUtils.equals(connectionType,"2")) {
			value ="TEMP";//"TEMP";
		}else {
			value=STR_OTHER;//"PER";
		}
		return value;
	}
	private static String getBooleanFieldValue(boolean fieldValue) {
		String booleanFieldValue = "N";
		if(fieldValue == true) {
			booleanFieldValue = "Y";
		}
		return booleanFieldValue;
	}
	private static String getWsFormatDate(Date inputDate, Date defaultDate) {
		SimpleDateFormat wsDateFormat = new SimpleDateFormat("yyyyMMdd");
		
		if(inputDate == null) {
			inputDate =defaultDate;
		}
		if(inputDate == null){
			return "";
		}
		String wsDate = wsDateFormat.format(inputDate);
		
		return wsDate;
	}
	public static String submitChangeRequest(long connectionRequestId, CmsISUCADisplayResponse cmsResponse) {
		try {
			ConnectionRequest connectionRequest=ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
			//LOGGER.info("connectionRequest - " + connectionRequest);
			return submitChangeRequest(connectionRequest, cmsResponse);
		}catch(Exception e) {
			LOGGER.error(e);
		}
		
		return null;
	}
	

	public static String submitChangeRequest(ConnectionRequest connectionRequest, CmsISUCADisplayResponse cmsResponse) {
		LOGGER.info("In submitChangeRequest method");
		
		if(StringUtils.equalsIgnoreCase(connectionRequest.getRequestMode(), "Online") && !isRequestAllowedNow()) {
			return "Error: This service is available Monday to Friday between 9:00 AM-5:30 PM (except Public Holidays)";
		}
		
		String requestSubType=ConnectionRequestLocalServiceUtil.getChangeRequestSubType(connectionRequest);
		
		System.out.println("******* connectionRequest.getRequestType() - "+connectionRequest.getRequestType() +"requestSubType- "+requestSubType );
		LOGGER.info("******* log - connectionRequest.getRequestType() - - "+connectionRequest.getRequestType() +"requestSubType- "+requestSubType);
		String serviceOrder = null;
		if(StringUtils.equalsIgnoreCase(PropsUtil.get("connection.request.submit.soap"), "false")) {
			serviceOrder = "SO-"+connectionRequest.getRequestNo();
			LOGGER.info("submitChangeRequest: local order number generated - "+serviceOrder);
			
			return serviceOrder;
		}
		
		LOGGER.info("submitChangeRequest : connectionRequest number - " + connectionRequest.getRequestNo());
		try {
			String requestXML = generateChangeRequestXML(connectionRequest,cmsResponse, requestSubType);
			
			LOGGER.info("==================submitChangeRequest requestXML - =================");
			LOGGER.info(requestXML);
			
			//The following lines are commented to skip service call for mock testing
			serviceOrder = callService(requestXML);
			
			/*if (serviceOrder.equals(null) || serviceOrder.isEmpty() || serviceOrder.equals("null")) {
				serviceOrder = callService(requestXML);
			}*/ 
			
			if(StringUtils.contains(serviceOrder, "<diffgr:diffgram")) {
				serviceOrder =null;
			}
			LOGGER.info("submitChangeRequest ServiceOrder from sap for req no '" + connectionRequest.getRequestNo() + "' is "+ serviceOrder);
		}catch (Exception e) {
			LOGGER.error(e);
		}
		
		return serviceOrder;
	}
	
	private static String generateTwelveDigitCANo(String caNumber) {
		String formattedNumber = StringPool.BLANK;
		if (Validator.isNotNull(caNumber)) {
			formattedNumber = String.format("%012d", Long.valueOf(caNumber));
			//log.debug("Formatted account number from  getValidAccountNumber method ::::::::  " + formattedNumber);
		}
		return formattedNumber;
	}
	
	private static String generateChangeRequestXML(ConnectionRequest cr, CmsISUCADisplayResponse cmsResponse, String requestSubType) {
		SimpleDateFormat wsDateFormat = new SimpleDateFormat("yyyyMMdd");
		
		String requestXML = null;
		try {
		
			String titleKey = "";
			if (Validator.isNull(cr.getTitle()) || cr.getTitle().equals("")
					|| cr.getTitle().equals("-1")) {
				titleKey = "0001";
			} else {
				titleKey = cr.getTitle();
			}
			
			String iIlart = "";
			if(StringUtils.isNotBlank(requestSubType)) {
				iIlart = requestSubType;
			}else {
				iIlart = cr.getRequestType();
			}
			String planningPlant="D021";
			String parentCat = DigitalSevaKendraConstants.PARENT_CAT_1;
			String male = DigitalSevaKendraConstants.MALE;
			String female = StringPool.BLANK;
			String appliedLoadkva = StringPool.BLANK;
			String appliedLoad = StringPool.BLANK;
			
			if (StringUtils.equalsIgnoreCase(cr.getConsumerType(),"Firm")) {
				parentCat = DigitalSevaKendraConstants.PARENT_CAT_2;
			}
			
			
			appliedLoadkva = String.valueOf(Math.round(cr.getLoadKva()));
			appliedLoad = String.valueOf(Math.round(cr.getLoadKw()));
			
			Date appointmentDate = cr.getAppointmentDate();
			if(appointmentDate == null) {
				appointmentDate = new Date();
			}
			String appDate = wsDateFormat.format(appointmentDate);
			
			String appStartTime = cr.getAppointmentTime();
			String appEndTime = cr.getAppointmentFinishTime();
			if(StringUtils.isBlank(appStartTime)) {
				appStartTime = "09:15:00";
			}
			if(StringUtils.isBlank(appEndTime)) {
				appEndTime = "10:30:00";
			}
			
			String appointmentDistrict = cr.getAppointmentDistrict();
			if(StringUtils.isBlank(appointmentDistrict)) {
				appointmentDistrict = cr.getDistrict();
			}
			
			String wsURL=PropsUtil.get("REQUEST_SUBMIT_SERVICE_URL");
			String SOAPAction=PropsUtil.get("Z_BAPI_ZDSS_WEB_LINK_SOAP_ACTION");
			
			if(StringUtils.isBlank(wsURL) || StringUtils.isBlank(SOAPAction)) {
				return null;
			}
			SOAPAction = StringUtils.remove(SOAPAction, "http://tempuri.org/");
			
			int selectedHeight = getSelectedHeight(cr);
			System.out.println("*********** selectedHeight - "+ selectedHeight);
			
			String workcentre = cr.getDistrict();
			
			if(StringUtils.isBlank(workcentre) && cmsResponse != null ) {
				workcentre = cmsResponse.getReg_Str_Group();
			}
			// call web service
			StringBuilder reqXML = new StringBuilder();
			reqXML.append(
					"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" 	xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
					.append("<soap:Body>").append("<"+SOAPAction+" xmlns=\"http://tempuri.org/\">")
					.append("<I_ILART>").append(iIlart).append("</I_ILART>")
					.append("<I_VKONT>").append(Validator.isNotNull(cr.getCaNumber()) ? generateTwelveDigitCANo(cr.getCaNumber()) : StringPool.BLANK).append("</I_VKONT>")
					.append("<I_VKONA>").append(StringPool.BLANK).append("</I_VKONA>")
					.append("<PARTNERCATEGORY>").append(parentCat).append("</PARTNERCATEGORY>")
					.append("<PARTNERTYPE>").append(DigitalSevaKendraConstants.PARTNER_TYPE).append("</PARTNERTYPE>")
					.append("<TITLE_KEY>").append(titleKey).append("</TITLE_KEY>")
					.append("<FIRSTNAME>").append(StringUtils.defaultString(cr.getFirstName())).append("</FIRSTNAME>")
					.append("<LASTNAME>").append(StringUtils.defaultString(cr.getLastName())).append("</LASTNAME>")
					.append("<MIDDLENAME>").append(StringUtils.defaultString(cr.getMiddleName())).append("</MIDDLENAME>")
					.append("<FATHERSNAME>").append(StringUtils.defaultString(cr.getFatherOrHusbandName())).append("</FATHERSNAME>")
					.append("<HOUSE_NO>").append((StringUtils.isNotBlank(cr.getHouseNo())?cr.getHouseNo():STR_DOT)).append("</HOUSE_NO>")
					.append("<BUILDING>").append((StringUtils.isNotBlank(cr.getBuildingName())?cr.getBuildingName():STR_DOT)).append("</BUILDING>")
					.append("<STR_SUPPL1>").append(StringUtils.defaultString(cr.getStreet())).append("</STR_SUPPL1>")
					.append("<STR_SUPPL2>").append(StringUtils.defaultString(cr.getColonyArea())).append("</STR_SUPPL2>")
					.append("<STR_SUPPL3>").append(StringUtils.defaultString(cr.getLandmarkDetails())).append("</STR_SUPPL3>")
					.append("<POSTL_COD1>").append(StringUtils.defaultString(cr.getPinCode())).append("</POSTL_COD1>")
					.append("<CITY>").append(DigitalSevaKendraConstants.CITY).append("</CITY>")
					.append("<E_MAIL>").append(StringUtils.defaultString(cr.getEServiceMailId())).append("</E_MAIL>")
					.append("<LANDLINE>").append(cr.getMobileNo()).append("</LANDLINE>")
					.append("<MOBILE>").append(cr.getMobileNo()).append("</MOBILE>")
					.append("<FEMALE>").append(female).append("</FEMALE>")
					.append("<MALE>").append(male).append("</MALE>")
					.append("<JOBGR>").append(StringPool.BLANK).append("</JOBGR>")
					.append("<IDTYPE>").append(StringUtils.defaultString(cr.getIdProofType())).append("</IDTYPE>")
					.append("<IDNUMBER>").append(StringUtils.defaultString(cr.getIdProofNo())).append("</IDNUMBER>")
					
					.append("<PLANNINGPLANT>").append(planningPlant).append("</PLANNINGPLANT>")
					.append("<WORKCENTRE>").append(StringUtils.defaultString(workcentre)).append("</WORKCENTRE>")
					.append("<SYSTEMCOND>").append(DigitalSevaKendraConstants.SYSTEMCOND).append("</SYSTEMCOND>")
					.append("<APPLIEDCAT>").append(StringUtils.defaultString(cr.getTariffCategory())).append("</APPLIEDCAT>")
					.append("<APPLIEDLOAD>").append(StringUtils.defaultString(appliedLoad)).append("</APPLIEDLOAD>")
					.append("<APPLIEDLOADKVA>").append(StringUtils.defaultString(appliedLoadkva)).append("</APPLIEDLOADKVA>")
					.append("<CONNECTIONTYPE>").append(getConnectionType(cr.getConnectionType())).append("</CONNECTIONTYPE>")
					.append("<STATEMENT_CA>").append(StringPool.BLANK).append("</STATEMENT_CA>")
					.append("<START_DATE>").append(appDate).append("</START_DATE>")
					.append("<START_TIME>").append(appStartTime).append("</START_TIME>")
					.append("<FINISH_DATE>").append(appDate).append("</FINISH_DATE>")
					.append("<FINISH_TIME>").append(appEndTime).append("</FINISH_TIME>")
					.append("<SORTFIELD>").append(DigitalSevaKendraConstants.SORTFIELD).append("</SORTFIELD>")
					.append("<ABKRS>").append(DigitalSevaKendraConstants.ABKRS).append("</ABKRS>")
					.append("<LATITUDE>").append(StringPool.BLANK).append("</LATITUDE>")
					.append("<LONGITUDE>").append(StringPool.BLANK).append("</LONGITUDE>")
					.append("<GEOCOR_ADDRESS>").append(StringPool.BLANK).append("</GEOCOR_ADDRESS>")
					.append("<APPOINT_DIV>").append(StringUtils.defaultString(appointmentDistrict)).append("</APPOINT_DIV>")
					.append("<floor>").append(StringUtils.defaultString(cr.getFloor())).append("</floor>")
					.append("<tempStartDate>").append(getWsFormatDate(cr.getTempStartDate(),new Date())).append("</tempStartDate>")
					.append("<tempEndDate>").append(getWsFormatDate(cr.getTempEndDate(),new Date())).append("</tempEndDate>")
					.append("<SupplyType>").append(StringUtils.defaultString(cr.getSupplyType())).append("</SupplyType>")
					.append("<stilt_parking>").append(getBooleanFieldValue(cr.getStiltParking())).append("</stilt_parking>")
					.append("<lift_certificate>").append(getBooleanFieldValue(cr.getLift())).append("</lift_certificate>")
					.append("<bdo_certificate>").append(getBooleanFieldValue(cr.isHasBdoCertificate())).append("</bdo_certificate>")
					.append("<internal_wiring>").append(getBooleanFieldValue(cr.isWiringTest())).append("</internal_wiring>")
					.append("<email_services_required>").append(getBooleanFieldValue(cr.getEServiceMailValidated())).append("</email_services_required>")
					.append("<upic_available>").append(getBooleanFieldValue(cr.getUpicAvailable())).append("</upic_available>")
					.append("<gstin>").append(StringUtils.defaultString(cr.getGstIn())).append("</gstin>")
					.append("<PAN>").append(StringUtils.defaultString(cr.getPanNo())).append("</PAN>")
					.append("<elcb_certificate>").append(getBooleanFieldValue(cr.getElcbInstalled())).append("</elcb_certificate>")
					
					.append("<building_height_lt_15>").append(getBooleanFieldValue(selectedHeight==15?cr.getHeight15Mtr():false)).append("</building_height_lt_15>")
					.append("<building_height_lt_17>").append(getBooleanFieldValue(selectedHeight==17?cr.getHeight17Mtr():false)).append("</building_height_lt_17>")
					.append("<HEIGHT_9MTR>").append(getBooleanFieldValue(selectedHeight==9? cr.getHeight9Mtr():false)).append("</HEIGHT_9MTR>")
					.append("<HEIGHT_12MTR>").append(getBooleanFieldValue(selectedHeight==12?cr.getHeight12Mtr():false)).append("</HEIGHT_12MTR>")
					
					.append("<fcc_certificate>").append(getBooleanFieldValue(cr.getFcc())).append("</fcc_certificate>")
					.append("<ownership_proof_type>").append(StringUtils.defaultString(cr.getOwnershipProofType())).append("</ownership_proof_type>")
					
					.append("<buildingType>").append(StringUtils.defaultString(cr.getBuildingType())).append("</buildingType>")
					.append("<industrialLicense>").append(getBooleanFieldValue(cr.getIndustrialLicense())).append("</industrialLicense>")
					.append("<industrialLicenseCertificate>").append(StringUtils.defaultString(cr.getIndustrialLicenseCertificate())).append("</industrialLicenseCertificate>")
					.append("<hasLiftCertificate>").append(getBooleanFieldValue(cr.getHasLiftCertificate())).append("</hasLiftCertificate>")
					.append("<LICENSE_CRE_NO>").append(StringUtils.defaultString(cr.getLicenseCertificateNo())).append("</LICENSE_CRE_NO>")
					.append("<LICENSE_ISSU_DATE>").append(getWsFormatDate(cr.getLicenseIssueDate(),null)).append("</LICENSE_ISSU_DATE>")
					.append("<LICENSE_VALID_FRM>").append(getWsFormatDate(cr.getLicenseValidityFrom(),null)).append("</LICENSE_VALID_FRM>")
					.append("<LICENSE_VALID_TO>").append(getWsFormatDate(cr.getLicenseValidityTo(),null)).append("</LICENSE_VALID_TO>")
					.append("<OPT_SUBSIDY>").append(getBooleanFieldValue(cr.getOptSubsidy())).append("</OPT_SUBSIDY>")
					.append("<PURCHASE_METER>").append(getBooleanFieldValue(cr.getPurchaseMeter())).append("</PURCHASE_METER>")
					.append("<PURPOSE_SUPPLY>").append(StringUtils.defaultString(cr.getPurposeOfSupply())).append("</PURPOSE_SUPPLY>")
					.append("<HOUSENO2>").append(StringUtils.defaultString(cr.getHouseNo2())).append("</HOUSENO2>")
					.append("<FLOOR2>").append(StringUtils.defaultString(cr.getFloor2())).append("</FLOOR2>")
					.append("<BUILDINGNAME2>").append(StringUtils.defaultString(cr.getBuildingName2())).append("</BUILDINGNAME2>")
					.append("<STREET2>").append(StringUtils.defaultString(cr.getStreet2())).append("</STREET2>")
					.append("<COLONY_AREA2>").append(StringUtils.defaultString(cr.getColonyArea2())).append("</COLONY_AREA2>")
					.append("<LANDMARK2>").append(StringUtils.defaultString(cr.getLandmark2())).append("</LANDMARK2>")
					.append("<LANDMARK2_DT>").append(StringUtils.defaultString(cr.getLandmarkDetails2())).append("</LANDMARK2_DT>")
					.append("<PINCODE2>").append(StringUtils.defaultString(cr.getPinCode2())).append("</PINCODE2>")
					.append("<INDICATE_LANDMARK>").append(StringUtils.defaultString(cr.getIndicateLandmark())).append("</INDICATE_LANDMARK>")
					.append("<NON_CONFIRM_AREA>").append(getBooleanFieldValue(cr.getNonConfirmingArea())).append("</NON_CONFIRM_AREA>")
					.append("<dpccClearanceRequired>").append(getBooleanFieldValue(cr.getDpccClearanceRequired())).append("</dpccClearanceRequired>")
					.append("<hasTradeLicense>").append(getBooleanFieldValue(cr.getHasTradeLicense())).append("</hasTradeLicense>")
					.append("<tradeLicenseCertificate>").append(StringUtils.defaultString(cr.getTradeLicenseCertificate())).append("</tradeLicenseCertificate>")
					
					.append("<UPIC_NO>").append(StringUtils.defaultString(cr.getUpic())).append("</UPIC_NO>")
					.append("<FRIM_NAME>").append(StringUtils.defaultString(cr.getFirmName())).append("</FRIM_NAME>")
					.append("<NAME_AUTH_SIGNATORY>").append(StringUtils.defaultString(cr.getSignatoryName())).append("</NAME_AUTH_SIGNATORY>")
					.append("<DESG_SIGNATORY>").append(StringUtils.defaultString(cr.getSignatoryDesignation())).append("</DESG_SIGNATORY>")
					.append("<DOI>").append(getWsFormatDate(cr.getIncorporationDate(),null)).append("</DOI>") 
					.append("<TYPE_OF_ORG>").append(StringUtils.defaultString(cr.getOrganizationType())).append("</TYPE_OF_ORG>")
					.append("<REGED_ADDRESS>").append(StringUtils.defaultString(cr.getRegisteredAddress())).append("</REGED_ADDRESS>")
					.append("<CONSUMER_TYPE>").append(StringUtils.defaultString(cr.getConsumerType())).append("</CONSUMER_TYPE>")
					
					.append("</"+SOAPAction+">").append("</soap:Body>").append("</soap:Envelope>");
			 requestXML = reqXML.toString();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
			
		return requestXML;
	}
	private static String callService(String requestXML) {
		String xmlString = null;
		String responseString = StringPool.BLANK;
		StringBuffer outputSb = new StringBuffer();
		
		String wsURL=PropsUtil.get("REQUEST_SUBMIT_SERVICE_URL");
		String SOAPAction=PropsUtil.get("Z_BAPI_ZDSS_WEB_LINK_SOAP_ACTION");
		
		if(StringUtils.isBlank(wsURL) || StringUtils.isBlank(SOAPAction)) {
			return null;
		}
		SOAPAction = StringUtils.remove(SOAPAction, "http://tempuri.org/");
		
		String SOAPActionURL = "http://tempuri.org/"+SOAPAction;
		
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

				httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
				httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
				httpConn.setRequestProperty("SOAPAction", SOAPActionURL);
				httpConn.setRequestMethod("POST");
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
				LOGGER.info("Service Called > "+wsURL);
			
			} catch (Exception e) {
				LOGGER.error(e);
				LOGGER.error("Error occured while calling "+SOAPAction+ ": " + e);
			} finally {
				if (Validator.isNotNull(isr)) {
					try {
						isr.close();
					} catch (IOException e) {
						LOGGER.error(e);
					}
				}
			}
		}

		try {
			String  resXml=  outputSb.toString();
			//String xmlString  =null;
			LOGGER.info("Service responce -------" + resXml);
			xmlString = substringBetween(resXml, "<E_Service_Order>", "</E_Service_Order>");
			
			if(StringUtils.isBlank(xmlString)) {
				xmlString = substringBetween(resXml, "</xs:schema>", "</Z_BAPI_ZDSS_WEB_LINK_CRM_WebSiteResult>");
				if(StringUtils.isNotBlank(xmlString) && xmlString.contains("SAPDATA_ErrorDataTable")){
					String message  = substringBetween(xmlString, "<Message>", "</Message>");
					xmlString = "Error: "+message;
				}
			}
			
			LOGGER.info("xmlString from 1 st call-------" + xmlString);
		} catch (Exception e) {
			LOGGER.info("Exception occured while fetching data from 1 st time");
		}
		return xmlString;
	}
	
	/*
	public String generateRequestNo(String discomKey, String requestType) {
		String discomCode = StringPool.BLANK;
		if (discomKey.equals("D021") || discomKey.equalsIgnoreCase("brpl")) {
			discomCode = "R";
		} else {
			discomCode = "Y";
		}
		// create new request number
		return _dssNewConnRequestLocalService.generateReqNo(discomCode, getConnType(requestType));
	}
	 */
	
	public static String getConnType(String requestType) {
		if (requestType.equals("SLCC")) {
			return "S";
		} else if (requestType.equals("MLCC")) {
			return "M";
		} else if (requestType.equals("GCC")) {
			return "G";
		} else if (requestType.equals("KCC")) {
			return "K";
		}
		return StringPool.BLANK;
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
	

	private List<ItDataTableResponse> getCNT_APP_DETAIL_MOB(String xmlString, int l) {
		List<ItDataTableResponse> itDataTableResponseList = null;
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		//Document doc = null; org.w3c.dom.Document
		InputStream is = null;
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			is = new ByteArrayInputStream(xmlString.getBytes());
			Document doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();
		} catch (ParserConfigurationException e) {
			LOGGER.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} catch (SAXException e) {
			LOGGER.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} catch (IOException e) {
			LOGGER.error(BsesSapConnectorServiceConstant.ERROR_MSG_ARRAY + "" + e);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
					LOGGER.error("Error Closing InputStream in getCntAppDetailMob");
				}
			}
		}
		if (Validator.isNotNull(xmlString)) {
			//itDataTableResponseList = getItDataTableResponseAfterParser(xmlString, l);
		}
		return itDataTableResponseList;
	}
	
	public static String callService(String requestXML,String serviceURL, String actionURL,String method) {
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

				out.write(b);
				out.close();
				isr = new InputStreamReader(httpConn.getInputStream());
				BufferedReader in = new BufferedReader(isr);
				while ((responseString = in.readLine()) != null) {
					outputSb.append(responseString);
				}
			
			} catch (Exception e) {
				System.out.println("Error occured while calling ZBAPI_CS_ORD_STAT with JAVA API : " + e);
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
		xmlString = outputSb.toString();
		return xmlString;
	}
	
	
public static String getOrderStatus(String orderNumber) {
		
		StringBuilder reqXML = new StringBuilder();
		reqXML.append(
				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" 	xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
				.append("<soap:Body>").append("<ZBAPI_CS_ORD_STAT xmlns=\"http://tempuri.org/\">")
				.append("<strAufnr>").append(orderNumber).append("</strAufnr>")
				.append("</ZBAPI_CS_ORD_STAT>").append("</soap:Body>").append("</soap:Envelope>");
		String requestXML = reqXML.toString();
		String wsURL = PropsUtil.get("REQUEST_SUBMIT_SERVICE_URL");;
		
		String responseString = StringPool.BLANK;
		StringBuffer outputSb = new StringBuffer();
		String xmlString=null;
		System.out.println("SoapCallFromJava.GetOrderStatu()"+wsURL);

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
				String SOAPAction = "http://tempuri.org/ZBAPI_CS_ORD_STAT";
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
				
				xmlString = outputSb.toString();
				System.out.println(xmlString);
				//String orderStatus = substringBetween(xmlString, "<ORDER_STATUS>", "</ORDER_STATUS>");
				String orderStatus = substringBetween(xmlString, "<TEXT>", "</TEXT>");
				String orderDesc = substringBetween(xmlString, "<ORDER_DESC>", "</ORDER_DESC>");
				xmlString = orderStatus+"#"+orderDesc;
				
			} catch (Exception e) {
				System.out.println("Error occured while calling ZBAPI_CS_ORD_STAT with JAVA API : " + e);
			} finally {
				if (Validator.isNotNull(isr)) {
					try {
						isr.close();
					} catch (IOException e) {
						System.out.println(e);
					}
				}
			}
		
				
		return xmlString;
	}

	public static boolean isRequestAllowedNow() {
		String timeCheck=PropsUtil.get("connection.request.time.check");
		if(StringUtils.equalsIgnoreCase(timeCheck, "False")){
			return true;
		}
		
		if(!isWeekend() && isTimeAllowed()) {
			return true;
		}
		
		return false;
	}
	private static boolean isWeekend() {
		
		Calendar cl = Calendar.getInstance();
		cl.setTime(new Date());
		int day = cl.get(Calendar.DAY_OF_WEEK);
		if(day==Calendar.SATURDAY || day ==Calendar.SUNDAY)	{
		   return true;
		}
		return false;
	}
	
	private static boolean isTimeAllowed() {
		
		LocalTime start = LocalTime.parse("09:00");
		LocalTime end = LocalTime.parse("17:30");
		LocalTime now = LocalTime.now();
		
		if(now.isAfter(start) && now.isBefore(end)) {
			 return true;
		}else {
			 return false;
		}
	}
	
}
