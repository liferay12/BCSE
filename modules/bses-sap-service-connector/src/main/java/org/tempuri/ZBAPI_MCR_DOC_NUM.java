/**
 * ZBAPI_MCR_DOC_NUM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_MCR_DOC_NUM  implements java.io.Serializable {
    private java.lang.String strAR_DATE;

    private java.lang.String strCOMPANY_CODE;

    public ZBAPI_MCR_DOC_NUM() {
    }

    public ZBAPI_MCR_DOC_NUM(
           java.lang.String strAR_DATE,
           java.lang.String strCOMPANY_CODE) {
           this.strAR_DATE = strAR_DATE;
           this.strCOMPANY_CODE = strCOMPANY_CODE;
    }


    /**
     * Gets the strAR_DATE value for this ZBAPI_MCR_DOC_NUM.
     * 
     * @return strAR_DATE
     */
    public java.lang.String getStrAR_DATE() {
        return strAR_DATE;
    }


    /**
     * Sets the strAR_DATE value for this ZBAPI_MCR_DOC_NUM.
     * 
     * @param strAR_DATE
     */
    public void setStrAR_DATE(java.lang.String strAR_DATE) {
        this.strAR_DATE = strAR_DATE;
    }


    /**
     * Gets the strCOMPANY_CODE value for this ZBAPI_MCR_DOC_NUM.
     * 
     * @return strCOMPANY_CODE
     */
    public java.lang.String getStrCOMPANY_CODE() {
        return strCOMPANY_CODE;
    }


    /**
     * Sets the strCOMPANY_CODE value for this ZBAPI_MCR_DOC_NUM.
     * 
     * @param strCOMPANY_CODE
     */
    public void setStrCOMPANY_CODE(java.lang.String strCOMPANY_CODE) {
        this.strCOMPANY_CODE = strCOMPANY_CODE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_MCR_DOC_NUM)) return false;
        ZBAPI_MCR_DOC_NUM other = (ZBAPI_MCR_DOC_NUM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strAR_DATE==null && other.getStrAR_DATE()==null) || 
             (this.strAR_DATE!=null &&
              this.strAR_DATE.equals(other.getStrAR_DATE()))) &&
            ((this.strCOMPANY_CODE==null && other.getStrCOMPANY_CODE()==null) || 
             (this.strCOMPANY_CODE!=null &&
              this.strCOMPANY_CODE.equals(other.getStrCOMPANY_CODE())));
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
        if (getStrAR_DATE() != null) {
            _hashCode += getStrAR_DATE().hashCode();
        }
        if (getStrCOMPANY_CODE() != null) {
            _hashCode += getStrCOMPANY_CODE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_MCR_DOC_NUM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_MCR_DOC_NUM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAR_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAR_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCOMPANY_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCOMPANY_CODE"));
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
