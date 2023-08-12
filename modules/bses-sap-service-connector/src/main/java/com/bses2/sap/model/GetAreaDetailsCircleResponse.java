package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "NewDataSet")
public class GetAreaDetailsCircleResponse {
	//@XmlElementWrapper(name="NewDataSet")
	@XmlElement(name="Table1")
	private GetAreaDetailsCircleFullResponse getAreaDetailsCircleFullResponse;

	public GetAreaDetailsCircleFullResponse getGetAreaDetailsCircleFullResponse() {
		return getAreaDetailsCircleFullResponse;
	}

	public void setGetAreaDetailsCircleFullResponse(GetAreaDetailsCircleFullResponse getAreaDetailsCircleFullResponse) {
		this.getAreaDetailsCircleFullResponse = getAreaDetailsCircleFullResponse;
	}

	

}
