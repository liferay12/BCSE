/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.bses.connection2.service.impl;

import com.bses.connection2.exception.NoSuchConnectionRequestException;
import com.bses.connection2.helper.DigitalSevaKendraServiceHelper;
import com.bses.connection2.model.ConnectionDocument;
import com.bses.connection2.model.ConnectionRequest;
import com.bses.connection2.model.LocalityDivision;
import com.bses.connection2.model.impl.ConnectionRequestImpl;
import com.bses.connection2.service.ConnectionDocumentLocalService;
import com.bses.connection2.service.ConnectionDocumentLocalServiceUtil;
import com.bses.connection2.service.LocalityDivisionLocalServiceUtil;
import com.bses.connection2.service.RequestNumberSeqLocalServiceUtil;
import com.bses.connection2.service.base.ConnectionRequestLocalServiceBaseImpl;
import com.bses.connection2.util.NameUtil;
import com.bses.connection2.util.RequestTypeModeStatus;
import com.bses2.sap.connector.services.SapConnctorServiceApi;
import com.bses2.sap.model.CmsISUCADisplayResponse;
import com.bses2.sap.model.DssISUCADisplayRequest;
import com.bses2.sap.model.DssISUCADisplayResponse;
import com.bses2.sap.model.ItDataTableResponse;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONDeserializer;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONSerializer;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.HttpMethods;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import javax.mail.internet.InternetAddress;

import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Reference;

/**
 * The implementation of the connection request local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.bses.connection2.service.ConnectionRequestLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestLocalServiceBaseImpl
 * @see com.bses.connection2.service.ConnectionRequestLocalServiceUtil
 */
