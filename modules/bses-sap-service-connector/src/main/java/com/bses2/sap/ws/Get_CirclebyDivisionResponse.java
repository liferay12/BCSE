/**
 * Get_CirclebyDivisionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_CirclebyDivisionResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_CirclebyDivisionResponseGet_CirclebyDivisionResult get_CirclebyDivisionResult;

    public Get_CirclebyDivisionResponse() {
    }

    public Get_CirclebyDivisionResponse(
           com.bses2.sap.ws.Get_CirclebyDivisionResponseGet_CirclebyDivisionResult get_CirclebyDivisionResult) {
           this.get_CirclebyDivisionResult = get_CirclebyDivisionResult;
    }


    /**
     * Gets the get_CirclebyDivisionResult value for this Get_CirclebyDivisionResponse.
     * 
     * @return get_CirclebyDivisionResult
     */
    public com.bses2.sap.ws.Get_CirclebyDivisionResponseGet_CirclebyDivisionResult getGet_CirclebyDivisionResult() {
        return get_CirclebyDivisionResult;
    }


    /**
     * Sets the get_CirclebyDivisionResult value for this Get_CirclebyDivisionResponse.
     * 
     * @param get_CirclebyDivisionResult
     */
    public void setGet_CirclebyDivisionResult(com.bses2.sap.ws.Get_CirclebyDivisionResponseGet_CirclebyDivisionResult get_CirclebyDivisionResult) {
        this.get_CirclebyDivisionResult = get_CirclebyDivisionResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_CirclebyDivisionResponse)) return false;
        Get_CirclebyDivisionResponse other = (Get_CirclebyDivisionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_CirclebyDivisionResult==null && other.getGet_CirclebyDivisionResult()==null) || 
             (this.get_CirclebyDivisionResult!=null &&
              this.get_CirclebyDivisionResult.equals(other.getGet_CirclebyDivisionResult())));
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
        if (getGet_CirclebyDivisionResult() != null) {
            _hashCode += getGet_CirclebyDivisionResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_CirclebyDivisionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_CirclebyDivisionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_CirclebyDivisionResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_CirclebyDivisionResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_CirclebyDivisionResponse>Get_CirclebyDivisionResult"));
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
