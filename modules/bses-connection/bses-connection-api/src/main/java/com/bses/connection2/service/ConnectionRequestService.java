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

package com.bses.connection2.service;

import aQute.bnd.annotation.ProviderType;

import com.bses.connection2.model.ConnectionRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.spring.osgi.OSGiBeanProperties;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Provides the remote service interface for ConnectionRequest. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@OSGiBeanProperties(
	property = {
		"json.web.service.context.name=bsesconn",
		"json.web.service.context.path=ConnectionRequest"
	},
	service = ConnectionRequestService.class
)
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ConnectionRequestService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.bses.connection2.service.impl.ConnectionRequestServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the connection request remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link ConnectionRequestServiceUtil} if injection and service tracking are not available.
	 */
	@AccessControlled(guestAccessEnabled = true)
	public ConnectionRequest createConnectionRequest(
			String mobileNo, String emailId)
		throws PortalException;

	@AccessControlled(guestAccessEnabled = true)
	public ConnectionRequest createConnectionRequest(
			String mobileNo, String emailId, String requestType,
			String requestMode)
		throws PortalException;

	public boolean deleteByConnectionRequestId(long connectionRequestId)
		throws PortalException;

	@AccessControlled(guestAccessEnabled = true)
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JSONArray getAvailableTimeSlots(
		Date appointmentDate, String appointmentDivision);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ConnectionRequest getConnectionRequest(String requestNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ConnectionRequest getConnectionRequestByMobileNoAndRequestNo(
		String mobileNo, String requestNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ConnectionRequest> getConnectionRequestsByMobileNo(
		String mobileNo);

	@AccessControlled(guestAccessEnabled = true)
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JSONArray getDivisionWiseAvailableSlots(Date appointmentDate);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@AccessControlled(guestAccessEnabled = true)
	public String submitChangeRequestToSoap(long connectionRequestId);

	@AccessControlled(guestAccessEnabled = true)
	public String submitNewRequestToSoap(long connectionRequestId);

	public String updateAddress(String requestNo, Map<String, String> params);

	public String updateChecklistDocuments(
		String requestNo, Map<String, String> params);

	public String updateConnection(
		String requestNo, Map<String, String> params);

	@AccessControlled(guestAccessEnabled = true)
	public String updateConnectionRequest(
		long connectionRequestId, Map<String, String> params,
		String sectionPrefix);

	public String updateConsumerDetails(
		String requestNo, Map<String, String> params);

	public String updateImportantDocuments(
		String requestNo, Map<String, String> params);

}