/**
 * GetFaultTypesFromCatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetFaultTypesFromCatResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetFaultTypesFromCatResponseGetFaultTypesFromCatResult getFaultTypesFromCatResult;

    public GetFaultTypesFromCatResponse() {
    }

    public GetFaultTypesFromCatResponse(
           com.bses2.sap.ws.GetFaultTypesFromCatResponseGetFaultTypesFromCatResult getFaultTypesFromCatResult) {
           this.getFaultTypesFromCatResult = getFaultTypesFromCatResult;
    }


    /**
     * Gets the getFaultTypesFromCatResult value for this GetFaultTypesFromCatResponse.
     * 
     * @return getFaultTypesFromCatResult
     */
    public com.bses2.sap.ws.GetFaultTypesFromCatResponseGetFaultTypesFromCatResult getGetFaultTypesFromCatResult() {
        return getFaultTypesFromCatResult;
    }


    /**
     * Sets the getFaultTypesFromCatResult value for this GetFaultTypesFromCatResponse.
     * 
     * @param getFaultTypesFromCatResult
     */
    public void setGetFaultTypesFromCatResult(com.bses2.sap.ws.GetFaultTypesFromCatResponseGetFaultTypesFromCatResult getFaultTypesFromCatResult) {
        this.getFaultTypesFromCatResult = getFaultTypesFromCatResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFaultTypesFromCatResponse)) return false;
        GetFaultTypesFromCatResponse other = (GetFaultTypesFromCatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFaultTypesFromCatResult==null && other.getGetFaultTypesFromCatResult()==null) || 
             (this.getFaultTypesFromCatResult!=null &&
              this.getFaultTypesFromCatResult.equals(other.getGetFaultTypesFromCatResult())));
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
        if (getGetFaultTypesFromCatResult() != null) {
            _hashCode += getGetFaultTypesFromCatResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFaultTypesFromCatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetFaultTypesFromCatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFaultTypesFromCatResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFaultTypesFromCatResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetFaultTypesFromCatResponse>GetFaultTypesFromCatResult"));
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
