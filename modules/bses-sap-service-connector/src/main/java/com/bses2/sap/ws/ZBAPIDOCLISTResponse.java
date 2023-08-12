/**
 * ZBAPIDOCLISTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ZBAPIDOCLISTResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.ZBAPIDOCLISTResponseZBAPIDOCLISTResult ZBAPIDOCLISTResult;

    public ZBAPIDOCLISTResponse() {
    }

    public ZBAPIDOCLISTResponse(
           com.bses2.sap.ws.ZBAPIDOCLISTResponseZBAPIDOCLISTResult ZBAPIDOCLISTResult) {
           this.ZBAPIDOCLISTResult = ZBAPIDOCLISTResult;
    }


    /**
     * Gets the ZBAPIDOCLISTResult value for this ZBAPIDOCLISTResponse.
     * 
     * @return ZBAPIDOCLISTResult
     */
    public com.bses2.sap.ws.ZBAPIDOCLISTResponseZBAPIDOCLISTResult getZBAPIDOCLISTResult() {
        return ZBAPIDOCLISTResult;
    }


    /**
     * Sets the ZBAPIDOCLISTResult value for this ZBAPIDOCLISTResponse.
     * 
     * @param ZBAPIDOCLISTResult
     */
    public void setZBAPIDOCLISTResult(com.bses2.sap.ws.ZBAPIDOCLISTResponseZBAPIDOCLISTResult ZBAPIDOCLISTResult) {
        this.ZBAPIDOCLISTResult = ZBAPIDOCLISTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPIDOCLISTResponse)) return false;
        ZBAPIDOCLISTResponse other = (ZBAPIDOCLISTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPIDOCLISTResult==null && other.getZBAPIDOCLISTResult()==null) || 
             (this.ZBAPIDOCLISTResult!=null &&
              this.ZBAPIDOCLISTResult.equals(other.getZBAPIDOCLISTResult())));
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
        if (getZBAPIDOCLISTResult() != null) {
            _hashCode += getZBAPIDOCLISTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPIDOCLISTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPIDOCLISTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPIDOCLISTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPIDOCLISTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPIDOCLISTResponse>ZBAPIDOCLISTResult"));
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
