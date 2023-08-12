/**
 * ZBAPI_USTATUS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_USTATUS  implements java.io.Serializable {
    private java.lang.String strAufnr;

    private java.lang.String strTXT_04;

    public ZBAPI_USTATUS() {
    }

    public ZBAPI_USTATUS(
           java.lang.String strAufnr,
           java.lang.String strTXT_04) {
           this.strAufnr = strAufnr;
           this.strTXT_04 = strTXT_04;
    }


    /**
     * Gets the strAufnr value for this ZBAPI_USTATUS.
     * 
     * @return strAufnr
     */
    public java.lang.String getStrAufnr() {
        return strAufnr;
    }


    /**
     * Sets the strAufnr value for this ZBAPI_USTATUS.
     * 
     * @param strAufnr
     */
    public void setStrAufnr(java.lang.String strAufnr) {
        this.strAufnr = strAufnr;
    }


    /**
     * Gets the strTXT_04 value for this ZBAPI_USTATUS.
     * 
     * @return strTXT_04
     */
    public java.lang.String getStrTXT_04() {
        return strTXT_04;
    }


    /**
     * Sets the strTXT_04 value for this ZBAPI_USTATUS.
     * 
     * @param strTXT_04
     */
    public void setStrTXT_04(java.lang.String strTXT_04) {
        this.strTXT_04 = strTXT_04;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_USTATUS)) return false;
        ZBAPI_USTATUS other = (ZBAPI_USTATUS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strAufnr==null && other.getStrAufnr()==null) || 
             (this.strAufnr!=null &&
              this.strAufnr.equals(other.getStrAufnr()))) &&
            ((this.strTXT_04==null && other.getStrTXT_04()==null) || 
             (this.strTXT_04!=null &&
              this.strTXT_04.equals(other.getStrTXT_04())));
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
        if (getStrAufnr() != null) {
            _hashCode += getStrAufnr().hashCode();
        }
        if (getStrTXT_04() != null) {
            _hashCode += getStrTXT_04().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_USTATUS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_USTATUS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAufnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAufnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strTXT_04");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strTXT_04"));
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
