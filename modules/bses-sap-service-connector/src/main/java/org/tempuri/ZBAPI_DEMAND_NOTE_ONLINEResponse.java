/**
 * ZBAPI_DEMAND_NOTE_ONLINEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_DEMAND_NOTE_ONLINEResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_DEMAND_NOTE_ONLINEResponseZBAPI_DEMAND_NOTE_ONLINEResult ZBAPI_DEMAND_NOTE_ONLINEResult;

    public ZBAPI_DEMAND_NOTE_ONLINEResponse() {
    }

    public ZBAPI_DEMAND_NOTE_ONLINEResponse(
           org.tempuri.ZBAPI_DEMAND_NOTE_ONLINEResponseZBAPI_DEMAND_NOTE_ONLINEResult ZBAPI_DEMAND_NOTE_ONLINEResult) {
           this.ZBAPI_DEMAND_NOTE_ONLINEResult = ZBAPI_DEMAND_NOTE_ONLINEResult;
    }


    /**
     * Gets the ZBAPI_DEMAND_NOTE_ONLINEResult value for this ZBAPI_DEMAND_NOTE_ONLINEResponse.
     * 
     * @return ZBAPI_DEMAND_NOTE_ONLINEResult
     */
    public org.tempuri.ZBAPI_DEMAND_NOTE_ONLINEResponseZBAPI_DEMAND_NOTE_ONLINEResult getZBAPI_DEMAND_NOTE_ONLINEResult() {
        return ZBAPI_DEMAND_NOTE_ONLINEResult;
    }


    /**
     * Sets the ZBAPI_DEMAND_NOTE_ONLINEResult value for this ZBAPI_DEMAND_NOTE_ONLINEResponse.
     * 
     * @param ZBAPI_DEMAND_NOTE_ONLINEResult
     */
    public void setZBAPI_DEMAND_NOTE_ONLINEResult(org.tempuri.ZBAPI_DEMAND_NOTE_ONLINEResponseZBAPI_DEMAND_NOTE_ONLINEResult ZBAPI_DEMAND_NOTE_ONLINEResult) {
        this.ZBAPI_DEMAND_NOTE_ONLINEResult = ZBAPI_DEMAND_NOTE_ONLINEResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_DEMAND_NOTE_ONLINEResponse)) return false;
        ZBAPI_DEMAND_NOTE_ONLINEResponse other = (ZBAPI_DEMAND_NOTE_ONLINEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_DEMAND_NOTE_ONLINEResult==null && other.getZBAPI_DEMAND_NOTE_ONLINEResult()==null) || 
             (this.ZBAPI_DEMAND_NOTE_ONLINEResult!=null &&
              this.ZBAPI_DEMAND_NOTE_ONLINEResult.equals(other.getZBAPI_DEMAND_NOTE_ONLINEResult())));
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
        if (getZBAPI_DEMAND_NOTE_ONLINEResult() != null) {
            _hashCode += getZBAPI_DEMAND_NOTE_ONLINEResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_DEMAND_NOTE_ONLINEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_DEMAND_NOTE_ONLINEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_DEMAND_NOTE_ONLINEResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_DEMAND_NOTE_ONLINEResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_DEMAND_NOTE_ONLINEResponse>ZBAPI_DEMAND_NOTE_ONLINEResult"));
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
