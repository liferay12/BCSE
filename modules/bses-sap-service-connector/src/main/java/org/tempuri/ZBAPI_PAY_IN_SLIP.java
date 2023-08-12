/**
 * ZBAPI_PAY_IN_SLIP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_PAY_IN_SLIP  implements java.io.Serializable {
    private java.lang.String strCompanyCode;

    private java.lang.String strCA_Number;

    public ZBAPI_PAY_IN_SLIP() {
    }

    public ZBAPI_PAY_IN_SLIP(
           java.lang.String strCompanyCode,
           java.lang.String strCA_Number) {
           this.strCompanyCode = strCompanyCode;
           this.strCA_Number = strCA_Number;
    }


    /**
     * Gets the strCompanyCode value for this ZBAPI_PAY_IN_SLIP.
     * 
     * @return strCompanyCode
     */
    public java.lang.String getStrCompanyCode() {
        return strCompanyCode;
    }


    /**
     * Sets the strCompanyCode value for this ZBAPI_PAY_IN_SLIP.
     * 
     * @param strCompanyCode
     */
    public void setStrCompanyCode(java.lang.String strCompanyCode) {
        this.strCompanyCode = strCompanyCode;
    }


    /**
     * Gets the strCA_Number value for this ZBAPI_PAY_IN_SLIP.
     * 
     * @return strCA_Number
     */
    public java.lang.String getStrCA_Number() {
        return strCA_Number;
    }


    /**
     * Sets the strCA_Number value for this ZBAPI_PAY_IN_SLIP.
     * 
     * @param strCA_Number
     */
    public void setStrCA_Number(java.lang.String strCA_Number) {
        this.strCA_Number = strCA_Number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_PAY_IN_SLIP)) return false;
        ZBAPI_PAY_IN_SLIP other = (ZBAPI_PAY_IN_SLIP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCompanyCode==null && other.getStrCompanyCode()==null) || 
             (this.strCompanyCode!=null &&
              this.strCompanyCode.equals(other.getStrCompanyCode()))) &&
            ((this.strCA_Number==null && other.getStrCA_Number()==null) || 
             (this.strCA_Number!=null &&
              this.strCA_Number.equals(other.getStrCA_Number())));
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
        if (getStrCompanyCode() != null) {
            _hashCode += getStrCompanyCode().hashCode();
        }
        if (getStrCA_Number() != null) {
            _hashCode += getStrCA_Number().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_PAY_IN_SLIP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_PAY_IN_SLIP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCompanyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCompanyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCA_Number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCA_Number"));
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
