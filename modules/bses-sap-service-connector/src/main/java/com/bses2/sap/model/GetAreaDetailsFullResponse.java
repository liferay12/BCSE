package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Table1")
public class GetAreaDetailsFullResponse {

	@XmlElement(name = "OBJECTID")
	private String areaObjectID;

	@XmlElement(name = "AREA")
	private String areaName;

	public String getObjectID() {
		return areaObjectID;
	}

	public void setObjectID(String objectID) {
		this.areaObjectID = objectID;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

}
