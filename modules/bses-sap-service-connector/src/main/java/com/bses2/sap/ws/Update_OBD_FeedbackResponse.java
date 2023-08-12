/**
 * Update_OBD_FeedbackResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Update_OBD_FeedbackResponse  implements java.io.Serializable {
    private java.lang.String update_OBD_FeedbackResult;

    public Update_OBD_FeedbackResponse() {
    }

    public Update_OBD_FeedbackResponse(
           java.lang.String update_OBD_FeedbackResult) {
           this.update_OBD_FeedbackResult = update_OBD_FeedbackResult;
    }


    /**
     * Gets the update_OBD_FeedbackResult value for this Update_OBD_FeedbackResponse.
     * 
     * @return update_OBD_FeedbackResult
     */
    public java.lang.String getUpdate_OBD_FeedbackResult() {
        return update_OBD_FeedbackResult;
    }


    /**
     * Sets the update_OBD_FeedbackResult value for this Update_OBD_FeedbackResponse.
     * 
     * @param update_OBD_FeedbackResult
     */
    public void setUpdate_OBD_FeedbackResult(java.lang.String update_OBD_FeedbackResult) {
        this.update_OBD_FeedbackResult = update_OBD_FeedbackResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Update_OBD_FeedbackResponse)) return false;
        Update_OBD_FeedbackResponse other = (Update_OBD_FeedbackResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.update_OBD_FeedbackResult==null && other.getUpdate_OBD_FeedbackResult()==null) || 
             (this.update_OBD_FeedbackResult!=null &&
              this.update_OBD_FeedbackResult.equals(other.getUpdate_OBD_FeedbackResult())));
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
        if (getUpdate_OBD_FeedbackResult() != null) {
            _hashCode += getUpdate_OBD_FeedbackResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Update_OBD_FeedbackResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Update_OBD_FeedbackResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_OBD_FeedbackResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Update_OBD_FeedbackResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
