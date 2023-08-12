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
 * This class is used by SOAP remote services, specifically {@link com.bses.connection2.service.http.LocalityDivisionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LocalityDivisionSoap implements Serializable {

	public static LocalityDivisionSoap toSoapModel(LocalityDivision model) {
		LocalityDivisionSoap soapModel = new LocalityDivisionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setLocalityDivisionId(model.getLocalityDivisionId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setLocalityName(model.getLocalityName());
		soapModel.setDivisionCode(model.getDivisionCode());
		soapModel.setDivisionName(model.getDivisionName());
		soapModel.setComplaintCenter(model.getComplaintCenter());

		return soapModel;
	}

	public static LocalityDivisionSoap[] toSoapModels(
		LocalityDivision[] models) {

		LocalityDivisionSoap[] soapModels =
			new LocalityDivisionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LocalityDivisionSoap[][] toSoapModels(
		LocalityDivision[][] models) {

		LocalityDivisionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new LocalityDivisionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LocalityDivisionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LocalityDivisionSoap[] toSoapModels(
		List<LocalityDivision> models) {

		List<LocalityDivisionSoap> soapModels =
			new ArrayList<LocalityDivisionSoap>(models.size());

		for (LocalityDivision model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LocalityDivisionSoap[soapModels.size()]);
	}

	public LocalityDivisionSoap() {
	}

	public long getPrimaryKey() {
		return _localityDivisionId;
	}

	public void setPrimaryKey(long pk) {
		setLocalityDivisionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getLocalityDivisionId() {
		return _localityDivisionId;
	}

	public void setLocalityDivisionId(long localityDivisionId) {
		_localityDivisionId = localityDivisionId;
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

	public String getLocalityName() {
		return _localityName;
	}

	public void setLocalityName(String localityName) {
		_localityName = localityName;
	}

	public String getDivisionCode() {
		return _divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		_divisionCode = divisionCode;
	}

	public String getDivisionName() {
		return _divisionName;
	}

	public void setDivisionName(String divisionName) {
		_divisionName = divisionName;
	}

	public String getComplaintCenter() {
		return _complaintCenter;
	}

	public void setComplaintCenter(String complaintCenter) {
		_complaintCenter = complaintCenter;
	}

	private String _uuid;
	private long _localityDivisionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _localityName;
	private String _divisionCode;
	private String _divisionName;
	private String _complaintCenter;

}