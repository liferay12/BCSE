/**
 * Z_BI_BAPI_SMART_MTR_DTL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BI_BAPI_SMART_MTR_DTL  implements java.io.Serializable {
    private java.lang.String strIn_Run_Date;

    private java.lang.String strInCompany;

    private java.lang.String strInManuf;

    public Z_BI_BAPI_SMART_MTR_DTL() {
    }

    public Z_BI_BAPI_SMART_MTR_DTL(
           java.lang.String strIn_Run_Date,
           java.lang.String strInCompany,
           java.lang.String strInManuf) {
           this.strIn_Run_Date = strIn_Run_Date;
           this.strInCompany = strInCompany;
           this.strInManuf = strInManuf;
    }


    /**
     * Gets the strIn_Run_Date value for this Z_BI_BAPI_SMART_MTR_DTL.
     * 
     * @return strIn_Run_Date
     */
    public java.lang.String getStrIn_Run_Date() {
        return strIn_Run_Date;
    }


    /**
     * Sets the strIn_Run_Date value for this Z_BI_BAPI_SMART_MTR_DTL.
     * 
     * @param strIn_Run_Date
     */
    public void setStrIn_Run_Date(java.lang.String strIn_Run_Date) {
        this.strIn_Run_Date = strIn_Run_Date;
    }


    /**
     * Gets the strInCompany value for this Z_BI_BAPI_SMART_MTR_DTL.
     * 
     * @return strInCompany
     */
    public java.lang.String getStrInCompany() {
        return strInCompany;
    }


    /**
     * Sets the strInCompany value for this Z_BI_BAPI_SMART_MTR_DTL.
     * 
     * @param strInCompany
     */
    public void setStrInCompany(java.lang.String strInCompany) {
        this.strInCompany = strInCompany;
    }


    /**
     * Gets the strInManuf value for this Z_BI_BAPI_SMART_MTR_DTL.
     * 
     * @return strInManuf
     */
    public java.lang.String getStrInManuf() {
        return strInManuf;
    }


    /**
     * Sets the strInManuf value for this Z_BI_BAPI_SMART_MTR_DTL.
     * 
     * @param strInManuf
     */
    public void setStrInManuf(java.lang.String strInManuf) {
        this.strInManuf = strInManuf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BI_BAPI_SMART_MTR_DTL)) return false;
        Z_BI_BAPI_SMART_MTR_DTL other = (Z_BI_BAPI_SMART_MTR_DTL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strIn_Run_Date==null && other.getStrIn_Run_Date()==null) || 
             (this.strIn_Run_Date!=null &&
              this.strIn_Run_Date.equals(other.getStrIn_Run_Date()))) &&
            ((this.strInCompany==null && other.getStrInCompany()==null) || 
             (this.strInCompany!=null &&
              this.strInCompany.equals(other.getStrInCompany()))) &&
            ((this.strInManuf==null && other.getStrInManuf()==null) || 
             (this.strInManuf!=null &&
              this.strInManuf.equals(other.getStrInManuf())));
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
        if (getStrIn_Run_Date() != null) {
            _hashCode += getStrIn_Run_Date().hashCode();
        }
        if (getStrInCompany() != null) {
            _hashCode += getStrInCompany().hashCode();
        }
        if (getStrInManuf() != null) {
            _hashCode += getStrInManuf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BI_BAPI_SMART_MTR_DTL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BI_BAPI_SMART_MTR_DTL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIn_Run_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strIn_Run_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strInCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strInCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strInManuf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strInManuf"));
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
