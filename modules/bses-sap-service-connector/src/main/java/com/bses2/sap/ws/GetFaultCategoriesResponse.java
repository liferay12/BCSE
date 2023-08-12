/**
 * GetFaultCategoriesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetFaultCategoriesResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetFaultCategoriesResponseGetFaultCategoriesResult getFaultCategoriesResult;

    public GetFaultCategoriesResponse() {
    }

    public GetFaultCategoriesResponse(
           com.bses2.sap.ws.GetFaultCategoriesResponseGetFaultCategoriesResult getFaultCategoriesResult) {
           this.getFaultCategoriesResult = getFaultCategoriesResult;
    }


    /**
     * Gets the getFaultCategoriesResult value for this GetFaultCategoriesResponse.
     * 
     * @return getFaultCategoriesResult
     */
    public com.bses2.sap.ws.GetFaultCategoriesResponseGetFaultCategoriesResult getGetFaultCategoriesResult() {
        return getFaultCategoriesResult;
    }


    /**
     * Sets the getFaultCategoriesResult value for this GetFaultCategoriesResponse.
     * 
     * @param getFaultCategoriesResult
     */
    public void setGetFaultCategoriesResult(com.bses2.sap.ws.GetFaultCategoriesResponseGetFaultCategoriesResult getFaultCategoriesResult) {
        this.getFaultCategoriesResult = getFaultCategoriesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFaultCategoriesResponse)) return false;
        GetFaultCategoriesResponse other = (GetFaultCategoriesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFaultCategoriesResult==null && other.getGetFaultCategoriesResult()==null) || 
             (this.getFaultCategoriesResult!=null &&
              this.getFaultCategoriesResult.equals(other.getGetFaultCategoriesResult())));
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
        if (getGetFaultCategoriesResult() != null) {
            _hashCode += getGetFaultCategoriesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFaultCategoriesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFaultCategoriesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFaultCategoriesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFaultCategoriesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetFaultCategoriesResponse>GetFaultCategoriesResult"));
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
