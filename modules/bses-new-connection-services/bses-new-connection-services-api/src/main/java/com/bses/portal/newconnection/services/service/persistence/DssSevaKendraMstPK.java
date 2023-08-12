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

package com.bses.portal.newconnection.services.service.persistence;

import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DssSevaKendraMstPK
	implements Comparable<DssSevaKendraMstPK>, Serializable {

	public String district;
	public String skAddrP2;

	public DssSevaKendraMstPK() {
	}

	public DssSevaKendraMstPK(String district, String skAddrP2) {
		this.district = district;
		this.skAddrP2 = skAddrP2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getSkAddrP2() {
		return skAddrP2;
	}

	public void setSkAddrP2(String skAddrP2) {
		this.skAddrP2 = skAddrP2;
	}

	@Override
	public int compareTo(DssSevaKendraMstPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = district.compareTo(pk.district);

		if (value != 0) {
			return value;
		}

		value = skAddrP2.compareTo(pk.skAddrP2);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DssSevaKendraMstPK)) {
			return false;
		}

		DssSevaKendraMstPK pk = (DssSevaKendraMstPK)object;

		if (district.equals(pk.district) && skAddrP2.equals(pk.skAddrP2)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, district);
		hashCode = HashUtil.hash(hashCode, skAddrP2);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(6);

		sb.append("{");

		sb.append("district=");

		sb.append(district);
		sb.append(", skAddrP2=");

		sb.append(skAddrP2);

		sb.append("}");

		return sb.toString();
	}

}