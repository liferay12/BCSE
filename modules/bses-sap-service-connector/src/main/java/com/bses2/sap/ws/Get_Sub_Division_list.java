/**
 * Get_Sub_Division_list.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Sub_Division_list  implements java.io.Serializable {
    private java.lang.String divsionCode;

    public Get_Sub_Division_list() {
    }

    public Get_Sub_Division_list(
           java.lang.String divsionCode) {
           this.divsionCode = divsionCode;
    }


    /**
     * Gets the divsionCode value for this Get_Sub_Division_list.
     * 
     * @return divsionCode
     */
    public java.lang.String getDivsionCode() {
        return divsionCode;
    }


    /**
     * Sets the divsionCode value for this Get_Sub_Division_list.
     * 
     * @param divsionCode
     */
    public void setDivsionCode(java.lang.String divsionCode) {
        this.divsionCode = divsionCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Sub_Division_list)) return false;
        Get_Sub_Division_list other = (Get_Sub_Division_list) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.divsionCode==null && other.getDivsionCode()==null) || 
             (this.divsionCode!=null &&
              this.divsionCode.equals(other.getDivsionCode())));
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
        if (getDivsionCode() != null) {
            _hashCode += getDivsionCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Sub_Division_list.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Sub_Division_list"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divsionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DivsionCode"));
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
