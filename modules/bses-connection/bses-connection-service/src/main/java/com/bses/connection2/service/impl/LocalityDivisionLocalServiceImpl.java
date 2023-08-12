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

import com.bses.connection2.model.LocalityDivision;
import com.bses.connection2.model.impl.LocalityDivisionImpl;
import com.bses.connection2.service.base.LocalityDivisionLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * The implementation of the locality division local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.bses.connection2.service.LocalityDivisionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LocalityDivisionLocalServiceBaseImpl
 * @see com.bses.connection2.service.LocalityDivisionLocalServiceUtil
 */
public class LocalityDivisionLocalServiceImpl extends LocalityDivisionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.bses.connection2.service.LocalityDivisionLocalServiceUtil} to access the
	 * locality division local service.
	 */
	private static final Log LOGGER = LogFactoryUtil.getLog(LocalityDivisionLocalServiceImpl.class);

	
	
	public List<LocalityDivision> searchLocalityDivision(String area) {
		Session session = null;
		try {
			session = localityDivisionPersistence.openSession();
			String queryString = "SELECT * FROM bsesconn_localitydivision L WHERE L.localityName LIKE '%"+area+"%'";
			//LOGGER.info(queryString);
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			//LOGGER.info("Sql Query :: " + queryString);
			sqlQuery.addEntity("AttendenceTransaction", LocalityDivisionImpl.class);
			//QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			return (List<LocalityDivision>) sqlQuery.list();

		} catch (Exception e) {
			LOGGER.error("exception in BRPLLocalityMasterFinderImpl" + e.getMessage());
		} finally {
			localityDivisionPersistence.closeSession(session);
		}
		return null;
	}
	
	
	public LocalityDivision getLocalityDivisionByDivisionCode(String divisionCode) {
		try {
			return localityDivisionPersistence.findByDivisionCode(divisionCode).get(0);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	public JSONArray getAvailableDivisionSlots(Date appointmentDate) {

		DateFormat dateFormat=new SimpleDateFormat("dd.MM.yyyy");
		StringBuilder reqXML = new StringBuilder();
		reqXML.append(
				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema/\" 	xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">")
				.append("<soap:Body>").append("<ZBAPI_CNTAPP_INTRADSK xmlns=\"http://tempuri.org/\">")
				.append("<strApp_DT>").append(dateFormat.format(appointmentDate)).append("</strApp_DT>").append("</ZBAPI_CNTAPP_INTRADSK>")
				.append("</soap:Body>").append("</soap:Envelope>");
		String requestXML = reqXML.toString();
		String wsURL= PropsUtil.get("CA_DISPLAY_SERVICE_URL");
		
		if(StringUtils.isBlank(wsURL)) {
			wsURL = "http://125.22.84.50:7850/delhiv2/ISUService.asmx";
		}

		String responseString = StringPool.BLANK;
		StringBuffer outputSb = new StringBuffer();
		System.out.println("SoapCallFromJava.GetDiv()" + wsURL);
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
				String SOAPAction = "http://tempuri.org/ZBAPI_CNTAPP_INTRADSK";
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
				System.out.println("Error occured while calling ZBAPI_CNTAPP_INTRADSK with JAVA API : " + e);
			} finally {
				if (Validator.isNotNull(isr)) {
					try {
						isr.close();
					} catch (IOException e) {
						System.out.println(e);
					}
				}
			}
		}
		// System.out.println(outputSb.toString());
		String xmlString = outputSb.toString();
		
		System.out.println("Service Response >> "+xmlString);
		
		Map<String, String> masterList = new HashMap<>();
		JSONArray jsonarray = JSONFactoryUtil.createJSONArray();
		if (xmlString.contains("IT_DATA_TABLE1")) {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			InputStream is = null;
			try {
				dBuilder = dbFactory.newDocumentBuilder();
				is = new ByteArrayInputStream(xmlString.getBytes());
				Document doc = dBuilder.parse(is);
				doc.getDocumentElement().normalize();

				NodeList msgList = doc.getElementsByTagName("IT_DATA_TABLE1");
				if (msgList != null) {
					System.out.println("msgList---------"+msgList.getLength());

					for (int i = 0; i < msgList.getLength(); i++) {

						String district = doc.getElementsByTagName("NAME").item(i).getTextContent();
						String address = doc.getElementsByTagName("SK_ADDRESS_P2").item(i).getTextContent();
						String slotCount = doc.getElementsByTagName("SLOT_COUNT").item(i).getTextContent();
						String districtCode = doc.getElementsByTagName("DISTRICT").item(i).getTextContent();

						JSONObject jsonobj = JSONFactoryUtil.createJSONObject();
						jsonobj.put("district", district);
						jsonobj.put("address", address);
						jsonobj.put("slotCount", slotCount);
						jsonobj.put("districtCode", districtCode);
						jsonarray.put(jsonobj);
					}
					// System.out.println("masterList---------"+masterList);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("jsonarray.length()"+jsonarray.length());
		
		return jsonarray;
	}
}