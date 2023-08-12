/**
 * ZCSUPDAT_PERSONAL_DETAILSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZCSUPDAT_PERSONAL_DETAILSResponse  implements java.io.Serializable {
    private org.tempuri.ZCSUPDAT_PERSONAL_DETAILSResponseZCSUPDAT_PERSONAL_DETAILSResult ZCSUPDAT_PERSONAL_DETAILSResult;

    public ZCSUPDAT_PERSONAL_DETAILSResponse() {
    }

    public ZCSUPDAT_PERSONAL_DETAILSResponse(
           org.tempuri.ZCSUPDAT_PERSONAL_DETAILSResponseZCSUPDAT_PERSONAL_DETAILSResult ZCSUPDAT_PERSONAL_DETAILSResult) {
           this.ZCSUPDAT_PERSONAL_DETAILSResult = ZCSUPDAT_PERSONAL_DETAILSResult;
    }


    /**
     * Gets the ZCSUPDAT_PERSONAL_DETAILSResult value for this ZCSUPDAT_PERSONAL_DETAILSResponse.
     * 
     * @return ZCSUPDAT_PERSONAL_DETAILSResult
     */
    public org.tempuri.ZCSUPDAT_PERSONAL_DETAILSResponseZCSUPDAT_PERSONAL_DETAILSResult getZCSUPDAT_PERSONAL_DETAILSResult() {
        return ZCSUPDAT_PERSONAL_DETAILSResult;
    }


    /**
     * Sets the ZCSUPDAT_PERSONAL_DETAILSResult value for this ZCSUPDAT_PERSONAL_DETAILSResponse.
     * 
     * @param ZCSUPDAT_PERSONAL_DETAILSResult
     */
    public void setZCSUPDAT_PERSONAL_DETAILSResult(org.tempuri.ZCSUPDAT_PERSONAL_DETAILSResponseZCSUPDAT_PERSONAL_DETAILSResult ZCSUPDAT_PERSONAL_DETAILSResult) {
        this.ZCSUPDAT_PERSONAL_DETAILSResult = ZCSUPDAT_PERSONAL_DETAILSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZCSUPDAT_PERSONAL_DETAILSResponse)) return false;
        ZCSUPDAT_PERSONAL_DETAILSResponse other = (ZCSUPDAT_PERSONAL_DETAILSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZCSUPDAT_PERSONAL_DETAILSResult==null && other.getZCSUPDAT_PERSONAL_DETAILSResult()==null) || 
             (this.ZCSUPDAT_PERSONAL_DETAILSResult!=null &&
              this.ZCSUPDAT_PERSONAL_DETAILSResult.equals(other.getZCSUPDAT_PERSONAL_DETAILSResult())));
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
        if (getZCSUPDAT_PERSONAL_DETAILSResult() != null) {
            _hashCode += getZCSUPDAT_PERSONAL_DETAILSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZCSUPDAT_PERSONAL_DETAILSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZCSUPDAT_PERSONAL_DETAILSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZCSUPDAT_PERSONAL_DETAILSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZCSUPDAT_PERSONAL_DETAILSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZCSUPDAT_PERSONAL_DETAILSResponse>ZCSUPDAT_PERSONAL_DETAILSResult"));
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
