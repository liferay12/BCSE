/**
 * ISUServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ISUServiceLocator extends org.apache.axis.client.Service implements com.bses2.sap.ws.ISUService {

    public ISUServiceLocator() {
    }


    public ISUServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ISUServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ISUServiceSoap
//    private java.lang.String ISUServiceSoap_address = "http://115.249.67.73:7870/ISUService.asmx";
    
    private java.lang.String ISUServiceSoap_address = "http://115.249.67.73:7870/ISUService.asmx";

    public java.lang.String getISUServiceSoapAddress() {
        return ISUServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ISUServiceSoapWSDDServiceName = "ISUServiceSoap";

    public java.lang.String getISUServiceSoapWSDDServiceName() {
        return ISUServiceSoapWSDDServiceName;
    }

    public void setISUServiceSoapWSDDServiceName(java.lang.String name) {
        ISUServiceSoapWSDDServiceName = name;
    }

    public com.bses2.sap.ws.ISUServiceSoap getISUServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ISUServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getISUServiceSoap(endpoint);
    }

    public com.bses2.sap.ws.ISUServiceSoap getISUServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bses2.sap.ws.ISUServiceSoapStub _stub = new com.bses2.sap.ws.ISUServiceSoapStub(portAddress, this);
            _stub.setPortName(getISUServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setISUServiceSoapEndpointAddress(java.lang.String address) {
        ISUServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bses2.sap.ws.ISUServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bses2.sap.ws.ISUServiceSoapStub _stub = new com.bses2.sap.ws.ISUServiceSoapStub(new java.net.URL(ISUServiceSoap_address), this);
                _stub.setPortName(getISUServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ISUServiceSoap".equals(inputPortName)) {
            return getISUServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "ISUService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "ISUServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ISUServiceSoap".equals(portName)) {
            setISUServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
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
