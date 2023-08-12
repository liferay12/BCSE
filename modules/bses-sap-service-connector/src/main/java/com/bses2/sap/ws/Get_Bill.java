/**
 * Get_Bill.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Bill  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String month_MMM;

    private java.lang.String year_YY;

    private java.lang.String CANumber;

    private java.lang.String phone;

    public Get_Bill() {
    }

    public Get_Bill(
           java.lang.String key,
           java.lang.String month_MMM,
           java.lang.String year_YY,
           java.lang.String CANumber,
           java.lang.String phone) {
           this.key = key;
           this.month_MMM = month_MMM;
           this.year_YY = year_YY;
           this.CANumber = CANumber;
           this.phone = phone;
    }


    /**
     * Gets the key value for this Get_Bill.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this Get_Bill.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the month_MMM value for this Get_Bill.
     * 
     * @return month_MMM
     */
    public java.lang.String getMonth_MMM() {
        return month_MMM;
    }


    /**
     * Sets the month_MMM value for this Get_Bill.
     * 
     * @param month_MMM
     */
    public void setMonth_MMM(java.lang.String month_MMM) {
        this.month_MMM = month_MMM;
    }


    /**
     * Gets the year_YY value for this Get_Bill.
     * 
     * @return year_YY
     */
    public java.lang.String getYear_YY() {
        return year_YY;
    }


    /**
     * Sets the year_YY value for this Get_Bill.
     * 
     * @param year_YY
     */
    public void setYear_YY(java.lang.String year_YY) {
        this.year_YY = year_YY;
    }


    /**
     * Gets the CANumber value for this Get_Bill.
     * 
     * @return CANumber
     */
    public java.lang.String getCANumber() {
        return CANumber;
    }


    /**
     * Sets the CANumber value for this Get_Bill.
     * 
     * @param CANumber
     */
    public void setCANumber(java.lang.String CANumber) {
        this.CANumber = CANumber;
    }


    /**
     * Gets the phone value for this Get_Bill.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Get_Bill.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Bill)) return false;
        Get_Bill other = (Get_Bill) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.month_MMM==null && other.getMonth_MMM()==null) || 
             (this.month_MMM!=null &&
              this.month_MMM.equals(other.getMonth_MMM()))) &&
            ((this.year_YY==null && other.getYear_YY()==null) || 
             (this.year_YY!=null &&
              this.year_YY.equals(other.getYear_YY()))) &&
            ((this.CANumber==null && other.getCANumber()==null) || 
             (this.CANumber!=null &&
              this.CANumber.equals(other.getCANumber()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getMonth_MMM() != null) {
            _hashCode += getMonth_MMM().hashCode();
        }
        if (getYear_YY() != null) {
            _hashCode += getYear_YY().hashCode();
        }
        if (getCANumber() != null) {
            _hashCode += getCANumber().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Bill.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Bill"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month_MMM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Month_MMM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year_YY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Year_YY"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Phone"));
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
