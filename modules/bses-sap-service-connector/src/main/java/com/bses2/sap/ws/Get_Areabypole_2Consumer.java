/**
 * Get_Areabypole_2Consumer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Areabypole_2Consumer  implements java.io.Serializable {
    private java.lang.String polestr;

    public Get_Areabypole_2Consumer() {
    }

    public Get_Areabypole_2Consumer(
           java.lang.String polestr) {
           this.polestr = polestr;
    }


    /**
     * Gets the polestr value for this Get_Areabypole_2Consumer.
     * 
     * @return polestr
     */
    public java.lang.String getPolestr() {
        return polestr;
    }


    /**
     * Sets the polestr value for this Get_Areabypole_2Consumer.
     * 
     * @param polestr
     */
    public void setPolestr(java.lang.String polestr) {
        this.polestr = polestr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Areabypole_2Consumer)) return false;
        Get_Areabypole_2Consumer other = (Get_Areabypole_2Consumer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.polestr==null && other.getPolestr()==null) || 
             (this.polestr!=null &&
              this.polestr.equals(other.getPolestr())));
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
        if (getPolestr() != null) {
            _hashCode += getPolestr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Areabypole_2Consumer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Areabypole_2Consumer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("polestr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "polestr"));
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
