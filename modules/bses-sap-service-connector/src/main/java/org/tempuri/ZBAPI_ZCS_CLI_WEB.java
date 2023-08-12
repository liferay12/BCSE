/**
 * ZBAPI_ZCS_CLI_WEB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_ZCS_CLI_WEB  implements java.io.Serializable {
    private java.lang.String strTelephoneNumber;

    public ZBAPI_ZCS_CLI_WEB() {
    }

    public ZBAPI_ZCS_CLI_WEB(
           java.lang.String strTelephoneNumber) {
           this.strTelephoneNumber = strTelephoneNumber;
    }


    /**
     * Gets the strTelephoneNumber value for this ZBAPI_ZCS_CLI_WEB.
     * 
     * @return strTelephoneNumber
     */
    public java.lang.String getStrTelephoneNumber() {
        return strTelephoneNumber;
    }


    /**
     * Sets the strTelephoneNumber value for this ZBAPI_ZCS_CLI_WEB.
     * 
     * @param strTelephoneNumber
     */
    public void setStrTelephoneNumber(java.lang.String strTelephoneNumber) {
        this.strTelephoneNumber = strTelephoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_ZCS_CLI_WEB)) return false;
        ZBAPI_ZCS_CLI_WEB other = (ZBAPI_ZCS_CLI_WEB) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strTelephoneNumber==null && other.getStrTelephoneNumber()==null) || 
             (this.strTelephoneNumber!=null &&
              this.strTelephoneNumber.equals(other.getStrTelephoneNumber())));
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
        if (getStrTelephoneNumber() != null) {
            _hashCode += getStrTelephoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_ZCS_CLI_WEB.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_ZCS_CLI_WEB"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strTelephoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strTelephoneNumber"));
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
