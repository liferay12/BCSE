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
@XmlRootElement(name = "billDetailsTable")
public class CmsDisplayBillWebBillDetail {
	private static final Log log = LogFactoryUtil.getLog(CmsDisplayBillWebBillDetail.class);
	@XmlElement(name = "CONSUMER_NO")
	private String consumerNO;

	@XmlElement(name = "DATE_OF_INVOICE")
	private String dateofInvoice;

	@XmlElement(name = "LASTNAME")
	private String lastname;

	@XmlElement(name = "CYCLE_NO")
	private String cycleNo;

	@XmlElement(name = "SANC_LOAD")
	private String scanLoad;

	@XmlElement(name = "RATE_CATEGORY")
	private String category;

	@XmlElement(name = "FIRSTNAME")
	private String firstName;

	@XmlElement(name = "CIRCLE_DESCR")
	private String circle;

	@XmlElement(name = "MIDDLE_NAME")
	private String middleName;

	@XmlElement(name = "CITY")
	private String city;

	@XmlElement(name = "POSTL_COD1")
	private String pinCode;

	@XmlElement(name = "STREET")
	private String street;

	@XmlElement(name = "STR_SUPPL1")
	private String strSupp1;

	@XmlElement(name = "STR_SUPPL2")
	private String strSupp2;

	@XmlElement(name = "STR_SUPPL3")
	private String strSupp3;

	@XmlElement(name = "UNIT_DESCR")
	private String district;

	@XmlElement(name = "NET_AMNT")
	private String totalDemand;

	@XmlElement(name = "DEFERRED_AMNT")
	private String deferredAmount;

	@XmlElement(name = "INST_NOT_DUE")
	private String installmentNotDue;

	@XmlElement(name = "ARR_PAYABLE")
	private String roundSumPayable;

	@XmlElement(name = "DUE_DATE")
	private String dueDate;

	@XmlElement(name = "COMPANY_CODE")
	private String companyCode;

	@XmlElement(name = "PAYMENT_DATE")
	private String payDate;

	@XmlElement(name = "BILL_MONTH")
	private String billMonth;

	@XmlElement(name = "TOT_UNITS_BILLED")
	private String totUnitsBilled;
	
	@XmlElement(name = "BILL_BASIS")
	private String billBasis;

	@XmlElement(name = "INVOICE_NO")
	private String invoice;

	@XmlElement(name = "MDI")
	private String mdi;

	@XmlElement(name = "CUR_MTH_BILL_AMT")
	private String curMthBillAmt;

	@XmlElement(name = "LPSC_CURRENT")
	private String lpscCurrent;

	@XmlElement(name = "REFUND")
	private String refund;

	@XmlElement(name = "PAYMENT_RECEIVED")
	private String paymentReceived;

	@XmlElement(name = "TOT_BIL_AMT")
	private String totBilAmt;

	@XmlElement(name = "TOT_BIL_AMNDS")
	private String totBilAmnds;

	@XmlElement(name = "AR_LAST_MTH_BILL")
	private String arLastMthBill;

	@XmlElement(name = "CUR_MTH_BILL_AMD")
	private String curMthBillAmd;

	@XmlElement(name = "ARR_PAYABLE_AMD")
	private String arrPayableAmd;

	@XmlElement(name = "ADJUSTMENT")
	private String adjustment;

	@XmlElement(name = "HOUSE_NO")
	private String houseno;
	
	@XmlElement(name = "NET_AMT_AFT_TDS")
	private String netAmtAfterTDS;
	
	@XmlElement(name = "TDS_PERCENT")
	private String tdsPercent;
	
	@XmlElement(name = "FLAG1")
	private String flag1;
	
	@XmlElement(name = "FLAG2")
	private String flag2;
	
	@XmlElement(name = "LEGAL_ORG")
	private String legalOrg;
	
	@XmlElement(name = "CONNECTION_TYPE")
	private String connectionType;
	
	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getMdi() {
		return mdi;
	}

	public void setMdi(String mdi) {
		this.mdi = mdi;
	}

	public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public String getNetAmtAfterTDS() {
		return netAmtAfterTDS;
	}

	public void setNetAmtAfterTDS(String netAmtAfterTDS) {
		this.netAmtAfterTDS = netAmtAfterTDS;
	}

	public String getTdsPercent() {
		return tdsPercent;
	}

	public void setTdsPercent(String tdsPercent) {
		this.tdsPercent = tdsPercent;
	}

