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

import com.bses.connection2.model.RequestNumberSeq;
import com.bses.connection2.service.base.RequestNumberSeqLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The implementation of the request number seq local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.bses.connection2.service.RequestNumberSeqLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RequestNumberSeqLocalServiceBaseImpl
 */
public class RequestNumberSeqLocalServiceImpl
	extends RequestNumberSeqLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.bses.connection2.service.RequestNumberSeqLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.bses.connection2.service.RequestNumberSeqLocalServiceUtil</code>.
	 */
	
	public long generateSeqNumber() throws PortalException {
		long seqNo =0;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date currentDate = new Date();
		String dateStr = dateFormat.format(currentDate);
		RequestNumberSeq requestNumberSeq = null;
		try{
			requestNumberSeq = requestNumberSeqPersistence.findBySeqDate(dateStr);
		}catch (Exception e) {	}
		
		if(requestNumberSeq == null) {
			requestNumberSeq = requestNumberSeqPersistence.create(CounterLocalServiceUtil.increment(RequestNumberSeq.class.getName()));
			requestNumberSeq.setSeqDate(dateStr);
		}
		seqNo = requestNumberSeq.getSeqNumber();
		seqNo = seqNo+1;
		requestNumberSeq.setSeqNumber(seqNo);
		requestNumberSeqPersistence.update(requestNumberSeq);
		return seqNo;
		
	}
}