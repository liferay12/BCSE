/**
 * Get_Area_DetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Area_DetailsResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Area_DetailsResponseGet_Area_DetailsResult get_Area_DetailsResult;

    public Get_Area_DetailsResponse() {
    }

    public Get_Area_DetailsResponse(
           com.bses2.sap.ws.Get_Area_DetailsResponseGet_Area_DetailsResult get_Area_DetailsResult) {
           this.get_Area_DetailsResult = get_Area_DetailsResult;
    }


    /**
     * Gets the get_Area_DetailsResult value for this Get_Area_DetailsResponse.
     * 
     * @return get_Area_DetailsResult
     */
    public com.bses2.sap.ws.Get_Area_DetailsResponseGet_Area_DetailsResult getGet_Area_DetailsResult() {
        return get_Area_DetailsResult;
    }


    /**
     * Sets the get_Area_DetailsResult value for this Get_Area_DetailsResponse.
     * 
     * @param get_Area_DetailsResult
     */
    public void setGet_Area_DetailsResult(com.bses2.sap.ws.Get_Area_DetailsResponseGet_Area_DetailsResult get_Area_DetailsResult) {
        this.get_Area_DetailsResult = get_Area_DetailsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Area_DetailsResponse)) return false;
        Get_Area_DetailsResponse other = (Get_Area_DetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Area_DetailsResult==null && other.getGet_Area_DetailsResult()==null) || 
             (this.get_Area_DetailsResult!=null &&
              this.get_Area_DetailsResult.equals(other.getGet_Area_DetailsResult())));
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
        if (getGet_Area_DetailsResult() != null) {
            _hashCode += getGet_Area_DetailsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Area_DetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_DetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Area_DetailsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_DetailsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_DetailsResponse>Get_Area_DetailsResult"));
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
