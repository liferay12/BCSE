/**
 * Get_PolelistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_PolelistResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_PolelistResponseGet_PolelistResult get_PolelistResult;

    public Get_PolelistResponse() {
    }

    public Get_PolelistResponse(
           com.bses2.sap.ws.Get_PolelistResponseGet_PolelistResult get_PolelistResult) {
           this.get_PolelistResult = get_PolelistResult;
    }


    /**
     * Gets the get_PolelistResult value for this Get_PolelistResponse.
     * 
     * @return get_PolelistResult
     */
    public com.bses2.sap.ws.Get_PolelistResponseGet_PolelistResult getGet_PolelistResult() {
        return get_PolelistResult;
    }


    /**
     * Sets the get_PolelistResult value for this Get_PolelistResponse.
     * 
     * @param get_PolelistResult
     */
    public void setGet_PolelistResult(com.bses2.sap.ws.Get_PolelistResponseGet_PolelistResult get_PolelistResult) {
        this.get_PolelistResult = get_PolelistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_PolelistResponse)) return false;
        Get_PolelistResponse other = (Get_PolelistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_PolelistResult==null && other.getGet_PolelistResult()==null) || 
             (this.get_PolelistResult!=null &&
              this.get_PolelistResult.equals(other.getGet_PolelistResult())));
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
        if (getGet_PolelistResult() != null) {
            _hashCode += getGet_PolelistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_PolelistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_PolelistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_PolelistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_PolelistResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_PolelistResponse>Get_PolelistResult"));
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
