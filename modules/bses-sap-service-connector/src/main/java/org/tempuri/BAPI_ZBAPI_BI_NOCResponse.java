/**
 * BAPI_ZBAPI_BI_NOCResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BAPI_ZBAPI_BI_NOCResponse  implements java.io.Serializable {
    private org.tempuri.BAPI_ZBAPI_BI_NOCResponseBAPI_ZBAPI_BI_NOCResult BAPI_ZBAPI_BI_NOCResult;

    public BAPI_ZBAPI_BI_NOCResponse() {
    }

    public BAPI_ZBAPI_BI_NOCResponse(
           org.tempuri.BAPI_ZBAPI_BI_NOCResponseBAPI_ZBAPI_BI_NOCResult BAPI_ZBAPI_BI_NOCResult) {
           this.BAPI_ZBAPI_BI_NOCResult = BAPI_ZBAPI_BI_NOCResult;
    }


    /**
     * Gets the BAPI_ZBAPI_BI_NOCResult value for this BAPI_ZBAPI_BI_NOCResponse.
     * 
     * @return BAPI_ZBAPI_BI_NOCResult
     */
    public org.tempuri.BAPI_ZBAPI_BI_NOCResponseBAPI_ZBAPI_BI_NOCResult getBAPI_ZBAPI_BI_NOCResult() {
        return BAPI_ZBAPI_BI_NOCResult;
    }


    /**
     * Sets the BAPI_ZBAPI_BI_NOCResult value for this BAPI_ZBAPI_BI_NOCResponse.
     * 
     * @param BAPI_ZBAPI_BI_NOCResult
     */
    public void setBAPI_ZBAPI_BI_NOCResult(org.tempuri.BAPI_ZBAPI_BI_NOCResponseBAPI_ZBAPI_BI_NOCResult BAPI_ZBAPI_BI_NOCResult) {
        this.BAPI_ZBAPI_BI_NOCResult = BAPI_ZBAPI_BI_NOCResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BAPI_ZBAPI_BI_NOCResponse)) return false;
        BAPI_ZBAPI_BI_NOCResponse other = (BAPI_ZBAPI_BI_NOCResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BAPI_ZBAPI_BI_NOCResult==null && other.getBAPI_ZBAPI_BI_NOCResult()==null) || 
             (this.BAPI_ZBAPI_BI_NOCResult!=null &&
              this.BAPI_ZBAPI_BI_NOCResult.equals(other.getBAPI_ZBAPI_BI_NOCResult())));
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
        if (getBAPI_ZBAPI_BI_NOCResult() != null) {
            _hashCode += getBAPI_ZBAPI_BI_NOCResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BAPI_ZBAPI_BI_NOCResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BAPI_ZBAPI_BI_NOCResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAPI_ZBAPI_BI_NOCResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BAPI_ZBAPI_BI_NOCResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>BAPI_ZBAPI_BI_NOCResponse>BAPI_ZBAPI_BI_NOCResult"));
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
