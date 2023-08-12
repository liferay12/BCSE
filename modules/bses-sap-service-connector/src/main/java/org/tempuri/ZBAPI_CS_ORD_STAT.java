/**
 * ZBAPI_CS_ORD_STAT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CS_ORD_STAT  implements java.io.Serializable {
    private java.lang.String strAufnr;

    public ZBAPI_CS_ORD_STAT() {
    }

    public ZBAPI_CS_ORD_STAT(
           java.lang.String strAufnr) {
           this.strAufnr = strAufnr;
    }


    /**
     * Gets the strAufnr value for this ZBAPI_CS_ORD_STAT.
     * 
     * @return strAufnr
     */
    public java.lang.String getStrAufnr() {
        return strAufnr;
    }


    /**
     * Sets the strAufnr value for this ZBAPI_CS_ORD_STAT.
     * 
     * @param strAufnr
     */
    public void setStrAufnr(java.lang.String strAufnr) {
        this.strAufnr = strAufnr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CS_ORD_STAT)) return false;
        ZBAPI_CS_ORD_STAT other = (ZBAPI_CS_ORD_STAT) obj;
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
              this.strAufnr.equals(other.getStrAufnr())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CS_ORD_STAT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CS_ORD_STAT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAufnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAufnr"));
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
