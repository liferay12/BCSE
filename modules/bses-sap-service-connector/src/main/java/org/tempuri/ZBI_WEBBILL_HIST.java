/**
 * ZBI_WEBBILL_HIST.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBI_WEBBILL_HIST  implements java.io.Serializable {
    private java.lang.String strCANumber;

    private java.lang.String strBillMonth;

    public ZBI_WEBBILL_HIST() {
    }

    public ZBI_WEBBILL_HIST(
           java.lang.String strCANumber,
           java.lang.String strBillMonth) {
           this.strCANumber = strCANumber;
           this.strBillMonth = strBillMonth;
    }


    /**
     * Gets the strCANumber value for this ZBI_WEBBILL_HIST.
     * 
     * @return strCANumber
     */
    public java.lang.String getStrCANumber() {
        return strCANumber;
    }


    /**
     * Sets the strCANumber value for this ZBI_WEBBILL_HIST.
     * 
     * @param strCANumber
     */
    public void setStrCANumber(java.lang.String strCANumber) {
        this.strCANumber = strCANumber;
    }


    /**
     * Gets the strBillMonth value for this ZBI_WEBBILL_HIST.
     * 
     * @return strBillMonth
     */
    public java.lang.String getStrBillMonth() {
        return strBillMonth;
    }


    /**
     * Sets the strBillMonth value for this ZBI_WEBBILL_HIST.
     * 
     * @param strBillMonth
     */
    public void setStrBillMonth(java.lang.String strBillMonth) {
        this.strBillMonth = strBillMonth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBI_WEBBILL_HIST)) return false;
        ZBI_WEBBILL_HIST other = (ZBI_WEBBILL_HIST) obj;
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
            ((this.strBillMonth==null && other.getStrBillMonth()==null) || 
             (this.strBillMonth!=null &&
              this.strBillMonth.equals(other.getStrBillMonth())));
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
        if (getStrBillMonth() != null) {
            _hashCode += getStrBillMonth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBI_WEBBILL_HIST.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBI_WEBBILL_HIST"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strBillMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strBillMonth"));
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
