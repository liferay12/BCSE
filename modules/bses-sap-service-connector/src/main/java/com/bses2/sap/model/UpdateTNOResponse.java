package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputTable")
public class UpdateTNOResponse {

	@XmlElement(name = "CA_NO")
	private String caNumber;
	
	@XmlElement(name = "MOBILE_NO")
	private String mobileNo;
	
	@XmlElement(name = "EMAILADDRESS")
	private String emailAddress;
	
	@XmlElement(name = "LANDMARKADDRESS")
	private String landmarkAddress;
	
	@XmlElement(name = "LAND_FLAG")
	private String landFlag;
	
	@XmlElement(name = "MOBILE_FLAG")
	private String mobileFlag;
	
	@XmlElement(name = "EMAIL_FLAG")
	private String emailFlag;
	
	@XmlElement(name = "LANDMARK_FLAG")
	private String landmarkFlag;
	
	@XmlElement(name = "TELVALID_FLAG")
	private String telValidFlag;
	
	@XmlElement(name = "MOBLAVID_FLAG")
	private String mobileValidFlag;
	
	@XmlElement(name = "DISPATCH_CTRL")
	private String dispatchControl;

	public String getCaNumber() {
		return caNumber;
	}

	public void setCaNumber(String caNumber) {
		this.caNumber = caNumber;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getLandmarkAddress() {
		return landmarkAddress;
	}

	public void setLandmarkAddress(String landmarkAddress) {
		this.landmarkAddress = landmarkAddress;
	}

	public String getLandFlag() {
		return landFlag;
	}

	public void setLandFlag(String landFlag) {
		this.landFlag = landFlag;
	}

	public String getMobileFlag() {
		return mobileFlag;
	}

	public void setMobileFlag(String mobileFlag) {
		this.mobileFlag = mobileFlag;
	}

	public String getEmailFlag() {
		return emailFlag;
	}

	public void setEmailFlag(String emailFlag) {
		this.emailFlag = emailFlag;
	}

	public String getLandmarkFlag() {
		return landmarkFlag;
	}

	public void setLandmarkFlag(String landmarkFlag) {
		this.landmarkFlag = landmarkFlag;
	}

	public String getTelValidFlag() {
		return telValidFlag;
	}

	public void setTelValidFlag(String telValidFlag) {
		this.telValidFlag = telValidFlag;
	}

	public String getMobileValidFlag() {
		return mobileValidFlag;
	}

	public void setMobileValidFlag(String mobileValidFlag) {
		this.mobileValidFlag = mobileValidFlag;
	}

	public String getDispatchControl() {
		return dispatchControl;
	}

	public void setDispatchControl(String dispatchControl) {
		this.dispatchControl = dispatchControl;
	}

		
	
}
