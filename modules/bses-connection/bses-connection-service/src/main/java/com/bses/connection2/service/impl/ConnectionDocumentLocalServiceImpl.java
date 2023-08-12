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

import com.bses.connection2.exception.NoSuchConnectionDocumentException;
import com.bses.connection2.model.ConnectionDocument;
import com.bses.connection2.model.ConnectionRequest;
import com.bses.connection2.service.ConnectionRequestLocalServiceUtil;
import com.bses.connection2.service.base.ConnectionDocumentLocalServiceBaseImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.PropsUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * The implementation of the connection document local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.bses.connection2.service.ConnectionDocumentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConnectionDocumentLocalServiceBaseImpl
 * @see com.bses.connection2.service.ConnectionDocumentLocalServiceUtil
 */
public class ConnectionDocumentLocalServiceImpl
	extends ConnectionDocumentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.bses.connection2.service.ConnectionDocumentLocalServiceUtil} to access the connection document local service.
	 */
	private static final Log LOGGER = LogFactoryUtil.getLog(ConnectionDocumentLocalServiceImpl.class);

	public List<ConnectionDocument> getConnectionDocumentByConnectionRequestId(long connectionRequestId){
		return connectionDocumentPersistence.findByConnectionRequestId(connectionRequestId);
	}
	
	public ConnectionDocument getConnectionDocumentByConnectionRequestIdAndDocumentType(long connectionRequestId, String documentType){
		try {
			return connectionDocumentPersistence.findByConnectionRequestIdAndDocumentType(connectionRequestId, documentType);
		} catch (NoSuchConnectionDocumentException e) {
			LOGGER.debug(e.getMessage());
		}
		return null;
	}
	
	public ConnectionDocument updateConnectionDocument(long connectionDocumentId, long connectionRequestId, String documentType, String documentName, String clientFileName, File file) throws PortalException{
		LOGGER.info("updateConnectionDocument:  connectionRequestId="+connectionRequestId+", documentType="+documentType);
		ConnectionRequest connectionRequest=null;
		ConnectionDocument connectionDocument=null;
		
		connectionRequest=ConnectionRequestLocalServiceUtil.getConnectionRequest(connectionRequestId);
		
		try {
			if(connectionDocumentId>0) {
				connectionDocument=connectionDocumentPersistence.findByPrimaryKey(connectionDocumentId);
			}else if(connectionRequestId>0 && StringUtils.isNotBlank(documentType)){
				connectionDocument=connectionDocumentPersistence.findByConnectionRequestIdAndDocumentType(connectionRequestId, documentType);
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		
		
		Calendar calendar=Calendar.getInstance();
		String basePath=PropsUtil.get("connection.document.base.path");
		String path=basePath+File.separatorChar+calendar.get(Calendar.YEAR)+File.separatorChar+(calendar.get(Calendar.MONTH)+1)+File.separatorChar+connectionRequest.getRequestNo();
		
		File folder=new File(path);
		if(!folder.exists()) {
			folder.mkdirs();
		}
		
		String destFileName=calendar.getTimeInMillis()+file.getName().substring(file.getName().lastIndexOf("."));
		File dest=new File(folder, destFileName);
		try {
			FileUtil.copyFile(file, dest);
			LOGGER.info(file.getAbsolutePath() +" was moved to "+dest.getAbsolutePath());
		} catch (IOException e) {
			LOGGER.info(file.getAbsolutePath() +" could not be moved to "+dest.getAbsolutePath());
		}finally {
			try {
				FileUtil.delete(file);
			}catch(Exception e) {}
		}

		if(connectionDocument==null) {
			connectionDocument=connectionDocumentPersistence.create(CounterLocalServiceUtil.increment(ConnectionDocument.class.getName()));
		}
		
		//if(connectionDocument!=null) {
		connectionDocument.setConnectionRequestId(connectionRequestId);
		connectionDocument.setDocumentName(documentName);
		connectionDocument.setDocumentType(documentType);
		connectionDocument.setDocumentPath(dest.getAbsolutePath());
		connectionDocument.setClientFileName(clientFileName);
		connectionDocumentPersistence.update(connectionDocument);
		//}
		return connectionDocument;
	}
	public boolean removeConnectionDocument(long connectionDocumentId) {
			
		try {
			ConnectionDocument connectionDocument=connectionDocumentPersistence.findByPrimaryKey(connectionDocumentId);
			FileUtil.delete(connectionDocument.getDocumentPath());
			//File file=new File(connectionDocument.getDocumentPath());
			//file.delete();
			connectionDocumentPersistence.remove(connectionDocument);
			return true;
		} catch (NoSuchConnectionDocumentException e) {
			LOGGER.error(e.getMessage());
		}
		return false;
	}
}