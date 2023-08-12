package com.bses2.sap.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="BAPI_RESULT")
public class CmsDisplayBillWebResponse {
	private String message; 
	private boolean flag;
	@XmlElement(name="billDetailsTable")
	private  CmsDisplayBillWebBillDetail cmsDisplayBillWebBillDetail ;
	
	@XmlElement(name="meterDetailsTable")
	 private List<CmsDisplayBillWebMeterDetail> cmsDisplayBillWebMeterDetailLst; 
	
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
	
	 public CmsDisplayBillWebBillDetail getCmsDisplayBillWebBillDetail() {
			return cmsDisplayBillWebBillDetail;
		}

		public List<CmsDisplayBillWebMeterDetail> getCmsDisplayBillWebMeterDetailLst() {
			return cmsDisplayBillWebMeterDetailLst;
		}
	
}
