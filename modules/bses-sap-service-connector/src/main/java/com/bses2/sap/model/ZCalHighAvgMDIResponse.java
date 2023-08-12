package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="AVG_MDI")
public class ZCalHighAvgMDIResponse {
	
	@XmlElement(name="Table1")
	private  AvgMDITableResponse avgMDITableResponse ;
	
	@XmlElement(name="OutputTable")
	 private AvgMDIMessageResponse  avgMDIMessageResponse;

	public AvgMDITableResponse getAvgMDITableResponse() {
		return avgMDITableResponse;
	}

	public void setAvgMDITableResponse(AvgMDITableResponse avgMDITableResponse) {
		this.avgMDITableResponse = avgMDITableResponse;
	}

	public AvgMDIMessageResponse getAvgMDIMessageResponse() {
		return avgMDIMessageResponse;
	}

	public void setAvgMDIMessageResponse(AvgMDIMessageResponse avgMDIMessageResponse) {
		this.avgMDIMessageResponse = avgMDIMessageResponse;
	}
	
	

}
