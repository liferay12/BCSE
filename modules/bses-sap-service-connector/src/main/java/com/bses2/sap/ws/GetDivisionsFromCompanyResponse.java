/**
 * GetDivisionsFromCompanyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetDivisionsFromCompanyResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetDivisionsFromCompanyResponseGetDivisionsFromCompanyResult getDivisionsFromCompanyResult;

    public GetDivisionsFromCompanyResponse() {
    }

    public GetDivisionsFromCompanyResponse(
           com.bses2.sap.ws.GetDivisionsFromCompanyResponseGetDivisionsFromCompanyResult getDivisionsFromCompanyResult) {
           this.getDivisionsFromCompanyResult = getDivisionsFromCompanyResult;
    }


    /**
     * Gets the getDivisionsFromCompanyResult value for this GetDivisionsFromCompanyResponse.
     * 
     * @return getDivisionsFromCompanyResult
     */
    public com.bses2.sap.ws.GetDivisionsFromCompanyResponseGetDivisionsFromCompanyResult getGetDivisionsFromCompanyResult() {
        return getDivisionsFromCompanyResult;
    }


    /**
     * Sets the getDivisionsFromCompanyResult value for this GetDivisionsFromCompanyResponse.
     * 
     * @param getDivisionsFromCompanyResult
     */
    public void setGetDivisionsFromCompanyResult(com.bses2.sap.ws.GetDivisionsFromCompanyResponseGetDivisionsFromCompanyResult getDivisionsFromCompanyResult) {
        this.getDivisionsFromCompanyResult = getDivisionsFromCompanyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDivisionsFromCompanyResponse)) return false;
        GetDivisionsFromCompanyResponse other = (GetDivisionsFromCompanyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDivisionsFromCompanyResult==null && other.getGetDivisionsFromCompanyResult()==null) || 
             (this.getDivisionsFromCompanyResult!=null &&
              this.getDivisionsFromCompanyResult.equals(other.getGetDivisionsFromCompanyResult())));
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
        if (getGetDivisionsFromCompanyResult() != null) {
            _hashCode += getGetDivisionsFromCompanyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDivisionsFromCompanyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDivisionsFromCompanyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDivisionsFromCompanyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDivisionsFromCompanyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDivisionsFromCompanyResponse>GetDivisionsFromCompanyResult"));
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
