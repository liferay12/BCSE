/**
 * ZBAPI_CS_FETCH_VOLTLEVEL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CS_FETCH_VOLTLEVEL  implements java.io.Serializable {
    private java.lang.String strCONT_ACCT;

    public ZBAPI_CS_FETCH_VOLTLEVEL() {
    }

    public ZBAPI_CS_FETCH_VOLTLEVEL(
           java.lang.String strCONT_ACCT) {
           this.strCONT_ACCT = strCONT_ACCT;
    }


    /**
     * Gets the strCONT_ACCT value for this ZBAPI_CS_FETCH_VOLTLEVEL.
     * 
     * @return strCONT_ACCT
     */
    public java.lang.String getStrCONT_ACCT() {
        return strCONT_ACCT;
    }


    /**
     * Sets the strCONT_ACCT value for this ZBAPI_CS_FETCH_VOLTLEVEL.
     * 
     * @param strCONT_ACCT
     */
    public void setStrCONT_ACCT(java.lang.String strCONT_ACCT) {
        this.strCONT_ACCT = strCONT_ACCT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CS_FETCH_VOLTLEVEL)) return false;
        ZBAPI_CS_FETCH_VOLTLEVEL other = (ZBAPI_CS_FETCH_VOLTLEVEL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCONT_ACCT==null && other.getStrCONT_ACCT()==null) || 
             (this.strCONT_ACCT!=null &&
              this.strCONT_ACCT.equals(other.getStrCONT_ACCT())));
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
        if (getStrCONT_ACCT() != null) {
            _hashCode += getStrCONT_ACCT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CS_FETCH_VOLTLEVEL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CS_FETCH_VOLTLEVEL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCONT_ACCT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCONT_ACCT"));
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
