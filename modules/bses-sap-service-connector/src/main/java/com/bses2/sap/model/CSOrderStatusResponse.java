package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Result")
public class CSOrderStatusResponse {
	
	@XmlElement(name = "ORDER_DESC")
	private String orderDesc;
	
	@XmlElement(name = "ORDER_STATUS")
	private String orderStatus;
	
	@XmlElement(name = "TEXT")
	private String text;
	
	@XmlElement(name = "PM_ACT_TEXT")
	private String pmActText;
	
	@XmlElement(name = "COMPANY_CODE")
	private String companyCode;
	
	@XmlElement(name = "ORDER_TYPE")
	private String orderType;

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPmActText() {
		return pmActText;
	}

	public void setPmActText(String pmActText) {
		this.pmActText = pmActText;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	

}
