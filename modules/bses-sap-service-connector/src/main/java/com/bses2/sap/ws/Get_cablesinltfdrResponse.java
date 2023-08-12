/**
 * Get_cablesinltfdrResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_cablesinltfdrResponse  implements java.io.Serializable {
    private java.lang.String get_cablesinltfdrResult;

    public Get_cablesinltfdrResponse() {
    }

    public Get_cablesinltfdrResponse(
           java.lang.String get_cablesinltfdrResult) {
           this.get_cablesinltfdrResult = get_cablesinltfdrResult;
    }


    /**
     * Gets the get_cablesinltfdrResult value for this Get_cablesinltfdrResponse.
     * 
     * @return get_cablesinltfdrResult
     */
    public java.lang.String getGet_cablesinltfdrResult() {
        return get_cablesinltfdrResult;
    }


    /**
     * Sets the get_cablesinltfdrResult value for this Get_cablesinltfdrResponse.
     * 
     * @param get_cablesinltfdrResult
     */
    public void setGet_cablesinltfdrResult(java.lang.String get_cablesinltfdrResult) {
        this.get_cablesinltfdrResult = get_cablesinltfdrResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_cablesinltfdrResponse)) return false;
        Get_cablesinltfdrResponse other = (Get_cablesinltfdrResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_cablesinltfdrResult==null && other.getGet_cablesinltfdrResult()==null) || 
             (this.get_cablesinltfdrResult!=null &&
              this.get_cablesinltfdrResult.equals(other.getGet_cablesinltfdrResult())));
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
        if (getGet_cablesinltfdrResult() != null) {
            _hashCode += getGet_cablesinltfdrResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_cablesinltfdrResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_cablesinltfdrResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_cablesinltfdrResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_cablesinltfdrResult"));
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
