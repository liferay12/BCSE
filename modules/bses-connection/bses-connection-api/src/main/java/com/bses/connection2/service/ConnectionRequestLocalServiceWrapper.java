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
 * Provides a wrapper for {@link ConnectionRequestLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestLocalService
 * @generated
 */
public class ConnectionRequestLocalServiceWrapper
	implements ConnectionRequestLocalService,
			   ServiceWrapper<ConnectionRequestLocalService> {

	public ConnectionRequestLocalServiceWrapper(
		ConnectionRequestLocalService connectionRequestLocalService) {

		_connectionRequestLocalService = connectionRequestLocalService;
	}

	/**
	 * Adds the connection request to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConnectionRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param connectionRequest the connection request
	 * @return the connection request that was added
	 */
	@Override
	public com.bses.connection2.model.ConnectionRequest addConnectionRequest(
		com.bses.connection2.model.ConnectionRequest connectionRequest) {

		return _connectionRequestLocalService.addConnectionRequest(
			connectionRequest);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest
		convertToConnectionRequest(String jsonString) {

		return _connectionRequestLocalService.convertToConnectionRequest(
			jsonString);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest createChangeRequest(
			String caNumber, String requestType, String requestMode)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestLocalService.createChangeRequest(
			caNumber, requestType, requestMode);
	}

	/**
	 * Creates a new connection request with the primary key. Does not add the connection request to the database.
	 *
	 * @param connectionRequestId the primary key for the new connection request
	 * @return the new connection request
	 */
	@Override
	public com.bses.connection2.model.ConnectionRequest createConnectionRequest(
		long connectionRequestId) {

		return _connectionRequestLocalService.createConnectionRequest(
			connectionRequestId);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest createConnectionRequest(
			String mobileNo, String emailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestLocalService.createConnectionRequest(
			mobileNo, emailId);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest createConnectionRequest(
			String mobileNo, String emailId, String requestType,
			String requestMode)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestLocalService.createConnectionRequest(
			mobileNo, emailId, requestType, requestMode);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest
			deleteByConnectionRequestId(long connectionRequestId)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return _connectionRequestLocalService.deleteByConnectionRequestId(
			connectionRequestId);
	}

	/**
	 * Deletes the connection request from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConnectionRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param connectionRequest the connection request
	 * @return the connection request that was removed
	 */
	@Override
	public com.bses.connection2.model.ConnectionRequest deleteConnectionRequest(
		com.bses.connection2.model.ConnectionRequest connectionRequest) {

		return _connectionRequestLocalService.deleteConnectionRequest(
			connectionRequest);
	}

	/**
	 * Deletes the connection request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConnectionRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request that was removed
	 * @throws PortalException if a connection request with the primary key could not be found
	 */
	@Override
	public com.bses.connection2.model.ConnectionRequest deleteConnectionRequest(
			long connectionRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestLocalService.deleteConnectionRequest(
			connectionRequestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public int deleteStaleConnectionRequests(String mobileNo) {
		return _connectionRequestLocalService.deleteStaleConnectionRequests(
			mobileNo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _connectionRequestLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _connectionRequestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _connectionRequestLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _connectionRequestLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _connectionRequestLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _connectionRequestLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest fetchConnectionRequest(
		long connectionRequestId) {

		return _connectionRequestLocalService.fetchConnectionRequest(
			connectionRequestId);
	}

	/**
	 * Returns the connection request matching the UUID and group.
	 *
	 * @param uuid the connection request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public com.bses.connection2.model.ConnectionRequest
		fetchConnectionRequestByUuidAndGroupId(String uuid, long groupId) {

		return _connectionRequestLocalService.
			fetchConnectionRequestByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _connectionRequestLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray
		getAvailableTimeSlotsByDateAndDivision(
			java.util.Date appointmentDate, String appointmentDivision) {

		return _connectionRequestLocalService.
			getAvailableTimeSlotsByDateAndDivision(
				appointmentDate, appointmentDivision);
	}

	@Override
	public int getChangeRequestCount(String mobileNo) {
		return _connectionRequestLocalService.getChangeRequestCount(mobileNo);
	}

	@Override
	public int getChangeRequestCountByCaNumber(String caNumber) {
		return _connectionRequestLocalService.getChangeRequestCountByCaNumber(
			caNumber);
	}

	@Override
	public java.util.List<com.bses.connection2.model.ConnectionRequest>
		getChangeRequestsByCaNumber(String caNumber) {

		return _connectionRequestLocalService.getChangeRequestsByCaNumber(
			caNumber);
	}

	@Override
	public java.util.List<com.bses.connection2.model.ConnectionRequest>
		getChangeRequestsByMobileNo(String mobileNo) {

		return _connectionRequestLocalService.getChangeRequestsByMobileNo(
			mobileNo);
	}

	@Override
	public String getChangeRequestSubType(
		com.bses.connection2.model.ConnectionRequest connectionRequest) {

		return _connectionRequestLocalService.getChangeRequestSubType(
			connectionRequest);
	}

	/**
	 * Returns the connection request with the primary key.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request
	 * @throws PortalException if a connection request with the primary key could not be found
	 */
	@Override
	public com.bses.connection2.model.ConnectionRequest getConnectionRequest(
			long connectionRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestLocalService.getConnectionRequest(
			connectionRequestId);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest getConnectionRequest(
		String requestNo) {

		return _connectionRequestLocalService.getConnectionRequest(requestNo);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest
		getConnectionRequestByMobileNoAndRequestNo(
			String mobileNo, String requestNo) {

		return _connectionRequestLocalService.
			getConnectionRequestByMobileNoAndRequestNo(mobileNo, requestNo);
	}

	/**
	 * Returns the connection request matching the UUID and group.
	 *
	 * @param uuid the connection request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching connection request
	 * @throws PortalException if a matching connection request could not be found
	 */
	@Override
	public com.bses.connection2.model.ConnectionRequest
			getConnectionRequestByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestLocalService.
			getConnectionRequestByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the connection requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of connection requests
	 */
	@Override
	public java.util.List<com.bses.connection2.model.ConnectionRequest>
		getConnectionRequests(int start, int end) {

		return _connectionRequestLocalService.getConnectionRequests(start, end);
	}

	@Override
	public java.util.List<com.bses.connection2.model.ConnectionRequest>
		getConnectionRequestsByMobileNo(String mobileNo) {

		return _connectionRequestLocalService.getConnectionRequestsByMobileNo(
			mobileNo);
	}

	@Override
	public java.util.List<com.bses.connection2.model.ConnectionRequest>
		getConnectionRequestsByMobileNoAndRequestStatus(
			String mobileNo, String requestStatus) {

		return _connectionRequestLocalService.
			getConnectionRequestsByMobileNoAndRequestStatus(
				mobileNo, requestStatus);
	}

	/**
	 * Returns all the connection requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the connection requests
	 * @param companyId the primary key of the company
	 * @return the matching connection requests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.bses.connection2.model.ConnectionRequest>
		getConnectionRequestsByUuidAndCompanyId(String uuid, long companyId) {

		return _connectionRequestLocalService.
			getConnectionRequestsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of connection requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the connection requests
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching connection requests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.bses.connection2.model.ConnectionRequest>
		getConnectionRequestsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.bses.connection2.model.ConnectionRequest>
					orderByComparator) {

		return _connectionRequestLocalService.
			getConnectionRequestsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of connection requests.
	 *
	 * @return the number of connection requests
	 */
	@Override
	public int getConnectionRequestsCount() {
		return _connectionRequestLocalService.getConnectionRequestsCount();
	}

	@Override
	public int getCountByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus) {

		return _connectionRequestLocalService.
			getCountByMobileNoAndRequestStatus(mobileNo, requestStatus);
	}

	@Override
	public int getCurrentDraftCount(String mobileNo) {
		return _connectionRequestLocalService.getCurrentDraftCount(mobileNo);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray
		getDivisionWiseAvailableSlotsByDate(java.util.Date appointmentDate) {

		return _connectionRequestLocalService.
			getDivisionWiseAvailableSlotsByDate(appointmentDate);
	}

	@Override
	public boolean getEmailAndSendOTPNEW(
		String emailId,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay) {

		return _connectionRequestLocalService.getEmailAndSendOTPNEW(
			emailId, themeDisplay);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _connectionRequestLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _connectionRequestLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public int getMaxDraftCount() {
		return _connectionRequestLocalService.getMaxDraftCount();
	}

	@Override
	public int getNewRequestCount(String mobileNo) {
		return _connectionRequestLocalService.getNewRequestCount(mobileNo);
	}

	@Override
	public java.util.List<com.bses.connection2.model.ConnectionRequest>
		getNewRequestsByMobileNo(String mobileNo) {

		return _connectionRequestLocalService.getNewRequestsByMobileNo(
			mobileNo);
	}

	@Override
	public com.bses.connection2.model.ConnectionRequest getOldConnectionDetails(
			long connectionRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestLocalService.getOldConnectionDetails(
			connectionRequestId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _connectionRequestLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public String submitChangeRequestToSoap(long connectionRequestId) {
		return _connectionRequestLocalService.submitChangeRequestToSoap(
			connectionRequestId);
	}

	@Override
	public String submitNewRequestToSoap(long connectionRequestId) {
		return _connectionRequestLocalService.submitNewRequestToSoap(
			connectionRequestId);
	}

	@Override
	public String updateAddress(
		long connectionRequestId, java.util.Map<String, String> params) {

		return _connectionRequestLocalService.updateAddress(
			connectionRequestId, params);
	}

	@Override
	public String updateAddress(
		String requestNo, java.util.Map<String, String> params) {

		return _connectionRequestLocalService.updateAddress(requestNo, params);
	}

	@Override
	public String updateChecklistDocuments(
		long connectionRequestId, java.util.Map<String, String> params) {

		return _connectionRequestLocalService.updateChecklistDocuments(
			connectionRequestId, params);
	}

	@Override
	public String updateChecklistDocuments(
		String requestNo, java.util.Map<String, String> params) {

		return _connectionRequestLocalService.updateChecklistDocuments(
			requestNo, params);
	}

	@Override
	public String updateConnection(
		long connectionRequestId, java.util.Map<String, String> params) {

		return _connectionRequestLocalService.updateConnection(
			connectionRequestId, params);
	}

	@Override
	public String updateConnection(
		String requestNo, java.util.Map<String, String> params) {

		return _connectionRequestLocalService.updateConnection(
			requestNo, params);
	}

	/**
	 * Updates the connection request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConnectionRequestLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param connectionRequest the connection request
	 * @return the connection request that was updated
	 */
	@Override
	public com.bses.connection2.model.ConnectionRequest updateConnectionRequest(
		com.bses.connection2.model.ConnectionRequest connectionRequest) {

		return _connectionRequestLocalService.updateConnectionRequest(
			connectionRequest);
	}

	@Override
	public String updateConnectionRequest(
		long connectionRequestId, java.util.Map<String, String> params,
		String sectionPrefix) {

		return _connectionRequestLocalService.updateConnectionRequest(
			connectionRequestId, params, sectionPrefix);
	}

	@Override
	public String updateConnectionRequest(
		String requestNo, java.util.Map<String, String> params,
		String sectionPrefix) {

		return _connectionRequestLocalService.updateConnectionRequest(
			requestNo, params, sectionPrefix);
	}

	@Override
	public String updateConsumerDetails(
		long connectionRequestId, java.util.Map<String, String> params) {

		return _connectionRequestLocalService.updateConsumerDetails(
			connectionRequestId, params);
	}

	@Override
	public String updateConsumerDetails(
		String requestNo, java.util.Map<String, String> params) {

		return _connectionRequestLocalService.updateConsumerDetails(
			requestNo, params);
	}

	@Override
	public String updateImportantDocuments(
		long connectionRequestId, java.util.Map<String, String> params) {

		return _connectionRequestLocalService.updateImportantDocuments(
			connectionRequestId, params);
	}

	@Override
	public String updateImportantDocuments(
		String requestNo, java.util.Map<String, String> params) {

		return _connectionRequestLocalService.updateImportantDocuments(
			requestNo, params);
	}

	@Override
	public ConnectionRequestLocalService getWrappedService() {
		return _connectionRequestLocalService;
	}

	@Override
	public void setWrappedService(
		ConnectionRequestLocalService connectionRequestLocalService) {

		_connectionRequestLocalService = connectionRequestLocalService;
	}

	private ConnectionRequestLocalService _connectionRequestLocalService;

}