package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ErrorTable")
public class DssWebLinkErrorTableResponse {

    @XmlElement(name = "Data")
    private String data;

    @Override
	public String toString() {
		return "DssWebLinkErrorTableResponse [data=" + data + "]";
	}

	public String getData() {
	return data;
    }

    public void setData(String data) {
	this.data = data;
    }

}
