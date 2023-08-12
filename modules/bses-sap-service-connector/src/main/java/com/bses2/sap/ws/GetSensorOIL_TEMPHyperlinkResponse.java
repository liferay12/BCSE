/**
 * GetSensorOIL_TEMPHyperlinkResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetSensorOIL_TEMPHyperlinkResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponseGetSensorOIL_TEMPHyperlinkResult getSensorOIL_TEMPHyperlinkResult;

    public GetSensorOIL_TEMPHyperlinkResponse() {
    }

    public GetSensorOIL_TEMPHyperlinkResponse(
           com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponseGetSensorOIL_TEMPHyperlinkResult getSensorOIL_TEMPHyperlinkResult) {
           this.getSensorOIL_TEMPHyperlinkResult = getSensorOIL_TEMPHyperlinkResult;
    }


    /**
     * Gets the getSensorOIL_TEMPHyperlinkResult value for this GetSensorOIL_TEMPHyperlinkResponse.
     * 
     * @return getSensorOIL_TEMPHyperlinkResult
     */
    public com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponseGetSensorOIL_TEMPHyperlinkResult getGetSensorOIL_TEMPHyperlinkResult() {
        return getSensorOIL_TEMPHyperlinkResult;
    }


    /**
     * Sets the getSensorOIL_TEMPHyperlinkResult value for this GetSensorOIL_TEMPHyperlinkResponse.
     * 
     * @param getSensorOIL_TEMPHyperlinkResult
     */
    public void setGetSensorOIL_TEMPHyperlinkResult(com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponseGetSensorOIL_TEMPHyperlinkResult getSensorOIL_TEMPHyperlinkResult) {
        this.getSensorOIL_TEMPHyperlinkResult = getSensorOIL_TEMPHyperlinkResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSensorOIL_TEMPHyperlinkResponse)) return false;
        GetSensorOIL_TEMPHyperlinkResponse other = (GetSensorOIL_TEMPHyperlinkResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSensorOIL_TEMPHyperlinkResult==null && other.getGetSensorOIL_TEMPHyperlinkResult()==null) || 
             (this.getSensorOIL_TEMPHyperlinkResult!=null &&
              this.getSensorOIL_TEMPHyperlinkResult.equals(other.getGetSensorOIL_TEMPHyperlinkResult())));
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
        if (getGetSensorOIL_TEMPHyperlinkResult() != null) {
            _hashCode += getGetSensorOIL_TEMPHyperlinkResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSensorOIL_TEMPHyperlinkResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorOIL_TEMPHyperlinkResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSensorOIL_TEMPHyperlinkResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorOIL_TEMPHyperlinkResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorOIL_TEMPHyperlinkResponse>GetSensorOIL_TEMPHyperlinkResult"));
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
