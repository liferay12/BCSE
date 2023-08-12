/**
 * ZBAPI_USTATUSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_USTATUSResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_USTATUSResponseZBAPI_USTATUSResult ZBAPI_USTATUSResult;

    public ZBAPI_USTATUSResponse() {
    }

    public ZBAPI_USTATUSResponse(
           org.tempuri.ZBAPI_USTATUSResponseZBAPI_USTATUSResult ZBAPI_USTATUSResult) {
           this.ZBAPI_USTATUSResult = ZBAPI_USTATUSResult;
    }


    /**
     * Gets the ZBAPI_USTATUSResult value for this ZBAPI_USTATUSResponse.
     * 
     * @return ZBAPI_USTATUSResult
     */
    public org.tempuri.ZBAPI_USTATUSResponseZBAPI_USTATUSResult getZBAPI_USTATUSResult() {
        return ZBAPI_USTATUSResult;
    }


    /**
     * Sets the ZBAPI_USTATUSResult value for this ZBAPI_USTATUSResponse.
     * 
     * @param ZBAPI_USTATUSResult
     */
    public void setZBAPI_USTATUSResult(org.tempuri.ZBAPI_USTATUSResponseZBAPI_USTATUSResult ZBAPI_USTATUSResult) {
        this.ZBAPI_USTATUSResult = ZBAPI_USTATUSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_USTATUSResponse)) return false;
        ZBAPI_USTATUSResponse other = (ZBAPI_USTATUSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_USTATUSResult==null && other.getZBAPI_USTATUSResult()==null) || 
             (this.ZBAPI_USTATUSResult!=null &&
              this.ZBAPI_USTATUSResult.equals(other.getZBAPI_USTATUSResult())));
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
        if (getZBAPI_USTATUSResult() != null) {
            _hashCode += getZBAPI_USTATUSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_USTATUSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_USTATUSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_USTATUSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_USTATUSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_USTATUSResponse>ZBAPI_USTATUSResult"));
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
