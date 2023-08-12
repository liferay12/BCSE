/**
 * ZBAPI_PREPAID_RTGS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_PREPAID_RTGS  implements java.io.Serializable {
    private java.lang.String strCOMP_CODE;

    private java.lang.String strCONTRACT_ACCOUNT;

    private java.lang.String strACCOUNT_TYPE;

    private java.lang.String strAMOUNT;

    private java.lang.String strFLAG;

    public ZBAPI_PREPAID_RTGS() {
    }

    public ZBAPI_PREPAID_RTGS(
           java.lang.String strCOMP_CODE,
           java.lang.String strCONTRACT_ACCOUNT,
           java.lang.String strACCOUNT_TYPE,
           java.lang.String strAMOUNT,
           java.lang.String strFLAG) {
           this.strCOMP_CODE = strCOMP_CODE;
           this.strCONTRACT_ACCOUNT = strCONTRACT_ACCOUNT;
           this.strACCOUNT_TYPE = strACCOUNT_TYPE;
           this.strAMOUNT = strAMOUNT;
           this.strFLAG = strFLAG;
    }


    /**
     * Gets the strCOMP_CODE value for this ZBAPI_PREPAID_RTGS.
     * 
     * @return strCOMP_CODE
     */
    public java.lang.String getStrCOMP_CODE() {
        return strCOMP_CODE;
    }


    /**
     * Sets the strCOMP_CODE value for this ZBAPI_PREPAID_RTGS.
     * 
     * @param strCOMP_CODE
     */
    public void setStrCOMP_CODE(java.lang.String strCOMP_CODE) {
        this.strCOMP_CODE = strCOMP_CODE;
    }


    /**
     * Gets the strCONTRACT_ACCOUNT value for this ZBAPI_PREPAID_RTGS.
     * 
     * @return strCONTRACT_ACCOUNT
     */
    public java.lang.String getStrCONTRACT_ACCOUNT() {
        return strCONTRACT_ACCOUNT;
    }


    /**
     * Sets the strCONTRACT_ACCOUNT value for this ZBAPI_PREPAID_RTGS.
     * 
     * @param strCONTRACT_ACCOUNT
     */
    public void setStrCONTRACT_ACCOUNT(java.lang.String strCONTRACT_ACCOUNT) {
        this.strCONTRACT_ACCOUNT = strCONTRACT_ACCOUNT;
    }


    /**
     * Gets the strACCOUNT_TYPE value for this ZBAPI_PREPAID_RTGS.
     * 
     * @return strACCOUNT_TYPE
     */
    public java.lang.String getStrACCOUNT_TYPE() {
        return strACCOUNT_TYPE;
    }


    /**
     * Sets the strACCOUNT_TYPE value for this ZBAPI_PREPAID_RTGS.
     * 
     * @param strACCOUNT_TYPE
     */
    public void setStrACCOUNT_TYPE(java.lang.String strACCOUNT_TYPE) {
        this.strACCOUNT_TYPE = strACCOUNT_TYPE;
    }


    /**
     * Gets the strAMOUNT value for this ZBAPI_PREPAID_RTGS.
     * 
     * @return strAMOUNT
     */
    public java.lang.String getStrAMOUNT() {
        return strAMOUNT;
    }


    /**
     * Sets the strAMOUNT value for this ZBAPI_PREPAID_RTGS.
     * 
     * @param strAMOUNT
     */
    public void setStrAMOUNT(java.lang.String strAMOUNT) {
        this.strAMOUNT = strAMOUNT;
    }


    /**
     * Gets the strFLAG value for this ZBAPI_PREPAID_RTGS.
     * 
     * @return strFLAG
     */
    public java.lang.String getStrFLAG() {
        return strFLAG;
    }


    /**
     * Sets the strFLAG value for this ZBAPI_PREPAID_RTGS.
     * 
     * @param strFLAG
     */
    public void setStrFLAG(java.lang.String strFLAG) {
        this.strFLAG = strFLAG;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_PREPAID_RTGS)) return false;
        ZBAPI_PREPAID_RTGS other = (ZBAPI_PREPAID_RTGS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCOMP_CODE==null && other.getStrCOMP_CODE()==null) || 
             (this.strCOMP_CODE!=null &&
              this.strCOMP_CODE.equals(other.getStrCOMP_CODE()))) &&
            ((this.strCONTRACT_ACCOUNT==null && other.getStrCONTRACT_ACCOUNT()==null) || 
             (this.strCONTRACT_ACCOUNT!=null &&
              this.strCONTRACT_ACCOUNT.equals(other.getStrCONTRACT_ACCOUNT()))) &&
            ((this.strACCOUNT_TYPE==null && other.getStrACCOUNT_TYPE()==null) || 
             (this.strACCOUNT_TYPE!=null &&
              this.strACCOUNT_TYPE.equals(other.getStrACCOUNT_TYPE()))) &&
            ((this.strAMOUNT==null && other.getStrAMOUNT()==null) || 
             (this.strAMOUNT!=null &&
              this.strAMOUNT.equals(other.getStrAMOUNT()))) &&
            ((this.strFLAG==null && other.getStrFLAG()==null) || 
             (this.strFLAG!=null &&
              this.strFLAG.equals(other.getStrFLAG())));
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
        if (getStrCOMP_CODE() != null) {
            _hashCode += getStrCOMP_CODE().hashCode();
        }
        if (getStrCONTRACT_ACCOUNT() != null) {
            _hashCode += getStrCONTRACT_ACCOUNT().hashCode();
        }
        if (getStrACCOUNT_TYPE() != null) {
            _hashCode += getStrACCOUNT_TYPE().hashCode();
        }
        if (getStrAMOUNT() != null) {
            _hashCode += getStrAMOUNT().hashCode();
        }
        if (getStrFLAG() != null) {
            _hashCode += getStrFLAG().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_PREPAID_RTGS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_PREPAID_RTGS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCOMP_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCOMP_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCONTRACT_ACCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCONTRACT_ACCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strACCOUNT_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strACCOUNT_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strFLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strFLAG"));
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
