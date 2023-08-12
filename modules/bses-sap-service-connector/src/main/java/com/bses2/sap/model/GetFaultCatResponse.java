package com.bses2.sap.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BAPI_RESULT")
public class GetFaultCatResponse {
	@XmlElementWrapper(name="NewDataSet")
	@XmlElement(name="Table1")
	private List<GetFaultCatDetailResponse > table1DataList;

	public List<GetFaultCatDetailResponse> getTable1DataList() {
		return table1DataList;
	}
	

	
	

}
