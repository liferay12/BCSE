/**
 * ZBAPI_ELNOTICE_WHATSAPPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_ELNOTICE_WHATSAPPResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_ELNOTICE_WHATSAPPResponseZBAPI_ELNOTICE_WHATSAPPResult ZBAPI_ELNOTICE_WHATSAPPResult;

    public ZBAPI_ELNOTICE_WHATSAPPResponse() {
    }

    public ZBAPI_ELNOTICE_WHATSAPPResponse(
           org.tempuri.ZBAPI_ELNOTICE_WHATSAPPResponseZBAPI_ELNOTICE_WHATSAPPResult ZBAPI_ELNOTICE_WHATSAPPResult) {
           this.ZBAPI_ELNOTICE_WHATSAPPResult = ZBAPI_ELNOTICE_WHATSAPPResult;
    }


    /**
     * Gets the ZBAPI_ELNOTICE_WHATSAPPResult value for this ZBAPI_ELNOTICE_WHATSAPPResponse.
     * 
     * @return ZBAPI_ELNOTICE_WHATSAPPResult
     */
    public org.tempuri.ZBAPI_ELNOTICE_WHATSAPPResponseZBAPI_ELNOTICE_WHATSAPPResult getZBAPI_ELNOTICE_WHATSAPPResult() {
        return ZBAPI_ELNOTICE_WHATSAPPResult;
    }


    /**
     * Sets the ZBAPI_ELNOTICE_WHATSAPPResult value for this ZBAPI_ELNOTICE_WHATSAPPResponse.
     * 
     * @param ZBAPI_ELNOTICE_WHATSAPPResult
     */
    public void setZBAPI_ELNOTICE_WHATSAPPResult(org.tempuri.ZBAPI_ELNOTICE_WHATSAPPResponseZBAPI_ELNOTICE_WHATSAPPResult ZBAPI_ELNOTICE_WHATSAPPResult) {
        this.ZBAPI_ELNOTICE_WHATSAPPResult = ZBAPI_ELNOTICE_WHATSAPPResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_ELNOTICE_WHATSAPPResponse)) return false;
        ZBAPI_ELNOTICE_WHATSAPPResponse other = (ZBAPI_ELNOTICE_WHATSAPPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_ELNOTICE_WHATSAPPResult==null && other.getZBAPI_ELNOTICE_WHATSAPPResult()==null) || 
             (this.ZBAPI_ELNOTICE_WHATSAPPResult!=null &&
              this.ZBAPI_ELNOTICE_WHATSAPPResult.equals(other.getZBAPI_ELNOTICE_WHATSAPPResult())));
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
        if (getZBAPI_ELNOTICE_WHATSAPPResult() != null) {
            _hashCode += getZBAPI_ELNOTICE_WHATSAPPResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_ELNOTICE_WHATSAPPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_ELNOTICE_WHATSAPPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_ELNOTICE_WHATSAPPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_ELNOTICE_WHATSAPPResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_ELNOTICE_WHATSAPPResponse>ZBAPI_ELNOTICE_WHATSAPPResult"));
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
