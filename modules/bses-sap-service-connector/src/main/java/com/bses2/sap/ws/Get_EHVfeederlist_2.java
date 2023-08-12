/**
 * Get_EHVfeederlist_2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_EHVfeederlist_2  implements java.io.Serializable {
    private java.lang.String gridcd;

    private java.lang.String feederkv;

    public Get_EHVfeederlist_2() {
    }

    public Get_EHVfeederlist_2(
           java.lang.String gridcd,
           java.lang.String feederkv) {
           this.gridcd = gridcd;
           this.feederkv = feederkv;
    }


    /**
     * Gets the gridcd value for this Get_EHVfeederlist_2.
     * 
     * @return gridcd
     */
    public java.lang.String getGridcd() {
        return gridcd;
    }


    /**
     * Sets the gridcd value for this Get_EHVfeederlist_2.
     * 
     * @param gridcd
     */
    public void setGridcd(java.lang.String gridcd) {
        this.gridcd = gridcd;
    }


    /**
     * Gets the feederkv value for this Get_EHVfeederlist_2.
     * 
     * @return feederkv
     */
    public java.lang.String getFeederkv() {
        return feederkv;
    }


    /**
     * Sets the feederkv value for this Get_EHVfeederlist_2.
     * 
     * @param feederkv
     */
    public void setFeederkv(java.lang.String feederkv) {
        this.feederkv = feederkv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_EHVfeederlist_2)) return false;
        Get_EHVfeederlist_2 other = (Get_EHVfeederlist_2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gridcd==null && other.getGridcd()==null) || 
             (this.gridcd!=null &&
              this.gridcd.equals(other.getGridcd()))) &&
            ((this.feederkv==null && other.getFeederkv()==null) || 
             (this.feederkv!=null &&
              this.feederkv.equals(other.getFeederkv())));
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
        if (getGridcd() != null) {
            _hashCode += getGridcd().hashCode();
        }
        if (getFeederkv() != null) {
            _hashCode += getFeederkv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_EHVfeederlist_2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederlist_2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gridcd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gridcd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feederkv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "feederkv"));
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
