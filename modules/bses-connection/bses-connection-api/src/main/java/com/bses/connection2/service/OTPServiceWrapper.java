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

package com.bses.connection2.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OTPService}.
 *
 * @author Brian Wing Shun Chan
 * @see OTPService
 * @generated
 */
public class OTPServiceWrapper
	implements OTPService, ServiceWrapper<OTPService> {

	public OTPServiceWrapper(OTPService otpService) {
		_otpService = otpService;
	}

	@Override
	public com.bses.connection2.model.OTP generateEmailOtp(
		String mobileNo, String email) {

		return _otpService.generateEmailOtp(mobileNo, email);
	}

	@Override
	public com.bses.connection2.model.OTP generateOtp(
		String mobileNo, String email) {

		return _otpService.generateOtp(mobileNo, email);
	}

	@Override
	public String generateOtpForCaNumber(String caNumber, String loginMobile) {
		return _otpService.generateOtpForCaNumber(caNumber, loginMobile);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _otpService.getOSGiServiceIdentifier();
	}

	@Override
	public com.bses.connection2.model.OTP resendEmailOtp(
		String mobileNo, String email) {

		return _otpService.resendEmailOtp(mobileNo, email);
	}

	@Override
	public com.bses.connection2.model.OTP resendOtp(
		String mobileNo, String email) {

		return _otpService.resendOtp(mobileNo, email);
	}

	@Override
	public String validateOtp(String mobileNo, String otpNumber) {
		return _otpService.validateOtp(mobileNo, otpNumber);
	}

	@Override
	public OTPService getWrappedService() {
		return _otpService;
	}

	@Override
	public void setWrappedService(OTPService otpService) {
		_otpService = otpService;
	}

	private OTPService _otpService;

}