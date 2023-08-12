package com.bses2.sap.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="BAPI_RESULT")
public class CntAppDetailMobResponse {
	
	@XmlElement(name = "IT_DATA_TABLE")
	List<ItDataTableResponse> ItDataTableResponse;
	private String message;
	private boolean flag;
	
	public List<ItDataTableResponse> getItDataTableResponse() {
		return ItDataTableResponse;
	}

	public void setItDataTableResponse(List<ItDataTableResponse> itDataTableResponse) {
		ItDataTableResponse = itDataTableResponse;
	}
	
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

}
