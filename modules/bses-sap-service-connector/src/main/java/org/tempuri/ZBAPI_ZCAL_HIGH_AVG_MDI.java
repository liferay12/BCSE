/**
 * ZBAPI_ZCAL_HIGH_AVG_MDI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_ZCAL_HIGH_AVG_MDI  implements java.io.Serializable {
    private java.lang.String CA_NUMBER;

    private java.lang.String appDate;

    private java.lang.String appLoad;

    public ZBAPI_ZCAL_HIGH_AVG_MDI() {
    }

    public ZBAPI_ZCAL_HIGH_AVG_MDI(
           java.lang.String CA_NUMBER,
           java.lang.String appDate,
           java.lang.String appLoad) {
           this.CA_NUMBER = CA_NUMBER;
           this.appDate = appDate;
           this.appLoad = appLoad;
    }


    /**
     * Gets the CA_NUMBER value for this ZBAPI_ZCAL_HIGH_AVG_MDI.
     * 
     * @return CA_NUMBER
     */
    public java.lang.String getCA_NUMBER() {
        return CA_NUMBER;
    }


    /**
     * Sets the CA_NUMBER value for this ZBAPI_ZCAL_HIGH_AVG_MDI.
     * 
     * @param CA_NUMBER
     */
    public void setCA_NUMBER(java.lang.String CA_NUMBER) {
        this.CA_NUMBER = CA_NUMBER;
    }


    /**
     * Gets the appDate value for this ZBAPI_ZCAL_HIGH_AVG_MDI.
     * 
     * @return appDate
     */
    public java.lang.String getAppDate() {
        return appDate;
    }


    /**
     * Sets the appDate value for this ZBAPI_ZCAL_HIGH_AVG_MDI.
     * 
     * @param appDate
     */
    public void setAppDate(java.lang.String appDate) {
        this.appDate = appDate;
    }


    /**
     * Gets the appLoad value for this ZBAPI_ZCAL_HIGH_AVG_MDI.
     * 
     * @return appLoad
     */
    public java.lang.String getAppLoad() {
        return appLoad;
    }


    /**
     * Sets the appLoad value for this ZBAPI_ZCAL_HIGH_AVG_MDI.
     * 
     * @param appLoad
     */
    public void setAppLoad(java.lang.String appLoad) {
        this.appLoad = appLoad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_ZCAL_HIGH_AVG_MDI)) return false;
        ZBAPI_ZCAL_HIGH_AVG_MDI other = (ZBAPI_ZCAL_HIGH_AVG_MDI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CA_NUMBER==null && other.getCA_NUMBER()==null) || 
             (this.CA_NUMBER!=null &&
              this.CA_NUMBER.equals(other.getCA_NUMBER()))) &&
            ((this.appDate==null && other.getAppDate()==null) || 
             (this.appDate!=null &&
              this.appDate.equals(other.getAppDate()))) &&
            ((this.appLoad==null && other.getAppLoad()==null) || 
             (this.appLoad!=null &&
              this.appLoad.equals(other.getAppLoad())));
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
        if (getCA_NUMBER() != null) {
            _hashCode += getCA_NUMBER().hashCode();
        }
        if (getAppDate() != null) {
            _hashCode += getAppDate().hashCode();
        }
        if (getAppLoad() != null) {
            _hashCode += getAppLoad().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_ZCAL_HIGH_AVG_MDI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_ZCAL_HIGH_AVG_MDI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CA_NUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CA_NUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AppDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appLoad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AppLoad"));
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
