package com.bses2.sap.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BAPI_RESULT")
public class DssWebLinkResponse {

    @XmlElement(name = "outputFlagsTable")
    private DssWebLinkEServiceNumberResponse webLinkEServiceNumberResponse;

    @XmlElement(name = "SAPDATA_ErrorDataTable")
    private DssWebLinkErrorResponse webLinkErrorResponse;

    @XmlElement(name = "ErrorTable")
    private List<DssWebLinkErrorTableResponse> webLinkErrorTableResponses;

    public DssWebLinkEServiceNumberResponse getWebLinkEServiceNumberResponse() {
	return webLinkEServiceNumberResponse;
    }

    public void setWebLinkEServiceNumberResponse(DssWebLinkEServiceNumberResponse webLinkEServiceNumberResponse) {
	this.webLinkEServiceNumberResponse = webLinkEServiceNumberResponse;
    }

    public DssWebLinkErrorResponse getWebLinkErrorResponse() {
	return webLinkErrorResponse;
    }

    public void setWebLinkErrorResponse(DssWebLinkErrorResponse webLinkErrorResponse) {
	this.webLinkErrorResponse = webLinkErrorResponse;
    }

    public List<DssWebLinkErrorTableResponse> getWebLinkErrorTableResponses() {
	return webLinkErrorTableResponses;
    }

    public void setWebLinkErrorTableResponses(List<DssWebLinkErrorTableResponse> webLinkErrorTableResponses) {
	this.webLinkErrorTableResponses = webLinkErrorTableResponses;
    }

	@Override
	public String toString() {
		return "DssWebLinkResponse [webLinkEServiceNumberResponse=" + webLinkEServiceNumberResponse
				+ ", webLinkErrorResponse=" + webLinkErrorResponse + ", webLinkErrorTableResponses="
				+ webLinkErrorTableResponses + "]";
	}

}
