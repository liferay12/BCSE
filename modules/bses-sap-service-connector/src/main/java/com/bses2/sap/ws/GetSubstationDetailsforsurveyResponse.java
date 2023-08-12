/**
 * GetSubstationDetailsforsurveyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetSubstationDetailsforsurveyResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetSubstationDetailsforsurveyResponseGetSubstationDetailsforsurveyResult getSubstationDetailsforsurveyResult;

    public GetSubstationDetailsforsurveyResponse() {
    }

    public GetSubstationDetailsforsurveyResponse(
           com.bses2.sap.ws.GetSubstationDetailsforsurveyResponseGetSubstationDetailsforsurveyResult getSubstationDetailsforsurveyResult) {
           this.getSubstationDetailsforsurveyResult = getSubstationDetailsforsurveyResult;
    }


    /**
     * Gets the getSubstationDetailsforsurveyResult value for this GetSubstationDetailsforsurveyResponse.
     * 
     * @return getSubstationDetailsforsurveyResult
     */
    public com.bses2.sap.ws.GetSubstationDetailsforsurveyResponseGetSubstationDetailsforsurveyResult getGetSubstationDetailsforsurveyResult() {
        return getSubstationDetailsforsurveyResult;
    }


    /**
     * Sets the getSubstationDetailsforsurveyResult value for this GetSubstationDetailsforsurveyResponse.
     * 
     * @param getSubstationDetailsforsurveyResult
     */
    public void setGetSubstationDetailsforsurveyResult(com.bses2.sap.ws.GetSubstationDetailsforsurveyResponseGetSubstationDetailsforsurveyResult getSubstationDetailsforsurveyResult) {
        this.getSubstationDetailsforsurveyResult = getSubstationDetailsforsurveyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubstationDetailsforsurveyResponse)) return false;
        GetSubstationDetailsforsurveyResponse other = (GetSubstationDetailsforsurveyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSubstationDetailsforsurveyResult==null && other.getGetSubstationDetailsforsurveyResult()==null) || 
             (this.getSubstationDetailsforsurveyResult!=null &&
              this.getSubstationDetailsforsurveyResult.equals(other.getGetSubstationDetailsforsurveyResult())));
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
        if (getGetSubstationDetailsforsurveyResult() != null) {
            _hashCode += getGetSubstationDetailsforsurveyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubstationDetailsforsurveyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubstationDetailsforsurveyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSubstationDetailsforsurveyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubstationDetailsforsurveyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubstationDetailsforsurveyResponse>GetSubstationDetailsforsurveyResult"));
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
