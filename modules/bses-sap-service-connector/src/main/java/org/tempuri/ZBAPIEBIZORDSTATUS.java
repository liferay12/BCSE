/**
 * ZBAPIEBIZORDSTATUS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPIEBIZORDSTATUS  implements java.io.Serializable {
    private java.lang.String stOrderNumber;

    public ZBAPIEBIZORDSTATUS() {
    }

    public ZBAPIEBIZORDSTATUS(
           java.lang.String stOrderNumber) {
           this.stOrderNumber = stOrderNumber;
    }


    /**
     * Gets the stOrderNumber value for this ZBAPIEBIZORDSTATUS.
     * 
     * @return stOrderNumber
     */
    public java.lang.String getStOrderNumber() {
        return stOrderNumber;
    }


    /**
     * Sets the stOrderNumber value for this ZBAPIEBIZORDSTATUS.
     * 
     * @param stOrderNumber
     */
    public void setStOrderNumber(java.lang.String stOrderNumber) {
        this.stOrderNumber = stOrderNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPIEBIZORDSTATUS)) return false;
        ZBAPIEBIZORDSTATUS other = (ZBAPIEBIZORDSTATUS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stOrderNumber==null && other.getStOrderNumber()==null) || 
             (this.stOrderNumber!=null &&
              this.stOrderNumber.equals(other.getStOrderNumber())));
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
        if (getStOrderNumber() != null) {
            _hashCode += getStOrderNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPIEBIZORDSTATUS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPIEBIZORDSTATUS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stOrderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "stOrderNumber"));
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
