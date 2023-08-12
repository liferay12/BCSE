/**
 * ZBAPI_FICA_DEMAND_DUE_DATEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_FICA_DEMAND_DUE_DATEResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_FICA_DEMAND_DUE_DATEResponseZBAPI_FICA_DEMAND_DUE_DATEResult ZBAPI_FICA_DEMAND_DUE_DATEResult;

    public ZBAPI_FICA_DEMAND_DUE_DATEResponse() {
    }

    public ZBAPI_FICA_DEMAND_DUE_DATEResponse(
           org.tempuri.ZBAPI_FICA_DEMAND_DUE_DATEResponseZBAPI_FICA_DEMAND_DUE_DATEResult ZBAPI_FICA_DEMAND_DUE_DATEResult) {
           this.ZBAPI_FICA_DEMAND_DUE_DATEResult = ZBAPI_FICA_DEMAND_DUE_DATEResult;
    }


    /**
     * Gets the ZBAPI_FICA_DEMAND_DUE_DATEResult value for this ZBAPI_FICA_DEMAND_DUE_DATEResponse.
     * 
     * @return ZBAPI_FICA_DEMAND_DUE_DATEResult
     */
    public org.tempuri.ZBAPI_FICA_DEMAND_DUE_DATEResponseZBAPI_FICA_DEMAND_DUE_DATEResult getZBAPI_FICA_DEMAND_DUE_DATEResult() {
        return ZBAPI_FICA_DEMAND_DUE_DATEResult;
    }


    /**
     * Sets the ZBAPI_FICA_DEMAND_DUE_DATEResult value for this ZBAPI_FICA_DEMAND_DUE_DATEResponse.
     * 
     * @param ZBAPI_FICA_DEMAND_DUE_DATEResult
     */
    public void setZBAPI_FICA_DEMAND_DUE_DATEResult(org.tempuri.ZBAPI_FICA_DEMAND_DUE_DATEResponseZBAPI_FICA_DEMAND_DUE_DATEResult ZBAPI_FICA_DEMAND_DUE_DATEResult) {
        this.ZBAPI_FICA_DEMAND_DUE_DATEResult = ZBAPI_FICA_DEMAND_DUE_DATEResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_FICA_DEMAND_DUE_DATEResponse)) return false;
        ZBAPI_FICA_DEMAND_DUE_DATEResponse other = (ZBAPI_FICA_DEMAND_DUE_DATEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_FICA_DEMAND_DUE_DATEResult==null && other.getZBAPI_FICA_DEMAND_DUE_DATEResult()==null) || 
             (this.ZBAPI_FICA_DEMAND_DUE_DATEResult!=null &&
              this.ZBAPI_FICA_DEMAND_DUE_DATEResult.equals(other.getZBAPI_FICA_DEMAND_DUE_DATEResult())));
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
        if (getZBAPI_FICA_DEMAND_DUE_DATEResult() != null) {
            _hashCode += getZBAPI_FICA_DEMAND_DUE_DATEResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_FICA_DEMAND_DUE_DATEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_FICA_DEMAND_DUE_DATEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_FICA_DEMAND_DUE_DATEResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_FICA_DEMAND_DUE_DATEResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_FICA_DEMAND_DUE_DATEResponse>ZBAPI_FICA_DEMAND_DUE_DATEResult"));
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
