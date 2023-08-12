/**
 * Get_Cable_section_CloseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Cable_section_CloseResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Cable_section_CloseResponseGet_Cable_section_CloseResult get_Cable_section_CloseResult;

    public Get_Cable_section_CloseResponse() {
    }

    public Get_Cable_section_CloseResponse(
           com.bses2.sap.ws.Get_Cable_section_CloseResponseGet_Cable_section_CloseResult get_Cable_section_CloseResult) {
           this.get_Cable_section_CloseResult = get_Cable_section_CloseResult;
    }


    /**
     * Gets the get_Cable_section_CloseResult value for this Get_Cable_section_CloseResponse.
     * 
     * @return get_Cable_section_CloseResult
     */
    public com.bses2.sap.ws.Get_Cable_section_CloseResponseGet_Cable_section_CloseResult getGet_Cable_section_CloseResult() {
        return get_Cable_section_CloseResult;
    }


    /**
     * Sets the get_Cable_section_CloseResult value for this Get_Cable_section_CloseResponse.
     * 
     * @param get_Cable_section_CloseResult
     */
    public void setGet_Cable_section_CloseResult(com.bses2.sap.ws.Get_Cable_section_CloseResponseGet_Cable_section_CloseResult get_Cable_section_CloseResult) {
        this.get_Cable_section_CloseResult = get_Cable_section_CloseResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Cable_section_CloseResponse)) return false;
        Get_Cable_section_CloseResponse other = (Get_Cable_section_CloseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Cable_section_CloseResult==null && other.getGet_Cable_section_CloseResult()==null) || 
             (this.get_Cable_section_CloseResult!=null &&
              this.get_Cable_section_CloseResult.equals(other.getGet_Cable_section_CloseResult())));
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
        if (getGet_Cable_section_CloseResult() != null) {
            _hashCode += getGet_Cable_section_CloseResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Cable_section_CloseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_section_CloseResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Cable_section_CloseResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_section_CloseResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_section_CloseResponse>Get_Cable_section_CloseResult"));
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
