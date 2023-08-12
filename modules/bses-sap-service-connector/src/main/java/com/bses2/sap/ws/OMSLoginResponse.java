/**
 * OMSLoginResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class OMSLoginResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.OMSLoginResponseOMSLoginResult OMSLoginResult;

    public OMSLoginResponse() {
    }

    public OMSLoginResponse(
           com.bses2.sap.ws.OMSLoginResponseOMSLoginResult OMSLoginResult) {
           this.OMSLoginResult = OMSLoginResult;
    }


    /**
     * Gets the OMSLoginResult value for this OMSLoginResponse.
     * 
     * @return OMSLoginResult
     */
    public com.bses2.sap.ws.OMSLoginResponseOMSLoginResult getOMSLoginResult() {
        return OMSLoginResult;
    }


    /**
     * Sets the OMSLoginResult value for this OMSLoginResponse.
     * 
     * @param OMSLoginResult
     */
    public void setOMSLoginResult(com.bses2.sap.ws.OMSLoginResponseOMSLoginResult OMSLoginResult) {
        this.OMSLoginResult = OMSLoginResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OMSLoginResponse)) return false;
        OMSLoginResponse other = (OMSLoginResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OMSLoginResult==null && other.getOMSLoginResult()==null) || 
             (this.OMSLoginResult!=null &&
              this.OMSLoginResult.equals(other.getOMSLoginResult())));
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
        if (getOMSLoginResult() != null) {
            _hashCode += getOMSLoginResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OMSLoginResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">OMSLoginResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OMSLoginResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OMSLoginResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>OMSLoginResponse>OMSLoginResult"));
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
