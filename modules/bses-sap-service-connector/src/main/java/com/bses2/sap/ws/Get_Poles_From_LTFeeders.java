/**
 * Get_Poles_From_LTFeeders.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Poles_From_LTFeeders  implements java.io.Serializable {
    private java.lang.String LTFeeders;

    public Get_Poles_From_LTFeeders() {
    }

    public Get_Poles_From_LTFeeders(
           java.lang.String LTFeeders) {
           this.LTFeeders = LTFeeders;
    }


    /**
     * Gets the LTFeeders value for this Get_Poles_From_LTFeeders.
     * 
     * @return LTFeeders
     */
    public java.lang.String getLTFeeders() {
        return LTFeeders;
    }


    /**
     * Sets the LTFeeders value for this Get_Poles_From_LTFeeders.
     * 
     * @param LTFeeders
     */
    public void setLTFeeders(java.lang.String LTFeeders) {
        this.LTFeeders = LTFeeders;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Poles_From_LTFeeders)) return false;
        Get_Poles_From_LTFeeders other = (Get_Poles_From_LTFeeders) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.LTFeeders==null && other.getLTFeeders()==null) || 
             (this.LTFeeders!=null &&
              this.LTFeeders.equals(other.getLTFeeders())));
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
        if (getLTFeeders() != null) {
            _hashCode += getLTFeeders().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Poles_From_LTFeeders.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Poles_From_LTFeeders"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LTFeeders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LTFeeders"));
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
