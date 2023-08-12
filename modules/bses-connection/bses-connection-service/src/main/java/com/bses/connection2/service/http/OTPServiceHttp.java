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

package com.bses.connection2.service.http;

import com.bses.connection2.service.OTPServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>OTPServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OTPServiceSoap
 * @generated
 */
public class OTPServiceHttp {

	public static com.bses.connection2.model.OTP generateOtp(
		HttpPrincipal httpPrincipal, String mobileNo, String email) {

		try {
			MethodKey methodKey = new MethodKey(
				OTPServiceUtil.class, "generateOtp",
				_generateOtpParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, mobileNo, email);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.bses.connection2.model.OTP)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static String validateOtp(
		HttpPrincipal httpPrincipal, String mobileNo, String otpNumber) {

		try {
			MethodKey methodKey = new MethodKey(
				OTPServiceUtil.class, "validateOtp",
				_validateOtpParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, mobileNo, otpNumber);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.bses.connection2.model.OTP resendOtp(
		HttpPrincipal httpPrincipal, String mobileNo, String email) {

		try {
			MethodKey methodKey = new MethodKey(
				OTPServiceUtil.class, "resendOtp", _resendOtpParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, mobileNo, email);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.bses.connection2.model.OTP)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.bses.connection2.model.OTP generateEmailOtp(
		HttpPrincipal httpPrincipal, String mobileNo, String email) {

		try {
			MethodKey methodKey = new MethodKey(
				OTPServiceUtil.class, "generateEmailOtp",
				_generateEmailOtpParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, mobileNo, email);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.bses.connection2.model.OTP)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.bses.connection2.model.OTP resendEmailOtp(
		HttpPrincipal httpPrincipal, String mobileNo, String email) {

		try {
			MethodKey methodKey = new MethodKey(
				OTPServiceUtil.class, "resendEmailOtp",
				_resendEmailOtpParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, mobileNo, email);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.bses.connection2.model.OTP)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static String generateOtpForCaNumber(
		HttpPrincipal httpPrincipal, String caNumber, String loginMobile) {

		try {
			MethodKey methodKey = new MethodKey(
				OTPServiceUtil.class, "generateOtpForCaNumber",
				_generateOtpForCaNumberParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, caNumber, loginMobile);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (String)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(OTPServiceHttp.class);

	private static final Class<?>[] _generateOtpParameterTypes0 = new Class[] {
		String.class, String.class
	};
	private static final Class<?>[] _validateOtpParameterTypes1 = new Class[] {
		String.class, String.class
	};
	private static final Class<?>[] _resendOtpParameterTypes2 = new Class[] {
		String.class, String.class
	};
	private static final Class<?>[] _generateEmailOtpParameterTypes3 =
		new Class[] {String.class, String.class};
	private static final Class<?>[] _resendEmailOtpParameterTypes4 =
		new Class[] {String.class, String.class};
	private static final Class<?>[] _generateOtpForCaNumberParameterTypes5 =
		new Class[] {String.class, String.class};

}