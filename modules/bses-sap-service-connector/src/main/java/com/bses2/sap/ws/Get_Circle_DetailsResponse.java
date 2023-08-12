/**
 * Get_Circle_DetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Circle_DetailsResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Circle_DetailsResponseGet_Circle_DetailsResult get_Circle_DetailsResult;

    public Get_Circle_DetailsResponse() {
    }

    public Get_Circle_DetailsResponse(
           com.bses2.sap.ws.Get_Circle_DetailsResponseGet_Circle_DetailsResult get_Circle_DetailsResult) {
           this.get_Circle_DetailsResult = get_Circle_DetailsResult;
    }


    /**
     * Gets the get_Circle_DetailsResult value for this Get_Circle_DetailsResponse.
     * 
     * @return get_Circle_DetailsResult
     */
    public com.bses2.sap.ws.Get_Circle_DetailsResponseGet_Circle_DetailsResult getGet_Circle_DetailsResult() {
        return get_Circle_DetailsResult;
    }


    /**
     * Sets the get_Circle_DetailsResult value for this Get_Circle_DetailsResponse.
     * 
     * @param get_Circle_DetailsResult
     */
    public void setGet_Circle_DetailsResult(com.bses2.sap.ws.Get_Circle_DetailsResponseGet_Circle_DetailsResult get_Circle_DetailsResult) {
        this.get_Circle_DetailsResult = get_Circle_DetailsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Circle_DetailsResponse)) return false;
        Get_Circle_DetailsResponse other = (Get_Circle_DetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Circle_DetailsResult==null && other.getGet_Circle_DetailsResult()==null) || 
             (this.get_Circle_DetailsResult!=null &&
              this.get_Circle_DetailsResult.equals(other.getGet_Circle_DetailsResult())));
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
        if (getGet_Circle_DetailsResult() != null) {
            _hashCode += getGet_Circle_DetailsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Circle_DetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Circle_DetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Circle_DetailsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Circle_DetailsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Circle_DetailsResponse>Get_Circle_DetailsResult"));
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
