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
 * This class is used by SOAP remote services, specifically {@link com.bses.connection2.service.http.OTPServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class OTPSoap implements Serializable {

	public static OTPSoap toSoapModel(OTP model) {
		OTPSoap soapModel = new OTPSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setOtpId(model.getOtpId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOtp(model.getOtp());
		soapModel.setMobileNo(model.getMobileNo());
		soapModel.setEmailId(model.getEmailId());
		soapModel.setExpiryTime(model.getExpiryTime());
		soapModel.setCaNumber(model.getCaNumber());

		return soapModel;
	}

	public static OTPSoap[] toSoapModels(OTP[] models) {
		OTPSoap[] soapModels = new OTPSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OTPSoap[][] toSoapModels(OTP[][] models) {
		OTPSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OTPSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OTPSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OTPSoap[] toSoapModels(List<OTP> models) {
		List<OTPSoap> soapModels = new ArrayList<OTPSoap>(models.size());

		for (OTP model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OTPSoap[soapModels.size()]);
	}

	public OTPSoap() {
	}

	public long getPrimaryKey() {
		return _otpId;
	}

	public void setPrimaryKey(long pk) {
		setOtpId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getOtpId() {
		return _otpId;
	}

	public void setOtpId(long otpId) {
		_otpId = otpId;
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

	public String getOtp() {
		return _otp;
	}

	public void setOtp(String otp) {
		_otp = otp;
	}

	public String getMobileNo() {
		return _mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		_mobileNo = mobileNo;
	}

	public String getEmailId() {
		return _emailId;
	}

	public void setEmailId(String emailId) {
		_emailId = emailId;
	}

	public Date getExpiryTime() {
		return _expiryTime;
	}

	public void setExpiryTime(Date expiryTime) {
		_expiryTime = expiryTime;
	}

	public String getCaNumber() {
		return _caNumber;
	}

	public void setCaNumber(String caNumber) {
		_caNumber = caNumber;
	}

	private String _uuid;
	private long _otpId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _otp;
	private String _mobileNo;
	private String _emailId;
	private Date _expiryTime;
	private String _caNumber;

}