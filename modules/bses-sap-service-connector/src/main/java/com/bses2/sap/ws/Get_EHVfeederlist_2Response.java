/**
 * Get_EHVfeederlist_2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_EHVfeederlist_2Response  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_EHVfeederlist_2ResponseGet_EHVfeederlist_2Result get_EHVfeederlist_2Result;

    public Get_EHVfeederlist_2Response() {
    }

    public Get_EHVfeederlist_2Response(
           com.bses2.sap.ws.Get_EHVfeederlist_2ResponseGet_EHVfeederlist_2Result get_EHVfeederlist_2Result) {
           this.get_EHVfeederlist_2Result = get_EHVfeederlist_2Result;
    }


    /**
     * Gets the get_EHVfeederlist_2Result value for this Get_EHVfeederlist_2Response.
     * 
     * @return get_EHVfeederlist_2Result
     */
    public com.bses2.sap.ws.Get_EHVfeederlist_2ResponseGet_EHVfeederlist_2Result getGet_EHVfeederlist_2Result() {
        return get_EHVfeederlist_2Result;
    }


    /**
     * Sets the get_EHVfeederlist_2Result value for this Get_EHVfeederlist_2Response.
     * 
     * @param get_EHVfeederlist_2Result
     */
    public void setGet_EHVfeederlist_2Result(com.bses2.sap.ws.Get_EHVfeederlist_2ResponseGet_EHVfeederlist_2Result get_EHVfeederlist_2Result) {
        this.get_EHVfeederlist_2Result = get_EHVfeederlist_2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_EHVfeederlist_2Response)) return false;
        Get_EHVfeederlist_2Response other = (Get_EHVfeederlist_2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_EHVfeederlist_2Result==null && other.getGet_EHVfeederlist_2Result()==null) || 
             (this.get_EHVfeederlist_2Result!=null &&
              this.get_EHVfeederlist_2Result.equals(other.getGet_EHVfeederlist_2Result())));
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
        if (getGet_EHVfeederlist_2Result() != null) {
            _hashCode += getGet_EHVfeederlist_2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_EHVfeederlist_2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederlist_2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_EHVfeederlist_2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVfeederlist_2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVfeederlist_2Response>Get_EHVfeederlist_2Result"));
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
