/**
 * ZBAPI_CREATESO_POSTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CREATESO_POSTResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_CREATESO_POSTResponseZBAPI_CREATESO_POSTResult ZBAPI_CREATESO_POSTResult;

    public ZBAPI_CREATESO_POSTResponse() {
    }

    public ZBAPI_CREATESO_POSTResponse(
           org.tempuri.ZBAPI_CREATESO_POSTResponseZBAPI_CREATESO_POSTResult ZBAPI_CREATESO_POSTResult) {
           this.ZBAPI_CREATESO_POSTResult = ZBAPI_CREATESO_POSTResult;
    }


    /**
     * Gets the ZBAPI_CREATESO_POSTResult value for this ZBAPI_CREATESO_POSTResponse.
     * 
     * @return ZBAPI_CREATESO_POSTResult
     */
    public org.tempuri.ZBAPI_CREATESO_POSTResponseZBAPI_CREATESO_POSTResult getZBAPI_CREATESO_POSTResult() {
        return ZBAPI_CREATESO_POSTResult;
    }


    /**
     * Sets the ZBAPI_CREATESO_POSTResult value for this ZBAPI_CREATESO_POSTResponse.
     * 
     * @param ZBAPI_CREATESO_POSTResult
     */
    public void setZBAPI_CREATESO_POSTResult(org.tempuri.ZBAPI_CREATESO_POSTResponseZBAPI_CREATESO_POSTResult ZBAPI_CREATESO_POSTResult) {
        this.ZBAPI_CREATESO_POSTResult = ZBAPI_CREATESO_POSTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CREATESO_POSTResponse)) return false;
        ZBAPI_CREATESO_POSTResponse other = (ZBAPI_CREATESO_POSTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_CREATESO_POSTResult==null && other.getZBAPI_CREATESO_POSTResult()==null) || 
             (this.ZBAPI_CREATESO_POSTResult!=null &&
              this.ZBAPI_CREATESO_POSTResult.equals(other.getZBAPI_CREATESO_POSTResult())));
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
        if (getZBAPI_CREATESO_POSTResult() != null) {
            _hashCode += getZBAPI_CREATESO_POSTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CREATESO_POSTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CREATESO_POSTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_CREATESO_POSTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_CREATESO_POSTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_CREATESO_POSTResponse>ZBAPI_CREATESO_POSTResult"));
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
