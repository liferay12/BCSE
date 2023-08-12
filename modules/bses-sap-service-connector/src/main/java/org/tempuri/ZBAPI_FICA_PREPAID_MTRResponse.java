/**
 * ZBAPI_FICA_PREPAID_MTRResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_FICA_PREPAID_MTRResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_FICA_PREPAID_MTRResponseZBAPI_FICA_PREPAID_MTRResult ZBAPI_FICA_PREPAID_MTRResult;

    public ZBAPI_FICA_PREPAID_MTRResponse() {
    }

    public ZBAPI_FICA_PREPAID_MTRResponse(
           org.tempuri.ZBAPI_FICA_PREPAID_MTRResponseZBAPI_FICA_PREPAID_MTRResult ZBAPI_FICA_PREPAID_MTRResult) {
           this.ZBAPI_FICA_PREPAID_MTRResult = ZBAPI_FICA_PREPAID_MTRResult;
    }


    /**
     * Gets the ZBAPI_FICA_PREPAID_MTRResult value for this ZBAPI_FICA_PREPAID_MTRResponse.
     * 
     * @return ZBAPI_FICA_PREPAID_MTRResult
     */
    public org.tempuri.ZBAPI_FICA_PREPAID_MTRResponseZBAPI_FICA_PREPAID_MTRResult getZBAPI_FICA_PREPAID_MTRResult() {
        return ZBAPI_FICA_PREPAID_MTRResult;
    }


    /**
     * Sets the ZBAPI_FICA_PREPAID_MTRResult value for this ZBAPI_FICA_PREPAID_MTRResponse.
     * 
     * @param ZBAPI_FICA_PREPAID_MTRResult
     */
    public void setZBAPI_FICA_PREPAID_MTRResult(org.tempuri.ZBAPI_FICA_PREPAID_MTRResponseZBAPI_FICA_PREPAID_MTRResult ZBAPI_FICA_PREPAID_MTRResult) {
        this.ZBAPI_FICA_PREPAID_MTRResult = ZBAPI_FICA_PREPAID_MTRResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_FICA_PREPAID_MTRResponse)) return false;
        ZBAPI_FICA_PREPAID_MTRResponse other = (ZBAPI_FICA_PREPAID_MTRResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_FICA_PREPAID_MTRResult==null && other.getZBAPI_FICA_PREPAID_MTRResult()==null) || 
             (this.ZBAPI_FICA_PREPAID_MTRResult!=null &&
              this.ZBAPI_FICA_PREPAID_MTRResult.equals(other.getZBAPI_FICA_PREPAID_MTRResult())));
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
        if (getZBAPI_FICA_PREPAID_MTRResult() != null) {
            _hashCode += getZBAPI_FICA_PREPAID_MTRResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_FICA_PREPAID_MTRResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_FICA_PREPAID_MTRResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_FICA_PREPAID_MTRResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_FICA_PREPAID_MTRResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_FICA_PREPAID_MTRResponse>ZBAPI_FICA_PREPAID_MTRResult"));
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
