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
 * Provides a wrapper for {@link RequestNumberSeqLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RequestNumberSeqLocalService
 * @generated
 */
public class RequestNumberSeqLocalServiceWrapper
	implements RequestNumberSeqLocalService,
			   ServiceWrapper<RequestNumberSeqLocalService> {

	public RequestNumberSeqLocalServiceWrapper(
		RequestNumberSeqLocalService requestNumberSeqLocalService) {

		_requestNumberSeqLocalService = requestNumberSeqLocalService;
	}

	/**
	 * Adds the request number seq to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestNumberSeqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param requestNumberSeq the request number seq
	 * @return the request number seq that was added
	 */
	@Override
	public com.bses.connection2.model.RequestNumberSeq addRequestNumberSeq(
		com.bses.connection2.model.RequestNumberSeq requestNumberSeq) {

		return _requestNumberSeqLocalService.addRequestNumberSeq(
			requestNumberSeq);
	}

	/**
	 * Creates a new request number seq with the primary key. Does not add the request number seq to the database.
	 *
	 * @param requestNumberSeqId the primary key for the new request number seq
	 * @return the new request number seq
	 */
	@Override
	public com.bses.connection2.model.RequestNumberSeq createRequestNumberSeq(
		long requestNumberSeqId) {

		return _requestNumberSeqLocalService.createRequestNumberSeq(
			requestNumberSeqId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestNumberSeqLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the request number seq with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestNumberSeqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq that was removed
	 * @throws PortalException if a request number seq with the primary key could not be found
	 */
	@Override
	public com.bses.connection2.model.RequestNumberSeq deleteRequestNumberSeq(
			long requestNumberSeqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestNumberSeqLocalService.deleteRequestNumberSeq(
			requestNumberSeqId);
	}

	/**
	 * Deletes the request number seq from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestNumberSeqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param requestNumberSeq the request number seq
	 * @return the request number seq that was removed
	 */
	@Override
	public com.bses.connection2.model.RequestNumberSeq deleteRequestNumberSeq(
		com.bses.connection2.model.RequestNumberSeq requestNumberSeq) {

		return _requestNumberSeqLocalService.deleteRequestNumberSeq(
			requestNumberSeq);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _requestNumberSeqLocalService.dynamicQuery();
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

		return _requestNumberSeqLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.RequestNumberSeqModelImpl</code>.
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

		return _requestNumberSeqLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.RequestNumberSeqModelImpl</code>.
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

		return _requestNumberSeqLocalService.dynamicQuery(
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

		return _requestNumberSeqLocalService.dynamicQueryCount(dynamicQuery);
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

		return _requestNumberSeqLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.bses.connection2.model.RequestNumberSeq fetchRequestNumberSeq(
		long requestNumberSeqId) {

		return _requestNumberSeqLocalService.fetchRequestNumberSeq(
			requestNumberSeqId);
	}

	/**
	 * Returns the request number seq matching the UUID and group.
	 *
	 * @param uuid the request number seq's UUID
	 * @param groupId the primary key of the group
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	@Override
	public com.bses.connection2.model.RequestNumberSeq
		fetchRequestNumberSeqByUuidAndGroupId(String uuid, long groupId) {

		return _requestNumberSeqLocalService.
			fetchRequestNumberSeqByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public long generateSeqNumber()
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestNumberSeqLocalService.generateSeqNumber();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _requestNumberSeqLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _requestNumberSeqLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _requestNumberSeqLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _requestNumberSeqLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestNumberSeqLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the request number seq with the primary key.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq
	 * @throws PortalException if a request number seq with the primary key could not be found
	 */
	@Override
	public com.bses.connection2.model.RequestNumberSeq getRequestNumberSeq(
			long requestNumberSeqId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestNumberSeqLocalService.getRequestNumberSeq(
			requestNumberSeqId);
	}

	/**
	 * Returns the request number seq matching the UUID and group.
	 *
	 * @param uuid the request number seq's UUID
	 * @param groupId the primary key of the group
	 * @return the matching request number seq
	 * @throws PortalException if a matching request number seq could not be found
	 */
	@Override
	public com.bses.connection2.model.RequestNumberSeq
			getRequestNumberSeqByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _requestNumberSeqLocalService.
			getRequestNumberSeqByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the request number seqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @return the range of request number seqs
	 */
	@Override
	public java.util.List<com.bses.connection2.model.RequestNumberSeq>
		getRequestNumberSeqs(int start, int end) {

		return _requestNumberSeqLocalService.getRequestNumberSeqs(start, end);
	}

	/**
	 * Returns all the request number seqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the request number seqs
	 * @param companyId the primary key of the company
	 * @return the matching request number seqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.bses.connection2.model.RequestNumberSeq>
		getRequestNumberSeqsByUuidAndCompanyId(String uuid, long companyId) {

		return _requestNumberSeqLocalService.
			getRequestNumberSeqsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of request number seqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the request number seqs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching request number seqs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.bses.connection2.model.RequestNumberSeq>
		getRequestNumberSeqsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.bses.connection2.model.RequestNumberSeq>
					orderByComparator) {

		return _requestNumberSeqLocalService.
			getRequestNumberSeqsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of request number seqs.
	 *
	 * @return the number of request number seqs
	 */
	@Override
	public int getRequestNumberSeqsCount() {
		return _requestNumberSeqLocalService.getRequestNumberSeqsCount();
	}

	/**
	 * Updates the request number seq in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestNumberSeqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param requestNumberSeq the request number seq
	 * @return the request number seq that was updated
	 */
	@Override
	public com.bses.connection2.model.RequestNumberSeq updateRequestNumberSeq(
		com.bses.connection2.model.RequestNumberSeq requestNumberSeq) {

		return _requestNumberSeqLocalService.updateRequestNumberSeq(
			requestNumberSeq);
	}

	@Override
	public RequestNumberSeqLocalService getWrappedService() {
		return _requestNumberSeqLocalService;
	}

	@Override
	public void setWrappedService(
		RequestNumberSeqLocalService requestNumberSeqLocalService) {

		_requestNumberSeqLocalService = requestNumberSeqLocalService;
	}

	private RequestNumberSeqLocalService _requestNumberSeqLocalService;

}