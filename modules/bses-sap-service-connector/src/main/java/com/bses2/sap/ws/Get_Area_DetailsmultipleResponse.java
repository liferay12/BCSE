/**
 * Get_Area_DetailsmultipleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Area_DetailsmultipleResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Area_DetailsmultipleResponseGet_Area_DetailsmultipleResult get_Area_DetailsmultipleResult;

    public Get_Area_DetailsmultipleResponse() {
    }

    public Get_Area_DetailsmultipleResponse(
           com.bses2.sap.ws.Get_Area_DetailsmultipleResponseGet_Area_DetailsmultipleResult get_Area_DetailsmultipleResult) {
           this.get_Area_DetailsmultipleResult = get_Area_DetailsmultipleResult;
    }


    /**
     * Gets the get_Area_DetailsmultipleResult value for this Get_Area_DetailsmultipleResponse.
     * 
     * @return get_Area_DetailsmultipleResult
     */
    public com.bses2.sap.ws.Get_Area_DetailsmultipleResponseGet_Area_DetailsmultipleResult getGet_Area_DetailsmultipleResult() {
        return get_Area_DetailsmultipleResult;
    }


    /**
     * Sets the get_Area_DetailsmultipleResult value for this Get_Area_DetailsmultipleResponse.
     * 
     * @param get_Area_DetailsmultipleResult
     */
    public void setGet_Area_DetailsmultipleResult(com.bses2.sap.ws.Get_Area_DetailsmultipleResponseGet_Area_DetailsmultipleResult get_Area_DetailsmultipleResult) {
        this.get_Area_DetailsmultipleResult = get_Area_DetailsmultipleResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Area_DetailsmultipleResponse)) return false;
        Get_Area_DetailsmultipleResponse other = (Get_Area_DetailsmultipleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Area_DetailsmultipleResult==null && other.getGet_Area_DetailsmultipleResult()==null) || 
             (this.get_Area_DetailsmultipleResult!=null &&
              this.get_Area_DetailsmultipleResult.equals(other.getGet_Area_DetailsmultipleResult())));
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
        if (getGet_Area_DetailsmultipleResult() != null) {
            _hashCode += getGet_Area_DetailsmultipleResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Area_DetailsmultipleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_DetailsmultipleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Area_DetailsmultipleResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_DetailsmultipleResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_DetailsmultipleResponse>Get_Area_DetailsmultipleResult"));
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
