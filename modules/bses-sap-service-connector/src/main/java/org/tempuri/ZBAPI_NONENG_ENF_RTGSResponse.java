/**
 * ZBAPI_NONENG_ENF_RTGSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_NONENG_ENF_RTGSResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPI_NONENG_ENF_RTGSResponseZBAPI_NONENG_ENF_RTGSResult ZBAPI_NONENG_ENF_RTGSResult;

    public ZBAPI_NONENG_ENF_RTGSResponse() {
    }

    public ZBAPI_NONENG_ENF_RTGSResponse(
           org.tempuri.ZBAPI_NONENG_ENF_RTGSResponseZBAPI_NONENG_ENF_RTGSResult ZBAPI_NONENG_ENF_RTGSResult) {
           this.ZBAPI_NONENG_ENF_RTGSResult = ZBAPI_NONENG_ENF_RTGSResult;
    }


    /**
     * Gets the ZBAPI_NONENG_ENF_RTGSResult value for this ZBAPI_NONENG_ENF_RTGSResponse.
     * 
     * @return ZBAPI_NONENG_ENF_RTGSResult
     */
    public org.tempuri.ZBAPI_NONENG_ENF_RTGSResponseZBAPI_NONENG_ENF_RTGSResult getZBAPI_NONENG_ENF_RTGSResult() {
        return ZBAPI_NONENG_ENF_RTGSResult;
    }


    /**
     * Sets the ZBAPI_NONENG_ENF_RTGSResult value for this ZBAPI_NONENG_ENF_RTGSResponse.
     * 
     * @param ZBAPI_NONENG_ENF_RTGSResult
     */
    public void setZBAPI_NONENG_ENF_RTGSResult(org.tempuri.ZBAPI_NONENG_ENF_RTGSResponseZBAPI_NONENG_ENF_RTGSResult ZBAPI_NONENG_ENF_RTGSResult) {
        this.ZBAPI_NONENG_ENF_RTGSResult = ZBAPI_NONENG_ENF_RTGSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_NONENG_ENF_RTGSResponse)) return false;
        ZBAPI_NONENG_ENF_RTGSResponse other = (ZBAPI_NONENG_ENF_RTGSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_NONENG_ENF_RTGSResult==null && other.getZBAPI_NONENG_ENF_RTGSResult()==null) || 
             (this.ZBAPI_NONENG_ENF_RTGSResult!=null &&
              this.ZBAPI_NONENG_ENF_RTGSResult.equals(other.getZBAPI_NONENG_ENF_RTGSResult())));
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
        if (getZBAPI_NONENG_ENF_RTGSResult() != null) {
            _hashCode += getZBAPI_NONENG_ENF_RTGSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_NONENG_ENF_RTGSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_NONENG_ENF_RTGSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_NONENG_ENF_RTGSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_NONENG_ENF_RTGSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_NONENG_ENF_RTGSResponse>ZBAPI_NONENG_ENF_RTGSResult"));
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
