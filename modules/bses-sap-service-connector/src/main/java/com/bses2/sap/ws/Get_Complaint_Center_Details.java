/**
 * Get_Complaint_Center_Details.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Complaint_Center_Details  implements java.io.Serializable {
    private java.lang.String complaintCentre;

    public Get_Complaint_Center_Details() {
    }

    public Get_Complaint_Center_Details(
           java.lang.String complaintCentre) {
           this.complaintCentre = complaintCentre;
    }


    /**
     * Gets the complaintCentre value for this Get_Complaint_Center_Details.
     * 
     * @return complaintCentre
     */
    public java.lang.String getComplaintCentre() {
        return complaintCentre;
    }


    /**
     * Sets the complaintCentre value for this Get_Complaint_Center_Details.
     * 
     * @param complaintCentre
     */
    public void setComplaintCentre(java.lang.String complaintCentre) {
        this.complaintCentre = complaintCentre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Complaint_Center_Details)) return false;
        Get_Complaint_Center_Details other = (Get_Complaint_Center_Details) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.complaintCentre==null && other.getComplaintCentre()==null) || 
             (this.complaintCentre!=null &&
              this.complaintCentre.equals(other.getComplaintCentre())));
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
        if (getComplaintCentre() != null) {
            _hashCode += getComplaintCentre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Complaint_Center_Details.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Complaint_Center_Details"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintCentre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintCentre"));
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
