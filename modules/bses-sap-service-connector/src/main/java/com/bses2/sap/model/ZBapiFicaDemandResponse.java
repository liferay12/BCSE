package com.bses2.sap.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="BAPI_RESULT")
public class ZBapiFicaDemandResponse {

	private String message; 
	private boolean flag;
	@XmlElement(name="OutputTable")
	List<ZBapiFicaDemandDetails> zBapiFicaDemandDetailsList;
	@XmlElement(name="SAPDATA_ErrorDataTable")
	List<ZBapiFicaDemandDetailsError> zBapiFicaDemandDetailsErrorList;
	
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

	public List<ZBapiFicaDemandDetailsError> getzBapiFicaDemandDetailsErrorList() {
		return zBapiFicaDemandDetailsErrorList;
	}

	public void setzBapiFicaDemandDetailsErrorList(List<ZBapiFicaDemandDetailsError> zBapiFicaDemandDetailsErrorList) {
		this.zBapiFicaDemandDetailsErrorList = zBapiFicaDemandDetailsErrorList;
	}

	public List<ZBapiFicaDemandDetails> getzBapiFicaDemandDetailsList() {
		return zBapiFicaDemandDetailsList;
	}

	public void setzBapiFicaDemandDetailsList(List<ZBapiFicaDemandDetails> zBapiFicaDemandDetailsList) {
		this.zBapiFicaDemandDetailsList = zBapiFicaDemandDetailsList;
	}

}
