/**
 * Get_Cable_section_detailResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Cable_section_detailResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Cable_section_detailResponseGet_Cable_section_detailResult get_Cable_section_detailResult;

    public Get_Cable_section_detailResponse() {
    }

    public Get_Cable_section_detailResponse(
           com.bses2.sap.ws.Get_Cable_section_detailResponseGet_Cable_section_detailResult get_Cable_section_detailResult) {
           this.get_Cable_section_detailResult = get_Cable_section_detailResult;
    }


    /**
     * Gets the get_Cable_section_detailResult value for this Get_Cable_section_detailResponse.
     * 
     * @return get_Cable_section_detailResult
     */
    public com.bses2.sap.ws.Get_Cable_section_detailResponseGet_Cable_section_detailResult getGet_Cable_section_detailResult() {
        return get_Cable_section_detailResult;
    }


    /**
     * Sets the get_Cable_section_detailResult value for this Get_Cable_section_detailResponse.
     * 
     * @param get_Cable_section_detailResult
     */
    public void setGet_Cable_section_detailResult(com.bses2.sap.ws.Get_Cable_section_detailResponseGet_Cable_section_detailResult get_Cable_section_detailResult) {
        this.get_Cable_section_detailResult = get_Cable_section_detailResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Cable_section_detailResponse)) return false;
        Get_Cable_section_detailResponse other = (Get_Cable_section_detailResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Cable_section_detailResult==null && other.getGet_Cable_section_detailResult()==null) || 
             (this.get_Cable_section_detailResult!=null &&
              this.get_Cable_section_detailResult.equals(other.getGet_Cable_section_detailResult())));
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
        if (getGet_Cable_section_detailResult() != null) {
            _hashCode += getGet_Cable_section_detailResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Cable_section_detailResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_section_detailResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Cable_section_detailResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_section_detailResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_section_detailResponse>Get_Cable_section_detailResult"));
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
