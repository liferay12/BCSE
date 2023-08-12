/**
 * Z_BAPI_ZDSS_WEB_LINK_NICResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BAPI_ZDSS_WEB_LINK_NICResponse  implements java.io.Serializable {
    private org.tempuri.Z_BAPI_ZDSS_WEB_LINK_NICResponseZ_BAPI_ZDSS_WEB_LINK_NICResult z_BAPI_ZDSS_WEB_LINK_NICResult;

    public Z_BAPI_ZDSS_WEB_LINK_NICResponse() {
    }

    public Z_BAPI_ZDSS_WEB_LINK_NICResponse(
           org.tempuri.Z_BAPI_ZDSS_WEB_LINK_NICResponseZ_BAPI_ZDSS_WEB_LINK_NICResult z_BAPI_ZDSS_WEB_LINK_NICResult) {
           this.z_BAPI_ZDSS_WEB_LINK_NICResult = z_BAPI_ZDSS_WEB_LINK_NICResult;
    }


    /**
     * Gets the z_BAPI_ZDSS_WEB_LINK_NICResult value for this Z_BAPI_ZDSS_WEB_LINK_NICResponse.
     * 
     * @return z_BAPI_ZDSS_WEB_LINK_NICResult
     */
    public org.tempuri.Z_BAPI_ZDSS_WEB_LINK_NICResponseZ_BAPI_ZDSS_WEB_LINK_NICResult getZ_BAPI_ZDSS_WEB_LINK_NICResult() {
        return z_BAPI_ZDSS_WEB_LINK_NICResult;
    }


    /**
     * Sets the z_BAPI_ZDSS_WEB_LINK_NICResult value for this Z_BAPI_ZDSS_WEB_LINK_NICResponse.
     * 
     * @param z_BAPI_ZDSS_WEB_LINK_NICResult
     */
    public void setZ_BAPI_ZDSS_WEB_LINK_NICResult(org.tempuri.Z_BAPI_ZDSS_WEB_LINK_NICResponseZ_BAPI_ZDSS_WEB_LINK_NICResult z_BAPI_ZDSS_WEB_LINK_NICResult) {
        this.z_BAPI_ZDSS_WEB_LINK_NICResult = z_BAPI_ZDSS_WEB_LINK_NICResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BAPI_ZDSS_WEB_LINK_NICResponse)) return false;
        Z_BAPI_ZDSS_WEB_LINK_NICResponse other = (Z_BAPI_ZDSS_WEB_LINK_NICResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.z_BAPI_ZDSS_WEB_LINK_NICResult==null && other.getZ_BAPI_ZDSS_WEB_LINK_NICResult()==null) || 
             (this.z_BAPI_ZDSS_WEB_LINK_NICResult!=null &&
              this.z_BAPI_ZDSS_WEB_LINK_NICResult.equals(other.getZ_BAPI_ZDSS_WEB_LINK_NICResult())));
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
        if (getZ_BAPI_ZDSS_WEB_LINK_NICResult() != null) {
            _hashCode += getZ_BAPI_ZDSS_WEB_LINK_NICResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BAPI_ZDSS_WEB_LINK_NICResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BAPI_ZDSS_WEB_LINK_NICResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("z_BAPI_ZDSS_WEB_LINK_NICResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Z_BAPI_ZDSS_WEB_LINK_NICResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Z_BAPI_ZDSS_WEB_LINK_NICResponse>Z_BAPI_ZDSS_WEB_LINK_NICResult"));
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
