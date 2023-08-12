package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="BAPI_RESULT")
public class PrepaidRtgsResponse {
	
	@XmlElement(name = "STRUC_OUT")
	PrepaidRtgsSyrucOutResponse prepaidRtgsRes;
	
	@XmlElement(name = "RETURN")
	PrepaidRtgsReturn prepaidRtgsReturn;
	
	private String message;
	private boolean flag;
	public PrepaidRtgsSyrucOutResponse getPrepaidRtgsRes() {
		return prepaidRtgsRes;
	}
	public void setPrepaidRtgsRes(PrepaidRtgsSyrucOutResponse prepaidRtgsRes) {
		this.prepaidRtgsRes = prepaidRtgsRes;
	}
	public PrepaidRtgsReturn getPrepaidRtgsReturn() {
		return prepaidRtgsReturn;
	}
	public void setPrepaidRtgsReturn(PrepaidRtgsReturn prepaidRtgsReturn) {
		this.prepaidRtgsReturn = prepaidRtgsReturn;
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
