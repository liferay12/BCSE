/**
 * For_DT_Fir.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class For_DT_Fir  implements java.io.Serializable {
    private java.lang.String stationFacilityid;

    private java.lang.String dtcode;

    public For_DT_Fir() {
    }

    public For_DT_Fir(
           java.lang.String stationFacilityid,
           java.lang.String dtcode) {
           this.stationFacilityid = stationFacilityid;
           this.dtcode = dtcode;
    }


    /**
     * Gets the stationFacilityid value for this For_DT_Fir.
     * 
     * @return stationFacilityid
     */
    public java.lang.String getStationFacilityid() {
        return stationFacilityid;
    }


    /**
     * Sets the stationFacilityid value for this For_DT_Fir.
     * 
     * @param stationFacilityid
     */
    public void setStationFacilityid(java.lang.String stationFacilityid) {
        this.stationFacilityid = stationFacilityid;
    }


    /**
     * Gets the dtcode value for this For_DT_Fir.
     * 
     * @return dtcode
     */
    public java.lang.String getDtcode() {
        return dtcode;
    }


    /**
     * Sets the dtcode value for this For_DT_Fir.
     * 
     * @param dtcode
     */
    public void setDtcode(java.lang.String dtcode) {
        this.dtcode = dtcode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof For_DT_Fir)) return false;
        For_DT_Fir other = (For_DT_Fir) obj;
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
              this.stationFacilityid.equals(other.getStationFacilityid()))) &&
            ((this.dtcode==null && other.getDtcode()==null) || 
             (this.dtcode!=null &&
              this.dtcode.equals(other.getDtcode())));
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
        if (getDtcode() != null) {
            _hashCode += getDtcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(For_DT_Fir.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">For_DT_Fir"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stationFacilityid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StationFacilityid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dtcode"));
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
