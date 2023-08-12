/**
 * MarkComplaintReadResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class MarkComplaintReadResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.MarkComplaintReadResponseMarkComplaintReadResult markComplaintReadResult;

    public MarkComplaintReadResponse() {
    }

    public MarkComplaintReadResponse(
           com.bses2.sap.ws.MarkComplaintReadResponseMarkComplaintReadResult markComplaintReadResult) {
           this.markComplaintReadResult = markComplaintReadResult;
    }


    /**
     * Gets the markComplaintReadResult value for this MarkComplaintReadResponse.
     * 
     * @return markComplaintReadResult
     */
    public com.bses2.sap.ws.MarkComplaintReadResponseMarkComplaintReadResult getMarkComplaintReadResult() {
        return markComplaintReadResult;
    }


    /**
     * Sets the markComplaintReadResult value for this MarkComplaintReadResponse.
     * 
     * @param markComplaintReadResult
     */
    public void setMarkComplaintReadResult(com.bses2.sap.ws.MarkComplaintReadResponseMarkComplaintReadResult markComplaintReadResult) {
        this.markComplaintReadResult = markComplaintReadResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MarkComplaintReadResponse)) return false;
        MarkComplaintReadResponse other = (MarkComplaintReadResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.markComplaintReadResult==null && other.getMarkComplaintReadResult()==null) || 
             (this.markComplaintReadResult!=null &&
              this.markComplaintReadResult.equals(other.getMarkComplaintReadResult())));
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
        if (getMarkComplaintReadResult() != null) {
            _hashCode += getMarkComplaintReadResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MarkComplaintReadResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">MarkComplaintReadResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markComplaintReadResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MarkComplaintReadResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>MarkComplaintReadResponse>MarkComplaintReadResult"));
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
