/**
 * ZBAPI_MSO_POST_DETResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_MSO_POST_DETResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_MSO_POST_DETResponseZBAPI_MSO_POST_DETResult ZBAPI_MSO_POST_DETResult;

    public ZBAPI_MSO_POST_DETResponse() {
    }

    public ZBAPI_MSO_POST_DETResponse(
           org.tempuri.ZBAPI_MSO_POST_DETResponseZBAPI_MSO_POST_DETResult ZBAPI_MSO_POST_DETResult) {
           this.ZBAPI_MSO_POST_DETResult = ZBAPI_MSO_POST_DETResult;
    }


    /**
     * Gets the ZBAPI_MSO_POST_DETResult value for this ZBAPI_MSO_POST_DETResponse.
     * 
     * @return ZBAPI_MSO_POST_DETResult
     */
    public org.tempuri.ZBAPI_MSO_POST_DETResponseZBAPI_MSO_POST_DETResult getZBAPI_MSO_POST_DETResult() {
        return ZBAPI_MSO_POST_DETResult;
    }


    /**
     * Sets the ZBAPI_MSO_POST_DETResult value for this ZBAPI_MSO_POST_DETResponse.
     * 
     * @param ZBAPI_MSO_POST_DETResult
     */
    public void setZBAPI_MSO_POST_DETResult(org.tempuri.ZBAPI_MSO_POST_DETResponseZBAPI_MSO_POST_DETResult ZBAPI_MSO_POST_DETResult) {
        this.ZBAPI_MSO_POST_DETResult = ZBAPI_MSO_POST_DETResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_MSO_POST_DETResponse)) return false;
        ZBAPI_MSO_POST_DETResponse other = (ZBAPI_MSO_POST_DETResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_MSO_POST_DETResult==null && other.getZBAPI_MSO_POST_DETResult()==null) || 
             (this.ZBAPI_MSO_POST_DETResult!=null &&
              this.ZBAPI_MSO_POST_DETResult.equals(other.getZBAPI_MSO_POST_DETResult())));
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
        if (getZBAPI_MSO_POST_DETResult() != null) {
            _hashCode += getZBAPI_MSO_POST_DETResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_MSO_POST_DETResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_MSO_POST_DETResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_MSO_POST_DETResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_MSO_POST_DETResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_MSO_POST_DETResponse>ZBAPI_MSO_POST_DETResult"));
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
