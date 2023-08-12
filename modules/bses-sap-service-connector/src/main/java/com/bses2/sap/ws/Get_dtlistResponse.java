/**
 * Get_dtlistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_dtlistResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_dtlistResponseGet_dtlistResult get_dtlistResult;

    public Get_dtlistResponse() {
    }

    public Get_dtlistResponse(
           com.bses2.sap.ws.Get_dtlistResponseGet_dtlistResult get_dtlistResult) {
           this.get_dtlistResult = get_dtlistResult;
    }


    /**
     * Gets the get_dtlistResult value for this Get_dtlistResponse.
     * 
     * @return get_dtlistResult
     */
    public com.bses2.sap.ws.Get_dtlistResponseGet_dtlistResult getGet_dtlistResult() {
        return get_dtlistResult;
    }


    /**
     * Sets the get_dtlistResult value for this Get_dtlistResponse.
     * 
     * @param get_dtlistResult
     */
    public void setGet_dtlistResult(com.bses2.sap.ws.Get_dtlistResponseGet_dtlistResult get_dtlistResult) {
        this.get_dtlistResult = get_dtlistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_dtlistResponse)) return false;
        Get_dtlistResponse other = (Get_dtlistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_dtlistResult==null && other.getGet_dtlistResult()==null) || 
             (this.get_dtlistResult!=null &&
              this.get_dtlistResult.equals(other.getGet_dtlistResult())));
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
        if (getGet_dtlistResult() != null) {
            _hashCode += getGet_dtlistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_dtlistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_dtlistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_dtlistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_dtlistResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_dtlistResponse>Get_dtlistResult"));
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
