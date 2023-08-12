/**
 * Updatebreakdownbackfeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Updatebreakdownbackfeed  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String BD_ID;

    private java.lang.String restoreddate;

    private java.lang.String restoredload;

    private java.lang.String restoresource;

    private java.lang.String restoretype;

    private java.lang.String remarks;

    private java.lang.String selectedsource;

    public Updatebreakdownbackfeed() {
    }

    public Updatebreakdownbackfeed(
           java.lang.String key,
           java.lang.String BD_ID,
           java.lang.String restoreddate,
           java.lang.String restoredload,
           java.lang.String restoresource,
           java.lang.String restoretype,
           java.lang.String remarks,
           java.lang.String selectedsource) {
           this.key = key;
           this.BD_ID = BD_ID;
           this.restoreddate = restoreddate;
           this.restoredload = restoredload;
           this.restoresource = restoresource;
           this.restoretype = restoretype;
           this.remarks = remarks;
           this.selectedsource = selectedsource;
    }


    /**
     * Gets the key value for this Updatebreakdownbackfeed.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this Updatebreakdownbackfeed.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the BD_ID value for this Updatebreakdownbackfeed.
     * 
     * @return BD_ID
     */
    public java.lang.String getBD_ID() {
        return BD_ID;
    }


    /**
     * Sets the BD_ID value for this Updatebreakdownbackfeed.
     * 
     * @param BD_ID
     */
    public void setBD_ID(java.lang.String BD_ID) {
        this.BD_ID = BD_ID;
    }


    /**
     * Gets the restoreddate value for this Updatebreakdownbackfeed.
     * 
     * @return restoreddate
     */
    public java.lang.String getRestoreddate() {
        return restoreddate;
    }


    /**
     * Sets the restoreddate value for this Updatebreakdownbackfeed.
     * 
     * @param restoreddate
     */
    public void setRestoreddate(java.lang.String restoreddate) {
        this.restoreddate = restoreddate;
    }


    /**
     * Gets the restoredload value for this Updatebreakdownbackfeed.
     * 
     * @return restoredload
     */
    public java.lang.String getRestoredload() {
        return restoredload;
    }


    /**
     * Sets the restoredload value for this Updatebreakdownbackfeed.
     * 
     * @param restoredload
     */
    public void setRestoredload(java.lang.String restoredload) {
        this.restoredload = restoredload;
    }


    /**
     * Gets the restoresource value for this Updatebreakdownbackfeed.
     * 
     * @return restoresource
     */
    public java.lang.String getRestoresource() {
        return restoresource;
    }


    /**
     * Sets the restoresource value for this Updatebreakdownbackfeed.
     * 
     * @param restoresource
     */
    public void setRestoresource(java.lang.String restoresource) {
        this.restoresource = restoresource;
    }


    /**
     * Gets the restoretype value for this Updatebreakdownbackfeed.
     * 
     * @return restoretype
     */
    public java.lang.String getRestoretype() {
        return restoretype;
    }


    /**
     * Sets the restoretype value for this Updatebreakdownbackfeed.
     * 
     * @param restoretype
     */
    public void setRestoretype(java.lang.String restoretype) {
        this.restoretype = restoretype;
    }


    /**
     * Gets the remarks value for this Updatebreakdownbackfeed.
     * 
     * @return remarks
     */
    public java.lang.String getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this Updatebreakdownbackfeed.
     * 
     * @param remarks
     */
    public void setRemarks(java.lang.String remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the selectedsource value for this Updatebreakdownbackfeed.
     * 
     * @return selectedsource
     */
    public java.lang.String getSelectedsource() {
        return selectedsource;
    }


    /**
     * Sets the selectedsource value for this Updatebreakdownbackfeed.
     * 
     * @param selectedsource
     */
    public void setSelectedsource(java.lang.String selectedsource) {
        this.selectedsource = selectedsource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Updatebreakdownbackfeed)) return false;
        Updatebreakdownbackfeed other = (Updatebreakdownbackfeed) obj;
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
            ((this.BD_ID==null && other.getBD_ID()==null) || 
             (this.BD_ID!=null &&
              this.BD_ID.equals(other.getBD_ID()))) &&
            ((this.restoreddate==null && other.getRestoreddate()==null) || 
             (this.restoreddate!=null &&
              this.restoreddate.equals(other.getRestoreddate()))) &&
            ((this.restoredload==null && other.getRestoredload()==null) || 
             (this.restoredload!=null &&
              this.restoredload.equals(other.getRestoredload()))) &&
            ((this.restoresource==null && other.getRestoresource()==null) || 
             (this.restoresource!=null &&
              this.restoresource.equals(other.getRestoresource()))) &&
            ((this.restoretype==null && other.getRestoretype()==null) || 
             (this.restoretype!=null &&
              this.restoretype.equals(other.getRestoretype()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              this.remarks.equals(other.getRemarks()))) &&
            ((this.selectedsource==null && other.getSelectedsource()==null) || 
             (this.selectedsource!=null &&
              this.selectedsource.equals(other.getSelectedsource())));
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
        if (getBD_ID() != null) {
            _hashCode += getBD_ID().hashCode();
        }
        if (getRestoreddate() != null) {
            _hashCode += getRestoreddate().hashCode();
        }
        if (getRestoredload() != null) {
            _hashCode += getRestoredload().hashCode();
        }
        if (getRestoresource() != null) {
            _hashCode += getRestoresource().hashCode();
        }
        if (getRestoretype() != null) {
            _hashCode += getRestoretype().hashCode();
        }
        if (getRemarks() != null) {
            _hashCode += getRemarks().hashCode();
        }
        if (getSelectedsource() != null) {
            _hashCode += getSelectedsource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Updatebreakdownbackfeed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">updatebreakdownbackfeed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BD_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BD_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restoreddate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "restoreddate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restoredload");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "restoredload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restoresource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "restoresource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restoretype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "restoretype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedsource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "selectedsource"));
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
