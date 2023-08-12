/**
 * GetSensorB_TEMPHyperlinkResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetSensorB_TEMPHyperlinkResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponseGetSensorB_TEMPHyperlinkResult getSensorB_TEMPHyperlinkResult;

    public GetSensorB_TEMPHyperlinkResponse() {
    }

    public GetSensorB_TEMPHyperlinkResponse(
           com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponseGetSensorB_TEMPHyperlinkResult getSensorB_TEMPHyperlinkResult) {
           this.getSensorB_TEMPHyperlinkResult = getSensorB_TEMPHyperlinkResult;
    }


    /**
     * Gets the getSensorB_TEMPHyperlinkResult value for this GetSensorB_TEMPHyperlinkResponse.
     * 
     * @return getSensorB_TEMPHyperlinkResult
     */
    public com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponseGetSensorB_TEMPHyperlinkResult getGetSensorB_TEMPHyperlinkResult() {
        return getSensorB_TEMPHyperlinkResult;
    }


    /**
     * Sets the getSensorB_TEMPHyperlinkResult value for this GetSensorB_TEMPHyperlinkResponse.
     * 
     * @param getSensorB_TEMPHyperlinkResult
     */
    public void setGetSensorB_TEMPHyperlinkResult(com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponseGetSensorB_TEMPHyperlinkResult getSensorB_TEMPHyperlinkResult) {
        this.getSensorB_TEMPHyperlinkResult = getSensorB_TEMPHyperlinkResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSensorB_TEMPHyperlinkResponse)) return false;
        GetSensorB_TEMPHyperlinkResponse other = (GetSensorB_TEMPHyperlinkResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSensorB_TEMPHyperlinkResult==null && other.getGetSensorB_TEMPHyperlinkResult()==null) || 
             (this.getSensorB_TEMPHyperlinkResult!=null &&
              this.getSensorB_TEMPHyperlinkResult.equals(other.getGetSensorB_TEMPHyperlinkResult())));
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
        if (getGetSensorB_TEMPHyperlinkResult() != null) {
            _hashCode += getGetSensorB_TEMPHyperlinkResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSensorB_TEMPHyperlinkResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorB_TEMPHyperlinkResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSensorB_TEMPHyperlinkResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorB_TEMPHyperlinkResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorB_TEMPHyperlinkResponse>GetSensorB_TEMPHyperlinkResult"));
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
