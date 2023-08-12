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

package com.bses.connection2.service;

import com.bses.connection2.model.ConnectionDocument;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ConnectionDocument. This utility wraps
 * <code>com.bses.connection2.service.impl.ConnectionDocumentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionDocumentLocalService
 * @generated
 */
public class ConnectionDocumentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bses.connection2.service.impl.ConnectionDocumentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the connection document to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConnectionDocumentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param connectionDocument the connection document
	 * @return the connection document that was added
	 */
	public static ConnectionDocument addConnectionDocument(
		ConnectionDocument connectionDocument) {

		return getService().addConnectionDocument(connectionDocument);
	}

	/**
	 * Creates a new connection document with the primary key. Does not add the connection document to the database.
	 *
	 * @param connectionDocumentId the primary key for the new connection document
	 * @return the new connection document
	 */
	public static ConnectionDocument createConnectionDocument(
		long connectionDocumentId) {

		return getService().createConnectionDocument(connectionDocumentId);
	}

	/**
	 * Deletes the connection document from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConnectionDocumentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param connectionDocument the connection document
	 * @return the connection document that was removed
	 */
	public static ConnectionDocument deleteConnectionDocument(
		ConnectionDocument connectionDocument) {

		return getService().deleteConnectionDocument(connectionDocument);
	}

	/**
	 * Deletes the connection document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConnectionDocumentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document that was removed
	 * @throws PortalException if a connection document with the primary key could not be found
	 */
	public static ConnectionDocument deleteConnectionDocument(
			long connectionDocumentId)
		throws PortalException {

		return getService().deleteConnectionDocument(connectionDocumentId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ConnectionDocument fetchConnectionDocument(
		long connectionDocumentId) {

		return getService().fetchConnectionDocument(connectionDocumentId);
	}

	/**
	 * Returns the connection document matching the UUID and group.
	 *
	 * @param uuid the connection document's UUID
	 * @param groupId the primary key of the group
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	public static ConnectionDocument fetchConnectionDocumentByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchConnectionDocumentByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the connection document with the primary key.
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document
	 * @throws PortalException if a connection document with the primary key could not be found
	 */
	public static ConnectionDocument getConnectionDocument(
			long connectionDocumentId)
		throws PortalException {

		return getService().getConnectionDocument(connectionDocumentId);
	}

	public static List<ConnectionDocument>
		getConnectionDocumentByConnectionRequestId(long connectionRequestId) {

		return getService().getConnectionDocumentByConnectionRequestId(
			connectionRequestId);
	}

	public static ConnectionDocument
		getConnectionDocumentByConnectionRequestIdAndDocumentType(
			long connectionRequestId, String documentType) {

		return getService().
			getConnectionDocumentByConnectionRequestIdAndDocumentType(
				connectionRequestId, documentType);
	}

	/**
	 * Returns the connection document matching the UUID and group.
	 *
	 * @param uuid the connection document's UUID
	 * @param groupId the primary key of the group
	 * @return the matching connection document
	 * @throws PortalException if a matching connection document could not be found
	 */
	public static ConnectionDocument getConnectionDocumentByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getConnectionDocumentByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the connection documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.ConnectionDocumentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @return the range of connection documents
	 */
	public static List<ConnectionDocument> getConnectionDocuments(
		int start, int end) {

		return getService().getConnectionDocuments(start, end);
	}

	/**
	 * Returns all the connection documents matching the UUID and company.
	 *
	 * @param uuid the UUID of the connection documents
	 * @param companyId the primary key of the company
	 * @return the matching connection documents, or an empty list if no matches were found
	 */
	public static List<ConnectionDocument>
		getConnectionDocumentsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getConnectionDocumentsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of connection documents matching the UUID and company.
	 *
	 * @param uuid the UUID of the connection documents
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of connection documents
	 * @param end the upper bound of the range of connection documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching connection documents, or an empty list if no matches were found
	 */
	public static List<ConnectionDocument>
		getConnectionDocumentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<ConnectionDocument> orderByComparator) {

		return getService().getConnectionDocumentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of connection documents.
	 *
	 * @return the number of connection documents
	 */
	public static int getConnectionDocumentsCount() {
		return getService().getConnectionDocumentsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static boolean removeConnectionDocument(long connectionDocumentId) {
		return getService().removeConnectionDocument(connectionDocumentId);
	}

	/**
	 * Updates the connection document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ConnectionDocumentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param connectionDocument the connection document
	 * @return the connection document that was updated
	 */
	public static ConnectionDocument updateConnectionDocument(
		ConnectionDocument connectionDocument) {

		return getService().updateConnectionDocument(connectionDocument);
	}

	public static ConnectionDocument updateConnectionDocument(
			long connectionDocumentId, long connectionRequestId,
			String documentType, String documentName, String clientFileName,
			java.io.File file)
		throws PortalException {

		return getService().updateConnectionDocument(
			connectionDocumentId, connectionRequestId, documentType,
			documentName, clientFileName, file);
	}

	public static ConnectionDocumentLocalService getService() {
		return _service;
	}

	private static volatile ConnectionDocumentLocalService _service;

}