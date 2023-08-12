/**
 * ZBAPI_BI_EMAIL_COUNT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_BI_EMAIL_COUNT  implements java.io.Serializable {
    private java.lang.String strCRONAM;

    private java.lang.String strOBJTP;

    private java.lang.String strDateYYYYMMDD;

    private java.lang.String strTime;

    public ZBAPI_BI_EMAIL_COUNT() {
    }

    public ZBAPI_BI_EMAIL_COUNT(
           java.lang.String strCRONAM,
           java.lang.String strOBJTP,
           java.lang.String strDateYYYYMMDD,
           java.lang.String strTime) {
           this.strCRONAM = strCRONAM;
           this.strOBJTP = strOBJTP;
           this.strDateYYYYMMDD = strDateYYYYMMDD;
           this.strTime = strTime;
    }


    /**
     * Gets the strCRONAM value for this ZBAPI_BI_EMAIL_COUNT.
     * 
     * @return strCRONAM
     */
    public java.lang.String getStrCRONAM() {
        return strCRONAM;
    }


    /**
     * Sets the strCRONAM value for this ZBAPI_BI_EMAIL_COUNT.
     * 
     * @param strCRONAM
     */
    public void setStrCRONAM(java.lang.String strCRONAM) {
        this.strCRONAM = strCRONAM;
    }


    /**
     * Gets the strOBJTP value for this ZBAPI_BI_EMAIL_COUNT.
     * 
     * @return strOBJTP
     */
    public java.lang.String getStrOBJTP() {
        return strOBJTP;
    }


    /**
     * Sets the strOBJTP value for this ZBAPI_BI_EMAIL_COUNT.
     * 
     * @param strOBJTP
     */
    public void setStrOBJTP(java.lang.String strOBJTP) {
        this.strOBJTP = strOBJTP;
    }


    /**
     * Gets the strDateYYYYMMDD value for this ZBAPI_BI_EMAIL_COUNT.
     * 
     * @return strDateYYYYMMDD
     */
    public java.lang.String getStrDateYYYYMMDD() {
        return strDateYYYYMMDD;
    }


    /**
     * Sets the strDateYYYYMMDD value for this ZBAPI_BI_EMAIL_COUNT.
     * 
     * @param strDateYYYYMMDD
     */
    public void setStrDateYYYYMMDD(java.lang.String strDateYYYYMMDD) {
        this.strDateYYYYMMDD = strDateYYYYMMDD;
    }


    /**
     * Gets the strTime value for this ZBAPI_BI_EMAIL_COUNT.
     * 
     * @return strTime
     */
    public java.lang.String getStrTime() {
        return strTime;
    }


    /**
     * Sets the strTime value for this ZBAPI_BI_EMAIL_COUNT.
     * 
     * @param strTime
     */
    public void setStrTime(java.lang.String strTime) {
        this.strTime = strTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_BI_EMAIL_COUNT)) return false;
        ZBAPI_BI_EMAIL_COUNT other = (ZBAPI_BI_EMAIL_COUNT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCRONAM==null && other.getStrCRONAM()==null) || 
             (this.strCRONAM!=null &&
              this.strCRONAM.equals(other.getStrCRONAM()))) &&
            ((this.strOBJTP==null && other.getStrOBJTP()==null) || 
             (this.strOBJTP!=null &&
              this.strOBJTP.equals(other.getStrOBJTP()))) &&
            ((this.strDateYYYYMMDD==null && other.getStrDateYYYYMMDD()==null) || 
             (this.strDateYYYYMMDD!=null &&
              this.strDateYYYYMMDD.equals(other.getStrDateYYYYMMDD()))) &&
            ((this.strTime==null && other.getStrTime()==null) || 
             (this.strTime!=null &&
              this.strTime.equals(other.getStrTime())));
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
        if (getStrCRONAM() != null) {
            _hashCode += getStrCRONAM().hashCode();
        }
        if (getStrOBJTP() != null) {
            _hashCode += getStrOBJTP().hashCode();
        }
        if (getStrDateYYYYMMDD() != null) {
            _hashCode += getStrDateYYYYMMDD().hashCode();
        }
        if (getStrTime() != null) {
            _hashCode += getStrTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_BI_EMAIL_COUNT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_BI_EMAIL_COUNT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCRONAM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCRONAM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strOBJTP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strOBJTP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDateYYYYMMDD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDateYYYYMMDD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strTime"));
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
