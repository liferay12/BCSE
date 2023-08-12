/**
 * ZBAPI_CS_MOBILE_APPCNTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CS_MOBILE_APPCNTResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_CS_MOBILE_APPCNTResponseZBAPI_CS_MOBILE_APPCNTResult ZBAPI_CS_MOBILE_APPCNTResult;

    public ZBAPI_CS_MOBILE_APPCNTResponse() {
    }

    public ZBAPI_CS_MOBILE_APPCNTResponse(
           org.tempuri.ZBAPI_CS_MOBILE_APPCNTResponseZBAPI_CS_MOBILE_APPCNTResult ZBAPI_CS_MOBILE_APPCNTResult) {
           this.ZBAPI_CS_MOBILE_APPCNTResult = ZBAPI_CS_MOBILE_APPCNTResult;
    }


    /**
     * Gets the ZBAPI_CS_MOBILE_APPCNTResult value for this ZBAPI_CS_MOBILE_APPCNTResponse.
     * 
     * @return ZBAPI_CS_MOBILE_APPCNTResult
     */
    public org.tempuri.ZBAPI_CS_MOBILE_APPCNTResponseZBAPI_CS_MOBILE_APPCNTResult getZBAPI_CS_MOBILE_APPCNTResult() {
        return ZBAPI_CS_MOBILE_APPCNTResult;
    }


    /**
     * Sets the ZBAPI_CS_MOBILE_APPCNTResult value for this ZBAPI_CS_MOBILE_APPCNTResponse.
     * 
     * @param ZBAPI_CS_MOBILE_APPCNTResult
     */
    public void setZBAPI_CS_MOBILE_APPCNTResult(org.tempuri.ZBAPI_CS_MOBILE_APPCNTResponseZBAPI_CS_MOBILE_APPCNTResult ZBAPI_CS_MOBILE_APPCNTResult) {
        this.ZBAPI_CS_MOBILE_APPCNTResult = ZBAPI_CS_MOBILE_APPCNTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CS_MOBILE_APPCNTResponse)) return false;
        ZBAPI_CS_MOBILE_APPCNTResponse other = (ZBAPI_CS_MOBILE_APPCNTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_CS_MOBILE_APPCNTResult==null && other.getZBAPI_CS_MOBILE_APPCNTResult()==null) || 
             (this.ZBAPI_CS_MOBILE_APPCNTResult!=null &&
              this.ZBAPI_CS_MOBILE_APPCNTResult.equals(other.getZBAPI_CS_MOBILE_APPCNTResult())));
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
        if (getZBAPI_CS_MOBILE_APPCNTResult() != null) {
            _hashCode += getZBAPI_CS_MOBILE_APPCNTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CS_MOBILE_APPCNTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CS_MOBILE_APPCNTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_CS_MOBILE_APPCNTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_CS_MOBILE_APPCNTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_CS_MOBILE_APPCNTResponse>ZBAPI_CS_MOBILE_APPCNTResult"));
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
