/**
 * Get_Affected_ConsumerAndLoadResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Affected_ConsumerAndLoadResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponseGet_Affected_ConsumerAndLoadResult get_Affected_ConsumerAndLoadResult;

    public Get_Affected_ConsumerAndLoadResponse() {
    }

    public Get_Affected_ConsumerAndLoadResponse(
           com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponseGet_Affected_ConsumerAndLoadResult get_Affected_ConsumerAndLoadResult) {
           this.get_Affected_ConsumerAndLoadResult = get_Affected_ConsumerAndLoadResult;
    }


    /**
     * Gets the get_Affected_ConsumerAndLoadResult value for this Get_Affected_ConsumerAndLoadResponse.
     * 
     * @return get_Affected_ConsumerAndLoadResult
     */
    public com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponseGet_Affected_ConsumerAndLoadResult getGet_Affected_ConsumerAndLoadResult() {
        return get_Affected_ConsumerAndLoadResult;
    }


    /**
     * Sets the get_Affected_ConsumerAndLoadResult value for this Get_Affected_ConsumerAndLoadResponse.
     * 
     * @param get_Affected_ConsumerAndLoadResult
     */
    public void setGet_Affected_ConsumerAndLoadResult(com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponseGet_Affected_ConsumerAndLoadResult get_Affected_ConsumerAndLoadResult) {
        this.get_Affected_ConsumerAndLoadResult = get_Affected_ConsumerAndLoadResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Affected_ConsumerAndLoadResponse)) return false;
        Get_Affected_ConsumerAndLoadResponse other = (Get_Affected_ConsumerAndLoadResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Affected_ConsumerAndLoadResult==null && other.getGet_Affected_ConsumerAndLoadResult()==null) || 
             (this.get_Affected_ConsumerAndLoadResult!=null &&
              this.get_Affected_ConsumerAndLoadResult.equals(other.getGet_Affected_ConsumerAndLoadResult())));
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
        if (getGet_Affected_ConsumerAndLoadResult() != null) {
            _hashCode += getGet_Affected_ConsumerAndLoadResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Affected_ConsumerAndLoadResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Affected_ConsumerAndLoadResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Affected_ConsumerAndLoadResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Affected_ConsumerAndLoadResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Affected_ConsumerAndLoadResponse>Get_Affected_ConsumerAndLoadResult"));
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
