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

import com.bses.connection2.exception.NoSuchConnectionDocumentException;
import com.bses.connection2.model.ConnectionDocument;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

/**
 * The persistence interface for the connection document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionDocumentUtil
 * @generated
 */
@ProviderType
public interface ConnectionDocumentPersistence
	extends BasePersistence<ConnectionDocument> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConnectionDocumentUtil} to access the connection document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, ConnectionDocument> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the connection documents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching connection documents
	 */
	public java.util.List<ConnectionDocument> findByUuid(String uuid);

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
	public java.util.List<ConnectionDocument> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<ConnectionDocument> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator);

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
	public java.util.List<ConnectionDocument> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public ConnectionDocument findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
				orderByComparator)
		throws NoSuchConnectionDocumentException;

	/**
	 * Returns the first connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public ConnectionDocument fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator);

	/**
	 * Returns the last connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public ConnectionDocument findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
				orderByComparator)
		throws NoSuchConnectionDocumentException;

	/**
	 * Returns the last connection document in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public ConnectionDocument fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator);

	/**
	 * Returns the connection documents before and after the current connection document in the ordered set where uuid = &#63;.
	 *
	 * @param connectionDocumentId the primary key of the current connection document
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection document
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	public ConnectionDocument[] findByUuid_PrevAndNext(
			long connectionDocumentId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
				orderByComparator)
		throws NoSuchConnectionDocumentException;

	/**
	 * Removes all the connection documents where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of connection documents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching connection documents
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the connection document where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchConnectionDocumentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public ConnectionDocument findByUUID_G(String uuid, long groupId)
		throws NoSuchConnectionDocumentException;

	/**
	 * Returns the connection document where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public ConnectionDocument fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the connection document where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public ConnectionDocument fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the connection document where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the connection document that was removed
	 */
	public ConnectionDocument removeByUUID_G(String uuid, long groupId)
		throws NoSuchConnectionDocumentException;

	/**
	 * Returns the number of connection documents where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching connection documents
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the connection documents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching connection documents
	 */
	public java.util.List<ConnectionDocument> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<ConnectionDocument> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<ConnectionDocument> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator);

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
	public java.util.List<ConnectionDocument> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public ConnectionDocument findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
				orderByComparator)
		throws NoSuchConnectionDocumentException;

	/**
	 * Returns the first connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public ConnectionDocument fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator);

	/**
	 * Returns the last connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public ConnectionDocument findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
				orderByComparator)
		throws NoSuchConnectionDocumentException;

	/**
	 * Returns the last connection document in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public ConnectionDocument fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator);

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
	public ConnectionDocument[] findByUuid_C_PrevAndNext(
			long connectionDocumentId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
				orderByComparator)
		throws NoSuchConnectionDocumentException;

	/**
	 * Removes all the connection documents where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of connection documents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching connection documents
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the connection documents where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @return the matching connection documents
	 */
	public java.util.List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId);

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
	public java.util.List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId, int start, int end);

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
	public java.util.List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator);

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
	public java.util.List<ConnectionDocument> findByConnectionRequestId(
		long connectionRequestId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public ConnectionDocument findByConnectionRequestId_First(
			long connectionRequestId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
				orderByComparator)
		throws NoSuchConnectionDocumentException;

	/**
	 * Returns the first connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public ConnectionDocument fetchByConnectionRequestId_First(
		long connectionRequestId,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator);

	/**
	 * Returns the last connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public ConnectionDocument findByConnectionRequestId_Last(
			long connectionRequestId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
				orderByComparator)
		throws NoSuchConnectionDocumentException;

	/**
	 * Returns the last connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public ConnectionDocument fetchByConnectionRequestId_Last(
		long connectionRequestId,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator);

	/**
	 * Returns the connection documents before and after the current connection document in the ordered set where connectionRequestId = &#63;.
	 *
	 * @param connectionDocumentId the primary key of the current connection document
	 * @param connectionRequestId the connection request ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next connection document
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	public ConnectionDocument[] findByConnectionRequestId_PrevAndNext(
			long connectionDocumentId, long connectionRequestId,
			com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
				orderByComparator)
		throws NoSuchConnectionDocumentException;

	/**
	 * Removes all the connection documents where connectionRequestId = &#63; from the database.
	 *
	 * @param connectionRequestId the connection request ID
	 */
	public void removeByConnectionRequestId(long connectionRequestId);

	/**
	 * Returns the number of connection documents where connectionRequestId = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @return the number of matching connection documents
	 */
	public int countByConnectionRequestId(long connectionRequestId);

	/**
	 * Returns the connection document where connectionRequestId = &#63; and documentType = &#63; or throws a <code>NoSuchConnectionDocumentException</code> if it could not be found.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the matching connection document
	 * @throws NoSuchConnectionDocumentException if a matching connection document could not be found
	 */
	public ConnectionDocument findByConnectionRequestIdAndDocumentType(
			long connectionRequestId, String documentType)
		throws NoSuchConnectionDocumentException;

	/**
	 * Returns the connection document where connectionRequestId = &#63; and documentType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public ConnectionDocument fetchByConnectionRequestIdAndDocumentType(
		long connectionRequestId, String documentType);

	/**
	 * Returns the connection document where connectionRequestId = &#63; and documentType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public ConnectionDocument fetchByConnectionRequestIdAndDocumentType(
		long connectionRequestId, String documentType, boolean useFinderCache);

	/**
	 * Removes the connection document where connectionRequestId = &#63; and documentType = &#63; from the database.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the connection document that was removed
	 */
	public ConnectionDocument removeByConnectionRequestIdAndDocumentType(
			long connectionRequestId, String documentType)
		throws NoSuchConnectionDocumentException;

	/**
	 * Returns the number of connection documents where connectionRequestId = &#63; and documentType = &#63;.
	 *
	 * @param connectionRequestId the connection request ID
	 * @param documentType the document type
	 * @return the number of matching connection documents
	 */
	public int countByConnectionRequestIdAndDocumentType(
		long connectionRequestId, String documentType);

	/**
	 * Caches the connection document in the entity cache if it is enabled.
	 *
	 * @param connectionDocument the connection document
	 */
	public void cacheResult(ConnectionDocument connectionDocument);

	/**
	 * Caches the connection documents in the entity cache if it is enabled.
	 *
	 * @param connectionDocuments the connection documents
	 */
	public void cacheResult(
		java.util.List<ConnectionDocument> connectionDocuments);

	/**
	 * Creates a new connection document with the primary key. Does not add the connection document to the database.
	 *
	 * @param connectionDocumentId the primary key for the new connection document
	 * @return the new connection document
	 */
	public ConnectionDocument create(long connectionDocumentId);

	/**
	 * Removes the connection document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document that was removed
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	public ConnectionDocument remove(long connectionDocumentId)
		throws NoSuchConnectionDocumentException;

	public ConnectionDocument updateImpl(ConnectionDocument connectionDocument);

	/**
	 * Returns the connection document with the primary key or throws a <code>NoSuchConnectionDocumentException</code> if it could not be found.
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document
	 * @throws NoSuchConnectionDocumentException if a connection document with the primary key could not be found
	 */
	public ConnectionDocument findByPrimaryKey(long connectionDocumentId)
		throws NoSuchConnectionDocumentException;

	/**
	 * Returns the connection document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document, or <code>null</code> if a connection document with the primary key could not be found
	 */
	public ConnectionDocument fetchByPrimaryKey(long connectionDocumentId);

	/**
	 * Returns all the connection documents.
	 *
	 * @return the connection documents
	 */
	public java.util.List<ConnectionDocument> findAll();

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
	public java.util.List<ConnectionDocument> findAll(int start, int end);

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
	public java.util.List<ConnectionDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator);

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
	public java.util.List<ConnectionDocument> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ConnectionDocument>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the connection documents from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of connection documents.
	 *
	 * @return the number of connection documents
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}