/**
 * Z_BAPI_INPUT_CP_DETAILSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BAPI_INPUT_CP_DETAILSResponse  implements java.io.Serializable {
    private org.tempuri.Z_BAPI_INPUT_CP_DETAILSResponseZ_BAPI_INPUT_CP_DETAILSResult z_BAPI_INPUT_CP_DETAILSResult;

    public Z_BAPI_INPUT_CP_DETAILSResponse() {
    }

    public Z_BAPI_INPUT_CP_DETAILSResponse(
           org.tempuri.Z_BAPI_INPUT_CP_DETAILSResponseZ_BAPI_INPUT_CP_DETAILSResult z_BAPI_INPUT_CP_DETAILSResult) {
           this.z_BAPI_INPUT_CP_DETAILSResult = z_BAPI_INPUT_CP_DETAILSResult;
    }


    /**
     * Gets the z_BAPI_INPUT_CP_DETAILSResult value for this Z_BAPI_INPUT_CP_DETAILSResponse.
     * 
     * @return z_BAPI_INPUT_CP_DETAILSResult
     */
    public org.tempuri.Z_BAPI_INPUT_CP_DETAILSResponseZ_BAPI_INPUT_CP_DETAILSResult getZ_BAPI_INPUT_CP_DETAILSResult() {
        return z_BAPI_INPUT_CP_DETAILSResult;
    }


    /**
     * Sets the z_BAPI_INPUT_CP_DETAILSResult value for this Z_BAPI_INPUT_CP_DETAILSResponse.
     * 
     * @param z_BAPI_INPUT_CP_DETAILSResult
     */
    public void setZ_BAPI_INPUT_CP_DETAILSResult(org.tempuri.Z_BAPI_INPUT_CP_DETAILSResponseZ_BAPI_INPUT_CP_DETAILSResult z_BAPI_INPUT_CP_DETAILSResult) {
        this.z_BAPI_INPUT_CP_DETAILSResult = z_BAPI_INPUT_CP_DETAILSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BAPI_INPUT_CP_DETAILSResponse)) return false;
        Z_BAPI_INPUT_CP_DETAILSResponse other = (Z_BAPI_INPUT_CP_DETAILSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.z_BAPI_INPUT_CP_DETAILSResult==null && other.getZ_BAPI_INPUT_CP_DETAILSResult()==null) || 
             (this.z_BAPI_INPUT_CP_DETAILSResult!=null &&
              this.z_BAPI_INPUT_CP_DETAILSResult.equals(other.getZ_BAPI_INPUT_CP_DETAILSResult())));
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
        if (getZ_BAPI_INPUT_CP_DETAILSResult() != null) {
            _hashCode += getZ_BAPI_INPUT_CP_DETAILSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BAPI_INPUT_CP_DETAILSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BAPI_INPUT_CP_DETAILSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("z_BAPI_INPUT_CP_DETAILSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Z_BAPI_INPUT_CP_DETAILSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Z_BAPI_INPUT_CP_DETAILSResponse>Z_BAPI_INPUT_CP_DETAILSResult"));
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
