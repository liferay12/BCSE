/**
 * ZBAPI_REAPPOINT_SCHEDULE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_REAPPOINT_SCHEDULE  implements java.io.Serializable {
    private java.lang.String strORDER_NO;

    private java.lang.String strAPPOINT_DT;

    private java.lang.String strAPPOINT_ST_TM;

    private java.lang.String strAPPOINT_EN_TM;

    public ZBAPI_REAPPOINT_SCHEDULE() {
    }

    public ZBAPI_REAPPOINT_SCHEDULE(
           java.lang.String strORDER_NO,
           java.lang.String strAPPOINT_DT,
           java.lang.String strAPPOINT_ST_TM,
           java.lang.String strAPPOINT_EN_TM) {
           this.strORDER_NO = strORDER_NO;
           this.strAPPOINT_DT = strAPPOINT_DT;
           this.strAPPOINT_ST_TM = strAPPOINT_ST_TM;
           this.strAPPOINT_EN_TM = strAPPOINT_EN_TM;
    }


    /**
     * Gets the strORDER_NO value for this ZBAPI_REAPPOINT_SCHEDULE.
     * 
     * @return strORDER_NO
     */
    public java.lang.String getStrORDER_NO() {
        return strORDER_NO;
    }


    /**
     * Sets the strORDER_NO value for this ZBAPI_REAPPOINT_SCHEDULE.
     * 
     * @param strORDER_NO
     */
    public void setStrORDER_NO(java.lang.String strORDER_NO) {
        this.strORDER_NO = strORDER_NO;
    }


    /**
     * Gets the strAPPOINT_DT value for this ZBAPI_REAPPOINT_SCHEDULE.
     * 
     * @return strAPPOINT_DT
     */
    public java.lang.String getStrAPPOINT_DT() {
        return strAPPOINT_DT;
    }


    /**
     * Sets the strAPPOINT_DT value for this ZBAPI_REAPPOINT_SCHEDULE.
     * 
     * @param strAPPOINT_DT
     */
    public void setStrAPPOINT_DT(java.lang.String strAPPOINT_DT) {
        this.strAPPOINT_DT = strAPPOINT_DT;
    }


    /**
     * Gets the strAPPOINT_ST_TM value for this ZBAPI_REAPPOINT_SCHEDULE.
     * 
     * @return strAPPOINT_ST_TM
     */
    public java.lang.String getStrAPPOINT_ST_TM() {
        return strAPPOINT_ST_TM;
    }


    /**
     * Sets the strAPPOINT_ST_TM value for this ZBAPI_REAPPOINT_SCHEDULE.
     * 
     * @param strAPPOINT_ST_TM
     */
    public void setStrAPPOINT_ST_TM(java.lang.String strAPPOINT_ST_TM) {
        this.strAPPOINT_ST_TM = strAPPOINT_ST_TM;
    }


    /**
     * Gets the strAPPOINT_EN_TM value for this ZBAPI_REAPPOINT_SCHEDULE.
     * 
     * @return strAPPOINT_EN_TM
     */
    public java.lang.String getStrAPPOINT_EN_TM() {
        return strAPPOINT_EN_TM;
    }


    /**
     * Sets the strAPPOINT_EN_TM value for this ZBAPI_REAPPOINT_SCHEDULE.
     * 
     * @param strAPPOINT_EN_TM
     */
    public void setStrAPPOINT_EN_TM(java.lang.String strAPPOINT_EN_TM) {
        this.strAPPOINT_EN_TM = strAPPOINT_EN_TM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_REAPPOINT_SCHEDULE)) return false;
        ZBAPI_REAPPOINT_SCHEDULE other = (ZBAPI_REAPPOINT_SCHEDULE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strORDER_NO==null && other.getStrORDER_NO()==null) || 
             (this.strORDER_NO!=null &&
              this.strORDER_NO.equals(other.getStrORDER_NO()))) &&
            ((this.strAPPOINT_DT==null && other.getStrAPPOINT_DT()==null) || 
             (this.strAPPOINT_DT!=null &&
              this.strAPPOINT_DT.equals(other.getStrAPPOINT_DT()))) &&
            ((this.strAPPOINT_ST_TM==null && other.getStrAPPOINT_ST_TM()==null) || 
             (this.strAPPOINT_ST_TM!=null &&
              this.strAPPOINT_ST_TM.equals(other.getStrAPPOINT_ST_TM()))) &&
            ((this.strAPPOINT_EN_TM==null && other.getStrAPPOINT_EN_TM()==null) || 
             (this.strAPPOINT_EN_TM!=null &&
              this.strAPPOINT_EN_TM.equals(other.getStrAPPOINT_EN_TM())));
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
        if (getStrORDER_NO() != null) {
            _hashCode += getStrORDER_NO().hashCode();
        }
        if (getStrAPPOINT_DT() != null) {
            _hashCode += getStrAPPOINT_DT().hashCode();
        }
        if (getStrAPPOINT_ST_TM() != null) {
            _hashCode += getStrAPPOINT_ST_TM().hashCode();
        }
        if (getStrAPPOINT_EN_TM() != null) {
            _hashCode += getStrAPPOINT_EN_TM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_REAPPOINT_SCHEDULE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_REAPPOINT_SCHEDULE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strORDER_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strORDER_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAPPOINT_DT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAPPOINT_DT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAPPOINT_ST_TM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAPPOINT_ST_TM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAPPOINT_EN_TM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAPPOINT_EN_TM"));
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
