/**
 * GetrmuResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetrmuResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetrmuResponseGetrmuResult getrmuResult;

    public GetrmuResponse() {
    }

    public GetrmuResponse(
           com.bses2.sap.ws.GetrmuResponseGetrmuResult getrmuResult) {
           this.getrmuResult = getrmuResult;
    }


    /**
     * Gets the getrmuResult value for this GetrmuResponse.
     * 
     * @return getrmuResult
     */
    public com.bses2.sap.ws.GetrmuResponseGetrmuResult getGetrmuResult() {
        return getrmuResult;
    }


    /**
     * Sets the getrmuResult value for this GetrmuResponse.
     * 
     * @param getrmuResult
     */
    public void setGetrmuResult(com.bses2.sap.ws.GetrmuResponseGetrmuResult getrmuResult) {
        this.getrmuResult = getrmuResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetrmuResponse)) return false;
        GetrmuResponse other = (GetrmuResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getrmuResult==null && other.getGetrmuResult()==null) || 
             (this.getrmuResult!=null &&
              this.getrmuResult.equals(other.getGetrmuResult())));
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
        if (getGetrmuResult() != null) {
            _hashCode += getGetrmuResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetrmuResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getrmuResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getrmuResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getrmuResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getrmuResponse>getrmuResult"));
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
