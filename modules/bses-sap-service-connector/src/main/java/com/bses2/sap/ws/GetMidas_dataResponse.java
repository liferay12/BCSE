/**
 * GetMidas_dataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetMidas_dataResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetMidas_dataResponseGetMidas_dataResult getMidas_dataResult;

    public GetMidas_dataResponse() {
    }

    public GetMidas_dataResponse(
           com.bses2.sap.ws.GetMidas_dataResponseGetMidas_dataResult getMidas_dataResult) {
           this.getMidas_dataResult = getMidas_dataResult;
    }


    /**
     * Gets the getMidas_dataResult value for this GetMidas_dataResponse.
     * 
     * @return getMidas_dataResult
     */
    public com.bses2.sap.ws.GetMidas_dataResponseGetMidas_dataResult getGetMidas_dataResult() {
        return getMidas_dataResult;
    }


    /**
     * Sets the getMidas_dataResult value for this GetMidas_dataResponse.
     * 
     * @param getMidas_dataResult
     */
    public void setGetMidas_dataResult(com.bses2.sap.ws.GetMidas_dataResponseGetMidas_dataResult getMidas_dataResult) {
        this.getMidas_dataResult = getMidas_dataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMidas_dataResponse)) return false;
        GetMidas_dataResponse other = (GetMidas_dataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMidas_dataResult==null && other.getGetMidas_dataResult()==null) || 
             (this.getMidas_dataResult!=null &&
              this.getMidas_dataResult.equals(other.getGetMidas_dataResult())));
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
        if (getGetMidas_dataResult() != null) {
            _hashCode += getGetMidas_dataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMidas_dataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMidas_dataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMidas_dataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMidas_dataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMidas_dataResponse>GetMidas_dataResult"));
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
