/**
 * Get_EHV11FeederlistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_EHV11FeederlistResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_EHV11FeederlistResponseGet_EHV11FeederlistResult get_EHV11FeederlistResult;

    public Get_EHV11FeederlistResponse() {
    }

    public Get_EHV11FeederlistResponse(
           com.bses2.sap.ws.Get_EHV11FeederlistResponseGet_EHV11FeederlistResult get_EHV11FeederlistResult) {
           this.get_EHV11FeederlistResult = get_EHV11FeederlistResult;
    }


    /**
     * Gets the get_EHV11FeederlistResult value for this Get_EHV11FeederlistResponse.
     * 
     * @return get_EHV11FeederlistResult
     */
    public com.bses2.sap.ws.Get_EHV11FeederlistResponseGet_EHV11FeederlistResult getGet_EHV11FeederlistResult() {
        return get_EHV11FeederlistResult;
    }


    /**
     * Sets the get_EHV11FeederlistResult value for this Get_EHV11FeederlistResponse.
     * 
     * @param get_EHV11FeederlistResult
     */
    public void setGet_EHV11FeederlistResult(com.bses2.sap.ws.Get_EHV11FeederlistResponseGet_EHV11FeederlistResult get_EHV11FeederlistResult) {
        this.get_EHV11FeederlistResult = get_EHV11FeederlistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_EHV11FeederlistResponse)) return false;
        Get_EHV11FeederlistResponse other = (Get_EHV11FeederlistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_EHV11FeederlistResult==null && other.getGet_EHV11FeederlistResult()==null) || 
             (this.get_EHV11FeederlistResult!=null &&
              this.get_EHV11FeederlistResult.equals(other.getGet_EHV11FeederlistResult())));
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
        if (getGet_EHV11FeederlistResult() != null) {
            _hashCode += getGet_EHV11FeederlistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_EHV11FeederlistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHV11feederlistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_EHV11FeederlistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHV11feederlistResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHV11feederlistResponse>Get_EHV11feederlistResult"));
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
