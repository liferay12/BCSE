/**
 * ComplaintRegistrationWeb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ComplaintRegistrationWeb  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String callerName;

    private java.lang.String phone;

    private java.lang.String add;

    private java.lang.String email;

    private java.lang.String CA;

    private java.lang.String area;

    private java.lang.String faultCategoryCode;

    private java.lang.String subFaultCategoryName;

    private java.lang.String remarks;

    private java.lang.String CODE;

    private java.lang.String poleNum;

    public ComplaintRegistrationWeb() {
    }

    public ComplaintRegistrationWeb(
           java.lang.String key,
           java.lang.String callerName,
           java.lang.String phone,
           java.lang.String add,
           java.lang.String email,
           java.lang.String CA,
           java.lang.String area,
           java.lang.String faultCategoryCode,
           java.lang.String subFaultCategoryName,
           java.lang.String remarks,
           java.lang.String CODE,
           java.lang.String poleNum) {
           this.key = key;
           this.callerName = callerName;
           this.phone = phone;
           this.add = add;
           this.email = email;
           this.CA = CA;
           this.area = area;
           this.faultCategoryCode = faultCategoryCode;
           this.subFaultCategoryName = subFaultCategoryName;
           this.remarks = remarks;
           this.CODE = CODE;
           this.poleNum = poleNum;
    }


    /**
     * Gets the key value for this ComplaintRegistrationWeb.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this ComplaintRegistrationWeb.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the callerName value for this ComplaintRegistrationWeb.
     * 
     * @return callerName
     */
    public java.lang.String getCallerName() {
        return callerName;
    }


    /**
     * Sets the callerName value for this ComplaintRegistrationWeb.
     * 
     * @param callerName
     */
    public void setCallerName(java.lang.String callerName) {
        this.callerName = callerName;
    }


    /**
     * Gets the phone value for this ComplaintRegistrationWeb.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this ComplaintRegistrationWeb.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the add value for this ComplaintRegistrationWeb.
     * 
     * @return add
     */
    public java.lang.String getAdd() {
        return add;
    }


    /**
     * Sets the add value for this ComplaintRegistrationWeb.
     * 
     * @param add
     */
    public void setAdd(java.lang.String add) {
        this.add = add;
    }


    /**
     * Gets the email value for this ComplaintRegistrationWeb.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ComplaintRegistrationWeb.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the CA value for this ComplaintRegistrationWeb.
     * 
     * @return CA
     */
    public java.lang.String getCA() {
        return CA;
    }


    /**
     * Sets the CA value for this ComplaintRegistrationWeb.
     * 
     * @param CA
     */
    public void setCA(java.lang.String CA) {
        this.CA = CA;
    }


    /**
     * Gets the area value for this ComplaintRegistrationWeb.
     * 
     * @return area
     */
    public java.lang.String getArea() {
        return area;
    }


    /**
     * Sets the area value for this ComplaintRegistrationWeb.
     * 
     * @param area
     */
    public void setArea(java.lang.String area) {
        this.area = area;
    }


    /**
     * Gets the faultCategoryCode value for this ComplaintRegistrationWeb.
     * 
     * @return faultCategoryCode
     */
    public java.lang.String getFaultCategoryCode() {
        return faultCategoryCode;
    }


    /**
     * Sets the faultCategoryCode value for this ComplaintRegistrationWeb.
     * 
     * @param faultCategoryCode
     */
    public void setFaultCategoryCode(java.lang.String faultCategoryCode) {
        this.faultCategoryCode = faultCategoryCode;
    }


    /**
     * Gets the subFaultCategoryName value for this ComplaintRegistrationWeb.
     * 
     * @return subFaultCategoryName
     */
    public java.lang.String getSubFaultCategoryName() {
        return subFaultCategoryName;
    }


    /**
     * Sets the subFaultCategoryName value for this ComplaintRegistrationWeb.
     * 
     * @param subFaultCategoryName
     */
    public void setSubFaultCategoryName(java.lang.String subFaultCategoryName) {
        this.subFaultCategoryName = subFaultCategoryName;
    }


    /**
     * Gets the remarks value for this ComplaintRegistrationWeb.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this ComplaintRegistrationWeb.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the CODE value for this ComplaintRegistrationWeb.
     * 
     * @return CODE
     */
    public java.lang.String getCODE() {
        return CODE;
    }


    /**
     * Sets the CODE value for this ComplaintRegistrationWeb.
     * 
     * @param CODE
     */
    public void setCODE(java.lang.String CODE) {
        this.CODE = CODE;
    }


    /**
     * Gets the poleNum value for this ComplaintRegistrationWeb.
     * 
     * @return poleNum
     */
    public java.lang.String getPoleNum() {
        return poleNum;
    }


    /**
     * Sets the poleNum value for this ComplaintRegistrationWeb.
     * 
     * @param poleNum
     */
    public void setPoleNum(java.lang.String poleNum) {
        this.poleNum = poleNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComplaintRegistrationWeb)) return false;
        ComplaintRegistrationWeb other = (ComplaintRegistrationWeb) obj;
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
            ((this.callerName==null && other.getCallerName()==null) || 
             (this.callerName!=null &&
              this.callerName.equals(other.getCallerName()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.add==null && other.getAdd()==null) || 
             (this.add!=null &&
              this.add.equals(other.getAdd()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.CA==null && other.getCA()==null) || 
             (this.CA!=null &&
              this.CA.equals(other.getCA()))) &&
            ((this.area==null && other.getArea()==null) || 
             (this.area!=null &&
              this.area.equals(other.getArea()))) &&
            ((this.faultCategoryCode==null && other.getFaultCategoryCode()==null) || 
             (this.faultCategoryCode!=null &&
              this.faultCategoryCode.equals(other.getFaultCategoryCode()))) &&
            ((this.subFaultCategoryName==null && other.getSubFaultCategoryName()==null) || 
             (this.subFaultCategoryName!=null &&
              this.subFaultCategoryName.equals(other.getSubFaultCategoryName()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.CODE==null && other.getCODE()==null) || 
             (this.CODE!=null &&
              this.CODE.equals(other.getCODE()))) &&
            ((this.poleNum==null && other.getPoleNum()==null) || 
             (this.poleNum!=null &&
              this.poleNum.equals(other.getPoleNum())));
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
        if (getCallerName() != null) {
            _hashCode += getCallerName().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getAdd() != null) {
            _hashCode += getAdd().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getCA() != null) {
            _hashCode += getCA().hashCode();
        }
        if (getArea() != null) {
            _hashCode += getArea().hashCode();
        }
        if (getFaultCategoryCode() != null) {
            _hashCode += getFaultCategoryCode().hashCode();
        }
        if (getSubFaultCategoryName() != null) {
            _hashCode += getSubFaultCategoryName().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getCODE() != null) {
            _hashCode += getCODE().hashCode();
        }
        if (getPoleNum() != null) {
            _hashCode += getPoleNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComplaintRegistrationWeb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintRegistrationWeb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CallerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Add"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("area");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Area"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultCategoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FaultCategoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subFaultCategoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SubFaultCategoryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poleNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "poleNum"));
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
