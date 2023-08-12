/**
 * ZBAPI_DUNNING_LOCK.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ZBAPI_DUNNING_LOCK  implements java.io.Serializable {
    private java.lang.String FDATE;

    private java.lang.String FLAG;

    private java.lang.String LOCKR;

    private java.lang.String LOTYP;

    private java.lang.String PROID;

    private java.lang.String TDATE;

    private java.lang.String VKONT;

    public ZBAPI_DUNNING_LOCK() {
    }

    public ZBAPI_DUNNING_LOCK(
           java.lang.String FDATE,
           java.lang.String FLAG,
           java.lang.String LOCKR,
           java.lang.String LOTYP,
           java.lang.String PROID,
           java.lang.String TDATE,
           java.lang.String VKONT) {
           this.FDATE = FDATE;
           this.FLAG = FLAG;
           this.LOCKR = LOCKR;
           this.LOTYP = LOTYP;
           this.PROID = PROID;
           this.TDATE = TDATE;
           this.VKONT = VKONT;
    }


    /**
     * Gets the FDATE value for this ZBAPI_DUNNING_LOCK.
     * 
     * @return FDATE
     */
    public java.lang.String getFDATE() {
        return FDATE;
    }


    /**
     * Sets the FDATE value for this ZBAPI_DUNNING_LOCK.
     * 
     * @param FDATE
     */
    public void setFDATE(java.lang.String FDATE) {
        this.FDATE = FDATE;
    }


    /**
     * Gets the FLAG value for this ZBAPI_DUNNING_LOCK.
     * 
     * @return FLAG
     */
    public java.lang.String getFLAG() {
        return FLAG;
    }


    /**
     * Sets the FLAG value for this ZBAPI_DUNNING_LOCK.
     * 
     * @param FLAG
     */
    public void setFLAG(java.lang.String FLAG) {
        this.FLAG = FLAG;
    }


    /**
     * Gets the LOCKR value for this ZBAPI_DUNNING_LOCK.
     * 
     * @return LOCKR
     */
    public java.lang.String getLOCKR() {
        return LOCKR;
    }


    /**
     * Sets the LOCKR value for this ZBAPI_DUNNING_LOCK.
     * 
     * @param LOCKR
     */
    public void setLOCKR(java.lang.String LOCKR) {
        this.LOCKR = LOCKR;
    }


    /**
     * Gets the LOTYP value for this ZBAPI_DUNNING_LOCK.
     * 
     * @return LOTYP
     */
    public java.lang.String getLOTYP() {
        return LOTYP;
    }


    /**
     * Sets the LOTYP value for this ZBAPI_DUNNING_LOCK.
     * 
     * @param LOTYP
     */
    public void setLOTYP(java.lang.String LOTYP) {
        this.LOTYP = LOTYP;
    }


    /**
     * Gets the PROID value for this ZBAPI_DUNNING_LOCK.
     * 
     * @return PROID
     */
    public java.lang.String getPROID() {
        return PROID;
    }


    /**
     * Sets the PROID value for this ZBAPI_DUNNING_LOCK.
     * 
     * @param PROID
     */
    public void setPROID(java.lang.String PROID) {
        this.PROID = PROID;
    }


    /**
     * Gets the TDATE value for this ZBAPI_DUNNING_LOCK.
     * 
     * @return TDATE
     */
    public java.lang.String getTDATE() {
        return TDATE;
    }


    /**
     * Sets the TDATE value for this ZBAPI_DUNNING_LOCK.
     * 
     * @param TDATE
     */
    public void setTDATE(java.lang.String TDATE) {
        this.TDATE = TDATE;
    }


    /**
     * Gets the VKONT value for this ZBAPI_DUNNING_LOCK.
     * 
     * @return VKONT
     */
    public java.lang.String getVKONT() {
        return VKONT;
    }


    /**
     * Sets the VKONT value for this ZBAPI_DUNNING_LOCK.
     * 
     * @param VKONT
     */
    public void setVKONT(java.lang.String VKONT) {
        this.VKONT = VKONT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_DUNNING_LOCK)) return false;
        ZBAPI_DUNNING_LOCK other = (ZBAPI_DUNNING_LOCK) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FDATE==null && other.getFDATE()==null) || 
             (this.FDATE!=null &&
              this.FDATE.equals(other.getFDATE()))) &&
            ((this.FLAG==null && other.getFLAG()==null) || 
             (this.FLAG!=null &&
              this.FLAG.equals(other.getFLAG()))) &&
            ((this.LOCKR==null && other.getLOCKR()==null) || 
             (this.LOCKR!=null &&
              this.LOCKR.equals(other.getLOCKR()))) &&
            ((this.LOTYP==null && other.getLOTYP()==null) || 
             (this.LOTYP!=null &&
              this.LOTYP.equals(other.getLOTYP()))) &&
            ((this.PROID==null && other.getPROID()==null) || 
             (this.PROID!=null &&
              this.PROID.equals(other.getPROID()))) &&
            ((this.TDATE==null && other.getTDATE()==null) || 
             (this.TDATE!=null &&
              this.TDATE.equals(other.getTDATE()))) &&
            ((this.VKONT==null && other.getVKONT()==null) || 
             (this.VKONT!=null &&
              this.VKONT.equals(other.getVKONT())));
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
        if (getFDATE() != null) {
            _hashCode += getFDATE().hashCode();
        }
        if (getFLAG() != null) {
            _hashCode += getFLAG().hashCode();
        }
        if (getLOCKR() != null) {
            _hashCode += getLOCKR().hashCode();
        }
        if (getLOTYP() != null) {
            _hashCode += getLOTYP().hashCode();
        }
        if (getPROID() != null) {
            _hashCode += getPROID().hashCode();
        }
        if (getTDATE() != null) {
            _hashCode += getTDATE().hashCode();
        }
        if (getVKONT() != null) {
            _hashCode += getVKONT().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_DUNNING_LOCK.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_DUNNING_LOCK"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLAG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FLAG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOCKR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LOCKR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOTYP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LOTYP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PROID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PROID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VKONT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VKONT"));
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
