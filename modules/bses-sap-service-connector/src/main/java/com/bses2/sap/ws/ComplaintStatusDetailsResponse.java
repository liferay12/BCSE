/**
 * ComplaintStatusDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ComplaintStatusDetailsResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.ComplaintStatusDetailsResponseComplaintStatusDetailsResult complaintStatusDetailsResult;

    public ComplaintStatusDetailsResponse() {
    }

    public ComplaintStatusDetailsResponse(
           com.bses2.sap.ws.ComplaintStatusDetailsResponseComplaintStatusDetailsResult complaintStatusDetailsResult) {
           this.complaintStatusDetailsResult = complaintStatusDetailsResult;
    }


    /**
     * Gets the complaintStatusDetailsResult value for this ComplaintStatusDetailsResponse.
     * 
     * @return complaintStatusDetailsResult
     */
    public com.bses2.sap.ws.ComplaintStatusDetailsResponseComplaintStatusDetailsResult getComplaintStatusDetailsResult() {
        return complaintStatusDetailsResult;
    }


    /**
     * Sets the complaintStatusDetailsResult value for this ComplaintStatusDetailsResponse.
     * 
     * @param complaintStatusDetailsResult
     */
    public void setComplaintStatusDetailsResult(com.bses2.sap.ws.ComplaintStatusDetailsResponseComplaintStatusDetailsResult complaintStatusDetailsResult) {
        this.complaintStatusDetailsResult = complaintStatusDetailsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplaintStatusDetailsResponse)) return false;
        ComplaintStatusDetailsResponse other = (ComplaintStatusDetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complaintStatusDetailsResult==null && other.getComplaintStatusDetailsResult()==null) || 
             (this.complaintStatusDetailsResult!=null &&
              this.complaintStatusDetailsResult.equals(other.getComplaintStatusDetailsResult())));
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
        if (getComplaintStatusDetailsResult() != null) {
            _hashCode += getComplaintStatusDetailsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplaintStatusDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintStatusDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintStatusDetailsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintStatusDetailsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintStatusDetailsResponse>ComplaintStatusDetailsResult"));
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
