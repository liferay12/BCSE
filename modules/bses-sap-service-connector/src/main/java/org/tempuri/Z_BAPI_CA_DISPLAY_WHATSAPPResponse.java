/**
 * Z_BAPI_CA_DISPLAY_WHATSAPPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BAPI_CA_DISPLAY_WHATSAPPResponse  implements java.io.Serializable {
    private org.tempuri.Z_BAPI_CA_DISPLAY_WHATSAPPResponseZ_BAPI_CA_DISPLAY_WHATSAPPResult z_BAPI_CA_DISPLAY_WHATSAPPResult;

    public Z_BAPI_CA_DISPLAY_WHATSAPPResponse() {
    }

    public Z_BAPI_CA_DISPLAY_WHATSAPPResponse(
           org.tempuri.Z_BAPI_CA_DISPLAY_WHATSAPPResponseZ_BAPI_CA_DISPLAY_WHATSAPPResult z_BAPI_CA_DISPLAY_WHATSAPPResult) {
           this.z_BAPI_CA_DISPLAY_WHATSAPPResult = z_BAPI_CA_DISPLAY_WHATSAPPResult;
    }


    /**
     * Gets the z_BAPI_CA_DISPLAY_WHATSAPPResult value for this Z_BAPI_CA_DISPLAY_WHATSAPPResponse.
     * 
     * @return z_BAPI_CA_DISPLAY_WHATSAPPResult
     */
    public org.tempuri.Z_BAPI_CA_DISPLAY_WHATSAPPResponseZ_BAPI_CA_DISPLAY_WHATSAPPResult getZ_BAPI_CA_DISPLAY_WHATSAPPResult() {
        return z_BAPI_CA_DISPLAY_WHATSAPPResult;
    }


    /**
     * Sets the z_BAPI_CA_DISPLAY_WHATSAPPResult value for this Z_BAPI_CA_DISPLAY_WHATSAPPResponse.
     * 
     * @param z_BAPI_CA_DISPLAY_WHATSAPPResult
     */
    public void setZ_BAPI_CA_DISPLAY_WHATSAPPResult(org.tempuri.Z_BAPI_CA_DISPLAY_WHATSAPPResponseZ_BAPI_CA_DISPLAY_WHATSAPPResult z_BAPI_CA_DISPLAY_WHATSAPPResult) {
        this.z_BAPI_CA_DISPLAY_WHATSAPPResult = z_BAPI_CA_DISPLAY_WHATSAPPResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BAPI_CA_DISPLAY_WHATSAPPResponse)) return false;
        Z_BAPI_CA_DISPLAY_WHATSAPPResponse other = (Z_BAPI_CA_DISPLAY_WHATSAPPResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.z_BAPI_CA_DISPLAY_WHATSAPPResult==null && other.getZ_BAPI_CA_DISPLAY_WHATSAPPResult()==null) || 
             (this.z_BAPI_CA_DISPLAY_WHATSAPPResult!=null &&
              this.z_BAPI_CA_DISPLAY_WHATSAPPResult.equals(other.getZ_BAPI_CA_DISPLAY_WHATSAPPResult())));
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
        if (getZ_BAPI_CA_DISPLAY_WHATSAPPResult() != null) {
            _hashCode += getZ_BAPI_CA_DISPLAY_WHATSAPPResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BAPI_CA_DISPLAY_WHATSAPPResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BAPI_CA_DISPLAY_WHATSAPPResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("z_BAPI_CA_DISPLAY_WHATSAPPResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Z_BAPI_CA_DISPLAY_WHATSAPPResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Z_BAPI_CA_DISPLAY_WHATSAPPResponse>Z_BAPI_CA_DISPLAY_WHATSAPPResult"));
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
