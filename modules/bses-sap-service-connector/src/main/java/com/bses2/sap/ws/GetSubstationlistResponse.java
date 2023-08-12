/**
 * GetSubstationlistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetSubstationlistResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetSubstationlistResponseGetSubstationlistResult getSubstationlistResult;

    public GetSubstationlistResponse() {
    }

    public GetSubstationlistResponse(
           com.bses2.sap.ws.GetSubstationlistResponseGetSubstationlistResult getSubstationlistResult) {
           this.getSubstationlistResult = getSubstationlistResult;
    }


    /**
     * Gets the getSubstationlistResult value for this GetSubstationlistResponse.
     * 
     * @return getSubstationlistResult
     */
    public com.bses2.sap.ws.GetSubstationlistResponseGetSubstationlistResult getGetSubstationlistResult() {
        return getSubstationlistResult;
    }


    /**
     * Sets the getSubstationlistResult value for this GetSubstationlistResponse.
     * 
     * @param getSubstationlistResult
     */
    public void setGetSubstationlistResult(com.bses2.sap.ws.GetSubstationlistResponseGetSubstationlistResult getSubstationlistResult) {
        this.getSubstationlistResult = getSubstationlistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubstationlistResponse)) return false;
        GetSubstationlistResponse other = (GetSubstationlistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSubstationlistResult==null && other.getGetSubstationlistResult()==null) || 
             (this.getSubstationlistResult!=null &&
              this.getSubstationlistResult.equals(other.getGetSubstationlistResult())));
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
        if (getGetSubstationlistResult() != null) {
            _hashCode += getGetSubstationlistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubstationlistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubstationlistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSubstationlistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubstationlistResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubstationlistResponse>GetSubstationlistResult"));
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
