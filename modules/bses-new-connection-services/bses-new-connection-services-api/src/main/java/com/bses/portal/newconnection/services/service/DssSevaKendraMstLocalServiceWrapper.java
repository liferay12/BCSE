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

package com.bses.portal.newconnection.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DssSevaKendraMstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DssSevaKendraMstLocalService
 * @generated
 */
public class DssSevaKendraMstLocalServiceWrapper
	implements DssSevaKendraMstLocalService,
			   ServiceWrapper<DssSevaKendraMstLocalService> {

	public DssSevaKendraMstLocalServiceWrapper(
		DssSevaKendraMstLocalService dssSevaKendraMstLocalService) {

		_dssSevaKendraMstLocalService = dssSevaKendraMstLocalService;
	}

	/**
	 * Adds the dss seva kendra mst to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DssSevaKendraMstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dssSevaKendraMst the dss seva kendra mst
	 * @return the dss seva kendra mst that was added
	 */
	@Override
	public com.bses.portal.newconnection.services.model.DssSevaKendraMst
		addDssSevaKendraMst(
			com.bses.portal.newconnection.services.model.DssSevaKendraMst
				dssSevaKendraMst) {

		return _dssSevaKendraMstLocalService.addDssSevaKendraMst(
			dssSevaKendraMst);
	}

	/**
	 * Creates a new dss seva kendra mst with the primary key. Does not add the dss seva kendra mst to the database.
	 *
	 * @param dssSevaKendraMstPK the primary key for the new dss seva kendra mst
	 * @return the new dss seva kendra mst
	 */
	@Override
	public com.bses.portal.newconnection.services.model.DssSevaKendraMst
		createDssSevaKendraMst(
			com.bses.portal.newconnection.services.service.persistence.
				DssSevaKendraMstPK dssSevaKendraMstPK) {

		return _dssSevaKendraMstLocalService.createDssSevaKendraMst(
			dssSevaKendraMstPK);
	}

	/**
	 * Deletes the dss seva kendra mst from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DssSevaKendraMstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dssSevaKendraMst the dss seva kendra mst
	 * @return the dss seva kendra mst that was removed
	 */
	@Override
	public com.bses.portal.newconnection.services.model.DssSevaKendraMst
		deleteDssSevaKendraMst(
			com.bses.portal.newconnection.services.model.DssSevaKendraMst
				dssSevaKendraMst) {

		return _dssSevaKendraMstLocalService.deleteDssSevaKendraMst(
			dssSevaKendraMst);
	}

	/**
	 * Deletes the dss seva kendra mst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DssSevaKendraMstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst that was removed
	 * @throws PortalException if a dss seva kendra mst with the primary key could not be found
	 */
	@Override
	public com.bses.portal.newconnection.services.model.DssSevaKendraMst
			deleteDssSevaKendraMst(
				com.bses.portal.newconnection.services.service.persistence.
					DssSevaKendraMstPK dssSevaKendraMstPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dssSevaKendraMstLocalService.deleteDssSevaKendraMst(
			dssSevaKendraMstPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dssSevaKendraMstLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dssSevaKendraMstLocalService.dynamicQuery();
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

		return _dssSevaKendraMstLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstModelImpl</code>.
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

		return _dssSevaKendraMstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstModelImpl</code>.
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

		return _dssSevaKendraMstLocalService.dynamicQuery(
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

		return _dssSevaKendraMstLocalService.dynamicQueryCount(dynamicQuery);
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

		return _dssSevaKendraMstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.bses.portal.newconnection.services.model.DssSevaKendraMst
		fetchDssSevaKendraMst(
			com.bses.portal.newconnection.services.service.persistence.
				DssSevaKendraMstPK dssSevaKendraMstPK) {

		return _dssSevaKendraMstLocalService.fetchDssSevaKendraMst(
			dssSevaKendraMstPK);
	}

	@Override
	public com.bses.portal.newconnection.services.model.DssSevaKendraMst
		getByDistrictAndName(String district, String name) {

		return _dssSevaKendraMstLocalService.getByDistrictAndName(
			district, name);
	}

	@Override
	public com.bses.portal.newconnection.services.model.DssSevaKendraMst
		getByName(String name) {

		return _dssSevaKendraMstLocalService.getByName(name);
	}

	/**
	 * Returns the dss seva kendra mst with the primary key.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst
	 * @throws PortalException if a dss seva kendra mst with the primary key could not be found
	 */
	@Override
	public com.bses.portal.newconnection.services.model.DssSevaKendraMst
			getDssSevaKendraMst(
				com.bses.portal.newconnection.services.service.persistence.
					DssSevaKendraMstPK dssSevaKendraMstPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dssSevaKendraMstLocalService.getDssSevaKendraMst(
			dssSevaKendraMstPK);
	}

	/**
	 * Returns a range of all the dss seva kendra msts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dss seva kendra msts
	 * @param end the upper bound of the range of dss seva kendra msts (not inclusive)
	 * @return the range of dss seva kendra msts
	 */
	@Override
	public java.util.List
		<com.bses.portal.newconnection.services.model.DssSevaKendraMst>
			getDssSevaKendraMsts(int start, int end) {

		return _dssSevaKendraMstLocalService.getDssSevaKendraMsts(start, end);
	}

	/**
	 * Returns the number of dss seva kendra msts.
	 *
	 * @return the number of dss seva kendra msts
	 */
	@Override
	public int getDssSevaKendraMstsCount() {
		return _dssSevaKendraMstLocalService.getDssSevaKendraMstsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dssSevaKendraMstLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dssSevaKendraMstLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.bses.portal.newconnection.services.model.DssSevaKendraMst
		isRegisteredKendra(String districtCode, String districtDescription) {

		return _dssSevaKendraMstLocalService.isRegisteredKendra(
			districtCode, districtDescription);
	}

	/**
	 * Updates the dss seva kendra mst in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DssSevaKendraMstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dssSevaKendraMst the dss seva kendra mst
	 * @return the dss seva kendra mst that was updated
	 */
	@Override
	public com.bses.portal.newconnection.services.model.DssSevaKendraMst
		updateDssSevaKendraMst(
			com.bses.portal.newconnection.services.model.DssSevaKendraMst
				dssSevaKendraMst) {

		return _dssSevaKendraMstLocalService.updateDssSevaKendraMst(
			dssSevaKendraMst);
	}

	@Override
	public DssSevaKendraMstLocalService getWrappedService() {
		return _dssSevaKendraMstLocalService;
	}

	@Override
	public void setWrappedService(
		DssSevaKendraMstLocalService dssSevaKendraMstLocalService) {

		_dssSevaKendraMstLocalService = dssSevaKendraMstLocalService;
	}

	private DssSevaKendraMstLocalService _dssSevaKendraMstLocalService;

}