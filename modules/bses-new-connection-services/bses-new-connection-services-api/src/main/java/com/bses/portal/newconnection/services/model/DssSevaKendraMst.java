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

package com.bses.portal.newconnection.services.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the DssSevaKendraMst service. Represents a row in the &quot;DSS_SEVAKENDRA_MST&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DssSevaKendraMstModel
 * @generated
 */
@ImplementationClassName(
	"com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstImpl"
)
@ProviderType
public interface DssSevaKendraMst
	extends DssSevaKendraMstModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DssSevaKendraMst, String> DISTRICT_ACCESSOR =
		new Accessor<DssSevaKendraMst, String>() {

			@Override
			public String get(DssSevaKendraMst dssSevaKendraMst) {
				return dssSevaKendraMst.getDistrict();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<DssSevaKendraMst> getTypeClass() {
				return DssSevaKendraMst.class;
			}

		};
	public static final Accessor<DssSevaKendraMst, String> SK_ADDR_P2_ACCESSOR =
		new Accessor<DssSevaKendraMst, String>() {

			@Override
			public String get(DssSevaKendraMst dssSevaKendraMst) {
				return dssSevaKendraMst.getSkAddrP2();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<DssSevaKendraMst> getTypeClass() {
				return DssSevaKendraMst.class;
			}

		};

}