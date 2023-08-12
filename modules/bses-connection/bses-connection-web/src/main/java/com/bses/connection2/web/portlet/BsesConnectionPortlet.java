package com.bses.connection2.web.portlet;

import com.bses.connection2.model.ConnectionDocument;
import com.bses.connection2.model.ConnectionRequest;
import com.bses.connection2.model.LocalityDivision;
import com.bses.connection2.service.ConnectionDocumentLocalServiceUtil;
import com.bses.connection2.service.ConnectionRequestLocalServiceUtil;
import com.bses.connection2.service.LocalityDivisionLocalServiceUtil;
import com.bses.connection2.util.RequestTypeModeStatus;
import com.bses.connection2.web.constants.BsesConnectionPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Component;

/**
 * @author arjun
 */

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=BSES",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=BSES Connection Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + BsesConnectionPortletKeys.BsesConnection,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"com.liferay.portlet.header-portlet-css=/css/bootstrap.min-4.6.1.css",
		"com.liferay.portlet.header-portlet-css=/css/select2.min.css",
		"com.liferay.portlet.header-portlet-css=/css/style.css",
		"com.liferay.portlet.header-portlet-javascript=/js/jquery.min-3.6.0.js",
		"com.liferay.portlet.header-portlet-javascript=/js/bootstrap.bundle.min-4.6.1.js",
		"com.liferay.portlet.header-portlet-javascript=/js/custom.js",
		"com.liferay.portlet.header-portlet-javascript=/js/select2.min.js",
	},
	service = Portlet.class
)
public class BsesConnectionPortlet extends MVCPortlet {
	private static final Log LOGGER=LogFactoryUtil.getLog(BsesConnectionPortlet.class.getName());
	private static String RTSX = "rtsx";
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)	throws IOException, PortletException {
		String viewMode = renderRequest.getPreferences().getValue("viewMode", "");
		
		clearSession(renderRequest);
		//String requestType=getSetFromRequestOrSession(renderRequest, BsesConnectionPortletKeys.REQUEST_TYPE);
		//String requestMode=getSetFromRequestOrSession(renderRequest, BsesConnectionPortletKeys.REQUEST_MODE);
		
		LOGGER.info("doView(RenderRequest renderRequest, RenderResponse renderResponse) is called : "+viewMode);
		switch(viewMode){    
		case BsesConnectionPortletKeys.VIEW_MODE_NEW:    
			handleNewConnectionView(renderRequest,renderResponse);
			break;  //optional
		case BsesConnectionPortletKeys.VIEW_MODE_CHANGE:
			handleChangeRequestView(renderRequest,renderResponse);
			break;
		case "U02":    
			 handleNameChangeView(renderRequest,renderResponse); 
			 break;  //optional  
		case "U07":    
			 handleAddressChangeView(renderRequest,renderResponse); 
			 break;  //optional    
		case "U03":    
			 handleLoadChangeView(renderRequest,renderResponse);  
			 break;  //optional
		case "U04":    
			 handleLoadChangeView(renderRequest,renderResponse);  
			 break;  //optional
		default:     
			// include(viewTemplate, renderRequest, renderResponse); 
			include("/invalid_config.jsp", renderRequest, renderResponse);
		}    
	}	
	
	private void clearSession(RenderRequest renderRequest) {
		
		HttpServletRequest httpRequest = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(renderRequest));
		if(StringUtils.isNotBlank(httpRequest.getParameter(RTSX))){
			LOGGER.info("Clear Session Data");
			removeFromSession(renderRequest, BsesConnectionPortletKeys.REQUEST_MODE);
			removeFromSession(renderRequest, BsesConnectionPortletKeys.REQUEST_ID);
			removeFromSession(renderRequest, BsesConnectionPortletKeys.MOBILE_NO);
			removeFromSession(renderRequest, BsesConnectionPortletKeys.CA_NUMBER);
			removeFromSession(renderRequest, BsesConnectionPortletKeys.EMAIL_ID);
			removeFromSession(renderRequest, BsesConnectionPortletKeys.REQUEST);
			removeFromSession(renderRequest, BsesConnectionPortletKeys.REQUEST_TYPE);
		}
	}

	private void handleNewConnectionView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		LOGGER.info("handleNewConnectionView");
		//String view = "/new_connection_options.jsp";
		String view = "/list_connections.jsp";
		String loginId=(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.MOBILE_NO);
		//String requestType=RequestTypeModeStatus.TYPE_NEW_CONNECTION;
		String cmd=(String)getSessionAttribute(renderRequest, Constants.CMD);
		if(StringUtils.isBlank(cmd)) {
			removeFromSession(renderRequest, BsesConnectionPortletKeys.REQUEST_MODE);
			removeFromSession(renderRequest, BsesConnectionPortletKeys.REQUEST_ID);
		}
		String requestMode=(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST_MODE);
		long requestId=0;
		try {
			requestId=(Long)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST_ID);
			ConnectionRequest requestEntity=ConnectionRequestLocalServiceUtil.getConnectionRequest(requestId);
			if(!StringUtils.equals(RequestTypeModeStatus.STATUS_DRAFT,requestEntity.getRequestStatus())){
				requestId=0;	
			}
			
		}catch(Exception e) {}

		//String emailId=getSetFromRequestOrSession(renderRequest, BsesConnectionPortletKeys.EMAIL_ID);
		LOGGER.info("handleNewConnectionView# loginId - "+loginId+", requestMode ="+requestMode+", requestId = "+requestId);
		if(StringUtils.isBlank(loginId)) {
			view = "/mobile_login.jsp";
		}else if(requestId>0) {
			ConnectionRequest connectionRequest=(ConnectionRequest)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST);
			renderRequest.setAttribute(BsesConnectionPortletKeys.REQUEST, connectionRequest);
			if(StringUtils.equals(requestMode, BsesConnectionPortletKeys.REQUEST_MODE_ONLINE)) {
				view="/new_connection_online.jsp";
			}else {
				view="/new_connection_appointment.jsp";
			}
		}else if(StringUtils.isNotBlank(requestMode)) {
			//ConnectionRequest connectionRequest=(ConnectionRequest)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST);
			//renderRequest.setAttribute(BsesConnectionPortletKeys.REQUEST, connectionRequest);
			if(StringUtils.equals(requestMode, BsesConnectionPortletKeys.REQUEST_MODE_ONLINE)) {
				view="/new_connection_online.jsp";
			}else {
				view="/new_connection_appointment.jsp";
			}
		}else {
			int draftCount=ConnectionRequestLocalServiceUtil.getNewRequestCount(loginId);
			if(draftCount>0) {
				view = "/list_connections.jsp";
			}
			//int maxCount=ConnectionRequestLocalServiceUtil.getMaxDraftCount();
			//if(draftCount>=maxCount) {
				
			//}
		}
		removeFromSession(renderRequest, Constants.CMD);
		LOGGER.info("handleNewConnectionView # view = "+view);
		include(view, renderRequest, renderResponse);
	}
	
	public void handleCreateNewConnectionAction(ActionRequest request, ActionResponse response) throws IOException, PortletException {
		LOGGER.info("handleCreateNewConnectionAction");
		String loginId=(String)getSessionAttribute(request, BsesConnectionPortletKeys.MOBILE_NO);
		String emailId=(String)getSessionAttribute(request, BsesConnectionPortletKeys.EMAIL_ID);
		String requestMode=ParamUtil.getString(request, BsesConnectionPortletKeys.REQUEST_MODE,StringPool.BLANK);
		long requestId=0;
		ConnectionRequest connectionRequest=null;
		if(StringUtils.isNotBlank(loginId)) {
			String requestType=RequestTypeModeStatus.TYPE_NEW_CONNECTION;
			
			if(StringUtils.isNotBlank(requestMode)) {
				try {
					try {
						requestId=(Long)getSessionAttribute(request, BsesConnectionPortletKeys.REQUEST_ID);
					}catch(Exception e) {}
					
					if(requestId>0) {
						connectionRequest=(ConnectionRequest)getSessionAttribute(request, BsesConnectionPortletKeys.REQUEST);
					}
					
					if(connectionRequest == null) {
						connectionRequest=ConnectionRequestLocalServiceUtil.createConnectionRequest(loginId, emailId, RequestTypeModeStatus.TYPE_NEW_CONNECTION, requestMode);
						requestId=connectionRequest.getConnectionRequestId();
					}
					
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST_ID, requestId);
					//setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST, connectionRequest);
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST_MODE,requestMode);
					setSessionAttribute(request, Constants.CMD, Constants.ADD);
					LOGGER.info("handleCreateNewConnectionAction#requestCreated : connectionRequest.getConnectionRequestId() = "+requestId);
				} catch (PortalException e) {
					LOGGER.error(e);
				}
			}
			LOGGER.info("handleCreateNewConnectionAction# loginId = "+loginId+", emailId = "+emailId+", requestType="+requestType+", requestMode="+requestMode+", requestId = "+requestId);
		}
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void handleNewConnectionAction(ActionRequest request, ActionResponse response) throws IOException, PortletException {
		LOGGER.info("handleNewConnectionAction");
		String loginId=(String)getSessionAttribute(request, BsesConnectionPortletKeys.MOBILE_NO);
		String emailId=(String)getSessionAttribute(request, BsesConnectionPortletKeys.EMAIL_ID);
		if(StringUtils.isNotBlank(loginId)) {
			removeFromSession(request, BsesConnectionPortletKeys.REQUEST_ID);
			//removeFromSession(request, BsesConnectionPortletKeys.REQUEST);
			removeFromSession(request, BsesConnectionPortletKeys.REQUEST_MODE);
/*			String requestType=RequestTypeModeStatus.TYPE_NEW_CONNECTION;
			String requestMode=getSetFromRequestOrSession(request, BsesConnectionPortletKeys.REQUEST_MODE);
			long requestId=getSetRequestIdFromRequestOrSession(request, BsesConnectionPortletKeys.REQUEST_ID);

			if((StringUtils.isNotBlank(requestType) && StringUtils.isNotBlank(requestMode)) && requestId==0) {
				try {
					ConnectionRequest connectionRequest=ConnectionRequestLocalServiceUtil.createConnectionRequest(loginId, emailId, RequestTypeModeStatus.TYPE_NEW_CONNECTION, requestMode);
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST_ID, connectionRequest.getConnectionRequestId());
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST, connectionRequest);
					LOGGER.info("handleNewConnectionAction#requestCreated : connectionRequest.getConnectionRequestId() = "+connectionRequest.getConnectionRequestId());
				} catch (PortalException e) {
					LOGGER.error(e);
				}
			}
			LOGGER.info("handleNewConnectionAction# loginId = "+loginId+", emailId = "+emailId+", requestType="+requestType+", requestMode="+requestMode+", requestId = "+requestId);
		*/	
		}
		
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void handleEditNewRequestAction(ActionRequest request, ActionResponse response) throws IOException, PortletException {
		LOGGER.info("handleNewConnectionAction");
		String loginId=getSetFromRequestOrSession(request, BsesConnectionPortletKeys.MOBILE_NO);
		if(StringUtils.isNotBlank(loginId)) {
			String requestType=RequestTypeModeStatus.TYPE_NEW_CONNECTION;
			String requestMode=StringPool.BLANK;
			long requestId=ParamUtil.getLong(request, BsesConnectionPortletKeys.REQUEST_ID);
			if(requestId>0) {
			//if((StringUtils.isNotBlank(requestType) && StringUtils.isNotBlank(requestMode)) && requestId==0) {
				try {
					ConnectionRequest connectionRequest=ConnectionRequestLocalServiceUtil.getConnectionRequest(requestId);
					requestMode=connectionRequest.getRequestMode();
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST_ID, connectionRequest.getConnectionRequestId());
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST, connectionRequest);
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST_MODE, connectionRequest.getRequestMode());
					setSessionAttribute(request, Constants.CMD, Constants.EDIT);
					LOGGER.info("handleNewConnectionAction#requestCreated : connectionRequest.getConnectionRequestId() = "+connectionRequest.getConnectionRequestId());
				} catch (PortalException e) {
					LOGGER.error(e);
				}
			}
			LOGGER.info("handleNewConnectionAction# loginId = "+loginId+", requestType="+requestType+", requestMode="+requestMode+", requestId = "+requestId);
		}
		
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	private void handleChangeRequestView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		LOGGER.info("handleChangeRequestView");
		String view = "/list_change_requests.jsp";
		
		String cmd=(String)getSessionAttribute(renderRequest, Constants.CMD);
		if(StringUtils.isBlank(cmd)) {
			removeFromSession(renderRequest, BsesConnectionPortletKeys.REQUEST_MODE);
			removeFromSession(renderRequest, BsesConnectionPortletKeys.REQUEST_TYPE);
			removeFromSession(renderRequest, BsesConnectionPortletKeys.REQUEST_ID);
		}
		
		String loginId=(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.CA_NUMBER);
		String requestType=(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST_TYPE);
		long requestId=0;
		try {
			requestId=(Long)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST_ID);
		}catch(Exception e) {}
		
		LOGGER.info("handleChangeRequestView # loginId - "+loginId+", requestType : "+requestType+", requestId : "+requestId);
		
		if(StringUtils.isBlank(loginId)) {
			LOGGER.info("handleChangeRequestView - New login for change request");
			view = "/ca_number_login.jsp";
		}else if(requestId>0) {
			view=getChangeRequestTypeView(renderRequest, renderResponse);
		}else if(StringUtils.isNotBlank(requestType)) {
			view=getChangeRequestTypeView(renderRequest, renderResponse);
		}else {
			int draftCount=ConnectionRequestLocalServiceUtil.getChangeRequestCount(loginId);
			if(draftCount > 0 ) {
				view = "/list_change_requests.jsp";
			}
		}
		
		LOGGER.info("handleChangeRequestView#view = "+view);
		include(view, renderRequest, renderResponse);
	}

	public void createChangeRequestAction(ActionRequest request, ActionResponse response) throws IOException, PortletException {
		String loginId=(String)getSessionAttribute(request, BsesConnectionPortletKeys.CA_NUMBER);
		String requestType=ParamUtil.getString(request, BsesConnectionPortletKeys.REQUEST_TYPE, StringPool.BLANK);
		String requestMode=ParamUtil.getString(request, BsesConnectionPortletKeys.REQUEST_MODE, StringPool.BLANK);
		LOGGER.info("createChangeRequestAction#loginId = "+loginId+", requestType = "+requestType+", requestMode = "+requestMode);
		if(StringUtils.isNotBlank(loginId)) {
			try {
					ConnectionRequest connectionRequest = ConnectionRequestLocalServiceUtil.createChangeRequest(loginId,requestType,requestMode);
					LOGGER.info("connectionRequest:mobile-"+connectionRequest.getMobileNo());
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST_ID, connectionRequest.getConnectionRequestId());
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST, connectionRequest);
					setSessionAttribute(request, Constants.CMD, Constants.ADD);
					LOGGER.info("createChangeRequestAction#requestId = "+connectionRequest.getConnectionRequestId());
			} catch (PortalException e) {
				LOGGER.error(e);
			}
		}
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void editChangeRequestAction(ActionRequest request, ActionResponse response) throws IOException, PortletException {
		LOGGER.info("editChangeRequestAction");
		String loginId=(String)getSessionAttribute(request, BsesConnectionPortletKeys.MOBILE_NO);
		if(StringUtils.isNotBlank(loginId)) {
			String requestType=StringPool.BLANK;
			String requestMode=StringPool.BLANK;
			long requestId=ParamUtil.getLong(request, BsesConnectionPortletKeys.REQUEST_ID);
			if(requestId>0) {
			//if((StringUtils.isNotBlank(requestType) && StringUtils.isNotBlank(requestMode)) && requestId==0) {
				try {
					ConnectionRequest connectionRequest=ConnectionRequestLocalServiceUtil.getConnectionRequest(requestId);
					requestMode=connectionRequest.getRequestMode();
					requestType=connectionRequest.getRequestType();
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST_ID, connectionRequest.getConnectionRequestId());
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST, connectionRequest);
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST_MODE, requestMode);
					setSessionAttribute(request, BsesConnectionPortletKeys.REQUEST_TYPE, requestType);
					setSessionAttribute(request, Constants.CMD, Constants.EDIT);
					LOGGER.info("editChangeRequestAction#requestCreated : connectionRequest.getConnectionRequestId() = "+connectionRequest.getConnectionRequestId());
				} catch (PortalException e) {
					LOGGER.error(e);
				}
			}
			LOGGER.info("editChangeRequestAction# loginId = "+loginId+", requestType="+requestType+", requestMode="+requestMode+", requestId = "+requestId);
		}
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	private String getChangeRequestTypeView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		String requestType=getSetFromRequestOrSession(renderRequest, BsesConnectionPortletKeys.REQUEST_TYPE);

		LOGGER.info("getChangeRequestTypeView : "+requestType);
		String view="";
		switch(requestType){ 
		case "U02":    
			view="/name_change.jsp"; 
			 break;  //optional  
		case "U0304":    
			view="/load_change.jsp";  
			 break;  //optional
		case "U03":    
			view="/load_change.jsp";  
			 break;  //optional
		case "U04":    
			view="/load_change.jsp";  
			 break;  //optional
		case "U0506":    
			view="/category_change.jsp";  
			 break;  //optional
		case "U05":    
			view="/category_change.jsp";  
			 break;  //optional
		case "U06":    
			view="/category_change.jsp";  
			 break;  //optional			 
		case "U07":    
			view="/address_change.jsp"; 
			 break;  //optional  	 
		default:     
			// include(viewTemplate, renderRequest, renderResponse); 
			view="/invalid_config.jsp";
		}
		
		/*case "U02":    
			view=handleNameChangeView(renderRequest,renderResponse); 
			 break;  //optional  
		case "U0304":    
			view=handleLoadChangeView(renderRequest,renderResponse);  
			 break;  //optional
		case "U0506":    
			view=handleCategoryChangeView(renderRequest,renderResponse);  
			 break;  //optional
		case "U07":    
			view=handleAddressChangeView(renderRequest,renderResponse); 
			 break;  //optional  	 
		default:     
			// include(viewTemplate, renderRequest, renderResponse); 
			view="/invalid_config.jsp";
		} */
		return view;
	}



	private String handleLoadChangeView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		String view = "/load_change.jsp";
		String loginId=(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.CA_NUMBER);
		if(StringUtils.isBlank(loginId)) {
			view = "/ca_number_login.jsp";
		}else {
			String requestId =(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST_ID);
			String requestType=getSetFromRequestOrSession(renderRequest, BsesConnectionPortletKeys.REQUEST_TYPE);
			String requestMode=getSetFromRequestOrSession(renderRequest, BsesConnectionPortletKeys.REQUEST_MODE);
			
			if(StringUtils.isBlank(requestId)) {
				try {
					ConnectionRequest connectionRequest = ConnectionRequestLocalServiceUtil.createChangeRequest(loginId,requestType,requestMode);
					if(connectionRequest != null) {
						LOGGER.info("connectionRequest.getConnectionRequestId()- "+connectionRequest.getConnectionRequestId());
						setSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST_ID, connectionRequest.getConnectionRequestId());
					}
				
				} catch (PortalException e) {
					e.printStackTrace();
				}
			}
		}
		return view;
