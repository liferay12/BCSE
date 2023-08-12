/**
 * FetchDivisionListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class FetchDivisionListResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.FetchDivisionListResponseFetchDivisionListResult fetchDivisionListResult;

    public FetchDivisionListResponse() {
    }

    public FetchDivisionListResponse(
           com.bses2.sap.ws.FetchDivisionListResponseFetchDivisionListResult fetchDivisionListResult) {
           this.fetchDivisionListResult = fetchDivisionListResult;
    }


    /**
     * Gets the fetchDivisionListResult value for this FetchDivisionListResponse.
     * 
     * @return fetchDivisionListResult
     */
    public com.bses2.sap.ws.FetchDivisionListResponseFetchDivisionListResult getFetchDivisionListResult() {
        return fetchDivisionListResult;
    }


    /**
     * Sets the fetchDivisionListResult value for this FetchDivisionListResponse.
     * 
     * @param fetchDivisionListResult
     */
    public void setFetchDivisionListResult(com.bses2.sap.ws.FetchDivisionListResponseFetchDivisionListResult fetchDivisionListResult) {
        this.fetchDivisionListResult = fetchDivisionListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FetchDivisionListResponse)) return false;
        FetchDivisionListResponse other = (FetchDivisionListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fetchDivisionListResult==null && other.getFetchDivisionListResult()==null) || 
             (this.fetchDivisionListResult!=null &&
              this.fetchDivisionListResult.equals(other.getFetchDivisionListResult())));
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
        if (getFetchDivisionListResult() != null) {
            _hashCode += getFetchDivisionListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FetchDivisionListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">fetchDivisionListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fetchDivisionListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fetchDivisionListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>fetchDivisionListResponse>fetchDivisionListResult"));
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
