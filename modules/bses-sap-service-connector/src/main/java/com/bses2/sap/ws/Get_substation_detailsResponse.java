/**
 * Get_substation_detailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_substation_detailsResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_substation_detailsResponseGet_substation_detailsResult get_substation_detailsResult;

    public Get_substation_detailsResponse() {
    }

    public Get_substation_detailsResponse(
           com.bses2.sap.ws.Get_substation_detailsResponseGet_substation_detailsResult get_substation_detailsResult) {
           this.get_substation_detailsResult = get_substation_detailsResult;
    }


    /**
     * Gets the get_substation_detailsResult value for this Get_substation_detailsResponse.
     * 
     * @return get_substation_detailsResult
     */
    public com.bses2.sap.ws.Get_substation_detailsResponseGet_substation_detailsResult getGet_substation_detailsResult() {
        return get_substation_detailsResult;
    }


    /**
     * Sets the get_substation_detailsResult value for this Get_substation_detailsResponse.
     * 
     * @param get_substation_detailsResult
     */
    public void setGet_substation_detailsResult(com.bses2.sap.ws.Get_substation_detailsResponseGet_substation_detailsResult get_substation_detailsResult) {
        this.get_substation_detailsResult = get_substation_detailsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_substation_detailsResponse)) return false;
        Get_substation_detailsResponse other = (Get_substation_detailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_substation_detailsResult==null && other.getGet_substation_detailsResult()==null) || 
             (this.get_substation_detailsResult!=null &&
              this.get_substation_detailsResult.equals(other.getGet_substation_detailsResult())));
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
        if (getGet_substation_detailsResult() != null) {
            _hashCode += getGet_substation_detailsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_substation_detailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_substation_detailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_substation_detailsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_substation_detailsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_substation_detailsResponse>Get_substation_detailsResult"));
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
