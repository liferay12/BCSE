/**
 * ZBAPI_MDI_RES_ORDERResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_MDI_RES_ORDERResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_MDI_RES_ORDERResponseZBAPI_MDI_RES_ORDERResult ZBAPI_MDI_RES_ORDERResult;

    public ZBAPI_MDI_RES_ORDERResponse() {
    }

    public ZBAPI_MDI_RES_ORDERResponse(
           org.tempuri.ZBAPI_MDI_RES_ORDERResponseZBAPI_MDI_RES_ORDERResult ZBAPI_MDI_RES_ORDERResult) {
           this.ZBAPI_MDI_RES_ORDERResult = ZBAPI_MDI_RES_ORDERResult;
    }


    /**
     * Gets the ZBAPI_MDI_RES_ORDERResult value for this ZBAPI_MDI_RES_ORDERResponse.
     * 
     * @return ZBAPI_MDI_RES_ORDERResult
     */
    public org.tempuri.ZBAPI_MDI_RES_ORDERResponseZBAPI_MDI_RES_ORDERResult getZBAPI_MDI_RES_ORDERResult() {
        return ZBAPI_MDI_RES_ORDERResult;
    }


    /**
     * Sets the ZBAPI_MDI_RES_ORDERResult value for this ZBAPI_MDI_RES_ORDERResponse.
     * 
     * @param ZBAPI_MDI_RES_ORDERResult
     */
    public void setZBAPI_MDI_RES_ORDERResult(org.tempuri.ZBAPI_MDI_RES_ORDERResponseZBAPI_MDI_RES_ORDERResult ZBAPI_MDI_RES_ORDERResult) {
        this.ZBAPI_MDI_RES_ORDERResult = ZBAPI_MDI_RES_ORDERResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_MDI_RES_ORDERResponse)) return false;
        ZBAPI_MDI_RES_ORDERResponse other = (ZBAPI_MDI_RES_ORDERResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_MDI_RES_ORDERResult==null && other.getZBAPI_MDI_RES_ORDERResult()==null) || 
             (this.ZBAPI_MDI_RES_ORDERResult!=null &&
              this.ZBAPI_MDI_RES_ORDERResult.equals(other.getZBAPI_MDI_RES_ORDERResult())));
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
        if (getZBAPI_MDI_RES_ORDERResult() != null) {
            _hashCode += getZBAPI_MDI_RES_ORDERResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_MDI_RES_ORDERResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_MDI_RES_ORDERResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_MDI_RES_ORDERResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_MDI_RES_ORDERResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_MDI_RES_ORDERResponse>ZBAPI_MDI_RES_ORDERResult"));
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
