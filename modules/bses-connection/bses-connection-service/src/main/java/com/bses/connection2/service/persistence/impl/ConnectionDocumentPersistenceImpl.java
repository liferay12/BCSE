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

import com.bses.connection2.exception.NoSuchConnectionDocumentException;
import com.bses.connection2.model.ConnectionDocument;
import com.bses.connection2.model.impl.ConnectionDocumentImpl;
import com.bses.connection2.model.impl.ConnectionDocumentModelImpl;
import com.bses.connection2.service.persistence.ConnectionDocumentPersistence;

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
 * The persistence implementation for the connection document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ConnectionDocumentPersistenceImpl
	extends BasePersistenceImpl<ConnectionDocument>
	implements ConnectionDocumentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ConnectionDocumentUtil</code> to access the connection document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ConnectionDocumentImpl.class.getName();

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
	 * Returns all the connection documents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching connection documents
	 */
	@Override
	public List<ConnectionDocument> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionDocument> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<ConnectionDocument> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionDocument> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator,
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

		List<ConnectionDocument> list = null;

		if (useFinderCache) {
			list = (List<ConnectionDocument>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionDocument connectionDocument : list) {
					if (!uuid.equals(connectionDocument.getUuid())) {
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

			sb.append(_SQL_SELECT_CONNECTIONDOCUMENT_WHERE);

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
				sb.append(ConnectionDocumentModelImpl.ORDER_BY_JPQL);
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

				list = (List<ConnectionDocument>)QueryUtil.list(
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
	 * Returns the first connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument findByUuid_First(
			String uuid,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument = fetchByUuid_First(
			uuid, orderByComparator);

		if (connectionDocument != null) {
			return connectionDocument;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchConnectionDocumentException(sb.toString());
	}

	/**
	 * Returns the first connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument fetchByUuid_First(
		String uuid, OrderByComparator<ConnectionDocument> orderByComparator) {

		List<ConnectionDocument> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument findByUuid_Last(
			String uuid,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument = fetchByUuid_Last(
			uuid, orderByComparator);

		if (connectionDocument != null) {
			return connectionDocument;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchConnectionDocumentException(sb.toString());
	}

	/**
	 * Returns the last connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument fetchByUuid_Last(
		String uuid, OrderByComparator<ConnectionDocument> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ConnectionDocument> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionDocument[] findByUuid_PrevAndNext(
			long connectionDocumentId, String uuid,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws NoSuchConnectionDocumentException {

		uuid = Objects.toString(uuid, "");

		ConnectionDocument connectionDocument = findByPrimaryKey(
			connectionDocumentId);

		Session session = null;

		try {
			session = openSession();

			ConnectionDocument[] array = new ConnectionDocumentImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, connectionDocument, uuid, orderByComparator, true);

			array[1] = connectionDocument;

			array[2] = getByUuid_PrevAndNext(
				session, connectionDocument, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConnectionDocument getByUuid_PrevAndNext(
		Session session, ConnectionDocument connectionDocument, String uuid,
		OrderByComparator<ConnectionDocument> orderByComparator,
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

		sb.append(_SQL_SELECT_CONNECTIONDOCUMENT_WHERE);

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
			sb.append(ConnectionDocumentModelImpl.ORDER_BY_JPQL);
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
						connectionDocument)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionDocument> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection documents where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ConnectionDocument connectionDocument :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(connectionDocument);
		}
	}

	/**
	 * Returns the number of connection documents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching connection documents
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONNECTIONDOCUMENT_WHERE);

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
		"connectionDocument.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(connectionDocument.uuid IS NULL OR connectionDocument.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the connection document where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchConnectionDocumentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument findByUUID_G(String uuid, long groupId)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument = fetchByUUID_G(uuid, groupId);

		if (connectionDocument == null) {
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

			throw new NoSuchConnectionDocumentException(sb.toString());
		}

		return connectionDocument;
	}

	/**
	 * Returns the connection document where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the connection document where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument fetchByUUID_G(
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

		if (result instanceof ConnectionDocument) {
			ConnectionDocument connectionDocument = (ConnectionDocument)result;

			if (!Objects.equals(uuid, connectionDocument.getUuid()) ||
				(groupId != connectionDocument.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CONNECTIONDOCUMENT_WHERE);

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

				List<ConnectionDocument> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					ConnectionDocument connectionDocument = list.get(0);

					result = connectionDocument;

					cacheResult(connectionDocument);
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
			return (ConnectionDocument)result;
		}
	}

	/**
	 * Removes the connection document where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the connection document that was removed
	 */
	@Override
	public ConnectionDocument removeByUUID_G(String uuid, long groupId)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument = findByUUID_G(uuid, groupId);

		return remove(connectionDocument);
	}

	/**
	 * Returns the number of connection documents where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching connection documents
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CONNECTIONDOCUMENT_WHERE);

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
		"connectionDocument.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(connectionDocument.uuid IS NULL OR connectionDocument.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"connectionDocument.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the connection documents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching connection documents
	 */
	@Override
	public List<ConnectionDocument> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionDocument> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<ConnectionDocument> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionDocument> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator,
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

		List<ConnectionDocument> list = null;

		if (useFinderCache) {
			list = (List<ConnectionDocument>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionDocument connectionDocument : list) {
					if (!uuid.equals(connectionDocument.getUuid()) ||
						(companyId != connectionDocument.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CONNECTIONDOCUMENT_WHERE);

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
				sb.append(ConnectionDocumentModelImpl.ORDER_BY_JPQL);
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

				list = (List<ConnectionDocument>)QueryUtil.list(
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
	 * Returns the first connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (connectionDocument != null) {
			return connectionDocument;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchConnectionDocumentException(sb.toString());
	}

	/**
	 * Returns the first connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		List<ConnectionDocument> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionDocument findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (connectionDocument != null) {
			return connectionDocument;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchConnectionDocumentException(sb.toString());
	}

	/**
	 * Returns the last connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<ConnectionDocument> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionDocument[] findByUuid_C_PrevAndNext(
			long connectionDocumentId, String uuid, long companyId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws NoSuchConnectionDocumentException {

		uuid = Objects.toString(uuid, "");

		ConnectionDocument connectionDocument = findByPrimaryKey(
			connectionDocumentId);

		Session session = null;

		try {
			session = openSession();

			ConnectionDocument[] array = new ConnectionDocumentImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, connectionDocument, uuid, companyId, orderByComparator,
				true);

			array[1] = connectionDocument;

			array[2] = getByUuid_C_PrevAndNext(
				session, connectionDocument, uuid, companyId, orderByComparator,
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

	protected ConnectionDocument getByUuid_C_PrevAndNext(
		Session session, ConnectionDocument connectionDocument, String uuid,
		long companyId, OrderByComparator<ConnectionDocument> orderByComparator,
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

		sb.append(_SQL_SELECT_CONNECTIONDOCUMENT_WHERE);

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
			sb.append(ConnectionDocumentModelImpl.ORDER_BY_JPQL);
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
						connectionDocument)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionDocument> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection documents where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (ConnectionDocument connectionDocument :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(connectionDocument);
		}
	}

	/**
	 * Returns the number of connection documents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching connection documents
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CONNECTIONDOCUMENT_WHERE);

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
		"connectionDocument.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(connectionDocument.uuid IS NULL OR connectionDocument.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"connectionDocument.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByConnectionRequestId;
	private FinderPath _finderPathWithoutPaginationFindByConnectionRequestId;
	private FinderPath _finderPathCountByConnectionRequestId;

	/**
	 * Returns all the connection documents where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @return the matching connection documents
	 */
	@Override
	public List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId) {

		return findByConnectionRequestId(
			connectionRequestId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId, int start, int end) {

		return findByConnectionRequestId(connectionRequestId, start, end, null);
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
	@Override
	public List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return findByConnectionRequestId(
			connectionRequestId, start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId, int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByConnectionRequestId;
				finderArgs = new Object[] {connectionRequestId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByConnectionRequestId;
			finderArgs = new Object[] {
				connectionRequestId, start, end, orderByComparator
			};
		}

		List<ConnectionDocument> list = null;

		if (useFinderCache) {
			list = (List<ConnectionDocument>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ConnectionDocument connectionDocument : list) {
					if (connectionRequestId !=
							connectionDocument.getConnectionRequestId()) {

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

			sb.append(_SQL_SELECT_CONNECTIONDOCUMENT_WHERE);

			sb.append(_FINDER_COLUMN_CONNECTIONREQUESTID_CONNECTIONREQUESTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ConnectionDocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(connectionRequestId);

				list = (List<ConnectionDocument>)QueryUtil.list(
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
	 * Returns the first connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument findByConnectionRequestId_First(
			long connectionRequestId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument =
			fetchByConnectionRequestId_First(
				connectionRequestId, orderByComparator);

		if (connectionDocument != null) {
			return connectionDocument;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("connectionRequestId=");
		sb.append(connectionRequestId);

		sb.append("}");

		throw new NoSuchConnectionDocumentException(sb.toString());
	}

	/**
	 * Returns the first connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument fetchByConnectionRequestId_First(
		long connectionRequestId,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		List<ConnectionDocument> list = findByConnectionRequestId(
			connectionRequestId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument findByConnectionRequestId_Last(
			long connectionRequestId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument = fetchByConnectionRequestId_Last(
			connectionRequestId, orderByComparator);

		if (connectionDocument != null) {
			return connectionDocument;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("connectionRequestId=");
		sb.append(connectionRequestId);

		sb.append("}");

		throw new NoSuchConnectionDocumentException(sb.toString());
	}

	/**
	 * Returns the last connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument fetchByConnectionRequestId_Last(
		long connectionRequestId,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		int count = countByConnectionRequestId(connectionRequestId);

		if (count == 0) {
			return null;
		}

		List<ConnectionDocument> list = findByConnectionRequestId(
			connectionRequestId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ConnectionDocument[] findByConnectionRequestId_PrevAndNext(
			long connectionDocumentId, long connectionRequestId,
			OrderByComparator<ConnectionDocument> orderByComparator)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument = findByPrimaryKey(
			connectionDocumentId);

		Session session = null;

		try {
			session = openSession();

			ConnectionDocument[] array = new ConnectionDocumentImpl[3];

			array[0] = getByConnectionRequestId_PrevAndNext(
				session, connectionDocument, connectionRequestId,
				orderByComparator, true);

			array[1] = connectionDocument;

			array[2] = getByConnectionRequestId_PrevAndNext(
				session, connectionDocument, connectionRequestId,
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

	protected ConnectionDocument getByConnectionRequestId_PrevAndNext(
		Session session, ConnectionDocument connectionDocument,
		long connectionRequestId,
		OrderByComparator<ConnectionDocument> orderByComparator,
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

		sb.append(_SQL_SELECT_CONNECTIONDOCUMENT_WHERE);

		sb.append(_FINDER_COLUMN_CONNECTIONREQUESTID_CONNECTIONREQUESTID_2);

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
			sb.append(ConnectionDocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(connectionRequestId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						connectionDocument)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ConnectionDocument> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the connection documents where connectionRequestId = &#63; from the database.
	 *
	 * @param connectionRequestId the connection request ID
	 */
	@Override
	public void removeByConnectionRequestId(long connectionRequestId) {
		for (ConnectionDocument connectionDocument :
				findByConnectionRequestId(
					connectionRequestId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(connectionDocument);
		}
	}

	/**
	 * Returns the number of connection documents where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @return the number of matching connection documents
	 */
	@Override
	public int countByConnectionRequestId(long connectionRequestId) {
		FinderPath finderPath = _finderPathCountByConnectionRequestId;

		Object[] finderArgs = new Object[] {connectionRequestId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CONNECTIONDOCUMENT_WHERE);

			sb.append(_FINDER_COLUMN_CONNECTIONREQUESTID_CONNECTIONREQUESTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(connectionRequestId);

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
		_FINDER_COLUMN_CONNECTIONREQUESTID_CONNECTIONREQUESTID_2 =
			"connectionDocument.connectionRequestId = ?";

	private FinderPath _finderPathFetchByConnectionRequestIdAndDocumentType;
	private FinderPath _finderPathCountByConnectionRequestIdAndDocumentType;

	/**
	 * Returns the connection document where connectionRequestId = &#63; and documentType = &#63; or throws a <code>NoSuchConnectionDocumentException</code> if it could not be found.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument findByConnectionRequestIdAndDocumentType(
			long connectionRequestId, String documentType)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument =
			fetchByConnectionRequestIdAndDocumentType(
				connectionRequestId, documentType);

		if (connectionDocument == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("connectionRequestId=");
			sb.append(connectionRequestId);

			sb.append(", documentType=");
			sb.append(documentType);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchConnectionDocumentException(sb.toString());
		}

		return connectionDocument;
	}

	/**
	 * Returns the connection document where connectionRequestId = &#63; and documentType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument fetchByConnectionRequestIdAndDocumentType(
		long connectionRequestId, String documentType) {

		return fetchByConnectionRequestIdAndDocumentType(
			connectionRequestId, documentType, true);
	}

	/**
	 * Returns the connection document where connectionRequestId = &#63; and documentType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	@Override
	public ConnectionDocument fetchByConnectionRequestIdAndDocumentType(
		long connectionRequestId, String documentType, boolean useFinderCache) {

		documentType = Objects.toString(documentType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {connectionRequestId, documentType};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByConnectionRequestIdAndDocumentType,
				finderArgs, this);
		}

		if (result instanceof ConnectionDocument) {
			ConnectionDocument connectionDocument = (ConnectionDocument)result;

			if ((connectionRequestId !=
					connectionDocument.getConnectionRequestId()) ||
				!Objects.equals(
					documentType, connectionDocument.getDocumentType())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CONNECTIONDOCUMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_CONNECTIONREQUESTIDANDDOCUMENTTYPE_CONNECTIONREQUESTID_2);

			boolean bindDocumentType = false;

			if (documentType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_CONNECTIONREQUESTIDANDDOCUMENTTYPE_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				sb.append(
					_FINDER_COLUMN_CONNECTIONREQUESTIDANDDOCUMENTTYPE_DOCUMENTTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(connectionRequestId);

				if (bindDocumentType) {
					queryPos.add(documentType);
				}

				List<ConnectionDocument> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByConnectionRequestIdAndDocumentType,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									connectionRequestId, documentType
								};
							}

							_log.warn(
								"ConnectionDocumentPersistenceImpl.fetchByConnectionRequestIdAndDocumentType(long, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ConnectionDocument connectionDocument = list.get(0);

					result = connectionDocument;

					cacheResult(connectionDocument);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByConnectionRequestIdAndDocumentType,
						finderArgs);
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
			return (ConnectionDocument)result;
		}
	}

	/**
	 * Removes the connection document where connectionRequestId = &#63; and documentType = &#63; from the database.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the connection document that was removed
	 */
	@Override
	public ConnectionDocument removeByConnectionRequestIdAndDocumentType(
			long connectionRequestId, String documentType)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument =
			findByConnectionRequestIdAndDocumentType(
				connectionRequestId, documentType);

		return remove(connectionDocument);
	}

	/**
	 * Returns the number of connection documents where connectionRequestId = &#63; and documentType = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the number of matching connection documents
	 */
	@Override
	public int countByConnectionRequestIdAndDocumentType(
		long connectionRequestId, String documentType) {

		documentType = Objects.toString(documentType, "");

		FinderPath finderPath =
			_finderPathCountByConnectionRequestIdAndDocumentType;

		Object[] finderArgs = new Object[] {connectionRequestId, documentType};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CONNECTIONDOCUMENT_WHERE);

			sb.append(
				_FINDER_COLUMN_CONNECTIONREQUESTIDANDDOCUMENTTYPE_CONNECTIONREQUESTID_2);

			boolean bindDocumentType = false;

			if (documentType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_CONNECTIONREQUESTIDANDDOCUMENTTYPE_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				sb.append(
					_FINDER_COLUMN_CONNECTIONREQUESTIDANDDOCUMENTTYPE_DOCUMENTTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(connectionRequestId);

				if (bindDocumentType) {
					queryPos.add(documentType);
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
		_FINDER_COLUMN_CONNECTIONREQUESTIDANDDOCUMENTTYPE_CONNECTIONREQUESTID_2 =
			"connectionDocument.connectionRequestId = ? AND ";

	private static final String
		_FINDER_COLUMN_CONNECTIONREQUESTIDANDDOCUMENTTYPE_DOCUMENTTYPE_2 =
			"connectionDocument.documentType = ?";

	private static final String
		_FINDER_COLUMN_CONNECTIONREQUESTIDANDDOCUMENTTYPE_DOCUMENTTYPE_3 =
			"(connectionDocument.documentType IS NULL OR connectionDocument.documentType = '')";

	public ConnectionDocumentPersistenceImpl() {
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

		setModelClass(ConnectionDocument.class);
	}

	/**
	 * Caches the connection document in the entity cache if it is enabled.
	 *
	 * @param connectionDocument the connection document
	 */
	@Override
	public void cacheResult(ConnectionDocument connectionDocument) {
		entityCache.putResult(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentImpl.class, connectionDocument.getPrimaryKey(),
			connectionDocument);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				connectionDocument.getUuid(), connectionDocument.getGroupId()
			},
			connectionDocument);

		finderCache.putResult(
			_finderPathFetchByConnectionRequestIdAndDocumentType,
			new Object[] {
				connectionDocument.getConnectionRequestId(),
				connectionDocument.getDocumentType()
			},
			connectionDocument);

		connectionDocument.resetOriginalValues();
	}

	/**
	 * Caches the connection documents in the entity cache if it is enabled.
	 *
	 * @param connectionDocuments the connection documents
	 */
	@Override
	public void cacheResult(List<ConnectionDocument> connectionDocuments) {
		for (ConnectionDocument connectionDocument : connectionDocuments) {
			if (entityCache.getResult(
					ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
					ConnectionDocumentImpl.class,
					connectionDocument.getPrimaryKey()) == null) {

				cacheResult(connectionDocument);
			}
			else {
				connectionDocument.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all connection documents.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ConnectionDocumentImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the connection document.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ConnectionDocument connectionDocument) {
		entityCache.removeResult(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentImpl.class, connectionDocument.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(ConnectionDocumentModelImpl)connectionDocument, true);
	}

	@Override
	public void clearCache(List<ConnectionDocument> connectionDocuments) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ConnectionDocument connectionDocument : connectionDocuments) {
			entityCache.removeResult(
				ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionDocumentImpl.class,
				connectionDocument.getPrimaryKey());

			clearUniqueFindersCache(
				(ConnectionDocumentModelImpl)connectionDocument, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionDocumentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ConnectionDocumentModelImpl connectionDocumentModelImpl) {

		Object[] args = new Object[] {
			connectionDocumentModelImpl.getUuid(),
			connectionDocumentModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, connectionDocumentModelImpl, false);

		args = new Object[] {
			connectionDocumentModelImpl.getConnectionRequestId(),
			connectionDocumentModelImpl.getDocumentType()
		};

		finderCache.putResult(
			_finderPathCountByConnectionRequestIdAndDocumentType, args,
			Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByConnectionRequestIdAndDocumentType, args,
			connectionDocumentModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ConnectionDocumentModelImpl connectionDocumentModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				connectionDocumentModelImpl.getUuid(),
				connectionDocumentModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((connectionDocumentModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				connectionDocumentModelImpl.getOriginalUuid(),
				connectionDocumentModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				connectionDocumentModelImpl.getConnectionRequestId(),
				connectionDocumentModelImpl.getDocumentType()
			};

			finderCache.removeResult(
				_finderPathCountByConnectionRequestIdAndDocumentType, args);
			finderCache.removeResult(
				_finderPathFetchByConnectionRequestIdAndDocumentType, args);
		}

		if ((connectionDocumentModelImpl.getColumnBitmask() &
			 _finderPathFetchByConnectionRequestIdAndDocumentType.
				 getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				connectionDocumentModelImpl.getOriginalConnectionRequestId(),
				connectionDocumentModelImpl.getOriginalDocumentType()
			};

			finderCache.removeResult(
				_finderPathCountByConnectionRequestIdAndDocumentType, args);
			finderCache.removeResult(
				_finderPathFetchByConnectionRequestIdAndDocumentType, args);
		}
	}

	/**
	 * Creates a new connection document with the primary key. Does not add the connection document to the database.
	 *
	 * @param connectionDocumentId the primary key for the new connection document
	 * @return the new connection document
	 */
	@Override
	public ConnectionDocument create(long connectionDocumentId) {
		ConnectionDocument connectionDocument = new ConnectionDocumentImpl();

		connectionDocument.setNew(true);
		connectionDocument.setPrimaryKey(connectionDocumentId);

		String uuid = PortalUUIDUtil.generate();

		connectionDocument.setUuid(uuid);

		connectionDocument.setCompanyId(CompanyThreadLocal.getCompanyId());

		return connectionDocument;
	}

	/**
	 * Removes the connection document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document that was removed
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	@Override
	public ConnectionDocument remove(long connectionDocumentId)
		throws NoSuchConnectionDocumentException {

		return remove((Serializable)connectionDocumentId);
	}

	/**
	 * Removes the connection document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the connection document
	 * @return the connection document that was removed
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	@Override
	public ConnectionDocument remove(Serializable primaryKey)
		throws NoSuchConnectionDocumentException {

		Session session = null;

		try {
			session = openSession();

			ConnectionDocument connectionDocument =
				(ConnectionDocument)session.get(
					ConnectionDocumentImpl.class, primaryKey);

			if (connectionDocument == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConnectionDocumentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(connectionDocument);
		}
		catch (NoSuchConnectionDocumentException noSuchEntityException) {
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
	protected ConnectionDocument removeImpl(
		ConnectionDocument connectionDocument) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(connectionDocument)) {
				connectionDocument = (ConnectionDocument)session.get(
					ConnectionDocumentImpl.class,
					connectionDocument.getPrimaryKeyObj());
			}

			if (connectionDocument != null) {
				session.delete(connectionDocument);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (connectionDocument != null) {
			clearCache(connectionDocument);
		}

		return connectionDocument;
	}

	@Override
	public ConnectionDocument updateImpl(
		ConnectionDocument connectionDocument) {

		boolean isNew = connectionDocument.isNew();

		if (!(connectionDocument instanceof ConnectionDocumentModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(connectionDocument.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					connectionDocument);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in connectionDocument proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ConnectionDocument implementation " +
					connectionDocument.getClass());
		}

		ConnectionDocumentModelImpl connectionDocumentModelImpl =
			(ConnectionDocumentModelImpl)connectionDocument;

		if (Validator.isNull(connectionDocument.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			connectionDocument.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (connectionDocument.getCreateDate() == null)) {
			if (serviceContext == null) {
				connectionDocument.setCreateDate(now);
			}
			else {
				connectionDocument.setCreateDate(
					serviceContext.getCreateDate(now));
			}
		}

		if (!connectionDocumentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				connectionDocument.setModifiedDate(now);
			}
			else {
				connectionDocument.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(connectionDocument);

				connectionDocument.setNew(false);
			}
			else {
				connectionDocument = (ConnectionDocument)session.merge(
					connectionDocument);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ConnectionDocumentModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {
				connectionDocumentModelImpl.getUuid()
			};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				connectionDocumentModelImpl.getUuid(),
				connectionDocumentModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {
				connectionDocumentModelImpl.getConnectionRequestId()
			};

			finderCache.removeResult(
				_finderPathCountByConnectionRequestId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByConnectionRequestId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((connectionDocumentModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					connectionDocumentModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {connectionDocumentModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((connectionDocumentModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					connectionDocumentModelImpl.getOriginalUuid(),
					connectionDocumentModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					connectionDocumentModelImpl.getUuid(),
					connectionDocumentModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((connectionDocumentModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByConnectionRequestId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					connectionDocumentModelImpl.getOriginalConnectionRequestId()
				};

				finderCache.removeResult(
					_finderPathCountByConnectionRequestId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByConnectionRequestId,
					args);

				args = new Object[] {
					connectionDocumentModelImpl.getConnectionRequestId()
				};

				finderCache.removeResult(
					_finderPathCountByConnectionRequestId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByConnectionRequestId,
					args);
			}
		}

		entityCache.putResult(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentImpl.class, connectionDocument.getPrimaryKey(),
			connectionDocument, false);

		clearUniqueFindersCache(connectionDocumentModelImpl, false);
		cacheUniqueFindersCache(connectionDocumentModelImpl);

		connectionDocument.resetOriginalValues();

		return connectionDocument;
	}

	/**
	 * Returns the connection document with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection document
	 * @return the connection document
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	@Override
	public ConnectionDocument findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConnectionDocumentException {

		ConnectionDocument connectionDocument = fetchByPrimaryKey(primaryKey);

		if (connectionDocument == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConnectionDocumentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return connectionDocument;
	}

	/**
	 * Returns the connection document with the primary key or throws a <code>NoSuchConnectionDocumentException</code> if it could not be found.
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	@Override
	public ConnectionDocument findByPrimaryKey(long connectionDocumentId)
		throws NoSuchConnectionDocumentException {

		return findByPrimaryKey((Serializable)connectionDocumentId);
	}

	/**
	 * Returns the connection document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the connection document
	 * @return the connection document, or <code>null</code> if a connection document with the primary key could not be found
	 */
	@Override
	public ConnectionDocument fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ConnectionDocument connectionDocument =
			(ConnectionDocument)serializable;

		if (connectionDocument == null) {
			Session session = null;

			try {
				session = openSession();

				connectionDocument = (ConnectionDocument)session.get(
					ConnectionDocumentImpl.class, primaryKey);

				if (connectionDocument != null) {
					cacheResult(connectionDocument);
				}
				else {
					entityCache.putResult(
						ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
						ConnectionDocumentImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception exception) {
				entityCache.removeResult(
					ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
					ConnectionDocumentImpl.class, primaryKey);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return connectionDocument;
	}

	/**
	 * Returns the connection document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document, or <code>null</code> if a connection document with the primary key could not be found
	 */
	@Override
	public ConnectionDocument fetchByPrimaryKey(long connectionDocumentId) {
		return fetchByPrimaryKey((Serializable)connectionDocumentId);
	}

	@Override
	public Map<Serializable, ConnectionDocument> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ConnectionDocument> map =
			new HashMap<Serializable, ConnectionDocument>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ConnectionDocument connectionDocument = fetchByPrimaryKey(
				primaryKey);

			if (connectionDocument != null) {
				map.put(primaryKey, connectionDocument);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
				ConnectionDocumentImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ConnectionDocument)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler sb = new StringBundler(
			(uncachedPrimaryKeys.size() * 2) + 1);

		sb.append(_SQL_SELECT_CONNECTIONDOCUMENT_WHERE_PKS_IN);

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

			for (ConnectionDocument connectionDocument :
					(List<ConnectionDocument>)query.list()) {

				map.put(
					connectionDocument.getPrimaryKeyObj(), connectionDocument);

				cacheResult(connectionDocument);

				uncachedPrimaryKeys.remove(
					connectionDocument.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
					ConnectionDocumentImpl.class, primaryKey, nullModel);
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
	 * Returns all the connection documents.
	 *
	 * @return the connection documents
	 */
	@Override
	public List<ConnectionDocument> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ConnectionDocument> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<ConnectionDocument> findAll(
		int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<ConnectionDocument> findAll(
		int start, int end,
		OrderByComparator<ConnectionDocument> orderByComparator,
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

		List<ConnectionDocument> list = null;

		if (useFinderCache) {
			list = (List<ConnectionDocument>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CONNECTIONDOCUMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CONNECTIONDOCUMENT;

				sql = sql.concat(ConnectionDocumentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ConnectionDocument>)QueryUtil.list(
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
	 * Removes all the connection documents from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ConnectionDocument connectionDocument : findAll()) {
			remove(connectionDocument);
		}
	}

	/**
	 * Returns the number of connection documents.
	 *
	 * @return the number of connection documents
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_CONNECTIONDOCUMENT);

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
		return ConnectionDocumentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the connection document persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			ConnectionDocumentModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDocumentImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			ConnectionDocumentModelImpl.UUID_COLUMN_BITMASK |
			ConnectionDocumentModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			ConnectionDocumentModelImpl.UUID_COLUMN_BITMASK |
			ConnectionDocumentModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByConnectionRequestId = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConnectionRequestId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByConnectionRequestId = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByConnectionRequestId", new String[] {Long.class.getName()},
			ConnectionDocumentModelImpl.CONNECTIONREQUESTID_COLUMN_BITMASK);

		_finderPathCountByConnectionRequestId = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConnectionRequestId", new String[] {Long.class.getName()});

		_finderPathFetchByConnectionRequestIdAndDocumentType = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED,
			ConnectionDocumentImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByConnectionRequestIdAndDocumentType",
			new String[] {Long.class.getName(), String.class.getName()},
			ConnectionDocumentModelImpl.CONNECTIONREQUESTID_COLUMN_BITMASK |
			ConnectionDocumentModelImpl.DOCUMENTTYPE_COLUMN_BITMASK);

		_finderPathCountByConnectionRequestIdAndDocumentType = new FinderPath(
			ConnectionDocumentModelImpl.ENTITY_CACHE_ENABLED,
			ConnectionDocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByConnectionRequestIdAndDocumentType",
			new String[] {Long.class.getName(), String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(ConnectionDocumentImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CONNECTIONDOCUMENT =
		"SELECT connectionDocument FROM ConnectionDocument connectionDocument";

	private static final String _SQL_SELECT_CONNECTIONDOCUMENT_WHERE_PKS_IN =
		"SELECT connectionDocument FROM ConnectionDocument connectionDocument WHERE connectionDocumentId IN (";

	private static final String _SQL_SELECT_CONNECTIONDOCUMENT_WHERE =
		"SELECT connectionDocument FROM ConnectionDocument connectionDocument WHERE ";

	private static final String _SQL_COUNT_CONNECTIONDOCUMENT =
		"SELECT COUNT(connectionDocument) FROM ConnectionDocument connectionDocument";

	private static final String _SQL_COUNT_CONNECTIONDOCUMENT_WHERE =
		"SELECT COUNT(connectionDocument) FROM ConnectionDocument connectionDocument WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "connectionDocument.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ConnectionDocument exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ConnectionDocument exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ConnectionDocumentPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}