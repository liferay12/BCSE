/**
 * CloseComplaintResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class CloseComplaintResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.CloseComplaintResponseCloseComplaintResult closeComplaintResult;

    public CloseComplaintResponse() {
    }

    public CloseComplaintResponse(
           com.bses2.sap.ws.CloseComplaintResponseCloseComplaintResult closeComplaintResult) {
           this.closeComplaintResult = closeComplaintResult;
    }


    /**
     * Gets the closeComplaintResult value for this CloseComplaintResponse.
     * 
     * @return closeComplaintResult
     */
    public com.bses2.sap.ws.CloseComplaintResponseCloseComplaintResult getCloseComplaintResult() {
        return closeComplaintResult;
    }


    /**
     * Sets the closeComplaintResult value for this CloseComplaintResponse.
     * 
     * @param closeComplaintResult
     */
    public void setCloseComplaintResult(com.bses2.sap.ws.CloseComplaintResponseCloseComplaintResult closeComplaintResult) {
        this.closeComplaintResult = closeComplaintResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CloseComplaintResponse)) return false;
        CloseComplaintResponse other = (CloseComplaintResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.closeComplaintResult==null && other.getCloseComplaintResult()==null) || 
             (this.closeComplaintResult!=null &&
              this.closeComplaintResult.equals(other.getCloseComplaintResult())));
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
        if (getCloseComplaintResult() != null) {
            _hashCode += getCloseComplaintResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CloseComplaintResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CloseComplaintResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeComplaintResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CloseComplaintResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>CloseComplaintResponse>CloseComplaintResult"));
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
