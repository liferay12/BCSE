/**
 * Get_Area_listResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Area_listResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult get_Area_listResult;

    public Get_Area_listResponse() {
    }

    public Get_Area_listResponse(
           com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult get_Area_listResult) {
           this.get_Area_listResult = get_Area_listResult;
    }


    /**
     * Gets the get_Area_listResult value for this Get_Area_listResponse.
     * 
     * @return get_Area_listResult
     */
    public com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult getGet_Area_listResult() {
        return get_Area_listResult;
    }


    /**
     * Sets the get_Area_listResult value for this Get_Area_listResponse.
     * 
     * @param get_Area_listResult
     */
    public void setGet_Area_listResult(com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult get_Area_listResult) {
        this.get_Area_listResult = get_Area_listResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Area_listResponse)) return false;
        Get_Area_listResponse other = (Get_Area_listResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Area_listResult==null && other.getGet_Area_listResult()==null) || 
             (this.get_Area_listResult!=null &&
              this.get_Area_listResult.equals(other.getGet_Area_listResult())));
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
        if (getGet_Area_listResult() != null) {
            _hashCode += getGet_Area_listResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Area_listResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_listResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Area_listResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_listResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_listResponse>Get_Area_listResult"));
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
