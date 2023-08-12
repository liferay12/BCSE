/**
 * ZBAPI_CS_FETCH_LOAD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_CS_FETCH_LOAD  implements java.io.Serializable {
    private java.lang.String strINORDERNO;

    private java.lang.String strINBUSINESSPART;

    private java.lang.String strINCONTRACTACCNT;

    private java.lang.String strINMETERNUM;

    public ZBAPI_CS_FETCH_LOAD() {
    }

    public ZBAPI_CS_FETCH_LOAD(
           java.lang.String strINORDERNO,
           java.lang.String strINBUSINESSPART,
           java.lang.String strINCONTRACTACCNT,
           java.lang.String strINMETERNUM) {
           this.strINORDERNO = strINORDERNO;
           this.strINBUSINESSPART = strINBUSINESSPART;
           this.strINCONTRACTACCNT = strINCONTRACTACCNT;
           this.strINMETERNUM = strINMETERNUM;
    }


    /**
     * Gets the strINORDERNO value for this ZBAPI_CS_FETCH_LOAD.
     * 
     * @return strINORDERNO
     */
    public java.lang.String getStrINORDERNO() {
        return strINORDERNO;
    }


    /**
     * Sets the strINORDERNO value for this ZBAPI_CS_FETCH_LOAD.
     * 
     * @param strINORDERNO
     */
    public void setStrINORDERNO(java.lang.String strINORDERNO) {
        this.strINORDERNO = strINORDERNO;
    }


    /**
     * Gets the strINBUSINESSPART value for this ZBAPI_CS_FETCH_LOAD.
     * 
     * @return strINBUSINESSPART
     */
    public java.lang.String getStrINBUSINESSPART() {
        return strINBUSINESSPART;
    }


    /**
     * Sets the strINBUSINESSPART value for this ZBAPI_CS_FETCH_LOAD.
     * 
     * @param strINBUSINESSPART
     */
    public void setStrINBUSINESSPART(java.lang.String strINBUSINESSPART) {
        this.strINBUSINESSPART = strINBUSINESSPART;
    }


    /**
     * Gets the strINCONTRACTACCNT value for this ZBAPI_CS_FETCH_LOAD.
     * 
     * @return strINCONTRACTACCNT
     */
    public java.lang.String getStrINCONTRACTACCNT() {
        return strINCONTRACTACCNT;
    }


    /**
     * Sets the strINCONTRACTACCNT value for this ZBAPI_CS_FETCH_LOAD.
     * 
     * @param strINCONTRACTACCNT
     */
    public void setStrINCONTRACTACCNT(java.lang.String strINCONTRACTACCNT) {
        this.strINCONTRACTACCNT = strINCONTRACTACCNT;
    }


    /**
     * Gets the strINMETERNUM value for this ZBAPI_CS_FETCH_LOAD.
     * 
     * @return strINMETERNUM
     */
    public java.lang.String getStrINMETERNUM() {
        return strINMETERNUM;
    }


    /**
     * Sets the strINMETERNUM value for this ZBAPI_CS_FETCH_LOAD.
     * 
     * @param strINMETERNUM
     */
    public void setStrINMETERNUM(java.lang.String strINMETERNUM) {
        this.strINMETERNUM = strINMETERNUM;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_CS_FETCH_LOAD)) return false;
        ZBAPI_CS_FETCH_LOAD other = (ZBAPI_CS_FETCH_LOAD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strINORDERNO==null && other.getStrINORDERNO()==null) || 
             (this.strINORDERNO!=null &&
              this.strINORDERNO.equals(other.getStrINORDERNO()))) &&
            ((this.strINBUSINESSPART==null && other.getStrINBUSINESSPART()==null) || 
             (this.strINBUSINESSPART!=null &&
              this.strINBUSINESSPART.equals(other.getStrINBUSINESSPART()))) &&
            ((this.strINCONTRACTACCNT==null && other.getStrINCONTRACTACCNT()==null) || 
             (this.strINCONTRACTACCNT!=null &&
              this.strINCONTRACTACCNT.equals(other.getStrINCONTRACTACCNT()))) &&
            ((this.strINMETERNUM==null && other.getStrINMETERNUM()==null) || 
             (this.strINMETERNUM!=null &&
              this.strINMETERNUM.equals(other.getStrINMETERNUM())));
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
        if (getStrINORDERNO() != null) {
            _hashCode += getStrINORDERNO().hashCode();
        }
        if (getStrINBUSINESSPART() != null) {
            _hashCode += getStrINBUSINESSPART().hashCode();
        }
        if (getStrINCONTRACTACCNT() != null) {
            _hashCode += getStrINCONTRACTACCNT().hashCode();
        }
        if (getStrINMETERNUM() != null) {
            _hashCode += getStrINMETERNUM().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_CS_FETCH_LOAD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_CS_FETCH_LOAD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strINORDERNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strINORDERNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strINBUSINESSPART");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strINBUSINESSPART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strINCONTRACTACCNT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strINCONTRACTACCNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strINMETERNUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strINMETERNUM"));
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
