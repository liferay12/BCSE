/**
 * ZBAPI_IDENTIFY_DUESResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_IDENTIFY_DUESResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_IDENTIFY_DUESResponseZBAPI_IDENTIFY_DUESResult ZBAPI_IDENTIFY_DUESResult;

    public ZBAPI_IDENTIFY_DUESResponse() {
    }

    public ZBAPI_IDENTIFY_DUESResponse(
           org.tempuri.ZBAPI_IDENTIFY_DUESResponseZBAPI_IDENTIFY_DUESResult ZBAPI_IDENTIFY_DUESResult) {
           this.ZBAPI_IDENTIFY_DUESResult = ZBAPI_IDENTIFY_DUESResult;
    }


    /**
     * Gets the ZBAPI_IDENTIFY_DUESResult value for this ZBAPI_IDENTIFY_DUESResponse.
     * 
     * @return ZBAPI_IDENTIFY_DUESResult
     */
    public org.tempuri.ZBAPI_IDENTIFY_DUESResponseZBAPI_IDENTIFY_DUESResult getZBAPI_IDENTIFY_DUESResult() {
        return ZBAPI_IDENTIFY_DUESResult;
    }


    /**
     * Sets the ZBAPI_IDENTIFY_DUESResult value for this ZBAPI_IDENTIFY_DUESResponse.
     * 
     * @param ZBAPI_IDENTIFY_DUESResult
     */
    public void setZBAPI_IDENTIFY_DUESResult(org.tempuri.ZBAPI_IDENTIFY_DUESResponseZBAPI_IDENTIFY_DUESResult ZBAPI_IDENTIFY_DUESResult) {
        this.ZBAPI_IDENTIFY_DUESResult = ZBAPI_IDENTIFY_DUESResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_IDENTIFY_DUESResponse)) return false;
        ZBAPI_IDENTIFY_DUESResponse other = (ZBAPI_IDENTIFY_DUESResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_IDENTIFY_DUESResult==null && other.getZBAPI_IDENTIFY_DUESResult()==null) || 
             (this.ZBAPI_IDENTIFY_DUESResult!=null &&
              this.ZBAPI_IDENTIFY_DUESResult.equals(other.getZBAPI_IDENTIFY_DUESResult())));
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
        if (getZBAPI_IDENTIFY_DUESResult() != null) {
            _hashCode += getZBAPI_IDENTIFY_DUESResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_IDENTIFY_DUESResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_IDENTIFY_DUESResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_IDENTIFY_DUESResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_IDENTIFY_DUESResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_IDENTIFY_DUESResponse>ZBAPI_IDENTIFY_DUESResult"));
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
