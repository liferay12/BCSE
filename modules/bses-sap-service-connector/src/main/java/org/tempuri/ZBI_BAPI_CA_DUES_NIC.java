/**
 * ZBI_BAPI_CA_DUES_NIC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBI_BAPI_CA_DUES_NIC  implements java.io.Serializable {
    private java.lang.String strCA_number;

    public ZBI_BAPI_CA_DUES_NIC() {
    }

    public ZBI_BAPI_CA_DUES_NIC(
           java.lang.String strCA_number) {
           this.strCA_number = strCA_number;
    }


    /**
     * Gets the strCA_number value for this ZBI_BAPI_CA_DUES_NIC.
     * 
     * @return strCA_number
     */
    public java.lang.String getStrCA_number() {
        return strCA_number;
    }


    /**
     * Sets the strCA_number value for this ZBI_BAPI_CA_DUES_NIC.
     * 
     * @param strCA_number
     */
    public void setStrCA_number(java.lang.String strCA_number) {
        this.strCA_number = strCA_number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBI_BAPI_CA_DUES_NIC)) return false;
        ZBI_BAPI_CA_DUES_NIC other = (ZBI_BAPI_CA_DUES_NIC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCA_number==null && other.getStrCA_number()==null) || 
             (this.strCA_number!=null &&
              this.strCA_number.equals(other.getStrCA_number())));
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
        if (getStrCA_number() != null) {
            _hashCode += getStrCA_number().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBI_BAPI_CA_DUES_NIC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBI_BAPI_CA_DUES_NIC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCA_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCA_number"));
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
