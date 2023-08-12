/**
 * Get_SubstationDetailsby_divResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_SubstationDetailsby_divResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_SubstationDetailsby_divResponseGet_SubstationDetailsby_divResult get_SubstationDetailsby_divResult;

    public Get_SubstationDetailsby_divResponse() {
    }

    public Get_SubstationDetailsby_divResponse(
           com.bses2.sap.ws.Get_SubstationDetailsby_divResponseGet_SubstationDetailsby_divResult get_SubstationDetailsby_divResult) {
           this.get_SubstationDetailsby_divResult = get_SubstationDetailsby_divResult;
    }


    /**
     * Gets the get_SubstationDetailsby_divResult value for this Get_SubstationDetailsby_divResponse.
     * 
     * @return get_SubstationDetailsby_divResult
     */
    public com.bses2.sap.ws.Get_SubstationDetailsby_divResponseGet_SubstationDetailsby_divResult getGet_SubstationDetailsby_divResult() {
        return get_SubstationDetailsby_divResult;
    }


    /**
     * Sets the get_SubstationDetailsby_divResult value for this Get_SubstationDetailsby_divResponse.
     * 
     * @param get_SubstationDetailsby_divResult
     */
    public void setGet_SubstationDetailsby_divResult(com.bses2.sap.ws.Get_SubstationDetailsby_divResponseGet_SubstationDetailsby_divResult get_SubstationDetailsby_divResult) {
        this.get_SubstationDetailsby_divResult = get_SubstationDetailsby_divResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_SubstationDetailsby_divResponse)) return false;
        Get_SubstationDetailsby_divResponse other = (Get_SubstationDetailsby_divResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_SubstationDetailsby_divResult==null && other.getGet_SubstationDetailsby_divResult()==null) || 
             (this.get_SubstationDetailsby_divResult!=null &&
              this.get_SubstationDetailsby_divResult.equals(other.getGet_SubstationDetailsby_divResult())));
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
        if (getGet_SubstationDetailsby_divResult() != null) {
            _hashCode += getGet_SubstationDetailsby_divResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_SubstationDetailsby_divResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_SubstationDetailsby_divResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_SubstationDetailsby_divResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_SubstationDetailsby_divResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_SubstationDetailsby_divResponse>Get_SubstationDetailsby_divResult"));
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
