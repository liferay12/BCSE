/**
 * ZBAPI_FETCH_ENFCA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_FETCH_ENFCA  implements java.io.Serializable {
    private java.lang.String strBPNo;

    public ZBAPI_FETCH_ENFCA() {
    }

    public ZBAPI_FETCH_ENFCA(
           java.lang.String strBPNo) {
           this.strBPNo = strBPNo;
    }


    /**
     * Gets the strBPNo value for this ZBAPI_FETCH_ENFCA.
     * 
     * @return strBPNo
     */
    public java.lang.String getStrBPNo() {
        return strBPNo;
    }


    /**
     * Sets the strBPNo value for this ZBAPI_FETCH_ENFCA.
     * 
     * @param strBPNo
     */
    public void setStrBPNo(java.lang.String strBPNo) {
        this.strBPNo = strBPNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_FETCH_ENFCA)) return false;
        ZBAPI_FETCH_ENFCA other = (ZBAPI_FETCH_ENFCA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strBPNo==null && other.getStrBPNo()==null) || 
             (this.strBPNo!=null &&
              this.strBPNo.equals(other.getStrBPNo())));
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
        if (getStrBPNo() != null) {
            _hashCode += getStrBPNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_FETCH_ENFCA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_FETCH_ENFCA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strBPNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strBPNo"));
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
