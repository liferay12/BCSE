/**
 * UpdateBD_AndroidResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class UpdateBD_AndroidResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.UpdateBD_AndroidResponseUpdateBD_AndroidResult updateBD_AndroidResult;

    public UpdateBD_AndroidResponse() {
    }

    public UpdateBD_AndroidResponse(
           com.bses2.sap.ws.UpdateBD_AndroidResponseUpdateBD_AndroidResult updateBD_AndroidResult) {
           this.updateBD_AndroidResult = updateBD_AndroidResult;
    }


    /**
     * Gets the updateBD_AndroidResult value for this UpdateBD_AndroidResponse.
     * 
     * @return updateBD_AndroidResult
     */
    public com.bses2.sap.ws.UpdateBD_AndroidResponseUpdateBD_AndroidResult getUpdateBD_AndroidResult() {
        return updateBD_AndroidResult;
    }


    /**
     * Sets the updateBD_AndroidResult value for this UpdateBD_AndroidResponse.
     * 
     * @param updateBD_AndroidResult
     */
    public void setUpdateBD_AndroidResult(com.bses2.sap.ws.UpdateBD_AndroidResponseUpdateBD_AndroidResult updateBD_AndroidResult) {
        this.updateBD_AndroidResult = updateBD_AndroidResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBD_AndroidResponse)) return false;
        UpdateBD_AndroidResponse other = (UpdateBD_AndroidResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateBD_AndroidResult==null && other.getUpdateBD_AndroidResult()==null) || 
             (this.updateBD_AndroidResult!=null &&
              this.updateBD_AndroidResult.equals(other.getUpdateBD_AndroidResult())));
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
        if (getUpdateBD_AndroidResult() != null) {
            _hashCode += getUpdateBD_AndroidResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateBD_AndroidResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">updateBD_AndroidResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateBD_AndroidResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "updateBD_AndroidResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>updateBD_AndroidResponse>updateBD_AndroidResult"));
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
