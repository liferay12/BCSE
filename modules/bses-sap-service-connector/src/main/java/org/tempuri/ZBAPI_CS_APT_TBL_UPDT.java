/**
 * ZBAPI_CS_APT_TBL_UPDT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CS_APT_TBL_UPDT  implements java.io.Serializable {
    private java.lang.String strORDER_NUMBER;

    private java.lang.String strMAIN_WORK_CENTER;

    public ZBAPI_CS_APT_TBL_UPDT() {
    }

    public ZBAPI_CS_APT_TBL_UPDT(
           java.lang.String strORDER_NUMBER,
           java.lang.String strMAIN_WORK_CENTER) {
           this.strORDER_NUMBER = strORDER_NUMBER;
           this.strMAIN_WORK_CENTER = strMAIN_WORK_CENTER;
    }


    /**
     * Gets the strORDER_NUMBER value for this ZBAPI_CS_APT_TBL_UPDT.
     * 
     * @return strORDER_NUMBER
     */
    public java.lang.String getStrORDER_NUMBER() {
        return strORDER_NUMBER;
    }


    /**
     * Sets the strORDER_NUMBER value for this ZBAPI_CS_APT_TBL_UPDT.
     * 
     * @param strORDER_NUMBER
     */
    public void setStrORDER_NUMBER(java.lang.String strORDER_NUMBER) {
        this.strORDER_NUMBER = strORDER_NUMBER;
    }


    /**
     * Gets the strMAIN_WORK_CENTER value for this ZBAPI_CS_APT_TBL_UPDT.
     * 
     * @return strMAIN_WORK_CENTER
     */
    public java.lang.String getStrMAIN_WORK_CENTER() {
        return strMAIN_WORK_CENTER;
    }


    /**
     * Sets the strMAIN_WORK_CENTER value for this ZBAPI_CS_APT_TBL_UPDT.
     * 
     * @param strMAIN_WORK_CENTER
     */
    public void setStrMAIN_WORK_CENTER(java.lang.String strMAIN_WORK_CENTER) {
        this.strMAIN_WORK_CENTER = strMAIN_WORK_CENTER;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CS_APT_TBL_UPDT)) return false;
        ZBAPI_CS_APT_TBL_UPDT other = (ZBAPI_CS_APT_TBL_UPDT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strORDER_NUMBER==null && other.getStrORDER_NUMBER()==null) || 
             (this.strORDER_NUMBER!=null &&
              this.strORDER_NUMBER.equals(other.getStrORDER_NUMBER()))) &&
            ((this.strMAIN_WORK_CENTER==null && other.getStrMAIN_WORK_CENTER()==null) || 
             (this.strMAIN_WORK_CENTER!=null &&
              this.strMAIN_WORK_CENTER.equals(other.getStrMAIN_WORK_CENTER())));
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
        if (getStrORDER_NUMBER() != null) {
            _hashCode += getStrORDER_NUMBER().hashCode();
        }
        if (getStrMAIN_WORK_CENTER() != null) {
            _hashCode += getStrMAIN_WORK_CENTER().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CS_APT_TBL_UPDT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CS_APT_TBL_UPDT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strORDER_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strORDER_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strMAIN_WORK_CENTER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strMAIN_WORK_CENTER"));
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
