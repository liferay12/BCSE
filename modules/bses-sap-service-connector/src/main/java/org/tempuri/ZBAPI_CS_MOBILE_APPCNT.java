/**
 * ZBAPI_CS_MOBILE_APPCNT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CS_MOBILE_APPCNT  implements java.io.Serializable {
    private java.lang.String strMobileNO;

    private java.lang.String strPM_Activity;

    private java.lang.String strPriod;

    private java.lang.String strVAPLZ;

    public ZBAPI_CS_MOBILE_APPCNT() {
    }

    public ZBAPI_CS_MOBILE_APPCNT(
           java.lang.String strMobileNO,
           java.lang.String strPM_Activity,
           java.lang.String strPriod,
           java.lang.String strVAPLZ) {
           this.strMobileNO = strMobileNO;
           this.strPM_Activity = strPM_Activity;
           this.strPriod = strPriod;
           this.strVAPLZ = strVAPLZ;
    }


    /**
     * Gets the strMobileNO value for this ZBAPI_CS_MOBILE_APPCNT.
     * 
     * @return strMobileNO
     */
    public java.lang.String getStrMobileNO() {
        return strMobileNO;
    }


    /**
     * Sets the strMobileNO value for this ZBAPI_CS_MOBILE_APPCNT.
     * 
     * @param strMobileNO
     */
    public void setStrMobileNO(java.lang.String strMobileNO) {
        this.strMobileNO = strMobileNO;
    }


    /**
     * Gets the strPM_Activity value for this ZBAPI_CS_MOBILE_APPCNT.
     * 
     * @return strPM_Activity
     */
    public java.lang.String getStrPM_Activity() {
        return strPM_Activity;
    }


    /**
     * Sets the strPM_Activity value for this ZBAPI_CS_MOBILE_APPCNT.
     * 
     * @param strPM_Activity
     */
    public void setStrPM_Activity(java.lang.String strPM_Activity) {
        this.strPM_Activity = strPM_Activity;
    }


    /**
     * Gets the strPriod value for this ZBAPI_CS_MOBILE_APPCNT.
     * 
     * @return strPriod
     */
    public java.lang.String getStrPriod() {
        return strPriod;
    }


    /**
     * Sets the strPriod value for this ZBAPI_CS_MOBILE_APPCNT.
     * 
     * @param strPriod
     */
    public void setStrPriod(java.lang.String strPriod) {
        this.strPriod = strPriod;
    }


    /**
     * Gets the strVAPLZ value for this ZBAPI_CS_MOBILE_APPCNT.
     * 
     * @return strVAPLZ
     */
    public java.lang.String getStrVAPLZ() {
        return strVAPLZ;
    }


    /**
     * Sets the strVAPLZ value for this ZBAPI_CS_MOBILE_APPCNT.
     * 
     * @param strVAPLZ
     */
    public void setStrVAPLZ(java.lang.String strVAPLZ) {
        this.strVAPLZ = strVAPLZ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CS_MOBILE_APPCNT)) return false;
        ZBAPI_CS_MOBILE_APPCNT other = (ZBAPI_CS_MOBILE_APPCNT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strMobileNO==null && other.getStrMobileNO()==null) || 
             (this.strMobileNO!=null &&
              this.strMobileNO.equals(other.getStrMobileNO()))) &&
            ((this.strPM_Activity==null && other.getStrPM_Activity()==null) || 
             (this.strPM_Activity!=null &&
              this.strPM_Activity.equals(other.getStrPM_Activity()))) &&
            ((this.strPriod==null && other.getStrPriod()==null) || 
             (this.strPriod!=null &&
              this.strPriod.equals(other.getStrPriod()))) &&
            ((this.strVAPLZ==null && other.getStrVAPLZ()==null) || 
             (this.strVAPLZ!=null &&
              this.strVAPLZ.equals(other.getStrVAPLZ())));
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
        if (getStrMobileNO() != null) {
            _hashCode += getStrMobileNO().hashCode();
        }
        if (getStrPM_Activity() != null) {
            _hashCode += getStrPM_Activity().hashCode();
        }
        if (getStrPriod() != null) {
            _hashCode += getStrPriod().hashCode();
        }
        if (getStrVAPLZ() != null) {
            _hashCode += getStrVAPLZ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CS_MOBILE_APPCNT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CS_MOBILE_APPCNT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strMobileNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strMobileNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strPM_Activity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strPM_Activity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strPriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strPriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strVAPLZ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strVAPLZ"));
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
