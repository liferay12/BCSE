package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputTable")
public class AvgMDIMessageResponse {
	
	@XmlElement(name = "AvgMdi")
	private String avgMdi;
	
	@XmlElement(name = "Message")
	private String message;

	public String getAvgMdi() {
		return avgMdi;
	}

	public void setAvgMdi(String avgMdi) {
		this.avgMdi = avgMdi;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
