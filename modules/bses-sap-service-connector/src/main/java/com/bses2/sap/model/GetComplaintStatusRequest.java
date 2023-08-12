package com.bses2.sap.model;

public class GetComplaintStatusRequest {
	private String byplWebServiceKey;
	private String complaintNo;

	public String getByplWebServiceKey() {
		return byplWebServiceKey;
	}

	public void setByplWebServiceKey(String byplWebServiceKey) {
		this.byplWebServiceKey = byplWebServiceKey;
	}

	public String getComplaintNo() {
		return complaintNo;
	}

	public void setComplaintNo(String complaintNo) {
		this.complaintNo = complaintNo;
	}

}
