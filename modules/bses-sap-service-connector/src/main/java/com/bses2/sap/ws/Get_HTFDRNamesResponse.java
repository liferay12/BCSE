/**
 * Get_HTFDRNamesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_HTFDRNamesResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_HTFDRNamesResponseGet_HTFDRNamesResult get_HTFDRNamesResult;

    public Get_HTFDRNamesResponse() {
    }

    public Get_HTFDRNamesResponse(
           com.bses2.sap.ws.Get_HTFDRNamesResponseGet_HTFDRNamesResult get_HTFDRNamesResult) {
           this.get_HTFDRNamesResult = get_HTFDRNamesResult;
    }


    /**
     * Gets the get_HTFDRNamesResult value for this Get_HTFDRNamesResponse.
     * 
     * @return get_HTFDRNamesResult
     */
    public com.bses2.sap.ws.Get_HTFDRNamesResponseGet_HTFDRNamesResult getGet_HTFDRNamesResult() {
        return get_HTFDRNamesResult;
    }


    /**
     * Sets the get_HTFDRNamesResult value for this Get_HTFDRNamesResponse.
     * 
     * @param get_HTFDRNamesResult
     */
    public void setGet_HTFDRNamesResult(com.bses2.sap.ws.Get_HTFDRNamesResponseGet_HTFDRNamesResult get_HTFDRNamesResult) {
        this.get_HTFDRNamesResult = get_HTFDRNamesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_HTFDRNamesResponse)) return false;
        Get_HTFDRNamesResponse other = (Get_HTFDRNamesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_HTFDRNamesResult==null && other.getGet_HTFDRNamesResult()==null) || 
             (this.get_HTFDRNamesResult!=null &&
              this.get_HTFDRNamesResult.equals(other.getGet_HTFDRNamesResult())));
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
        if (getGet_HTFDRNamesResult() != null) {
            _hashCode += getGet_HTFDRNamesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_HTFDRNamesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HTFDRNamesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_HTFDRNamesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HTFDRNamesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HTFDRNamesResponse>Get_HTFDRNamesResult"));
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
