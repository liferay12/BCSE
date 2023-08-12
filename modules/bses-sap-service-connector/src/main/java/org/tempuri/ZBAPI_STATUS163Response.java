/**
 * ZBAPI_STATUS163Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_STATUS163Response  implements java.io.Serializable {
    private org.tempuri.ZBAPI_STATUS163ResponseZBAPI_STATUS163Result ZBAPI_STATUS163Result;

    public ZBAPI_STATUS163Response() {
    }

    public ZBAPI_STATUS163Response(
           org.tempuri.ZBAPI_STATUS163ResponseZBAPI_STATUS163Result ZBAPI_STATUS163Result) {
           this.ZBAPI_STATUS163Result = ZBAPI_STATUS163Result;
    }


    /**
     * Gets the ZBAPI_STATUS163Result value for this ZBAPI_STATUS163Response.
     * 
     * @return ZBAPI_STATUS163Result
     */
    public org.tempuri.ZBAPI_STATUS163ResponseZBAPI_STATUS163Result getZBAPI_STATUS163Result() {
        return ZBAPI_STATUS163Result;
    }


    /**
     * Sets the ZBAPI_STATUS163Result value for this ZBAPI_STATUS163Response.
     * 
     * @param ZBAPI_STATUS163Result
     */
    public void setZBAPI_STATUS163Result(org.tempuri.ZBAPI_STATUS163ResponseZBAPI_STATUS163Result ZBAPI_STATUS163Result) {
        this.ZBAPI_STATUS163Result = ZBAPI_STATUS163Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_STATUS163Response)) return false;
        ZBAPI_STATUS163Response other = (ZBAPI_STATUS163Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_STATUS163Result==null && other.getZBAPI_STATUS163Result()==null) || 
             (this.ZBAPI_STATUS163Result!=null &&
              this.ZBAPI_STATUS163Result.equals(other.getZBAPI_STATUS163Result())));
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
        if (getZBAPI_STATUS163Result() != null) {
            _hashCode += getZBAPI_STATUS163Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_STATUS163Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_STATUS163Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_STATUS163Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_STATUS163Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_STATUS163Response>ZBAPI_STATUS163Result"));
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
