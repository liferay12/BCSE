/**
 * WebGISServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class WebGISServiceLocator extends org.apache.axis.client.Service implements com.bses2.sap.ws.WebGISService {

	public WebGISServiceLocator() {
	}

	public WebGISServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public WebGISServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

    // Use to get a proxy class for WebGISServiceSoap
	private java.lang.String WebGISServiceSoap_address = "http://115.249.67.73:7860/GISServices/WebGISService.asmx";   //  old
  
//  private java.lang.String WebGISServiceSoap_address = "http://125.22.84.58:9880/GISServices/WebGISService.asmx";     // new
//	private java.lang.String WebGISServiceSoap_address = "http://10.125.64.219:9880/GISServices/WebGISService.asmx"; // new
	
//	private java.lang.String WebGISServiceSoap_address = ""; // new

	public java.lang.String getWebGISServiceSoapAddress() {
		return WebGISServiceSoap_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String WebGISServiceSoapWSDDServiceName = "WebGISServiceSoap";

	public java.lang.String getWebGISServiceSoapWSDDServiceName() {
		return WebGISServiceSoapWSDDServiceName;
	}

	public void setWebGISServiceSoapWSDDServiceName(java.lang.String name) {
		WebGISServiceSoapWSDDServiceName = name;
	}

	public com.bses2.sap.ws.WebGISServiceSoap getWebGISServiceSoap() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(WebGISServiceSoap_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getWebGISServiceSoap(endpoint);
	}

	public com.bses2.sap.ws.WebGISServiceSoap getWebGISServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			com.bses2.sap.ws.WebGISServiceSoapStub _stub = new com.bses2.sap.ws.WebGISServiceSoapStub(portAddress, this);
			_stub.setPortName(getWebGISServiceSoapWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setWebGISServiceSoapEndpointAddress(java.lang.String address) {
		WebGISServiceSoap_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (com.bses2.sap.ws.WebGISServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
				com.bses2.sap.ws.WebGISServiceSoapStub _stub = new com.bses2.sap.ws.WebGISServiceSoapStub(new java.net.URL(WebGISServiceSoap_address), this);
				_stub.setPortName(getWebGISServiceSoapWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException(
				"There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("WebGISServiceSoap".equals(inputPortName)) {
			return getWebGISServiceSoap();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://tempuri.org/", "WebGISService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebGISServiceSoap"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

		if ("WebGISServiceSoap".equals(portName)) {
			setWebGISServiceSoapEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
