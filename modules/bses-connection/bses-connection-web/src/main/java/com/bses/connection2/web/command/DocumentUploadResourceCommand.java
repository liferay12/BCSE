package com.bses.connection2.web.command;

import com.bses.connection2.model.ConnectionDocument;
import com.bses.connection2.service.ConnectionDocumentLocalServiceUtil;
import com.bses.connection2.web.constants.BsesConnectionPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.File;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	     property = {
	        "javax.portlet.name="+ BsesConnectionPortletKeys.BsesConnection,
	        "mvc.command.name=/document/upload"
	     },
	     service = MVCResourceCommand.class
	  )
public class DocumentUploadResourceCommand implements MVCResourceCommand {
	private static final Log LOGGER=LogFactoryUtil.getLog(DocumentUploadResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws PortletException {
     	UploadPortletRequest uploadRequest   =  PortalUtil.getUploadPortletRequest(resourceRequest);
     	//String fileElementName=uploadRequest.getParameter(resourceResponse.getNamespace()+"elementName");
     	//String filePath=uploadRequest.getParameter(fileElementName+"_path");
     	File sourceFile=uploadRequest.getFile("file");
        long connectionRequestId=ParamUtil.getLong(uploadRequest, "connectionRequestId",0);
        long connectionDocumentId=ParamUtil.getLong(uploadRequest, "connectionDocumentId",0);
        String documentType=ParamUtil.getString(uploadRequest, "documentType");
        String documentName=ParamUtil.getString(uploadRequest, "documentName");
        String clientFileName=ParamUtil.getString(uploadRequest, "name");

        ConnectionDocument connectionDocument=null;
        String message=documentName+" was uploaded successfully";
        String status="success";
        
		try {
			connectionDocument = ConnectionDocumentLocalServiceUtil.updateConnectionDocument(connectionDocumentId, connectionRequestId, documentType, documentName, clientFileName, sourceFile);
		} catch (PortalException e) {
			LOGGER.error(documentName+" could not be uploaded. Error: "+e.getMessage());
			message=documentName+" could not be uploaded.";
			status="failure";
		}
		
		LOGGER.info("connectionRequestId=["+connectionRequestId+"], connectionDocumentId=["+connectionDocumentId+"], documentType=["+documentType+"], documentName=["+documentName+"], message=["+message+"], status=["+status+"]");
		
		JSONObject result=JSONFactoryUtil.createJSONObject();
		result.put("status", status);
		result.put("message", message);
		if(connectionDocument!=null) {
			result.put("connectionDocumentId", connectionDocument.getConnectionDocumentId());
			//result.put("documentPath", connectionDocument.getDocumentPath());
			result.put("clientFileName", connectionDocument.getClientFileName());
		}

		try {
			PrintWriter writer = resourceResponse.getWriter();
			writer.write(result.toJSONString());
			writer.close();
		} catch (Exception e) {
			LOGGER.info(e);
		}
     	return false;
	}
}
