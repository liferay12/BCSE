/**
 * Get_substation_details.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_substation_details  implements java.io.Serializable {
    private java.lang.String stationFacilityid;

    public Get_substation_details() {
    }

    public Get_substation_details(
           java.lang.String stationFacilityid) {
           this.stationFacilityid = stationFacilityid;
    }


    /**
     * Gets the stationFacilityid value for this Get_substation_details.
     * 
     * @return stationFacilityid
     */
    public java.lang.String getStationFacilityid() {
        return stationFacilityid;
    }


    /**
     * Sets the stationFacilityid value for this Get_substation_details.
     * 
     * @param stationFacilityid
     */
    public void setStationFacilityid(java.lang.String stationFacilityid) {
        this.stationFacilityid = stationFacilityid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_substation_details)) return false;
        Get_substation_details other = (Get_substation_details) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stationFacilityid==null && other.getStationFacilityid()==null) || 
             (this.stationFacilityid!=null &&
              this.stationFacilityid.equals(other.getStationFacilityid())));
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
        if (getStationFacilityid() != null) {
            _hashCode += getStationFacilityid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_substation_details.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_substation_details"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stationFacilityid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StationFacilityid"));
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
