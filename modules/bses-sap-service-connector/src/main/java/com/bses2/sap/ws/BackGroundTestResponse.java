/**
 * BackGroundTestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class BackGroundTestResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.BackGroundTestResponseBackGroundTestResult backGroundTestResult;

    public BackGroundTestResponse() {
    }

    public BackGroundTestResponse(
           com.bses2.sap.ws.BackGroundTestResponseBackGroundTestResult backGroundTestResult) {
           this.backGroundTestResult = backGroundTestResult;
    }


    /**
     * Gets the backGroundTestResult value for this BackGroundTestResponse.
     * 
     * @return backGroundTestResult
     */
    public com.bses2.sap.ws.BackGroundTestResponseBackGroundTestResult getBackGroundTestResult() {
        return backGroundTestResult;
    }


    /**
     * Sets the backGroundTestResult value for this BackGroundTestResponse.
     * 
     * @param backGroundTestResult
     */
    public void setBackGroundTestResult(com.bses2.sap.ws.BackGroundTestResponseBackGroundTestResult backGroundTestResult) {
        this.backGroundTestResult = backGroundTestResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BackGroundTestResponse)) return false;
        BackGroundTestResponse other = (BackGroundTestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.backGroundTestResult==null && other.getBackGroundTestResult()==null) || 
             (this.backGroundTestResult!=null &&
              this.backGroundTestResult.equals(other.getBackGroundTestResult())));
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
        if (getBackGroundTestResult() != null) {
            _hashCode += getBackGroundTestResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BackGroundTestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BackGroundTestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backGroundTestResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BackGroundTestResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>BackGroundTestResponse>BackGroundTestResult"));
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
