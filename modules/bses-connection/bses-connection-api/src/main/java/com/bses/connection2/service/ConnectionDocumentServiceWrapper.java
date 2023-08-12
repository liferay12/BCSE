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
 * Provides a wrapper for {@link ConnectionDocumentService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionDocumentService
 * @generated
 */
public class ConnectionDocumentServiceWrapper
	implements ConnectionDocumentService,
			   ServiceWrapper<ConnectionDocumentService> {

	public ConnectionDocumentServiceWrapper(
		ConnectionDocumentService connectionDocumentService) {

		_connectionDocumentService = connectionDocumentService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _connectionDocumentService.getOSGiServiceIdentifier();
	}

	@Override
	public boolean removeConnectionDocument(long connectionDocumentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionDocumentService.removeConnectionDocument(
			connectionDocumentId);
	}

	@Override
	public com.bses.connection2.model.ConnectionDocument
			updateConnectionDocument(
				long connectionDocumentId, long connectionRequestId,
				String documentType, String documentName, String clientFileName,
				java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _connectionDocumentService.updateConnectionDocument(
			connectionDocumentId, connectionRequestId, documentType,
			documentName, clientFileName, file);
	}

	@Override
	public ConnectionDocumentService getWrappedService() {
		return _connectionDocumentService;
	}

	@Override
	public void setWrappedService(
		ConnectionDocumentService connectionDocumentService) {

		_connectionDocumentService = connectionDocumentService;
	}

	private ConnectionDocumentService _connectionDocumentService;

}