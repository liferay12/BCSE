/**
 * Get_Company_listResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Company_listResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Company_listResponseGet_Company_listResult get_Company_listResult;

    public Get_Company_listResponse() {
    }

    public Get_Company_listResponse(
           com.bses2.sap.ws.Get_Company_listResponseGet_Company_listResult get_Company_listResult) {
           this.get_Company_listResult = get_Company_listResult;
    }


    /**
     * Gets the get_Company_listResult value for this Get_Company_listResponse.
     * 
     * @return get_Company_listResult
     */
    public com.bses2.sap.ws.Get_Company_listResponseGet_Company_listResult getGet_Company_listResult() {
        return get_Company_listResult;
    }


    /**
     * Sets the get_Company_listResult value for this Get_Company_listResponse.
     * 
     * @param get_Company_listResult
     */
    public void setGet_Company_listResult(com.bses2.sap.ws.Get_Company_listResponseGet_Company_listResult get_Company_listResult) {
        this.get_Company_listResult = get_Company_listResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Company_listResponse)) return false;
        Get_Company_listResponse other = (Get_Company_listResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Company_listResult==null && other.getGet_Company_listResult()==null) || 
             (this.get_Company_listResult!=null &&
              this.get_Company_listResult.equals(other.getGet_Company_listResult())));
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
        if (getGet_Company_listResult() != null) {
            _hashCode += getGet_Company_listResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Company_listResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Company_listResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Company_listResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Company_listResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Company_listResponse>Get_Company_listResult"));
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
