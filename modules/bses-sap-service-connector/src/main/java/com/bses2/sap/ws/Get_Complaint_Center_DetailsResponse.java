/**
 * Get_Complaint_Center_DetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Complaint_Center_DetailsResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Complaint_Center_DetailsResponseGet_Complaint_Center_DetailsResult get_Complaint_Center_DetailsResult;

    public Get_Complaint_Center_DetailsResponse() {
    }

    public Get_Complaint_Center_DetailsResponse(
           com.bses2.sap.ws.Get_Complaint_Center_DetailsResponseGet_Complaint_Center_DetailsResult get_Complaint_Center_DetailsResult) {
           this.get_Complaint_Center_DetailsResult = get_Complaint_Center_DetailsResult;
    }


    /**
     * Gets the get_Complaint_Center_DetailsResult value for this Get_Complaint_Center_DetailsResponse.
     * 
     * @return get_Complaint_Center_DetailsResult
     */
    public com.bses2.sap.ws.Get_Complaint_Center_DetailsResponseGet_Complaint_Center_DetailsResult getGet_Complaint_Center_DetailsResult() {
        return get_Complaint_Center_DetailsResult;
    }


    /**
     * Sets the get_Complaint_Center_DetailsResult value for this Get_Complaint_Center_DetailsResponse.
     * 
     * @param get_Complaint_Center_DetailsResult
     */
    public void setGet_Complaint_Center_DetailsResult(com.bses2.sap.ws.Get_Complaint_Center_DetailsResponseGet_Complaint_Center_DetailsResult get_Complaint_Center_DetailsResult) {
        this.get_Complaint_Center_DetailsResult = get_Complaint_Center_DetailsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Complaint_Center_DetailsResponse)) return false;
        Get_Complaint_Center_DetailsResponse other = (Get_Complaint_Center_DetailsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Complaint_Center_DetailsResult==null && other.getGet_Complaint_Center_DetailsResult()==null) || 
             (this.get_Complaint_Center_DetailsResult!=null &&
              this.get_Complaint_Center_DetailsResult.equals(other.getGet_Complaint_Center_DetailsResult())));
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
        if (getGet_Complaint_Center_DetailsResult() != null) {
            _hashCode += getGet_Complaint_Center_DetailsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Complaint_Center_DetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Complaint_Center_DetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Complaint_Center_DetailsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Complaint_Center_DetailsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Complaint_Center_DetailsResponse>Get_Complaint_Center_DetailsResult"));
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
