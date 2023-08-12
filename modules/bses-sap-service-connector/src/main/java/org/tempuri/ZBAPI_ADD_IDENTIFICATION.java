/**
 * ZBAPI_ADD_IDENTIFICATION.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_ADD_IDENTIFICATION  implements java.io.Serializable {
    private java.lang.String IV_CONTRACT_ACCOUNT;

    private java.lang.String IV_PARTNER_GUID;

    private java.lang.String IV_IDENTIFICATIONCATEGORY;

    private java.lang.String IV_IDENTIFICATIONNUMBER;

    private java.lang.String IV_X_SAVE;

    private java.lang.String IV_IDENTIFICATIONTYPE;

    public ZBAPI_ADD_IDENTIFICATION() {
    }

    public ZBAPI_ADD_IDENTIFICATION(
           java.lang.String IV_CONTRACT_ACCOUNT,
           java.lang.String IV_PARTNER_GUID,
           java.lang.String IV_IDENTIFICATIONCATEGORY,
           java.lang.String IV_IDENTIFICATIONNUMBER,
           java.lang.String IV_X_SAVE,
           java.lang.String IV_IDENTIFICATIONTYPE) {
           this.IV_CONTRACT_ACCOUNT = IV_CONTRACT_ACCOUNT;
           this.IV_PARTNER_GUID = IV_PARTNER_GUID;
           this.IV_IDENTIFICATIONCATEGORY = IV_IDENTIFICATIONCATEGORY;
           this.IV_IDENTIFICATIONNUMBER = IV_IDENTIFICATIONNUMBER;
           this.IV_X_SAVE = IV_X_SAVE;
           this.IV_IDENTIFICATIONTYPE = IV_IDENTIFICATIONTYPE;
    }


    /**
     * Gets the IV_CONTRACT_ACCOUNT value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @return IV_CONTRACT_ACCOUNT
     */
    public java.lang.String getIV_CONTRACT_ACCOUNT() {
        return IV_CONTRACT_ACCOUNT;
    }


    /**
     * Sets the IV_CONTRACT_ACCOUNT value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @param IV_CONTRACT_ACCOUNT
     */
    public void setIV_CONTRACT_ACCOUNT(java.lang.String IV_CONTRACT_ACCOUNT) {
        this.IV_CONTRACT_ACCOUNT = IV_CONTRACT_ACCOUNT;
    }


    /**
     * Gets the IV_PARTNER_GUID value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @return IV_PARTNER_GUID
     */
    public java.lang.String getIV_PARTNER_GUID() {
        return IV_PARTNER_GUID;
    }


    /**
     * Sets the IV_PARTNER_GUID value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @param IV_PARTNER_GUID
     */
    public void setIV_PARTNER_GUID(java.lang.String IV_PARTNER_GUID) {
        this.IV_PARTNER_GUID = IV_PARTNER_GUID;
    }


    /**
     * Gets the IV_IDENTIFICATIONCATEGORY value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @return IV_IDENTIFICATIONCATEGORY
     */
    public java.lang.String getIV_IDENTIFICATIONCATEGORY() {
        return IV_IDENTIFICATIONCATEGORY;
    }


    /**
     * Sets the IV_IDENTIFICATIONCATEGORY value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @param IV_IDENTIFICATIONCATEGORY
     */
    public void setIV_IDENTIFICATIONCATEGORY(java.lang.String IV_IDENTIFICATIONCATEGORY) {
        this.IV_IDENTIFICATIONCATEGORY = IV_IDENTIFICATIONCATEGORY;
    }


    /**
     * Gets the IV_IDENTIFICATIONNUMBER value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @return IV_IDENTIFICATIONNUMBER
     */
    public java.lang.String getIV_IDENTIFICATIONNUMBER() {
        return IV_IDENTIFICATIONNUMBER;
    }


    /**
     * Sets the IV_IDENTIFICATIONNUMBER value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @param IV_IDENTIFICATIONNUMBER
     */
    public void setIV_IDENTIFICATIONNUMBER(java.lang.String IV_IDENTIFICATIONNUMBER) {
        this.IV_IDENTIFICATIONNUMBER = IV_IDENTIFICATIONNUMBER;
    }


    /**
     * Gets the IV_X_SAVE value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @return IV_X_SAVE
     */
    public java.lang.String getIV_X_SAVE() {
        return IV_X_SAVE;
    }


    /**
     * Sets the IV_X_SAVE value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @param IV_X_SAVE
     */
    public void setIV_X_SAVE(java.lang.String IV_X_SAVE) {
        this.IV_X_SAVE = IV_X_SAVE;
    }


    /**
     * Gets the IV_IDENTIFICATIONTYPE value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @return IV_IDENTIFICATIONTYPE
     */
    public java.lang.String getIV_IDENTIFICATIONTYPE() {
        return IV_IDENTIFICATIONTYPE;
    }


    /**
     * Sets the IV_IDENTIFICATIONTYPE value for this ZBAPI_ADD_IDENTIFICATION.
     * 
     * @param IV_IDENTIFICATIONTYPE
     */
    public void setIV_IDENTIFICATIONTYPE(java.lang.String IV_IDENTIFICATIONTYPE) {
        this.IV_IDENTIFICATIONTYPE = IV_IDENTIFICATIONTYPE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_ADD_IDENTIFICATION)) return false;
        ZBAPI_ADD_IDENTIFICATION other = (ZBAPI_ADD_IDENTIFICATION) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IV_CONTRACT_ACCOUNT==null && other.getIV_CONTRACT_ACCOUNT()==null) || 
             (this.IV_CONTRACT_ACCOUNT!=null &&
              this.IV_CONTRACT_ACCOUNT.equals(other.getIV_CONTRACT_ACCOUNT()))) &&
            ((this.IV_PARTNER_GUID==null && other.getIV_PARTNER_GUID()==null) || 
             (this.IV_PARTNER_GUID!=null &&
              this.IV_PARTNER_GUID.equals(other.getIV_PARTNER_GUID()))) &&
            ((this.IV_IDENTIFICATIONCATEGORY==null && other.getIV_IDENTIFICATIONCATEGORY()==null) || 
             (this.IV_IDENTIFICATIONCATEGORY!=null &&
              this.IV_IDENTIFICATIONCATEGORY.equals(other.getIV_IDENTIFICATIONCATEGORY()))) &&
            ((this.IV_IDENTIFICATIONNUMBER==null && other.getIV_IDENTIFICATIONNUMBER()==null) || 
             (this.IV_IDENTIFICATIONNUMBER!=null &&
              this.IV_IDENTIFICATIONNUMBER.equals(other.getIV_IDENTIFICATIONNUMBER()))) &&
            ((this.IV_X_SAVE==null && other.getIV_X_SAVE()==null) || 
             (this.IV_X_SAVE!=null &&
              this.IV_X_SAVE.equals(other.getIV_X_SAVE()))) &&
            ((this.IV_IDENTIFICATIONTYPE==null && other.getIV_IDENTIFICATIONTYPE()==null) || 
             (this.IV_IDENTIFICATIONTYPE!=null &&
              this.IV_IDENTIFICATIONTYPE.equals(other.getIV_IDENTIFICATIONTYPE())));
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
        if (getIV_CONTRACT_ACCOUNT() != null) {
            _hashCode += getIV_CONTRACT_ACCOUNT().hashCode();
        }
        if (getIV_PARTNER_GUID() != null) {
            _hashCode += getIV_PARTNER_GUID().hashCode();
        }
        if (getIV_IDENTIFICATIONCATEGORY() != null) {
            _hashCode += getIV_IDENTIFICATIONCATEGORY().hashCode();
        }
        if (getIV_IDENTIFICATIONNUMBER() != null) {
            _hashCode += getIV_IDENTIFICATIONNUMBER().hashCode();
        }
        if (getIV_X_SAVE() != null) {
            _hashCode += getIV_X_SAVE().hashCode();
        }
        if (getIV_IDENTIFICATIONTYPE() != null) {
            _hashCode += getIV_IDENTIFICATIONTYPE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_ADD_IDENTIFICATION.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_ADD_IDENTIFICATION"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IV_CONTRACT_ACCOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IV_CONTRACT_ACCOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IV_PARTNER_GUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IV_PARTNER_GUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IV_IDENTIFICATIONCATEGORY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IV_IDENTIFICATIONCATEGORY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IV_IDENTIFICATIONNUMBER");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IV_IDENTIFICATIONNUMBER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IV_X_SAVE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IV_X_SAVE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IV_IDENTIFICATIONTYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IV_IDENTIFICATIONTYPE"));
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
