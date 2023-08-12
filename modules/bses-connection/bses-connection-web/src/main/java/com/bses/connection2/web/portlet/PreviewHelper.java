package com.bses.connection2.web.portlet;

import com.bses.connection2.model.ConnectionRequest;
import com.bses.connection2.web.model.MasterData;

import org.apache.commons.lang3.StringUtils;

public class PreviewHelper {
	private String individualName = "____";
	private String individualAddress = "_____";
	private String fatherName = "_____";
	private String authorizedSignatory = "_____";
	private String declarationBy = "____";
	private String fatherOrFirmName = "____";
	private String firmName = "____";
	private String firmAddress = "_____";
	private String individualOrFirmAddress= "_____";
	private String tariffCategoryValue = "____";

	public PreviewHelper(ConnectionRequest cr) {
		if (StringUtils.equals(cr.getConsumerType(), MasterData.ConsumerTypes.Individual.name())) {
			individualName = ViewHelper.getFullName(cr);
			individualAddress = ViewHelper.getViewAddress(cr, ",");
			fatherName = cr.getFatherOrHusbandName();
			declarationBy = individualName;
			fatherOrFirmName = fatherName;
			individualOrFirmAddress = individualAddress;
		} else if (StringUtils.equals(cr.getConsumerType(), MasterData.ConsumerTypes.Firm.name())) {
			authorizedSignatory = cr.getSignatoryName();
			declarationBy = authorizedSignatory;
			fatherOrFirmName = cr.getFirmName();
			firmName = cr.getFirmName();
			firmAddress = ViewHelper.getViewAddress(cr, ",");
			individualOrFirmAddress = firmAddress;
		}
		
		if(StringUtils.isNotBlank(cr.getTariffCategory())){
			tariffCategoryValue = MasterData.getTariffCategoryValue(cr.getTariffCategory());
		}
	}

	
	
	public String getIndividualOrFirmAddress() {
		return individualOrFirmAddress;
	}



	public void setIndividualOrFirmAddress(String individualOrFirmAddress) {
		this.individualOrFirmAddress = individualOrFirmAddress;
	}



	public String getFirmAddress() {
		return firmAddress;
	}


	public void setFirmAddress(String firmAddress) {
		this.firmAddress = firmAddress;
	}


	public String getFirmName() {
		return firmName;
	}

	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}

	public String getIndividualName() {
		return individualName;
	}

	public void setIndividualName(String individualName) {
		this.individualName = individualName;
	}

	public String getIndividualAddress() {
		return individualAddress;
	}

	public void setIndividualAddress(String individualAddress) {
		this.individualAddress = individualAddress;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAuthorizedSignatory() {
		return authorizedSignatory;
	}

	public void setAuthorizedSignatory(String authorizedSignatory) {
		this.authorizedSignatory = authorizedSignatory;
	}

	public String getDeclarationBy() {
		return declarationBy;
	}

	public void setDeclarationBy(String declarationBy) {
		this.declarationBy = declarationBy;
	}

	public String getFatherOrFirmName() {
		return fatherOrFirmName;
	}

	public void setFatherOrFirmName(String fatherOrFirmName) {
		this.fatherOrFirmName = fatherOrFirmName;
	}

	public String getTariffCategoryValue() {
		return tariffCategoryValue;
	}

	public void setTariffCategoryValue(String tariffCategoryValue) {
		this.tariffCategoryValue = tariffCategoryValue;
	}

}
