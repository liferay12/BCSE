/**
 * FetchCurrentTotalFaultsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class FetchCurrentTotalFaultsResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.FetchCurrentTotalFaultsResponseFetchCurrentTotalFaultsResult fetchCurrentTotalFaultsResult;

    public FetchCurrentTotalFaultsResponse() {
    }

    public FetchCurrentTotalFaultsResponse(
           com.bses2.sap.ws.FetchCurrentTotalFaultsResponseFetchCurrentTotalFaultsResult fetchCurrentTotalFaultsResult) {
           this.fetchCurrentTotalFaultsResult = fetchCurrentTotalFaultsResult;
    }


    /**
     * Gets the fetchCurrentTotalFaultsResult value for this FetchCurrentTotalFaultsResponse.
     * 
     * @return fetchCurrentTotalFaultsResult
     */
    public com.bses2.sap.ws.FetchCurrentTotalFaultsResponseFetchCurrentTotalFaultsResult getFetchCurrentTotalFaultsResult() {
        return fetchCurrentTotalFaultsResult;
    }


    /**
     * Sets the fetchCurrentTotalFaultsResult value for this FetchCurrentTotalFaultsResponse.
     * 
     * @param fetchCurrentTotalFaultsResult
     */
    public void setFetchCurrentTotalFaultsResult(com.bses2.sap.ws.FetchCurrentTotalFaultsResponseFetchCurrentTotalFaultsResult fetchCurrentTotalFaultsResult) {
        this.fetchCurrentTotalFaultsResult = fetchCurrentTotalFaultsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FetchCurrentTotalFaultsResponse)) return false;
        FetchCurrentTotalFaultsResponse other = (FetchCurrentTotalFaultsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fetchCurrentTotalFaultsResult==null && other.getFetchCurrentTotalFaultsResult()==null) || 
             (this.fetchCurrentTotalFaultsResult!=null &&
              this.fetchCurrentTotalFaultsResult.equals(other.getFetchCurrentTotalFaultsResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFetchCurrentTotalFaultsResult() != null) {
            _hashCode += getFetchCurrentTotalFaultsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FetchCurrentTotalFaultsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">fetchCurrentTotalFaultsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fetchCurrentTotalFaultsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fetchCurrentTotalFaultsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>fetchCurrentTotalFaultsResponse>fetchCurrentTotalFaultsResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
