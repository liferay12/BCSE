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

package com.bses.portal.newconnection.services.model.impl;

import com.bses.portal.newconnection.services.model.DssSevaKendraMst;
import com.bses.portal.newconnection.services.service.persistence.DssSevaKendraMstPK;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DssSevaKendraMst in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DssSevaKendraMstCacheModel
	implements CacheModel<DssSevaKendraMst>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DssSevaKendraMstCacheModel)) {
			return false;
		}

		DssSevaKendraMstCacheModel dssSevaKendraMstCacheModel =
			(DssSevaKendraMstCacheModel)object;

		if (dssSevaKendraMstPK.equals(
				dssSevaKendraMstCacheModel.dssSevaKendraMstPK)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, dssSevaKendraMstPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{district=");
		sb.append(district);
		sb.append(", skAddrP2=");
		sb.append(skAddrP2);
		sb.append(", active=");
		sb.append(active);
		sb.append(", entryDate=");
		sb.append(entryDate);
		sb.append(", dcMachineIp=");
		sb.append(dcMachineIp);
		sb.append(", skAddressP1=");
		sb.append(skAddressP1);
		sb.append(", telephoneNo=");
		sb.append(telephoneNo);
		sb.append(", name=");
		sb.append(name);
		sb.append(", appoitnmentDaysInterval=");
		sb.append(appoitnmentDaysInterval);
		sb.append(", appslotcount=");
		sb.append(appslotcount);
		sb.append(", gpslink=");
		sb.append(gpslink);
		sb.append(", youtubelinkenglish=");
		sb.append(youtubelinkenglish);
		sb.append(", youtubelinkhindi=");
		sb.append(youtubelinkhindi);
		sb.append(", dskManager=");
		sb.append(dskManager);
		sb.append(", dskManagerContactNo=");
		sb.append(dskManagerContactNo);
		sb.append(", dskTeleCallerNo=");
		sb.append(dskTeleCallerNo);
		sb.append(", dskManagerEmailId=");
		sb.append(dskManagerEmailId);
		sb.append(", businessManager=");
		sb.append(businessManager);
		sb.append(", businessManagerContactNo=");
		sb.append(businessManagerContactNo);
		sb.append(", businessManagerEmailId=");
		sb.append(businessManagerEmailId);
		sb.append(", amps=");
		sb.append(amps);
		sb.append(", ampsContactNo=");
		sb.append(ampsContactNo);
		sb.append(", ampsEmailId=");
		sb.append(ampsEmailId);
		sb.append(", businessAddress=");
		sb.append(businessAddress);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DssSevaKendraMst toEntityModel() {
		DssSevaKendraMstImpl dssSevaKendraMstImpl = new DssSevaKendraMstImpl();

		if (district == null) {
			dssSevaKendraMstImpl.setDistrict("");
		}
		else {
			dssSevaKendraMstImpl.setDistrict(district);
		}

		if (skAddrP2 == null) {
			dssSevaKendraMstImpl.setSkAddrP2("");
		}
		else {
			dssSevaKendraMstImpl.setSkAddrP2(skAddrP2);
		}

		if (active == null) {
			dssSevaKendraMstImpl.setActive("");
		}
		else {
			dssSevaKendraMstImpl.setActive(active);
		}

		if (entryDate == Long.MIN_VALUE) {
			dssSevaKendraMstImpl.setEntryDate(null);
		}
		else {
			dssSevaKendraMstImpl.setEntryDate(new Date(entryDate));
		}

		if (dcMachineIp == null) {
			dssSevaKendraMstImpl.setDcMachineIp("");
		}
		else {
			dssSevaKendraMstImpl.setDcMachineIp(dcMachineIp);
		}

		if (skAddressP1 == null) {
			dssSevaKendraMstImpl.setSkAddressP1("");
		}
		else {
			dssSevaKendraMstImpl.setSkAddressP1(skAddressP1);
		}

		if (telephoneNo == null) {
			dssSevaKendraMstImpl.setTelephoneNo("");
		}
		else {
			dssSevaKendraMstImpl.setTelephoneNo(telephoneNo);
		}

		if (name == null) {
			dssSevaKendraMstImpl.setName("");
		}
		else {
			dssSevaKendraMstImpl.setName(name);
		}

		dssSevaKendraMstImpl.setAppoitnmentDaysInterval(
			appoitnmentDaysInterval);
		dssSevaKendraMstImpl.setAppslotcount(appslotcount);

		if (gpslink == null) {
			dssSevaKendraMstImpl.setGpslink("");
		}
		else {
			dssSevaKendraMstImpl.setGpslink(gpslink);
		}

		if (youtubelinkenglish == null) {
			dssSevaKendraMstImpl.setYoutubelinkenglish("");
		}
		else {
			dssSevaKendraMstImpl.setYoutubelinkenglish(youtubelinkenglish);
		}

		if (youtubelinkhindi == null) {
			dssSevaKendraMstImpl.setYoutubelinkhindi("");
		}
		else {
			dssSevaKendraMstImpl.setYoutubelinkhindi(youtubelinkhindi);
		}

		if (dskManager == null) {
			dssSevaKendraMstImpl.setDskManager("");
		}
		else {
			dssSevaKendraMstImpl.setDskManager(dskManager);
		}

		if (dskManagerContactNo == null) {
			dssSevaKendraMstImpl.setDskManagerContactNo("");
		}
		else {
			dssSevaKendraMstImpl.setDskManagerContactNo(dskManagerContactNo);
		}

		if (dskTeleCallerNo == null) {
			dssSevaKendraMstImpl.setDskTeleCallerNo("");
		}
		else {
			dssSevaKendraMstImpl.setDskTeleCallerNo(dskTeleCallerNo);
		}

		if (dskManagerEmailId == null) {
			dssSevaKendraMstImpl.setDskManagerEmailId("");
		}
		else {
			dssSevaKendraMstImpl.setDskManagerEmailId(dskManagerEmailId);
		}

		if (businessManager == null) {
			dssSevaKendraMstImpl.setBusinessManager("");
		}
		else {
			dssSevaKendraMstImpl.setBusinessManager(businessManager);
		}

		if (businessManagerContactNo == null) {
			dssSevaKendraMstImpl.setBusinessManagerContactNo("");
		}
		else {
			dssSevaKendraMstImpl.setBusinessManagerContactNo(
				businessManagerContactNo);
		}

		if (businessManagerEmailId == null) {
			dssSevaKendraMstImpl.setBusinessManagerEmailId("");
		}
		else {
			dssSevaKendraMstImpl.setBusinessManagerEmailId(
				businessManagerEmailId);
		}

		if (amps == null) {
			dssSevaKendraMstImpl.setAmps("");
		}
		else {
			dssSevaKendraMstImpl.setAmps(amps);
		}

		if (ampsContactNo == null) {
			dssSevaKendraMstImpl.setAmpsContactNo("");
		}
		else {
			dssSevaKendraMstImpl.setAmpsContactNo(ampsContactNo);
		}

		if (ampsEmailId == null) {
			dssSevaKendraMstImpl.setAmpsEmailId("");
		}
		else {
			dssSevaKendraMstImpl.setAmpsEmailId(ampsEmailId);
		}

		if (businessAddress == null) {
			dssSevaKendraMstImpl.setBusinessAddress("");
		}
		else {
			dssSevaKendraMstImpl.setBusinessAddress(businessAddress);
		}

		dssSevaKendraMstImpl.resetOriginalValues();

		return dssSevaKendraMstImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		district = objectInput.readUTF();
		skAddrP2 = objectInput.readUTF();
		active = objectInput.readUTF();
		entryDate = objectInput.readLong();
		dcMachineIp = objectInput.readUTF();
		skAddressP1 = objectInput.readUTF();
		telephoneNo = objectInput.readUTF();
		name = objectInput.readUTF();

		appoitnmentDaysInterval = objectInput.readInt();

		appslotcount = objectInput.readInt();
		gpslink = objectInput.readUTF();
		youtubelinkenglish = objectInput.readUTF();
		youtubelinkhindi = objectInput.readUTF();
		dskManager = objectInput.readUTF();
		dskManagerContactNo = objectInput.readUTF();
		dskTeleCallerNo = objectInput.readUTF();
		dskManagerEmailId = objectInput.readUTF();
		businessManager = objectInput.readUTF();
		businessManagerContactNo = objectInput.readUTF();
		businessManagerEmailId = objectInput.readUTF();
		amps = objectInput.readUTF();
		ampsContactNo = objectInput.readUTF();
		ampsEmailId = objectInput.readUTF();
		businessAddress = objectInput.readUTF();

		dssSevaKendraMstPK = new DssSevaKendraMstPK(district, skAddrP2);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (district == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(district);
		}

		if (skAddrP2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(skAddrP2);
		}

		if (active == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(active);
		}

		objectOutput.writeLong(entryDate);

		if (dcMachineIp == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dcMachineIp);
		}

		if (skAddressP1 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(skAddressP1);
		}

		if (telephoneNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(telephoneNo);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeInt(appoitnmentDaysInterval);

		objectOutput.writeInt(appslotcount);

		if (gpslink == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gpslink);
		}

		if (youtubelinkenglish == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(youtubelinkenglish);
		}

		if (youtubelinkhindi == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(youtubelinkhindi);
		}

		if (dskManager == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dskManager);
		}

		if (dskManagerContactNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dskManagerContactNo);
		}

		if (dskTeleCallerNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dskTeleCallerNo);
		}

		if (dskManagerEmailId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dskManagerEmailId);
		}

		if (businessManager == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessManager);
		}

		if (businessManagerContactNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessManagerContactNo);
		}

		if (businessManagerEmailId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessManagerEmailId);
		}

		if (amps == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(amps);
		}

		if (ampsContactNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ampsContactNo);
		}

		if (ampsEmailId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ampsEmailId);
		}

		if (businessAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(businessAddress);
		}
	}

	public String district;
	public String skAddrP2;
	public String active;
	public long entryDate;
	public String dcMachineIp;
	public String skAddressP1;
	public String telephoneNo;
	public String name;
	public int appoitnmentDaysInterval;
	public int appslotcount;
	public String gpslink;
	public String youtubelinkenglish;
	public String youtubelinkhindi;
	public String dskManager;
	public String dskManagerContactNo;
	public String dskTeleCallerNo;
	public String dskManagerEmailId;
	public String businessManager;
	public String businessManagerContactNo;
	public String businessManagerEmailId;
	public String amps;
	public String ampsContactNo;
	public String ampsEmailId;
	public String businessAddress;
	public transient DssSevaKendraMstPK dssSevaKendraMstPK;

}