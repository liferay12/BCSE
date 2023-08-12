/**
 * ComplaintStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ComplaintStatus  implements java.io.Serializable {
    private java.lang.String complaintNoOR_CANo;

    public ComplaintStatus() {
    }

    public ComplaintStatus(
           java.lang.String complaintNoOR_CANo) {
           this.complaintNoOR_CANo = complaintNoOR_CANo;
    }


    /**
     * Gets the complaintNoOR_CANo value for this ComplaintStatus.
     * 
     * @return complaintNoOR_CANo
     */
    public java.lang.String getComplaintNoOR_CANo() {
        return complaintNoOR_CANo;
    }


    /**
     * Sets the complaintNoOR_CANo value for this ComplaintStatus.
     * 
     * @param complaintNoOR_CANo
     */
    public void setComplaintNoOR_CANo(java.lang.String complaintNoOR_CANo) {
        this.complaintNoOR_CANo = complaintNoOR_CANo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplaintStatus)) return false;
        ComplaintStatus other = (ComplaintStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complaintNoOR_CANo==null && other.getComplaintNoOR_CANo()==null) || 
             (this.complaintNoOR_CANo!=null &&
              this.complaintNoOR_CANo.equals(other.getComplaintNoOR_CANo())));
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
        if (getComplaintNoOR_CANo() != null) {
            _hashCode += getComplaintNoOR_CANo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplaintStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNoOR_CANo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintNoOR_CANo"));
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
