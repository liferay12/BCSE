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

import com.bses.connection2.exception.NoSuchConnectionRequestException;
import com.bses.connection2.model.ConnectionRequest;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Provides the local service interface for ConnectionRequest. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ConnectionRequestLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.bses.connection2.service.impl.ConnectionRequestLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the connection request local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link ConnectionRequestLocalServiceUtil} if injection and service tracking are not available.
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
	@Indexable(type = IndexableType.REINDEX)
	public ConnectionRequest addConnectionRequest(
		ConnectionRequest connectionRequest);

	public ConnectionRequest convertToConnectionRequest(String jsonString);

	public ConnectionRequest createChangeRequest(
			String caNumber, String requestType, String requestMode)
		throws PortalException;

	/**
	 * Creates a new connection request with the primary key. Does not add the connection request to the database.
	 *
	 * @param connectionRequestId the primary key for the new connection request
	 * @return the new connection request
	 */
	@Transactional(enabled = false)
	public ConnectionRequest createConnectionRequest(long connectionRequestId);

	public ConnectionRequest createConnectionRequest(
			String mobileNo, String emailId)
		throws PortalException;

	public ConnectionRequest createConnectionRequest(
			String mobileNo, String emailId, String requestType,
			String requestMode)
		throws PortalException;

	public ConnectionRequest deleteByConnectionRequestId(
			long connectionRequestId)
		throws NoSuchConnectionRequestException;

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
	@Indexable(type = IndexableType.DELETE)
	public ConnectionRequest deleteConnectionRequest(
		ConnectionRequest connectionRequest);

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
	@Indexable(type = IndexableType.DELETE)
	public ConnectionRequest deleteConnectionRequest(long connectionRequestId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	public int deleteStaleConnectionRequests(String mobileNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ConnectionRequest fetchConnectionRequest(long connectionRequestId);

	/**
	 * Returns the connection request matching the UUID and group.
	 *
	 * @param uuid the connection request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ConnectionRequest fetchConnectionRequestByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JSONArray getAvailableTimeSlotsByDateAndDivision(
		Date appointmentDate, String appointmentDivision);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getChangeRequestCount(String mobileNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getChangeRequestCountByCaNumber(String caNumber);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ConnectionRequest> getChangeRequestsByCaNumber(String caNumber);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ConnectionRequest> getChangeRequestsByMobileNo(String mobileNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public String getChangeRequestSubType(ConnectionRequest connectionRequest);

	/**
	 * Returns the connection request with the primary key.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request
	 * @throws PortalException if a connection request with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ConnectionRequest getConnectionRequest(long connectionRequestId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ConnectionRequest getConnectionRequest(String requestNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ConnectionRequest getConnectionRequestByMobileNoAndRequestNo(
		String mobileNo, String requestNo);

	/**
	 * Returns the connection request matching the UUID and group.
	 *
	 * @param uuid the connection request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching connection request
	 * @throws PortalException if a matching connection request could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ConnectionRequest getConnectionRequestByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ConnectionRequest> getConnectionRequests(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ConnectionRequest> getConnectionRequestsByMobileNo(
		String mobileNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ConnectionRequest>
		getConnectionRequestsByMobileNoAndRequestStatus(
			String mobileNo, String requestStatus);

	/**
	 * Returns all the connection requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the connection requests
	 * @param companyId the primary key of the company
	 * @return the matching connection requests, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ConnectionRequest> getConnectionRequestsByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ConnectionRequest> getConnectionRequestsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator);

	/**
	 * Returns the number of connection requests.
	 *
	 * @return the number of connection requests
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getConnectionRequestsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCountByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCurrentDraftCount(String mobileNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public JSONArray getDivisionWiseAvailableSlotsByDate(Date appointmentDate);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean getEmailAndSendOTPNEW(
		String emailId, ThemeDisplay themeDisplay);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getMaxDraftCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getNewRequestCount(String mobileNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ConnectionRequest> getNewRequestsByMobileNo(String mobileNo);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ConnectionRequest getOldConnectionDetails(long connectionRequestId)
		throws PortalException;

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public String submitChangeRequestToSoap(long connectionRequestId);

	public String submitNewRequestToSoap(long connectionRequestId);

	public String updateAddress(
		long connectionRequestId, Map<String, String> params);

	public String updateAddress(String requestNo, Map<String, String> params);

	public String updateChecklistDocuments(
		long connectionRequestId, Map<String, String> params);

	public String updateChecklistDocuments(
		String requestNo, Map<String, String> params);

	public String updateConnection(
		long connectionRequestId, Map<String, String> params);

	public String updateConnection(
		String requestNo, Map<String, String> params);

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
	@Indexable(type = IndexableType.REINDEX)
	public ConnectionRequest updateConnectionRequest(
		ConnectionRequest connectionRequest);

	public String updateConnectionRequest(
		long connectionRequestId, Map<String, String> params,
		String sectionPrefix);

	public String updateConnectionRequest(
		String requestNo, Map<String, String> params, String sectionPrefix);

	public String updateConsumerDetails(
		long connectionRequestId, Map<String, String> params);

	public String updateConsumerDetails(
		String requestNo, Map<String, String> params);

	public String updateImportantDocuments(
		long connectionRequestId, Map<String, String> params);

	public String updateImportantDocuments(
		String requestNo, Map<String, String> params);

}