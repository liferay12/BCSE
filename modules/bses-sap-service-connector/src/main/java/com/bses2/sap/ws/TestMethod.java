/**
 * TestMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class TestMethod  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String _switch;

    private java.lang.String complaintNo;

    private java.lang.String CA;

    private java.lang.String faultCategory;

    private java.lang.String faultType;

    private java.lang.String closingRemark;

    private java.lang.String otherRemarks;

    private java.lang.String IMEI;

    private java.lang.String latitude;

    private java.lang.String longitude;

    public TestMethod() {
    }

    public TestMethod(
           java.lang.String key,
           java.lang.String _switch,
           java.lang.String complaintNo,
           java.lang.String CA,
           java.lang.String faultCategory,
           java.lang.String faultType,
           java.lang.String closingRemark,
           java.lang.String otherRemarks,
           java.lang.String IMEI,
           java.lang.String latitude,
           java.lang.String longitude) {
           this.key = key;
           this._switch = _switch;
           this.complaintNo = complaintNo;
           this.CA = CA;
           this.faultCategory = faultCategory;
           this.faultType = faultType;
           this.closingRemark = closingRemark;
           this.otherRemarks = otherRemarks;
           this.IMEI = IMEI;
           this.latitude = latitude;
           this.longitude = longitude;
    }


    /**
     * Gets the key value for this TestMethod.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this TestMethod.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the _switch value for this TestMethod.
     * 
     * @return _switch
     */
    public java.lang.String get_switch() {
        return _switch;
    }


    /**
     * Sets the _switch value for this TestMethod.
     * 
     * @param _switch
     */
    public void set_switch(java.lang.String _switch) {
        this._switch = _switch;
    }


    /**
     * Gets the complaintNo value for this TestMethod.
     * 
     * @return complaintNo
     */
    public java.lang.String getComplaintNo() {
        return complaintNo;
    }


    /**
     * Sets the complaintNo value for this TestMethod.
     * 
     * @param complaintNo
     */
    public void setComplaintNo(java.lang.String complaintNo) {
        this.complaintNo = complaintNo;
    }


    /**
     * Gets the CA value for this TestMethod.
     * 
     * @return CA
     */
    public java.lang.String getCA() {
        return CA;
    }


    /**
     * Sets the CA value for this TestMethod.
     * 
     * @param CA
     */
    public void setCA(java.lang.String CA) {
        this.CA = CA;
    }


    /**
     * Gets the faultCategory value for this TestMethod.
     * 
     * @return faultCategory
     */
    public java.lang.String getFaultCategory() {
        return faultCategory;
    }


    /**
     * Sets the faultCategory value for this TestMethod.
     * 
     * @param faultCategory
     */
    public void setFaultCategory(java.lang.String faultCategory) {
        this.faultCategory = faultCategory;
    }


    /**
     * Gets the faultType value for this TestMethod.
     * 
     * @return faultType
     */
    public java.lang.String getFaultType() {
        return faultType;
    }


    /**
     * Sets the faultType value for this TestMethod.
     * 
     * @param faultType
     */
    public void setFaultType(java.lang.String faultType) {
        this.faultType = faultType;
    }


    /**
     * Gets the closingRemark value for this TestMethod.
     * 
     * @return closingRemark
     */
    public java.lang.String getClosingRemark() {
        return closingRemark;
    }


    /**
     * Sets the closingRemark value for this TestMethod.
     * 
     * @param closingRemark
     */
    public void setClosingRemark(java.lang.String closingRemark) {
        this.closingRemark = closingRemark;
    }


    /**
     * Gets the otherRemarks value for this TestMethod.
     * 
     * @return otherRemarks
     */
    public java.lang.String getOtherRemarks() {
        return otherRemarks;
    }


    /**
     * Sets the otherRemarks value for this TestMethod.
     * 
     * @param otherRemarks
     */
    public void setOtherRemarks(java.lang.String otherRemarks) {
        this.otherRemarks = otherRemarks;
    }


    /**
     * Gets the IMEI value for this TestMethod.
     * 
     * @return IMEI
     */
    public java.lang.String getIMEI() {
        return IMEI;
    }


    /**
     * Sets the IMEI value for this TestMethod.
     * 
     * @param IMEI
     */
    public void setIMEI(java.lang.String IMEI) {
        this.IMEI = IMEI;
    }


    /**
     * Gets the latitude value for this TestMethod.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this TestMethod.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this TestMethod.
     * 
     * @return longitude
     */
    public java.lang.String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this TestMethod.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TestMethod)) return false;
        TestMethod other = (TestMethod) obj;
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
            ((this._switch==null && other.get_switch()==null) || 
             (this._switch!=null &&
              this._switch.equals(other.get_switch()))) &&
            ((this.complaintNo==null && other.getComplaintNo()==null) || 
             (this.complaintNo!=null &&
              this.complaintNo.equals(other.getComplaintNo()))) &&
            ((this.CA==null && other.getCA()==null) || 
             (this.CA!=null &&
              this.CA.equals(other.getCA()))) &&
            ((this.faultCategory==null && other.getFaultCategory()==null) || 
             (this.faultCategory!=null &&
              this.faultCategory.equals(other.getFaultCategory()))) &&
            ((this.faultType==null && other.getFaultType()==null) || 
             (this.faultType!=null &&
              this.faultType.equals(other.getFaultType()))) &&
            ((this.closingRemark==null && other.getClosingRemark()==null) || 
             (this.closingRemark!=null &&
              this.closingRemark.equals(other.getClosingRemark()))) &&
            ((this.otherRemarks==null && other.getOtherRemarks()==null) || 
             (this.otherRemarks!=null &&
              this.otherRemarks.equals(other.getOtherRemarks()))) &&
            ((this.IMEI==null && other.getIMEI()==null) || 
             (this.IMEI!=null &&
              this.IMEI.equals(other.getIMEI()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude())));
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
        if (get_switch() != null) {
            _hashCode += get_switch().hashCode();
        }
        if (getComplaintNo() != null) {
            _hashCode += getComplaintNo().hashCode();
        }
        if (getCA() != null) {
            _hashCode += getCA().hashCode();
        }
        if (getFaultCategory() != null) {
            _hashCode += getFaultCategory().hashCode();
        }
        if (getFaultType() != null) {
            _hashCode += getFaultType().hashCode();
        }
        if (getClosingRemark() != null) {
            _hashCode += getClosingRemark().hashCode();
        }
        if (getOtherRemarks() != null) {
            _hashCode += getOtherRemarks().hashCode();
        }
        if (getIMEI() != null) {
            _hashCode += getIMEI().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TestMethod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">TestMethod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_switch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Switch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complaintNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintNo"));
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
        elemField.setFieldName("faultCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FaultCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FaultType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closingRemark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ClosingRemark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRemarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OtherRemarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IMEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Longitude"));
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
