/**
 * Get_EHVgridlistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_EHVgridlistResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_EHVgridlistResponseGet_EHVgridlistResult get_EHVgridlistResult;

    public Get_EHVgridlistResponse() {
    }

    public Get_EHVgridlistResponse(
           com.bses2.sap.ws.Get_EHVgridlistResponseGet_EHVgridlistResult get_EHVgridlistResult) {
           this.get_EHVgridlistResult = get_EHVgridlistResult;
    }


    /**
     * Gets the get_EHVgridlistResult value for this Get_EHVgridlistResponse.
     * 
     * @return get_EHVgridlistResult
     */
    public com.bses2.sap.ws.Get_EHVgridlistResponseGet_EHVgridlistResult getGet_EHVgridlistResult() {
        return get_EHVgridlistResult;
    }


    /**
     * Sets the get_EHVgridlistResult value for this Get_EHVgridlistResponse.
     * 
     * @param get_EHVgridlistResult
     */
    public void setGet_EHVgridlistResult(com.bses2.sap.ws.Get_EHVgridlistResponseGet_EHVgridlistResult get_EHVgridlistResult) {
        this.get_EHVgridlistResult = get_EHVgridlistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_EHVgridlistResponse)) return false;
        Get_EHVgridlistResponse other = (Get_EHVgridlistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_EHVgridlistResult==null && other.getGet_EHVgridlistResult()==null) || 
             (this.get_EHVgridlistResult!=null &&
              this.get_EHVgridlistResult.equals(other.getGet_EHVgridlistResult())));
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
        if (getGet_EHVgridlistResult() != null) {
            _hashCode += getGet_EHVgridlistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_EHVgridlistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVgridlistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_EHVgridlistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVgridlistResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVgridlistResponse>Get_EHVgridlistResult"));
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
