/**
 * Get_Feeder_StatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Feeder_StatusResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Feeder_StatusResponseGet_Feeder_StatusResult get_Feeder_StatusResult;

    public Get_Feeder_StatusResponse() {
    }

    public Get_Feeder_StatusResponse(
           com.bses2.sap.ws.Get_Feeder_StatusResponseGet_Feeder_StatusResult get_Feeder_StatusResult) {
           this.get_Feeder_StatusResult = get_Feeder_StatusResult;
    }


    /**
     * Gets the get_Feeder_StatusResult value for this Get_Feeder_StatusResponse.
     * 
     * @return get_Feeder_StatusResult
     */
    public com.bses2.sap.ws.Get_Feeder_StatusResponseGet_Feeder_StatusResult getGet_Feeder_StatusResult() {
        return get_Feeder_StatusResult;
    }


    /**
     * Sets the get_Feeder_StatusResult value for this Get_Feeder_StatusResponse.
     * 
     * @param get_Feeder_StatusResult
     */
    public void setGet_Feeder_StatusResult(com.bses2.sap.ws.Get_Feeder_StatusResponseGet_Feeder_StatusResult get_Feeder_StatusResult) {
        this.get_Feeder_StatusResult = get_Feeder_StatusResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Feeder_StatusResponse)) return false;
        Get_Feeder_StatusResponse other = (Get_Feeder_StatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Feeder_StatusResult==null && other.getGet_Feeder_StatusResult()==null) || 
             (this.get_Feeder_StatusResult!=null &&
              this.get_Feeder_StatusResult.equals(other.getGet_Feeder_StatusResult())));
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
        if (getGet_Feeder_StatusResult() != null) {
            _hashCode += getGet_Feeder_StatusResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Feeder_StatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Feeder_StatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Feeder_StatusResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Feeder_StatusResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Feeder_StatusResponse>Get_Feeder_StatusResult"));
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
