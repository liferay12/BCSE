package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ISUSTDTable")
public class CmsISUCADisplayResponse {

	@XmlElement(name = "Ca_Number")
	private String caNumber;

	@XmlElement(name = "Bp_Number")
	private String bpNumber;

	@XmlElement(name = "City")
	private String city;
	
	@XmlElement(name = "Post_Code")
	private String postCode;
	
	@XmlElement(name = "POLE_NO")
	private String POLE_NO;
	
	@XmlElement(name = "House_Number")
	private String House_Number;
	
	@XmlElement(name = "Floor")
	private String Floor;
	
	@XmlElement(name = "Device_Sr_Number")
	private String Device_Sr_Number;
	
	@XmlElement(name = "Region")
	private String region;
	
	@XmlElement(name="Country")
	private String country;

	@XmlElement(name = "Bp_Name")
	private String bpName;

	@XmlElement(name = "Search_Term2")
	private String searchTerm2;
	
	@XmlElement(name = "Street")
	private String street;
	
	
	@XmlElement(name = "Reg_Str_Group")
	private String Reg_Str_Group;


	@XmlElement(name = "Street2")
	private String street2;

	@XmlElement(name = "Street3")
	private String street3;

	@XmlElement(name = "E_Mail")
	private String emailId;
	
	@XmlElement(name = "Street4")
	private String street4;

	@XmlElement(name = "Tel1_Number")
	private String mobileNo;
	
	@XmlElement(name = "Telephone_No")
	private String mobileNo1;
	
	public String getMobileNo1() {
		return mobileNo1;
	}

	public void setMobileNo1(String mobileNo1) {
		this.mobileNo1 = mobileNo1;
	}
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	private String message;
	
	private boolean flag;
	
	public String getMobileNo() {
		return mobileNo;
	}
	
	
	public String getHouse_Number() {
		return House_Number;
	}
	public String getDevice_Sr_Number() {
		return Device_Sr_Number;
	}
	
	public String getReg_Str_Group() {
		return Reg_Str_Group;
	}
	
	
	public String getFloor() {
		return Floor;
	}
	
	public String getPOLE_NO() {
		return POLE_NO;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCaNumber() {
		return caNumber;
	}

	public String getBpNumber() {
		return bpNumber;
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

	public void setCaNumber(String caNumber) {
		this.caNumber = caNumber;
	}

	public void setBpNumber(String bpNumber) {
		this.bpNumber = bpNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBpName() {
		return bpName;
	}

	public void setBpName(String bpName) {
		this.bpName = bpName;
	}

	public String getSearchTerm2() {
		return searchTerm2;
	}

	public void setSearchTerm2(String searchTerm2) {
		this.searchTerm2 = searchTerm2;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getStreet3() {
		return street3;
	}

	public void setStreet3(String street3) {
		this.street3 = street3;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet4() {
		return street4;
	}

	public void setStreet4(String street4) {
		this.street4 = street4;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
}
