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

import com.bses.connection2.model.RequestNumberSeq;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for RequestNumberSeq. This utility wraps
 * <code>com.bses.connection2.service.impl.RequestNumberSeqLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RequestNumberSeqLocalService
 * @generated
 */
public class RequestNumberSeqLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bses.connection2.service.impl.RequestNumberSeqLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static RequestNumberSeq addRequestNumberSeq(
		RequestNumberSeq requestNumberSeq) {

		return getService().addRequestNumberSeq(requestNumberSeq);
	}

	/**
	 * Creates a new request number seq with the primary key. Does not add the request number seq to the database.
	 *
	 * @param requestNumberSeqId the primary key for the new request number seq
	 * @return the new request number seq
	 */
	public static RequestNumberSeq createRequestNumberSeq(
		long requestNumberSeqId) {

		return getService().createRequestNumberSeq(requestNumberSeqId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static RequestNumberSeq deleteRequestNumberSeq(
			long requestNumberSeqId)
		throws PortalException {

		return getService().deleteRequestNumberSeq(requestNumberSeqId);
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
	public static RequestNumberSeq deleteRequestNumberSeq(
		RequestNumberSeq requestNumberSeq) {

		return getService().deleteRequestNumberSeq(requestNumberSeq);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.RequestNumberSeqModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.RequestNumberSeqModelImpl</code>.
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

	public static RequestNumberSeq fetchRequestNumberSeq(
		long requestNumberSeqId) {

		return getService().fetchRequestNumberSeq(requestNumberSeqId);
	}

	/**
	 * Returns the request number seq matching the UUID and group.
	 *
	 * @param uuid the request number seq's UUID
	 * @param groupId the primary key of the group
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public static RequestNumberSeq fetchRequestNumberSeqByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchRequestNumberSeqByUuidAndGroupId(
			uuid, groupId);
	}

	public static long generateSeqNumber() throws PortalException {
		return getService().generateSeqNumber();
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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

	/**
	 * Returns the request number seq with the primary key.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq
	 * @throws PortalException if a request number seq with the primary key could not be found
	 */
	public static RequestNumberSeq getRequestNumberSeq(long requestNumberSeqId)
		throws PortalException {

		return getService().getRequestNumberSeq(requestNumberSeqId);
	}

	/**
	 * Returns the request number seq matching the UUID and group.
	 *
	 * @param uuid the request number seq's UUID
	 * @param groupId the primary key of the group
	 * @return the matching request number seq
	 * @throws PortalException if a matching request number seq could not be found
	 */
	public static RequestNumberSeq getRequestNumberSeqByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getRequestNumberSeqByUuidAndGroupId(uuid, groupId);
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
	public static List<RequestNumberSeq> getRequestNumberSeqs(
		int start, int end) {

		return getService().getRequestNumberSeqs(start, end);
	}

	/**
	 * Returns all the request number seqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the request number seqs
	 * @param companyId the primary key of the company
	 * @return the matching request number seqs, or an empty list if no matches were found
	 */
	public static List<RequestNumberSeq> getRequestNumberSeqsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getRequestNumberSeqsByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<RequestNumberSeq> getRequestNumberSeqsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		return getService().getRequestNumberSeqsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of request number seqs.
	 *
	 * @return the number of request number seqs
	 */
	public static int getRequestNumberSeqsCount() {
		return getService().getRequestNumberSeqsCount();
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
	public static RequestNumberSeq updateRequestNumberSeq(
		RequestNumberSeq requestNumberSeq) {

		return getService().updateRequestNumberSeq(requestNumberSeq);
	}

	public static RequestNumberSeqLocalService getService() {
		return _service;
	}

	private static volatile RequestNumberSeqLocalService _service;

}