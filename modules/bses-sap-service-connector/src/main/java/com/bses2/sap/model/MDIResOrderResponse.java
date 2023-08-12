package com.bses2.sap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="BAPI_RESULT")
public class MDIResOrderResponse {
	
	@XmlElement(name="FLAG")
	private  MDIFlagResponse mdiFlagResponse ;
	
	@XmlElement(name="Return")
	 private MDIReturnResponse  mdiReturnResponse;

	public MDIFlagResponse getMdiFlagResponse() {
		return mdiFlagResponse;
	}

	public void setMdiFlagResponse(MDIFlagResponse mdiFlagResponse) {
		this.mdiFlagResponse = mdiFlagResponse;
	}

	public MDIReturnResponse getMdiReturnResponse() {
		return mdiReturnResponse;
	}

	public void setMdiReturnResponse(MDIReturnResponse mdiReturnResponse) {
		this.mdiReturnResponse = mdiReturnResponse;
	} 

}