public class ConnectionRequestLocalServiceImpl extends ConnectionRequestLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.bses.connection2.service.ConnectionRequestLocalServiceUtil} to access the
	 * connection request local service.
	 */
	private static final Log LOGGER = LogFactoryUtil.getLog(ConnectionRequestLocalServiceImpl.class);
	private static final String PREFIX_CONSUMER = "consumer";
	private static final String PREFIX_ADDRESS = "address";
	private static final String PREFIX_CONNECTION = "connection";
	private static final String PREFIX_CHECKLIST = "checklist";
	private static final String PREFIX_DOCUMENT = "document";

	public static final String FORM_EMAIL_ID = "bsesnoreply@relianceada.com";
	public static final String SUBJECT = "OTP for New Connection";
	public static DateFormat dateFormat=null;
	public static final int RETENTION_DAYS=5;
	
	@Reference
	private ConnectionDocumentLocalService connectionDocumentLocalService;
	
	@ServiceReference(type = SapConnctorServiceApi.class)
	private SapConnctorServiceApi sapService;

	
	public ConnectionRequest getOldConnectionDetails(long connectionRequestId) throws PortalException {
		LOGGER.info("getOldConnectionDetails - " + connectionRequestId);
		ConnectionRequest oldConnectionRequest = null;
		
		ConnectionRequest connectionRequest = getConnectionRequest(connectionRequestId);
		if(StringUtils.isNotBlank(connectionRequest.getOldData())) {
			oldConnectionRequest =convertToConnectionRequest(connectionRequest.getOldData());
		}
		
		return oldConnectionRequest;
	}
	
	
	public ConnectionRequest createConnectionRequest(String mobileNo, String emailId) throws PortalException {
		
		LOGGER.info(mobileNo + " - " + emailId );
		int draftCount=getNewRequestCount(mobileNo);
		
		int maxCount=5;
		try{
			maxCount=Integer.parseInt(PropsUtil.get("connection.request.draft.max.count").trim());
		}catch(Exception e){}
		
		if(draftCount>=maxCount) {
			throw new PortalException("Maximum number of pending requests reached "+maxCount);
		}
		
		
		String requestNo = generateRequestNumber(RequestTypeModeStatus.TYPE_NEW_CONNECTION);
		LOGGER.info("requestNo - "+requestNo );
		ConnectionRequest connectionRequest = connectionRequestPersistence.create(CounterLocalServiceUtil.increment(ConnectionRequest.class.getName()));
		connectionRequest.setMobileNo(mobileNo);
		connectionRequest.setEmailId(emailId);
		connectionRequest.setRequestNo(requestNo);
		connectionRequest.setRequestType(RequestTypeModeStatus.TYPE_NEW_CONNECTION);
		connectionRequest.setRequestStatus(RequestTypeModeStatus.STATUS_DRAFT);
		connectionRequest.setHeight9Mtr(true);
		connectionRequest.setHeight12Mtr(true);
		connectionRequest.setHeight15Mtr(true);
		connectionRequest.setHeight17Mtr(true);
		connectionRequestPersistence.update(connectionRequest);
		return connectionRequest;
	}
	
	public ConnectionRequest createConnectionRequest(String mobileNo, String emailId, String requestType, String requestMode) throws PortalException {
		//"R-TMP-" + new Date().getTime();
		LOGGER.info(mobileNo + " - " + emailId + " - " );
		int draftCount=connectionRequestPersistence.countByMobileNoAndRequestStatus(mobileNo, RequestTypeModeStatus.STATUS_DRAFT);
		int maxCount=getMaxDraftCount();
		
		if(draftCount>=maxCount) {
			throw new PortalException("Maximum number of pending requests reached "+maxCount);
		}
		
		String requestNo = generateRequestNumber(requestType);
		LOGGER.info("requestNo - "+requestNo );
		ConnectionRequest connectionRequest = connectionRequestPersistence.create(CounterLocalServiceUtil.increment(ConnectionRequest.class.getName()));
		connectionRequest.setMobileNo(mobileNo);
		connectionRequest.setEmailId(emailId);
		
		connectionRequest.setRequestNo(requestNo);
		connectionRequest.setRequestType(requestType);
		connectionRequest.setRequestMode(requestMode);
		connectionRequest.setRequestStatus(RequestTypeModeStatus.STATUS_DRAFT);
		connectionRequest.setHeight9Mtr(true);
		connectionRequest.setHeight12Mtr(true);
		connectionRequest.setHeight15Mtr(true);
		connectionRequest.setHeight17Mtr(true);
		setDefaultNewAttributes(connectionRequest);
		connectionRequestPersistence.update(connectionRequest);
		return connectionRequest;
	}
	
	private String generateRequestNumber(String requestType) throws PortalException {
		String discomCode ="R";
		String connType = DigitalSevaKendraServiceHelper.getConnType(requestType);
		long seqNo=RequestNumberSeqLocalServiceUtil.generateSeqNumber();
		String seqNoStr = generateFourDigitNumber(seqNo);
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		Date currentDate = new Date();
		String dateStr = dateFormat.format(currentDate);
		String requestNo = discomCode + connType + dateStr + seqNoStr;
		return requestNo;
	}
	
	
	private String generateFourDigitNumber(long seqNo) {
		String formattedNumber = StringPool.BLANK;
		formattedNumber = String.format("%04d", seqNo);
		return formattedNumber;
	}


	public ConnectionRequest createChangeRequest(String caNumber,String requestType, String requestMode) throws PortalException {
		LOGGER.info("caNumber - "+caNumber);
		
		DssISUCADisplayRequest request = new DssISUCADisplayRequest();
		String caNumberTD= generateTwelveDigitCANo(caNumber); //103012062
		request.setCaNumber(caNumberTD);
	//	http://125.22.84.50:7850/delhiv2/ISUService.asmx/Z_BAPI_CMS_ISU_CA_DISPLAY
		//	Z_BAPI_DSS_ISU_CA_DISPLAY
		
		DssISUCADisplayResponse res= sapService.getDssISUCADisplay2(request);
		
		CmsISUCADisplayResponse cmsRes = sapService.getCmsISUCADisplay(caNumberTD);
		String requestNo = generateRequestNumber(requestType);
		String connectionType = "1";
		if(caNumber.startsWith("3")) {
			connectionType = "2";
		}
		LOGGER.info("requestNo - "+requestNo );
		String consumerName = StringUtils.strip(res.getName());
		String consumerType = getConsumerType(consumerName);
		ConnectionRequest connectionRequest = connectionRequestPersistence.create(CounterLocalServiceUtil.increment(ConnectionRequest.class.getName()));
		connectionRequest.setChangeRequest(true);
		connectionRequest.setCaNumber(caNumber);
		connectionRequest.setMobileNo(res.getMobileNo());
		connectionRequest.setBpNumber(res.getBpNumber());
		connectionRequest.setConnectionType(connectionType);
		
		connectionRequest.setConsumerType(consumerType);
		
		connectionRequest.setEmailId(res.getEmail());
		connectionRequest.setRequestNo(requestNo);
		connectionRequest.setRequestType(requestType);
		connectionRequest.setRequestMode(requestMode);
		connectionRequest.setRequestStatus(RequestTypeModeStatus.STATUS_DRAFT);
		if(StringUtils.containsIgnoreCase(consumerType, "Firm")) {
			connectionRequest.setFirmName(consumerName);
		}else {
			connectionRequest.setFirstName(NameUtil.getFirstName(consumerName));
			connectionRequest.setMiddleName(NameUtil.getMiddleName(consumerName));
			connectionRequest.setLastName(NameUtil.getLastName(consumerName));
			connectionRequest.setFatherOrHusbandName("");//TODO	
		}
		
		//set Address data
		connectionRequest.setHouseNo(res.getHouseNumber());
		connectionRequest.setFloor(cmsRes.getFloor());
		connectionRequest.setBuildingName(res.getBuildingName());
		connectionRequest.setStreet(res.getStreet());
		connectionRequest.setColonyArea(res.getColony());
		connectionRequest.setLandmarkDetails(res.getLandmark());
		connectionRequest.setDistrict(cmsRes.getReg_Str_Group());
		String pin = res.getPostCode();
		if(StringUtils.isBlank(pin)) {
			pin = cmsRes.getPostCode();
		}
		connectionRequest.setPinCode(pin);
		
		String tariffCategory= findTariffCategory(res);
		
		connectionRequest.setTariffCategory(tariffCategory);
		connectionRequest.setDisplayCategory(res.getBillDesc());
		
		if(StringUtils.isNoneBlank(cmsRes.getReg_Str_Group())) {
			LocalityDivision localityDistrict = LocalityDivisionLocalServiceUtil.getLocalityDivisionByDivisionCode(cmsRes.getReg_Str_Group());
			if(localityDistrict !=null) {
				connectionRequest.setLocality(String.valueOf(localityDistrict.getLocalityDivisionId()));
			}
		}
	//TODO	connectionRequest.setLandmark(cmsRes);
		//connectionRequest.setregisteredAddress
	
		//set Load details
		try {
			connectionRequest.setLoadKw(Float.parseFloat(res.getLoad()));
		}catch(Exception ex) {	}
		
		String oldData = getConnectionRequestJSON(connectionRequest);
		
		if(StringUtils.equalsIgnoreCase(requestType, "U02")){ //name change
			connectionRequest.setFirstName("");
			connectionRequest.setMiddleName("");
			connectionRequest.setLastName("");
			connectionRequest.setFatherOrHusbandName("");//TODO	
			
			connectionRequest.setFirmName("");
		}
		connectionRequest.setHeight9Mtr(true);
		connectionRequest.setHeight12Mtr(true);
		connectionRequest.setHeight15Mtr(true);
		connectionRequest.setHeight17Mtr(true);
		
		connectionRequest.setOldData(oldData);
		connectionRequest =connectionRequestPersistence.update(connectionRequest);
		return connectionRequest;
	}

	
	private String findTariffCategory(DssISUCADisplayResponse res) {
		String bpType = res.getBillClass();
		String tariffCategory = null;
		String billSchema = res.getBillSchema();
		
		
		if(StringUtils.isNotBlank(billSchema)) {
			if(StringUtils.startsWithIgnoreCase(billSchema, "Dom")) {
				tariffCategory  ="0100";
			}else if(StringUtils.startsWithIgnoreCase(billSchema, "Non Dom")) {
				tariffCategory ="0290";
			}else if(StringUtils.startsWithIgnoreCase(billSchema, "Ind")) {
				tariffCategory ="0320";
			}else if(StringUtils.startsWithIgnoreCase(billSchema, "Agr")) {
					tariffCategory ="0250";
			}else if(StringUtils.startsWithIgnoreCase(billSchema, "Mus")) {
				tariffCategory ="0280";
			}else if(StringUtils.startsWithIgnoreCase(billSchema, "Pub")) {
				tariffCategory ="0600";
			}else if(StringUtils.startsWithIgnoreCase(billSchema, "Char") || StringUtils.startsWithIgnoreCase(billSchema, "E")) {
				tariffCategory ="0700";
			}else if(StringUtils.startsWithIgnoreCase(billSchema, "DJB")) {
				tariffCategory ="0800";
			}else if(StringUtils.startsWithIgnoreCase(billSchema, "DIAL")) {
				tariffCategory ="0900";
			}else if(StringUtils.startsWithIgnoreCase(billSchema, "DMRC")) {
				tariffCategory ="0910";
			}else if(StringUtils.startsWithIgnoreCase(billSchema, "Rail")) {
				tariffCategory ="0920";
			}else if(StringUtils.startsWithIgnoreCase(billSchema, "Adv")) {
				tariffCategory ="0930";
			}
		}
		
			
		if(StringUtils.isBlank(tariffCategory) && StringUtils.isNotBlank(bpType)) {
			if(StringUtils.startsWithIgnoreCase(bpType, "DO")) {
				tariffCategory  ="0100";
			}else if(StringUtils.startsWithIgnoreCase(bpType, "N")) {
				tariffCategory ="0290";
			}else if(StringUtils.startsWithIgnoreCase(bpType, "I")) {
				tariffCategory ="0320";
			}else if(StringUtils.startsWithIgnoreCase(bpType, "Ag")) {
					tariffCategory ="0250";
			}else if(StringUtils.startsWithIgnoreCase(bpType, "M")) {
				tariffCategory ="0280";
			}else if(StringUtils.startsWithIgnoreCase(bpType, "P")) {
				tariffCategory ="0600";
			}else if(StringUtils.startsWithIgnoreCase(bpType, "C") || StringUtils.startsWithIgnoreCase(bpType, "E")) {
				tariffCategory ="0700";
			}else if(StringUtils.startsWithIgnoreCase(bpType, "DJ")) {
				tariffCategory ="0800";
			}else if(StringUtils.startsWithIgnoreCase(bpType, "DI")) {
				tariffCategory ="0900";
			}else if(StringUtils.startsWithIgnoreCase(bpType, "DM")) {
				tariffCategory ="0910";
			}else if(StringUtils.startsWithIgnoreCase(bpType, "Rail")) {
				tariffCategory ="0920";
			}else if(StringUtils.startsWithIgnoreCase(bpType, "Ad")) {
				tariffCategory ="0930";
			}
		}
		//get from TARIFTYP 
		String tariffType= res.getTariff();
		if(StringUtils.isBlank(tariffCategory) && StringUtils.isNotBlank(tariffType)) {
			tariffType = tariffType.replace("HT_", "");
			if(StringUtils.startsWithIgnoreCase(tariffType, "DO")) {
				tariffCategory  ="0100";
			}else if(StringUtils.startsWithIgnoreCase(tariffType, "N")) {
				tariffCategory ="0290";
			}else if(StringUtils.startsWithIgnoreCase(tariffType, "I")) {
				tariffCategory ="0320";
			}else if(StringUtils.startsWithIgnoreCase(tariffType, "Ag")) {
					tariffCategory ="0250";
			}else if(StringUtils.startsWithIgnoreCase(tariffType, "M")) {
				tariffCategory ="0280";
			}else if(StringUtils.startsWithIgnoreCase(tariffType, "P")) {
				tariffCategory ="0600";
			}else if(StringUtils.startsWithIgnoreCase(tariffType, "C") || StringUtils.startsWithIgnoreCase(tariffType, "E")) {
				tariffCategory ="0700";
			}else if(StringUtils.startsWithIgnoreCase(tariffType, "DJ")) {
				tariffCategory ="0800";
			}else if(StringUtils.startsWithIgnoreCase(tariffType, "DI")) {
				tariffCategory ="0900";
			}else if(StringUtils.startsWithIgnoreCase(tariffType, "DM")) {
				tariffCategory ="0910";
			}else if(StringUtils.startsWithIgnoreCase(tariffType, "Ra")) {
				tariffCategory ="0920";
			}else if(StringUtils.startsWithIgnoreCase(tariffType, "Adv")) {
				tariffCategory ="0930";
			}
		}
	
		return tariffCategory;
	}


	private String getConnectionRequestJSON(ConnectionRequest connectionRequest) {
		String json ="";
		JSONSerializer jsonSerializer = JSONFactoryUtil.createJSONSerializer();
		json = jsonSerializer.serialize(connectionRequest);
		System.out.println("ResultingJSONstring = " + json);
		
		return json;
	}
	
	public ConnectionRequest convertToConnectionRequest(String jsonString) {
		if(StringUtils.isBlank(jsonString)) {
			return null;
		}
		
		try {
			JSONDeserializer<ConnectionRequestImpl> jsonDeserializer = JSONFactoryUtil.createJSONDeserializer();
			return jsonDeserializer.deserialize(jsonString,ConnectionRequestImpl.class);
		}catch(Exception e) {
			LOGGER.error(e);
		}
		
		return null;
	}
