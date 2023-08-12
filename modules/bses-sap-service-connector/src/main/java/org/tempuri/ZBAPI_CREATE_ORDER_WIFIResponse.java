/**
 * ZBAPI_CREATE_ORDER_WIFIResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CREATE_ORDER_WIFIResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_CREATE_ORDER_WIFIResponseZBAPI_CREATE_ORDER_WIFIResult ZBAPI_CREATE_ORDER_WIFIResult;

    public ZBAPI_CREATE_ORDER_WIFIResponse() {
    }

    public ZBAPI_CREATE_ORDER_WIFIResponse(
           org.tempuri.ZBAPI_CREATE_ORDER_WIFIResponseZBAPI_CREATE_ORDER_WIFIResult ZBAPI_CREATE_ORDER_WIFIResult) {
           this.ZBAPI_CREATE_ORDER_WIFIResult = ZBAPI_CREATE_ORDER_WIFIResult;
    }


    /**
     * Gets the ZBAPI_CREATE_ORDER_WIFIResult value for this ZBAPI_CREATE_ORDER_WIFIResponse.
     * 
     * @return ZBAPI_CREATE_ORDER_WIFIResult
     */
    public org.tempuri.ZBAPI_CREATE_ORDER_WIFIResponseZBAPI_CREATE_ORDER_WIFIResult getZBAPI_CREATE_ORDER_WIFIResult() {
        return ZBAPI_CREATE_ORDER_WIFIResult;
    }


    /**
     * Sets the ZBAPI_CREATE_ORDER_WIFIResult value for this ZBAPI_CREATE_ORDER_WIFIResponse.
     * 
     * @param ZBAPI_CREATE_ORDER_WIFIResult
     */
    public void setZBAPI_CREATE_ORDER_WIFIResult(org.tempuri.ZBAPI_CREATE_ORDER_WIFIResponseZBAPI_CREATE_ORDER_WIFIResult ZBAPI_CREATE_ORDER_WIFIResult) {
        this.ZBAPI_CREATE_ORDER_WIFIResult = ZBAPI_CREATE_ORDER_WIFIResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CREATE_ORDER_WIFIResponse)) return false;
        ZBAPI_CREATE_ORDER_WIFIResponse other = (ZBAPI_CREATE_ORDER_WIFIResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_CREATE_ORDER_WIFIResult==null && other.getZBAPI_CREATE_ORDER_WIFIResult()==null) || 
             (this.ZBAPI_CREATE_ORDER_WIFIResult!=null &&
              this.ZBAPI_CREATE_ORDER_WIFIResult.equals(other.getZBAPI_CREATE_ORDER_WIFIResult())));
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
        if (getZBAPI_CREATE_ORDER_WIFIResult() != null) {
            _hashCode += getZBAPI_CREATE_ORDER_WIFIResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CREATE_ORDER_WIFIResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CREATE_ORDER_WIFIResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_CREATE_ORDER_WIFIResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_CREATE_ORDER_WIFIResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_CREATE_ORDER_WIFIResponse>ZBAPI_CREATE_ORDER_WIFIResult"));
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
