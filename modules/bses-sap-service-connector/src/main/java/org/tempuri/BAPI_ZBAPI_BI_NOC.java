/**
 * BAPI_ZBAPI_BI_NOC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BAPI_ZBAPI_BI_NOC  implements java.io.Serializable {
    private java.lang.String strCA;

    public BAPI_ZBAPI_BI_NOC() {
    }

    public BAPI_ZBAPI_BI_NOC(
           java.lang.String strCA) {
           this.strCA = strCA;
    }


    /**
     * Gets the strCA value for this BAPI_ZBAPI_BI_NOC.
     * 
     * @return strCA
     */
    public java.lang.String getStrCA() {
        return strCA;
    }


    /**
     * Sets the strCA value for this BAPI_ZBAPI_BI_NOC.
     * 
     * @param strCA
     */
    public void setStrCA(java.lang.String strCA) {
        this.strCA = strCA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BAPI_ZBAPI_BI_NOC)) return false;
        BAPI_ZBAPI_BI_NOC other = (BAPI_ZBAPI_BI_NOC) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCA==null && other.getStrCA()==null) || 
             (this.strCA!=null &&
              this.strCA.equals(other.getStrCA())));
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
        if (getStrCA() != null) {
            _hashCode += getStrCA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BAPI_ZBAPI_BI_NOC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BAPI_ZBAPI_BI_NOC"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCA"));
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
