/**
 * ZBAPI_CS_FETCH_LOADResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CS_FETCH_LOADResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_CS_FETCH_LOADResponseZBAPI_CS_FETCH_LOADResult ZBAPI_CS_FETCH_LOADResult;

    public ZBAPI_CS_FETCH_LOADResponse() {
    }

    public ZBAPI_CS_FETCH_LOADResponse(
           org.tempuri.ZBAPI_CS_FETCH_LOADResponseZBAPI_CS_FETCH_LOADResult ZBAPI_CS_FETCH_LOADResult) {
           this.ZBAPI_CS_FETCH_LOADResult = ZBAPI_CS_FETCH_LOADResult;
    }


    /**
     * Gets the ZBAPI_CS_FETCH_LOADResult value for this ZBAPI_CS_FETCH_LOADResponse.
     * 
     * @return ZBAPI_CS_FETCH_LOADResult
     */
    public org.tempuri.ZBAPI_CS_FETCH_LOADResponseZBAPI_CS_FETCH_LOADResult getZBAPI_CS_FETCH_LOADResult() {
        return ZBAPI_CS_FETCH_LOADResult;
    }


    /**
     * Sets the ZBAPI_CS_FETCH_LOADResult value for this ZBAPI_CS_FETCH_LOADResponse.
     * 
     * @param ZBAPI_CS_FETCH_LOADResult
     */
    public void setZBAPI_CS_FETCH_LOADResult(org.tempuri.ZBAPI_CS_FETCH_LOADResponseZBAPI_CS_FETCH_LOADResult ZBAPI_CS_FETCH_LOADResult) {
        this.ZBAPI_CS_FETCH_LOADResult = ZBAPI_CS_FETCH_LOADResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CS_FETCH_LOADResponse)) return false;
        ZBAPI_CS_FETCH_LOADResponse other = (ZBAPI_CS_FETCH_LOADResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_CS_FETCH_LOADResult==null && other.getZBAPI_CS_FETCH_LOADResult()==null) || 
             (this.ZBAPI_CS_FETCH_LOADResult!=null &&
              this.ZBAPI_CS_FETCH_LOADResult.equals(other.getZBAPI_CS_FETCH_LOADResult())));
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
        if (getZBAPI_CS_FETCH_LOADResult() != null) {
            _hashCode += getZBAPI_CS_FETCH_LOADResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CS_FETCH_LOADResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CS_FETCH_LOADResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_CS_FETCH_LOADResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_CS_FETCH_LOADResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_CS_FETCH_LOADResponse>ZBAPI_CS_FETCH_LOADResult"));
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
