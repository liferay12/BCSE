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
 * This class is a wrapper for {@link RequestNumberSeq}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RequestNumberSeq
 * @generated
 */
public class RequestNumberSeqWrapper
	implements ModelWrapper<RequestNumberSeq>, RequestNumberSeq {

	public RequestNumberSeqWrapper(RequestNumberSeq requestNumberSeq) {
		_requestNumberSeq = requestNumberSeq;
	}

	@Override
	public Class<?> getModelClass() {
		return RequestNumberSeq.class;
	}

	@Override
	public String getModelClassName() {
		return RequestNumberSeq.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("requestNumberSeqId", getRequestNumberSeqId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("seqDate", getSeqDate());
		attributes.put("seqNumber", getSeqNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long requestNumberSeqId = (Long)attributes.get("requestNumberSeqId");

		if (requestNumberSeqId != null) {
			setRequestNumberSeqId(requestNumberSeqId);
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

		String seqDate = (String)attributes.get("seqDate");

		if (seqDate != null) {
			setSeqDate(seqDate);
		}

		Long seqNumber = (Long)attributes.get("seqNumber");

		if (seqNumber != null) {
			setSeqNumber(seqNumber);
		}
	}

	@Override
	public Object clone() {
		return new RequestNumberSeqWrapper(
			(RequestNumberSeq)_requestNumberSeq.clone());
	}

	@Override
	public int compareTo(RequestNumberSeq requestNumberSeq) {
		return _requestNumberSeq.compareTo(requestNumberSeq);
	}

	/**
	 * Returns the company ID of this request number seq.
	 *
	 * @return the company ID of this request number seq
	 */
	@Override
	public long getCompanyId() {
		return _requestNumberSeq.getCompanyId();
	}

	/**
	 * Returns the create date of this request number seq.
	 *
	 * @return the create date of this request number seq
	 */
	@Override
	public Date getCreateDate() {
		return _requestNumberSeq.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _requestNumberSeq.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this request number seq.
	 *
	 * @return the group ID of this request number seq
	 */
	@Override
	public long getGroupId() {
		return _requestNumberSeq.getGroupId();
	}

	/**
	 * Returns the modified date of this request number seq.
	 *
	 * @return the modified date of this request number seq
	 */
	@Override
	public Date getModifiedDate() {
		return _requestNumberSeq.getModifiedDate();
	}

	/**
	 * Returns the primary key of this request number seq.
	 *
	 * @return the primary key of this request number seq
	 */
	@Override
	public long getPrimaryKey() {
		return _requestNumberSeq.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _requestNumberSeq.getPrimaryKeyObj();
	}

	/**
	 * Returns the request number seq ID of this request number seq.
	 *
	 * @return the request number seq ID of this request number seq
	 */
	@Override
	public long getRequestNumberSeqId() {
		return _requestNumberSeq.getRequestNumberSeqId();
	}

	/**
	 * Returns the seq date of this request number seq.
	 *
	 * @return the seq date of this request number seq
	 */
	@Override
	public String getSeqDate() {
		return _requestNumberSeq.getSeqDate();
	}

	/**
	 * Returns the seq number of this request number seq.
	 *
	 * @return the seq number of this request number seq
	 */
	@Override
	public long getSeqNumber() {
		return _requestNumberSeq.getSeqNumber();
	}

	/**
	 * Returns the user ID of this request number seq.
	 *
	 * @return the user ID of this request number seq
	 */
	@Override
	public long getUserId() {
		return _requestNumberSeq.getUserId();
	}

	/**
	 * Returns the user name of this request number seq.
	 *
	 * @return the user name of this request number seq
	 */
	@Override
	public String getUserName() {
		return _requestNumberSeq.getUserName();
	}

	/**
	 * Returns the user uuid of this request number seq.
	 *
	 * @return the user uuid of this request number seq
	 */
	@Override
	public String getUserUuid() {
		return _requestNumberSeq.getUserUuid();
	}

	/**
	 * Returns the uuid of this request number seq.
	 *
	 * @return the uuid of this request number seq
	 */
	@Override
	public String getUuid() {
		return _requestNumberSeq.getUuid();
	}

	@Override
	public int hashCode() {
		return _requestNumberSeq.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _requestNumberSeq.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _requestNumberSeq.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _requestNumberSeq.isNew();
	}

	@Override
	public void persist() {
		_requestNumberSeq.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_requestNumberSeq.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this request number seq.
	 *
	 * @param companyId the company ID of this request number seq
	 */
	@Override
	public void setCompanyId(long companyId) {
		_requestNumberSeq.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this request number seq.
	 *
	 * @param createDate the create date of this request number seq
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_requestNumberSeq.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_requestNumberSeq.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_requestNumberSeq.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_requestNumberSeq.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this request number seq.
	 *
	 * @param groupId the group ID of this request number seq
	 */
	@Override
	public void setGroupId(long groupId) {
		_requestNumberSeq.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this request number seq.
	 *
	 * @param modifiedDate the modified date of this request number seq
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_requestNumberSeq.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_requestNumberSeq.setNew(n);
	}

	/**
	 * Sets the primary key of this request number seq.
	 *
	 * @param primaryKey the primary key of this request number seq
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_requestNumberSeq.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_requestNumberSeq.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the request number seq ID of this request number seq.
	 *
	 * @param requestNumberSeqId the request number seq ID of this request number seq
	 */
	@Override
	public void setRequestNumberSeqId(long requestNumberSeqId) {
		_requestNumberSeq.setRequestNumberSeqId(requestNumberSeqId);
	}

	/**
	 * Sets the seq date of this request number seq.
	 *
	 * @param seqDate the seq date of this request number seq
	 */
	@Override
	public void setSeqDate(String seqDate) {
		_requestNumberSeq.setSeqDate(seqDate);
	}

	/**
	 * Sets the seq number of this request number seq.
	 *
	 * @param seqNumber the seq number of this request number seq
	 */
	@Override
	public void setSeqNumber(long seqNumber) {
		_requestNumberSeq.setSeqNumber(seqNumber);
	}

	/**
	 * Sets the user ID of this request number seq.
	 *
	 * @param userId the user ID of this request number seq
	 */
	@Override
	public void setUserId(long userId) {
		_requestNumberSeq.setUserId(userId);
	}

	/**
	 * Sets the user name of this request number seq.
	 *
	 * @param userName the user name of this request number seq
	 */
	@Override
	public void setUserName(String userName) {
		_requestNumberSeq.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this request number seq.
	 *
	 * @param userUuid the user uuid of this request number seq
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_requestNumberSeq.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this request number seq.
	 *
	 * @param uuid the uuid of this request number seq
	 */
	@Override
	public void setUuid(String uuid) {
		_requestNumberSeq.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<RequestNumberSeq>
		toCacheModel() {

		return _requestNumberSeq.toCacheModel();
	}

	@Override
	public RequestNumberSeq toEscapedModel() {
		return new RequestNumberSeqWrapper(_requestNumberSeq.toEscapedModel());
	}

	@Override
	public String toString() {
		return _requestNumberSeq.toString();
	}

	@Override
	public RequestNumberSeq toUnescapedModel() {
		return new RequestNumberSeqWrapper(
			_requestNumberSeq.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _requestNumberSeq.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RequestNumberSeqWrapper)) {
			return false;
		}

		RequestNumberSeqWrapper requestNumberSeqWrapper =
			(RequestNumberSeqWrapper)object;

		if (Objects.equals(
				_requestNumberSeq, requestNumberSeqWrapper._requestNumberSeq)) {

			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _requestNumberSeq.getStagedModelType();
	}

	@Override
	public RequestNumberSeq getWrappedModel() {
		return _requestNumberSeq;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _requestNumberSeq.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _requestNumberSeq.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_requestNumberSeq.resetOriginalValues();
	}

	private final RequestNumberSeq _requestNumberSeq;

}