/**
 * ZBAPI_SMARTMTR_TBL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_SMARTMTR_TBL  implements java.io.Serializable {
    private java.lang.String COMPCODE;

    private java.util.Calendar rundate;

    private java.lang.String newcon;

    private java.lang.String masterdata;

    public ZBAPI_SMARTMTR_TBL() {
    }

    public ZBAPI_SMARTMTR_TBL(
           java.lang.String COMPCODE,
           java.util.Calendar rundate,
           java.lang.String newcon,
           java.lang.String masterdata) {
           this.COMPCODE = COMPCODE;
           this.rundate = rundate;
           this.newcon = newcon;
           this.masterdata = masterdata;
    }


    /**
     * Gets the COMPCODE value for this ZBAPI_SMARTMTR_TBL.
     * 
     * @return COMPCODE
     */
    public java.lang.String getCOMPCODE() {
        return COMPCODE;
    }


    /**
     * Sets the COMPCODE value for this ZBAPI_SMARTMTR_TBL.
     * 
     * @param COMPCODE
     */
    public void setCOMPCODE(java.lang.String COMPCODE) {
        this.COMPCODE = COMPCODE;
    }


    /**
     * Gets the rundate value for this ZBAPI_SMARTMTR_TBL.
     * 
     * @return rundate
     */
    public java.util.Calendar getRundate() {
        return rundate;
    }


    /**
     * Sets the rundate value for this ZBAPI_SMARTMTR_TBL.
     * 
     * @param rundate
     */
    public void setRundate(java.util.Calendar rundate) {
        this.rundate = rundate;
    }


    /**
     * Gets the newcon value for this ZBAPI_SMARTMTR_TBL.
     * 
     * @return newcon
     */
    public java.lang.String getNewcon() {
        return newcon;
    }


    /**
     * Sets the newcon value for this ZBAPI_SMARTMTR_TBL.
     * 
     * @param newcon
     */
    public void setNewcon(java.lang.String newcon) {
        this.newcon = newcon;
    }


    /**
     * Gets the masterdata value for this ZBAPI_SMARTMTR_TBL.
     * 
     * @return masterdata
     */
    public java.lang.String getMasterdata() {
        return masterdata;
    }


    /**
     * Sets the masterdata value for this ZBAPI_SMARTMTR_TBL.
     * 
     * @param masterdata
     */
    public void setMasterdata(java.lang.String masterdata) {
        this.masterdata = masterdata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_SMARTMTR_TBL)) return false;
        ZBAPI_SMARTMTR_TBL other = (ZBAPI_SMARTMTR_TBL) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.COMPCODE==null && other.getCOMPCODE()==null) || 
             (this.COMPCODE!=null &&
              this.COMPCODE.equals(other.getCOMPCODE()))) &&
            ((this.rundate==null && other.getRundate()==null) || 
             (this.rundate!=null &&
              this.rundate.equals(other.getRundate()))) &&
            ((this.newcon==null && other.getNewcon()==null) || 
             (this.newcon!=null &&
              this.newcon.equals(other.getNewcon()))) &&
            ((this.masterdata==null && other.getMasterdata()==null) || 
             (this.masterdata!=null &&
              this.masterdata.equals(other.getMasterdata())));
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
        if (getCOMPCODE() != null) {
            _hashCode += getCOMPCODE().hashCode();
        }
        if (getRundate() != null) {
            _hashCode += getRundate().hashCode();
        }
        if (getNewcon() != null) {
            _hashCode += getNewcon().hashCode();
        }
        if (getMasterdata() != null) {
            _hashCode += getMasterdata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_SMARTMTR_TBL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_SMARTMTR_TBL"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMPCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "COMPCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rundate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "rundate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newcon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "newcon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterdata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "masterdata"));
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
