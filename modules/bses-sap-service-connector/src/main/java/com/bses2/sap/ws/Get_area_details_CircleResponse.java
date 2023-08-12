/**
 * Get_area_details_CircleResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_area_details_CircleResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult get_area_details_CircleResult;

    public Get_area_details_CircleResponse() {
    }

    public Get_area_details_CircleResponse(
           com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult get_area_details_CircleResult) {
           this.get_area_details_CircleResult = get_area_details_CircleResult;
    }


    /**
     * Gets the get_area_details_CircleResult value for this Get_area_details_CircleResponse.
     * 
     * @return get_area_details_CircleResult
     */
    public com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult getGet_area_details_CircleResult() {
        return get_area_details_CircleResult;
    }


    /**
     * Sets the get_area_details_CircleResult value for this Get_area_details_CircleResponse.
     * 
     * @param get_area_details_CircleResult
     */
    public void setGet_area_details_CircleResult(com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult get_area_details_CircleResult) {
        this.get_area_details_CircleResult = get_area_details_CircleResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_area_details_CircleResponse)) return false;
        Get_area_details_CircleResponse other = (Get_area_details_CircleResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_area_details_CircleResult==null && other.getGet_area_details_CircleResult()==null) || 
             (this.get_area_details_CircleResult!=null &&
              this.get_area_details_CircleResult.equals(other.getGet_area_details_CircleResult())));
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
        if (getGet_area_details_CircleResult() != null) {
            _hashCode += getGet_area_details_CircleResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_area_details_CircleResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">get_area_details_CircleResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_area_details_CircleResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "get_area_details_CircleResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>get_area_details_CircleResponse>get_area_details_CircleResult"));
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
