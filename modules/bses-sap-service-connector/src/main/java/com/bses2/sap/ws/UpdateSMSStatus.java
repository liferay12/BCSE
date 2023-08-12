/**
 * UpdateSMSStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class UpdateSMSStatus  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String REQUESTID;

    private java.lang.String SENDER_ID;

    private java.lang.String a2W_ACCEPT_DATE;

    private java.lang.String a2W_STATUS;

    private java.lang.String CARRIER_ACCEPT_DATE;

    private java.lang.String a2W_REASON;

    private java.lang.String CARRIER_DELIVERED_DATE;

    private java.lang.String CARRIER_STATUS;

    private java.lang.String CARRIER_STATUS_DESC;

    public UpdateSMSStatus() {
    }

    public UpdateSMSStatus(
           java.lang.String key,
           java.lang.String REQUESTID,
           java.lang.String SENDER_ID,
           java.lang.String a2W_ACCEPT_DATE,
           java.lang.String a2W_STATUS,
           java.lang.String CARRIER_ACCEPT_DATE,
           java.lang.String a2W_REASON,
           java.lang.String CARRIER_DELIVERED_DATE,
           java.lang.String CARRIER_STATUS,
           java.lang.String CARRIER_STATUS_DESC) {
           this.key = key;
           this.REQUESTID = REQUESTID;
           this.SENDER_ID = SENDER_ID;
           this.a2W_ACCEPT_DATE = a2W_ACCEPT_DATE;
           this.a2W_STATUS = a2W_STATUS;
           this.CARRIER_ACCEPT_DATE = CARRIER_ACCEPT_DATE;
           this.a2W_REASON = a2W_REASON;
           this.CARRIER_DELIVERED_DATE = CARRIER_DELIVERED_DATE;
           this.CARRIER_STATUS = CARRIER_STATUS;
           this.CARRIER_STATUS_DESC = CARRIER_STATUS_DESC;
    }


    /**
     * Gets the key value for this UpdateSMSStatus.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this UpdateSMSStatus.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the REQUESTID value for this UpdateSMSStatus.
     * 
     * @return REQUESTID
     */
    public java.lang.String getREQUESTID() {
        return REQUESTID;
    }


    /**
     * Sets the REQUESTID value for this UpdateSMSStatus.
     * 
     * @param REQUESTID
     */
    public void setREQUESTID(java.lang.String REQUESTID) {
        this.REQUESTID = REQUESTID;
    }


    /**
     * Gets the SENDER_ID value for this UpdateSMSStatus.
     * 
     * @return SENDER_ID
     */
    public java.lang.String getSENDER_ID() {
        return SENDER_ID;
    }


    /**
     * Sets the SENDER_ID value for this UpdateSMSStatus.
     * 
     * @param SENDER_ID
     */
    public void setSENDER_ID(java.lang.String SENDER_ID) {
        this.SENDER_ID = SENDER_ID;
    }


    /**
     * Gets the a2W_ACCEPT_DATE value for this UpdateSMSStatus.
     * 
     * @return a2W_ACCEPT_DATE
     */
    public java.lang.String getA2W_ACCEPT_DATE() {
        return a2W_ACCEPT_DATE;
    }


    /**
     * Sets the a2W_ACCEPT_DATE value for this UpdateSMSStatus.
     * 
     * @param a2W_ACCEPT_DATE
     */
    public void setA2W_ACCEPT_DATE(java.lang.String a2W_ACCEPT_DATE) {
        this.a2W_ACCEPT_DATE = a2W_ACCEPT_DATE;
    }


    /**
     * Gets the a2W_STATUS value for this UpdateSMSStatus.
     * 
     * @return a2W_STATUS
     */
    public java.lang.String getA2W_STATUS() {
        return a2W_STATUS;
    }


    /**
     * Sets the a2W_STATUS value for this UpdateSMSStatus.
     * 
     * @param a2W_STATUS
     */
    public void setA2W_STATUS(java.lang.String a2W_STATUS) {
        this.a2W_STATUS = a2W_STATUS;
    }


    /**
     * Gets the CARRIER_ACCEPT_DATE value for this UpdateSMSStatus.
     * 
     * @return CARRIER_ACCEPT_DATE
     */
    public java.lang.String getCARRIER_ACCEPT_DATE() {
        return CARRIER_ACCEPT_DATE;
    }


    /**
     * Sets the CARRIER_ACCEPT_DATE value for this UpdateSMSStatus.
     * 
     * @param CARRIER_ACCEPT_DATE
     */
    public void setCARRIER_ACCEPT_DATE(java.lang.String CARRIER_ACCEPT_DATE) {
        this.CARRIER_ACCEPT_DATE = CARRIER_ACCEPT_DATE;
    }


    /**
     * Gets the a2W_REASON value for this UpdateSMSStatus.
     * 
     * @return a2W_REASON
     */
    public java.lang.String getA2W_REASON() {
        return a2W_REASON;
    }


    /**
     * Sets the a2W_REASON value for this UpdateSMSStatus.
     * 
     * @param a2W_REASON
     */
    public void setA2W_REASON(java.lang.String a2W_REASON) {
        this.a2W_REASON = a2W_REASON;
    }


    /**
     * Gets the CARRIER_DELIVERED_DATE value for this UpdateSMSStatus.
     * 
     * @return CARRIER_DELIVERED_DATE
     */
    public java.lang.String getCARRIER_DELIVERED_DATE() {
        return CARRIER_DELIVERED_DATE;
    }


    /**
     * Sets the CARRIER_DELIVERED_DATE value for this UpdateSMSStatus.
     * 
     * @param CARRIER_DELIVERED_DATE
     */
    public void setCARRIER_DELIVERED_DATE(java.lang.String CARRIER_DELIVERED_DATE) {
        this.CARRIER_DELIVERED_DATE = CARRIER_DELIVERED_DATE;
    }


    /**
     * Gets the CARRIER_STATUS value for this UpdateSMSStatus.
     * 
     * @return CARRIER_STATUS
     */
    public java.lang.String getCARRIER_STATUS() {
        return CARRIER_STATUS;
    }


    /**
     * Sets the CARRIER_STATUS value for this UpdateSMSStatus.
     * 
     * @param CARRIER_STATUS
     */
    public void setCARRIER_STATUS(java.lang.String CARRIER_STATUS) {
        this.CARRIER_STATUS = CARRIER_STATUS;
    }


    /**
     * Gets the CARRIER_STATUS_DESC value for this UpdateSMSStatus.
     * 
     * @return CARRIER_STATUS_DESC
     */
    public java.lang.String getCARRIER_STATUS_DESC() {
        return CARRIER_STATUS_DESC;
    }


    /**
     * Sets the CARRIER_STATUS_DESC value for this UpdateSMSStatus.
     * 
     * @param CARRIER_STATUS_DESC
     */
    public void setCARRIER_STATUS_DESC(java.lang.String CARRIER_STATUS_DESC) {
        this.CARRIER_STATUS_DESC = CARRIER_STATUS_DESC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateSMSStatus)) return false;
        UpdateSMSStatus other = (UpdateSMSStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.REQUESTID==null && other.getREQUESTID()==null) || 
             (this.REQUESTID!=null &&
              this.REQUESTID.equals(other.getREQUESTID()))) &&
            ((this.SENDER_ID==null && other.getSENDER_ID()==null) || 
             (this.SENDER_ID!=null &&
              this.SENDER_ID.equals(other.getSENDER_ID()))) &&
            ((this.a2W_ACCEPT_DATE==null && other.getA2W_ACCEPT_DATE()==null) || 
             (this.a2W_ACCEPT_DATE!=null &&
              this.a2W_ACCEPT_DATE.equals(other.getA2W_ACCEPT_DATE()))) &&
            ((this.a2W_STATUS==null && other.getA2W_STATUS()==null) || 
             (this.a2W_STATUS!=null &&
              this.a2W_STATUS.equals(other.getA2W_STATUS()))) &&
            ((this.CARRIER_ACCEPT_DATE==null && other.getCARRIER_ACCEPT_DATE()==null) || 
             (this.CARRIER_ACCEPT_DATE!=null &&
              this.CARRIER_ACCEPT_DATE.equals(other.getCARRIER_ACCEPT_DATE()))) &&
            ((this.a2W_REASON==null && other.getA2W_REASON()==null) || 
             (this.a2W_REASON!=null &&
              this.a2W_REASON.equals(other.getA2W_REASON()))) &&
            ((this.CARRIER_DELIVERED_DATE==null && other.getCARRIER_DELIVERED_DATE()==null) || 
             (this.CARRIER_DELIVERED_DATE!=null &&
              this.CARRIER_DELIVERED_DATE.equals(other.getCARRIER_DELIVERED_DATE()))) &&
            ((this.CARRIER_STATUS==null && other.getCARRIER_STATUS()==null) || 
             (this.CARRIER_STATUS!=null &&
              this.CARRIER_STATUS.equals(other.getCARRIER_STATUS()))) &&
            ((this.CARRIER_STATUS_DESC==null && other.getCARRIER_STATUS_DESC()==null) || 
             (this.CARRIER_STATUS_DESC!=null &&
              this.CARRIER_STATUS_DESC.equals(other.getCARRIER_STATUS_DESC())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getREQUESTID() != null) {
            _hashCode += getREQUESTID().hashCode();
        }
        if (getSENDER_ID() != null) {
            _hashCode += getSENDER_ID().hashCode();
        }
        if (getA2W_ACCEPT_DATE() != null) {
            _hashCode += getA2W_ACCEPT_DATE().hashCode();
        }
        if (getA2W_STATUS() != null) {
            _hashCode += getA2W_STATUS().hashCode();
        }
        if (getCARRIER_ACCEPT_DATE() != null) {
            _hashCode += getCARRIER_ACCEPT_DATE().hashCode();
        }
        if (getA2W_REASON() != null) {
            _hashCode += getA2W_REASON().hashCode();
        }
        if (getCARRIER_DELIVERED_DATE() != null) {
            _hashCode += getCARRIER_DELIVERED_DATE().hashCode();
        }
        if (getCARRIER_STATUS() != null) {
            _hashCode += getCARRIER_STATUS().hashCode();
        }
        if (getCARRIER_STATUS_DESC() != null) {
            _hashCode += getCARRIER_STATUS_DESC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSMSStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateSMSStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REQUESTID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "REQUESTID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SENDER_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SENDER_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a2W_ACCEPT_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A2W_ACCEPT_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a2W_STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A2W_STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARRIER_ACCEPT_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CARRIER_ACCEPT_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("a2W_REASON");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "A2W_REASON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARRIER_DELIVERED_DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CARRIER_DELIVERED_DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARRIER_STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CARRIER_STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARRIER_STATUS_DESC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CARRIER_STATUS_DESC"));
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
