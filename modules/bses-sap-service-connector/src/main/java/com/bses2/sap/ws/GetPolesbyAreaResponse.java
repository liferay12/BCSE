/**
 * GetPolesbyAreaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetPolesbyAreaResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetPolesbyAreaResponseGetPolesbyAreaResult getPolesbyAreaResult;

    public GetPolesbyAreaResponse() {
    }

    public GetPolesbyAreaResponse(
           com.bses2.sap.ws.GetPolesbyAreaResponseGetPolesbyAreaResult getPolesbyAreaResult) {
           this.getPolesbyAreaResult = getPolesbyAreaResult;
    }


    /**
     * Gets the getPolesbyAreaResult value for this GetPolesbyAreaResponse.
     * 
     * @return getPolesbyAreaResult
     */
    public com.bses2.sap.ws.GetPolesbyAreaResponseGetPolesbyAreaResult getGetPolesbyAreaResult() {
        return getPolesbyAreaResult;
    }


    /**
     * Sets the getPolesbyAreaResult value for this GetPolesbyAreaResponse.
     * 
     * @param getPolesbyAreaResult
     */
    public void setGetPolesbyAreaResult(com.bses2.sap.ws.GetPolesbyAreaResponseGetPolesbyAreaResult getPolesbyAreaResult) {
        this.getPolesbyAreaResult = getPolesbyAreaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPolesbyAreaResponse)) return false;
        GetPolesbyAreaResponse other = (GetPolesbyAreaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPolesbyAreaResult==null && other.getGetPolesbyAreaResult()==null) || 
             (this.getPolesbyAreaResult!=null &&
              this.getPolesbyAreaResult.equals(other.getGetPolesbyAreaResult())));
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
        if (getGetPolesbyAreaResult() != null) {
            _hashCode += getGetPolesbyAreaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPolesbyAreaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getPolesbyAreaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPolesbyAreaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getPolesbyAreaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getPolesbyAreaResponse>getPolesbyAreaResult"));
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
