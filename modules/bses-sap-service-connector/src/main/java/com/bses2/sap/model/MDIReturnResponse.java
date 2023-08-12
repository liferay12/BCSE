package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Return")
public class MDIReturnResponse {
	
	@XmlElement(name = "Number")
	private String number;
	
	private String msg;
	
	@XmlElement(name = "Log_Msg_No")
	private String logMsgNo;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getLogMsgNo() {
		return logMsgNo;
	}

	public void setLogMsgNo(String logMsgNo) {
		this.logMsgNo = logMsgNo;
	}
	

}
