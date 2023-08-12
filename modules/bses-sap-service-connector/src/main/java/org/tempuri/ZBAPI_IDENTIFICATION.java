/**
 * ZBAPI_IDENTIFICATION.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_IDENTIFICATION  implements java.io.Serializable {
    private java.lang.String strBP_NO;

    private java.lang.String strType_ID;

    private java.lang.String strID_Num;

    public ZBAPI_IDENTIFICATION() {
    }

    public ZBAPI_IDENTIFICATION(
           java.lang.String strBP_NO,
           java.lang.String strType_ID,
           java.lang.String strID_Num) {
           this.strBP_NO = strBP_NO;
           this.strType_ID = strType_ID;
           this.strID_Num = strID_Num;
    }


    /**
     * Gets the strBP_NO value for this ZBAPI_IDENTIFICATION.
     * 
     * @return strBP_NO
     */
    public java.lang.String getStrBP_NO() {
        return strBP_NO;
    }


    /**
     * Sets the strBP_NO value for this ZBAPI_IDENTIFICATION.
     * 
     * @param strBP_NO
     */
    public void setStrBP_NO(java.lang.String strBP_NO) {
        this.strBP_NO = strBP_NO;
    }


    /**
     * Gets the strType_ID value for this ZBAPI_IDENTIFICATION.
     * 
     * @return strType_ID
     */
    public java.lang.String getStrType_ID() {
        return strType_ID;
    }


    /**
     * Sets the strType_ID value for this ZBAPI_IDENTIFICATION.
     * 
     * @param strType_ID
     */
    public void setStrType_ID(java.lang.String strType_ID) {
        this.strType_ID = strType_ID;
    }


    /**
     * Gets the strID_Num value for this ZBAPI_IDENTIFICATION.
     * 
     * @return strID_Num
     */
    public java.lang.String getStrID_Num() {
        return strID_Num;
    }


    /**
     * Sets the strID_Num value for this ZBAPI_IDENTIFICATION.
     * 
     * @param strID_Num
     */
    public void setStrID_Num(java.lang.String strID_Num) {
        this.strID_Num = strID_Num;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_IDENTIFICATION)) return false;
        ZBAPI_IDENTIFICATION other = (ZBAPI_IDENTIFICATION) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strBP_NO==null && other.getStrBP_NO()==null) || 
             (this.strBP_NO!=null &&
              this.strBP_NO.equals(other.getStrBP_NO()))) &&
            ((this.strType_ID==null && other.getStrType_ID()==null) || 
             (this.strType_ID!=null &&
              this.strType_ID.equals(other.getStrType_ID()))) &&
            ((this.strID_Num==null && other.getStrID_Num()==null) || 
             (this.strID_Num!=null &&
              this.strID_Num.equals(other.getStrID_Num())));
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
        if (getStrBP_NO() != null) {
            _hashCode += getStrBP_NO().hashCode();
        }
        if (getStrType_ID() != null) {
            _hashCode += getStrType_ID().hashCode();
        }
        if (getStrID_Num() != null) {
            _hashCode += getStrID_Num().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_IDENTIFICATION.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_IDENTIFICATION"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strBP_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strBP_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strType_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strType_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strID_Num");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strID_Num"));
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
