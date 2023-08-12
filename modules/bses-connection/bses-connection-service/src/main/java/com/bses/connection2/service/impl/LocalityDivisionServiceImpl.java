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

import com.bses.connection2.model.LocalityDivision;
import com.bses.connection2.service.base.LocalityDivisionServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.security.access.control.AccessControlled;

import java.util.Date;

/**
 * The implementation of the locality division remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.bses.connection2.service.LocalityDivisionService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LocalityDivisionServiceBaseImpl
 * @see com.bses.connection2.service.LocalityDivisionServiceUtil
 */
public class LocalityDivisionServiceImpl extends LocalityDivisionServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.bses.connection2.service.LocalityDivisionServiceUtil} to access the locality division remote service.
	 */
	@AccessControlled(guestAccessEnabled=true)
	public LocalityDivision getLocalityDivision(long localityDivisionId) {
		try {
			return localityDivisionLocalService.getLocalityDivision(localityDivisionId);
		} catch (PortalException e) {
		}
		return null;
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public JSONArray getAvailableDivisionSlots(Date appointmentDate) {
		return localityDivisionLocalService.getAvailableDivisionSlots(appointmentDate);
	}
}