/**
 * Get_feederpillar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_feederpillar  implements java.io.Serializable {
    private java.lang.String ltfeederid;

    public Get_feederpillar() {
    }

    public Get_feederpillar(
           java.lang.String ltfeederid) {
           this.ltfeederid = ltfeederid;
    }


    /**
     * Gets the ltfeederid value for this Get_feederpillar.
     * 
     * @return ltfeederid
     */
    public java.lang.String getLtfeederid() {
        return ltfeederid;
    }


    /**
     * Sets the ltfeederid value for this Get_feederpillar.
     * 
     * @param ltfeederid
     */
    public void setLtfeederid(java.lang.String ltfeederid) {
        this.ltfeederid = ltfeederid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_feederpillar)) return false;
        Get_feederpillar other = (Get_feederpillar) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ltfeederid==null && other.getLtfeederid()==null) || 
             (this.ltfeederid!=null &&
              this.ltfeederid.equals(other.getLtfeederid())));
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
        if (getLtfeederid() != null) {
            _hashCode += getLtfeederid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_feederpillar.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">get_feederpillar"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ltfeederid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ltfeederid"));
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
