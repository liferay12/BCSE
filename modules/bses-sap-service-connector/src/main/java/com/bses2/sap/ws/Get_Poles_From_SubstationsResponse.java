/**
 * Get_Poles_From_SubstationsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Poles_From_SubstationsResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Poles_From_SubstationsResponseGet_Poles_From_SubstationsResult get_Poles_From_SubstationsResult;

    public Get_Poles_From_SubstationsResponse() {
    }

    public Get_Poles_From_SubstationsResponse(
           com.bses2.sap.ws.Get_Poles_From_SubstationsResponseGet_Poles_From_SubstationsResult get_Poles_From_SubstationsResult) {
           this.get_Poles_From_SubstationsResult = get_Poles_From_SubstationsResult;
    }


    /**
     * Gets the get_Poles_From_SubstationsResult value for this Get_Poles_From_SubstationsResponse.
     * 
     * @return get_Poles_From_SubstationsResult
     */
    public com.bses2.sap.ws.Get_Poles_From_SubstationsResponseGet_Poles_From_SubstationsResult getGet_Poles_From_SubstationsResult() {
        return get_Poles_From_SubstationsResult;
    }


    /**
     * Sets the get_Poles_From_SubstationsResult value for this Get_Poles_From_SubstationsResponse.
     * 
     * @param get_Poles_From_SubstationsResult
     */
    public void setGet_Poles_From_SubstationsResult(com.bses2.sap.ws.Get_Poles_From_SubstationsResponseGet_Poles_From_SubstationsResult get_Poles_From_SubstationsResult) {
        this.get_Poles_From_SubstationsResult = get_Poles_From_SubstationsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Poles_From_SubstationsResponse)) return false;
        Get_Poles_From_SubstationsResponse other = (Get_Poles_From_SubstationsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Poles_From_SubstationsResult==null && other.getGet_Poles_From_SubstationsResult()==null) || 
             (this.get_Poles_From_SubstationsResult!=null &&
              this.get_Poles_From_SubstationsResult.equals(other.getGet_Poles_From_SubstationsResult())));
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
        if (getGet_Poles_From_SubstationsResult() != null) {
            _hashCode += getGet_Poles_From_SubstationsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Poles_From_SubstationsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Poles_From_SubstationsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Poles_From_SubstationsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Poles_From_SubstationsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Poles_From_SubstationsResponse>Get_Poles_From_SubstationsResult"));
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
