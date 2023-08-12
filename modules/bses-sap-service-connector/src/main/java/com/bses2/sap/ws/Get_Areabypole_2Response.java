/**
 * Get_Areabypole_2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Areabypole_2Response  implements java.io.Serializable {
    private java.lang.String[] get_Areabypole_2Result;

    public Get_Areabypole_2Response() {
    }

    public Get_Areabypole_2Response(
           java.lang.String[] get_Areabypole_2Result) {
           this.get_Areabypole_2Result = get_Areabypole_2Result;
    }


    /**
     * Gets the get_Areabypole_2Result value for this Get_Areabypole_2Response.
     * 
     * @return get_Areabypole_2Result
     */
    public java.lang.String[] getGet_Areabypole_2Result() {
        return get_Areabypole_2Result;
    }


    /**
     * Sets the get_Areabypole_2Result value for this Get_Areabypole_2Response.
     * 
     * @param get_Areabypole_2Result
     */
    public void setGet_Areabypole_2Result(java.lang.String[] get_Areabypole_2Result) {
        this.get_Areabypole_2Result = get_Areabypole_2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Areabypole_2Response)) return false;
        Get_Areabypole_2Response other = (Get_Areabypole_2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Areabypole_2Result==null && other.getGet_Areabypole_2Result()==null) || 
             (this.get_Areabypole_2Result!=null &&
              java.util.Arrays.equals(this.get_Areabypole_2Result, other.getGet_Areabypole_2Result())));
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
        if (getGet_Areabypole_2Result() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGet_Areabypole_2Result());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGet_Areabypole_2Result(), i);
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
        new org.apache.axis.description.TypeDesc(Get_Areabypole_2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Areabypole_2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Areabypole_2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Areabypole_2Result"));
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
