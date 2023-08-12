/**
 * ValidatepoleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ValidatepoleResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.ValidatepoleResponseValidatepoleResult validatepoleResult;

    public ValidatepoleResponse() {
    }

    public ValidatepoleResponse(
           com.bses2.sap.ws.ValidatepoleResponseValidatepoleResult validatepoleResult) {
           this.validatepoleResult = validatepoleResult;
    }


    /**
     * Gets the validatepoleResult value for this ValidatepoleResponse.
     * 
     * @return validatepoleResult
     */
    public com.bses2.sap.ws.ValidatepoleResponseValidatepoleResult getValidatepoleResult() {
        return validatepoleResult;
    }


    /**
     * Sets the validatepoleResult value for this ValidatepoleResponse.
     * 
     * @param validatepoleResult
     */
    public void setValidatepoleResult(com.bses2.sap.ws.ValidatepoleResponseValidatepoleResult validatepoleResult) {
        this.validatepoleResult = validatepoleResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidatepoleResponse)) return false;
        ValidatepoleResponse other = (ValidatepoleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validatepoleResult==null && other.getValidatepoleResult()==null) || 
             (this.validatepoleResult!=null &&
              this.validatepoleResult.equals(other.getValidatepoleResult())));
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
        if (getValidatepoleResult() != null) {
            _hashCode += getValidatepoleResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidatepoleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">validatepoleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validatepoleResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "validatepoleResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>validatepoleResponse>validatepoleResult"));
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
