/**
 * ISUService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public interface ISUService extends javax.xml.rpc.Service {
    public java.lang.String getISUServiceSoapAddress();

    public com.bses2.sap.ws.ISUServiceSoap getISUServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.bses2.sap.ws.ISUServiceSoap getISUServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
