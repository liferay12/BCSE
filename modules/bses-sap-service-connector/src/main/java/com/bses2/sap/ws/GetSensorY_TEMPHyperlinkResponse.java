/**
 * GetSensorY_TEMPHyperlinkResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetSensorY_TEMPHyperlinkResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponseGetSensorY_TEMPHyperlinkResult getSensorY_TEMPHyperlinkResult;

    public GetSensorY_TEMPHyperlinkResponse() {
    }

    public GetSensorY_TEMPHyperlinkResponse(
           com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponseGetSensorY_TEMPHyperlinkResult getSensorY_TEMPHyperlinkResult) {
           this.getSensorY_TEMPHyperlinkResult = getSensorY_TEMPHyperlinkResult;
    }


    /**
     * Gets the getSensorY_TEMPHyperlinkResult value for this GetSensorY_TEMPHyperlinkResponse.
     * 
     * @return getSensorY_TEMPHyperlinkResult
     */
    public com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponseGetSensorY_TEMPHyperlinkResult getGetSensorY_TEMPHyperlinkResult() {
        return getSensorY_TEMPHyperlinkResult;
    }


    /**
     * Sets the getSensorY_TEMPHyperlinkResult value for this GetSensorY_TEMPHyperlinkResponse.
     * 
     * @param getSensorY_TEMPHyperlinkResult
     */
    public void setGetSensorY_TEMPHyperlinkResult(com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponseGetSensorY_TEMPHyperlinkResult getSensorY_TEMPHyperlinkResult) {
        this.getSensorY_TEMPHyperlinkResult = getSensorY_TEMPHyperlinkResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSensorY_TEMPHyperlinkResponse)) return false;
        GetSensorY_TEMPHyperlinkResponse other = (GetSensorY_TEMPHyperlinkResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSensorY_TEMPHyperlinkResult==null && other.getGetSensorY_TEMPHyperlinkResult()==null) || 
             (this.getSensorY_TEMPHyperlinkResult!=null &&
              this.getSensorY_TEMPHyperlinkResult.equals(other.getGetSensorY_TEMPHyperlinkResult())));
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
        if (getGetSensorY_TEMPHyperlinkResult() != null) {
            _hashCode += getGetSensorY_TEMPHyperlinkResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSensorY_TEMPHyperlinkResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorY_TEMPHyperlinkResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSensorY_TEMPHyperlinkResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorY_TEMPHyperlinkResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorY_TEMPHyperlinkResponse>GetSensorY_TEMPHyperlinkResult"));
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
