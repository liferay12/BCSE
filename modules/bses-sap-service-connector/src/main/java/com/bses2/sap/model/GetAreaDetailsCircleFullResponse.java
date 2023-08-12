package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Table1")
public class GetAreaDetailsCircleFullResponse {
	
	@XmlElement(name = "OBJECTID")
	private String objectID;
	

	@XmlElement(name = "FACILITYID")
	private String complaintCentreID;

	@XmlElement(name = "COMPLAINT_CENTRE")
	private String complaintCentre;

	@XmlElement(name = "CONTACTINF")
	private String contactinfo;

	@XmlElement(name = "DIV_CD")
	private String divisionCode;

	@XmlElement(name = "DIV_NAME")
	private String division;

	@XmlElement(name = "NAME")
	private String areaname;

	@XmlElement(name = "Circle")
	private String areacircle;

	public String getObjectID() {
		return objectID;
	}

	public void setObjectID(String objectID) {
		this.objectID = objectID;
	}
	public String getComplaintCentreID() {
		return complaintCentreID;
	}

	public void setComplaintCentreID(String complaintCentreID) {
		this.complaintCentreID = complaintCentreID;
	}

	public String getComplaintCentre() {
		return complaintCentre;
	}

	public void setComplaintCentre(String complaintCentre) {
		this.complaintCentre = complaintCentre;
	}

	public String getContactinfo() {
		return contactinfo;
	}

	public void setContactinfo(String contactinfo) {
		this.contactinfo = contactinfo;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public String getAreacircle() {
		return areacircle;
	}

	public void setAreacircle(String areacircle) {
		this.areacircle = areacircle;
	}

}
