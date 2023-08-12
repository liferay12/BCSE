/**
 * GetCCfromZoneResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetCCfromZoneResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetCCfromZoneResponseGetCCfromZoneResult getCCfromZoneResult;

    public GetCCfromZoneResponse() {
    }

    public GetCCfromZoneResponse(
           com.bses2.sap.ws.GetCCfromZoneResponseGetCCfromZoneResult getCCfromZoneResult) {
           this.getCCfromZoneResult = getCCfromZoneResult;
    }


    /**
     * Gets the getCCfromZoneResult value for this GetCCfromZoneResponse.
     * 
     * @return getCCfromZoneResult
     */
    public com.bses2.sap.ws.GetCCfromZoneResponseGetCCfromZoneResult getGetCCfromZoneResult() {
        return getCCfromZoneResult;
    }


    /**
     * Sets the getCCfromZoneResult value for this GetCCfromZoneResponse.
     * 
     * @param getCCfromZoneResult
     */
    public void setGetCCfromZoneResult(com.bses2.sap.ws.GetCCfromZoneResponseGetCCfromZoneResult getCCfromZoneResult) {
        this.getCCfromZoneResult = getCCfromZoneResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCCfromZoneResponse)) return false;
        GetCCfromZoneResponse other = (GetCCfromZoneResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCCfromZoneResult==null && other.getGetCCfromZoneResult()==null) || 
             (this.getCCfromZoneResult!=null &&
              this.getCCfromZoneResult.equals(other.getGetCCfromZoneResult())));
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
        if (getGetCCfromZoneResult() != null) {
            _hashCode += getGetCCfromZoneResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCCfromZoneResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getCCfromZoneResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCCfromZoneResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getCCfromZoneResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getCCfromZoneResponse>getCCfromZoneResult"));
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
