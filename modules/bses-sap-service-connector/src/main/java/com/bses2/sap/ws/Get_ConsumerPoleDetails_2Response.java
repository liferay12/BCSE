/**
 * Get_ConsumerPoleDetails_2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_ConsumerPoleDetails_2Response  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_ConsumerPoleDetails_2ResponseGet_ConsumerPoleDetails_2Result get_ConsumerPoleDetails_2Result;

    public Get_ConsumerPoleDetails_2Response() {
    }

    public Get_ConsumerPoleDetails_2Response(
           com.bses2.sap.ws.Get_ConsumerPoleDetails_2ResponseGet_ConsumerPoleDetails_2Result get_ConsumerPoleDetails_2Result) {
           this.get_ConsumerPoleDetails_2Result = get_ConsumerPoleDetails_2Result;
    }


    /**
     * Gets the get_ConsumerPoleDetails_2Result value for this Get_ConsumerPoleDetails_2Response.
     * 
     * @return get_ConsumerPoleDetails_2Result
     */
    public com.bses2.sap.ws.Get_ConsumerPoleDetails_2ResponseGet_ConsumerPoleDetails_2Result getGet_ConsumerPoleDetails_2Result() {
        return get_ConsumerPoleDetails_2Result;
    }


    /**
     * Sets the get_ConsumerPoleDetails_2Result value for this Get_ConsumerPoleDetails_2Response.
     * 
     * @param get_ConsumerPoleDetails_2Result
     */
    public void setGet_ConsumerPoleDetails_2Result(com.bses2.sap.ws.Get_ConsumerPoleDetails_2ResponseGet_ConsumerPoleDetails_2Result get_ConsumerPoleDetails_2Result) {
        this.get_ConsumerPoleDetails_2Result = get_ConsumerPoleDetails_2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_ConsumerPoleDetails_2Response)) return false;
        Get_ConsumerPoleDetails_2Response other = (Get_ConsumerPoleDetails_2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_ConsumerPoleDetails_2Result==null && other.getGet_ConsumerPoleDetails_2Result()==null) || 
             (this.get_ConsumerPoleDetails_2Result!=null &&
              this.get_ConsumerPoleDetails_2Result.equals(other.getGet_ConsumerPoleDetails_2Result())));
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
        if (getGet_ConsumerPoleDetails_2Result() != null) {
            _hashCode += getGet_ConsumerPoleDetails_2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_ConsumerPoleDetails_2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ConsumerPoleDetails_2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_ConsumerPoleDetails_2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ConsumerPoleDetails_2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ConsumerPoleDetails_2Response>Get_ConsumerPoleDetails_2Result"));
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
