/**
 * Get_ltfeederlistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_ltfeederlistResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_ltfeederlistResponseGet_ltfeederlistResult get_ltfeederlistResult;

    public Get_ltfeederlistResponse() {
    }

    public Get_ltfeederlistResponse(
           com.bses2.sap.ws.Get_ltfeederlistResponseGet_ltfeederlistResult get_ltfeederlistResult) {
           this.get_ltfeederlistResult = get_ltfeederlistResult;
    }


    /**
     * Gets the get_ltfeederlistResult value for this Get_ltfeederlistResponse.
     * 
     * @return get_ltfeederlistResult
     */
    public com.bses2.sap.ws.Get_ltfeederlistResponseGet_ltfeederlistResult getGet_ltfeederlistResult() {
        return get_ltfeederlistResult;
    }


    /**
     * Sets the get_ltfeederlistResult value for this Get_ltfeederlistResponse.
     * 
     * @param get_ltfeederlistResult
     */
    public void setGet_ltfeederlistResult(com.bses2.sap.ws.Get_ltfeederlistResponseGet_ltfeederlistResult get_ltfeederlistResult) {
        this.get_ltfeederlistResult = get_ltfeederlistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_ltfeederlistResponse)) return false;
        Get_ltfeederlistResponse other = (Get_ltfeederlistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_ltfeederlistResult==null && other.getGet_ltfeederlistResult()==null) || 
             (this.get_ltfeederlistResult!=null &&
              this.get_ltfeederlistResult.equals(other.getGet_ltfeederlistResult())));
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
        if (getGet_ltfeederlistResult() != null) {
            _hashCode += getGet_ltfeederlistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_ltfeederlistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ltfeederlistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_ltfeederlistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ltfeederlistResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ltfeederlistResponse>Get_ltfeederlistResult"));
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
