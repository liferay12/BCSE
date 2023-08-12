package com.bses2.sap.model;

public class ComplaintRegistrationWebAreaRequest {
	private String areaName;
	private String callerName;
	private String callerphone;
	private String address;
	private String faultCat;
	private String faultType;
	private String complaintCentreCode;
	private String circle;
	private String division;
	private String areaObjectID;
	private String remarks;
	private String source;
	private String streetLightLocation;

	public String getStreetLightLocation() {
		return streetLightLocation;
	}

	public void setStreetLightLocation(String streetLightLocation) {
		this.streetLightLocation = streetLightLocation;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCallerName() {
		return callerName;
	}

	public void setCallerName(String callerName) {
		this.callerName = callerName;
	}

	public String getCallerphone() {
		return callerphone;
	}

	public void setCallerphone(String callerphone) {
		this.callerphone = callerphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFaultCat() {
		return faultCat;
	}

	public void setFaultCat(String faultCat) {
		this.faultCat = faultCat;
	}

	public String getFaultType() {
		return faultType;
	}

	public void setFaultType(String faultType) {
		this.faultType = faultType;
	}

	public String getComplaintCentreCode() {
		return complaintCentreCode;
	}

	public void setComplaintCentreCode(String complaintCentreCode) {
		this.complaintCentreCode = complaintCentreCode;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getAreaObjectID() {
		return areaObjectID;
	}

	public void setAreaObjectID(String areaObjectID) {
		this.areaObjectID = areaObjectID;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "ComplaintRegistrationWebAreaRequest [areaName=" + areaName + ", callerName=" + callerName + ", callerphone=" + callerphone + ", address=" + address
				+ ", faultCat=" + faultCat + ", faultType=" + faultType + ", complaintCentreCode=" + complaintCentreCode + ", circle=" + circle + ", division=" + division
				+ ", areaObjectID=" + areaObjectID + ", remarks=" + remarks + ", source=" + source + ", streetLightLocation=" + streetLightLocation + "]";
	}
	
	

}