	public String getFlag1() {
		return flag1;
	}

	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}

	public String getFlag2() {
		return flag2;
	}

	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}

	public String getLegalOrg() {
		return legalOrg;
	}

	public void setLegalOrg(String legalOrg) {
		this.legalOrg = legalOrg;
	}

	public String getPayDate() {
		Date duedt = null;
		String tempPayDate = null;
		if (payDate != null) {
			try {
				duedt = format.parse(payDate);
				tempPayDate = format1.format(duedt);
			} catch (ParseException e) {
				log.error("Error occured in date parsing :::" + e);
			}
		}
		return tempPayDate;
	}

	public String getOriginalPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	private SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	private SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

	public String getConsumerNO() {
		return consumerNO;
	}

	public void setConsumerNO(String consumerNO) {
		this.consumerNO = consumerNO;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getCycleNo() {
		return cycleNo;
	}

	public void setCycleNo(String cycleNo) {
		this.cycleNo = cycleNo;
	}

	public String getScanLoad() {
		return scanLoad;
	}

	public void setScanLoad(String scanLoad) {
		this.scanLoad = scanLoad;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStrSupp1() {
		return strSupp1;
	}

	public void setStrSupp1(String strSupp1) {
		this.strSupp1 = strSupp1;
	}

	public String getStrSupp2() {
		return strSupp2;
	}

	public void setStrSupp2(String strSupp2) {
		this.strSupp2 = strSupp2;
	}

	public String getStrSupp3() {
		return strSupp3;
	}

	public void setStrSupp3(String strSupp3) {
		this.strSupp3 = strSupp3;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTotalDemand() {
		return totalDemand;
	}

	public void setTotalDemand(String totalDemand) {
		this.totalDemand = totalDemand;
	}

	public String getDeferredAmount() {
		return deferredAmount;
	}

	public void setDeferredAmount(String deferredAmount) {
		this.deferredAmount = deferredAmount;
	}

	public String getInstallmentNotDue() {
		return installmentNotDue;
	}

	public void setInstallmentNotDue(String installmentNotDue) {
		this.installmentNotDue = installmentNotDue;
	}

	public String getRoundSumPayable() {
		return roundSumPayable;
	}

	public void setRoundSumPayable(String roundSumPayable) {
		this.roundSumPayable = roundSumPayable;
	}

	public String getDueDate() {
		/*
		 * Date duedt = null; if(dueDate !=null){ try { duedt = format.parse(dueDate);
		 * dueDate = format1.format(duedt); } catch (ParseException e) {
		 * log.error("Error occured in date parsing :::"+e); } }
		 */
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;

	}

	public String getTotUnitsBilled() {
		return totUnitsBilled;
	}

	public void setTotUnitsBilled(String totUnitsBilled) {
		this.totUnitsBilled = totUnitsBilled;
	}

	public String getBillBasis() {
		return billBasis;
	}

	public void setBillBasis(String billBasis) {
		this.billBasis = billBasis;
	}

	public String getCurMthBillAmt() {
		return curMthBillAmt;
	}

	public void setCurMthBillAmt(String curMthBillAmt) {
		this.curMthBillAmt = curMthBillAmt;
	}

	public String getRefund() {
		return refund;
	}

	public void setRefund(String refund) {
		this.refund = refund;
	}

	public String getPaymentReceived() {
		return paymentReceived;
	}

	public void setPaymentReceived(String paymentReceived) {
		this.paymentReceived = paymentReceived;
	}

	public String getBillMonth() {
		return billMonth;
	}

	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}

	public String getLpscCurrent() {
		return lpscCurrent;
	}

	public void setLpscCurrent(String lpscCurrent) {
		this.lpscCurrent = lpscCurrent;
	}

	public String getTotBilAmt() {
		return totBilAmt;
	}

	public void setTotBilAmt(String totBilAmt) {
		this.totBilAmt = totBilAmt;
	}

	public String getTotBilAmnds() {
		return totBilAmnds;
	}

	public void setTotBilAmnds(String totBilAmnds) {
		this.totBilAmnds = totBilAmnds;
	}

	public String getArLastMthBill() {
		return arLastMthBill;
	}

	public void setArLastMthBill(String arLastMthBill) {
		this.arLastMthBill = arLastMthBill;
	}

	public String getCurMthBillAmd() {
		return curMthBillAmd;
	}

	public void setCurMthBillAmd(String curMthBillAmd) {
		this.curMthBillAmd = curMthBillAmd;
	}

	public String getArrPayableAmd() {
		return arrPayableAmd;
	}

	public void setArrPayableAmd(String arrPayableAmd) {
		this.arrPayableAmd = arrPayableAmd;
	}

	public String getAdjustment() {
		return adjustment;
	}

	public void setAdjustment(String adjustment) {
		this.adjustment = adjustment;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getDateofInvoice() {
		return dateofInvoice;
	}

	public void setDateofInvoice(String dateofInvoice) {
		this.dateofInvoice = dateofInvoice;
	}
}
