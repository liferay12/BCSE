/**
 * ZBAPI_CALERT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CALERT  implements java.io.Serializable {
    private java.lang.String strCompanyCode;

    private java.lang.String strDate;

    private java.lang.String strDivision;

    private java.lang.String strUnit;

    public ZBAPI_CALERT() {
    }

    public ZBAPI_CALERT(
           java.lang.String strCompanyCode,
           java.lang.String strDate,
           java.lang.String strDivision,
           java.lang.String strUnit) {
           this.strCompanyCode = strCompanyCode;
           this.strDate = strDate;
           this.strDivision = strDivision;
           this.strUnit = strUnit;
    }


    /**
     * Gets the strCompanyCode value for this ZBAPI_CALERT.
     * 
     * @return strCompanyCode
     */
    public java.lang.String getStrCompanyCode() {
        return strCompanyCode;
    }


    /**
     * Sets the strCompanyCode value for this ZBAPI_CALERT.
     * 
     * @param strCompanyCode
     */
    public void setStrCompanyCode(java.lang.String strCompanyCode) {
        this.strCompanyCode = strCompanyCode;
    }


    /**
     * Gets the strDate value for this ZBAPI_CALERT.
     * 
     * @return strDate
     */
    public java.lang.String getStrDate() {
        return strDate;
    }


    /**
     * Sets the strDate value for this ZBAPI_CALERT.
     * 
     * @param strDate
     */
    public void setStrDate(java.lang.String strDate) {
        this.strDate = strDate;
    }


    /**
     * Gets the strDivision value for this ZBAPI_CALERT.
     * 
     * @return strDivision
     */
    public java.lang.String getStrDivision() {
        return strDivision;
    }


    /**
     * Sets the strDivision value for this ZBAPI_CALERT.
     * 
     * @param strDivision
     */
    public void setStrDivision(java.lang.String strDivision) {
        this.strDivision = strDivision;
    }


    /**
     * Gets the strUnit value for this ZBAPI_CALERT.
     * 
     * @return strUnit
     */
    public java.lang.String getStrUnit() {
        return strUnit;
    }


    /**
     * Sets the strUnit value for this ZBAPI_CALERT.
     * 
     * @param strUnit
     */
    public void setStrUnit(java.lang.String strUnit) {
        this.strUnit = strUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CALERT)) return false;
        ZBAPI_CALERT other = (ZBAPI_CALERT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCompanyCode==null && other.getStrCompanyCode()==null) || 
             (this.strCompanyCode!=null &&
              this.strCompanyCode.equals(other.getStrCompanyCode()))) &&
            ((this.strDate==null && other.getStrDate()==null) || 
             (this.strDate!=null &&
              this.strDate.equals(other.getStrDate()))) &&
            ((this.strDivision==null && other.getStrDivision()==null) || 
             (this.strDivision!=null &&
              this.strDivision.equals(other.getStrDivision()))) &&
            ((this.strUnit==null && other.getStrUnit()==null) || 
             (this.strUnit!=null &&
              this.strUnit.equals(other.getStrUnit())));
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
        if (getStrCompanyCode() != null) {
            _hashCode += getStrCompanyCode().hashCode();
        }
        if (getStrDate() != null) {
            _hashCode += getStrDate().hashCode();
        }
        if (getStrDivision() != null) {
            _hashCode += getStrDivision().hashCode();
        }
        if (getStrUnit() != null) {
            _hashCode += getStrUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CALERT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CALERT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCompanyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCompanyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDivision");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDivision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strUnit"));
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
