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

import com.bses.connection2.model.RequestNumberSeq;

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
 * The persistence utility for the request number seq service. This utility wraps <code>com.bses.connection2.service.persistence.impl.RequestNumberSeqPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RequestNumberSeqPersistence
 * @generated
 */
public class RequestNumberSeqUtil {

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
	public static void clearCache(RequestNumberSeq requestNumberSeq) {
		getPersistence().clearCache(requestNumberSeq);
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
	public static Map<Serializable, RequestNumberSeq> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RequestNumberSeq> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RequestNumberSeq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RequestNumberSeq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RequestNumberSeq update(RequestNumberSeq requestNumberSeq) {
		return getPersistence().update(requestNumberSeq);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RequestNumberSeq update(
		RequestNumberSeq requestNumberSeq, ServiceContext serviceContext) {

		return getPersistence().update(requestNumberSeq, serviceContext);
	}

	/**
	 * Returns all the request number seqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching request number seqs
	 */
	public static List<RequestNumberSeq> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the request number seqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @return the range of matching request number seqs
	 */
	public static List<RequestNumberSeq> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the request number seqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching request number seqs
	 */
	public static List<RequestNumberSeq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the request number seqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching request number seqs
	 */
	public static List<RequestNumberSeq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public static RequestNumberSeq findByUuid_First(
			String uuid, OrderByComparator<RequestNumberSeq> orderByComparator)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public static RequestNumberSeq fetchByUuid_First(
		String uuid, OrderByComparator<RequestNumberSeq> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public static RequestNumberSeq findByUuid_Last(
			String uuid, OrderByComparator<RequestNumberSeq> orderByComparator)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public static RequestNumberSeq fetchByUuid_Last(
		String uuid, OrderByComparator<RequestNumberSeq> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the request number seqs before and after the current request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param requestNumberSeqId the primary key of the current request number seq
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next request number seq
	 * @throws NoSuchRequestNumberSeqException if a request number seq with the primary key could not be found
	 */
	public static RequestNumberSeq[] findByUuid_PrevAndNext(
			long requestNumberSeqId, String uuid,
			OrderByComparator<RequestNumberSeq> orderByComparator)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().findByUuid_PrevAndNext(
			requestNumberSeqId, uuid, orderByComparator);
	}

	/**
	 * Removes all the request number seqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of request number seqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching request number seqs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the request number seq where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRequestNumberSeqException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public static RequestNumberSeq findByUUID_G(String uuid, long groupId)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the request number seq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public static RequestNumberSeq fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the request number seq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public static RequestNumberSeq fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the request number seq where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the request number seq that was removed
	 */
	public static RequestNumberSeq removeByUUID_G(String uuid, long groupId)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of request number seqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching request number seqs
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the request number seqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching request number seqs
	 */
	public static List<RequestNumberSeq> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the request number seqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @return the range of matching request number seqs
	 */
	public static List<RequestNumberSeq> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the request number seqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching request number seqs
	 */
	public static List<RequestNumberSeq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the request number seqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching request number seqs
	 */
	public static List<RequestNumberSeq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public static RequestNumberSeq findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<RequestNumberSeq> orderByComparator)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public static RequestNumberSeq fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public static RequestNumberSeq findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<RequestNumberSeq> orderByComparator)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public static RequestNumberSeq fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the request number seqs before and after the current request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param requestNumberSeqId the primary key of the current request number seq
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next request number seq
	 * @throws NoSuchRequestNumberSeqException if a request number seq with the primary key could not be found
	 */
	public static RequestNumberSeq[] findByUuid_C_PrevAndNext(
			long requestNumberSeqId, String uuid, long companyId,
			OrderByComparator<RequestNumberSeq> orderByComparator)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().findByUuid_C_PrevAndNext(
			requestNumberSeqId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the request number seqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of request number seqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching request number seqs
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the request number seq where seqDate = &#63; or throws a <code>NoSuchRequestNumberSeqException</code> if it could not be found.
	 *
	 * @param seqDate the seq date
	 * @return the matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public static RequestNumberSeq findBySeqDate(String seqDate)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().findBySeqDate(seqDate);
	}

	/**
	 * Returns the request number seq where seqDate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param seqDate the seq date
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public static RequestNumberSeq fetchBySeqDate(String seqDate) {
		return getPersistence().fetchBySeqDate(seqDate);
	}

	/**
	 * Returns the request number seq where seqDate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param seqDate the seq date
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public static RequestNumberSeq fetchBySeqDate(
		String seqDate, boolean useFinderCache) {

		return getPersistence().fetchBySeqDate(seqDate, useFinderCache);
	}

	/**
	 * Removes the request number seq where seqDate = &#63; from the database.
	 *
	 * @param seqDate the seq date
	 * @return the request number seq that was removed
	 */
	public static RequestNumberSeq removeBySeqDate(String seqDate)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().removeBySeqDate(seqDate);
	}

