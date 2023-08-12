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
import com.bses.connection2.service.base.OTPServiceBaseImpl;

/**
 * The implementation of the otp remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.bses.connection2.service.OTPService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OTPServiceBaseImpl
 * @see com.bses.connection2.service.OTPServiceUtil
 */
public class OTPServiceImpl extends OTPServiceBaseImpl {
	
	public OTP generateOtp(String mobileNo, String email) {

		return otpLocalService.generateOtp(mobileNo, email);
	}
	
	public String validateOtp(String mobileNo, String otpNumber) {

		return otpLocalService.validateOtp(mobileNo, otpNumber);
	}

	public OTP resendOtp(String mobileNo, String email) {

		return otpLocalService.resendOtp(mobileNo, email);
	}
	
	public OTP generateEmailOtp(String mobileNo, String email) {

		return otpLocalService.generateEmailOtp(mobileNo, email);
	}
	
	public OTP resendEmailOtp(String mobileNo, String email) {

		return otpLocalService.resendEmailOtp(mobileNo, email);
	}
	
	public String generateOtpForCaNumber(String caNumber,String loginMobile) {
		
		return otpLocalService.generateOtpForCaNumber(caNumber,loginMobile);
	}
}