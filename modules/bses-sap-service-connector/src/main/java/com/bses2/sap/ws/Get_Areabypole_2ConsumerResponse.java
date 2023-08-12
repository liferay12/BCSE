/**
 * Get_Areabypole_2ConsumerResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Areabypole_2ConsumerResponse  implements java.io.Serializable {
    private java.lang.String get_Areabypole_2ConsumerResult;

    public Get_Areabypole_2ConsumerResponse() {
    }

    public Get_Areabypole_2ConsumerResponse(
           java.lang.String get_Areabypole_2ConsumerResult) {
           this.get_Areabypole_2ConsumerResult = get_Areabypole_2ConsumerResult;
    }


    /**
     * Gets the get_Areabypole_2ConsumerResult value for this Get_Areabypole_2ConsumerResponse.
     * 
     * @return get_Areabypole_2ConsumerResult
     */
    public java.lang.String getGet_Areabypole_2ConsumerResult() {
        return get_Areabypole_2ConsumerResult;
    }


    /**
     * Sets the get_Areabypole_2ConsumerResult value for this Get_Areabypole_2ConsumerResponse.
     * 
     * @param get_Areabypole_2ConsumerResult
     */
    public void setGet_Areabypole_2ConsumerResult(java.lang.String get_Areabypole_2ConsumerResult) {
        this.get_Areabypole_2ConsumerResult = get_Areabypole_2ConsumerResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Areabypole_2ConsumerResponse)) return false;
        Get_Areabypole_2ConsumerResponse other = (Get_Areabypole_2ConsumerResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Areabypole_2ConsumerResult==null && other.getGet_Areabypole_2ConsumerResult()==null) || 
             (this.get_Areabypole_2ConsumerResult!=null &&
              this.get_Areabypole_2ConsumerResult.equals(other.getGet_Areabypole_2ConsumerResult())));
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
        if (getGet_Areabypole_2ConsumerResult() != null) {
            _hashCode += getGet_Areabypole_2ConsumerResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Areabypole_2ConsumerResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Areabypole_2ConsumerResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Areabypole_2ConsumerResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Areabypole_2ConsumerResult"));
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
