/**
 * ZBAPI_ONLINE_BILL_PDF.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_ONLINE_BILL_PDF  implements java.io.Serializable {
    private java.lang.String strCANumber;

    private java.lang.String strEBSKNO;

    public ZBAPI_ONLINE_BILL_PDF() {
    }

    public ZBAPI_ONLINE_BILL_PDF(
           java.lang.String strCANumber,
           java.lang.String strEBSKNO) {
           this.strCANumber = strCANumber;
           this.strEBSKNO = strEBSKNO;
    }


    /**
     * Gets the strCANumber value for this ZBAPI_ONLINE_BILL_PDF.
     * 
     * @return strCANumber
     */
    public java.lang.String getStrCANumber() {
        return strCANumber;
    }


    /**
     * Sets the strCANumber value for this ZBAPI_ONLINE_BILL_PDF.
     * 
     * @param strCANumber
     */
    public void setStrCANumber(java.lang.String strCANumber) {
        this.strCANumber = strCANumber;
    }


    /**
     * Gets the strEBSKNO value for this ZBAPI_ONLINE_BILL_PDF.
     * 
     * @return strEBSKNO
     */
    public java.lang.String getStrEBSKNO() {
        return strEBSKNO;
    }


    /**
     * Sets the strEBSKNO value for this ZBAPI_ONLINE_BILL_PDF.
     * 
     * @param strEBSKNO
     */
    public void setStrEBSKNO(java.lang.String strEBSKNO) {
        this.strEBSKNO = strEBSKNO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_ONLINE_BILL_PDF)) return false;
        ZBAPI_ONLINE_BILL_PDF other = (ZBAPI_ONLINE_BILL_PDF) obj;
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
            ((this.strEBSKNO==null && other.getStrEBSKNO()==null) || 
             (this.strEBSKNO!=null &&
              this.strEBSKNO.equals(other.getStrEBSKNO())));
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
        if (getStrEBSKNO() != null) {
            _hashCode += getStrEBSKNO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_ONLINE_BILL_PDF.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_ONLINE_BILL_PDF"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strEBSKNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strEBSKNO"));
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
