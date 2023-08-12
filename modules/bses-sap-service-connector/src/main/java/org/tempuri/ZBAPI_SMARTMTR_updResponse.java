/**
 * ZBAPI_SMARTMTR_updResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_SMARTMTR_updResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_SMARTMTR_updResponseZBAPI_SMARTMTR_updResult ZBAPI_SMARTMTR_updResult;

    public ZBAPI_SMARTMTR_updResponse() {
    }

    public ZBAPI_SMARTMTR_updResponse(
           org.tempuri.ZBAPI_SMARTMTR_updResponseZBAPI_SMARTMTR_updResult ZBAPI_SMARTMTR_updResult) {
           this.ZBAPI_SMARTMTR_updResult = ZBAPI_SMARTMTR_updResult;
    }


    /**
     * Gets the ZBAPI_SMARTMTR_updResult value for this ZBAPI_SMARTMTR_updResponse.
     * 
     * @return ZBAPI_SMARTMTR_updResult
     */
    public org.tempuri.ZBAPI_SMARTMTR_updResponseZBAPI_SMARTMTR_updResult getZBAPI_SMARTMTR_updResult() {
        return ZBAPI_SMARTMTR_updResult;
    }


    /**
     * Sets the ZBAPI_SMARTMTR_updResult value for this ZBAPI_SMARTMTR_updResponse.
     * 
     * @param ZBAPI_SMARTMTR_updResult
     */
    public void setZBAPI_SMARTMTR_updResult(org.tempuri.ZBAPI_SMARTMTR_updResponseZBAPI_SMARTMTR_updResult ZBAPI_SMARTMTR_updResult) {
        this.ZBAPI_SMARTMTR_updResult = ZBAPI_SMARTMTR_updResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_SMARTMTR_updResponse)) return false;
        ZBAPI_SMARTMTR_updResponse other = (ZBAPI_SMARTMTR_updResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_SMARTMTR_updResult==null && other.getZBAPI_SMARTMTR_updResult()==null) || 
             (this.ZBAPI_SMARTMTR_updResult!=null &&
              this.ZBAPI_SMARTMTR_updResult.equals(other.getZBAPI_SMARTMTR_updResult())));
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
        if (getZBAPI_SMARTMTR_updResult() != null) {
            _hashCode += getZBAPI_SMARTMTR_updResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_SMARTMTR_updResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_SMARTMTR_updResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_SMARTMTR_updResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_SMARTMTR_updResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_SMARTMTR_updResponse>ZBAPI_SMARTMTR_updResult"));
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
