/**
 * ZBAPI_WHATSAPP_INTEGRATION.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_WHATSAPP_INTEGRATION  implements java.io.Serializable {
    private java.lang.String strOrderID;

    private java.lang.String strIFlag;

    public ZBAPI_WHATSAPP_INTEGRATION() {
    }

    public ZBAPI_WHATSAPP_INTEGRATION(
           java.lang.String strOrderID,
           java.lang.String strIFlag) {
           this.strOrderID = strOrderID;
           this.strIFlag = strIFlag;
    }


    /**
     * Gets the strOrderID value for this ZBAPI_WHATSAPP_INTEGRATION.
     * 
     * @return strOrderID
     */
    public java.lang.String getStrOrderID() {
        return strOrderID;
    }


    /**
     * Sets the strOrderID value for this ZBAPI_WHATSAPP_INTEGRATION.
     * 
     * @param strOrderID
     */
    public void setStrOrderID(java.lang.String strOrderID) {
        this.strOrderID = strOrderID;
    }


    /**
     * Gets the strIFlag value for this ZBAPI_WHATSAPP_INTEGRATION.
     * 
     * @return strIFlag
     */
    public java.lang.String getStrIFlag() {
        return strIFlag;
    }


    /**
     * Sets the strIFlag value for this ZBAPI_WHATSAPP_INTEGRATION.
     * 
     * @param strIFlag
     */
    public void setStrIFlag(java.lang.String strIFlag) {
        this.strIFlag = strIFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_WHATSAPP_INTEGRATION)) return false;
        ZBAPI_WHATSAPP_INTEGRATION other = (ZBAPI_WHATSAPP_INTEGRATION) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strOrderID==null && other.getStrOrderID()==null) || 
             (this.strOrderID!=null &&
              this.strOrderID.equals(other.getStrOrderID()))) &&
            ((this.strIFlag==null && other.getStrIFlag()==null) || 
             (this.strIFlag!=null &&
              this.strIFlag.equals(other.getStrIFlag())));
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
        if (getStrOrderID() != null) {
            _hashCode += getStrOrderID().hashCode();
        }
        if (getStrIFlag() != null) {
            _hashCode += getStrIFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_WHATSAPP_INTEGRATION.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_WHATSAPP_INTEGRATION"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strOrderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strOrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strIFlag"));
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
