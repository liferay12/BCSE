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

import com.bses.connection2.model.RequestNumberSeq;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RequestNumberSeq in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RequestNumberSeqCacheModel
	implements CacheModel<RequestNumberSeq>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RequestNumberSeqCacheModel)) {
			return false;
		}

		RequestNumberSeqCacheModel requestNumberSeqCacheModel =
			(RequestNumberSeqCacheModel)object;

		if (requestNumberSeqId ==
				requestNumberSeqCacheModel.requestNumberSeqId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, requestNumberSeqId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", requestNumberSeqId=");
		sb.append(requestNumberSeqId);
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
		sb.append(", seqDate=");
		sb.append(seqDate);
		sb.append(", seqNumber=");
		sb.append(seqNumber);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RequestNumberSeq toEntityModel() {
		RequestNumberSeqImpl requestNumberSeqImpl = new RequestNumberSeqImpl();

		if (uuid == null) {
			requestNumberSeqImpl.setUuid("");
		}
		else {
			requestNumberSeqImpl.setUuid(uuid);
		}

		requestNumberSeqImpl.setRequestNumberSeqId(requestNumberSeqId);
		requestNumberSeqImpl.setGroupId(groupId);
		requestNumberSeqImpl.setCompanyId(companyId);
		requestNumberSeqImpl.setUserId(userId);

		if (userName == null) {
			requestNumberSeqImpl.setUserName("");
		}
		else {
			requestNumberSeqImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			requestNumberSeqImpl.setCreateDate(null);
		}
		else {
			requestNumberSeqImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			requestNumberSeqImpl.setModifiedDate(null);
		}
		else {
			requestNumberSeqImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (seqDate == null) {
			requestNumberSeqImpl.setSeqDate("");
		}
		else {
			requestNumberSeqImpl.setSeqDate(seqDate);
		}

		requestNumberSeqImpl.setSeqNumber(seqNumber);

		requestNumberSeqImpl.resetOriginalValues();

		return requestNumberSeqImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		requestNumberSeqId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		seqDate = objectInput.readUTF();

		seqNumber = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(requestNumberSeqId);

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

		if (seqDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(seqDate);
		}

		objectOutput.writeLong(seqNumber);
	}

	public String uuid;
	public long requestNumberSeqId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String seqDate;
	public long seqNumber;

}