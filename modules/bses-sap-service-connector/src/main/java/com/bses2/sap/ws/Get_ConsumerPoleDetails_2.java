/**
 * Get_ConsumerPoleDetails_2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_ConsumerPoleDetails_2  implements java.io.Serializable {
    private java.lang.String gridid;

    private java.lang.String feederid;

    private java.lang.String sapfunctio;

    private java.lang.String dtcode;

    private java.lang.String ltfeeder;

    public Get_ConsumerPoleDetails_2() {
    }

    public Get_ConsumerPoleDetails_2(
           java.lang.String gridid,
           java.lang.String feederid,
           java.lang.String sapfunctio,
           java.lang.String dtcode,
           java.lang.String ltfeeder) {
           this.gridid = gridid;
           this.feederid = feederid;
           this.sapfunctio = sapfunctio;
           this.dtcode = dtcode;
           this.ltfeeder = ltfeeder;
    }


    /**
     * Gets the gridid value for this Get_ConsumerPoleDetails_2.
     * 
     * @return gridid
     */
    public java.lang.String getGridid() {
        return gridid;
    }


    /**
     * Sets the gridid value for this Get_ConsumerPoleDetails_2.
     * 
     * @param gridid
     */
    public void setGridid(java.lang.String gridid) {
        this.gridid = gridid;
    }


    /**
     * Gets the feederid value for this Get_ConsumerPoleDetails_2.
     * 
     * @return feederid
     */
    public java.lang.String getFeederid() {
        return feederid;
    }


    /**
     * Sets the feederid value for this Get_ConsumerPoleDetails_2.
     * 
     * @param feederid
     */
    public void setFeederid(java.lang.String feederid) {
        this.feederid = feederid;
    }


    /**
     * Gets the sapfunctio value for this Get_ConsumerPoleDetails_2.
     * 
     * @return sapfunctio
     */
    public java.lang.String getSapfunctio() {
        return sapfunctio;
    }


    /**
     * Sets the sapfunctio value for this Get_ConsumerPoleDetails_2.
     * 
     * @param sapfunctio
     */
    public void setSapfunctio(java.lang.String sapfunctio) {
        this.sapfunctio = sapfunctio;
    }


    /**
     * Gets the dtcode value for this Get_ConsumerPoleDetails_2.
     * 
     * @return dtcode
     */
    public java.lang.String getDtcode() {
        return dtcode;
    }


    /**
     * Sets the dtcode value for this Get_ConsumerPoleDetails_2.
     * 
     * @param dtcode
     */
    public void setDtcode(java.lang.String dtcode) {
        this.dtcode = dtcode;
    }


    /**
     * Gets the ltfeeder value for this Get_ConsumerPoleDetails_2.
     * 
     * @return ltfeeder
     */
    public java.lang.String getLtfeeder() {
        return ltfeeder;
    }


    /**
     * Sets the ltfeeder value for this Get_ConsumerPoleDetails_2.
     * 
     * @param ltfeeder
     */
    public void setLtfeeder(java.lang.String ltfeeder) {
        this.ltfeeder = ltfeeder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_ConsumerPoleDetails_2)) return false;
        Get_ConsumerPoleDetails_2 other = (Get_ConsumerPoleDetails_2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gridid==null && other.getGridid()==null) || 
             (this.gridid!=null &&
              this.gridid.equals(other.getGridid()))) &&
            ((this.feederid==null && other.getFeederid()==null) || 
             (this.feederid!=null &&
              this.feederid.equals(other.getFeederid()))) &&
            ((this.sapfunctio==null && other.getSapfunctio()==null) || 
             (this.sapfunctio!=null &&
              this.sapfunctio.equals(other.getSapfunctio()))) &&
            ((this.dtcode==null && other.getDtcode()==null) || 
             (this.dtcode!=null &&
              this.dtcode.equals(other.getDtcode()))) &&
            ((this.ltfeeder==null && other.getLtfeeder()==null) || 
             (this.ltfeeder!=null &&
              this.ltfeeder.equals(other.getLtfeeder())));
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
        if (getGridid() != null) {
            _hashCode += getGridid().hashCode();
        }
        if (getFeederid() != null) {
            _hashCode += getFeederid().hashCode();
        }
        if (getSapfunctio() != null) {
            _hashCode += getSapfunctio().hashCode();
        }
        if (getDtcode() != null) {
            _hashCode += getDtcode().hashCode();
        }
        if (getLtfeeder() != null) {
            _hashCode += getLtfeeder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_ConsumerPoleDetails_2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ConsumerPoleDetails_2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gridid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gridid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feederid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sapfunctio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sapfunctio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dtcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ltfeeder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ltfeeder"));
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
