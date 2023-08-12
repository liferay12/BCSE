/**
 * Get_ConsumerLoadResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_ConsumerLoadResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_ConsumerLoadResponseGet_ConsumerLoadResult get_ConsumerLoadResult;

    public Get_ConsumerLoadResponse() {
    }

    public Get_ConsumerLoadResponse(
           com.bses2.sap.ws.Get_ConsumerLoadResponseGet_ConsumerLoadResult get_ConsumerLoadResult) {
           this.get_ConsumerLoadResult = get_ConsumerLoadResult;
    }


    /**
     * Gets the get_ConsumerLoadResult value for this Get_ConsumerLoadResponse.
     * 
     * @return get_ConsumerLoadResult
     */
    public com.bses2.sap.ws.Get_ConsumerLoadResponseGet_ConsumerLoadResult getGet_ConsumerLoadResult() {
        return get_ConsumerLoadResult;
    }


    /**
     * Sets the get_ConsumerLoadResult value for this Get_ConsumerLoadResponse.
     * 
     * @param get_ConsumerLoadResult
     */
    public void setGet_ConsumerLoadResult(com.bses2.sap.ws.Get_ConsumerLoadResponseGet_ConsumerLoadResult get_ConsumerLoadResult) {
        this.get_ConsumerLoadResult = get_ConsumerLoadResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_ConsumerLoadResponse)) return false;
        Get_ConsumerLoadResponse other = (Get_ConsumerLoadResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_ConsumerLoadResult==null && other.getGet_ConsumerLoadResult()==null) || 
             (this.get_ConsumerLoadResult!=null &&
              this.get_ConsumerLoadResult.equals(other.getGet_ConsumerLoadResult())));
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
        if (getGet_ConsumerLoadResult() != null) {
            _hashCode += getGet_ConsumerLoadResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_ConsumerLoadResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ConsumerLoadResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_ConsumerLoadResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ConsumerLoadResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ConsumerLoadResponse>Get_ConsumerLoadResult"));
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
