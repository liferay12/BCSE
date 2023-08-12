/**
 * Get_backfeedlist_dtResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_backfeedlist_dtResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_backfeedlist_dtResponseGet_backfeedlist_dtResult get_backfeedlist_dtResult;

    public Get_backfeedlist_dtResponse() {
    }

    public Get_backfeedlist_dtResponse(
           com.bses2.sap.ws.Get_backfeedlist_dtResponseGet_backfeedlist_dtResult get_backfeedlist_dtResult) {
           this.get_backfeedlist_dtResult = get_backfeedlist_dtResult;
    }


    /**
     * Gets the get_backfeedlist_dtResult value for this Get_backfeedlist_dtResponse.
     * 
     * @return get_backfeedlist_dtResult
     */
    public com.bses2.sap.ws.Get_backfeedlist_dtResponseGet_backfeedlist_dtResult getGet_backfeedlist_dtResult() {
        return get_backfeedlist_dtResult;
    }


    /**
     * Sets the get_backfeedlist_dtResult value for this Get_backfeedlist_dtResponse.
     * 
     * @param get_backfeedlist_dtResult
     */
    public void setGet_backfeedlist_dtResult(com.bses2.sap.ws.Get_backfeedlist_dtResponseGet_backfeedlist_dtResult get_backfeedlist_dtResult) {
        this.get_backfeedlist_dtResult = get_backfeedlist_dtResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_backfeedlist_dtResponse)) return false;
        Get_backfeedlist_dtResponse other = (Get_backfeedlist_dtResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_backfeedlist_dtResult==null && other.getGet_backfeedlist_dtResult()==null) || 
             (this.get_backfeedlist_dtResult!=null &&
              this.get_backfeedlist_dtResult.equals(other.getGet_backfeedlist_dtResult())));
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
        if (getGet_backfeedlist_dtResult() != null) {
            _hashCode += getGet_backfeedlist_dtResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_backfeedlist_dtResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_backfeedlist_dtResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_backfeedlist_dtResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_backfeedlist_dtResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_backfeedlist_dtResponse>Get_backfeedlist_dtResult"));
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
