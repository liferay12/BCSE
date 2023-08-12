/**
 * ZBAPI_TEAM_ALLOCATIONResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_TEAM_ALLOCATIONResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_TEAM_ALLOCATIONResponseZBAPI_TEAM_ALLOCATIONResult ZBAPI_TEAM_ALLOCATIONResult;

    public ZBAPI_TEAM_ALLOCATIONResponse() {
    }

    public ZBAPI_TEAM_ALLOCATIONResponse(
           org.tempuri.ZBAPI_TEAM_ALLOCATIONResponseZBAPI_TEAM_ALLOCATIONResult ZBAPI_TEAM_ALLOCATIONResult) {
           this.ZBAPI_TEAM_ALLOCATIONResult = ZBAPI_TEAM_ALLOCATIONResult;
    }


    /**
     * Gets the ZBAPI_TEAM_ALLOCATIONResult value for this ZBAPI_TEAM_ALLOCATIONResponse.
     * 
     * @return ZBAPI_TEAM_ALLOCATIONResult
     */
    public org.tempuri.ZBAPI_TEAM_ALLOCATIONResponseZBAPI_TEAM_ALLOCATIONResult getZBAPI_TEAM_ALLOCATIONResult() {
        return ZBAPI_TEAM_ALLOCATIONResult;
    }


    /**
     * Sets the ZBAPI_TEAM_ALLOCATIONResult value for this ZBAPI_TEAM_ALLOCATIONResponse.
     * 
     * @param ZBAPI_TEAM_ALLOCATIONResult
     */
    public void setZBAPI_TEAM_ALLOCATIONResult(org.tempuri.ZBAPI_TEAM_ALLOCATIONResponseZBAPI_TEAM_ALLOCATIONResult ZBAPI_TEAM_ALLOCATIONResult) {
        this.ZBAPI_TEAM_ALLOCATIONResult = ZBAPI_TEAM_ALLOCATIONResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_TEAM_ALLOCATIONResponse)) return false;
        ZBAPI_TEAM_ALLOCATIONResponse other = (ZBAPI_TEAM_ALLOCATIONResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_TEAM_ALLOCATIONResult==null && other.getZBAPI_TEAM_ALLOCATIONResult()==null) || 
             (this.ZBAPI_TEAM_ALLOCATIONResult!=null &&
              this.ZBAPI_TEAM_ALLOCATIONResult.equals(other.getZBAPI_TEAM_ALLOCATIONResult())));
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
        if (getZBAPI_TEAM_ALLOCATIONResult() != null) {
            _hashCode += getZBAPI_TEAM_ALLOCATIONResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_TEAM_ALLOCATIONResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_TEAM_ALLOCATIONResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_TEAM_ALLOCATIONResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_TEAM_ALLOCATIONResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_TEAM_ALLOCATIONResponse>ZBAPI_TEAM_ALLOCATIONResult"));
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
