/**
 * ZBAPI_IDENTIFICATIONResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_IDENTIFICATIONResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_IDENTIFICATIONResponseZBAPI_IDENTIFICATIONResult ZBAPI_IDENTIFICATIONResult;

    public ZBAPI_IDENTIFICATIONResponse() {
    }

    public ZBAPI_IDENTIFICATIONResponse(
           org.tempuri.ZBAPI_IDENTIFICATIONResponseZBAPI_IDENTIFICATIONResult ZBAPI_IDENTIFICATIONResult) {
           this.ZBAPI_IDENTIFICATIONResult = ZBAPI_IDENTIFICATIONResult;
    }


    /**
     * Gets the ZBAPI_IDENTIFICATIONResult value for this ZBAPI_IDENTIFICATIONResponse.
     * 
     * @return ZBAPI_IDENTIFICATIONResult
     */
    public org.tempuri.ZBAPI_IDENTIFICATIONResponseZBAPI_IDENTIFICATIONResult getZBAPI_IDENTIFICATIONResult() {
        return ZBAPI_IDENTIFICATIONResult;
    }


    /**
     * Sets the ZBAPI_IDENTIFICATIONResult value for this ZBAPI_IDENTIFICATIONResponse.
     * 
     * @param ZBAPI_IDENTIFICATIONResult
     */
    public void setZBAPI_IDENTIFICATIONResult(org.tempuri.ZBAPI_IDENTIFICATIONResponseZBAPI_IDENTIFICATIONResult ZBAPI_IDENTIFICATIONResult) {
        this.ZBAPI_IDENTIFICATIONResult = ZBAPI_IDENTIFICATIONResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_IDENTIFICATIONResponse)) return false;
        ZBAPI_IDENTIFICATIONResponse other = (ZBAPI_IDENTIFICATIONResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_IDENTIFICATIONResult==null && other.getZBAPI_IDENTIFICATIONResult()==null) || 
             (this.ZBAPI_IDENTIFICATIONResult!=null &&
              this.ZBAPI_IDENTIFICATIONResult.equals(other.getZBAPI_IDENTIFICATIONResult())));
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
        if (getZBAPI_IDENTIFICATIONResult() != null) {
            _hashCode += getZBAPI_IDENTIFICATIONResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_IDENTIFICATIONResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_IDENTIFICATIONResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_IDENTIFICATIONResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_IDENTIFICATIONResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_IDENTIFICATIONResponse>ZBAPI_IDENTIFICATIONResult"));
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
