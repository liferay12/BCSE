/**
 * ZBAPI_MDI_USER_CONResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_MDI_USER_CONResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_MDI_USER_CONResponseZBAPI_MDI_USER_CONResult ZBAPI_MDI_USER_CONResult;

    public ZBAPI_MDI_USER_CONResponse() {
    }

    public ZBAPI_MDI_USER_CONResponse(
           org.tempuri.ZBAPI_MDI_USER_CONResponseZBAPI_MDI_USER_CONResult ZBAPI_MDI_USER_CONResult) {
           this.ZBAPI_MDI_USER_CONResult = ZBAPI_MDI_USER_CONResult;
    }


    /**
     * Gets the ZBAPI_MDI_USER_CONResult value for this ZBAPI_MDI_USER_CONResponse.
     * 
     * @return ZBAPI_MDI_USER_CONResult
     */
    public org.tempuri.ZBAPI_MDI_USER_CONResponseZBAPI_MDI_USER_CONResult getZBAPI_MDI_USER_CONResult() {
        return ZBAPI_MDI_USER_CONResult;
    }


    /**
     * Sets the ZBAPI_MDI_USER_CONResult value for this ZBAPI_MDI_USER_CONResponse.
     * 
     * @param ZBAPI_MDI_USER_CONResult
     */
    public void setZBAPI_MDI_USER_CONResult(org.tempuri.ZBAPI_MDI_USER_CONResponseZBAPI_MDI_USER_CONResult ZBAPI_MDI_USER_CONResult) {
        this.ZBAPI_MDI_USER_CONResult = ZBAPI_MDI_USER_CONResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_MDI_USER_CONResponse)) return false;
        ZBAPI_MDI_USER_CONResponse other = (ZBAPI_MDI_USER_CONResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_MDI_USER_CONResult==null && other.getZBAPI_MDI_USER_CONResult()==null) || 
             (this.ZBAPI_MDI_USER_CONResult!=null &&
              this.ZBAPI_MDI_USER_CONResult.equals(other.getZBAPI_MDI_USER_CONResult())));
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
        if (getZBAPI_MDI_USER_CONResult() != null) {
            _hashCode += getZBAPI_MDI_USER_CONResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_MDI_USER_CONResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_MDI_USER_CONResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_MDI_USER_CONResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_MDI_USER_CONResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_MDI_USER_CONResponse>ZBAPI_MDI_USER_CONResult"));
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
