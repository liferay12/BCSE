/**
 * Get_Area_Details_forLcdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Area_Details_forLcdResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Area_Details_forLcdResponseGet_Area_Details_forLcdResult get_Area_Details_forLcdResult;

    public Get_Area_Details_forLcdResponse() {
    }

    public Get_Area_Details_forLcdResponse(
           com.bses2.sap.ws.Get_Area_Details_forLcdResponseGet_Area_Details_forLcdResult get_Area_Details_forLcdResult) {
           this.get_Area_Details_forLcdResult = get_Area_Details_forLcdResult;
    }


    /**
     * Gets the get_Area_Details_forLcdResult value for this Get_Area_Details_forLcdResponse.
     * 
     * @return get_Area_Details_forLcdResult
     */
    public com.bses2.sap.ws.Get_Area_Details_forLcdResponseGet_Area_Details_forLcdResult getGet_Area_Details_forLcdResult() {
        return get_Area_Details_forLcdResult;
    }


    /**
     * Sets the get_Area_Details_forLcdResult value for this Get_Area_Details_forLcdResponse.
     * 
     * @param get_Area_Details_forLcdResult
     */
    public void setGet_Area_Details_forLcdResult(com.bses2.sap.ws.Get_Area_Details_forLcdResponseGet_Area_Details_forLcdResult get_Area_Details_forLcdResult) {
        this.get_Area_Details_forLcdResult = get_Area_Details_forLcdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Area_Details_forLcdResponse)) return false;
        Get_Area_Details_forLcdResponse other = (Get_Area_Details_forLcdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Area_Details_forLcdResult==null && other.getGet_Area_Details_forLcdResult()==null) || 
             (this.get_Area_Details_forLcdResult!=null &&
              this.get_Area_Details_forLcdResult.equals(other.getGet_Area_Details_forLcdResult())));
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
        if (getGet_Area_Details_forLcdResult() != null) {
            _hashCode += getGet_Area_Details_forLcdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Area_Details_forLcdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_Details_forLcdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Area_Details_forLcdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_Details_forLcdResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_Details_forLcdResponse>Get_Area_Details_forLcdResult"));
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
