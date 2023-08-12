/**
 * Ps_recommendation_approvalResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Ps_recommendation_approvalResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Ps_recommendation_approvalResponsePs_recommendation_approvalResult ps_recommendation_approvalResult;

    public Ps_recommendation_approvalResponse() {
    }

    public Ps_recommendation_approvalResponse(
           com.bses2.sap.ws.Ps_recommendation_approvalResponsePs_recommendation_approvalResult ps_recommendation_approvalResult) {
           this.ps_recommendation_approvalResult = ps_recommendation_approvalResult;
    }


    /**
     * Gets the ps_recommendation_approvalResult value for this Ps_recommendation_approvalResponse.
     * 
     * @return ps_recommendation_approvalResult
     */
    public com.bses2.sap.ws.Ps_recommendation_approvalResponsePs_recommendation_approvalResult getPs_recommendation_approvalResult() {
        return ps_recommendation_approvalResult;
    }


    /**
     * Sets the ps_recommendation_approvalResult value for this Ps_recommendation_approvalResponse.
     * 
     * @param ps_recommendation_approvalResult
     */
    public void setPs_recommendation_approvalResult(com.bses2.sap.ws.Ps_recommendation_approvalResponsePs_recommendation_approvalResult ps_recommendation_approvalResult) {
        this.ps_recommendation_approvalResult = ps_recommendation_approvalResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ps_recommendation_approvalResponse)) return false;
        Ps_recommendation_approvalResponse other = (Ps_recommendation_approvalResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ps_recommendation_approvalResult==null && other.getPs_recommendation_approvalResult()==null) || 
             (this.ps_recommendation_approvalResult!=null &&
              this.ps_recommendation_approvalResult.equals(other.getPs_recommendation_approvalResult())));
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
        if (getPs_recommendation_approvalResult() != null) {
            _hashCode += getPs_recommendation_approvalResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ps_recommendation_approvalResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ps_recommendation_approvalResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ps_recommendation_approvalResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ps_recommendation_approvalResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ps_recommendation_approvalResponse>ps_recommendation_approvalResult"));
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
