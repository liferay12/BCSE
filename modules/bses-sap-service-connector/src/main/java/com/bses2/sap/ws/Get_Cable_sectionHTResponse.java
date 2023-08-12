/**
 * Get_Cable_sectionHTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Cable_sectionHTResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Cable_sectionHTResponseGet_Cable_sectionHTResult get_Cable_sectionHTResult;

    public Get_Cable_sectionHTResponse() {
    }

    public Get_Cable_sectionHTResponse(
           com.bses2.sap.ws.Get_Cable_sectionHTResponseGet_Cable_sectionHTResult get_Cable_sectionHTResult) {
           this.get_Cable_sectionHTResult = get_Cable_sectionHTResult;
    }


    /**
     * Gets the get_Cable_sectionHTResult value for this Get_Cable_sectionHTResponse.
     * 
     * @return get_Cable_sectionHTResult
     */
    public com.bses2.sap.ws.Get_Cable_sectionHTResponseGet_Cable_sectionHTResult getGet_Cable_sectionHTResult() {
        return get_Cable_sectionHTResult;
    }


    /**
     * Sets the get_Cable_sectionHTResult value for this Get_Cable_sectionHTResponse.
     * 
     * @param get_Cable_sectionHTResult
     */
    public void setGet_Cable_sectionHTResult(com.bses2.sap.ws.Get_Cable_sectionHTResponseGet_Cable_sectionHTResult get_Cable_sectionHTResult) {
        this.get_Cable_sectionHTResult = get_Cable_sectionHTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Cable_sectionHTResponse)) return false;
        Get_Cable_sectionHTResponse other = (Get_Cable_sectionHTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Cable_sectionHTResult==null && other.getGet_Cable_sectionHTResult()==null) || 
             (this.get_Cable_sectionHTResult!=null &&
              this.get_Cable_sectionHTResult.equals(other.getGet_Cable_sectionHTResult())));
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
        if (getGet_Cable_sectionHTResult() != null) {
            _hashCode += getGet_Cable_sectionHTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Cable_sectionHTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_sectionHTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Cable_sectionHTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_sectionHTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_sectionHTResponse>Get_Cable_sectionHTResult"));
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
