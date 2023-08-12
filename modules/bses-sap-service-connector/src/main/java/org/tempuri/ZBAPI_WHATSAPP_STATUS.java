/**
 * ZBAPI_WHATSAPP_STATUS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_WHATSAPP_STATUS  implements java.io.Serializable {
    private java.lang.String strOrd_Date;

    private java.lang.String strCom_Code;

    private java.lang.String strIFlag;

    public ZBAPI_WHATSAPP_STATUS() {
    }

    public ZBAPI_WHATSAPP_STATUS(
           java.lang.String strOrd_Date,
           java.lang.String strCom_Code,
           java.lang.String strIFlag) {
           this.strOrd_Date = strOrd_Date;
           this.strCom_Code = strCom_Code;
           this.strIFlag = strIFlag;
    }


    /**
     * Gets the strOrd_Date value for this ZBAPI_WHATSAPP_STATUS.
     * 
     * @return strOrd_Date
     */
    public java.lang.String getStrOrd_Date() {
        return strOrd_Date;
    }


    /**
     * Sets the strOrd_Date value for this ZBAPI_WHATSAPP_STATUS.
     * 
     * @param strOrd_Date
     */
    public void setStrOrd_Date(java.lang.String strOrd_Date) {
        this.strOrd_Date = strOrd_Date;
    }


    /**
     * Gets the strCom_Code value for this ZBAPI_WHATSAPP_STATUS.
     * 
     * @return strCom_Code
     */
    public java.lang.String getStrCom_Code() {
        return strCom_Code;
    }


    /**
     * Sets the strCom_Code value for this ZBAPI_WHATSAPP_STATUS.
     * 
     * @param strCom_Code
     */
    public void setStrCom_Code(java.lang.String strCom_Code) {
        this.strCom_Code = strCom_Code;
    }


    /**
     * Gets the strIFlag value for this ZBAPI_WHATSAPP_STATUS.
     * 
     * @return strIFlag
     */
    public java.lang.String getStrIFlag() {
        return strIFlag;
    }


    /**
     * Sets the strIFlag value for this ZBAPI_WHATSAPP_STATUS.
     * 
     * @param strIFlag
     */
    public void setStrIFlag(java.lang.String strIFlag) {
        this.strIFlag = strIFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_WHATSAPP_STATUS)) return false;
        ZBAPI_WHATSAPP_STATUS other = (ZBAPI_WHATSAPP_STATUS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strOrd_Date==null && other.getStrOrd_Date()==null) || 
             (this.strOrd_Date!=null &&
              this.strOrd_Date.equals(other.getStrOrd_Date()))) &&
            ((this.strCom_Code==null && other.getStrCom_Code()==null) || 
             (this.strCom_Code!=null &&
              this.strCom_Code.equals(other.getStrCom_Code()))) &&
            ((this.strIFlag==null && other.getStrIFlag()==null) || 
             (this.strIFlag!=null &&
              this.strIFlag.equals(other.getStrIFlag())));
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
        if (getStrOrd_Date() != null) {
            _hashCode += getStrOrd_Date().hashCode();
        }
        if (getStrCom_Code() != null) {
            _hashCode += getStrCom_Code().hashCode();
        }
        if (getStrIFlag() != null) {
            _hashCode += getStrIFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_WHATSAPP_STATUS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_WHATSAPP_STATUS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strOrd_Date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strOrd_Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCom_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCom_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strIFlag"));
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
