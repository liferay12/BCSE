/**
 * ZBAPI_DISPLAY_BILL_WEB_EXT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_DISPLAY_BILL_WEB_EXT  implements java.io.Serializable {
    private java.lang.String strCA_Number;

    private java.lang.String strBillMmonth;

    public ZBAPI_DISPLAY_BILL_WEB_EXT() {
    }

    public ZBAPI_DISPLAY_BILL_WEB_EXT(
           java.lang.String strCA_Number,
           java.lang.String strBillMmonth) {
           this.strCA_Number = strCA_Number;
           this.strBillMmonth = strBillMmonth;
    }


    /**
     * Gets the strCA_Number value for this ZBAPI_DISPLAY_BILL_WEB_EXT.
     * 
     * @return strCA_Number
     */
    public java.lang.String getStrCA_Number() {
        return strCA_Number;
    }


    /**
     * Sets the strCA_Number value for this ZBAPI_DISPLAY_BILL_WEB_EXT.
     * 
     * @param strCA_Number
     */
    public void setStrCA_Number(java.lang.String strCA_Number) {
        this.strCA_Number = strCA_Number;
    }


    /**
     * Gets the strBillMmonth value for this ZBAPI_DISPLAY_BILL_WEB_EXT.
     * 
     * @return strBillMmonth
     */
    public java.lang.String getStrBillMmonth() {
        return strBillMmonth;
    }


    /**
     * Sets the strBillMmonth value for this ZBAPI_DISPLAY_BILL_WEB_EXT.
     * 
     * @param strBillMmonth
     */
    public void setStrBillMmonth(java.lang.String strBillMmonth) {
        this.strBillMmonth = strBillMmonth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_DISPLAY_BILL_WEB_EXT)) return false;
        ZBAPI_DISPLAY_BILL_WEB_EXT other = (ZBAPI_DISPLAY_BILL_WEB_EXT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCA_Number==null && other.getStrCA_Number()==null) || 
             (this.strCA_Number!=null &&
              this.strCA_Number.equals(other.getStrCA_Number()))) &&
            ((this.strBillMmonth==null && other.getStrBillMmonth()==null) || 
             (this.strBillMmonth!=null &&
              this.strBillMmonth.equals(other.getStrBillMmonth())));
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
        if (getStrCA_Number() != null) {
            _hashCode += getStrCA_Number().hashCode();
        }
        if (getStrBillMmonth() != null) {
            _hashCode += getStrBillMmonth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_DISPLAY_BILL_WEB_EXT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_DISPLAY_BILL_WEB_EXT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCA_Number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCA_Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strBillMmonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strBillMmonth"));
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
