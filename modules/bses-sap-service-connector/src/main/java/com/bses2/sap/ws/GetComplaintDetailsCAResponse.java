/**
 * GetComplaintDetailsCAResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetComplaintDetailsCAResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetComplaintDetailsCAResponseGetComplaintDetailsCAResult getComplaintDetailsCAResult;

    public GetComplaintDetailsCAResponse() {
    }

    public GetComplaintDetailsCAResponse(
           com.bses2.sap.ws.GetComplaintDetailsCAResponseGetComplaintDetailsCAResult getComplaintDetailsCAResult) {
           this.getComplaintDetailsCAResult = getComplaintDetailsCAResult;
    }


    /**
     * Gets the getComplaintDetailsCAResult value for this GetComplaintDetailsCAResponse.
     * 
     * @return getComplaintDetailsCAResult
     */
    public com.bses2.sap.ws.GetComplaintDetailsCAResponseGetComplaintDetailsCAResult getGetComplaintDetailsCAResult() {
        return getComplaintDetailsCAResult;
    }


    /**
     * Sets the getComplaintDetailsCAResult value for this GetComplaintDetailsCAResponse.
     * 
     * @param getComplaintDetailsCAResult
     */
    public void setGetComplaintDetailsCAResult(com.bses2.sap.ws.GetComplaintDetailsCAResponseGetComplaintDetailsCAResult getComplaintDetailsCAResult) {
        this.getComplaintDetailsCAResult = getComplaintDetailsCAResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetComplaintDetailsCAResponse)) return false;
        GetComplaintDetailsCAResponse other = (GetComplaintDetailsCAResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getComplaintDetailsCAResult==null && other.getGetComplaintDetailsCAResult()==null) || 
             (this.getComplaintDetailsCAResult!=null &&
              this.getComplaintDetailsCAResult.equals(other.getGetComplaintDetailsCAResult())));
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
        if (getGetComplaintDetailsCAResult() != null) {
            _hashCode += getGetComplaintDetailsCAResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetComplaintDetailsCAResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetComplaintDetailsCAResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getComplaintDetailsCAResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetComplaintDetailsCAResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetComplaintDetailsCAResponse>GetComplaintDetailsCAResult"));
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
