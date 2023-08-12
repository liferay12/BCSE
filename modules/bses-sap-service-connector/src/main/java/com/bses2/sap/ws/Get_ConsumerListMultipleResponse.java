/**
 * Get_ConsumerListMultipleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_ConsumerListMultipleResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_ConsumerListMultipleResponseGet_ConsumerListMultipleResult get_ConsumerListMultipleResult;

    public Get_ConsumerListMultipleResponse() {
    }

    public Get_ConsumerListMultipleResponse(
           com.bses2.sap.ws.Get_ConsumerListMultipleResponseGet_ConsumerListMultipleResult get_ConsumerListMultipleResult) {
           this.get_ConsumerListMultipleResult = get_ConsumerListMultipleResult;
    }


    /**
     * Gets the get_ConsumerListMultipleResult value for this Get_ConsumerListMultipleResponse.
     * 
     * @return get_ConsumerListMultipleResult
     */
    public com.bses2.sap.ws.Get_ConsumerListMultipleResponseGet_ConsumerListMultipleResult getGet_ConsumerListMultipleResult() {
        return get_ConsumerListMultipleResult;
    }


    /**
     * Sets the get_ConsumerListMultipleResult value for this Get_ConsumerListMultipleResponse.
     * 
     * @param get_ConsumerListMultipleResult
     */
    public void setGet_ConsumerListMultipleResult(com.bses2.sap.ws.Get_ConsumerListMultipleResponseGet_ConsumerListMultipleResult get_ConsumerListMultipleResult) {
        this.get_ConsumerListMultipleResult = get_ConsumerListMultipleResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_ConsumerListMultipleResponse)) return false;
        Get_ConsumerListMultipleResponse other = (Get_ConsumerListMultipleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_ConsumerListMultipleResult==null && other.getGet_ConsumerListMultipleResult()==null) || 
             (this.get_ConsumerListMultipleResult!=null &&
              this.get_ConsumerListMultipleResult.equals(other.getGet_ConsumerListMultipleResult())));
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
        if (getGet_ConsumerListMultipleResult() != null) {
            _hashCode += getGet_ConsumerListMultipleResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_ConsumerListMultipleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ConsumerListMultipleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_ConsumerListMultipleResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ConsumerListMultipleResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ConsumerListMultipleResponse>Get_ConsumerListMultipleResult"));
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
