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

import aQute.bnd.annotation.ProviderType;

import com.bses.connection2.exception.NoSuchRequestNumberSeqException;
import com.bses.connection2.model.RequestNumberSeq;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the request number seq service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RequestNumberSeqUtil
 * @generated
 */
@ProviderType
public interface RequestNumberSeqPersistence
	extends BasePersistence<RequestNumberSeq> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RequestNumberSeqUtil} to access the request number seq persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, RequestNumberSeq> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the request number seqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching request number seqs
	 */
	public java.util.List<RequestNumberSeq> findByUuid(String uuid);

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
	public java.util.List<RequestNumberSeq> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<RequestNumberSeq> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
			orderByComparator);

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
	public java.util.List<RequestNumberSeq> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public RequestNumberSeq findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
				orderByComparator)
		throws NoSuchRequestNumberSeqException;

	/**
	 * Returns the first request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public RequestNumberSeq fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
			orderByComparator);

	/**
	 * Returns the last request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public RequestNumberSeq findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
				orderByComparator)
		throws NoSuchRequestNumberSeqException;

	/**
	 * Returns the last request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public RequestNumberSeq fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
			orderByComparator);

	/**
	 * Returns the request number seqs before and after the current request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param requestNumberSeqId the primary key of the current request number seq
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next request number seq
	 * @throws NoSuchRequestNumberSeqException if a request number seq with the primary key could not be found
	 */
	public RequestNumberSeq[] findByUuid_PrevAndNext(
			long requestNumberSeqId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
				orderByComparator)
		throws NoSuchRequestNumberSeqException;

	/**
	 * Removes all the request number seqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of request number seqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching request number seqs
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the request number seq where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRequestNumberSeqException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public RequestNumberSeq findByUUID_G(String uuid, long groupId)
		throws NoSuchRequestNumberSeqException;

	/**
	 * Returns the request number seq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public RequestNumberSeq fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the request number seq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public RequestNumberSeq fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the request number seq where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the request number seq that was removed
	 */
	public RequestNumberSeq removeByUUID_G(String uuid, long groupId)
		throws NoSuchRequestNumberSeqException;

	/**
	 * Returns the number of request number seqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching request number seqs
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the request number seqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching request number seqs
	 */
	public java.util.List<RequestNumberSeq> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<RequestNumberSeq> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<RequestNumberSeq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
			orderByComparator);

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
	public java.util.List<RequestNumberSeq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public RequestNumberSeq findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
				orderByComparator)
		throws NoSuchRequestNumberSeqException;

	/**
	 * Returns the first request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public RequestNumberSeq fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
			orderByComparator);

	/**
	 * Returns the last request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public RequestNumberSeq findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
				orderByComparator)
		throws NoSuchRequestNumberSeqException;

	/**
	 * Returns the last request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public RequestNumberSeq fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
			orderByComparator);

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
	public RequestNumberSeq[] findByUuid_C_PrevAndNext(
			long requestNumberSeqId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
				orderByComparator)
		throws NoSuchRequestNumberSeqException;

	/**
	 * Removes all the request number seqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of request number seqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching request number seqs
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the request number seq where seqDate = &#63; or throws a <code>NoSuchRequestNumberSeqException</code> if it could not be found.
	 *
	 * @param seqDate the seq date
	 * @return the matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	public RequestNumberSeq findBySeqDate(String seqDate)
		throws NoSuchRequestNumberSeqException;

	/**
	 * Returns the request number seq where seqDate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param seqDate the seq date
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public RequestNumberSeq fetchBySeqDate(String seqDate);

	/**
	 * Returns the request number seq where seqDate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param seqDate the seq date
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	public RequestNumberSeq fetchBySeqDate(
		String seqDate, boolean useFinderCache);

	/**
	 * Removes the request number seq where seqDate = &#63; from the database.
	 *
	 * @param seqDate the seq date
	 * @return the request number seq that was removed
	 */
	public RequestNumberSeq removeBySeqDate(String seqDate)
		throws NoSuchRequestNumberSeqException;

	/**
	 * Returns the number of request number seqs where seqDate = &#63;.
	 *
	 * @param seqDate the seq date
	 * @return the number of matching request number seqs
	 */
	public int countBySeqDate(String seqDate);

	/**
	 * Caches the request number seq in the entity cache if it is enabled.
	 *
	 * @param requestNumberSeq the request number seq
	 */
	public void cacheResult(RequestNumberSeq requestNumberSeq);

	/**
	 * Caches the request number seqs in the entity cache if it is enabled.
	 *
	 * @param requestNumberSeqs the request number seqs
	 */
	public void cacheResult(java.util.List<RequestNumberSeq> requestNumberSeqs);

	/**
	 * Creates a new request number seq with the primary key. Does not add the request number seq to the database.
	 *
	 * @param requestNumberSeqId the primary key for the new request number seq
	 * @return the new request number seq
	 */
	public RequestNumberSeq create(long requestNumberSeqId);

	/**
	 * Removes the request number seq with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq that was removed
	 * @throws NoSuchRequestNumberSeqException if a request number seq with the primary key could not be found
	 */
	public RequestNumberSeq remove(long requestNumberSeqId)
		throws NoSuchRequestNumberSeqException;

	public RequestNumberSeq updateImpl(RequestNumberSeq requestNumberSeq);

	/**
	 * Returns the request number seq with the primary key or throws a <code>NoSuchRequestNumberSeqException</code> if it could not be found.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq
	 * @throws NoSuchRequestNumberSeqException if a request number seq with the primary key could not be found
	 */
	public RequestNumberSeq findByPrimaryKey(long requestNumberSeqId)
		throws NoSuchRequestNumberSeqException;

	/**
	 * Returns the request number seq with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq, or <code>null</code> if a request number seq with the primary key could not be found
	 */
	public RequestNumberSeq fetchByPrimaryKey(long requestNumberSeqId);

	/**
	 * Returns all the request number seqs.
	 *
	 * @return the request number seqs
	 */
	public java.util.List<RequestNumberSeq> findAll();

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
	public java.util.List<RequestNumberSeq> findAll(int start, int end);

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
	public java.util.List<RequestNumberSeq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
			orderByComparator);

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
	public java.util.List<RequestNumberSeq> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RequestNumberSeq>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the request number seqs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of request number seqs.
	 *
	 * @return the number of request number seqs
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}