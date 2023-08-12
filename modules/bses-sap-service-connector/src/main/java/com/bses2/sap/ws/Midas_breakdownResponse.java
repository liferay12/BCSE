/**
 * Midas_breakdownResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Midas_breakdownResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Midas_breakdownResponseMidas_breakdownResult midas_breakdownResult;

    public Midas_breakdownResponse() {
    }

    public Midas_breakdownResponse(
           com.bses2.sap.ws.Midas_breakdownResponseMidas_breakdownResult midas_breakdownResult) {
           this.midas_breakdownResult = midas_breakdownResult;
    }


    /**
     * Gets the midas_breakdownResult value for this Midas_breakdownResponse.
     * 
     * @return midas_breakdownResult
     */
    public com.bses2.sap.ws.Midas_breakdownResponseMidas_breakdownResult getMidas_breakdownResult() {
        return midas_breakdownResult;
    }


    /**
     * Sets the midas_breakdownResult value for this Midas_breakdownResponse.
     * 
     * @param midas_breakdownResult
     */
    public void setMidas_breakdownResult(com.bses2.sap.ws.Midas_breakdownResponseMidas_breakdownResult midas_breakdownResult) {
        this.midas_breakdownResult = midas_breakdownResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Midas_breakdownResponse)) return false;
        Midas_breakdownResponse other = (Midas_breakdownResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.midas_breakdownResult==null && other.getMidas_breakdownResult()==null) || 
             (this.midas_breakdownResult!=null &&
              this.midas_breakdownResult.equals(other.getMidas_breakdownResult())));
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
        if (getMidas_breakdownResult() != null) {
            _hashCode += getMidas_breakdownResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Midas_breakdownResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Midas_breakdownResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("midas_breakdownResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Midas_breakdownResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Midas_breakdownResponse>Midas_breakdownResult"));
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
