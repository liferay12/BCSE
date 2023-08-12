/**
 * ZBAPI_FICA_DEMAND_NOTEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_FICA_DEMAND_NOTEResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_FICA_DEMAND_NOTEResponseZBAPI_FICA_DEMAND_NOTEResult ZBAPI_FICA_DEMAND_NOTEResult;

    public ZBAPI_FICA_DEMAND_NOTEResponse() {
    }

    public ZBAPI_FICA_DEMAND_NOTEResponse(
           org.tempuri.ZBAPI_FICA_DEMAND_NOTEResponseZBAPI_FICA_DEMAND_NOTEResult ZBAPI_FICA_DEMAND_NOTEResult) {
           this.ZBAPI_FICA_DEMAND_NOTEResult = ZBAPI_FICA_DEMAND_NOTEResult;
    }


    /**
     * Gets the ZBAPI_FICA_DEMAND_NOTEResult value for this ZBAPI_FICA_DEMAND_NOTEResponse.
     * 
     * @return ZBAPI_FICA_DEMAND_NOTEResult
     */
    public org.tempuri.ZBAPI_FICA_DEMAND_NOTEResponseZBAPI_FICA_DEMAND_NOTEResult getZBAPI_FICA_DEMAND_NOTEResult() {
        return ZBAPI_FICA_DEMAND_NOTEResult;
    }


    /**
     * Sets the ZBAPI_FICA_DEMAND_NOTEResult value for this ZBAPI_FICA_DEMAND_NOTEResponse.
     * 
     * @param ZBAPI_FICA_DEMAND_NOTEResult
     */
    public void setZBAPI_FICA_DEMAND_NOTEResult(org.tempuri.ZBAPI_FICA_DEMAND_NOTEResponseZBAPI_FICA_DEMAND_NOTEResult ZBAPI_FICA_DEMAND_NOTEResult) {
        this.ZBAPI_FICA_DEMAND_NOTEResult = ZBAPI_FICA_DEMAND_NOTEResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_FICA_DEMAND_NOTEResponse)) return false;
        ZBAPI_FICA_DEMAND_NOTEResponse other = (ZBAPI_FICA_DEMAND_NOTEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_FICA_DEMAND_NOTEResult==null && other.getZBAPI_FICA_DEMAND_NOTEResult()==null) || 
             (this.ZBAPI_FICA_DEMAND_NOTEResult!=null &&
              this.ZBAPI_FICA_DEMAND_NOTEResult.equals(other.getZBAPI_FICA_DEMAND_NOTEResult())));
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
        if (getZBAPI_FICA_DEMAND_NOTEResult() != null) {
            _hashCode += getZBAPI_FICA_DEMAND_NOTEResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_FICA_DEMAND_NOTEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_FICA_DEMAND_NOTEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_FICA_DEMAND_NOTEResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_FICA_DEMAND_NOTEResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_FICA_DEMAND_NOTEResponse>ZBAPI_FICA_DEMAND_NOTEResult"));
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
