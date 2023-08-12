/**
 * 
 */
package com.bses.connection2.helper.model;

import java.util.Date;
import java.util.List;

//import com.bses.portal.newconnection.services.model.DssNewConDocsTemp;

/**
 * @author nikunj.malaviya
 *
 */
public class NewConnectionWrapper {

	public NewConnectionWrapper() {

	}

	private String orderNo;
	private String bpNumber;
	private String userName;
	private String pEmailId;
	private String requstNo;
	private String status;
	private String requestType;
	private String district;
	private String title;
	private String occupation;
	private String firstName;
	private String lastName;
	private String fatherName;
	private String idType;
	
	private String idNumber;
	private String houseNo;
	private String buildingName;
	private String street;
	private String area;
	private String landmark;
	private String landmarkDetail;
	private String planningPlant;
	private String caNumberTwelveDigit;
	private String pin;
	private String sex;
	private String mobileNo;
	private String phoneNo;
	private String email;
	private String faxNo;
	private String appliedCategory;
	private String appliedLoadType;
	private long appliedLoad;
	private String statementCode;
	private String connectionType;
	private Date appointmentStartDate;
	private String appointmentStartDatePicker;
	private Date appointmentFinishDate;
	private String iIlart;
	private String appointmentStartTime;
	private String appointmentFinishTime;
	private String appointmentDistrict;
	private String bankAccountNo;
	private String bankName;
	private String branchMicrCode;
	private String panNo;
	private String regType;
	// period missing
	private String usage;
	private String specify;
	// period to missing
	private String aadharNo;
	// reqestDate, dcOsuser, dcHost, dcMachineIp ,dcTerminal , isDocumentUpload,
	// docUpload , missing
	private String middleName;
	// missing voltage level and supply

	// mapped in same table but different field
	private String firmName;
	private String authorizedSignature;
	// others purpose
	private String password;
	private String companyName;
	private Date period;
	private String periodDatePicker;
	private String periodToDatePicker;
	private Date periodTo;
	//private List<DssNewConDocsTemp> dssNewConDocsTempList;
	// for document upload
	private String documentType;
	private String documentName;
	private String documentPath;
	private String existingDocumentPath;
	// saporder missing
	// remark missing
	private String discom;
	private String discomKey;
	private String lowerLoadChange;
	private String upperLoadChange;

	// stag 1
	private String designationSignatory;
	private String typeOfOrganisation;
	private Date dateOfIncorporation;
	private Date dateOfBirth;
	private Date dateOfAnniversary;
	private String motherName;
	// stag 2
	private String cMobileNo;
	private String clandLine;
	private String cemail;
	private String phouseNo;
	private String pbuildingName;
	private String pstreet;
	private String parea;
	private String plandmark;
	private String plandmarkDetails;
	private String ppostalCode;
	private String paMobileNo;
	private String plandLine;
	private String pemail;
	// stag 3
	private String newOrExistingConnection;
	private String serviceReqConnection;
	private String billingType;
	private String typeOfArea;
	private String typeOfPremises;
	private String usageOfNewConnection;
	private String meterChoice;
	private String appliedVoltageLevel;
	private String phase;
	private String voterIDNo;

	private String witnessname;
	private String witnessMobile;
	private String elcbInstall;
	private String registeredOfficeAdd;
	private String usageOfEVConnection;
	private String gstInNo;
	private String locality;
	private String latitude;
	private String longitude;
	private String upicNumberflag;
	private String upicNumber;
	private String visitLocation;
	private String neighborMeterNo;
	private String radioAppointment;	
	
	public String getRadioAppointment() {
		return radioAppointment;
	}

	public void setRadioAppointment(String radioAppointment) {
		this.radioAppointment = radioAppointment;
	}

	public String getNeighborMeterNo() {
		return neighborMeterNo;
	}

	public void setNeighborMeterNo(String neighborMeterNo) {
		this.neighborMeterNo = neighborMeterNo;
	}

	public String getVisitLocation() {
		return visitLocation;
	}

	public void setVisitLocation(String visitLocation) {
		this.visitLocation = visitLocation;
	}

