/**
 * ZBAPI_FICA_ENF_CONS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_FICA_ENF_CONS  implements java.io.Serializable {
    private java.lang.String strCOMPANY_CODE;

    private java.lang.String strCONTRACT_ACCOUNT;

    public ZBAPI_FICA_ENF_CONS() {
    }

    public ZBAPI_FICA_ENF_CONS(
           java.lang.String strCOMPANY_CODE,
           java.lang.String strCONTRACT_ACCOUNT) {
           this.strCOMPANY_CODE = strCOMPANY_CODE;
           this.strCONTRACT_ACCOUNT = strCONTRACT_ACCOUNT;
    }


    /**
     * Gets the strCOMPANY_CODE value for this ZBAPI_FICA_ENF_CONS.
     * 
     * @return strCOMPANY_CODE
     */
    public java.lang.String getStrCOMPANY_CODE() {
        return strCOMPANY_CODE;
    }


    /**
     * Sets the strCOMPANY_CODE value for this ZBAPI_FICA_ENF_CONS.
     * 
     * @param strCOMPANY_CODE
     */
    public void setStrCOMPANY_CODE(java.lang.String strCOMPANY_CODE) {
        this.strCOMPANY_CODE = strCOMPANY_CODE;
    }


    /**
     * Gets the strCONTRACT_ACCOUNT value for this ZBAPI_FICA_ENF_CONS.
     * 
     * @return strCONTRACT_ACCOUNT
     */
    public java.lang.String getStrCONTRACT_ACCOUNT() {
        return strCONTRACT_ACCOUNT;
    }


    /**
     * Sets the strCONTRACT_ACCOUNT value for this ZBAPI_FICA_ENF_CONS.
     * 
     * @param strCONTRACT_ACCOUNT
     */
    public void setStrCONTRACT_ACCOUNT(java.lang.String strCONTRACT_ACCOUNT) {
        this.strCONTRACT_ACCOUNT = strCONTRACT_ACCOUNT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_FICA_ENF_CONS)) return false;
        ZBAPI_FICA_ENF_CONS other = (ZBAPI_FICA_ENF_CONS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCOMPANY_CODE==null && other.getStrCOMPANY_CODE()==null) || 
             (this.strCOMPANY_CODE!=null &&
              this.strCOMPANY_CODE.equals(other.getStrCOMPANY_CODE()))) &&
            ((this.strCONTRACT_ACCOUNT==null && other.getStrCONTRACT_ACCOUNT()==null) || 
             (this.strCONTRACT_ACCOUNT!=null &&
              this.strCONTRACT_ACCOUNT.equals(other.getStrCONTRACT_ACCOUNT())));
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
        if (getStrCOMPANY_CODE() != null) {
            _hashCode += getStrCOMPANY_CODE().hashCode();
        }
        if (getStrCONTRACT_ACCOUNT() != null) {
            _hashCode += getStrCONTRACT_ACCOUNT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_FICA_ENF_CONS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_FICA_ENF_CONS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCOMPANY_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCOMPANY_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCONTRACT_ACCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCONTRACT_ACCOUNT"));
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
