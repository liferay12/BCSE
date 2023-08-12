/**
 * ZBAPI_ENFORCEMENTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_ENFORCEMENTResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_ENFORCEMENTResponseZBAPI_ENFORCEMENTResult ZBAPI_ENFORCEMENTResult;

    public ZBAPI_ENFORCEMENTResponse() {
    }

    public ZBAPI_ENFORCEMENTResponse(
           org.tempuri.ZBAPI_ENFORCEMENTResponseZBAPI_ENFORCEMENTResult ZBAPI_ENFORCEMENTResult) {
           this.ZBAPI_ENFORCEMENTResult = ZBAPI_ENFORCEMENTResult;
    }


    /**
     * Gets the ZBAPI_ENFORCEMENTResult value for this ZBAPI_ENFORCEMENTResponse.
     * 
     * @return ZBAPI_ENFORCEMENTResult
     */
    public org.tempuri.ZBAPI_ENFORCEMENTResponseZBAPI_ENFORCEMENTResult getZBAPI_ENFORCEMENTResult() {
        return ZBAPI_ENFORCEMENTResult;
    }


    /**
     * Sets the ZBAPI_ENFORCEMENTResult value for this ZBAPI_ENFORCEMENTResponse.
     * 
     * @param ZBAPI_ENFORCEMENTResult
     */
    public void setZBAPI_ENFORCEMENTResult(org.tempuri.ZBAPI_ENFORCEMENTResponseZBAPI_ENFORCEMENTResult ZBAPI_ENFORCEMENTResult) {
        this.ZBAPI_ENFORCEMENTResult = ZBAPI_ENFORCEMENTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_ENFORCEMENTResponse)) return false;
        ZBAPI_ENFORCEMENTResponse other = (ZBAPI_ENFORCEMENTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_ENFORCEMENTResult==null && other.getZBAPI_ENFORCEMENTResult()==null) || 
             (this.ZBAPI_ENFORCEMENTResult!=null &&
              this.ZBAPI_ENFORCEMENTResult.equals(other.getZBAPI_ENFORCEMENTResult())));
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
        if (getZBAPI_ENFORCEMENTResult() != null) {
            _hashCode += getZBAPI_ENFORCEMENTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_ENFORCEMENTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_ENFORCEMENTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_ENFORCEMENTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_ENFORCEMENTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_ENFORCEMENTResponse>ZBAPI_ENFORCEMENTResult"));
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
