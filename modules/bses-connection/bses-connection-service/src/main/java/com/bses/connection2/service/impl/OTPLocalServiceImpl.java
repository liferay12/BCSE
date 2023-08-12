/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.bses.connection2.service.impl;

import com.bses.connection2.model.OTP;
import com.bses.connection2.service.base.OTPLocalServiceBaseImpl;
import com.bses.connection2.util.MessagingServiceUtil;
import com.bses2.sap.connector.services.SapConnctorServiceApi;
import com.bses2.sap.model.DssISUCADisplayRequest;
import com.bses2.sap.model.DssISUCADisplayResponse;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;


/**
 * The implementation of the otp local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.bses.connection2.service.OTPLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OTPLocalServiceBaseImpl
 * @see com.bses.connection2.service.OTPLocalServiceUtil
 */
public class OTPLocalServiceImpl extends OTPLocalServiceBaseImpl {

	private static final Log log = LogFactoryUtil.getLog(OTPLocalServiceImpl.class);


	@ServiceReference(type = SapConnctorServiceApi.class)
	private SapConnctorServiceApi sapService;
	
	
	public OTP generateOtp(String mobileNo, String email) {

		System.out.println("1.OTPLocalServiceImpl:generateOTP");
		User user = null;
		OTP otp = null;

		String otpNumber = generateOTP();
		String smsBody = "Your One Time Password for New Connection is " + otpNumber
				+ ". Do not share OTP to anyone for security reasons, BSES shall not be responsible for any misuse. Team BRPL";
		try {

			
			otp = otpLocalService.findByMobileNo(mobileNo);

			if (Validator.isNull(otp)) {
				otp = otpLocalService.createOTP(CounterLocalServiceUtil.increment(OTP.class.getName()));
				//otp.setUserName(user.getScreenName());
			}

			otp.setMobileNo(mobileNo);
			otp.setEmailId(email);
			otp.setOtp(otpNumber);
			otp.setExpiryTime(addSeconds(new Date(), 100));
			MessagingServiceUtil.sendSMS(mobileNo, smsBody);
			if(StringUtils.isNotBlank(email)) {
				sendEmailOtp(email,otpNumber) ;
			}
			
			otpLocalService.updateOTP(otp);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return otp;

	}	

	public String validateOtp(String mobileNo, String otpNumber) {

		String message = "";
		System.out.println("mobile no...." + mobileNo);
		try {
			OTP otpConnection = otpPersistence.findByMobileNo(mobileNo);

			long currentTime = Calendar.getInstance().getTimeInMillis();
			long expiryTime = otpConnection.getExpiryTime().getTime();
			if (currentTime <= expiryTime) {
				if (otpConnection.getOtp().equals(otpNumber)) {
					otpLocalService.updateOTP(otpConnection);
					message = "valid";
				} else {
					message = "invalid";
				}
			} else {
				message = "valid";
			}
		} catch (Exception e) {
			log.error(e);
			message = "invalid";
		}

		System.out.println("-------------Validate otp------" + message);
		return message;
	}
	
	public OTP resendOtp(String mobileNo, String email) {
		OTP otp = null;
		String otpNumber =generateOTP();
		String smsBody = "Your One Time Password for New Connection is " + otpNumber
				+ ". Do not share OTP to anyone for security reasons, BSES shall not be responsible for any misuse. Team BRPL";

		otp = otpLocalService.findByMobileNo(mobileNo);
		otp.setOtp(otpNumber);
		otp.setExpiryTime(addSeconds(new Date(), 100));
		MessagingServiceUtil.sendSMS(mobileNo, smsBody);
		otpLocalService.updateOTP(otp);

		return otp;

	}
		
	
	public OTP generateEmailOtp(String mobileNo, String email) {

		System.out.println("1.OTPLocalServiceImpl:generateEmailOtp");
		
		String fromEmail = "bsesnoreply@relianceada.com";
		
		String subject = "OTP for connection request";
		
		OTP otp = null;
		boolean isMailSent;
		String otpNumber = generateOTP();
		
		try {
			String mailBody = getEmaiOtpMessage(otpNumber);
			isMailSent = MessagingServiceUtil.sendEmail(fromEmail, email, subject, mailBody); 
			if(isMailSent) {
				otp = otpLocalService.findByMobileNo(mobileNo);
				
				if (Validator.isNull(otp)) {
					otp = otpLocalService.createOTP(CounterLocalServiceUtil.increment(OTP.class.getName()));
				}

				otp.setMobileNo(mobileNo);
				otp.setEmailId(email);
				otp.setOtp(otpNumber);
				otp.setExpiryTime(addSeconds(new Date(), 100));
				
				otpLocalService.updateOTP(otp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return otp;

	}
	
	private String getEmaiOtpMessage(String otpNumber) {

		StringBuffer body = new StringBuffer();

		body.append("<p>Dear Customer, </p>");
		body.append("<p>Your One Time Password for New Connection is "+otpNumber+". Do not share this OTP to anyone for security reasons. BRPL shall not be responsible for any misuse</p>");
		body.append("<br/>");
		body.append("<br/>");
		body.append("<p>Thanks & Regards</p>");
		body.append("<p>BSES Power Limited.</p>");

		return body.toString();
	}

	public OTP resendEmailOtp(String mobileNo, String email) {
		OTP otp = null;
		String otpNumber = generateOTP();
		String smsBody = "Your One Time Password for New Connection is " + otpNumber
				+ ". Do not share OTP to anyone for security reasons, BSES shall not be responsible for any misuse. Team BRPL";

		otp = otpLocalService.findByMobileNo(mobileNo);
		otp.setOtp(otpNumber);
		
		otp.setExpiryTime(addSeconds(new Date(), 100));
		MessagingServiceUtil.sendSMS(mobileNo, smsBody);
		otpLocalService.updateOTP(otp);

		return otp;

	}

	public String generateOtpForCaNumber(String caNumber,String loginMobile) {
		String mobileNo = null;
		OTP otp = null;
		try {
			DssISUCADisplayRequest request = new DssISUCADisplayRequest();
			caNumber= generateTwelveDigitCANo(caNumber); //103012062
			System.out.println("caNumber test- "+caNumber);
			
			request.setCaNumber(caNumber);
			
			DssISUCADisplayResponse res= sapService.getDssISUCADisplay2(request);
			log.debug("DssISUCADisplayResponse - "+res);
			
			if(res == null) {
				log.error("No record exists for ca number -"+caNumber);
				return "Error: Invalid CA number";
			}
			System.out.println("1.OTPLocalServiceImpl:generateOTP");

			mobileNo = res.getMobileNo();
			if(StringUtils.isBlank(mobileNo)) {
				log.error("No mobile number exists for ca number -"+caNumber);
				return "Error: Invalid CA number";
			}
			
			String otpNumber = generateOTP();
			String smsBody = "Your One Time Password for Change request is " + otpNumber
					+ ". Do not share this OTP to anyone for security reasons. BRPL shall not be responsible for any misuse  Team BRPL";
			
			otp = otpLocalService.findByMobileNo(mobileNo);

			if (otp == null) {
				otp = otpLocalService.createOTP(CounterLocalServiceUtil.increment(OTP.class.getName()));
				//otp.setUserName(user.getScreenName());
			}

			otp.setCaNumber(caNumber);
			otp.setMobileNo(mobileNo);
			otp.setOtp(otpNumber);
			otp.setExpiryTime(addSeconds(new Date(), 100));
		
			MessagingServiceUtil.sendSMS(mobileNo, smsBody);
			MessagingServiceUtil.sendSMS(loginMobile, smsBody);
			otpLocalService.updateOTP(otp);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return mobileNo;
	}
	
	private boolean sendEmailOtp(String email,String otpNumber) {

		String fromEmail = "bsesnoreply@relianceada.com";
		
		String subject = "OTP for connection request";
		
		OTP otp = null;
		boolean isMailSent = false;
				
		try {
			String mailBody = getEmaiOtpMessage(otpNumber);
			isMailSent = MessagingServiceUtil.sendEmail(fromEmail, email, subject, mailBody); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isMailSent;
	}

	
	public static Date addSeconds(Date date, Integer seconds) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.SECOND, seconds);
		return cal.getTime();
	}

	private  String generateOTP() {
		String otp = PropsUtil.get("connection.request.default.otp");
		
		if(StringUtils.isBlank(otp)) {
			Random random = new Random();
			otp = String.valueOf(random.nextInt(9000000) + 1000000);
		}
		return otp;
	}

	
	public OTP findByMobileNo(String mobileNo) {

		try {
			return otpPersistence.findByMobileNo(mobileNo);
		} catch (Exception e) {
			return null;
		}
	}
	
	public String generateTwelveDigitCANo(String accNo) {
		String formattedNumber = StringPool.BLANK;
		if (Validator.isNotNull(accNo)) {
			formattedNumber = String.format("%012d", Long.valueOf(accNo));
			//log.debug("Formatted account number from  getValidAccountNumber method ::::::::  " + formattedNumber);
		}
		return formattedNumber;
	}
	
	 
}