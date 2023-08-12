/**
 * Get_backfeedlist_dt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_backfeedlist_dt  implements java.io.Serializable {
    private java.lang.String[] dtcd;

    public Get_backfeedlist_dt() {
    }

    public Get_backfeedlist_dt(
           java.lang.String[] dtcd) {
           this.dtcd = dtcd;
    }


    /**
     * Gets the dtcd value for this Get_backfeedlist_dt.
     * 
     * @return dtcd
     */
    public java.lang.String[] getDtcd() {
        return dtcd;
    }


    /**
     * Sets the dtcd value for this Get_backfeedlist_dt.
     * 
     * @param dtcd
     */
    public void setDtcd(java.lang.String[] dtcd) {
        this.dtcd = dtcd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_backfeedlist_dt)) return false;
        Get_backfeedlist_dt other = (Get_backfeedlist_dt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dtcd==null && other.getDtcd()==null) || 
             (this.dtcd!=null &&
              java.util.Arrays.equals(this.dtcd, other.getDtcd())));
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
        if (getDtcd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDtcd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDtcd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_backfeedlist_dt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_backfeedlist_dt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtcd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dtcd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
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
