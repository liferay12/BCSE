/**
 * ComplaintRegistrationWebResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ComplaintRegistrationWebResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult complaintRegistrationWebResult;

    public ComplaintRegistrationWebResponse() {
    }

    public ComplaintRegistrationWebResponse(
           com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult complaintRegistrationWebResult) {
           this.complaintRegistrationWebResult = complaintRegistrationWebResult;
    }


    /**
     * Gets the complaintRegistrationWebResult value for this ComplaintRegistrationWebResponse.
     * 
     * @return complaintRegistrationWebResult
     */
    public com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult getComplaintRegistrationWebResult() {
        return complaintRegistrationWebResult;
    }


    /**
     * Sets the complaintRegistrationWebResult value for this ComplaintRegistrationWebResponse.
     * 
     * @param complaintRegistrationWebResult
     */
    public void setComplaintRegistrationWebResult(com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult complaintRegistrationWebResult) {
        this.complaintRegistrationWebResult = complaintRegistrationWebResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplaintRegistrationWebResponse)) return false;
        ComplaintRegistrationWebResponse other = (ComplaintRegistrationWebResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complaintRegistrationWebResult==null && other.getComplaintRegistrationWebResult()==null) || 
             (this.complaintRegistrationWebResult!=null &&
              this.complaintRegistrationWebResult.equals(other.getComplaintRegistrationWebResult())));
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
        if (getComplaintRegistrationWebResult() != null) {
            _hashCode += getComplaintRegistrationWebResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplaintRegistrationWebResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintRegistrationWebResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintRegistrationWebResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintRegistrationWebResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintRegistrationWebResponse>ComplaintRegistrationWebResult"));
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
