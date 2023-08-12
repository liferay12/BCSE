/**
 * ZBAPI_IDENTIFY_DUES.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_IDENTIFY_DUES  implements java.io.Serializable {
    private java.lang.String CA_NUMBER;

    public ZBAPI_IDENTIFY_DUES() {
    }

    public ZBAPI_IDENTIFY_DUES(
           java.lang.String CA_NUMBER) {
           this.CA_NUMBER = CA_NUMBER;
    }


    /**
     * Gets the CA_NUMBER value for this ZBAPI_IDENTIFY_DUES.
     * 
     * @return CA_NUMBER
     */
    public java.lang.String getCA_NUMBER() {
        return CA_NUMBER;
    }


    /**
     * Sets the CA_NUMBER value for this ZBAPI_IDENTIFY_DUES.
     * 
     * @param CA_NUMBER
     */
    public void setCA_NUMBER(java.lang.String CA_NUMBER) {
        this.CA_NUMBER = CA_NUMBER;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_IDENTIFY_DUES)) return false;
        ZBAPI_IDENTIFY_DUES other = (ZBAPI_IDENTIFY_DUES) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CA_NUMBER==null && other.getCA_NUMBER()==null) || 
             (this.CA_NUMBER!=null &&
              this.CA_NUMBER.equals(other.getCA_NUMBER())));
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
        if (getCA_NUMBER() != null) {
            _hashCode += getCA_NUMBER().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_IDENTIFY_DUES.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_IDENTIFY_DUES"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CA_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CA_NUMBER"));
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
