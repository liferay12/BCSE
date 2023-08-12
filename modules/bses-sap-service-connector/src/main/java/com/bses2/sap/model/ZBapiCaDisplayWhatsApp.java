package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "EXPORT_CADETAILS")
public class ZBapiCaDisplayWhatsApp {

	@XmlElement(name = "CA_NUMBER")
	private String caNumber;

	@XmlElement(name = "BP_NUMBER")
	private String bpNumber;

	@XmlElement(name = "FAX_NUMBER")
	private String whatsAppNo;

	public String getCaNumber() {
		return caNumber;
	}

	public void setCaNumber(String caNumber) {
		this.caNumber = caNumber;
	}

	public String getBpNumber() {
		return bpNumber;
	}

	public void setBpNumber(String bpNumber) {
		this.bpNumber = bpNumber;
	}

	public String getWhatsAppNo() {
		return whatsAppNo;
	}

	public void setWhatsAppNo(String whatsAppNo) {
		this.whatsAppNo = whatsAppNo;
	}

	@Override
	public String toString() {
		return "ZBapiCaDisplayWhatsApp [caNumber=" + caNumber + ", bpNumber=" + bpNumber + ", whatsAppNo=" + whatsAppNo + "]";
	}

}
