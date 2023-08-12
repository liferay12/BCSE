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

import com.bses.portal.newconnection.services.model.DssSevaKendraMst;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for DssSevaKendraMst. This utility wraps
 * <code>com.bses.portal.newconnection.services.service.impl.DssSevaKendraMstLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DssSevaKendraMstLocalService
 * @generated
 */
public class DssSevaKendraMstLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bses.portal.newconnection.services.service.impl.DssSevaKendraMstLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static DssSevaKendraMst addDssSevaKendraMst(
		DssSevaKendraMst dssSevaKendraMst) {

		return getService().addDssSevaKendraMst(dssSevaKendraMst);
	}

	/**
	 * Creates a new dss seva kendra mst with the primary key. Does not add the dss seva kendra mst to the database.
	 *
	 * @param dssSevaKendraMstPK the primary key for the new dss seva kendra mst
	 * @return the new dss seva kendra mst
	 */
	public static DssSevaKendraMst createDssSevaKendraMst(
		com.bses.portal.newconnection.services.service.persistence.
			DssSevaKendraMstPK dssSevaKendraMstPK) {

		return getService().createDssSevaKendraMst(dssSevaKendraMstPK);
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
	public static DssSevaKendraMst deleteDssSevaKendraMst(
		DssSevaKendraMst dssSevaKendraMst) {

		return getService().deleteDssSevaKendraMst(dssSevaKendraMst);
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
	public static DssSevaKendraMst deleteDssSevaKendraMst(
			com.bses.portal.newconnection.services.service.persistence.
				DssSevaKendraMstPK dssSevaKendraMstPK)
		throws PortalException {

		return getService().deleteDssSevaKendraMst(dssSevaKendraMstPK);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstModelImpl</code>.
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

	public static DssSevaKendraMst fetchDssSevaKendraMst(
		com.bses.portal.newconnection.services.service.persistence.
			DssSevaKendraMstPK dssSevaKendraMstPK) {

		return getService().fetchDssSevaKendraMst(dssSevaKendraMstPK);
	}

	public static DssSevaKendraMst getByDistrictAndName(
		String district, String name) {

		return getService().getByDistrictAndName(district, name);
	}

	public static DssSevaKendraMst getByName(String name) {
		return getService().getByName(name);
	}

	/**
	 * Returns the dss seva kendra mst with the primary key.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst
	 * @throws PortalException if a dss seva kendra mst with the primary key could not be found
	 */
	public static DssSevaKendraMst getDssSevaKendraMst(
			com.bses.portal.newconnection.services.service.persistence.
				DssSevaKendraMstPK dssSevaKendraMstPK)
		throws PortalException {

		return getService().getDssSevaKendraMst(dssSevaKendraMstPK);
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
	public static List<DssSevaKendraMst> getDssSevaKendraMsts(
		int start, int end) {

		return getService().getDssSevaKendraMsts(start, end);
	}

	/**
	 * Returns the number of dss seva kendra msts.
	 *
	 * @return the number of dss seva kendra msts
	 */
	public static int getDssSevaKendraMstsCount() {
		return getService().getDssSevaKendraMstsCount();
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

	public static DssSevaKendraMst isRegisteredKendra(
		String districtCode, String districtDescription) {

		return getService().isRegisteredKendra(
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
	public static DssSevaKendraMst updateDssSevaKendraMst(
		DssSevaKendraMst dssSevaKendraMst) {

		return getService().updateDssSevaKendraMst(dssSevaKendraMst);
	}

	public static DssSevaKendraMstLocalService getService() {
		return _service;
	}

	private static volatile DssSevaKendraMstLocalService _service;

}