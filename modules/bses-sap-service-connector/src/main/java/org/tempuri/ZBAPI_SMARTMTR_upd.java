/**
 * ZBAPI_SMARTMTR_upd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_SMARTMTR_upd  implements java.io.Serializable {
    private java.lang.String COMPCODE;

    private java.util.Calendar rundate;

    private java.lang.String flag;

    private java.lang.String contract;

    private java.lang.String meterno;

    public ZBAPI_SMARTMTR_upd() {
    }

    public ZBAPI_SMARTMTR_upd(
           java.lang.String COMPCODE,
           java.util.Calendar rundate,
           java.lang.String flag,
           java.lang.String contract,
           java.lang.String meterno) {
           this.COMPCODE = COMPCODE;
           this.rundate = rundate;
           this.flag = flag;
           this.contract = contract;
           this.meterno = meterno;
    }


    /**
     * Gets the COMPCODE value for this ZBAPI_SMARTMTR_upd.
     * 
     * @return COMPCODE
     */
    public java.lang.String getCOMPCODE() {
        return COMPCODE;
    }


    /**
     * Sets the COMPCODE value for this ZBAPI_SMARTMTR_upd.
     * 
     * @param COMPCODE
     */
    public void setCOMPCODE(java.lang.String COMPCODE) {
        this.COMPCODE = COMPCODE;
    }


    /**
     * Gets the rundate value for this ZBAPI_SMARTMTR_upd.
     * 
     * @return rundate
     */
    public java.util.Calendar getRundate() {
        return rundate;
    }


    /**
     * Sets the rundate value for this ZBAPI_SMARTMTR_upd.
     * 
     * @param rundate
     */
    public void setRundate(java.util.Calendar rundate) {
        this.rundate = rundate;
    }


    /**
     * Gets the flag value for this ZBAPI_SMARTMTR_upd.
     * 
     * @return flag
     */
    public java.lang.String getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this ZBAPI_SMARTMTR_upd.
     * 
     * @param flag
     */
    public void setFlag(java.lang.String flag) {
        this.flag = flag;
    }


    /**
     * Gets the contract value for this ZBAPI_SMARTMTR_upd.
     * 
     * @return contract
     */
    public java.lang.String getContract() {
        return contract;
    }


    /**
     * Sets the contract value for this ZBAPI_SMARTMTR_upd.
     * 
     * @param contract
     */
    public void setContract(java.lang.String contract) {
        this.contract = contract;
    }


    /**
     * Gets the meterno value for this ZBAPI_SMARTMTR_upd.
     * 
     * @return meterno
     */
    public java.lang.String getMeterno() {
        return meterno;
    }


    /**
     * Sets the meterno value for this ZBAPI_SMARTMTR_upd.
     * 
     * @param meterno
     */
    public void setMeterno(java.lang.String meterno) {
        this.meterno = meterno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_SMARTMTR_upd)) return false;
        ZBAPI_SMARTMTR_upd other = (ZBAPI_SMARTMTR_upd) obj;
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
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.contract==null && other.getContract()==null) || 
             (this.contract!=null &&
              this.contract.equals(other.getContract()))) &&
            ((this.meterno==null && other.getMeterno()==null) || 
             (this.meterno!=null &&
              this.meterno.equals(other.getMeterno())));
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
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getContract() != null) {
            _hashCode += getContract().hashCode();
        }
        if (getMeterno() != null) {
            _hashCode += getMeterno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_SMARTMTR_upd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_SMARTMTR_upd"));
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
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "contract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "meterno"));
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
