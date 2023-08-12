/**
 * GetSubFaultCatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetSubFaultCatResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult getSubFaultCatResult;

    public GetSubFaultCatResponse() {
    }

    public GetSubFaultCatResponse(
           com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult getSubFaultCatResult) {
           this.getSubFaultCatResult = getSubFaultCatResult;
    }


    /**
     * Gets the getSubFaultCatResult value for this GetSubFaultCatResponse.
     * 
     * @return getSubFaultCatResult
     */
    public com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult getGetSubFaultCatResult() {
        return getSubFaultCatResult;
    }


    /**
     * Sets the getSubFaultCatResult value for this GetSubFaultCatResponse.
     * 
     * @param getSubFaultCatResult
     */
    public void setGetSubFaultCatResult(com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult getSubFaultCatResult) {
        this.getSubFaultCatResult = getSubFaultCatResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubFaultCatResponse)) return false;
        GetSubFaultCatResponse other = (GetSubFaultCatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSubFaultCatResult==null && other.getGetSubFaultCatResult()==null) || 
             (this.getSubFaultCatResult!=null &&
              this.getSubFaultCatResult.equals(other.getGetSubFaultCatResult())));
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
        if (getGetSubFaultCatResult() != null) {
            _hashCode += getGetSubFaultCatResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubFaultCatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubFaultCatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSubFaultCatResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubFaultCatResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubFaultCatResponse>GetSubFaultCatResult"));
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
