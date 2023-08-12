/**
 * Get_Cable_section_detail1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Cable_section_detail1Response  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Cable_section_detail1ResponseGet_Cable_section_detail1Result get_Cable_section_detail1Result;

    public Get_Cable_section_detail1Response() {
    }

    public Get_Cable_section_detail1Response(
           com.bses2.sap.ws.Get_Cable_section_detail1ResponseGet_Cable_section_detail1Result get_Cable_section_detail1Result) {
           this.get_Cable_section_detail1Result = get_Cable_section_detail1Result;
    }


    /**
     * Gets the get_Cable_section_detail1Result value for this Get_Cable_section_detail1Response.
     * 
     * @return get_Cable_section_detail1Result
     */
    public com.bses2.sap.ws.Get_Cable_section_detail1ResponseGet_Cable_section_detail1Result getGet_Cable_section_detail1Result() {
        return get_Cable_section_detail1Result;
    }


    /**
     * Sets the get_Cable_section_detail1Result value for this Get_Cable_section_detail1Response.
     * 
     * @param get_Cable_section_detail1Result
     */
    public void setGet_Cable_section_detail1Result(com.bses2.sap.ws.Get_Cable_section_detail1ResponseGet_Cable_section_detail1Result get_Cable_section_detail1Result) {
        this.get_Cable_section_detail1Result = get_Cable_section_detail1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Cable_section_detail1Response)) return false;
        Get_Cable_section_detail1Response other = (Get_Cable_section_detail1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Cable_section_detail1Result==null && other.getGet_Cable_section_detail1Result()==null) || 
             (this.get_Cable_section_detail1Result!=null &&
              this.get_Cable_section_detail1Result.equals(other.getGet_Cable_section_detail1Result())));
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
        if (getGet_Cable_section_detail1Result() != null) {
            _hashCode += getGet_Cable_section_detail1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Cable_section_detail1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_section_detail1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Cable_section_detail1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_section_detail1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_section_detail1Response>Get_Cable_section_detail1Result"));
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
