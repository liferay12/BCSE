/**
 * Get_AreabypoleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_AreabypoleResponse  implements java.io.Serializable {
    private java.lang.String get_AreabypoleResult;

    public Get_AreabypoleResponse() {
    }

    public Get_AreabypoleResponse(
           java.lang.String get_AreabypoleResult) {
           this.get_AreabypoleResult = get_AreabypoleResult;
    }


    /**
     * Gets the get_AreabypoleResult value for this Get_AreabypoleResponse.
     * 
     * @return get_AreabypoleResult
     */
    public java.lang.String getGet_AreabypoleResult() {
        return get_AreabypoleResult;
    }


    /**
     * Sets the get_AreabypoleResult value for this Get_AreabypoleResponse.
     * 
     * @param get_AreabypoleResult
     */
    public void setGet_AreabypoleResult(java.lang.String get_AreabypoleResult) {
        this.get_AreabypoleResult = get_AreabypoleResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_AreabypoleResponse)) return false;
        Get_AreabypoleResponse other = (Get_AreabypoleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_AreabypoleResult==null && other.getGet_AreabypoleResult()==null) || 
             (this.get_AreabypoleResult!=null &&
              this.get_AreabypoleResult.equals(other.getGet_AreabypoleResult())));
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
        if (getGet_AreabypoleResult() != null) {
            _hashCode += getGet_AreabypoleResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_AreabypoleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_AreabypoleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_AreabypoleResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_AreabypoleResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