/*		String view = "/load_change_view.jsp";
		PortletSession session = renderRequest.getPortletSession();
		String loginId=(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.CA_NUMBER);
		if(StringUtils.isBlank(loginId)) {
			view = "/mobile_login.jsp";
		}
		return view;*/
		//include(view, renderRequest, renderResponse);
	}

	private String handleAddressChangeView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		String view = "/address_change.jsp";
		String loginId=(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.CA_NUMBER);
		if(StringUtils.isBlank(loginId)) {
			view = "/ca_number_login.jsp";
		}else {
			String requestId =(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST_ID);
			String requestType=getSetFromRequestOrSession(renderRequest, BsesConnectionPortletKeys.REQUEST_TYPE);
			String requestMode=getSetFromRequestOrSession(renderRequest, BsesConnectionPortletKeys.REQUEST_MODE);
			if(StringUtils.isBlank(requestId)) {
				try {
					ConnectionRequest connectionRequest = ConnectionRequestLocalServiceUtil.createChangeRequest(requestId,requestType,requestMode);
					if(connectionRequest != null) {
						LOGGER.info("connectionRequest.getConnectionRequestId()- "+connectionRequest.getConnectionRequestId());
						setSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST_ID, connectionRequest.getConnectionRequestId());
					}
				
				} catch (PortalException e) {
					e.printStackTrace();
				}
			}
		}
		return view;
