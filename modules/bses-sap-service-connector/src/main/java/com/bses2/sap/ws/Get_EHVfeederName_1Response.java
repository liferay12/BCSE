/**
 * Get_EHVfeederName_1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_EHVfeederName_1Response  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_EHVfeederName_1ResponseGet_EHVfeederName_1Result get_EHVfeederName_1Result;

    public Get_EHVfeederName_1Response() {
    }

    public Get_EHVfeederName_1Response(
           com.bses2.sap.ws.Get_EHVfeederName_1ResponseGet_EHVfeederName_1Result get_EHVfeederName_1Result) {
           this.get_EHVfeederName_1Result = get_EHVfeederName_1Result;
    }


    /**
     * Gets the get_EHVfeederName_1Result value for this Get_EHVfeederName_1Response.
     * 
     * @return get_EHVfeederName_1Result
     */
    public com.bses2.sap.ws.Get_EHVfeederName_1ResponseGet_EHVfeederName_1Result getGet_EHVfeederName_1Result() {
        return get_EHVfeederName_1Result;
    }


    /**
     * Sets the get_EHVfeederName_1Result value for this Get_EHVfeederName_1Response.
     * 
     * @param get_EHVfeederName_1Result
     */
    public void setGet_EHVfeederName_1Result(com.bses2.sap.ws.Get_EHVfeederName_1ResponseGet_EHVfeederName_1Result get_EHVfeederName_1Result) {
        this.get_EHVfeederName_1Result = get_EHVfeederName_1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_EHVfeederName_1Response)) return false;
        Get_EHVfeederName_1Response other = (Get_EHVfeederName_1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_EHVfeederName_1Result==null && other.getGet_EHVfeederName_1Result()==null) || 
             (this.get_EHVfeederName_1Result!=null &&
              this.get_EHVfeederName_1Result.equals(other.getGet_EHVfeederName_1Result())));
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
        if (getGet_EHVfeederName_1Result() != null) {
            _hashCode += getGet_EHVfeederName_1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_EHVfeederName_1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederName_1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_EHVfeederName_1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVfeederName_1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVfeederName_1Response>Get_EHVfeederName_1Result"));
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
