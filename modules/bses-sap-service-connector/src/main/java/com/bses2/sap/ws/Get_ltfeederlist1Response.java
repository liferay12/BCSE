/**
 * Get_ltfeederlist1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_ltfeederlist1Response  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_ltfeederlist1ResponseGet_ltfeederlist1Result get_ltfeederlist1Result;

    public Get_ltfeederlist1Response() {
    }

    public Get_ltfeederlist1Response(
           com.bses2.sap.ws.Get_ltfeederlist1ResponseGet_ltfeederlist1Result get_ltfeederlist1Result) {
           this.get_ltfeederlist1Result = get_ltfeederlist1Result;
    }


    /**
     * Gets the get_ltfeederlist1Result value for this Get_ltfeederlist1Response.
     * 
     * @return get_ltfeederlist1Result
     */
    public com.bses2.sap.ws.Get_ltfeederlist1ResponseGet_ltfeederlist1Result getGet_ltfeederlist1Result() {
        return get_ltfeederlist1Result;
    }


    /**
     * Sets the get_ltfeederlist1Result value for this Get_ltfeederlist1Response.
     * 
     * @param get_ltfeederlist1Result
     */
    public void setGet_ltfeederlist1Result(com.bses2.sap.ws.Get_ltfeederlist1ResponseGet_ltfeederlist1Result get_ltfeederlist1Result) {
        this.get_ltfeederlist1Result = get_ltfeederlist1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_ltfeederlist1Response)) return false;
        Get_ltfeederlist1Response other = (Get_ltfeederlist1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_ltfeederlist1Result==null && other.getGet_ltfeederlist1Result()==null) || 
             (this.get_ltfeederlist1Result!=null &&
              this.get_ltfeederlist1Result.equals(other.getGet_ltfeederlist1Result())));
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
        if (getGet_ltfeederlist1Result() != null) {
            _hashCode += getGet_ltfeederlist1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_ltfeederlist1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ltfeederlist1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_ltfeederlist1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ltfeederlist1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ltfeederlist1Response>Get_ltfeederlist1Result"));
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
