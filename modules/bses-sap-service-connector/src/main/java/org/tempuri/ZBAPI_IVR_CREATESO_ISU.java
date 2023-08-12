/**
 * ZBAPI_IVR_CREATESO_ISU.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_IVR_CREATESO_ISU  implements java.io.Serializable {
    private java.lang.String strCANumber;

    private java.lang.String strCACrn;

    private java.lang.String strCAKNumber;

    private java.lang.String strMeterNumber;

    private java.lang.String strISUOrder;

    private java.lang.String strComplaintType;

    private java.lang.String strContractNumber;

    private java.lang.String strTelephoneNo;

    private java.lang.String strDescription;

    public ZBAPI_IVR_CREATESO_ISU() {
    }

    public ZBAPI_IVR_CREATESO_ISU(
           java.lang.String strCANumber,
           java.lang.String strCACrn,
           java.lang.String strCAKNumber,
           java.lang.String strMeterNumber,
           java.lang.String strISUOrder,
           java.lang.String strComplaintType,
           java.lang.String strContractNumber,
           java.lang.String strTelephoneNo,
           java.lang.String strDescription) {
           this.strCANumber = strCANumber;
           this.strCACrn = strCACrn;
           this.strCAKNumber = strCAKNumber;
           this.strMeterNumber = strMeterNumber;
           this.strISUOrder = strISUOrder;
           this.strComplaintType = strComplaintType;
           this.strContractNumber = strContractNumber;
           this.strTelephoneNo = strTelephoneNo;
           this.strDescription = strDescription;
    }


    /**
     * Gets the strCANumber value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @return strCANumber
     */
    public java.lang.String getStrCANumber() {
        return strCANumber;
    }


    /**
     * Sets the strCANumber value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @param strCANumber
     */
    public void setStrCANumber(java.lang.String strCANumber) {
        this.strCANumber = strCANumber;
    }


    /**
     * Gets the strCACrn value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @return strCACrn
     */
    public java.lang.String getStrCACrn() {
        return strCACrn;
    }


    /**
     * Sets the strCACrn value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @param strCACrn
     */
    public void setStrCACrn(java.lang.String strCACrn) {
        this.strCACrn = strCACrn;
    }


    /**
     * Gets the strCAKNumber value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @return strCAKNumber
     */
    public java.lang.String getStrCAKNumber() {
        return strCAKNumber;
    }


    /**
     * Sets the strCAKNumber value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @param strCAKNumber
     */
    public void setStrCAKNumber(java.lang.String strCAKNumber) {
        this.strCAKNumber = strCAKNumber;
    }


    /**
     * Gets the strMeterNumber value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @return strMeterNumber
     */
    public java.lang.String getStrMeterNumber() {
        return strMeterNumber;
    }


    /**
     * Sets the strMeterNumber value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @param strMeterNumber
     */
    public void setStrMeterNumber(java.lang.String strMeterNumber) {
        this.strMeterNumber = strMeterNumber;
    }


    /**
     * Gets the strISUOrder value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @return strISUOrder
     */
    public java.lang.String getStrISUOrder() {
        return strISUOrder;
    }


    /**
     * Sets the strISUOrder value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @param strISUOrder
     */
    public void setStrISUOrder(java.lang.String strISUOrder) {
        this.strISUOrder = strISUOrder;
    }


    /**
     * Gets the strComplaintType value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @return strComplaintType
     */
    public java.lang.String getStrComplaintType() {
        return strComplaintType;
    }


    /**
     * Sets the strComplaintType value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @param strComplaintType
     */
    public void setStrComplaintType(java.lang.String strComplaintType) {
        this.strComplaintType = strComplaintType;
    }


    /**
     * Gets the strContractNumber value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @return strContractNumber
     */
    public java.lang.String getStrContractNumber() {
        return strContractNumber;
    }


    /**
     * Sets the strContractNumber value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @param strContractNumber
     */
    public void setStrContractNumber(java.lang.String strContractNumber) {
        this.strContractNumber = strContractNumber;
    }


    /**
     * Gets the strTelephoneNo value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @return strTelephoneNo
     */
    public java.lang.String getStrTelephoneNo() {
        return strTelephoneNo;
    }


    /**
     * Sets the strTelephoneNo value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @param strTelephoneNo
     */
    public void setStrTelephoneNo(java.lang.String strTelephoneNo) {
        this.strTelephoneNo = strTelephoneNo;
    }


    /**
     * Gets the strDescription value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @return strDescription
     */
    public java.lang.String getStrDescription() {
        return strDescription;
    }


    /**
     * Sets the strDescription value for this ZBAPI_IVR_CREATESO_ISU.
     * 
     * @param strDescription
     */
    public void setStrDescription(java.lang.String strDescription) {
        this.strDescription = strDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_IVR_CREATESO_ISU)) return false;
        ZBAPI_IVR_CREATESO_ISU other = (ZBAPI_IVR_CREATESO_ISU) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCANumber==null && other.getStrCANumber()==null) || 
             (this.strCANumber!=null &&
              this.strCANumber.equals(other.getStrCANumber()))) &&
            ((this.strCACrn==null && other.getStrCACrn()==null) || 
             (this.strCACrn!=null &&
              this.strCACrn.equals(other.getStrCACrn()))) &&
            ((this.strCAKNumber==null && other.getStrCAKNumber()==null) || 
             (this.strCAKNumber!=null &&
              this.strCAKNumber.equals(other.getStrCAKNumber()))) &&
            ((this.strMeterNumber==null && other.getStrMeterNumber()==null) || 
             (this.strMeterNumber!=null &&
              this.strMeterNumber.equals(other.getStrMeterNumber()))) &&
            ((this.strISUOrder==null && other.getStrISUOrder()==null) || 
             (this.strISUOrder!=null &&
              this.strISUOrder.equals(other.getStrISUOrder()))) &&
            ((this.strComplaintType==null && other.getStrComplaintType()==null) || 
             (this.strComplaintType!=null &&
              this.strComplaintType.equals(other.getStrComplaintType()))) &&
            ((this.strContractNumber==null && other.getStrContractNumber()==null) || 
             (this.strContractNumber!=null &&
              this.strContractNumber.equals(other.getStrContractNumber()))) &&
            ((this.strTelephoneNo==null && other.getStrTelephoneNo()==null) || 
             (this.strTelephoneNo!=null &&
              this.strTelephoneNo.equals(other.getStrTelephoneNo()))) &&
            ((this.strDescription==null && other.getStrDescription()==null) || 
             (this.strDescription!=null &&
              this.strDescription.equals(other.getStrDescription())));
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
        if (getStrCANumber() != null) {
            _hashCode += getStrCANumber().hashCode();
        }
        if (getStrCACrn() != null) {
            _hashCode += getStrCACrn().hashCode();
        }
        if (getStrCAKNumber() != null) {
            _hashCode += getStrCAKNumber().hashCode();
        }
        if (getStrMeterNumber() != null) {
            _hashCode += getStrMeterNumber().hashCode();
        }
        if (getStrISUOrder() != null) {
            _hashCode += getStrISUOrder().hashCode();
        }
        if (getStrComplaintType() != null) {
            _hashCode += getStrComplaintType().hashCode();
        }
        if (getStrContractNumber() != null) {
            _hashCode += getStrContractNumber().hashCode();
        }
        if (getStrTelephoneNo() != null) {
            _hashCode += getStrTelephoneNo().hashCode();
        }
        if (getStrDescription() != null) {
            _hashCode += getStrDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_IVR_CREATESO_ISU.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_IVR_CREATESO_ISU"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCACrn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCACrn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCAKNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCAKNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strMeterNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strMeterNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strISUOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strISUOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strComplaintType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strComplaintType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strContractNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strContractNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strTelephoneNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strTelephoneNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
