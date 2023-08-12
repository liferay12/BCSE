/**
 * GetgridnameResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetgridnameResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetgridnameResponseGetgridnameResult getgridnameResult;

    public GetgridnameResponse() {
    }

    public GetgridnameResponse(
           com.bses2.sap.ws.GetgridnameResponseGetgridnameResult getgridnameResult) {
           this.getgridnameResult = getgridnameResult;
    }


    /**
     * Gets the getgridnameResult value for this GetgridnameResponse.
     * 
     * @return getgridnameResult
     */
    public com.bses2.sap.ws.GetgridnameResponseGetgridnameResult getGetgridnameResult() {
        return getgridnameResult;
    }


    /**
     * Sets the getgridnameResult value for this GetgridnameResponse.
     * 
     * @param getgridnameResult
     */
    public void setGetgridnameResult(com.bses2.sap.ws.GetgridnameResponseGetgridnameResult getgridnameResult) {
        this.getgridnameResult = getgridnameResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetgridnameResponse)) return false;
        GetgridnameResponse other = (GetgridnameResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getgridnameResult==null && other.getGetgridnameResult()==null) || 
             (this.getgridnameResult!=null &&
              this.getgridnameResult.equals(other.getGetgridnameResult())));
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
        if (getGetgridnameResult() != null) {
            _hashCode += getGetgridnameResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetgridnameResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getgridnameResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getgridnameResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getgridnameResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getgridnameResponse>getgridnameResult"));
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
