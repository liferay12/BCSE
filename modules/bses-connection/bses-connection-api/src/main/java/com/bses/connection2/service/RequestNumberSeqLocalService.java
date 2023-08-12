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

import aQute.bnd.annotation.ProviderType;

import com.bses.connection2.model.RequestNumberSeq;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for RequestNumberSeq. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see RequestNumberSeqLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface RequestNumberSeqLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.bses.connection2.service.impl.RequestNumberSeqLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the request number seq local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link RequestNumberSeqLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the request number seq to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestNumberSeqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param requestNumberSeq the request number seq
	 * @return the request number seq that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public RequestNumberSeq addRequestNumberSeq(
		RequestNumberSeq requestNumberSeq);

	/**
	 * Creates a new request number seq with the primary key. Does not add the request number seq to the database.
	 *
	 * @param requestNumberSeqId the primary key for the new request number seq
	 * @return the new request number seq
	 */
	@Transactional(enabled = false)
	public RequestNumberSeq createRequestNumberSeq(long requestNumberSeqId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the request number seq with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestNumberSeqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq that was removed
	 * @throws PortalException if a request number seq with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public RequestNumberSeq deleteRequestNumberSeq(long requestNumberSeqId)
		throws PortalException;

	/**
	 * Deletes the request number seq from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestNumberSeqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param requestNumberSeq the request number seq
	 * @return the request number seq that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public RequestNumberSeq deleteRequestNumberSeq(
		RequestNumberSeq requestNumberSeq);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RequestNumberSeq fetchRequestNumberSeq(long requestNumberSeqId);

	/**
	 * Returns the request number seq matching the UUID and group.
	 *
	 * @param uuid the request number seq's UUID
	 * @param groupId the primary key of the group
	 * @return the matching request number seq, or <code>null</code> if a matching request number seq could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RequestNumberSeq fetchRequestNumberSeqByUuidAndGroupId(
		String uuid, long groupId);

	public long generateSeqNumber() throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the request number seq with the primary key.
	 *
	 * @param requestNumberSeqId the primary key of the request number seq
	 * @return the request number seq
	 * @throws PortalException if a request number seq with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RequestNumberSeq getRequestNumberSeq(long requestNumberSeqId)
		throws PortalException;

	/**
	 * Returns the request number seq matching the UUID and group.
	 *
	 * @param uuid the request number seq's UUID
	 * @param groupId the primary key of the group
	 * @return the matching request number seq
	 * @throws PortalException if a matching request number seq could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RequestNumberSeq getRequestNumberSeqByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the request number seqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.connection2.model.impl.RequestNumberSeqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @return the range of request number seqs
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RequestNumberSeq> getRequestNumberSeqs(int start, int end);

	/**
	 * Returns all the request number seqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the request number seqs
	 * @param companyId the primary key of the company
	 * @return the matching request number seqs, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RequestNumberSeq> getRequestNumberSeqsByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of request number seqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the request number seqs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of request number seqs
	 * @param end the upper bound of the range of request number seqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching request number seqs, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RequestNumberSeq> getRequestNumberSeqsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<RequestNumberSeq> orderByComparator);

	/**
	 * Returns the number of request number seqs.
	 *
	 * @return the number of request number seqs
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getRequestNumberSeqsCount();

	/**
	 * Updates the request number seq in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RequestNumberSeqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param requestNumberSeq the request number seq
	 * @return the request number seq that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public RequestNumberSeq updateRequestNumberSeq(
		RequestNumberSeq requestNumberSeq);

}