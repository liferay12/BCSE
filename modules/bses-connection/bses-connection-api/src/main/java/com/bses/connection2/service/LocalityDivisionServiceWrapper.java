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
 * Provides a wrapper for {@link LocalityDivisionService}.
 *
 * @author Brian Wing Shun Chan
 * @see LocalityDivisionService
 * @generated
 */
public class LocalityDivisionServiceWrapper
	implements LocalityDivisionService,
			   ServiceWrapper<LocalityDivisionService> {

	public LocalityDivisionServiceWrapper(
		LocalityDivisionService localityDivisionService) {

		_localityDivisionService = localityDivisionService;
	}

	@Override
	public com.liferay.portal.kernel.json.JSONArray getAvailableDivisionSlots(
		java.util.Date appointmentDate) {

		return _localityDivisionService.getAvailableDivisionSlots(
			appointmentDate);
	}

	@Override
	public com.bses.connection2.model.LocalityDivision getLocalityDivision(
		long localityDivisionId) {

		return _localityDivisionService.getLocalityDivision(localityDivisionId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _localityDivisionService.getOSGiServiceIdentifier();
	}

	@Override
	public LocalityDivisionService getWrappedService() {
		return _localityDivisionService;
	}

	@Override
	public void setWrappedService(
		LocalityDivisionService localityDivisionService) {

		_localityDivisionService = localityDivisionService;
	}

	private LocalityDivisionService _localityDivisionService;

}