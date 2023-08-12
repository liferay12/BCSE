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
 * Provides a wrapper for {@link LocalityDivisionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LocalityDivisionLocalService
 * @generated
 */
public class LocalityDivisionLocalServiceWrapper
	implements LocalityDivisionLocalService,
			   ServiceWrapper<LocalityDivisionLocalService> {

	public LocalityDivisionLocalServiceWrapper(
		LocalityDivisionLocalService localityDivisionLocalService) {

		_localityDivisionLocalService = localityDivisionLocalService;
	}

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
	@Override
	public com.bses.connection2.model.LocalityDivision addLocalityDivision(
		com.bses.connection2.model.LocalityDivision localityDivision) {

		return _localityDivisionLocalService.addLocalityDivision(
			localityDivision);
	}

	/**
	 * Creates a new locality division with the primary key. Does not add the locality division to the database.
	 *
	 * @param localityDivisionId the primary key for the new locality division
	 * @return the new locality division
	 */
	@Override
	public com.bses.connection2.model.LocalityDivision createLocalityDivision(
		long localityDivisionId) {

		return _localityDivisionLocalService.createLocalityDivision(
			localityDivisionId);
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
	@Override
	public com.bses.connection2.model.LocalityDivision deleteLocalityDivision(
		com.bses.connection2.model.LocalityDivision localityDivision) {

		return _localityDivisionLocalService.deleteLocalityDivision(
			localityDivision);
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
	@Override
	public com.bses.connection2.model.LocalityDivision deleteLocalityDivision(
			long localityDivisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _localityDivisionLocalService.deleteLocalityDivision(
			localityDivisionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _localityDivisionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _localityDivisionLocalService.dynamicQuery();
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

		return _localityDivisionLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _localityDivisionLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _localityDivisionLocalService.dynamicQuery(
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

		return _localityDivisionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _localityDivisionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.bses.connection2.model.LocalityDivision fetchLocalityDivision(
		long localityDivisionId) {

		return _localityDivisionLocalService.fetchLocalityDivision(
			localityDivisionId);
	}

	/**
	 * Returns the locality division matching the UUID and group.
	 *
	 * @param uuid the locality division's UUID
	 * @param groupId the primary key of the group
	 * @return the matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public com.bses.connection2.model.LocalityDivision
		fetchLocalityDivisionByUuidAndGroupId(String uuid, long groupId) {

		return _localityDivisionLocalService.
			fetchLocalityDivisionByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _localityDivisionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getAvailableDivisionSlots(
		java.util.Date appointmentDate) {

		return _localityDivisionLocalService.getAvailableDivisionSlots(
			appointmentDate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _localityDivisionLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _localityDivisionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the locality division with the primary key.
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division
	 * @throws PortalException if a locality division with the primary key could not be found
	 */
	@Override
	public com.bses.connection2.model.LocalityDivision getLocalityDivision(
			long localityDivisionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _localityDivisionLocalService.getLocalityDivision(
			localityDivisionId);
	}

	@Override
	public com.bses.connection2.model.LocalityDivision
		getLocalityDivisionByDivisionCode(String divisionCode) {

		return _localityDivisionLocalService.getLocalityDivisionByDivisionCode(
			divisionCode);
	}

	/**
	 * Returns the locality division matching the UUID and group.
	 *
	 * @param uuid the locality division's UUID
	 * @param groupId the primary key of the group
	 * @return the matching locality division
	 * @throws PortalException if a matching locality division could not be found
	 */
	@Override
	public com.bses.connection2.model.LocalityDivision
			getLocalityDivisionByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _localityDivisionLocalService.
			getLocalityDivisionByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.bses.connection2.model.LocalityDivision>
		getLocalityDivisions(int start, int end) {

		return _localityDivisionLocalService.getLocalityDivisions(start, end);
	}

	/**
	 * Returns all the locality divisions matching the UUID and company.
	 *
	 * @param uuid the UUID of the locality divisions
	 * @param companyId the primary key of the company
	 * @return the matching locality divisions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.bses.connection2.model.LocalityDivision>
		getLocalityDivisionsByUuidAndCompanyId(String uuid, long companyId) {

		return _localityDivisionLocalService.
			getLocalityDivisionsByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.bses.connection2.model.LocalityDivision>
		getLocalityDivisionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.bses.connection2.model.LocalityDivision>
					orderByComparator) {

		return _localityDivisionLocalService.
			getLocalityDivisionsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of locality divisions.
	 *
	 * @return the number of locality divisions
	 */
	@Override
	public int getLocalityDivisionsCount() {
		return _localityDivisionLocalService.getLocalityDivisionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _localityDivisionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _localityDivisionLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<com.bses.connection2.model.LocalityDivision>
		searchLocalityDivision(String area) {

		return _localityDivisionLocalService.searchLocalityDivision(area);
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
	@Override
	public com.bses.connection2.model.LocalityDivision updateLocalityDivision(
		com.bses.connection2.model.LocalityDivision localityDivision) {

		return _localityDivisionLocalService.updateLocalityDivision(
			localityDivision);
	}

	@Override
	public LocalityDivisionLocalService getWrappedService() {
		return _localityDivisionLocalService;
	}

	@Override
	public void setWrappedService(
		LocalityDivisionLocalService localityDivisionLocalService) {

		_localityDivisionLocalService = localityDivisionLocalService;
	}

	private LocalityDivisionLocalService _localityDivisionLocalService;

}