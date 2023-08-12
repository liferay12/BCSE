/**
 * Z_BAPI_CMS_ISU_CA_DISPLAYResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BAPI_CMS_ISU_CA_DISPLAYResponse  implements java.io.Serializable {
    private org.tempuri.Z_BAPI_CMS_ISU_CA_DISPLAYResponseZ_BAPI_CMS_ISU_CA_DISPLAYResult z_BAPI_CMS_ISU_CA_DISPLAYResult;

    public Z_BAPI_CMS_ISU_CA_DISPLAYResponse() {
    }

    public Z_BAPI_CMS_ISU_CA_DISPLAYResponse(
           org.tempuri.Z_BAPI_CMS_ISU_CA_DISPLAYResponseZ_BAPI_CMS_ISU_CA_DISPLAYResult z_BAPI_CMS_ISU_CA_DISPLAYResult) {
           this.z_BAPI_CMS_ISU_CA_DISPLAYResult = z_BAPI_CMS_ISU_CA_DISPLAYResult;
    }


    /**
     * Gets the z_BAPI_CMS_ISU_CA_DISPLAYResult value for this Z_BAPI_CMS_ISU_CA_DISPLAYResponse.
     * 
     * @return z_BAPI_CMS_ISU_CA_DISPLAYResult
     */
    public org.tempuri.Z_BAPI_CMS_ISU_CA_DISPLAYResponseZ_BAPI_CMS_ISU_CA_DISPLAYResult getZ_BAPI_CMS_ISU_CA_DISPLAYResult() {
        return z_BAPI_CMS_ISU_CA_DISPLAYResult;
    }


    /**
     * Sets the z_BAPI_CMS_ISU_CA_DISPLAYResult value for this Z_BAPI_CMS_ISU_CA_DISPLAYResponse.
     * 
     * @param z_BAPI_CMS_ISU_CA_DISPLAYResult
     */
    public void setZ_BAPI_CMS_ISU_CA_DISPLAYResult(org.tempuri.Z_BAPI_CMS_ISU_CA_DISPLAYResponseZ_BAPI_CMS_ISU_CA_DISPLAYResult z_BAPI_CMS_ISU_CA_DISPLAYResult) {
        this.z_BAPI_CMS_ISU_CA_DISPLAYResult = z_BAPI_CMS_ISU_CA_DISPLAYResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BAPI_CMS_ISU_CA_DISPLAYResponse)) return false;
        Z_BAPI_CMS_ISU_CA_DISPLAYResponse other = (Z_BAPI_CMS_ISU_CA_DISPLAYResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.z_BAPI_CMS_ISU_CA_DISPLAYResult==null && other.getZ_BAPI_CMS_ISU_CA_DISPLAYResult()==null) || 
             (this.z_BAPI_CMS_ISU_CA_DISPLAYResult!=null &&
              this.z_BAPI_CMS_ISU_CA_DISPLAYResult.equals(other.getZ_BAPI_CMS_ISU_CA_DISPLAYResult())));
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
        if (getZ_BAPI_CMS_ISU_CA_DISPLAYResult() != null) {
            _hashCode += getZ_BAPI_CMS_ISU_CA_DISPLAYResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BAPI_CMS_ISU_CA_DISPLAYResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BAPI_CMS_ISU_CA_DISPLAYResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("z_BAPI_CMS_ISU_CA_DISPLAYResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Z_BAPI_CMS_ISU_CA_DISPLAYResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Z_BAPI_CMS_ISU_CA_DISPLAYResponse>Z_BAPI_CMS_ISU_CA_DISPLAYResult"));
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
