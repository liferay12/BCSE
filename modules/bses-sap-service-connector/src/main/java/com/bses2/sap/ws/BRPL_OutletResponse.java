/**
 * BRPL_OutletResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class BRPL_OutletResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.BRPL_OutletResponseBRPL_OutletResult BRPL_OutletResult;

    public BRPL_OutletResponse() {
    }

    public BRPL_OutletResponse(
           com.bses2.sap.ws.BRPL_OutletResponseBRPL_OutletResult BRPL_OutletResult) {
           this.BRPL_OutletResult = BRPL_OutletResult;
    }


    /**
     * Gets the BRPL_OutletResult value for this BRPL_OutletResponse.
     * 
     * @return BRPL_OutletResult
     */
    public com.bses2.sap.ws.BRPL_OutletResponseBRPL_OutletResult getBRPL_OutletResult() {
        return BRPL_OutletResult;
    }


    /**
     * Sets the BRPL_OutletResult value for this BRPL_OutletResponse.
     * 
     * @param BRPL_OutletResult
     */
    public void setBRPL_OutletResult(com.bses2.sap.ws.BRPL_OutletResponseBRPL_OutletResult BRPL_OutletResult) {
        this.BRPL_OutletResult = BRPL_OutletResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BRPL_OutletResponse)) return false;
        BRPL_OutletResponse other = (BRPL_OutletResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BRPL_OutletResult==null && other.getBRPL_OutletResult()==null) || 
             (this.BRPL_OutletResult!=null &&
              this.BRPL_OutletResult.equals(other.getBRPL_OutletResult())));
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
        if (getBRPL_OutletResult() != null) {
            _hashCode += getBRPL_OutletResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BRPL_OutletResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BRPL_OutletResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRPL_OutletResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BRPL_OutletResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>BRPL_OutletResponse>BRPL_OutletResult"));
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
