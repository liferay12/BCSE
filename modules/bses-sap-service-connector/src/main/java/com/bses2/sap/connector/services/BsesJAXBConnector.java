package com.bses2.sap.connector.services;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 * The purpose of this class is to create singleton Object for JAXB to avoid
 * memory consumption
 * 
 * Author
 * Mohit Soni (Liferay India Pvt Ltd)
 * 
 **/
public class BsesJAXBConnector {
	private static Map<Class, JAXBContext> contextMap = new HashMap();

	private BsesJAXBConnector() {
	}

	public static JAXBContext getJAXBInstance(Class className) {
		JAXBContext contextObj = contextMap.get(className); // !!
		try {
			if (contextObj == null) {
				contextObj = JAXBContext.newInstance(className);
				contextMap.put(className, contextObj); // !!
			}
		} catch (JAXBException e) {
			throw new IllegalStateException("Unable to initialise");
		}

		return contextObj;
	}
}
