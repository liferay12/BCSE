/**
 * GetClosingRemarksFromCategoryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetClosingRemarksFromCategoryResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetClosingRemarksFromCategoryResponseGetClosingRemarksFromCategoryResult getClosingRemarksFromCategoryResult;

    public GetClosingRemarksFromCategoryResponse() {
    }

    public GetClosingRemarksFromCategoryResponse(
           com.bses2.sap.ws.GetClosingRemarksFromCategoryResponseGetClosingRemarksFromCategoryResult getClosingRemarksFromCategoryResult) {
           this.getClosingRemarksFromCategoryResult = getClosingRemarksFromCategoryResult;
    }


    /**
     * Gets the getClosingRemarksFromCategoryResult value for this GetClosingRemarksFromCategoryResponse.
     * 
     * @return getClosingRemarksFromCategoryResult
     */
    public com.bses2.sap.ws.GetClosingRemarksFromCategoryResponseGetClosingRemarksFromCategoryResult getGetClosingRemarksFromCategoryResult() {
        return getClosingRemarksFromCategoryResult;
    }


    /**
     * Sets the getClosingRemarksFromCategoryResult value for this GetClosingRemarksFromCategoryResponse.
     * 
     * @param getClosingRemarksFromCategoryResult
     */
    public void setGetClosingRemarksFromCategoryResult(com.bses2.sap.ws.GetClosingRemarksFromCategoryResponseGetClosingRemarksFromCategoryResult getClosingRemarksFromCategoryResult) {
        this.getClosingRemarksFromCategoryResult = getClosingRemarksFromCategoryResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetClosingRemarksFromCategoryResponse)) return false;
        GetClosingRemarksFromCategoryResponse other = (GetClosingRemarksFromCategoryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getClosingRemarksFromCategoryResult==null && other.getGetClosingRemarksFromCategoryResult()==null) || 
             (this.getClosingRemarksFromCategoryResult!=null &&
              this.getClosingRemarksFromCategoryResult.equals(other.getGetClosingRemarksFromCategoryResult())));
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
        if (getGetClosingRemarksFromCategoryResult() != null) {
            _hashCode += getGetClosingRemarksFromCategoryResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetClosingRemarksFromCategoryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetClosingRemarksFromCategoryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getClosingRemarksFromCategoryResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetClosingRemarksFromCategoryResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetClosingRemarksFromCategoryResponse>GetClosingRemarksFromCategoryResult"));
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
