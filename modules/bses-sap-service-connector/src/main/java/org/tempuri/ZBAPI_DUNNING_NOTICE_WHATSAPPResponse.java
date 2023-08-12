/**
 * ZBAPI_DUNNING_NOTICE_WHATSAPPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_DUNNING_NOTICE_WHATSAPPResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_DUNNING_NOTICE_WHATSAPPResponseZBAPI_DUNNING_NOTICE_WHATSAPPResult ZBAPI_DUNNING_NOTICE_WHATSAPPResult;

    public ZBAPI_DUNNING_NOTICE_WHATSAPPResponse() {
    }

    public ZBAPI_DUNNING_NOTICE_WHATSAPPResponse(
           org.tempuri.ZBAPI_DUNNING_NOTICE_WHATSAPPResponseZBAPI_DUNNING_NOTICE_WHATSAPPResult ZBAPI_DUNNING_NOTICE_WHATSAPPResult) {
           this.ZBAPI_DUNNING_NOTICE_WHATSAPPResult = ZBAPI_DUNNING_NOTICE_WHATSAPPResult;
    }


    /**
     * Gets the ZBAPI_DUNNING_NOTICE_WHATSAPPResult value for this ZBAPI_DUNNING_NOTICE_WHATSAPPResponse.
     * 
     * @return ZBAPI_DUNNING_NOTICE_WHATSAPPResult
     */
    public org.tempuri.ZBAPI_DUNNING_NOTICE_WHATSAPPResponseZBAPI_DUNNING_NOTICE_WHATSAPPResult getZBAPI_DUNNING_NOTICE_WHATSAPPResult() {
        return ZBAPI_DUNNING_NOTICE_WHATSAPPResult;
    }


    /**
     * Sets the ZBAPI_DUNNING_NOTICE_WHATSAPPResult value for this ZBAPI_DUNNING_NOTICE_WHATSAPPResponse.
     * 
     * @param ZBAPI_DUNNING_NOTICE_WHATSAPPResult
     */
    public void setZBAPI_DUNNING_NOTICE_WHATSAPPResult(org.tempuri.ZBAPI_DUNNING_NOTICE_WHATSAPPResponseZBAPI_DUNNING_NOTICE_WHATSAPPResult ZBAPI_DUNNING_NOTICE_WHATSAPPResult) {
        this.ZBAPI_DUNNING_NOTICE_WHATSAPPResult = ZBAPI_DUNNING_NOTICE_WHATSAPPResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_DUNNING_NOTICE_WHATSAPPResponse)) return false;
        ZBAPI_DUNNING_NOTICE_WHATSAPPResponse other = (ZBAPI_DUNNING_NOTICE_WHATSAPPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_DUNNING_NOTICE_WHATSAPPResult==null && other.getZBAPI_DUNNING_NOTICE_WHATSAPPResult()==null) || 
             (this.ZBAPI_DUNNING_NOTICE_WHATSAPPResult!=null &&
              this.ZBAPI_DUNNING_NOTICE_WHATSAPPResult.equals(other.getZBAPI_DUNNING_NOTICE_WHATSAPPResult())));
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
        if (getZBAPI_DUNNING_NOTICE_WHATSAPPResult() != null) {
            _hashCode += getZBAPI_DUNNING_NOTICE_WHATSAPPResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_DUNNING_NOTICE_WHATSAPPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_DUNNING_NOTICE_WHATSAPPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_DUNNING_NOTICE_WHATSAPPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_DUNNING_NOTICE_WHATSAPPResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_DUNNING_NOTICE_WHATSAPPResponse>ZBAPI_DUNNING_NOTICE_WHATSAPPResult"));
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
