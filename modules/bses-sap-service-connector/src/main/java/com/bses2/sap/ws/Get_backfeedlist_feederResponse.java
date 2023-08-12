/**
 * Get_backfeedlist_feederResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_backfeedlist_feederResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_backfeedlist_feederResponseGet_backfeedlist_feederResult get_backfeedlist_feederResult;

    public Get_backfeedlist_feederResponse() {
    }

    public Get_backfeedlist_feederResponse(
           com.bses2.sap.ws.Get_backfeedlist_feederResponseGet_backfeedlist_feederResult get_backfeedlist_feederResult) {
           this.get_backfeedlist_feederResult = get_backfeedlist_feederResult;
    }


    /**
     * Gets the get_backfeedlist_feederResult value for this Get_backfeedlist_feederResponse.
     * 
     * @return get_backfeedlist_feederResult
     */
    public com.bses2.sap.ws.Get_backfeedlist_feederResponseGet_backfeedlist_feederResult getGet_backfeedlist_feederResult() {
        return get_backfeedlist_feederResult;
    }


    /**
     * Sets the get_backfeedlist_feederResult value for this Get_backfeedlist_feederResponse.
     * 
     * @param get_backfeedlist_feederResult
     */
    public void setGet_backfeedlist_feederResult(com.bses2.sap.ws.Get_backfeedlist_feederResponseGet_backfeedlist_feederResult get_backfeedlist_feederResult) {
        this.get_backfeedlist_feederResult = get_backfeedlist_feederResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_backfeedlist_feederResponse)) return false;
        Get_backfeedlist_feederResponse other = (Get_backfeedlist_feederResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_backfeedlist_feederResult==null && other.getGet_backfeedlist_feederResult()==null) || 
             (this.get_backfeedlist_feederResult!=null &&
              this.get_backfeedlist_feederResult.equals(other.getGet_backfeedlist_feederResult())));
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
        if (getGet_backfeedlist_feederResult() != null) {
            _hashCode += getGet_backfeedlist_feederResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_backfeedlist_feederResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_backfeedlist_feederResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_backfeedlist_feederResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_backfeedlist_feederResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_backfeedlist_feederResponse>Get_backfeedlist_feederResult"));
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
