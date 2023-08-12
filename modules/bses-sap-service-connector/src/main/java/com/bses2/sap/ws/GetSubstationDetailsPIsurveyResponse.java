/**
 * GetSubstationDetailsPIsurveyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetSubstationDetailsPIsurveyResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponseGetSubstationDetailsPIsurveyResult getSubstationDetailsPIsurveyResult;

    public GetSubstationDetailsPIsurveyResponse() {
    }

    public GetSubstationDetailsPIsurveyResponse(
           com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponseGetSubstationDetailsPIsurveyResult getSubstationDetailsPIsurveyResult) {
           this.getSubstationDetailsPIsurveyResult = getSubstationDetailsPIsurveyResult;
    }


    /**
     * Gets the getSubstationDetailsPIsurveyResult value for this GetSubstationDetailsPIsurveyResponse.
     * 
     * @return getSubstationDetailsPIsurveyResult
     */
    public com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponseGetSubstationDetailsPIsurveyResult getGetSubstationDetailsPIsurveyResult() {
        return getSubstationDetailsPIsurveyResult;
    }


    /**
     * Sets the getSubstationDetailsPIsurveyResult value for this GetSubstationDetailsPIsurveyResponse.
     * 
     * @param getSubstationDetailsPIsurveyResult
     */
    public void setGetSubstationDetailsPIsurveyResult(com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponseGetSubstationDetailsPIsurveyResult getSubstationDetailsPIsurveyResult) {
        this.getSubstationDetailsPIsurveyResult = getSubstationDetailsPIsurveyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSubstationDetailsPIsurveyResponse)) return false;
        GetSubstationDetailsPIsurveyResponse other = (GetSubstationDetailsPIsurveyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSubstationDetailsPIsurveyResult==null && other.getGetSubstationDetailsPIsurveyResult()==null) || 
             (this.getSubstationDetailsPIsurveyResult!=null &&
              this.getSubstationDetailsPIsurveyResult.equals(other.getGetSubstationDetailsPIsurveyResult())));
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
        if (getGetSubstationDetailsPIsurveyResult() != null) {
            _hashCode += getGetSubstationDetailsPIsurveyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubstationDetailsPIsurveyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubstationDetailsPIsurveyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSubstationDetailsPIsurveyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubstationDetailsPIsurveyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubstationDetailsPIsurveyResponse>GetSubstationDetailsPIsurveyResult"));
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
