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

import com.bses.connection2.model.ConnectionRequest;
import com.bses.connection2.service.base.ConnectionRequestServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.theme.ThemeDisplay;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * The implementation of the connection request remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.bses.connection2.service.ConnectionRequestService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestServiceBaseImpl
 * @see com.bses.connection2.service.ConnectionRequestServiceUtil
 */
public class ConnectionRequestServiceImpl extends ConnectionRequestServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.bses.connection2.service.ConnectionRequestServiceUtil} to access the
	 * connection request remote service.
	 */
	private static final Log LOGGER = LogFactoryUtil.getLog(ConnectionRequestServiceImpl.class);

	@AccessControlled(guestAccessEnabled=true)
	public ConnectionRequest createConnectionRequest(String mobileNo, String emailId) throws PortalException {
		LOGGER.info(mobileNo + " = " + emailId);
		return connectionRequestLocalService.createConnectionRequest(mobileNo, emailId);
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public ConnectionRequest createConnectionRequest(String mobileNo, String emailId, String requestType, String requestMode) throws PortalException {
		LOGGER.info(mobileNo + " = " + emailId);
		return connectionRequestLocalService.createConnectionRequest(mobileNo, emailId, requestType, requestMode);
	}

	/*public String updateConnectionRequest(String requestNo, Map<String, String> params, String sectionPrefix) {
		LOGGER.info("requestNo : "+requestNo);
		LOGGER.info(params);
		LOGGER.info("sectionPrefix : "+sectionPrefix);
		return connectionRequestLocalService.updateConnectionRequest(requestNo, params, sectionPrefix);
	}*/
	@AccessControlled(guestAccessEnabled=true)
	public String updateConnectionRequest(long connectionRequestId, Map<String, String> params, String sectionPrefix) {
		System.out.println("updateConnectionRequest - "+connectionRequestId);
		LOGGER.info("connectionRequestId : "+connectionRequestId);
		LOGGER.info(params);
		LOGGER.info("sectionPrefix : "+sectionPrefix);
		return connectionRequestLocalService.updateConnectionRequest(connectionRequestId, params, sectionPrefix);
	}

	@AccessControlled(guestAccessEnabled=true)
	public String submitNewRequestToSoap(long connectionRequestId) {
		return connectionRequestLocalService.submitNewRequestToSoap(connectionRequestId);
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public String submitChangeRequestToSoap(long connectionRequestId) {
		return connectionRequestLocalService.submitChangeRequestToSoap(connectionRequestId);
	}
	
	public String updateConsumerDetails(String requestNo, Map<String, String> params) {
		LOGGER.info(params);
		return connectionRequestLocalService.updateConsumerDetails(requestNo, params);
	}

	public String updateAddress(String requestNo, Map<String, String> params) {
		LOGGER.info(params);
		return connectionRequestLocalService.updateAddress(requestNo, params);
	}

	public String updateConnection(String requestNo, Map<String, String> params) {
		LOGGER.info(params);
		return connectionRequestLocalService.updateConnection(requestNo, params);
	}

	public String updateChecklistDocuments(String requestNo, Map<String, String> params) {
		LOGGER.info(params);
		return connectionRequestLocalService.updateChecklistDocuments(requestNo, params);
	}

	public String updateImportantDocuments(String requestNo, Map<String, String> params) {
		LOGGER.info(params);
		return connectionRequestLocalService.updateImportantDocuments(requestNo, params);
	}

	public ConnectionRequest getConnectionRequest(String requestNo) {
		return connectionRequestLocalService.getConnectionRequest(requestNo);
	}

	public ConnectionRequest getConnectionRequestByMobileNoAndRequestNo(String mobileNo, String requestNo) {
		return connectionRequestLocalService.getConnectionRequestByMobileNoAndRequestNo(mobileNo, requestNo);
	}

	public List<ConnectionRequest> getConnectionRequestsByMobileNo(String mobileNo) {
		return connectionRequestLocalService.getConnectionRequestsByMobileNo(mobileNo);
	}
	
	private boolean getEmailAndSendOTPNEW(String emailId, ThemeDisplay themeDisplay) {
		return true;
	}
	
	public boolean deleteByConnectionRequestId(long connectionRequestId) throws PortalException {
		connectionRequestLocalService.deleteByConnectionRequestId(connectionRequestId);
		return true;
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public JSONArray getAvailableTimeSlots(Date appointmentDate, String appointmentDivision) {
		return connectionRequestLocalService.getAvailableTimeSlotsByDateAndDivision(appointmentDate, appointmentDivision);
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public JSONArray getDivisionWiseAvailableSlots(Date appointmentDate) {
		return connectionRequestLocalService.getDivisionWiseAvailableSlotsByDate(appointmentDate);
	}
}