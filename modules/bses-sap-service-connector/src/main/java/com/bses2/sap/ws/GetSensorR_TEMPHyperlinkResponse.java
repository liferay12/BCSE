/**
 * GetSensorR_TEMPHyperlinkResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetSensorR_TEMPHyperlinkResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponseGetSensorR_TEMPHyperlinkResult getSensorR_TEMPHyperlinkResult;

    public GetSensorR_TEMPHyperlinkResponse() {
    }

    public GetSensorR_TEMPHyperlinkResponse(
           com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponseGetSensorR_TEMPHyperlinkResult getSensorR_TEMPHyperlinkResult) {
           this.getSensorR_TEMPHyperlinkResult = getSensorR_TEMPHyperlinkResult;
    }


    /**
     * Gets the getSensorR_TEMPHyperlinkResult value for this GetSensorR_TEMPHyperlinkResponse.
     * 
     * @return getSensorR_TEMPHyperlinkResult
     */
    public com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponseGetSensorR_TEMPHyperlinkResult getGetSensorR_TEMPHyperlinkResult() {
        return getSensorR_TEMPHyperlinkResult;
    }


    /**
     * Sets the getSensorR_TEMPHyperlinkResult value for this GetSensorR_TEMPHyperlinkResponse.
     * 
     * @param getSensorR_TEMPHyperlinkResult
     */
    public void setGetSensorR_TEMPHyperlinkResult(com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponseGetSensorR_TEMPHyperlinkResult getSensorR_TEMPHyperlinkResult) {
        this.getSensorR_TEMPHyperlinkResult = getSensorR_TEMPHyperlinkResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSensorR_TEMPHyperlinkResponse)) return false;
        GetSensorR_TEMPHyperlinkResponse other = (GetSensorR_TEMPHyperlinkResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSensorR_TEMPHyperlinkResult==null && other.getGetSensorR_TEMPHyperlinkResult()==null) || 
             (this.getSensorR_TEMPHyperlinkResult!=null &&
              this.getSensorR_TEMPHyperlinkResult.equals(other.getGetSensorR_TEMPHyperlinkResult())));
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
        if (getGetSensorR_TEMPHyperlinkResult() != null) {
            _hashCode += getGetSensorR_TEMPHyperlinkResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSensorR_TEMPHyperlinkResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorR_TEMPHyperlinkResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSensorR_TEMPHyperlinkResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorR_TEMPHyperlinkResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorR_TEMPHyperlinkResponse>GetSensorR_TEMPHyperlinkResult"));
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
