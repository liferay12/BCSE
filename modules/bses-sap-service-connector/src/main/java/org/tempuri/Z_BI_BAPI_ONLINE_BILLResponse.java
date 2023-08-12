/**
 * Z_BI_BAPI_ONLINE_BILLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BI_BAPI_ONLINE_BILLResponse  implements java.io.Serializable {
    private org.tempuri.Z_BI_BAPI_ONLINE_BILLResponseZ_BI_BAPI_ONLINE_BILLResult z_BI_BAPI_ONLINE_BILLResult;

    public Z_BI_BAPI_ONLINE_BILLResponse() {
    }

    public Z_BI_BAPI_ONLINE_BILLResponse(
           org.tempuri.Z_BI_BAPI_ONLINE_BILLResponseZ_BI_BAPI_ONLINE_BILLResult z_BI_BAPI_ONLINE_BILLResult) {
           this.z_BI_BAPI_ONLINE_BILLResult = z_BI_BAPI_ONLINE_BILLResult;
    }


    /**
     * Gets the z_BI_BAPI_ONLINE_BILLResult value for this Z_BI_BAPI_ONLINE_BILLResponse.
     * 
     * @return z_BI_BAPI_ONLINE_BILLResult
     */
    public org.tempuri.Z_BI_BAPI_ONLINE_BILLResponseZ_BI_BAPI_ONLINE_BILLResult getZ_BI_BAPI_ONLINE_BILLResult() {
        return z_BI_BAPI_ONLINE_BILLResult;
    }


    /**
     * Sets the z_BI_BAPI_ONLINE_BILLResult value for this Z_BI_BAPI_ONLINE_BILLResponse.
     * 
     * @param z_BI_BAPI_ONLINE_BILLResult
     */
    public void setZ_BI_BAPI_ONLINE_BILLResult(org.tempuri.Z_BI_BAPI_ONLINE_BILLResponseZ_BI_BAPI_ONLINE_BILLResult z_BI_BAPI_ONLINE_BILLResult) {
        this.z_BI_BAPI_ONLINE_BILLResult = z_BI_BAPI_ONLINE_BILLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BI_BAPI_ONLINE_BILLResponse)) return false;
        Z_BI_BAPI_ONLINE_BILLResponse other = (Z_BI_BAPI_ONLINE_BILLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.z_BI_BAPI_ONLINE_BILLResult==null && other.getZ_BI_BAPI_ONLINE_BILLResult()==null) || 
             (this.z_BI_BAPI_ONLINE_BILLResult!=null &&
              this.z_BI_BAPI_ONLINE_BILLResult.equals(other.getZ_BI_BAPI_ONLINE_BILLResult())));
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
        if (getZ_BI_BAPI_ONLINE_BILLResult() != null) {
            _hashCode += getZ_BI_BAPI_ONLINE_BILLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BI_BAPI_ONLINE_BILLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BI_BAPI_ONLINE_BILLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("z_BI_BAPI_ONLINE_BILLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Z_BI_BAPI_ONLINE_BILLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Z_BI_BAPI_ONLINE_BILLResponse>Z_BI_BAPI_ONLINE_BILLResult"));
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
