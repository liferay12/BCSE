/**
 * GetSensorN_TEMPHyperlinkResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetSensorN_TEMPHyperlinkResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponseGetSensorN_TEMPHyperlinkResult getSensorN_TEMPHyperlinkResult;

    public GetSensorN_TEMPHyperlinkResponse() {
    }

    public GetSensorN_TEMPHyperlinkResponse(
           com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponseGetSensorN_TEMPHyperlinkResult getSensorN_TEMPHyperlinkResult) {
           this.getSensorN_TEMPHyperlinkResult = getSensorN_TEMPHyperlinkResult;
    }


    /**
     * Gets the getSensorN_TEMPHyperlinkResult value for this GetSensorN_TEMPHyperlinkResponse.
     * 
     * @return getSensorN_TEMPHyperlinkResult
     */
    public com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponseGetSensorN_TEMPHyperlinkResult getGetSensorN_TEMPHyperlinkResult() {
        return getSensorN_TEMPHyperlinkResult;
    }


    /**
     * Sets the getSensorN_TEMPHyperlinkResult value for this GetSensorN_TEMPHyperlinkResponse.
     * 
     * @param getSensorN_TEMPHyperlinkResult
     */
    public void setGetSensorN_TEMPHyperlinkResult(com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponseGetSensorN_TEMPHyperlinkResult getSensorN_TEMPHyperlinkResult) {
        this.getSensorN_TEMPHyperlinkResult = getSensorN_TEMPHyperlinkResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSensorN_TEMPHyperlinkResponse)) return false;
        GetSensorN_TEMPHyperlinkResponse other = (GetSensorN_TEMPHyperlinkResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSensorN_TEMPHyperlinkResult==null && other.getGetSensorN_TEMPHyperlinkResult()==null) || 
             (this.getSensorN_TEMPHyperlinkResult!=null &&
              this.getSensorN_TEMPHyperlinkResult.equals(other.getGetSensorN_TEMPHyperlinkResult())));
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
        if (getGetSensorN_TEMPHyperlinkResult() != null) {
            _hashCode += getGetSensorN_TEMPHyperlinkResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSensorN_TEMPHyperlinkResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorN_TEMPHyperlinkResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSensorN_TEMPHyperlinkResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorN_TEMPHyperlinkResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorN_TEMPHyperlinkResponse>GetSensorN_TEMPHyperlinkResult"));
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
