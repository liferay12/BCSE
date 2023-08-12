/**
 * Get_Cable_sectionlt1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Cable_sectionlt1Response  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Cable_sectionlt1ResponseGet_Cable_sectionlt1Result get_Cable_sectionlt1Result;

    public Get_Cable_sectionlt1Response() {
    }

    public Get_Cable_sectionlt1Response(
           com.bses2.sap.ws.Get_Cable_sectionlt1ResponseGet_Cable_sectionlt1Result get_Cable_sectionlt1Result) {
           this.get_Cable_sectionlt1Result = get_Cable_sectionlt1Result;
    }


    /**
     * Gets the get_Cable_sectionlt1Result value for this Get_Cable_sectionlt1Response.
     * 
     * @return get_Cable_sectionlt1Result
     */
    public com.bses2.sap.ws.Get_Cable_sectionlt1ResponseGet_Cable_sectionlt1Result getGet_Cable_sectionlt1Result() {
        return get_Cable_sectionlt1Result;
    }


    /**
     * Sets the get_Cable_sectionlt1Result value for this Get_Cable_sectionlt1Response.
     * 
     * @param get_Cable_sectionlt1Result
     */
    public void setGet_Cable_sectionlt1Result(com.bses2.sap.ws.Get_Cable_sectionlt1ResponseGet_Cable_sectionlt1Result get_Cable_sectionlt1Result) {
        this.get_Cable_sectionlt1Result = get_Cable_sectionlt1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Cable_sectionlt1Response)) return false;
        Get_Cable_sectionlt1Response other = (Get_Cable_sectionlt1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Cable_sectionlt1Result==null && other.getGet_Cable_sectionlt1Result()==null) || 
             (this.get_Cable_sectionlt1Result!=null &&
              this.get_Cable_sectionlt1Result.equals(other.getGet_Cable_sectionlt1Result())));
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
        if (getGet_Cable_sectionlt1Result() != null) {
            _hashCode += getGet_Cable_sectionlt1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Cable_sectionlt1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_sectionlt1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Cable_sectionlt1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_sectionlt1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_sectionlt1Response>Get_Cable_sectionlt1Result"));
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
