package com.bses.connection2.web.command;

import com.bses.connection2.model.ConnectionDocument;
import com.bses.connection2.service.ConnectionDocumentLocalServiceUtil;
import com.bses.connection2.web.constants.BsesConnectionPortletKeys;
import com.bses.connection2.web.portlet.BsesConnectionPortlet;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
@Component(
	     property = {
	    	"javax.portlet.name="+ BsesConnectionPortletKeys.BsesConnection,
	        "mvc.command.name=/document/download"
	     },
	     service = MVCResourceCommand.class
	  )
public class DocumentDownloadResourceCommand implements MVCResourceCommand {
	private static final Log LOGGER=LogFactoryUtil.getLog(DocumentDownloadResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(
			ResourceRequest resourceRequest, ResourceResponse resourceResponse)
		throws PortletException {
        
		long connectionDocumentId=ParamUtil.getLong(resourceRequest, "connectionDocumentId",0);

        ConnectionDocument connectionDocument=null;
        
		try {
			connectionDocument = ConnectionDocumentLocalServiceUtil.getConnectionDocument(connectionDocumentId);
			String contentType="application/octet-stream";
			String extension=connectionDocument.getDocumentPath().substring(connectionDocument.getDocumentPath().lastIndexOf("."));
			if("pdf".equalsIgnoreCase(extension)) {
				contentType="application/pdf";
			}else if("jpg".equalsIgnoreCase(extension) || "jpeg".equalsIgnoreCase(extension) ) {
				contentType="image/jpeg";
			}else if("gif".equalsIgnoreCase(extension)) {
				contentType="image/gif";
			}else if("png".equalsIgnoreCase(extension)) {
				contentType="image/png";
			}
			
			LOGGER.info("connectionDocumentId ="+connectionDocumentId+", contentType="+contentType+", extension = "+extension);
			PortletResponseUtil.sendFile(
					resourceRequest, resourceResponse, connectionDocument.getDocumentPath(),
					connectionDocument.getDocumentName().getBytes(), contentType);
			return false;
		} catch (PortalException | IOException e) {
			LOGGER.error(e.getMessage());
		}
     	return true;
	}
}
