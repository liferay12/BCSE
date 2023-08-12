/**
 * ZBAPI_PREPAID_RTGSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_PREPAID_RTGSResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_PREPAID_RTGSResponseZBAPI_PREPAID_RTGSResult ZBAPI_PREPAID_RTGSResult;

    public ZBAPI_PREPAID_RTGSResponse() {
    }

    public ZBAPI_PREPAID_RTGSResponse(
           org.tempuri.ZBAPI_PREPAID_RTGSResponseZBAPI_PREPAID_RTGSResult ZBAPI_PREPAID_RTGSResult) {
           this.ZBAPI_PREPAID_RTGSResult = ZBAPI_PREPAID_RTGSResult;
    }


    /**
     * Gets the ZBAPI_PREPAID_RTGSResult value for this ZBAPI_PREPAID_RTGSResponse.
     * 
     * @return ZBAPI_PREPAID_RTGSResult
     */
    public org.tempuri.ZBAPI_PREPAID_RTGSResponseZBAPI_PREPAID_RTGSResult getZBAPI_PREPAID_RTGSResult() {
        return ZBAPI_PREPAID_RTGSResult;
    }


    /**
     * Sets the ZBAPI_PREPAID_RTGSResult value for this ZBAPI_PREPAID_RTGSResponse.
     * 
     * @param ZBAPI_PREPAID_RTGSResult
     */
    public void setZBAPI_PREPAID_RTGSResult(org.tempuri.ZBAPI_PREPAID_RTGSResponseZBAPI_PREPAID_RTGSResult ZBAPI_PREPAID_RTGSResult) {
        this.ZBAPI_PREPAID_RTGSResult = ZBAPI_PREPAID_RTGSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_PREPAID_RTGSResponse)) return false;
        ZBAPI_PREPAID_RTGSResponse other = (ZBAPI_PREPAID_RTGSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_PREPAID_RTGSResult==null && other.getZBAPI_PREPAID_RTGSResult()==null) || 
             (this.ZBAPI_PREPAID_RTGSResult!=null &&
              this.ZBAPI_PREPAID_RTGSResult.equals(other.getZBAPI_PREPAID_RTGSResult())));
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
        if (getZBAPI_PREPAID_RTGSResult() != null) {
            _hashCode += getZBAPI_PREPAID_RTGSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_PREPAID_RTGSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_PREPAID_RTGSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_PREPAID_RTGSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_PREPAID_RTGSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_PREPAID_RTGSResponse>ZBAPI_PREPAID_RTGSResult"));
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
