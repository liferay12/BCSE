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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ConnectionRequestService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestService
 * @generated
 */
public class ConnectionRequestServiceWrapper
	implements ConnectionRequestService,
			   ServiceWrapper<ConnectionRequestService> {

	public ConnectionRequestServiceWrapper(
		ConnectionRequestService connectionRequestService) {

		_connectionRequestService = connectionRequestService;
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest createConnectionRequest(
			String mobileNo, String emailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestService.createConnectionRequest(
			mobileNo, emailId);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest createConnectionRequest(
			String mobileNo, String emailId, String requestType,
			String requestMode)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestService.createConnectionRequest(
			mobileNo, emailId, requestType, requestMode);
	}

	@Override
	public boolean deleteByConnectionRequestId(long connectionRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestService.deleteByConnectionRequestId(
			connectionRequestId);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getAvailableTimeSlots(
		java.util.Date appointmentDate, String appointmentDivision) {

		return _connectionRequestService.getAvailableTimeSlots(
			appointmentDate, appointmentDivision);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest getConnectionRequest(
		String requestNo) {

		return _connectionRequestService.getConnectionRequest(requestNo);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest
		getConnectionRequestByMobileNoAndRequestNo(
			String mobileNo, String requestNo) {

		return _connectionRequestService.
			getConnectionRequestByMobileNoAndRequestNo(mobileNo, requestNo);
	}

	@Override
	public java.util.List<com.bses.connection2.model.ConnectionRequest>
		getConnectionRequestsByMobileNo(String mobileNo) {

		return _connectionRequestService.getConnectionRequestsByMobileNo(
			mobileNo);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray
		getDivisionWiseAvailableSlots(java.util.Date appointmentDate) {

		return _connectionRequestService.getDivisionWiseAvailableSlots(
			appointmentDate);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _connectionRequestService.getOSGiServiceIdentifier();
	}

	@Override
	public String submitChangeRequestToSoap(long connectionRequestId) {
		return _connectionRequestService.submitChangeRequestToSoap(
			connectionRequestId);
	}

	@Override
	public String submitNewRequestToSoap(long connectionRequestId) {
		return _connectionRequestService.submitNewRequestToSoap(
			connectionRequestId);
	}

	@Override
	public String updateAddress(
		String requestNo, java.util.Map<String, String> params) {

		return _connectionRequestService.updateAddress(requestNo, params);
	}

	@Override
	public String updateChecklistDocuments(
		String requestNo, java.util.Map<String, String> params) {

		return _connectionRequestService.updateChecklistDocuments(
			requestNo, params);
	}

	@Override
	public String updateConnection(
		String requestNo, java.util.Map<String, String> params) {

		return _connectionRequestService.updateConnection(requestNo, params);
	}

	@Override
	public String updateConnectionRequest(
		long connectionRequestId, java.util.Map<String, String> params,
		String sectionPrefix) {

		return _connectionRequestService.updateConnectionRequest(
			connectionRequestId, params, sectionPrefix);
	}

	@Override
	public String updateConsumerDetails(
		String requestNo, java.util.Map<String, String> params) {

		return _connectionRequestService.updateConsumerDetails(
			requestNo, params);
	}

	@Override
	public String updateImportantDocuments(
		String requestNo, java.util.Map<String, String> params) {

		return _connectionRequestService.updateImportantDocuments(
			requestNo, params);
	}

	@Override
	public ConnectionRequestService getWrappedService() {
		return _connectionRequestService;
	}

	@Override
	public void setWrappedService(
		ConnectionRequestService connectionRequestService) {

		_connectionRequestService = connectionRequestService;
	}

	private ConnectionRequestService _connectionRequestService;

}