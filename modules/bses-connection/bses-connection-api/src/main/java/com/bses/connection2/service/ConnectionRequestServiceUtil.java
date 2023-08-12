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

import com.bses.connection2.model.ConnectionRequest;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;
import java.util.Map;

/**
 * Provides the remote service utility for ConnectionRequest. This utility wraps
 * <code>com.bses.connection2.service.impl.ConnectionRequestServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestService
 * @generated
 */
public class ConnectionRequestServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bses.connection2.service.impl.ConnectionRequestServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static ConnectionRequest createConnectionRequest(
			String mobileNo, String emailId)
		throws PortalException {

		return getService().createConnectionRequest(mobileNo, emailId);
	}

	public static ConnectionRequest createConnectionRequest(
			String mobileNo, String emailId, String requestType,
			String requestMode)
		throws PortalException {

		return getService().createConnectionRequest(
			mobileNo, emailId, requestType, requestMode);
	}

	public static boolean deleteByConnectionRequestId(long connectionRequestId)
		throws PortalException {

		return getService().deleteByConnectionRequestId(connectionRequestId);
	}

	public static com.liferay.portal.kernel.json.JSONArray
		getAvailableTimeSlots(
			java.util.Date appointmentDate, String appointmentDivision) {

		return getService().getAvailableTimeSlots(
			appointmentDate, appointmentDivision);
	}

	public static ConnectionRequest getConnectionRequest(String requestNo) {
		return getService().getConnectionRequest(requestNo);
	}

	public static ConnectionRequest getConnectionRequestByMobileNoAndRequestNo(
		String mobileNo, String requestNo) {

		return getService().getConnectionRequestByMobileNoAndRequestNo(
			mobileNo, requestNo);
	}

	public static List<ConnectionRequest> getConnectionRequestsByMobileNo(
		String mobileNo) {

		return getService().getConnectionRequestsByMobileNo(mobileNo);
	}

	public static com.liferay.portal.kernel.json.JSONArray
		getDivisionWiseAvailableSlots(java.util.Date appointmentDate) {

		return getService().getDivisionWiseAvailableSlots(appointmentDate);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static String submitChangeRequestToSoap(long connectionRequestId) {
		return getService().submitChangeRequestToSoap(connectionRequestId);
	}

	public static String submitNewRequestToSoap(long connectionRequestId) {
		return getService().submitNewRequestToSoap(connectionRequestId);
	}

	public static String updateAddress(
		String requestNo, Map<String, String> params) {

		return getService().updateAddress(requestNo, params);
	}

	public static String updateChecklistDocuments(
		String requestNo, Map<String, String> params) {

		return getService().updateChecklistDocuments(requestNo, params);
	}

	public static String updateConnection(
		String requestNo, Map<String, String> params) {

		return getService().updateConnection(requestNo, params);
	}

	public static String updateConnectionRequest(
		long connectionRequestId, Map<String, String> params,
		String sectionPrefix) {

		return getService().updateConnectionRequest(
			connectionRequestId, params, sectionPrefix);
	}

	public static String updateConsumerDetails(
		String requestNo, Map<String, String> params) {

		return getService().updateConsumerDetails(requestNo, params);
	}

	public static String updateImportantDocuments(
		String requestNo, Map<String, String> params) {

		return getService().updateImportantDocuments(requestNo, params);
	}

	public static ConnectionRequestService getService() {
		return _service;
	}

	private static volatile ConnectionRequestService _service;

}