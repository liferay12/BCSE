package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "outputFlagsTable")
public class DssWebLinkEServiceNumberResponse {

    @XmlElement(name = "E_Flag_Ap")
    private String eFlagAp;

    @XmlElement(name = "E_Flag_Bp")
    private String eFlagBp;

    @XmlElement(name = "E_Flag_So")
    private String eFlagSo;

    @XmlElement(name = "E_Flag_Us")
    private String eFlagUs;

    @XmlElement(name = "E_New_Partner")
    private String eNewPartner;

    @XmlElement(name = "E_Service_Order")
    private String eServiceOrder;

    public String geteNewPartner() {
	return eNewPartner;
    }

    public void seteNewPartner(String eNewPartner) {
	this.eNewPartner = eNewPartner;
    }

    public String geteFlagAp() {
	return eFlagAp;
    }

    @Override
	public String toString() {
		return "DssWebLinkEServiceNumberResponse [eFlagAp=" + eFlagAp + ", eFlagBp=" + eFlagBp + ", eFlagSo=" + eFlagSo
				+ ", eFlagUs=" + eFlagUs + ", eNewPartner=" + eNewPartner + ", eServiceOrder=" + eServiceOrder + "]";
	}

	public void seteFlagAp(String eFlagAp) {
	this.eFlagAp = eFlagAp;
    }

    public String geteFlagBp() {
	return eFlagBp;
    }

    public void seteFlagBp(String eFlagBp) {
	this.eFlagBp = eFlagBp;
    }

    public String geteFlagSo() {
	return eFlagSo;
    }

    public void seteFlagSo(String eFlagSo) {
	this.eFlagSo = eFlagSo;
    }

    public String geteFlagUs() {
	return eFlagUs;
    }

    public void seteFlagUs(String eFlagUs) {
	this.eFlagUs = eFlagUs;
    }

    public String geteServiceOrder() {
	return eServiceOrder;
    }

    public void seteServiceOrder(String eServiceOrder) {
	this.eServiceOrder = eServiceOrder;
    }
}
