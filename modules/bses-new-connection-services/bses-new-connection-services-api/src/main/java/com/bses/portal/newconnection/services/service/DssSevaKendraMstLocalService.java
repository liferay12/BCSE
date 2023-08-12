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

package com.bses.portal.newconnection.services.service;

import aQute.bnd.annotation.ProviderType;

import com.bses.portal.newconnection.services.model.DssSevaKendraMst;
import com.bses.portal.newconnection.services.service.persistence.DssSevaKendraMstPK;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
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
 * Provides the local service interface for DssSevaKendraMst. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see DssSevaKendraMstLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface DssSevaKendraMstLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.bses.portal.newconnection.services.service.impl.DssSevaKendraMstLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the dss seva kendra mst local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link DssSevaKendraMstLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the dss seva kendra mst to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DssSevaKendraMstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dssSevaKendraMst the dss seva kendra mst
	 * @return the dss seva kendra mst that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DssSevaKendraMst addDssSevaKendraMst(
		DssSevaKendraMst dssSevaKendraMst);

	/**
	 * Creates a new dss seva kendra mst with the primary key. Does not add the dss seva kendra mst to the database.
	 *
	 * @param dssSevaKendraMstPK the primary key for the new dss seva kendra mst
	 * @return the new dss seva kendra mst
	 */
	@Transactional(enabled = false)
	public DssSevaKendraMst createDssSevaKendraMst(
		DssSevaKendraMstPK dssSevaKendraMstPK);

	/**
	 * Deletes the dss seva kendra mst from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DssSevaKendraMstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dssSevaKendraMst the dss seva kendra mst
	 * @return the dss seva kendra mst that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public DssSevaKendraMst deleteDssSevaKendraMst(
		DssSevaKendraMst dssSevaKendraMst);

	/**
	 * Deletes the dss seva kendra mst with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DssSevaKendraMstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst that was removed
	 * @throws PortalException if a dss seva kendra mst with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public DssSevaKendraMst deleteDssSevaKendraMst(
			DssSevaKendraMstPK dssSevaKendraMstPK)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstModelImpl</code>.
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
	public DssSevaKendraMst fetchDssSevaKendraMst(
		DssSevaKendraMstPK dssSevaKendraMstPK);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DssSevaKendraMst getByDistrictAndName(String district, String name);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DssSevaKendraMst getByName(String name);

	/**
	 * Returns the dss seva kendra mst with the primary key.
	 *
	 * @param dssSevaKendraMstPK the primary key of the dss seva kendra mst
	 * @return the dss seva kendra mst
	 * @throws PortalException if a dss seva kendra mst with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DssSevaKendraMst getDssSevaKendraMst(
			DssSevaKendraMstPK dssSevaKendraMstPK)
		throws PortalException;

	/**
	 * Returns a range of all the dss seva kendra msts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.bses.portal.newconnection.services.model.impl.DssSevaKendraMstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dss seva kendra msts
	 * @param end the upper bound of the range of dss seva kendra msts (not inclusive)
	 * @return the range of dss seva kendra msts
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DssSevaKendraMst> getDssSevaKendraMsts(int start, int end);

	/**
	 * Returns the number of dss seva kendra msts.
	 *
	 * @return the number of dss seva kendra msts
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDssSevaKendraMstsCount();

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

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DssSevaKendraMst isRegisteredKendra(
		String districtCode, String districtDescription);

	/**
	 * Updates the dss seva kendra mst in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DssSevaKendraMstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dssSevaKendraMst the dss seva kendra mst
	 * @return the dss seva kendra mst that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DssSevaKendraMst updateDssSevaKendraMst(
		DssSevaKendraMst dssSevaKendraMst);

}