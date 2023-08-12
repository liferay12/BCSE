/**
 * Get_Poles_From_DTsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Poles_From_DTsResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Poles_From_DTsResponseGet_Poles_From_DTsResult get_Poles_From_DTsResult;

    public Get_Poles_From_DTsResponse() {
    }

    public Get_Poles_From_DTsResponse(
           com.bses2.sap.ws.Get_Poles_From_DTsResponseGet_Poles_From_DTsResult get_Poles_From_DTsResult) {
           this.get_Poles_From_DTsResult = get_Poles_From_DTsResult;
    }


    /**
     * Gets the get_Poles_From_DTsResult value for this Get_Poles_From_DTsResponse.
     * 
     * @return get_Poles_From_DTsResult
     */
    public com.bses2.sap.ws.Get_Poles_From_DTsResponseGet_Poles_From_DTsResult getGet_Poles_From_DTsResult() {
        return get_Poles_From_DTsResult;
    }


    /**
     * Sets the get_Poles_From_DTsResult value for this Get_Poles_From_DTsResponse.
     * 
     * @param get_Poles_From_DTsResult
     */
    public void setGet_Poles_From_DTsResult(com.bses2.sap.ws.Get_Poles_From_DTsResponseGet_Poles_From_DTsResult get_Poles_From_DTsResult) {
        this.get_Poles_From_DTsResult = get_Poles_From_DTsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Poles_From_DTsResponse)) return false;
        Get_Poles_From_DTsResponse other = (Get_Poles_From_DTsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Poles_From_DTsResult==null && other.getGet_Poles_From_DTsResult()==null) || 
             (this.get_Poles_From_DTsResult!=null &&
              this.get_Poles_From_DTsResult.equals(other.getGet_Poles_From_DTsResult())));
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
        if (getGet_Poles_From_DTsResult() != null) {
            _hashCode += getGet_Poles_From_DTsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Poles_From_DTsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Poles_From_DTsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Poles_From_DTsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Poles_From_DTsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Poles_From_DTsResponse>Get_Poles_From_DTsResult"));
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
