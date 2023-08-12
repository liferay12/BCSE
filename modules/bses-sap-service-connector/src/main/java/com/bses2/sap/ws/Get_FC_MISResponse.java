/**
 * Get_FC_MISResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_FC_MISResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_FC_MISResponseGet_FC_MISResult get_FC_MISResult;

    public Get_FC_MISResponse() {
    }

    public Get_FC_MISResponse(
           com.bses2.sap.ws.Get_FC_MISResponseGet_FC_MISResult get_FC_MISResult) {
           this.get_FC_MISResult = get_FC_MISResult;
    }


    /**
     * Gets the get_FC_MISResult value for this Get_FC_MISResponse.
     * 
     * @return get_FC_MISResult
     */
    public com.bses2.sap.ws.Get_FC_MISResponseGet_FC_MISResult getGet_FC_MISResult() {
        return get_FC_MISResult;
    }


    /**
     * Sets the get_FC_MISResult value for this Get_FC_MISResponse.
     * 
     * @param get_FC_MISResult
     */
    public void setGet_FC_MISResult(com.bses2.sap.ws.Get_FC_MISResponseGet_FC_MISResult get_FC_MISResult) {
        this.get_FC_MISResult = get_FC_MISResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_FC_MISResponse)) return false;
        Get_FC_MISResponse other = (Get_FC_MISResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_FC_MISResult==null && other.getGet_FC_MISResult()==null) || 
             (this.get_FC_MISResult!=null &&
              this.get_FC_MISResult.equals(other.getGet_FC_MISResult())));
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
        if (getGet_FC_MISResult() != null) {
            _hashCode += getGet_FC_MISResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_FC_MISResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">get_FC_MISResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_FC_MISResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "get_FC_MISResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>get_FC_MISResponse>get_FC_MISResult"));
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
