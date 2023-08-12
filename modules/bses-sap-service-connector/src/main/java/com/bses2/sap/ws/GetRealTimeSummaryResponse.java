/**
 * GetRealTimeSummaryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetRealTimeSummaryResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetRealTimeSummaryResponseGetRealTimeSummaryResult getRealTimeSummaryResult;

    public GetRealTimeSummaryResponse() {
    }

    public GetRealTimeSummaryResponse(
           com.bses2.sap.ws.GetRealTimeSummaryResponseGetRealTimeSummaryResult getRealTimeSummaryResult) {
           this.getRealTimeSummaryResult = getRealTimeSummaryResult;
    }


    /**
     * Gets the getRealTimeSummaryResult value for this GetRealTimeSummaryResponse.
     * 
     * @return getRealTimeSummaryResult
     */
    public com.bses2.sap.ws.GetRealTimeSummaryResponseGetRealTimeSummaryResult getGetRealTimeSummaryResult() {
        return getRealTimeSummaryResult;
    }


    /**
     * Sets the getRealTimeSummaryResult value for this GetRealTimeSummaryResponse.
     * 
     * @param getRealTimeSummaryResult
     */
    public void setGetRealTimeSummaryResult(com.bses2.sap.ws.GetRealTimeSummaryResponseGetRealTimeSummaryResult getRealTimeSummaryResult) {
        this.getRealTimeSummaryResult = getRealTimeSummaryResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRealTimeSummaryResponse)) return false;
        GetRealTimeSummaryResponse other = (GetRealTimeSummaryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRealTimeSummaryResult==null && other.getGetRealTimeSummaryResult()==null) || 
             (this.getRealTimeSummaryResult!=null &&
              this.getRealTimeSummaryResult.equals(other.getGetRealTimeSummaryResult())));
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
        if (getGetRealTimeSummaryResult() != null) {
            _hashCode += getGetRealTimeSummaryResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRealTimeSummaryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getRealTimeSummaryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRealTimeSummaryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getRealTimeSummaryResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getRealTimeSummaryResponse>getRealTimeSummaryResult"));
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
