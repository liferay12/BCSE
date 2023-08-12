/**
 * ZBAPI_DFKKOP_PUSHResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_DFKKOP_PUSHResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_DFKKOP_PUSHResponseZBAPI_DFKKOP_PUSHResult ZBAPI_DFKKOP_PUSHResult;

    public ZBAPI_DFKKOP_PUSHResponse() {
    }

    public ZBAPI_DFKKOP_PUSHResponse(
           org.tempuri.ZBAPI_DFKKOP_PUSHResponseZBAPI_DFKKOP_PUSHResult ZBAPI_DFKKOP_PUSHResult) {
           this.ZBAPI_DFKKOP_PUSHResult = ZBAPI_DFKKOP_PUSHResult;
    }


    /**
     * Gets the ZBAPI_DFKKOP_PUSHResult value for this ZBAPI_DFKKOP_PUSHResponse.
     * 
     * @return ZBAPI_DFKKOP_PUSHResult
     */
    public org.tempuri.ZBAPI_DFKKOP_PUSHResponseZBAPI_DFKKOP_PUSHResult getZBAPI_DFKKOP_PUSHResult() {
        return ZBAPI_DFKKOP_PUSHResult;
    }


    /**
     * Sets the ZBAPI_DFKKOP_PUSHResult value for this ZBAPI_DFKKOP_PUSHResponse.
     * 
     * @param ZBAPI_DFKKOP_PUSHResult
     */
    public void setZBAPI_DFKKOP_PUSHResult(org.tempuri.ZBAPI_DFKKOP_PUSHResponseZBAPI_DFKKOP_PUSHResult ZBAPI_DFKKOP_PUSHResult) {
        this.ZBAPI_DFKKOP_PUSHResult = ZBAPI_DFKKOP_PUSHResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_DFKKOP_PUSHResponse)) return false;
        ZBAPI_DFKKOP_PUSHResponse other = (ZBAPI_DFKKOP_PUSHResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_DFKKOP_PUSHResult==null && other.getZBAPI_DFKKOP_PUSHResult()==null) || 
             (this.ZBAPI_DFKKOP_PUSHResult!=null &&
              this.ZBAPI_DFKKOP_PUSHResult.equals(other.getZBAPI_DFKKOP_PUSHResult())));
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
        if (getZBAPI_DFKKOP_PUSHResult() != null) {
            _hashCode += getZBAPI_DFKKOP_PUSHResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_DFKKOP_PUSHResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_DFKKOP_PUSHResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_DFKKOP_PUSHResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_DFKKOP_PUSHResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_DFKKOP_PUSHResponse>ZBAPI_DFKKOP_PUSHResult"));
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
