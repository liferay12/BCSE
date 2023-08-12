/**
 * GetSensorN_TEMPHyperlink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetSensorN_TEMPHyperlink  implements java.io.Serializable {
    private java.lang.String IMEINO;

    private java.lang.String DTTYPE;

    public GetSensorN_TEMPHyperlink() {
    }

    public GetSensorN_TEMPHyperlink(
           java.lang.String IMEINO,
           java.lang.String DTTYPE) {
           this.IMEINO = IMEINO;
           this.DTTYPE = DTTYPE;
    }


    /**
     * Gets the IMEINO value for this GetSensorN_TEMPHyperlink.
     * 
     * @return IMEINO
     */
    public java.lang.String getIMEINO() {
        return IMEINO;
    }


    /**
     * Sets the IMEINO value for this GetSensorN_TEMPHyperlink.
     * 
     * @param IMEINO
     */
    public void setIMEINO(java.lang.String IMEINO) {
        this.IMEINO = IMEINO;
    }


    /**
     * Gets the DTTYPE value for this GetSensorN_TEMPHyperlink.
     * 
     * @return DTTYPE
     */
    public java.lang.String getDTTYPE() {
        return DTTYPE;
    }


    /**
     * Sets the DTTYPE value for this GetSensorN_TEMPHyperlink.
     * 
     * @param DTTYPE
     */
    public void setDTTYPE(java.lang.String DTTYPE) {
        this.DTTYPE = DTTYPE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSensorN_TEMPHyperlink)) return false;
        GetSensorN_TEMPHyperlink other = (GetSensorN_TEMPHyperlink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IMEINO==null && other.getIMEINO()==null) || 
             (this.IMEINO!=null &&
              this.IMEINO.equals(other.getIMEINO()))) &&
            ((this.DTTYPE==null && other.getDTTYPE()==null) || 
             (this.DTTYPE!=null &&
              this.DTTYPE.equals(other.getDTTYPE())));
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
        if (getIMEINO() != null) {
            _hashCode += getIMEINO().hashCode();
        }
        if (getDTTYPE() != null) {
            _hashCode += getDTTYPE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSensorN_TEMPHyperlink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorN_TEMPHyperlink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEINO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IMEINO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DTTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DTTYPE"));
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
