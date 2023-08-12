/**
 * Updatebreakdown.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Updatebreakdown  implements java.io.Serializable {
    private java.lang.String key;

    private java.lang.String BD_ID;

    private int newhour;

    private int newminutes;

    public Updatebreakdown() {
    }

    public Updatebreakdown(
           java.lang.String key,
           java.lang.String BD_ID,
           int newhour,
           int newminutes) {
           this.key = key;
           this.BD_ID = BD_ID;
           this.newhour = newhour;
           this.newminutes = newminutes;
    }


    /**
     * Gets the key value for this Updatebreakdown.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this Updatebreakdown.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the BD_ID value for this Updatebreakdown.
     * 
     * @return BD_ID
     */
    public java.lang.String getBD_ID() {
        return BD_ID;
    }


    /**
     * Sets the BD_ID value for this Updatebreakdown.
     * 
     * @param BD_ID
     */
    public void setBD_ID(java.lang.String BD_ID) {
        this.BD_ID = BD_ID;
    }


    /**
     * Gets the newhour value for this Updatebreakdown.
     * 
     * @return newhour
     */
    public int getNewhour() {
        return newhour;
    }


    /**
     * Sets the newhour value for this Updatebreakdown.
     * 
     * @param newhour
     */
    public void setNewhour(int newhour) {
        this.newhour = newhour;
    }


    /**
     * Gets the newminutes value for this Updatebreakdown.
     * 
     * @return newminutes
     */
    public int getNewminutes() {
        return newminutes;
    }


    /**
     * Sets the newminutes value for this Updatebreakdown.
     * 
     * @param newminutes
     */
    public void setNewminutes(int newminutes) {
        this.newminutes = newminutes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Updatebreakdown)) return false;
        Updatebreakdown other = (Updatebreakdown) obj;
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
            this.newhour == other.getNewhour() &&
            this.newminutes == other.getNewminutes();
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
        _hashCode += getNewhour();
        _hashCode += getNewminutes();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Updatebreakdown.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">updatebreakdown"));
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
        elemField.setFieldName("newhour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "newhour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newminutes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "newminutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
