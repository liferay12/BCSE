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

import com.bses.connection2.model.ConnectionRequest;

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
 * The persistence utility for the connection request service. This utility wraps <code>com.bses.connection2.service.persistence.impl.ConnectionRequestPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestPersistence
 * @generated
 */
public class ConnectionRequestUtil {

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
	public static void clearCache(ConnectionRequest connectionRequest) {
		getPersistence().clearCache(connectionRequest);
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
	public static Map<Serializable, ConnectionRequest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ConnectionRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ConnectionRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ConnectionRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ConnectionRequest update(
		ConnectionRequest connectionRequest) {

		return getPersistence().update(connectionRequest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ConnectionRequest update(
		ConnectionRequest connectionRequest, ServiceContext serviceContext) {

		return getPersistence().update(connectionRequest, serviceContext);
	}

	/**
	 * Returns all the connection requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the connection requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByUuid_First(
			String uuid, OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByUuid_First(
		String uuid, OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByUuid_Last(
			String uuid, OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByUuid_Last(
		String uuid, OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where uuid = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[] findByUuid_PrevAndNext(
			long connectionRequestId, String uuid,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByUuid_PrevAndNext(
			connectionRequestId, uuid, orderByComparator);
	}

	/**
	 * Removes all the connection requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of connection requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching connection requests
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the connection request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchConnectionRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByUUID_G(String uuid, long groupId)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the connection request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the connection request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the connection request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the connection request that was removed
	 */
	public static ConnectionRequest removeByUUID_G(String uuid, long groupId)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of connection requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching connection requests
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the connection requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the connection requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[] findByUuid_C_PrevAndNext(
			long connectionRequestId, String uuid, long companyId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByUuid_C_PrevAndNext(
			connectionRequestId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the connection requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of connection requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching connection requests
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByRequestNo(String requestNo) {
		return getPersistence().findByRequestNo(requestNo);
	}

	/**
	 * Returns a range of all the connection requests where requestNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param requestNo the request no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByRequestNo(
		String requestNo, int start, int end) {

		return getPersistence().findByRequestNo(requestNo, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where requestNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param requestNo the request no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByRequestNo(
		String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByRequestNo(
			requestNo, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where requestNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param requestNo the request no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByRequestNo(
		String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByRequestNo(
			requestNo, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByRequestNo_First(
			String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByRequestNo_First(
			requestNo, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByRequestNo_First(
		String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByRequestNo_First(
			requestNo, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByRequestNo_Last(
			String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByRequestNo_Last(
			requestNo, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByRequestNo_Last(
		String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByRequestNo_Last(
			requestNo, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[] findByRequestNo_PrevAndNext(
			long connectionRequestId, String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByRequestNo_PrevAndNext(
			connectionRequestId, requestNo, orderByComparator);
	}

	/**
	 * Removes all the connection requests where requestNo = &#63; from the database.
	 *
	 * @param requestNo the request no
	 */
	public static void removeByRequestNo(String requestNo) {
		getPersistence().removeByRequestNo(requestNo);
	}

	/**
	 * Returns the number of connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the number of matching connection requests
	 */
	public static int countByRequestNo(String requestNo) {
		return getPersistence().countByRequestNo(requestNo);
	}

	/**
	 * Returns all the connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByOrderNo(String requestNo) {
		return getPersistence().findByOrderNo(requestNo);
	}

	/**
	 * Returns a range of all the connection requests where requestNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param requestNo the request no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByOrderNo(
		String requestNo, int start, int end) {

		return getPersistence().findByOrderNo(requestNo, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where requestNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param requestNo the request no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByOrderNo(
		String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByOrderNo(
			requestNo, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where requestNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param requestNo the request no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByOrderNo(
		String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByOrderNo(
			requestNo, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByOrderNo_First(
			String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByOrderNo_First(
			requestNo, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByOrderNo_First(
		String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByOrderNo_First(
			requestNo, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByOrderNo_Last(
			String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByOrderNo_Last(
			requestNo, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByOrderNo_Last(
		String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByOrderNo_Last(
			requestNo, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[] findByOrderNo_PrevAndNext(
			long connectionRequestId, String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByOrderNo_PrevAndNext(
			connectionRequestId, requestNo, orderByComparator);
	}

	/**
	 * Removes all the connection requests where requestNo = &#63; from the database.
	 *
	 * @param requestNo the request no
	 */
	public static void removeByOrderNo(String requestNo) {
		getPersistence().removeByOrderNo(requestNo);
	}

	/**
	 * Returns the number of connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the number of matching connection requests
	 */
	public static int countByOrderNo(String requestNo) {
		return getPersistence().countByOrderNo(requestNo);
	}

	/**
	 * Returns all the connection requests where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByCaNumber(String caNumber) {
		return getPersistence().findByCaNumber(caNumber);
	}

	/**
	 * Returns a range of all the connection requests where caNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param caNumber the ca number
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByCaNumber(
		String caNumber, int start, int end) {

		return getPersistence().findByCaNumber(caNumber, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where caNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param caNumber the ca number
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByCaNumber(
		String caNumber, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByCaNumber(
			caNumber, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where caNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param caNumber the ca number
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByCaNumber(
		String caNumber, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCaNumber(
			caNumber, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByCaNumber_First(
			String caNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByCaNumber_First(
			caNumber, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByCaNumber_First(
		String caNumber,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByCaNumber_First(
			caNumber, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByCaNumber_Last(
			String caNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByCaNumber_Last(
			caNumber, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByCaNumber_Last(
		String caNumber,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByCaNumber_Last(
			caNumber, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[] findByCaNumber_PrevAndNext(
			long connectionRequestId, String caNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByCaNumber_PrevAndNext(
			connectionRequestId, caNumber, orderByComparator);
	}

	/**
	 * Removes all the connection requests where caNumber = &#63; from the database.
	 *
	 * @param caNumber the ca number
	 */
	public static void removeByCaNumber(String caNumber) {
		getPersistence().removeByCaNumber(caNumber);
	}

	/**
	 * Returns the number of connection requests where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @return the number of matching connection requests
	 */
	public static int countByCaNumber(String caNumber) {
		return getPersistence().countByCaNumber(caNumber);
	}

	/**
	 * Returns all the connection requests where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByBpNumber(String bpNumber) {
		return getPersistence().findByBpNumber(bpNumber);
	}

	/**
	 * Returns a range of all the connection requests where bpNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param bpNumber the bp number
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByBpNumber(
		String bpNumber, int start, int end) {

		return getPersistence().findByBpNumber(bpNumber, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where bpNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param bpNumber the bp number
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByBpNumber(
		String bpNumber, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByBpNumber(
			bpNumber, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where bpNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param bpNumber the bp number
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByBpNumber(
		String bpNumber, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByBpNumber(
			bpNumber, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByBpNumber_First(
			String bpNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByBpNumber_First(
			bpNumber, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByBpNumber_First(
		String bpNumber,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByBpNumber_First(
			bpNumber, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByBpNumber_Last(
			String bpNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByBpNumber_Last(
			bpNumber, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByBpNumber_Last(
		String bpNumber,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByBpNumber_Last(
			bpNumber, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[] findByBpNumber_PrevAndNext(
			long connectionRequestId, String bpNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByBpNumber_PrevAndNext(
			connectionRequestId, bpNumber, orderByComparator);
	}

	/**
	 * Removes all the connection requests where bpNumber = &#63; from the database.
	 *
	 * @param bpNumber the bp number
	 */
	public static void removeByBpNumber(String bpNumber) {
		getPersistence().removeByBpNumber(bpNumber);
	}

	/**
	 * Returns the number of connection requests where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @return the number of matching connection requests
	 */
	public static int countByBpNumber(String bpNumber) {
		return getPersistence().countByBpNumber(bpNumber);
	}

	/**
	 * Returns all the connection requests where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNo(String mobileNo) {
		return getPersistence().findByMobileNo(mobileNo);
	}

	/**
	 * Returns a range of all the connection requests where mobileNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNo(
		String mobileNo, int start, int end) {

		return getPersistence().findByMobileNo(mobileNo, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where mobileNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNo(
		String mobileNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByMobileNo(
			mobileNo, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where mobileNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNo(
		String mobileNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByMobileNo(
			mobileNo, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByMobileNo_First(
			String mobileNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNo_First(
			mobileNo, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByMobileNo_First(
		String mobileNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByMobileNo_First(
			mobileNo, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByMobileNo_Last(
			String mobileNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNo_Last(
			mobileNo, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByMobileNo_Last(
		String mobileNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByMobileNo_Last(
			mobileNo, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[] findByMobileNo_PrevAndNext(
			long connectionRequestId, String mobileNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNo_PrevAndNext(
			connectionRequestId, mobileNo, orderByComparator);
	}

	/**
	 * Removes all the connection requests where mobileNo = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 */
	public static void removeByMobileNo(String mobileNo) {
		getPersistence().removeByMobileNo(mobileNo);
	}

	/**
	 * Returns the number of connection requests where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the number of matching connection requests
	 */
	public static int countByMobileNo(String mobileNo) {
		return getPersistence().countByMobileNo(mobileNo);
	}

	/**
	 * Returns all the connection requests where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo) {

		return getPersistence().findByMobileNoAndRequestNo(mobileNo, requestNo);
	}

	/**
	 * Returns a range of all the connection requests where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo, int start, int end) {

		return getPersistence().findByMobileNoAndRequestNo(
			mobileNo, requestNo, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByMobileNoAndRequestNo(
			mobileNo, requestNo, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByMobileNoAndRequestNo(
			mobileNo, requestNo, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByMobileNoAndRequestNo_First(
			String mobileNo, String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNoAndRequestNo_First(
			mobileNo, requestNo, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByMobileNoAndRequestNo_First(
		String mobileNo, String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByMobileNoAndRequestNo_First(
			mobileNo, requestNo, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByMobileNoAndRequestNo_Last(
			String mobileNo, String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNoAndRequestNo_Last(
			mobileNo, requestNo, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByMobileNoAndRequestNo_Last(
		String mobileNo, String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByMobileNoAndRequestNo_Last(
			mobileNo, requestNo, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[] findByMobileNoAndRequestNo_PrevAndNext(
			long connectionRequestId, String mobileNo, String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNoAndRequestNo_PrevAndNext(
			connectionRequestId, mobileNo, requestNo, orderByComparator);
	}

	/**
	 * Removes all the connection requests where mobileNo = &#63; and requestNo = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 */
	public static void removeByMobileNoAndRequestNo(
		String mobileNo, String requestNo) {

		getPersistence().removeByMobileNoAndRequestNo(mobileNo, requestNo);
	}

	/**
	 * Returns the number of connection requests where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @return the number of matching connection requests
	 */
	public static int countByMobileNoAndRequestNo(
		String mobileNo, String requestNo) {

		return getPersistence().countByMobileNoAndRequestNo(
			mobileNo, requestNo);
	}

	/**
	 * Returns all the connection requests where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus) {

		return getPersistence().findByMobileNoAndRequestStatus(
			mobileNo, requestStatus);
	}

	/**
	 * Returns a range of all the connection requests where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus, int start, int end) {

		return getPersistence().findByMobileNoAndRequestStatus(
			mobileNo, requestStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByMobileNoAndRequestStatus(
			mobileNo, requestStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByMobileNoAndRequestStatus(
			mobileNo, requestStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByMobileNoAndRequestStatus_First(
			String mobileNo, String requestStatus,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNoAndRequestStatus_First(
			mobileNo, requestStatus, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByMobileNoAndRequestStatus_First(
		String mobileNo, String requestStatus,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByMobileNoAndRequestStatus_First(
			mobileNo, requestStatus, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByMobileNoAndRequestStatus_Last(
			String mobileNo, String requestStatus,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNoAndRequestStatus_Last(
			mobileNo, requestStatus, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByMobileNoAndRequestStatus_Last(
		String mobileNo, String requestStatus,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByMobileNoAndRequestStatus_Last(
			mobileNo, requestStatus, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[]
			findByMobileNoAndRequestStatus_PrevAndNext(
				long connectionRequestId, String mobileNo, String requestStatus,
				OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNoAndRequestStatus_PrevAndNext(
			connectionRequestId, mobileNo, requestStatus, orderByComparator);
	}

	/**
	 * Removes all the connection requests where mobileNo = &#63; and requestStatus = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 */
	public static void removeByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus) {

		getPersistence().removeByMobileNoAndRequestStatus(
			mobileNo, requestStatus);
	}

	/**
	 * Returns the number of connection requests where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @return the number of matching connection requests
	 */
	public static int countByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus) {

		return getPersistence().countByMobileNoAndRequestStatus(
			mobileNo, requestStatus);
	}

	/**
	 * Returns all the connection requests where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByEmailId(String emailId) {
		return getPersistence().findByEmailId(emailId);
	}

	/**
	 * Returns a range of all the connection requests where emailId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param emailId the email ID
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByEmailId(
		String emailId, int start, int end) {

		return getPersistence().findByEmailId(emailId, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where emailId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param emailId the email ID
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByEmailId(
		String emailId, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByEmailId(
			emailId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where emailId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param emailId the email ID
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByEmailId(
		String emailId, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByEmailId(
			emailId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByEmailId_First(
			String emailId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByEmailId_First(emailId, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByEmailId_First(
		String emailId,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByEmailId_First(
			emailId, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByEmailId_Last(
			String emailId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByEmailId_Last(emailId, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByEmailId_Last(
		String emailId,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByEmailId_Last(emailId, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where emailId = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[] findByEmailId_PrevAndNext(
			long connectionRequestId, String emailId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByEmailId_PrevAndNext(
			connectionRequestId, emailId, orderByComparator);
	}

	/**
	 * Removes all the connection requests where emailId = &#63; from the database.
	 *
	 * @param emailId the email ID
	 */
	public static void removeByEmailId(String emailId) {
		getPersistence().removeByEmailId(emailId);
	}

	/**
	 * Returns the number of connection requests where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @return the number of matching connection requests
	 */
	public static int countByEmailId(String emailId) {
		return getPersistence().countByEmailId(emailId);
	}

	/**
	 * Returns all the connection requests where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest) {

		return getPersistence().findByMobileNoAndChangeRequest(
			mobileNo, changeRequest);
	}

	/**
	 * Returns a range of all the connection requests where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest, int start, int end) {

		return getPersistence().findByMobileNoAndChangeRequest(
			mobileNo, changeRequest, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByMobileNoAndChangeRequest(
			mobileNo, changeRequest, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByMobileNoAndChangeRequest(
			mobileNo, changeRequest, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByMobileNoAndChangeRequest_First(
			String mobileNo, boolean changeRequest,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNoAndChangeRequest_First(
			mobileNo, changeRequest, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByMobileNoAndChangeRequest_First(
		String mobileNo, boolean changeRequest,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByMobileNoAndChangeRequest_First(
			mobileNo, changeRequest, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByMobileNoAndChangeRequest_Last(
			String mobileNo, boolean changeRequest,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNoAndChangeRequest_Last(
			mobileNo, changeRequest, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByMobileNoAndChangeRequest_Last(
		String mobileNo, boolean changeRequest,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByMobileNoAndChangeRequest_Last(
			mobileNo, changeRequest, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[]
			findByMobileNoAndChangeRequest_PrevAndNext(
				long connectionRequestId, String mobileNo,
				boolean changeRequest,
				OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByMobileNoAndChangeRequest_PrevAndNext(
			connectionRequestId, mobileNo, changeRequest, orderByComparator);
	}

	/**
	 * Removes all the connection requests where mobileNo = &#63; and changeRequest = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 */
	public static void removeByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest) {

		getPersistence().removeByMobileNoAndChangeRequest(
			mobileNo, changeRequest);
	}

	/**
	 * Returns the number of connection requests where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @return the number of matching connection requests
	 */
	public static int countByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest) {

		return getPersistence().countByMobileNoAndChangeRequest(
			mobileNo, changeRequest);
	}

	/**
	 * Returns all the connection requests where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @return the matching connection requests
	 */
	public static List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest) {

		return getPersistence().findByCaNumberAndChangeRequest(
			caNumber, changeRequest);
	}

