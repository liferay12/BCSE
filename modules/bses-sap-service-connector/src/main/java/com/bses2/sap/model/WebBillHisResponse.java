package com.bses2.sap.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "webBillHistoryTable")
public class WebBillHisResponse {
	private SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	private SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy");
	private SimpleDateFormat billMformat = new SimpleDateFormat("MMM-yy");
	private SimpleDateFormat billMform = new SimpleDateFormat("MMM-yyyy");

	private static final Log log = LogFactoryUtil.getLog(WebBillHisResponse.class);
	@XmlElement(name = "BILL_MONTH")
	private String billMonth;

	@XmlElement(name = "DUE_DATE")
	private String dueDate;

	@XmlElement(name = "UNITS")
	private String units;

	private String caNumber;

	private String siteName;

	private byte[] billContent;

	public byte[] getBillContent() {
		return billContent;
	}

	public void setBillContent(byte[] billContent) {
		this.billContent = billContent;
	}

	@XmlElement(name = "INVOICE_NO")
	private String invoice;

	@XmlElement(name = "MDI")
	private String mdi;

	@XmlElement(name = "ARR_PAYABLE")
	private String arrPayable;

	@XmlElement(name = "CUR_MTH_BILL_AMT")
	private String energy;

	@XmlElement(name = "LPSC_CURRENT")
	private String lpscCurrent;

	@XmlElement(name = "REFUND")
	private String refund;

	@XmlElement(name = "PAYMENT_AMOUNT")
	private String payAmount;

	@XmlElement(name = "PAYMENT_DATE")
	private String paymentDate;

	@XmlElement(name = "TOT_BIL_AMT")
	private String totalBillAmnt;

	@XmlElement(name = "TOT_BIL_AMNDS")
	private String totalBillAmnds;

	@XmlElement(name = "NET_AMNT")
	private String netAmt;

	private String message;
	private boolean flag;

	public String getBillMonth() {
		Date duedt = null;
		if (billMonth != null) {
			try {
				duedt = billMformat.parse(billMonth);
				billMonth = billMform.format(duedt);
			} catch (ParseException e) {
				log.error("Error occured in date parsing in billMonth:::" + e);
			}
		}
		return billMonth;
	}

	public String getMdi() {
		return mdi;
	}

	public void setMdi(String mdi) {
		this.mdi = mdi;
	}

	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
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

	public String getDueDate() {
		Date duedt = null;
		if (dueDate.equals("00000000")) {
			dueDate = "00-00-0000";
		} else if (dueDate != null) {
			try {
				duedt = format.parse(dueDate);
				dueDate = format1.format(duedt);
			} catch (ParseException e) {
				log.error("Error occured in date parsing :::" + e);
			}
		}
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getArrPayable() {
		return arrPayable;
	}

	public void setArrPayable(String arrPayable) {
		this.arrPayable = arrPayable;
	}

	public String getEnergy() {
		return energy;
	}

	public void setEnergy(String energy) {
		this.energy = energy;
	}

	public String getLpscCurrent() {
		return lpscCurrent;
	}

	public void setLpscCurrent(String lpscCurrent) {
		this.lpscCurrent = lpscCurrent;
	}

	public String getRefund() {
		return refund;
	}

	public void setRefund(String refund) {
		this.refund = refund;
	}

	public String getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPaymentDate() {
		Date payDt = null;
		if (paymentDate.equals("00000000")) {
			paymentDate = "00-00-0000";
		} else if (paymentDate != null) {
			try {
				payDt = format.parse(paymentDate);
				paymentDate = format1.format(payDt);
			} catch (ParseException e) {
				log.error("Error occured in date parsing :::" + e);
			}
		}
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getTotalBillAmnt() {
		return totalBillAmnt;
	}

	public void setTotalBillAmnt(String totalBillAmnt) {
		this.totalBillAmnt = totalBillAmnt;
	}

	public String getTotalBillAmnds() {
		return totalBillAmnds;
	}

	public void setTotalBillAmnds(String totalBillAmnds) {
		this.totalBillAmnds = totalBillAmnds;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getCaNumber() {
		return caNumber;
	}

	public void setCaNumber(String caNumber) {
		this.caNumber = caNumber;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getNetAmt() {
		return netAmt;
	}

	public void setNetAmt(String netAmt) {
		this.netAmt = netAmt;
	}
}
