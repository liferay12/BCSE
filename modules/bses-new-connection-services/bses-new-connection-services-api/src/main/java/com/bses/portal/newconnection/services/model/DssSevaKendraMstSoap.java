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

package com.bses.portal.newconnection.services.model;

import com.bses.portal.newconnection.services.service.persistence.DssSevaKendraMstPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DssSevaKendraMstSoap implements Serializable {

	public static DssSevaKendraMstSoap toSoapModel(DssSevaKendraMst model) {
		DssSevaKendraMstSoap soapModel = new DssSevaKendraMstSoap();

		soapModel.setDistrict(model.getDistrict());
		soapModel.setSkAddrP2(model.getSkAddrP2());
		soapModel.setActive(model.getActive());
		soapModel.setEntryDate(model.getEntryDate());
		soapModel.setDcMachineIp(model.getDcMachineIp());
		soapModel.setSkAddressP1(model.getSkAddressP1());
		soapModel.setTelephoneNo(model.getTelephoneNo());
		soapModel.setName(model.getName());
		soapModel.setAppoitnmentDaysInterval(
			model.getAppoitnmentDaysInterval());
		soapModel.setAppslotcount(model.getAppslotcount());
		soapModel.setGpslink(model.getGpslink());
		soapModel.setYoutubelinkenglish(model.getYoutubelinkenglish());
		soapModel.setYoutubelinkhindi(model.getYoutubelinkhindi());
		soapModel.setDskManager(model.getDskManager());
		soapModel.setDskManagerContactNo(model.getDskManagerContactNo());
		soapModel.setDskTeleCallerNo(model.getDskTeleCallerNo());
		soapModel.setDskManagerEmailId(model.getDskManagerEmailId());
		soapModel.setBusinessManager(model.getBusinessManager());
		soapModel.setBusinessManagerContactNo(
			model.getBusinessManagerContactNo());
		soapModel.setBusinessManagerEmailId(model.getBusinessManagerEmailId());
		soapModel.setAmps(model.getAmps());
		soapModel.setAmpsContactNo(model.getAmpsContactNo());
		soapModel.setAmpsEmailId(model.getAmpsEmailId());
		soapModel.setBusinessAddress(model.getBusinessAddress());

		return soapModel;
	}

	public static DssSevaKendraMstSoap[] toSoapModels(
		DssSevaKendraMst[] models) {

		DssSevaKendraMstSoap[] soapModels =
			new DssSevaKendraMstSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DssSevaKendraMstSoap[][] toSoapModels(
		DssSevaKendraMst[][] models) {

		DssSevaKendraMstSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new DssSevaKendraMstSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DssSevaKendraMstSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DssSevaKendraMstSoap[] toSoapModels(
		List<DssSevaKendraMst> models) {

		List<DssSevaKendraMstSoap> soapModels =
			new ArrayList<DssSevaKendraMstSoap>(models.size());

		for (DssSevaKendraMst model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DssSevaKendraMstSoap[soapModels.size()]);
	}

	public DssSevaKendraMstSoap() {
	}

	public DssSevaKendraMstPK getPrimaryKey() {
		return new DssSevaKendraMstPK(_district, _skAddrP2);
	}

	public void setPrimaryKey(DssSevaKendraMstPK pk) {
		setDistrict(pk.district);
		setSkAddrP2(pk.skAddrP2);
	}

	public String getDistrict() {
		return _district;
	}

	public void setDistrict(String district) {
		_district = district;
	}

	public String getSkAddrP2() {
		return _skAddrP2;
	}

	public void setSkAddrP2(String skAddrP2) {
		_skAddrP2 = skAddrP2;
	}

	public String getActive() {
		return _active;
	}

	public void setActive(String active) {
		_active = active;
	}

	public Date getEntryDate() {
		return _entryDate;
	}

	public void setEntryDate(Date entryDate) {
		_entryDate = entryDate;
	}

	public String getDcMachineIp() {
		return _dcMachineIp;
	}

	public void setDcMachineIp(String dcMachineIp) {
		_dcMachineIp = dcMachineIp;
	}

	public String getSkAddressP1() {
		return _skAddressP1;
	}

	public void setSkAddressP1(String skAddressP1) {
		_skAddressP1 = skAddressP1;
	}

	public String getTelephoneNo() {
		return _telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		_telephoneNo = telephoneNo;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Integer getAppoitnmentDaysInterval() {
		return _appoitnmentDaysInterval;
	}

	public void setAppoitnmentDaysInterval(Integer appoitnmentDaysInterval) {
		_appoitnmentDaysInterval = appoitnmentDaysInterval;
	}

	public Integer getAppslotcount() {
		return _appslotcount;
	}

	public void setAppslotcount(Integer appslotcount) {
		_appslotcount = appslotcount;
	}

	public String getGpslink() {
		return _gpslink;
	}

	public void setGpslink(String gpslink) {
		_gpslink = gpslink;
	}

	public String getYoutubelinkenglish() {
		return _youtubelinkenglish;
	}

	public void setYoutubelinkenglish(String youtubelinkenglish) {
		_youtubelinkenglish = youtubelinkenglish;
	}

	public String getYoutubelinkhindi() {
		return _youtubelinkhindi;
	}

	public void setYoutubelinkhindi(String youtubelinkhindi) {
		_youtubelinkhindi = youtubelinkhindi;
	}

	public String getDskManager() {
		return _dskManager;
	}

	public void setDskManager(String dskManager) {
		_dskManager = dskManager;
	}

	public String getDskManagerContactNo() {
		return _dskManagerContactNo;
	}

	public void setDskManagerContactNo(String dskManagerContactNo) {
		_dskManagerContactNo = dskManagerContactNo;
	}

	public String getDskTeleCallerNo() {
		return _dskTeleCallerNo;
	}

	public void setDskTeleCallerNo(String dskTeleCallerNo) {
		_dskTeleCallerNo = dskTeleCallerNo;
	}

	public String getDskManagerEmailId() {
		return _dskManagerEmailId;
	}

	public void setDskManagerEmailId(String dskManagerEmailId) {
		_dskManagerEmailId = dskManagerEmailId;
	}

	public String getBusinessManager() {
		return _businessManager;
	}

	public void setBusinessManager(String businessManager) {
		_businessManager = businessManager;
	}

	public String getBusinessManagerContactNo() {
		return _businessManagerContactNo;
	}

	public void setBusinessManagerContactNo(String businessManagerContactNo) {
		_businessManagerContactNo = businessManagerContactNo;
	}

	public String getBusinessManagerEmailId() {
		return _businessManagerEmailId;
	}

	public void setBusinessManagerEmailId(String businessManagerEmailId) {
		_businessManagerEmailId = businessManagerEmailId;
	}

	public String getAmps() {
		return _amps;
	}

	public void setAmps(String amps) {
		_amps = amps;
	}

	public String getAmpsContactNo() {
		return _ampsContactNo;
	}

	public void setAmpsContactNo(String ampsContactNo) {
		_ampsContactNo = ampsContactNo;
	}

	public String getAmpsEmailId() {
		return _ampsEmailId;
	}

	public void setAmpsEmailId(String ampsEmailId) {
		_ampsEmailId = ampsEmailId;
	}

	public String getBusinessAddress() {
		return _businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		_businessAddress = businessAddress;
	}

	private String _district;
	private String _skAddrP2;
	private String _active;
	private Date _entryDate;
	private String _dcMachineIp;
	private String _skAddressP1;
	private String _telephoneNo;
	private String _name;
	private Integer _appoitnmentDaysInterval;
	private Integer _appslotcount;
	private String _gpslink;
	private String _youtubelinkenglish;
	private String _youtubelinkhindi;
	private String _dskManager;
	private String _dskManagerContactNo;
	private String _dskTeleCallerNo;
	private String _dskManagerEmailId;
	private String _businessManager;
	private String _businessManagerContactNo;
	private String _businessManagerEmailId;
	private String _amps;
	private String _ampsContactNo;
	private String _ampsEmailId;
	private String _businessAddress;

}