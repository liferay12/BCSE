package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BAPI_RESULT")
public class ZbapiCreateSOPostResponse {

	@XmlElement(name = "OutputTable")
	private ZbapiCreateSOPostDetailResponse zbapiCreateSOPostDetailResponse;

	@XmlElement(name = "SAPDATA_ErrorDataTable")
	private ZbapiCreateSOPostErrorResponse zbapiCreateSOPostErrorResponse;

	private boolean flag;

	public ZbapiCreateSOPostDetailResponse getZbapiCreateSOPostDetailResponse() {
		return zbapiCreateSOPostDetailResponse;
	}

	public void setZbapiCreateSOPostDetailResponse(ZbapiCreateSOPostDetailResponse zbapiCreateSOPostDetailResponse) {
		this.zbapiCreateSOPostDetailResponse = zbapiCreateSOPostDetailResponse;
	}

	public ZbapiCreateSOPostErrorResponse getZbapiCreateSOPostErrorResponse() {
		return zbapiCreateSOPostErrorResponse;
	}

	public void setZbapiCreateSOPostErrorResponse(ZbapiCreateSOPostErrorResponse zbapiCreateSOPostErrorResponse) {
		this.zbapiCreateSOPostErrorResponse = zbapiCreateSOPostErrorResponse;
	}



	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public ZbapiCreateSOPostResponse() {
	}

}
