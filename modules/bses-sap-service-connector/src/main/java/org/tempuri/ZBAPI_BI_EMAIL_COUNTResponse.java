/**
 * ZBAPI_BI_EMAIL_COUNTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_BI_EMAIL_COUNTResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_BI_EMAIL_COUNTResponseZBAPI_BI_EMAIL_COUNTResult ZBAPI_BI_EMAIL_COUNTResult;

    public ZBAPI_BI_EMAIL_COUNTResponse() {
    }

    public ZBAPI_BI_EMAIL_COUNTResponse(
           org.tempuri.ZBAPI_BI_EMAIL_COUNTResponseZBAPI_BI_EMAIL_COUNTResult ZBAPI_BI_EMAIL_COUNTResult) {
           this.ZBAPI_BI_EMAIL_COUNTResult = ZBAPI_BI_EMAIL_COUNTResult;
    }


    /**
     * Gets the ZBAPI_BI_EMAIL_COUNTResult value for this ZBAPI_BI_EMAIL_COUNTResponse.
     * 
     * @return ZBAPI_BI_EMAIL_COUNTResult
     */
    public org.tempuri.ZBAPI_BI_EMAIL_COUNTResponseZBAPI_BI_EMAIL_COUNTResult getZBAPI_BI_EMAIL_COUNTResult() {
        return ZBAPI_BI_EMAIL_COUNTResult;
    }


    /**
     * Sets the ZBAPI_BI_EMAIL_COUNTResult value for this ZBAPI_BI_EMAIL_COUNTResponse.
     * 
     * @param ZBAPI_BI_EMAIL_COUNTResult
     */
    public void setZBAPI_BI_EMAIL_COUNTResult(org.tempuri.ZBAPI_BI_EMAIL_COUNTResponseZBAPI_BI_EMAIL_COUNTResult ZBAPI_BI_EMAIL_COUNTResult) {
        this.ZBAPI_BI_EMAIL_COUNTResult = ZBAPI_BI_EMAIL_COUNTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_BI_EMAIL_COUNTResponse)) return false;
        ZBAPI_BI_EMAIL_COUNTResponse other = (ZBAPI_BI_EMAIL_COUNTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_BI_EMAIL_COUNTResult==null && other.getZBAPI_BI_EMAIL_COUNTResult()==null) || 
             (this.ZBAPI_BI_EMAIL_COUNTResult!=null &&
              this.ZBAPI_BI_EMAIL_COUNTResult.equals(other.getZBAPI_BI_EMAIL_COUNTResult())));
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
        if (getZBAPI_BI_EMAIL_COUNTResult() != null) {
            _hashCode += getZBAPI_BI_EMAIL_COUNTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_BI_EMAIL_COUNTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_BI_EMAIL_COUNTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_BI_EMAIL_COUNTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_BI_EMAIL_COUNTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_BI_EMAIL_COUNTResponse>ZBAPI_BI_EMAIL_COUNTResult"));
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
