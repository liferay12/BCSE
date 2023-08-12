/**
 * ZBAPI_PAY_IN_SLIPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_PAY_IN_SLIPResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_PAY_IN_SLIPResponseZBAPI_PAY_IN_SLIPResult ZBAPI_PAY_IN_SLIPResult;

    public ZBAPI_PAY_IN_SLIPResponse() {
    }

    public ZBAPI_PAY_IN_SLIPResponse(
           org.tempuri.ZBAPI_PAY_IN_SLIPResponseZBAPI_PAY_IN_SLIPResult ZBAPI_PAY_IN_SLIPResult) {
           this.ZBAPI_PAY_IN_SLIPResult = ZBAPI_PAY_IN_SLIPResult;
    }


    /**
     * Gets the ZBAPI_PAY_IN_SLIPResult value for this ZBAPI_PAY_IN_SLIPResponse.
     * 
     * @return ZBAPI_PAY_IN_SLIPResult
     */
    public org.tempuri.ZBAPI_PAY_IN_SLIPResponseZBAPI_PAY_IN_SLIPResult getZBAPI_PAY_IN_SLIPResult() {
        return ZBAPI_PAY_IN_SLIPResult;
    }


    /**
     * Sets the ZBAPI_PAY_IN_SLIPResult value for this ZBAPI_PAY_IN_SLIPResponse.
     * 
     * @param ZBAPI_PAY_IN_SLIPResult
     */
    public void setZBAPI_PAY_IN_SLIPResult(org.tempuri.ZBAPI_PAY_IN_SLIPResponseZBAPI_PAY_IN_SLIPResult ZBAPI_PAY_IN_SLIPResult) {
        this.ZBAPI_PAY_IN_SLIPResult = ZBAPI_PAY_IN_SLIPResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_PAY_IN_SLIPResponse)) return false;
        ZBAPI_PAY_IN_SLIPResponse other = (ZBAPI_PAY_IN_SLIPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_PAY_IN_SLIPResult==null && other.getZBAPI_PAY_IN_SLIPResult()==null) || 
             (this.ZBAPI_PAY_IN_SLIPResult!=null &&
              this.ZBAPI_PAY_IN_SLIPResult.equals(other.getZBAPI_PAY_IN_SLIPResult())));
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
        if (getZBAPI_PAY_IN_SLIPResult() != null) {
            _hashCode += getZBAPI_PAY_IN_SLIPResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_PAY_IN_SLIPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_PAY_IN_SLIPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_PAY_IN_SLIPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_PAY_IN_SLIPResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_PAY_IN_SLIPResponse>ZBAPI_PAY_IN_SLIPResult"));
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
