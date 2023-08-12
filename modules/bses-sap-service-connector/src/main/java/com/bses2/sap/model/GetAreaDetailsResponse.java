package com.bses2.sap.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BAPI_RESULT")
public class GetAreaDetailsResponse {
	
	@XmlElementWrapper(name="NewDataSet")
	@XmlElement(name="Table1")
	private List<GetAreaDetailsFullResponse > areaDataList;

	public List<GetAreaDetailsFullResponse> getAreaDataList() {
		return areaDataList;
	}
	
	public void setAreaDataList(List<GetAreaDetailsFullResponse> areaDataList) {
		this.areaDataList = areaDataList;
	}
	
	public String getAutoSuggestJSONFormat(){
		JSONArray jsonArr = JSONFactoryUtil.createJSONArray();
		if(Validator.isNotNull(areaDataList) && !areaDataList.isEmpty()){
			
			for(GetAreaDetailsFullResponse areaDetailsFullResponse : areaDataList){
				JSONObject jsonObj = JSONFactoryUtil.createJSONObject();
				jsonObj.put("areaId", areaDetailsFullResponse.getObjectID());
				jsonObj.put("areaName", areaDetailsFullResponse.getAreaName());
				jsonArr.put(jsonObj);
			}
		}
		return jsonArr.toJSONString();
	}
	public String getAutoSuggestFormat(){
		StringBuilder autoCompleteSb = new StringBuilder(StringPool.BLANK);
		if(Validator.isNotNull(areaDataList) && !areaDataList.isEmpty()){
			autoCompleteSb.append("<ul id=\"area-list\">");
			for(GetAreaDetailsFullResponse getAreaDetailsFullResponse : areaDataList){
				autoCompleteSb.append("<li onclick=\"selectCountry('"+getAreaDetailsFullResponse.getObjectID()+"')\">"+getAreaDetailsFullResponse.getAreaName()+"</li>");
			}
		}
		return autoCompleteSb.toString();
	}

}
