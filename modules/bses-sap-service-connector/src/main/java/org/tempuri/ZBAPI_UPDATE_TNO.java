/**
 * ZBAPI_UPDATE_TNO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ZBAPI_UPDATE_TNO  implements java.io.Serializable {
    private java.lang.String strCA_no;

    private java.lang.String strTelephone;

    private java.lang.String strMobile;

    private java.lang.String strEmail;

    private java.lang.String strLandmark;

    private java.lang.String strDISPATCH_CTRL;

    public ZBAPI_UPDATE_TNO() {
    }

    public ZBAPI_UPDATE_TNO(
           java.lang.String strCA_no,
           java.lang.String strTelephone,
           java.lang.String strMobile,
           java.lang.String strEmail,
           java.lang.String strLandmark,
           java.lang.String strDISPATCH_CTRL) {
           this.strCA_no = strCA_no;
           this.strTelephone = strTelephone;
           this.strMobile = strMobile;
           this.strEmail = strEmail;
           this.strLandmark = strLandmark;
           this.strDISPATCH_CTRL = strDISPATCH_CTRL;
    }


    /**
     * Gets the strCA_no value for this ZBAPI_UPDATE_TNO.
     * 
     * @return strCA_no
     */
    public java.lang.String getStrCA_no() {
        return strCA_no;
    }


    /**
     * Sets the strCA_no value for this ZBAPI_UPDATE_TNO.
     * 
     * @param strCA_no
     */
    public void setStrCA_no(java.lang.String strCA_no) {
        this.strCA_no = strCA_no;
    }


    /**
     * Gets the strTelephone value for this ZBAPI_UPDATE_TNO.
     * 
     * @return strTelephone
     */
    public java.lang.String getStrTelephone() {
        return strTelephone;
    }


    /**
     * Sets the strTelephone value for this ZBAPI_UPDATE_TNO.
     * 
     * @param strTelephone
     */
    public void setStrTelephone(java.lang.String strTelephone) {
        this.strTelephone = strTelephone;
    }


    /**
     * Gets the strMobile value for this ZBAPI_UPDATE_TNO.
     * 
     * @return strMobile
     */
    public java.lang.String getStrMobile() {
        return strMobile;
    }


    /**
     * Sets the strMobile value for this ZBAPI_UPDATE_TNO.
     * 
     * @param strMobile
     */
    public void setStrMobile(java.lang.String strMobile) {
        this.strMobile = strMobile;
    }


    /**
     * Gets the strEmail value for this ZBAPI_UPDATE_TNO.
     * 
     * @return strEmail
     */
    public java.lang.String getStrEmail() {
        return strEmail;
    }


    /**
     * Sets the strEmail value for this ZBAPI_UPDATE_TNO.
     * 
     * @param strEmail
     */
    public void setStrEmail(java.lang.String strEmail) {
        this.strEmail = strEmail;
    }


    /**
     * Gets the strLandmark value for this ZBAPI_UPDATE_TNO.
     * 
     * @return strLandmark
     */
    public java.lang.String getStrLandmark() {
        return strLandmark;
    }


    /**
     * Sets the strLandmark value for this ZBAPI_UPDATE_TNO.
     * 
     * @param strLandmark
     */
    public void setStrLandmark(java.lang.String strLandmark) {
        this.strLandmark = strLandmark;
    }


    /**
     * Gets the strDISPATCH_CTRL value for this ZBAPI_UPDATE_TNO.
     * 
     * @return strDISPATCH_CTRL
     */
    public java.lang.String getStrDISPATCH_CTRL() {
        return strDISPATCH_CTRL;
    }


    /**
     * Sets the strDISPATCH_CTRL value for this ZBAPI_UPDATE_TNO.
     * 
     * @param strDISPATCH_CTRL
     */
    public void setStrDISPATCH_CTRL(java.lang.String strDISPATCH_CTRL) {
        this.strDISPATCH_CTRL = strDISPATCH_CTRL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_UPDATE_TNO)) return false;
        ZBAPI_UPDATE_TNO other = (ZBAPI_UPDATE_TNO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strCA_no==null && other.getStrCA_no()==null) || 
             (this.strCA_no!=null &&
              this.strCA_no.equals(other.getStrCA_no()))) &&
            ((this.strTelephone==null && other.getStrTelephone()==null) || 
             (this.strTelephone!=null &&
              this.strTelephone.equals(other.getStrTelephone()))) &&
            ((this.strMobile==null && other.getStrMobile()==null) || 
             (this.strMobile!=null &&
              this.strMobile.equals(other.getStrMobile()))) &&
            ((this.strEmail==null && other.getStrEmail()==null) || 
             (this.strEmail!=null &&
              this.strEmail.equals(other.getStrEmail()))) &&
            ((this.strLandmark==null && other.getStrLandmark()==null) || 
             (this.strLandmark!=null &&
              this.strLandmark.equals(other.getStrLandmark()))) &&
            ((this.strDISPATCH_CTRL==null && other.getStrDISPATCH_CTRL()==null) || 
             (this.strDISPATCH_CTRL!=null &&
              this.strDISPATCH_CTRL.equals(other.getStrDISPATCH_CTRL())));
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
        if (getStrCA_no() != null) {
            _hashCode += getStrCA_no().hashCode();
        }
        if (getStrTelephone() != null) {
            _hashCode += getStrTelephone().hashCode();
        }
        if (getStrMobile() != null) {
            _hashCode += getStrMobile().hashCode();
        }
        if (getStrEmail() != null) {
            _hashCode += getStrEmail().hashCode();
        }
        if (getStrLandmark() != null) {
            _hashCode += getStrLandmark().hashCode();
        }
        if (getStrDISPATCH_CTRL() != null) {
            _hashCode += getStrDISPATCH_CTRL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_UPDATE_TNO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_UPDATE_TNO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCA_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCA_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strMobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strMobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strLandmark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strLandmark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDISPATCH_CTRL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDISPATCH_CTRL"));
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
