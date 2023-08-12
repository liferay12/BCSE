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

package com.bses.connection2.service.persistence.impl;

import com.bses.connection2.exception.NoSuchConnectionRequestException;
import com.bses.connection2.model.ConnectionRequest;
import com.bses.connection2.model.impl.ConnectionRequestImpl;
import com.bses.connection2.model.impl.ConnectionRequestModelImpl;
import com.bses.connection2.service.persistence.ConnectionRequestPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the connection request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ConnectionRequestPersistenceImpl
	extends BasePersistenceImpl<ConnectionRequest>
	implements ConnectionRequestPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ConnectionRequestUtil</code> to access the connection request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ConnectionRequestImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the connection requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionRequest> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!uuid.equals(connectionRequest.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByUuid_First(
			String uuid, OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByUuid_First(
			uuid, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByUuid_First(
		String uuid, OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByUuid_Last(
			String uuid, OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByUuid_Last(
			uuid, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByUuid_Last(
		String uuid, OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByUuid_PrevAndNext(
			long connectionRequestId, String uuid,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		uuid = Objects.toString(uuid, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, connectionRequest, uuid, orderByComparator, true);

			array[1] = connectionRequest;

			array[2] = getByUuid_PrevAndNext(
				session, connectionRequest, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByUuid_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String uuid,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ConnectionRequest connectionRequest :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"connectionRequest.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(connectionRequest.uuid IS NULL OR connectionRequest.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the connection request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchConnectionRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByUUID_G(String uuid, long groupId)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByUUID_G(uuid, groupId);

		if (connectionRequest == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchConnectionRequestException(sb.toString());
		}

		return connectionRequest;
	}

	/**
	 * Returns the connection request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the connection request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof ConnectionRequest) {
			ConnectionRequest connectionRequest = (ConnectionRequest)result;

			if (!Objects.equals(uuid, connectionRequest.getUuid()) ||
				(groupId != connectionRequest.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<ConnectionRequest> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					ConnectionRequest connectionRequest = list.get(0);

					result = connectionRequest;

					cacheResult(connectionRequest);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByUUID_G, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ConnectionRequest)result;
		}
	}

	/**
	 * Removes the connection request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the connection request that was removed
	 */
	@Override
	public ConnectionRequest removeByUUID_G(String uuid, long groupId)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = findByUUID_G(uuid, groupId);

		return remove(connectionRequest);
	}

	/**
	 * Returns the number of connection requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"connectionRequest.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(connectionRequest.uuid IS NULL OR connectionRequest.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"connectionRequest.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the connection requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionRequest> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!uuid.equals(connectionRequest.getUuid()) ||
						(companyId != connectionRequest.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public ConnectionRequest findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByUuid_C_PrevAndNext(
			long connectionRequestId, String uuid, long companyId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		uuid = Objects.toString(uuid, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, connectionRequest, uuid, companyId, orderByComparator,
				true);

			array[1] = connectionRequest;

			array[2] = getByUuid_C_PrevAndNext(
				session, connectionRequest, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByUuid_C_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String uuid,
		long companyId, OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (ConnectionRequest connectionRequest :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"connectionRequest.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(connectionRequest.uuid IS NULL OR connectionRequest.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"connectionRequest.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByRequestNo;
	private FinderPath _finderPathWithoutPaginationFindByRequestNo;
	private FinderPath _finderPathCountByRequestNo;

	/**
	 * Returns all the connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByRequestNo(String requestNo) {
		return findByRequestNo(
			requestNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionRequest> findByRequestNo(
		String requestNo, int start, int end) {

		return findByRequestNo(requestNo, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByRequestNo(
		String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByRequestNo(requestNo, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByRequestNo(
		String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		requestNo = Objects.toString(requestNo, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByRequestNo;
				finderArgs = new Object[] {requestNo};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByRequestNo;
			finderArgs = new Object[] {
				requestNo, start, end, orderByComparator
			};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!requestNo.equals(connectionRequest.getRequestNo())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindRequestNo = false;

			if (requestNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_REQUESTNO_REQUESTNO_3);
			}
			else {
				bindRequestNo = true;

				sb.append(_FINDER_COLUMN_REQUESTNO_REQUESTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindRequestNo) {
					queryPos.add(requestNo);
				}

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByRequestNo_First(
			String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByRequestNo_First(
			requestNo, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("requestNo=");
		sb.append(requestNo);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByRequestNo_First(
		String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByRequestNo(
			requestNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByRequestNo_Last(
			String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByRequestNo_Last(
			requestNo, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("requestNo=");
		sb.append(requestNo);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByRequestNo_Last(
		String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByRequestNo(requestNo);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByRequestNo(
			requestNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByRequestNo_PrevAndNext(
			long connectionRequestId, String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		requestNo = Objects.toString(requestNo, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByRequestNo_PrevAndNext(
				session, connectionRequest, requestNo, orderByComparator, true);

			array[1] = connectionRequest;

			array[2] = getByRequestNo_PrevAndNext(
				session, connectionRequest, requestNo, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByRequestNo_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindRequestNo = false;

		if (requestNo.isEmpty()) {
			sb.append(_FINDER_COLUMN_REQUESTNO_REQUESTNO_3);
		}
		else {
			bindRequestNo = true;

			sb.append(_FINDER_COLUMN_REQUESTNO_REQUESTNO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindRequestNo) {
			queryPos.add(requestNo);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where requestNo = &#63; from the database.
	 *
	 * @param requestNo the request no
	 */
	@Override
	public void removeByRequestNo(String requestNo) {
		for (ConnectionRequest connectionRequest :
				findByRequestNo(
					requestNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByRequestNo(String requestNo) {
		requestNo = Objects.toString(requestNo, "");

		FinderPath finderPath = _finderPathCountByRequestNo;

		Object[] finderArgs = new Object[] {requestNo};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindRequestNo = false;

			if (requestNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_REQUESTNO_REQUESTNO_3);
			}
			else {
				bindRequestNo = true;

				sb.append(_FINDER_COLUMN_REQUESTNO_REQUESTNO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindRequestNo) {
					queryPos.add(requestNo);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_REQUESTNO_REQUESTNO_2 =
		"connectionRequest.requestNo = ?";

	private static final String _FINDER_COLUMN_REQUESTNO_REQUESTNO_3 =
		"(connectionRequest.requestNo IS NULL OR connectionRequest.requestNo = '')";

	private FinderPath _finderPathWithPaginationFindByOrderNo;
	private FinderPath _finderPathWithoutPaginationFindByOrderNo;
	private FinderPath _finderPathCountByOrderNo;

	/**
	 * Returns all the connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByOrderNo(String requestNo) {
		return findByOrderNo(
			requestNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionRequest> findByOrderNo(
		String requestNo, int start, int end) {

		return findByOrderNo(requestNo, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByOrderNo(
		String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByOrderNo(requestNo, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByOrderNo(
		String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		requestNo = Objects.toString(requestNo, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByOrderNo;
				finderArgs = new Object[] {requestNo};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByOrderNo;
			finderArgs = new Object[] {
				requestNo, start, end, orderByComparator
			};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!requestNo.equals(connectionRequest.getRequestNo())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindRequestNo = false;

			if (requestNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_ORDERNO_REQUESTNO_3);
			}
			else {
				bindRequestNo = true;

				sb.append(_FINDER_COLUMN_ORDERNO_REQUESTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindRequestNo) {
					queryPos.add(requestNo);
				}

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByOrderNo_First(
			String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByOrderNo_First(
			requestNo, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("requestNo=");
		sb.append(requestNo);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByOrderNo_First(
		String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByOrderNo(
			requestNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByOrderNo_Last(
			String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByOrderNo_Last(
			requestNo, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("requestNo=");
		sb.append(requestNo);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByOrderNo_Last(
		String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByOrderNo(requestNo);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByOrderNo(
			requestNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByOrderNo_PrevAndNext(
			long connectionRequestId, String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		requestNo = Objects.toString(requestNo, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByOrderNo_PrevAndNext(
				session, connectionRequest, requestNo, orderByComparator, true);

			array[1] = connectionRequest;

			array[2] = getByOrderNo_PrevAndNext(
				session, connectionRequest, requestNo, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByOrderNo_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindRequestNo = false;

		if (requestNo.isEmpty()) {
			sb.append(_FINDER_COLUMN_ORDERNO_REQUESTNO_3);
		}
		else {
			bindRequestNo = true;

			sb.append(_FINDER_COLUMN_ORDERNO_REQUESTNO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindRequestNo) {
			queryPos.add(requestNo);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where requestNo = &#63; from the database.
	 *
	 * @param requestNo the request no
	 */
	@Override
	public void removeByOrderNo(String requestNo) {
		for (ConnectionRequest connectionRequest :
				findByOrderNo(
					requestNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where requestNo = &#63;.
	 *
	 * @param requestNo the request no
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByOrderNo(String requestNo) {
		requestNo = Objects.toString(requestNo, "");

		FinderPath finderPath = _finderPathCountByOrderNo;

		Object[] finderArgs = new Object[] {requestNo};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindRequestNo = false;

			if (requestNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_ORDERNO_REQUESTNO_3);
			}
			else {
				bindRequestNo = true;

				sb.append(_FINDER_COLUMN_ORDERNO_REQUESTNO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindRequestNo) {
					queryPos.add(requestNo);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ORDERNO_REQUESTNO_2 =
		"connectionRequest.requestNo = ?";

	private static final String _FINDER_COLUMN_ORDERNO_REQUESTNO_3 =
		"(connectionRequest.requestNo IS NULL OR connectionRequest.requestNo = '')";

	private FinderPath _finderPathWithPaginationFindByCaNumber;
	private FinderPath _finderPathWithoutPaginationFindByCaNumber;
	private FinderPath _finderPathCountByCaNumber;

	/**
	 * Returns all the connection requests where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByCaNumber(String caNumber) {
		return findByCaNumber(
			caNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionRequest> findByCaNumber(
		String caNumber, int start, int end) {

		return findByCaNumber(caNumber, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByCaNumber(
		String caNumber, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByCaNumber(caNumber, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByCaNumber(
		String caNumber, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		caNumber = Objects.toString(caNumber, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByCaNumber;
				finderArgs = new Object[] {caNumber};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByCaNumber;
			finderArgs = new Object[] {caNumber, start, end, orderByComparator};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!caNumber.equals(connectionRequest.getCaNumber())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindCaNumber = false;

			if (caNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANUMBER_CANUMBER_3);
			}
			else {
				bindCaNumber = true;

				sb.append(_FINDER_COLUMN_CANUMBER_CANUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaNumber) {
					queryPos.add(caNumber);
				}

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByCaNumber_First(
			String caNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByCaNumber_First(
			caNumber, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caNumber=");
		sb.append(caNumber);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByCaNumber_First(
		String caNumber,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByCaNumber(
			caNumber, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByCaNumber_Last(
			String caNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByCaNumber_Last(
			caNumber, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caNumber=");
		sb.append(caNumber);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByCaNumber_Last(
		String caNumber,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByCaNumber(caNumber);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByCaNumber(
			caNumber, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByCaNumber_PrevAndNext(
			long connectionRequestId, String caNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		caNumber = Objects.toString(caNumber, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByCaNumber_PrevAndNext(
				session, connectionRequest, caNumber, orderByComparator, true);

			array[1] = connectionRequest;

			array[2] = getByCaNumber_PrevAndNext(
				session, connectionRequest, caNumber, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByCaNumber_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String caNumber,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindCaNumber = false;

		if (caNumber.isEmpty()) {
			sb.append(_FINDER_COLUMN_CANUMBER_CANUMBER_3);
		}
		else {
			bindCaNumber = true;

			sb.append(_FINDER_COLUMN_CANUMBER_CANUMBER_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaNumber) {
			queryPos.add(caNumber);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where caNumber = &#63; from the database.
	 *
	 * @param caNumber the ca number
	 */
	@Override
	public void removeByCaNumber(String caNumber) {
		for (ConnectionRequest connectionRequest :
				findByCaNumber(
					caNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where caNumber = &#63;.
	 *
	 * @param caNumber the ca number
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByCaNumber(String caNumber) {
		caNumber = Objects.toString(caNumber, "");

		FinderPath finderPath = _finderPathCountByCaNumber;

		Object[] finderArgs = new Object[] {caNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindCaNumber = false;

			if (caNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANUMBER_CANUMBER_3);
			}
			else {
				bindCaNumber = true;

				sb.append(_FINDER_COLUMN_CANUMBER_CANUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaNumber) {
					queryPos.add(caNumber);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CANUMBER_CANUMBER_2 =
		"connectionRequest.caNumber = ?";

	private static final String _FINDER_COLUMN_CANUMBER_CANUMBER_3 =
		"(connectionRequest.caNumber IS NULL OR connectionRequest.caNumber = '')";

	private FinderPath _finderPathWithPaginationFindByBpNumber;
	private FinderPath _finderPathWithoutPaginationFindByBpNumber;
	private FinderPath _finderPathCountByBpNumber;

	/**
	 * Returns all the connection requests where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByBpNumber(String bpNumber) {
		return findByBpNumber(
			bpNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionRequest> findByBpNumber(
		String bpNumber, int start, int end) {

		return findByBpNumber(bpNumber, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByBpNumber(
		String bpNumber, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByBpNumber(bpNumber, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByBpNumber(
		String bpNumber, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		bpNumber = Objects.toString(bpNumber, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByBpNumber;
				finderArgs = new Object[] {bpNumber};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByBpNumber;
			finderArgs = new Object[] {bpNumber, start, end, orderByComparator};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!bpNumber.equals(connectionRequest.getBpNumber())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindBpNumber = false;

			if (bpNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_BPNUMBER_BPNUMBER_3);
			}
			else {
				bindBpNumber = true;

				sb.append(_FINDER_COLUMN_BPNUMBER_BPNUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindBpNumber) {
					queryPos.add(bpNumber);
				}

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByBpNumber_First(
			String bpNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByBpNumber_First(
			bpNumber, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("bpNumber=");
		sb.append(bpNumber);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByBpNumber_First(
		String bpNumber,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByBpNumber(
			bpNumber, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByBpNumber_Last(
			String bpNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByBpNumber_Last(
			bpNumber, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("bpNumber=");
		sb.append(bpNumber);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByBpNumber_Last(
		String bpNumber,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByBpNumber(bpNumber);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByBpNumber(
			bpNumber, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByBpNumber_PrevAndNext(
			long connectionRequestId, String bpNumber,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		bpNumber = Objects.toString(bpNumber, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByBpNumber_PrevAndNext(
				session, connectionRequest, bpNumber, orderByComparator, true);

			array[1] = connectionRequest;

			array[2] = getByBpNumber_PrevAndNext(
				session, connectionRequest, bpNumber, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByBpNumber_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String bpNumber,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindBpNumber = false;

		if (bpNumber.isEmpty()) {
			sb.append(_FINDER_COLUMN_BPNUMBER_BPNUMBER_3);
		}
		else {
			bindBpNumber = true;

			sb.append(_FINDER_COLUMN_BPNUMBER_BPNUMBER_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindBpNumber) {
			queryPos.add(bpNumber);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where bpNumber = &#63; from the database.
	 *
	 * @param bpNumber the bp number
	 */
	@Override
	public void removeByBpNumber(String bpNumber) {
		for (ConnectionRequest connectionRequest :
				findByBpNumber(
					bpNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where bpNumber = &#63;.
	 *
	 * @param bpNumber the bp number
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByBpNumber(String bpNumber) {
		bpNumber = Objects.toString(bpNumber, "");

		FinderPath finderPath = _finderPathCountByBpNumber;

		Object[] finderArgs = new Object[] {bpNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindBpNumber = false;

			if (bpNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_BPNUMBER_BPNUMBER_3);
			}
			else {
				bindBpNumber = true;

				sb.append(_FINDER_COLUMN_BPNUMBER_BPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindBpNumber) {
					queryPos.add(bpNumber);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_BPNUMBER_BPNUMBER_2 =
		"connectionRequest.bpNumber = ?";

	private static final String _FINDER_COLUMN_BPNUMBER_BPNUMBER_3 =
		"(connectionRequest.bpNumber IS NULL OR connectionRequest.bpNumber = '')";

	private FinderPath _finderPathWithPaginationFindByMobileNo;
	private FinderPath _finderPathWithoutPaginationFindByMobileNo;
	private FinderPath _finderPathCountByMobileNo;

	/**
	 * Returns all the connection requests where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByMobileNo(String mobileNo) {
		return findByMobileNo(
			mobileNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionRequest> findByMobileNo(
		String mobileNo, int start, int end) {

		return findByMobileNo(mobileNo, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByMobileNo(
		String mobileNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByMobileNo(mobileNo, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByMobileNo(
		String mobileNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		mobileNo = Objects.toString(mobileNo, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByMobileNo;
				finderArgs = new Object[] {mobileNo};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByMobileNo;
			finderArgs = new Object[] {mobileNo, start, end, orderByComparator};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!mobileNo.equals(connectionRequest.getMobileNo())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindMobileNo = false;

			if (mobileNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_3);
			}
			else {
				bindMobileNo = true;

				sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindMobileNo) {
					queryPos.add(mobileNo);
				}

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByMobileNo_First(
			String mobileNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByMobileNo_First(
			mobileNo, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("mobileNo=");
		sb.append(mobileNo);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByMobileNo_First(
		String mobileNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByMobileNo(
			mobileNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByMobileNo_Last(
			String mobileNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByMobileNo_Last(
			mobileNo, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("mobileNo=");
		sb.append(mobileNo);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByMobileNo_Last(
		String mobileNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByMobileNo(mobileNo);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByMobileNo(
			mobileNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByMobileNo_PrevAndNext(
			long connectionRequestId, String mobileNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		mobileNo = Objects.toString(mobileNo, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByMobileNo_PrevAndNext(
				session, connectionRequest, mobileNo, orderByComparator, true);

			array[1] = connectionRequest;

			array[2] = getByMobileNo_PrevAndNext(
				session, connectionRequest, mobileNo, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByMobileNo_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String mobileNo,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindMobileNo = false;

		if (mobileNo.isEmpty()) {
			sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_3);
		}
		else {
			bindMobileNo = true;

			sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindMobileNo) {
			queryPos.add(mobileNo);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where mobileNo = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 */
	@Override
	public void removeByMobileNo(String mobileNo) {
		for (ConnectionRequest connectionRequest :
				findByMobileNo(
					mobileNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByMobileNo(String mobileNo) {
		mobileNo = Objects.toString(mobileNo, "");

		FinderPath finderPath = _finderPathCountByMobileNo;

		Object[] finderArgs = new Object[] {mobileNo};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindMobileNo = false;

			if (mobileNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_3);
			}
			else {
				bindMobileNo = true;

				sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindMobileNo) {
					queryPos.add(mobileNo);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_MOBILENO_MOBILENO_2 =
		"connectionRequest.mobileNo = ?";

	private static final String _FINDER_COLUMN_MOBILENO_MOBILENO_3 =
		"(connectionRequest.mobileNo IS NULL OR connectionRequest.mobileNo = '')";

	private FinderPath _finderPathWithPaginationFindByMobileNoAndRequestNo;
	private FinderPath _finderPathWithoutPaginationFindByMobileNoAndRequestNo;
	private FinderPath _finderPathCountByMobileNoAndRequestNo;

	/**
	 * Returns all the connection requests where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo) {

		return findByMobileNoAndRequestNo(
			mobileNo, requestNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo, int start, int end) {

		return findByMobileNoAndRequestNo(
			mobileNo, requestNo, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByMobileNoAndRequestNo(
			mobileNo, requestNo, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByMobileNoAndRequestNo(
		String mobileNo, String requestNo, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		mobileNo = Objects.toString(mobileNo, "");
		requestNo = Objects.toString(requestNo, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByMobileNoAndRequestNo;
				finderArgs = new Object[] {mobileNo, requestNo};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByMobileNoAndRequestNo;
			finderArgs = new Object[] {
				mobileNo, requestNo, start, end, orderByComparator
			};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!mobileNo.equals(connectionRequest.getMobileNo()) ||
						!requestNo.equals(connectionRequest.getRequestNo())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindMobileNo = false;

			if (mobileNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_MOBILENO_3);
			}
			else {
				bindMobileNo = true;

				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_MOBILENO_2);
			}

			boolean bindRequestNo = false;

			if (requestNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_REQUESTNO_3);
			}
			else {
				bindRequestNo = true;

				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_REQUESTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindMobileNo) {
					queryPos.add(mobileNo);
				}

				if (bindRequestNo) {
					queryPos.add(requestNo);
				}

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public ConnectionRequest findByMobileNoAndRequestNo_First(
			String mobileNo, String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByMobileNoAndRequestNo_First(
			mobileNo, requestNo, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("mobileNo=");
		sb.append(mobileNo);

		sb.append(", requestNo=");
		sb.append(requestNo);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByMobileNoAndRequestNo_First(
		String mobileNo, String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByMobileNoAndRequestNo(
			mobileNo, requestNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest findByMobileNoAndRequestNo_Last(
			String mobileNo, String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByMobileNoAndRequestNo_Last(
			mobileNo, requestNo, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("mobileNo=");
		sb.append(mobileNo);

		sb.append(", requestNo=");
		sb.append(requestNo);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByMobileNoAndRequestNo_Last(
		String mobileNo, String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByMobileNoAndRequestNo(mobileNo, requestNo);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByMobileNoAndRequestNo(
			mobileNo, requestNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByMobileNoAndRequestNo_PrevAndNext(
			long connectionRequestId, String mobileNo, String requestNo,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		mobileNo = Objects.toString(mobileNo, "");
		requestNo = Objects.toString(requestNo, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByMobileNoAndRequestNo_PrevAndNext(
				session, connectionRequest, mobileNo, requestNo,
				orderByComparator, true);

			array[1] = connectionRequest;

			array[2] = getByMobileNoAndRequestNo_PrevAndNext(
				session, connectionRequest, mobileNo, requestNo,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByMobileNoAndRequestNo_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String mobileNo,
		String requestNo,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindMobileNo = false;

		if (mobileNo.isEmpty()) {
			sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_MOBILENO_3);
		}
		else {
			bindMobileNo = true;

			sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_MOBILENO_2);
		}

		boolean bindRequestNo = false;

		if (requestNo.isEmpty()) {
			sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_REQUESTNO_3);
		}
		else {
			bindRequestNo = true;

			sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_REQUESTNO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindMobileNo) {
			queryPos.add(mobileNo);
		}

		if (bindRequestNo) {
			queryPos.add(requestNo);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where mobileNo = &#63; and requestNo = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 */
	@Override
	public void removeByMobileNoAndRequestNo(
		String mobileNo, String requestNo) {

		for (ConnectionRequest connectionRequest :
				findByMobileNoAndRequestNo(
					mobileNo, requestNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where mobileNo = &#63; and requestNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestNo the request no
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByMobileNoAndRequestNo(String mobileNo, String requestNo) {
		mobileNo = Objects.toString(mobileNo, "");
		requestNo = Objects.toString(requestNo, "");

		FinderPath finderPath = _finderPathCountByMobileNoAndRequestNo;

		Object[] finderArgs = new Object[] {mobileNo, requestNo};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindMobileNo = false;

			if (mobileNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_MOBILENO_3);
			}
			else {
				bindMobileNo = true;

				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_MOBILENO_2);
			}

			boolean bindRequestNo = false;

			if (requestNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_REQUESTNO_3);
			}
			else {
				bindRequestNo = true;

				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTNO_REQUESTNO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindMobileNo) {
					queryPos.add(mobileNo);
				}

				if (bindRequestNo) {
					queryPos.add(requestNo);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_MOBILENOANDREQUESTNO_MOBILENO_2 =
		"connectionRequest.mobileNo = ? AND ";

	private static final String _FINDER_COLUMN_MOBILENOANDREQUESTNO_MOBILENO_3 =
		"(connectionRequest.mobileNo IS NULL OR connectionRequest.mobileNo = '') AND ";

	private static final String
		_FINDER_COLUMN_MOBILENOANDREQUESTNO_REQUESTNO_2 =
			"connectionRequest.requestNo = ?";

	private static final String
		_FINDER_COLUMN_MOBILENOANDREQUESTNO_REQUESTNO_3 =
			"(connectionRequest.requestNo IS NULL OR connectionRequest.requestNo = '')";

	private FinderPath _finderPathWithPaginationFindByMobileNoAndRequestStatus;
	private FinderPath
		_finderPathWithoutPaginationFindByMobileNoAndRequestStatus;
	private FinderPath _finderPathCountByMobileNoAndRequestStatus;

	/**
	 * Returns all the connection requests where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus) {

		return findByMobileNoAndRequestStatus(
			mobileNo, requestStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus, int start, int end) {

		return findByMobileNoAndRequestStatus(
			mobileNo, requestStatus, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByMobileNoAndRequestStatus(
			mobileNo, requestStatus, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		mobileNo = Objects.toString(mobileNo, "");
		requestStatus = Objects.toString(requestStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByMobileNoAndRequestStatus;
				finderArgs = new Object[] {mobileNo, requestStatus};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindByMobileNoAndRequestStatus;
			finderArgs = new Object[] {
				mobileNo, requestStatus, start, end, orderByComparator
			};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!mobileNo.equals(connectionRequest.getMobileNo()) ||
						!requestStatus.equals(
							connectionRequest.getRequestStatus())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindMobileNo = false;

			if (mobileNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_MOBILENO_3);
			}
			else {
				bindMobileNo = true;

				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_MOBILENO_2);
			}

			boolean bindRequestStatus = false;

			if (requestStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_REQUESTSTATUS_3);
			}
			else {
				bindRequestStatus = true;

				sb.append(
					_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_REQUESTSTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindMobileNo) {
					queryPos.add(mobileNo);
				}

				if (bindRequestStatus) {
					queryPos.add(requestStatus);
				}

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public ConnectionRequest findByMobileNoAndRequestStatus_First(
			String mobileNo, String requestStatus,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest =
			fetchByMobileNoAndRequestStatus_First(
				mobileNo, requestStatus, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("mobileNo=");
		sb.append(mobileNo);

		sb.append(", requestStatus=");
		sb.append(requestStatus);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByMobileNoAndRequestStatus_First(
		String mobileNo, String requestStatus,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByMobileNoAndRequestStatus(
			mobileNo, requestStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest findByMobileNoAndRequestStatus_Last(
			String mobileNo, String requestStatus,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest =
			fetchByMobileNoAndRequestStatus_Last(
				mobileNo, requestStatus, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("mobileNo=");
		sb.append(mobileNo);

		sb.append(", requestStatus=");
		sb.append(requestStatus);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByMobileNoAndRequestStatus_Last(
		String mobileNo, String requestStatus,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByMobileNoAndRequestStatus(mobileNo, requestStatus);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByMobileNoAndRequestStatus(
			mobileNo, requestStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByMobileNoAndRequestStatus_PrevAndNext(
			long connectionRequestId, String mobileNo, String requestStatus,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		mobileNo = Objects.toString(mobileNo, "");
		requestStatus = Objects.toString(requestStatus, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByMobileNoAndRequestStatus_PrevAndNext(
				session, connectionRequest, mobileNo, requestStatus,
				orderByComparator, true);

			array[1] = connectionRequest;

			array[2] = getByMobileNoAndRequestStatus_PrevAndNext(
				session, connectionRequest, mobileNo, requestStatus,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByMobileNoAndRequestStatus_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String mobileNo,
		String requestStatus,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindMobileNo = false;

		if (mobileNo.isEmpty()) {
			sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_MOBILENO_3);
		}
		else {
			bindMobileNo = true;

			sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_MOBILENO_2);
		}

		boolean bindRequestStatus = false;

		if (requestStatus.isEmpty()) {
			sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_REQUESTSTATUS_3);
		}
		else {
			bindRequestStatus = true;

			sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_REQUESTSTATUS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindMobileNo) {
			queryPos.add(mobileNo);
		}

		if (bindRequestStatus) {
			queryPos.add(requestStatus);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where mobileNo = &#63; and requestStatus = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 */
	@Override
	public void removeByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus) {

		for (ConnectionRequest connectionRequest :
				findByMobileNoAndRequestStatus(
					mobileNo, requestStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where mobileNo = &#63; and requestStatus = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param requestStatus the request status
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByMobileNoAndRequestStatus(
		String mobileNo, String requestStatus) {

		mobileNo = Objects.toString(mobileNo, "");
		requestStatus = Objects.toString(requestStatus, "");

		FinderPath finderPath = _finderPathCountByMobileNoAndRequestStatus;

		Object[] finderArgs = new Object[] {mobileNo, requestStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindMobileNo = false;

			if (mobileNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_MOBILENO_3);
			}
			else {
				bindMobileNo = true;

				sb.append(_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_MOBILENO_2);
			}

			boolean bindRequestStatus = false;

			if (requestStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_REQUESTSTATUS_3);
			}
			else {
				bindRequestStatus = true;

				sb.append(
					_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_REQUESTSTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindMobileNo) {
					queryPos.add(mobileNo);
				}

				if (bindRequestStatus) {
					queryPos.add(requestStatus);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_MOBILENO_2 =
			"connectionRequest.mobileNo = ? AND ";

	private static final String
		_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_MOBILENO_3 =
			"(connectionRequest.mobileNo IS NULL OR connectionRequest.mobileNo = '') AND ";

	private static final String
		_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_REQUESTSTATUS_2 =
			"connectionRequest.requestStatus = ?";

	private static final String
		_FINDER_COLUMN_MOBILENOANDREQUESTSTATUS_REQUESTSTATUS_3 =
			"(connectionRequest.requestStatus IS NULL OR connectionRequest.requestStatus = '')";

	private FinderPath _finderPathWithPaginationFindByEmailId;
	private FinderPath _finderPathWithoutPaginationFindByEmailId;
	private FinderPath _finderPathCountByEmailId;

	/**
	 * Returns all the connection requests where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByEmailId(String emailId) {
		return findByEmailId(
			emailId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionRequest> findByEmailId(
		String emailId, int start, int end) {

		return findByEmailId(emailId, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByEmailId(
		String emailId, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByEmailId(emailId, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByEmailId(
		String emailId, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		emailId = Objects.toString(emailId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByEmailId;
				finderArgs = new Object[] {emailId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByEmailId;
			finderArgs = new Object[] {emailId, start, end, orderByComparator};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!emailId.equals(connectionRequest.getEmailId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindEmailId = false;

			if (emailId.isEmpty()) {
				sb.append(_FINDER_COLUMN_EMAILID_EMAILID_3);
			}
			else {
				bindEmailId = true;

				sb.append(_FINDER_COLUMN_EMAILID_EMAILID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEmailId) {
					queryPos.add(emailId);
				}

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByEmailId_First(
			String emailId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByEmailId_First(
			emailId, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("emailId=");
		sb.append(emailId);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByEmailId_First(
		String emailId,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByEmailId(
			emailId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request
	 * @throws NoSuchConnectionRequestException if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest findByEmailId_Last(
			String emailId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByEmailId_Last(
			emailId, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("emailId=");
		sb.append(emailId);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByEmailId_Last(
		String emailId,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByEmailId(emailId);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByEmailId(
			emailId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByEmailId_PrevAndNext(
			long connectionRequestId, String emailId,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		emailId = Objects.toString(emailId, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByEmailId_PrevAndNext(
				session, connectionRequest, emailId, orderByComparator, true);

			array[1] = connectionRequest;

			array[2] = getByEmailId_PrevAndNext(
				session, connectionRequest, emailId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByEmailId_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String emailId,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindEmailId = false;

		if (emailId.isEmpty()) {
			sb.append(_FINDER_COLUMN_EMAILID_EMAILID_3);
		}
		else {
			bindEmailId = true;

			sb.append(_FINDER_COLUMN_EMAILID_EMAILID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEmailId) {
			queryPos.add(emailId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where emailId = &#63; from the database.
	 *
	 * @param emailId the email ID
	 */
	@Override
	public void removeByEmailId(String emailId) {
		for (ConnectionRequest connectionRequest :
				findByEmailId(
					emailId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByEmailId(String emailId) {
		emailId = Objects.toString(emailId, "");

		FinderPath finderPath = _finderPathCountByEmailId;

		Object[] finderArgs = new Object[] {emailId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindEmailId = false;

			if (emailId.isEmpty()) {
				sb.append(_FINDER_COLUMN_EMAILID_EMAILID_3);
			}
			else {
				bindEmailId = true;

				sb.append(_FINDER_COLUMN_EMAILID_EMAILID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEmailId) {
					queryPos.add(emailId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EMAILID_EMAILID_2 =
		"connectionRequest.emailId = ?";

	private static final String _FINDER_COLUMN_EMAILID_EMAILID_3 =
		"(connectionRequest.emailId IS NULL OR connectionRequest.emailId = '')";

	private FinderPath _finderPathWithPaginationFindByMobileNoAndChangeRequest;
	private FinderPath
		_finderPathWithoutPaginationFindByMobileNoAndChangeRequest;
	private FinderPath _finderPathCountByMobileNoAndChangeRequest;

	/**
	 * Returns all the connection requests where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest) {

		return findByMobileNoAndChangeRequest(
			mobileNo, changeRequest, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest, int start, int end) {

		return findByMobileNoAndChangeRequest(
			mobileNo, changeRequest, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByMobileNoAndChangeRequest(
			mobileNo, changeRequest, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		mobileNo = Objects.toString(mobileNo, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByMobileNoAndChangeRequest;
				finderArgs = new Object[] {mobileNo, changeRequest};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindByMobileNoAndChangeRequest;
			finderArgs = new Object[] {
				mobileNo, changeRequest, start, end, orderByComparator
			};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!mobileNo.equals(connectionRequest.getMobileNo()) ||
						(changeRequest !=
							connectionRequest.isChangeRequest())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindMobileNo = false;

			if (mobileNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_MOBILENO_3);
			}
			else {
				bindMobileNo = true;

				sb.append(_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_MOBILENO_2);
			}

			sb.append(_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_CHANGEREQUEST_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindMobileNo) {
					queryPos.add(mobileNo);
				}

				queryPos.add(changeRequest);

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public ConnectionRequest findByMobileNoAndChangeRequest_First(
			String mobileNo, boolean changeRequest,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest =
			fetchByMobileNoAndChangeRequest_First(
				mobileNo, changeRequest, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("mobileNo=");
		sb.append(mobileNo);

		sb.append(", changeRequest=");
		sb.append(changeRequest);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByMobileNoAndChangeRequest_First(
		String mobileNo, boolean changeRequest,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByMobileNoAndChangeRequest(
			mobileNo, changeRequest, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest findByMobileNoAndChangeRequest_Last(
			String mobileNo, boolean changeRequest,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest =
			fetchByMobileNoAndChangeRequest_Last(
				mobileNo, changeRequest, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("mobileNo=");
		sb.append(mobileNo);

		sb.append(", changeRequest=");
		sb.append(changeRequest);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByMobileNoAndChangeRequest_Last(
		String mobileNo, boolean changeRequest,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByMobileNoAndChangeRequest(mobileNo, changeRequest);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByMobileNoAndChangeRequest(
			mobileNo, changeRequest, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByMobileNoAndChangeRequest_PrevAndNext(
			long connectionRequestId, String mobileNo, boolean changeRequest,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		mobileNo = Objects.toString(mobileNo, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByMobileNoAndChangeRequest_PrevAndNext(
				session, connectionRequest, mobileNo, changeRequest,
				orderByComparator, true);

			array[1] = connectionRequest;

			array[2] = getByMobileNoAndChangeRequest_PrevAndNext(
				session, connectionRequest, mobileNo, changeRequest,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByMobileNoAndChangeRequest_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String mobileNo,
		boolean changeRequest,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindMobileNo = false;

		if (mobileNo.isEmpty()) {
			sb.append(_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_MOBILENO_3);
		}
		else {
			bindMobileNo = true;

			sb.append(_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_MOBILENO_2);
		}

		sb.append(_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_CHANGEREQUEST_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindMobileNo) {
			queryPos.add(mobileNo);
		}

		queryPos.add(changeRequest);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where mobileNo = &#63; and changeRequest = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 */
	@Override
	public void removeByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest) {

		for (ConnectionRequest connectionRequest :
				findByMobileNoAndChangeRequest(
					mobileNo, changeRequest, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where mobileNo = &#63; and changeRequest = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param changeRequest the change request
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByMobileNoAndChangeRequest(
		String mobileNo, boolean changeRequest) {

		mobileNo = Objects.toString(mobileNo, "");

		FinderPath finderPath = _finderPathCountByMobileNoAndChangeRequest;

		Object[] finderArgs = new Object[] {mobileNo, changeRequest};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindMobileNo = false;

			if (mobileNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_MOBILENO_3);
			}
			else {
				bindMobileNo = true;

				sb.append(_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_MOBILENO_2);
			}

			sb.append(_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_CHANGEREQUEST_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindMobileNo) {
					queryPos.add(mobileNo);
				}

				queryPos.add(changeRequest);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_MOBILENO_2 =
			"connectionRequest.mobileNo = ? AND ";

	private static final String
		_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_MOBILENO_3 =
			"(connectionRequest.mobileNo IS NULL OR connectionRequest.mobileNo = '') AND ";

	private static final String
		_FINDER_COLUMN_MOBILENOANDCHANGEREQUEST_CHANGEREQUEST_2 =
			"connectionRequest.changeRequest = ?";

	private FinderPath _finderPathWithPaginationFindByCaNumberAndChangeRequest;
	private FinderPath
		_finderPathWithoutPaginationFindByCaNumberAndChangeRequest;
	private FinderPath _finderPathCountByCaNumberAndChangeRequest;

	/**
	 * Returns all the connection requests where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @return the matching connection requests
	 */
	@Override
	public List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest) {

		return findByCaNumberAndChangeRequest(
			caNumber, changeRequest, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest, int start, int end) {

		return findByCaNumberAndChangeRequest(
			caNumber, changeRequest, start, end, null);
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
	@Override
	public List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findByCaNumberAndChangeRequest(
			caNumber, changeRequest, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest, int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		caNumber = Objects.toString(caNumber, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByCaNumberAndChangeRequest;
				finderArgs = new Object[] {caNumber, changeRequest};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindByCaNumberAndChangeRequest;
			finderArgs = new Object[] {
				caNumber, changeRequest, start, end, orderByComparator
			};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionRequest connectionRequest : list) {
					if (!caNumber.equals(connectionRequest.getCaNumber()) ||
						(changeRequest !=
							connectionRequest.isChangeRequest())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

			boolean bindCaNumber = false;

			if (caNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CANUMBER_3);
			}
			else {
				bindCaNumber = true;

				sb.append(_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CANUMBER_2);
			}

			sb.append(_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CHANGEREQUEST_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaNumber) {
					queryPos.add(caNumber);
				}

				queryPos.add(changeRequest);

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public ConnectionRequest findByCaNumberAndChangeRequest_First(
			String caNumber, boolean changeRequest,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest =
			fetchByCaNumberAndChangeRequest_First(
				caNumber, changeRequest, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caNumber=");
		sb.append(caNumber);

		sb.append(", changeRequest=");
		sb.append(changeRequest);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the first connection request in the ordered set where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByCaNumberAndChangeRequest_First(
		String caNumber, boolean changeRequest,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		List<ConnectionRequest> list = findByCaNumberAndChangeRequest(
			caNumber, changeRequest, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest findByCaNumberAndChangeRequest_Last(
			String caNumber, boolean changeRequest,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest =
			fetchByCaNumberAndChangeRequest_Last(
				caNumber, changeRequest, orderByComparator);

		if (connectionRequest != null) {
			return connectionRequest;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caNumber=");
		sb.append(caNumber);

		sb.append(", changeRequest=");
		sb.append(changeRequest);

		sb.append("}");

		throw new NoSuchConnectionRequestException(sb.toString());
	}

	/**
	 * Returns the last connection request in the ordered set where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection request, or <code>null</code> if a matching connection request could not be found
	 */
	@Override
	public ConnectionRequest fetchByCaNumberAndChangeRequest_Last(
		String caNumber, boolean changeRequest,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		int count = countByCaNumberAndChangeRequest(caNumber, changeRequest);

		if (count == 0) {
			return null;
		}

		List<ConnectionRequest> list = findByCaNumberAndChangeRequest(
			caNumber, changeRequest, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionRequest[] findByCaNumberAndChangeRequest_PrevAndNext(
			long connectionRequestId, String caNumber, boolean changeRequest,
			OrderByComparator<ConnectionRequest> orderByComparator)
		throws NoSuchConnectionRequestException {

		caNumber = Objects.toString(caNumber, "");

		ConnectionRequest connectionRequest = findByPrimaryKey(
			connectionRequestId);

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest[] array = new ConnectionRequestImpl[3];

			array[0] = getByCaNumberAndChangeRequest_PrevAndNext(
				session, connectionRequest, caNumber, changeRequest,
				orderByComparator, true);

			array[1] = connectionRequest;

			array[2] = getByCaNumberAndChangeRequest_PrevAndNext(
				session, connectionRequest, caNumber, changeRequest,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionRequest getByCaNumberAndChangeRequest_PrevAndNext(
		Session session, ConnectionRequest connectionRequest, String caNumber,
		boolean changeRequest,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE);

		boolean bindCaNumber = false;

		if (caNumber.isEmpty()) {
			sb.append(_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CANUMBER_3);
		}
		else {
			bindCaNumber = true;

			sb.append(_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CANUMBER_2);
		}

		sb.append(_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CHANGEREQUEST_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ConnectionRequestModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaNumber) {
			queryPos.add(caNumber);
		}

		queryPos.add(changeRequest);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionRequest)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionRequest> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection requests where caNumber = &#63; and changeRequest = &#63; from the database.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 */
	@Override
	public void removeByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest) {

		for (ConnectionRequest connectionRequest :
				findByCaNumberAndChangeRequest(
					caNumber, changeRequest, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests where caNumber = &#63; and changeRequest = &#63;.
	 *
	 * @param caNumber the ca number
	 * @param changeRequest the change request
	 * @return the number of matching connection requests
	 */
	@Override
	public int countByCaNumberAndChangeRequest(
		String caNumber, boolean changeRequest) {

		caNumber = Objects.toString(caNumber, "");

		FinderPath finderPath = _finderPathCountByCaNumberAndChangeRequest;

		Object[] finderArgs = new Object[] {caNumber, changeRequest};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CONNECTIONREQUEST_WHERE);

			boolean bindCaNumber = false;

			if (caNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CANUMBER_3);
			}
			else {
				bindCaNumber = true;

				sb.append(_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CANUMBER_2);
			}

			sb.append(_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CHANGEREQUEST_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaNumber) {
					queryPos.add(caNumber);
				}

				queryPos.add(changeRequest);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CANUMBER_2 =
			"connectionRequest.caNumber = ? AND ";

	private static final String
		_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CANUMBER_3 =
			"(connectionRequest.caNumber IS NULL OR connectionRequest.caNumber = '') AND ";

	private static final String
		_FINDER_COLUMN_CANUMBERANDCHANGEREQUEST_CHANGEREQUEST_2 =
			"connectionRequest.changeRequest = ?";

	public ConnectionRequestPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
				"_dbColumnNames");

			field.setAccessible(true);

			field.set(this, dbColumnNames);
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception, exception);
			}
		}

		setModelClass(ConnectionRequest.class);
	}

	/**
	 * Caches the connection request in the entity cache if it is enabled.
	 *
	 * @param connectionRequest the connection request
	 */
	@Override
	public void cacheResult(ConnectionRequest connectionRequest) {
		entityCache.putResult(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestImpl.class, connectionRequest.getPrimaryKey(),
			connectionRequest);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				connectionRequest.getUuid(), connectionRequest.getGroupId()
			},
			connectionRequest);

		connectionRequest.resetOriginalValues();
	}

	/**
	 * Caches the connection requests in the entity cache if it is enabled.
	 *
	 * @param connectionRequests the connection requests
	 */
	@Override
	public void cacheResult(List<ConnectionRequest> connectionRequests) {
		for (ConnectionRequest connectionRequest : connectionRequests) {
			if (entityCache.getResult(
					ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
					ConnectionRequestImpl.class,
					connectionRequest.getPrimaryKey()) == null) {

				cacheResult(connectionRequest);
			}
			else {
				connectionRequest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all connection requests.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ConnectionRequestImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the connection request.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ConnectionRequest connectionRequest) {
		entityCache.removeResult(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestImpl.class, connectionRequest.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(ConnectionRequestModelImpl)connectionRequest, true);
	}

	@Override
	public void clearCache(List<ConnectionRequest> connectionRequests) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ConnectionRequest connectionRequest : connectionRequests) {
			entityCache.removeResult(
				ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionRequestImpl.class, connectionRequest.getPrimaryKey());

			clearUniqueFindersCache(
				(ConnectionRequestModelImpl)connectionRequest, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionRequestImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ConnectionRequestModelImpl connectionRequestModelImpl) {

		Object[] args = new Object[] {
			connectionRequestModelImpl.getUuid(),
			connectionRequestModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, connectionRequestModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ConnectionRequestModelImpl connectionRequestModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				connectionRequestModelImpl.getUuid(),
				connectionRequestModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((connectionRequestModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				connectionRequestModelImpl.getOriginalUuid(),
				connectionRequestModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new connection request with the primary key. Does not add the connection request to the database.
	 *
	 * @param connectionRequestId the primary key for the new connection request
	 * @return the new connection request
	 */
	@Override
	public ConnectionRequest create(long connectionRequestId) {
		ConnectionRequest connectionRequest = new ConnectionRequestImpl();

		connectionRequest.setNew(true);
		connectionRequest.setPrimaryKey(connectionRequestId);

		String uuid = PortalUUIDUtil.generate();

		connectionRequest.setUuid(uuid);

		connectionRequest.setCompanyId(CompanyThreadLocal.getCompanyId());

		return connectionRequest;
	}

	/**
	 * Removes the connection request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request that was removed
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	@Override
	public ConnectionRequest remove(long connectionRequestId)
		throws NoSuchConnectionRequestException {

		return remove((Serializable)connectionRequestId);
	}

	/**
	 * Removes the connection request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the connection request
	 * @return the connection request that was removed
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	@Override
	public ConnectionRequest remove(Serializable primaryKey)
		throws NoSuchConnectionRequestException {

		Session session = null;

		try {
			session = openSession();

			ConnectionRequest connectionRequest =
				(ConnectionRequest)session.get(
					ConnectionRequestImpl.class, primaryKey);

			if (connectionRequest == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConnectionRequestException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(connectionRequest);
		}
		catch (NoSuchConnectionRequestException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ConnectionRequest removeImpl(
		ConnectionRequest connectionRequest) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(connectionRequest)) {
				connectionRequest = (ConnectionRequest)session.get(
					ConnectionRequestImpl.class,
					connectionRequest.getPrimaryKeyObj());
			}

			if (connectionRequest != null) {
				session.delete(connectionRequest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (connectionRequest != null) {
			clearCache(connectionRequest);
		}

		return connectionRequest;
	}

	@Override
	public ConnectionRequest updateImpl(ConnectionRequest connectionRequest) {
		boolean isNew = connectionRequest.isNew();

		if (!(connectionRequest instanceof ConnectionRequestModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(connectionRequest.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					connectionRequest);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in connectionRequest proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ConnectionRequest implementation " +
					connectionRequest.getClass());
		}

		ConnectionRequestModelImpl connectionRequestModelImpl =
			(ConnectionRequestModelImpl)connectionRequest;

		if (Validator.isNull(connectionRequest.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			connectionRequest.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (connectionRequest.getCreateDate() == null)) {
			if (serviceContext == null) {
				connectionRequest.setCreateDate(now);
			}
			else {
				connectionRequest.setCreateDate(
					serviceContext.getCreateDate(now));
			}
		}

		if (!connectionRequestModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				connectionRequest.setModifiedDate(now);
			}
			else {
				connectionRequest.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(connectionRequest);

				connectionRequest.setNew(false);
			}
			else {
				connectionRequest = (ConnectionRequest)session.merge(
					connectionRequest);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ConnectionRequestModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {connectionRequestModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				connectionRequestModelImpl.getUuid(),
				connectionRequestModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {connectionRequestModelImpl.getRequestNo()};

			finderCache.removeResult(_finderPathCountByRequestNo, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByRequestNo, args);

			args = new Object[] {connectionRequestModelImpl.getRequestNo()};

			finderCache.removeResult(_finderPathCountByOrderNo, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByOrderNo, args);

			args = new Object[] {connectionRequestModelImpl.getCaNumber()};

			finderCache.removeResult(_finderPathCountByCaNumber, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCaNumber, args);

			args = new Object[] {connectionRequestModelImpl.getBpNumber()};

			finderCache.removeResult(_finderPathCountByBpNumber, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByBpNumber, args);

			args = new Object[] {connectionRequestModelImpl.getMobileNo()};

			finderCache.removeResult(_finderPathCountByMobileNo, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByMobileNo, args);

			args = new Object[] {
				connectionRequestModelImpl.getMobileNo(),
				connectionRequestModelImpl.getRequestNo()
			};

			finderCache.removeResult(
				_finderPathCountByMobileNoAndRequestNo, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByMobileNoAndRequestNo, args);

			args = new Object[] {
				connectionRequestModelImpl.getMobileNo(),
				connectionRequestModelImpl.getRequestStatus()
			};

			finderCache.removeResult(
				_finderPathCountByMobileNoAndRequestStatus, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByMobileNoAndRequestStatus,
				args);

			args = new Object[] {connectionRequestModelImpl.getEmailId()};

			finderCache.removeResult(_finderPathCountByEmailId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByEmailId, args);

			args = new Object[] {
				connectionRequestModelImpl.getMobileNo(),
				connectionRequestModelImpl.isChangeRequest()
			};

			finderCache.removeResult(
				_finderPathCountByMobileNoAndChangeRequest, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByMobileNoAndChangeRequest,
				args);

			args = new Object[] {
				connectionRequestModelImpl.getCaNumber(),
				connectionRequestModelImpl.isChangeRequest()
			};

			finderCache.removeResult(
				_finderPathCountByCaNumberAndChangeRequest, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCaNumberAndChangeRequest,
				args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {connectionRequestModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalUuid(),
					connectionRequestModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					connectionRequestModelImpl.getUuid(),
					connectionRequestModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByRequestNo.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalRequestNo()
				};

				finderCache.removeResult(_finderPathCountByRequestNo, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByRequestNo, args);

				args = new Object[] {connectionRequestModelImpl.getRequestNo()};

				finderCache.removeResult(_finderPathCountByRequestNo, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByRequestNo, args);
			}

			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByOrderNo.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalRequestNo()
				};

				finderCache.removeResult(_finderPathCountByOrderNo, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByOrderNo, args);

				args = new Object[] {connectionRequestModelImpl.getRequestNo()};

				finderCache.removeResult(_finderPathCountByOrderNo, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByOrderNo, args);
			}

			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCaNumber.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalCaNumber()
				};

				finderCache.removeResult(_finderPathCountByCaNumber, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCaNumber, args);

				args = new Object[] {connectionRequestModelImpl.getCaNumber()};

				finderCache.removeResult(_finderPathCountByCaNumber, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCaNumber, args);
			}

			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByBpNumber.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalBpNumber()
				};

				finderCache.removeResult(_finderPathCountByBpNumber, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByBpNumber, args);

				args = new Object[] {connectionRequestModelImpl.getBpNumber()};

				finderCache.removeResult(_finderPathCountByBpNumber, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByBpNumber, args);
			}

			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByMobileNo.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalMobileNo()
				};

				finderCache.removeResult(_finderPathCountByMobileNo, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByMobileNo, args);

				args = new Object[] {connectionRequestModelImpl.getMobileNo()};

				finderCache.removeResult(_finderPathCountByMobileNo, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByMobileNo, args);
			}

			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByMobileNoAndRequestNo.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalMobileNo(),
					connectionRequestModelImpl.getOriginalRequestNo()
				};

				finderCache.removeResult(
					_finderPathCountByMobileNoAndRequestNo, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByMobileNoAndRequestNo,
					args);

				args = new Object[] {
					connectionRequestModelImpl.getMobileNo(),
					connectionRequestModelImpl.getRequestNo()
				};

				finderCache.removeResult(
					_finderPathCountByMobileNoAndRequestNo, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByMobileNoAndRequestNo,
					args);
			}

			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByMobileNoAndRequestStatus.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalMobileNo(),
					connectionRequestModelImpl.getOriginalRequestStatus()
				};

				finderCache.removeResult(
					_finderPathCountByMobileNoAndRequestStatus, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByMobileNoAndRequestStatus,
					args);

				args = new Object[] {
					connectionRequestModelImpl.getMobileNo(),
					connectionRequestModelImpl.getRequestStatus()
				};

				finderCache.removeResult(
					_finderPathCountByMobileNoAndRequestStatus, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByMobileNoAndRequestStatus,
					args);
			}

			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByEmailId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalEmailId()
				};

				finderCache.removeResult(_finderPathCountByEmailId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEmailId, args);

				args = new Object[] {connectionRequestModelImpl.getEmailId()};

				finderCache.removeResult(_finderPathCountByEmailId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEmailId, args);
			}

			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByMobileNoAndChangeRequest.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalMobileNo(),
					connectionRequestModelImpl.getOriginalChangeRequest()
				};

				finderCache.removeResult(
					_finderPathCountByMobileNoAndChangeRequest, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByMobileNoAndChangeRequest,
					args);

				args = new Object[] {
					connectionRequestModelImpl.getMobileNo(),
					connectionRequestModelImpl.isChangeRequest()
				};

				finderCache.removeResult(
					_finderPathCountByMobileNoAndChangeRequest, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByMobileNoAndChangeRequest,
					args);
			}

			if ((connectionRequestModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCaNumberAndChangeRequest.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					connectionRequestModelImpl.getOriginalCaNumber(),
					connectionRequestModelImpl.getOriginalChangeRequest()
				};

				finderCache.removeResult(
					_finderPathCountByCaNumberAndChangeRequest, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCaNumberAndChangeRequest,
					args);

				args = new Object[] {
					connectionRequestModelImpl.getCaNumber(),
					connectionRequestModelImpl.isChangeRequest()
				};

				finderCache.removeResult(
					_finderPathCountByCaNumberAndChangeRequest, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCaNumberAndChangeRequest,
					args);
			}
		}

		entityCache.putResult(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestImpl.class, connectionRequest.getPrimaryKey(),
			connectionRequest, false);

		clearUniqueFindersCache(connectionRequestModelImpl, false);
		cacheUniqueFindersCache(connectionRequestModelImpl);

		connectionRequest.resetOriginalValues();

		return connectionRequest;
	}

	/**
	 * Returns the connection request with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection request
	 * @return the connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	@Override
	public ConnectionRequest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConnectionRequestException {

		ConnectionRequest connectionRequest = fetchByPrimaryKey(primaryKey);

		if (connectionRequest == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConnectionRequestException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return connectionRequest;
	}

	/**
	 * Returns the connection request with the primary key or throws a <code>NoSuchConnectionRequestException</code> if it could not be found.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request
	 * @throws NoSuchConnectionRequestException if a connection request with the primary key could not be found
	 */
	@Override
	public ConnectionRequest findByPrimaryKey(long connectionRequestId)
		throws NoSuchConnectionRequestException {

		return findByPrimaryKey((Serializable)connectionRequestId);
	}

	/**
	 * Returns the connection request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection request
	 * @return the connection request, or <code>null</code> if a connection request with the primary key could not be found
	 */
	@Override
	public ConnectionRequest fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ConnectionRequest connectionRequest = (ConnectionRequest)serializable;

		if (connectionRequest == null) {
			Session session = null;

			try {
				session = openSession();

				connectionRequest = (ConnectionRequest)session.get(
					ConnectionRequestImpl.class, primaryKey);

				if (connectionRequest != null) {
					cacheResult(connectionRequest);
				}
				else {
					entityCache.putResult(
						ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
						ConnectionRequestImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception exception) {
				entityCache.removeResult(
					ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
					ConnectionRequestImpl.class, primaryKey);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return connectionRequest;
	}

	/**
	 * Returns the connection request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param connectionRequestId the primary key of the connection request
	 * @return the connection request, or <code>null</code> if a connection request with the primary key could not be found
	 */
	@Override
	public ConnectionRequest fetchByPrimaryKey(long connectionRequestId) {
		return fetchByPrimaryKey((Serializable)connectionRequestId);
	}

	@Override
	public Map<Serializable, ConnectionRequest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ConnectionRequest> map =
			new HashMap<Serializable, ConnectionRequest>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ConnectionRequest connectionRequest = fetchByPrimaryKey(primaryKey);

			if (connectionRequest != null) {
				map.put(primaryKey, connectionRequest);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionRequestImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ConnectionRequest)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler sb = new StringBundler(
			(uncachedPrimaryKeys.size() * 2) + 1);

		sb.append(_SQL_SELECT_CONNECTIONREQUEST_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			sb.append((long)primaryKey);

			sb.append(",");
		}

		sb.setIndex(sb.index() - 1);

		sb.append(")");

		String sql = sb.toString();

		Session session = null;

		try {
			session = openSession();

			Query query = session.createQuery(sql);

			for (ConnectionRequest connectionRequest :
					(List<ConnectionRequest>)query.list()) {

				map.put(
					connectionRequest.getPrimaryKeyObj(), connectionRequest);

				cacheResult(connectionRequest);

				uncachedPrimaryKeys.remove(
					connectionRequest.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
					ConnectionRequestImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the connection requests.
	 *
	 * @return the connection requests
	 */
	@Override
	public List<ConnectionRequest> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionRequest> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<ConnectionRequest> findAll(
		int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionRequest> findAll(
		int start, int end,
		OrderByComparator<ConnectionRequest> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<ConnectionRequest> list = null;

		if (useFinderCache) {
			list = (List<ConnectionRequest>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CONNECTIONREQUEST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CONNECTIONREQUEST;

				sql = sql.concat(ConnectionRequestModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ConnectionRequest>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the connection requests from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ConnectionRequest connectionRequest : findAll()) {
			remove(connectionRequest);
		}
	}

	/**
	 * Returns the number of connection requests.
	 *
	 * @return the number of connection requests
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CONNECTIONREQUEST);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ConnectionRequestModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the connection request persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			ConnectionRequestModelImpl.UUID_COLUMN_BITMASK |
			ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			ConnectionRequestModelImpl.UUID_COLUMN_BITMASK |
			ConnectionRequestModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			ConnectionRequestModelImpl.UUID_COLUMN_BITMASK |
			ConnectionRequestModelImpl.COMPANYID_COLUMN_BITMASK |
			ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByRequestNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRequestNo",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByRequestNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByRequestNo",
			new String[] {String.class.getName()},
			ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByRequestNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRequestNo",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByOrderNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByOrderNo",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByOrderNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOrderNo",
			new String[] {String.class.getName()},
			ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByOrderNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOrderNo",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByCaNumber = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCaNumber",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCaNumber = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCaNumber",
			new String[] {String.class.getName()},
			ConnectionRequestModelImpl.CANUMBER_COLUMN_BITMASK |
			ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByCaNumber = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCaNumber",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByBpNumber = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByBpNumber",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByBpNumber = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBpNumber",
			new String[] {String.class.getName()},
			ConnectionRequestModelImpl.BPNUMBER_COLUMN_BITMASK |
			ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByBpNumber = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBpNumber",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByMobileNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByMobileNo",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByMobileNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMobileNo",
			new String[] {String.class.getName()},
			ConnectionRequestModelImpl.MOBILENO_COLUMN_BITMASK |
			ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByMobileNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMobileNo",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByMobileNoAndRequestNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByMobileNoAndRequestNo",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByMobileNoAndRequestNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByMobileNoAndRequestNo",
			new String[] {String.class.getName(), String.class.getName()},
			ConnectionRequestModelImpl.MOBILENO_COLUMN_BITMASK |
			ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByMobileNoAndRequestNo = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMobileNoAndRequestNo",
			new String[] {String.class.getName(), String.class.getName()});

		_finderPathWithPaginationFindByMobileNoAndRequestStatus =
			new FinderPath(
				ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
				ConnectionRequestImpl.class,
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findByMobileNoAndRequestStatus",
				new String[] {
					String.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				});

		_finderPathWithoutPaginationFindByMobileNoAndRequestStatus =
			new FinderPath(
				ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
				ConnectionRequestImpl.class,
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findByMobileNoAndRequestStatus",
				new String[] {String.class.getName(), String.class.getName()},
				ConnectionRequestModelImpl.MOBILENO_COLUMN_BITMASK |
				ConnectionRequestModelImpl.REQUESTSTATUS_COLUMN_BITMASK |
				ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByMobileNoAndRequestStatus = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMobileNoAndRequestStatus",
			new String[] {String.class.getName(), String.class.getName()});

		_finderPathWithPaginationFindByEmailId = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByEmailId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByEmailId = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
			ConnectionRequestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmailId",
			new String[] {String.class.getName()},
			ConnectionRequestModelImpl.EMAILID_COLUMN_BITMASK |
			ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByEmailId = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmailId",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByMobileNoAndChangeRequest =
			new FinderPath(
				ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
				ConnectionRequestImpl.class,
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findByMobileNoAndChangeRequest",
				new String[] {
					String.class.getName(), Boolean.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				});

		_finderPathWithoutPaginationFindByMobileNoAndChangeRequest =
			new FinderPath(
				ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
				ConnectionRequestImpl.class,
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findByMobileNoAndChangeRequest",
				new String[] {String.class.getName(), Boolean.class.getName()},
				ConnectionRequestModelImpl.MOBILENO_COLUMN_BITMASK |
				ConnectionRequestModelImpl.CHANGEREQUEST_COLUMN_BITMASK |
				ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByMobileNoAndChangeRequest = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByMobileNoAndChangeRequest",
			new String[] {String.class.getName(), Boolean.class.getName()});

		_finderPathWithPaginationFindByCaNumberAndChangeRequest =
			new FinderPath(
				ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
				ConnectionRequestImpl.class,
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findByCaNumberAndChangeRequest",
				new String[] {
					String.class.getName(), Boolean.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				});

		_finderPathWithoutPaginationFindByCaNumberAndChangeRequest =
			new FinderPath(
				ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionRequestModelImpl.FINDER_CACHE_ENABLED,
				ConnectionRequestImpl.class,
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findByCaNumberAndChangeRequest",
				new String[] {String.class.getName(), Boolean.class.getName()},
				ConnectionRequestModelImpl.CANUMBER_COLUMN_BITMASK |
				ConnectionRequestModelImpl.CHANGEREQUEST_COLUMN_BITMASK |
				ConnectionRequestModelImpl.REQUESTNO_COLUMN_BITMASK);

		_finderPathCountByCaNumberAndChangeRequest = new FinderPath(
			ConnectionRequestModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionRequestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCaNumberAndChangeRequest",
			new String[] {String.class.getName(), Boolean.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(ConnectionRequestImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CONNECTIONREQUEST =
		"SELECT connectionRequest FROM ConnectionRequest connectionRequest";

	private static final String _SQL_SELECT_CONNECTIONREQUEST_WHERE_PKS_IN =
		"SELECT connectionRequest FROM ConnectionRequest connectionRequest WHERE connectionRequestId IN (";

	private static final String _SQL_SELECT_CONNECTIONREQUEST_WHERE =
		"SELECT connectionRequest FROM ConnectionRequest connectionRequest WHERE ";

	private static final String _SQL_COUNT_CONNECTIONREQUEST =
		"SELECT COUNT(connectionRequest) FROM ConnectionRequest connectionRequest";

	private static final String _SQL_COUNT_CONNECTIONREQUEST_WHERE =
		"SELECT COUNT(connectionRequest) FROM ConnectionRequest connectionRequest WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "connectionRequest.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ConnectionRequest exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ConnectionRequest exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ConnectionRequestPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}