/**
 * Get_Area_Details_forconstituencyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Area_Details_forconstituencyResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Area_Details_forconstituencyResponseGet_Area_Details_forconstituencyResult get_Area_Details_forconstituencyResult;

    public Get_Area_Details_forconstituencyResponse() {
    }

    public Get_Area_Details_forconstituencyResponse(
           com.bses2.sap.ws.Get_Area_Details_forconstituencyResponseGet_Area_Details_forconstituencyResult get_Area_Details_forconstituencyResult) {
           this.get_Area_Details_forconstituencyResult = get_Area_Details_forconstituencyResult;
    }


    /**
     * Gets the get_Area_Details_forconstituencyResult value for this Get_Area_Details_forconstituencyResponse.
     * 
     * @return get_Area_Details_forconstituencyResult
     */
    public com.bses2.sap.ws.Get_Area_Details_forconstituencyResponseGet_Area_Details_forconstituencyResult getGet_Area_Details_forconstituencyResult() {
        return get_Area_Details_forconstituencyResult;
    }


    /**
     * Sets the get_Area_Details_forconstituencyResult value for this Get_Area_Details_forconstituencyResponse.
     * 
     * @param get_Area_Details_forconstituencyResult
     */
    public void setGet_Area_Details_forconstituencyResult(com.bses2.sap.ws.Get_Area_Details_forconstituencyResponseGet_Area_Details_forconstituencyResult get_Area_Details_forconstituencyResult) {
        this.get_Area_Details_forconstituencyResult = get_Area_Details_forconstituencyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Area_Details_forconstituencyResponse)) return false;
        Get_Area_Details_forconstituencyResponse other = (Get_Area_Details_forconstituencyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Area_Details_forconstituencyResult==null && other.getGet_Area_Details_forconstituencyResult()==null) || 
             (this.get_Area_Details_forconstituencyResult!=null &&
              this.get_Area_Details_forconstituencyResult.equals(other.getGet_Area_Details_forconstituencyResult())));
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
        if (getGet_Area_Details_forconstituencyResult() != null) {
            _hashCode += getGet_Area_Details_forconstituencyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Area_Details_forconstituencyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_Details_forconstituencyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Area_Details_forconstituencyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_Details_forconstituencyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_Details_forconstituencyResponse>Get_Area_Details_forconstituencyResult"));
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
