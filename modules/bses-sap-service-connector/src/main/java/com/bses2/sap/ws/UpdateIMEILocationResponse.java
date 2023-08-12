/**
 * UpdateIMEILocationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class UpdateIMEILocationResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.UpdateIMEILocationResponseUpdateIMEILocationResult updateIMEILocationResult;

    public UpdateIMEILocationResponse() {
    }

    public UpdateIMEILocationResponse(
           com.bses2.sap.ws.UpdateIMEILocationResponseUpdateIMEILocationResult updateIMEILocationResult) {
           this.updateIMEILocationResult = updateIMEILocationResult;
    }


    /**
     * Gets the updateIMEILocationResult value for this UpdateIMEILocationResponse.
     * 
     * @return updateIMEILocationResult
     */
    public com.bses2.sap.ws.UpdateIMEILocationResponseUpdateIMEILocationResult getUpdateIMEILocationResult() {
        return updateIMEILocationResult;
    }


    /**
     * Sets the updateIMEILocationResult value for this UpdateIMEILocationResponse.
     * 
     * @param updateIMEILocationResult
     */
    public void setUpdateIMEILocationResult(com.bses2.sap.ws.UpdateIMEILocationResponseUpdateIMEILocationResult updateIMEILocationResult) {
        this.updateIMEILocationResult = updateIMEILocationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateIMEILocationResponse)) return false;
        UpdateIMEILocationResponse other = (UpdateIMEILocationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateIMEILocationResult==null && other.getUpdateIMEILocationResult()==null) || 
             (this.updateIMEILocationResult!=null &&
              this.updateIMEILocationResult.equals(other.getUpdateIMEILocationResult())));
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
        if (getUpdateIMEILocationResult() != null) {
            _hashCode += getUpdateIMEILocationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateIMEILocationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateIMEILocationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateIMEILocationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateIMEILocationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>UpdateIMEILocationResponse>UpdateIMEILocationResult"));
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
