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

package com.bses.portal.newconnection.services.service.persistence.impl;

import com.bses.portal.newconnection.services.exception.NoSuchDssSevaKendraMstException;
import com.bses.portal.newconnection.services.model.DssSevaKendraMst;
import com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstImpl;
import com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstModelImpl;
import com.bses.portal.newconnection.services.service.persistence.DssSevaKendraMstPK;
import com.bses.portal.newconnection.services.service.persistence.DssSevaKendraMstPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the dss seva kendra mst service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DssSevaKendraMstPersistenceImpl
	extends BasePersistenceImpl<DssSevaKendraMst>
	implements DssSevaKendraMstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DssSevaKendraMstUtil</code> to access the dss seva kendra mst persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DssSevaKendraMstImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchByByDistrictAndName;
	private FinderPath _finderPathCountByByDistrictAndName;

	/**
	 * Returns the dss seva kendra mst where district = &#63; and name = &#63; or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the matching dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a matching dss seva kendra mst could not be found
	 */
	@Override
	public DssSevaKendraMst findByByDistrictAndName(
			String district, String name)
		throws NoSuchDssSevaKendraMstException {

		DssSevaKendraMst dssSevaKendraMst = fetchByByDistrictAndName(
			district, name);

		if (dssSevaKendraMst == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("district=");
			sb.append(district);

			sb.append(", name=");
			sb.append(name);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDssSevaKendraMstException(sb.toString());
		}

		return dssSevaKendraMst;
	}

	/**
	 * Returns the dss seva kendra mst where district = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	@Override
	public DssSevaKendraMst fetchByByDistrictAndName(
		String district, String name) {

		return fetchByByDistrictAndName(district, name, true);
	}

	/**
	 * Returns the dss seva kendra mst where district = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param district the district
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	@Override
	public DssSevaKendraMst fetchByByDistrictAndName(
		String district, String name, boolean useFinderCache) {

		district = Objects.toString(district, "");
		name = Objects.toString(name, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {district, name};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByByDistrictAndName, finderArgs, this);
		}

		if (result instanceof DssSevaKendraMst) {
			DssSevaKendraMst dssSevaKendraMst = (DssSevaKendraMst)result;

			if (!Objects.equals(district, dssSevaKendraMst.getDistrict()) ||
				!Objects.equals(name, dssSevaKendraMst.getName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_DSSSEVAKENDRAMST_WHERE);

			boolean bindDistrict = false;

			if (district.isEmpty()) {
				sb.append(_FINDER_COLUMN_BYDISTRICTANDNAME_DISTRICT_3);
			}
			else {
				bindDistrict = true;

				sb.append(_FINDER_COLUMN_BYDISTRICTANDNAME_DISTRICT_2);
			}

			boolean bindName = false;

			if (name.isEmpty()) {
				sb.append(_FINDER_COLUMN_BYDISTRICTANDNAME_NAME_3);
			}
			else {
				bindName = true;

				sb.append(_FINDER_COLUMN_BYDISTRICTANDNAME_NAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDistrict) {
					queryPos.add(district);
				}

				if (bindName) {
					queryPos.add(name);
				}

				List<DssSevaKendraMst> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByByDistrictAndName, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {district, name};
							}

							_log.warn(
								"DssSevaKendraMstPersistenceImpl.fetchByByDistrictAndName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DssSevaKendraMst dssSevaKendraMst = list.get(0);

					result = dssSevaKendraMst;

					cacheResult(dssSevaKendraMst);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByByDistrictAndName, finderArgs);
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
			return (DssSevaKendraMst)result;
		}
	}

	/**
	 * Removes the dss seva kendra mst where district = &#63; and name = &#63; from the database.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the dss seva kendra mst that was removed
	 */
	@Override
	public DssSevaKendraMst removeByByDistrictAndName(
			String district, String name)
		throws NoSuchDssSevaKendraMstException {

		DssSevaKendraMst dssSevaKendraMst = findByByDistrictAndName(
			district, name);

		return remove(dssSevaKendraMst);
	}

	/**
	 * Returns the number of dss seva kendra msts where district = &#63; and name = &#63;.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the number of matching dss seva kendra msts
	 */
	@Override
	public int countByByDistrictAndName(String district, String name) {
		district = Objects.toString(district, "");
		name = Objects.toString(name, "");

		FinderPath finderPath = _finderPathCountByByDistrictAndName;

		Object[] finderArgs = new Object[] {district, name};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DSSSEVAKENDRAMST_WHERE);

			boolean bindDistrict = false;

			if (district.isEmpty()) {
				sb.append(_FINDER_COLUMN_BYDISTRICTANDNAME_DISTRICT_3);
			}
			else {
				bindDistrict = true;

				sb.append(_FINDER_COLUMN_BYDISTRICTANDNAME_DISTRICT_2);
			}

			boolean bindName = false;

			if (name.isEmpty()) {
				sb.append(_FINDER_COLUMN_BYDISTRICTANDNAME_NAME_3);
			}
			else {
				bindName = true;

				sb.append(_FINDER_COLUMN_BYDISTRICTANDNAME_NAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDistrict) {
					queryPos.add(district);
				}

				if (bindName) {
					queryPos.add(name);
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

	private static final String _FINDER_COLUMN_BYDISTRICTANDNAME_DISTRICT_2 =
		"dssSevaKendraMst.id.district = ? AND ";

	private static final String _FINDER_COLUMN_BYDISTRICTANDNAME_DISTRICT_3 =
		"(dssSevaKendraMst.id.district IS NULL OR dssSevaKendraMst.id.district = '') AND ";

	private static final String _FINDER_COLUMN_BYDISTRICTANDNAME_NAME_2 =
		"dssSevaKendraMst.name = ?";

	private static final String _FINDER_COLUMN_BYDISTRICTANDNAME_NAME_3 =
		"(dssSevaKendraMst.name IS NULL OR dssSevaKendraMst.name = '')";

	private FinderPath _finderPathFetchByByDistrict;
	private FinderPath _finderPathCountByByDistrict;

	/**
	 * Returns the dss seva kendra mst where district = &#63; or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param district the district
	 * @return the matching dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a matching dss seva kendra mst could not be found
	 */
	@Override
	public DssSevaKendraMst findByByDistrict(String district)
		throws NoSuchDssSevaKendraMstException {

		DssSevaKendraMst dssSevaKendraMst = fetchByByDistrict(district);

		if (dssSevaKendraMst == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("district=");
			sb.append(district);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDssSevaKendraMstException(sb.toString());
		}

		return dssSevaKendraMst;
	}

	/**
	 * Returns the dss seva kendra mst where district = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param district the district
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	@Override
	public DssSevaKendraMst fetchByByDistrict(String district) {
		return fetchByByDistrict(district, true);
	}

	/**
	 * Returns the dss seva kendra mst where district = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param district the district
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	@Override
	public DssSevaKendraMst fetchByByDistrict(
		String district, boolean useFinderCache) {

		district = Objects.toString(district, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {district};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByByDistrict, finderArgs, this);
		}

		if (result instanceof DssSevaKendraMst) {
			DssSevaKendraMst dssSevaKendraMst = (DssSevaKendraMst)result;

			if (!Objects.equals(district, dssSevaKendraMst.getDistrict())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_DSSSEVAKENDRAMST_WHERE);

			boolean bindDistrict = false;

			if (district.isEmpty()) {
				sb.append(_FINDER_COLUMN_BYDISTRICT_DISTRICT_3);
			}
			else {
				bindDistrict = true;

				sb.append(_FINDER_COLUMN_BYDISTRICT_DISTRICT_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDistrict) {
					queryPos.add(district);
				}

				List<DssSevaKendraMst> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByByDistrict, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {district};
							}

							_log.warn(
								"DssSevaKendraMstPersistenceImpl.fetchByByDistrict(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DssSevaKendraMst dssSevaKendraMst = list.get(0);

					result = dssSevaKendraMst;

					cacheResult(dssSevaKendraMst);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByByDistrict, finderArgs);
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
			return (DssSevaKendraMst)result;
		}
	}

	/**
	 * Removes the dss seva kendra mst where district = &#63; from the database.
	 *
	 * @param district the district
	 * @return the dss seva kendra mst that was removed
	 */
	@Override
	public DssSevaKendraMst removeByByDistrict(String district)
		throws NoSuchDssSevaKendraMstException {

		DssSevaKendraMst dssSevaKendraMst = findByByDistrict(district);

		return remove(dssSevaKendraMst);
	}

	/**
	 * Returns the number of dss seva kendra msts where district = &#63;.
	 *
	 * @param district the district
	 * @return the number of matching dss seva kendra msts
	 */
	@Override
	public int countByByDistrict(String district) {
		district = Objects.toString(district, "");

		FinderPath finderPath = _finderPathCountByByDistrict;

		Object[] finderArgs = new Object[] {district};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DSSSEVAKENDRAMST_WHERE);

			boolean bindDistrict = false;

			if (district.isEmpty()) {
				sb.append(_FINDER_COLUMN_BYDISTRICT_DISTRICT_3);
			}
			else {
				bindDistrict = true;

				sb.append(_FINDER_COLUMN_BYDISTRICT_DISTRICT_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDistrict) {
					queryPos.add(district);
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

	private static final String _FINDER_COLUMN_BYDISTRICT_DISTRICT_2 =
		"dssSevaKendraMst.id.district = ?";

	private static final String _FINDER_COLUMN_BYDISTRICT_DISTRICT_3 =
		"(dssSevaKendraMst.id.district IS NULL OR dssSevaKendraMst.id.district = '')";

	private FinderPath _finderPathFetchByByName;
	private FinderPath _finderPathCountByByName;

	/**
	 * Returns the dss seva kendra mst where name = &#63; or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a matching dss seva kendra mst could not be found
	 */
	@Override
	public DssSevaKendraMst findByByName(String name)
		throws NoSuchDssSevaKendraMstException {

		DssSevaKendraMst dssSevaKendraMst = fetchByByName(name);

		if (dssSevaKendraMst == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("name=");
			sb.append(name);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDssSevaKendraMstException(sb.toString());
		}

		return dssSevaKendraMst;
	}

	/**
	 * Returns the dss seva kendra mst where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	@Override
	public DssSevaKendraMst fetchByByName(String name) {
		return fetchByByName(name, true);
	}

	/**
	 * Returns the dss seva kendra mst where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	@Override
	public DssSevaKendraMst fetchByByName(String name, boolean useFinderCache) {
		name = Objects.toString(name, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {name};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByByName, finderArgs, this);
		}

		if (result instanceof DssSevaKendraMst) {
			DssSevaKendraMst dssSevaKendraMst = (DssSevaKendraMst)result;

			if (!Objects.equals(name, dssSevaKendraMst.getName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_DSSSEVAKENDRAMST_WHERE);

			boolean bindName = false;

			if (name.isEmpty()) {
				sb.append(_FINDER_COLUMN_BYNAME_NAME_3);
			}
			else {
				bindName = true;

				sb.append(_FINDER_COLUMN_BYNAME_NAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindName) {
					queryPos.add(name);
				}

				List<DssSevaKendraMst> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByByName, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {name};
							}

							_log.warn(
								"DssSevaKendraMstPersistenceImpl.fetchByByName(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DssSevaKendraMst dssSevaKendraMst = list.get(0);

					result = dssSevaKendraMst;

					cacheResult(dssSevaKendraMst);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByByName, finderArgs);
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
			return (DssSevaKendraMst)result;
		}
	}

	/**
	 * Removes the dss seva kendra mst where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the dss seva kendra mst that was removed
	 */
	@Override
	public DssSevaKendraMst removeByByName(String name)
		throws NoSuchDssSevaKendraMstException {

		DssSevaKendraMst dssSevaKendraMst = findByByName(name);

		return remove(dssSevaKendraMst);
	}

	/**
	 * Returns the number of dss seva kendra msts where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching dss seva kendra msts
	 */
	@Override
	public int countByByName(String name) {
		name = Objects.toString(name, "");

		FinderPath finderPath = _finderPathCountByByName;

		Object[] finderArgs = new Object[] {name};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DSSSEVAKENDRAMST_WHERE);

			boolean bindName = false;

			if (name.isEmpty()) {
				sb.append(_FINDER_COLUMN_BYNAME_NAME_3);
			}
			else {
				bindName = true;

				sb.append(_FINDER_COLUMN_BYNAME_NAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindName) {
					queryPos.add(name);
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

	private static final String _FINDER_COLUMN_BYNAME_NAME_2 =
		"dssSevaKendraMst.name = ?";

	private static final String _FINDER_COLUMN_BYNAME_NAME_3 =
		"(dssSevaKendraMst.name IS NULL OR dssSevaKendraMst.name = '')";

	public DssSevaKendraMstPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("district", "DISTRICT");
		dbColumnNames.put("skAddrP2", "SK_ADDRESS_P2");
		dbColumnNames.put("active", "ACTIVE");
		dbColumnNames.put("entryDate", "ENTRY_DATE");
		dbColumnNames.put("dcMachineIp", "DC_MACHINEIP");
		dbColumnNames.put("skAddressP1", "SK_ADDRESS_P1");
		dbColumnNames.put("telephoneNo", "TELEPHONE_NO");
		dbColumnNames.put("name", "NAME");
		dbColumnNames.put("appoitnmentDaysInterval", "APOINTMENT_DAYSINTERVAL");
		dbColumnNames.put("appslotcount", "APP_SLOT_CNT");
		dbColumnNames.put("gpslink", "GPS_LINK");
		dbColumnNames.put("youtubelinkenglish", "YOU_TUBE_ENGLISH");
		dbColumnNames.put("youtubelinkhindi", "YOU_TUBE_HINDI");
		dbColumnNames.put("dskManager", "DSKMANAGER");
		dbColumnNames.put("dskManagerContactNo", "DSKMANAGERCONTACTNO");
		dbColumnNames.put("dskTeleCallerNo", "DSKTELECALLERNO");
		dbColumnNames.put("dskManagerEmailId", "DSKMANAGEREMAILID");
		dbColumnNames.put("businessManager", "BUSINESSMANAGER");
		dbColumnNames.put(
			"businessManagerContactNo", "BUSINESSMANAGERCONTACTNO");
		dbColumnNames.put("businessManagerEmailId", "BUSINESSMANAGEREMAILID");
		dbColumnNames.put("amps", "AMPS");
		dbColumnNames.put("ampsContactNo", "AMPSCONTACTNO");
		dbColumnNames.put("ampsEmailId", "AMPSEMAILID");
		dbColumnNames.put("businessAddress", "BUSINESSADDRESS");

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

		setModelClass(DssSevaKendraMst.class);
	}

	/**
	 * Caches the dss seva kendra mst in the entity cache if it is enabled.
	 *
	 * @param dssSevaKendraMst the dss seva kendra mst
	 */
	@Override
	public void cacheResult(DssSevaKendraMst dssSevaKendraMst) {
		entityCache.putResult(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstImpl.class, dssSevaKendraMst.getPrimaryKey(),
			dssSevaKendraMst);

		finderCache.putResult(
			_finderPathFetchByByDistrictAndName,
			new Object[] {
				dssSevaKendraMst.getDistrict(), dssSevaKendraMst.getName()
			},
			dssSevaKendraMst);

		finderCache.putResult(
			_finderPathFetchByByDistrict,
			new Object[] {dssSevaKendraMst.getDistrict()}, dssSevaKendraMst);

		finderCache.putResult(
			_finderPathFetchByByName, new Object[] {dssSevaKendraMst.getName()},
			dssSevaKendraMst);

		dssSevaKendraMst.resetOriginalValues();
	}

	/**
	 * Caches the dss seva kendra msts in the entity cache if it is enabled.
	 *
	 * @param dssSevaKendraMsts the dss seva kendra msts
	 */
	@Override
	public void cacheResult(List<DssSevaKendraMst> dssSevaKendraMsts) {
		for (DssSevaKendraMst dssSevaKendraMst : dssSevaKendraMsts) {
			if (entityCache.getResult(
					DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
					DssSevaKendraMstImpl.class,
					dssSevaKendraMst.getPrimaryKey()) == null) {

				cacheResult(dssSevaKendraMst);
			}
			else {
				dssSevaKendraMst.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dss seva kendra msts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DssSevaKendraMstImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dss seva kendra mst.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DssSevaKendraMst dssSevaKendraMst) {
		entityCache.removeResult(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstImpl.class, dssSevaKendraMst.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(
			(DssSevaKendraMstModelImpl)dssSevaKendraMst, true);
	}

	@Override
	public void clearCache(List<DssSevaKendraMst> dssSevaKendraMsts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DssSevaKendraMst dssSevaKendraMst : dssSevaKendraMsts) {
			entityCache.removeResult(
				DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
				DssSevaKendraMstImpl.class, dssSevaKendraMst.getPrimaryKey());

			clearUniqueFindersCache(
				(DssSevaKendraMstModelImpl)dssSevaKendraMst, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
				DssSevaKendraMstImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DssSevaKendraMstModelImpl dssSevaKendraMstModelImpl) {

		Object[] args = new Object[] {
			dssSevaKendraMstModelImpl.getDistrict(),
			dssSevaKendraMstModelImpl.getName()
		};

		finderCache.putResult(
			_finderPathCountByByDistrictAndName, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByByDistrictAndName, args,
			dssSevaKendraMstModelImpl, false);

		args = new Object[] {dssSevaKendraMstModelImpl.getDistrict()};

		finderCache.putResult(
			_finderPathCountByByDistrict, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByByDistrict, args, dssSevaKendraMstModelImpl,
			false);

		args = new Object[] {dssSevaKendraMstModelImpl.getName()};

		finderCache.putResult(
			_finderPathCountByByName, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByByName, args, dssSevaKendraMstModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		DssSevaKendraMstModelImpl dssSevaKendraMstModelImpl,
		boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				dssSevaKendraMstModelImpl.getDistrict(),
				dssSevaKendraMstModelImpl.getName()
			};

			finderCache.removeResult(_finderPathCountByByDistrictAndName, args);
			finderCache.removeResult(_finderPathFetchByByDistrictAndName, args);
		}

		if ((dssSevaKendraMstModelImpl.getColumnBitmask() &
			 _finderPathFetchByByDistrictAndName.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				dssSevaKendraMstModelImpl.getOriginalDistrict(),
				dssSevaKendraMstModelImpl.getOriginalName()
			};

			finderCache.removeResult(_finderPathCountByByDistrictAndName, args);
			finderCache.removeResult(_finderPathFetchByByDistrictAndName, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
				dssSevaKendraMstModelImpl.getDistrict()
			};

			finderCache.removeResult(_finderPathCountByByDistrict, args);
			finderCache.removeResult(_finderPathFetchByByDistrict, args);
		}

		if ((dssSevaKendraMstModelImpl.getColumnBitmask() &
			 _finderPathFetchByByDistrict.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				dssSevaKendraMstModelImpl.getOriginalDistrict()
			};

			finderCache.removeResult(_finderPathCountByByDistrict, args);
			finderCache.removeResult(_finderPathFetchByByDistrict, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {dssSevaKendraMstModelImpl.getName()};

			finderCache.removeResult(_finderPathCountByByName, args);
			finderCache.removeResult(_finderPathFetchByByName, args);
		}

		if ((dssSevaKendraMstModelImpl.getColumnBitmask() &
			 _finderPathFetchByByName.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				dssSevaKendraMstModelImpl.getOriginalName()
			};

			finderCache.removeResult(_finderPathCountByByName, args);
			finderCache.removeResult(_finderPathFetchByByName, args);
		}
	}

	/**
	 * Creates a new dss seva kendra mst with the primary key. Does not add the dss seva kendra mst to the database.
	 *
	 * @param dssSevaKendraMstPK the primary key for the new dss seva kendra mst
	 * @return the new dss seva kendra mst
	 */
	@Override
	public DssSevaKendraMst create(DssSevaKendraMstPK dssSevaKendraMstPK) {
		DssSevaKendraMst dssSevaKendraMst = new DssSevaKendraMstImpl();

		dssSevaKendraMst.setNew(true);
		dssSevaKendraMst.setPrimaryKey(dssSevaKendraMstPK);

		return dssSevaKendraMst;
	}

	/**
	 * Removes the dss seva kendra mst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst that was removed
	 * @throws NoSuchDssSevaKendraMstException if a dss seva kendra mst with the primary key could not be found
	 */
	@Override
	public DssSevaKendraMst remove(DssSevaKendraMstPK dssSevaKendraMstPK)
		throws NoSuchDssSevaKendraMstException {

		return remove((Serializable)dssSevaKendraMstPK);
	}

	/**
	 * Removes the dss seva kendra mst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst that was removed
	 * @throws NoSuchDssSevaKendraMstException if a dss seva kendra mst with the primary key could not be found
	 */
	@Override
	public DssSevaKendraMst remove(Serializable primaryKey)
		throws NoSuchDssSevaKendraMstException {

		Session session = null;

		try {
			session = openSession();

			DssSevaKendraMst dssSevaKendraMst = (DssSevaKendraMst)session.get(
				DssSevaKendraMstImpl.class, primaryKey);

			if (dssSevaKendraMst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDssSevaKendraMstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(dssSevaKendraMst);
		}
		catch (NoSuchDssSevaKendraMstException noSuchEntityException) {
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
	protected DssSevaKendraMst removeImpl(DssSevaKendraMst dssSevaKendraMst) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dssSevaKendraMst)) {
				dssSevaKendraMst = (DssSevaKendraMst)session.get(
					DssSevaKendraMstImpl.class,
					dssSevaKendraMst.getPrimaryKeyObj());
			}

			if (dssSevaKendraMst != null) {
				session.delete(dssSevaKendraMst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (dssSevaKendraMst != null) {
			clearCache(dssSevaKendraMst);
		}

		return dssSevaKendraMst;
	}

	@Override
	public DssSevaKendraMst updateImpl(DssSevaKendraMst dssSevaKendraMst) {
		boolean isNew = dssSevaKendraMst.isNew();

		if (!(dssSevaKendraMst instanceof DssSevaKendraMstModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(dssSevaKendraMst.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					dssSevaKendraMst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in dssSevaKendraMst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DssSevaKendraMst implementation " +
					dssSevaKendraMst.getClass());
		}

		DssSevaKendraMstModelImpl dssSevaKendraMstModelImpl =
			(DssSevaKendraMstModelImpl)dssSevaKendraMst;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(dssSevaKendraMst);

				dssSevaKendraMst.setNew(false);
			}
			else {
				dssSevaKendraMst = (DssSevaKendraMst)session.merge(
					dssSevaKendraMst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!DssSevaKendraMstModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstImpl.class, dssSevaKendraMst.getPrimaryKey(),
			dssSevaKendraMst, false);

		clearUniqueFindersCache(dssSevaKendraMstModelImpl, false);
		cacheUniqueFindersCache(dssSevaKendraMstModelImpl);

		dssSevaKendraMst.resetOriginalValues();

		return dssSevaKendraMst;
	}

	/**
	 * Returns the dss seva kendra mst with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a dss seva kendra mst with the primary key could not be found
	 */
	@Override
	public DssSevaKendraMst findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDssSevaKendraMstException {

		DssSevaKendraMst dssSevaKendraMst = fetchByPrimaryKey(primaryKey);

		if (dssSevaKendraMst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDssSevaKendraMstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return dssSevaKendraMst;
	}

	/**
	 * Returns the dss seva kendra mst with the primary key or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a dss seva kendra mst with the primary key could not be found
	 */
	@Override
	public DssSevaKendraMst findByPrimaryKey(
			DssSevaKendraMstPK dssSevaKendraMstPK)
		throws NoSuchDssSevaKendraMstException {

		return findByPrimaryKey((Serializable)dssSevaKendraMstPK);
	}

	/**
	 * Returns the dss seva kendra mst with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst, or <code>null</code> if a dss seva kendra mst with the primary key could not be found
	 */
	@Override
	public DssSevaKendraMst fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DssSevaKendraMst dssSevaKendraMst = (DssSevaKendraMst)serializable;

		if (dssSevaKendraMst == null) {
			Session session = null;

			try {
				session = openSession();

				dssSevaKendraMst = (DssSevaKendraMst)session.get(
					DssSevaKendraMstImpl.class, primaryKey);

				if (dssSevaKendraMst != null) {
					cacheResult(dssSevaKendraMst);
				}
				else {
					entityCache.putResult(
						DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
						DssSevaKendraMstImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception exception) {
				entityCache.removeResult(
					DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
					DssSevaKendraMstImpl.class, primaryKey);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return dssSevaKendraMst;
	}

	/**
	 * Returns the dss seva kendra mst with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst, or <code>null</code> if a dss seva kendra mst with the primary key could not be found
	 */
	@Override
	public DssSevaKendraMst fetchByPrimaryKey(
		DssSevaKendraMstPK dssSevaKendraMstPK) {

		return fetchByPrimaryKey((Serializable)dssSevaKendraMstPK);
	}

	@Override
	public Map<Serializable, DssSevaKendraMst> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DssSevaKendraMst> map =
			new HashMap<Serializable, DssSevaKendraMst>();

		for (Serializable primaryKey : primaryKeys) {
			DssSevaKendraMst dssSevaKendraMst = fetchByPrimaryKey(primaryKey);

			if (dssSevaKendraMst != null) {
				map.put(primaryKey, dssSevaKendraMst);
			}
		}

		return map;
	}

	/**
	 * Returns all the dss seva kendra msts.
	 *
	 * @return the dss seva kendra msts
	 */
	@Override
	public List<DssSevaKendraMst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dss seva kendra msts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DssSevaKendraMstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dss seva kendra msts
	 * @param end the upper bound of the range of dss seva kendra msts (not inclusive)
	 * @return the range of dss seva kendra msts
	 */
	@Override
	public List<DssSevaKendraMst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dss seva kendra msts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DssSevaKendraMstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dss seva kendra msts
	 * @param end the upper bound of the range of dss seva kendra msts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dss seva kendra msts
	 */
	@Override
	public List<DssSevaKendraMst> findAll(
		int start, int end,
		OrderByComparator<DssSevaKendraMst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dss seva kendra msts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DssSevaKendraMstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dss seva kendra msts
	 * @param end the upper bound of the range of dss seva kendra msts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dss seva kendra msts
	 */
	@Override
	public List<DssSevaKendraMst> findAll(
		int start, int end,
		OrderByComparator<DssSevaKendraMst> orderByComparator,
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

		List<DssSevaKendraMst> list = null;

		if (useFinderCache) {
			list = (List<DssSevaKendraMst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DSSSEVAKENDRAMST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DSSSEVAKENDRAMST;

				sql = sql.concat(DssSevaKendraMstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DssSevaKendraMst>)QueryUtil.list(
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
	 * Removes all the dss seva kendra msts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DssSevaKendraMst dssSevaKendraMst : findAll()) {
			remove(dssSevaKendraMst);
		}
	}

	/**
	 * Returns the number of dss seva kendra msts.
	 *
	 * @return the number of dss seva kendra msts
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DSSSEVAKENDRAMST);

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
	public Set<String> getCompoundPKColumnNames() {
		return _compoundPKColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DssSevaKendraMstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dss seva kendra mst persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstModelImpl.FINDER_CACHE_ENABLED,
			DssSevaKendraMstImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstModelImpl.FINDER_CACHE_ENABLED,
			DssSevaKendraMstImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathFetchByByDistrictAndName = new FinderPath(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstModelImpl.FINDER_CACHE_ENABLED,
			DssSevaKendraMstImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByByDistrictAndName",
			new String[] {String.class.getName(), String.class.getName()},
			DssSevaKendraMstModelImpl.DISTRICT_COLUMN_BITMASK |
			DssSevaKendraMstModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByByDistrictAndName = new FinderPath(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByByDistrictAndName",
			new String[] {String.class.getName(), String.class.getName()});

		_finderPathFetchByByDistrict = new FinderPath(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstModelImpl.FINDER_CACHE_ENABLED,
			DssSevaKendraMstImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByByDistrict", new String[] {String.class.getName()},
			DssSevaKendraMstModelImpl.DISTRICT_COLUMN_BITMASK);

		_finderPathCountByByDistrict = new FinderPath(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByByDistrict",
			new String[] {String.class.getName()});

		_finderPathFetchByByName = new FinderPath(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstModelImpl.FINDER_CACHE_ENABLED,
			DssSevaKendraMstImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByByName", new String[] {String.class.getName()},
			DssSevaKendraMstModelImpl.NAME_COLUMN_BITMASK);

		_finderPathCountByByName = new FinderPath(
			DssSevaKendraMstModelImpl.ENTITY_CACHE_ENABLED,
			DssSevaKendraMstModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByByName",
			new String[] {String.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(DssSevaKendraMstImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DSSSEVAKENDRAMST =
		"SELECT dssSevaKendraMst FROM DssSevaKendraMst dssSevaKendraMst";

	private static final String _SQL_SELECT_DSSSEVAKENDRAMST_WHERE =
		"SELECT dssSevaKendraMst FROM DssSevaKendraMst dssSevaKendraMst WHERE ";

	private static final String _SQL_COUNT_DSSSEVAKENDRAMST =
		"SELECT COUNT(dssSevaKendraMst) FROM DssSevaKendraMst dssSevaKendraMst";

	private static final String _SQL_COUNT_DSSSEVAKENDRAMST_WHERE =
		"SELECT COUNT(dssSevaKendraMst) FROM DssSevaKendraMst dssSevaKendraMst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "dssSevaKendraMst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DssSevaKendraMst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DssSevaKendraMst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DssSevaKendraMstPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {
			"district", "skAddrP2", "active", "entryDate", "dcMachineIp",
			"skAddressP1", "telephoneNo", "name", "appoitnmentDaysInterval",
			"appslotcount", "gpslink", "youtubelinkenglish", "youtubelinkhindi",
			"dskManager", "dskManagerContactNo", "dskTeleCallerNo",
			"dskManagerEmailId", "businessManager", "businessManagerContactNo",
			"businessManagerEmailId", "amps", "ampsContactNo", "ampsEmailId",
			"businessAddress"
		});
	private static final Set<String> _compoundPKColumnNames = SetUtil.fromArray(
		new String[] {"district", "skAddrP2"});

}