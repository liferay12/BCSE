package com.bses2.sap.model;

public class GetDivisionsFromCompanyRequest {
	private String byplWebServiceKey;

	public String getByplWebServiceKey() {
		return byplWebServiceKey;
	}

	public void setByplWebServiceKey(String byplWebServiceKey) {
		this.byplWebServiceKey = byplWebServiceKey;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	private String companyName;

}
