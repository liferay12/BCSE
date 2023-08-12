package com.bses2.sap.connector.services.util;

import com.bses2.sap.constant.BsesSapConnectorServiceConstant;
import com.liferay.portal.kernel.util.StringPool;

public class BsesSapConnectorServiceUtil {
	/**
	 * @author Deval Mehta
	 * @param xmlString
	 * @return DskAddUpdateConnectionResponse
	 * @Purpose For replacing the unwanted attributes for Z_BAPI_ZDSS_WEB_LINK Web Service
	 */
	public static String replaceLogicForAddUpdateConnection(String xmlString) {
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_OPEN_TAG, StringPool.BLANK);
		xmlString = xmlString.replace("diffgr:id=\"ISUSTDTable1\" msdata:rowOrder=\"0\" diffgr:hasChanges=\"inserted\"",
				"");
		//xmlString = xmlString.replace("<BAPI_RESULT xmlns=\"\">", "").replace("</BAPI_RESULT>", "");
		xmlString = xmlString.replace("<BAPI_RESULT", "").replace("</BAPI_RESULT>", "");
		
		xmlString = xmlString.replace(BsesSapConnectorServiceConstant.DIFFR_END_TAG, StringPool.BLANK);

		return xmlString;
	}

}
