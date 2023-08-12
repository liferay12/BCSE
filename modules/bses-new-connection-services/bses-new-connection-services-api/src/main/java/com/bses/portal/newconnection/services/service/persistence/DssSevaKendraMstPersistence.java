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

package com.bses.portal.newconnection.services.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.bses.portal.newconnection.services.exception.NoSuchDssSevaKendraMstException;
import com.bses.portal.newconnection.services.model.DssSevaKendraMst;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the dss seva kendra mst service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DssSevaKendraMstUtil
 * @generated
 */
@ProviderType
public interface DssSevaKendraMstPersistence
	extends BasePersistence<DssSevaKendraMst> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DssSevaKendraMstUtil} to access the dss seva kendra mst persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, DssSevaKendraMst> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns the dss seva kendra mst where district = &#63; and name = &#63; or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the matching dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a matching dss seva kendra mst could not be found
	 */
	public DssSevaKendraMst findByByDistrictAndName(
			String district, String name)
		throws NoSuchDssSevaKendraMstException;

	/**
	 * Returns the dss seva kendra mst where district = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public DssSevaKendraMst fetchByByDistrictAndName(
		String district, String name);

	/**
	 * Returns the dss seva kendra mst where district = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param district the district
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public DssSevaKendraMst fetchByByDistrictAndName(
		String district, String name, boolean useFinderCache);

	/**
	 * Removes the dss seva kendra mst where district = &#63; and name = &#63; from the database.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the dss seva kendra mst that was removed
	 */
	public DssSevaKendraMst removeByByDistrictAndName(
			String district, String name)
		throws NoSuchDssSevaKendraMstException;

	/**
	 * Returns the number of dss seva kendra msts where district = &#63; and name = &#63;.
	 *
	 * @param district the district
	 * @param name the name
	 * @return the number of matching dss seva kendra msts
	 */
	public int countByByDistrictAndName(String district, String name);

	/**
	 * Returns the dss seva kendra mst where district = &#63; or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param district the district
	 * @return the matching dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a matching dss seva kendra mst could not be found
	 */
	public DssSevaKendraMst findByByDistrict(String district)
		throws NoSuchDssSevaKendraMstException;

	/**
	 * Returns the dss seva kendra mst where district = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param district the district
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public DssSevaKendraMst fetchByByDistrict(String district);

	/**
	 * Returns the dss seva kendra mst where district = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param district the district
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public DssSevaKendraMst fetchByByDistrict(
		String district, boolean useFinderCache);

	/**
	 * Removes the dss seva kendra mst where district = &#63; from the database.
	 *
	 * @param district the district
	 * @return the dss seva kendra mst that was removed
	 */
	public DssSevaKendraMst removeByByDistrict(String district)
		throws NoSuchDssSevaKendraMstException;

	/**
	 * Returns the number of dss seva kendra msts where district = &#63;.
	 *
	 * @param district the district
	 * @return the number of matching dss seva kendra msts
	 */
	public int countByByDistrict(String district);

	/**
	 * Returns the dss seva kendra mst where name = &#63; or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param name the name
	 * @return the matching dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a matching dss seva kendra mst could not be found
	 */
	public DssSevaKendraMst findByByName(String name)
		throws NoSuchDssSevaKendraMstException;

	/**
	 * Returns the dss seva kendra mst where name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param name the name
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public DssSevaKendraMst fetchByByName(String name);

	/**
	 * Returns the dss seva kendra mst where name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dss seva kendra mst, or <code>null</code> if a matching dss seva kendra mst could not be found
	 */
	public DssSevaKendraMst fetchByByName(String name, boolean useFinderCache);

	/**
	 * Removes the dss seva kendra mst where name = &#63; from the database.
	 *
	 * @param name the name
	 * @return the dss seva kendra mst that was removed
	 */
	public DssSevaKendraMst removeByByName(String name)
		throws NoSuchDssSevaKendraMstException;

	/**
	 * Returns the number of dss seva kendra msts where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching dss seva kendra msts
	 */
	public int countByByName(String name);

	/**
	 * Caches the dss seva kendra mst in the entity cache if it is enabled.
	 *
	 * @param dssSevaKendraMst the dss seva kendra mst
	 */
	public void cacheResult(DssSevaKendraMst dssSevaKendraMst);

	/**
	 * Caches the dss seva kendra msts in the entity cache if it is enabled.
	 *
	 * @param dssSevaKendraMsts the dss seva kendra msts
	 */
	public void cacheResult(java.util.List<DssSevaKendraMst> dssSevaKendraMsts);

	/**
	 * Creates a new dss seva kendra mst with the primary key. Does not add the dss seva kendra mst to the database.
	 *
	 * @param dssSevaKendraMstPK the primary key for the new dss seva kendra mst
	 * @return the new dss seva kendra mst
	 */
	public DssSevaKendraMst create(DssSevaKendraMstPK dssSevaKendraMstPK);

	/**
	 * Removes the dss seva kendra mst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst that was removed
	 * @throws NoSuchDssSevaKendraMstException if a dss seva kendra mst with the primary key could not be found
	 */
	public DssSevaKendraMst remove(DssSevaKendraMstPK dssSevaKendraMstPK)
		throws NoSuchDssSevaKendraMstException;

	public DssSevaKendraMst updateImpl(DssSevaKendraMst dssSevaKendraMst);

	/**
	 * Returns the dss seva kendra mst with the primary key or throws a <code>NoSuchDssSevaKendraMstException</code> if it could not be found.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst
	 * @throws NoSuchDssSevaKendraMstException if a dss seva kendra mst with the primary key could not be found
	 */
	public DssSevaKendraMst findByPrimaryKey(
			DssSevaKendraMstPK dssSevaKendraMstPK)
		throws NoSuchDssSevaKendraMstException;

	/**
	 * Returns the dss seva kendra mst with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst, or <code>null</code> if a dss seva kendra mst with the primary key could not be found
	 */
	public DssSevaKendraMst fetchByPrimaryKey(
		DssSevaKendraMstPK dssSevaKendraMstPK);

	/**
	 * Returns all the dss seva kendra msts.
	 *
	 * @return the dss seva kendra msts
	 */
	public java.util.List<DssSevaKendraMst> findAll();

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
	public java.util.List<DssSevaKendraMst> findAll(int start, int end);

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
	public java.util.List<DssSevaKendraMst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DssSevaKendraMst>
			orderByComparator);

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
	public java.util.List<DssSevaKendraMst> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DssSevaKendraMst>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dss seva kendra msts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of dss seva kendra msts.
	 *
	 * @return the number of dss seva kendra msts
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

	public Set<String> getCompoundPKColumnNames();

}