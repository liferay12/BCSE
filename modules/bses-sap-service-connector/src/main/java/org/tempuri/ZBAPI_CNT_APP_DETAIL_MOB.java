/**
 * ZBAPI_CNT_APP_DETAIL_MOB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CNT_APP_DETAIL_MOB  implements java.io.Serializable {
    private java.lang.String strORDER_TYPE;

    private java.lang.String strDIVISION;

    private java.lang.String strAPPOINTMENT_START_DATE;

    private java.lang.String strAPPOINTMENT_TIME;

    private java.lang.String strREC_COUNT;

    public ZBAPI_CNT_APP_DETAIL_MOB() {
    }

    public ZBAPI_CNT_APP_DETAIL_MOB(
           java.lang.String strORDER_TYPE,
           java.lang.String strDIVISION,
           java.lang.String strAPPOINTMENT_START_DATE,
           java.lang.String strAPPOINTMENT_TIME,
           java.lang.String strREC_COUNT) {
           this.strORDER_TYPE = strORDER_TYPE;
           this.strDIVISION = strDIVISION;
           this.strAPPOINTMENT_START_DATE = strAPPOINTMENT_START_DATE;
           this.strAPPOINTMENT_TIME = strAPPOINTMENT_TIME;
           this.strREC_COUNT = strREC_COUNT;
    }


    /**
     * Gets the strORDER_TYPE value for this ZBAPI_CNT_APP_DETAIL_MOB.
     * 
     * @return strORDER_TYPE
     */
    public java.lang.String getStrORDER_TYPE() {
        return strORDER_TYPE;
    }


    /**
     * Sets the strORDER_TYPE value for this ZBAPI_CNT_APP_DETAIL_MOB.
     * 
     * @param strORDER_TYPE
     */
    public void setStrORDER_TYPE(java.lang.String strORDER_TYPE) {
        this.strORDER_TYPE = strORDER_TYPE;
    }


    /**
     * Gets the strDIVISION value for this ZBAPI_CNT_APP_DETAIL_MOB.
     * 
     * @return strDIVISION
     */
    public java.lang.String getStrDIVISION() {
        return strDIVISION;
    }


    /**
     * Sets the strDIVISION value for this ZBAPI_CNT_APP_DETAIL_MOB.
     * 
     * @param strDIVISION
     */
    public void setStrDIVISION(java.lang.String strDIVISION) {
        this.strDIVISION = strDIVISION;
    }


    /**
     * Gets the strAPPOINTMENT_START_DATE value for this ZBAPI_CNT_APP_DETAIL_MOB.
     * 
     * @return strAPPOINTMENT_START_DATE
     */
    public java.lang.String getStrAPPOINTMENT_START_DATE() {
        return strAPPOINTMENT_START_DATE;
    }


    /**
     * Sets the strAPPOINTMENT_START_DATE value for this ZBAPI_CNT_APP_DETAIL_MOB.
     * 
     * @param strAPPOINTMENT_START_DATE
     */
    public void setStrAPPOINTMENT_START_DATE(java.lang.String strAPPOINTMENT_START_DATE) {
        this.strAPPOINTMENT_START_DATE = strAPPOINTMENT_START_DATE;
    }


    /**
     * Gets the strAPPOINTMENT_TIME value for this ZBAPI_CNT_APP_DETAIL_MOB.
     * 
     * @return strAPPOINTMENT_TIME
     */
    public java.lang.String getStrAPPOINTMENT_TIME() {
        return strAPPOINTMENT_TIME;
    }


    /**
     * Sets the strAPPOINTMENT_TIME value for this ZBAPI_CNT_APP_DETAIL_MOB.
     * 
     * @param strAPPOINTMENT_TIME
     */
    public void setStrAPPOINTMENT_TIME(java.lang.String strAPPOINTMENT_TIME) {
        this.strAPPOINTMENT_TIME = strAPPOINTMENT_TIME;
    }


    /**
     * Gets the strREC_COUNT value for this ZBAPI_CNT_APP_DETAIL_MOB.
     * 
     * @return strREC_COUNT
     */
    public java.lang.String getStrREC_COUNT() {
        return strREC_COUNT;
    }


    /**
     * Sets the strREC_COUNT value for this ZBAPI_CNT_APP_DETAIL_MOB.
     * 
     * @param strREC_COUNT
     */
    public void setStrREC_COUNT(java.lang.String strREC_COUNT) {
        this.strREC_COUNT = strREC_COUNT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CNT_APP_DETAIL_MOB)) return false;
        ZBAPI_CNT_APP_DETAIL_MOB other = (ZBAPI_CNT_APP_DETAIL_MOB) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strORDER_TYPE==null && other.getStrORDER_TYPE()==null) || 
             (this.strORDER_TYPE!=null &&
              this.strORDER_TYPE.equals(other.getStrORDER_TYPE()))) &&
            ((this.strDIVISION==null && other.getStrDIVISION()==null) || 
             (this.strDIVISION!=null &&
              this.strDIVISION.equals(other.getStrDIVISION()))) &&
            ((this.strAPPOINTMENT_START_DATE==null && other.getStrAPPOINTMENT_START_DATE()==null) || 
             (this.strAPPOINTMENT_START_DATE!=null &&
              this.strAPPOINTMENT_START_DATE.equals(other.getStrAPPOINTMENT_START_DATE()))) &&
            ((this.strAPPOINTMENT_TIME==null && other.getStrAPPOINTMENT_TIME()==null) || 
             (this.strAPPOINTMENT_TIME!=null &&
              this.strAPPOINTMENT_TIME.equals(other.getStrAPPOINTMENT_TIME()))) &&
            ((this.strREC_COUNT==null && other.getStrREC_COUNT()==null) || 
             (this.strREC_COUNT!=null &&
              this.strREC_COUNT.equals(other.getStrREC_COUNT())));
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
        if (getStrORDER_TYPE() != null) {
            _hashCode += getStrORDER_TYPE().hashCode();
        }
        if (getStrDIVISION() != null) {
            _hashCode += getStrDIVISION().hashCode();
        }
        if (getStrAPPOINTMENT_START_DATE() != null) {
            _hashCode += getStrAPPOINTMENT_START_DATE().hashCode();
        }
        if (getStrAPPOINTMENT_TIME() != null) {
            _hashCode += getStrAPPOINTMENT_TIME().hashCode();
        }
        if (getStrREC_COUNT() != null) {
            _hashCode += getStrREC_COUNT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CNT_APP_DETAIL_MOB.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CNT_APP_DETAIL_MOB"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strORDER_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strORDER_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDIVISION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDIVISION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAPPOINTMENT_START_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAPPOINTMENT_START_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAPPOINTMENT_TIME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAPPOINTMENT_TIME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strREC_COUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strREC_COUNT"));
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
