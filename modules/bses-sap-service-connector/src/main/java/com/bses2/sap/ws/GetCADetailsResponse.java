/**
 * GetCADetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetCADetailsResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetCADetailsResponseGetCADetailsResult getCADetailsResult;

    public GetCADetailsResponse() {
    }

    public GetCADetailsResponse(
           com.bses2.sap.ws.GetCADetailsResponseGetCADetailsResult getCADetailsResult) {
           this.getCADetailsResult = getCADetailsResult;
    }


    /**
     * Gets the getCADetailsResult value for this GetCADetailsResponse.
     * 
     * @return getCADetailsResult
     */
    public com.bses2.sap.ws.GetCADetailsResponseGetCADetailsResult getGetCADetailsResult() {
        return getCADetailsResult;
    }


    /**
     * Sets the getCADetailsResult value for this GetCADetailsResponse.
     * 
     * @param getCADetailsResult
     */
    public void setGetCADetailsResult(com.bses2.sap.ws.GetCADetailsResponseGetCADetailsResult getCADetailsResult) {
        this.getCADetailsResult = getCADetailsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCADetailsResponse)) return false;
        GetCADetailsResponse other = (GetCADetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCADetailsResult==null && other.getGetCADetailsResult()==null) || 
             (this.getCADetailsResult!=null &&
              this.getCADetailsResult.equals(other.getGetCADetailsResult())));
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
        if (getGetCADetailsResult() != null) {
            _hashCode += getGetCADetailsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCADetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getCADetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCADetailsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getCADetailsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getCADetailsResponse>getCADetailsResult"));
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
