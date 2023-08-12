/**
 * ZBAPI_PREPAID_RTGS_CommonResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_PREPAID_RTGS_CommonResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_PREPAID_RTGS_CommonResponseZBAPI_PREPAID_RTGS_CommonResult ZBAPI_PREPAID_RTGS_CommonResult;

    public ZBAPI_PREPAID_RTGS_CommonResponse() {
    }

    public ZBAPI_PREPAID_RTGS_CommonResponse(
           org.tempuri.ZBAPI_PREPAID_RTGS_CommonResponseZBAPI_PREPAID_RTGS_CommonResult ZBAPI_PREPAID_RTGS_CommonResult) {
           this.ZBAPI_PREPAID_RTGS_CommonResult = ZBAPI_PREPAID_RTGS_CommonResult;
    }


    /**
     * Gets the ZBAPI_PREPAID_RTGS_CommonResult value for this ZBAPI_PREPAID_RTGS_CommonResponse.
     * 
     * @return ZBAPI_PREPAID_RTGS_CommonResult
     */
    public org.tempuri.ZBAPI_PREPAID_RTGS_CommonResponseZBAPI_PREPAID_RTGS_CommonResult getZBAPI_PREPAID_RTGS_CommonResult() {
        return ZBAPI_PREPAID_RTGS_CommonResult;
    }


    /**
     * Sets the ZBAPI_PREPAID_RTGS_CommonResult value for this ZBAPI_PREPAID_RTGS_CommonResponse.
     * 
     * @param ZBAPI_PREPAID_RTGS_CommonResult
     */
    public void setZBAPI_PREPAID_RTGS_CommonResult(org.tempuri.ZBAPI_PREPAID_RTGS_CommonResponseZBAPI_PREPAID_RTGS_CommonResult ZBAPI_PREPAID_RTGS_CommonResult) {
        this.ZBAPI_PREPAID_RTGS_CommonResult = ZBAPI_PREPAID_RTGS_CommonResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_PREPAID_RTGS_CommonResponse)) return false;
        ZBAPI_PREPAID_RTGS_CommonResponse other = (ZBAPI_PREPAID_RTGS_CommonResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_PREPAID_RTGS_CommonResult==null && other.getZBAPI_PREPAID_RTGS_CommonResult()==null) || 
             (this.ZBAPI_PREPAID_RTGS_CommonResult!=null &&
              this.ZBAPI_PREPAID_RTGS_CommonResult.equals(other.getZBAPI_PREPAID_RTGS_CommonResult())));
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
        if (getZBAPI_PREPAID_RTGS_CommonResult() != null) {
            _hashCode += getZBAPI_PREPAID_RTGS_CommonResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_PREPAID_RTGS_CommonResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_PREPAID_RTGS_CommonResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_PREPAID_RTGS_CommonResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_PREPAID_RTGS_CommonResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_PREPAID_RTGS_CommonResponse>ZBAPI_PREPAID_RTGS_CommonResult"));
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
