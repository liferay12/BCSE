/**
 * ZBI_WEBBILL_HISTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBI_WEBBILL_HISTResponse  implements java.io.Serializable {
    private org.tempuri.ZBI_WEBBILL_HISTResponseZBI_WEBBILL_HISTResult ZBI_WEBBILL_HISTResult;

    public ZBI_WEBBILL_HISTResponse() {
    }

    public ZBI_WEBBILL_HISTResponse(
           org.tempuri.ZBI_WEBBILL_HISTResponseZBI_WEBBILL_HISTResult ZBI_WEBBILL_HISTResult) {
           this.ZBI_WEBBILL_HISTResult = ZBI_WEBBILL_HISTResult;
    }


    /**
     * Gets the ZBI_WEBBILL_HISTResult value for this ZBI_WEBBILL_HISTResponse.
     * 
     * @return ZBI_WEBBILL_HISTResult
     */
    public org.tempuri.ZBI_WEBBILL_HISTResponseZBI_WEBBILL_HISTResult getZBI_WEBBILL_HISTResult() {
        return ZBI_WEBBILL_HISTResult;
    }


    /**
     * Sets the ZBI_WEBBILL_HISTResult value for this ZBI_WEBBILL_HISTResponse.
     * 
     * @param ZBI_WEBBILL_HISTResult
     */
    public void setZBI_WEBBILL_HISTResult(org.tempuri.ZBI_WEBBILL_HISTResponseZBI_WEBBILL_HISTResult ZBI_WEBBILL_HISTResult) {
        this.ZBI_WEBBILL_HISTResult = ZBI_WEBBILL_HISTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBI_WEBBILL_HISTResponse)) return false;
        ZBI_WEBBILL_HISTResponse other = (ZBI_WEBBILL_HISTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBI_WEBBILL_HISTResult==null && other.getZBI_WEBBILL_HISTResult()==null) || 
             (this.ZBI_WEBBILL_HISTResult!=null &&
              this.ZBI_WEBBILL_HISTResult.equals(other.getZBI_WEBBILL_HISTResult())));
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
        if (getZBI_WEBBILL_HISTResult() != null) {
            _hashCode += getZBI_WEBBILL_HISTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBI_WEBBILL_HISTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBI_WEBBILL_HISTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBI_WEBBILL_HISTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBI_WEBBILL_HISTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBI_WEBBILL_HISTResponse>ZBI_WEBBILL_HISTResult"));
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
