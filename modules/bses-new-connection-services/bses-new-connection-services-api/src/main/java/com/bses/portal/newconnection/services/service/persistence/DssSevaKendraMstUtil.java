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

package com.bses.portal.newconnection.services.service.persistence;

import com.bses.portal.newconnection.services.model.DssSevaKendraMst;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the dss seva kendra mst service. This utility wraps <code>com.bses.portal.newconnection.services.service.persistence.impl.DssSevaKendraMstPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DssSevaKendraMstPersistence
 * @generated
 */
public class DssSevaKendraMstUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(DssSevaKendraMst dssSevaKendraMst) {
		getPersistence().clearCache(dssSevaKendraMst);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, DssSevaKendraMst> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DssSevaKendraMst> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DssSevaKendraMst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DssSevaKendraMst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DssSevaKendraMst> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DssSevaKendraMst update(DssSevaKendraMst dssSevaKendraMst) {
		return getPersistence().update(dssSevaKendraMst);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DssSevaKendraMst update(
		DssSevaKendraMst dssSevaKendraMst, ServiceContext serviceContext) {

		return getPersistence().update(dssSevaKendraMst, serviceContext);
	}

	/**
	 * Returns the dss seva kendra mst where district = &#63; and name = &#63; or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the matching dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a matching dss seva kendra mst could not be found
	 */
	public static DssSevaKendraMst findByByDistrictAndName(
			String district, String name)
		throws com.bses.portal.newconnection.services.exception.
			NoSuchDssSevaKendraMstException {

		return getPersistence().findByByDistrictAndName(district, name);
	}

	/**
	 * Returns the dss seva kendra mst where district = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public static DssSevaKendraMst fetchByByDistrictAndName(
		String district, String name) {

		return getPersistence().fetchByByDistrictAndName(district, name);
	}

	/**
	 * Returns the dss seva kendra mst where district = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param district the district
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public static DssSevaKendraMst fetchByByDistrictAndName(
		String district, String name, boolean useFinderCache) {

		return getPersistence().fetchByByDistrictAndName(
			district, name, useFinderCache);
	}

	/**
	 * Removes the dss seva kendra mst where district = &#63; and name = &#63; from the database.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the dss seva kendra mst that was removed
	 */
	public static DssSevaKendraMst removeByByDistrictAndName(
			String district, String name)
		throws com.bses.portal.newconnection.services.exception.
			NoSuchDssSevaKendraMstException {

		return getPersistence().removeByByDistrictAndName(district, name);
	}

	/**
	 * Returns the number of dss seva kendra msts where district = &#63; and name = &#63;.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the number of matching dss seva kendra msts
	 */
	public static int countByByDistrictAndName(String district, String name) {
		return getPersistence().countByByDistrictAndName(district, name);
	}

	/**
	 * Returns the dss seva kendra mst where district = &#63; or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param district the district
	 * @return the matching dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a matching dss seva kendra mst could not be found
	 */
	public static DssSevaKendraMst findByByDistrict(String district)
		throws com.bses.portal.newconnection.services.exception.
			NoSuchDssSevaKendraMstException {

		return getPersistence().findByByDistrict(district);
	}

	/**
	 * Returns the dss seva kendra mst where district = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param district the district
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public static DssSevaKendraMst fetchByByDistrict(String district) {
		return getPersistence().fetchByByDistrict(district);
	}

	/**
	 * Returns the dss seva kendra mst where district = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param district the district
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public static DssSevaKendraMst fetchByByDistrict(
		String district, boolean useFinderCache) {

		return getPersistence().fetchByByDistrict(district, useFinderCache);
	}

	/**
	 * Removes the dss seva kendra mst where district = &#63; from the database.
	 *
	 * @param district the district
	 * @return the dss seva kendra mst that was removed
	 */
	public static DssSevaKendraMst removeByByDistrict(String district)
		throws com.bses.portal.newconnection.services.exception.
			NoSuchDssSevaKendraMstException {

		return getPersistence().removeByByDistrict(district);
	}

	/**
	 * Returns the number of dss seva kendra msts where district = &#63;.
	 *
	 * @param district the district
	 * @return the number of matching dss seva kendra msts
	 */
	public static int countByByDistrict(String district) {
		return getPersistence().countByByDistrict(district);
	}

	/**
	 * Returns the dss seva kendra mst where name = &#63; or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a matching dss seva kendra mst could not be found
	 */
	public static DssSevaKendraMst findByByName(String name)
		throws com.bses.portal.newconnection.services.exception.
			NoSuchDssSevaKendraMstException {

		return getPersistence().findByByName(name);
	}

	/**
	 * Returns the dss seva kendra mst where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public static DssSevaKendraMst fetchByByName(String name) {
		return getPersistence().fetchByByName(name);
	}

	/**
	 * Returns the dss seva kendra mst where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public static DssSevaKendraMst fetchByByName(
		String name, boolean useFinderCache) {

		return getPersistence().fetchByByName(name, useFinderCache);
	}

	/**
	 * Removes the dss seva kendra mst where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the dss seva kendra mst that was removed
	 */
	public static DssSevaKendraMst removeByByName(String name)
		throws com.bses.portal.newconnection.services.exception.
			NoSuchDssSevaKendraMstException {

		return getPersistence().removeByByName(name);
	}

	/**
	 * Returns the number of dss seva kendra msts where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching dss seva kendra msts
	 */
	public static int countByByName(String name) {
		return getPersistence().countByByName(name);
	}

	/**
	 * Caches the dss seva kendra mst in the entity cache if it is enabled.
	 *
	 * @param dssSevaKendraMst the dss seva kendra mst
	 */
	public static void cacheResult(DssSevaKendraMst dssSevaKendraMst) {
		getPersistence().cacheResult(dssSevaKendraMst);
	}

	/**
	 * Caches the dss seva kendra msts in the entity cache if it is enabled.
	 *
	 * @param dssSevaKendraMsts the dss seva kendra msts
	 */
	public static void cacheResult(List<DssSevaKendraMst> dssSevaKendraMsts) {
		getPersistence().cacheResult(dssSevaKendraMsts);
	}

	/**
	 * Creates a new dss seva kendra mst with the primary key. Does not add the dss seva kendra mst to the database.
	 *
	 * @param dssSevaKendraMstPK the primary key for the new dss seva kendra mst
	 * @return the new dss seva kendra mst
	 */
	public static DssSevaKendraMst create(
		DssSevaKendraMstPK dssSevaKendraMstPK) {

		return getPersistence().create(dssSevaKendraMstPK);
	}

	/**
	 * Removes the dss seva kendra mst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst that was removed
	 * @throws NoSuchDssSevaKendraMstException if a dss seva kendra mst with the primary key could not be found
	 */
	public static DssSevaKendraMst remove(DssSevaKendraMstPK dssSevaKendraMstPK)
		throws com.bses.portal.newconnection.services.exception.
			NoSuchDssSevaKendraMstException {

		return getPersistence().remove(dssSevaKendraMstPK);
	}

	public static DssSevaKendraMst updateImpl(
		DssSevaKendraMst dssSevaKendraMst) {

		return getPersistence().updateImpl(dssSevaKendraMst);
	}

	/**
	 * Returns the dss seva kendra mst with the primary key or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a dss seva kendra mst with the primary key could not be found
	 */
	public static DssSevaKendraMst findByPrimaryKey(
			DssSevaKendraMstPK dssSevaKendraMstPK)
		throws com.bses.portal.newconnection.services.exception.
			NoSuchDssSevaKendraMstException {

		return getPersistence().findByPrimaryKey(dssSevaKendraMstPK);
	}

	/**
	 * Returns the dss seva kendra mst with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst, or <code>null</code> if a dss seva kendra mst with the primary key could not be found
	 */
	public static DssSevaKendraMst fetchByPrimaryKey(
		DssSevaKendraMstPK dssSevaKendraMstPK) {

		return getPersistence().fetchByPrimaryKey(dssSevaKendraMstPK);
	}

	/**
	 * Returns all the dss seva kendra msts.
	 *
	 * @return the dss seva kendra msts
	 */
	public static List<DssSevaKendraMst> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the dss seva kendra msts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DssSevaKendraMstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dss seva kendra msts
	 * @param end the upper bound of the range of dss seva kendra msts (not inclusive)
	 * @return the range of dss seva kendra msts
	 */
	public static List<DssSevaKendraMst> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the dss seva kendra msts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DssSevaKendraMstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dss seva kendra msts
	 * @param end the upper bound of the range of dss seva kendra msts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dss seva kendra msts
	 */
	public static List<DssSevaKendraMst> findAll(
		int start, int end,
		OrderByComparator<DssSevaKendraMst> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dss seva kendra msts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DssSevaKendraMstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dss seva kendra msts
	 * @param end the upper bound of the range of dss seva kendra msts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dss seva kendra msts
	 */
	public static List<DssSevaKendraMst> findAll(
		int start, int end,
		OrderByComparator<DssSevaKendraMst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the dss seva kendra msts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of dss seva kendra msts.
	 *
	 * @return the number of dss seva kendra msts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static Set<String> getCompoundPKColumnNames() {
		return getPersistence().getCompoundPKColumnNames();
	}

	public static DssSevaKendraMstPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<DssSevaKendraMstPersistence, DssSevaKendraMstPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			DssSevaKendraMstPersistence.class);

		ServiceTracker<DssSevaKendraMstPersistence, DssSevaKendraMstPersistence>
			serviceTracker =
				new ServiceTracker
					<DssSevaKendraMstPersistence, DssSevaKendraMstPersistence>(
						bundle.getBundleContext(),
						DssSevaKendraMstPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}