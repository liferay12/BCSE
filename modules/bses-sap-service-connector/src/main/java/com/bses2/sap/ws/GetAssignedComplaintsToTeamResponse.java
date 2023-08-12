/**
 * GetAssignedComplaintsToTeamResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class GetAssignedComplaintsToTeamResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.GetAssignedComplaintsToTeamResponseGetAssignedComplaintsToTeamResult getAssignedComplaintsToTeamResult;

    public GetAssignedComplaintsToTeamResponse() {
    }

    public GetAssignedComplaintsToTeamResponse(
           com.bses2.sap.ws.GetAssignedComplaintsToTeamResponseGetAssignedComplaintsToTeamResult getAssignedComplaintsToTeamResult) {
           this.getAssignedComplaintsToTeamResult = getAssignedComplaintsToTeamResult;
    }


    /**
     * Gets the getAssignedComplaintsToTeamResult value for this GetAssignedComplaintsToTeamResponse.
     * 
     * @return getAssignedComplaintsToTeamResult
     */
    public com.bses2.sap.ws.GetAssignedComplaintsToTeamResponseGetAssignedComplaintsToTeamResult getGetAssignedComplaintsToTeamResult() {
        return getAssignedComplaintsToTeamResult;
    }


    /**
     * Sets the getAssignedComplaintsToTeamResult value for this GetAssignedComplaintsToTeamResponse.
     * 
     * @param getAssignedComplaintsToTeamResult
     */
    public void setGetAssignedComplaintsToTeamResult(com.bses2.sap.ws.GetAssignedComplaintsToTeamResponseGetAssignedComplaintsToTeamResult getAssignedComplaintsToTeamResult) {
        this.getAssignedComplaintsToTeamResult = getAssignedComplaintsToTeamResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAssignedComplaintsToTeamResponse)) return false;
        GetAssignedComplaintsToTeamResponse other = (GetAssignedComplaintsToTeamResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAssignedComplaintsToTeamResult==null && other.getGetAssignedComplaintsToTeamResult()==null) || 
             (this.getAssignedComplaintsToTeamResult!=null &&
              this.getAssignedComplaintsToTeamResult.equals(other.getGetAssignedComplaintsToTeamResult())));
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
        if (getGetAssignedComplaintsToTeamResult() != null) {
            _hashCode += getGetAssignedComplaintsToTeamResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAssignedComplaintsToTeamResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAssignedComplaintsToTeamResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAssignedComplaintsToTeamResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAssignedComplaintsToTeamResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAssignedComplaintsToTeamResponse>GetAssignedComplaintsToTeamResult"));
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
