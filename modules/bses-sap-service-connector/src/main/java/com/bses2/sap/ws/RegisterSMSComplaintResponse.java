/**
 * RegisterSMSComplaintResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class RegisterSMSComplaintResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.RegisterSMSComplaintResponseRegisterSMSComplaintResult registerSMSComplaintResult;

    public RegisterSMSComplaintResponse() {
    }

    public RegisterSMSComplaintResponse(
           com.bses2.sap.ws.RegisterSMSComplaintResponseRegisterSMSComplaintResult registerSMSComplaintResult) {
           this.registerSMSComplaintResult = registerSMSComplaintResult;
    }


    /**
     * Gets the registerSMSComplaintResult value for this RegisterSMSComplaintResponse.
     * 
     * @return registerSMSComplaintResult
     */
    public com.bses2.sap.ws.RegisterSMSComplaintResponseRegisterSMSComplaintResult getRegisterSMSComplaintResult() {
        return registerSMSComplaintResult;
    }


    /**
     * Sets the registerSMSComplaintResult value for this RegisterSMSComplaintResponse.
     * 
     * @param registerSMSComplaintResult
     */
    public void setRegisterSMSComplaintResult(com.bses2.sap.ws.RegisterSMSComplaintResponseRegisterSMSComplaintResult registerSMSComplaintResult) {
        this.registerSMSComplaintResult = registerSMSComplaintResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterSMSComplaintResponse)) return false;
        RegisterSMSComplaintResponse other = (RegisterSMSComplaintResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.registerSMSComplaintResult==null && other.getRegisterSMSComplaintResult()==null) || 
             (this.registerSMSComplaintResult!=null &&
              this.registerSMSComplaintResult.equals(other.getRegisterSMSComplaintResult())));
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
        if (getRegisterSMSComplaintResult() != null) {
            _hashCode += getRegisterSMSComplaintResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterSMSComplaintResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RegisterSMSComplaintResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerSMSComplaintResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegisterSMSComplaintResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>RegisterSMSComplaintResponse>RegisterSMSComplaintResult"));
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
