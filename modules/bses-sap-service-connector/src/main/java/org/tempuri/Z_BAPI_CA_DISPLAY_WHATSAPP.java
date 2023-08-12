/**
 * Z_BAPI_CA_DISPLAY_WHATSAPP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Z_BAPI_CA_DISPLAY_WHATSAPP  implements java.io.Serializable {
    private java.lang.String strCA_NUMBER;

    private java.lang.String strCONTRACT;

    private java.lang.String strSERIALNO;

    private java.lang.String strIMPORT_CRNNUMBER;

    private java.lang.String strIMPORT_TELEPHONE_NO;

    private java.lang.String strIMPORT_KNUMBER;

    public Z_BAPI_CA_DISPLAY_WHATSAPP() {
    }

    public Z_BAPI_CA_DISPLAY_WHATSAPP(
           java.lang.String strCA_NUMBER,
           java.lang.String strCONTRACT,
           java.lang.String strSERIALNO,
           java.lang.String strIMPORT_CRNNUMBER,
           java.lang.String strIMPORT_TELEPHONE_NO,
           java.lang.String strIMPORT_KNUMBER) {
           this.strCA_NUMBER = strCA_NUMBER;
           this.strCONTRACT = strCONTRACT;
           this.strSERIALNO = strSERIALNO;
           this.strIMPORT_CRNNUMBER = strIMPORT_CRNNUMBER;
           this.strIMPORT_TELEPHONE_NO = strIMPORT_TELEPHONE_NO;
           this.strIMPORT_KNUMBER = strIMPORT_KNUMBER;
    }


    /**
     * Gets the strCA_NUMBER value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @return strCA_NUMBER
     */
    public java.lang.String getStrCA_NUMBER() {
        return strCA_NUMBER;
    }


    /**
     * Sets the strCA_NUMBER value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @param strCA_NUMBER
     */
    public void setStrCA_NUMBER(java.lang.String strCA_NUMBER) {
        this.strCA_NUMBER = strCA_NUMBER;
    }


    /**
     * Gets the strCONTRACT value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @return strCONTRACT
     */
    public java.lang.String getStrCONTRACT() {
        return strCONTRACT;
    }


    /**
     * Sets the strCONTRACT value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @param strCONTRACT
     */
    public void setStrCONTRACT(java.lang.String strCONTRACT) {
        this.strCONTRACT = strCONTRACT;
    }


    /**
     * Gets the strSERIALNO value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @return strSERIALNO
     */
    public java.lang.String getStrSERIALNO() {
        return strSERIALNO;
    }


    /**
     * Sets the strSERIALNO value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @param strSERIALNO
     */
    public void setStrSERIALNO(java.lang.String strSERIALNO) {
        this.strSERIALNO = strSERIALNO;
    }


    /**
     * Gets the strIMPORT_CRNNUMBER value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @return strIMPORT_CRNNUMBER
     */
    public java.lang.String getStrIMPORT_CRNNUMBER() {
        return strIMPORT_CRNNUMBER;
    }


    /**
     * Sets the strIMPORT_CRNNUMBER value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @param strIMPORT_CRNNUMBER
     */
    public void setStrIMPORT_CRNNUMBER(java.lang.String strIMPORT_CRNNUMBER) {
        this.strIMPORT_CRNNUMBER = strIMPORT_CRNNUMBER;
    }


    /**
     * Gets the strIMPORT_TELEPHONE_NO value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @return strIMPORT_TELEPHONE_NO
     */
    public java.lang.String getStrIMPORT_TELEPHONE_NO() {
        return strIMPORT_TELEPHONE_NO;
    }


    /**
     * Sets the strIMPORT_TELEPHONE_NO value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @param strIMPORT_TELEPHONE_NO
     */
    public void setStrIMPORT_TELEPHONE_NO(java.lang.String strIMPORT_TELEPHONE_NO) {
        this.strIMPORT_TELEPHONE_NO = strIMPORT_TELEPHONE_NO;
    }


    /**
     * Gets the strIMPORT_KNUMBER value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @return strIMPORT_KNUMBER
     */
    public java.lang.String getStrIMPORT_KNUMBER() {
        return strIMPORT_KNUMBER;
    }


    /**
     * Sets the strIMPORT_KNUMBER value for this Z_BAPI_CA_DISPLAY_WHATSAPP.
     * 
     * @param strIMPORT_KNUMBER
     */
    public void setStrIMPORT_KNUMBER(java.lang.String strIMPORT_KNUMBER) {
        this.strIMPORT_KNUMBER = strIMPORT_KNUMBER;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Z_BAPI_CA_DISPLAY_WHATSAPP)) return false;
        Z_BAPI_CA_DISPLAY_WHATSAPP other = (Z_BAPI_CA_DISPLAY_WHATSAPP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCA_NUMBER==null && other.getStrCA_NUMBER()==null) || 
             (this.strCA_NUMBER!=null &&
              this.strCA_NUMBER.equals(other.getStrCA_NUMBER()))) &&
            ((this.strCONTRACT==null && other.getStrCONTRACT()==null) || 
             (this.strCONTRACT!=null &&
              this.strCONTRACT.equals(other.getStrCONTRACT()))) &&
            ((this.strSERIALNO==null && other.getStrSERIALNO()==null) || 
             (this.strSERIALNO!=null &&
              this.strSERIALNO.equals(other.getStrSERIALNO()))) &&
            ((this.strIMPORT_CRNNUMBER==null && other.getStrIMPORT_CRNNUMBER()==null) || 
             (this.strIMPORT_CRNNUMBER!=null &&
              this.strIMPORT_CRNNUMBER.equals(other.getStrIMPORT_CRNNUMBER()))) &&
            ((this.strIMPORT_TELEPHONE_NO==null && other.getStrIMPORT_TELEPHONE_NO()==null) || 
             (this.strIMPORT_TELEPHONE_NO!=null &&
              this.strIMPORT_TELEPHONE_NO.equals(other.getStrIMPORT_TELEPHONE_NO()))) &&
            ((this.strIMPORT_KNUMBER==null && other.getStrIMPORT_KNUMBER()==null) || 
             (this.strIMPORT_KNUMBER!=null &&
              this.strIMPORT_KNUMBER.equals(other.getStrIMPORT_KNUMBER())));
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
        if (getStrCA_NUMBER() != null) {
            _hashCode += getStrCA_NUMBER().hashCode();
        }
        if (getStrCONTRACT() != null) {
            _hashCode += getStrCONTRACT().hashCode();
        }
        if (getStrSERIALNO() != null) {
            _hashCode += getStrSERIALNO().hashCode();
        }
        if (getStrIMPORT_CRNNUMBER() != null) {
            _hashCode += getStrIMPORT_CRNNUMBER().hashCode();
        }
        if (getStrIMPORT_TELEPHONE_NO() != null) {
            _hashCode += getStrIMPORT_TELEPHONE_NO().hashCode();
        }
        if (getStrIMPORT_KNUMBER() != null) {
            _hashCode += getStrIMPORT_KNUMBER().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Z_BAPI_CA_DISPLAY_WHATSAPP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BAPI_CA_DISPLAY_WHATSAPP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCA_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCA_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCONTRACT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCONTRACT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strSERIALNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strSERIALNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIMPORT_CRNNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strIMPORT_CRNNUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIMPORT_TELEPHONE_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strIMPORT_TELEPHONE_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIMPORT_KNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strIMPORT_KNUMBER"));
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
