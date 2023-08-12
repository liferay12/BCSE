/**
 * ZBAPI_WHATSAPP_INTEGRATIONResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_WHATSAPP_INTEGRATIONResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_WHATSAPP_INTEGRATIONResponseZBAPI_WHATSAPP_INTEGRATIONResult ZBAPI_WHATSAPP_INTEGRATIONResult;

    public ZBAPI_WHATSAPP_INTEGRATIONResponse() {
    }

    public ZBAPI_WHATSAPP_INTEGRATIONResponse(
           org.tempuri.ZBAPI_WHATSAPP_INTEGRATIONResponseZBAPI_WHATSAPP_INTEGRATIONResult ZBAPI_WHATSAPP_INTEGRATIONResult) {
           this.ZBAPI_WHATSAPP_INTEGRATIONResult = ZBAPI_WHATSAPP_INTEGRATIONResult;
    }


    /**
     * Gets the ZBAPI_WHATSAPP_INTEGRATIONResult value for this ZBAPI_WHATSAPP_INTEGRATIONResponse.
     * 
     * @return ZBAPI_WHATSAPP_INTEGRATIONResult
     */
    public org.tempuri.ZBAPI_WHATSAPP_INTEGRATIONResponseZBAPI_WHATSAPP_INTEGRATIONResult getZBAPI_WHATSAPP_INTEGRATIONResult() {
        return ZBAPI_WHATSAPP_INTEGRATIONResult;
    }


    /**
     * Sets the ZBAPI_WHATSAPP_INTEGRATIONResult value for this ZBAPI_WHATSAPP_INTEGRATIONResponse.
     * 
     * @param ZBAPI_WHATSAPP_INTEGRATIONResult
     */
    public void setZBAPI_WHATSAPP_INTEGRATIONResult(org.tempuri.ZBAPI_WHATSAPP_INTEGRATIONResponseZBAPI_WHATSAPP_INTEGRATIONResult ZBAPI_WHATSAPP_INTEGRATIONResult) {
        this.ZBAPI_WHATSAPP_INTEGRATIONResult = ZBAPI_WHATSAPP_INTEGRATIONResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_WHATSAPP_INTEGRATIONResponse)) return false;
        ZBAPI_WHATSAPP_INTEGRATIONResponse other = (ZBAPI_WHATSAPP_INTEGRATIONResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_WHATSAPP_INTEGRATIONResult==null && other.getZBAPI_WHATSAPP_INTEGRATIONResult()==null) || 
             (this.ZBAPI_WHATSAPP_INTEGRATIONResult!=null &&
              this.ZBAPI_WHATSAPP_INTEGRATIONResult.equals(other.getZBAPI_WHATSAPP_INTEGRATIONResult())));
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
        if (getZBAPI_WHATSAPP_INTEGRATIONResult() != null) {
            _hashCode += getZBAPI_WHATSAPP_INTEGRATIONResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_WHATSAPP_INTEGRATIONResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_WHATSAPP_INTEGRATIONResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_WHATSAPP_INTEGRATIONResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_WHATSAPP_INTEGRATIONResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_WHATSAPP_INTEGRATIONResponse>ZBAPI_WHATSAPP_INTEGRATIONResult"));
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
