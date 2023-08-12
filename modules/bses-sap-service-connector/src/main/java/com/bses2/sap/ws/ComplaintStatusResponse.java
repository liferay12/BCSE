/**
 * ComplaintStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ComplaintStatusResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult complaintStatusResult;

    public ComplaintStatusResponse() {
    }

    public ComplaintStatusResponse(
           com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult complaintStatusResult) {
           this.complaintStatusResult = complaintStatusResult;
    }


    /**
     * Gets the complaintStatusResult value for this ComplaintStatusResponse.
     * 
     * @return complaintStatusResult
     */
    public com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult getComplaintStatusResult() {
        return complaintStatusResult;
    }


    /**
     * Sets the complaintStatusResult value for this ComplaintStatusResponse.
     * 
     * @param complaintStatusResult
     */
    public void setComplaintStatusResult(com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult complaintStatusResult) {
        this.complaintStatusResult = complaintStatusResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplaintStatusResponse)) return false;
        ComplaintStatusResponse other = (ComplaintStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complaintStatusResult==null && other.getComplaintStatusResult()==null) || 
             (this.complaintStatusResult!=null &&
              this.complaintStatusResult.equals(other.getComplaintStatusResult())));
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
        if (getComplaintStatusResult() != null) {
            _hashCode += getComplaintStatusResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplaintStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintStatusResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintStatusResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintStatusResponse>ComplaintStatusResult"));
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
