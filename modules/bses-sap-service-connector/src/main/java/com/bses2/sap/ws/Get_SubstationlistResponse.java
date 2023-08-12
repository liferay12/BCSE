/**
 * Get_SubstationlistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_SubstationlistResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_SubstationlistResponseGet_SubstationlistResult get_SubstationlistResult;

    public Get_SubstationlistResponse() {
    }

    public Get_SubstationlistResponse(
           com.bses2.sap.ws.Get_SubstationlistResponseGet_SubstationlistResult get_SubstationlistResult) {
           this.get_SubstationlistResult = get_SubstationlistResult;
    }


    /**
     * Gets the get_SubstationlistResult value for this Get_SubstationlistResponse.
     * 
     * @return get_SubstationlistResult
     */
    public com.bses2.sap.ws.Get_SubstationlistResponseGet_SubstationlistResult getGet_SubstationlistResult() {
        return get_SubstationlistResult;
    }


    /**
     * Sets the get_SubstationlistResult value for this Get_SubstationlistResponse.
     * 
     * @param get_SubstationlistResult
     */
    public void setGet_SubstationlistResult(com.bses2.sap.ws.Get_SubstationlistResponseGet_SubstationlistResult get_SubstationlistResult) {
        this.get_SubstationlistResult = get_SubstationlistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_SubstationlistResponse)) return false;
        Get_SubstationlistResponse other = (Get_SubstationlistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_SubstationlistResult==null && other.getGet_SubstationlistResult()==null) || 
             (this.get_SubstationlistResult!=null &&
              this.get_SubstationlistResult.equals(other.getGet_SubstationlistResult())));
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
        if (getGet_SubstationlistResult() != null) {
            _hashCode += getGet_SubstationlistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_SubstationlistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_SubstationlistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_SubstationlistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_SubstationlistResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_SubstationlistResponse>Get_SubstationlistResult"));
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
