/**
 * Get_ltfeederlist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_ltfeederlist  implements java.io.Serializable {
    private java.lang.String DTequipmentcd;

    public Get_ltfeederlist() {
    }

    public Get_ltfeederlist(
           java.lang.String DTequipmentcd) {
           this.DTequipmentcd = DTequipmentcd;
    }


    /**
     * Gets the DTequipmentcd value for this Get_ltfeederlist.
     * 
     * @return DTequipmentcd
     */
    public java.lang.String getDTequipmentcd() {
        return DTequipmentcd;
    }


    /**
     * Sets the DTequipmentcd value for this Get_ltfeederlist.
     * 
     * @param DTequipmentcd
     */
    public void setDTequipmentcd(java.lang.String DTequipmentcd) {
        this.DTequipmentcd = DTequipmentcd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_ltfeederlist)) return false;
        Get_ltfeederlist other = (Get_ltfeederlist) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DTequipmentcd==null && other.getDTequipmentcd()==null) || 
             (this.DTequipmentcd!=null &&
              this.DTequipmentcd.equals(other.getDTequipmentcd())));
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
        if (getDTequipmentcd() != null) {
            _hashCode += getDTequipmentcd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_ltfeederlist.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ltfeederlist"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DTequipmentcd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DTequipmentcd"));
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
