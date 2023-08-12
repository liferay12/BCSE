package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ISUSTDTable")
public class DssISUCADisplayResponse {

	@XmlElement(name = "Ca_Number")
	private String caNumber;

	private String disCom;

	@XmlElement(name = "Reg_Str_Group")
	private String regGroup;

	private String districtCode;
	
	private String districtDescription;

	@XmlElement(name = "Bp_Name")
	private String name;
	
	//new field added
	@XmlElement(name = "Bp_Type")
	private String bpType;
	
	@XmlElement(name = "Search_Term2")
	private String consumerType;

	@XmlElement(name = "House_Number")
	private String houseNumber;
	
	@XmlElement(name = "Street")
	private String buildingName;
	
	@XmlElement(name = "Street2")
	private String street;

	@XmlElement(name = "Street3")
	private String colony;
	
	@XmlElement(name = "Street4")
	private String landmark;
	
	@XmlElement(name = "Post_Code")
	private String postCode;

	@XmlElement(name = "Tel1_Number")
	private String mobileNo;

	@XmlElement(name = "Telephone_No")
	private String landLineNo;
	
	@XmlElement(name = "E_Mail")
	private String email;
	
	@XmlElement(name = "TARIFTYP")
	private String tariff;
	
	@XmlElement(name = "WERT1")
	private String load;
	
	@XmlElement(name = "Bp_Number")
	private String bpNumber;
	
	@XmlElement(name = "Bill_Class")
	private String billClass;
	
	@XmlElement(name = "Bill_Schema")
	private String billSchema;
	
	@XmlElement(name = "Bill_Desc")
	private String billDesc;
	
			
	public String getBillSchema() {
		return billSchema;
	}

	public void setBillSchema(String billSchema) {
		this.billSchema = billSchema;
	}

	public String getBillDesc() {
		return billDesc;
	}

	public void setBillDesc(String billDesc) {
		this.billDesc = billDesc;
	}

	public String getBillClass() {
		return billClass;
	}

	public void setBillClass(String billClass) {
		this.billClass = billClass;
	}

	public String getBpNumber() {
		return bpNumber;
	}

	public void setBpNumber(String bpNumber) {
		this.bpNumber = bpNumber;
	}

	public String getLoad() {
		return load;
	}

	public void setLoad(String load) {
		this.load = load;
	}

	public String getTariff() {
		return tariff;
	}

	public void setTariff(String tariff) {
		this.tariff = tariff;
	}

	private String message;
	
	private boolean flag;

	public String getCaNumber() {
		return caNumber;
	}

	public void setCaNumber(String caNumber) {
		this.caNumber = caNumber;
	}

	public String getDisCom() {
		return disCom;
	}

	public void setDisCom(String disCom) {
		this.disCom = disCom;
	}

	public String getRegGroup() {
		return regGroup;
	}

	public void setRegGroup(String regGroup) {
		this.regGroup = regGroup;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictDescription() {
		return districtDescription;
	}

	public void setDistrictDescription(String districtDescription) {
		this.districtDescription = districtDescription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConsumerType() {
		return consumerType;
	}

	public void setConsumerType(String consumerType) {
		this.consumerType = consumerType;
	}
	
	public String getBpType() {
		return bpType;
	}

	public void setBpType(String bpType) {
		this.bpType = bpType;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
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

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getLandLineNo() {
		return landLineNo;
	}

	public void setLandLineNo(String landLineNo) {
		this.landLineNo = landLineNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}