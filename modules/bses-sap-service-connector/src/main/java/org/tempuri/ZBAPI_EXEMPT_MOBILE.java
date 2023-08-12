/**
 * ZBAPI_EXEMPT_MOBILE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_EXEMPT_MOBILE  implements java.io.Serializable {
    private java.lang.String strMobileNo;

    public ZBAPI_EXEMPT_MOBILE() {
    }

    public ZBAPI_EXEMPT_MOBILE(
           java.lang.String strMobileNo) {
           this.strMobileNo = strMobileNo;
    }


    /**
     * Gets the strMobileNo value for this ZBAPI_EXEMPT_MOBILE.
     * 
     * @return strMobileNo
     */
    public java.lang.String getStrMobileNo() {
        return strMobileNo;
    }


    /**
     * Sets the strMobileNo value for this ZBAPI_EXEMPT_MOBILE.
     * 
     * @param strMobileNo
     */
    public void setStrMobileNo(java.lang.String strMobileNo) {
        this.strMobileNo = strMobileNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_EXEMPT_MOBILE)) return false;
        ZBAPI_EXEMPT_MOBILE other = (ZBAPI_EXEMPT_MOBILE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strMobileNo==null && other.getStrMobileNo()==null) || 
             (this.strMobileNo!=null &&
              this.strMobileNo.equals(other.getStrMobileNo())));
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
        if (getStrMobileNo() != null) {
            _hashCode += getStrMobileNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_EXEMPT_MOBILE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_EXEMPT_MOBILE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strMobileNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strMobileNo"));
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
