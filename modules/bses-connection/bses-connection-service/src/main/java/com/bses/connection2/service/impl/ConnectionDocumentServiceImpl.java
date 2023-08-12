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

package com.bses.connection2.service.impl;

import com.bses.connection2.model.ConnectionDocument;
import com.bses.connection2.service.base.ConnectionDocumentServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.access.control.AccessControlled;

import java.io.File;

/**
 * The implementation of the connection document remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.bses.connection2.service.ConnectionDocumentService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionDocumentServiceBaseImpl
 * @see com.bses.connection2.service.ConnectionDocumentServiceUtil
 */
public class ConnectionDocumentServiceImpl
	extends ConnectionDocumentServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.bses.connection2.service.ConnectionDocumentServiceUtil} to access the connection document remote service.
	 */
	
	@AccessControlled(guestAccessEnabled=true)
	public ConnectionDocument updateConnectionDocument(long connectionDocumentId, long connectionRequestId, String documentType, String documentName, String clientFileName, File file) throws PortalException{
		return connectionDocumentLocalService.updateConnectionDocument(connectionDocumentId, connectionRequestId, documentType, documentName, clientFileName, file);
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public boolean removeConnectionDocument(long connectionDocumentId) throws PortalException{
		return connectionDocumentLocalService.removeConnectionDocument(connectionDocumentId);
	}
}