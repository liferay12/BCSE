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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ConnectionDocument}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionDocument
 * @generated
 */
public class ConnectionDocumentWrapper
	implements ConnectionDocument, ModelWrapper<ConnectionDocument> {

	public ConnectionDocumentWrapper(ConnectionDocument connectionDocument) {
		_connectionDocument = connectionDocument;
	}

	@Override
	public Class<?> getModelClass() {
		return ConnectionDocument.class;
	}

	@Override
	public String getModelClassName() {
		return ConnectionDocument.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("connectionDocumentId", getConnectionDocumentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("connectionRequestId", getConnectionRequestId());
		attributes.put("documentType", getDocumentType());
		attributes.put("documentName", getDocumentName());
		attributes.put("documentPath", getDocumentPath());
		attributes.put("clientFileName", getClientFileName());
		attributes.put("transfered", getTransfered());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long connectionDocumentId = (Long)attributes.get(
			"connectionDocumentId");

		if (connectionDocumentId != null) {
			setConnectionDocumentId(connectionDocumentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long connectionRequestId = (Long)attributes.get("connectionRequestId");

		if (connectionRequestId != null) {
			setConnectionRequestId(connectionRequestId);
		}

		String documentType = (String)attributes.get("documentType");

		if (documentType != null) {
			setDocumentType(documentType);
		}

		String documentName = (String)attributes.get("documentName");

		if (documentName != null) {
			setDocumentName(documentName);
		}

		String documentPath = (String)attributes.get("documentPath");

		if (documentPath != null) {
			setDocumentPath(documentPath);
		}

		String clientFileName = (String)attributes.get("clientFileName");

		if (clientFileName != null) {
			setClientFileName(clientFileName);
		}

		String transfered = (String)attributes.get("transfered");

		if (transfered != null) {
			setTransfered(transfered);
		}
	}

	@Override
	public Object clone() {
		return new ConnectionDocumentWrapper(
			(ConnectionDocument)_connectionDocument.clone());
	}

	@Override
	public int compareTo(ConnectionDocument connectionDocument) {
		return _connectionDocument.compareTo(connectionDocument);
	}

	/**
	 * Returns the client file name of this connection document.
	 *
	 * @return the client file name of this connection document
	 */
	@Override
	public String getClientFileName() {
		return _connectionDocument.getClientFileName();
	}

	/**
	 * Returns the company ID of this connection document.
	 *
	 * @return the company ID of this connection document
	 */
	@Override
	public long getCompanyId() {
		return _connectionDocument.getCompanyId();
	}

	/**
	 * Returns the connection document ID of this connection document.
	 *
	 * @return the connection document ID of this connection document
	 */
	@Override
	public long getConnectionDocumentId() {
		return _connectionDocument.getConnectionDocumentId();
	}

	/**
	 * Returns the connection request ID of this connection document.
	 *
	 * @return the connection request ID of this connection document
	 */
	@Override
	public long getConnectionRequestId() {
		return _connectionDocument.getConnectionRequestId();
	}

	/**
	 * Returns the create date of this connection document.
	 *
	 * @return the create date of this connection document
	 */
	@Override
	public Date getCreateDate() {
		return _connectionDocument.getCreateDate();
	}

	/**
	 * Returns the document name of this connection document.
	 *
	 * @return the document name of this connection document
	 */
	@Override
	public String getDocumentName() {
		return _connectionDocument.getDocumentName();
	}

	/**
	 * Returns the document path of this connection document.
	 *
	 * @return the document path of this connection document
	 */
	@Override
	public String getDocumentPath() {
		return _connectionDocument.getDocumentPath();
	}

	/**
	 * Returns the document type of this connection document.
	 *
	 * @return the document type of this connection document
	 */
	@Override
	public String getDocumentType() {
		return _connectionDocument.getDocumentType();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _connectionDocument.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this connection document.
	 *
	 * @return the group ID of this connection document
	 */
	@Override
	public long getGroupId() {
		return _connectionDocument.getGroupId();
	}

	/**
	 * Returns the modified date of this connection document.
	 *
	 * @return the modified date of this connection document
	 */
	@Override
	public Date getModifiedDate() {
		return _connectionDocument.getModifiedDate();
	}

	/**
	 * Returns the primary key of this connection document.
	 *
	 * @return the primary key of this connection document
	 */
	@Override
	public long getPrimaryKey() {
		return _connectionDocument.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _connectionDocument.getPrimaryKeyObj();
	}

	/**
	 * Returns the transfered of this connection document.
	 *
	 * @return the transfered of this connection document
	 */
	@Override
	public String getTransfered() {
		return _connectionDocument.getTransfered();
	}

	/**
	 * Returns the user ID of this connection document.
	 *
	 * @return the user ID of this connection document
	 */
	@Override
	public long getUserId() {
		return _connectionDocument.getUserId();
	}

	/**
	 * Returns the user name of this connection document.
	 *
	 * @return the user name of this connection document
	 */
	@Override
	public String getUserName() {
		return _connectionDocument.getUserName();
	}

	/**
	 * Returns the user uuid of this connection document.
	 *
	 * @return the user uuid of this connection document
	 */
	@Override
	public String getUserUuid() {
		return _connectionDocument.getUserUuid();
	}

	/**
	 * Returns the uuid of this connection document.
	 *
	 * @return the uuid of this connection document
	 */
	@Override
	public String getUuid() {
		return _connectionDocument.getUuid();
	}

	@Override
	public int hashCode() {
		return _connectionDocument.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _connectionDocument.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _connectionDocument.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _connectionDocument.isNew();
	}

	@Override
	public void persist() {
		_connectionDocument.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_connectionDocument.setCachedModel(cachedModel);
	}

	/**
	 * Sets the client file name of this connection document.
	 *
	 * @param clientFileName the client file name of this connection document
	 */
	@Override
	public void setClientFileName(String clientFileName) {
		_connectionDocument.setClientFileName(clientFileName);
	}

	/**
	 * Sets the company ID of this connection document.
	 *
	 * @param companyId the company ID of this connection document
	 */
	@Override
	public void setCompanyId(long companyId) {
		_connectionDocument.setCompanyId(companyId);
	}

	/**
	 * Sets the connection document ID of this connection document.
	 *
	 * @param connectionDocumentId the connection document ID of this connection document
	 */
	@Override
	public void setConnectionDocumentId(long connectionDocumentId) {
		_connectionDocument.setConnectionDocumentId(connectionDocumentId);
	}

	/**
	 * Sets the connection request ID of this connection document.
	 *
	 * @param connectionRequestId the connection request ID of this connection document
	 */
	@Override
	public void setConnectionRequestId(long connectionRequestId) {
		_connectionDocument.setConnectionRequestId(connectionRequestId);
	}

	/**
	 * Sets the create date of this connection document.
	 *
	 * @param createDate the create date of this connection document
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_connectionDocument.setCreateDate(createDate);
	}

	/**
	 * Sets the document name of this connection document.
	 *
	 * @param documentName the document name of this connection document
	 */
	@Override
	public void setDocumentName(String documentName) {
		_connectionDocument.setDocumentName(documentName);
	}

	/**
	 * Sets the document path of this connection document.
	 *
	 * @param documentPath the document path of this connection document
	 */
	@Override
	public void setDocumentPath(String documentPath) {
		_connectionDocument.setDocumentPath(documentPath);
	}

	/**
	 * Sets the document type of this connection document.
	 *
	 * @param documentType the document type of this connection document
	 */
	@Override
	public void setDocumentType(String documentType) {
		_connectionDocument.setDocumentType(documentType);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_connectionDocument.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_connectionDocument.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_connectionDocument.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this connection document.
	 *
	 * @param groupId the group ID of this connection document
	 */
	@Override
	public void setGroupId(long groupId) {
		_connectionDocument.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this connection document.
	 *
	 * @param modifiedDate the modified date of this connection document
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_connectionDocument.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_connectionDocument.setNew(n);
	}

	/**
	 * Sets the primary key of this connection document.
	 *
	 * @param primaryKey the primary key of this connection document
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_connectionDocument.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_connectionDocument.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the transfered of this connection document.
	 *
	 * @param transfered the transfered of this connection document
	 */
	@Override
	public void setTransfered(String transfered) {
		_connectionDocument.setTransfered(transfered);
	}

	/**
	 * Sets the user ID of this connection document.
	 *
	 * @param userId the user ID of this connection document
	 */
	@Override
	public void setUserId(long userId) {
		_connectionDocument.setUserId(userId);
	}

	/**
	 * Sets the user name of this connection document.
	 *
	 * @param userName the user name of this connection document
	 */
	@Override
	public void setUserName(String userName) {
		_connectionDocument.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this connection document.
	 *
	 * @param userUuid the user uuid of this connection document
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_connectionDocument.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this connection document.
	 *
	 * @param uuid the uuid of this connection document
	 */
	@Override
	public void setUuid(String uuid) {
		_connectionDocument.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ConnectionDocument>
		toCacheModel() {

		return _connectionDocument.toCacheModel();
	}

	@Override
	public ConnectionDocument toEscapedModel() {
		return new ConnectionDocumentWrapper(
			_connectionDocument.toEscapedModel());
	}

	@Override
	public String toString() {
		return _connectionDocument.toString();
	}

	@Override
	public ConnectionDocument toUnescapedModel() {
		return new ConnectionDocumentWrapper(
			_connectionDocument.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _connectionDocument.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ConnectionDocumentWrapper)) {
			return false;
		}

		ConnectionDocumentWrapper connectionDocumentWrapper =
			(ConnectionDocumentWrapper)object;

		if (Objects.equals(
				_connectionDocument,
				connectionDocumentWrapper._connectionDocument)) {

			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _connectionDocument.getStagedModelType();
	}

	@Override
	public ConnectionDocument getWrappedModel() {
		return _connectionDocument;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _connectionDocument.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _connectionDocument.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_connectionDocument.resetOriginalValues();
	}

	private final ConnectionDocument _connectionDocument;

}