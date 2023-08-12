package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "STRUC_OUT")
public class PrepaidRtgsSyrucOutResponse {
	
	@XmlElement(name = "COMP_CODE")
	private String companyCode;

	@XmlElement(name = "CONTRACT")
	private String contract;

	@XmlElement(name = "CONTRACT_ACCOUNT")
	private String contractAccount;
	
	@XmlElement(name = "NAME")
	private String name;

	@XmlElement(name = "ADDRESS")
	private String address;
	
	@XmlElement(name = "TEL1_NUMBR")
	private String telNumber;

	@XmlElement(name = "ACCT_CLASS")
	private String acctClass;

	@XmlElement(name = "MANUFACTURER")
	private String manufacturer;
	
	@XmlElement(name = "FLAG")
	private String flag;

	@XmlElement(name = "MESSAGE")
	private String message;
	
	@XmlElement(name = "SERIALNO")
	private String serialno;
	

	public String getSerialno() {
		return serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getContractAccount() {
		return contractAccount;
	}

	public void setContractAccount(String contractAccount) {
		this.contractAccount = contractAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getAcctClass() {
		return acctClass;
	}

	public void setAcctClass(String acctClass) {
		this.acctClass = acctClass;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
