/**
 * UpdateComplaintResolutiontime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class UpdateComplaintResolutiontime  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String complaintNo;

    private java.lang.String imeino;

    private java.lang.String faultType;

    private java.lang.String latitude;

    private java.lang.String longitude;

    private java.lang.String remarks;

    private java.lang.String resolutionStatus;

    private java.lang.String resolution_Time;

    private java.lang.String area_Power_Restored;

    private java.lang.String restoration_Time;

    public UpdateComplaintResolutiontime() {
    }

    public UpdateComplaintResolutiontime(
           java.lang.String key,
           java.lang.String complaintNo,
           java.lang.String imeino,
           java.lang.String faultType,
           java.lang.String latitude,
           java.lang.String longitude,
           java.lang.String remarks,
           java.lang.String resolutionStatus,
           java.lang.String resolution_Time,
           java.lang.String area_Power_Restored,
           java.lang.String restoration_Time) {
           this.key = key;
           this.complaintNo = complaintNo;
           this.imeino = imeino;
           this.faultType = faultType;
           this.latitude = latitude;
           this.longitude = longitude;
           this.remarks = remarks;
           this.resolutionStatus = resolutionStatus;
           this.resolution_Time = resolution_Time;
           this.area_Power_Restored = area_Power_Restored;
           this.restoration_Time = restoration_Time;
    }


    /**
     * Gets the key value for this UpdateComplaintResolutiontime.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this UpdateComplaintResolutiontime.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the complaintNo value for this UpdateComplaintResolutiontime.
     * 
     * @return complaintNo
     */
    public java.lang.String getComplaintNo() {
        return complaintNo;
    }


    /**
     * Sets the complaintNo value for this UpdateComplaintResolutiontime.
     * 
     * @param complaintNo
     */
    public void setComplaintNo(java.lang.String complaintNo) {
        this.complaintNo = complaintNo;
    }


    /**
     * Gets the imeino value for this UpdateComplaintResolutiontime.
     * 
     * @return imeino
     */
    public java.lang.String getImeino() {
        return imeino;
    }


    /**
     * Sets the imeino value for this UpdateComplaintResolutiontime.
     * 
     * @param imeino
     */
    public void setImeino(java.lang.String imeino) {
        this.imeino = imeino;
    }


    /**
     * Gets the faultType value for this UpdateComplaintResolutiontime.
     * 
     * @return faultType
     */
    public java.lang.String getFaultType() {
        return faultType;
    }


    /**
     * Sets the faultType value for this UpdateComplaintResolutiontime.
     * 
     * @param faultType
     */
    public void setFaultType(java.lang.String faultType) {
        this.faultType = faultType;
    }


    /**
     * Gets the latitude value for this UpdateComplaintResolutiontime.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this UpdateComplaintResolutiontime.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the longitude value for this UpdateComplaintResolutiontime.
     * 
     * @return longitude
     */
    public java.lang.String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this UpdateComplaintResolutiontime.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the remarks value for this UpdateComplaintResolutiontime.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this UpdateComplaintResolutiontime.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the resolutionStatus value for this UpdateComplaintResolutiontime.
     * 
     * @return resolutionStatus
     */
    public java.lang.String getResolutionStatus() {
        return resolutionStatus;
    }


    /**
     * Sets the resolutionStatus value for this UpdateComplaintResolutiontime.
     * 
     * @param resolutionStatus
     */
    public void setResolutionStatus(java.lang.String resolutionStatus) {
        this.resolutionStatus = resolutionStatus;
    }


    /**
     * Gets the resolution_Time value for this UpdateComplaintResolutiontime.
     * 
     * @return resolution_Time
     */
    public java.lang.String getResolution_Time() {
        return resolution_Time;
    }


    /**
     * Sets the resolution_Time value for this UpdateComplaintResolutiontime.
     * 
     * @param resolution_Time
     */
    public void setResolution_Time(java.lang.String resolution_Time) {
        this.resolution_Time = resolution_Time;
    }


    /**
     * Gets the area_Power_Restored value for this UpdateComplaintResolutiontime.
     * 
     * @return area_Power_Restored
     */
    public java.lang.String getArea_Power_Restored() {
        return area_Power_Restored;
    }


    /**
     * Sets the area_Power_Restored value for this UpdateComplaintResolutiontime.
     * 
     * @param area_Power_Restored
     */
    public void setArea_Power_Restored(java.lang.String area_Power_Restored) {
        this.area_Power_Restored = area_Power_Restored;
    }


    /**
     * Gets the restoration_Time value for this UpdateComplaintResolutiontime.
     * 
     * @return restoration_Time
     */
    public java.lang.String getRestoration_Time() {
        return restoration_Time;
    }


    /**
     * Sets the restoration_Time value for this UpdateComplaintResolutiontime.
     * 
     * @param restoration_Time
     */
    public void setRestoration_Time(java.lang.String restoration_Time) {
        this.restoration_Time = restoration_Time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateComplaintResolutiontime)) return false;
        UpdateComplaintResolutiontime other = (UpdateComplaintResolutiontime) obj;
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
            ((this.complaintNo==null && other.getComplaintNo()==null) || 
             (this.complaintNo!=null &&
              this.complaintNo.equals(other.getComplaintNo()))) &&
            ((this.imeino==null && other.getImeino()==null) || 
             (this.imeino!=null &&
              this.imeino.equals(other.getImeino()))) &&
            ((this.faultType==null && other.getFaultType()==null) || 
             (this.faultType!=null &&
              this.faultType.equals(other.getFaultType()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.resolutionStatus==null && other.getResolutionStatus()==null) || 
             (this.resolutionStatus!=null &&
              this.resolutionStatus.equals(other.getResolutionStatus()))) &&
            ((this.resolution_Time==null && other.getResolution_Time()==null) || 
             (this.resolution_Time!=null &&
              this.resolution_Time.equals(other.getResolution_Time()))) &&
            ((this.area_Power_Restored==null && other.getArea_Power_Restored()==null) || 
             (this.area_Power_Restored!=null &&
              this.area_Power_Restored.equals(other.getArea_Power_Restored()))) &&
            ((this.restoration_Time==null && other.getRestoration_Time()==null) || 
             (this.restoration_Time!=null &&
              this.restoration_Time.equals(other.getRestoration_Time())));
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
        if (getComplaintNo() != null) {
            _hashCode += getComplaintNo().hashCode();
        }
        if (getImeino() != null) {
            _hashCode += getImeino().hashCode();
        }
        if (getFaultType() != null) {
            _hashCode += getFaultType().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getResolutionStatus() != null) {
            _hashCode += getResolutionStatus().hashCode();
        }
        if (getResolution_Time() != null) {
            _hashCode += getResolution_Time().hashCode();
        }
        if (getArea_Power_Restored() != null) {
            _hashCode += getArea_Power_Restored().hashCode();
        }
        if (getRestoration_Time() != null) {
            _hashCode += getRestoration_Time().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintResolutiontime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateComplaintResolutiontime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "key"));
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
        elemField.setFieldName("imeino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Imeino"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolutionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResolutionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution_Time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Resolution_Time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("area_Power_Restored");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Area_Power_Restored"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restoration_Time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Restoration_Time"));
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
