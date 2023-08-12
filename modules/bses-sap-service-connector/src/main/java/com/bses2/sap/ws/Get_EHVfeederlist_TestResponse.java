/**
 * Get_EHVfeederlist_TestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_EHVfeederlist_TestResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_EHVfeederlist_TestResponseGet_EHVfeederlist_TestResult get_EHVfeederlist_TestResult;

    public Get_EHVfeederlist_TestResponse() {
    }

    public Get_EHVfeederlist_TestResponse(
           com.bses2.sap.ws.Get_EHVfeederlist_TestResponseGet_EHVfeederlist_TestResult get_EHVfeederlist_TestResult) {
           this.get_EHVfeederlist_TestResult = get_EHVfeederlist_TestResult;
    }


    /**
     * Gets the get_EHVfeederlist_TestResult value for this Get_EHVfeederlist_TestResponse.
     * 
     * @return get_EHVfeederlist_TestResult
     */
    public com.bses2.sap.ws.Get_EHVfeederlist_TestResponseGet_EHVfeederlist_TestResult getGet_EHVfeederlist_TestResult() {
        return get_EHVfeederlist_TestResult;
    }


    /**
     * Sets the get_EHVfeederlist_TestResult value for this Get_EHVfeederlist_TestResponse.
     * 
     * @param get_EHVfeederlist_TestResult
     */
    public void setGet_EHVfeederlist_TestResult(com.bses2.sap.ws.Get_EHVfeederlist_TestResponseGet_EHVfeederlist_TestResult get_EHVfeederlist_TestResult) {
        this.get_EHVfeederlist_TestResult = get_EHVfeederlist_TestResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_EHVfeederlist_TestResponse)) return false;
        Get_EHVfeederlist_TestResponse other = (Get_EHVfeederlist_TestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_EHVfeederlist_TestResult==null && other.getGet_EHVfeederlist_TestResult()==null) || 
             (this.get_EHVfeederlist_TestResult!=null &&
              this.get_EHVfeederlist_TestResult.equals(other.getGet_EHVfeederlist_TestResult())));
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
        if (getGet_EHVfeederlist_TestResult() != null) {
            _hashCode += getGet_EHVfeederlist_TestResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_EHVfeederlist_TestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederlist_TestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_EHVfeederlist_TestResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVfeederlist_TestResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVfeederlist_TestResponse>Get_EHVfeederlist_TestResult"));
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
