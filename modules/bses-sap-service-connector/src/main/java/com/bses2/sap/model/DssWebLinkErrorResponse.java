package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "outputFlagsTable")
public class DssWebLinkErrorResponse {

    @XmlElement(name = "Type")
    private String type;

    @XmlElement(name = "Message")
    private String message;

    @XmlElement(name = "Log_Msg_No")
    private String logMsgNo;

    @XmlElement(name = "Row")
    private String row;

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public String getLogMsgNo() {
	return logMsgNo;
    }

    public void setLogMsgNo(String logMsgNo) {
	this.logMsgNo = logMsgNo;
    }

    public String getRow() {
	return row;
    }

    public void setRow(String row) {
	this.row = row;
    }

}
