/**
 * Z_BAPI_INPUT_ENF_BILLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Z_BAPI_INPUT_ENF_BILLResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Z_BAPI_INPUT_ENF_BILLResponseZ_BAPI_INPUT_ENF_BILLResult z_BAPI_INPUT_ENF_BILLResult;

    public Z_BAPI_INPUT_ENF_BILLResponse() {
    }

    public Z_BAPI_INPUT_ENF_BILLResponse(
           com.bses2.sap.ws.Z_BAPI_INPUT_ENF_BILLResponseZ_BAPI_INPUT_ENF_BILLResult z_BAPI_INPUT_ENF_BILLResult) {
           this.z_BAPI_INPUT_ENF_BILLResult = z_BAPI_INPUT_ENF_BILLResult;
    }


    /**
     * Gets the z_BAPI_INPUT_ENF_BILLResult value for this Z_BAPI_INPUT_ENF_BILLResponse.
     * 
     * @return z_BAPI_INPUT_ENF_BILLResult
     */
    public com.bses2.sap.ws.Z_BAPI_INPUT_ENF_BILLResponseZ_BAPI_INPUT_ENF_BILLResult getZ_BAPI_INPUT_ENF_BILLResult() {
        return z_BAPI_INPUT_ENF_BILLResult;
    }


    /**
     * Sets the z_BAPI_INPUT_ENF_BILLResult value for this Z_BAPI_INPUT_ENF_BILLResponse.
     * 
     * @param z_BAPI_INPUT_ENF_BILLResult
     */
    public void setZ_BAPI_INPUT_ENF_BILLResult(com.bses2.sap.ws.Z_BAPI_INPUT_ENF_BILLResponseZ_BAPI_INPUT_ENF_BILLResult z_BAPI_INPUT_ENF_BILLResult) {
        this.z_BAPI_INPUT_ENF_BILLResult = z_BAPI_INPUT_ENF_BILLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BAPI_INPUT_ENF_BILLResponse)) return false;
        Z_BAPI_INPUT_ENF_BILLResponse other = (Z_BAPI_INPUT_ENF_BILLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.z_BAPI_INPUT_ENF_BILLResult==null && other.getZ_BAPI_INPUT_ENF_BILLResult()==null) || 
             (this.z_BAPI_INPUT_ENF_BILLResult!=null &&
              this.z_BAPI_INPUT_ENF_BILLResult.equals(other.getZ_BAPI_INPUT_ENF_BILLResult())));
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
        if (getZ_BAPI_INPUT_ENF_BILLResult() != null) {
            _hashCode += getZ_BAPI_INPUT_ENF_BILLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BAPI_INPUT_ENF_BILLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BAPI_INPUT_ENF_BILLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("z_BAPI_INPUT_ENF_BILLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Z_BAPI_INPUT_ENF_BILLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Z_BAPI_INPUT_ENF_BILLResponse>Z_BAPI_INPUT_ENF_BILLResult"));
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
