/**
 * BAPI_MTRREADDOC_GETLIST.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BAPI_MTRREADDOC_GETLIST  implements java.io.Serializable {
    private java.lang.String METERNO;

    public BAPI_MTRREADDOC_GETLIST() {
    }

    public BAPI_MTRREADDOC_GETLIST(
           java.lang.String METERNO) {
           this.METERNO = METERNO;
    }


    /**
     * Gets the METERNO value for this BAPI_MTRREADDOC_GETLIST.
     * 
     * @return METERNO
     */
    public java.lang.String getMETERNO() {
        return METERNO;
    }


    /**
     * Sets the METERNO value for this BAPI_MTRREADDOC_GETLIST.
     * 
     * @param METERNO
     */
    public void setMETERNO(java.lang.String METERNO) {
        this.METERNO = METERNO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BAPI_MTRREADDOC_GETLIST)) return false;
        BAPI_MTRREADDOC_GETLIST other = (BAPI_MTRREADDOC_GETLIST) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.METERNO==null && other.getMETERNO()==null) || 
             (this.METERNO!=null &&
              this.METERNO.equals(other.getMETERNO())));
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
        if (getMETERNO() != null) {
            _hashCode += getMETERNO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BAPI_MTRREADDOC_GETLIST.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BAPI_MTRREADDOC_GETLIST"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("METERNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "METERNO"));
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
