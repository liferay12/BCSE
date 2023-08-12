/**
 * Z_BAPI_CMS_ISU_CA_DISPLAY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BAPI_CMS_ISU_CA_DISPLAY  implements java.io.Serializable {
    private java.lang.String strCANumber;

    private java.lang.String strSerialNumber;

    private java.lang.String strConsumerNumber;

    private java.lang.String strTelephoneNumber;

    private java.lang.String strKNumber;

    private java.lang.String strContractNumber;

    public Z_BAPI_CMS_ISU_CA_DISPLAY() {
    }

    public Z_BAPI_CMS_ISU_CA_DISPLAY(
           java.lang.String strCANumber,
           java.lang.String strSerialNumber,
           java.lang.String strConsumerNumber,
           java.lang.String strTelephoneNumber,
           java.lang.String strKNumber,
           java.lang.String strContractNumber) {
           this.strCANumber = strCANumber;
           this.strSerialNumber = strSerialNumber;
           this.strConsumerNumber = strConsumerNumber;
           this.strTelephoneNumber = strTelephoneNumber;
           this.strKNumber = strKNumber;
           this.strContractNumber = strContractNumber;
    }


    /**
     * Gets the strCANumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @return strCANumber
     */
    public java.lang.String getStrCANumber() {
        return strCANumber;
    }


    /**
     * Sets the strCANumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @param strCANumber
     */
    public void setStrCANumber(java.lang.String strCANumber) {
        this.strCANumber = strCANumber;
    }


    /**
     * Gets the strSerialNumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @return strSerialNumber
     */
    public java.lang.String getStrSerialNumber() {
        return strSerialNumber;
    }


    /**
     * Sets the strSerialNumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @param strSerialNumber
     */
    public void setStrSerialNumber(java.lang.String strSerialNumber) {
        this.strSerialNumber = strSerialNumber;
    }


    /**
     * Gets the strConsumerNumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @return strConsumerNumber
     */
    public java.lang.String getStrConsumerNumber() {
        return strConsumerNumber;
    }


    /**
     * Sets the strConsumerNumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @param strConsumerNumber
     */
    public void setStrConsumerNumber(java.lang.String strConsumerNumber) {
        this.strConsumerNumber = strConsumerNumber;
    }


    /**
     * Gets the strTelephoneNumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @return strTelephoneNumber
     */
    public java.lang.String getStrTelephoneNumber() {
        return strTelephoneNumber;
    }


    /**
     * Sets the strTelephoneNumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @param strTelephoneNumber
     */
    public void setStrTelephoneNumber(java.lang.String strTelephoneNumber) {
        this.strTelephoneNumber = strTelephoneNumber;
    }


    /**
     * Gets the strKNumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @return strKNumber
     */
    public java.lang.String getStrKNumber() {
        return strKNumber;
    }


    /**
     * Sets the strKNumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @param strKNumber
     */
    public void setStrKNumber(java.lang.String strKNumber) {
        this.strKNumber = strKNumber;
    }


    /**
     * Gets the strContractNumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @return strContractNumber
     */
    public java.lang.String getStrContractNumber() {
        return strContractNumber;
    }


    /**
     * Sets the strContractNumber value for this Z_BAPI_CMS_ISU_CA_DISPLAY.
     * 
     * @param strContractNumber
     */
    public void setStrContractNumber(java.lang.String strContractNumber) {
        this.strContractNumber = strContractNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BAPI_CMS_ISU_CA_DISPLAY)) return false;
        Z_BAPI_CMS_ISU_CA_DISPLAY other = (Z_BAPI_CMS_ISU_CA_DISPLAY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCANumber==null && other.getStrCANumber()==null) || 
             (this.strCANumber!=null &&
              this.strCANumber.equals(other.getStrCANumber()))) &&
            ((this.strSerialNumber==null && other.getStrSerialNumber()==null) || 
             (this.strSerialNumber!=null &&
              this.strSerialNumber.equals(other.getStrSerialNumber()))) &&
            ((this.strConsumerNumber==null && other.getStrConsumerNumber()==null) || 
             (this.strConsumerNumber!=null &&
              this.strConsumerNumber.equals(other.getStrConsumerNumber()))) &&
            ((this.strTelephoneNumber==null && other.getStrTelephoneNumber()==null) || 
             (this.strTelephoneNumber!=null &&
              this.strTelephoneNumber.equals(other.getStrTelephoneNumber()))) &&
            ((this.strKNumber==null && other.getStrKNumber()==null) || 
             (this.strKNumber!=null &&
              this.strKNumber.equals(other.getStrKNumber()))) &&
            ((this.strContractNumber==null && other.getStrContractNumber()==null) || 
             (this.strContractNumber!=null &&
              this.strContractNumber.equals(other.getStrContractNumber())));
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
        if (getStrCANumber() != null) {
            _hashCode += getStrCANumber().hashCode();
        }
        if (getStrSerialNumber() != null) {
            _hashCode += getStrSerialNumber().hashCode();
        }
        if (getStrConsumerNumber() != null) {
            _hashCode += getStrConsumerNumber().hashCode();
        }
        if (getStrTelephoneNumber() != null) {
            _hashCode += getStrTelephoneNumber().hashCode();
        }
        if (getStrKNumber() != null) {
            _hashCode += getStrKNumber().hashCode();
        }
        if (getStrContractNumber() != null) {
            _hashCode += getStrContractNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BAPI_CMS_ISU_CA_DISPLAY.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BAPI_CMS_ISU_CA_DISPLAY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strSerialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strSerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strConsumerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strConsumerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strTelephoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strTelephoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strKNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strKNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strContractNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strContractNumber"));
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
