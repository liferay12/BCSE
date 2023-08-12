/**
 * ZBAPI_ISUACCOUNT_CHANGE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_ISUACCOUNT_CHANGE  implements java.io.Serializable {
    private java.lang.String strCONTRACT_ACCOUNT;

    private java.lang.String strPartner;

    private java.lang.String strValidDAte;

    private java.lang.String strCONTRACTACCOUNTDATA;

    private java.lang.String strCONTRACTACCOUNTDATAX;

    public ZBAPI_ISUACCOUNT_CHANGE() {
    }

    public ZBAPI_ISUACCOUNT_CHANGE(
           java.lang.String strCONTRACT_ACCOUNT,
           java.lang.String strPartner,
           java.lang.String strValidDAte,
           java.lang.String strCONTRACTACCOUNTDATA,
           java.lang.String strCONTRACTACCOUNTDATAX) {
           this.strCONTRACT_ACCOUNT = strCONTRACT_ACCOUNT;
           this.strPartner = strPartner;
           this.strValidDAte = strValidDAte;
           this.strCONTRACTACCOUNTDATA = strCONTRACTACCOUNTDATA;
           this.strCONTRACTACCOUNTDATAX = strCONTRACTACCOUNTDATAX;
    }


    /**
     * Gets the strCONTRACT_ACCOUNT value for this ZBAPI_ISUACCOUNT_CHANGE.
     * 
     * @return strCONTRACT_ACCOUNT
     */
    public java.lang.String getStrCONTRACT_ACCOUNT() {
        return strCONTRACT_ACCOUNT;
    }


    /**
     * Sets the strCONTRACT_ACCOUNT value for this ZBAPI_ISUACCOUNT_CHANGE.
     * 
     * @param strCONTRACT_ACCOUNT
     */
    public void setStrCONTRACT_ACCOUNT(java.lang.String strCONTRACT_ACCOUNT) {
        this.strCONTRACT_ACCOUNT = strCONTRACT_ACCOUNT;
    }


    /**
     * Gets the strPartner value for this ZBAPI_ISUACCOUNT_CHANGE.
     * 
     * @return strPartner
     */
    public java.lang.String getStrPartner() {
        return strPartner;
    }


    /**
     * Sets the strPartner value for this ZBAPI_ISUACCOUNT_CHANGE.
     * 
     * @param strPartner
     */
    public void setStrPartner(java.lang.String strPartner) {
        this.strPartner = strPartner;
    }


    /**
     * Gets the strValidDAte value for this ZBAPI_ISUACCOUNT_CHANGE.
     * 
     * @return strValidDAte
     */
    public java.lang.String getStrValidDAte() {
        return strValidDAte;
    }


    /**
     * Sets the strValidDAte value for this ZBAPI_ISUACCOUNT_CHANGE.
     * 
     * @param strValidDAte
     */
    public void setStrValidDAte(java.lang.String strValidDAte) {
        this.strValidDAte = strValidDAte;
    }


    /**
     * Gets the strCONTRACTACCOUNTDATA value for this ZBAPI_ISUACCOUNT_CHANGE.
     * 
     * @return strCONTRACTACCOUNTDATA
     */
    public java.lang.String getStrCONTRACTACCOUNTDATA() {
        return strCONTRACTACCOUNTDATA;
    }


    /**
     * Sets the strCONTRACTACCOUNTDATA value for this ZBAPI_ISUACCOUNT_CHANGE.
     * 
     * @param strCONTRACTACCOUNTDATA
     */
    public void setStrCONTRACTACCOUNTDATA(java.lang.String strCONTRACTACCOUNTDATA) {
        this.strCONTRACTACCOUNTDATA = strCONTRACTACCOUNTDATA;
    }


    /**
     * Gets the strCONTRACTACCOUNTDATAX value for this ZBAPI_ISUACCOUNT_CHANGE.
     * 
     * @return strCONTRACTACCOUNTDATAX
     */
    public java.lang.String getStrCONTRACTACCOUNTDATAX() {
        return strCONTRACTACCOUNTDATAX;
    }


    /**
     * Sets the strCONTRACTACCOUNTDATAX value for this ZBAPI_ISUACCOUNT_CHANGE.
     * 
     * @param strCONTRACTACCOUNTDATAX
     */
    public void setStrCONTRACTACCOUNTDATAX(java.lang.String strCONTRACTACCOUNTDATAX) {
        this.strCONTRACTACCOUNTDATAX = strCONTRACTACCOUNTDATAX;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_ISUACCOUNT_CHANGE)) return false;
        ZBAPI_ISUACCOUNT_CHANGE other = (ZBAPI_ISUACCOUNT_CHANGE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCONTRACT_ACCOUNT==null && other.getStrCONTRACT_ACCOUNT()==null) || 
             (this.strCONTRACT_ACCOUNT!=null &&
              this.strCONTRACT_ACCOUNT.equals(other.getStrCONTRACT_ACCOUNT()))) &&
            ((this.strPartner==null && other.getStrPartner()==null) || 
             (this.strPartner!=null &&
              this.strPartner.equals(other.getStrPartner()))) &&
            ((this.strValidDAte==null && other.getStrValidDAte()==null) || 
             (this.strValidDAte!=null &&
              this.strValidDAte.equals(other.getStrValidDAte()))) &&
            ((this.strCONTRACTACCOUNTDATA==null && other.getStrCONTRACTACCOUNTDATA()==null) || 
             (this.strCONTRACTACCOUNTDATA!=null &&
              this.strCONTRACTACCOUNTDATA.equals(other.getStrCONTRACTACCOUNTDATA()))) &&
            ((this.strCONTRACTACCOUNTDATAX==null && other.getStrCONTRACTACCOUNTDATAX()==null) || 
             (this.strCONTRACTACCOUNTDATAX!=null &&
              this.strCONTRACTACCOUNTDATAX.equals(other.getStrCONTRACTACCOUNTDATAX())));
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
        if (getStrCONTRACT_ACCOUNT() != null) {
            _hashCode += getStrCONTRACT_ACCOUNT().hashCode();
        }
        if (getStrPartner() != null) {
            _hashCode += getStrPartner().hashCode();
        }
        if (getStrValidDAte() != null) {
            _hashCode += getStrValidDAte().hashCode();
        }
        if (getStrCONTRACTACCOUNTDATA() != null) {
            _hashCode += getStrCONTRACTACCOUNTDATA().hashCode();
        }
        if (getStrCONTRACTACCOUNTDATAX() != null) {
            _hashCode += getStrCONTRACTACCOUNTDATAX().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_ISUACCOUNT_CHANGE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_ISUACCOUNT_CHANGE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCONTRACT_ACCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCONTRACT_ACCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strPartner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strPartner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strValidDAte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strValidDAte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCONTRACTACCOUNTDATA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCONTRACTACCOUNTDATA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCONTRACTACCOUNTDATAX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCONTRACTACCOUNTDATAX"));
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
