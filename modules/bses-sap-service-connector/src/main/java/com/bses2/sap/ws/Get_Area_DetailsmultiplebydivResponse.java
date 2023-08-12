/**
 * Get_Area_DetailsmultiplebydivResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Area_DetailsmultiplebydivResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponseGet_Area_DetailsmultiplebydivResult get_Area_DetailsmultiplebydivResult;

    public Get_Area_DetailsmultiplebydivResponse() {
    }

    public Get_Area_DetailsmultiplebydivResponse(
           com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponseGet_Area_DetailsmultiplebydivResult get_Area_DetailsmultiplebydivResult) {
           this.get_Area_DetailsmultiplebydivResult = get_Area_DetailsmultiplebydivResult;
    }


    /**
     * Gets the get_Area_DetailsmultiplebydivResult value for this Get_Area_DetailsmultiplebydivResponse.
     * 
     * @return get_Area_DetailsmultiplebydivResult
     */
    public com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponseGet_Area_DetailsmultiplebydivResult getGet_Area_DetailsmultiplebydivResult() {
        return get_Area_DetailsmultiplebydivResult;
    }


    /**
     * Sets the get_Area_DetailsmultiplebydivResult value for this Get_Area_DetailsmultiplebydivResponse.
     * 
     * @param get_Area_DetailsmultiplebydivResult
     */
    public void setGet_Area_DetailsmultiplebydivResult(com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponseGet_Area_DetailsmultiplebydivResult get_Area_DetailsmultiplebydivResult) {
        this.get_Area_DetailsmultiplebydivResult = get_Area_DetailsmultiplebydivResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Area_DetailsmultiplebydivResponse)) return false;
        Get_Area_DetailsmultiplebydivResponse other = (Get_Area_DetailsmultiplebydivResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Area_DetailsmultiplebydivResult==null && other.getGet_Area_DetailsmultiplebydivResult()==null) || 
             (this.get_Area_DetailsmultiplebydivResult!=null &&
              this.get_Area_DetailsmultiplebydivResult.equals(other.getGet_Area_DetailsmultiplebydivResult())));
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
        if (getGet_Area_DetailsmultiplebydivResult() != null) {
            _hashCode += getGet_Area_DetailsmultiplebydivResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Area_DetailsmultiplebydivResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_DetailsmultiplebydivResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Area_DetailsmultiplebydivResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_DetailsmultiplebydivResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_DetailsmultiplebydivResponse>Get_Area_DetailsmultiplebydivResult"));
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
