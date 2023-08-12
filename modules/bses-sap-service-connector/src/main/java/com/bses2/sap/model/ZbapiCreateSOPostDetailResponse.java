package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputTable")
public class ZbapiCreateSOPostDetailResponse {

	@XmlElement(name = "OrderId")
	private String orderID;
	
	@XmlElement(name = "Noptif_No")
	private String noptifNo;
	
	@XmlElement(name = "Doc_No")
	private String docNo;

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getNoptifNo() {
		return noptifNo;
	}

	public void setNoptifNo(String noptifNo) {
		this.noptifNo = noptifNo;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

}
