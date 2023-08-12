/**
 * Get_HTgridlistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_HTgridlistResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_HTgridlistResponseGet_HTgridlistResult get_HTgridlistResult;

    public Get_HTgridlistResponse() {
    }

    public Get_HTgridlistResponse(
           com.bses2.sap.ws.Get_HTgridlistResponseGet_HTgridlistResult get_HTgridlistResult) {
           this.get_HTgridlistResult = get_HTgridlistResult;
    }


    /**
     * Gets the get_HTgridlistResult value for this Get_HTgridlistResponse.
     * 
     * @return get_HTgridlistResult
     */
    public com.bses2.sap.ws.Get_HTgridlistResponseGet_HTgridlistResult getGet_HTgridlistResult() {
        return get_HTgridlistResult;
    }


    /**
     * Sets the get_HTgridlistResult value for this Get_HTgridlistResponse.
     * 
     * @param get_HTgridlistResult
     */
    public void setGet_HTgridlistResult(com.bses2.sap.ws.Get_HTgridlistResponseGet_HTgridlistResult get_HTgridlistResult) {
        this.get_HTgridlistResult = get_HTgridlistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_HTgridlistResponse)) return false;
        Get_HTgridlistResponse other = (Get_HTgridlistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_HTgridlistResult==null && other.getGet_HTgridlistResult()==null) || 
             (this.get_HTgridlistResult!=null &&
              this.get_HTgridlistResult.equals(other.getGet_HTgridlistResult())));
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
        if (getGet_HTgridlistResult() != null) {
            _hashCode += getGet_HTgridlistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_HTgridlistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HTgridlistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_HTgridlistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HTgridlistResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HTgridlistResponse>Get_HTgridlistResult"));
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
