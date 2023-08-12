package com.bses.connection2.web.command;
import com.bses.connection2.web.constants.BsesConnectionPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.BaseFilter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true, 
		property = {
			"servlet-context-name=", 
			"servlet-filter-name=http-filter",
			"url-pattern=/*" 
		}, 
		service = Filter.class
	)

	public class ViewAction extends BaseFilter{

		private static final Log _log = LogFactoryUtil.getLog(ViewAction.class);

		@Override
		protected void processFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws Exception {
			//filterChain.doFilter(request, response);
			request.setAttribute(BsesConnectionPortletKeys.VK,"1704067200"); 
			super.processFilter(request, response, filterChain);
		}
		
		@Override
		protected Log getLog() {
			return _log;
		}
	}
