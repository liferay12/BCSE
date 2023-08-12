/**
 * Get_AutoTrip_feederdetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_AutoTrip_feederdetailsResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponseGet_AutoTrip_feederdetailsResult get_AutoTrip_feederdetailsResult;

    public Get_AutoTrip_feederdetailsResponse() {
    }

    public Get_AutoTrip_feederdetailsResponse(
           com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponseGet_AutoTrip_feederdetailsResult get_AutoTrip_feederdetailsResult) {
           this.get_AutoTrip_feederdetailsResult = get_AutoTrip_feederdetailsResult;
    }


    /**
     * Gets the get_AutoTrip_feederdetailsResult value for this Get_AutoTrip_feederdetailsResponse.
     * 
     * @return get_AutoTrip_feederdetailsResult
     */
    public com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponseGet_AutoTrip_feederdetailsResult getGet_AutoTrip_feederdetailsResult() {
        return get_AutoTrip_feederdetailsResult;
    }


    /**
     * Sets the get_AutoTrip_feederdetailsResult value for this Get_AutoTrip_feederdetailsResponse.
     * 
     * @param get_AutoTrip_feederdetailsResult
     */
    public void setGet_AutoTrip_feederdetailsResult(com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponseGet_AutoTrip_feederdetailsResult get_AutoTrip_feederdetailsResult) {
        this.get_AutoTrip_feederdetailsResult = get_AutoTrip_feederdetailsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_AutoTrip_feederdetailsResponse)) return false;
        Get_AutoTrip_feederdetailsResponse other = (Get_AutoTrip_feederdetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_AutoTrip_feederdetailsResult==null && other.getGet_AutoTrip_feederdetailsResult()==null) || 
             (this.get_AutoTrip_feederdetailsResult!=null &&
              this.get_AutoTrip_feederdetailsResult.equals(other.getGet_AutoTrip_feederdetailsResult())));
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
        if (getGet_AutoTrip_feederdetailsResult() != null) {
            _hashCode += getGet_AutoTrip_feederdetailsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_AutoTrip_feederdetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_AutoTrip_feederdetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_AutoTrip_feederdetailsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_AutoTrip_feederdetailsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_AutoTrip_feederdetailsResponse>Get_AutoTrip_feederdetailsResult"));
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
