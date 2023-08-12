/**
 * Get_ComplaintCenter_ContactNoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_ComplaintCenter_ContactNoResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponseGet_ComplaintCenter_ContactNoResult get_ComplaintCenter_ContactNoResult;

    public Get_ComplaintCenter_ContactNoResponse() {
    }

    public Get_ComplaintCenter_ContactNoResponse(
           com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponseGet_ComplaintCenter_ContactNoResult get_ComplaintCenter_ContactNoResult) {
           this.get_ComplaintCenter_ContactNoResult = get_ComplaintCenter_ContactNoResult;
    }


    /**
     * Gets the get_ComplaintCenter_ContactNoResult value for this Get_ComplaintCenter_ContactNoResponse.
     * 
     * @return get_ComplaintCenter_ContactNoResult
     */
    public com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponseGet_ComplaintCenter_ContactNoResult getGet_ComplaintCenter_ContactNoResult() {
        return get_ComplaintCenter_ContactNoResult;
    }


    /**
     * Sets the get_ComplaintCenter_ContactNoResult value for this Get_ComplaintCenter_ContactNoResponse.
     * 
     * @param get_ComplaintCenter_ContactNoResult
     */
    public void setGet_ComplaintCenter_ContactNoResult(com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponseGet_ComplaintCenter_ContactNoResult get_ComplaintCenter_ContactNoResult) {
        this.get_ComplaintCenter_ContactNoResult = get_ComplaintCenter_ContactNoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_ComplaintCenter_ContactNoResponse)) return false;
        Get_ComplaintCenter_ContactNoResponse other = (Get_ComplaintCenter_ContactNoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_ComplaintCenter_ContactNoResult==null && other.getGet_ComplaintCenter_ContactNoResult()==null) || 
             (this.get_ComplaintCenter_ContactNoResult!=null &&
              this.get_ComplaintCenter_ContactNoResult.equals(other.getGet_ComplaintCenter_ContactNoResult())));
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
        if (getGet_ComplaintCenter_ContactNoResult() != null) {
            _hashCode += getGet_ComplaintCenter_ContactNoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_ComplaintCenter_ContactNoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ComplaintCenter_ContactNoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_ComplaintCenter_ContactNoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ComplaintCenter_ContactNoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ComplaintCenter_ContactNoResponse>Get_ComplaintCenter_ContactNoResult"));
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
