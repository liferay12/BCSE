package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "NewDataSet")
public class GetDivisionsFromCompanyDetailResponse {

	@XmlElement(name = "DIVISION_N")
	private String divisionName;

	@XmlElement(name = "DIVISION_C")
	private String divisionCode;

	@XmlElement(name = "CIRCLE")
	private String divisionCircle;

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getDivisionCircle() {
		return divisionCircle;
	}

	public void setDivisionCircle(String divisionCircle) {
		this.divisionCircle = divisionCircle;
	}



	

}
