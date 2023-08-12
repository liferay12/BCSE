package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CMS_x0020_Complaint")
public class ComplaintRegistrationWebDetailResponse {

	@XmlElement(name = "Status")
	private String complaintStatus;

	@XmlElement(name = "Comment")
	private String complaintComment;

	public String getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	public String getComplaintComment() {
		return complaintComment;
	}

	public void setComplaintComment(String complaintComment) {
		this.complaintComment = complaintComment;
	}

}
