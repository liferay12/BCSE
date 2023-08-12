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

package com.bses.portal.newconnection.services.service.impl;

import com.bses.portal.newconnection.services.model.DssSevaKendraMst;
import com.bses.portal.newconnection.services.service.base.DssSevaKendraMstLocalServiceBaseImpl;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the dss seva kendra mst local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.bses.portal.newconnection.services.service.DssSevaKendraMstLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DssSevaKendraMstLocalServiceBaseImpl
 */
public class DssSevaKendraMstLocalServiceImpl
	extends DssSevaKendraMstLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.bses.portal.newconnection.services.service.DssSevaKendraMstLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.bses.portal.newconnection.services.service.DssSevaKendraMstLocalServiceUtil</code>.
	 */
	public DssSevaKendraMst getByDistrictAndName(String district, String name) {
		return dssSevaKendraMstPersistence.fetchByByDistrictAndName(district, name);
	}
	
	public DssSevaKendraMst getByName(String name) {
		return dssSevaKendraMstPersistence.fetchByByName(name);
	}

	public DssSevaKendraMst isRegisteredKendra(String districtCode, String districtDescription) {
		if (Validator.isNotNull(districtCode)) {
			return dssSevaKendraMstPersistence.fetchByByDistrict(districtCode.toUpperCase());
		}
		return null;
	}
}