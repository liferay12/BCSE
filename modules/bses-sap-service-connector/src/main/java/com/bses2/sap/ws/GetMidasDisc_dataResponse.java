/**
 * GetMidasDisc_dataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetMidasDisc_dataResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetMidasDisc_dataResponseGetMidasDisc_dataResult getMidasDisc_dataResult;

    public GetMidasDisc_dataResponse() {
    }

    public GetMidasDisc_dataResponse(
           com.bses2.sap.ws.GetMidasDisc_dataResponseGetMidasDisc_dataResult getMidasDisc_dataResult) {
           this.getMidasDisc_dataResult = getMidasDisc_dataResult;
    }


    /**
     * Gets the getMidasDisc_dataResult value for this GetMidasDisc_dataResponse.
     * 
     * @return getMidasDisc_dataResult
     */
    public com.bses2.sap.ws.GetMidasDisc_dataResponseGetMidasDisc_dataResult getGetMidasDisc_dataResult() {
        return getMidasDisc_dataResult;
    }


    /**
     * Sets the getMidasDisc_dataResult value for this GetMidasDisc_dataResponse.
     * 
     * @param getMidasDisc_dataResult
     */
    public void setGetMidasDisc_dataResult(com.bses2.sap.ws.GetMidasDisc_dataResponseGetMidasDisc_dataResult getMidasDisc_dataResult) {
        this.getMidasDisc_dataResult = getMidasDisc_dataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMidasDisc_dataResponse)) return false;
        GetMidasDisc_dataResponse other = (GetMidasDisc_dataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMidasDisc_dataResult==null && other.getGetMidasDisc_dataResult()==null) || 
             (this.getMidasDisc_dataResult!=null &&
              this.getMidasDisc_dataResult.equals(other.getGetMidasDisc_dataResult())));
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
        if (getGetMidasDisc_dataResult() != null) {
            _hashCode += getGetMidasDisc_dataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMidasDisc_dataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMidasDisc_dataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMidasDisc_dataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMidasDisc_dataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMidasDisc_dataResponse>GetMidasDisc_dataResult"));
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
