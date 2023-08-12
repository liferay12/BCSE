/**
 * Get_dtArea.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_dtArea  implements java.io.Serializable {
    private java.lang.String SAPFUNCTIO;

    private java.lang.String poleno;

    private java.lang.String CANumber;

    public Get_dtArea() {
    }

    public Get_dtArea(
           java.lang.String SAPFUNCTIO,
           java.lang.String poleno,
           java.lang.String CANumber) {
           this.SAPFUNCTIO = SAPFUNCTIO;
           this.poleno = poleno;
           this.CANumber = CANumber;
    }


    /**
     * Gets the SAPFUNCTIO value for this Get_dtArea.
     * 
     * @return SAPFUNCTIO
     */
    public java.lang.String getSAPFUNCTIO() {
        return SAPFUNCTIO;
    }


    /**
     * Sets the SAPFUNCTIO value for this Get_dtArea.
     * 
     * @param SAPFUNCTIO
     */
    public void setSAPFUNCTIO(java.lang.String SAPFUNCTIO) {
        this.SAPFUNCTIO = SAPFUNCTIO;
    }


    /**
     * Gets the poleno value for this Get_dtArea.
     * 
     * @return poleno
     */
    public java.lang.String getPoleno() {
        return poleno;
    }


    /**
     * Sets the poleno value for this Get_dtArea.
     * 
     * @param poleno
     */
    public void setPoleno(java.lang.String poleno) {
        this.poleno = poleno;
    }


    /**
     * Gets the CANumber value for this Get_dtArea.
     * 
     * @return CANumber
     */
    public java.lang.String getCANumber() {
        return CANumber;
    }


    /**
     * Sets the CANumber value for this Get_dtArea.
     * 
     * @param CANumber
     */
    public void setCANumber(java.lang.String CANumber) {
        this.CANumber = CANumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_dtArea)) return false;
        Get_dtArea other = (Get_dtArea) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SAPFUNCTIO==null && other.getSAPFUNCTIO()==null) || 
             (this.SAPFUNCTIO!=null &&
              this.SAPFUNCTIO.equals(other.getSAPFUNCTIO()))) &&
            ((this.poleno==null && other.getPoleno()==null) || 
             (this.poleno!=null &&
              this.poleno.equals(other.getPoleno()))) &&
            ((this.CANumber==null && other.getCANumber()==null) || 
             (this.CANumber!=null &&
              this.CANumber.equals(other.getCANumber())));
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
        if (getSAPFUNCTIO() != null) {
            _hashCode += getSAPFUNCTIO().hashCode();
        }
        if (getPoleno() != null) {
            _hashCode += getPoleno().hashCode();
        }
        if (getCANumber() != null) {
            _hashCode += getCANumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_dtArea.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_dtArea"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAPFUNCTIO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SAPFUNCTIO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poleno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "poleno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CANumber"));
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
