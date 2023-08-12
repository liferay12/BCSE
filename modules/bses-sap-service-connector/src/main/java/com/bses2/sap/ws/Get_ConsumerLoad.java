/**
 * Get_ConsumerLoad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_ConsumerLoad  implements java.io.Serializable {
    private java.lang.String[] ltFDRList;

    public Get_ConsumerLoad() {
    }

    public Get_ConsumerLoad(
           java.lang.String[] ltFDRList) {
           this.ltFDRList = ltFDRList;
    }


    /**
     * Gets the ltFDRList value for this Get_ConsumerLoad.
     * 
     * @return ltFDRList
     */
    public java.lang.String[] getLtFDRList() {
        return ltFDRList;
    }


    /**
     * Sets the ltFDRList value for this Get_ConsumerLoad.
     * 
     * @param ltFDRList
     */
    public void setLtFDRList(java.lang.String[] ltFDRList) {
        this.ltFDRList = ltFDRList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_ConsumerLoad)) return false;
        Get_ConsumerLoad other = (Get_ConsumerLoad) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ltFDRList==null && other.getLtFDRList()==null) || 
             (this.ltFDRList!=null &&
              java.util.Arrays.equals(this.ltFDRList, other.getLtFDRList())));
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
        if (getLtFDRList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLtFDRList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLtFDRList(), i);
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
        new org.apache.axis.description.TypeDesc(Get_ConsumerLoad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ConsumerLoad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ltFDRList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ltFDRList"));
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
