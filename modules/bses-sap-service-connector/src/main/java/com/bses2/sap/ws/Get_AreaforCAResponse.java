/**
 * Get_AreaforCAResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_AreaforCAResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_AreaforCAResponseGet_AreaforCAResult get_AreaforCAResult;

    public Get_AreaforCAResponse() {
    }

    public Get_AreaforCAResponse(
           com.bses2.sap.ws.Get_AreaforCAResponseGet_AreaforCAResult get_AreaforCAResult) {
           this.get_AreaforCAResult = get_AreaforCAResult;
    }


    /**
     * Gets the get_AreaforCAResult value for this Get_AreaforCAResponse.
     * 
     * @return get_AreaforCAResult
     */
    public com.bses2.sap.ws.Get_AreaforCAResponseGet_AreaforCAResult getGet_AreaforCAResult() {
        return get_AreaforCAResult;
    }


    /**
     * Sets the get_AreaforCAResult value for this Get_AreaforCAResponse.
     * 
     * @param get_AreaforCAResult
     */
    public void setGet_AreaforCAResult(com.bses2.sap.ws.Get_AreaforCAResponseGet_AreaforCAResult get_AreaforCAResult) {
        this.get_AreaforCAResult = get_AreaforCAResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_AreaforCAResponse)) return false;
        Get_AreaforCAResponse other = (Get_AreaforCAResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_AreaforCAResult==null && other.getGet_AreaforCAResult()==null) || 
             (this.get_AreaforCAResult!=null &&
              this.get_AreaforCAResult.equals(other.getGet_AreaforCAResult())));
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
        if (getGet_AreaforCAResult() != null) {
            _hashCode += getGet_AreaforCAResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_AreaforCAResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_AreaforCAResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_AreaforCAResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_AreaforCAResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_AreaforCAResponse>Get_AreaforCAResult"));
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
