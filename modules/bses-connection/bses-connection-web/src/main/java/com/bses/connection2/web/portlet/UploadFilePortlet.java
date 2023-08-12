package com.bses.connection2.web.portlet;

import com.bses.connection2.web.constants.UploadFilePortletKeys;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.upload.UploadPortletRequest;

import com.liferay.portal.kernel.util.PortalUtil;

import java.io.File;
import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author adj_2
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=UploadFile",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + UploadFilePortletKeys.UPLOADFILE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UploadFilePortlet extends MVCPortlet {
	public final void serveResource(final ResourceRequest request, final ResourceResponse response) throws IOException, PortletException {
		
     	UploadPortletRequest uploadRequest   =  PortalUtil.getUploadPortletRequest(request);
                File file=uploadRequest.getFile("fileText");
      
       	System.out.println(uploadRequest+"======"+file.getName());
	
	}
}






