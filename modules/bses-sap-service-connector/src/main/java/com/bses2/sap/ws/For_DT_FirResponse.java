/**
 * For_DT_FirResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class For_DT_FirResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.For_DT_FirResponseFor_DT_FirResult for_DT_FirResult;

    public For_DT_FirResponse() {
    }

    public For_DT_FirResponse(
           com.bses2.sap.ws.For_DT_FirResponseFor_DT_FirResult for_DT_FirResult) {
           this.for_DT_FirResult = for_DT_FirResult;
    }


    /**
     * Gets the for_DT_FirResult value for this For_DT_FirResponse.
     * 
     * @return for_DT_FirResult
     */
    public com.bses2.sap.ws.For_DT_FirResponseFor_DT_FirResult getFor_DT_FirResult() {
        return for_DT_FirResult;
    }


    /**
     * Sets the for_DT_FirResult value for this For_DT_FirResponse.
     * 
     * @param for_DT_FirResult
     */
    public void setFor_DT_FirResult(com.bses2.sap.ws.For_DT_FirResponseFor_DT_FirResult for_DT_FirResult) {
        this.for_DT_FirResult = for_DT_FirResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof For_DT_FirResponse)) return false;
        For_DT_FirResponse other = (For_DT_FirResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.for_DT_FirResult==null && other.getFor_DT_FirResult()==null) || 
             (this.for_DT_FirResult!=null &&
              this.for_DT_FirResult.equals(other.getFor_DT_FirResult())));
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
        if (getFor_DT_FirResult() != null) {
            _hashCode += getFor_DT_FirResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(For_DT_FirResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">For_DT_FirResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("for_DT_FirResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "For_DT_FirResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>For_DT_FirResponse>For_DT_FirResult"));
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
