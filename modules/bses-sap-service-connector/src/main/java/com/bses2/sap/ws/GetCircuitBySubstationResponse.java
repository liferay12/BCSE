/**
 * GetCircuitBySubstationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetCircuitBySubstationResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetCircuitBySubstationResponseGetCircuitBySubstationResult getCircuitBySubstationResult;

    public GetCircuitBySubstationResponse() {
    }

    public GetCircuitBySubstationResponse(
           com.bses2.sap.ws.GetCircuitBySubstationResponseGetCircuitBySubstationResult getCircuitBySubstationResult) {
           this.getCircuitBySubstationResult = getCircuitBySubstationResult;
    }


    /**
     * Gets the getCircuitBySubstationResult value for this GetCircuitBySubstationResponse.
     * 
     * @return getCircuitBySubstationResult
     */
    public com.bses2.sap.ws.GetCircuitBySubstationResponseGetCircuitBySubstationResult getGetCircuitBySubstationResult() {
        return getCircuitBySubstationResult;
    }


    /**
     * Sets the getCircuitBySubstationResult value for this GetCircuitBySubstationResponse.
     * 
     * @param getCircuitBySubstationResult
     */
    public void setGetCircuitBySubstationResult(com.bses2.sap.ws.GetCircuitBySubstationResponseGetCircuitBySubstationResult getCircuitBySubstationResult) {
        this.getCircuitBySubstationResult = getCircuitBySubstationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCircuitBySubstationResponse)) return false;
        GetCircuitBySubstationResponse other = (GetCircuitBySubstationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCircuitBySubstationResult==null && other.getGetCircuitBySubstationResult()==null) || 
             (this.getCircuitBySubstationResult!=null &&
              this.getCircuitBySubstationResult.equals(other.getGetCircuitBySubstationResult())));
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
        if (getGetCircuitBySubstationResult() != null) {
            _hashCode += getGetCircuitBySubstationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCircuitBySubstationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCircuitBySubstationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCircuitBySubstationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCircuitBySubstationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCircuitBySubstationResponse>GetCircuitBySubstationResult"));
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
