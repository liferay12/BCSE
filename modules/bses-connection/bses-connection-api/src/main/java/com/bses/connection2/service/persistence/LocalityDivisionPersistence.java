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

import com.bses.connection2.exception.NoSuchLocalityDivisionException;
import com.bses.connection2.model.LocalityDivision;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the locality division service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LocalityDivisionUtil
 * @generated
 */
@ProviderType
public interface LocalityDivisionPersistence
	extends BasePersistence<LocalityDivision> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LocalityDivisionUtil} to access the locality division persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, LocalityDivision> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the locality divisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching locality divisions
	 */
	public java.util.List<LocalityDivision> findByUuid(String uuid);

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
	public java.util.List<LocalityDivision> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<LocalityDivision> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

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
	public java.util.List<LocalityDivision> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the first locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

	/**
	 * Returns the last locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the last locality division in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

	/**
	 * Returns the locality divisions before and after the current locality division in the ordered set where uuid = &#63;.
	 *
	 * @param localityDivisionId the primary key of the current locality division
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public LocalityDivision[] findByUuid_PrevAndNext(
			long localityDivisionId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Removes all the locality divisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of locality divisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching locality divisions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the locality division where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchLocalityDivisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByUUID_G(String uuid, long groupId)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the locality division where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the locality division where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the locality division where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the locality division that was removed
	 */
	public LocalityDivision removeByUUID_G(String uuid, long groupId)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the number of locality divisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching locality divisions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the locality divisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching locality divisions
	 */
	public java.util.List<LocalityDivision> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<LocalityDivision> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<LocalityDivision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

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
	public java.util.List<LocalityDivision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the first locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

	/**
	 * Returns the last locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the last locality division in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

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
	public LocalityDivision[] findByUuid_C_PrevAndNext(
			long localityDivisionId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Removes all the locality divisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of locality divisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching locality divisions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the locality divisions where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @return the matching locality divisions
	 */
	public java.util.List<LocalityDivision> findByLocalityName(
		String localityName);

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
	public java.util.List<LocalityDivision> findByLocalityName(
		String localityName, int start, int end);

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
	public java.util.List<LocalityDivision> findByLocalityName(
		String localityName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

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
	public java.util.List<LocalityDivision> findByLocalityName(
		String localityName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByLocalityName_First(
			String localityName,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the first locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByLocalityName_First(
		String localityName,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

	/**
	 * Returns the last locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByLocalityName_Last(
			String localityName,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the last locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByLocalityName_Last(
		String localityName,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

	/**
	 * Returns the locality divisions before and after the current locality division in the ordered set where localityName = &#63;.
	 *
	 * @param localityDivisionId the primary key of the current locality division
	 * @param localityName the locality name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public LocalityDivision[] findByLocalityName_PrevAndNext(
			long localityDivisionId, String localityName,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Removes all the locality divisions where localityName = &#63; from the database.
	 *
	 * @param localityName the locality name
	 */
	public void removeByLocalityName(String localityName);

	/**
	 * Returns the number of locality divisions where localityName = &#63;.
	 *
	 * @param localityName the locality name
	 * @return the number of matching locality divisions
	 */
	public int countByLocalityName(String localityName);

	/**
	 * Returns all the locality divisions where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @return the matching locality divisions
	 */
	public java.util.List<LocalityDivision> findByDivisionCode(
		String divisionCode);

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
	public java.util.List<LocalityDivision> findByDivisionCode(
		String divisionCode, int start, int end);

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
	public java.util.List<LocalityDivision> findByDivisionCode(
		String divisionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

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
	public java.util.List<LocalityDivision> findByDivisionCode(
		String divisionCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByDivisionCode_First(
			String divisionCode,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the first locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByDivisionCode_First(
		String divisionCode,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

	/**
	 * Returns the last locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByDivisionCode_Last(
			String divisionCode,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the last locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByDivisionCode_Last(
		String divisionCode,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

	/**
	 * Returns the locality divisions before and after the current locality division in the ordered set where divisionCode = &#63;.
	 *
	 * @param localityDivisionId the primary key of the current locality division
	 * @param divisionCode the division code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public LocalityDivision[] findByDivisionCode_PrevAndNext(
			long localityDivisionId, String divisionCode,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Removes all the locality divisions where divisionCode = &#63; from the database.
	 *
	 * @param divisionCode the division code
	 */
	public void removeByDivisionCode(String divisionCode);

	/**
	 * Returns the number of locality divisions where divisionCode = &#63;.
	 *
	 * @param divisionCode the division code
	 * @return the number of matching locality divisions
	 */
	public int countByDivisionCode(String divisionCode);

	/**
	 * Returns all the locality divisions where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @return the matching locality divisions
	 */
	public java.util.List<LocalityDivision> findByDivisionName(
		String divisionName);

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
	public java.util.List<LocalityDivision> findByDivisionName(
		String divisionName, int start, int end);

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
	public java.util.List<LocalityDivision> findByDivisionName(
		String divisionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

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
	public java.util.List<LocalityDivision> findByDivisionName(
		String divisionName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByDivisionName_First(
			String divisionName,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the first locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByDivisionName_First(
		String divisionName,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

	/**
	 * Returns the last locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByDivisionName_Last(
			String divisionName,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the last locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByDivisionName_Last(
		String divisionName,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

	/**
	 * Returns the locality divisions before and after the current locality division in the ordered set where divisionName = &#63;.
	 *
	 * @param localityDivisionId the primary key of the current locality division
	 * @param divisionName the division name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public LocalityDivision[] findByDivisionName_PrevAndNext(
			long localityDivisionId, String divisionName,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Removes all the locality divisions where divisionName = &#63; from the database.
	 *
	 * @param divisionName the division name
	 */
	public void removeByDivisionName(String divisionName);

	/**
	 * Returns the number of locality divisions where divisionName = &#63;.
	 *
	 * @param divisionName the division name
	 * @return the number of matching locality divisions
	 */
	public int countByDivisionName(String divisionName);

	/**
	 * Returns all the locality divisions where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @return the matching locality divisions
	 */
	public java.util.List<LocalityDivision> findByComplaintCenter(
		String complaintCenter);

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
	public java.util.List<LocalityDivision> findByComplaintCenter(
		String complaintCenter, int start, int end);

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
	public java.util.List<LocalityDivision> findByComplaintCenter(
		String complaintCenter, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

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
	public java.util.List<LocalityDivision> findByComplaintCenter(
		String complaintCenter, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByComplaintCenter_First(
			String complaintCenter,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the first locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByComplaintCenter_First(
		String complaintCenter,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

	/**
	 * Returns the last locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division
	 * @throws NoSuchLocalityDivisionException if a matching locality division could not be found
	 */
	public LocalityDivision findByComplaintCenter_Last(
			String complaintCenter,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the last locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching locality division, or <code>null</code> if a matching locality division could not be found
	 */
	public LocalityDivision fetchByComplaintCenter_Last(
		String complaintCenter,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

	/**
	 * Returns the locality divisions before and after the current locality division in the ordered set where complaintCenter = &#63;.
	 *
	 * @param localityDivisionId the primary key of the current locality division
	 * @param complaintCenter the complaint center
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public LocalityDivision[] findByComplaintCenter_PrevAndNext(
			long localityDivisionId, String complaintCenter,
			com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
				orderByComparator)
		throws NoSuchLocalityDivisionException;

	/**
	 * Removes all the locality divisions where complaintCenter = &#63; from the database.
	 *
	 * @param complaintCenter the complaint center
	 */
	public void removeByComplaintCenter(String complaintCenter);

	/**
	 * Returns the number of locality divisions where complaintCenter = &#63;.
	 *
	 * @param complaintCenter the complaint center
	 * @return the number of matching locality divisions
	 */
	public int countByComplaintCenter(String complaintCenter);

	/**
	 * Caches the locality division in the entity cache if it is enabled.
	 *
	 * @param localityDivision the locality division
	 */
	public void cacheResult(LocalityDivision localityDivision);

	/**
	 * Caches the locality divisions in the entity cache if it is enabled.
	 *
	 * @param localityDivisions the locality divisions
	 */
	public void cacheResult(java.util.List<LocalityDivision> localityDivisions);

	/**
	 * Creates a new locality division with the primary key. Does not add the locality division to the database.
	 *
	 * @param localityDivisionId the primary key for the new locality division
	 * @return the new locality division
	 */
	public LocalityDivision create(long localityDivisionId);

	/**
	 * Removes the locality division with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division that was removed
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public LocalityDivision remove(long localityDivisionId)
		throws NoSuchLocalityDivisionException;

	public LocalityDivision updateImpl(LocalityDivision localityDivision);

	/**
	 * Returns the locality division with the primary key or throws a <code>NoSuchLocalityDivisionException</code> if it could not be found.
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division
	 * @throws NoSuchLocalityDivisionException if a locality division with the primary key could not be found
	 */
	public LocalityDivision findByPrimaryKey(long localityDivisionId)
		throws NoSuchLocalityDivisionException;

	/**
	 * Returns the locality division with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param localityDivisionId the primary key of the locality division
	 * @return the locality division, or <code>null</code> if a locality division with the primary key could not be found
	 */
	public LocalityDivision fetchByPrimaryKey(long localityDivisionId);

	/**
	 * Returns all the locality divisions.
	 *
	 * @return the locality divisions
	 */
	public java.util.List<LocalityDivision> findAll();

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
	public java.util.List<LocalityDivision> findAll(int start, int end);

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
	public java.util.List<LocalityDivision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator);

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
	public java.util.List<LocalityDivision> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LocalityDivision>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the locality divisions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of locality divisions.
	 *
	 * @return the number of locality divisions
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}