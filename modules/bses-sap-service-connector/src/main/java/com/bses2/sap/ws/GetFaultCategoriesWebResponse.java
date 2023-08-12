/**
 * GetFaultCategoriesWebResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetFaultCategoriesWebResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetFaultCategoriesWebResponseGetFaultCategoriesWebResult getFaultCategoriesWebResult;

    public GetFaultCategoriesWebResponse() {
    }

    public GetFaultCategoriesWebResponse(
           com.bses2.sap.ws.GetFaultCategoriesWebResponseGetFaultCategoriesWebResult getFaultCategoriesWebResult) {
           this.getFaultCategoriesWebResult = getFaultCategoriesWebResult;
    }


    /**
     * Gets the getFaultCategoriesWebResult value for this GetFaultCategoriesWebResponse.
     * 
     * @return getFaultCategoriesWebResult
     */
    public com.bses2.sap.ws.GetFaultCategoriesWebResponseGetFaultCategoriesWebResult getGetFaultCategoriesWebResult() {
        return getFaultCategoriesWebResult;
    }


    /**
     * Sets the getFaultCategoriesWebResult value for this GetFaultCategoriesWebResponse.
     * 
     * @param getFaultCategoriesWebResult
     */
    public void setGetFaultCategoriesWebResult(com.bses2.sap.ws.GetFaultCategoriesWebResponseGetFaultCategoriesWebResult getFaultCategoriesWebResult) {
        this.getFaultCategoriesWebResult = getFaultCategoriesWebResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFaultCategoriesWebResponse)) return false;
        GetFaultCategoriesWebResponse other = (GetFaultCategoriesWebResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFaultCategoriesWebResult==null && other.getGetFaultCategoriesWebResult()==null) || 
             (this.getFaultCategoriesWebResult!=null &&
              this.getFaultCategoriesWebResult.equals(other.getGetFaultCategoriesWebResult())));
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
        if (getGetFaultCategoriesWebResult() != null) {
            _hashCode += getGetFaultCategoriesWebResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFaultCategoriesWebResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFaultCategoriesWebResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFaultCategoriesWebResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFaultCategoriesWebResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetFaultCategoriesWebResponse>GetFaultCategoriesWebResult"));
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
