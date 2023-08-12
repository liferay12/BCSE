/**
 * Get_Cable_sectionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Cable_sectionResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Cable_sectionResponseGet_Cable_sectionResult get_Cable_sectionResult;

    public Get_Cable_sectionResponse() {
    }

    public Get_Cable_sectionResponse(
           com.bses2.sap.ws.Get_Cable_sectionResponseGet_Cable_sectionResult get_Cable_sectionResult) {
           this.get_Cable_sectionResult = get_Cable_sectionResult;
    }


    /**
     * Gets the get_Cable_sectionResult value for this Get_Cable_sectionResponse.
     * 
     * @return get_Cable_sectionResult
     */
    public com.bses2.sap.ws.Get_Cable_sectionResponseGet_Cable_sectionResult getGet_Cable_sectionResult() {
        return get_Cable_sectionResult;
    }


    /**
     * Sets the get_Cable_sectionResult value for this Get_Cable_sectionResponse.
     * 
     * @param get_Cable_sectionResult
     */
    public void setGet_Cable_sectionResult(com.bses2.sap.ws.Get_Cable_sectionResponseGet_Cable_sectionResult get_Cable_sectionResult) {
        this.get_Cable_sectionResult = get_Cable_sectionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Cable_sectionResponse)) return false;
        Get_Cable_sectionResponse other = (Get_Cable_sectionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Cable_sectionResult==null && other.getGet_Cable_sectionResult()==null) || 
             (this.get_Cable_sectionResult!=null &&
              this.get_Cable_sectionResult.equals(other.getGet_Cable_sectionResult())));
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
        if (getGet_Cable_sectionResult() != null) {
            _hashCode += getGet_Cable_sectionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Cable_sectionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_sectionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Cable_sectionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_sectionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_sectionResponse>Get_Cable_sectionResult"));
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
