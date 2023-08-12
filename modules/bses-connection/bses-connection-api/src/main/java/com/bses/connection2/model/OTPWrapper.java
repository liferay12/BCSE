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
 * This class is a wrapper for {@link OTP}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OTP
 * @generated
 */
public class OTPWrapper implements ModelWrapper<OTP>, OTP {

	public OTPWrapper(OTP otp) {
		_otp = otp;
	}

	@Override
	public Class<?> getModelClass() {
		return OTP.class;
	}

	@Override
	public String getModelClassName() {
		return OTP.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("otpId", getOtpId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("otp", getOtp());
		attributes.put("mobileNo", getMobileNo());
		attributes.put("emailId", getEmailId());
		attributes.put("expiryTime", getExpiryTime());
		attributes.put("caNumber", getCaNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long otpId = (Long)attributes.get("otpId");

		if (otpId != null) {
			setOtpId(otpId);
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

		String otp = (String)attributes.get("otp");

		if (otp != null) {
			setOtp(otp);
		}

		String mobileNo = (String)attributes.get("mobileNo");

		if (mobileNo != null) {
			setMobileNo(mobileNo);
		}

		String emailId = (String)attributes.get("emailId");

		if (emailId != null) {
			setEmailId(emailId);
		}

		Date expiryTime = (Date)attributes.get("expiryTime");

		if (expiryTime != null) {
			setExpiryTime(expiryTime);
		}

		String caNumber = (String)attributes.get("caNumber");

		if (caNumber != null) {
			setCaNumber(caNumber);
		}
	}

	@Override
	public Object clone() {
		return new OTPWrapper((OTP)_otp.clone());
	}

	@Override
	public int compareTo(OTP otp) {
		return _otp.compareTo(otp);
	}

	/**
	 * Returns the ca number of this otp.
	 *
	 * @return the ca number of this otp
	 */
	@Override
	public String getCaNumber() {
		return _otp.getCaNumber();
	}

	/**
	 * Returns the company ID of this otp.
	 *
	 * @return the company ID of this otp
	 */
	@Override
	public long getCompanyId() {
		return _otp.getCompanyId();
	}

	/**
	 * Returns the create date of this otp.
	 *
	 * @return the create date of this otp
	 */
	@Override
	public Date getCreateDate() {
		return _otp.getCreateDate();
	}

	/**
	 * Returns the email ID of this otp.
	 *
	 * @return the email ID of this otp
	 */
	@Override
	public String getEmailId() {
		return _otp.getEmailId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _otp.getExpandoBridge();
	}

	/**
	 * Returns the expiry time of this otp.
	 *
	 * @return the expiry time of this otp
	 */
	@Override
	public Date getExpiryTime() {
		return _otp.getExpiryTime();
	}

	/**
	 * Returns the group ID of this otp.
	 *
	 * @return the group ID of this otp
	 */
	@Override
	public long getGroupId() {
		return _otp.getGroupId();
	}

	/**
	 * Returns the mobile no of this otp.
	 *
	 * @return the mobile no of this otp
	 */
	@Override
	public String getMobileNo() {
		return _otp.getMobileNo();
	}

	/**
	 * Returns the modified date of this otp.
	 *
	 * @return the modified date of this otp
	 */
	@Override
	public Date getModifiedDate() {
		return _otp.getModifiedDate();
	}

	/**
	 * Returns the otp of this otp.
	 *
	 * @return the otp of this otp
	 */
	@Override
	public String getOtp() {
		return _otp.getOtp();
	}

	/**
	 * Returns the otp ID of this otp.
	 *
	 * @return the otp ID of this otp
	 */
	@Override
	public long getOtpId() {
		return _otp.getOtpId();
	}

	/**
	 * Returns the primary key of this otp.
	 *
	 * @return the primary key of this otp
	 */
	@Override
	public long getPrimaryKey() {
		return _otp.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _otp.getPrimaryKeyObj();
	}

	/**
	 * Returns the user ID of this otp.
	 *
	 * @return the user ID of this otp
	 */
	@Override
	public long getUserId() {
		return _otp.getUserId();
	}

	/**
	 * Returns the user name of this otp.
	 *
	 * @return the user name of this otp
	 */
	@Override
	public String getUserName() {
		return _otp.getUserName();
	}

	/**
	 * Returns the user uuid of this otp.
	 *
	 * @return the user uuid of this otp
	 */
	@Override
	public String getUserUuid() {
		return _otp.getUserUuid();
	}

	/**
	 * Returns the uuid of this otp.
	 *
	 * @return the uuid of this otp
	 */
	@Override
	public String getUuid() {
		return _otp.getUuid();
	}

	@Override
	public int hashCode() {
		return _otp.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _otp.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _otp.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _otp.isNew();
	}

	@Override
	public void persist() {
		_otp.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_otp.setCachedModel(cachedModel);
	}

	/**
	 * Sets the ca number of this otp.
	 *
	 * @param caNumber the ca number of this otp
	 */
	@Override
	public void setCaNumber(String caNumber) {
		_otp.setCaNumber(caNumber);
	}

	/**
	 * Sets the company ID of this otp.
	 *
	 * @param companyId the company ID of this otp
	 */
	@Override
	public void setCompanyId(long companyId) {
		_otp.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this otp.
	 *
	 * @param createDate the create date of this otp
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_otp.setCreateDate(createDate);
	}

	/**
	 * Sets the email ID of this otp.
	 *
	 * @param emailId the email ID of this otp
	 */
	@Override
	public void setEmailId(String emailId) {
		_otp.setEmailId(emailId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_otp.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_otp.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_otp.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the expiry time of this otp.
	 *
	 * @param expiryTime the expiry time of this otp
	 */
	@Override
	public void setExpiryTime(Date expiryTime) {
		_otp.setExpiryTime(expiryTime);
	}

	/**
	 * Sets the group ID of this otp.
	 *
	 * @param groupId the group ID of this otp
	 */
	@Override
	public void setGroupId(long groupId) {
		_otp.setGroupId(groupId);
	}

	/**
	 * Sets the mobile no of this otp.
	 *
	 * @param mobileNo the mobile no of this otp
	 */
	@Override
	public void setMobileNo(String mobileNo) {
		_otp.setMobileNo(mobileNo);
	}

	/**
	 * Sets the modified date of this otp.
	 *
	 * @param modifiedDate the modified date of this otp
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_otp.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_otp.setNew(n);
	}

	/**
	 * Sets the otp of this otp.
	 *
	 * @param otp the otp of this otp
	 */
	@Override
	public void setOtp(String otp) {
		_otp.setOtp(otp);
	}

	/**
	 * Sets the otp ID of this otp.
	 *
	 * @param otpId the otp ID of this otp
	 */
	@Override
	public void setOtpId(long otpId) {
		_otp.setOtpId(otpId);
	}

	/**
	 * Sets the primary key of this otp.
	 *
	 * @param primaryKey the primary key of this otp
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_otp.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_otp.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the user ID of this otp.
	 *
	 * @param userId the user ID of this otp
	 */
	@Override
	public void setUserId(long userId) {
		_otp.setUserId(userId);
	}

	/**
	 * Sets the user name of this otp.
	 *
	 * @param userName the user name of this otp
	 */
	@Override
	public void setUserName(String userName) {
		_otp.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this otp.
	 *
	 * @param userUuid the user uuid of this otp
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_otp.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this otp.
	 *
	 * @param uuid the uuid of this otp
	 */
	@Override
	public void setUuid(String uuid) {
		_otp.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OTP> toCacheModel() {
		return _otp.toCacheModel();
	}

	@Override
	public OTP toEscapedModel() {
		return new OTPWrapper(_otp.toEscapedModel());
	}

	@Override
	public String toString() {
		return _otp.toString();
	}

	@Override
	public OTP toUnescapedModel() {
		return new OTPWrapper(_otp.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _otp.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OTPWrapper)) {
			return false;
		}

		OTPWrapper otpWrapper = (OTPWrapper)object;

		if (Objects.equals(_otp, otpWrapper._otp)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _otp.getStagedModelType();
	}

	@Override
	public OTP getWrappedModel() {
		return _otp;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _otp.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _otp.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_otp.resetOriginalValues();
	}

	private final OTP _otp;

}