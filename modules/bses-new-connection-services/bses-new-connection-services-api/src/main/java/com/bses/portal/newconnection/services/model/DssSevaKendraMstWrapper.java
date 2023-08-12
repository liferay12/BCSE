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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link DssSevaKendraMst}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DssSevaKendraMst
 * @generated
 */
public class DssSevaKendraMstWrapper
	implements DssSevaKendraMst, ModelWrapper<DssSevaKendraMst> {

	public DssSevaKendraMstWrapper(DssSevaKendraMst dssSevaKendraMst) {
		_dssSevaKendraMst = dssSevaKendraMst;
	}

	@Override
	public Class<?> getModelClass() {
		return DssSevaKendraMst.class;
	}

	@Override
	public String getModelClassName() {
		return DssSevaKendraMst.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("district", getDistrict());
		attributes.put("skAddrP2", getSkAddrP2());
		attributes.put("active", getActive());
		attributes.put("entryDate", getEntryDate());
		attributes.put("dcMachineIp", getDcMachineIp());
		attributes.put("skAddressP1", getSkAddressP1());
		attributes.put("telephoneNo", getTelephoneNo());
		attributes.put("name", getName());
		attributes.put("appoitnmentDaysInterval", getAppoitnmentDaysInterval());
		attributes.put("appslotcount", getAppslotcount());
		attributes.put("gpslink", getGpslink());
		attributes.put("youtubelinkenglish", getYoutubelinkenglish());
		attributes.put("youtubelinkhindi", getYoutubelinkhindi());
		attributes.put("dskManager", getDskManager());
		attributes.put("dskManagerContactNo", getDskManagerContactNo());
		attributes.put("dskTeleCallerNo", getDskTeleCallerNo());
		attributes.put("dskManagerEmailId", getDskManagerEmailId());
		attributes.put("businessManager", getBusinessManager());
		attributes.put(
			"businessManagerContactNo", getBusinessManagerContactNo());
		attributes.put("businessManagerEmailId", getBusinessManagerEmailId());
		attributes.put("amps", getAmps());
		attributes.put("ampsContactNo", getAmpsContactNo());
		attributes.put("ampsEmailId", getAmpsEmailId());
		attributes.put("businessAddress", getBusinessAddress());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String district = (String)attributes.get("district");

		if (district != null) {
			setDistrict(district);
		}

		String skAddrP2 = (String)attributes.get("skAddrP2");

		if (skAddrP2 != null) {
			setSkAddrP2(skAddrP2);
		}

		String active = (String)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Date entryDate = (Date)attributes.get("entryDate");

		if (entryDate != null) {
			setEntryDate(entryDate);
		}

		String dcMachineIp = (String)attributes.get("dcMachineIp");

		if (dcMachineIp != null) {
			setDcMachineIp(dcMachineIp);
		}

		String skAddressP1 = (String)attributes.get("skAddressP1");

		if (skAddressP1 != null) {
			setSkAddressP1(skAddressP1);
		}

		String telephoneNo = (String)attributes.get("telephoneNo");

		if (telephoneNo != null) {
			setTelephoneNo(telephoneNo);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Integer appoitnmentDaysInterval = (Integer)attributes.get(
			"appoitnmentDaysInterval");

		if (appoitnmentDaysInterval != null) {
			setAppoitnmentDaysInterval(appoitnmentDaysInterval);
		}

		Integer appslotcount = (Integer)attributes.get("appslotcount");

		if (appslotcount != null) {
			setAppslotcount(appslotcount);
		}

		String gpslink = (String)attributes.get("gpslink");

		if (gpslink != null) {
			setGpslink(gpslink);
		}

		String youtubelinkenglish = (String)attributes.get(
			"youtubelinkenglish");

		if (youtubelinkenglish != null) {
			setYoutubelinkenglish(youtubelinkenglish);
		}

		String youtubelinkhindi = (String)attributes.get("youtubelinkhindi");

		if (youtubelinkhindi != null) {
			setYoutubelinkhindi(youtubelinkhindi);
		}

		String dskManager = (String)attributes.get("dskManager");

		if (dskManager != null) {
			setDskManager(dskManager);
		}

		String dskManagerContactNo = (String)attributes.get(
			"dskManagerContactNo");

		if (dskManagerContactNo != null) {
			setDskManagerContactNo(dskManagerContactNo);
		}

		String dskTeleCallerNo = (String)attributes.get("dskTeleCallerNo");

		if (dskTeleCallerNo != null) {
			setDskTeleCallerNo(dskTeleCallerNo);
		}

		String dskManagerEmailId = (String)attributes.get("dskManagerEmailId");

		if (dskManagerEmailId != null) {
			setDskManagerEmailId(dskManagerEmailId);
		}

		String businessManager = (String)attributes.get("businessManager");

		if (businessManager != null) {
			setBusinessManager(businessManager);
		}

		String businessManagerContactNo = (String)attributes.get(
			"businessManagerContactNo");

		if (businessManagerContactNo != null) {
			setBusinessManagerContactNo(businessManagerContactNo);
		}

		String businessManagerEmailId = (String)attributes.get(
			"businessManagerEmailId");

		if (businessManagerEmailId != null) {
			setBusinessManagerEmailId(businessManagerEmailId);
		}

		String amps = (String)attributes.get("amps");

		if (amps != null) {
			setAmps(amps);
		}

		String ampsContactNo = (String)attributes.get("ampsContactNo");

		if (ampsContactNo != null) {
			setAmpsContactNo(ampsContactNo);
		}

		String ampsEmailId = (String)attributes.get("ampsEmailId");

		if (ampsEmailId != null) {
			setAmpsEmailId(ampsEmailId);
		}

		String businessAddress = (String)attributes.get("businessAddress");

		if (businessAddress != null) {
			setBusinessAddress(businessAddress);
		}
	}

	@Override
	public Object clone() {
		return new DssSevaKendraMstWrapper(
			(DssSevaKendraMst)_dssSevaKendraMst.clone());
	}

	@Override
	public int compareTo(DssSevaKendraMst dssSevaKendraMst) {
		return _dssSevaKendraMst.compareTo(dssSevaKendraMst);
	}

	/**
	 * Returns the active of this dss seva kendra mst.
	 *
	 * @return the active of this dss seva kendra mst
	 */
	@Override
	public String getActive() {
		return _dssSevaKendraMst.getActive();
	}

	/**
	 * Returns the amps of this dss seva kendra mst.
	 *
	 * @return the amps of this dss seva kendra mst
	 */
	@Override
	public String getAmps() {
		return _dssSevaKendraMst.getAmps();
	}

	/**
	 * Returns the amps contact no of this dss seva kendra mst.
	 *
	 * @return the amps contact no of this dss seva kendra mst
	 */
	@Override
	public String getAmpsContactNo() {
		return _dssSevaKendraMst.getAmpsContactNo();
	}

	/**
	 * Returns the amps email ID of this dss seva kendra mst.
	 *
	 * @return the amps email ID of this dss seva kendra mst
	 */
	@Override
	public String getAmpsEmailId() {
		return _dssSevaKendraMst.getAmpsEmailId();
	}

	/**
	 * Returns the appoitnment days interval of this dss seva kendra mst.
	 *
	 * @return the appoitnment days interval of this dss seva kendra mst
	 */
	@Override
	public Integer getAppoitnmentDaysInterval() {
		return _dssSevaKendraMst.getAppoitnmentDaysInterval();
	}

	/**
	 * Returns the appslotcount of this dss seva kendra mst.
	 *
	 * @return the appslotcount of this dss seva kendra mst
	 */
	@Override
	public Integer getAppslotcount() {
		return _dssSevaKendraMst.getAppslotcount();
	}

	/**
	 * Returns the business address of this dss seva kendra mst.
	 *
	 * @return the business address of this dss seva kendra mst
	 */
	@Override
	public String getBusinessAddress() {
		return _dssSevaKendraMst.getBusinessAddress();
	}

	/**
	 * Returns the business manager of this dss seva kendra mst.
	 *
	 * @return the business manager of this dss seva kendra mst
	 */
	@Override
	public String getBusinessManager() {
		return _dssSevaKendraMst.getBusinessManager();
	}

	/**
	 * Returns the business manager contact no of this dss seva kendra mst.
	 *
	 * @return the business manager contact no of this dss seva kendra mst
	 */
	@Override
	public String getBusinessManagerContactNo() {
		return _dssSevaKendraMst.getBusinessManagerContactNo();
	}

	/**
	 * Returns the business manager email ID of this dss seva kendra mst.
	 *
	 * @return the business manager email ID of this dss seva kendra mst
	 */
	@Override
	public String getBusinessManagerEmailId() {
		return _dssSevaKendraMst.getBusinessManagerEmailId();
	}

	/**
	 * Returns the dc machine ip of this dss seva kendra mst.
	 *
	 * @return the dc machine ip of this dss seva kendra mst
	 */
	@Override
	public String getDcMachineIp() {
		return _dssSevaKendraMst.getDcMachineIp();
	}

	/**
	 * Returns the district of this dss seva kendra mst.
	 *
	 * @return the district of this dss seva kendra mst
	 */
	@Override
	public String getDistrict() {
		return _dssSevaKendraMst.getDistrict();
	}

	/**
	 * Returns the dsk manager of this dss seva kendra mst.
	 *
	 * @return the dsk manager of this dss seva kendra mst
	 */
	@Override
	public String getDskManager() {
		return _dssSevaKendraMst.getDskManager();
	}

	/**
	 * Returns the dsk manager contact no of this dss seva kendra mst.
	 *
	 * @return the dsk manager contact no of this dss seva kendra mst
	 */
	@Override
	public String getDskManagerContactNo() {
		return _dssSevaKendraMst.getDskManagerContactNo();
	}

	/**
	 * Returns the dsk manager email ID of this dss seva kendra mst.
	 *
	 * @return the dsk manager email ID of this dss seva kendra mst
	 */
	@Override
	public String getDskManagerEmailId() {
		return _dssSevaKendraMst.getDskManagerEmailId();
	}

	/**
	 * Returns the dsk tele caller no of this dss seva kendra mst.
	 *
	 * @return the dsk tele caller no of this dss seva kendra mst
	 */
	@Override
	public String getDskTeleCallerNo() {
		return _dssSevaKendraMst.getDskTeleCallerNo();
	}

	/**
	 * Returns the entry date of this dss seva kendra mst.
	 *
	 * @return the entry date of this dss seva kendra mst
	 */
	@Override
	public Date getEntryDate() {
		return _dssSevaKendraMst.getEntryDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dssSevaKendraMst.getExpandoBridge();
	}

	/**
	 * Returns the gpslink of this dss seva kendra mst.
	 *
	 * @return the gpslink of this dss seva kendra mst
	 */
	@Override
	public String getGpslink() {
		return _dssSevaKendraMst.getGpslink();
	}

	/**
	 * Returns the name of this dss seva kendra mst.
	 *
	 * @return the name of this dss seva kendra mst
	 */
	@Override
	public String getName() {
		return _dssSevaKendraMst.getName();
	}

	/**
	 * Returns the primary key of this dss seva kendra mst.
	 *
	 * @return the primary key of this dss seva kendra mst
	 */
	@Override
	public com.bses.portal.newconnection.services.service.persistence.
		DssSevaKendraMstPK getPrimaryKey() {

		return _dssSevaKendraMst.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dssSevaKendraMst.getPrimaryKeyObj();
	}

	/**
	 * Returns the sk address p1 of this dss seva kendra mst.
	 *
	 * @return the sk address p1 of this dss seva kendra mst
	 */
	@Override
	public String getSkAddressP1() {
		return _dssSevaKendraMst.getSkAddressP1();
	}

	/**
	 * Returns the sk addr p2 of this dss seva kendra mst.
	 *
	 * @return the sk addr p2 of this dss seva kendra mst
	 */
	@Override
	public String getSkAddrP2() {
		return _dssSevaKendraMst.getSkAddrP2();
	}

	/**
	 * Returns the telephone no of this dss seva kendra mst.
	 *
	 * @return the telephone no of this dss seva kendra mst
	 */
	@Override
	public String getTelephoneNo() {
		return _dssSevaKendraMst.getTelephoneNo();
	}

	/**
	 * Returns the youtubelinkenglish of this dss seva kendra mst.
	 *
	 * @return the youtubelinkenglish of this dss seva kendra mst
	 */
	@Override
	public String getYoutubelinkenglish() {
		return _dssSevaKendraMst.getYoutubelinkenglish();
	}

	/**
	 * Returns the youtubelinkhindi of this dss seva kendra mst.
	 *
	 * @return the youtubelinkhindi of this dss seva kendra mst
	 */
	@Override
	public String getYoutubelinkhindi() {
		return _dssSevaKendraMst.getYoutubelinkhindi();
	}

	@Override
	public int hashCode() {
		return _dssSevaKendraMst.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _dssSevaKendraMst.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dssSevaKendraMst.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dssSevaKendraMst.isNew();
	}

	@Override
	public void persist() {
		_dssSevaKendraMst.persist();
	}

	/**
	 * Sets the active of this dss seva kendra mst.
	 *
	 * @param active the active of this dss seva kendra mst
	 */
	@Override
	public void setActive(String active) {
		_dssSevaKendraMst.setActive(active);
	}

	/**
	 * Sets the amps of this dss seva kendra mst.
	 *
	 * @param amps the amps of this dss seva kendra mst
	 */
	@Override
	public void setAmps(String amps) {
		_dssSevaKendraMst.setAmps(amps);
	}

	/**
	 * Sets the amps contact no of this dss seva kendra mst.
	 *
	 * @param ampsContactNo the amps contact no of this dss seva kendra mst
	 */
	@Override
	public void setAmpsContactNo(String ampsContactNo) {
		_dssSevaKendraMst.setAmpsContactNo(ampsContactNo);
	}

	/**
	 * Sets the amps email ID of this dss seva kendra mst.
	 *
	 * @param ampsEmailId the amps email ID of this dss seva kendra mst
	 */
	@Override
	public void setAmpsEmailId(String ampsEmailId) {
		_dssSevaKendraMst.setAmpsEmailId(ampsEmailId);
	}

	/**
	 * Sets the appoitnment days interval of this dss seva kendra mst.
	 *
	 * @param appoitnmentDaysInterval the appoitnment days interval of this dss seva kendra mst
	 */
	@Override
	public void setAppoitnmentDaysInterval(Integer appoitnmentDaysInterval) {
		_dssSevaKendraMst.setAppoitnmentDaysInterval(appoitnmentDaysInterval);
	}

	/**
	 * Sets the appslotcount of this dss seva kendra mst.
	 *
	 * @param appslotcount the appslotcount of this dss seva kendra mst
	 */
	@Override
	public void setAppslotcount(Integer appslotcount) {
		_dssSevaKendraMst.setAppslotcount(appslotcount);
	}

	/**
	 * Sets the business address of this dss seva kendra mst.
	 *
	 * @param businessAddress the business address of this dss seva kendra mst
	 */
	@Override
	public void setBusinessAddress(String businessAddress) {
		_dssSevaKendraMst.setBusinessAddress(businessAddress);
	}

	/**
	 * Sets the business manager of this dss seva kendra mst.
	 *
	 * @param businessManager the business manager of this dss seva kendra mst
	 */
	@Override
	public void setBusinessManager(String businessManager) {
		_dssSevaKendraMst.setBusinessManager(businessManager);
	}

	/**
	 * Sets the business manager contact no of this dss seva kendra mst.
	 *
	 * @param businessManagerContactNo the business manager contact no of this dss seva kendra mst
	 */
	@Override
	public void setBusinessManagerContactNo(String businessManagerContactNo) {
		_dssSevaKendraMst.setBusinessManagerContactNo(businessManagerContactNo);
	}

	/**
	 * Sets the business manager email ID of this dss seva kendra mst.
	 *
	 * @param businessManagerEmailId the business manager email ID of this dss seva kendra mst
	 */
	@Override
	public void setBusinessManagerEmailId(String businessManagerEmailId) {
		_dssSevaKendraMst.setBusinessManagerEmailId(businessManagerEmailId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dssSevaKendraMst.setCachedModel(cachedModel);
	}

	/**
	 * Sets the dc machine ip of this dss seva kendra mst.
	 *
	 * @param dcMachineIp the dc machine ip of this dss seva kendra mst
	 */
	@Override
	public void setDcMachineIp(String dcMachineIp) {
		_dssSevaKendraMst.setDcMachineIp(dcMachineIp);
	}

	/**
	 * Sets the district of this dss seva kendra mst.
	 *
	 * @param district the district of this dss seva kendra mst
	 */
	@Override
	public void setDistrict(String district) {
		_dssSevaKendraMst.setDistrict(district);
	}

	/**
	 * Sets the dsk manager of this dss seva kendra mst.
	 *
	 * @param dskManager the dsk manager of this dss seva kendra mst
	 */
	@Override
	public void setDskManager(String dskManager) {
		_dssSevaKendraMst.setDskManager(dskManager);
	}

	/**
	 * Sets the dsk manager contact no of this dss seva kendra mst.
	 *
	 * @param dskManagerContactNo the dsk manager contact no of this dss seva kendra mst
	 */
	@Override
	public void setDskManagerContactNo(String dskManagerContactNo) {
		_dssSevaKendraMst.setDskManagerContactNo(dskManagerContactNo);
	}

	/**
	 * Sets the dsk manager email ID of this dss seva kendra mst.
	 *
	 * @param dskManagerEmailId the dsk manager email ID of this dss seva kendra mst
	 */
	@Override
	public void setDskManagerEmailId(String dskManagerEmailId) {
		_dssSevaKendraMst.setDskManagerEmailId(dskManagerEmailId);
	}

	/**
	 * Sets the dsk tele caller no of this dss seva kendra mst.
	 *
	 * @param dskTeleCallerNo the dsk tele caller no of this dss seva kendra mst
	 */
	@Override
	public void setDskTeleCallerNo(String dskTeleCallerNo) {
		_dssSevaKendraMst.setDskTeleCallerNo(dskTeleCallerNo);
	}

	/**
	 * Sets the entry date of this dss seva kendra mst.
	 *
	 * @param entryDate the entry date of this dss seva kendra mst
	 */
	@Override
	public void setEntryDate(Date entryDate) {
		_dssSevaKendraMst.setEntryDate(entryDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_dssSevaKendraMst.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dssSevaKendraMst.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dssSevaKendraMst.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the gpslink of this dss seva kendra mst.
	 *
	 * @param gpslink the gpslink of this dss seva kendra mst
	 */
	@Override
	public void setGpslink(String gpslink) {
		_dssSevaKendraMst.setGpslink(gpslink);
	}

	/**
	 * Sets the name of this dss seva kendra mst.
	 *
	 * @param name the name of this dss seva kendra mst
	 */
	@Override
	public void setName(String name) {
		_dssSevaKendraMst.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_dssSevaKendraMst.setNew(n);
	}

	/**
	 * Sets the primary key of this dss seva kendra mst.
	 *
	 * @param primaryKey the primary key of this dss seva kendra mst
	 */
	@Override
	public void setPrimaryKey(
		com.bses.portal.newconnection.services.service.persistence.
			DssSevaKendraMstPK primaryKey) {

		_dssSevaKendraMst.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dssSevaKendraMst.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the sk address p1 of this dss seva kendra mst.
	 *
	 * @param skAddressP1 the sk address p1 of this dss seva kendra mst
	 */
	@Override
	public void setSkAddressP1(String skAddressP1) {
		_dssSevaKendraMst.setSkAddressP1(skAddressP1);
	}

	/**
	 * Sets the sk addr p2 of this dss seva kendra mst.
	 *
	 * @param skAddrP2 the sk addr p2 of this dss seva kendra mst
	 */
	@Override
	public void setSkAddrP2(String skAddrP2) {
		_dssSevaKendraMst.setSkAddrP2(skAddrP2);
	}

	/**
	 * Sets the telephone no of this dss seva kendra mst.
	 *
	 * @param telephoneNo the telephone no of this dss seva kendra mst
	 */
	@Override
	public void setTelephoneNo(String telephoneNo) {
		_dssSevaKendraMst.setTelephoneNo(telephoneNo);
	}

	/**
	 * Sets the youtubelinkenglish of this dss seva kendra mst.
	 *
	 * @param youtubelinkenglish the youtubelinkenglish of this dss seva kendra mst
	 */
	@Override
	public void setYoutubelinkenglish(String youtubelinkenglish) {
		_dssSevaKendraMst.setYoutubelinkenglish(youtubelinkenglish);
	}

	/**
	 * Sets the youtubelinkhindi of this dss seva kendra mst.
	 *
	 * @param youtubelinkhindi the youtubelinkhindi of this dss seva kendra mst
	 */
	@Override
	public void setYoutubelinkhindi(String youtubelinkhindi) {
		_dssSevaKendraMst.setYoutubelinkhindi(youtubelinkhindi);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<DssSevaKendraMst>
		toCacheModel() {

		return _dssSevaKendraMst.toCacheModel();
	}

	@Override
	public DssSevaKendraMst toEscapedModel() {
		return new DssSevaKendraMstWrapper(_dssSevaKendraMst.toEscapedModel());
	}

	@Override
	public String toString() {
		return _dssSevaKendraMst.toString();
	}

	@Override
	public DssSevaKendraMst toUnescapedModel() {
		return new DssSevaKendraMstWrapper(
			_dssSevaKendraMst.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _dssSevaKendraMst.toXmlString();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DssSevaKendraMstWrapper)) {
			return false;
		}

		DssSevaKendraMstWrapper dssSevaKendraMstWrapper =
			(DssSevaKendraMstWrapper)object;

		if (Objects.equals(
				_dssSevaKendraMst, dssSevaKendraMstWrapper._dssSevaKendraMst)) {

			return true;
		}

		return false;
	}

	@Override
	public DssSevaKendraMst getWrappedModel() {
		return _dssSevaKendraMst;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dssSevaKendraMst.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dssSevaKendraMst.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dssSevaKendraMst.resetOriginalValues();
	}

	private final DssSevaKendraMst _dssSevaKendraMst;

}