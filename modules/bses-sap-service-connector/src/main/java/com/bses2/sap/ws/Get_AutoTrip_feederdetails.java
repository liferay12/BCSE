/**
 * Get_AutoTrip_feederdetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_AutoTrip_feederdetails  implements java.io.Serializable {
    private java.lang.String switchid;

    public Get_AutoTrip_feederdetails() {
    }

    public Get_AutoTrip_feederdetails(
           java.lang.String switchid) {
           this.switchid = switchid;
    }


    /**
     * Gets the switchid value for this Get_AutoTrip_feederdetails.
     * 
     * @return switchid
     */
    public java.lang.String getSwitchid() {
        return switchid;
    }


    /**
     * Sets the switchid value for this Get_AutoTrip_feederdetails.
     * 
     * @param switchid
     */
    public void setSwitchid(java.lang.String switchid) {
        this.switchid = switchid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_AutoTrip_feederdetails)) return false;
        Get_AutoTrip_feederdetails other = (Get_AutoTrip_feederdetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.switchid==null && other.getSwitchid()==null) || 
             (this.switchid!=null &&
              this.switchid.equals(other.getSwitchid())));
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
        if (getSwitchid() != null) {
            _hashCode += getSwitchid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_AutoTrip_feederdetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_AutoTrip_feederdetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "switchid"));
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
