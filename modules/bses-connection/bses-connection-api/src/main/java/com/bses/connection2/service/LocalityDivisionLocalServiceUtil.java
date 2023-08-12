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

import com.bses.connection2.model.LocalityDivision;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for LocalityDivision. This utility wraps
 * <code>com.bses.connection2.service.impl.LocalityDivisionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LocalityDivisionLocalService
 * @generated
 */
public class LocalityDivisionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bses.connection2.service.impl.LocalityDivisionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the locality division to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LocalityDivisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param localityDivision the locality division
	 * @return the locality division that was added
	 */
	public static LocalityDivision addLocalityDivision(
		LocalityDivision localityDivision) {

		return getService().addLocalityDivision(localityDivision);
	}

	/**
	 * Creates a new locality division with the primary key. Does not add the locality division to the database.
	 *
	 * @param localityDivisionId the primary key for the new locality division
	 * @return the new locality division
	 */
	public static LocalityDivision createLocalityDivision(
		long localityDivisionId) {

		return getService().createLocalityDivision(localityDivisionId);
	}

	/**
	 * Deletes the locality division from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LocalityDivisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param localityDivision the locality division
	 * @return the locality division that was removed
	 */
	public static LocalityDivision deleteLocalityDivision(
		LocalityDivision localityDivision) {

		return getService().deleteLocalityDivision(localityDivision);
	}

	/**
	 * Deletes the locality division with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LocalityDivisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division that was removed
	 * @throws PortalException if a locality division with the primary key could not be found
	 */
	public static LocalityDivision deleteLocalityDivision(
			long localityDivisionId)
		throws PortalException {

		return getService().deleteLocalityDivision(localityDivisionId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.LocalityDivisionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.LocalityDivisionModelImpl</code>.
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

	public static LocalityDivision fetchLocalityDivision(
		long localityDivisionId) {

		return getService().fetchLocalityDivision(localityDivisionId);
	}

	/**
	 * Returns the locality division matching the UUID and group.
	 *
	 * @param uuid the locality division's UUID
	 * @param groupId the primary key of the group
	 * @return the matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchLocalityDivisionByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchLocalityDivisionByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.json.JSONArray
		getAvailableDivisionSlots(java.util.Date appointmentDate) {

		return getService().getAvailableDivisionSlots(appointmentDate);
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
	 * Returns the locality division with the primary key.
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division
	 * @throws PortalException if a locality division with the primary key could not be found
	 */
	public static LocalityDivision getLocalityDivision(long localityDivisionId)
		throws PortalException {

		return getService().getLocalityDivision(localityDivisionId);
	}

	public static LocalityDivision getLocalityDivisionByDivisionCode(
		String divisionCode) {

		return getService().getLocalityDivisionByDivisionCode(divisionCode);
	}

	/**
	 * Returns the locality division matching the UUID and group.
	 *
	 * @param uuid the locality division's UUID
	 * @param groupId the primary key of the group
	 * @return the matching locality division
	 * @throws PortalException if a matching locality division could not be found
	 */
	public static LocalityDivision getLocalityDivisionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getLocalityDivisionByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the locality divisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @return the range of locality divisions
	 */
	public static List<LocalityDivision> getLocalityDivisions(
		int start, int end) {

		return getService().getLocalityDivisions(start, end);
	}

	/**
	 * Returns all the locality divisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the locality divisions
	 * @param companyId the primary key of the company
	 * @return the matching locality divisions, or an empty list if no matches were found
	 */
	public static List<LocalityDivision> getLocalityDivisionsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getLocalityDivisionsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of locality divisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the locality divisions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching locality divisions, or an empty list if no matches were found
	 */
	public static List<LocalityDivision> getLocalityDivisionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getService().getLocalityDivisionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of locality divisions.
	 *
	 * @return the number of locality divisions
	 */
	public static int getLocalityDivisionsCount() {
		return getService().getLocalityDivisionsCount();
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

	public static List<LocalityDivision> searchLocalityDivision(String area) {
		return getService().searchLocalityDivision(area);
	}

	/**
	 * Updates the locality division in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LocalityDivisionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param localityDivision the locality division
	 * @return the locality division that was updated
	 */
	public static LocalityDivision updateLocalityDivision(
		LocalityDivision localityDivision) {

		return getService().updateLocalityDivision(localityDivision);
	}

	public static LocalityDivisionLocalService getService() {
		return _service;
	}

	private static volatile LocalityDivisionLocalService _service;

}