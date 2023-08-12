/**
 * ZBAPI_ADD_IDENTIFICATIONResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_ADD_IDENTIFICATIONResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_ADD_IDENTIFICATIONResponseZBAPI_ADD_IDENTIFICATIONResult ZBAPI_ADD_IDENTIFICATIONResult;

    public ZBAPI_ADD_IDENTIFICATIONResponse() {
    }

    public ZBAPI_ADD_IDENTIFICATIONResponse(
           org.tempuri.ZBAPI_ADD_IDENTIFICATIONResponseZBAPI_ADD_IDENTIFICATIONResult ZBAPI_ADD_IDENTIFICATIONResult) {
           this.ZBAPI_ADD_IDENTIFICATIONResult = ZBAPI_ADD_IDENTIFICATIONResult;
    }


    /**
     * Gets the ZBAPI_ADD_IDENTIFICATIONResult value for this ZBAPI_ADD_IDENTIFICATIONResponse.
     * 
     * @return ZBAPI_ADD_IDENTIFICATIONResult
     */
    public org.tempuri.ZBAPI_ADD_IDENTIFICATIONResponseZBAPI_ADD_IDENTIFICATIONResult getZBAPI_ADD_IDENTIFICATIONResult() {
        return ZBAPI_ADD_IDENTIFICATIONResult;
    }


    /**
     * Sets the ZBAPI_ADD_IDENTIFICATIONResult value for this ZBAPI_ADD_IDENTIFICATIONResponse.
     * 
     * @param ZBAPI_ADD_IDENTIFICATIONResult
     */
    public void setZBAPI_ADD_IDENTIFICATIONResult(org.tempuri.ZBAPI_ADD_IDENTIFICATIONResponseZBAPI_ADD_IDENTIFICATIONResult ZBAPI_ADD_IDENTIFICATIONResult) {
        this.ZBAPI_ADD_IDENTIFICATIONResult = ZBAPI_ADD_IDENTIFICATIONResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_ADD_IDENTIFICATIONResponse)) return false;
        ZBAPI_ADD_IDENTIFICATIONResponse other = (ZBAPI_ADD_IDENTIFICATIONResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_ADD_IDENTIFICATIONResult==null && other.getZBAPI_ADD_IDENTIFICATIONResult()==null) || 
             (this.ZBAPI_ADD_IDENTIFICATIONResult!=null &&
              this.ZBAPI_ADD_IDENTIFICATIONResult.equals(other.getZBAPI_ADD_IDENTIFICATIONResult())));
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
        if (getZBAPI_ADD_IDENTIFICATIONResult() != null) {
            _hashCode += getZBAPI_ADD_IDENTIFICATIONResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_ADD_IDENTIFICATIONResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_ADD_IDENTIFICATIONResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_ADD_IDENTIFICATIONResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_ADD_IDENTIFICATIONResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_ADD_IDENTIFICATIONResponse>ZBAPI_ADD_IDENTIFICATIONResult"));
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
