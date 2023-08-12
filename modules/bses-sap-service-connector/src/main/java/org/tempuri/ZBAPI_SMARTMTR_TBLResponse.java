/**
 * ZBAPI_SMARTMTR_TBLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_SMARTMTR_TBLResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_SMARTMTR_TBLResponseZBAPI_SMARTMTR_TBLResult ZBAPI_SMARTMTR_TBLResult;

    public ZBAPI_SMARTMTR_TBLResponse() {
    }

    public ZBAPI_SMARTMTR_TBLResponse(
           org.tempuri.ZBAPI_SMARTMTR_TBLResponseZBAPI_SMARTMTR_TBLResult ZBAPI_SMARTMTR_TBLResult) {
           this.ZBAPI_SMARTMTR_TBLResult = ZBAPI_SMARTMTR_TBLResult;
    }


    /**
     * Gets the ZBAPI_SMARTMTR_TBLResult value for this ZBAPI_SMARTMTR_TBLResponse.
     * 
     * @return ZBAPI_SMARTMTR_TBLResult
     */
    public org.tempuri.ZBAPI_SMARTMTR_TBLResponseZBAPI_SMARTMTR_TBLResult getZBAPI_SMARTMTR_TBLResult() {
        return ZBAPI_SMARTMTR_TBLResult;
    }


    /**
     * Sets the ZBAPI_SMARTMTR_TBLResult value for this ZBAPI_SMARTMTR_TBLResponse.
     * 
     * @param ZBAPI_SMARTMTR_TBLResult
     */
    public void setZBAPI_SMARTMTR_TBLResult(org.tempuri.ZBAPI_SMARTMTR_TBLResponseZBAPI_SMARTMTR_TBLResult ZBAPI_SMARTMTR_TBLResult) {
        this.ZBAPI_SMARTMTR_TBLResult = ZBAPI_SMARTMTR_TBLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_SMARTMTR_TBLResponse)) return false;
        ZBAPI_SMARTMTR_TBLResponse other = (ZBAPI_SMARTMTR_TBLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_SMARTMTR_TBLResult==null && other.getZBAPI_SMARTMTR_TBLResult()==null) || 
             (this.ZBAPI_SMARTMTR_TBLResult!=null &&
              this.ZBAPI_SMARTMTR_TBLResult.equals(other.getZBAPI_SMARTMTR_TBLResult())));
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
        if (getZBAPI_SMARTMTR_TBLResult() != null) {
            _hashCode += getZBAPI_SMARTMTR_TBLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_SMARTMTR_TBLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_SMARTMTR_TBLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_SMARTMTR_TBLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_SMARTMTR_TBLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_SMARTMTR_TBLResponse>ZBAPI_SMARTMTR_TBLResult"));
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
