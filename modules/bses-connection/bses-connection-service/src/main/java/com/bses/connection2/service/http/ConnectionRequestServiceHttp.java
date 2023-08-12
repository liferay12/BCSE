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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>ConnectionRequestServiceUtil</code> service
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
 * @see ConnectionRequestServiceSoap
 * @generated
 */
public class ConnectionRequestServiceHttp {

	public static com.bses.connection2.model.ConnectionRequest
			createConnectionRequest(
				HttpPrincipal httpPrincipal, String mobileNo, String emailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "createConnectionRequest",
				_createConnectionRequestParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, mobileNo, emailId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.bses.connection2.model.ConnectionRequest)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.bses.connection2.model.ConnectionRequest
			createConnectionRequest(
				HttpPrincipal httpPrincipal, String mobileNo, String emailId,
				String requestType, String requestMode)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "createConnectionRequest",
				_createConnectionRequestParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, mobileNo, emailId, requestType, requestMode);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.bses.connection2.model.ConnectionRequest)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static String updateConnectionRequest(
		HttpPrincipal httpPrincipal, long connectionRequestId,
		java.util.Map<String, String> params, String sectionPrefix) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "updateConnectionRequest",
				_updateConnectionRequestParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, connectionRequestId, params, sectionPrefix);

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

	public static String submitNewRequestToSoap(
		HttpPrincipal httpPrincipal, long connectionRequestId) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "submitNewRequestToSoap",
				_submitNewRequestToSoapParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, connectionRequestId);

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

	public static String submitChangeRequestToSoap(
		HttpPrincipal httpPrincipal, long connectionRequestId) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "submitChangeRequestToSoap",
				_submitChangeRequestToSoapParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, connectionRequestId);

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

	public static String updateConsumerDetails(
		HttpPrincipal httpPrincipal, String requestNo,
		java.util.Map<String, String> params) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "updateConsumerDetails",
				_updateConsumerDetailsParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, requestNo, params);

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

	public static String updateAddress(
		HttpPrincipal httpPrincipal, String requestNo,
		java.util.Map<String, String> params) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "updateAddress",
				_updateAddressParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, requestNo, params);

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

	public static String updateConnection(
		HttpPrincipal httpPrincipal, String requestNo,
		java.util.Map<String, String> params) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "updateConnection",
				_updateConnectionParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, requestNo, params);

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

	public static String updateChecklistDocuments(
		HttpPrincipal httpPrincipal, String requestNo,
		java.util.Map<String, String> params) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "updateChecklistDocuments",
				_updateChecklistDocumentsParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, requestNo, params);

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

	public static String updateImportantDocuments(
		HttpPrincipal httpPrincipal, String requestNo,
		java.util.Map<String, String> params) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "updateImportantDocuments",
				_updateImportantDocumentsParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, requestNo, params);

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

	public static com.bses.connection2.model.ConnectionRequest
		getConnectionRequest(HttpPrincipal httpPrincipal, String requestNo) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "getConnectionRequest",
				_getConnectionRequestParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, requestNo);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.bses.connection2.model.ConnectionRequest)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.bses.connection2.model.ConnectionRequest
		getConnectionRequestByMobileNoAndRequestNo(
			HttpPrincipal httpPrincipal, String mobileNo, String requestNo) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class,
				"getConnectionRequestByMobileNoAndRequestNo",
				_getConnectionRequestByMobileNoAndRequestNoParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, mobileNo, requestNo);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.bses.connection2.model.ConnectionRequest)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.bses.connection2.model.ConnectionRequest>
		getConnectionRequestsByMobileNo(
			HttpPrincipal httpPrincipal, String mobileNo) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class,
				"getConnectionRequestsByMobileNo",
				_getConnectionRequestsByMobileNoParameterTypes12);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, mobileNo);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List
				<com.bses.connection2.model.ConnectionRequest>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static boolean deleteByConnectionRequestId(
			HttpPrincipal httpPrincipal, long connectionRequestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class,
				"deleteByConnectionRequestId",
				_deleteByConnectionRequestIdParameterTypes14);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, connectionRequestId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return ((Boolean)returnObj).booleanValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.portal.kernel.json.JSONArray
		getAvailableTimeSlots(
			HttpPrincipal httpPrincipal, java.util.Date appointmentDate,
			String appointmentDivision) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class, "getAvailableTimeSlots",
				_getAvailableTimeSlotsParameterTypes15);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, appointmentDate, appointmentDivision);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.portal.kernel.json.JSONArray)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.portal.kernel.json.JSONArray
		getDivisionWiseAvailableSlots(
			HttpPrincipal httpPrincipal, java.util.Date appointmentDate) {

		try {
			MethodKey methodKey = new MethodKey(
				ConnectionRequestServiceUtil.class,
				"getDivisionWiseAvailableSlots",
				_getDivisionWiseAvailableSlotsParameterTypes16);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, appointmentDate);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.portal.kernel.json.JSONArray)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		ConnectionRequestServiceHttp.class);

	private static final Class<?>[] _createConnectionRequestParameterTypes0 =
		new Class[] {String.class, String.class};
	private static final Class<?>[] _createConnectionRequestParameterTypes1 =
		new Class[] {String.class, String.class, String.class, String.class};
	private static final Class<?>[] _updateConnectionRequestParameterTypes2 =
		new Class[] {long.class, java.util.Map.class, String.class};
	private static final Class<?>[] _submitNewRequestToSoapParameterTypes3 =
		new Class[] {long.class};
	private static final Class<?>[] _submitChangeRequestToSoapParameterTypes4 =
		new Class[] {long.class};
	private static final Class<?>[] _updateConsumerDetailsParameterTypes5 =
		new Class[] {String.class, java.util.Map.class};
	private static final Class<?>[] _updateAddressParameterTypes6 =
		new Class[] {String.class, java.util.Map.class};
	private static final Class<?>[] _updateConnectionParameterTypes7 =
		new Class[] {String.class, java.util.Map.class};
	private static final Class<?>[] _updateChecklistDocumentsParameterTypes8 =
		new Class[] {String.class, java.util.Map.class};
	private static final Class<?>[] _updateImportantDocumentsParameterTypes9 =
		new Class[] {String.class, java.util.Map.class};
	private static final Class<?>[] _getConnectionRequestParameterTypes10 =
		new Class[] {String.class};
	private static final Class<?>[]
		_getConnectionRequestByMobileNoAndRequestNoParameterTypes11 =
			new Class[] {String.class, String.class};
	private static final Class<?>[]
		_getConnectionRequestsByMobileNoParameterTypes12 = new Class[] {
			String.class
		};
	private static final Class<?>[]
		_deleteByConnectionRequestIdParameterTypes14 = new Class[] {long.class};
	private static final Class<?>[] _getAvailableTimeSlotsParameterTypes15 =
		new Class[] {java.util.Date.class, String.class};
	private static final Class<?>[]
		_getDivisionWiseAvailableSlotsParameterTypes16 = new Class[] {
			java.util.Date.class
		};

}