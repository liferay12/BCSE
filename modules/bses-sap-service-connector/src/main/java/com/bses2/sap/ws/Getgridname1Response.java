/**
 * Getgridname1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Getgridname1Response  implements java.io.Serializable {
    private com.bses2.sap.ws.Getgridname1ResponseGetgridname1Result getgridname1Result;

    public Getgridname1Response() {
    }

    public Getgridname1Response(
           com.bses2.sap.ws.Getgridname1ResponseGetgridname1Result getgridname1Result) {
           this.getgridname1Result = getgridname1Result;
    }


    /**
     * Gets the getgridname1Result value for this Getgridname1Response.
     * 
     * @return getgridname1Result
     */
    public com.bses2.sap.ws.Getgridname1ResponseGetgridname1Result getGetgridname1Result() {
        return getgridname1Result;
    }


    /**
     * Sets the getgridname1Result value for this Getgridname1Response.
     * 
     * @param getgridname1Result
     */
    public void setGetgridname1Result(com.bses2.sap.ws.Getgridname1ResponseGetgridname1Result getgridname1Result) {
        this.getgridname1Result = getgridname1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Getgridname1Response)) return false;
        Getgridname1Response other = (Getgridname1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getgridname1Result==null && other.getGetgridname1Result()==null) || 
             (this.getgridname1Result!=null &&
              this.getgridname1Result.equals(other.getGetgridname1Result())));
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
        if (getGetgridname1Result() != null) {
            _hashCode += getGetgridname1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Getgridname1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getgridname1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getgridname1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "getgridname1Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getgridname1Response>getgridname1Result"));
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
