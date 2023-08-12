/**
 * Z_BI_BAPI_SMART_MTR_UPDT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BI_BAPI_SMART_MTR_UPDT  implements java.io.Serializable {
    private java.lang.String strCANumber;

    private java.lang.String strOPBEL;

    private java.lang.String strReturnCode;

    public Z_BI_BAPI_SMART_MTR_UPDT() {
    }

    public Z_BI_BAPI_SMART_MTR_UPDT(
           java.lang.String strCANumber,
           java.lang.String strOPBEL,
           java.lang.String strReturnCode) {
           this.strCANumber = strCANumber;
           this.strOPBEL = strOPBEL;
           this.strReturnCode = strReturnCode;
    }


    /**
     * Gets the strCANumber value for this Z_BI_BAPI_SMART_MTR_UPDT.
     * 
     * @return strCANumber
     */
    public java.lang.String getStrCANumber() {
        return strCANumber;
    }


    /**
     * Sets the strCANumber value for this Z_BI_BAPI_SMART_MTR_UPDT.
     * 
     * @param strCANumber
     */
    public void setStrCANumber(java.lang.String strCANumber) {
        this.strCANumber = strCANumber;
    }


    /**
     * Gets the strOPBEL value for this Z_BI_BAPI_SMART_MTR_UPDT.
     * 
     * @return strOPBEL
     */
    public java.lang.String getStrOPBEL() {
        return strOPBEL;
    }


    /**
     * Sets the strOPBEL value for this Z_BI_BAPI_SMART_MTR_UPDT.
     * 
     * @param strOPBEL
     */
    public void setStrOPBEL(java.lang.String strOPBEL) {
        this.strOPBEL = strOPBEL;
    }


    /**
     * Gets the strReturnCode value for this Z_BI_BAPI_SMART_MTR_UPDT.
     * 
     * @return strReturnCode
     */
    public java.lang.String getStrReturnCode() {
        return strReturnCode;
    }


    /**
     * Sets the strReturnCode value for this Z_BI_BAPI_SMART_MTR_UPDT.
     * 
     * @param strReturnCode
     */
    public void setStrReturnCode(java.lang.String strReturnCode) {
        this.strReturnCode = strReturnCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BI_BAPI_SMART_MTR_UPDT)) return false;
        Z_BI_BAPI_SMART_MTR_UPDT other = (Z_BI_BAPI_SMART_MTR_UPDT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCANumber==null && other.getStrCANumber()==null) || 
             (this.strCANumber!=null &&
              this.strCANumber.equals(other.getStrCANumber()))) &&
            ((this.strOPBEL==null && other.getStrOPBEL()==null) || 
             (this.strOPBEL!=null &&
              this.strOPBEL.equals(other.getStrOPBEL()))) &&
            ((this.strReturnCode==null && other.getStrReturnCode()==null) || 
             (this.strReturnCode!=null &&
              this.strReturnCode.equals(other.getStrReturnCode())));
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
        if (getStrCANumber() != null) {
            _hashCode += getStrCANumber().hashCode();
        }
        if (getStrOPBEL() != null) {
            _hashCode += getStrOPBEL().hashCode();
        }
        if (getStrReturnCode() != null) {
            _hashCode += getStrReturnCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BI_BAPI_SMART_MTR_UPDT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BI_BAPI_SMART_MTR_UPDT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strOPBEL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strOPBEL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strReturnCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strReturnCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
