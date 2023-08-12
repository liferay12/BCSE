/**
 * ZBAPI_DISPLAY_BILL_WEB_EXTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_DISPLAY_BILL_WEB_EXTResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_DISPLAY_BILL_WEB_EXTResponseZBAPI_DISPLAY_BILL_WEB_EXTResult ZBAPI_DISPLAY_BILL_WEB_EXTResult;

    public ZBAPI_DISPLAY_BILL_WEB_EXTResponse() {
    }

    public ZBAPI_DISPLAY_BILL_WEB_EXTResponse(
           org.tempuri.ZBAPI_DISPLAY_BILL_WEB_EXTResponseZBAPI_DISPLAY_BILL_WEB_EXTResult ZBAPI_DISPLAY_BILL_WEB_EXTResult) {
           this.ZBAPI_DISPLAY_BILL_WEB_EXTResult = ZBAPI_DISPLAY_BILL_WEB_EXTResult;
    }


    /**
     * Gets the ZBAPI_DISPLAY_BILL_WEB_EXTResult value for this ZBAPI_DISPLAY_BILL_WEB_EXTResponse.
     * 
     * @return ZBAPI_DISPLAY_BILL_WEB_EXTResult
     */
    public org.tempuri.ZBAPI_DISPLAY_BILL_WEB_EXTResponseZBAPI_DISPLAY_BILL_WEB_EXTResult getZBAPI_DISPLAY_BILL_WEB_EXTResult() {
        return ZBAPI_DISPLAY_BILL_WEB_EXTResult;
    }


    /**
     * Sets the ZBAPI_DISPLAY_BILL_WEB_EXTResult value for this ZBAPI_DISPLAY_BILL_WEB_EXTResponse.
     * 
     * @param ZBAPI_DISPLAY_BILL_WEB_EXTResult
     */
    public void setZBAPI_DISPLAY_BILL_WEB_EXTResult(org.tempuri.ZBAPI_DISPLAY_BILL_WEB_EXTResponseZBAPI_DISPLAY_BILL_WEB_EXTResult ZBAPI_DISPLAY_BILL_WEB_EXTResult) {
        this.ZBAPI_DISPLAY_BILL_WEB_EXTResult = ZBAPI_DISPLAY_BILL_WEB_EXTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_DISPLAY_BILL_WEB_EXTResponse)) return false;
        ZBAPI_DISPLAY_BILL_WEB_EXTResponse other = (ZBAPI_DISPLAY_BILL_WEB_EXTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_DISPLAY_BILL_WEB_EXTResult==null && other.getZBAPI_DISPLAY_BILL_WEB_EXTResult()==null) || 
             (this.ZBAPI_DISPLAY_BILL_WEB_EXTResult!=null &&
              this.ZBAPI_DISPLAY_BILL_WEB_EXTResult.equals(other.getZBAPI_DISPLAY_BILL_WEB_EXTResult())));
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
        if (getZBAPI_DISPLAY_BILL_WEB_EXTResult() != null) {
            _hashCode += getZBAPI_DISPLAY_BILL_WEB_EXTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_DISPLAY_BILL_WEB_EXTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_DISPLAY_BILL_WEB_EXTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_DISPLAY_BILL_WEB_EXTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_DISPLAY_BILL_WEB_EXTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_DISPLAY_BILL_WEB_EXTResponse>ZBAPI_DISPLAY_BILL_WEB_EXTResult"));
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
