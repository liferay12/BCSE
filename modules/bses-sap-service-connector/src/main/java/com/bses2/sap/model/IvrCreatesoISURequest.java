package com.bses2.sap.model;

public class IvrCreatesoISURequest {
	
	private String caNumber;
	private String complaintType;
	private String orderNo;
	private String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getCaNumber() {
		return caNumber;
	}
	public void setCaNumber(String caNumber) {
		this.caNumber = caNumber;
	}
	public String getComplaintType() {
		return complaintType;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

}