	public String getUpicNumberflag() {
		return upicNumberflag;
	}

	public void setUpicNumberflag(String upicNumberflag) {
		this.upicNumberflag = upicNumberflag;
	}

	public String getUpicNumber() {
		return upicNumber;
	}

	public void setUpicNumber(String upicNumber) {
		this.upicNumber = upicNumber;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getGstInNo() {
		return gstInNo;
	}

	public void setGstInNo(String gstInNo) {
		this.gstInNo = gstInNo;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getUsageOfEVConnection() {
		return usageOfEVConnection;
	}

	public void setUsageOfEVConnection(String usageOfEVConnection) {
		this.usageOfEVConnection = usageOfEVConnection;
	}

	public String getpEmailId() {
		return pEmailId;
	}

	public void setpEmailId(String pEmailId) {
		this.pEmailId = pEmailId;
	}

	public String getDesignationSignatory() {
		return designationSignatory;
	}

	public void setDesignationSignatory(String designationSignatory) {
		this.designationSignatory = designationSignatory;
	}

	public String getTypeOfOrganisation() {
		return typeOfOrganisation;
	}

	public void setTypeOfOrganisation(String typeOfOrganisation) {
		this.typeOfOrganisation = typeOfOrganisation;
	}

	public Date getDateOfIncorporation() {
		return dateOfIncorporation;
	}

	public void setDateOfIncorporation(Date dateOfIncorporation) {
		this.dateOfIncorporation = dateOfIncorporation;
	}

	public String getcMobileNo() {
		return cMobileNo;
	}

	public void setcMobileNo(String cMobileNo) {
		this.cMobileNo = cMobileNo;
	}

	public String getClandLine() {
		return clandLine;
	}

	public void setClandLine(String clandLine) {
		this.clandLine = clandLine;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getPhouseNo() {
		return phouseNo;
	}

	public void setPhouseNo(String phouseNo) {
		this.phouseNo = phouseNo;
	}

	public String getPbuildingName() {
		return pbuildingName;
	}

	public void setPbuildingName(String pbuildingName) {
		this.pbuildingName = pbuildingName;
	}

	public String getPstreet() {
		return pstreet;
	}

	public void setPstreet(String pstreet) {
		this.pstreet = pstreet;
	}

	public String getParea() {
		return parea;
	}

	public void setParea(String parea) {
		this.parea = parea;
	}

	public String getPlandmark() {
		return plandmark;
	}

	public void setPlandmark(String plandmark) {
		this.plandmark = plandmark;
	}

	public String getPlandmarkDetails() {
		return plandmarkDetails;
	}

	public void setPlandmarkDetails(String plandmarkDetails) {
		this.plandmarkDetails = plandmarkDetails;
	}

	public String getPpostalCode() {
		return ppostalCode;
	}

	public void setPpostalCode(String ppostalCode) {
		this.ppostalCode = ppostalCode;
	}

	public String getPlandLine() {
		return plandLine;
	}

	public void setPlandLine(String plandLine) {
		this.plandLine = plandLine;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public String getBillingType() {
		return billingType;
	}

	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}

	public String getTypeOfArea() {
		return typeOfArea;
	}

	public void setTypeOfArea(String typeOfArea) {
		this.typeOfArea = typeOfArea;
	}

	public String getTypeOfPremises() {
		return typeOfPremises;
	}

	public void setTypeOfPremises(String typeOfPremises) {
		this.typeOfPremises = typeOfPremises;
	}

	public String getUsageOfNewConnection() {
		return usageOfNewConnection;
	}

	public void setUsageOfNewConnection(String usageOfNewConnection) {
		this.usageOfNewConnection = usageOfNewConnection;
	}

	public String getMeterChoice() {
		return meterChoice;
	}

	public void setMeterChoice(String meterChoice) {
		this.meterChoice = meterChoice;
	}

	public String getAppliedVoltageLevel() {
		return appliedVoltageLevel;
	}

	public void setAppliedVoltageLevel(String appliedVoltageLevel) {
		this.appliedVoltageLevel = appliedVoltageLevel;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getBpNumber() {
		return bpNumber;
	}

	public void setBpNumber(String bpNumber) {
		this.bpNumber = bpNumber;
	}

	private String caNumber;

	public String getCaNumber() {
		return caNumber;
	}

	public void setCaNumber(String caNumber) {
		this.caNumber = caNumber;
	}

	private String requestTypeValue;

	public String getRequestTypeValue() {
		return requestTypeValue;
	}

	public void setRequestTypeValue(String requestTypeValue) {
		this.requestTypeValue = requestTypeValue;
	}

	public String getCaNumberTwelveDigit() {
		return caNumberTwelveDigit;
	}

	public void setCaNumberTwelveDigit(String caNumberTwelveDigit) {
		this.caNumberTwelveDigit = caNumberTwelveDigit;
	}

	public String getPlanningPlant() {
		if (getDiscom().equalsIgnoreCase("BRPL")) {
			return "D021";
		} else {
			return "D031";
		}
	}

	public void setPlanningPlant(String planningPlant) {
		this.planningPlant = planningPlant;
	}

	public String getLandmarkDetail() {
		return landmarkDetail;
	}

	public void setLandmarkDetail(String landmarkDetail) {
		this.landmarkDetail = landmarkDetail;
	}

	public String getAppointmentStartDatePicker() {
		return appointmentStartDatePicker;
	}

	public void setAppointmentStartDatePicker(String appointmentStartDatePicker) {
		this.appointmentStartDatePicker = appointmentStartDatePicker;
	}

	public String getPeriodDatePicker() {
		return periodDatePicker;
	}

	public void setPeriodDatePicker(String periodDatePicker) {
		this.periodDatePicker = periodDatePicker;
	}

	public String getPeriodToDatePicker() {
		return periodToDatePicker;
	}

	public void setPeriodToDatePicker(String periodToDatePicker) {
		this.periodToDatePicker = periodToDatePicker;
	}

	public String getiIlart() {
		return iIlart;
	}

	public void setiIlart(String iIlart) {
		this.iIlart = iIlart;
	}

	public Date getAppointmentFinishDate() {
		return appointmentFinishDate;
	}

	public void setAppointmentFinishDate(Date appointmentFinishDate) {
		this.appointmentFinishDate = appointmentFinishDate;
	}

	public String getAppointmentFinishTime() {
		return appointmentFinishTime;
	}

	public void setAppointmentFinishTime(String appointmentFinishTime) {
		this.appointmentFinishTime = appointmentFinishTime;
	}

	public String getDiscomKey() {
		return discomKey;
	}

	public void setDiscomKey(String discomKey) {
		this.discomKey = discomKey;
	}
/*
	public List<DssNewConDocsTemp> getDssNewConDocsTempList() {
		return dssNewConDocsTempList;
	}

	public void setDssNewConDocsTempList(List<DssNewConDocsTemp> dssNewConDocsTempList) {
		this.dssNewConDocsTempList = dssNewConDocsTempList;
	}
*/
	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public Date getPeriodTo() {
		return periodTo;
	}

	public void setPeriodTo(Date periodTo) {
		this.periodTo = periodTo;
	}

	public String getExistingDocumentPath() {
		return existingDocumentPath;
	}

	public void setExistingDocumentPath(String existingDocumentPath) {
		this.existingDocumentPath = existingDocumentPath;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentPath() {
		return documentPath;
	}

	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}

	public String getPEmailId() {
		return pEmailId;
	}

	public void setPEmailId(String pEmailId) {
		this.pEmailId = pEmailId;
	}

	public String getNewOrExistingConnection() {
		return newOrExistingConnection;
	}

	public void setNewOrExistingConnection(String newOrExistingConnection) {
		this.newOrExistingConnection = newOrExistingConnection;
	}

	public String getServiceReqConnection() {
		return serviceReqConnection;
	}

	public void setServiceReqConnection(String serviceReqConnection) {
		this.serviceReqConnection = serviceReqConnection;
	}

	public String getRequstNo() {
		return requstNo;
	}

	public void setRequstNo(String requstNo) {
		this.requstNo = requstNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getAppliedCategory() {
		return appliedCategory;
	}

	public void setAppliedCategory(String appliedCategory) {
		this.appliedCategory = appliedCategory;
	}

	public String getAppliedLoadType() {
		return appliedLoadType;
	}

	public void setAppliedLoadType(String appliedLoadType) {
		this.appliedLoadType = appliedLoadType;
	}

	public long getAppliedLoad() {
		return appliedLoad;
	}

	public void setAppliedLoad(long appliedLoad) {
		this.appliedLoad = appliedLoad;
	}

	public String getStatementCode() {
		return statementCode;
	}

	public void setStatementCode(String statementCode) {
		this.statementCode = statementCode;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public Date getAppointmentStartDate() {
		return appointmentStartDate;
	}

	public void setAppointmentStartDate(Date appointmentStartDate) {
		this.appointmentStartDate = appointmentStartDate;
	}

	public String getAppointmentStartTime() {
		return appointmentStartTime;
	}

	public void setAppointmentStartTime(String appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;
	}

	public String getDiscom() {
		return discom;
	}

	public void setDiscom(String discom) {
		this.discom = discom;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchMicrCode() {
		return branchMicrCode;
	}

	public void setBranchMicrCode(String branchMicrCode) {
		this.branchMicrCode = branchMicrCode;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getRegType() {
		return regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getSpecify() {
		return specify;
	}

	public void setSpecify(String specify) {
		this.specify = specify;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public String getAuthorizedSignature() {
		return authorizedSignature;
	}

	public void setAuthorizedSignature(String authorizedSignature) {
		this.authorizedSignature = authorizedSignature;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLowerLoadChange() {
		return lowerLoadChange;
	}

	public void setLowerLoadChange(String lowerLoadChange) {
		this.lowerLoadChange = lowerLoadChange;
	}

	public String getUpperLoadChange() {
		return upperLoadChange;
	}

	public void setUpperLoadChange(String upperLoadChange) {
		this.upperLoadChange = upperLoadChange;
	}

	public String getPaMobileNo() {
		return paMobileNo;
	}

	public void setPaMobileNo(String pmobile) {
		this.paMobileNo = pmobile;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfAnniversary() {
		return dateOfAnniversary;
	}

	public void setDateOfAnniversary(Date dateOfAnniversary) {
		this.dateOfAnniversary = dateOfAnniversary;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getVoterIDNo() {
		return voterIDNo;
	}

	public void setVoterIDNo(String voterIDNo) {
		this.voterIDNo = voterIDNo;
	}

	public String getWitnessname() {
		return witnessname;
	}

	public void setWitnessname(String witnessname) {
		this.witnessname = witnessname;
	}

	public String getWitnessMobile() {
		return witnessMobile;
	}

	public void setWitnessMobile(String witnessMobile) {
		this.witnessMobile = witnessMobile;
	}

	public String getElcbInstall() {
		return elcbInstall;
	}

	public void setElcbInstall(String elcbInstall) {
		this.elcbInstall = elcbInstall;
	}

	public String getRegisteredOfficeAdd() {
		return registeredOfficeAdd;
	}

	public void setRegisteredOfficeAdd(String registeredOfficeAdd) {
		this.registeredOfficeAdd = registeredOfficeAdd;
	}
	
	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getAppointmentDistrict() {
		return appointmentDistrict;
	}

	public void setAppointmentDistrict(String appointmentDistrict) {
		this.appointmentDistrict = appointmentDistrict;
	}

	@Override
	public String toString() {
		return "NewConnectionWrapper [orderNo=" + orderNo + ", bpNumber=" + bpNumber + ", userName=" + userName + ", pEmailId=" + pEmailId + ", requstNo=" + requstNo
				+ ", status=" + status + ", requestType=" + requestType + ", district=" + district + ", title=" + title + ", occupation=" + occupation + ", firstName="
				+ firstName + ", lastName=" + lastName + ", fatherName=" + fatherName + ", houseNo=" + houseNo + ", buildingName=" + buildingName + ", street=" + street
				+ ", area=" + area + ", landmark=" + landmark + ", landmarkDetail=" + landmarkDetail + ", planningPlant=" + planningPlant + ", caNumberTwelveDigit="
				+ caNumberTwelveDigit + ", pin=" + pin + ", sex=" + sex + ", mobileNo=" + mobileNo + ", phoneNo=" + phoneNo + ", email=" + email + ", faxNo=" + faxNo
				+ ", appliedCategory=" + appliedCategory + ", appliedLoadType=" + appliedLoadType + ", appliedLoad=" + appliedLoad + ", statementCode=" + statementCode
				+ ", connectionType=" + connectionType + ", appointmentStartDate=" + appointmentStartDate + ", appointmentStartDatePicker=" + appointmentStartDatePicker
				+ ", appointmentFinishDate=" + appointmentFinishDate + ", iIlart=" + iIlart + ", appointmentStartTime=" + appointmentStartTime
				+ ", appointmentFinishTime=" + appointmentFinishTime + ", bankAccountNo=" + bankAccountNo + ", bankName=" + bankName + ", branchMicrCode="
				+ branchMicrCode + ", panNo=" + panNo + ", regType=" + regType + ", usage=" + usage + ", specify=" + specify + ", aadharNo=" + aadharNo + ", middleName="
				+ middleName + ", firmName=" + firmName + ", authorizedSignature=" + authorizedSignature + ", password=" + password + ", companyName=" + companyName
				+ ", period=" + period + ", periodDatePicker=" + periodDatePicker + ", periodToDatePicker=" + periodToDatePicker + ", periodTo=" + periodTo
				+ ", dssNewConDocsTempList=" + "dssNewConDocsTempList" + ", documentType=" + documentType + ", documentName=" + documentName + ", documentPath="
				+ documentPath + ", existingDocumentPath=" + existingDocumentPath + ", discom=" + discom + ", discomKey=" + discomKey + ", lowerLoadChange="
				+ lowerLoadChange + ", upperLoadChange=" + upperLoadChange + ", designationSignatory=" + designationSignatory + ", typeOfOrganisation="
				+ typeOfOrganisation + ", dateOfIncorporation=" + dateOfIncorporation + ", dateOfBirth=" + dateOfBirth + ", dateOfAnniversary=" + dateOfAnniversary
				+ ", motherName=" + motherName + ", cMobileNo=" + cMobileNo + ", clandLine=" + clandLine + ", cemail=" + cemail + ", phouseNo=" + phouseNo
				+ ", pbuildingName=" + pbuildingName + ", pstreet=" + pstreet + ", parea=" + parea + ", plandmark=" + plandmark + ", plandmarkDetails=" + plandmarkDetails
				+ ", ppostalCode=" + ppostalCode + ", paMobileNo=" + paMobileNo + ", plandLine=" + plandLine + ", pemail=" + pemail + ", newOrExistingConnection="
				+ newOrExistingConnection + ", serviceReqConnection=" + serviceReqConnection + ", billingType=" + billingType + ", typeOfArea=" + typeOfArea
				+ ", typeOfPremises=" + typeOfPremises + ", usageOfNewConnection=" + usageOfNewConnection + ", meterChoice=" + meterChoice + ", appliedVoltageLevel="
				+ appliedVoltageLevel + ", phase=" + phase + ", voterIDNo=" + voterIDNo + ", witnessname=" + witnessname + ", witnessMobile=" + witnessMobile
				+ ", elcbInstall=" + elcbInstall + ", registeredOfficeAdd=" + registeredOfficeAdd + ", usageOfEVConnection=" + usageOfEVConnection + ", gstInNo="
				+ gstInNo + ", locality=" + locality + ", latitude=" + latitude + ", longitude=" + longitude + ", uPICNumberflag=" + upicNumberflag + ", uPICNumber="
				+ upicNumber + ", caNumber=" + caNumber + ", requestTypeValue=" + requestTypeValue + "]";
	}

	
	
}
