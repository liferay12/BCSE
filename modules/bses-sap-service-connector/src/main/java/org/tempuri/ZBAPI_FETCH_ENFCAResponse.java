/**
 * ZBAPI_FETCH_ENFCAResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_FETCH_ENFCAResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_FETCH_ENFCAResponseZBAPI_FETCH_ENFCAResult ZBAPI_FETCH_ENFCAResult;

    public ZBAPI_FETCH_ENFCAResponse() {
    }

    public ZBAPI_FETCH_ENFCAResponse(
           org.tempuri.ZBAPI_FETCH_ENFCAResponseZBAPI_FETCH_ENFCAResult ZBAPI_FETCH_ENFCAResult) {
           this.ZBAPI_FETCH_ENFCAResult = ZBAPI_FETCH_ENFCAResult;
    }


    /**
     * Gets the ZBAPI_FETCH_ENFCAResult value for this ZBAPI_FETCH_ENFCAResponse.
     * 
     * @return ZBAPI_FETCH_ENFCAResult
     */
    public org.tempuri.ZBAPI_FETCH_ENFCAResponseZBAPI_FETCH_ENFCAResult getZBAPI_FETCH_ENFCAResult() {
        return ZBAPI_FETCH_ENFCAResult;
    }


    /**
     * Sets the ZBAPI_FETCH_ENFCAResult value for this ZBAPI_FETCH_ENFCAResponse.
     * 
     * @param ZBAPI_FETCH_ENFCAResult
     */
    public void setZBAPI_FETCH_ENFCAResult(org.tempuri.ZBAPI_FETCH_ENFCAResponseZBAPI_FETCH_ENFCAResult ZBAPI_FETCH_ENFCAResult) {
        this.ZBAPI_FETCH_ENFCAResult = ZBAPI_FETCH_ENFCAResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_FETCH_ENFCAResponse)) return false;
        ZBAPI_FETCH_ENFCAResponse other = (ZBAPI_FETCH_ENFCAResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_FETCH_ENFCAResult==null && other.getZBAPI_FETCH_ENFCAResult()==null) || 
             (this.ZBAPI_FETCH_ENFCAResult!=null &&
              this.ZBAPI_FETCH_ENFCAResult.equals(other.getZBAPI_FETCH_ENFCAResult())));
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
        if (getZBAPI_FETCH_ENFCAResult() != null) {
            _hashCode += getZBAPI_FETCH_ENFCAResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_FETCH_ENFCAResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_FETCH_ENFCAResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_FETCH_ENFCAResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_FETCH_ENFCAResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_FETCH_ENFCAResponse>ZBAPI_FETCH_ENFCAResult"));
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
