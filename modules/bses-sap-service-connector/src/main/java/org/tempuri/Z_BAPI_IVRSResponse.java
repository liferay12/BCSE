/**
 * Z_BAPI_IVRSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BAPI_IVRSResponse  implements java.io.Serializable {
    private org.tempuri.Z_BAPI_IVRSResponseZ_BAPI_IVRSResult z_BAPI_IVRSResult;

    public Z_BAPI_IVRSResponse() {
    }

    public Z_BAPI_IVRSResponse(
           org.tempuri.Z_BAPI_IVRSResponseZ_BAPI_IVRSResult z_BAPI_IVRSResult) {
           this.z_BAPI_IVRSResult = z_BAPI_IVRSResult;
    }


    /**
     * Gets the z_BAPI_IVRSResult value for this Z_BAPI_IVRSResponse.
     * 
     * @return z_BAPI_IVRSResult
     */
    public org.tempuri.Z_BAPI_IVRSResponseZ_BAPI_IVRSResult getZ_BAPI_IVRSResult() {
        return z_BAPI_IVRSResult;
    }


    /**
     * Sets the z_BAPI_IVRSResult value for this Z_BAPI_IVRSResponse.
     * 
     * @param z_BAPI_IVRSResult
     */
    public void setZ_BAPI_IVRSResult(org.tempuri.Z_BAPI_IVRSResponseZ_BAPI_IVRSResult z_BAPI_IVRSResult) {
        this.z_BAPI_IVRSResult = z_BAPI_IVRSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BAPI_IVRSResponse)) return false;
        Z_BAPI_IVRSResponse other = (Z_BAPI_IVRSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.z_BAPI_IVRSResult==null && other.getZ_BAPI_IVRSResult()==null) || 
             (this.z_BAPI_IVRSResult!=null &&
              this.z_BAPI_IVRSResult.equals(other.getZ_BAPI_IVRSResult())));
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
        if (getZ_BAPI_IVRSResult() != null) {
            _hashCode += getZ_BAPI_IVRSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BAPI_IVRSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BAPI_IVRSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("z_BAPI_IVRSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Z_BAPI_IVRSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Z_BAPI_IVRSResponse>Z_BAPI_IVRSResult"));
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