	/**
	 * Returns the number of request number seqs where seqDate = &#63;.
	 *
	 * @param seqDate the seq date
	 * @return the number of matching request number seqs
	 */
	public static int countBySeqDate(String seqDate) {
		return getPersistence().countBySeqDate(seqDate);
	}

	/**
	 * Caches the request number seq in the entity cache if it is enabled.
	 *
	 * @param requestNumberSeq the request number seq
	 */
	public static void cacheResult(RequestNumberSeq requestNumberSeq) {
		getPersistence().cacheResult(requestNumberSeq);
	}

	/**
	 * Caches the request number seqs in the entity cache if it is enabled.
	 *
	 * @param requestNumberSeqs the request number seqs
	 */
	public static void cacheResult(List<RequestNumberSeq> requestNumberSeqs) {
		getPersistence().cacheResult(requestNumberSeqs);
	}

	/**
	 * Creates a new request number seq with the primary key. Does not add the request number seq to the database.
	 *
	 * @param requestNumberSeqId the primary key for the new request number seq
	 * @return the new request number seq
	 */
	public static RequestNumberSeq create(long requestNumberSeqId) {
		return getPersistence().create(requestNumberSeqId);
	}

	/**
	 * Removes the request number seq with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq that was removed
	 * @throws NoSuchRequestNumberSeqException if a request number seq with the primary key could not be found
	 */
	public static RequestNumberSeq remove(long requestNumberSeqId)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().remove(requestNumberSeqId);
	}

	public static RequestNumberSeq updateImpl(
		RequestNumberSeq requestNumberSeq) {

		return getPersistence().updateImpl(requestNumberSeq);
	}

	/**
	 * Returns the request number seq with the primary key or throws a <code>NoSuchRequestNumberSeqException</code> if it could not be found.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq
	 * @throws NoSuchRequestNumberSeqException if a request number seq with the primary key could not be found
	 */
	public static RequestNumberSeq findByPrimaryKey(long requestNumberSeqId)
		throws com.bses.connection2.exception.NoSuchRequestNumberSeqException {

		return getPersistence().findByPrimaryKey(requestNumberSeqId);
	}

	/**
	 * Returns the request number seq with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq, or <code>null</code> if a request number seq with the primary key could not be found
	 */
	public static RequestNumberSeq fetchByPrimaryKey(long requestNumberSeqId) {
		return getPersistence().fetchByPrimaryKey(requestNumberSeqId);
	}

	/**
	 * Returns all the request number seqs.
	 *
	 * @return the request number seqs
	 */
	public static List<RequestNumberSeq> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the request number seqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @return the range of request number seqs
	 */
	public static List<RequestNumberSeq> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the request number seqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of request number seqs
	 */
	public static List<RequestNumberSeq> findAll(
		int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the request number seqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of request number seqs
	 */
	public static List<RequestNumberSeq> findAll(
		int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the request number seqs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of request number seqs.
	 *
	 * @return the number of request number seqs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static RequestNumberSeqPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<RequestNumberSeqPersistence, RequestNumberSeqPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			RequestNumberSeqPersistence.class);

		ServiceTracker<RequestNumberSeqPersistence, RequestNumberSeqPersistence>
			serviceTracker =
				new ServiceTracker
					<RequestNumberSeqPersistence, RequestNumberSeqPersistence>(
						bundle.getBundleContext(),
						RequestNumberSeqPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}