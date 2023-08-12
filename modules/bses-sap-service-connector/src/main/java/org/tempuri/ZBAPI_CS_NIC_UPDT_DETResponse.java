/**
 * ZBAPI_CS_NIC_UPDT_DETResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CS_NIC_UPDT_DETResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_CS_NIC_UPDT_DETResponseZBAPI_CS_NIC_UPDT_DETResult ZBAPI_CS_NIC_UPDT_DETResult;

    public ZBAPI_CS_NIC_UPDT_DETResponse() {
    }

    public ZBAPI_CS_NIC_UPDT_DETResponse(
           org.tempuri.ZBAPI_CS_NIC_UPDT_DETResponseZBAPI_CS_NIC_UPDT_DETResult ZBAPI_CS_NIC_UPDT_DETResult) {
           this.ZBAPI_CS_NIC_UPDT_DETResult = ZBAPI_CS_NIC_UPDT_DETResult;
    }


    /**
     * Gets the ZBAPI_CS_NIC_UPDT_DETResult value for this ZBAPI_CS_NIC_UPDT_DETResponse.
     * 
     * @return ZBAPI_CS_NIC_UPDT_DETResult
     */
    public org.tempuri.ZBAPI_CS_NIC_UPDT_DETResponseZBAPI_CS_NIC_UPDT_DETResult getZBAPI_CS_NIC_UPDT_DETResult() {
        return ZBAPI_CS_NIC_UPDT_DETResult;
    }


    /**
     * Sets the ZBAPI_CS_NIC_UPDT_DETResult value for this ZBAPI_CS_NIC_UPDT_DETResponse.
     * 
     * @param ZBAPI_CS_NIC_UPDT_DETResult
     */
    public void setZBAPI_CS_NIC_UPDT_DETResult(org.tempuri.ZBAPI_CS_NIC_UPDT_DETResponseZBAPI_CS_NIC_UPDT_DETResult ZBAPI_CS_NIC_UPDT_DETResult) {
        this.ZBAPI_CS_NIC_UPDT_DETResult = ZBAPI_CS_NIC_UPDT_DETResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CS_NIC_UPDT_DETResponse)) return false;
        ZBAPI_CS_NIC_UPDT_DETResponse other = (ZBAPI_CS_NIC_UPDT_DETResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_CS_NIC_UPDT_DETResult==null && other.getZBAPI_CS_NIC_UPDT_DETResult()==null) || 
             (this.ZBAPI_CS_NIC_UPDT_DETResult!=null &&
              this.ZBAPI_CS_NIC_UPDT_DETResult.equals(other.getZBAPI_CS_NIC_UPDT_DETResult())));
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
        if (getZBAPI_CS_NIC_UPDT_DETResult() != null) {
            _hashCode += getZBAPI_CS_NIC_UPDT_DETResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CS_NIC_UPDT_DETResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CS_NIC_UPDT_DETResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_CS_NIC_UPDT_DETResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_CS_NIC_UPDT_DETResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_CS_NIC_UPDT_DETResponse>ZBAPI_CS_NIC_UPDT_DETResult"));
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
