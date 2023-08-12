/**
 * RegisterSmartAppComplaintResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class RegisterSmartAppComplaintResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.RegisterSmartAppComplaintResponseRegisterSmartAppComplaintResult registerSmartAppComplaintResult;

    public RegisterSmartAppComplaintResponse() {
    }

    public RegisterSmartAppComplaintResponse(
           com.bses2.sap.ws.RegisterSmartAppComplaintResponseRegisterSmartAppComplaintResult registerSmartAppComplaintResult) {
           this.registerSmartAppComplaintResult = registerSmartAppComplaintResult;
    }


    /**
     * Gets the registerSmartAppComplaintResult value for this RegisterSmartAppComplaintResponse.
     * 
     * @return registerSmartAppComplaintResult
     */
    public com.bses2.sap.ws.RegisterSmartAppComplaintResponseRegisterSmartAppComplaintResult getRegisterSmartAppComplaintResult() {
        return registerSmartAppComplaintResult;
    }


    /**
     * Sets the registerSmartAppComplaintResult value for this RegisterSmartAppComplaintResponse.
     * 
     * @param registerSmartAppComplaintResult
     */
    public void setRegisterSmartAppComplaintResult(com.bses2.sap.ws.RegisterSmartAppComplaintResponseRegisterSmartAppComplaintResult registerSmartAppComplaintResult) {
        this.registerSmartAppComplaintResult = registerSmartAppComplaintResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterSmartAppComplaintResponse)) return false;
        RegisterSmartAppComplaintResponse other = (RegisterSmartAppComplaintResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerSmartAppComplaintResult==null && other.getRegisterSmartAppComplaintResult()==null) || 
             (this.registerSmartAppComplaintResult!=null &&
              this.registerSmartAppComplaintResult.equals(other.getRegisterSmartAppComplaintResult())));
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
        if (getRegisterSmartAppComplaintResult() != null) {
            _hashCode += getRegisterSmartAppComplaintResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterSmartAppComplaintResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RegisterSmartAppComplaintResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerSmartAppComplaintResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegisterSmartAppComplaintResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>RegisterSmartAppComplaintResponse>RegisterSmartAppComplaintResult"));
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
