package com.bses2.sap.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BAPI_RESULT")
public class WebBillHistoryResponse {

	@XmlElement(name = "webBillHistoryTable")
	List<WebBillHisResponse> webBillHistoryResponse;
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

	public List<WebBillHisResponse> getWebBillHistoryResponse() {
		return webBillHistoryResponse;
	}

	public void setWebBillHistoryResponse(List<WebBillHisResponse> webBillHistoryResponse) {
		this.webBillHistoryResponse = webBillHistoryResponse;
	}
	
	

}
