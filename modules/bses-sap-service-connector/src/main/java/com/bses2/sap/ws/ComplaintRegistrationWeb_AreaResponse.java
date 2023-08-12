/**
 * ComplaintRegistrationWeb_AreaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ComplaintRegistrationWeb_AreaResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult complaintRegistrationWeb_AreaResult;

    public ComplaintRegistrationWeb_AreaResponse() {
    }

    public ComplaintRegistrationWeb_AreaResponse(
           com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult complaintRegistrationWeb_AreaResult) {
           this.complaintRegistrationWeb_AreaResult = complaintRegistrationWeb_AreaResult;
    }


    /**
     * Gets the complaintRegistrationWeb_AreaResult value for this ComplaintRegistrationWeb_AreaResponse.
     * 
     * @return complaintRegistrationWeb_AreaResult
     */
    public com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult getComplaintRegistrationWeb_AreaResult() {
        return complaintRegistrationWeb_AreaResult;
    }


    /**
     * Sets the complaintRegistrationWeb_AreaResult value for this ComplaintRegistrationWeb_AreaResponse.
     * 
     * @param complaintRegistrationWeb_AreaResult
     */
    public void setComplaintRegistrationWeb_AreaResult(com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult complaintRegistrationWeb_AreaResult) {
        this.complaintRegistrationWeb_AreaResult = complaintRegistrationWeb_AreaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplaintRegistrationWeb_AreaResponse)) return false;
        ComplaintRegistrationWeb_AreaResponse other = (ComplaintRegistrationWeb_AreaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complaintRegistrationWeb_AreaResult==null && other.getComplaintRegistrationWeb_AreaResult()==null) || 
             (this.complaintRegistrationWeb_AreaResult!=null &&
              this.complaintRegistrationWeb_AreaResult.equals(other.getComplaintRegistrationWeb_AreaResult())));
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
        if (getComplaintRegistrationWeb_AreaResult() != null) {
            _hashCode += getComplaintRegistrationWeb_AreaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplaintRegistrationWeb_AreaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintRegistrationWeb_AreaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintRegistrationWeb_AreaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintRegistrationWeb_AreaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintRegistrationWeb_AreaResponse>ComplaintRegistrationWeb_AreaResult"));
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
