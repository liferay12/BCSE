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

import com.bses.connection2.model.OTP;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OTP. This utility wraps
 * <code>com.bses.connection2.service.impl.OTPLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OTPLocalService
 * @generated
 */
public class OTPLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.bses.connection2.service.impl.OTPLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the otp to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OTPLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param otp the otp
	 * @return the otp that was added
	 */
	public static OTP addOTP(OTP otp) {
		return getService().addOTP(otp);
	}

	/**
	 * Creates a new otp with the primary key. Does not add the otp to the database.
	 *
	 * @param otpId the primary key for the new otp
	 * @return the new otp
	 */
	public static OTP createOTP(long otpId) {
		return getService().createOTP(otpId);
	}

	/**
	 * Deletes the otp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OTPLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param otpId the primary key of the otp
	 * @return the otp that was removed
	 * @throws PortalException if a otp with the primary key could not be found
	 */
	public static OTP deleteOTP(long otpId) throws PortalException {
		return getService().deleteOTP(otpId);
	}

	/**
	 * Deletes the otp from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OTPLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param otp the otp
	 * @return the otp that was removed
	 */
	public static OTP deleteOTP(OTP otp) {
		return getService().deleteOTP(otp);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.OTPModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.OTPModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static OTP fetchOTP(long otpId) {
		return getService().fetchOTP(otpId);
	}

	/**
	 * Returns the otp matching the UUID and group.
	 *
	 * @param uuid the otp's UUID
	 * @param groupId the primary key of the group
	 * @return the matching otp, or <code>null</code> if a matching otp could not be found
	 */
	public static OTP fetchOTPByUuidAndGroupId(String uuid, long groupId) {
		return getService().fetchOTPByUuidAndGroupId(uuid, groupId);
	}

	public static OTP findByMobileNo(String mobileNo) {
		return getService().findByMobileNo(mobileNo);
	}

	public static OTP generateEmailOtp(String mobileNo, String email) {
		return getService().generateEmailOtp(mobileNo, email);
	}

	public static OTP generateOtp(String mobileNo, String email) {
		return getService().generateOtp(mobileNo, email);
	}

	public static String generateOtpForCaNumber(
		String caNumber, String loginMobile) {

		return getService().generateOtpForCaNumber(caNumber, loginMobile);
	}

	public static String generateTwelveDigitCANo(String accNo) {
		return getService().generateTwelveDigitCANo(accNo);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * Returns the otp with the primary key.
	 *
	 * @param otpId the primary key of the otp
	 * @return the otp
	 * @throws PortalException if a otp with the primary key could not be found
	 */
	public static OTP getOTP(long otpId) throws PortalException {
		return getService().getOTP(otpId);
	}

	/**
	 * Returns the otp matching the UUID and group.
	 *
	 * @param uuid the otp's UUID
	 * @param groupId the primary key of the group
	 * @return the matching otp
	 * @throws PortalException if a matching otp could not be found
	 */
	public static OTP getOTPByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getOTPByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the otps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.OTPModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @return the range of otps
	 */
	public static List<OTP> getOTPs(int start, int end) {
		return getService().getOTPs(start, end);
	}

	/**
	 * Returns all the otps matching the UUID and company.
	 *
	 * @param uuid the UUID of the otps
	 * @param companyId the primary key of the company
	 * @return the matching otps, or an empty list if no matches were found
	 */
	public static List<OTP> getOTPsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getOTPsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of otps matching the UUID and company.
	 *
	 * @param uuid the UUID of the otps
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of otps
	 * @param end the upper bound of the range of otps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching otps, or an empty list if no matches were found
	 */
	public static List<OTP> getOTPsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OTP> orderByComparator) {

		return getService().getOTPsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of otps.
	 *
	 * @return the number of otps
	 */
	public static int getOTPsCount() {
		return getService().getOTPsCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static OTP resendEmailOtp(String mobileNo, String email) {
		return getService().resendEmailOtp(mobileNo, email);
	}

	public static OTP resendOtp(String mobileNo, String email) {
		return getService().resendOtp(mobileNo, email);
	}

	/**
	 * Updates the otp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OTPLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param otp the otp
	 * @return the otp that was updated
	 */
	public static OTP updateOTP(OTP otp) {
		return getService().updateOTP(otp);
	}

	public static String validateOtp(String mobileNo, String otpNumber) {
		return getService().validateOtp(mobileNo, otpNumber);
	}

	public static OTPLocalService getService() {
		return _service;
	}

	private static volatile OTPLocalService _service;

}