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

import com.bses.connection2.exception.NoSuchLocalityDivisionException;
import com.bses.connection2.model.LocalityDivision;
import com.bses.connection2.model.impl.LocalityDivisionImpl;
import com.bses.connection2.model.impl.LocalityDivisionModelImpl;
import com.bses.connection2.service.persistence.LocalityDivisionPersistence;

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
 * The persistence implementation for the locality division service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LocalityDivisionPersistenceImpl
	extends BasePersistenceImpl<LocalityDivision>
	implements LocalityDivisionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>LocalityDivisionUtil</code> to access the locality division persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		LocalityDivisionImpl.class.getName();

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
	 * Returns all the locality divisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching locality divisions
	 */
	@Override
	public List<LocalityDivision> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LocalityDivision> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<LocalityDivision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<LocalityDivision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
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

		List<LocalityDivision> list = null;

		if (useFinderCache) {
			list = (List<LocalityDivision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LocalityDivision localityDivision : list) {
					if (!uuid.equals(localityDivision.getUuid())) {
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

			sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

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
				sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<LocalityDivision>)QueryUtil.list(
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
	 * Returns the first locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByUuid_First(
			String uuid, OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByUuid_First(
			uuid, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the first locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByUuid_First(
		String uuid, OrderByComparator<LocalityDivision> orderByComparator) {

		List<LocalityDivision> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByUuid_Last(
			String uuid, OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByUuid_Last(
			uuid, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the last locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByUuid_Last(
		String uuid, OrderByComparator<LocalityDivision> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<LocalityDivision> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LocalityDivision[] findByUuid_PrevAndNext(
			long localityDivisionId, String uuid,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		uuid = Objects.toString(uuid, "");

		LocalityDivision localityDivision = findByPrimaryKey(
			localityDivisionId);

		Session session = null;

		try {
			session = openSession();

			LocalityDivision[] array = new LocalityDivisionImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, localityDivision, uuid, orderByComparator, true);

			array[1] = localityDivision;

			array[2] = getByUuid_PrevAndNext(
				session, localityDivision, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected LocalityDivision getByUuid_PrevAndNext(
		Session session, LocalityDivision localityDivision, String uuid,
		OrderByComparator<LocalityDivision> orderByComparator,
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

		sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

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
			sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
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
						localityDivision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LocalityDivision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the locality divisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (LocalityDivision localityDivision :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(localityDivision);
		}
	}

	/**
	 * Returns the number of locality divisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching locality divisions
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LOCALITYDIVISION_WHERE);

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
		"localityDivision.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(localityDivision.uuid IS NULL OR localityDivision.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the locality division where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLocalityDivisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByUUID_G(String uuid, long groupId)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByUUID_G(uuid, groupId);

		if (localityDivision == null) {
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

			throw new NoSuchLocalityDivisionException(sb.toString());
		}

		return localityDivision;
	}

	/**
	 * Returns the locality division where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the locality division where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByUUID_G(
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

		if (result instanceof LocalityDivision) {
			LocalityDivision localityDivision = (LocalityDivision)result;

			if (!Objects.equals(uuid, localityDivision.getUuid()) ||
				(groupId != localityDivision.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

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

				List<LocalityDivision> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					LocalityDivision localityDivision = list.get(0);

					result = localityDivision;

					cacheResult(localityDivision);
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
			return (LocalityDivision)result;
		}
	}

	/**
	 * Removes the locality division where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the locality division that was removed
	 */
	@Override
	public LocalityDivision removeByUUID_G(String uuid, long groupId)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = findByUUID_G(uuid, groupId);

		return remove(localityDivision);
	}

	/**
	 * Returns the number of locality divisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching locality divisions
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_LOCALITYDIVISION_WHERE);

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
		"localityDivision.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(localityDivision.uuid IS NULL OR localityDivision.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"localityDivision.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the locality divisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching locality divisions
	 */
	@Override
	public List<LocalityDivision> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LocalityDivision> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<LocalityDivision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<LocalityDivision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
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

		List<LocalityDivision> list = null;

		if (useFinderCache) {
			list = (List<LocalityDivision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LocalityDivision localityDivision : list) {
					if (!uuid.equals(localityDivision.getUuid()) ||
						(companyId != localityDivision.getCompanyId())) {

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

			sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

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
				sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
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

				list = (List<LocalityDivision>)QueryUtil.list(
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
	 * Returns the first locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the first locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<LocalityDivision> orderByComparator) {

		List<LocalityDivision> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LocalityDivision findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the last locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<LocalityDivision> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<LocalityDivision> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LocalityDivision[] findByUuid_C_PrevAndNext(
			long localityDivisionId, String uuid, long companyId,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		uuid = Objects.toString(uuid, "");

		LocalityDivision localityDivision = findByPrimaryKey(
			localityDivisionId);

		Session session = null;

		try {
			session = openSession();

			LocalityDivision[] array = new LocalityDivisionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, localityDivision, uuid, companyId, orderByComparator,
				true);

			array[1] = localityDivision;

			array[2] = getByUuid_C_PrevAndNext(
				session, localityDivision, uuid, companyId, orderByComparator,
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

	protected LocalityDivision getByUuid_C_PrevAndNext(
		Session session, LocalityDivision localityDivision, String uuid,
		long companyId, OrderByComparator<LocalityDivision> orderByComparator,
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

		sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

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
			sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
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
						localityDivision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LocalityDivision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the locality divisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (LocalityDivision localityDivision :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(localityDivision);
		}
	}

	/**
	 * Returns the number of locality divisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching locality divisions
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_LOCALITYDIVISION_WHERE);

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
		"localityDivision.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(localityDivision.uuid IS NULL OR localityDivision.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"localityDivision.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByLocalityName;
	private FinderPath _finderPathWithoutPaginationFindByLocalityName;
	private FinderPath _finderPathCountByLocalityName;

	/**
	 * Returns all the locality divisions where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @return the matching locality divisions
	 */
	@Override
	public List<LocalityDivision> findByLocalityName(String localityName) {
		return findByLocalityName(
			localityName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LocalityDivision> findByLocalityName(
		String localityName, int start, int end) {

		return findByLocalityName(localityName, start, end, null);
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
	@Override
	public List<LocalityDivision> findByLocalityName(
		String localityName, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return findByLocalityName(
			localityName, start, end, orderByComparator, true);
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
	@Override
	public List<LocalityDivision> findByLocalityName(
		String localityName, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
		boolean useFinderCache) {

		localityName = Objects.toString(localityName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByLocalityName;
				finderArgs = new Object[] {localityName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByLocalityName;
			finderArgs = new Object[] {
				localityName, start, end, orderByComparator
			};
		}

		List<LocalityDivision> list = null;

		if (useFinderCache) {
			list = (List<LocalityDivision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LocalityDivision localityDivision : list) {
					if (!localityName.equals(
							localityDivision.getLocalityName())) {

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

			sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

			boolean bindLocalityName = false;

			if (localityName.isEmpty()) {
				sb.append(_FINDER_COLUMN_LOCALITYNAME_LOCALITYNAME_3);
			}
			else {
				bindLocalityName = true;

				sb.append(_FINDER_COLUMN_LOCALITYNAME_LOCALITYNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLocalityName) {
					queryPos.add(localityName);
				}

				list = (List<LocalityDivision>)QueryUtil.list(
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
	 * Returns the first locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByLocalityName_First(
			String localityName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByLocalityName_First(
			localityName, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("localityName=");
		sb.append(localityName);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the first locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByLocalityName_First(
		String localityName,
		OrderByComparator<LocalityDivision> orderByComparator) {

		List<LocalityDivision> list = findByLocalityName(
			localityName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByLocalityName_Last(
			String localityName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByLocalityName_Last(
			localityName, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("localityName=");
		sb.append(localityName);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the last locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByLocalityName_Last(
		String localityName,
		OrderByComparator<LocalityDivision> orderByComparator) {

		int count = countByLocalityName(localityName);

		if (count == 0) {
			return null;
		}

		List<LocalityDivision> list = findByLocalityName(
			localityName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LocalityDivision[] findByLocalityName_PrevAndNext(
			long localityDivisionId, String localityName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		localityName = Objects.toString(localityName, "");

		LocalityDivision localityDivision = findByPrimaryKey(
			localityDivisionId);

		Session session = null;

		try {
			session = openSession();

			LocalityDivision[] array = new LocalityDivisionImpl[3];

			array[0] = getByLocalityName_PrevAndNext(
				session, localityDivision, localityName, orderByComparator,
				true);

			array[1] = localityDivision;

			array[2] = getByLocalityName_PrevAndNext(
				session, localityDivision, localityName, orderByComparator,
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

	protected LocalityDivision getByLocalityName_PrevAndNext(
		Session session, LocalityDivision localityDivision, String localityName,
		OrderByComparator<LocalityDivision> orderByComparator,
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

		sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

		boolean bindLocalityName = false;

		if (localityName.isEmpty()) {
			sb.append(_FINDER_COLUMN_LOCALITYNAME_LOCALITYNAME_3);
		}
		else {
			bindLocalityName = true;

			sb.append(_FINDER_COLUMN_LOCALITYNAME_LOCALITYNAME_2);
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
			sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindLocalityName) {
			queryPos.add(localityName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						localityDivision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LocalityDivision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the locality divisions where localityName = &#63; from the database.
	 *
	 * @param localityName the locality name
	 */
	@Override
	public void removeByLocalityName(String localityName) {
		for (LocalityDivision localityDivision :
				findByLocalityName(
					localityName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(localityDivision);
		}
	}

	/**
	 * Returns the number of locality divisions where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @return the number of matching locality divisions
	 */
	@Override
	public int countByLocalityName(String localityName) {
		localityName = Objects.toString(localityName, "");

		FinderPath finderPath = _finderPathCountByLocalityName;

		Object[] finderArgs = new Object[] {localityName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LOCALITYDIVISION_WHERE);

			boolean bindLocalityName = false;

			if (localityName.isEmpty()) {
				sb.append(_FINDER_COLUMN_LOCALITYNAME_LOCALITYNAME_3);
			}
			else {
				bindLocalityName = true;

				sb.append(_FINDER_COLUMN_LOCALITYNAME_LOCALITYNAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLocalityName) {
					queryPos.add(localityName);
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

	private static final String _FINDER_COLUMN_LOCALITYNAME_LOCALITYNAME_2 =
		"localityDivision.localityName = ?";

	private static final String _FINDER_COLUMN_LOCALITYNAME_LOCALITYNAME_3 =
		"(localityDivision.localityName IS NULL OR localityDivision.localityName = '')";

	private FinderPath _finderPathWithPaginationFindByDivisionCode;
	private FinderPath _finderPathWithoutPaginationFindByDivisionCode;
	private FinderPath _finderPathCountByDivisionCode;

	/**
	 * Returns all the locality divisions where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @return the matching locality divisions
	 */
	@Override
	public List<LocalityDivision> findByDivisionCode(String divisionCode) {
		return findByDivisionCode(
			divisionCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LocalityDivision> findByDivisionCode(
		String divisionCode, int start, int end) {

		return findByDivisionCode(divisionCode, start, end, null);
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
	@Override
	public List<LocalityDivision> findByDivisionCode(
		String divisionCode, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return findByDivisionCode(
			divisionCode, start, end, orderByComparator, true);
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
	@Override
	public List<LocalityDivision> findByDivisionCode(
		String divisionCode, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
		boolean useFinderCache) {

		divisionCode = Objects.toString(divisionCode, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByDivisionCode;
				finderArgs = new Object[] {divisionCode};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByDivisionCode;
			finderArgs = new Object[] {
				divisionCode, start, end, orderByComparator
			};
		}

		List<LocalityDivision> list = null;

		if (useFinderCache) {
			list = (List<LocalityDivision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LocalityDivision localityDivision : list) {
					if (!divisionCode.equals(
							localityDivision.getDivisionCode())) {

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

			sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

			boolean bindDivisionCode = false;

			if (divisionCode.isEmpty()) {
				sb.append(_FINDER_COLUMN_DIVISIONCODE_DIVISIONCODE_3);
			}
			else {
				bindDivisionCode = true;

				sb.append(_FINDER_COLUMN_DIVISIONCODE_DIVISIONCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDivisionCode) {
					queryPos.add(divisionCode);
				}

				list = (List<LocalityDivision>)QueryUtil.list(
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
	 * Returns the first locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByDivisionCode_First(
			String divisionCode,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByDivisionCode_First(
			divisionCode, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("divisionCode=");
		sb.append(divisionCode);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the first locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByDivisionCode_First(
		String divisionCode,
		OrderByComparator<LocalityDivision> orderByComparator) {

		List<LocalityDivision> list = findByDivisionCode(
			divisionCode, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByDivisionCode_Last(
			String divisionCode,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByDivisionCode_Last(
			divisionCode, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("divisionCode=");
		sb.append(divisionCode);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the last locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByDivisionCode_Last(
		String divisionCode,
		OrderByComparator<LocalityDivision> orderByComparator) {

		int count = countByDivisionCode(divisionCode);

		if (count == 0) {
			return null;
		}

		List<LocalityDivision> list = findByDivisionCode(
			divisionCode, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LocalityDivision[] findByDivisionCode_PrevAndNext(
			long localityDivisionId, String divisionCode,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		divisionCode = Objects.toString(divisionCode, "");

		LocalityDivision localityDivision = findByPrimaryKey(
			localityDivisionId);

		Session session = null;

		try {
			session = openSession();

			LocalityDivision[] array = new LocalityDivisionImpl[3];

			array[0] = getByDivisionCode_PrevAndNext(
				session, localityDivision, divisionCode, orderByComparator,
				true);

			array[1] = localityDivision;

			array[2] = getByDivisionCode_PrevAndNext(
				session, localityDivision, divisionCode, orderByComparator,
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

	protected LocalityDivision getByDivisionCode_PrevAndNext(
		Session session, LocalityDivision localityDivision, String divisionCode,
		OrderByComparator<LocalityDivision> orderByComparator,
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

		sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

		boolean bindDivisionCode = false;

		if (divisionCode.isEmpty()) {
			sb.append(_FINDER_COLUMN_DIVISIONCODE_DIVISIONCODE_3);
		}
		else {
			bindDivisionCode = true;

			sb.append(_FINDER_COLUMN_DIVISIONCODE_DIVISIONCODE_2);
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
			sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindDivisionCode) {
			queryPos.add(divisionCode);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						localityDivision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LocalityDivision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the locality divisions where divisionCode = &#63; from the database.
	 *
	 * @param divisionCode the division code
	 */
	@Override
	public void removeByDivisionCode(String divisionCode) {
		for (LocalityDivision localityDivision :
				findByDivisionCode(
					divisionCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(localityDivision);
		}
	}

	/**
	 * Returns the number of locality divisions where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @return the number of matching locality divisions
	 */
	@Override
	public int countByDivisionCode(String divisionCode) {
		divisionCode = Objects.toString(divisionCode, "");

		FinderPath finderPath = _finderPathCountByDivisionCode;

		Object[] finderArgs = new Object[] {divisionCode};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LOCALITYDIVISION_WHERE);

			boolean bindDivisionCode = false;

			if (divisionCode.isEmpty()) {
				sb.append(_FINDER_COLUMN_DIVISIONCODE_DIVISIONCODE_3);
			}
			else {
				bindDivisionCode = true;

				sb.append(_FINDER_COLUMN_DIVISIONCODE_DIVISIONCODE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDivisionCode) {
					queryPos.add(divisionCode);
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

	private static final String _FINDER_COLUMN_DIVISIONCODE_DIVISIONCODE_2 =
		"localityDivision.divisionCode = ?";

	private static final String _FINDER_COLUMN_DIVISIONCODE_DIVISIONCODE_3 =
		"(localityDivision.divisionCode IS NULL OR localityDivision.divisionCode = '')";

	private FinderPath _finderPathWithPaginationFindByDivisionName;
	private FinderPath _finderPathWithoutPaginationFindByDivisionName;
	private FinderPath _finderPathCountByDivisionName;

	/**
	 * Returns all the locality divisions where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @return the matching locality divisions
	 */
	@Override
	public List<LocalityDivision> findByDivisionName(String divisionName) {
		return findByDivisionName(
			divisionName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LocalityDivision> findByDivisionName(
		String divisionName, int start, int end) {

		return findByDivisionName(divisionName, start, end, null);
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
	@Override
	public List<LocalityDivision> findByDivisionName(
		String divisionName, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return findByDivisionName(
			divisionName, start, end, orderByComparator, true);
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
	@Override
	public List<LocalityDivision> findByDivisionName(
		String divisionName, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
		boolean useFinderCache) {

		divisionName = Objects.toString(divisionName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByDivisionName;
				finderArgs = new Object[] {divisionName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByDivisionName;
			finderArgs = new Object[] {
				divisionName, start, end, orderByComparator
			};
		}

		List<LocalityDivision> list = null;

		if (useFinderCache) {
			list = (List<LocalityDivision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LocalityDivision localityDivision : list) {
					if (!divisionName.equals(
							localityDivision.getDivisionName())) {

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

			sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

			boolean bindDivisionName = false;

			if (divisionName.isEmpty()) {
				sb.append(_FINDER_COLUMN_DIVISIONNAME_DIVISIONNAME_3);
			}
			else {
				bindDivisionName = true;

				sb.append(_FINDER_COLUMN_DIVISIONNAME_DIVISIONNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDivisionName) {
					queryPos.add(divisionName);
				}

				list = (List<LocalityDivision>)QueryUtil.list(
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
	 * Returns the first locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByDivisionName_First(
			String divisionName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByDivisionName_First(
			divisionName, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("divisionName=");
		sb.append(divisionName);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the first locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByDivisionName_First(
		String divisionName,
		OrderByComparator<LocalityDivision> orderByComparator) {

		List<LocalityDivision> list = findByDivisionName(
			divisionName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByDivisionName_Last(
			String divisionName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByDivisionName_Last(
			divisionName, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("divisionName=");
		sb.append(divisionName);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the last locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByDivisionName_Last(
		String divisionName,
		OrderByComparator<LocalityDivision> orderByComparator) {

		int count = countByDivisionName(divisionName);

		if (count == 0) {
			return null;
		}

		List<LocalityDivision> list = findByDivisionName(
			divisionName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LocalityDivision[] findByDivisionName_PrevAndNext(
			long localityDivisionId, String divisionName,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		divisionName = Objects.toString(divisionName, "");

		LocalityDivision localityDivision = findByPrimaryKey(
			localityDivisionId);

		Session session = null;

		try {
			session = openSession();

			LocalityDivision[] array = new LocalityDivisionImpl[3];

			array[0] = getByDivisionName_PrevAndNext(
				session, localityDivision, divisionName, orderByComparator,
				true);

			array[1] = localityDivision;

			array[2] = getByDivisionName_PrevAndNext(
				session, localityDivision, divisionName, orderByComparator,
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

	protected LocalityDivision getByDivisionName_PrevAndNext(
		Session session, LocalityDivision localityDivision, String divisionName,
		OrderByComparator<LocalityDivision> orderByComparator,
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

		sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

		boolean bindDivisionName = false;

		if (divisionName.isEmpty()) {
			sb.append(_FINDER_COLUMN_DIVISIONNAME_DIVISIONNAME_3);
		}
		else {
			bindDivisionName = true;

			sb.append(_FINDER_COLUMN_DIVISIONNAME_DIVISIONNAME_2);
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
			sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindDivisionName) {
			queryPos.add(divisionName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						localityDivision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LocalityDivision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the locality divisions where divisionName = &#63; from the database.
	 *
	 * @param divisionName the division name
	 */
	@Override
	public void removeByDivisionName(String divisionName) {
		for (LocalityDivision localityDivision :
				findByDivisionName(
					divisionName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(localityDivision);
		}
	}

	/**
	 * Returns the number of locality divisions where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @return the number of matching locality divisions
	 */
	@Override
	public int countByDivisionName(String divisionName) {
		divisionName = Objects.toString(divisionName, "");

		FinderPath finderPath = _finderPathCountByDivisionName;

		Object[] finderArgs = new Object[] {divisionName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LOCALITYDIVISION_WHERE);

			boolean bindDivisionName = false;

			if (divisionName.isEmpty()) {
				sb.append(_FINDER_COLUMN_DIVISIONNAME_DIVISIONNAME_3);
			}
			else {
				bindDivisionName = true;

				sb.append(_FINDER_COLUMN_DIVISIONNAME_DIVISIONNAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDivisionName) {
					queryPos.add(divisionName);
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

	private static final String _FINDER_COLUMN_DIVISIONNAME_DIVISIONNAME_2 =
		"localityDivision.divisionName = ?";

	private static final String _FINDER_COLUMN_DIVISIONNAME_DIVISIONNAME_3 =
		"(localityDivision.divisionName IS NULL OR localityDivision.divisionName = '')";

	private FinderPath _finderPathWithPaginationFindByComplaintCenter;
	private FinderPath _finderPathWithoutPaginationFindByComplaintCenter;
	private FinderPath _finderPathCountByComplaintCenter;

	/**
	 * Returns all the locality divisions where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @return the matching locality divisions
	 */
	@Override
	public List<LocalityDivision> findByComplaintCenter(
		String complaintCenter) {

		return findByComplaintCenter(
			complaintCenter, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LocalityDivision> findByComplaintCenter(
		String complaintCenter, int start, int end) {

		return findByComplaintCenter(complaintCenter, start, end, null);
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
	@Override
	public List<LocalityDivision> findByComplaintCenter(
		String complaintCenter, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return findByComplaintCenter(
			complaintCenter, start, end, orderByComparator, true);
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
	@Override
	public List<LocalityDivision> findByComplaintCenter(
		String complaintCenter, int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
		boolean useFinderCache) {

		complaintCenter = Objects.toString(complaintCenter, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByComplaintCenter;
				finderArgs = new Object[] {complaintCenter};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByComplaintCenter;
			finderArgs = new Object[] {
				complaintCenter, start, end, orderByComparator
			};
		}

		List<LocalityDivision> list = null;

		if (useFinderCache) {
			list = (List<LocalityDivision>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (LocalityDivision localityDivision : list) {
					if (!complaintCenter.equals(
							localityDivision.getComplaintCenter())) {

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

			sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

			boolean bindComplaintCenter = false;

			if (complaintCenter.isEmpty()) {
				sb.append(_FINDER_COLUMN_COMPLAINTCENTER_COMPLAINTCENTER_3);
			}
			else {
				bindComplaintCenter = true;

				sb.append(_FINDER_COLUMN_COMPLAINTCENTER_COMPLAINTCENTER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindComplaintCenter) {
					queryPos.add(complaintCenter);
				}

				list = (List<LocalityDivision>)QueryUtil.list(
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
	 * Returns the first locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByComplaintCenter_First(
			String complaintCenter,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByComplaintCenter_First(
			complaintCenter, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("complaintCenter=");
		sb.append(complaintCenter);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the first locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByComplaintCenter_First(
		String complaintCenter,
		OrderByComparator<LocalityDivision> orderByComparator) {

		List<LocalityDivision> list = findByComplaintCenter(
			complaintCenter, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision findByComplaintCenter_Last(
			String complaintCenter,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByComplaintCenter_Last(
			complaintCenter, orderByComparator);

		if (localityDivision != null) {
			return localityDivision;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("complaintCenter=");
		sb.append(complaintCenter);

		sb.append("}");

		throw new NoSuchLocalityDivisionException(sb.toString());
	}

	/**
	 * Returns the last locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	@Override
	public LocalityDivision fetchByComplaintCenter_Last(
		String complaintCenter,
		OrderByComparator<LocalityDivision> orderByComparator) {

		int count = countByComplaintCenter(complaintCenter);

		if (count == 0) {
			return null;
		}

		List<LocalityDivision> list = findByComplaintCenter(
			complaintCenter, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public LocalityDivision[] findByComplaintCenter_PrevAndNext(
			long localityDivisionId, String complaintCenter,
			OrderByComparator<LocalityDivision> orderByComparator)
		throws NoSuchLocalityDivisionException {

		complaintCenter = Objects.toString(complaintCenter, "");

		LocalityDivision localityDivision = findByPrimaryKey(
			localityDivisionId);

		Session session = null;

		try {
			session = openSession();

			LocalityDivision[] array = new LocalityDivisionImpl[3];

			array[0] = getByComplaintCenter_PrevAndNext(
				session, localityDivision, complaintCenter, orderByComparator,
				true);

			array[1] = localityDivision;

			array[2] = getByComplaintCenter_PrevAndNext(
				session, localityDivision, complaintCenter, orderByComparator,
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

	protected LocalityDivision getByComplaintCenter_PrevAndNext(
		Session session, LocalityDivision localityDivision,
		String complaintCenter,
		OrderByComparator<LocalityDivision> orderByComparator,
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

		sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE);

		boolean bindComplaintCenter = false;

		if (complaintCenter.isEmpty()) {
			sb.append(_FINDER_COLUMN_COMPLAINTCENTER_COMPLAINTCENTER_3);
		}
		else {
			bindComplaintCenter = true;

			sb.append(_FINDER_COLUMN_COMPLAINTCENTER_COMPLAINTCENTER_2);
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
			sb.append(LocalityDivisionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindComplaintCenter) {
			queryPos.add(complaintCenter);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						localityDivision)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<LocalityDivision> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the locality divisions where complaintCenter = &#63; from the database.
	 *
	 * @param complaintCenter the complaint center
	 */
	@Override
	public void removeByComplaintCenter(String complaintCenter) {
		for (LocalityDivision localityDivision :
				findByComplaintCenter(
					complaintCenter, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(localityDivision);
		}
	}

	/**
	 * Returns the number of locality divisions where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @return the number of matching locality divisions
	 */
	@Override
	public int countByComplaintCenter(String complaintCenter) {
		complaintCenter = Objects.toString(complaintCenter, "");

		FinderPath finderPath = _finderPathCountByComplaintCenter;

		Object[] finderArgs = new Object[] {complaintCenter};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_LOCALITYDIVISION_WHERE);

			boolean bindComplaintCenter = false;

			if (complaintCenter.isEmpty()) {
				sb.append(_FINDER_COLUMN_COMPLAINTCENTER_COMPLAINTCENTER_3);
			}
			else {
				bindComplaintCenter = true;

				sb.append(_FINDER_COLUMN_COMPLAINTCENTER_COMPLAINTCENTER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindComplaintCenter) {
					queryPos.add(complaintCenter);
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
		_FINDER_COLUMN_COMPLAINTCENTER_COMPLAINTCENTER_2 =
			"localityDivision.complaintCenter = ?";

	private static final String
		_FINDER_COLUMN_COMPLAINTCENTER_COMPLAINTCENTER_3 =
			"(localityDivision.complaintCenter IS NULL OR localityDivision.complaintCenter = '')";

	public LocalityDivisionPersistenceImpl() {
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

		setModelClass(LocalityDivision.class);
	}

	/**
	 * Caches the locality division in the entity cache if it is enabled.
	 *
	 * @param localityDivision the locality division
	 */
	@Override
	public void cacheResult(LocalityDivision localityDivision) {
		entityCache.putResult(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionImpl.class, localityDivision.getPrimaryKey(),
			localityDivision);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				localityDivision.getUuid(), localityDivision.getGroupId()
			},
			localityDivision);

		localityDivision.resetOriginalValues();
	}

	/**
	 * Caches the locality divisions in the entity cache if it is enabled.
	 *
	 * @param localityDivisions the locality divisions
	 */
	@Override
	public void cacheResult(List<LocalityDivision> localityDivisions) {
		for (LocalityDivision localityDivision : localityDivisions) {
			if (entityCache.getResult(
					LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
					LocalityDivisionImpl.class,
					localityDivision.getPrimaryKey()) == null) {

				cacheResult(localityDivision);
			}
			else {
				localityDivision.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all locality divisions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(LocalityDivisionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the locality division.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(LocalityDivision localityDivision) {
		entityCache.removeResult(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionImpl.class, localityDivision.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(LocalityDivisionModelImpl)localityDivision, true);
	}

	@Override
	public void clearCache(List<LocalityDivision> localityDivisions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (LocalityDivision localityDivision : localityDivisions) {
			entityCache.removeResult(
				LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
				LocalityDivisionImpl.class, localityDivision.getPrimaryKey());

			clearUniqueFindersCache(
				(LocalityDivisionModelImpl)localityDivision, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
				LocalityDivisionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		LocalityDivisionModelImpl localityDivisionModelImpl) {

		Object[] args = new Object[] {
			localityDivisionModelImpl.getUuid(),
			localityDivisionModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, localityDivisionModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		LocalityDivisionModelImpl localityDivisionModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				localityDivisionModelImpl.getUuid(),
				localityDivisionModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((localityDivisionModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				localityDivisionModelImpl.getOriginalUuid(),
				localityDivisionModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new locality division with the primary key. Does not add the locality division to the database.
	 *
	 * @param localityDivisionId the primary key for the new locality division
	 * @return the new locality division
	 */
	@Override
	public LocalityDivision create(long localityDivisionId) {
		LocalityDivision localityDivision = new LocalityDivisionImpl();

		localityDivision.setNew(true);
		localityDivision.setPrimaryKey(localityDivisionId);

		String uuid = PortalUUIDUtil.generate();

		localityDivision.setUuid(uuid);

		localityDivision.setCompanyId(CompanyThreadLocal.getCompanyId());

		return localityDivision;
	}

	/**
	 * Removes the locality division with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division that was removed
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	@Override
	public LocalityDivision remove(long localityDivisionId)
		throws NoSuchLocalityDivisionException {

		return remove((Serializable)localityDivisionId);
	}

	/**
	 * Removes the locality division with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the locality division
	 * @return the locality division that was removed
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	@Override
	public LocalityDivision remove(Serializable primaryKey)
		throws NoSuchLocalityDivisionException {

		Session session = null;

		try {
			session = openSession();

			LocalityDivision localityDivision = (LocalityDivision)session.get(
				LocalityDivisionImpl.class, primaryKey);

			if (localityDivision == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchLocalityDivisionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(localityDivision);
		}
		catch (NoSuchLocalityDivisionException noSuchEntityException) {
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
	protected LocalityDivision removeImpl(LocalityDivision localityDivision) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(localityDivision)) {
				localityDivision = (LocalityDivision)session.get(
					LocalityDivisionImpl.class,
					localityDivision.getPrimaryKeyObj());
			}

			if (localityDivision != null) {
				session.delete(localityDivision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (localityDivision != null) {
			clearCache(localityDivision);
		}

		return localityDivision;
	}

	@Override
	public LocalityDivision updateImpl(LocalityDivision localityDivision) {
		boolean isNew = localityDivision.isNew();

		if (!(localityDivision instanceof LocalityDivisionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(localityDivision.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					localityDivision);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in localityDivision proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom LocalityDivision implementation " +
					localityDivision.getClass());
		}

		LocalityDivisionModelImpl localityDivisionModelImpl =
			(LocalityDivisionModelImpl)localityDivision;

		if (Validator.isNull(localityDivision.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			localityDivision.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (localityDivision.getCreateDate() == null)) {
			if (serviceContext == null) {
				localityDivision.setCreateDate(now);
			}
			else {
				localityDivision.setCreateDate(
					serviceContext.getCreateDate(now));
			}
		}

		if (!localityDivisionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				localityDivision.setModifiedDate(now);
			}
			else {
				localityDivision.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(localityDivision);

				localityDivision.setNew(false);
			}
			else {
				localityDivision = (LocalityDivision)session.merge(
					localityDivision);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!LocalityDivisionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {localityDivisionModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				localityDivisionModelImpl.getUuid(),
				localityDivisionModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {localityDivisionModelImpl.getLocalityName()};

			finderCache.removeResult(_finderPathCountByLocalityName, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByLocalityName, args);

			args = new Object[] {localityDivisionModelImpl.getDivisionCode()};

			finderCache.removeResult(_finderPathCountByDivisionCode, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByDivisionCode, args);

			args = new Object[] {localityDivisionModelImpl.getDivisionName()};

			finderCache.removeResult(_finderPathCountByDivisionName, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByDivisionName, args);

			args = new Object[] {
				localityDivisionModelImpl.getComplaintCenter()
			};

			finderCache.removeResult(_finderPathCountByComplaintCenter, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByComplaintCenter, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((localityDivisionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					localityDivisionModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {localityDivisionModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((localityDivisionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					localityDivisionModelImpl.getOriginalUuid(),
					localityDivisionModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					localityDivisionModelImpl.getUuid(),
					localityDivisionModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((localityDivisionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByLocalityName.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					localityDivisionModelImpl.getOriginalLocalityName()
				};

				finderCache.removeResult(_finderPathCountByLocalityName, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByLocalityName, args);

				args = new Object[] {
					localityDivisionModelImpl.getLocalityName()
				};

				finderCache.removeResult(_finderPathCountByLocalityName, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByLocalityName, args);
			}

			if ((localityDivisionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByDivisionCode.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					localityDivisionModelImpl.getOriginalDivisionCode()
				};

				finderCache.removeResult(_finderPathCountByDivisionCode, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByDivisionCode, args);

				args = new Object[] {
					localityDivisionModelImpl.getDivisionCode()
				};

				finderCache.removeResult(_finderPathCountByDivisionCode, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByDivisionCode, args);
			}

			if ((localityDivisionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByDivisionName.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					localityDivisionModelImpl.getOriginalDivisionName()
				};

				finderCache.removeResult(_finderPathCountByDivisionName, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByDivisionName, args);

				args = new Object[] {
					localityDivisionModelImpl.getDivisionName()
				};

				finderCache.removeResult(_finderPathCountByDivisionName, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByDivisionName, args);
			}

			if ((localityDivisionModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByComplaintCenter.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					localityDivisionModelImpl.getOriginalComplaintCenter()
				};

				finderCache.removeResult(
					_finderPathCountByComplaintCenter, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByComplaintCenter, args);

				args = new Object[] {
					localityDivisionModelImpl.getComplaintCenter()
				};

				finderCache.removeResult(
					_finderPathCountByComplaintCenter, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByComplaintCenter, args);
			}
		}

		entityCache.putResult(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionImpl.class, localityDivision.getPrimaryKey(),
			localityDivision, false);

		clearUniqueFindersCache(localityDivisionModelImpl, false);
		cacheUniqueFindersCache(localityDivisionModelImpl);

		localityDivision.resetOriginalValues();

		return localityDivision;
	}

	/**
	 * Returns the locality division with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the locality division
	 * @return the locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	@Override
	public LocalityDivision findByPrimaryKey(Serializable primaryKey)
		throws NoSuchLocalityDivisionException {

		LocalityDivision localityDivision = fetchByPrimaryKey(primaryKey);

		if (localityDivision == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchLocalityDivisionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return localityDivision;
	}

	/**
	 * Returns the locality division with the primary key or throws a <code>NoSuchLocalityDivisionException</code> if it could not be found.
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	@Override
	public LocalityDivision findByPrimaryKey(long localityDivisionId)
		throws NoSuchLocalityDivisionException {

		return findByPrimaryKey((Serializable)localityDivisionId);
	}

	/**
	 * Returns the locality division with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the locality division
	 * @return the locality division, or <code>null</code> if a locality division with the primary key could not be found
	 */
	@Override
	public LocalityDivision fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		LocalityDivision localityDivision = (LocalityDivision)serializable;

		if (localityDivision == null) {
			Session session = null;

			try {
				session = openSession();

				localityDivision = (LocalityDivision)session.get(
					LocalityDivisionImpl.class, primaryKey);

				if (localityDivision != null) {
					cacheResult(localityDivision);
				}
				else {
					entityCache.putResult(
						LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
						LocalityDivisionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception exception) {
				entityCache.removeResult(
					LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
					LocalityDivisionImpl.class, primaryKey);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return localityDivision;
	}

	/**
	 * Returns the locality division with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division, or <code>null</code> if a locality division with the primary key could not be found
	 */
	@Override
	public LocalityDivision fetchByPrimaryKey(long localityDivisionId) {
		return fetchByPrimaryKey((Serializable)localityDivisionId);
	}

	@Override
	public Map<Serializable, LocalityDivision> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, LocalityDivision> map =
			new HashMap<Serializable, LocalityDivision>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			LocalityDivision localityDivision = fetchByPrimaryKey(primaryKey);

			if (localityDivision != null) {
				map.put(primaryKey, localityDivision);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
				LocalityDivisionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (LocalityDivision)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler sb = new StringBundler(
			(uncachedPrimaryKeys.size() * 2) + 1);

		sb.append(_SQL_SELECT_LOCALITYDIVISION_WHERE_PKS_IN);

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

			for (LocalityDivision localityDivision :
					(List<LocalityDivision>)query.list()) {

				map.put(localityDivision.getPrimaryKeyObj(), localityDivision);

				cacheResult(localityDivision);

				uncachedPrimaryKeys.remove(localityDivision.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
					LocalityDivisionImpl.class, primaryKey, nullModel);
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
	 * Returns all the locality divisions.
	 *
	 * @return the locality divisions
	 */
	@Override
	public List<LocalityDivision> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<LocalityDivision> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<LocalityDivision> findAll(
		int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<LocalityDivision> findAll(
		int start, int end,
		OrderByComparator<LocalityDivision> orderByComparator,
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

		List<LocalityDivision> list = null;

		if (useFinderCache) {
			list = (List<LocalityDivision>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_LOCALITYDIVISION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_LOCALITYDIVISION;

				sql = sql.concat(LocalityDivisionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<LocalityDivision>)QueryUtil.list(
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
	 * Removes all the locality divisions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (LocalityDivision localityDivision : findAll()) {
			remove(localityDivision);
		}
	}

	/**
	 * Returns the number of locality divisions.
	 *
	 * @return the number of locality divisions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_LOCALITYDIVISION);

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
		return LocalityDivisionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the locality division persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			LocalityDivisionModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			LocalityDivisionModelImpl.UUID_COLUMN_BITMASK |
			LocalityDivisionModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			LocalityDivisionModelImpl.UUID_COLUMN_BITMASK |
			LocalityDivisionModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByLocalityName = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByLocalityName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByLocalityName = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByLocalityName",
			new String[] {String.class.getName()},
			LocalityDivisionModelImpl.LOCALITYNAME_COLUMN_BITMASK);

		_finderPathCountByLocalityName = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByLocalityName",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByDivisionCode = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDivisionCode",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByDivisionCode = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDivisionCode",
			new String[] {String.class.getName()},
			LocalityDivisionModelImpl.DIVISIONCODE_COLUMN_BITMASK);

		_finderPathCountByDivisionCode = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDivisionCode",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByDivisionName = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDivisionName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByDivisionName = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDivisionName",
			new String[] {String.class.getName()},
			LocalityDivisionModelImpl.DIVISIONNAME_COLUMN_BITMASK);

		_finderPathCountByDivisionName = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDivisionName",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByComplaintCenter = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByComplaintCenter",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByComplaintCenter = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED,
			LocalityDivisionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByComplaintCenter",
			new String[] {String.class.getName()},
			LocalityDivisionModelImpl.COMPLAINTCENTER_COLUMN_BITMASK);

		_finderPathCountByComplaintCenter = new FinderPath(
			LocalityDivisionModelImpl.ENTITY_CACHE_ENABLED,
			LocalityDivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByComplaintCenter",
			new String[] {String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(LocalityDivisionImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_LOCALITYDIVISION =
		"SELECT localityDivision FROM LocalityDivision localityDivision";

	private static final String _SQL_SELECT_LOCALITYDIVISION_WHERE_PKS_IN =
		"SELECT localityDivision FROM LocalityDivision localityDivision WHERE localityDivisionId IN (";

	private static final String _SQL_SELECT_LOCALITYDIVISION_WHERE =
		"SELECT localityDivision FROM LocalityDivision localityDivision WHERE ";

	private static final String _SQL_COUNT_LOCALITYDIVISION =
		"SELECT COUNT(localityDivision) FROM LocalityDivision localityDivision";

	private static final String _SQL_COUNT_LOCALITYDIVISION_WHERE =
		"SELECT COUNT(localityDivision) FROM LocalityDivision localityDivision WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "localityDivision.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No LocalityDivision exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No LocalityDivision exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		LocalityDivisionPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}