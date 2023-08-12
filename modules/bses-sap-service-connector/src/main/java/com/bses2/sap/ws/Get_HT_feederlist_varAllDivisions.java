/**
 * Get_HT_feederlist_varAllDivisions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_HT_feederlist_varAllDivisions  implements java.io.Serializable {
    private java.lang.String stationfac;

    private java.lang.String divcd;

    public Get_HT_feederlist_varAllDivisions() {
    }

    public Get_HT_feederlist_varAllDivisions(
           java.lang.String stationfac,
           java.lang.String divcd) {
           this.stationfac = stationfac;
           this.divcd = divcd;
    }


    /**
     * Gets the stationfac value for this Get_HT_feederlist_varAllDivisions.
     * 
     * @return stationfac
     */
    public java.lang.String getStationfac() {
        return stationfac;
    }


    /**
     * Sets the stationfac value for this Get_HT_feederlist_varAllDivisions.
     * 
     * @param stationfac
     */
    public void setStationfac(java.lang.String stationfac) {
        this.stationfac = stationfac;
    }


    /**
     * Gets the divcd value for this Get_HT_feederlist_varAllDivisions.
     * 
     * @return divcd
     */
    public java.lang.String getDivcd() {
        return divcd;
    }


    /**
     * Sets the divcd value for this Get_HT_feederlist_varAllDivisions.
     * 
     * @param divcd
     */
    public void setDivcd(java.lang.String divcd) {
        this.divcd = divcd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_HT_feederlist_varAllDivisions)) return false;
        Get_HT_feederlist_varAllDivisions other = (Get_HT_feederlist_varAllDivisions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stationfac==null && other.getStationfac()==null) || 
             (this.stationfac!=null &&
              this.stationfac.equals(other.getStationfac()))) &&
            ((this.divcd==null && other.getDivcd()==null) || 
             (this.divcd!=null &&
              this.divcd.equals(other.getDivcd())));
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
        if (getStationfac() != null) {
            _hashCode += getStationfac().hashCode();
        }
        if (getDivcd() != null) {
            _hashCode += getDivcd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_HT_feederlist_varAllDivisions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HT_feederlist_varAllDivisions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stationfac");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "stationfac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("divcd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"));
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
