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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.bses.connection2.service.http.ConnectionDocumentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ConnectionDocumentSoap implements Serializable {

	public static ConnectionDocumentSoap toSoapModel(ConnectionDocument model) {
		ConnectionDocumentSoap soapModel = new ConnectionDocumentSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setConnectionDocumentId(model.getConnectionDocumentId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setConnectionRequestId(model.getConnectionRequestId());
		soapModel.setDocumentType(model.getDocumentType());
		soapModel.setDocumentName(model.getDocumentName());
		soapModel.setDocumentPath(model.getDocumentPath());
		soapModel.setClientFileName(model.getClientFileName());
		soapModel.setTransfered(model.getTransfered());

		return soapModel;
	}

	public static ConnectionDocumentSoap[] toSoapModels(
		ConnectionDocument[] models) {

		ConnectionDocumentSoap[] soapModels =
			new ConnectionDocumentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConnectionDocumentSoap[][] toSoapModels(
		ConnectionDocument[][] models) {

		ConnectionDocumentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new ConnectionDocumentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConnectionDocumentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConnectionDocumentSoap[] toSoapModels(
		List<ConnectionDocument> models) {

		List<ConnectionDocumentSoap> soapModels =
			new ArrayList<ConnectionDocumentSoap>(models.size());

		for (ConnectionDocument model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new ConnectionDocumentSoap[soapModels.size()]);
	}

	public ConnectionDocumentSoap() {
	}

	public long getPrimaryKey() {
		return _connectionDocumentId;
	}

	public void setPrimaryKey(long pk) {
		setConnectionDocumentId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getConnectionDocumentId() {
		return _connectionDocumentId;
	}

	public void setConnectionDocumentId(long connectionDocumentId) {
		_connectionDocumentId = connectionDocumentId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getConnectionRequestId() {
		return _connectionRequestId;
	}

	public void setConnectionRequestId(long connectionRequestId) {
		_connectionRequestId = connectionRequestId;
	}

	public String getDocumentType() {
		return _documentType;
	}

	public void setDocumentType(String documentType) {
		_documentType = documentType;
	}

	public String getDocumentName() {
		return _documentName;
	}

	public void setDocumentName(String documentName) {
		_documentName = documentName;
	}

	public String getDocumentPath() {
		return _documentPath;
	}

	public void setDocumentPath(String documentPath) {
		_documentPath = documentPath;
	}

	public String getClientFileName() {
		return _clientFileName;
	}

	public void setClientFileName(String clientFileName) {
		_clientFileName = clientFileName;
	}

	public String getTransfered() {
		return _transfered;
	}

	public void setTransfered(String transfered) {
		_transfered = transfered;
	}

	private String _uuid;
	private long _connectionDocumentId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _connectionRequestId;
	private String _documentType;
	private String _documentName;
	private String _documentPath;
	private String _clientFileName;
	private String _transfered;

}