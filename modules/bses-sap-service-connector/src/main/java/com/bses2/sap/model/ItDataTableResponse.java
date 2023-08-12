package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "IT_DATA_TABLE")
public class ItDataTableResponse {
	
	@XmlElement(name = "ORDER_TYPE")
	private String orderType;

	@XmlElement(name = "DIVISION")
	private String division;

	@XmlElement(name = "APPOINTMENT_START_DATE")
	private String appointStartDate;
	
	@XmlElement(name = "APPOINTMENT_TIME")
	private String appointTime;

	@XmlElement(name = "REC_COUNT")
	private String RecCount;

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getAppointStartDate() {
		return appointStartDate;
	}

	public void setAppointStartDate(String appointStartDate) {
		this.appointStartDate = appointStartDate;
	}

	public String getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(String appointTime) {
		this.appointTime = appointTime;
	}

	public String getRecCount() {
		return RecCount;
	}

	public void setRecCount(String recCount) {
		RecCount = recCount;
	}
	

}
