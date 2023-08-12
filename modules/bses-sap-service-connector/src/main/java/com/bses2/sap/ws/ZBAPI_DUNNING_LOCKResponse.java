/**
 * ZBAPI_DUNNING_LOCKResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ZBAPI_DUNNING_LOCKResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.ZBAPI_DUNNING_LOCKResponseZBAPI_DUNNING_LOCKResult ZBAPI_DUNNING_LOCKResult;

    public ZBAPI_DUNNING_LOCKResponse() {
    }

    public ZBAPI_DUNNING_LOCKResponse(
           com.bses2.sap.ws.ZBAPI_DUNNING_LOCKResponseZBAPI_DUNNING_LOCKResult ZBAPI_DUNNING_LOCKResult) {
           this.ZBAPI_DUNNING_LOCKResult = ZBAPI_DUNNING_LOCKResult;
    }


    /**
     * Gets the ZBAPI_DUNNING_LOCKResult value for this ZBAPI_DUNNING_LOCKResponse.
     * 
     * @return ZBAPI_DUNNING_LOCKResult
     */
    public com.bses2.sap.ws.ZBAPI_DUNNING_LOCKResponseZBAPI_DUNNING_LOCKResult getZBAPI_DUNNING_LOCKResult() {
        return ZBAPI_DUNNING_LOCKResult;
    }


    /**
     * Sets the ZBAPI_DUNNING_LOCKResult value for this ZBAPI_DUNNING_LOCKResponse.
     * 
     * @param ZBAPI_DUNNING_LOCKResult
     */
    public void setZBAPI_DUNNING_LOCKResult(com.bses2.sap.ws.ZBAPI_DUNNING_LOCKResponseZBAPI_DUNNING_LOCKResult ZBAPI_DUNNING_LOCKResult) {
        this.ZBAPI_DUNNING_LOCKResult = ZBAPI_DUNNING_LOCKResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_DUNNING_LOCKResponse)) return false;
        ZBAPI_DUNNING_LOCKResponse other = (ZBAPI_DUNNING_LOCKResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_DUNNING_LOCKResult==null && other.getZBAPI_DUNNING_LOCKResult()==null) || 
             (this.ZBAPI_DUNNING_LOCKResult!=null &&
              this.ZBAPI_DUNNING_LOCKResult.equals(other.getZBAPI_DUNNING_LOCKResult())));
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
        if (getZBAPI_DUNNING_LOCKResult() != null) {
            _hashCode += getZBAPI_DUNNING_LOCKResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_DUNNING_LOCKResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_DUNNING_LOCKResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_DUNNING_LOCKResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_DUNNING_LOCKResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_DUNNING_LOCKResponse>ZBAPI_DUNNING_LOCKResult"));
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
