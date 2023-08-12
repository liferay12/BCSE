/**
 * ZBAPI_CNT_APP_DETAIL_MOBResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CNT_APP_DETAIL_MOBResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_CNT_APP_DETAIL_MOBResponseZBAPI_CNT_APP_DETAIL_MOBResult ZBAPI_CNT_APP_DETAIL_MOBResult;

    public ZBAPI_CNT_APP_DETAIL_MOBResponse() {
    }

    public ZBAPI_CNT_APP_DETAIL_MOBResponse(
           org.tempuri.ZBAPI_CNT_APP_DETAIL_MOBResponseZBAPI_CNT_APP_DETAIL_MOBResult ZBAPI_CNT_APP_DETAIL_MOBResult) {
           this.ZBAPI_CNT_APP_DETAIL_MOBResult = ZBAPI_CNT_APP_DETAIL_MOBResult;
    }


    /**
     * Gets the ZBAPI_CNT_APP_DETAIL_MOBResult value for this ZBAPI_CNT_APP_DETAIL_MOBResponse.
     * 
     * @return ZBAPI_CNT_APP_DETAIL_MOBResult
     */
    public org.tempuri.ZBAPI_CNT_APP_DETAIL_MOBResponseZBAPI_CNT_APP_DETAIL_MOBResult getZBAPI_CNT_APP_DETAIL_MOBResult() {
        return ZBAPI_CNT_APP_DETAIL_MOBResult;
    }


    /**
     * Sets the ZBAPI_CNT_APP_DETAIL_MOBResult value for this ZBAPI_CNT_APP_DETAIL_MOBResponse.
     * 
     * @param ZBAPI_CNT_APP_DETAIL_MOBResult
     */
    public void setZBAPI_CNT_APP_DETAIL_MOBResult(org.tempuri.ZBAPI_CNT_APP_DETAIL_MOBResponseZBAPI_CNT_APP_DETAIL_MOBResult ZBAPI_CNT_APP_DETAIL_MOBResult) {
        this.ZBAPI_CNT_APP_DETAIL_MOBResult = ZBAPI_CNT_APP_DETAIL_MOBResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CNT_APP_DETAIL_MOBResponse)) return false;
        ZBAPI_CNT_APP_DETAIL_MOBResponse other = (ZBAPI_CNT_APP_DETAIL_MOBResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_CNT_APP_DETAIL_MOBResult==null && other.getZBAPI_CNT_APP_DETAIL_MOBResult()==null) || 
             (this.ZBAPI_CNT_APP_DETAIL_MOBResult!=null &&
              this.ZBAPI_CNT_APP_DETAIL_MOBResult.equals(other.getZBAPI_CNT_APP_DETAIL_MOBResult())));
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
        if (getZBAPI_CNT_APP_DETAIL_MOBResult() != null) {
            _hashCode += getZBAPI_CNT_APP_DETAIL_MOBResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CNT_APP_DETAIL_MOBResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CNT_APP_DETAIL_MOBResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_CNT_APP_DETAIL_MOBResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_CNT_APP_DETAIL_MOBResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_CNT_APP_DETAIL_MOBResponse>ZBAPI_CNT_APP_DETAIL_MOBResult"));
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
