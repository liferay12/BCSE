package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputTable")
public class ZBapiFicaDemandDetails {

	@XmlElement(name = "Doc_Number")
	private String strORDER_NO;

	@XmlElement(name = "Amount")
	private String amount;

	@XmlElement(name = "Ca_Number")
	private String caNumber;

	@XmlElement(name = "Message")
	private String messageField;
	
	@XmlElement(name = "Total")
	private String total;
	
	@XmlElement(name = "Consumer_Name")
	private String consumeName;
	
	@XmlElement(name = "Company")
	private String company;


	public String getStrORDER_NO() {
		return strORDER_NO;
	}

	public void setStrORDER_NO(String strORDER_NO) {
		this.strORDER_NO = strORDER_NO;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCaNumber() {
		return caNumber;
	}

	public void setCaNumber(String caNumber) {
		this.caNumber = caNumber;
	}

	public String getMessageField() {
		return messageField;
	}

	public void setMessageField(String messageField) {
		this.messageField = messageField;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getConsumeName() {
		return consumeName;
	}

	public void setConsumeName(String consumeName) {
		this.consumeName = consumeName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public ZBapiFicaDemandDetails(){
		
	}
}
