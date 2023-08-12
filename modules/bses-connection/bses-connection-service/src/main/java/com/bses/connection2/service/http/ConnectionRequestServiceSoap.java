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

import com.bses.connection2.service.ConnectionRequestServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>ConnectionRequestServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.bses.connection2.model.ConnectionRequestSoap</code>. If the method in the
 * service utility returns a
 * <code>com.bses.connection2.model.ConnectionRequest</code>, that is translated to a
 * <code>com.bses.connection2.model.ConnectionRequestSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionRequestServiceHttp
 * @generated
 */
public class ConnectionRequestServiceSoap {

	public static com.bses.connection2.model.ConnectionRequestSoap
			createConnectionRequest(String mobileNo, String emailId)
		throws RemoteException {

		try {
			com.bses.connection2.model.ConnectionRequest returnValue =
				ConnectionRequestServiceUtil.createConnectionRequest(
					mobileNo, emailId);

			return com.bses.connection2.model.ConnectionRequestSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.bses.connection2.model.ConnectionRequestSoap
			createConnectionRequest(
				String mobileNo, String emailId, String requestType,
				String requestMode)
		throws RemoteException {

		try {
			com.bses.connection2.model.ConnectionRequest returnValue =
				ConnectionRequestServiceUtil.createConnectionRequest(
					mobileNo, emailId, requestType, requestMode);

			return com.bses.connection2.model.ConnectionRequestSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static String submitNewRequestToSoap(long connectionRequestId)
		throws RemoteException {

		try {
			String returnValue =
				ConnectionRequestServiceUtil.submitNewRequestToSoap(
					connectionRequestId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static String submitChangeRequestToSoap(long connectionRequestId)
		throws RemoteException {

		try {
			String returnValue =
				ConnectionRequestServiceUtil.submitChangeRequestToSoap(
					connectionRequestId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.bses.connection2.model.ConnectionRequestSoap
			getConnectionRequest(String requestNo)
		throws RemoteException {

		try {
			com.bses.connection2.model.ConnectionRequest returnValue =
				ConnectionRequestServiceUtil.getConnectionRequest(requestNo);

			return com.bses.connection2.model.ConnectionRequestSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.bses.connection2.model.ConnectionRequestSoap
			getConnectionRequestByMobileNoAndRequestNo(
				String mobileNo, String requestNo)
		throws RemoteException {

		try {
			com.bses.connection2.model.ConnectionRequest returnValue =
				ConnectionRequestServiceUtil.
					getConnectionRequestByMobileNoAndRequestNo(
						mobileNo, requestNo);

			return com.bses.connection2.model.ConnectionRequestSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.bses.connection2.model.ConnectionRequestSoap[]
			getConnectionRequestsByMobileNo(String mobileNo)
		throws RemoteException {

		try {
			java.util.List<com.bses.connection2.model.ConnectionRequest>
				returnValue =
					ConnectionRequestServiceUtil.
						getConnectionRequestsByMobileNo(mobileNo);

			return com.bses.connection2.model.ConnectionRequestSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static boolean deleteByConnectionRequestId(long connectionRequestId)
		throws RemoteException {

		try {
			boolean returnValue =
				ConnectionRequestServiceUtil.deleteByConnectionRequestId(
					connectionRequestId);

			return returnValue;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static String getAvailableTimeSlots(
			java.util.Date appointmentDate, String appointmentDivision)
		throws RemoteException {

		try {
			com.liferay.portal.kernel.json.JSONArray returnValue =
				ConnectionRequestServiceUtil.getAvailableTimeSlots(
					appointmentDate, appointmentDivision);

			return returnValue.toString();
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static String getDivisionWiseAvailableSlots(
			java.util.Date appointmentDate)
		throws RemoteException {

		try {
			com.liferay.portal.kernel.json.JSONArray returnValue =
				ConnectionRequestServiceUtil.getDivisionWiseAvailableSlots(
					appointmentDate);

			return returnValue.toString();
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		ConnectionRequestServiceSoap.class);

}