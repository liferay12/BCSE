/**
 * Get_EHVstatus_listResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_EHVstatus_listResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_EHVstatus_listResponseGet_EHVstatus_listResult get_EHVstatus_listResult;

    public Get_EHVstatus_listResponse() {
    }

    public Get_EHVstatus_listResponse(
           com.bses2.sap.ws.Get_EHVstatus_listResponseGet_EHVstatus_listResult get_EHVstatus_listResult) {
           this.get_EHVstatus_listResult = get_EHVstatus_listResult;
    }


    /**
     * Gets the get_EHVstatus_listResult value for this Get_EHVstatus_listResponse.
     * 
     * @return get_EHVstatus_listResult
     */
    public com.bses2.sap.ws.Get_EHVstatus_listResponseGet_EHVstatus_listResult getGet_EHVstatus_listResult() {
        return get_EHVstatus_listResult;
    }


    /**
     * Sets the get_EHVstatus_listResult value for this Get_EHVstatus_listResponse.
     * 
     * @param get_EHVstatus_listResult
     */
    public void setGet_EHVstatus_listResult(com.bses2.sap.ws.Get_EHVstatus_listResponseGet_EHVstatus_listResult get_EHVstatus_listResult) {
        this.get_EHVstatus_listResult = get_EHVstatus_listResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_EHVstatus_listResponse)) return false;
        Get_EHVstatus_listResponse other = (Get_EHVstatus_listResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_EHVstatus_listResult==null && other.getGet_EHVstatus_listResult()==null) || 
             (this.get_EHVstatus_listResult!=null &&
              this.get_EHVstatus_listResult.equals(other.getGet_EHVstatus_listResult())));
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
        if (getGet_EHVstatus_listResult() != null) {
            _hashCode += getGet_EHVstatus_listResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_EHVstatus_listResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVstatus_listResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_EHVstatus_listResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVstatus_listResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVstatus_listResponse>Get_EHVstatus_listResult"));
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
