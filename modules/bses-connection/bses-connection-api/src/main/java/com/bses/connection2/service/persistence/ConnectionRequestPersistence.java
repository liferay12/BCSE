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

import com.bses.connection2.exception.NoSuchConnectionRequestException;
import com.bses.connection2.model.ConnectionRequest;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the connection request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestUtil
 * @generated
 */
@ProviderType
public interface ConnectionRequestPersistence
	extends BasePersistence<ConnectionRequest> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConnectionRequestUtil} to access the connection request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, ConnectionRequest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the connection requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByUuid(String uuid);

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
	public java.util.List<ConnectionRequest> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<ConnectionRequest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where uuid = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public ConnectionRequest[] findByUuid_PrevAndNext(
			long connectionRequestId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of connection requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching connection requests
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the connection request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchConnectionRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByUUID_G(String uuid, long groupId)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the connection request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the connection request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the connection request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the connection request that was removed
	 */
	public ConnectionRequest removeByUUID_G(String uuid, long groupId)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the number of connection requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching connection requests
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the connection requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<ConnectionRequest> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<ConnectionRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public ConnectionRequest[] findByUuid_C_PrevAndNext(
			long connectionRequestId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of connection requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching connection requests
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByRequestNo(String requestNo);

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
	public java.util.List<ConnectionRequest> findByRequestNo(
		String requestNo, int start, int end);

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
	public java.util.List<ConnectionRequest> findByRequestNo(
		String requestNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByRequestNo(
		String requestNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByRequestNo_First(
			String requestNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByRequestNo_First(
		String requestNo,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByRequestNo_Last(
			String requestNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByRequestNo_Last(
		String requestNo,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public ConnectionRequest[] findByRequestNo_PrevAndNext(
			long connectionRequestId, String requestNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where requestNo = &#63; from the database.
	 *
	 * @param requestNo the request no
	 */
	public void removeByRequestNo(String requestNo);

	/**
	 * Returns the number of connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the number of matching connection requests
	 */
	public int countByRequestNo(String requestNo);

	/**
	 * Returns all the connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByOrderNo(String requestNo);

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
	public java.util.List<ConnectionRequest> findByOrderNo(
		String requestNo, int start, int end);

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
	public java.util.List<ConnectionRequest> findByOrderNo(
		String requestNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByOrderNo(
		String requestNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByOrderNo_First(
			String requestNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByOrderNo_First(
		String requestNo,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByOrderNo_Last(
			String requestNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByOrderNo_Last(
		String requestNo,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public ConnectionRequest[] findByOrderNo_PrevAndNext(
			long connectionRequestId, String requestNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where requestNo = &#63; from the database.
	 *
	 * @param requestNo the request no
	 */
	public void removeByOrderNo(String requestNo);

	/**
	 * Returns the number of connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the number of matching connection requests
	 */
	public int countByOrderNo(String requestNo);

	/**
	 * Returns all the connection requests where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByCaNumber(String caNumber);

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
	public java.util.List<ConnectionRequest> findByCaNumber(
		String caNumber, int start, int end);

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
	public java.util.List<ConnectionRequest> findByCaNumber(
		String caNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByCaNumber(
		String caNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByCaNumber_First(
			String caNumber,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByCaNumber_First(
		String caNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByCaNumber_Last(
			String caNumber,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByCaNumber_Last(
		String caNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public ConnectionRequest[] findByCaNumber_PrevAndNext(
			long connectionRequestId, String caNumber,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where caNumber = &#63; from the database.
	 *
	 * @param caNumber the ca number
	 */
	public void removeByCaNumber(String caNumber);

	/**
	 * Returns the number of connection requests where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @return the number of matching connection requests
	 */
	public int countByCaNumber(String caNumber);

	/**
	 * Returns all the connection requests where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByBpNumber(String bpNumber);

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
	public java.util.List<ConnectionRequest> findByBpNumber(
		String bpNumber, int start, int end);

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
	public java.util.List<ConnectionRequest> findByBpNumber(
		String bpNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByBpNumber(
		String bpNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByBpNumber_First(
			String bpNumber,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByBpNumber_First(
		String bpNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByBpNumber_Last(
			String bpNumber,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByBpNumber_Last(
		String bpNumber,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public ConnectionRequest[] findByBpNumber_PrevAndNext(
			long connectionRequestId, String bpNumber,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where bpNumber = &#63; from the database.
	 *
	 * @param bpNumber the bp number
	 */
	public void removeByBpNumber(String bpNumber);

	/**
	 * Returns the number of connection requests where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @return the number of matching connection requests
	 */
	public int countByBpNumber(String bpNumber);

	/**
	 * Returns all the connection requests where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByMobileNo(String mobileNo);

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
	public java.util.List<ConnectionRequest> findByMobileNo(
		String mobileNo, int start, int end);

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
	public java.util.List<ConnectionRequest> findByMobileNo(
		String mobileNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByMobileNo(
		String mobileNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByMobileNo_First(
			String mobileNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByMobileNo_First(
		String mobileNo,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByMobileNo_Last(
			String mobileNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByMobileNo_Last(
		String mobileNo,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public ConnectionRequest[] findByMobileNo_PrevAndNext(
			long connectionRequestId, String mobileNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where mobileNo = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 */
	public void removeByMobileNo(String mobileNo);

	/**
	 * Returns the number of connection requests where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the number of matching connection requests
	 */
	public int countByMobileNo(String mobileNo);

	/**
	 * Returns all the connection requests where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo);

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
	public java.util.List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo, int start, int end);

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
	public java.util.List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByMobileNoAndRequestNo_First(
			String mobileNo, String requestNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByMobileNoAndRequestNo_First(
		String mobileNo, String requestNo,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByMobileNoAndRequestNo_Last(
			String mobileNo, String requestNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByMobileNoAndRequestNo_Last(
		String mobileNo, String requestNo,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public ConnectionRequest[] findByMobileNoAndRequestNo_PrevAndNext(
			long connectionRequestId, String mobileNo, String requestNo,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where mobileNo = &#63; and requestNo = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 */
	public void removeByMobileNoAndRequestNo(String mobileNo, String requestNo);

	/**
	 * Returns the number of connection requests where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @return the number of matching connection requests
	 */
	public int countByMobileNoAndRequestNo(String mobileNo, String requestNo);

	/**
	 * Returns all the connection requests where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus);

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
	public java.util.List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus, int start, int end);

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
	public java.util.List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByMobileNoAndRequestStatus_First(
			String mobileNo, String requestStatus,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByMobileNoAndRequestStatus_First(
		String mobileNo, String requestStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByMobileNoAndRequestStatus_Last(
			String mobileNo, String requestStatus,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByMobileNoAndRequestStatus_Last(
		String mobileNo, String requestStatus,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public ConnectionRequest[] findByMobileNoAndRequestStatus_PrevAndNext(
			long connectionRequestId, String mobileNo, String requestStatus,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where mobileNo = &#63; and requestStatus = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 */
	public void removeByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus);

	/**
	 * Returns the number of connection requests where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @return the number of matching connection requests
	 */
	public int countByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus);

	/**
	 * Returns all the connection requests where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByEmailId(String emailId);

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
	public java.util.List<ConnectionRequest> findByEmailId(
		String emailId, int start, int end);

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
	public java.util.List<ConnectionRequest> findByEmailId(
		String emailId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByEmailId(
		String emailId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByEmailId_First(
			String emailId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByEmailId_First(
		String emailId,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByEmailId_Last(
			String emailId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByEmailId_Last(
		String emailId,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the connection requests before and after the current connection request in the ordered set where emailId = &#63;.
	 *
	 * @param connectionRequestId the primary key of the current connection request
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public ConnectionRequest[] findByEmailId_PrevAndNext(
			long connectionRequestId, String emailId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where emailId = &#63; from the database.
	 *
	 * @param emailId the email ID
	 */
	public void removeByEmailId(String emailId);

	/**
	 * Returns the number of connection requests where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @return the number of matching connection requests
	 */
	public int countByEmailId(String emailId);

	/**
	 * Returns all the connection requests where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest);

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
	public java.util.List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest, int start, int end);

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
	public java.util.List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByMobileNoAndChangeRequest_First(
			String mobileNo, boolean changeRequest,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByMobileNoAndChangeRequest_First(
		String mobileNo, boolean changeRequest,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByMobileNoAndChangeRequest_Last(
			String mobileNo, boolean changeRequest,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByMobileNoAndChangeRequest_Last(
		String mobileNo, boolean changeRequest,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public ConnectionRequest[] findByMobileNoAndChangeRequest_PrevAndNext(
			long connectionRequestId, String mobileNo, boolean changeRequest,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where mobileNo = &#63; and changeRequest = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 */
	public void removeByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest);

	/**
	 * Returns the number of connection requests where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @return the number of matching connection requests
	 */
	public int countByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest);

	/**
	 * Returns all the connection requests where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @return the matching connection requests
	 */
	public java.util.List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest);

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
	public java.util.List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest, int start, int end);

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
	public java.util.List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection request in the ordered set where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByCaNumberAndChangeRequest_First(
			String caNumber, boolean changeRequest,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the first connection request in the ordered set where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByCaNumberAndChangeRequest_First(
		String caNumber, boolean changeRequest,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

	/**
	 * Returns the last connection request in the ordered set where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	public ConnectionRequest findByCaNumberAndChangeRequest_Last(
			String caNumber, boolean changeRequest,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the last connection request in the ordered set where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	public ConnectionRequest fetchByCaNumberAndChangeRequest_Last(
		String caNumber, boolean changeRequest,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public ConnectionRequest[] findByCaNumberAndChangeRequest_PrevAndNext(
			long connectionRequestId, String caNumber, boolean changeRequest,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
				orderByComparator)
		throws NoSuchConnectionRequestException;

	/**
	 * Removes all the connection requests where caNumber = &#63; and changeRequest = &#63; from the database.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 */
	public void removeByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest);

	/**
	 * Returns the number of connection requests where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @return the number of matching connection requests
	 */
	public int countByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest);

	/**
	 * Caches the connection request in the entity cache if it is enabled.
	 *
	 * @param connectionRequest the connection request
	 */
	public void cacheResult(ConnectionRequest connectionRequest);

	/**
	 * Caches the connection requests in the entity cache if it is enabled.
	 *
	 * @param connectionRequests the connection requests
	 */
	public void cacheResult(
		java.util.List<ConnectionRequest> connectionRequests);

	/**
	 * Creates a new connection request with the primary key. Does not add the connection request to the database.
	 *
	 * @param connectionRequestId the primary key for the new connection request
	 * @return the new connection request
	 */
	public ConnectionRequest create(long connectionRequestId);

	/**
	 * Removes the connection request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request that was removed
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public ConnectionRequest remove(long connectionRequestId)
		throws NoSuchConnectionRequestException;

	public ConnectionRequest updateImpl(ConnectionRequest connectionRequest);

	/**
	 * Returns the connection request with the primary key or throws a <code>NoSuchConnectionRequestException</code> if it could not be found.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	public ConnectionRequest findByPrimaryKey(long connectionRequestId)
		throws NoSuchConnectionRequestException;

	/**
	 * Returns the connection request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request, or <code>null</code> if a connection request with the primary key could not be found
	 */
	public ConnectionRequest fetchByPrimaryKey(long connectionRequestId);

	/**
	 * Returns all the connection requests.
	 *
	 * @return the connection requests
	 */
	public java.util.List<ConnectionRequest> findAll();

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
	public java.util.List<ConnectionRequest> findAll(int start, int end);

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
	public java.util.List<ConnectionRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator);

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
	public java.util.List<ConnectionRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the connection requests from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of connection requests.
	 *
	 * @return the number of connection requests
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}