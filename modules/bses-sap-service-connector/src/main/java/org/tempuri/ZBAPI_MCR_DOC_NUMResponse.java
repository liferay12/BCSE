/**
 * ZBAPI_MCR_DOC_NUMResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_MCR_DOC_NUMResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_MCR_DOC_NUMResponseZBAPI_MCR_DOC_NUMResult ZBAPI_MCR_DOC_NUMResult;

    public ZBAPI_MCR_DOC_NUMResponse() {
    }

    public ZBAPI_MCR_DOC_NUMResponse(
           org.tempuri.ZBAPI_MCR_DOC_NUMResponseZBAPI_MCR_DOC_NUMResult ZBAPI_MCR_DOC_NUMResult) {
           this.ZBAPI_MCR_DOC_NUMResult = ZBAPI_MCR_DOC_NUMResult;
    }


    /**
     * Gets the ZBAPI_MCR_DOC_NUMResult value for this ZBAPI_MCR_DOC_NUMResponse.
     * 
     * @return ZBAPI_MCR_DOC_NUMResult
     */
    public org.tempuri.ZBAPI_MCR_DOC_NUMResponseZBAPI_MCR_DOC_NUMResult getZBAPI_MCR_DOC_NUMResult() {
        return ZBAPI_MCR_DOC_NUMResult;
    }


    /**
     * Sets the ZBAPI_MCR_DOC_NUMResult value for this ZBAPI_MCR_DOC_NUMResponse.
     * 
     * @param ZBAPI_MCR_DOC_NUMResult
     */
    public void setZBAPI_MCR_DOC_NUMResult(org.tempuri.ZBAPI_MCR_DOC_NUMResponseZBAPI_MCR_DOC_NUMResult ZBAPI_MCR_DOC_NUMResult) {
        this.ZBAPI_MCR_DOC_NUMResult = ZBAPI_MCR_DOC_NUMResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_MCR_DOC_NUMResponse)) return false;
        ZBAPI_MCR_DOC_NUMResponse other = (ZBAPI_MCR_DOC_NUMResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_MCR_DOC_NUMResult==null && other.getZBAPI_MCR_DOC_NUMResult()==null) || 
             (this.ZBAPI_MCR_DOC_NUMResult!=null &&
              this.ZBAPI_MCR_DOC_NUMResult.equals(other.getZBAPI_MCR_DOC_NUMResult())));
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
        if (getZBAPI_MCR_DOC_NUMResult() != null) {
            _hashCode += getZBAPI_MCR_DOC_NUMResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_MCR_DOC_NUMResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_MCR_DOC_NUMResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_MCR_DOC_NUMResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_MCR_DOC_NUMResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_MCR_DOC_NUMResponse>ZBAPI_MCR_DOC_NUMResult"));
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
