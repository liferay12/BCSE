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

import com.bses.connection2.exception.NoSuchOTPException;
import com.bses.connection2.model.OTP;
import com.bses.connection2.model.impl.OTPImpl;
import com.bses.connection2.model.impl.OTPModelImpl;
import com.bses.connection2.service.persistence.OTPPersistence;

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
 * The persistence implementation for the otp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OTPPersistenceImpl
	extends BasePersistenceImpl<OTP> implements OTPPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OTPUtil</code> to access the otp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OTPImpl.class.getName();

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
	 * Returns all the otps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching otps
	 */
	@Override
	public List<OTP> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the otps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @return the range of matching otps
	 */
	@Override
	public List<OTP> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the otps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching otps
	 */
	@Override
	public List<OTP> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OTP> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the otps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching otps
	 */
	@Override
	public List<OTP> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OTP> orderByComparator, boolean useFinderCache) {

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

		List<OTP> list = null;

		if (useFinderCache) {
			list = (List<OTP>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OTP otp : list) {
					if (!uuid.equals(otp.getUuid())) {
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

			sb.append(_SQL_SELECT_OTP_WHERE);

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
				sb.append(OTPModelImpl.ORDER_BY_JPQL);
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

				list = (List<OTP>)QueryUtil.list(
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
	 * Returns the first otp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching otp
	 * @throws NoSuchOTPException if a matching otp could not be found
	 */
	@Override
	public OTP findByUuid_First(
			String uuid, OrderByComparator<OTP> orderByComparator)
		throws NoSuchOTPException {

		OTP otp = fetchByUuid_First(uuid, orderByComparator);

		if (otp != null) {
			return otp;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOTPException(sb.toString());
	}

	/**
	 * Returns the first otp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching otp, or <code>null</code> if a matching otp could not be found
	 */
	@Override
	public OTP fetchByUuid_First(
		String uuid, OrderByComparator<OTP> orderByComparator) {

		List<OTP> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last otp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching otp
	 * @throws NoSuchOTPException if a matching otp could not be found
	 */
	@Override
	public OTP findByUuid_Last(
			String uuid, OrderByComparator<OTP> orderByComparator)
		throws NoSuchOTPException {

		OTP otp = fetchByUuid_Last(uuid, orderByComparator);

		if (otp != null) {
			return otp;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOTPException(sb.toString());
	}

	/**
	 * Returns the last otp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching otp, or <code>null</code> if a matching otp could not be found
	 */
	@Override
	public OTP fetchByUuid_Last(
		String uuid, OrderByComparator<OTP> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OTP> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the otps before and after the current otp in the ordered set where uuid = &#63;.
	 *
	 * @param otpId the primary key of the current otp
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next otp
	 * @throws NoSuchOTPException if a otp with the primary key could not be found
	 */
	@Override
	public OTP[] findByUuid_PrevAndNext(
			long otpId, String uuid, OrderByComparator<OTP> orderByComparator)
		throws NoSuchOTPException {

		uuid = Objects.toString(uuid, "");

		OTP otp = findByPrimaryKey(otpId);

		Session session = null;

		try {
			session = openSession();

			OTP[] array = new OTPImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, otp, uuid, orderByComparator, true);

			array[1] = otp;

			array[2] = getByUuid_PrevAndNext(
				session, otp, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OTP getByUuid_PrevAndNext(
		Session session, OTP otp, String uuid,
		OrderByComparator<OTP> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OTP_WHERE);

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
			sb.append(OTPModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(otp)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OTP> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the otps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OTP otp :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(otp);
		}
	}

	/**
	 * Returns the number of otps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching otps
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OTP_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "otp.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(otp.uuid IS NULL OR otp.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the otp where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOTPException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching otp
	 * @throws NoSuchOTPException if a matching otp could not be found
	 */
	@Override
	public OTP findByUUID_G(String uuid, long groupId)
		throws NoSuchOTPException {

		OTP otp = fetchByUUID_G(uuid, groupId);

		if (otp == null) {
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

			throw new NoSuchOTPException(sb.toString());
		}

		return otp;
	}

	/**
	 * Returns the otp where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching otp, or <code>null</code> if a matching otp could not be found
	 */
	@Override
	public OTP fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the otp where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching otp, or <code>null</code> if a matching otp could not be found
	 */
	@Override
	public OTP fetchByUUID_G(
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

		if (result instanceof OTP) {
			OTP otp = (OTP)result;

			if (!Objects.equals(uuid, otp.getUuid()) ||
				(groupId != otp.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OTP_WHERE);

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

				List<OTP> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OTP otp = list.get(0);

					result = otp;

					cacheResult(otp);
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
			return (OTP)result;
		}
	}

	/**
	 * Removes the otp where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the otp that was removed
	 */
	@Override
	public OTP removeByUUID_G(String uuid, long groupId)
		throws NoSuchOTPException {

		OTP otp = findByUUID_G(uuid, groupId);

		return remove(otp);
	}

	/**
	 * Returns the number of otps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching otps
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OTP_WHERE);

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
		"otp.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(otp.uuid IS NULL OR otp.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"otp.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the otps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching otps
	 */
	@Override
	public List<OTP> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the otps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @return the range of matching otps
	 */
	@Override
	public List<OTP> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the otps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching otps
	 */
	@Override
	public List<OTP> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OTP> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the otps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching otps
	 */
	@Override
	public List<OTP> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OTP> orderByComparator, boolean useFinderCache) {

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

		List<OTP> list = null;

		if (useFinderCache) {
			list = (List<OTP>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OTP otp : list) {
					if (!uuid.equals(otp.getUuid()) ||
						(companyId != otp.getCompanyId())) {

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

			sb.append(_SQL_SELECT_OTP_WHERE);

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
				sb.append(OTPModelImpl.ORDER_BY_JPQL);
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

				list = (List<OTP>)QueryUtil.list(
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
	 * Returns the first otp in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching otp
	 * @throws NoSuchOTPException if a matching otp could not be found
	 */
	@Override
	public OTP findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OTP> orderByComparator)
		throws NoSuchOTPException {

		OTP otp = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (otp != null) {
			return otp;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOTPException(sb.toString());
	}

	/**
	 * Returns the first otp in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching otp, or <code>null</code> if a matching otp could not be found
	 */
	@Override
	public OTP fetchByUuid_C_First(
		String uuid, long companyId, OrderByComparator<OTP> orderByComparator) {

		List<OTP> list = findByUuid_C(uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last otp in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching otp
	 * @throws NoSuchOTPException if a matching otp could not be found
	 */
	@Override
	public OTP findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OTP> orderByComparator)
		throws NoSuchOTPException {

		OTP otp = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (otp != null) {
			return otp;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOTPException(sb.toString());
	}

	/**
	 * Returns the last otp in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching otp, or <code>null</code> if a matching otp could not be found
	 */
	@Override
	public OTP fetchByUuid_C_Last(
		String uuid, long companyId, OrderByComparator<OTP> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OTP> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the otps before and after the current otp in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param otpId the primary key of the current otp
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next otp
	 * @throws NoSuchOTPException if a otp with the primary key could not be found
	 */
	@Override
	public OTP[] findByUuid_C_PrevAndNext(
			long otpId, String uuid, long companyId,
			OrderByComparator<OTP> orderByComparator)
		throws NoSuchOTPException {

		uuid = Objects.toString(uuid, "");

		OTP otp = findByPrimaryKey(otpId);

		Session session = null;

		try {
			session = openSession();

			OTP[] array = new OTPImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, otp, uuid, companyId, orderByComparator, true);

			array[1] = otp;

			array[2] = getByUuid_C_PrevAndNext(
				session, otp, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OTP getByUuid_C_PrevAndNext(
		Session session, OTP otp, String uuid, long companyId,
		OrderByComparator<OTP> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_OTP_WHERE);

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
			sb.append(OTPModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(otp)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OTP> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the otps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OTP otp :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(otp);
		}
	}

	/**
	 * Returns the number of otps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching otps
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OTP_WHERE);

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
		"otp.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(otp.uuid IS NULL OR otp.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"otp.companyId = ?";

	private FinderPath _finderPathFetchByMobileNo;
	private FinderPath _finderPathCountByMobileNo;

	/**
	 * Returns the otp where mobileNo = &#63; or throws a <code>NoSuchOTPException</code> if it could not be found.
	 *
	 * @param mobileNo the mobile no
	 * @return the matching otp
	 * @throws NoSuchOTPException if a matching otp could not be found
	 */
	@Override
	public OTP findByMobileNo(String mobileNo) throws NoSuchOTPException {
		OTP otp = fetchByMobileNo(mobileNo);

		if (otp == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("mobileNo=");
			sb.append(mobileNo);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOTPException(sb.toString());
		}

		return otp;
	}

	/**
	 * Returns the otp where mobileNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param mobileNo the mobile no
	 * @return the matching otp, or <code>null</code> if a matching otp could not be found
	 */
	@Override
	public OTP fetchByMobileNo(String mobileNo) {
		return fetchByMobileNo(mobileNo, true);
	}

	/**
	 * Returns the otp where mobileNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param mobileNo the mobile no
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching otp, or <code>null</code> if a matching otp could not be found
	 */
	@Override
	public OTP fetchByMobileNo(String mobileNo, boolean useFinderCache) {
		mobileNo = Objects.toString(mobileNo, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {mobileNo};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByMobileNo, finderArgs, this);
		}

		if (result instanceof OTP) {
			OTP otp = (OTP)result;

			if (!Objects.equals(mobileNo, otp.getMobileNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OTP_WHERE);

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

				List<OTP> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByMobileNo, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {mobileNo};
							}

							_log.warn(
								"OTPPersistenceImpl.fetchByMobileNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OTP otp = list.get(0);

					result = otp;

					cacheResult(otp);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByMobileNo, finderArgs);
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
			return (OTP)result;
		}
	}

	/**
	 * Removes the otp where mobileNo = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 * @return the otp that was removed
	 */
	@Override
	public OTP removeByMobileNo(String mobileNo) throws NoSuchOTPException {
		OTP otp = findByMobileNo(mobileNo);

		return remove(otp);
	}

	/**
	 * Returns the number of otps where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the number of matching otps
	 */
	@Override
	public int countByMobileNo(String mobileNo) {
		mobileNo = Objects.toString(mobileNo, "");

		FinderPath finderPath = _finderPathCountByMobileNo;

		Object[] finderArgs = new Object[] {mobileNo};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OTP_WHERE);

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
		"otp.mobileNo = ?";

	private static final String _FINDER_COLUMN_MOBILENO_MOBILENO_3 =
		"(otp.mobileNo IS NULL OR otp.mobileNo = '')";

	private FinderPath _finderPathWithPaginationFindByEmailId;
	private FinderPath _finderPathWithoutPaginationFindByEmailId;
	private FinderPath _finderPathCountByEmailId;

	/**
	 * Returns all the otps where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @return the matching otps
	 */
	@Override
	public List<OTP> findByEmailId(String emailId) {
		return findByEmailId(
			emailId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the otps where emailId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param emailId the email ID
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @return the range of matching otps
	 */
	@Override
	public List<OTP> findByEmailId(String emailId, int start, int end) {
		return findByEmailId(emailId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the otps where emailId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param emailId the email ID
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching otps
	 */
	@Override
	public List<OTP> findByEmailId(
		String emailId, int start, int end,
		OrderByComparator<OTP> orderByComparator) {

		return findByEmailId(emailId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the otps where emailId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param emailId the email ID
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching otps
	 */
	@Override
	public List<OTP> findByEmailId(
		String emailId, int start, int end,
		OrderByComparator<OTP> orderByComparator, boolean useFinderCache) {

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

		List<OTP> list = null;

		if (useFinderCache) {
			list = (List<OTP>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OTP otp : list) {
					if (!emailId.equals(otp.getEmailId())) {
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

			sb.append(_SQL_SELECT_OTP_WHERE);

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
				sb.append(OTPModelImpl.ORDER_BY_JPQL);
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

				list = (List<OTP>)QueryUtil.list(
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
	 * Returns the first otp in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching otp
	 * @throws NoSuchOTPException if a matching otp could not be found
	 */
	@Override
	public OTP findByEmailId_First(
			String emailId, OrderByComparator<OTP> orderByComparator)
		throws NoSuchOTPException {

		OTP otp = fetchByEmailId_First(emailId, orderByComparator);

		if (otp != null) {
			return otp;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("emailId=");
		sb.append(emailId);

		sb.append("}");

		throw new NoSuchOTPException(sb.toString());
	}

	/**
	 * Returns the first otp in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching otp, or <code>null</code> if a matching otp could not be found
	 */
	@Override
	public OTP fetchByEmailId_First(
		String emailId, OrderByComparator<OTP> orderByComparator) {

		List<OTP> list = findByEmailId(emailId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last otp in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching otp
	 * @throws NoSuchOTPException if a matching otp could not be found
	 */
	@Override
	public OTP findByEmailId_Last(
			String emailId, OrderByComparator<OTP> orderByComparator)
		throws NoSuchOTPException {

		OTP otp = fetchByEmailId_Last(emailId, orderByComparator);

		if (otp != null) {
			return otp;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("emailId=");
		sb.append(emailId);

		sb.append("}");

		throw new NoSuchOTPException(sb.toString());
	}

	/**
	 * Returns the last otp in the ordered set where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching otp, or <code>null</code> if a matching otp could not be found
	 */
	@Override
	public OTP fetchByEmailId_Last(
		String emailId, OrderByComparator<OTP> orderByComparator) {

		int count = countByEmailId(emailId);

		if (count == 0) {
			return null;
		}

		List<OTP> list = findByEmailId(
			emailId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the otps before and after the current otp in the ordered set where emailId = &#63;.
	 *
	 * @param otpId the primary key of the current otp
	 * @param emailId the email ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next otp
	 * @throws NoSuchOTPException if a otp with the primary key could not be found
	 */
	@Override
	public OTP[] findByEmailId_PrevAndNext(
			long otpId, String emailId,
			OrderByComparator<OTP> orderByComparator)
		throws NoSuchOTPException {

		emailId = Objects.toString(emailId, "");

		OTP otp = findByPrimaryKey(otpId);

		Session session = null;

		try {
			session = openSession();

			OTP[] array = new OTPImpl[3];

			array[0] = getByEmailId_PrevAndNext(
				session, otp, emailId, orderByComparator, true);

			array[1] = otp;

			array[2] = getByEmailId_PrevAndNext(
				session, otp, emailId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OTP getByEmailId_PrevAndNext(
		Session session, OTP otp, String emailId,
		OrderByComparator<OTP> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OTP_WHERE);

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
			sb.append(OTPModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(otp)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OTP> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the otps where emailId = &#63; from the database.
	 *
	 * @param emailId the email ID
	 */
	@Override
	public void removeByEmailId(String emailId) {
		for (OTP otp :
				findByEmailId(
					emailId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(otp);
		}
	}

	/**
	 * Returns the number of otps where emailId = &#63;.
	 *
	 * @param emailId the email ID
	 * @return the number of matching otps
	 */
	@Override
	public int countByEmailId(String emailId) {
		emailId = Objects.toString(emailId, "");

		FinderPath finderPath = _finderPathCountByEmailId;

		Object[] finderArgs = new Object[] {emailId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OTP_WHERE);

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
		"otp.emailId = ?";

	private static final String _FINDER_COLUMN_EMAILID_EMAILID_3 =
		"(otp.emailId IS NULL OR otp.emailId = '')";

	public OTPPersistenceImpl() {
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

		setModelClass(OTP.class);
	}

	/**
	 * Caches the otp in the entity cache if it is enabled.
	 *
	 * @param otp the otp
	 */
	@Override
	public void cacheResult(OTP otp) {
		entityCache.putResult(
			OTPModelImpl.ENTITY_CACHE_ENABLED, OTPImpl.class,
			otp.getPrimaryKey(), otp);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {otp.getUuid(), otp.getGroupId()}, otp);

		finderCache.putResult(
			_finderPathFetchByMobileNo, new Object[] {otp.getMobileNo()}, otp);

		otp.resetOriginalValues();
	}

	/**
	 * Caches the otps in the entity cache if it is enabled.
	 *
	 * @param otps the otps
	 */
	@Override
	public void cacheResult(List<OTP> otps) {
		for (OTP otp : otps) {
			if (entityCache.getResult(
					OTPModelImpl.ENTITY_CACHE_ENABLED, OTPImpl.class,
					otp.getPrimaryKey()) == null) {

				cacheResult(otp);
			}
			else {
				otp.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all otps.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OTPImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the otp.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OTP otp) {
		entityCache.removeResult(
			OTPModelImpl.ENTITY_CACHE_ENABLED, OTPImpl.class,
			otp.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((OTPModelImpl)otp, true);
	}

	@Override
	public void clearCache(List<OTP> otps) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OTP otp : otps) {
			entityCache.removeResult(
				OTPModelImpl.ENTITY_CACHE_ENABLED, OTPImpl.class,
				otp.getPrimaryKey());

			clearUniqueFindersCache((OTPModelImpl)otp, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OTPModelImpl.ENTITY_CACHE_ENABLED, OTPImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(OTPModelImpl otpModelImpl) {
		Object[] args = new Object[] {
			otpModelImpl.getUuid(), otpModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, otpModelImpl, false);

		args = new Object[] {otpModelImpl.getMobileNo()};

		finderCache.putResult(
			_finderPathCountByMobileNo, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByMobileNo, args, otpModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		OTPModelImpl otpModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				otpModelImpl.getUuid(), otpModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((otpModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				otpModelImpl.getOriginalUuid(),
				otpModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {otpModelImpl.getMobileNo()};

			finderCache.removeResult(_finderPathCountByMobileNo, args);
			finderCache.removeResult(_finderPathFetchByMobileNo, args);
		}

		if ((otpModelImpl.getColumnBitmask() &
			 _finderPathFetchByMobileNo.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {otpModelImpl.getOriginalMobileNo()};

			finderCache.removeResult(_finderPathCountByMobileNo, args);
			finderCache.removeResult(_finderPathFetchByMobileNo, args);
		}
	}

	/**
	 * Creates a new otp with the primary key. Does not add the otp to the database.
	 *
	 * @param otpId the primary key for the new otp
	 * @return the new otp
	 */
	@Override
	public OTP create(long otpId) {
		OTP otp = new OTPImpl();

		otp.setNew(true);
		otp.setPrimaryKey(otpId);

		String uuid = PortalUUIDUtil.generate();

		otp.setUuid(uuid);

		otp.setCompanyId(CompanyThreadLocal.getCompanyId());

		return otp;
	}

	/**
	 * Removes the otp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param otpId the primary key of the otp
	 * @return the otp that was removed
	 * @throws NoSuchOTPException if a otp with the primary key could not be found
	 */
	@Override
	public OTP remove(long otpId) throws NoSuchOTPException {
		return remove((Serializable)otpId);
	}

	/**
	 * Removes the otp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the otp
	 * @return the otp that was removed
	 * @throws NoSuchOTPException if a otp with the primary key could not be found
	 */
	@Override
	public OTP remove(Serializable primaryKey) throws NoSuchOTPException {
		Session session = null;

		try {
			session = openSession();

			OTP otp = (OTP)session.get(OTPImpl.class, primaryKey);

			if (otp == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOTPException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(otp);
		}
		catch (NoSuchOTPException noSuchEntityException) {
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
	protected OTP removeImpl(OTP otp) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(otp)) {
				otp = (OTP)session.get(OTPImpl.class, otp.getPrimaryKeyObj());
			}

			if (otp != null) {
				session.delete(otp);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (otp != null) {
			clearCache(otp);
		}

		return otp;
	}

	@Override
	public OTP updateImpl(OTP otp) {
		boolean isNew = otp.isNew();

		if (!(otp instanceof OTPModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(otp.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(otp);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in otp proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OTP implementation " +
					otp.getClass());
		}

		OTPModelImpl otpModelImpl = (OTPModelImpl)otp;

		if (Validator.isNull(otp.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			otp.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (otp.getCreateDate() == null)) {
			if (serviceContext == null) {
				otp.setCreateDate(now);
			}
			else {
				otp.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!otpModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				otp.setModifiedDate(now);
			}
			else {
				otp.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(otp);

				otp.setNew(false);
			}
			else {
				otp = (OTP)session.merge(otp);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!OTPModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {otpModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				otpModelImpl.getUuid(), otpModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			args = new Object[] {otpModelImpl.getEmailId()};

			finderCache.removeResult(_finderPathCountByEmailId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByEmailId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((otpModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {otpModelImpl.getOriginalUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {otpModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((otpModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					otpModelImpl.getOriginalUuid(),
					otpModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					otpModelImpl.getUuid(), otpModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}

			if ((otpModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByEmailId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					otpModelImpl.getOriginalEmailId()
				};

				finderCache.removeResult(_finderPathCountByEmailId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEmailId, args);

				args = new Object[] {otpModelImpl.getEmailId()};

				finderCache.removeResult(_finderPathCountByEmailId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByEmailId, args);
			}
		}

		entityCache.putResult(
			OTPModelImpl.ENTITY_CACHE_ENABLED, OTPImpl.class,
			otp.getPrimaryKey(), otp, false);

		clearUniqueFindersCache(otpModelImpl, false);
		cacheUniqueFindersCache(otpModelImpl);

		otp.resetOriginalValues();

		return otp;
	}

	/**
	 * Returns the otp with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the otp
	 * @return the otp
	 * @throws NoSuchOTPException if a otp with the primary key could not be found
	 */
	@Override
	public OTP findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOTPException {

		OTP otp = fetchByPrimaryKey(primaryKey);

		if (otp == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOTPException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return otp;
	}

	/**
	 * Returns the otp with the primary key or throws a <code>NoSuchOTPException</code> if it could not be found.
	 *
	 * @param otpId the primary key of the otp
	 * @return the otp
	 * @throws NoSuchOTPException if a otp with the primary key could not be found
	 */
	@Override
	public OTP findByPrimaryKey(long otpId) throws NoSuchOTPException {
		return findByPrimaryKey((Serializable)otpId);
	}

	/**
	 * Returns the otp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the otp
	 * @return the otp, or <code>null</code> if a otp with the primary key could not be found
	 */
	@Override
	public OTP fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			OTPModelImpl.ENTITY_CACHE_ENABLED, OTPImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		OTP otp = (OTP)serializable;

		if (otp == null) {
			Session session = null;

			try {
				session = openSession();

				otp = (OTP)session.get(OTPImpl.class, primaryKey);

				if (otp != null) {
					cacheResult(otp);
				}
				else {
					entityCache.putResult(
						OTPModelImpl.ENTITY_CACHE_ENABLED, OTPImpl.class,
						primaryKey, nullModel);
				}
			}
			catch (Exception exception) {
				entityCache.removeResult(
					OTPModelImpl.ENTITY_CACHE_ENABLED, OTPImpl.class,
					primaryKey);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return otp;
	}

	/**
	 * Returns the otp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param otpId the primary key of the otp
	 * @return the otp, or <code>null</code> if a otp with the primary key could not be found
	 */
	@Override
	public OTP fetchByPrimaryKey(long otpId) {
		return fetchByPrimaryKey((Serializable)otpId);
	}

	@Override
	public Map<Serializable, OTP> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, OTP> map = new HashMap<Serializable, OTP>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			OTP otp = fetchByPrimaryKey(primaryKey);

			if (otp != null) {
				map.put(primaryKey, otp);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				OTPModelImpl.ENTITY_CACHE_ENABLED, OTPImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (OTP)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler sb = new StringBundler(
			(uncachedPrimaryKeys.size() * 2) + 1);

		sb.append(_SQL_SELECT_OTP_WHERE_PKS_IN);

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

			for (OTP otp : (List<OTP>)query.list()) {
				map.put(otp.getPrimaryKeyObj(), otp);

				cacheResult(otp);

				uncachedPrimaryKeys.remove(otp.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					OTPModelImpl.ENTITY_CACHE_ENABLED, OTPImpl.class,
					primaryKey, nullModel);
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
	 * Returns all the otps.
	 *
	 * @return the otps
	 */
	@Override
	public List<OTP> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the otps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @return the range of otps
	 */
	@Override
	public List<OTP> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the otps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of otps
	 */
	@Override
	public List<OTP> findAll(
		int start, int end, OrderByComparator<OTP> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the otps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OTPModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of otps
	 */
	@Override
	public List<OTP> findAll(
		int start, int end, OrderByComparator<OTP> orderByComparator,
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

		List<OTP> list = null;

		if (useFinderCache) {
			list = (List<OTP>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OTP);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OTP;

				sql = sql.concat(OTPModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OTP>)QueryUtil.list(
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
	 * Removes all the otps from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OTP otp : findAll()) {
			remove(otp);
		}
	}

	/**
	 * Returns the number of otps.
	 *
	 * @return the number of otps
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OTP);

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
		return OTPModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the otp persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, OTPImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, OTPImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, OTPImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, OTPImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()},
			OTPModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, OTPImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			OTPModelImpl.UUID_COLUMN_BITMASK |
			OTPModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, OTPImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, OTPImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			OTPModelImpl.UUID_COLUMN_BITMASK |
			OTPModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathFetchByMobileNo = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, OTPImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByMobileNo",
			new String[] {String.class.getName()},
			OTPModelImpl.MOBILENO_COLUMN_BITMASK);

		_finderPathCountByMobileNo = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMobileNo",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByEmailId = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, OTPImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEmailId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByEmailId = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, OTPImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmailId",
			new String[] {String.class.getName()},
			OTPModelImpl.EMAILID_COLUMN_BITMASK);

		_finderPathCountByEmailId = new FinderPath(
			OTPModelImpl.ENTITY_CACHE_ENABLED,
			OTPModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmailId",
			new String[] {String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(OTPImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OTP = "SELECT otp FROM OTP otp";

	private static final String _SQL_SELECT_OTP_WHERE_PKS_IN =
		"SELECT otp FROM OTP otp WHERE otpId IN (";

	private static final String _SQL_SELECT_OTP_WHERE =
		"SELECT otp FROM OTP otp WHERE ";

	private static final String _SQL_COUNT_OTP =
		"SELECT COUNT(otp) FROM OTP otp";

	private static final String _SQL_COUNT_OTP_WHERE =
		"SELECT COUNT(otp) FROM OTP otp WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "otp.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OTP exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OTP exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OTPPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}