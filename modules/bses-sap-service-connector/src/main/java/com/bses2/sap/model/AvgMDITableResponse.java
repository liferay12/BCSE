package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Table1")
public class AvgMDITableResponse {
	
	@XmlElement(name = "VKONT")
	private String vkont;
	
	private String msg;

	public String getVkont() {
		return vkont;
	}

	public void setVkont(String vkont) {
		this.vkont = vkont;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	

}
