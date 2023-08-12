package com.bses2.sap.model;

public class OnlineBillPdfResponse {

	private String message;
	private boolean flag;
	private byte[] billContent;
	
	public byte[] getBillContent() {
		return billContent;
	}
	public void setBillContent(byte[] billContent) {
		this.billContent = billContent;
	}
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
	

}
