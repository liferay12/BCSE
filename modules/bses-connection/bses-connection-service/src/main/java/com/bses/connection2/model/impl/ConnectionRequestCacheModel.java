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

package com.bses.connection2.model.impl;

import com.bses.connection2.model.ConnectionRequest;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ConnectionRequest in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ConnectionRequestCacheModel
	implements CacheModel<ConnectionRequest>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ConnectionRequestCacheModel)) {
			return false;
		}

		ConnectionRequestCacheModel connectionRequestCacheModel =
			(ConnectionRequestCacheModel)object;

		if (connectionRequestId ==
				connectionRequestCacheModel.connectionRequestId) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, connectionRequestId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(249);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", connectionRequestId=");
		sb.append(connectionRequestId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", requestNo=");
		sb.append(requestNo);
		sb.append(", mobileNo=");
		sb.append(mobileNo);
		sb.append(", emailId=");
		sb.append(emailId);
		sb.append(", requestDate=");
		sb.append(requestDate);
		sb.append(", requestType=");
		sb.append(requestType);
		sb.append(", requestStatus=");
		sb.append(requestStatus);
		sb.append(", requestMode=");
		sb.append(requestMode);
		sb.append(", consumerType=");
		sb.append(consumerType);
		sb.append(", title=");
		sb.append(title);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", middleName=");
		sb.append(middleName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", sonDaughterWife=");
		sb.append(sonDaughterWife);
		sb.append(", fatherOrHusbandName=");
		sb.append(fatherOrHusbandName);
		sb.append(", firmName=");
		sb.append(firmName);
		sb.append(", signatoryName=");
		sb.append(signatoryName);
		sb.append(", signatoryDesignation=");
		sb.append(signatoryDesignation);
		sb.append(", organizationType=");
		sb.append(organizationType);
		sb.append(", incorporationDate=");
		sb.append(incorporationDate);
		sb.append(", gstIn=");
		sb.append(gstIn);
		sb.append(", panNo=");
		sb.append(panNo);
		sb.append(", houseNo=");
		sb.append(houseNo);
		sb.append(", floor=");
		sb.append(floor);
		sb.append(", buildingName=");
		sb.append(buildingName);
		sb.append(", street=");
		sb.append(street);
		sb.append(", colonyArea=");
		sb.append(colonyArea);
		sb.append(", landmark=");
		sb.append(landmark);
		sb.append(", landmarkDetails=");
		sb.append(landmarkDetails);
		sb.append(", pinCode=");
		sb.append(pinCode);
		sb.append(", registeredAddress=");
		sb.append(registeredAddress);
		sb.append(", locality=");
		sb.append(locality);
		sb.append(", district=");
		sb.append(district);
		sb.append(", houseNo2=");
		sb.append(houseNo2);
		sb.append(", floor2=");
		sb.append(floor2);
		sb.append(", buildingName2=");
		sb.append(buildingName2);
		sb.append(", street2=");
		sb.append(street2);
		sb.append(", colonyArea2=");
		sb.append(colonyArea2);
		sb.append(", landmark2=");
		sb.append(landmark2);
		sb.append(", landmarkDetails2=");
		sb.append(landmarkDetails2);
		sb.append(", pinCode2=");
		sb.append(pinCode2);
		sb.append(", indicateLandmark=");
		sb.append(indicateLandmark);
		sb.append(", connectionType=");
		sb.append(connectionType);
		sb.append(", tariffCategory=");
		sb.append(tariffCategory);
		sb.append(", displayCategory=");
		sb.append(displayCategory);
		sb.append(", evUsage=");
		sb.append(evUsage);
		sb.append(", loadKva=");
		sb.append(loadKva);
		sb.append(", loadKw=");
		sb.append(loadKw);
		sb.append(", areaType=");
		sb.append(areaType);
		sb.append(", premisesType=");
		sb.append(premisesType);
		sb.append(", buildingType=");
		sb.append(buildingType);
		sb.append(", otherBuildingType=");
		sb.append(otherBuildingType);
		sb.append(", upicAvailable=");
		sb.append(upicAvailable);
		sb.append(", upic=");
		sb.append(upic);
		sb.append(", supplyType=");
		sb.append(supplyType);
		sb.append(", purposeOfSupply=");
		sb.append(purposeOfSupply);
		sb.append(", tempStartDate=");
		sb.append(tempStartDate);
		sb.append(", tempEndDate=");
		sb.append(tempEndDate);
		sb.append(", licenseCertificateNo=");
		sb.append(licenseCertificateNo);
		sb.append(", licenseIssueDate=");
		sb.append(licenseIssueDate);
		sb.append(", licenseValidityFrom=");
		sb.append(licenseValidityFrom);
		sb.append(", licenseValidityTo=");
		sb.append(licenseValidityTo);
		sb.append(", wiringTest=");
		sb.append(wiringTest);
		sb.append(", wiringCertificate=");
		sb.append(wiringCertificate);
		sb.append(", elcbInstalled=");
		sb.append(elcbInstalled);
		sb.append(", elcbDocument=");
		sb.append(elcbDocument);
		sb.append(", stiltParking=");
		sb.append(stiltParking);
		sb.append(", height9Mtr=");
		sb.append(height9Mtr);
		sb.append(", height12Mtr=");
		sb.append(height12Mtr);
		sb.append(", height15Mtr=");
		sb.append(height15Mtr);
		sb.append(", height17Mtr=");
		sb.append(height17Mtr);
		sb.append(", industrialLicense=");
		sb.append(industrialLicense);
		sb.append(", industrialLicenseCertificate=");
		sb.append(industrialLicenseCertificate);
		sb.append(", fcc=");
		sb.append(fcc);
		sb.append(", fccCertificate=");
		sb.append(fccCertificate);
		sb.append(", lift=");
		sb.append(lift);
		sb.append(", hasLiftCertificate=");
		sb.append(hasLiftCertificate);
		sb.append(", liftCertificate=");
		sb.append(liftCertificate);
		sb.append(", agriConsumer=");
		sb.append(agriConsumer);
		sb.append(", hasBdoCertificate=");
		sb.append(hasBdoCertificate);
		sb.append(", bdoCertificate=");
		sb.append(bdoCertificate);
		sb.append(", hasPollutionCertificate=");
		sb.append(hasPollutionCertificate);
		sb.append(", pollutionCertificate=");
		sb.append(pollutionCertificate);
		sb.append(", dpccClearanceRequired=");
		sb.append(dpccClearanceRequired);
		sb.append(", hasDpccCertificate=");
		sb.append(hasDpccCertificate);
		sb.append(", dpccCertificate=");
		sb.append(dpccCertificate);
		sb.append(", nonConfirmingArea=");
		sb.append(nonConfirmingArea);
		sb.append(", hasTradeLicense=");
		sb.append(hasTradeLicense);
		sb.append(", tradeLicenseCertificate=");
		sb.append(tradeLicenseCertificate);
		sb.append(", eServiceOnMail=");
		sb.append(eServiceOnMail);
		sb.append(", eServiceMailId=");
		sb.append(eServiceMailId);
		sb.append(", eServiceMailValidated=");
		sb.append(eServiceMailValidated);
		sb.append(", optSubsidy=");
		sb.append(optSubsidy);
		sb.append(", purchaseMeter=");
		sb.append(purchaseMeter);
		sb.append(", appointmentDate=");
		sb.append(appointmentDate);
		sb.append(", appointmentTime=");
		sb.append(appointmentTime);
		sb.append(", appointmentFinishTime=");
		sb.append(appointmentFinishTime);
		sb.append(", appointmentDistrict=");
		sb.append(appointmentDistrict);
		sb.append(", applicantPhoto=");
		sb.append(applicantPhoto);
		sb.append(", applicantSignature=");
		sb.append(applicantSignature);
		sb.append(", idProofType=");
		sb.append(idProofType);
		sb.append(", idProofNo=");
		sb.append(idProofNo);
		sb.append(", idProofDocument=");
		sb.append(idProofDocument);
		sb.append(", ownershipProofType=");
		sb.append(ownershipProofType);
		sb.append(", ownershipProofDocument=");
		sb.append(ownershipProofDocument);
		sb.append(", selfDeclaration=");
		sb.append(selfDeclaration);
		sb.append(", selfDeclarationTime=");
		sb.append(selfDeclarationTime);
		sb.append(", orderNo=");
		sb.append(orderNo);
		sb.append(", bpNumber=");
		sb.append(bpNumber);
		sb.append(", caNumber=");
		sb.append(caNumber);
		sb.append(", documentUploaded=");
		sb.append(documentUploaded);
		sb.append(", sapOrderGenerated=");
		sb.append(sapOrderGenerated);
		sb.append(", changeRequest=");
		sb.append(changeRequest);
		sb.append(", oldData=");
		sb.append(oldData);
		sb.append(", changeRequestType=");
		sb.append(changeRequestType);
		sb.append(", reasonForChange=");
		sb.append(reasonForChange);
		sb.append(", seqNo=");
		sb.append(seqNo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ConnectionRequest toEntityModel() {
		ConnectionRequestImpl connectionRequestImpl =
			new ConnectionRequestImpl();

		if (uuid == null) {
			connectionRequestImpl.setUuid("");
		}
		else {
			connectionRequestImpl.setUuid(uuid);
		}

		connectionRequestImpl.setConnectionRequestId(connectionRequestId);
		connectionRequestImpl.setGroupId(groupId);
		connectionRequestImpl.setCompanyId(companyId);
		connectionRequestImpl.setUserId(userId);

		if (userName == null) {
			connectionRequestImpl.setUserName("");
		}
		else {
			connectionRequestImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			connectionRequestImpl.setCreateDate(null);
		}
		else {
			connectionRequestImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			connectionRequestImpl.setModifiedDate(null);
		}
		else {
			connectionRequestImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (requestNo == null) {
			connectionRequestImpl.setRequestNo("");
		}
		else {
			connectionRequestImpl.setRequestNo(requestNo);
		}

		if (mobileNo == null) {
			connectionRequestImpl.setMobileNo("");
		}
		else {
			connectionRequestImpl.setMobileNo(mobileNo);
		}

		if (emailId == null) {
			connectionRequestImpl.setEmailId("");
		}
		else {
			connectionRequestImpl.setEmailId(emailId);
		}

		if (requestDate == Long.MIN_VALUE) {
			connectionRequestImpl.setRequestDate(null);
		}
		else {
			connectionRequestImpl.setRequestDate(new Date(requestDate));
		}

		if (requestType == null) {
			connectionRequestImpl.setRequestType("");
		}
		else {
			connectionRequestImpl.setRequestType(requestType);
		}

		if (requestStatus == null) {
			connectionRequestImpl.setRequestStatus("");
		}
		else {
			connectionRequestImpl.setRequestStatus(requestStatus);
		}

		if (requestMode == null) {
			connectionRequestImpl.setRequestMode("");
		}
		else {
			connectionRequestImpl.setRequestMode(requestMode);
		}

		if (consumerType == null) {
			connectionRequestImpl.setConsumerType("");
		}
		else {
			connectionRequestImpl.setConsumerType(consumerType);
		}

		if (title == null) {
			connectionRequestImpl.setTitle("");
		}
		else {
			connectionRequestImpl.setTitle(title);
		}

		if (firstName == null) {
			connectionRequestImpl.setFirstName("");
		}
		else {
			connectionRequestImpl.setFirstName(firstName);
		}

		if (middleName == null) {
			connectionRequestImpl.setMiddleName("");
		}
		else {
			connectionRequestImpl.setMiddleName(middleName);
		}

		if (lastName == null) {
			connectionRequestImpl.setLastName("");
		}
		else {
			connectionRequestImpl.setLastName(lastName);
		}

		if (sonDaughterWife == null) {
			connectionRequestImpl.setSonDaughterWife("");
		}
		else {
			connectionRequestImpl.setSonDaughterWife(sonDaughterWife);
		}

		if (fatherOrHusbandName == null) {
			connectionRequestImpl.setFatherOrHusbandName("");
		}
		else {
			connectionRequestImpl.setFatherOrHusbandName(fatherOrHusbandName);
		}

		if (firmName == null) {
			connectionRequestImpl.setFirmName("");
		}
		else {
			connectionRequestImpl.setFirmName(firmName);
		}

		if (signatoryName == null) {
			connectionRequestImpl.setSignatoryName("");
		}
		else {
			connectionRequestImpl.setSignatoryName(signatoryName);
		}

		if (signatoryDesignation == null) {
			connectionRequestImpl.setSignatoryDesignation("");
		}
		else {
			connectionRequestImpl.setSignatoryDesignation(signatoryDesignation);
		}

		if (organizationType == null) {
			connectionRequestImpl.setOrganizationType("");
		}
		else {
			connectionRequestImpl.setOrganizationType(organizationType);
		}

		if (incorporationDate == Long.MIN_VALUE) {
			connectionRequestImpl.setIncorporationDate(null);
		}
		else {
			connectionRequestImpl.setIncorporationDate(
				new Date(incorporationDate));
		}

		if (gstIn == null) {
			connectionRequestImpl.setGstIn("");
		}
		else {
			connectionRequestImpl.setGstIn(gstIn);
		}

		if (panNo == null) {
			connectionRequestImpl.setPanNo("");
		}
		else {
			connectionRequestImpl.setPanNo(panNo);
		}

		if (houseNo == null) {
			connectionRequestImpl.setHouseNo("");
		}
		else {
			connectionRequestImpl.setHouseNo(houseNo);
		}

		if (floor == null) {
			connectionRequestImpl.setFloor("");
		}
		else {
			connectionRequestImpl.setFloor(floor);
		}

		if (buildingName == null) {
			connectionRequestImpl.setBuildingName("");
		}
		else {
			connectionRequestImpl.setBuildingName(buildingName);
		}

		if (street == null) {
			connectionRequestImpl.setStreet("");
		}
		else {
			connectionRequestImpl.setStreet(street);
		}

		if (colonyArea == null) {
			connectionRequestImpl.setColonyArea("");
		}
		else {
			connectionRequestImpl.setColonyArea(colonyArea);
		}

		if (landmark == null) {
			connectionRequestImpl.setLandmark("");
		}
		else {
			connectionRequestImpl.setLandmark(landmark);
		}

		if (landmarkDetails == null) {
			connectionRequestImpl.setLandmarkDetails("");
		}
		else {
			connectionRequestImpl.setLandmarkDetails(landmarkDetails);
		}

		if (pinCode == null) {
			connectionRequestImpl.setPinCode("");
		}
		else {
			connectionRequestImpl.setPinCode(pinCode);
		}

		if (registeredAddress == null) {
			connectionRequestImpl.setRegisteredAddress("");
		}
		else {
			connectionRequestImpl.setRegisteredAddress(registeredAddress);
		}

		if (locality == null) {
			connectionRequestImpl.setLocality("");
		}
		else {
			connectionRequestImpl.setLocality(locality);
		}

		if (district == null) {
			connectionRequestImpl.setDistrict("");
		}
		else {
			connectionRequestImpl.setDistrict(district);
		}

		if (houseNo2 == null) {
			connectionRequestImpl.setHouseNo2("");
		}
		else {
			connectionRequestImpl.setHouseNo2(houseNo2);
		}

		if (floor2 == null) {
			connectionRequestImpl.setFloor2("");
		}
		else {
			connectionRequestImpl.setFloor2(floor2);
		}

		if (buildingName2 == null) {
			connectionRequestImpl.setBuildingName2("");
		}
		else {
			connectionRequestImpl.setBuildingName2(buildingName2);
		}

		if (street2 == null) {
			connectionRequestImpl.setStreet2("");
		}
		else {
			connectionRequestImpl.setStreet2(street2);
		}

		if (colonyArea2 == null) {
			connectionRequestImpl.setColonyArea2("");
		}
		else {
			connectionRequestImpl.setColonyArea2(colonyArea2);
		}

		if (landmark2 == null) {
			connectionRequestImpl.setLandmark2("");
		}
		else {
			connectionRequestImpl.setLandmark2(landmark2);
		}

		if (landmarkDetails2 == null) {
			connectionRequestImpl.setLandmarkDetails2("");
		}
		else {
			connectionRequestImpl.setLandmarkDetails2(landmarkDetails2);
		}

		if (pinCode2 == null) {
			connectionRequestImpl.setPinCode2("");
		}
		else {
			connectionRequestImpl.setPinCode2(pinCode2);
		}

		if (indicateLandmark == null) {
			connectionRequestImpl.setIndicateLandmark("");
		}
		else {
			connectionRequestImpl.setIndicateLandmark(indicateLandmark);
		}

		if (connectionType == null) {
			connectionRequestImpl.setConnectionType("");
		}
		else {
			connectionRequestImpl.setConnectionType(connectionType);
		}

		if (tariffCategory == null) {
			connectionRequestImpl.setTariffCategory("");
		}
		else {
			connectionRequestImpl.setTariffCategory(tariffCategory);
		}

		if (displayCategory == null) {
			connectionRequestImpl.setDisplayCategory("");
		}
		else {
			connectionRequestImpl.setDisplayCategory(displayCategory);
		}

		if (evUsage == null) {
			connectionRequestImpl.setEvUsage("");
		}
		else {
			connectionRequestImpl.setEvUsage(evUsage);
		}

		connectionRequestImpl.setLoadKva(loadKva);
		connectionRequestImpl.setLoadKw(loadKw);

		if (areaType == null) {
			connectionRequestImpl.setAreaType("");
		}
		else {
			connectionRequestImpl.setAreaType(areaType);
		}

		if (premisesType == null) {
			connectionRequestImpl.setPremisesType("");
		}
		else {
			connectionRequestImpl.setPremisesType(premisesType);
		}

		if (buildingType == null) {
			connectionRequestImpl.setBuildingType("");
		}
		else {
			connectionRequestImpl.setBuildingType(buildingType);
		}

		if (otherBuildingType == null) {
			connectionRequestImpl.setOtherBuildingType("");
		}
		else {
			connectionRequestImpl.setOtherBuildingType(otherBuildingType);
		}

		connectionRequestImpl.setUpicAvailable(upicAvailable);

		if (upic == null) {
			connectionRequestImpl.setUpic("");
		}
		else {
			connectionRequestImpl.setUpic(upic);
		}

		if (supplyType == null) {
			connectionRequestImpl.setSupplyType("");
		}
		else {
			connectionRequestImpl.setSupplyType(supplyType);
		}

		if (purposeOfSupply == null) {
			connectionRequestImpl.setPurposeOfSupply("");
		}
		else {
			connectionRequestImpl.setPurposeOfSupply(purposeOfSupply);
		}

		if (tempStartDate == Long.MIN_VALUE) {
			connectionRequestImpl.setTempStartDate(null);
		}
		else {
			connectionRequestImpl.setTempStartDate(new Date(tempStartDate));
		}

		if (tempEndDate == Long.MIN_VALUE) {
			connectionRequestImpl.setTempEndDate(null);
		}
		else {
			connectionRequestImpl.setTempEndDate(new Date(tempEndDate));
		}

		if (licenseCertificateNo == null) {
			connectionRequestImpl.setLicenseCertificateNo("");
		}
		else {
			connectionRequestImpl.setLicenseCertificateNo(licenseCertificateNo);
		}

		if (licenseIssueDate == Long.MIN_VALUE) {
			connectionRequestImpl.setLicenseIssueDate(null);
		}
		else {
			connectionRequestImpl.setLicenseIssueDate(
				new Date(licenseIssueDate));
		}

		if (licenseValidityFrom == Long.MIN_VALUE) {
			connectionRequestImpl.setLicenseValidityFrom(null);
		}
		else {
			connectionRequestImpl.setLicenseValidityFrom(
				new Date(licenseValidityFrom));
		}

		if (licenseValidityTo == Long.MIN_VALUE) {
			connectionRequestImpl.setLicenseValidityTo(null);
		}
		else {
			connectionRequestImpl.setLicenseValidityTo(
				new Date(licenseValidityTo));
		}

		connectionRequestImpl.setWiringTest(wiringTest);

		if (wiringCertificate == null) {
			connectionRequestImpl.setWiringCertificate("");
		}
		else {
			connectionRequestImpl.setWiringCertificate(wiringCertificate);
		}

		connectionRequestImpl.setElcbInstalled(elcbInstalled);

		if (elcbDocument == null) {
			connectionRequestImpl.setElcbDocument("");
		}
		else {
			connectionRequestImpl.setElcbDocument(elcbDocument);
		}

		connectionRequestImpl.setStiltParking(stiltParking);
		connectionRequestImpl.setHeight9Mtr(height9Mtr);
		connectionRequestImpl.setHeight12Mtr(height12Mtr);
		connectionRequestImpl.setHeight15Mtr(height15Mtr);
		connectionRequestImpl.setHeight17Mtr(height17Mtr);
		connectionRequestImpl.setIndustrialLicense(industrialLicense);

		if (industrialLicenseCertificate == null) {
			connectionRequestImpl.setIndustrialLicenseCertificate("");
		}
		else {
			connectionRequestImpl.setIndustrialLicenseCertificate(
				industrialLicenseCertificate);
		}

		connectionRequestImpl.setFcc(fcc);

		if (fccCertificate == null) {
			connectionRequestImpl.setFccCertificate("");
		}
		else {
			connectionRequestImpl.setFccCertificate(fccCertificate);
		}

		connectionRequestImpl.setLift(lift);
		connectionRequestImpl.setHasLiftCertificate(hasLiftCertificate);

		if (liftCertificate == null) {
			connectionRequestImpl.setLiftCertificate("");
		}
		else {
			connectionRequestImpl.setLiftCertificate(liftCertificate);
		}

		connectionRequestImpl.setAgriConsumer(agriConsumer);
		connectionRequestImpl.setHasBdoCertificate(hasBdoCertificate);

		if (bdoCertificate == null) {
			connectionRequestImpl.setBdoCertificate("");
		}
		else {
			connectionRequestImpl.setBdoCertificate(bdoCertificate);
		}

		connectionRequestImpl.setHasPollutionCertificate(
			hasPollutionCertificate);

		if (pollutionCertificate == null) {
			connectionRequestImpl.setPollutionCertificate("");
		}
		else {
			connectionRequestImpl.setPollutionCertificate(pollutionCertificate);
		}

		connectionRequestImpl.setDpccClearanceRequired(dpccClearanceRequired);
		connectionRequestImpl.setHasDpccCertificate(hasDpccCertificate);

		if (dpccCertificate == null) {
			connectionRequestImpl.setDpccCertificate("");
		}
		else {
			connectionRequestImpl.setDpccCertificate(dpccCertificate);
		}

		connectionRequestImpl.setNonConfirmingArea(nonConfirmingArea);
		connectionRequestImpl.setHasTradeLicense(hasTradeLicense);

		if (tradeLicenseCertificate == null) {
			connectionRequestImpl.setTradeLicenseCertificate("");
		}
		else {
			connectionRequestImpl.setTradeLicenseCertificate(
				tradeLicenseCertificate);
		}

		connectionRequestImpl.setEServiceOnMail(eServiceOnMail);

		if (eServiceMailId == null) {
			connectionRequestImpl.setEServiceMailId("");
		}
		else {
			connectionRequestImpl.setEServiceMailId(eServiceMailId);
		}

		connectionRequestImpl.setEServiceMailValidated(eServiceMailValidated);
		connectionRequestImpl.setOptSubsidy(optSubsidy);
		connectionRequestImpl.setPurchaseMeter(purchaseMeter);

		if (appointmentDate == Long.MIN_VALUE) {
			connectionRequestImpl.setAppointmentDate(null);
		}
		else {
			connectionRequestImpl.setAppointmentDate(new Date(appointmentDate));
		}

		if (appointmentTime == null) {
			connectionRequestImpl.setAppointmentTime("");
		}
		else {
			connectionRequestImpl.setAppointmentTime(appointmentTime);
		}

		if (appointmentFinishTime == null) {
			connectionRequestImpl.setAppointmentFinishTime("");
		}
		else {
			connectionRequestImpl.setAppointmentFinishTime(
				appointmentFinishTime);
		}

		if (appointmentDistrict == null) {
			connectionRequestImpl.setAppointmentDistrict("");
		}
		else {
			connectionRequestImpl.setAppointmentDistrict(appointmentDistrict);
		}

		if (applicantPhoto == null) {
			connectionRequestImpl.setApplicantPhoto("");
		}
		else {
			connectionRequestImpl.setApplicantPhoto(applicantPhoto);
		}

		connectionRequestImpl.setApplicantSignature(applicantSignature);

		if (idProofType == null) {
			connectionRequestImpl.setIdProofType("");
		}
		else {
			connectionRequestImpl.setIdProofType(idProofType);
		}

		if (idProofNo == null) {
			connectionRequestImpl.setIdProofNo("");
		}
		else {
			connectionRequestImpl.setIdProofNo(idProofNo);
		}

		if (idProofDocument == null) {
			connectionRequestImpl.setIdProofDocument("");
		}
		else {
			connectionRequestImpl.setIdProofDocument(idProofDocument);
		}

		if (ownershipProofType == null) {
			connectionRequestImpl.setOwnershipProofType("");
		}
		else {
			connectionRequestImpl.setOwnershipProofType(ownershipProofType);
		}

		if (ownershipProofDocument == null) {
			connectionRequestImpl.setOwnershipProofDocument("");
		}
		else {
			connectionRequestImpl.setOwnershipProofDocument(
				ownershipProofDocument);
		}

		connectionRequestImpl.setSelfDeclaration(selfDeclaration);

		if (selfDeclarationTime == Long.MIN_VALUE) {
			connectionRequestImpl.setSelfDeclarationTime(null);
		}
		else {
			connectionRequestImpl.setSelfDeclarationTime(
				new Date(selfDeclarationTime));
		}

		if (orderNo == null) {
			connectionRequestImpl.setOrderNo("");
		}
		else {
			connectionRequestImpl.setOrderNo(orderNo);
		}

		if (bpNumber == null) {
			connectionRequestImpl.setBpNumber("");
		}
		else {
			connectionRequestImpl.setBpNumber(bpNumber);
		}

		if (caNumber == null) {
			connectionRequestImpl.setCaNumber("");
		}
		else {
			connectionRequestImpl.setCaNumber(caNumber);
		}

		if (documentUploaded == null) {
			connectionRequestImpl.setDocumentUploaded("");
		}
		else {
			connectionRequestImpl.setDocumentUploaded(documentUploaded);
		}

		if (sapOrderGenerated == null) {
			connectionRequestImpl.setSapOrderGenerated("");
		}
		else {
			connectionRequestImpl.setSapOrderGenerated(sapOrderGenerated);
		}

		connectionRequestImpl.setChangeRequest(changeRequest);

		if (oldData == null) {
			connectionRequestImpl.setOldData("");
		}
		else {
			connectionRequestImpl.setOldData(oldData);
		}

		if (changeRequestType == null) {
			connectionRequestImpl.setChangeRequestType("");
		}
		else {
			connectionRequestImpl.setChangeRequestType(changeRequestType);
		}

		if (reasonForChange == null) {
			connectionRequestImpl.setReasonForChange("");
		}
		else {
			connectionRequestImpl.setReasonForChange(reasonForChange);
		}

		connectionRequestImpl.setSeqNo(seqNo);

		connectionRequestImpl.resetOriginalValues();

		return connectionRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		connectionRequestId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		requestNo = objectInput.readUTF();
		mobileNo = objectInput.readUTF();
		emailId = objectInput.readUTF();
		requestDate = objectInput.readLong();
		requestType = objectInput.readUTF();
		requestStatus = objectInput.readUTF();
		requestMode = objectInput.readUTF();
		consumerType = objectInput.readUTF();
		title = objectInput.readUTF();
		firstName = objectInput.readUTF();
		middleName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		sonDaughterWife = objectInput.readUTF();
		fatherOrHusbandName = objectInput.readUTF();
		firmName = objectInput.readUTF();
		signatoryName = objectInput.readUTF();
		signatoryDesignation = objectInput.readUTF();
		organizationType = objectInput.readUTF();
		incorporationDate = objectInput.readLong();
		gstIn = objectInput.readUTF();
		panNo = objectInput.readUTF();
		houseNo = objectInput.readUTF();
		floor = objectInput.readUTF();
		buildingName = objectInput.readUTF();
		street = objectInput.readUTF();
		colonyArea = objectInput.readUTF();
		landmark = objectInput.readUTF();
		landmarkDetails = objectInput.readUTF();
		pinCode = objectInput.readUTF();
		registeredAddress = objectInput.readUTF();
		locality = objectInput.readUTF();
		district = objectInput.readUTF();
		houseNo2 = objectInput.readUTF();
		floor2 = objectInput.readUTF();
		buildingName2 = objectInput.readUTF();
		street2 = objectInput.readUTF();
		colonyArea2 = objectInput.readUTF();
		landmark2 = objectInput.readUTF();
		landmarkDetails2 = objectInput.readUTF();
		pinCode2 = objectInput.readUTF();
		indicateLandmark = objectInput.readUTF();
		connectionType = objectInput.readUTF();
		tariffCategory = objectInput.readUTF();
		displayCategory = objectInput.readUTF();
		evUsage = objectInput.readUTF();

		loadKva = objectInput.readFloat();

		loadKw = objectInput.readFloat();
		areaType = objectInput.readUTF();
		premisesType = objectInput.readUTF();
		buildingType = objectInput.readUTF();
		otherBuildingType = objectInput.readUTF();

		upicAvailable = objectInput.readBoolean();
		upic = objectInput.readUTF();
		supplyType = objectInput.readUTF();
		purposeOfSupply = objectInput.readUTF();
		tempStartDate = objectInput.readLong();
		tempEndDate = objectInput.readLong();
		licenseCertificateNo = objectInput.readUTF();
		licenseIssueDate = objectInput.readLong();
		licenseValidityFrom = objectInput.readLong();
		licenseValidityTo = objectInput.readLong();

		wiringTest = objectInput.readBoolean();
		wiringCertificate = objectInput.readUTF();

		elcbInstalled = objectInput.readBoolean();
		elcbDocument = objectInput.readUTF();

		stiltParking = objectInput.readBoolean();

		height9Mtr = objectInput.readBoolean();

		height12Mtr = objectInput.readBoolean();

		height15Mtr = objectInput.readBoolean();

		height17Mtr = objectInput.readBoolean();

		industrialLicense = objectInput.readBoolean();
		industrialLicenseCertificate = objectInput.readUTF();

		fcc = objectInput.readBoolean();
		fccCertificate = objectInput.readUTF();

		lift = objectInput.readBoolean();

		hasLiftCertificate = objectInput.readBoolean();
		liftCertificate = objectInput.readUTF();

		agriConsumer = objectInput.readBoolean();

		hasBdoCertificate = objectInput.readBoolean();
		bdoCertificate = objectInput.readUTF();

		hasPollutionCertificate = objectInput.readBoolean();
		pollutionCertificate = objectInput.readUTF();

		dpccClearanceRequired = objectInput.readBoolean();

		hasDpccCertificate = objectInput.readBoolean();
		dpccCertificate = objectInput.readUTF();

		nonConfirmingArea = objectInput.readBoolean();

		hasTradeLicense = objectInput.readBoolean();
		tradeLicenseCertificate = objectInput.readUTF();

		eServiceOnMail = objectInput.readBoolean();
		eServiceMailId = objectInput.readUTF();

		eServiceMailValidated = objectInput.readBoolean();

		optSubsidy = objectInput.readBoolean();

		purchaseMeter = objectInput.readBoolean();
		appointmentDate = objectInput.readLong();
		appointmentTime = objectInput.readUTF();
		appointmentFinishTime = objectInput.readUTF();
		appointmentDistrict = objectInput.readUTF();
		applicantPhoto = objectInput.readUTF();

		applicantSignature = objectInput.readLong();
		idProofType = objectInput.readUTF();
		idProofNo = objectInput.readUTF();
		idProofDocument = objectInput.readUTF();
		ownershipProofType = objectInput.readUTF();
		ownershipProofDocument = objectInput.readUTF();

		selfDeclaration = objectInput.readBoolean();
		selfDeclarationTime = objectInput.readLong();
		orderNo = objectInput.readUTF();
		bpNumber = objectInput.readUTF();
		caNumber = objectInput.readUTF();
		documentUploaded = objectInput.readUTF();
		sapOrderGenerated = objectInput.readUTF();

		changeRequest = objectInput.readBoolean();
		oldData = objectInput.readUTF();
		changeRequestType = objectInput.readUTF();
		reasonForChange = objectInput.readUTF();

		seqNo = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(connectionRequestId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (requestNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestNo);
		}

		if (mobileNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobileNo);
		}

		if (emailId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(emailId);
		}

		objectOutput.writeLong(requestDate);

		if (requestType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestType);
		}

		if (requestStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestStatus);
		}

		if (requestMode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(requestMode);
		}

		if (consumerType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(consumerType);
		}

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (middleName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(middleName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (sonDaughterWife == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sonDaughterWife);
		}

		if (fatherOrHusbandName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fatherOrHusbandName);
		}

		if (firmName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firmName);
		}

		if (signatoryName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatoryName);
		}

		if (signatoryDesignation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signatoryDesignation);
		}

		if (organizationType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(organizationType);
		}

		objectOutput.writeLong(incorporationDate);

		if (gstIn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gstIn);
		}

		if (panNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(panNo);
		}

		if (houseNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(houseNo);
		}

		if (floor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(floor);
		}

		if (buildingName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingName);
		}

		if (street == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(street);
		}

		if (colonyArea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(colonyArea);
		}

		if (landmark == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landmark);
		}

		if (landmarkDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landmarkDetails);
		}

		if (pinCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pinCode);
		}

		if (registeredAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(registeredAddress);
		}

		if (locality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(locality);
		}

		if (district == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(district);
		}

		if (houseNo2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(houseNo2);
		}

		if (floor2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(floor2);
		}

		if (buildingName2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingName2);
		}

		if (street2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(street2);
		}

		if (colonyArea2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(colonyArea2);
		}

		if (landmark2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landmark2);
		}

		if (landmarkDetails2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(landmarkDetails2);
		}

		if (pinCode2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pinCode2);
		}

		if (indicateLandmark == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(indicateLandmark);
		}

		if (connectionType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(connectionType);
		}

		if (tariffCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tariffCategory);
		}

		if (displayCategory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(displayCategory);
		}

		if (evUsage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(evUsage);
		}

		objectOutput.writeFloat(loadKva);

		objectOutput.writeFloat(loadKw);

		if (areaType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(areaType);
		}

		if (premisesType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(premisesType);
		}

		if (buildingType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(buildingType);
		}

		if (otherBuildingType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherBuildingType);
		}

		objectOutput.writeBoolean(upicAvailable);

		if (upic == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(upic);
		}

		if (supplyType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(supplyType);
		}

		if (purposeOfSupply == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(purposeOfSupply);
		}

		objectOutput.writeLong(tempStartDate);
		objectOutput.writeLong(tempEndDate);

		if (licenseCertificateNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(licenseCertificateNo);
		}

		objectOutput.writeLong(licenseIssueDate);
		objectOutput.writeLong(licenseValidityFrom);
		objectOutput.writeLong(licenseValidityTo);

		objectOutput.writeBoolean(wiringTest);

		if (wiringCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(wiringCertificate);
		}

		objectOutput.writeBoolean(elcbInstalled);

		if (elcbDocument == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(elcbDocument);
		}

		objectOutput.writeBoolean(stiltParking);

		objectOutput.writeBoolean(height9Mtr);

		objectOutput.writeBoolean(height12Mtr);

		objectOutput.writeBoolean(height15Mtr);

		objectOutput.writeBoolean(height17Mtr);

		objectOutput.writeBoolean(industrialLicense);

		if (industrialLicenseCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(industrialLicenseCertificate);
		}

		objectOutput.writeBoolean(fcc);

		if (fccCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fccCertificate);
		}

		objectOutput.writeBoolean(lift);

		objectOutput.writeBoolean(hasLiftCertificate);

		if (liftCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(liftCertificate);
		}

		objectOutput.writeBoolean(agriConsumer);

		objectOutput.writeBoolean(hasBdoCertificate);

		if (bdoCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bdoCertificate);
		}

		objectOutput.writeBoolean(hasPollutionCertificate);

		if (pollutionCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pollutionCertificate);
		}

		objectOutput.writeBoolean(dpccClearanceRequired);

		objectOutput.writeBoolean(hasDpccCertificate);

		if (dpccCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dpccCertificate);
		}

		objectOutput.writeBoolean(nonConfirmingArea);

		objectOutput.writeBoolean(hasTradeLicense);

		if (tradeLicenseCertificate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tradeLicenseCertificate);
		}

		objectOutput.writeBoolean(eServiceOnMail);

		if (eServiceMailId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(eServiceMailId);
		}

		objectOutput.writeBoolean(eServiceMailValidated);

		objectOutput.writeBoolean(optSubsidy);

		objectOutput.writeBoolean(purchaseMeter);
		objectOutput.writeLong(appointmentDate);

		if (appointmentTime == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appointmentTime);
		}

		if (appointmentFinishTime == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appointmentFinishTime);
		}

		if (appointmentDistrict == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appointmentDistrict);
		}

		if (applicantPhoto == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(applicantPhoto);
		}

		objectOutput.writeLong(applicantSignature);

		if (idProofType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(idProofType);
		}

		if (idProofNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(idProofNo);
		}

		if (idProofDocument == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(idProofDocument);
		}

		if (ownershipProofType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownershipProofType);
		}

		if (ownershipProofDocument == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownershipProofDocument);
		}

		objectOutput.writeBoolean(selfDeclaration);
		objectOutput.writeLong(selfDeclarationTime);

		if (orderNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orderNo);
		}

		if (bpNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bpNumber);
		}

		if (caNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(caNumber);
		}

		if (documentUploaded == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(documentUploaded);
		}

		if (sapOrderGenerated == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sapOrderGenerated);
		}

		objectOutput.writeBoolean(changeRequest);

		if (oldData == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(oldData);
		}

		if (changeRequestType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(changeRequestType);
		}

		if (reasonForChange == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reasonForChange);
		}

		objectOutput.writeLong(seqNo);
	}

	public String uuid;
	public long connectionRequestId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String requestNo;
	public String mobileNo;
	public String emailId;
	public long requestDate;
	public String requestType;
	public String requestStatus;
	public String requestMode;
	public String consumerType;
	public String title;
	public String firstName;
	public String middleName;
	public String lastName;
	public String sonDaughterWife;
	public String fatherOrHusbandName;
	public String firmName;
	public String signatoryName;
	public String signatoryDesignation;
	public String organizationType;
	public long incorporationDate;
	public String gstIn;
	public String panNo;
	public String houseNo;
	public String floor;
	public String buildingName;
	public String street;
	public String colonyArea;
	public String landmark;
	public String landmarkDetails;
	public String pinCode;
	public String registeredAddress;
	public String locality;
	public String district;
	public String houseNo2;
	public String floor2;
	public String buildingName2;
	public String street2;
	public String colonyArea2;
	public String landmark2;
	public String landmarkDetails2;
	public String pinCode2;
	public String indicateLandmark;
	public String connectionType;
	public String tariffCategory;
	public String displayCategory;
	public String evUsage;
	public float loadKva;
	public float loadKw;
	public String areaType;
	public String premisesType;
	public String buildingType;
	public String otherBuildingType;
	public boolean upicAvailable;
	public String upic;
	public String supplyType;
	public String purposeOfSupply;
	public long tempStartDate;
	public long tempEndDate;
	public String licenseCertificateNo;
	public long licenseIssueDate;
	public long licenseValidityFrom;
	public long licenseValidityTo;
	public boolean wiringTest;
	public String wiringCertificate;
	public boolean elcbInstalled;
	public String elcbDocument;
	public boolean stiltParking;
	public boolean height9Mtr;
	public boolean height12Mtr;
	public boolean height15Mtr;
	public boolean height17Mtr;
	public boolean industrialLicense;
	public String industrialLicenseCertificate;
	public boolean fcc;
	public String fccCertificate;
	public boolean lift;
	public boolean hasLiftCertificate;
	public String liftCertificate;
	public boolean agriConsumer;
	public boolean hasBdoCertificate;
	public String bdoCertificate;
	public boolean hasPollutionCertificate;
	public String pollutionCertificate;
	public boolean dpccClearanceRequired;
	public boolean hasDpccCertificate;
	public String dpccCertificate;
	public boolean nonConfirmingArea;
	public boolean hasTradeLicense;
	public String tradeLicenseCertificate;
	public boolean eServiceOnMail;
	public String eServiceMailId;
	public boolean eServiceMailValidated;
	public boolean optSubsidy;
	public boolean purchaseMeter;
	public long appointmentDate;
	public String appointmentTime;
	public String appointmentFinishTime;
	public String appointmentDistrict;
	public String applicantPhoto;
	public long applicantSignature;
	public String idProofType;
	public String idProofNo;
	public String idProofDocument;
	public String ownershipProofType;
	public String ownershipProofDocument;
	public boolean selfDeclaration;
	public long selfDeclarationTime;
	public String orderNo;
	public String bpNumber;
	public String caNumber;
	public String documentUploaded;
	public String sapOrderGenerated;
	public boolean changeRequest;
	public String oldData;
	public String changeRequestType;
	public String reasonForChange;
	public long seqNo;

}