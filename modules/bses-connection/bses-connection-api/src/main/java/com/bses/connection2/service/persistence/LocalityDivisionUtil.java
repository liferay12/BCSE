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

package com.bses.connection2.service.persistence;

import com.bses.connection2.model.LocalityDivision;

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
 * The persistence utility for the locality division service. This utility wraps <code>com.bses.connection2.service.persistence.impl.LocalityDivisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LocalityDivisionPersistence
 * @generated
 */
public class LocalityDivisionUtil {

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
	public static void clearCache(LocalityDivision localityDivision) {
		getPersistence().clearCache(localityDivision);
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
	public static Map<Serializable, LocalityDivision> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LocalityDivision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LocalityDivision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LocalityDivision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LocalityDivision update(LocalityDivision localityDivision) {
		return getPersistence().update(localityDivision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LocalityDivision update(
		LocalityDivision localityDivision, ServiceContext serviceContext) {

		return getPersistence().update(localityDivision, serviceContext);
	}

	/**
	 * Returns all the locality divisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching locality divisions
	 */
	public static List<LocalityDivision> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the locality divisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @return the range of matching locality divisions
	 */
	public static List<LocalityDivision> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the locality divisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the locality divisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByUuid_First(
			String uuid, OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByUuid_First(
		String uuid, OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByUuid_Last(
			String uuid, OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByUuid_Last(
		String uuid, OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the locality divisions before and after the current locality division in the ordered set where uuid = &#63;.
	 *
	 * @param localityDivisionId the primary key of the current locality division
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public static LocalityDivision[] findByUuid_PrevAndNext(
			long localityDivisionId, String uuid,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByUuid_PrevAndNext(
			localityDivisionId, uuid, orderByComparator);
	}

	/**
	 * Removes all the locality divisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of locality divisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching locality divisions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the locality division where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLocalityDivisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByUUID_G(String uuid, long groupId)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the locality division where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the locality division where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the locality division where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the locality division that was removed
	 */
	public static LocalityDivision removeByUUID_G(String uuid, long groupId)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of locality divisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching locality divisions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the locality divisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching locality divisions
	 */
	public static List<LocalityDivision> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the locality divisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @return the range of matching locality divisions
	 */
	public static List<LocalityDivision> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the locality divisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the locality divisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the locality divisions before and after the current locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param localityDivisionId the primary key of the current locality division
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public static LocalityDivision[] findByUuid_C_PrevAndNext(
			long localityDivisionId, String uuid, long companyId,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			localityDivisionId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the locality divisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of locality divisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching locality divisions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the locality divisions where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @return the matching locality divisions
	 */
	public static List<LocalityDivision> findByLocalityName(
		String localityName) {

		return getPersistence().findByLocalityName(localityName);
	}

	/**
	 * Returns a range of all the locality divisions where localityName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param localityName the locality name
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @return the range of matching locality divisions
	 */
	public static List<LocalityDivision> findByLocalityName(
		String localityName, int start, int end) {

		return getPersistence().findByLocalityName(localityName, start, end);
	}

	/**
	 * Returns an ordered range of all the locality divisions where localityName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param localityName the locality name
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByLocalityName(
		String localityName, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().findByLocalityName(
			localityName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the locality divisions where localityName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param localityName the locality name
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByLocalityName(
		String localityName, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByLocalityName(
			localityName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByLocalityName_First(
			String localityName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByLocalityName_First(
			localityName, orderByComparator);
	}

	/**
	 * Returns the first locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByLocalityName_First(
		String localityName,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByLocalityName_First(
			localityName, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByLocalityName_Last(
			String localityName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByLocalityName_Last(
			localityName, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByLocalityName_Last(
		String localityName,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByLocalityName_Last(
			localityName, orderByComparator);
	}

	/**
	 * Returns the locality divisions before and after the current locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityDivisionId the primary key of the current locality division
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public static LocalityDivision[] findByLocalityName_PrevAndNext(
			long localityDivisionId, String localityName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByLocalityName_PrevAndNext(
			localityDivisionId, localityName, orderByComparator);
	}

	/**
	 * Removes all the locality divisions where localityName = &#63; from the database.
	 *
	 * @param localityName the locality name
	 */
	public static void removeByLocalityName(String localityName) {
		getPersistence().removeByLocalityName(localityName);
	}

	/**
	 * Returns the number of locality divisions where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @return the number of matching locality divisions
	 */
	public static int countByLocalityName(String localityName) {
		return getPersistence().countByLocalityName(localityName);
	}

	/**
	 * Returns all the locality divisions where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @return the matching locality divisions
	 */
	public static List<LocalityDivision> findByDivisionCode(
		String divisionCode) {

		return getPersistence().findByDivisionCode(divisionCode);
	}

	/**
	 * Returns a range of all the locality divisions where divisionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param divisionCode the division code
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @return the range of matching locality divisions
	 */
	public static List<LocalityDivision> findByDivisionCode(
		String divisionCode, int start, int end) {

		return getPersistence().findByDivisionCode(divisionCode, start, end);
	}

	/**
	 * Returns an ordered range of all the locality divisions where divisionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param divisionCode the division code
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByDivisionCode(
		String divisionCode, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().findByDivisionCode(
			divisionCode, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the locality divisions where divisionCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param divisionCode the division code
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByDivisionCode(
		String divisionCode, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByDivisionCode(
			divisionCode, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByDivisionCode_First(
			String divisionCode,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByDivisionCode_First(
			divisionCode, orderByComparator);
	}

	/**
	 * Returns the first locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByDivisionCode_First(
		String divisionCode,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByDivisionCode_First(
			divisionCode, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByDivisionCode_Last(
			String divisionCode,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByDivisionCode_Last(
			divisionCode, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByDivisionCode_Last(
		String divisionCode,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByDivisionCode_Last(
			divisionCode, orderByComparator);
	}

	/**
	 * Returns the locality divisions before and after the current locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param localityDivisionId the primary key of the current locality division
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public static LocalityDivision[] findByDivisionCode_PrevAndNext(
			long localityDivisionId, String divisionCode,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByDivisionCode_PrevAndNext(
			localityDivisionId, divisionCode, orderByComparator);
	}

	/**
	 * Removes all the locality divisions where divisionCode = &#63; from the database.
	 *
	 * @param divisionCode the division code
	 */
	public static void removeByDivisionCode(String divisionCode) {
		getPersistence().removeByDivisionCode(divisionCode);
	}

	/**
	 * Returns the number of locality divisions where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @return the number of matching locality divisions
	 */
	public static int countByDivisionCode(String divisionCode) {
		return getPersistence().countByDivisionCode(divisionCode);
	}

	/**
	 * Returns all the locality divisions where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @return the matching locality divisions
	 */
	public static List<LocalityDivision> findByDivisionName(
		String divisionName) {

		return getPersistence().findByDivisionName(divisionName);
	}

	/**
	 * Returns a range of all the locality divisions where divisionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param divisionName the division name
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @return the range of matching locality divisions
	 */
	public static List<LocalityDivision> findByDivisionName(
		String divisionName, int start, int end) {

		return getPersistence().findByDivisionName(divisionName, start, end);
	}

	/**
	 * Returns an ordered range of all the locality divisions where divisionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param divisionName the division name
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByDivisionName(
		String divisionName, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().findByDivisionName(
			divisionName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the locality divisions where divisionName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param divisionName the division name
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByDivisionName(
		String divisionName, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByDivisionName(
			divisionName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByDivisionName_First(
			String divisionName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByDivisionName_First(
			divisionName, orderByComparator);
	}

	/**
	 * Returns the first locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByDivisionName_First(
		String divisionName,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByDivisionName_First(
			divisionName, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByDivisionName_Last(
			String divisionName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByDivisionName_Last(
			divisionName, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByDivisionName_Last(
		String divisionName,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByDivisionName_Last(
			divisionName, orderByComparator);
	}

	/**
	 * Returns the locality divisions before and after the current locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param localityDivisionId the primary key of the current locality division
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public static LocalityDivision[] findByDivisionName_PrevAndNext(
			long localityDivisionId, String divisionName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByDivisionName_PrevAndNext(
			localityDivisionId, divisionName, orderByComparator);
	}

	/**
	 * Removes all the locality divisions where divisionName = &#63; from the database.
	 *
	 * @param divisionName the division name
	 */
	public static void removeByDivisionName(String divisionName) {
		getPersistence().removeByDivisionName(divisionName);
	}

	/**
	 * Returns the number of locality divisions where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @return the number of matching locality divisions
	 */
	public static int countByDivisionName(String divisionName) {
		return getPersistence().countByDivisionName(divisionName);
	}

	/**
	 * Returns all the locality divisions where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @return the matching locality divisions
	 */
	public static List<LocalityDivision> findByComplaintCenter(
		String complaintCenter) {

		return getPersistence().findByComplaintCenter(complaintCenter);
	}

	/**
	 * Returns a range of all the locality divisions where complaintCenter = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param complaintCenter the complaint center
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @return the range of matching locality divisions
	 */
	public static List<LocalityDivision> findByComplaintCenter(
		String complaintCenter, int start, int end) {

		return getPersistence().findByComplaintCenter(
			complaintCenter, start, end);
	}

	/**
	 * Returns an ordered range of all the locality divisions where complaintCenter = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param complaintCenter the complaint center
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByComplaintCenter(
		String complaintCenter, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().findByComplaintCenter(
			complaintCenter, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the locality divisions where complaintCenter = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param complaintCenter the complaint center
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching locality divisions
	 */
	public static List<LocalityDivision> findByComplaintCenter(
		String complaintCenter, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByComplaintCenter(
			complaintCenter, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByComplaintCenter_First(
			String complaintCenter,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByComplaintCenter_First(
			complaintCenter, orderByComparator);
	}

	/**
	 * Returns the first locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByComplaintCenter_First(
		String complaintCenter,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByComplaintCenter_First(
			complaintCenter, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public static LocalityDivision findByComplaintCenter_Last(
			String complaintCenter,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByComplaintCenter_Last(
			complaintCenter, orderByComparator);
	}

	/**
	 * Returns the last locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public static LocalityDivision fetchByComplaintCenter_Last(
		String complaintCenter,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().fetchByComplaintCenter_Last(
			complaintCenter, orderByComparator);
	}

	/**
	 * Returns the locality divisions before and after the current locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param localityDivisionId the primary key of the current locality division
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public static LocalityDivision[] findByComplaintCenter_PrevAndNext(
			long localityDivisionId, String complaintCenter,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByComplaintCenter_PrevAndNext(
			localityDivisionId, complaintCenter, orderByComparator);
	}

	/**
	 * Removes all the locality divisions where complaintCenter = &#63; from the database.
	 *
	 * @param complaintCenter the complaint center
	 */
	public static void removeByComplaintCenter(String complaintCenter) {
		getPersistence().removeByComplaintCenter(complaintCenter);
	}

	/**
	 * Returns the number of locality divisions where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @return the number of matching locality divisions
	 */
	public static int countByComplaintCenter(String complaintCenter) {
		return getPersistence().countByComplaintCenter(complaintCenter);
	}

	/**
	 * Caches the locality division in the entity cache if it is enabled.
	 *
	 * @param localityDivision the locality division
	 */
	public static void cacheResult(LocalityDivision localityDivision) {
		getPersistence().cacheResult(localityDivision);
	}

	/**
	 * Caches the locality divisions in the entity cache if it is enabled.
	 *
	 * @param localityDivisions the locality divisions
	 */
	public static void cacheResult(List<LocalityDivision> localityDivisions) {
		getPersistence().cacheResult(localityDivisions);
	}

	/**
	 * Creates a new locality division with the primary key. Does not add the locality division to the database.
	 *
	 * @param localityDivisionId the primary key for the new locality division
	 * @return the new locality division
	 */
	public static LocalityDivision create(long localityDivisionId) {
		return getPersistence().create(localityDivisionId);
	}

	/**
	 * Removes the locality division with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division that was removed
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public static LocalityDivision remove(long localityDivisionId)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().remove(localityDivisionId);
	}

	public static LocalityDivision updateImpl(
		LocalityDivision localityDivision) {

		return getPersistence().updateImpl(localityDivision);
	}

	/**
	 * Returns the locality division with the primary key or throws a <code>NoSuchLocalityDivisionException</code> if it could not be found.
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public static LocalityDivision findByPrimaryKey(long localityDivisionId)
		throws com.bses.connection2.exception.NoSuchLocalityDivisionException {

		return getPersistence().findByPrimaryKey(localityDivisionId);
	}

	/**
	 * Returns the locality division with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division, or <code>null</code> if a locality division with the primary key could not be found
	 */
	public static LocalityDivision fetchByPrimaryKey(long localityDivisionId) {
		return getPersistence().fetchByPrimaryKey(localityDivisionId);
	}

	/**
	 * Returns all the locality divisions.
	 *
	 * @return the locality divisions
	 */
	public static List<LocalityDivision> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the locality divisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @return the range of locality divisions
	 */
	public static List<LocalityDivision> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the locality divisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of locality divisions
	 */
	public static List<LocalityDivision> findAll(
		int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the locality divisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>LocalityDivisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of locality divisions
	 * @param end the upper bound of the range of locality divisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of locality divisions
	 */
	public static List<LocalityDivision> findAll(
		int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the locality divisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of locality divisions.
	 *
	 * @return the number of locality divisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static LocalityDivisionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<LocalityDivisionPersistence, LocalityDivisionPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			LocalityDivisionPersistence.class);

		ServiceTracker<LocalityDivisionPersistence, LocalityDivisionPersistence>
			serviceTracker =
				new ServiceTracker
					<LocalityDivisionPersistence, LocalityDivisionPersistence>(
						bundle.getBundleContext(),
						LocalityDivisionPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}