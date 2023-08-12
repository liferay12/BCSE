package com.bses.connection2.status.web.portlet;

import com.bses.connection2.helper.DigitalSevaKendraServiceHelper;
import com.bses.connection2.status.web.constants.ConnectionStatusPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletConfig;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletRequest;

import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Component;

/**
 * @author User
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=BSES",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=BSES Request Status",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ConnectionStatusPortletKeys.CONNECTIONSTATUS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
	},
	service = Portlet.class
)
public class ConnectionStatusPortlet extends MVCPortlet {
	
	private static final Log log = LogFactoryUtil.getLog(ConnectionStatusPortlet.class);
	
	public void getRequestStatus(ActionRequest actionRequest, ActionResponse actionResponse) {
		log.info("----getRequestStatus----");
		String requestNumber = ParamUtil.get(actionRequest, "requestNumber", "");
		try {
			hideDefaultLiferayErrorMessage(actionRequest);
			hideDefaultLiferaySuccessMessage(actionRequest);

			String serviceResponse = "";

			serviceResponse = DigitalSevaKendraServiceHelper.getOrderStatus(requestNumber); 
			log.info("order_status----"+serviceResponse);
			String orderStatus = "";
			String description = "";
			if(serviceResponse.contains("#")){
				String [] res = serviceResponse.split("#");
				orderStatus = res[0];
				description = res[1];
			}
			if (StringUtils.isNotBlank(orderStatus) || StringUtils.isNotBlank(description)) {
				actionRequest.setAttribute("status", orderStatus);
				actionRequest.setAttribute("orderNo", requestNumber);
				actionRequest.setAttribute("description", description);
				actionRequest.setAttribute("viewStatus", true);
			}else {
				SessionErrors.add(actionRequest, "order.status.service.error");
			}

		} catch (Exception e) {
			SessionErrors.add(actionRequest, "order.status.service.error");
			log.error("Exception occured while getting status :::" + e);
		}
	}
	

	public void hideDefaultLiferayErrorMessage(PortletRequest request) {
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, ((LiferayPortletConfig) portletConfig).getPortletId() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}


	public void hideDefaultLiferaySuccessMessage(PortletRequest request) {
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, ((LiferayPortletConfig) portletConfig).getPortletId() + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
}