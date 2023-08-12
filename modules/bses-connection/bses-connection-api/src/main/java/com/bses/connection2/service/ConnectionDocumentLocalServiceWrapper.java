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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ConnectionDocumentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionDocumentLocalService
 * @generated
 */
public class ConnectionDocumentLocalServiceWrapper
	implements ConnectionDocumentLocalService,
			   ServiceWrapper<ConnectionDocumentLocalService> {

	public ConnectionDocumentLocalServiceWrapper(
		ConnectionDocumentLocalService connectionDocumentLocalService) {

		_connectionDocumentLocalService = connectionDocumentLocalService;
	}

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
	@Override
	public com.bses.connection2.model.ConnectionDocument addConnectionDocument(
		com.bses.connection2.model.ConnectionDocument connectionDocument) {

		return _connectionDocumentLocalService.addConnectionDocument(
			connectionDocument);
	}

	/**
	 * Creates a new connection document with the primary key. Does not add the connection document to the database.
	 *
	 * @param connectionDocumentId the primary key for the new connection document
	 * @return the new connection document
	 */
	@Override
	public com.bses.connection2.model.ConnectionDocument
		createConnectionDocument(long connectionDocumentId) {

		return _connectionDocumentLocalService.createConnectionDocument(
			connectionDocumentId);
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
	@Override
	public com.bses.connection2.model.ConnectionDocument
		deleteConnectionDocument(
			com.bses.connection2.model.ConnectionDocument connectionDocument) {

		return _connectionDocumentLocalService.deleteConnectionDocument(
			connectionDocument);
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
	@Override
	public com.bses.connection2.model.ConnectionDocument
			deleteConnectionDocument(long connectionDocumentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionDocumentLocalService.deleteConnectionDocument(
			connectionDocumentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionDocumentLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _connectionDocumentLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _connectionDocumentLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _connectionDocumentLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _connectionDocumentLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _connectionDocumentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _connectionDocumentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.bses.connection2.model.ConnectionDocument
		fetchConnectionDocument(long connectionDocumentId) {

		return _connectionDocumentLocalService.fetchConnectionDocument(
			connectionDocumentId);
	}

	/**
	 * Returns the connection document matching the UUID and group.
	 *
	 * @param uuid the connection document's UUID
	 * @param groupId the primary key of the group
	 * @return the matching connection document, or <code>null</code> if a matching connection document could not be found
	 */
	@Override
	public com.bses.connection2.model.ConnectionDocument
		fetchConnectionDocumentByUuidAndGroupId(String uuid, long groupId) {

		return _connectionDocumentLocalService.
			fetchConnectionDocumentByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _connectionDocumentLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the connection document with the primary key.
	 *
	 * @param connectionDocumentId the primary key of the connection document
	 * @return the connection document
	 * @throws PortalException if a connection document with the primary key could not be found
	 */
	@Override
	public com.bses.connection2.model.ConnectionDocument getConnectionDocument(
			long connectionDocumentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionDocumentLocalService.getConnectionDocument(
			connectionDocumentId);
	}

	@Override
	public java.util.List<com.bses.connection2.model.ConnectionDocument>
		getConnectionDocumentByConnectionRequestId(long connectionRequestId) {

		return _connectionDocumentLocalService.
			getConnectionDocumentByConnectionRequestId(connectionRequestId);
	}

	@Override
	public com.bses.connection2.model.ConnectionDocument
		getConnectionDocumentByConnectionRequestIdAndDocumentType(
			long connectionRequestId, String documentType) {

		return _connectionDocumentLocalService.
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
	@Override
	public com.bses.connection2.model.ConnectionDocument
			getConnectionDocumentByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionDocumentLocalService.
			getConnectionDocumentByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.bses.connection2.model.ConnectionDocument>
		getConnectionDocuments(int start, int end) {

		return _connectionDocumentLocalService.getConnectionDocuments(
			start, end);
	}

	/**
	 * Returns all the connection documents matching the UUID and company.
	 *
	 * @param uuid the UUID of the connection documents
	 * @param companyId the primary key of the company
	 * @return the matching connection documents, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.bses.connection2.model.ConnectionDocument>
		getConnectionDocumentsByUuidAndCompanyId(String uuid, long companyId) {

		return _connectionDocumentLocalService.
			getConnectionDocumentsByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<com.bses.connection2.model.ConnectionDocument>
		getConnectionDocumentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.bses.connection2.model.ConnectionDocument>
					orderByComparator) {

		return _connectionDocumentLocalService.
			getConnectionDocumentsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of connection documents.
	 *
	 * @return the number of connection documents
	 */
	@Override
	public int getConnectionDocumentsCount() {
		return _connectionDocumentLocalService.getConnectionDocumentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _connectionDocumentLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _connectionDocumentLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _connectionDocumentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionDocumentLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public boolean removeConnectionDocument(long connectionDocumentId) {
		return _connectionDocumentLocalService.removeConnectionDocument(
			connectionDocumentId);
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
	@Override
	public com.bses.connection2.model.ConnectionDocument
		updateConnectionDocument(
			com.bses.connection2.model.ConnectionDocument connectionDocument) {

		return _connectionDocumentLocalService.updateConnectionDocument(
			connectionDocument);
	}

	@Override
	public com.bses.connection2.model.ConnectionDocument
			updateConnectionDocument(
				long connectionDocumentId, long connectionRequestId,
				String documentType, String documentName, String clientFileName,
				java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionDocumentLocalService.updateConnectionDocument(
			connectionDocumentId, connectionRequestId, documentType,
			documentName, clientFileName, file);
	}

	@Override
	public ConnectionDocumentLocalService getWrappedService() {
		return _connectionDocumentLocalService;
	}

	@Override
	public void setWrappedService(
		ConnectionDocumentLocalService connectionDocumentLocalService) {

		_connectionDocumentLocalService = connectionDocumentLocalService;
	}

	private ConnectionDocumentLocalService _connectionDocumentLocalService;

}