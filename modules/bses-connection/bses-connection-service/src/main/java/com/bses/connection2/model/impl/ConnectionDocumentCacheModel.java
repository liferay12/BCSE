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

import com.bses.connection2.model.ConnectionDocument;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ConnectionDocument in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ConnectionDocumentCacheModel
	implements CacheModel<ConnectionDocument>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ConnectionDocumentCacheModel)) {
			return false;
		}

		ConnectionDocumentCacheModel connectionDocumentCacheModel =
			(ConnectionDocumentCacheModel)object;

		if (connectionDocumentId ==
				connectionDocumentCacheModel.connectionDocumentId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, connectionDocumentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", connectionDocumentId=");
		sb.append(connectionDocumentId);
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
		sb.append(", connectionRequestId=");
		sb.append(connectionRequestId);
		sb.append(", documentType=");
		sb.append(documentType);
		sb.append(", documentName=");
		sb.append(documentName);
		sb.append(", documentPath=");
		sb.append(documentPath);
		sb.append(", clientFileName=");
		sb.append(clientFileName);
		sb.append(", transfered=");
		sb.append(transfered);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ConnectionDocument toEntityModel() {
		ConnectionDocumentImpl connectionDocumentImpl =
			new ConnectionDocumentImpl();

		if (uuid == null) {
			connectionDocumentImpl.setUuid("");
		}
		else {
			connectionDocumentImpl.setUuid(uuid);
		}

		connectionDocumentImpl.setConnectionDocumentId(connectionDocumentId);
		connectionDocumentImpl.setGroupId(groupId);
		connectionDocumentImpl.setCompanyId(companyId);
		connectionDocumentImpl.setUserId(userId);

		if (userName == null) {
			connectionDocumentImpl.setUserName("");
		}
		else {
			connectionDocumentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			connectionDocumentImpl.setCreateDate(null);
		}
		else {
			connectionDocumentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			connectionDocumentImpl.setModifiedDate(null);
		}
		else {
			connectionDocumentImpl.setModifiedDate(new Date(modifiedDate));
		}

		connectionDocumentImpl.setConnectionRequestId(connectionRequestId);

		if (documentType == null) {
			connectionDocumentImpl.setDocumentType("");
		}
		else {
			connectionDocumentImpl.setDocumentType(documentType);
		}

		if (documentName == null) {
			connectionDocumentImpl.setDocumentName("");
		}
		else {
			connectionDocumentImpl.setDocumentName(documentName);
		}

		if (documentPath == null) {
			connectionDocumentImpl.setDocumentPath("");
		}
		else {
			connectionDocumentImpl.setDocumentPath(documentPath);
		}

		if (clientFileName == null) {
			connectionDocumentImpl.setClientFileName("");
		}
		else {
			connectionDocumentImpl.setClientFileName(clientFileName);
		}

		if (transfered == null) {
			connectionDocumentImpl.setTransfered("");
		}
		else {
			connectionDocumentImpl.setTransfered(transfered);
		}

		connectionDocumentImpl.resetOriginalValues();

		return connectionDocumentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		connectionDocumentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		connectionRequestId = objectInput.readLong();
		documentType = objectInput.readUTF();
		documentName = objectInput.readUTF();
		documentPath = objectInput.readUTF();
		clientFileName = objectInput.readUTF();
		transfered = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(connectionDocumentId);

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

		objectOutput.writeLong(connectionRequestId);

		if (documentType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentType);
		}

		if (documentName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentName);
		}

		if (documentPath == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentPath);
		}

		if (clientFileName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(clientFileName);
		}

		if (transfered == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transfered);
		}
	}

	public String uuid;
	public long connectionDocumentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long connectionRequestId;
	public String documentType;
	public String documentName;
	public String documentPath;
	public String clientFileName;
	public String transfered;

}