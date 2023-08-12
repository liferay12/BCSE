/**
 * Get_backfeedlist_feeder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_backfeedlist_feeder  implements java.io.Serializable {
    private java.lang.String feederidz;

    public Get_backfeedlist_feeder() {
    }

    public Get_backfeedlist_feeder(
           java.lang.String feederidz) {
           this.feederidz = feederidz;
    }


    /**
     * Gets the feederidz value for this Get_backfeedlist_feeder.
     * 
     * @return feederidz
     */
    public java.lang.String getFeederidz() {
        return feederidz;
    }


    /**
     * Sets the feederidz value for this Get_backfeedlist_feeder.
     * 
     * @param feederidz
     */
    public void setFeederidz(java.lang.String feederidz) {
        this.feederidz = feederidz;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_backfeedlist_feeder)) return false;
        Get_backfeedlist_feeder other = (Get_backfeedlist_feeder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feederidz==null && other.getFeederidz()==null) || 
             (this.feederidz!=null &&
              this.feederidz.equals(other.getFeederidz())));
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
        if (getFeederidz() != null) {
            _hashCode += getFeederidz().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_backfeedlist_feeder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_backfeedlist_feeder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feederidz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "feederidz"));
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
