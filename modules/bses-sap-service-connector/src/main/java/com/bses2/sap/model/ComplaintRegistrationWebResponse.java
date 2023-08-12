package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DocumentElement")
public class ComplaintRegistrationWebResponse {
	@XmlElement(name = "CMS_x0020_Complaint")
	private ComplaintRegistrationWebDetailResponse complaintRegistrationWebDetailResponse;

	public ComplaintRegistrationWebDetailResponse getComplaintRegistrationWebDetailResponse() {
		return complaintRegistrationWebDetailResponse;
	}

	public void setComplaintRegistrationWebDetailResponse(
			ComplaintRegistrationWebDetailResponse complaintRegistrationWebDetailResponse) {
		this.complaintRegistrationWebDetailResponse = complaintRegistrationWebDetailResponse;
	}

}
