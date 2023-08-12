/**
 * ZBAPIEBIZORDSTATUSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPIEBIZORDSTATUSResponse  implements java.io.Serializable {
    private org.tempuri.ZBAPIEBIZORDSTATUSResponseZBAPIEBIZORDSTATUSResult ZBAPIEBIZORDSTATUSResult;

    public ZBAPIEBIZORDSTATUSResponse() {
    }

    public ZBAPIEBIZORDSTATUSResponse(
           org.tempuri.ZBAPIEBIZORDSTATUSResponseZBAPIEBIZORDSTATUSResult ZBAPIEBIZORDSTATUSResult) {
           this.ZBAPIEBIZORDSTATUSResult = ZBAPIEBIZORDSTATUSResult;
    }


    /**
     * Gets the ZBAPIEBIZORDSTATUSResult value for this ZBAPIEBIZORDSTATUSResponse.
     * 
     * @return ZBAPIEBIZORDSTATUSResult
     */
    public org.tempuri.ZBAPIEBIZORDSTATUSResponseZBAPIEBIZORDSTATUSResult getZBAPIEBIZORDSTATUSResult() {
        return ZBAPIEBIZORDSTATUSResult;
    }


    /**
     * Sets the ZBAPIEBIZORDSTATUSResult value for this ZBAPIEBIZORDSTATUSResponse.
     * 
     * @param ZBAPIEBIZORDSTATUSResult
     */
    public void setZBAPIEBIZORDSTATUSResult(org.tempuri.ZBAPIEBIZORDSTATUSResponseZBAPIEBIZORDSTATUSResult ZBAPIEBIZORDSTATUSResult) {
        this.ZBAPIEBIZORDSTATUSResult = ZBAPIEBIZORDSTATUSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPIEBIZORDSTATUSResponse)) return false;
        ZBAPIEBIZORDSTATUSResponse other = (ZBAPIEBIZORDSTATUSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPIEBIZORDSTATUSResult==null && other.getZBAPIEBIZORDSTATUSResult()==null) || 
             (this.ZBAPIEBIZORDSTATUSResult!=null &&
              this.ZBAPIEBIZORDSTATUSResult.equals(other.getZBAPIEBIZORDSTATUSResult())));
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
        if (getZBAPIEBIZORDSTATUSResult() != null) {
            _hashCode += getZBAPIEBIZORDSTATUSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPIEBIZORDSTATUSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPIEBIZORDSTATUSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPIEBIZORDSTATUSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPIEBIZORDSTATUSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPIEBIZORDSTATUSResponse>ZBAPIEBIZORDSTATUSResult"));
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
