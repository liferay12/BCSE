/**
 * ZBAPI_ENFORCEMENT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_ENFORCEMENT  implements java.io.Serializable {
    private java.lang.String strCANumber;

    private java.lang.String strContract;

    public ZBAPI_ENFORCEMENT() {
    }

    public ZBAPI_ENFORCEMENT(
           java.lang.String strCANumber,
           java.lang.String strContract) {
           this.strCANumber = strCANumber;
           this.strContract = strContract;
    }


    /**
     * Gets the strCANumber value for this ZBAPI_ENFORCEMENT.
     * 
     * @return strCANumber
     */
    public java.lang.String getStrCANumber() {
        return strCANumber;
    }


    /**
     * Sets the strCANumber value for this ZBAPI_ENFORCEMENT.
     * 
     * @param strCANumber
     */
    public void setStrCANumber(java.lang.String strCANumber) {
        this.strCANumber = strCANumber;
    }


    /**
     * Gets the strContract value for this ZBAPI_ENFORCEMENT.
     * 
     * @return strContract
     */
    public java.lang.String getStrContract() {
        return strContract;
    }


    /**
     * Sets the strContract value for this ZBAPI_ENFORCEMENT.
     * 
     * @param strContract
     */
    public void setStrContract(java.lang.String strContract) {
        this.strContract = strContract;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_ENFORCEMENT)) return false;
        ZBAPI_ENFORCEMENT other = (ZBAPI_ENFORCEMENT) obj;
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
            ((this.strContract==null && other.getStrContract()==null) || 
             (this.strContract!=null &&
              this.strContract.equals(other.getStrContract())));
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
        if (getStrContract() != null) {
            _hashCode += getStrContract().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_ENFORCEMENT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_ENFORCEMENT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strContract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strContract"));
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
