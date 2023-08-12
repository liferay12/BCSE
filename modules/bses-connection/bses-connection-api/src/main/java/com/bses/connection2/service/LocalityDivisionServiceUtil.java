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

import com.bses.connection2.model.LocalityDivision;

/**
 * Provides the remote service utility for LocalityDivision. This utility wraps
 * <code>com.bses.connection2.service.impl.LocalityDivisionServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see LocalityDivisionService
 * @generated
 */
public class LocalityDivisionServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bses.connection2.service.impl.LocalityDivisionServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.json.JSONArray
		getAvailableDivisionSlots(java.util.Date appointmentDate) {

		return getService().getAvailableDivisionSlots(appointmentDate);
	}

	public static LocalityDivision getLocalityDivision(
		long localityDivisionId) {

		return getService().getLocalityDivision(localityDivisionId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static LocalityDivisionService getService() {
		return _service;
	}

	private static volatile LocalityDivisionService _service;

}