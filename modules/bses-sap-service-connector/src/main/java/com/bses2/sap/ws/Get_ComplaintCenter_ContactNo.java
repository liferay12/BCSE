/**
 * Get_ComplaintCenter_ContactNo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_ComplaintCenter_ContactNo  implements java.io.Serializable {
    private java.lang.String ccId;

    public Get_ComplaintCenter_ContactNo() {
    }

    public Get_ComplaintCenter_ContactNo(
           java.lang.String ccId) {
           this.ccId = ccId;
    }


    /**
     * Gets the ccId value for this Get_ComplaintCenter_ContactNo.
     * 
     * @return ccId
     */
    public java.lang.String getCcId() {
        return ccId;
    }


    /**
     * Sets the ccId value for this Get_ComplaintCenter_ContactNo.
     * 
     * @param ccId
     */
    public void setCcId(java.lang.String ccId) {
        this.ccId = ccId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_ComplaintCenter_ContactNo)) return false;
        Get_ComplaintCenter_ContactNo other = (Get_ComplaintCenter_ContactNo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ccId==null && other.getCcId()==null) || 
             (this.ccId!=null &&
              this.ccId.equals(other.getCcId())));
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
        if (getCcId() != null) {
            _hashCode += getCcId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_ComplaintCenter_ContactNo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ComplaintCenter_ContactNo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ccId"));
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
