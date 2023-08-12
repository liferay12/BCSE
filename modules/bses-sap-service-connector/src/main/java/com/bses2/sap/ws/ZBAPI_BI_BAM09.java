/**
 * ZBAPI_BI_BAM09.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ZBAPI_BI_BAM09  implements java.io.Serializable {
    private com.bses2.sap.ws.ZBAPI_BI_BAM09DsInputTable dsInputTable;

    public ZBAPI_BI_BAM09() {
    }

    public ZBAPI_BI_BAM09(
           com.bses2.sap.ws.ZBAPI_BI_BAM09DsInputTable dsInputTable) {
           this.dsInputTable = dsInputTable;
    }


    /**
     * Gets the dsInputTable value for this ZBAPI_BI_BAM09.
     * 
     * @return dsInputTable
     */
    public com.bses2.sap.ws.ZBAPI_BI_BAM09DsInputTable getDsInputTable() {
        return dsInputTable;
    }


    /**
     * Sets the dsInputTable value for this ZBAPI_BI_BAM09.
     * 
     * @param dsInputTable
     */
    public void setDsInputTable(com.bses2.sap.ws.ZBAPI_BI_BAM09DsInputTable dsInputTable) {
        this.dsInputTable = dsInputTable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_BI_BAM09)) return false;
        ZBAPI_BI_BAM09 other = (ZBAPI_BI_BAM09) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dsInputTable==null && other.getDsInputTable()==null) || 
             (this.dsInputTable!=null &&
              this.dsInputTable.equals(other.getDsInputTable())));
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
        if (getDsInputTable() != null) {
            _hashCode += getDsInputTable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_BI_BAM09.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_BI_BAM09"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsInputTable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DsInputTable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_BI_BAM09>DsInputTable"));
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
