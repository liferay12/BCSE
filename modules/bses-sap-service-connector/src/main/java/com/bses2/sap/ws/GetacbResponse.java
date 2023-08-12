/**
 * GetacbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetacbResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetacbResponseGetacbResult getacbResult;

    public GetacbResponse() {
    }

    public GetacbResponse(
           com.bses2.sap.ws.GetacbResponseGetacbResult getacbResult) {
           this.getacbResult = getacbResult;
    }


    /**
     * Gets the getacbResult value for this GetacbResponse.
     * 
     * @return getacbResult
     */
    public com.bses2.sap.ws.GetacbResponseGetacbResult getGetacbResult() {
        return getacbResult;
    }


    /**
     * Sets the getacbResult value for this GetacbResponse.
     * 
     * @param getacbResult
     */
    public void setGetacbResult(com.bses2.sap.ws.GetacbResponseGetacbResult getacbResult) {
        this.getacbResult = getacbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetacbResponse)) return false;
        GetacbResponse other = (GetacbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getacbResult==null && other.getGetacbResult()==null) || 
             (this.getacbResult!=null &&
              this.getacbResult.equals(other.getGetacbResult())));
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
        if (getGetacbResult() != null) {
            _hashCode += getGetacbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetacbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getacbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getacbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getacbResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getacbResponse>getacbResult"));
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
