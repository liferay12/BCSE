/**
 * ZBAPI_DSS_SOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_DSS_SOResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_DSS_SOResponseZBAPI_DSS_SOResult ZBAPI_DSS_SOResult;

    public ZBAPI_DSS_SOResponse() {
    }

    public ZBAPI_DSS_SOResponse(
           org.tempuri.ZBAPI_DSS_SOResponseZBAPI_DSS_SOResult ZBAPI_DSS_SOResult) {
           this.ZBAPI_DSS_SOResult = ZBAPI_DSS_SOResult;
    }


    /**
     * Gets the ZBAPI_DSS_SOResult value for this ZBAPI_DSS_SOResponse.
     * 
     * @return ZBAPI_DSS_SOResult
     */
    public org.tempuri.ZBAPI_DSS_SOResponseZBAPI_DSS_SOResult getZBAPI_DSS_SOResult() {
        return ZBAPI_DSS_SOResult;
    }


    /**
     * Sets the ZBAPI_DSS_SOResult value for this ZBAPI_DSS_SOResponse.
     * 
     * @param ZBAPI_DSS_SOResult
     */
    public void setZBAPI_DSS_SOResult(org.tempuri.ZBAPI_DSS_SOResponseZBAPI_DSS_SOResult ZBAPI_DSS_SOResult) {
        this.ZBAPI_DSS_SOResult = ZBAPI_DSS_SOResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_DSS_SOResponse)) return false;
        ZBAPI_DSS_SOResponse other = (ZBAPI_DSS_SOResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_DSS_SOResult==null && other.getZBAPI_DSS_SOResult()==null) || 
             (this.ZBAPI_DSS_SOResult!=null &&
              this.ZBAPI_DSS_SOResult.equals(other.getZBAPI_DSS_SOResult())));
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
        if (getZBAPI_DSS_SOResult() != null) {
            _hashCode += getZBAPI_DSS_SOResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_DSS_SOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_DSS_SOResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_DSS_SOResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_DSS_SOResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_DSS_SOResponse>ZBAPI_DSS_SOResult"));
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
