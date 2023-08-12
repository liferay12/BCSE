/**
 * Z_BI_BAPI_ONLINE_BILL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BI_BAPI_ONLINE_BILL  implements java.io.Serializable {
    private java.lang.String strCANumber;

    private java.lang.String strInvoiceNo;

    public Z_BI_BAPI_ONLINE_BILL() {
    }

    public Z_BI_BAPI_ONLINE_BILL(
           java.lang.String strCANumber,
           java.lang.String strInvoiceNo) {
           this.strCANumber = strCANumber;
           this.strInvoiceNo = strInvoiceNo;
    }


    /**
     * Gets the strCANumber value for this Z_BI_BAPI_ONLINE_BILL.
     * 
     * @return strCANumber
     */
    public java.lang.String getStrCANumber() {
        return strCANumber;
    }


    /**
     * Sets the strCANumber value for this Z_BI_BAPI_ONLINE_BILL.
     * 
     * @param strCANumber
     */
    public void setStrCANumber(java.lang.String strCANumber) {
        this.strCANumber = strCANumber;
    }


    /**
     * Gets the strInvoiceNo value for this Z_BI_BAPI_ONLINE_BILL.
     * 
     * @return strInvoiceNo
     */
    public java.lang.String getStrInvoiceNo() {
        return strInvoiceNo;
    }


    /**
     * Sets the strInvoiceNo value for this Z_BI_BAPI_ONLINE_BILL.
     * 
     * @param strInvoiceNo
     */
    public void setStrInvoiceNo(java.lang.String strInvoiceNo) {
        this.strInvoiceNo = strInvoiceNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BI_BAPI_ONLINE_BILL)) return false;
        Z_BI_BAPI_ONLINE_BILL other = (Z_BI_BAPI_ONLINE_BILL) obj;
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
            ((this.strInvoiceNo==null && other.getStrInvoiceNo()==null) || 
             (this.strInvoiceNo!=null &&
              this.strInvoiceNo.equals(other.getStrInvoiceNo())));
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
        if (getStrInvoiceNo() != null) {
            _hashCode += getStrInvoiceNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BI_BAPI_ONLINE_BILL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BI_BAPI_ONLINE_BILL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strInvoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strInvoiceNo"));
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
