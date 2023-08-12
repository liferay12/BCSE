package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SAPDATA_ErrorDataTable")
public class ZbapiCreateSOPostErrorResponse {

	@XmlElement(name = "Number")
	private String number;
	
	@XmlElement(name = "Message")
	private String message;
	
	@XmlElement(name = "Log_Msg_No")
	private String logMsgNo;
	
	@XmlElement(name = "Row")
	private String row;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getLogMsgBo() {
		return logMsgNo;
	}
	public void setLogMsgBo(String logMsgBo) {
		this.logMsgNo = logMsgBo;
	}
	public String getRow() {
		return row;
	}
	public void setRow(String row) {
		this.row = row;
	}

	
}
