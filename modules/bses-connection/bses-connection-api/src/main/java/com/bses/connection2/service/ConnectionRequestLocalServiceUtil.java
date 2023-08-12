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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

/**
 * Provides the local service utility for ConnectionRequest. This utility wraps
 * <code>com.bses.connection2.service.impl.ConnectionRequestLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestLocalService
 * @generated
 */
public class ConnectionRequestLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bses.connection2.service.impl.ConnectionRequestLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static ConnectionRequest addConnectionRequest(
		ConnectionRequest connectionRequest) {

		return getService().addConnectionRequest(connectionRequest);
	}

	public static ConnectionRequest convertToConnectionRequest(
		String jsonString) {

		return getService().convertToConnectionRequest(jsonString);
	}

	public static ConnectionRequest createChangeRequest(
			String caNumber, String requestType, String requestMode)
		throws PortalException {

		return getService().createChangeRequest(
			caNumber, requestType, requestMode);
	}

	/**
	 * Creates a new connection request with the primary key. Does not add the connection request to the database.
	 *
	 * @param connectionRequestId the primary key for the new connection request
	 * @return the new connection request
	 */
	public static ConnectionRequest createConnectionRequest(
		long connectionRequestId) {

		return getService().createConnectionRequest(connectionRequestId);
	}

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

	public static ConnectionRequest deleteByConnectionRequestId(
			long connectionRequestId)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getService().deleteByConnectionRequestId(connectionRequestId);
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
	public static ConnectionRequest deleteConnectionRequest(
		ConnectionRequest connectionRequest) {

		return getService().deleteConnectionRequest(connectionRequest);
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
	public static ConnectionRequest deleteConnectionRequest(
			long connectionRequestId)
		throws PortalException {

		return getService().deleteConnectionRequest(connectionRequestId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static int deleteStaleConnectionRequests(String mobileNo) {
		return getService().deleteStaleConnectionRequests(mobileNo);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ConnectionRequest fetchConnectionRequest(
		long connectionRequestId) {

		return getService().fetchConnectionRequest(connectionRequestId);
	}

	/**
	 * Returns the connection request matching the UUID and group.
	 *
	 * @param uuid the connection request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchConnectionRequestByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchConnectionRequestByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.json.JSONArray
		getAvailableTimeSlotsByDateAndDivision(
			java.util.Date appointmentDate, String appointmentDivision) {

		return getService().getAvailableTimeSlotsByDateAndDivision(
			appointmentDate, appointmentDivision);
	}

	public static int getChangeRequestCount(String mobileNo) {
		return getService().getChangeRequestCount(mobileNo);
	}

	public static int getChangeRequestCountByCaNumber(String caNumber) {
		return getService().getChangeRequestCountByCaNumber(caNumber);
	}

	public static List<ConnectionRequest> getChangeRequestsByCaNumber(
		String caNumber) {

		return getService().getChangeRequestsByCaNumber(caNumber);
	}

	public static List<ConnectionRequest> getChangeRequestsByMobileNo(
		String mobileNo) {

		return getService().getChangeRequestsByMobileNo(mobileNo);
	}

	public static String getChangeRequestSubType(
		ConnectionRequest connectionRequest) {

		return getService().getChangeRequestSubType(connectionRequest);
	}

	/**
	 * Returns the connection request with the primary key.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request
	 * @throws PortalException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest getConnectionRequest(
			long connectionRequestId)
		throws PortalException {

		return getService().getConnectionRequest(connectionRequestId);
	}

	public static ConnectionRequest getConnectionRequest(String requestNo) {
		return getService().getConnectionRequest(requestNo);
	}

	public static ConnectionRequest getConnectionRequestByMobileNoAndRequestNo(
		String mobileNo, String requestNo) {

		return getService().getConnectionRequestByMobileNoAndRequestNo(
			mobileNo, requestNo);
	}

	/**
	 * Returns the connection request matching the UUID and group.
	 *
	 * @param uuid the connection request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching connection request
	 * @throws PortalException if a matching connection request could not be found
	 */
	public static ConnectionRequest getConnectionRequestByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getConnectionRequestByUuidAndGroupId(uuid, groupId);
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
	public static List<ConnectionRequest> getConnectionRequests(
		int start, int end) {

		return getService().getConnectionRequests(start, end);
	}

	public static List<ConnectionRequest> getConnectionRequestsByMobileNo(
		String mobileNo) {

		return getService().getConnectionRequestsByMobileNo(mobileNo);
	}

	public static List<ConnectionRequest>
		getConnectionRequestsByMobileNoAndRequestStatus(
			String mobileNo, String requestStatus) {

		return getService().getConnectionRequestsByMobileNoAndRequestStatus(
			mobileNo, requestStatus);
	}

	/**
	 * Returns all the connection requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the connection requests
	 * @param companyId the primary key of the company
	 * @return the matching connection requests, or an empty list if no matches were found
	 */
	public static List<ConnectionRequest>
		getConnectionRequestsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getConnectionRequestsByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<ConnectionRequest>
		getConnectionRequestsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<ConnectionRequest> orderByComparator) {

		return getService().getConnectionRequestsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of connection requests.
	 *
	 * @return the number of connection requests
	 */
	public static int getConnectionRequestsCount() {
		return getService().getConnectionRequestsCount();
	}

	public static int getCountByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus) {

		return getService().getCountByMobileNoAndRequestStatus(
			mobileNo, requestStatus);
	}

	public static int getCurrentDraftCount(String mobileNo) {
		return getService().getCurrentDraftCount(mobileNo);
	}

	public static com.liferay.portal.kernel.json.JSONArray
		getDivisionWiseAvailableSlotsByDate(java.util.Date appointmentDate) {

		return getService().getDivisionWiseAvailableSlotsByDate(
			appointmentDate);
	}

	public static boolean getEmailAndSendOTPNEW(
		String emailId,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay) {

		return getService().getEmailAndSendOTPNEW(emailId, themeDisplay);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static int getMaxDraftCount() {
		return getService().getMaxDraftCount();
	}

	public static int getNewRequestCount(String mobileNo) {
		return getService().getNewRequestCount(mobileNo);
	}

	public static List<ConnectionRequest> getNewRequestsByMobileNo(
		String mobileNo) {

		return getService().getNewRequestsByMobileNo(mobileNo);
	}

	public static ConnectionRequest getOldConnectionDetails(
			long connectionRequestId)
		throws PortalException {

		return getService().getOldConnectionDetails(connectionRequestId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static String submitChangeRequestToSoap(long connectionRequestId) {
		return getService().submitChangeRequestToSoap(connectionRequestId);
	}

	public static String submitNewRequestToSoap(long connectionRequestId) {
		return getService().submitNewRequestToSoap(connectionRequestId);
	}

	public static String updateAddress(
		long connectionRequestId, Map<String, String> params) {

		return getService().updateAddress(connectionRequestId, params);
	}

	public static String updateAddress(
		String requestNo, Map<String, String> params) {

		return getService().updateAddress(requestNo, params);
	}

	public static String updateChecklistDocuments(
		long connectionRequestId, Map<String, String> params) {

		return getService().updateChecklistDocuments(
			connectionRequestId, params);
	}

	public static String updateChecklistDocuments(
		String requestNo, Map<String, String> params) {

		return getService().updateChecklistDocuments(requestNo, params);
	}

	public static String updateConnection(
		long connectionRequestId, Map<String, String> params) {

		return getService().updateConnection(connectionRequestId, params);
	}

	public static String updateConnection(
		String requestNo, Map<String, String> params) {

		return getService().updateConnection(requestNo, params);
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
	public static ConnectionRequest updateConnectionRequest(
		ConnectionRequest connectionRequest) {

		return getService().updateConnectionRequest(connectionRequest);
	}

	public static String updateConnectionRequest(
		long connectionRequestId, Map<String, String> params,
		String sectionPrefix) {

		return getService().updateConnectionRequest(
			connectionRequestId, params, sectionPrefix);
	}

	public static String updateConnectionRequest(
		String requestNo, Map<String, String> params, String sectionPrefix) {

		return getService().updateConnectionRequest(
			requestNo, params, sectionPrefix);
	}

	public static String updateConsumerDetails(
		long connectionRequestId, Map<String, String> params) {

		return getService().updateConsumerDetails(connectionRequestId, params);
	}

	public static String updateConsumerDetails(
		String requestNo, Map<String, String> params) {

		return getService().updateConsumerDetails(requestNo, params);
	}

	public static String updateImportantDocuments(
		long connectionRequestId, Map<String, String> params) {

		return getService().updateImportantDocuments(
			connectionRequestId, params);
	}

	public static String updateImportantDocuments(
		String requestNo, Map<String, String> params) {

		return getService().updateImportantDocuments(requestNo, params);
	}

	public static ConnectionRequestLocalService getService() {
		return _service;
	}

	private static volatile ConnectionRequestLocalService _service;

}