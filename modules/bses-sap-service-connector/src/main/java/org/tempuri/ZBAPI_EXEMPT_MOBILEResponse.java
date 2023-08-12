/**
 * ZBAPI_EXEMPT_MOBILEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_EXEMPT_MOBILEResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_EXEMPT_MOBILEResponseZBAPI_EXEMPT_MOBILEResult ZBAPI_EXEMPT_MOBILEResult;

    public ZBAPI_EXEMPT_MOBILEResponse() {
    }

    public ZBAPI_EXEMPT_MOBILEResponse(
           org.tempuri.ZBAPI_EXEMPT_MOBILEResponseZBAPI_EXEMPT_MOBILEResult ZBAPI_EXEMPT_MOBILEResult) {
           this.ZBAPI_EXEMPT_MOBILEResult = ZBAPI_EXEMPT_MOBILEResult;
    }


    /**
     * Gets the ZBAPI_EXEMPT_MOBILEResult value for this ZBAPI_EXEMPT_MOBILEResponse.
     * 
     * @return ZBAPI_EXEMPT_MOBILEResult
     */
    public org.tempuri.ZBAPI_EXEMPT_MOBILEResponseZBAPI_EXEMPT_MOBILEResult getZBAPI_EXEMPT_MOBILEResult() {
        return ZBAPI_EXEMPT_MOBILEResult;
    }


    /**
     * Sets the ZBAPI_EXEMPT_MOBILEResult value for this ZBAPI_EXEMPT_MOBILEResponse.
     * 
     * @param ZBAPI_EXEMPT_MOBILEResult
     */
    public void setZBAPI_EXEMPT_MOBILEResult(org.tempuri.ZBAPI_EXEMPT_MOBILEResponseZBAPI_EXEMPT_MOBILEResult ZBAPI_EXEMPT_MOBILEResult) {
        this.ZBAPI_EXEMPT_MOBILEResult = ZBAPI_EXEMPT_MOBILEResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_EXEMPT_MOBILEResponse)) return false;
        ZBAPI_EXEMPT_MOBILEResponse other = (ZBAPI_EXEMPT_MOBILEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_EXEMPT_MOBILEResult==null && other.getZBAPI_EXEMPT_MOBILEResult()==null) || 
             (this.ZBAPI_EXEMPT_MOBILEResult!=null &&
              this.ZBAPI_EXEMPT_MOBILEResult.equals(other.getZBAPI_EXEMPT_MOBILEResult())));
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
        if (getZBAPI_EXEMPT_MOBILEResult() != null) {
            _hashCode += getZBAPI_EXEMPT_MOBILEResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_EXEMPT_MOBILEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_EXEMPT_MOBILEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_EXEMPT_MOBILEResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_EXEMPT_MOBILEResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_EXEMPT_MOBILEResponse>ZBAPI_EXEMPT_MOBILEResult"));
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
