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

package com.bses.connection2.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ConnectionRequest service. Represents a row in the &quot;bsesconn_ConnectionRequest&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestModel
 * @generated
 */
@ImplementationClassName(
	"com.bses.connection2.model.impl.ConnectionRequestImpl"
)
@ProviderType
public interface ConnectionRequest
	extends ConnectionRequestModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.bses.connection2.model.impl.ConnectionRequestImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ConnectionRequest, Long>
		CONNECTION_REQUEST_ID_ACCESSOR =
			new Accessor<ConnectionRequest, Long>() {

				@Override
				public Long get(ConnectionRequest connectionRequest) {
					return connectionRequest.getConnectionRequestId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ConnectionRequest> getTypeClass() {
					return ConnectionRequest.class;
				}

			};

}