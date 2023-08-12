package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "FLAG")
public class MDIFlagResponse {
	
	@XmlElement(name = "FLAG")
	private String flag;
	
	private String msg;
	
	@XmlElement(name = "SANC_LOAD")
	private String sancLoad;
	
	private String mdiActiveFlag;

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSancLoad() {
		return sancLoad;
	}

	public void setSancLoad(String sancLoad) {
		this.sancLoad = sancLoad;
	}

	public String getMdiActiveFlag() {
		return mdiActiveFlag;
	}

	public void setMdiActiveFlag(String mdiActiveFlag) {
		this.mdiActiveFlag = mdiActiveFlag;
	}

}

