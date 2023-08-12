/**
 * ZBAPI_DEMAND_NOTE_ONLINE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_DEMAND_NOTE_ONLINE  implements java.io.Serializable {
    private java.lang.String strOrder;

    public ZBAPI_DEMAND_NOTE_ONLINE() {
    }

    public ZBAPI_DEMAND_NOTE_ONLINE(
           java.lang.String strOrder) {
           this.strOrder = strOrder;
    }


    /**
     * Gets the strOrder value for this ZBAPI_DEMAND_NOTE_ONLINE.
     * 
     * @return strOrder
     */
    public java.lang.String getStrOrder() {
        return strOrder;
    }


    /**
     * Sets the strOrder value for this ZBAPI_DEMAND_NOTE_ONLINE.
     * 
     * @param strOrder
     */
    public void setStrOrder(java.lang.String strOrder) {
        this.strOrder = strOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_DEMAND_NOTE_ONLINE)) return false;
        ZBAPI_DEMAND_NOTE_ONLINE other = (ZBAPI_DEMAND_NOTE_ONLINE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strOrder==null && other.getStrOrder()==null) || 
             (this.strOrder!=null &&
              this.strOrder.equals(other.getStrOrder())));
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
        if (getStrOrder() != null) {
            _hashCode += getStrOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_DEMAND_NOTE_ONLINE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_DEMAND_NOTE_ONLINE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strOrder"));
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
