/**
 * Update_Dispatch_ControlResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Update_Dispatch_ControlResponse  implements java.io.Serializable {
    private org.tempuri.Update_Dispatch_ControlResponseUpdate_Dispatch_ControlResult update_Dispatch_ControlResult;

    public Update_Dispatch_ControlResponse() {
    }

    public Update_Dispatch_ControlResponse(
           org.tempuri.Update_Dispatch_ControlResponseUpdate_Dispatch_ControlResult update_Dispatch_ControlResult) {
           this.update_Dispatch_ControlResult = update_Dispatch_ControlResult;
    }


    /**
     * Gets the update_Dispatch_ControlResult value for this Update_Dispatch_ControlResponse.
     * 
     * @return update_Dispatch_ControlResult
     */
    public org.tempuri.Update_Dispatch_ControlResponseUpdate_Dispatch_ControlResult getUpdate_Dispatch_ControlResult() {
        return update_Dispatch_ControlResult;
    }


    /**
     * Sets the update_Dispatch_ControlResult value for this Update_Dispatch_ControlResponse.
     * 
     * @param update_Dispatch_ControlResult
     */
    public void setUpdate_Dispatch_ControlResult(org.tempuri.Update_Dispatch_ControlResponseUpdate_Dispatch_ControlResult update_Dispatch_ControlResult) {
        this.update_Dispatch_ControlResult = update_Dispatch_ControlResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Update_Dispatch_ControlResponse)) return false;
        Update_Dispatch_ControlResponse other = (Update_Dispatch_ControlResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.update_Dispatch_ControlResult==null && other.getUpdate_Dispatch_ControlResult()==null) || 
             (this.update_Dispatch_ControlResult!=null &&
              this.update_Dispatch_ControlResult.equals(other.getUpdate_Dispatch_ControlResult())));
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
        if (getUpdate_Dispatch_ControlResult() != null) {
            _hashCode += getUpdate_Dispatch_ControlResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Update_Dispatch_ControlResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Update_Dispatch_ControlResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_Dispatch_ControlResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Update_Dispatch_ControlResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Update_Dispatch_ControlResponse>Update_Dispatch_ControlResult"));
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
