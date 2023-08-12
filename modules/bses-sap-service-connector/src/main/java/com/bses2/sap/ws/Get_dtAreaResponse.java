/**
 * Get_dtAreaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_dtAreaResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_dtAreaResponseGet_dtAreaResult get_dtAreaResult;

    public Get_dtAreaResponse() {
    }

    public Get_dtAreaResponse(
           com.bses2.sap.ws.Get_dtAreaResponseGet_dtAreaResult get_dtAreaResult) {
           this.get_dtAreaResult = get_dtAreaResult;
    }


    /**
     * Gets the get_dtAreaResult value for this Get_dtAreaResponse.
     * 
     * @return get_dtAreaResult
     */
    public com.bses2.sap.ws.Get_dtAreaResponseGet_dtAreaResult getGet_dtAreaResult() {
        return get_dtAreaResult;
    }


    /**
     * Sets the get_dtAreaResult value for this Get_dtAreaResponse.
     * 
     * @param get_dtAreaResult
     */
    public void setGet_dtAreaResult(com.bses2.sap.ws.Get_dtAreaResponseGet_dtAreaResult get_dtAreaResult) {
        this.get_dtAreaResult = get_dtAreaResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_dtAreaResponse)) return false;
        Get_dtAreaResponse other = (Get_dtAreaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_dtAreaResult==null && other.getGet_dtAreaResult()==null) || 
             (this.get_dtAreaResult!=null &&
              this.get_dtAreaResult.equals(other.getGet_dtAreaResult())));
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
        if (getGet_dtAreaResult() != null) {
            _hashCode += getGet_dtAreaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_dtAreaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_dtAreaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_dtAreaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_dtAreaResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_dtAreaResponse>Get_dtAreaResult"));
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
