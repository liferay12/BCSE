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

package com.bses.connection2.model.impl;

import com.bses.connection2.model.LocalityDivision;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LocalityDivision in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LocalityDivisionCacheModel
	implements CacheModel<LocalityDivision>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LocalityDivisionCacheModel)) {
			return false;
		}

		LocalityDivisionCacheModel localityDivisionCacheModel =
			(LocalityDivisionCacheModel)object;

		if (localityDivisionId ==
				localityDivisionCacheModel.localityDivisionId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, localityDivisionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", localityDivisionId=");
		sb.append(localityDivisionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", localityName=");
		sb.append(localityName);
		sb.append(", divisionCode=");
		sb.append(divisionCode);
		sb.append(", divisionName=");
		sb.append(divisionName);
		sb.append(", complaintCenter=");
		sb.append(complaintCenter);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LocalityDivision toEntityModel() {
		LocalityDivisionImpl localityDivisionImpl = new LocalityDivisionImpl();

		if (uuid == null) {
			localityDivisionImpl.setUuid("");
		}
		else {
			localityDivisionImpl.setUuid(uuid);
		}

		localityDivisionImpl.setLocalityDivisionId(localityDivisionId);
		localityDivisionImpl.setGroupId(groupId);
		localityDivisionImpl.setCompanyId(companyId);
		localityDivisionImpl.setUserId(userId);

		if (userName == null) {
			localityDivisionImpl.setUserName("");
		}
		else {
			localityDivisionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			localityDivisionImpl.setCreateDate(null);
		}
		else {
			localityDivisionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			localityDivisionImpl.setModifiedDate(null);
		}
		else {
			localityDivisionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (localityName == null) {
			localityDivisionImpl.setLocalityName("");
		}
		else {
			localityDivisionImpl.setLocalityName(localityName);
		}

		if (divisionCode == null) {
			localityDivisionImpl.setDivisionCode("");
		}
		else {
			localityDivisionImpl.setDivisionCode(divisionCode);
		}

		if (divisionName == null) {
			localityDivisionImpl.setDivisionName("");
		}
		else {
			localityDivisionImpl.setDivisionName(divisionName);
		}

		if (complaintCenter == null) {
			localityDivisionImpl.setComplaintCenter("");
		}
		else {
			localityDivisionImpl.setComplaintCenter(complaintCenter);
		}

		localityDivisionImpl.resetOriginalValues();

		return localityDivisionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		localityDivisionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		localityName = objectInput.readUTF();
		divisionCode = objectInput.readUTF();
		divisionName = objectInput.readUTF();
		complaintCenter = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(localityDivisionId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (localityName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(localityName);
		}

		if (divisionCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(divisionCode);
		}

		if (divisionName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(divisionName);
		}

		if (complaintCenter == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(complaintCenter);
		}
	}

	public String uuid;
	public long localityDivisionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String localityName;
	public String divisionCode;
	public String divisionName;
	public String complaintCenter;

}