	/**
	 * Returns a range of all the connection requests where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of matching connection requests
	 */
	public static List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest, int start, int end) {

		return getPersistence().findByCaNumberAndChangeRequest(
			caNumber, changeRequest, start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findByCaNumberAndChangeRequest(
			caNumber, changeRequest, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection requests
	 */
	public static List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCaNumberAndChangeRequest(
			caNumber, changeRequest, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first connection request in the ordered set where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByCaNumberAndChangeRequest_First(
			String caNumber, boolean changeRequest,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByCaNumberAndChangeRequest_First(
			caNumber, changeRequest, orderByComparator);
	}

	/**
	 * Returns the first connection request in the ordered set where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByCaNumberAndChangeRequest_First(
		String caNumber, boolean changeRequest,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByCaNumberAndChangeRequest_First(
			caNumber, changeRequest, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public static ConnectionRequest findByCaNumberAndChangeRequest_Last(
			String caNumber, boolean changeRequest,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByCaNumberAndChangeRequest_Last(
			caNumber, changeRequest, orderByComparator);
	}

	/**
	 * Returns the last connection request in the ordered set where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public static ConnectionRequest fetchByCaNumberAndChangeRequest_Last(
		String caNumber, boolean changeRequest,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().fetchByCaNumberAndChangeRequest_Last(
			caNumber, changeRequest, orderByComparator);
	}

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest[]
			findByCaNumberAndChangeRequest_PrevAndNext(
				long connectionRequestId, String caNumber,
				boolean changeRequest,
				OrderByComparator<ConnectionRequest> orderByComparator)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByCaNumberAndChangeRequest_PrevAndNext(
			connectionRequestId, caNumber, changeRequest, orderByComparator);
	}

	/**
	 * Removes all the connection requests where caNumber = &#63; and changeRequest = &#63; from the database.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 */
	public static void removeByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest) {

		getPersistence().removeByCaNumberAndChangeRequest(
			caNumber, changeRequest);
	}

	/**
	 * Returns the number of connection requests where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @return the number of matching connection requests
	 */
	public static int countByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest) {

		return getPersistence().countByCaNumberAndChangeRequest(
			caNumber, changeRequest);
	}

	/**
	 * Caches the connection request in the entity cache if it is enabled.
	 *
	 * @param connectionRequest the connection request
	 */
	public static void cacheResult(ConnectionRequest connectionRequest) {
		getPersistence().cacheResult(connectionRequest);
	}

	/**
	 * Caches the connection requests in the entity cache if it is enabled.
	 *
	 * @param connectionRequests the connection requests
	 */
	public static void cacheResult(List<ConnectionRequest> connectionRequests) {
		getPersistence().cacheResult(connectionRequests);
	}

	/**
	 * Creates a new connection request with the primary key. Does not add the connection request to the database.
	 *
	 * @param connectionRequestId the primary key for the new connection request
	 * @return the new connection request
	 */
	public static ConnectionRequest create(long connectionRequestId) {
		return getPersistence().create(connectionRequestId);
	}

	/**
	 * Removes the connection request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request that was removed
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest remove(long connectionRequestId)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().remove(connectionRequestId);
	}

	public static ConnectionRequest updateImpl(
		ConnectionRequest connectionRequest) {

		return getPersistence().updateImpl(connectionRequest);
	}

	/**
	 * Returns the connection request with the primary key or throws a <code>NoSuchConnectionRequestException</code> if it could not be found.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest findByPrimaryKey(long connectionRequestId)
		throws com.bses.connection2.exception.NoSuchConnectionRequestException {

		return getPersistence().findByPrimaryKey(connectionRequestId);
	}

	/**
	 * Returns the connection request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request, or <code>null</code> if a connection request with the primary key could not be found
	 */
	public static ConnectionRequest fetchByPrimaryKey(
		long connectionRequestId) {

		return getPersistence().fetchByPrimaryKey(connectionRequestId);
	}

	/**
	 * Returns all the connection requests.
	 *
	 * @return the connection requests
	 */
	public static List<ConnectionRequest> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the connection requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @return the range of connection requests
	 */
	public static List<ConnectionRequest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the connection requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of connection requests
	 */
	public static List<ConnectionRequest> findAll(
		int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of connection requests
	 * @param end the upper bound of the range of connection requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of connection requests
	 */
	public static List<ConnectionRequest> findAll(
		int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the connection requests from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of connection requests.
	 *
	 * @return the number of connection requests
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ConnectionRequestPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ConnectionRequestPersistence, ConnectionRequestPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			ConnectionRequestPersistence.class);

		ServiceTracker
			<ConnectionRequestPersistence, ConnectionRequestPersistence>
				serviceTracker =
					new ServiceTracker
						<ConnectionRequestPersistence,
						 ConnectionRequestPersistence>(
							 bundle.getBundleContext(),
							 ConnectionRequestPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}