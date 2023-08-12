/**
 * ZBAPI_REAPPOINT_FETCHResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_REAPPOINT_FETCHResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_REAPPOINT_FETCHResponseZBAPI_REAPPOINT_FETCHResult ZBAPI_REAPPOINT_FETCHResult;

    public ZBAPI_REAPPOINT_FETCHResponse() {
    }

    public ZBAPI_REAPPOINT_FETCHResponse(
           org.tempuri.ZBAPI_REAPPOINT_FETCHResponseZBAPI_REAPPOINT_FETCHResult ZBAPI_REAPPOINT_FETCHResult) {
           this.ZBAPI_REAPPOINT_FETCHResult = ZBAPI_REAPPOINT_FETCHResult;
    }


    /**
     * Gets the ZBAPI_REAPPOINT_FETCHResult value for this ZBAPI_REAPPOINT_FETCHResponse.
     * 
     * @return ZBAPI_REAPPOINT_FETCHResult
     */
    public org.tempuri.ZBAPI_REAPPOINT_FETCHResponseZBAPI_REAPPOINT_FETCHResult getZBAPI_REAPPOINT_FETCHResult() {
        return ZBAPI_REAPPOINT_FETCHResult;
    }


    /**
     * Sets the ZBAPI_REAPPOINT_FETCHResult value for this ZBAPI_REAPPOINT_FETCHResponse.
     * 
     * @param ZBAPI_REAPPOINT_FETCHResult
     */
    public void setZBAPI_REAPPOINT_FETCHResult(org.tempuri.ZBAPI_REAPPOINT_FETCHResponseZBAPI_REAPPOINT_FETCHResult ZBAPI_REAPPOINT_FETCHResult) {
        this.ZBAPI_REAPPOINT_FETCHResult = ZBAPI_REAPPOINT_FETCHResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_REAPPOINT_FETCHResponse)) return false;
        ZBAPI_REAPPOINT_FETCHResponse other = (ZBAPI_REAPPOINT_FETCHResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_REAPPOINT_FETCHResult==null && other.getZBAPI_REAPPOINT_FETCHResult()==null) || 
             (this.ZBAPI_REAPPOINT_FETCHResult!=null &&
              this.ZBAPI_REAPPOINT_FETCHResult.equals(other.getZBAPI_REAPPOINT_FETCHResult())));
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
        if (getZBAPI_REAPPOINT_FETCHResult() != null) {
            _hashCode += getZBAPI_REAPPOINT_FETCHResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_REAPPOINT_FETCHResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_REAPPOINT_FETCHResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_REAPPOINT_FETCHResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_REAPPOINT_FETCHResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_REAPPOINT_FETCHResponse>ZBAPI_REAPPOINT_FETCHResult"));
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
