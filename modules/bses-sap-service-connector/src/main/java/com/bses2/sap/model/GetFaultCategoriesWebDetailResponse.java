package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Table1")
public class GetFaultCategoriesWebDetailResponse {
	@XmlElement(name = "CATEGORY")
	private String faultCategory;

	@XmlElement(name = "ID")
	private String faultCategoryID;
	
	public String getFaultCategory() {
		return faultCategory;
	}

	public void setFaultCategory(String faultCategory) {
		this.faultCategory = faultCategory;
	}

	public String getFaultCategoryID() {
		return faultCategoryID;
	}

	public void setFaultCategoryID(String faultCategoryID) {
		this.faultCategoryID = faultCategoryID;
	}

	

}
