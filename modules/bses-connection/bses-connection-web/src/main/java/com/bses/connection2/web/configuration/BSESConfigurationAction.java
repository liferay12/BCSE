package com.bses.connection2.web.configuration;


import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import org.osgi.service.component.annotations.Component;

import com.bses.connection2.web.constants.BsesConnectionPortletKeys;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
@Component(
	    immediate = true,
	    property = {
	    		"javax.portlet.name=" + BsesConnectionPortletKeys.BsesConnection,
	     },
	    service = ConfigurationAction.class
	)
public class BSESConfigurationAction extends DefaultConfigurationAction
{

	@Override
    public void processAction(
            PortletConfig portletConfig, ActionRequest actionRequest,
            ActionResponse actionResponse)
        throws Exception {

        String viewMode = ParamUtil.getString(actionRequest, "viewMode");
        setPreference(actionRequest, "viewMode", viewMode);

        super.processAction(portletConfig, actionRequest, actionResponse);
    }

}
