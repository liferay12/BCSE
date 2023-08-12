package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputTable")
public class AdharUpdateResponse {

	@XmlElement(name = "PARTNER")
	private String partner;

	@XmlElement(name = "IDTYP")
	private String idTyp;

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getIdTyp() {
		return idTyp;
	}

	public void setIdTyp(String idTyp) {
		this.idTyp = idTyp;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public boolean getFlag1() {
		return flag1;
	}

	public void setFlag1(boolean flag1) {
		this.flag1 = flag1;
	}

	@XmlElement(name = "IDNUM")
	private String idNum;
	
	@XmlElement(name = "FLAG1")
	private boolean flag1;
	
	

}
