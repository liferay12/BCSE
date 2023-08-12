/**
 * Get_feederpillarResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_feederpillarResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_feederpillarResponseGet_feederpillarResult get_feederpillarResult;

    public Get_feederpillarResponse() {
    }

    public Get_feederpillarResponse(
           com.bses2.sap.ws.Get_feederpillarResponseGet_feederpillarResult get_feederpillarResult) {
           this.get_feederpillarResult = get_feederpillarResult;
    }


    /**
     * Gets the get_feederpillarResult value for this Get_feederpillarResponse.
     * 
     * @return get_feederpillarResult
     */
    public com.bses2.sap.ws.Get_feederpillarResponseGet_feederpillarResult getGet_feederpillarResult() {
        return get_feederpillarResult;
    }


    /**
     * Sets the get_feederpillarResult value for this Get_feederpillarResponse.
     * 
     * @param get_feederpillarResult
     */
    public void setGet_feederpillarResult(com.bses2.sap.ws.Get_feederpillarResponseGet_feederpillarResult get_feederpillarResult) {
        this.get_feederpillarResult = get_feederpillarResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_feederpillarResponse)) return false;
        Get_feederpillarResponse other = (Get_feederpillarResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_feederpillarResult==null && other.getGet_feederpillarResult()==null) || 
             (this.get_feederpillarResult!=null &&
              this.get_feederpillarResult.equals(other.getGet_feederpillarResult())));
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
        if (getGet_feederpillarResult() != null) {
            _hashCode += getGet_feederpillarResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_feederpillarResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">get_feederpillarResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_feederpillarResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "get_feederpillarResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>get_feederpillarResponse>get_feederpillarResult"));
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
