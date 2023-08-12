/**
 * ZBAPI_DSS_SO_ECCResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_DSS_SO_ECCResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_DSS_SO_ECCResponseZBAPI_DSS_SO_ECCResult ZBAPI_DSS_SO_ECCResult;

    public ZBAPI_DSS_SO_ECCResponse() {
    }

    public ZBAPI_DSS_SO_ECCResponse(
           org.tempuri.ZBAPI_DSS_SO_ECCResponseZBAPI_DSS_SO_ECCResult ZBAPI_DSS_SO_ECCResult) {
           this.ZBAPI_DSS_SO_ECCResult = ZBAPI_DSS_SO_ECCResult;
    }


    /**
     * Gets the ZBAPI_DSS_SO_ECCResult value for this ZBAPI_DSS_SO_ECCResponse.
     * 
     * @return ZBAPI_DSS_SO_ECCResult
     */
    public org.tempuri.ZBAPI_DSS_SO_ECCResponseZBAPI_DSS_SO_ECCResult getZBAPI_DSS_SO_ECCResult() {
        return ZBAPI_DSS_SO_ECCResult;
    }


    /**
     * Sets the ZBAPI_DSS_SO_ECCResult value for this ZBAPI_DSS_SO_ECCResponse.
     * 
     * @param ZBAPI_DSS_SO_ECCResult
     */
    public void setZBAPI_DSS_SO_ECCResult(org.tempuri.ZBAPI_DSS_SO_ECCResponseZBAPI_DSS_SO_ECCResult ZBAPI_DSS_SO_ECCResult) {
        this.ZBAPI_DSS_SO_ECCResult = ZBAPI_DSS_SO_ECCResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_DSS_SO_ECCResponse)) return false;
        ZBAPI_DSS_SO_ECCResponse other = (ZBAPI_DSS_SO_ECCResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_DSS_SO_ECCResult==null && other.getZBAPI_DSS_SO_ECCResult()==null) || 
             (this.ZBAPI_DSS_SO_ECCResult!=null &&
              this.ZBAPI_DSS_SO_ECCResult.equals(other.getZBAPI_DSS_SO_ECCResult())));
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
        if (getZBAPI_DSS_SO_ECCResult() != null) {
            _hashCode += getZBAPI_DSS_SO_ECCResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_DSS_SO_ECCResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_DSS_SO_ECCResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_DSS_SO_ECCResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_DSS_SO_ECCResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_DSS_SO_ECCResponse>ZBAPI_DSS_SO_ECCResult"));
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
