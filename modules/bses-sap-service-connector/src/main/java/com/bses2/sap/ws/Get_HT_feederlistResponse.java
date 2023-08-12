/**
 * Get_HT_feederlistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_HT_feederlistResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_HT_feederlistResponseGet_HT_feederlistResult get_HT_feederlistResult;

    public Get_HT_feederlistResponse() {
    }

    public Get_HT_feederlistResponse(
           com.bses2.sap.ws.Get_HT_feederlistResponseGet_HT_feederlistResult get_HT_feederlistResult) {
           this.get_HT_feederlistResult = get_HT_feederlistResult;
    }


    /**
     * Gets the get_HT_feederlistResult value for this Get_HT_feederlistResponse.
     * 
     * @return get_HT_feederlistResult
     */
    public com.bses2.sap.ws.Get_HT_feederlistResponseGet_HT_feederlistResult getGet_HT_feederlistResult() {
        return get_HT_feederlistResult;
    }


    /**
     * Sets the get_HT_feederlistResult value for this Get_HT_feederlistResponse.
     * 
     * @param get_HT_feederlistResult
     */
    public void setGet_HT_feederlistResult(com.bses2.sap.ws.Get_HT_feederlistResponseGet_HT_feederlistResult get_HT_feederlistResult) {
        this.get_HT_feederlistResult = get_HT_feederlistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_HT_feederlistResponse)) return false;
        Get_HT_feederlistResponse other = (Get_HT_feederlistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_HT_feederlistResult==null && other.getGet_HT_feederlistResult()==null) || 
             (this.get_HT_feederlistResult!=null &&
              this.get_HT_feederlistResult.equals(other.getGet_HT_feederlistResult())));
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
        if (getGet_HT_feederlistResult() != null) {
            _hashCode += getGet_HT_feederlistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_HT_feederlistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HT_feederlistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_HT_feederlistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HT_feederlistResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HT_feederlistResponse>Get_HT_feederlistResult"));
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
