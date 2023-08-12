/**
 * ZBAPI_CALERTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CALERTResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_CALERTResponseZBAPI_CALERTResult ZBAPI_CALERTResult;

    public ZBAPI_CALERTResponse() {
    }

    public ZBAPI_CALERTResponse(
           org.tempuri.ZBAPI_CALERTResponseZBAPI_CALERTResult ZBAPI_CALERTResult) {
           this.ZBAPI_CALERTResult = ZBAPI_CALERTResult;
    }


    /**
     * Gets the ZBAPI_CALERTResult value for this ZBAPI_CALERTResponse.
     * 
     * @return ZBAPI_CALERTResult
     */
    public org.tempuri.ZBAPI_CALERTResponseZBAPI_CALERTResult getZBAPI_CALERTResult() {
        return ZBAPI_CALERTResult;
    }


    /**
     * Sets the ZBAPI_CALERTResult value for this ZBAPI_CALERTResponse.
     * 
     * @param ZBAPI_CALERTResult
     */
    public void setZBAPI_CALERTResult(org.tempuri.ZBAPI_CALERTResponseZBAPI_CALERTResult ZBAPI_CALERTResult) {
        this.ZBAPI_CALERTResult = ZBAPI_CALERTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CALERTResponse)) return false;
        ZBAPI_CALERTResponse other = (ZBAPI_CALERTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_CALERTResult==null && other.getZBAPI_CALERTResult()==null) || 
             (this.ZBAPI_CALERTResult!=null &&
              this.ZBAPI_CALERTResult.equals(other.getZBAPI_CALERTResult())));
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
        if (getZBAPI_CALERTResult() != null) {
            _hashCode += getZBAPI_CALERTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CALERTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CALERTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_CALERTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_CALERTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_CALERTResponse>ZBAPI_CALERTResult"));
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
