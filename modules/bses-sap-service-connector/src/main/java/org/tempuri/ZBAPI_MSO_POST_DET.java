/**
 * ZBAPI_MSO_POST_DET.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_MSO_POST_DET  implements java.io.Serializable {
    private java.lang.String strCA_Number;

    public ZBAPI_MSO_POST_DET() {
    }

    public ZBAPI_MSO_POST_DET(
           java.lang.String strCA_Number) {
           this.strCA_Number = strCA_Number;
    }


    /**
     * Gets the strCA_Number value for this ZBAPI_MSO_POST_DET.
     * 
     * @return strCA_Number
     */
    public java.lang.String getStrCA_Number() {
        return strCA_Number;
    }


    /**
     * Sets the strCA_Number value for this ZBAPI_MSO_POST_DET.
     * 
     * @param strCA_Number
     */
    public void setStrCA_Number(java.lang.String strCA_Number) {
        this.strCA_Number = strCA_Number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_MSO_POST_DET)) return false;
        ZBAPI_MSO_POST_DET other = (ZBAPI_MSO_POST_DET) obj;
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
              this.strCA_Number.equals(other.getStrCA_Number())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_MSO_POST_DET.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_MSO_POST_DET"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCA_Number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCA_Number"));
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
