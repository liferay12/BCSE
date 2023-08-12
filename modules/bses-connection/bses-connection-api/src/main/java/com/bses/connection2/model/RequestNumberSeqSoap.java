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
 * This class is used by SOAP remote services, specifically {@link com.bses.connection2.service.http.RequestNumberSeqServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RequestNumberSeqSoap implements Serializable {

	public static RequestNumberSeqSoap toSoapModel(RequestNumberSeq model) {
		RequestNumberSeqSoap soapModel = new RequestNumberSeqSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRequestNumberSeqId(model.getRequestNumberSeqId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSeqDate(model.getSeqDate());
		soapModel.setSeqNumber(model.getSeqNumber());

		return soapModel;
	}

	public static RequestNumberSeqSoap[] toSoapModels(
		RequestNumberSeq[] models) {

		RequestNumberSeqSoap[] soapModels =
			new RequestNumberSeqSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RequestNumberSeqSoap[][] toSoapModels(
		RequestNumberSeq[][] models) {

		RequestNumberSeqSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RequestNumberSeqSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RequestNumberSeqSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RequestNumberSeqSoap[] toSoapModels(
		List<RequestNumberSeq> models) {

		List<RequestNumberSeqSoap> soapModels =
			new ArrayList<RequestNumberSeqSoap>(models.size());

		for (RequestNumberSeq model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RequestNumberSeqSoap[soapModels.size()]);
	}

	public RequestNumberSeqSoap() {
	}

	public long getPrimaryKey() {
		return _requestNumberSeqId;
	}

	public void setPrimaryKey(long pk) {
		setRequestNumberSeqId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRequestNumberSeqId() {
		return _requestNumberSeqId;
	}

	public void setRequestNumberSeqId(long requestNumberSeqId) {
		_requestNumberSeqId = requestNumberSeqId;
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

	public String getSeqDate() {
		return _seqDate;
	}

	public void setSeqDate(String seqDate) {
		_seqDate = seqDate;
	}

	public long getSeqNumber() {
		return _seqNumber;
	}

	public void setSeqNumber(long seqNumber) {
		_seqNumber = seqNumber;
	}

	private String _uuid;
	private long _requestNumberSeqId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _seqDate;
	private long _seqNumber;

}