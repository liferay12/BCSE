/**
 * RegisterChatbotComplaintResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class RegisterChatbotComplaintResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.RegisterChatbotComplaintResponseRegisterChatbotComplaintResult registerChatbotComplaintResult;

    public RegisterChatbotComplaintResponse() {
    }

    public RegisterChatbotComplaintResponse(
           com.bses2.sap.ws.RegisterChatbotComplaintResponseRegisterChatbotComplaintResult registerChatbotComplaintResult) {
           this.registerChatbotComplaintResult = registerChatbotComplaintResult;
    }


    /**
     * Gets the registerChatbotComplaintResult value for this RegisterChatbotComplaintResponse.
     * 
     * @return registerChatbotComplaintResult
     */
    public com.bses2.sap.ws.RegisterChatbotComplaintResponseRegisterChatbotComplaintResult getRegisterChatbotComplaintResult() {
        return registerChatbotComplaintResult;
    }


    /**
     * Sets the registerChatbotComplaintResult value for this RegisterChatbotComplaintResponse.
     * 
     * @param registerChatbotComplaintResult
     */
    public void setRegisterChatbotComplaintResult(com.bses2.sap.ws.RegisterChatbotComplaintResponseRegisterChatbotComplaintResult registerChatbotComplaintResult) {
        this.registerChatbotComplaintResult = registerChatbotComplaintResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterChatbotComplaintResponse)) return false;
        RegisterChatbotComplaintResponse other = (RegisterChatbotComplaintResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerChatbotComplaintResult==null && other.getRegisterChatbotComplaintResult()==null) || 
             (this.registerChatbotComplaintResult!=null &&
              this.registerChatbotComplaintResult.equals(other.getRegisterChatbotComplaintResult())));
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
        if (getRegisterChatbotComplaintResult() != null) {
            _hashCode += getRegisterChatbotComplaintResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterChatbotComplaintResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RegisterChatbotComplaintResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerChatbotComplaintResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegisterChatbotComplaintResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>RegisterChatbotComplaintResponse>RegisterChatbotComplaintResult"));
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
