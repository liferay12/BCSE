package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DocumentElement")
public class ComplaintRegistrationWebAreaResponse {

	@XmlElement(name = "CMS_x0020_Complaint")
	private ComplaintRegistrationWebAreaDetailResponse complaintRegistrationWebAreaDetailResponse;

	public ComplaintRegistrationWebAreaDetailResponse getComplaintRegistrationWebAreaDetailResponse() {
		return complaintRegistrationWebAreaDetailResponse;
	}

	public void setComplaintRegistrationWebAreaDetailResponse(
			ComplaintRegistrationWebAreaDetailResponse complaintRegistrationWebAreaDetailResponse) {
		this.complaintRegistrationWebAreaDetailResponse = complaintRegistrationWebAreaDetailResponse;
	}

}
