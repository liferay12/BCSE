/**
 * ZBAPI_STATUS163.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_STATUS163  implements java.io.Serializable {
    private java.lang.String strVKONT;

    public ZBAPI_STATUS163() {
    }

    public ZBAPI_STATUS163(
           java.lang.String strVKONT) {
           this.strVKONT = strVKONT;
    }


    /**
     * Gets the strVKONT value for this ZBAPI_STATUS163.
     * 
     * @return strVKONT
     */
    public java.lang.String getStrVKONT() {
        return strVKONT;
    }


    /**
     * Sets the strVKONT value for this ZBAPI_STATUS163.
     * 
     * @param strVKONT
     */
    public void setStrVKONT(java.lang.String strVKONT) {
        this.strVKONT = strVKONT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_STATUS163)) return false;
        ZBAPI_STATUS163 other = (ZBAPI_STATUS163) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strVKONT==null && other.getStrVKONT()==null) || 
             (this.strVKONT!=null &&
              this.strVKONT.equals(other.getStrVKONT())));
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
        if (getStrVKONT() != null) {
            _hashCode += getStrVKONT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_STATUS163.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_STATUS163"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strVKONT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strVKONT"));
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
