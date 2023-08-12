/**
 * ZBAPI_LAST_MODE_PAY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_LAST_MODE_PAY  implements java.io.Serializable {
    private java.lang.String CA;

    private java.lang.String FLAG;

    public ZBAPI_LAST_MODE_PAY() {
    }

    public ZBAPI_LAST_MODE_PAY(
           java.lang.String CA,
           java.lang.String FLAG) {
           this.CA = CA;
           this.FLAG = FLAG;
    }


    /**
     * Gets the CA value for this ZBAPI_LAST_MODE_PAY.
     * 
     * @return CA
     */
    public java.lang.String getCA() {
        return CA;
    }


    /**
     * Sets the CA value for this ZBAPI_LAST_MODE_PAY.
     * 
     * @param CA
     */
    public void setCA(java.lang.String CA) {
        this.CA = CA;
    }


    /**
     * Gets the FLAG value for this ZBAPI_LAST_MODE_PAY.
     * 
     * @return FLAG
     */
    public java.lang.String getFLAG() {
        return FLAG;
    }


    /**
     * Sets the FLAG value for this ZBAPI_LAST_MODE_PAY.
     * 
     * @param FLAG
     */
    public void setFLAG(java.lang.String FLAG) {
        this.FLAG = FLAG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_LAST_MODE_PAY)) return false;
        ZBAPI_LAST_MODE_PAY other = (ZBAPI_LAST_MODE_PAY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CA==null && other.getCA()==null) || 
             (this.CA!=null &&
              this.CA.equals(other.getCA()))) &&
            ((this.FLAG==null && other.getFLAG()==null) || 
             (this.FLAG!=null &&
              this.FLAG.equals(other.getFLAG())));
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
        if (getCA() != null) {
            _hashCode += getCA().hashCode();
        }
        if (getFLAG() != null) {
            _hashCode += getFLAG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_LAST_MODE_PAY.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_LAST_MODE_PAY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FLAG"));
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
