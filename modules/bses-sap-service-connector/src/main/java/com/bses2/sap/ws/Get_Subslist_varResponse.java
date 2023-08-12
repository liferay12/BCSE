/**
 * Get_Subslist_varResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Subslist_varResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Subslist_varResponseGet_Subslist_varResult get_Subslist_varResult;

    public Get_Subslist_varResponse() {
    }

    public Get_Subslist_varResponse(
           com.bses2.sap.ws.Get_Subslist_varResponseGet_Subslist_varResult get_Subslist_varResult) {
           this.get_Subslist_varResult = get_Subslist_varResult;
    }


    /**
     * Gets the get_Subslist_varResult value for this Get_Subslist_varResponse.
     * 
     * @return get_Subslist_varResult
     */
    public com.bses2.sap.ws.Get_Subslist_varResponseGet_Subslist_varResult getGet_Subslist_varResult() {
        return get_Subslist_varResult;
    }


    /**
     * Sets the get_Subslist_varResult value for this Get_Subslist_varResponse.
     * 
     * @param get_Subslist_varResult
     */
    public void setGet_Subslist_varResult(com.bses2.sap.ws.Get_Subslist_varResponseGet_Subslist_varResult get_Subslist_varResult) {
        this.get_Subslist_varResult = get_Subslist_varResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Subslist_varResponse)) return false;
        Get_Subslist_varResponse other = (Get_Subslist_varResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Subslist_varResult==null && other.getGet_Subslist_varResult()==null) || 
             (this.get_Subslist_varResult!=null &&
              this.get_Subslist_varResult.equals(other.getGet_Subslist_varResult())));
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
        if (getGet_Subslist_varResult() != null) {
            _hashCode += getGet_Subslist_varResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Subslist_varResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Subslist_varResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Subslist_varResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Subslist_varResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Subslist_varResponse>Get_Subslist_varResult"));
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
