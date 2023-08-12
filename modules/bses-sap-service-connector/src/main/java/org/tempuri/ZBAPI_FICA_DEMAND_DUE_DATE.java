/**
 * ZBAPI_FICA_DEMAND_DUE_DATE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_FICA_DEMAND_DUE_DATE  implements java.io.Serializable {
    private java.lang.String strORDER_NO;

    public ZBAPI_FICA_DEMAND_DUE_DATE() {
    }

    public ZBAPI_FICA_DEMAND_DUE_DATE(
           java.lang.String strORDER_NO) {
           this.strORDER_NO = strORDER_NO;
    }


    /**
     * Gets the strORDER_NO value for this ZBAPI_FICA_DEMAND_DUE_DATE.
     * 
     * @return strORDER_NO
     */
    public java.lang.String getStrORDER_NO() {
        return strORDER_NO;
    }


    /**
     * Sets the strORDER_NO value for this ZBAPI_FICA_DEMAND_DUE_DATE.
     * 
     * @param strORDER_NO
     */
    public void setStrORDER_NO(java.lang.String strORDER_NO) {
        this.strORDER_NO = strORDER_NO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_FICA_DEMAND_DUE_DATE)) return false;
        ZBAPI_FICA_DEMAND_DUE_DATE other = (ZBAPI_FICA_DEMAND_DUE_DATE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strORDER_NO==null && other.getStrORDER_NO()==null) || 
             (this.strORDER_NO!=null &&
              this.strORDER_NO.equals(other.getStrORDER_NO())));
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
        if (getStrORDER_NO() != null) {
            _hashCode += getStrORDER_NO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_FICA_DEMAND_DUE_DATE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_FICA_DEMAND_DUE_DATE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strORDER_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strORDER_NO"));
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
