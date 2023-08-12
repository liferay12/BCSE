/**
 * BAPI_MTRREADDOC_GETLISTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BAPI_MTRREADDOC_GETLISTResponse  implements java.io.Serializable {
    private org.tempuri.BAPI_MTRREADDOC_GETLISTResponseBAPI_MTRREADDOC_GETLISTResult BAPI_MTRREADDOC_GETLISTResult;

    public BAPI_MTRREADDOC_GETLISTResponse() {
    }

    public BAPI_MTRREADDOC_GETLISTResponse(
           org.tempuri.BAPI_MTRREADDOC_GETLISTResponseBAPI_MTRREADDOC_GETLISTResult BAPI_MTRREADDOC_GETLISTResult) {
           this.BAPI_MTRREADDOC_GETLISTResult = BAPI_MTRREADDOC_GETLISTResult;
    }


    /**
     * Gets the BAPI_MTRREADDOC_GETLISTResult value for this BAPI_MTRREADDOC_GETLISTResponse.
     * 
     * @return BAPI_MTRREADDOC_GETLISTResult
     */
    public org.tempuri.BAPI_MTRREADDOC_GETLISTResponseBAPI_MTRREADDOC_GETLISTResult getBAPI_MTRREADDOC_GETLISTResult() {
        return BAPI_MTRREADDOC_GETLISTResult;
    }


    /**
     * Sets the BAPI_MTRREADDOC_GETLISTResult value for this BAPI_MTRREADDOC_GETLISTResponse.
     * 
     * @param BAPI_MTRREADDOC_GETLISTResult
     */
    public void setBAPI_MTRREADDOC_GETLISTResult(org.tempuri.BAPI_MTRREADDOC_GETLISTResponseBAPI_MTRREADDOC_GETLISTResult BAPI_MTRREADDOC_GETLISTResult) {
        this.BAPI_MTRREADDOC_GETLISTResult = BAPI_MTRREADDOC_GETLISTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BAPI_MTRREADDOC_GETLISTResponse)) return false;
        BAPI_MTRREADDOC_GETLISTResponse other = (BAPI_MTRREADDOC_GETLISTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BAPI_MTRREADDOC_GETLISTResult==null && other.getBAPI_MTRREADDOC_GETLISTResult()==null) || 
             (this.BAPI_MTRREADDOC_GETLISTResult!=null &&
              this.BAPI_MTRREADDOC_GETLISTResult.equals(other.getBAPI_MTRREADDOC_GETLISTResult())));
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
        if (getBAPI_MTRREADDOC_GETLISTResult() != null) {
            _hashCode += getBAPI_MTRREADDOC_GETLISTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BAPI_MTRREADDOC_GETLISTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BAPI_MTRREADDOC_GETLISTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAPI_MTRREADDOC_GETLISTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BAPI_MTRREADDOC_GETLISTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>BAPI_MTRREADDOC_GETLISTResponse>BAPI_MTRREADDOC_GETLISTResult"));
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
