/**
 * ZBAPI_UPDATE_TNOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_UPDATE_TNOResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_UPDATE_TNOResponseZBAPI_UPDATE_TNOResult ZBAPI_UPDATE_TNOResult;

    public ZBAPI_UPDATE_TNOResponse() {
    }

    public ZBAPI_UPDATE_TNOResponse(
           org.tempuri.ZBAPI_UPDATE_TNOResponseZBAPI_UPDATE_TNOResult ZBAPI_UPDATE_TNOResult) {
           this.ZBAPI_UPDATE_TNOResult = ZBAPI_UPDATE_TNOResult;
    }


    /**
     * Gets the ZBAPI_UPDATE_TNOResult value for this ZBAPI_UPDATE_TNOResponse.
     * 
     * @return ZBAPI_UPDATE_TNOResult
     */
    public org.tempuri.ZBAPI_UPDATE_TNOResponseZBAPI_UPDATE_TNOResult getZBAPI_UPDATE_TNOResult() {
        return ZBAPI_UPDATE_TNOResult;
    }


    /**
     * Sets the ZBAPI_UPDATE_TNOResult value for this ZBAPI_UPDATE_TNOResponse.
     * 
     * @param ZBAPI_UPDATE_TNOResult
     */
    public void setZBAPI_UPDATE_TNOResult(org.tempuri.ZBAPI_UPDATE_TNOResponseZBAPI_UPDATE_TNOResult ZBAPI_UPDATE_TNOResult) {
        this.ZBAPI_UPDATE_TNOResult = ZBAPI_UPDATE_TNOResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_UPDATE_TNOResponse)) return false;
        ZBAPI_UPDATE_TNOResponse other = (ZBAPI_UPDATE_TNOResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_UPDATE_TNOResult==null && other.getZBAPI_UPDATE_TNOResult()==null) || 
             (this.ZBAPI_UPDATE_TNOResult!=null &&
              this.ZBAPI_UPDATE_TNOResult.equals(other.getZBAPI_UPDATE_TNOResult())));
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
        if (getZBAPI_UPDATE_TNOResult() != null) {
            _hashCode += getZBAPI_UPDATE_TNOResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_UPDATE_TNOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_UPDATE_TNOResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_UPDATE_TNOResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_UPDATE_TNOResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_UPDATE_TNOResponse>ZBAPI_UPDATE_TNOResult"));
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
