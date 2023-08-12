/**
 * ZBI_BAPI_CA_DUES_NICResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBI_BAPI_CA_DUES_NICResponse  implements java.io.Serializable {
    private org.tempuri.ZBI_BAPI_CA_DUES_NICResponseZBI_BAPI_CA_DUES_NICResult ZBI_BAPI_CA_DUES_NICResult;

    public ZBI_BAPI_CA_DUES_NICResponse() {
    }

    public ZBI_BAPI_CA_DUES_NICResponse(
           org.tempuri.ZBI_BAPI_CA_DUES_NICResponseZBI_BAPI_CA_DUES_NICResult ZBI_BAPI_CA_DUES_NICResult) {
           this.ZBI_BAPI_CA_DUES_NICResult = ZBI_BAPI_CA_DUES_NICResult;
    }


    /**
     * Gets the ZBI_BAPI_CA_DUES_NICResult value for this ZBI_BAPI_CA_DUES_NICResponse.
     * 
     * @return ZBI_BAPI_CA_DUES_NICResult
     */
    public org.tempuri.ZBI_BAPI_CA_DUES_NICResponseZBI_BAPI_CA_DUES_NICResult getZBI_BAPI_CA_DUES_NICResult() {
        return ZBI_BAPI_CA_DUES_NICResult;
    }


    /**
     * Sets the ZBI_BAPI_CA_DUES_NICResult value for this ZBI_BAPI_CA_DUES_NICResponse.
     * 
     * @param ZBI_BAPI_CA_DUES_NICResult
     */
    public void setZBI_BAPI_CA_DUES_NICResult(org.tempuri.ZBI_BAPI_CA_DUES_NICResponseZBI_BAPI_CA_DUES_NICResult ZBI_BAPI_CA_DUES_NICResult) {
        this.ZBI_BAPI_CA_DUES_NICResult = ZBI_BAPI_CA_DUES_NICResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBI_BAPI_CA_DUES_NICResponse)) return false;
        ZBI_BAPI_CA_DUES_NICResponse other = (ZBI_BAPI_CA_DUES_NICResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBI_BAPI_CA_DUES_NICResult==null && other.getZBI_BAPI_CA_DUES_NICResult()==null) || 
             (this.ZBI_BAPI_CA_DUES_NICResult!=null &&
              this.ZBI_BAPI_CA_DUES_NICResult.equals(other.getZBI_BAPI_CA_DUES_NICResult())));
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
        if (getZBI_BAPI_CA_DUES_NICResult() != null) {
            _hashCode += getZBI_BAPI_CA_DUES_NICResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBI_BAPI_CA_DUES_NICResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBI_BAPI_CA_DUES_NICResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBI_BAPI_CA_DUES_NICResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBI_BAPI_CA_DUES_NICResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBI_BAPI_CA_DUES_NICResponse>ZBI_BAPI_CA_DUES_NICResult"));
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
