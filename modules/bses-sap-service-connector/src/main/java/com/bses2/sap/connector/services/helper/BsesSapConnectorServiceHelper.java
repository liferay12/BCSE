package com.bses2.sap.connector.services.helper;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.bses2.sap.connector.services.BsesJAXBConnector;
import com.bses2.sap.connector.services.util.BsesSapConnectorServiceUtil;
import com.bses2.sap.constant.BsesSapConnectorServiceConstant;
import com.bses2.sap.model.DskAddUpdateConnectionResponse;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

public class BsesSapConnectorServiceHelper {
	
	private static final Log LOG = LogFactoryUtil.getLog(BsesSapConnectorServiceHelper.class);

	/**
	 * @author Deval Mehta
	 * @param xmlString
	 * @return DskAddUpdateConnectionResponse
	 */
	public static DskAddUpdateConnectionResponse getResponseForAddUpdateConnection(String xmlString,
			DskAddUpdateConnectionResponse dskAddUpdateConnectionResponse) {
		InputStream is =null;
		try {
			if (Validator.isNotNull(xmlString)) {
				if (xmlString.contains(BsesSapConnectorServiceConstant.ISU_DISPALY_DATA_CONSTANT)) {
					xmlString = BsesSapConnectorServiceUtil.replaceLogicForAddUpdateConnection(xmlString);
					is = new ByteArrayInputStream(xmlString.getBytes());
					/*
					 * Implementation changed to Singleton by Liferay to avoid creation of Objects
					 */
					//JAXBContext jc = JAXBContext.newInstance(DskAddUpdateConnectionResponse.class);
					JAXBContext jc = BsesJAXBConnector.getJAXBInstance(DskAddUpdateConnectionResponse.class);
					
					Unmarshaller unmarshaller = jc.createUnmarshaller();
					dskAddUpdateConnectionResponse = (DskAddUpdateConnectionResponse) unmarshaller
							.unmarshal(is);
				} else if (xmlString.contains(BsesSapConnectorServiceConstant.ISU_DISPALY_ERROR_CONSTANT)) {
					DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder dBuilder;
					dBuilder = dbFactory.newDocumentBuilder();
					is = new ByteArrayInputStream(xmlString.getBytes());
					Document doc = dBuilder.parse(is);
					doc.getDocumentElement().normalize();
					NodeList msgList = doc
							.getElementsByTagName(BsesSapConnectorServiceConstant.ISU_DISPALY_ERROR_CONSTANT);
					if (msgList != null) {
						Node nNode = msgList.item(0);
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {
							Element eElement = (Element) nNode;
							String message = eElement.getElementsByTagName(BsesSapConnectorServiceConstant.MESSAGE)
									.item(0).getTextContent();
							dskAddUpdateConnectionResponse.setMessage(message);
							dskAddUpdateConnectionResponse.setFlag(true);
						}
					}

				}
			}
		} catch (Exception e) {
			LOG.error(BsesSapConnectorServiceConstant.ERROR_MSG + " " + e);
		} finally {
			if (Validator.isNotNull(is)) {
				try {
					is.close();
				} catch (IOException e) {
				}
			}
		}
		return dskAddUpdateConnectionResponse;
	}


}
