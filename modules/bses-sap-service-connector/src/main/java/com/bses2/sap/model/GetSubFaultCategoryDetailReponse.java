package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Table1")
public class GetSubFaultCategoryDetailReponse {
	@XmlElement(name = "CATEGORY")
	private String subFaultCategory;

	@XmlElement(name = "TYPE")
	private String subFaultCategoryType;

	public String getSubFaultCategory() {
		return subFaultCategory;
	}

	public void setSubFaultCategory(String subFaultCategory) {
		this.subFaultCategory = subFaultCategory;
	}

	public String getSubFaultCategoryType() {
		return subFaultCategoryType;
	}

	public void setSubFaultCategoryType(String subFaultCategoryType) {
		this.subFaultCategoryType = subFaultCategoryType;
	}

	
}
