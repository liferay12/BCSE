package com.bses2.sap.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BAPI_RESULT")
public class GetDivisionsFromCompanyResponse {
	@XmlElementWrapper(name = "NewDataSet")
	@XmlElement(name = "Table1")
	private List<GetDivisionsFromCompanyDetailResponse> getDivisionList;

	public List<GetDivisionsFromCompanyDetailResponse> getGetDivisionList() {
		return getDivisionList;
	}

	public void setGetDivisionList(List<GetDivisionsFromCompanyDetailResponse> getDivisionList) {
		this.getDivisionList = getDivisionList;
	}

}
