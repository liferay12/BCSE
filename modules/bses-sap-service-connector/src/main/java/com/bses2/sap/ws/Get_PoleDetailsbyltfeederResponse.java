/**
 * Get_PoleDetailsbyltfeederResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_PoleDetailsbyltfeederResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponseGet_PoleDetailsbyltfeederResult get_PoleDetailsbyltfeederResult;

    public Get_PoleDetailsbyltfeederResponse() {
    }

    public Get_PoleDetailsbyltfeederResponse(
           com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponseGet_PoleDetailsbyltfeederResult get_PoleDetailsbyltfeederResult) {
           this.get_PoleDetailsbyltfeederResult = get_PoleDetailsbyltfeederResult;
    }


    /**
     * Gets the get_PoleDetailsbyltfeederResult value for this Get_PoleDetailsbyltfeederResponse.
     * 
     * @return get_PoleDetailsbyltfeederResult
     */
    public com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponseGet_PoleDetailsbyltfeederResult getGet_PoleDetailsbyltfeederResult() {
        return get_PoleDetailsbyltfeederResult;
    }


    /**
     * Sets the get_PoleDetailsbyltfeederResult value for this Get_PoleDetailsbyltfeederResponse.
     * 
     * @param get_PoleDetailsbyltfeederResult
     */
    public void setGet_PoleDetailsbyltfeederResult(com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponseGet_PoleDetailsbyltfeederResult get_PoleDetailsbyltfeederResult) {
        this.get_PoleDetailsbyltfeederResult = get_PoleDetailsbyltfeederResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_PoleDetailsbyltfeederResponse)) return false;
        Get_PoleDetailsbyltfeederResponse other = (Get_PoleDetailsbyltfeederResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_PoleDetailsbyltfeederResult==null && other.getGet_PoleDetailsbyltfeederResult()==null) || 
             (this.get_PoleDetailsbyltfeederResult!=null &&
              this.get_PoleDetailsbyltfeederResult.equals(other.getGet_PoleDetailsbyltfeederResult())));
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
        if (getGet_PoleDetailsbyltfeederResult() != null) {
            _hashCode += getGet_PoleDetailsbyltfeederResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_PoleDetailsbyltfeederResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_PoleDetailsbyltfeederResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_PoleDetailsbyltfeederResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_PoleDetailsbyltfeederResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_PoleDetailsbyltfeederResponse>Get_PoleDetailsbyltfeederResult"));
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
