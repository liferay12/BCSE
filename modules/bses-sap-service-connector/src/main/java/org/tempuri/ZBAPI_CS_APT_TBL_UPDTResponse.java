/**
 * ZBAPI_CS_APT_TBL_UPDTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CS_APT_TBL_UPDTResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_CS_APT_TBL_UPDTResponseZBAPI_CS_APT_TBL_UPDTResult ZBAPI_CS_APT_TBL_UPDTResult;

    public ZBAPI_CS_APT_TBL_UPDTResponse() {
    }

    public ZBAPI_CS_APT_TBL_UPDTResponse(
           org.tempuri.ZBAPI_CS_APT_TBL_UPDTResponseZBAPI_CS_APT_TBL_UPDTResult ZBAPI_CS_APT_TBL_UPDTResult) {
           this.ZBAPI_CS_APT_TBL_UPDTResult = ZBAPI_CS_APT_TBL_UPDTResult;
    }


    /**
     * Gets the ZBAPI_CS_APT_TBL_UPDTResult value for this ZBAPI_CS_APT_TBL_UPDTResponse.
     * 
     * @return ZBAPI_CS_APT_TBL_UPDTResult
     */
    public org.tempuri.ZBAPI_CS_APT_TBL_UPDTResponseZBAPI_CS_APT_TBL_UPDTResult getZBAPI_CS_APT_TBL_UPDTResult() {
        return ZBAPI_CS_APT_TBL_UPDTResult;
    }


    /**
     * Sets the ZBAPI_CS_APT_TBL_UPDTResult value for this ZBAPI_CS_APT_TBL_UPDTResponse.
     * 
     * @param ZBAPI_CS_APT_TBL_UPDTResult
     */
    public void setZBAPI_CS_APT_TBL_UPDTResult(org.tempuri.ZBAPI_CS_APT_TBL_UPDTResponseZBAPI_CS_APT_TBL_UPDTResult ZBAPI_CS_APT_TBL_UPDTResult) {
        this.ZBAPI_CS_APT_TBL_UPDTResult = ZBAPI_CS_APT_TBL_UPDTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CS_APT_TBL_UPDTResponse)) return false;
        ZBAPI_CS_APT_TBL_UPDTResponse other = (ZBAPI_CS_APT_TBL_UPDTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_CS_APT_TBL_UPDTResult==null && other.getZBAPI_CS_APT_TBL_UPDTResult()==null) || 
             (this.ZBAPI_CS_APT_TBL_UPDTResult!=null &&
              this.ZBAPI_CS_APT_TBL_UPDTResult.equals(other.getZBAPI_CS_APT_TBL_UPDTResult())));
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
        if (getZBAPI_CS_APT_TBL_UPDTResult() != null) {
            _hashCode += getZBAPI_CS_APT_TBL_UPDTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CS_APT_TBL_UPDTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CS_APT_TBL_UPDTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_CS_APT_TBL_UPDTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_CS_APT_TBL_UPDTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_CS_APT_TBL_UPDTResponse>ZBAPI_CS_APT_TBL_UPDTResult"));
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