/*		String view = "/address_change_view.jsp";
		String loginId=(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.CA_NUMBER);
		if(StringUtils.isBlank(loginId)) {
			view = "/mobile_login.jsp";
		}
		return view;*/
		//include(view, renderRequest, renderResponse);
		
	}

	private String handleNameChangeView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		String view = "/name_change.jsp";
		String loginId=(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.CA_NUMBER);
		if(StringUtils.isBlank(loginId)) {
			view = "/ca_number_login.jsp";
		}
		return view;
		//include(view, renderRequest, renderResponse);
		
	}
	
	private String handleCategoryChangeView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		String view = "/category_change.jsp";
		String loginId=(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.CA_NUMBER);
		if(StringUtils.isBlank(loginId)) {
			view = "/ca_number_login.jsp";
		}else {
			String requestId =(String)getSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST_ID);
			String requestType=getSetFromRequestOrSession(renderRequest, BsesConnectionPortletKeys.REQUEST_TYPE);
			String requestMode=getSetFromRequestOrSession(renderRequest, BsesConnectionPortletKeys.REQUEST_MODE);
			if(StringUtils.isBlank(requestId)) {
				try {
					ConnectionRequest connectionRequest = ConnectionRequestLocalServiceUtil.createChangeRequest(loginId,requestType,requestMode);
					if(connectionRequest != null) {
						LOGGER.info("connectionRequest.getConnectionRequestId()- "+connectionRequest.getConnectionRequestId());
						setSessionAttribute(renderRequest, BsesConnectionPortletKeys.REQUEST_ID, connectionRequest.getConnectionRequestId());
					}
				
				} catch (PortalException e) {
					e.printStackTrace();
				}
			}
		}
		return view;
		//include(view, renderRequest, renderResponse);
		
	}
	
	
	public void newConnectionAction(ActionRequest request, ActionResponse response) {
		LOGGER.info("newConnectionApplyOnlineView");
		PortletSession session = request.getPortletSession();
		getSetFromRequestOrSession(request, BsesConnectionPortletKeys.REQUEST_MODE);
		//session.setAttribute("newConnectionMode", RequestTypeModeStatus.MODE_ONLINE);
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		//session.setAttribute("newConnectionMode", "online");
	}
	
	public void newConnectionApplyAppointmentView(ActionRequest request, ActionResponse response) {
		LOGGER.info("newConnectionApplyAppoinmentView");
		PortletSession session = request.getPortletSession();
		session.setAttribute("newConnectionMode", RequestTypeModeStatus.MODE_APPOINTMENT);
		//session.setAttribute("newConnectioMode", "appointment");
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void newConnectionLogin(ActionRequest request, ActionResponse response) {
		
		String mobileNo = ParamUtil.getString(request, "mobileNo");
        String email = ParamUtil.getString(request, "email");
        LOGGER.info("newConnectionLogin, mobileNo: "+mobileNo+", email: "+email);

        setRequestAttributesInSession(request, BsesConnectionPortletKeys.MOBILE_NO);
		setRequestAttributesInSession(request, BsesConnectionPortletKeys.EMAIL_ID);
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void caNumberLogin(ActionRequest request, ActionResponse response) {
		LOGGER.info("caNumberLogin : "+BsesConnectionPortletKeys.CA_NUMBER+" - "+ParamUtil.getString(request, BsesConnectionPortletKeys.CA_NUMBER));
		LOGGER.info("caNumberLogin : "+BsesConnectionPortletKeys.MOBILE_NO+" - "+ParamUtil.getString(request, BsesConnectionPortletKeys.MOBILE_NO));
		setRequestAttributesInSession(request, BsesConnectionPortletKeys.CA_NUMBER);
		setRequestAttributesInSession(request, BsesConnectionPortletKeys.MOBILE_NO);

		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void requestListView(ActionRequest request, ActionResponse response) {
		removeFromSession(request, BsesConnectionPortletKeys.REQUEST_MODE);
		removeFromSession(request, BsesConnectionPortletKeys.REQUEST_ID);
		removeFromSession(request, BsesConnectionPortletKeys.REQUEST);
		removeFromSession(request, BsesConnectionPortletKeys.REQUEST_TYPE);
		SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
	
	public void newConnectionHomeView(ActionRequest request, ActionResponse response) {
		
		System.out.println("*****************newConnectionHomeView****************");
		removeFromSession(request, BsesConnectionPortletKeys.REQUEST_MODE);
		removeFromSession(request, BsesConnectionPortletKeys.REQUEST_ID);
		removeFromSession(request, BsesConnectionPortletKeys.REQUEST_TYPE);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		ConnectionDocument connectionDocument =null;
		String resourceId = resourceRequest.getResourceID();
		System.out.println("resourceId >> "+resourceId);
		
		String cmd=ParamUtil.getString(resourceRequest, "cmd", "");
		if(StringUtils.equalsIgnoreCase(cmd, "upload")) {
			JSONObject result=JSONFactoryUtil.createJSONObject();
			try {
				connectionDocument = uploadDocument(resourceRequest);
				result.put("status","success");
				result.put("connectionDocumentId", connectionDocument.getConnectionDocumentId());
				result.put("clientFileName", connectionDocument.getClientFileName());
			} catch (PortalException e) {
				result.put("status", "fail");
				result.put("error", e.getMessage());
			}
			
			PrintWriter pw=resourceResponse.getWriter();
	     	pw.write(result.toJSONString());
	     	pw.flush();
	     	pw.close();
		}else if(StringUtils.equalsIgnoreCase(cmd, "download")) {
			long connectionDocumentId=ParamUtil.getLong(resourceRequest, "connectionDocumentId",0);
	        try {
				connectionDocument=ConnectionDocumentLocalServiceUtil.getConnectionDocument(connectionDocumentId);
				File file = new File(connectionDocument.getDocumentPath());
				//byte[] arr = new byte[(int)file.length()];
				InputStream inputStream = new FileInputStream(file);
				//OutputStream out=resourceResponse.getPortletOutputStream();
				
				PortletResponseUtil.sendFile(resourceRequest, resourceResponse, connectionDocument.getClientFileName(), inputStream, ContentTypes.APPLICATION_PDF);
			} catch (PortalException e) {
				LOGGER.error(e);
			}
			
		}else if ("searchLocality".equals(resourceId)) {
			String area = ParamUtil.getString(resourceRequest, "keywords").toUpperCase();
			// System.out.println(area);
			JSONObject json = JSONFactoryUtil.createJSONObject();
			JSONArray results = JSONFactoryUtil.createJSONArray();
			json.put("response", results);
			List<LocalityDivision> LocalityMasterList = LocalityDivisionLocalServiceUtil.searchLocalityDivision(area);
			// System.out.println(LocalityMasterList.size());
			for (LocalityDivision master : LocalityMasterList) {
				JSONObject object = JSONFactoryUtil.createJSONObject();
				object.put("id", master.getLocalityDivisionId());
				object.put("key", master.getLocalityName());
				object.put("value", master.getDivisionName());
				object.put("code", master.getDivisionCode());
				results.put(object);
			}
			writeJSON(resourceRequest, resourceResponse, json);
		}
	}
	
	private ConnectionDocument uploadDocument(ResourceRequest resourceRequest) throws PortalException {
		UploadPortletRequest uploadRequest   =  PortalUtil.getUploadPortletRequest(resourceRequest);
     	//String fileElementName=uploadRequest.getParameter(resourceResponse.getNamespace()+"elementName");
     	//String filePath=uploadRequest.getParameter(fileElementName+"_path");
     	File sourceFile=uploadRequest.getFile("file");
        long connectionRequestId=ParamUtil.getLong(uploadRequest, "connectionRequestId",0);
        long connectionDocumentId=ParamUtil.getLong(uploadRequest, "connectionDocumentId",0);
        String documentType=ParamUtil.getString(uploadRequest, "documentType");
        String documentName=ParamUtil.getString(uploadRequest, "documentName");
        String clientFileName=ParamUtil.getString(uploadRequest, "name");

        ConnectionDocument connectionDocument=ConnectionDocumentLocalServiceUtil.updateConnectionDocument(connectionDocumentId, connectionRequestId, documentType, documentName, clientFileName, sourceFile);
		return connectionDocument;
	}

	public String generateTwelveDigitCANo(String accNo) {
		String formattedNumber = StringPool.BLANK;
		if (Validator.isNotNull(accNo)) {
			formattedNumber = String.format("%012d", Long.valueOf(accNo));
			//log.debug("Formatted account number from  getValidAccountNumber method ::::::::  " + formattedNumber);
		}
		return formattedNumber;
	}
	
	private Object getSessionAttribute(PortletRequest request, String name) {
		PortletSession session = request.getPortletSession();
		if(session.getAttribute(name)!=null) {
			return session.getAttribute(name);
		}
		return null;
	}
	
	/*private void setSessionAttribute(PortletRequest request, String attrName,  String attrValue) {
		if(StringUtils.isNotBlank(attrName) && StringUtils.isNotBlank(attrValue)) {
			request.getPortletSession(true).setAttribute(attrName, attrValue);
		}
	}*/
	
	private void setSessionAttribute(PortletRequest request, String attrName,  Object attrValue) {
		if(StringUtils.isNotBlank(attrName) && attrValue!=null) {
			request.getPortletSession().setAttribute(attrName, attrValue);
		}
	}

	private void setRequestAttributesInSession(PortletRequest request, String paramName) {
		String paramValue=ParamUtil.getString(request, paramName);
		if(StringUtils.isNotBlank(paramName) && StringUtils.isNotBlank(paramValue)) {
			request.getPortletSession().setAttribute(paramName, paramValue);
		}
	}
	
	private String getSetFromRequestOrSession(PortletRequest request, String paramName) {
		String paramValue=ParamUtil.getString(request, paramName, StringPool.BLANK);
		PortletSession session=request.getPortletSession();
		if(StringUtils.isBlank(paramValue)) {
			if(request.getAttribute(paramName)!=null) {
				paramValue=(String)request.getAttribute(paramName);
			}else {
				if(session.getAttribute(paramName)!=null) {
					paramValue=(String)session.getAttribute(paramName);
				}
			}
		}
		/*if(StringUtils.isNotBlank(paramValue)) {
			request.setAttribute(paramName, paramValue);
			session.setAttribute(paramName, paramValue);
		}*/
		return paramValue;
	}
	
	private long getSetRequestIdFromRequestOrSession(PortletRequest request, String paramName) {
		long paramValue=ParamUtil.getLong(request, paramName, 0);
		PortletSession session=request.getPortletSession();
		if(paramValue==0) {
			if(request.getAttribute(paramName)!=null) {
				paramValue=(Long)request.getAttribute(paramName);
			}else {
				if(session.getAttribute(paramName)!=null) {
					paramValue=(Long)session.getAttribute(paramName);
				}
			}
		}
		/*if(paramValue>0) {
			request.setAttribute(paramName, paramValue);
			session.setAttribute(paramName, paramValue);
		}*/
		return paramValue;
	}
	
	private void removeFromSession(PortletRequest request, String paramName) {
		PortletSession session=request.getPortletSession();
		session.removeAttribute(paramName);
	}
	private void destroySession(PortletRequest request, String paramName) {
		PortletSession session=request.getPortletSession();
		session.invalidate();
	}
}
