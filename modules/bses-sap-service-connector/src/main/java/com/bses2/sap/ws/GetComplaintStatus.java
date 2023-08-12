/**
 * GetComplaintStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetComplaintStatus  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String complaintNo;

    private java.lang.String imeiNo;

    public GetComplaintStatus() {
    }

    public GetComplaintStatus(
           java.lang.String key,
           java.lang.String complaintNo,
           java.lang.String imeiNo) {
           this.key = key;
           this.complaintNo = complaintNo;
           this.imeiNo = imeiNo;
    }


    /**
     * Gets the key value for this GetComplaintStatus.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this GetComplaintStatus.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the complaintNo value for this GetComplaintStatus.
     * 
     * @return complaintNo
     */
    public java.lang.String getComplaintNo() {
        return complaintNo;
    }


    /**
     * Sets the complaintNo value for this GetComplaintStatus.
     * 
     * @param complaintNo
     */
    public void setComplaintNo(java.lang.String complaintNo) {
        this.complaintNo = complaintNo;
    }


    /**
     * Gets the imeiNo value for this GetComplaintStatus.
     * 
     * @return imeiNo
     */
    public java.lang.String getImeiNo() {
        return imeiNo;
    }


    /**
     * Sets the imeiNo value for this GetComplaintStatus.
     * 
     * @param imeiNo
     */
    public void setImeiNo(java.lang.String imeiNo) {
        this.imeiNo = imeiNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetComplaintStatus)) return false;
        GetComplaintStatus other = (GetComplaintStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.complaintNo==null && other.getComplaintNo()==null) || 
             (this.complaintNo!=null &&
              this.complaintNo.equals(other.getComplaintNo()))) &&
            ((this.imeiNo==null && other.getImeiNo()==null) || 
             (this.imeiNo!=null &&
              this.imeiNo.equals(other.getImeiNo())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getComplaintNo() != null) {
            _hashCode += getComplaintNo().hashCode();
        }
        if (getImeiNo() != null) {
            _hashCode += getImeiNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetComplaintStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetComplaintStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imeiNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ImeiNo"));
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
