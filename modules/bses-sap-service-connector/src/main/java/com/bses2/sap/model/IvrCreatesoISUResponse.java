package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BAPI_RESULT")
public class IvrCreatesoISUResponse {

	@XmlElement(name = "ISUCOMP1Table")
	private IvrCreatesoISUDetailResponse ivrCreatesoISUDetailResponse;

	@XmlElement(name = "SAPDATA_BAPIErrorDataTable")
	private IvrErrorResponse ivrErrorResponse;
	
	public IvrErrorResponse getIvrErrorResponse() {
		return ivrErrorResponse;
	}

	public void setIvrErrorResponse(IvrErrorResponse ivrErrorResponse) {
		this.ivrErrorResponse = ivrErrorResponse;
	}

	public void setIvrCreatesoISUDetailResponse(IvrCreatesoISUDetailResponse ivrCreatesoISUDetailResponse) {
		this.ivrCreatesoISUDetailResponse = ivrCreatesoISUDetailResponse;
	}

	private String message;
	private boolean flag;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public IvrCreatesoISUDetailResponse getIvrCreatesoISUDetailResponse() {
		return ivrCreatesoISUDetailResponse;
	}

}
