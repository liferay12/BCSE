/**
 * Z_BAPI_DSS_ISU_CA_DISPLAY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BAPI_DSS_ISU_CA_DISPLAY  implements java.io.Serializable {
    private java.lang.String strCANumber;

    private java.lang.String strCRNNumber;

    public Z_BAPI_DSS_ISU_CA_DISPLAY() {
    }

    public Z_BAPI_DSS_ISU_CA_DISPLAY(
           java.lang.String strCANumber,
           java.lang.String strCRNNumber) {
           this.strCANumber = strCANumber;
           this.strCRNNumber = strCRNNumber;
    }


    /**
     * Gets the strCANumber value for this Z_BAPI_DSS_ISU_CA_DISPLAY.
     * 
     * @return strCANumber
     */
    public java.lang.String getStrCANumber() {
        return strCANumber;
    }


    /**
     * Sets the strCANumber value for this Z_BAPI_DSS_ISU_CA_DISPLAY.
     * 
     * @param strCANumber
     */
    public void setStrCANumber(java.lang.String strCANumber) {
        this.strCANumber = strCANumber;
    }


    /**
     * Gets the strCRNNumber value for this Z_BAPI_DSS_ISU_CA_DISPLAY.
     * 
     * @return strCRNNumber
     */
    public java.lang.String getStrCRNNumber() {
        return strCRNNumber;
    }


    /**
     * Sets the strCRNNumber value for this Z_BAPI_DSS_ISU_CA_DISPLAY.
     * 
     * @param strCRNNumber
     */
    public void setStrCRNNumber(java.lang.String strCRNNumber) {
        this.strCRNNumber = strCRNNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BAPI_DSS_ISU_CA_DISPLAY)) return false;
        Z_BAPI_DSS_ISU_CA_DISPLAY other = (Z_BAPI_DSS_ISU_CA_DISPLAY) obj;
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
            ((this.strCRNNumber==null && other.getStrCRNNumber()==null) || 
             (this.strCRNNumber!=null &&
              this.strCRNNumber.equals(other.getStrCRNNumber())));
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
        if (getStrCRNNumber() != null) {
            _hashCode += getStrCRNNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BAPI_DSS_ISU_CA_DISPLAY.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BAPI_DSS_ISU_CA_DISPLAY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCRNNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCRNNumber"));
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
