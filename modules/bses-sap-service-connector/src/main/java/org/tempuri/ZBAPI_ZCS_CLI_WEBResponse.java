/**
 * ZBAPI_ZCS_CLI_WEBResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_ZCS_CLI_WEBResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_ZCS_CLI_WEBResponseZBAPI_ZCS_CLI_WEBResult ZBAPI_ZCS_CLI_WEBResult;

    public ZBAPI_ZCS_CLI_WEBResponse() {
    }

    public ZBAPI_ZCS_CLI_WEBResponse(
           org.tempuri.ZBAPI_ZCS_CLI_WEBResponseZBAPI_ZCS_CLI_WEBResult ZBAPI_ZCS_CLI_WEBResult) {
           this.ZBAPI_ZCS_CLI_WEBResult = ZBAPI_ZCS_CLI_WEBResult;
    }


    /**
     * Gets the ZBAPI_ZCS_CLI_WEBResult value for this ZBAPI_ZCS_CLI_WEBResponse.
     * 
     * @return ZBAPI_ZCS_CLI_WEBResult
     */
    public org.tempuri.ZBAPI_ZCS_CLI_WEBResponseZBAPI_ZCS_CLI_WEBResult getZBAPI_ZCS_CLI_WEBResult() {
        return ZBAPI_ZCS_CLI_WEBResult;
    }


    /**
     * Sets the ZBAPI_ZCS_CLI_WEBResult value for this ZBAPI_ZCS_CLI_WEBResponse.
     * 
     * @param ZBAPI_ZCS_CLI_WEBResult
     */
    public void setZBAPI_ZCS_CLI_WEBResult(org.tempuri.ZBAPI_ZCS_CLI_WEBResponseZBAPI_ZCS_CLI_WEBResult ZBAPI_ZCS_CLI_WEBResult) {
        this.ZBAPI_ZCS_CLI_WEBResult = ZBAPI_ZCS_CLI_WEBResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_ZCS_CLI_WEBResponse)) return false;
        ZBAPI_ZCS_CLI_WEBResponse other = (ZBAPI_ZCS_CLI_WEBResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_ZCS_CLI_WEBResult==null && other.getZBAPI_ZCS_CLI_WEBResult()==null) || 
             (this.ZBAPI_ZCS_CLI_WEBResult!=null &&
              this.ZBAPI_ZCS_CLI_WEBResult.equals(other.getZBAPI_ZCS_CLI_WEBResult())));
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
        if (getZBAPI_ZCS_CLI_WEBResult() != null) {
            _hashCode += getZBAPI_ZCS_CLI_WEBResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_ZCS_CLI_WEBResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_ZCS_CLI_WEBResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_ZCS_CLI_WEBResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_ZCS_CLI_WEBResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_ZCS_CLI_WEBResponse>ZBAPI_ZCS_CLI_WEBResult"));
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
