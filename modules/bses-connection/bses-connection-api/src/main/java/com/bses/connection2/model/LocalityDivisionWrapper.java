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
 * This class is a wrapper for {@link LocalityDivision}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LocalityDivision
 * @generated
 */
public class LocalityDivisionWrapper
	implements LocalityDivision, ModelWrapper<LocalityDivision> {

	public LocalityDivisionWrapper(LocalityDivision localityDivision) {
		_localityDivision = localityDivision;
	}

	@Override
	public Class<?> getModelClass() {
		return LocalityDivision.class;
	}

	@Override
	public String getModelClassName() {
		return LocalityDivision.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("localityDivisionId", getLocalityDivisionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("localityName", getLocalityName());
		attributes.put("divisionCode", getDivisionCode());
		attributes.put("divisionName", getDivisionName());
		attributes.put("complaintCenter", getComplaintCenter());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long localityDivisionId = (Long)attributes.get("localityDivisionId");

		if (localityDivisionId != null) {
			setLocalityDivisionId(localityDivisionId);
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

		String localityName = (String)attributes.get("localityName");

		if (localityName != null) {
			setLocalityName(localityName);
		}

		String divisionCode = (String)attributes.get("divisionCode");

		if (divisionCode != null) {
			setDivisionCode(divisionCode);
		}

		String divisionName = (String)attributes.get("divisionName");

		if (divisionName != null) {
			setDivisionName(divisionName);
		}

		String complaintCenter = (String)attributes.get("complaintCenter");

		if (complaintCenter != null) {
			setComplaintCenter(complaintCenter);
		}
	}

	@Override
	public Object clone() {
		return new LocalityDivisionWrapper(
			(LocalityDivision)_localityDivision.clone());
	}

	@Override
	public int compareTo(LocalityDivision localityDivision) {
		return _localityDivision.compareTo(localityDivision);
	}

	/**
	 * Returns the company ID of this locality division.
	 *
	 * @return the company ID of this locality division
	 */
	@Override
	public long getCompanyId() {
		return _localityDivision.getCompanyId();
	}

	/**
	 * Returns the complaint center of this locality division.
	 *
	 * @return the complaint center of this locality division
	 */
	@Override
	public String getComplaintCenter() {
		return _localityDivision.getComplaintCenter();
	}

	/**
	 * Returns the create date of this locality division.
	 *
	 * @return the create date of this locality division
	 */
	@Override
	public Date getCreateDate() {
		return _localityDivision.getCreateDate();
	}

	/**
	 * Returns the division code of this locality division.
	 *
	 * @return the division code of this locality division
	 */
	@Override
	public String getDivisionCode() {
		return _localityDivision.getDivisionCode();
	}

	/**
	 * Returns the division name of this locality division.
	 *
	 * @return the division name of this locality division
	 */
	@Override
	public String getDivisionName() {
		return _localityDivision.getDivisionName();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _localityDivision.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this locality division.
	 *
	 * @return the group ID of this locality division
	 */
	@Override
	public long getGroupId() {
		return _localityDivision.getGroupId();
	}

	/**
	 * Returns the locality division ID of this locality division.
	 *
	 * @return the locality division ID of this locality division
	 */
	@Override
	public long getLocalityDivisionId() {
		return _localityDivision.getLocalityDivisionId();
	}

	/**
	 * Returns the locality name of this locality division.
	 *
	 * @return the locality name of this locality division
	 */
	@Override
	public String getLocalityName() {
		return _localityDivision.getLocalityName();
	}

	/**
	 * Returns the modified date of this locality division.
	 *
	 * @return the modified date of this locality division
	 */
	@Override
	public Date getModifiedDate() {
		return _localityDivision.getModifiedDate();
	}

	/**
	 * Returns the primary key of this locality division.
	 *
	 * @return the primary key of this locality division
	 */
	@Override
	public long getPrimaryKey() {
		return _localityDivision.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _localityDivision.getPrimaryKeyObj();
	}

	/**
	 * Returns the user ID of this locality division.
	 *
	 * @return the user ID of this locality division
	 */
	@Override
	public long getUserId() {
		return _localityDivision.getUserId();
	}

	/**
	 * Returns the user name of this locality division.
	 *
	 * @return the user name of this locality division
	 */
	@Override
	public String getUserName() {
		return _localityDivision.getUserName();
	}

	/**
	 * Returns the user uuid of this locality division.
	 *
	 * @return the user uuid of this locality division
	 */
	@Override
	public String getUserUuid() {
		return _localityDivision.getUserUuid();
	}

	/**
	 * Returns the uuid of this locality division.
	 *
	 * @return the uuid of this locality division
	 */
	@Override
	public String getUuid() {
		return _localityDivision.getUuid();
	}

	@Override
	public int hashCode() {
		return _localityDivision.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _localityDivision.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _localityDivision.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _localityDivision.isNew();
	}

	@Override
	public void persist() {
		_localityDivision.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_localityDivision.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this locality division.
	 *
	 * @param companyId the company ID of this locality division
	 */
	@Override
	public void setCompanyId(long companyId) {
		_localityDivision.setCompanyId(companyId);
	}

	/**
	 * Sets the complaint center of this locality division.
	 *
	 * @param complaintCenter the complaint center of this locality division
	 */
	@Override
	public void setComplaintCenter(String complaintCenter) {
		_localityDivision.setComplaintCenter(complaintCenter);
	}

	/**
	 * Sets the create date of this locality division.
	 *
	 * @param createDate the create date of this locality division
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_localityDivision.setCreateDate(createDate);
	}

	/**
	 * Sets the division code of this locality division.
	 *
	 * @param divisionCode the division code of this locality division
	 */
	@Override
	public void setDivisionCode(String divisionCode) {
		_localityDivision.setDivisionCode(divisionCode);
	}

	/**
	 * Sets the division name of this locality division.
	 *
	 * @param divisionName the division name of this locality division
	 */
	@Override
	public void setDivisionName(String divisionName) {
		_localityDivision.setDivisionName(divisionName);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_localityDivision.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_localityDivision.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_localityDivision.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this locality division.
	 *
	 * @param groupId the group ID of this locality division
	 */
	@Override
	public void setGroupId(long groupId) {
		_localityDivision.setGroupId(groupId);
	}

	/**
	 * Sets the locality division ID of this locality division.
	 *
	 * @param localityDivisionId the locality division ID of this locality division
	 */
	@Override
	public void setLocalityDivisionId(long localityDivisionId) {
		_localityDivision.setLocalityDivisionId(localityDivisionId);
	}

	/**
	 * Sets the locality name of this locality division.
	 *
	 * @param localityName the locality name of this locality division
	 */
	@Override
	public void setLocalityName(String localityName) {
		_localityDivision.setLocalityName(localityName);
	}

	/**
	 * Sets the modified date of this locality division.
	 *
	 * @param modifiedDate the modified date of this locality division
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_localityDivision.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_localityDivision.setNew(n);
	}

	/**
	 * Sets the primary key of this locality division.
	 *
	 * @param primaryKey the primary key of this locality division
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_localityDivision.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_localityDivision.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the user ID of this locality division.
	 *
	 * @param userId the user ID of this locality division
	 */
	@Override
	public void setUserId(long userId) {
		_localityDivision.setUserId(userId);
	}

	/**
	 * Sets the user name of this locality division.
	 *
	 * @param userName the user name of this locality division
	 */
	@Override
	public void setUserName(String userName) {
		_localityDivision.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this locality division.
	 *
	 * @param userUuid the user uuid of this locality division
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_localityDivision.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this locality division.
	 *
	 * @param uuid the uuid of this locality division
	 */
	@Override
	public void setUuid(String uuid) {
		_localityDivision.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<LocalityDivision>
		toCacheModel() {

		return _localityDivision.toCacheModel();
	}

	@Override
	public LocalityDivision toEscapedModel() {
		return new LocalityDivisionWrapper(_localityDivision.toEscapedModel());
	}

	@Override
	public String toString() {
		return _localityDivision.toString();
	}

	@Override
	public LocalityDivision toUnescapedModel() {
		return new LocalityDivisionWrapper(
			_localityDivision.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _localityDivision.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof LocalityDivisionWrapper)) {
			return false;
		}

		LocalityDivisionWrapper localityDivisionWrapper =
			(LocalityDivisionWrapper)object;

		if (Objects.equals(
				_localityDivision, localityDivisionWrapper._localityDivision)) {

			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _localityDivision.getStagedModelType();
	}

	@Override
	public LocalityDivision getWrappedModel() {
		return _localityDivision;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _localityDivision.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _localityDivision.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_localityDivision.resetOriginalValues();
	}

	private final LocalityDivision _localityDivision;

}