/**
 * ZBAPI_ONLINE_BILL_PDFResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_ONLINE_BILL_PDFResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_ONLINE_BILL_PDFResponseZBAPI_ONLINE_BILL_PDFResult ZBAPI_ONLINE_BILL_PDFResult;

    public ZBAPI_ONLINE_BILL_PDFResponse() {
    }

    public ZBAPI_ONLINE_BILL_PDFResponse(
           org.tempuri.ZBAPI_ONLINE_BILL_PDFResponseZBAPI_ONLINE_BILL_PDFResult ZBAPI_ONLINE_BILL_PDFResult) {
           this.ZBAPI_ONLINE_BILL_PDFResult = ZBAPI_ONLINE_BILL_PDFResult;
    }


    /**
     * Gets the ZBAPI_ONLINE_BILL_PDFResult value for this ZBAPI_ONLINE_BILL_PDFResponse.
     * 
     * @return ZBAPI_ONLINE_BILL_PDFResult
     */
    public org.tempuri.ZBAPI_ONLINE_BILL_PDFResponseZBAPI_ONLINE_BILL_PDFResult getZBAPI_ONLINE_BILL_PDFResult() {
        return ZBAPI_ONLINE_BILL_PDFResult;
    }


    /**
     * Sets the ZBAPI_ONLINE_BILL_PDFResult value for this ZBAPI_ONLINE_BILL_PDFResponse.
     * 
     * @param ZBAPI_ONLINE_BILL_PDFResult
     */
    public void setZBAPI_ONLINE_BILL_PDFResult(org.tempuri.ZBAPI_ONLINE_BILL_PDFResponseZBAPI_ONLINE_BILL_PDFResult ZBAPI_ONLINE_BILL_PDFResult) {
        this.ZBAPI_ONLINE_BILL_PDFResult = ZBAPI_ONLINE_BILL_PDFResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_ONLINE_BILL_PDFResponse)) return false;
        ZBAPI_ONLINE_BILL_PDFResponse other = (ZBAPI_ONLINE_BILL_PDFResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_ONLINE_BILL_PDFResult==null && other.getZBAPI_ONLINE_BILL_PDFResult()==null) || 
             (this.ZBAPI_ONLINE_BILL_PDFResult!=null &&
              this.ZBAPI_ONLINE_BILL_PDFResult.equals(other.getZBAPI_ONLINE_BILL_PDFResult())));
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
        if (getZBAPI_ONLINE_BILL_PDFResult() != null) {
            _hashCode += getZBAPI_ONLINE_BILL_PDFResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_ONLINE_BILL_PDFResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_ONLINE_BILL_PDFResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_ONLINE_BILL_PDFResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_ONLINE_BILL_PDFResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_ONLINE_BILL_PDFResponse>ZBAPI_ONLINE_BILL_PDFResult"));
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
