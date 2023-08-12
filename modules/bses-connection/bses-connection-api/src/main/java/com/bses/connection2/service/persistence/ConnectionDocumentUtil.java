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

import com.bses.connection2.model.ConnectionDocument;

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
 * The persistence utility for the connection document service. This utility wraps <code>com.bses.connection2.service.persistence.impl.ConnectionDocumentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionDocumentPersistence
 * @generated
 */
public class ConnectionDocumentUtil {

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
	public static void clearCache(ConnectionDocument connectionDocument) {
		getPersistence().clearCache(connectionDocument);
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
	public static Map<Serializable, ConnectionDocument> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ConnectionDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ConnectionDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ConnectionDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ConnectionDocument update(
		ConnectionDocument connectionDocument) {

		return getPersistence().update(connectionDocument);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ConnectionDocument update(
		ConnectionDocument connectionDocument, ServiceContext serviceContext) {

		return getPersistence().update(connectionDocument, serviceContext);
	}

	/**
	 * Returns all the connection documents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching connection documents
	 */
	public static List<ConnectionDocument> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the connection documents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @return the range of matching connection documents
	 */
	public static List<ConnectionDocument> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the connection documents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection documents
	 */
	public static List<ConnectionDocument> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection documents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection documents
	 */
	public static List<ConnectionDocument> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public static ConnectionDocument findByUuid_First(
			String uuid,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public static ConnectionDocument fetchByUuid_First(
		String uuid, OrderByComparator<ConnectionDocument> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public static ConnectionDocument findByUuid_Last(
			String uuid,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public static ConnectionDocument fetchByUuid_Last(
		String uuid, OrderByComparator<ConnectionDocument> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the connection documents before and after the current connection document in the ordered set where uuid = &#63;.
	 *
	 * @param connectionDocumentId the primary key of the current connection document
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection document
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	public static ConnectionDocument[] findByUuid_PrevAndNext(
			long connectionDocumentId, String uuid,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByUuid_PrevAndNext(
			connectionDocumentId, uuid, orderByComparator);
	}

	/**
	 * Removes all the connection documents where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of connection documents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching connection documents
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the connection document where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchConnectionDocumentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public static ConnectionDocument findByUUID_G(String uuid, long groupId)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the connection document where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public static ConnectionDocument fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the connection document where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public static ConnectionDocument fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the connection document where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the connection document that was removed
	 */
	public static ConnectionDocument removeByUUID_G(String uuid, long groupId)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of connection documents where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching connection documents
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the connection documents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching connection documents
	 */
	public static List<ConnectionDocument> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the connection documents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @return the range of matching connection documents
	 */
	public static List<ConnectionDocument> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the connection documents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection documents
	 */
	public static List<ConnectionDocument> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection documents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection documents
	 */
	public static List<ConnectionDocument> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public static ConnectionDocument findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public static ConnectionDocument fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public static ConnectionDocument findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public static ConnectionDocument fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the connection documents before and after the current connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param connectionDocumentId the primary key of the current connection document
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection document
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	public static ConnectionDocument[] findByUuid_C_PrevAndNext(
			long connectionDocumentId, String uuid, long companyId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByUuid_C_PrevAndNext(
			connectionDocumentId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the connection documents where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of connection documents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching connection documents
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the connection documents where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @return the matching connection documents
	 */
	public static List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId) {

		return getPersistence().findByConnectionRequestId(connectionRequestId);
	}

	/**
	 * Returns a range of all the connection documents where connectionRequestId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param connectionRequestId the connection request ID
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @return the range of matching connection documents
	 */
	public static List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId, int start, int end) {

		return getPersistence().findByConnectionRequestId(
			connectionRequestId, start, end);
	}

	/**
	 * Returns an ordered range of all the connection documents where connectionRequestId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param connectionRequestId the connection request ID
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching connection documents
	 */
	public static List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return getPersistence().findByConnectionRequestId(
			connectionRequestId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection documents where connectionRequestId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param connectionRequestId the connection request ID
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching connection documents
	 */
	public static List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByConnectionRequestId(
			connectionRequestId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public static ConnectionDocument findByConnectionRequestId_First(
			long connectionRequestId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByConnectionRequestId_First(
			connectionRequestId, orderByComparator);
	}

	/**
	 * Returns the first connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public static ConnectionDocument fetchByConnectionRequestId_First(
		long connectionRequestId,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return getPersistence().fetchByConnectionRequestId_First(
			connectionRequestId, orderByComparator);
	}

	/**
	 * Returns the last connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public static ConnectionDocument findByConnectionRequestId_Last(
			long connectionRequestId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByConnectionRequestId_Last(
			connectionRequestId, orderByComparator);
	}

	/**
	 * Returns the last connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public static ConnectionDocument fetchByConnectionRequestId_Last(
		long connectionRequestId,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return getPersistence().fetchByConnectionRequestId_Last(
			connectionRequestId, orderByComparator);
	}

	/**
	 * Returns the connection documents before and after the current connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionDocumentId the primary key of the current connection document
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection document
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	public static ConnectionDocument[] findByConnectionRequestId_PrevAndNext(
			long connectionDocumentId, long connectionRequestId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByConnectionRequestId_PrevAndNext(
			connectionDocumentId, connectionRequestId, orderByComparator);
	}

	/**
	 * Removes all the connection documents where connectionRequestId = &#63; from the database.
	 *
	 * @param connectionRequestId the connection request ID
	 */
	public static void removeByConnectionRequestId(long connectionRequestId) {
		getPersistence().removeByConnectionRequestId(connectionRequestId);
	}

	/**
	 * Returns the number of connection documents where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @return the number of matching connection documents
	 */
	public static int countByConnectionRequestId(long connectionRequestId) {
		return getPersistence().countByConnectionRequestId(connectionRequestId);
	}

	/**
	 * Returns the connection document where connectionRequestId = &#63; and documentType = &#63; or throws a <code>NoSuchConnectionDocumentException</code> if it could not be found.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public static ConnectionDocument findByConnectionRequestIdAndDocumentType(
			long connectionRequestId, String documentType)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByConnectionRequestIdAndDocumentType(
			connectionRequestId, documentType);
	}

	/**
	 * Returns the connection document where connectionRequestId = &#63; and documentType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public static ConnectionDocument fetchByConnectionRequestIdAndDocumentType(
		long connectionRequestId, String documentType) {

		return getPersistence().fetchByConnectionRequestIdAndDocumentType(
			connectionRequestId, documentType);
	}

	/**
	 * Returns the connection document where connectionRequestId = &#63; and documentType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public static ConnectionDocument fetchByConnectionRequestIdAndDocumentType(
		long connectionRequestId, String documentType, boolean useFinderCache) {

		return getPersistence().fetchByConnectionRequestIdAndDocumentType(
			connectionRequestId, documentType, useFinderCache);
	}

	/**
	 * Removes the connection document where connectionRequestId = &#63; and documentType = &#63; from the database.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the connection document that was removed
	 */
	public static ConnectionDocument removeByConnectionRequestIdAndDocumentType(
			long connectionRequestId, String documentType)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().removeByConnectionRequestIdAndDocumentType(
			connectionRequestId, documentType);
	}

	/**
	 * Returns the number of connection documents where connectionRequestId = &#63; and documentType = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the number of matching connection documents
	 */
	public static int countByConnectionRequestIdAndDocumentType(
		long connectionRequestId, String documentType) {

		return getPersistence().countByConnectionRequestIdAndDocumentType(
			connectionRequestId, documentType);
	}

	/**
	 * Caches the connection document in the entity cache if it is enabled.
	 *
	 * @param connectionDocument the connection document
	 */
	public static void cacheResult(ConnectionDocument connectionDocument) {
		getPersistence().cacheResult(connectionDocument);
	}

	/**
	 * Caches the connection documents in the entity cache if it is enabled.
	 *
	 * @param connectionDocuments the connection documents
	 */
	public static void cacheResult(
		List<ConnectionDocument> connectionDocuments) {

		getPersistence().cacheResult(connectionDocuments);
	}

	/**
	 * Creates a new connection document with the primary key. Does not add the connection document to the database.
	 *
	 * @param connectionDocumentId the primary key for the new connection document
	 * @return the new connection document
	 */
	public static ConnectionDocument create(long connectionDocumentId) {
		return getPersistence().create(connectionDocumentId);
	}

	/**
	 * Removes the connection document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document that was removed
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	public static ConnectionDocument remove(long connectionDocumentId)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().remove(connectionDocumentId);
	}

	public static ConnectionDocument updateImpl(
		ConnectionDocument connectionDocument) {

		return getPersistence().updateImpl(connectionDocument);
	}

	/**
	 * Returns the connection document with the primary key or throws a <code>NoSuchConnectionDocumentException</code> if it could not be found.
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	public static ConnectionDocument findByPrimaryKey(long connectionDocumentId)
		throws com.bses.connection2.exception.
			NoSuchConnectionDocumentException {

		return getPersistence().findByPrimaryKey(connectionDocumentId);
	}

	/**
	 * Returns the connection document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document, or <code>null</code> if a connection document with the primary key could not be found
	 */
	public static ConnectionDocument fetchByPrimaryKey(
		long connectionDocumentId) {

		return getPersistence().fetchByPrimaryKey(connectionDocumentId);
	}

	/**
	 * Returns all the connection documents.
	 *
	 * @return the connection documents
	 */
	public static List<ConnectionDocument> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the connection documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @return the range of connection documents
	 */
	public static List<ConnectionDocument> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the connection documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of connection documents
	 */
	public static List<ConnectionDocument> findAll(
		int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the connection documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of connection documents
	 */
	public static List<ConnectionDocument> findAll(
		int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the connection documents from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of connection documents.
	 *
	 * @return the number of connection documents
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ConnectionDocumentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ConnectionDocumentPersistence, ConnectionDocumentPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			ConnectionDocumentPersistence.class);

		ServiceTracker
			<ConnectionDocumentPersistence, ConnectionDocumentPersistence>
				serviceTracker =
					new ServiceTracker
						<ConnectionDocumentPersistence,
						 ConnectionDocumentPersistence>(
							 bundle.getBundleContext(),
							 ConnectionDocumentPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}