/*
	private String getConsumerType(String consumerType) {
		System.out.println("consumerType >>  "+consumerType);
		if(StringUtils.equalsIgnoreCase(consumerType, "Normal")) {
			return "Individual";
		}
		return "Firm";
	}
	*/
	private String getConsumerType(String consumerName) {
		if(StringUtils.startsWithIgnoreCase(consumerName, "M/S")) {
			return  "Firm";
		}
		return "Individual";
	}

	private void setDefaultNewAttributes(ConnectionRequest connectionRequest) {
		//connectionRequest.setTitle("0002");
		connectionRequest.setWiringTest(true);
		//connectionRequest.setElcbInstalled(true);
		//connectionRequest.setConsumerType("Individual");
		//connectionRequest.setTariffCategory("0100");
		connectionRequest.setStiltParking(false);
		//connectionRequest.setHeight15Mtr(true);
		//connectionRequest.setHeight17Mtr(false);
		connectionRequest.setHasBdoCertificate(false);
		connectionRequest.setSonDaughterWife("S");
		//connectionRequest.setEServiceOnMail(true);
	}

	public String updateConsumerDetails(String requestNo, Map<String, String> params) {
		LOGGER.info(params);
		return updateConnectionRequest(requestNo, params, PREFIX_CONSUMER);
	}

	public String updateConsumerDetails(long connectionRequestId, Map<String, String> params) {
		LOGGER.info(params);
		return updateConnectionRequest(connectionRequestId, params, PREFIX_CONSUMER);
	}

	public String updateAddress(String requestNo, Map<String, String> params) {
		LOGGER.info(params);
		return updateConnectionRequest(requestNo, params, PREFIX_ADDRESS);
	}

	public String updateAddress(long connectionRequestId, Map<String, String> params) {
		LOGGER.info(params);
		return updateConnectionRequest(connectionRequestId, params, PREFIX_ADDRESS);
	}

	public String updateConnection(String requestNo, Map<String, String> params) {
		LOGGER.info(params);
		return updateConnectionRequest(requestNo, params, PREFIX_CONNECTION);
	}

	public String updateConnection(long connectionRequestId, Map<String, String> params) {
		LOGGER.info(params);
		return updateConnectionRequest(connectionRequestId, params, PREFIX_CONNECTION);
	}

	public String updateChecklistDocuments(String requestNo, Map<String, String> params) {
		LOGGER.info(params);
		return updateConnectionRequest(requestNo, params, PREFIX_CHECKLIST);
	}

	public String updateChecklistDocuments(long connectionRequestId, Map<String, String> params) {
		LOGGER.info(params);
		return updateConnectionRequest(connectionRequestId, params, PREFIX_CHECKLIST);
	}

	public String updateImportantDocuments(String requestNo, Map<String, String> params) {
		LOGGER.info(params);
		return updateConnectionRequest(requestNo, params, PREFIX_DOCUMENT);
	}

	public String updateImportantDocuments(long connectionRequestId, Map<String, String> params) {
		LOGGER.info(params);
		return updateConnectionRequest(connectionRequestId, params, PREFIX_DOCUMENT);
	}

	public ConnectionRequest getConnectionRequest(String requestNo) {
		try {
			return connectionRequestPersistence.findByRequestNo(requestNo).get(0);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	public ConnectionRequest getConnectionRequestByMobileNoAndRequestNo(String mobileNo, String requestNo) {
		try {
			return connectionRequestPersistence.findByMobileNoAndRequestNo(mobileNo, requestNo).get(0);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	public List<ConnectionRequest> getConnectionRequestsByMobileNo(String mobileNo) {
		List<ConnectionRequest> connectionRequests = new ArrayList();
		try {
			connectionRequests = connectionRequestPersistence.findByMobileNo(mobileNo);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

		return connectionRequests;
	}
	
	public List<ConnectionRequest> getConnectionRequestsByMobileNoAndRequestStatus(String mobileNo, String requestStatus) {
		List<ConnectionRequest> connectionRequests = new ArrayList();
		try {
			connectionRequests = connectionRequestPersistence.findByMobileNoAndRequestStatus(mobileNo, requestStatus);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

		return connectionRequests;
	}
	

	public String updateConnectionRequest(String requestNo, Map<String, String> params, String sectionPrefix) {
		try {
			ConnectionRequest connectionRequest = getConnectionRequest(requestNo);
			setAttributes(connectionRequest, params, sectionPrefix);
			connectionRequestPersistence.update(connectionRequest);
			return "success";
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return "failure";
	}

	public String updateConnectionRequest(long connectionRequestId, Map<String, String> params, String sectionPrefix) {
		try {
			ConnectionRequest connectionRequest = getConnectionRequest(connectionRequestId);
			String status = connectionRequest.getRequestStatus();
			if(!StringUtils.equalsIgnoreCase(status, "Order generated")) {
				setAttributes(connectionRequest, params, sectionPrefix);
				connectionRequestPersistence.update(connectionRequest);
				return "success";
			}
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return "failure";
	}

	public String submitNewRequestToSoap(long connectionRequestId) {
		try {
			ConnectionRequest connectionRequest= connectionRequestPersistence.findByPrimaryKey(connectionRequestId);
			
			if(StringUtils.equalsIgnoreCase(connectionRequest.getSapOrderGenerated(),"Y")) {
				return "Error: Request already submitted";
			}
			String serviceOrder=DigitalSevaKendraServiceHelper.submitNewRequest(connectionRequest);
			LOGGER.info("Service Order generated : "+serviceOrder);
			if(StringUtils.isBlank(serviceOrder)) {
				LOGGER.info("ServiceOrder is empty from SAP, record deleted from DSS_NEW_CON_REQUEST for req no - "
						+ connectionRequest.getRequestNo());
			}else if(serviceOrder.contains("Error")) {
				return serviceOrder;
			}else {
				connectionRequest.setOrderNo(serviceOrder);
				connectionRequest.setSapOrderGenerated("Y");
				connectionRequest.setRequestStatus(RequestTypeModeStatus.STATUS_ORDER_GENERATED);
				connectionRequestPersistence.update(connectionRequest);
				return "success";
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return "failure";
	}
	
	public String submitChangeRequestToSoap(long connectionRequestId) {
		try {
			ConnectionRequest connectionRequest= connectionRequestPersistence.findByPrimaryKey(connectionRequestId);
			if(StringUtils.equalsIgnoreCase(connectionRequest.getSapOrderGenerated(),"Y")) {
				return "Error: Request already submitted";
			}
			
			//This line is commented to skip service call for mock testing
			CmsISUCADisplayResponse cmsResponse = null;
			
			try{
				String caNumberTD= generateTwelveDigitCANo(connectionRequest.getCaNumber());
				cmsResponse = sapService.getCmsISUCADisplay(caNumberTD);//
			}catch(Exception e) {}
			String serviceOrder=DigitalSevaKendraServiceHelper.submitChangeRequest(connectionRequest,cmsResponse);//addNewConnectionRequestDetailSoapCall(connectionRequest);
			LOGGER.info("Service Order generated : "+serviceOrder);
			if(StringUtils.isBlank(serviceOrder)) {
				LOGGER.info("ServiceOrder is empty from SAP, record deleted from DSS_NEW_CON_REQUEST for req no - "
						+ connectionRequest.getRequestNo());
			}else if(serviceOrder.contains("Error")) {
				return serviceOrder;
			}else {
				connectionRequest.setOrderNo(serviceOrder);
				connectionRequest.setSapOrderGenerated("Y");
				connectionRequest.setRequestStatus(RequestTypeModeStatus.STATUS_ORDER_GENERATED);
				connectionRequestPersistence.update(connectionRequest);
				return "success";
			}
			
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return "failure";
	}

	private ConnectionRequest toConnectionRequest(ConnectionRequest source) {
		ResourceBundle bundle = getResourceBundle();

		if (bundle == null) {
			LOGGER.error("Error: Bundle is null..");
			return null;
		}

		ConnectionRequest target = connectionRequestPersistence.create(0);
		Enumeration<String> enumBundle = bundle.getKeys();
		while (enumBundle.hasMoreElements()) {
			String prefix = "";
			String key = enumBundle.nextElement();

			if (key.startsWith(PREFIX_CONSUMER + ".")) {
				prefix = PREFIX_CONSUMER;
			} else if (key.startsWith(PREFIX_ADDRESS + ".")) {
				prefix = PREFIX_ADDRESS;
			} else if (key.startsWith(PREFIX_CONNECTION + ".")) {
				prefix = PREFIX_CONNECTION;
			} else if (key.startsWith(PREFIX_CHECKLIST + ".")) {
				prefix = PREFIX_CHECKLIST;
			} else if (key.startsWith(PREFIX_DOCUMENT + ".")) {
				prefix = PREFIX_DOCUMENT;
			}
			String targetKey = key;
			if (StringUtils.isNotBlank(prefix) && key.startsWith(prefix + ".")) {
				targetKey = key.substring((prefix + ".").length());
			}

			String sourceKey = bundle.getString(key);
			LOGGER.error("Processing sourceKey=[" + targetKey + "], targetKey=[" + targetKey + "]");
			if (StringUtils.isBlank(sourceKey)) {
				continue;
			}
			copyAttribute(source, target, sourceKey, targetKey);
		}
		return target;
	}

	private void copyAttribute(ConnectionRequest source, ConnectionRequest target, String sourceKey, String targetKey) {
		Object sourceValue = getAttribute(source, sourceKey);
		setAttribute(target, targetKey, String.valueOf(sourceValue));
	}

	private void setAttributes(ConnectionRequest obj, Map<String, String> params, String attrPrefix) {

		ResourceBundle bundle = getResourceBundle();

		if (bundle == null) {
			LOGGER.error("Error: Bundle is null..");
			return;
		}

		String namespace = params.get("namespace");
		//System.out.println("Namespace ---" + namespace);
		// String formName=params.get("formName");
		for (Map.Entry<String, String> entry : params.entrySet()) {
			String sourceKey = entry.getKey();
			
			if("namespace".equalsIgnoreCase(sourceKey) || sourceKey.endsWith("_formDate")) {
				continue;
			}
			
		//	System.out.println("source key ..." + sourceKey);
			if (sourceKey.contains(namespace)) {
				sourceKey = sourceKey.substring((namespace).length());
			}
			// sourceKey = attrPrefix + "." + sourceKey;
			//System.out.println("source key updated ..." + sourceKey);

			String targetKey = null;
			try {
				targetKey = bundle.getString(attrPrefix + "." + sourceKey);

			} catch (Exception e) {

				LOGGER.debug("Error - "+e.getMessage());
			}
			LOGGER.debug("Processing sourceKey=[" + sourceKey + "], targetKey=[" + targetKey + "] and value=["
					+ entry.getValue() + "]");

			if (StringUtils.isBlank(targetKey)) {
				if (StringUtils.isBlank(entry.getValue())) {
					continue;
				} else {
					targetKey = sourceKey;
				}
			}
			setAttribute(obj, targetKey, entry.getValue());
		}
	}

	private ResourceBundle getResourceBundle() {
		ResourceBundle bundle = null;
		try {
			bundle = ResourceBundle.getBundle("META-INF/config/field-mapping", Locale.getDefault(), getClassLoader());
		} catch (Exception ex) {
			LOGGER.error(ex.getMessage());
		}

		return bundle;
	}

	/*
	 * private void setAttribute(ConnectionRequest obj, String name, String value) {
	 * Method methodSet=null; try {
	 * methodSet=getSetterMethod(ConnectionRequest.class, name, new Class[]
	 * {String.class}); methodSet.invoke(obj, value); } catch (Exception e) {
	 * LOGGER.error("Error in setAttribute for [DssNewConnRequest."+name
	 * +"] to value ["+value+"]"); LOGGER.error(e); } }
	 */

	private void setAttribute(ConnectionRequest obj, String name, String value) {
		try {
			LOGGER.debug("SettingAttribute  - "+value+" - for "+name);
			Method methodGet = getGetterMethod(ConnectionRequest.class, StringUtils.trim(name));
			LOGGER.debug(methodGet.getReturnType()+" - "+value+" - for "+name);
			Method methodSet = getSetterMethod(ConnectionRequest.class, StringUtils.trim(name), new Class[] { methodGet.getReturnType() });
			if(methodGet.getReturnType()==int.class) {
				methodSet.invoke(obj, Integer.parseInt(value));
			}else if(methodGet.getReturnType()==long.class) {
				methodSet.invoke(obj, Long.parseLong(value));
			}else if(methodGet.getReturnType()==float.class) {
				methodSet.invoke(obj, Float.parseFloat(value));
			}else if(methodGet.getReturnType()==double.class) {
				methodSet.invoke(obj, Double.parseDouble(value));
			}else if(methodGet.getReturnType()==boolean.class) {
				boolean boolValue="1".equals(value)|| "y".equalsIgnoreCase(value) || "yes".equalsIgnoreCase(value) || "true".equalsIgnoreCase(value);
				methodSet.invoke(obj, boolValue);
			}else if(methodGet.getReturnType()==Date.class) {
				methodSet.invoke(obj, getSourceDateFormat().parse(value));
			}else {
				methodSet.invoke(obj, value);
			}
		} catch (Exception e) {
			//LOGGER.error(e);
			LOGGER.debug("Error in setAttribute for [ConnectionRequest." + name + "] to value [" + value + "]");

		}
	}

	/*
	 * private Object getAttribute(ConnectionRequest obj, String name) { Method
	 * methodGet=null; try { methodGet=getGetterMethod(ConnectionRequest.class,
	 * name); return methodGet.invoke(obj); } catch (Exception e) {
	 * LOGGER.error("Error in getAttribute for [DssNewConnRequest."+name +"]");
	 * LOGGER.error(e); } return null; }
	 */

	private Object getAttribute(ConnectionRequest obj, String name) {
		Method methodGet = null;
		try {
			methodGet = getGetterMethod(ConnectionRequest.class, StringUtils.trim(name));
			return methodGet.invoke(obj);
		} catch (Exception e) {
			LOGGER.error("Error in getAttribute for [ConnectionRequest." + name + "]");

		}
		return null;
	}

	private Method getSetterMethod(Class clazz, String name, Class[] paramTypes) {
		try {
			return clazz.getMethod("set" + StringUtils.capitalize(StringUtils.trim(name)), paramTypes);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	private Method getGetterMethod(Class clazz, String name) {
		try {
			return clazz.getMethod("get" + StringUtils.capitalize(StringUtils.trim(name)));
		} catch (Exception e) {
			LOGGER.debug("Error- "+e.getMessage());
		}
		return null;
	}

	public boolean getEmailAndSendOTPNEW(String emailId, ThemeDisplay themeDisplay) {
		String siteName = "";
		try {
			siteName = themeDisplay.getScopeGroupName();
		} catch (Exception e) {
			LOGGER.error(e);
		}
		String otp = "";
		boolean showOTP = false;
		boolean ismailSent = false;
		if (showOTP) {
			StringBuffer body = new StringBuffer();

			body.append("<p>Dear Customer, </p>");
			body.append("<p>Your One Time Password for New Connection is " + otp
					+ ". Do not share this OTP to anyone for security reasons. BRPL shall not be responsible for any misuse</p>");
			body.append("<br/>");
			body.append("<br/>");
			body.append("<p>Thanks & Regards</p>");
			body.append("<p>BSES Power Limited.</p>");

			String mailBody = body.toString();
			ismailSent = sendEmail(FORM_EMAIL_ID, emailId, SUBJECT, mailBody);
			// ismailSent = true;
			// _log.info("emailId--------"+emailId);
			if (ismailSent == true) {
				return true;
			}
		}
		return false;
	}

	private boolean sendEmail(String from, String to, String subject, String body) {

		MailMessage mailMessage = new MailMessage();
		try {
			mailMessage.setTo(new InternetAddress(to));
			mailMessage.setFrom(new InternetAddress(from));
			mailMessage.setSubject(subject);
			mailMessage.setBody(body);
			mailMessage.setHTMLFormat(true);
			// File Attachement

			MailServiceUtil.sendEmail(mailMessage);

			return true;
		} catch (Exception e) {
			LOGGER.error(e);
		}
		return false;
	}
	private static DateFormat getSourceDateFormat() {
		if(dateFormat==null) {
			dateFormat=new SimpleDateFormat(PropsUtil.get("source.date.format"));
		}
		return dateFormat;
	}
	
	public ConnectionRequest deleteByConnectionRequestId(long connectionRequestId) throws NoSuchConnectionRequestException {
		ConnectionRequest connectionRequest=connectionRequestPersistence.findByPrimaryKey(connectionRequestId);
		deleteConnectionRequestAndDocuments(connectionRequest);
		return connectionRequest;
	}
	
	private boolean deleteConnectionRequestAndDocuments(ConnectionRequest connectionRequest) {
		try {
			List<ConnectionDocument> documents=ConnectionDocumentLocalServiceUtil.getConnectionDocumentByConnectionRequestId(connectionRequest.getConnectionRequestId());
			for(ConnectionDocument d:documents) {
				ConnectionDocumentLocalServiceUtil.deleteConnectionDocument(d);
			}
			connectionRequestPersistence.remove(connectionRequest);
		}catch(Exception e) {
			LOGGER.error(e);
		}
		return true;
	}
	
	public int deleteStaleConnectionRequests(String mobileNo) {
		int retentionDays=RETENTION_DAYS;
		try {
			retentionDays=Integer.parseInt(PropsUtil.get("connection.request.draft.retention").trim());
		}catch(Exception e) {
			LOGGER.error(e.getMessage());
		}
		long retentionMills=retentionDays*24*60*60*1000;
		Calendar today=Calendar.getInstance();
		
		int deleted=0;
		List<ConnectionRequest> connectionRequests=connectionRequestPersistence.findByMobileNo(mobileNo);
		for(ConnectionRequest connectionRequest:connectionRequests) {
			if(today.getTimeInMillis()-connectionRequest.getModifiedDate().getTime()>=retentionMills) {
				deleteConnectionRequestAndDocuments(connectionRequest);
				deleted++;
			}
		}
		return deleted;
	}
	
	private String generateTwelveDigitCANo(String accNo) {
		String formattedNumber = StringPool.BLANK;
		if (Validator.isNotNull(accNo)) {
			formattedNumber = String.format("%012d", Long.valueOf(accNo));
			//log.debug("Formatted account number from  getValidAccountNumber method ::::::::  " + formattedNumber);
		}
		return formattedNumber;
	}
	
	public int getCountByMobileNoAndRequestStatus(String mobileNo, String requestStatus){
		return connectionRequestPersistence.countByMobileNoAndRequestStatus(mobileNo, requestStatus);
	}
	
	public int getMaxDraftCount() {
		int maxCount=5;
		try{
			maxCount=Integer.parseInt(PropsUtil.get("connection.request.draft.max.count").trim());
		}catch(Exception e){}
		return maxCount;
	}
	
	public int getCurrentDraftCount(String mobileNo) {
		return connectionRequestPersistence.countByMobileNoAndRequestStatus(mobileNo, RequestTypeModeStatus.STATUS_DRAFT);
	}
	
	public List<ConnectionRequest> getNewRequestsByMobileNo(String mobileNo) {
		List<ConnectionRequest> connectionRequests = new ArrayList();
		try {
			connectionRequests = connectionRequestPersistence.findByMobileNoAndChangeRequest(mobileNo, false);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

		return connectionRequests;
	}
	
	public int getNewRequestCount(String mobileNo) {
		return connectionRequestPersistence.countByMobileNoAndChangeRequest(mobileNo, false);
	}
	
	public List<ConnectionRequest> getChangeRequestsByMobileNo(String mobileNo) {
		List<ConnectionRequest> connectionRequests = new ArrayList();
		try {
			connectionRequests = connectionRequestPersistence.findByMobileNoAndChangeRequest(mobileNo, true);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

		return connectionRequests;
	}
	
	public int getChangeRequestCount(String mobileNo) {
		return connectionRequestPersistence.countByMobileNoAndChangeRequest(mobileNo, true);
	}
	
	public List<ConnectionRequest> getChangeRequestsByCaNumber(String caNumber) {
		List<ConnectionRequest> connectionRequests = new ArrayList();
		try {
			connectionRequests = connectionRequestPersistence.findByCaNumberAndChangeRequest(caNumber, true);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

		return connectionRequests;
	}
	
	public int getChangeRequestCountByCaNumber(String caNumber) {
		return connectionRequestPersistence.countByCaNumberAndChangeRequest(caNumber, true);
	}
	
	
	public JSONArray getAvailableTimeSlotsByDateAndDivision(Date appointmentDate, String appointmentDivision) {
		String serviceURL= PropsUtil.get("CA_DISPLAY_SERVICE_URL");
		
		if(StringUtils.isBlank(serviceURL)) {
			serviceURL = "http://125.22.84.50:7850/delhiv2/ISUService.asmx";
		}
		
		String actionURL = "http://tempuri.org/ZBAPI_CNTAPP_DETAILMOB";
		
		List<String> appointmentTimeSlots = new ArrayList<String>();
		String xmlString = "";
		SimpleDateFormat formattter = new SimpleDateFormat("dd.MM.yyyy");
		String timeSlots = "09:15:00,10:30:00,10:31:00,11:30:00,11:31:00,12:30:00,12:31:00,01:30:00,02:00:00,03:00:00";
		int slotsCount = timeSlots.split(",").length;
		StringBuilder reqXML = new StringBuilder();
		reqXML.append(
		"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
		.append("<soap:Body>")
		
		.append("<ZBAPI_CNTAPP_DETAILMOB xmlns=\"http://tempuri.org/\">")
		.append("<strOrderType>").append("ZDSS").append("</strOrderType>")
		.append("<strDiv>").append(appointmentDivision).append("</strDiv>")
		.append("<strApp_DT>").append(formattter.format(appointmentDate)).append("</strApp_DT>")
		.append("<strAPPTM>").append(timeSlots).append("</strAPPTM>")
		.append("<strCount>").append(StringPool.BLANK).append("</strCount>")
		.append("</ZBAPI_CNTAPP_DETAILMOB>")
		
		.append("</soap:Body>")
		.append("</soap:Envelope>");
		
		String requestXML = reqXML.toString();
		
		String resXML = DigitalSevaKendraServiceHelper.callService(requestXML,serviceURL,actionURL,"GET");
		//System.out.println("ZBAPI_CNTAPP_DETAILMOB >>> response >>>> ");
		//System.out.println(resXML);
		
	//	xmlString = DigitalSevaKendraServiceHelper.substringBetween(resXML, "</xs:schema>", "</ZBAPI_CNTAPP_DETAILMOBResult>");
		xmlString = DigitalSevaKendraServiceHelper.substringBetween(resXML, "<BAPI_RESULT", "</diffgr:diffgram>");
		
		if(StringUtils.isNotBlank(xmlString)) {
			xmlString="<BAPI_RESULT" +xmlString;
		}
		
		List<ItDataTableResponse> responseList = sapService.getCNT_APP_DETAIL_MOB2(xmlString, slotsCount);
		Map<String, String> mapTimeSlots=new LinkedHashMap<>();
		mapTimeSlots.put("09:15:00", "09:15 AM - 10:30 AM");
		mapTimeSlots.put("10:31:00", "10:31 AM - 11:30 AM");
		mapTimeSlots.put("11:31:00", "11:31 AM - 12:30 PM");
		mapTimeSlots.put("12:31:00", "12:31 PM - 01:30 PM");
		mapTimeSlots.put("02:00:00", "02:00 PM - 03:00 PM");
		
		JSONArray jsonArray=JSONFactoryUtil.createJSONArray();
		for (ItDataTableResponse res : responseList) {
			appointmentTimeSlots.add(res.getAppointTime());
			JSONObject jsonObj=JSONFactoryUtil.createJSONObject();
			jsonObj.put("slot", res.getAppointTime());
			jsonObj.put("time", mapTimeSlots.get(StringUtils.trim(res.getAppointTime())));
			jsonArray.put(jsonObj);
		}
		
		System.out.println("appointmentTimeSlots >> "+appointmentTimeSlots);
		return jsonArray;
	}

	
	public JSONArray getDivisionWiseAvailableSlotsByDate(Date appointmentDate) {
		String serviceURL= PropsUtil.get("CA_DISPLAY_SERVICE_URL");//"http://125.22.84.50:7850/delhiv2/ISUService.asmx";
		
		if(StringUtils.isBlank(serviceURL)) {
			serviceURL = "http://125.22.84.50:7850/delhiv2/ISUService.asmx";
		}
		String actionURL = "http://tempuri.org/ZBAPI_CNTAPP_INTRADSK";
		
		List<String> appointmentTimeSlots = new ArrayList<String>();
		String xmlString = "";
		SimpleDateFormat formattter = new SimpleDateFormat("dd.MM.yyyy");
		//String timeSlots = "09:15:00,10:30:00,10:31:00,11:30:00,11:31:00,12:30:00,12:31:00,01:30:00,02:00:00,03:00:00";
		//int slotsCount = timeSlots.split(",").length;
		StringBuilder reqXML = new StringBuilder();
		reqXML.append(
		"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
		.append("<soap:Body>")
		
		.append("<ZBAPI_CNTAPP_INTRADSK xmlns=\"http://tempuri.org/\">")
		.append("<strApp_DT>").append(formattter.format(appointmentDate)).append("</strApp_DT>")
		.append("</ZBAPI_CNTAPP_INTRADSK>")
		
		.append("</soap:Body>")
		.append("</soap:Envelope>");
		
		String requestXML = reqXML.toString();
		
		String resXML = DigitalSevaKendraServiceHelper.callService(requestXML,serviceURL,actionURL,HttpMethods.POST);
		//System.out.println("ZBAPI_CNTAPP_DETAILMOB >>> response >>>> ");
		//System.out.println(resXML);
		
	//	xmlString = DigitalSevaKendraServiceHelper.substringBetween(resXML, "</xs:schema>", "</ZBAPI_CNTAPP_DETAILMOBResult>");
		xmlString = DigitalSevaKendraServiceHelper.substringBetween(resXML, "<BAPI_RESULT", "</diffgr:diffgram>");
		
		if(StringUtils.isNotBlank(xmlString)) {
			xmlString="<BAPI_RESULT" +xmlString;
		}
		
		List<ItDataTableResponse> responseList = sapService.getZBAPI_CNTAPP_INTRADSK(xmlString);
		
		JSONArray jsonArray=JSONFactoryUtil.createJSONArray();
		for (ItDataTableResponse res : responseList) {
			appointmentTimeSlots.add(res.getAppointTime());
			JSONObject jsonObj=JSONFactoryUtil.createJSONObject();
			jsonObj.put("slot", res.getAppointTime());
			jsonArray.put(jsonObj);
		}
		
		System.out.println("getDivisionWiseAvailableSlotsByDate >> "+appointmentTimeSlots);
		return jsonArray;
	}
	
	public String getChangeRequestSubType(ConnectionRequest connectionRequest) {
		String requestSubType=StringPool.BLANK;
		
		if(StringUtils.equalsIgnoreCase(connectionRequest.getRequestType(), RequestTypeModeStatus.TYPE_LOAD_CHANGE) ) {
			requestSubType = connectionRequest.getChangeRequestType();
		}else  if(StringUtils.equalsIgnoreCase(connectionRequest.getRequestType(), RequestTypeModeStatus.TYPE_CATEGORY_CHANGE)){
			requestSubType=RequestTypeModeStatus.TYPE_CATEGORY_CHANGE_LTH;		
			ConnectionRequest oldObject = convertToConnectionRequest(connectionRequest.getOldData());
			int newOrder=RequestTypeModeStatus.getTariffCategoryOrder(connectionRequest.getTariffCategory());
			int oldOrder=RequestTypeModeStatus.getTariffCategoryOrder(oldObject.getTariffCategory());
					
			if(newOrder < oldOrder) {
				requestSubType=RequestTypeModeStatus.TYPE_CATEGORY_CHANGE_HTL;
			}
		}
		return requestSubType;
	}
	/*
	public String getChangeRequestSubType(ConnectionRequest connectionRequest) {
		String requestSubType=StringPool.BLANK;
		if(StringUtils.isNotBlank(connectionRequest.getOldData()) && (StringUtils.equals(connectionRequest.getRequestType(), RequestTypeModeStatus.TYPE_LOAD_CHANGE) || StringUtils.equals(connectionRequest.getRequestType(), RequestTypeModeStatus.TYPE_CATEGORY_CHANGE))){
			ConnectionRequest oldObject = convertToConnectionRequest(connectionRequest.getOldData());
			if(oldObject!=null) {
				if(StringUtils.equalsIgnoreCase(connectionRequest.getRequestType(), RequestTypeModeStatus.TYPE_LOAD_CHANGE)){
					requestSubType = connectionRequest.getChangeRequestType();
					if(!(StringUtils.equalsIgnoreCase(requestSubType, RequestTypeModeStatus.TYPE_LOAD_INCREASE) 
							|| StringUtils.equalsIgnoreCase(requestSubType, RequestTypeModeStatus.TYPE_LOAD_DECREASE) )) {
						if(connectionRequest.getLoadKw() > oldObject.getLoadKw()) {
							requestSubType=RequestTypeModeStatus.TYPE_LOAD_INCREASE;
						}else if(connectionRequest.getLoadKw() < oldObject.getLoadKw()) {
							requestSubType=RequestTypeModeStatus.TYPE_LOAD_DECREASE;
						}
					}
				}else if(StringUtils.equalsIgnoreCase(connectionRequest.getRequestType(), RequestTypeModeStatus.TYPE_CATEGORY_CHANGE)){
					int newOrder=RequestTypeModeStatus.getTariffCategoryOrder(connectionRequest.getTariffCategory());
					int oldOrder=RequestTypeModeStatus.getTariffCategoryOrder(oldObject.getTariffCategory());
					
					if(newOrder > oldOrder) {
						requestSubType=RequestTypeModeStatus.TYPE_CATEGORY_CHANGE_LTH;
					}else if(newOrder < oldOrder) {
						requestSubType=RequestTypeModeStatus.TYPE_CATEGORY_CHANGE_HTL;
					}
				}
			}
		}
		return requestSubType;
	}
	*/
}
