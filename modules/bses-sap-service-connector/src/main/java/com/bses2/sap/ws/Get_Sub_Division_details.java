/**
 * Get_Sub_Division_details.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Sub_Division_details  implements java.io.Serializable {
    private java.lang.String subdivision_code;

    public Get_Sub_Division_details() {
    }

    public Get_Sub_Division_details(
           java.lang.String subdivision_code) {
           this.subdivision_code = subdivision_code;
    }


    /**
     * Gets the subdivision_code value for this Get_Sub_Division_details.
     * 
     * @return subdivision_code
     */
    public java.lang.String getSubdivision_code() {
        return subdivision_code;
    }


    /**
     * Sets the subdivision_code value for this Get_Sub_Division_details.
     * 
     * @param subdivision_code
     */
    public void setSubdivision_code(java.lang.String subdivision_code) {
        this.subdivision_code = subdivision_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Sub_Division_details)) return false;
        Get_Sub_Division_details other = (Get_Sub_Division_details) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subdivision_code==null && other.getSubdivision_code()==null) || 
             (this.subdivision_code!=null &&
              this.subdivision_code.equals(other.getSubdivision_code())));
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
        if (getSubdivision_code() != null) {
            _hashCode += getSubdivision_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Sub_Division_details.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Sub_Division_details"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subdivision_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "subdivision_code"));
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
