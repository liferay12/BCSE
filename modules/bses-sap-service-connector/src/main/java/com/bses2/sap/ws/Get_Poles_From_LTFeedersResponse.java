/**
 * Get_Poles_From_LTFeedersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Poles_From_LTFeedersResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Poles_From_LTFeedersResponseGet_Poles_From_LTFeedersResult get_Poles_From_LTFeedersResult;

    public Get_Poles_From_LTFeedersResponse() {
    }

    public Get_Poles_From_LTFeedersResponse(
           com.bses2.sap.ws.Get_Poles_From_LTFeedersResponseGet_Poles_From_LTFeedersResult get_Poles_From_LTFeedersResult) {
           this.get_Poles_From_LTFeedersResult = get_Poles_From_LTFeedersResult;
    }


    /**
     * Gets the get_Poles_From_LTFeedersResult value for this Get_Poles_From_LTFeedersResponse.
     * 
     * @return get_Poles_From_LTFeedersResult
     */
    public com.bses2.sap.ws.Get_Poles_From_LTFeedersResponseGet_Poles_From_LTFeedersResult getGet_Poles_From_LTFeedersResult() {
        return get_Poles_From_LTFeedersResult;
    }


    /**
     * Sets the get_Poles_From_LTFeedersResult value for this Get_Poles_From_LTFeedersResponse.
     * 
     * @param get_Poles_From_LTFeedersResult
     */
    public void setGet_Poles_From_LTFeedersResult(com.bses2.sap.ws.Get_Poles_From_LTFeedersResponseGet_Poles_From_LTFeedersResult get_Poles_From_LTFeedersResult) {
        this.get_Poles_From_LTFeedersResult = get_Poles_From_LTFeedersResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Poles_From_LTFeedersResponse)) return false;
        Get_Poles_From_LTFeedersResponse other = (Get_Poles_From_LTFeedersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Poles_From_LTFeedersResult==null && other.getGet_Poles_From_LTFeedersResult()==null) || 
             (this.get_Poles_From_LTFeedersResult!=null &&
              this.get_Poles_From_LTFeedersResult.equals(other.getGet_Poles_From_LTFeedersResult())));
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
        if (getGet_Poles_From_LTFeedersResult() != null) {
            _hashCode += getGet_Poles_From_LTFeedersResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Poles_From_LTFeedersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Poles_From_LTFeedersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Poles_From_LTFeedersResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Poles_From_LTFeedersResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Poles_From_LTFeedersResponse>Get_Poles_From_LTFeedersResult"));
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
