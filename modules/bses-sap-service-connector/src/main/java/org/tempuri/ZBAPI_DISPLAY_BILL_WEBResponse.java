/**
 * ZBAPI_DISPLAY_BILL_WEBResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_DISPLAY_BILL_WEBResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_DISPLAY_BILL_WEBResponseZBAPI_DISPLAY_BILL_WEBResult ZBAPI_DISPLAY_BILL_WEBResult;

    public ZBAPI_DISPLAY_BILL_WEBResponse() {
    }

    public ZBAPI_DISPLAY_BILL_WEBResponse(
           org.tempuri.ZBAPI_DISPLAY_BILL_WEBResponseZBAPI_DISPLAY_BILL_WEBResult ZBAPI_DISPLAY_BILL_WEBResult) {
           this.ZBAPI_DISPLAY_BILL_WEBResult = ZBAPI_DISPLAY_BILL_WEBResult;
    }


    /**
     * Gets the ZBAPI_DISPLAY_BILL_WEBResult value for this ZBAPI_DISPLAY_BILL_WEBResponse.
     * 
     * @return ZBAPI_DISPLAY_BILL_WEBResult
     */
    public org.tempuri.ZBAPI_DISPLAY_BILL_WEBResponseZBAPI_DISPLAY_BILL_WEBResult getZBAPI_DISPLAY_BILL_WEBResult() {
        return ZBAPI_DISPLAY_BILL_WEBResult;
    }


    /**
     * Sets the ZBAPI_DISPLAY_BILL_WEBResult value for this ZBAPI_DISPLAY_BILL_WEBResponse.
     * 
     * @param ZBAPI_DISPLAY_BILL_WEBResult
     */
    public void setZBAPI_DISPLAY_BILL_WEBResult(org.tempuri.ZBAPI_DISPLAY_BILL_WEBResponseZBAPI_DISPLAY_BILL_WEBResult ZBAPI_DISPLAY_BILL_WEBResult) {
        this.ZBAPI_DISPLAY_BILL_WEBResult = ZBAPI_DISPLAY_BILL_WEBResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_DISPLAY_BILL_WEBResponse)) return false;
        ZBAPI_DISPLAY_BILL_WEBResponse other = (ZBAPI_DISPLAY_BILL_WEBResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_DISPLAY_BILL_WEBResult==null && other.getZBAPI_DISPLAY_BILL_WEBResult()==null) || 
             (this.ZBAPI_DISPLAY_BILL_WEBResult!=null &&
              this.ZBAPI_DISPLAY_BILL_WEBResult.equals(other.getZBAPI_DISPLAY_BILL_WEBResult())));
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
        if (getZBAPI_DISPLAY_BILL_WEBResult() != null) {
            _hashCode += getZBAPI_DISPLAY_BILL_WEBResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_DISPLAY_BILL_WEBResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_DISPLAY_BILL_WEBResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_DISPLAY_BILL_WEBResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_DISPLAY_BILL_WEBResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_DISPLAY_BILL_WEBResponse>ZBAPI_DISPLAY_BILL_WEBResult"));
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
