/**
 * Get_EHVPTlistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_EHVPTlistResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_EHVPTlistResponseGet_EHVPTlistResult get_EHVPTlistResult;

    public Get_EHVPTlistResponse() {
    }

    public Get_EHVPTlistResponse(
           com.bses2.sap.ws.Get_EHVPTlistResponseGet_EHVPTlistResult get_EHVPTlistResult) {
           this.get_EHVPTlistResult = get_EHVPTlistResult;
    }


    /**
     * Gets the get_EHVPTlistResult value for this Get_EHVPTlistResponse.
     * 
     * @return get_EHVPTlistResult
     */
    public com.bses2.sap.ws.Get_EHVPTlistResponseGet_EHVPTlistResult getGet_EHVPTlistResult() {
        return get_EHVPTlistResult;
    }


    /**
     * Sets the get_EHVPTlistResult value for this Get_EHVPTlistResponse.
     * 
     * @param get_EHVPTlistResult
     */
    public void setGet_EHVPTlistResult(com.bses2.sap.ws.Get_EHVPTlistResponseGet_EHVPTlistResult get_EHVPTlistResult) {
        this.get_EHVPTlistResult = get_EHVPTlistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_EHVPTlistResponse)) return false;
        Get_EHVPTlistResponse other = (Get_EHVPTlistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_EHVPTlistResult==null && other.getGet_EHVPTlistResult()==null) || 
             (this.get_EHVPTlistResult!=null &&
              this.get_EHVPTlistResult.equals(other.getGet_EHVPTlistResult())));
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
        if (getGet_EHVPTlistResult() != null) {
            _hashCode += getGet_EHVPTlistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_EHVPTlistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVPTlistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_EHVPTlistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVPTlistResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVPTlistResponse>Get_EHVPTlistResult"));
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
