/**
 * Z_CSINT15Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Z_CSINT15Response  implements java.io.Serializable {
    private com.bses2.sap.ws.Z_CSINT15ResponseZ_CSINT15Result z_CSINT15Result;

    public Z_CSINT15Response() {
    }

    public Z_CSINT15Response(
           com.bses2.sap.ws.Z_CSINT15ResponseZ_CSINT15Result z_CSINT15Result) {
           this.z_CSINT15Result = z_CSINT15Result;
    }


    /**
     * Gets the z_CSINT15Result value for this Z_CSINT15Response.
     * 
     * @return z_CSINT15Result
     */
    public com.bses2.sap.ws.Z_CSINT15ResponseZ_CSINT15Result getZ_CSINT15Result() {
        return z_CSINT15Result;
    }


    /**
     * Sets the z_CSINT15Result value for this Z_CSINT15Response.
     * 
     * @param z_CSINT15Result
     */
    public void setZ_CSINT15Result(com.bses2.sap.ws.Z_CSINT15ResponseZ_CSINT15Result z_CSINT15Result) {
        this.z_CSINT15Result = z_CSINT15Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_CSINT15Response)) return false;
        Z_CSINT15Response other = (Z_CSINT15Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.z_CSINT15Result==null && other.getZ_CSINT15Result()==null) || 
             (this.z_CSINT15Result!=null &&
              this.z_CSINT15Result.equals(other.getZ_CSINT15Result())));
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
        if (getZ_CSINT15Result() != null) {
            _hashCode += getZ_CSINT15Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_CSINT15Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_CSINT15Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("z_CSINT15Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Z_CSINT15Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Z_CSINT15Response>Z_CSINT15Result"));
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
