/**
 * ZBAPI_TEAM_ALLOCATION.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_TEAM_ALLOCATION  implements java.io.Serializable {
    private java.lang.String strIEMINumber;

    private java.lang.String strILART;

    private java.lang.String strDate;

    private java.lang.String strTime;

    public ZBAPI_TEAM_ALLOCATION() {
    }

    public ZBAPI_TEAM_ALLOCATION(
           java.lang.String strIEMINumber,
           java.lang.String strILART,
           java.lang.String strDate,
           java.lang.String strTime) {
           this.strIEMINumber = strIEMINumber;
           this.strILART = strILART;
           this.strDate = strDate;
           this.strTime = strTime;
    }


    /**
     * Gets the strIEMINumber value for this ZBAPI_TEAM_ALLOCATION.
     * 
     * @return strIEMINumber
     */
    public java.lang.String getStrIEMINumber() {
        return strIEMINumber;
    }


    /**
     * Sets the strIEMINumber value for this ZBAPI_TEAM_ALLOCATION.
     * 
     * @param strIEMINumber
     */
    public void setStrIEMINumber(java.lang.String strIEMINumber) {
        this.strIEMINumber = strIEMINumber;
    }


    /**
     * Gets the strILART value for this ZBAPI_TEAM_ALLOCATION.
     * 
     * @return strILART
     */
    public java.lang.String getStrILART() {
        return strILART;
    }


    /**
     * Sets the strILART value for this ZBAPI_TEAM_ALLOCATION.
     * 
     * @param strILART
     */
    public void setStrILART(java.lang.String strILART) {
        this.strILART = strILART;
    }


    /**
     * Gets the strDate value for this ZBAPI_TEAM_ALLOCATION.
     * 
     * @return strDate
     */
    public java.lang.String getStrDate() {
        return strDate;
    }


    /**
     * Sets the strDate value for this ZBAPI_TEAM_ALLOCATION.
     * 
     * @param strDate
     */
    public void setStrDate(java.lang.String strDate) {
        this.strDate = strDate;
    }


    /**
     * Gets the strTime value for this ZBAPI_TEAM_ALLOCATION.
     * 
     * @return strTime
     */
    public java.lang.String getStrTime() {
        return strTime;
    }


    /**
     * Sets the strTime value for this ZBAPI_TEAM_ALLOCATION.
     * 
     * @param strTime
     */
    public void setStrTime(java.lang.String strTime) {
        this.strTime = strTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_TEAM_ALLOCATION)) return false;
        ZBAPI_TEAM_ALLOCATION other = (ZBAPI_TEAM_ALLOCATION) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strIEMINumber==null && other.getStrIEMINumber()==null) || 
             (this.strIEMINumber!=null &&
              this.strIEMINumber.equals(other.getStrIEMINumber()))) &&
            ((this.strILART==null && other.getStrILART()==null) || 
             (this.strILART!=null &&
              this.strILART.equals(other.getStrILART()))) &&
            ((this.strDate==null && other.getStrDate()==null) || 
             (this.strDate!=null &&
              this.strDate.equals(other.getStrDate()))) &&
            ((this.strTime==null && other.getStrTime()==null) || 
             (this.strTime!=null &&
              this.strTime.equals(other.getStrTime())));
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
        if (getStrIEMINumber() != null) {
            _hashCode += getStrIEMINumber().hashCode();
        }
        if (getStrILART() != null) {
            _hashCode += getStrILART().hashCode();
        }
        if (getStrDate() != null) {
            _hashCode += getStrDate().hashCode();
        }
        if (getStrTime() != null) {
            _hashCode += getStrTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_TEAM_ALLOCATION.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_TEAM_ALLOCATION"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strIEMINumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strIEMINumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strILART");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strILART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strTime"));
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
