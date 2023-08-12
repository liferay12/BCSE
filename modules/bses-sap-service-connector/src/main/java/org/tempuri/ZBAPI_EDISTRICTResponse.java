/**
 * ZBAPI_EDISTRICTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_EDISTRICTResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_EDISTRICTResponseZBAPI_EDISTRICTResult ZBAPI_EDISTRICTResult;

    public ZBAPI_EDISTRICTResponse() {
    }

    public ZBAPI_EDISTRICTResponse(
           org.tempuri.ZBAPI_EDISTRICTResponseZBAPI_EDISTRICTResult ZBAPI_EDISTRICTResult) {
           this.ZBAPI_EDISTRICTResult = ZBAPI_EDISTRICTResult;
    }


    /**
     * Gets the ZBAPI_EDISTRICTResult value for this ZBAPI_EDISTRICTResponse.
     * 
     * @return ZBAPI_EDISTRICTResult
     */
    public org.tempuri.ZBAPI_EDISTRICTResponseZBAPI_EDISTRICTResult getZBAPI_EDISTRICTResult() {
        return ZBAPI_EDISTRICTResult;
    }


    /**
     * Sets the ZBAPI_EDISTRICTResult value for this ZBAPI_EDISTRICTResponse.
     * 
     * @param ZBAPI_EDISTRICTResult
     */
    public void setZBAPI_EDISTRICTResult(org.tempuri.ZBAPI_EDISTRICTResponseZBAPI_EDISTRICTResult ZBAPI_EDISTRICTResult) {
        this.ZBAPI_EDISTRICTResult = ZBAPI_EDISTRICTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_EDISTRICTResponse)) return false;
        ZBAPI_EDISTRICTResponse other = (ZBAPI_EDISTRICTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_EDISTRICTResult==null && other.getZBAPI_EDISTRICTResult()==null) || 
             (this.ZBAPI_EDISTRICTResult!=null &&
              this.ZBAPI_EDISTRICTResult.equals(other.getZBAPI_EDISTRICTResult())));
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
        if (getZBAPI_EDISTRICTResult() != null) {
            _hashCode += getZBAPI_EDISTRICTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_EDISTRICTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_EDISTRICTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_EDISTRICTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_EDISTRICTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_EDISTRICTResponse>ZBAPI_EDISTRICTResult"));
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
