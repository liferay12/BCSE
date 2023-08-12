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

import com.bses.connection2.exception.NoSuchRequestNumberSeqException;
import com.bses.connection2.model.RequestNumberSeq;
import com.bses.connection2.model.impl.RequestNumberSeqImpl;
import com.bses.connection2.model.impl.RequestNumberSeqModelImpl;
import com.bses.connection2.service.persistence.RequestNumberSeqPersistence;

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
import com.liferay.portal.kernel.util.StringUtil;
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
 * The persistence implementation for the request number seq service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RequestNumberSeqPersistenceImpl
	extends BasePersistenceImpl<RequestNumberSeq>
	implements RequestNumberSeqPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RequestNumberSeqUtil</code> to access the request number seq persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RequestNumberSeqImpl.class.getName();

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
	 * Returns all the request number seqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching request number seqs
	 */
	@Override
	public List<RequestNumberSeq> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<RequestNumberSeq> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<RequestNumberSeq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<RequestNumberSeq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator,
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

		List<RequestNumberSeq> list = null;

		if (useFinderCache) {
			list = (List<RequestNumberSeq>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RequestNumberSeq requestNumberSeq : list) {
					if (!uuid.equals(requestNumberSeq.getUuid())) {
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

			sb.append(_SQL_SELECT_REQUESTNUMBERSEQ_WHERE);

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
				sb.append(RequestNumberSeqModelImpl.ORDER_BY_JPQL);
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

				list = (List<RequestNumberSeq>)QueryUtil.list(
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
	 * Returns the first request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq findByUuid_First(
			String uuid, OrderByComparator<RequestNumberSeq> orderByComparator)
		throws NoSuchRequestNumberSeqException {

		RequestNumberSeq requestNumberSeq = fetchByUuid_First(
			uuid, orderByComparator);

		if (requestNumberSeq != null) {
			return requestNumberSeq;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchRequestNumberSeqException(sb.toString());
	}

	/**
	 * Returns the first request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq fetchByUuid_First(
		String uuid, OrderByComparator<RequestNumberSeq> orderByComparator) {

		List<RequestNumberSeq> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq findByUuid_Last(
			String uuid, OrderByComparator<RequestNumberSeq> orderByComparator)
		throws NoSuchRequestNumberSeqException {

		RequestNumberSeq requestNumberSeq = fetchByUuid_Last(
			uuid, orderByComparator);

		if (requestNumberSeq != null) {
			return requestNumberSeq;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchRequestNumberSeqException(sb.toString());
	}

	/**
	 * Returns the last request number seq in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq fetchByUuid_Last(
		String uuid, OrderByComparator<RequestNumberSeq> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<RequestNumberSeq> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public RequestNumberSeq[] findByUuid_PrevAndNext(
			long requestNumberSeqId, String uuid,
			OrderByComparator<RequestNumberSeq> orderByComparator)
		throws NoSuchRequestNumberSeqException {

		uuid = Objects.toString(uuid, "");

		RequestNumberSeq requestNumberSeq = findByPrimaryKey(
			requestNumberSeqId);

		Session session = null;

		try {
			session = openSession();

			RequestNumberSeq[] array = new RequestNumberSeqImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, requestNumberSeq, uuid, orderByComparator, true);

			array[1] = requestNumberSeq;

			array[2] = getByUuid_PrevAndNext(
				session, requestNumberSeq, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected RequestNumberSeq getByUuid_PrevAndNext(
		Session session, RequestNumberSeq requestNumberSeq, String uuid,
		OrderByComparator<RequestNumberSeq> orderByComparator,
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

		sb.append(_SQL_SELECT_REQUESTNUMBERSEQ_WHERE);

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
			sb.append(RequestNumberSeqModelImpl.ORDER_BY_JPQL);
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
						requestNumberSeq)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<RequestNumberSeq> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the request number seqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (RequestNumberSeq requestNumberSeq :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(requestNumberSeq);
		}
	}

	/**
	 * Returns the number of request number seqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching request number seqs
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_REQUESTNUMBERSEQ_WHERE);

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
		"requestNumberSeq.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(requestNumberSeq.uuid IS NULL OR requestNumberSeq.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the request number seq where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRequestNumberSeqException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq findByUUID_G(String uuid, long groupId)
		throws NoSuchRequestNumberSeqException {

		RequestNumberSeq requestNumberSeq = fetchByUUID_G(uuid, groupId);

		if (requestNumberSeq == null) {
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

			throw new NoSuchRequestNumberSeqException(sb.toString());
		}

		return requestNumberSeq;
	}

	/**
	 * Returns the request number seq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the request number seq where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq fetchByUUID_G(
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

		if (result instanceof RequestNumberSeq) {
			RequestNumberSeq requestNumberSeq = (RequestNumberSeq)result;

			if (!Objects.equals(uuid, requestNumberSeq.getUuid()) ||
				(groupId != requestNumberSeq.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_REQUESTNUMBERSEQ_WHERE);

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

				List<RequestNumberSeq> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					RequestNumberSeq requestNumberSeq = list.get(0);

					result = requestNumberSeq;

					cacheResult(requestNumberSeq);
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
			return (RequestNumberSeq)result;
		}
	}

	/**
	 * Removes the request number seq where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the request number seq that was removed
	 */
	@Override
	public RequestNumberSeq removeByUUID_G(String uuid, long groupId)
		throws NoSuchRequestNumberSeqException {

		RequestNumberSeq requestNumberSeq = findByUUID_G(uuid, groupId);

		return remove(requestNumberSeq);
	}

	/**
	 * Returns the number of request number seqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching request number seqs
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_REQUESTNUMBERSEQ_WHERE);

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
		"requestNumberSeq.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(requestNumberSeq.uuid IS NULL OR requestNumberSeq.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"requestNumberSeq.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the request number seqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching request number seqs
	 */
	@Override
	public List<RequestNumberSeq> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<RequestNumberSeq> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<RequestNumberSeq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<RequestNumberSeq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator,
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

		List<RequestNumberSeq> list = null;

		if (useFinderCache) {
			list = (List<RequestNumberSeq>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RequestNumberSeq requestNumberSeq : list) {
					if (!uuid.equals(requestNumberSeq.getUuid()) ||
						(companyId != requestNumberSeq.getCompanyId())) {

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

			sb.append(_SQL_SELECT_REQUESTNUMBERSEQ_WHERE);

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
				sb.append(RequestNumberSeqModelImpl.ORDER_BY_JPQL);
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

				list = (List<RequestNumberSeq>)QueryUtil.list(
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
	 * Returns the first request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<RequestNumberSeq> orderByComparator)
		throws NoSuchRequestNumberSeqException {

		RequestNumberSeq requestNumberSeq = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (requestNumberSeq != null) {
			return requestNumberSeq;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchRequestNumberSeqException(sb.toString());
	}

	/**
	 * Returns the first request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		List<RequestNumberSeq> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public RequestNumberSeq findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<RequestNumberSeq> orderByComparator)
		throws NoSuchRequestNumberSeqException {

		RequestNumberSeq requestNumberSeq = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (requestNumberSeq != null) {
			return requestNumberSeq;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchRequestNumberSeqException(sb.toString());
	}

	/**
	 * Returns the last request number seq in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<RequestNumberSeq> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public RequestNumberSeq[] findByUuid_C_PrevAndNext(
			long requestNumberSeqId, String uuid, long companyId,
			OrderByComparator<RequestNumberSeq> orderByComparator)
		throws NoSuchRequestNumberSeqException {

		uuid = Objects.toString(uuid, "");

		RequestNumberSeq requestNumberSeq = findByPrimaryKey(
			requestNumberSeqId);

		Session session = null;

		try {
			session = openSession();

			RequestNumberSeq[] array = new RequestNumberSeqImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, requestNumberSeq, uuid, companyId, orderByComparator,
				true);

			array[1] = requestNumberSeq;

			array[2] = getByUuid_C_PrevAndNext(
				session, requestNumberSeq, uuid, companyId, orderByComparator,
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

	protected RequestNumberSeq getByUuid_C_PrevAndNext(
		Session session, RequestNumberSeq requestNumberSeq, String uuid,
		long companyId, OrderByComparator<RequestNumberSeq> orderByComparator,
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

		sb.append(_SQL_SELECT_REQUESTNUMBERSEQ_WHERE);

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
			sb.append(RequestNumberSeqModelImpl.ORDER_BY_JPQL);
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
						requestNumberSeq)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<RequestNumberSeq> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the request number seqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (RequestNumberSeq requestNumberSeq :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(requestNumberSeq);
		}
	}

	/**
	 * Returns the number of request number seqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching request number seqs
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_REQUESTNUMBERSEQ_WHERE);

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
		"requestNumberSeq.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(requestNumberSeq.uuid IS NULL OR requestNumberSeq.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"requestNumberSeq.companyId = ?";

	private FinderPath _finderPathFetchBySeqDate;
	private FinderPath _finderPathCountBySeqDate;

	/**
	 * Returns the request number seq where seqDate = &#63; or throws a <code>NoSuchRequestNumberSeqException</code> if it could not be found.
	 *
	 * @param seqDate the seq date
	 * @return the matching request number seq
	 * @throws NoSuchRequestNumberSeqException if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq findBySeqDate(String seqDate)
		throws NoSuchRequestNumberSeqException {

		RequestNumberSeq requestNumberSeq = fetchBySeqDate(seqDate);

		if (requestNumberSeq == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("seqDate=");
			sb.append(seqDate);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchRequestNumberSeqException(sb.toString());
		}

		return requestNumberSeq;
	}

	/**
	 * Returns the request number seq where seqDate = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param seqDate the seq date
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq fetchBySeqDate(String seqDate) {
		return fetchBySeqDate(seqDate, true);
	}

	/**
	 * Returns the request number seq where seqDate = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param seqDate the seq date
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	@Override
	public RequestNumberSeq fetchBySeqDate(
		String seqDate, boolean useFinderCache) {

		seqDate = Objects.toString(seqDate, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {seqDate};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBySeqDate, finderArgs, this);
		}

		if (result instanceof RequestNumberSeq) {
			RequestNumberSeq requestNumberSeq = (RequestNumberSeq)result;

			if (!Objects.equals(seqDate, requestNumberSeq.getSeqDate())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_REQUESTNUMBERSEQ_WHERE);

			boolean bindSeqDate = false;

			if (seqDate.isEmpty()) {
				sb.append(_FINDER_COLUMN_SEQDATE_SEQDATE_3);
			}
			else {
				bindSeqDate = true;

				sb.append(_FINDER_COLUMN_SEQDATE_SEQDATE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindSeqDate) {
					queryPos.add(seqDate);
				}

				List<RequestNumberSeq> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBySeqDate, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {seqDate};
							}

							_log.warn(
								"RequestNumberSeqPersistenceImpl.fetchBySeqDate(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					RequestNumberSeq requestNumberSeq = list.get(0);

					result = requestNumberSeq;

					cacheResult(requestNumberSeq);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchBySeqDate, finderArgs);
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
			return (RequestNumberSeq)result;
		}
	}

	/**
	 * Removes the request number seq where seqDate = &#63; from the database.
	 *
	 * @param seqDate the seq date
	 * @return the request number seq that was removed
	 */
	@Override
	public RequestNumberSeq removeBySeqDate(String seqDate)
		throws NoSuchRequestNumberSeqException {

		RequestNumberSeq requestNumberSeq = findBySeqDate(seqDate);

		return remove(requestNumberSeq);
	}

	/**
	 * Returns the number of request number seqs where seqDate = &#63;.
	 *
	 * @param seqDate the seq date
	 * @return the number of matching request number seqs
	 */
	@Override
	public int countBySeqDate(String seqDate) {
		seqDate = Objects.toString(seqDate, "");

		FinderPath finderPath = _finderPathCountBySeqDate;

		Object[] finderArgs = new Object[] {seqDate};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_REQUESTNUMBERSEQ_WHERE);

			boolean bindSeqDate = false;

			if (seqDate.isEmpty()) {
				sb.append(_FINDER_COLUMN_SEQDATE_SEQDATE_3);
			}
			else {
				bindSeqDate = true;

				sb.append(_FINDER_COLUMN_SEQDATE_SEQDATE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindSeqDate) {
					queryPos.add(seqDate);
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

	private static final String _FINDER_COLUMN_SEQDATE_SEQDATE_2 =
		"requestNumberSeq.seqDate = ?";

	private static final String _FINDER_COLUMN_SEQDATE_SEQDATE_3 =
		"(requestNumberSeq.seqDate IS NULL OR requestNumberSeq.seqDate = '')";

	public RequestNumberSeqPersistenceImpl() {
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

		setModelClass(RequestNumberSeq.class);
	}

	/**
	 * Caches the request number seq in the entity cache if it is enabled.
	 *
	 * @param requestNumberSeq the request number seq
	 */
	@Override
	public void cacheResult(RequestNumberSeq requestNumberSeq) {
		entityCache.putResult(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqImpl.class, requestNumberSeq.getPrimaryKey(),
			requestNumberSeq);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				requestNumberSeq.getUuid(), requestNumberSeq.getGroupId()
			},
			requestNumberSeq);

		finderCache.putResult(
			_finderPathFetchBySeqDate,
			new Object[] {requestNumberSeq.getSeqDate()}, requestNumberSeq);

		requestNumberSeq.resetOriginalValues();
	}

	/**
	 * Caches the request number seqs in the entity cache if it is enabled.
	 *
	 * @param requestNumberSeqs the request number seqs
	 */
	@Override
	public void cacheResult(List<RequestNumberSeq> requestNumberSeqs) {
		for (RequestNumberSeq requestNumberSeq : requestNumberSeqs) {
			if (entityCache.getResult(
					RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
					RequestNumberSeqImpl.class,
					requestNumberSeq.getPrimaryKey()) == null) {

				cacheResult(requestNumberSeq);
			}
			else {
				requestNumberSeq.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all request number seqs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RequestNumberSeqImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the request number seq.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RequestNumberSeq requestNumberSeq) {
		entityCache.removeResult(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqImpl.class, requestNumberSeq.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(RequestNumberSeqModelImpl)requestNumberSeq, true);
	}

	@Override
	public void clearCache(List<RequestNumberSeq> requestNumberSeqs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RequestNumberSeq requestNumberSeq : requestNumberSeqs) {
			entityCache.removeResult(
				RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
				RequestNumberSeqImpl.class, requestNumberSeq.getPrimaryKey());

			clearUniqueFindersCache(
				(RequestNumberSeqModelImpl)requestNumberSeq, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
				RequestNumberSeqImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		RequestNumberSeqModelImpl requestNumberSeqModelImpl) {

		Object[] args = new Object[] {
			requestNumberSeqModelImpl.getUuid(),
			requestNumberSeqModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, requestNumberSeqModelImpl, false);

		args = new Object[] {requestNumberSeqModelImpl.getSeqDate()};

		finderCache.putResult(
			_finderPathCountBySeqDate, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchBySeqDate, args, requestNumberSeqModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		RequestNumberSeqModelImpl requestNumberSeqModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				requestNumberSeqModelImpl.getUuid(),
				requestNumberSeqModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((requestNumberSeqModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				requestNumberSeqModelImpl.getOriginalUuid(),
				requestNumberSeqModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				requestNumberSeqModelImpl.getSeqDate()
			};

			finderCache.removeResult(_finderPathCountBySeqDate, args);
			finderCache.removeResult(_finderPathFetchBySeqDate, args);
		}

		if ((requestNumberSeqModelImpl.getColumnBitmask() &
			 _finderPathFetchBySeqDate.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				requestNumberSeqModelImpl.getOriginalSeqDate()
			};

			finderCache.removeResult(_finderPathCountBySeqDate, args);
			finderCache.removeResult(_finderPathFetchBySeqDate, args);
		}
	}

	/**
	 * Creates a new request number seq with the primary key. Does not add the request number seq to the database.
	 *
	 * @param requestNumberSeqId the primary key for the new request number seq
	 * @return the new request number seq
	 */
	@Override
	public RequestNumberSeq create(long requestNumberSeqId) {
		RequestNumberSeq requestNumberSeq = new RequestNumberSeqImpl();

		requestNumberSeq.setNew(true);
		requestNumberSeq.setPrimaryKey(requestNumberSeqId);

		String uuid = PortalUUIDUtil.generate();

		requestNumberSeq.setUuid(uuid);

		requestNumberSeq.setCompanyId(CompanyThreadLocal.getCompanyId());

		return requestNumberSeq;
	}

	/**
	 * Removes the request number seq with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq that was removed
	 * @throws NoSuchRequestNumberSeqException if a request number seq with the primary key could not be found
	 */
	@Override
	public RequestNumberSeq remove(long requestNumberSeqId)
		throws NoSuchRequestNumberSeqException {

		return remove((Serializable)requestNumberSeqId);
	}

	/**
	 * Removes the request number seq with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the request number seq
	 * @return the request number seq that was removed
	 * @throws NoSuchRequestNumberSeqException if a request number seq with the primary key could not be found
	 */
	@Override
	public RequestNumberSeq remove(Serializable primaryKey)
		throws NoSuchRequestNumberSeqException {

		Session session = null;

		try {
			session = openSession();

			RequestNumberSeq requestNumberSeq = (RequestNumberSeq)session.get(
				RequestNumberSeqImpl.class, primaryKey);

			if (requestNumberSeq == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRequestNumberSeqException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(requestNumberSeq);
		}
		catch (NoSuchRequestNumberSeqException noSuchEntityException) {
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
	protected RequestNumberSeq removeImpl(RequestNumberSeq requestNumberSeq) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(requestNumberSeq)) {
				requestNumberSeq = (RequestNumberSeq)session.get(
					RequestNumberSeqImpl.class,
					requestNumberSeq.getPrimaryKeyObj());
			}

			if (requestNumberSeq != null) {
				session.delete(requestNumberSeq);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (requestNumberSeq != null) {
			clearCache(requestNumberSeq);
		}

		return requestNumberSeq;
	}

	@Override
	public RequestNumberSeq updateImpl(RequestNumberSeq requestNumberSeq) {
		boolean isNew = requestNumberSeq.isNew();

		if (!(requestNumberSeq instanceof RequestNumberSeqModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(requestNumberSeq.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					requestNumberSeq);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in requestNumberSeq proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RequestNumberSeq implementation " +
					requestNumberSeq.getClass());
		}

		RequestNumberSeqModelImpl requestNumberSeqModelImpl =
			(RequestNumberSeqModelImpl)requestNumberSeq;

		if (Validator.isNull(requestNumberSeq.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			requestNumberSeq.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (requestNumberSeq.getCreateDate() == null)) {
			if (serviceContext == null) {
				requestNumberSeq.setCreateDate(now);
			}
			else {
				requestNumberSeq.setCreateDate(
					serviceContext.getCreateDate(now));
			}
		}

		if (!requestNumberSeqModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				requestNumberSeq.setModifiedDate(now);
			}
			else {
				requestNumberSeq.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(requestNumberSeq);

				requestNumberSeq.setNew(false);
			}
			else {
				requestNumberSeq = (RequestNumberSeq)session.merge(
					requestNumberSeq);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!RequestNumberSeqModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {requestNumberSeqModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				requestNumberSeqModelImpl.getUuid(),
				requestNumberSeqModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((requestNumberSeqModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					requestNumberSeqModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {requestNumberSeqModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((requestNumberSeqModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					requestNumberSeqModelImpl.getOriginalUuid(),
					requestNumberSeqModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					requestNumberSeqModelImpl.getUuid(),
					requestNumberSeqModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}
		}

		entityCache.putResult(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqImpl.class, requestNumberSeq.getPrimaryKey(),
			requestNumberSeq, false);

		clearUniqueFindersCache(requestNumberSeqModelImpl, false);
		cacheUniqueFindersCache(requestNumberSeqModelImpl);

		requestNumberSeq.resetOriginalValues();

		return requestNumberSeq;
	}

	/**
	 * Returns the request number seq with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the request number seq
	 * @return the request number seq
	 * @throws NoSuchRequestNumberSeqException if a request number seq with the primary key could not be found
	 */
	@Override
	public RequestNumberSeq findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRequestNumberSeqException {

		RequestNumberSeq requestNumberSeq = fetchByPrimaryKey(primaryKey);

		if (requestNumberSeq == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRequestNumberSeqException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return requestNumberSeq;
	}

	/**
	 * Returns the request number seq with the primary key or throws a <code>NoSuchRequestNumberSeqException</code> if it could not be found.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq
	 * @throws NoSuchRequestNumberSeqException if a request number seq with the primary key could not be found
	 */
	@Override
	public RequestNumberSeq findByPrimaryKey(long requestNumberSeqId)
		throws NoSuchRequestNumberSeqException {

		return findByPrimaryKey((Serializable)requestNumberSeqId);
	}

	/**
	 * Returns the request number seq with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the request number seq
	 * @return the request number seq, or <code>null</code> if a request number seq with the primary key could not be found
	 */
	@Override
	public RequestNumberSeq fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		RequestNumberSeq requestNumberSeq = (RequestNumberSeq)serializable;

		if (requestNumberSeq == null) {
			Session session = null;

			try {
				session = openSession();

				requestNumberSeq = (RequestNumberSeq)session.get(
					RequestNumberSeqImpl.class, primaryKey);

				if (requestNumberSeq != null) {
					cacheResult(requestNumberSeq);
				}
				else {
					entityCache.putResult(
						RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
						RequestNumberSeqImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception exception) {
				entityCache.removeResult(
					RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
					RequestNumberSeqImpl.class, primaryKey);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return requestNumberSeq;
	}

	/**
	 * Returns the request number seq with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq, or <code>null</code> if a request number seq with the primary key could not be found
	 */
	@Override
	public RequestNumberSeq fetchByPrimaryKey(long requestNumberSeqId) {
		return fetchByPrimaryKey((Serializable)requestNumberSeqId);
	}

	@Override
	public Map<Serializable, RequestNumberSeq> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, RequestNumberSeq> map =
			new HashMap<Serializable, RequestNumberSeq>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			RequestNumberSeq requestNumberSeq = fetchByPrimaryKey(primaryKey);

			if (requestNumberSeq != null) {
				map.put(primaryKey, requestNumberSeq);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
				RequestNumberSeqImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (RequestNumberSeq)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler sb = new StringBundler(
			(uncachedPrimaryKeys.size() * 2) + 1);

		sb.append(_SQL_SELECT_REQUESTNUMBERSEQ_WHERE_PKS_IN);

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

			for (RequestNumberSeq requestNumberSeq :
					(List<RequestNumberSeq>)query.list()) {

				map.put(requestNumberSeq.getPrimaryKeyObj(), requestNumberSeq);

				cacheResult(requestNumberSeq);

				uncachedPrimaryKeys.remove(requestNumberSeq.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
					RequestNumberSeqImpl.class, primaryKey, nullModel);
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
	 * Returns all the request number seqs.
	 *
	 * @return the request number seqs
	 */
	@Override
	public List<RequestNumberSeq> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<RequestNumberSeq> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<RequestNumberSeq> findAll(
		int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<RequestNumberSeq> findAll(
		int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator,
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

		List<RequestNumberSeq> list = null;

		if (useFinderCache) {
			list = (List<RequestNumberSeq>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_REQUESTNUMBERSEQ);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_REQUESTNUMBERSEQ;

				sql = sql.concat(RequestNumberSeqModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RequestNumberSeq>)QueryUtil.list(
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
	 * Removes all the request number seqs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RequestNumberSeq requestNumberSeq : findAll()) {
			remove(requestNumberSeq);
		}
	}

	/**
	 * Returns the number of request number seqs.
	 *
	 * @return the number of request number seqs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_REQUESTNUMBERSEQ);

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
		return RequestNumberSeqModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the request number seq persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED,
			RequestNumberSeqImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED,
			RequestNumberSeqImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED,
			RequestNumberSeqImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED,
			RequestNumberSeqImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			RequestNumberSeqModelImpl.UUID_COLUMN_BITMASK |
			RequestNumberSeqModelImpl.SEQDATE_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED,
			RequestNumberSeqImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			RequestNumberSeqModelImpl.UUID_COLUMN_BITMASK |
			RequestNumberSeqModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED,
			RequestNumberSeqImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED,
			RequestNumberSeqImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			RequestNumberSeqModelImpl.UUID_COLUMN_BITMASK |
			RequestNumberSeqModelImpl.COMPANYID_COLUMN_BITMASK |
			RequestNumberSeqModelImpl.SEQDATE_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathFetchBySeqDate = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED,
			RequestNumberSeqImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchBySeqDate", new String[] {String.class.getName()},
			RequestNumberSeqModelImpl.SEQDATE_COLUMN_BITMASK);

		_finderPathCountBySeqDate = new FinderPath(
			RequestNumberSeqModelImpl.ENTITY_CACHE_ENABLED,
			RequestNumberSeqModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySeqDate",
			new String[] {String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(RequestNumberSeqImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_REQUESTNUMBERSEQ =
		"SELECT requestNumberSeq FROM RequestNumberSeq requestNumberSeq";

	private static final String _SQL_SELECT_REQUESTNUMBERSEQ_WHERE_PKS_IN =
		"SELECT requestNumberSeq FROM RequestNumberSeq requestNumberSeq WHERE requestNumberSeqId IN (";

	private static final String _SQL_SELECT_REQUESTNUMBERSEQ_WHERE =
		"SELECT requestNumberSeq FROM RequestNumberSeq requestNumberSeq WHERE ";

	private static final String _SQL_COUNT_REQUESTNUMBERSEQ =
		"SELECT COUNT(requestNumberSeq) FROM RequestNumberSeq requestNumberSeq";

	private static final String _SQL_COUNT_REQUESTNUMBERSEQ_WHERE =
		"SELECT COUNT(requestNumberSeq) FROM RequestNumberSeq requestNumberSeq WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "requestNumberSeq.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RequestNumberSeq exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RequestNumberSeq exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RequestNumberSeqPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}