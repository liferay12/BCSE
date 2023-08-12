package com.bses2.sap.model;

public class GetFaultTypesFromCatRequest {
	private String byplWebServiceKey;
	private String faultCategory;

	public String getByplWebServiceKey() {
		return byplWebServiceKey;
	}

	public void setByplWebServiceKey(String byplWebServiceKey) {
		this.byplWebServiceKey = byplWebServiceKey;
	}

	public String getFaultCategory() {
		return faultCategory;
	}

	public void setFaultCategory(String faultCategory) {
		this.faultCategory = faultCategory;
	}

}
