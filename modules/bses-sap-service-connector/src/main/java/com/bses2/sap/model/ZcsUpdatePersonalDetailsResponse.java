package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "FLAG")
public class ZcsUpdatePersonalDetailsResponse {

	@XmlElement(name = "FLAG")
	private String flag;

	public String getFlag() {
		return flag;
	}

	public void String(String flag) {
		this.flag = flag;
	}
	
	
}
