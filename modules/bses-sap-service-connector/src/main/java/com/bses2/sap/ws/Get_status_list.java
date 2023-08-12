/**
 * Get_status_list.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_status_list  implements java.io.Serializable {
    private java.lang.String gridid;

    private java.lang.String feederid;

    private java.lang.String[] subsid;

    private java.lang.String[] dtid;

    private java.lang.String[] ltfdrid;

    public Get_status_list() {
    }

    public Get_status_list(
           java.lang.String gridid,
           java.lang.String feederid,
           java.lang.String[] subsid,
           java.lang.String[] dtid,
           java.lang.String[] ltfdrid) {
           this.gridid = gridid;
           this.feederid = feederid;
           this.subsid = subsid;
           this.dtid = dtid;
           this.ltfdrid = ltfdrid;
    }


    /**
     * Gets the gridid value for this Get_status_list.
     * 
     * @return gridid
     */
    public java.lang.String getGridid() {
        return gridid;
    }


    /**
     * Sets the gridid value for this Get_status_list.
     * 
     * @param gridid
     */
    public void setGridid(java.lang.String gridid) {
        this.gridid = gridid;
    }


    /**
     * Gets the feederid value for this Get_status_list.
     * 
     * @return feederid
     */
    public java.lang.String getFeederid() {
        return feederid;
    }


    /**
     * Sets the feederid value for this Get_status_list.
     * 
     * @param feederid
     */
    public void setFeederid(java.lang.String feederid) {
        this.feederid = feederid;
    }


    /**
     * Gets the subsid value for this Get_status_list.
     * 
     * @return subsid
     */
    public java.lang.String[] getSubsid() {
        return subsid;
    }


    /**
     * Sets the subsid value for this Get_status_list.
     * 
     * @param subsid
     */
    public void setSubsid(java.lang.String[] subsid) {
        this.subsid = subsid;
    }


    /**
     * Gets the dtid value for this Get_status_list.
     * 
     * @return dtid
     */
    public java.lang.String[] getDtid() {
        return dtid;
    }


    /**
     * Sets the dtid value for this Get_status_list.
     * 
     * @param dtid
     */
    public void setDtid(java.lang.String[] dtid) {
        this.dtid = dtid;
    }


    /**
     * Gets the ltfdrid value for this Get_status_list.
     * 
     * @return ltfdrid
     */
    public java.lang.String[] getLtfdrid() {
        return ltfdrid;
    }


    /**
     * Sets the ltfdrid value for this Get_status_list.
     * 
     * @param ltfdrid
     */
    public void setLtfdrid(java.lang.String[] ltfdrid) {
        this.ltfdrid = ltfdrid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_status_list)) return false;
        Get_status_list other = (Get_status_list) obj;
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
            ((this.subsid==null && other.getSubsid()==null) || 
             (this.subsid!=null &&
              java.util.Arrays.equals(this.subsid, other.getSubsid()))) &&
            ((this.dtid==null && other.getDtid()==null) || 
             (this.dtid!=null &&
              java.util.Arrays.equals(this.dtid, other.getDtid()))) &&
            ((this.ltfdrid==null && other.getLtfdrid()==null) || 
             (this.ltfdrid!=null &&
              java.util.Arrays.equals(this.ltfdrid, other.getLtfdrid())));
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
        if (getSubsid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDtid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDtid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDtid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLtfdrid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLtfdrid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLtfdrid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_status_list.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_status_list"));
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
        elemField.setFieldName("subsid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "subsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dtid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ltfdrid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ltfdrid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
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
