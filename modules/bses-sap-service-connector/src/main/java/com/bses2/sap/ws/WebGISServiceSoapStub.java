/**
 * WebGISServiceSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class WebGISServiceSoapStub extends org.apache.axis.client.Stub implements com.bses2.sap.ws.WebGISServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[113];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Area_Details_forLcd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "objectid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_Details_forLcdResponse>Get_Area_Details_forLcdResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Area_Details_forLcdResponseGet_Area_Details_forLcdResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_Details_forLcdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Getassetreportbydiv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetassetreportbydivResponse>GetassetreportbydivResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetassetreportbydivResponseGetassetreportbydivResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetassetreportbydivResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSensorOIL_TEMPHyperlink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "IMEINO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "DTTYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorOIL_TEMPHyperlinkResponse>GetSensorOIL_TEMPHyperlinkResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponseGetSensorOIL_TEMPHyperlinkResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorOIL_TEMPHyperlinkResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSensorR_TEMPHyperlink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "IMEINO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "DTTYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorR_TEMPHyperlinkResponse>GetSensorR_TEMPHyperlinkResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponseGetSensorR_TEMPHyperlinkResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorR_TEMPHyperlinkResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSensorY_TEMPHyperlink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "IMEINO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "DTTYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorY_TEMPHyperlinkResponse>GetSensorY_TEMPHyperlinkResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponseGetSensorY_TEMPHyperlinkResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorY_TEMPHyperlinkResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSensorB_TEMPHyperlink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "IMEINO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "DTTYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorB_TEMPHyperlinkResponse>GetSensorB_TEMPHyperlinkResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponseGetSensorB_TEMPHyperlinkResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorB_TEMPHyperlinkResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSensorN_TEMPHyperlink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "IMEINO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "DTTYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorN_TEMPHyperlinkResponse>GetSensorN_TEMPHyperlinkResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponseGetSensorN_TEMPHyperlinkResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorN_TEMPHyperlinkResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_EHVstatus_list_1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "gridid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederkv"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVstatus_list_1Response>Get_EHVstatus_list_1Result"));
        oper.setReturnClass(com.bses2.sap.ws.Get_EHVstatus_list_1ResponseGet_EHVstatus_list_1Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVstatus_list_1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_EHV11status_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "gridid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ptcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederkv"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHV11status_listResponse>Get_EHV11status_listResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_EHV11Status_listResponseGet_EHV11Status_listResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHV11status_listResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Areabypole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "polestr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_AreabypoleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_PoleDetails_2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "gridid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "sapfunctio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "dtcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ltfeeder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_PoleDetails_2Response>Get_PoleDetails_2Result"));
        oper.setReturnClass(com.bses2.sap.ws.Get_PoleDetails_2ResponseGet_PoleDetails_2Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_PoleDetails_2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_poleDeatils_3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "dtcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>get_poleDeatils_3Response>get_poleDeatils_3Result"));
        oper.setReturnClass(com.bses2.sap.ws.Get_poleDeatils_3ResponseGet_poleDeatils_3Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "get_poleDeatils_3Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_ConsumerPoleDetails_2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "gridid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "sapfunctio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "dtcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ltfeeder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ConsumerPoleDetails_2Response>Get_ConsumerPoleDetails_2Result"));
        oper.setReturnClass(com.bses2.sap.ws.Get_ConsumerPoleDetails_2ResponseGet_ConsumerPoleDetails_2Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ConsumerPoleDetails_2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Areabypole_2Consumer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "polestr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Areabypole_2ConsumerResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Areabypole_2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "polestr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Areabypole_2Result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_AreabyDT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "polestr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_AreabyDTResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_status_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "gridid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "subsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "dtid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ltfdrid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_status_listResponse>Get_status_listResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_status_listResponseGet_status_listResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_status_listResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_AutoTrip_feederdetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "switchid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_AutoTrip_feederdetailsResponse>Get_AutoTrip_feederdetailsResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponseGet_AutoTrip_feederdetailsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_AutoTrip_feederdetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_HT_feederSection_var");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HT_feederSection_varResponse>Get_HT_feederSection_varResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_HT_feederSection_varResponseGet_HT_feederSection_varResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HT_feederSection_varResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_HTgridlist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HTgridlistResponse>Get_HTgridlistResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_HTgridlistResponseGet_HTgridlistResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HTgridlistResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_HTgridlist_var");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HTgridlist_varResponse>Get_HTgridlist_varResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_HTgridlist_varResponseGet_HTgridlist_varResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HTgridlist_varResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_HTgridlist_varAllDivisions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HTgridlist_varAllDivisionsResponse>Get_HTgridlist_varAllDivisionsResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_HTgridlist_varAllDivisionsResponseGet_HTgridlist_varAllDivisionsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HTgridlist_varAllDivisionsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_HT_feederlist_varAllDivisions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "stationfac"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HT_feederlist_varAllDivisionsResponse>Get_HT_feederlist_varAllDivisionsResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_HT_feederlist_varAllDivisionsResponseGet_HT_feederlist_varAllDivisionsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HT_feederlist_varAllDivisionsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Polelist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ltfeedercode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_PolelistResponse>Get_PolelistResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_PolelistResponseGet_PolelistResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_PolelistResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_backfeedlist_feeder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederidz"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_backfeedlist_feederResponse>Get_backfeedlist_feederResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_backfeedlist_feederResponseGet_backfeedlist_feederResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_backfeedlist_feederResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Cable_section");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_sectionResponse>Get_Cable_sectionResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Cable_sectionResponseGet_Cable_sectionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_sectionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Cable_section_Close");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_section_CloseResponse>Get_Cable_section_CloseResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Cable_section_CloseResponseGet_Cable_section_CloseResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_section_CloseResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_EHVstatus_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "gridid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederkv"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVstatus_listResponse>Get_EHVstatus_listResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_EHVstatus_listResponseGet_EHVstatus_listResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVstatus_listResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Area_Details_forconstituency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "objectid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_Details_forconstituencyResponse>Get_Area_Details_forconstituencyResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Area_Details_forconstituencyResponseGet_Area_Details_forconstituencyResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_Details_forconstituencyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMidasDisc_data");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "div"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMidasDisc_dataResponse>GetMidasDisc_dataResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetMidasDisc_dataResponseGetMidasDisc_dataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMidasDisc_dataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubstationDetailsPIsurvey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "facilityid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubstationDetailsPIsurveyResponse>GetSubstationDetailsPIsurveyResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponseGetSubstationDetailsPIsurveyResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubstationDetailsPIsurveyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_ConsumerListMultiple");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "poleid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ConsumerListMultipleResponse>Get_ConsumerListMultipleResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_ConsumerListMultipleResponseGet_ConsumerListMultipleResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ConsumerListMultipleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Poles_From_Substations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ltfeederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Poles_From_SubstationsResponse>Get_Poles_From_SubstationsResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Poles_From_SubstationsResponseGet_Poles_From_SubstationsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Poles_From_SubstationsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRMUDetailsPI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "subsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getRMUDetailsPIResponse>getRMUDetailsPIResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetRMUDetailsPIResponseGetRMUDetailsPIResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getRMUDetailsPIResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_ComplaintCenter_ContactNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ccId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ComplaintCenter_ContactNoResponse>Get_ComplaintCenter_ContactNoResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponseGet_ComplaintCenter_ContactNoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ComplaintCenter_ContactNoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_ConsumerLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ltFDRList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ConsumerLoadResponse>Get_ConsumerLoadResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_ConsumerLoadResponseGet_ConsumerLoadResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ConsumerLoadResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPolesbyArea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "areas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getPolesbyAreaResponse>getPolesbyAreaResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetPolesbyAreaResponseGetPolesbyAreaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getPolesbyAreaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_dtArea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SAPFUNCTIO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "poleno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CANumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_dtAreaResponse>Get_dtAreaResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_dtAreaResponseGet_dtAreaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_dtAreaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_AreaforCA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "DT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SAPFUNCTIO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "poleno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CANumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_AreaforCAResponse>Get_AreaforCAResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_AreaforCAResponseGet_AreaforCAResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_AreaforCAResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Z_BAPI_DSS_ISU_CA_DISPLAY");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "strCANumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Z_BAPI_DSS_ISU_CA_DISPLAYResponse>Z_BAPI_DSS_ISU_CA_DISPLAYResult"));
        oper.setReturnClass(com.bses2.sap.ws.Z_BAPI_DSS_ISU_CA_DISPLAYResponseZ_BAPI_DSS_ISU_CA_DISPLAYResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Z_BAPI_DSS_ISU_CA_DISPLAYResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_BD_Details");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "externalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_BD_DetailsResponse>Get_BD_DetailsResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_BD_DetailsResponseGet_BD_DetailsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_BD_DetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Company_list");
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Company_listResponse>Get_Company_listResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Company_listResponseGet_Company_listResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Company_listResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Circle_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "company"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Circle_listResponse>Get_Circle_listResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Circle_listResponseGet_Circle_listResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Circle_listResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_CirclebyDivision");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divisionName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_CirclebyDivisionResponse>Get_CirclebyDivisionResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_CirclebyDivisionResponseGet_CirclebyDivisionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_CirclebyDivisionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Circle_Details");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "circle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Circle_DetailsResponse>Get_Circle_DetailsResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Circle_DetailsResponseGet_Circle_DetailsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Circle_DetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Division_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "circle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Division_listResponse>Get_Division_listResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Division_listResponseGet_Division_listResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Division_listResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Affected_ConsumerAndLoad");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "dtlist"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Affected_ConsumerAndLoadResponse>Get_Affected_ConsumerAndLoadResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponseGet_Affected_ConsumerAndLoadResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Affected_ConsumerAndLoadResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Division_details");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "division_code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Division_detailsResponse>Get_Division_detailsResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Division_detailsResponseGet_Division_detailsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Division_detailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Sub_Division_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "DivsionCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Sub_Division_listResponse>Get_Sub_Division_listResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Sub_Division_listResponseGet_Sub_Division_listResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Sub_Division_listResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Sub_Division_details");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "subdivision_code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Sub_Division_detailsResponse>Get_Sub_Division_detailsResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Sub_Division_detailsResponseGet_Sub_Division_detailsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Sub_Division_detailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Area_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_listResponse>Get_Area_listResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_listResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_ltfeederlist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "DTequipmentcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ltfeederlistResponse>Get_ltfeederlistResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_ltfeederlistResponseGet_ltfeederlistResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ltfeederlistResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Cable_sectionHT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_sectionHTResponse>Get_Cable_sectionHTResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Cable_sectionHTResponseGet_Cable_sectionHTResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_sectionHTResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Cable_sectionlt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_sectionltResponse>Get_Cable_sectionltResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Cable_sectionltResponseGet_Cable_sectionltResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_sectionltResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Complaint_Center_list");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divisioncode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Complaint_Center_listResponse>Get_Complaint_Center_listResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Complaint_Center_listResponseGet_Complaint_Center_listResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Complaint_Center_listResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_area_details_Circle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "objectid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>get_area_details_CircleResponse>get_area_details_CircleResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "get_area_details_CircleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_EHVfeederName_1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVfeederName_1Response>Get_EHVfeederName_1Result"));
        oper.setReturnClass(com.bses2.sap.ws.Get_EHVfeederName_1ResponseGet_EHVfeederName_1Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVfeederName_1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_EHVPTlist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "gridid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVPTlistResponse>Get_EHVPTlistResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_EHVPTlistResponseGet_EHVPTlistResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVPTlistResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_EHVgridlist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "circle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVgridlistResponse>Get_EHVgridlistResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_EHVgridlistResponseGet_EHVgridlistResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVgridlistResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_PoleDetailsbyltfeeder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "LTFeeder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_PoleDetailsbyltfeederResponse>Get_PoleDetailsbyltfeederResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponseGet_PoleDetailsbyltfeederResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_PoleDetailsbyltfeederResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Poles_From_LTFeeders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "LTFeeders"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Poles_From_LTFeedersResponse>Get_Poles_From_LTFeedersResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Poles_From_LTFeedersResponseGet_Poles_From_LTFeedersResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Poles_From_LTFeedersResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Area_Detailsmultiplebydiv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "objectid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "division"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_DetailsmultiplebydivResponse>Get_Area_DetailsmultiplebydivResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponseGet_Area_DetailsmultiplebydivResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_DetailsmultiplebydivResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Subslist_var");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Subslist_varResponse>Get_Subslist_varResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Subslist_varResponseGet_Subslist_varResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Subslist_varResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Complaint_Center_Details");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintCentre"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Complaint_Center_DetailsResponse>Get_Complaint_Center_DetailsResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Complaint_Center_DetailsResponseGet_Complaint_Center_DetailsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Complaint_Center_DetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ComplaintStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintNoOR_CANo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintStatusResponse>ComplaintStatusResult"));
        oper.setReturnClass(com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ComplaintStatusDetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintStatusDetailsResponse>ComplaintStatusDetailsResult"));
        oper.setReturnClass(com.bses2.sap.ws.ComplaintStatusDetailsResponseComplaintStatusDetailsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintStatusDetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFaultCat");
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetFaultCatResponse>GetFaultCatResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetFaultCatResponseGetFaultCatResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFaultCatResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubFaultCat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Category"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubFaultCatResponse>GetSubFaultCatResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubFaultCatResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ComplaintRegistrationApp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CallerName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Phone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Add"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Area"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "FaultCategoryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SubFaultCategoryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Remarks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CODE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintRegistrationAppResponse>ComplaintRegistrationAppResult"));
        oper.setReturnClass(com.bses2.sap.ws.ComplaintRegistrationAppResponseComplaintRegistrationAppResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintRegistrationAppResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ComplaintRegistrationWeb_Area");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "AreaName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CallerName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CallerPhone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "address"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "FAULT_CAT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "FAULT_TYPE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Comp_Center_Code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Circle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Division"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "AREA_OBJECTID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "St_Light_Location"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Remarks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Source"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintRegistrationWeb_AreaResponse>ComplaintRegistrationWeb_AreaResult"));
        oper.setReturnClass(com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintRegistrationWeb_AreaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ComplaintRegistrationWeb");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CallerName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Phone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Add"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CA"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Area"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "FaultCategoryCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SubFaultCategoryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Remarks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CODE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "poleNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintRegistrationWebResponse>ComplaintRegistrationWebResult"));
        oper.setReturnClass(com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintRegistrationWebResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BRPL_Outlet");
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>BRPL_OutletResponse>BRPL_OutletResult"));
        oper.setReturnClass(com.bses2.sap.ws.BRPL_OutletResponseBRPL_OutletResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "BRPL_OutletResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_substationindiv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_substationindivResponse>Get_substationindivResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_substationindivResponseGet_substationindivResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_substationindivResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubstationlist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "subdivision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubstationlistResponse>GetSubstationlistResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetSubstationlistResponseGetSubstationlistResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubstationlistResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSubstationDetailsforsurvey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "facilityid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubstationDetailsforsurveyResponse>GetSubstationDetailsforsurveyResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetSubstationDetailsforsurveyResponseGetSubstationDetailsforsurveyResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubstationDetailsforsurveyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_SubstationDetailsby_div");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_SubstationDetailsby_divResponse>Get_SubstationDetailsby_divResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_SubstationDetailsby_divResponseGet_SubstationDetailsby_divResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_SubstationDetailsby_divResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_substation_details");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "StationFacilityid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_substation_detailsResponse>Get_substation_detailsResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_substation_detailsResponseGet_substation_detailsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_substation_detailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Poles_From_DTs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "DTID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Poles_From_DTsResponse>Get_Poles_From_DTsResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Poles_From_DTsResponseGet_Poles_From_DTsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Poles_From_DTsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ForFeedername");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ForFeedernameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Feeder_Status");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "swids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Feeder_StatusResponse>Get_Feeder_StatusResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Feeder_StatusResponseGet_Feeder_StatusResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Feeder_StatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_ltfeederlist1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "dtcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ltfeederlist1Response>Get_ltfeederlist1Result"));
        oper.setReturnClass(com.bses2.sap.ws.Get_ltfeederlist1ResponseGet_ltfeederlist1Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ltfeederlist1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_cablesinltfdr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ltfdrcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_cablesinltfdrResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Cable_sectionlt1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ltfdrID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_sectionlt1Response>Get_Cable_sectionlt1Result"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Cable_sectionlt1ResponseGet_Cable_sectionlt1Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_sectionlt1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_backfeedlist_dt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "dtcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_backfeedlist_dtResponse>Get_backfeedlist_dtResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_backfeedlist_dtResponseGet_backfeedlist_dtResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_backfeedlist_dtResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Cable_section_detail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CblID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_section_detailResponse>Get_Cable_section_detailResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Cable_section_detailResponseGet_Cable_section_detailResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_section_detailResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Cable_section_detail1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CblID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_section_detail1Response>Get_Cable_section_detail1Result"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Cable_section_detail1ResponseGet_Cable_section_detail1Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_section_detail1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getfeedername");
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getfeedernameResponse>getfeedernameResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetfeedernameResponseGetfeedernameResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getfeedernameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getfeederNM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getfeederNMResponse>getfeederNMResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetfeederNMResponseGetfeederNMResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getfeederNMResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDTName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "dt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getDTNameResponse>getDTNameResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetDTNameResponseGetDTNameResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getDTNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCircuitBySubstation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "substation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCircuitBySubstationResponse>GetCircuitBySubstationResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetCircuitBySubstationResponseGetCircuitBySubstationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCircuitBySubstationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_dtlist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "SAPFUNCTIO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_dtlistResponse>Get_dtlistResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_dtlistResponseGet_dtlistResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_dtlistResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("For_DT_Fir");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "StationFacilityid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "dtcode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>For_DT_FirResponse>For_DT_FirResult"));
        oper.setReturnClass(com.bses2.sap.ws.For_DT_FirResponseFor_DT_FirResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "For_DT_FirResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getacb");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "subsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getacbResponse>getacbResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetacbResponseGetacbResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getacbResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validatepole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "poleno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>validatepoleResponse>validatepoleResult"));
        oper.setReturnClass(com.bses2.sap.ws.ValidatepoleResponseValidatepoleResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "validatepoleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCADetails");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ca"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getCADetailsResponse>getCADetailsResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetCADetailsResponseGetCADetailsResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getCADetailsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get_feederpillar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ltfeederid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>get_feederpillarResponse>get_feederpillarResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_feederpillarResponseGet_feederpillarResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "get_feederpillarResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_HT_feederlist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "stationfac"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HT_feederlistResponse>Get_HT_feederlistResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_HT_feederlistResponseGet_HT_feederlistResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HT_feederlistResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_EHVfeederlist_1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "gridcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederkv"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVfeederlist_1Response>Get_EHVfeederlist_1Result"));
        oper.setReturnClass(com.bses2.sap.ws.Get_EHVfeederlist_1ResponseGet_EHVfeederlist_1Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVfeederlist_1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_EHVfeederlist_Test");
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVfeederlist_TestResponse>Get_EHVfeederlist_TestResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_EHVfeederlist_TestResponseGet_EHVfeederlist_TestResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVfeederlist_TestResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_Area_list1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_list1Response>Get_Area_list1Result"));
        oper.setReturnClass(com.bses2.sap.ws.Get_Area_list1ResponseGet_Area_list1Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_list1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_EHV11feederlist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ptcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHV11feederlistResponse>Get_EHV11feederlistResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_EHV11FeederlistResponseGet_EHV11FeederlistResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHV11feederlistResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getgridname");
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getgridnameResponse>getgridnameResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetgridnameResponseGetgridnameResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getgridnameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getgridname1");
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getgridname1Response>getgridname1Result"));
        oper.setReturnClass(com.bses2.sap.ws.Getgridname1ResponseGetgridname1Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getgridname1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCCfromZone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ZoneID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getCCfromZoneResponse>getCCfromZoneResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetCCfromZoneResponseGetCCfromZoneResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getCCfromZoneResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_EHVfeederlist_2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "gridcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederkv"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVfeederlist_2Response>Get_EHVfeederlist_2Result"));
        oper.setReturnClass(com.bses2.sap.ws.Get_EHVfeederlist_2ResponseGet_EHVfeederlist_2Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVfeederlist_2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_HT_feederlist_var");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "stationfac"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "divcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HT_feederlist_varResponse>Get_HT_feederlist_varResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_HT_feederlist_varResponseGet_HT_feederlist_varResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HT_feederlist_varResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMidas_data");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "div"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMidas_dataResponse>GetMidas_dataResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetMidas_dataResponseGetMidas_dataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMidas_dataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Midas_breakdown");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "sapid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Midas_breakdownResponse>Midas_breakdownResult"));
        oper.setReturnClass(com.bses2.sap.ws.Midas_breakdownResponseMidas_breakdownResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Midas_breakdownResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_backfeedlist_substation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "sapfunction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_backfeedlist_substationResponse>Get_backfeedlist_substationResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_backfeedlist_substationResponseGet_backfeedlist_substationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_backfeedlist_substationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_cableslength");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "sectionid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_cableslengthResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_FDRNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ltfdrcd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_FDRNamesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Get_HTFDRNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "feederID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HTFDRNamesResponse>Get_HTFDRNamesResult"));
        oper.setReturnClass(com.bses2.sap.ws.Get_HTFDRNamesResponseGet_HTFDRNamesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HTFDRNamesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getrmu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "subsid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>getrmuResponse>getrmuResult"));
        oper.setReturnClass(com.bses2.sap.ws.GetrmuResponseGetrmuResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "getrmuResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

    }

    public WebGISServiceSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WebGISServiceSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WebGISServiceSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://tempuri.org/AbstractTypes", "StringArray");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>BRPL_OutletResponse>BRPL_OutletResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.BRPL_OutletResponseBRPL_OutletResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintRegistrationAppResponse>ComplaintRegistrationAppResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintRegistrationAppResponseComplaintRegistrationAppResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintRegistrationWeb_AreaResponse>ComplaintRegistrationWeb_AreaResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintRegistrationWebResponse>ComplaintRegistrationWebResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintStatusDetailsResponse>ComplaintStatusDetailsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintStatusDetailsResponseComplaintStatusDetailsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>ComplaintStatusResponse>ComplaintStatusResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>For_DT_FirResponse>For_DT_FirResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.For_DT_FirResponseFor_DT_FirResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Affected_ConsumerAndLoadResponse>Get_Affected_ConsumerAndLoadResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponseGet_Affected_ConsumerAndLoadResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>get_area_details_CircleResponse>get_area_details_CircleResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_Details_forconstituencyResponse>Get_Area_Details_forconstituencyResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_Details_forconstituencyResponseGet_Area_Details_forconstituencyResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_Details_forLcdResponse>Get_Area_Details_forLcdResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_Details_forLcdResponseGet_Area_Details_forLcdResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_DetailsmultiplebydivResponse>Get_Area_DetailsmultiplebydivResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponseGet_Area_DetailsmultiplebydivResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_DetailsmultipleResponse>Get_Area_DetailsmultipleResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_DetailsmultipleResponseGet_Area_DetailsmultipleResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_list1Response>Get_Area_list1Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_list1ResponseGet_Area_list1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Area_listResponse>Get_Area_listResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_AreaforCAResponse>Get_AreaforCAResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_AreaforCAResponseGet_AreaforCAResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_AutoTrip_feederdetailsResponse>Get_AutoTrip_feederdetailsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponseGet_AutoTrip_feederdetailsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_backfeedlist_dtResponse>Get_backfeedlist_dtResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_backfeedlist_dtResponseGet_backfeedlist_dtResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_backfeedlist_feederResponse>Get_backfeedlist_feederResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_backfeedlist_feederResponseGet_backfeedlist_feederResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_backfeedlist_substationResponse>Get_backfeedlist_substationResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_backfeedlist_substationResponseGet_backfeedlist_substationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_BD_DetailsResponse>Get_BD_DetailsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_BD_DetailsResponseGet_BD_DetailsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_section_CloseResponse>Get_Cable_section_CloseResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_section_CloseResponseGet_Cable_section_CloseResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_section_detail1Response>Get_Cable_section_detail1Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_section_detail1ResponseGet_Cable_section_detail1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_section_detailResponse>Get_Cable_section_detailResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_section_detailResponseGet_Cable_section_detailResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_sectionHTResponse>Get_Cable_sectionHTResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_sectionHTResponseGet_Cable_sectionHTResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_sectionlt1Response>Get_Cable_sectionlt1Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_sectionlt1ResponseGet_Cable_sectionlt1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_sectionltResponse>Get_Cable_sectionltResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_sectionltResponseGet_Cable_sectionltResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Cable_sectionResponse>Get_Cable_sectionResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_sectionResponseGet_Cable_sectionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Circle_DetailsResponse>Get_Circle_DetailsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Circle_DetailsResponseGet_Circle_DetailsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Circle_listResponse>Get_Circle_listResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Circle_listResponseGet_Circle_listResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_CirclebyDivisionResponse>Get_CirclebyDivisionResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_CirclebyDivisionResponseGet_CirclebyDivisionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Company_listResponse>Get_Company_listResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Company_listResponseGet_Company_listResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Complaint_Center_DetailsResponse>Get_Complaint_Center_DetailsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Complaint_Center_DetailsResponseGet_Complaint_Center_DetailsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Complaint_Center_listResponse>Get_Complaint_Center_listResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Complaint_Center_listResponseGet_Complaint_Center_listResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ComplaintCenter_ContactNoResponse>Get_ComplaintCenter_ContactNoResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponseGet_ComplaintCenter_ContactNoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ConsumerListMultipleResponse>Get_ConsumerListMultipleResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ConsumerListMultipleResponseGet_ConsumerListMultipleResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ConsumerLoadResponse>Get_ConsumerLoadResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ConsumerLoadResponseGet_ConsumerLoadResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ConsumerPoleDetails_2Response>Get_ConsumerPoleDetails_2Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ConsumerPoleDetails_2ResponseGet_ConsumerPoleDetails_2Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Division_detailsResponse>Get_Division_detailsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Division_detailsResponseGet_Division_detailsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Division_listResponse>Get_Division_listResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Division_listResponseGet_Division_listResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_dtAreaResponse>Get_dtAreaResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_dtAreaResponseGet_dtAreaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_dtlistResponse>Get_dtlistResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_dtlistResponseGet_dtlistResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHV11feederlistResponse>Get_EHV11feederlistResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHV11FeederlistResponseGet_EHV11FeederlistResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHV11status_listResponse>Get_EHV11status_listResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHV11Status_listResponseGet_EHV11Status_listResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVfeederlist_1Response>Get_EHVfeederlist_1Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederlist_1ResponseGet_EHVfeederlist_1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVfeederlist_2Response>Get_EHVfeederlist_2Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederlist_2ResponseGet_EHVfeederlist_2Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVfeederlist_TestResponse>Get_EHVfeederlist_TestResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederlist_TestResponseGet_EHVfeederlist_TestResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVfeederName_1Response>Get_EHVfeederName_1Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederName_1ResponseGet_EHVfeederName_1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVgridlistResponse>Get_EHVgridlistResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVgridlistResponseGet_EHVgridlistResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVPTlistResponse>Get_EHVPTlistResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVPTlistResponseGet_EHVPTlistResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVstatus_list_1Response>Get_EHVstatus_list_1Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVstatus_list_1ResponseGet_EHVstatus_list_1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_EHVstatus_listResponse>Get_EHVstatus_listResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVstatus_listResponseGet_EHVstatus_listResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Feeder_StatusResponse>Get_Feeder_StatusResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Feeder_StatusResponseGet_Feeder_StatusResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>get_feederpillarResponse>get_feederpillarResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_feederpillarResponseGet_feederpillarResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HT_feederlist_varAllDivisionsResponse>Get_HT_feederlist_varAllDivisionsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederlist_varAllDivisionsResponseGet_HT_feederlist_varAllDivisionsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HT_feederlist_varResponse>Get_HT_feederlist_varResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederlist_varResponseGet_HT_feederlist_varResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HT_feederlistResponse>Get_HT_feederlistResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederlistResponseGet_HT_feederlistResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HT_feederSection_varResponse>Get_HT_feederSection_varResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederSection_varResponseGet_HT_feederSection_varResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HTFDRNamesResponse>Get_HTFDRNamesResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTFDRNamesResponseGet_HTFDRNamesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HTgridlist_varAllDivisionsResponse>Get_HTgridlist_varAllDivisionsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTgridlist_varAllDivisionsResponseGet_HTgridlist_varAllDivisionsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HTgridlist_varResponse>Get_HTgridlist_varResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTgridlist_varResponseGet_HTgridlist_varResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_HTgridlistResponse>Get_HTgridlistResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTgridlistResponseGet_HTgridlistResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ltfeederlist1Response>Get_ltfeederlist1Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ltfeederlist1ResponseGet_ltfeederlist1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_ltfeederlistResponse>Get_ltfeederlistResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ltfeederlistResponseGet_ltfeederlistResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>get_poleDeatils_3Response>get_poleDeatils_3Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_poleDeatils_3ResponseGet_poleDeatils_3Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_PoleDetails_2Response>Get_PoleDetails_2Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_PoleDetails_2ResponseGet_PoleDetails_2Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_PoleDetailsbyltfeederResponse>Get_PoleDetailsbyltfeederResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponseGet_PoleDetailsbyltfeederResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_PolelistResponse>Get_PolelistResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_PolelistResponseGet_PolelistResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Poles_From_DTsResponse>Get_Poles_From_DTsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Poles_From_DTsResponseGet_Poles_From_DTsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Poles_From_LTFeedersResponse>Get_Poles_From_LTFeedersResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Poles_From_LTFeedersResponseGet_Poles_From_LTFeedersResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Poles_From_SubstationsResponse>Get_Poles_From_SubstationsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Poles_From_SubstationsResponseGet_Poles_From_SubstationsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_status_listResponse>Get_status_listResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_status_listResponseGet_status_listResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Sub_Division_detailsResponse>Get_Sub_Division_detailsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Sub_Division_detailsResponseGet_Sub_Division_detailsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Sub_Division_listResponse>Get_Sub_Division_listResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Sub_Division_listResponseGet_Sub_Division_listResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Subslist_varResponse>Get_Subslist_varResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Subslist_varResponseGet_Subslist_varResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_substation_detailsResponse>Get_substation_detailsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_substation_detailsResponseGet_substation_detailsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_SubstationDetailsby_divResponse>Get_SubstationDetailsby_divResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_SubstationDetailsby_divResponseGet_SubstationDetailsby_divResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_substationindivResponse>Get_substationindivResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_substationindivResponseGet_substationindivResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>getacbResponse>getacbResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetacbResponseGetacbResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetassetreportbydivResponse>GetassetreportbydivResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetassetreportbydivResponseGetassetreportbydivResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>getCADetailsResponse>getCADetailsResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetCADetailsResponseGetCADetailsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>getCCfromZoneResponse>getCCfromZoneResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetCCfromZoneResponseGetCCfromZoneResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCircuitBySubstationResponse>GetCircuitBySubstationResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetCircuitBySubstationResponseGetCircuitBySubstationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>getDTNameResponse>getDTNameResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetDTNameResponseGetDTNameResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetFaultCatResponse>GetFaultCatResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetFaultCatResponseGetFaultCatResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>getfeedernameResponse>getfeedernameResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetfeedernameResponseGetfeedernameResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>getfeederNMResponse>getfeederNMResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetfeederNMResponseGetfeederNMResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>getgridname1Response>getgridname1Result");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Getgridname1ResponseGetgridname1Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>getgridnameResponse>getgridnameResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetgridnameResponseGetgridnameResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMidas_dataResponse>GetMidas_dataResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetMidas_dataResponseGetMidas_dataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMidasDisc_dataResponse>GetMidasDisc_dataResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetMidasDisc_dataResponseGetMidasDisc_dataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>getPolesbyAreaResponse>getPolesbyAreaResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetPolesbyAreaResponseGetPolesbyAreaResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>getRMUDetailsPIResponse>getRMUDetailsPIResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetRMUDetailsPIResponseGetRMUDetailsPIResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>getrmuResponse>getrmuResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetrmuResponseGetrmuResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorB_TEMPHyperlinkResponse>GetSensorB_TEMPHyperlinkResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponseGetSensorB_TEMPHyperlinkResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorN_TEMPHyperlinkResponse>GetSensorN_TEMPHyperlinkResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponseGetSensorN_TEMPHyperlinkResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorOIL_TEMPHyperlinkResponse>GetSensorOIL_TEMPHyperlinkResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponseGetSensorOIL_TEMPHyperlinkResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorR_TEMPHyperlinkResponse>GetSensorR_TEMPHyperlinkResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponseGetSensorR_TEMPHyperlinkResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSensorY_TEMPHyperlinkResponse>GetSensorY_TEMPHyperlinkResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponseGetSensorY_TEMPHyperlinkResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubFaultCatResponse>GetSubFaultCatResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubstationDetailsforsurveyResponse>GetSubstationDetailsforsurveyResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubstationDetailsforsurveyResponseGetSubstationDetailsforsurveyResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubstationDetailsPIsurveyResponse>GetSubstationDetailsPIsurveyResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponseGetSubstationDetailsPIsurveyResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetSubstationlistResponse>GetSubstationlistResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubstationlistResponseGetSubstationlistResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Midas_breakdownResponse>Midas_breakdownResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Midas_breakdownResponseMidas_breakdownResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>validatepoleResponse>validatepoleResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ValidatepoleResponseValidatepoleResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Z_BAPI_DSS_ISU_CA_DISPLAYResponse>Z_BAPI_DSS_ISU_CA_DISPLAYResult");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Z_BAPI_DSS_ISU_CA_DISPLAYResponseZ_BAPI_DSS_ISU_CA_DISPLAYResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">BRPL_Outlet");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.BRPL_Outlet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">BRPL_OutletResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.BRPL_OutletResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintRegistrationApp");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintRegistrationApp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintRegistrationAppResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintRegistrationAppResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintRegistrationWeb");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintRegistrationWeb.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintRegistrationWeb_Area");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintRegistrationWeb_Area.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintRegistrationWeb_AreaResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintRegistrationWebResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintRegistrationWebResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintStatus");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintStatusDetails");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintStatusDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintStatusDetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintStatusDetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ComplaintStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ComplaintStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">DataSet");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.DataSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">DataTable");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.DataTable.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">For_DT_Fir");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.For_DT_Fir.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">For_DT_FirResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.For_DT_FirResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ForFeedername");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ForFeedername.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ForFeedernameResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ForFeedernameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Affected_ConsumerAndLoad");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Affected_ConsumerAndLoad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Affected_ConsumerAndLoadResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">get_area_details_Circle");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_area_details_Circle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">get_area_details_CircleResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_area_details_CircleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_Details_forconstituency");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_Details_forconstituency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_Details_forconstituencyResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_Details_forconstituencyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_Detailsmultiplebydiv");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_Detailsmultiplebydiv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_DetailsmultiplebydivResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_DetailsmultipleResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_DetailsmultipleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_list");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_list1");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_list1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_list1Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_list1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Area_listResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Area_listResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_AreabyDT");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_AreabyDT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_AreabyDTResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_AreabyDTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Areabypole");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Areabypole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Areabypole_2");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Areabypole_2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Areabypole_2Consumer");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Areabypole_2Consumer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Areabypole_2ConsumerResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Areabypole_2ConsumerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Areabypole_2Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Areabypole_2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_AreabypoleResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_AreabypoleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_AreaforCA");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_AreaforCA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_AreaforCAResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_AreaforCAResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_AutoTrip_feederdetails");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_AutoTrip_feederdetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_AutoTrip_feederdetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_backfeedlist_dt");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_backfeedlist_dt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_backfeedlist_dtResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_backfeedlist_dtResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_backfeedlist_feeder");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_backfeedlist_feeder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_backfeedlist_feederResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_backfeedlist_feederResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_backfeedlist_substation");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_backfeedlist_substation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_backfeedlist_substationResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_backfeedlist_substationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_BD_Details");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_BD_Details.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_BD_DetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_BD_DetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_section");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_section.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_section_Close");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_section_Close.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_section_CloseResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_section_CloseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_section_detail");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_section_detail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_section_detail1");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_section_detail1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_section_detail1Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_section_detail1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_section_detailResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_section_detailResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_sectionHT");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_sectionHT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_sectionHTResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_sectionHTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_sectionlt");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_sectionlt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_sectionlt1");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_sectionlt1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_sectionlt1Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_sectionlt1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_sectionltResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_sectionltResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_sectionResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Cable_sectionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_cablesinltfdr");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_cablesinltfdr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_cablesinltfdrResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_cablesinltfdrResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_cableslength");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_cableslength.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_cableslengthResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_cableslengthResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Circle_Details");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Circle_Details.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Circle_DetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Circle_DetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Circle_list");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Circle_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Circle_listResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Circle_listResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_CirclebyDivision");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_CirclebyDivision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_CirclebyDivisionResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_CirclebyDivisionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Company_list");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Company_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Company_listResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Company_listResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Complaint_Center_Details");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Complaint_Center_Details.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Complaint_Center_DetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Complaint_Center_DetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Complaint_Center_list");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Complaint_Center_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Complaint_Center_listResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Complaint_Center_listResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ComplaintCenter_ContactNo");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ComplaintCenter_ContactNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ComplaintCenter_ContactNoResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ConsumerListMultiple");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ConsumerListMultiple.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ConsumerListMultipleResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ConsumerListMultipleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ConsumerLoad");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ConsumerLoad.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ConsumerLoadResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ConsumerLoadResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ConsumerPoleDetails_2");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ConsumerPoleDetails_2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ConsumerPoleDetails_2Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ConsumerPoleDetails_2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Division_details");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Division_details.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Division_detailsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Division_detailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Division_list");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Division_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Division_listResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Division_listResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_dtArea");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_dtArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_dtAreaResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_dtAreaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_dtlist");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_dtlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_dtlistResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_dtlistResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHV11feederlist");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHV11Feederlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHV11feederlistResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHV11FeederlistResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHV11status_list");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHV11Status_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHV11status_listResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHV11Status_listResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederlist_1");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederlist_1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederlist_1Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederlist_1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederlist_2");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederlist_2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederlist_2Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederlist_2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederlist_Test");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederlist_Test.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederlist_TestResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederlist_TestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederName_1");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederName_1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVfeederName_1Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVfeederName_1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVgridlist");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVgridlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVgridlistResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVgridlistResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVPTlist");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVPTlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVPTlistResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVPTlistResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVstatus_list");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVstatus_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVstatus_list_1");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVstatus_list_1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVstatus_list_1Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVstatus_list_1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_EHVstatus_listResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_EHVstatus_listResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_FDRNames");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_FDRNames.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_FDRNamesResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_FDRNamesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Feeder_Status");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Feeder_Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Feeder_StatusResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Feeder_StatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">get_feederpillar");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_feederpillar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">get_feederpillarResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_feederpillarResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HT_feederlist");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HT_feederlist_var");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederlist_var.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HT_feederlist_varAllDivisions");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederlist_varAllDivisions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HT_feederlist_varAllDivisionsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederlist_varAllDivisionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HT_feederlist_varResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederlist_varResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HT_feederlistResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederlistResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HT_feederSection_var");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederSection_var.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HT_feederSection_varResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HT_feederSection_varResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HTFDRNames");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTFDRNames.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HTFDRNamesResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTFDRNamesResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HTgridlist");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTgridlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HTgridlist_var");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTgridlist_var.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HTgridlist_varAllDivisions");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTgridlist_varAllDivisions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HTgridlist_varAllDivisionsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTgridlist_varAllDivisionsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HTgridlist_varResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTgridlist_varResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_HTgridlistResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_HTgridlistResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ltfeederlist");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ltfeederlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ltfeederlist1");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ltfeederlist1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ltfeederlist1Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ltfeederlist1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_ltfeederlistResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_ltfeederlistResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">get_poleDeatils_3");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_poleDeatils_3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">get_poleDeatils_3Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_poleDeatils_3Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_PoleDetails_2");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_PoleDetails_2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_PoleDetails_2Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_PoleDetails_2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_PoleDetailsbyltfeeder");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_PoleDetailsbyltfeeder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_PoleDetailsbyltfeederResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Polelist");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Polelist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_PolelistResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_PolelistResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Poles_From_DTs");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Poles_From_DTs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Poles_From_DTsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Poles_From_DTsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Poles_From_LTFeeders");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Poles_From_LTFeeders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Poles_From_LTFeedersResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Poles_From_LTFeedersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Poles_From_Substations");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Poles_From_Substations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Poles_From_SubstationsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Poles_From_SubstationsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_status_list");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_status_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_status_listResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_status_listResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Sub_Division_details");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Sub_Division_details.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Sub_Division_detailsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Sub_Division_detailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Sub_Division_list");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Sub_Division_list.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Sub_Division_listResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Sub_Division_listResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Subslist_var");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Subslist_var.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Subslist_varResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_Subslist_varResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_substation_details");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_substation_details.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_substation_detailsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_substation_detailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_SubstationDetailsby_div");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_SubstationDetailsby_div.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_SubstationDetailsby_divResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_SubstationDetailsby_divResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_substationindiv");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_substationindiv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Get_substationindivResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Get_substationindivResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getacb");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Getacb.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getacbResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetacbResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Getassetreportbydiv");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Getassetreportbydiv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetassetreportbydivResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetassetreportbydivResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getCADetails");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetCADetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getCADetailsResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetCADetailsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getCCfromZone");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetCCfromZone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getCCfromZoneResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetCCfromZoneResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetCircuitBySubstation");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetCircuitBySubstation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetCircuitBySubstationResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetCircuitBySubstationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getDTName");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetDTName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getDTNameResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetDTNameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetFaultCat");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetFaultCat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetFaultCatResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetFaultCatResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getfeedername");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Getfeedername.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getfeedernameResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetfeedernameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getfeederNM");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetfeederNM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getfeederNMResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetfeederNMResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getgridname");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Getgridname.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getgridname1");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Getgridname1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getgridname1Response");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Getgridname1Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getgridnameResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetgridnameResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetMidas_data");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetMidas_data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetMidas_dataResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetMidas_dataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetMidasDisc_data");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetMidasDisc_data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetMidasDisc_dataResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetMidasDisc_dataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getPolesbyArea");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetPolesbyArea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getPolesbyAreaResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetPolesbyAreaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getrmu");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Getrmu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getRMUDetailsPI");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetRMUDetailsPI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getRMUDetailsPIResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetRMUDetailsPIResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">getrmuResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetrmuResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorB_TEMPHyperlink");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorB_TEMPHyperlink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorB_TEMPHyperlinkResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorN_TEMPHyperlink");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorN_TEMPHyperlink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorN_TEMPHyperlinkResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorOIL_TEMPHyperlink");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorOIL_TEMPHyperlink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorOIL_TEMPHyperlinkResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorR_TEMPHyperlink");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorR_TEMPHyperlink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorR_TEMPHyperlinkResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorY_TEMPHyperlink");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorY_TEMPHyperlink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSensorY_TEMPHyperlinkResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubFaultCat");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubFaultCat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubFaultCatResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubFaultCatResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubstationDetailsforsurvey");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubstationDetailsforsurvey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubstationDetailsforsurveyResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubstationDetailsforsurveyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubstationDetailsPIsurvey");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubstationDetailsPIsurvey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubstationDetailsPIsurveyResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubstationlist");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubstationlist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetSubstationlistResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.GetSubstationlistResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Midas_breakdown");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Midas_breakdown.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Midas_breakdownResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Midas_breakdownResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">validatepole");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Validatepole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">validatepoleResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.ValidatepoleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BAPI_DSS_ISU_CA_DISPLAY");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Z_BAPI_DSS_ISU_CA_DISPLAY.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Z_BAPI_DSS_ISU_CA_DISPLAYResponse");
            cachedSerQNames.add(qName);
            cls = com.bses2.sap.ws.Z_BAPI_DSS_ISU_CA_DISPLAYResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://tempuri.org/", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.bses2.sap.ws.Get_Area_Details_forLcdResponseGet_Area_Details_forLcdResult get_Area_Details_forLcd(java.lang.String objectid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Area_Details_forLcd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_Details_forLcd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objectid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Area_Details_forLcdResponseGet_Area_Details_forLcdResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Area_Details_forLcdResponseGet_Area_Details_forLcdResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Area_Details_forLcdResponseGet_Area_Details_forLcdResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetassetreportbydivResponseGetassetreportbydivResult getassetreportbydiv(java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Getassetreportbydiv");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Getassetreportbydiv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetassetreportbydivResponseGetassetreportbydivResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetassetreportbydivResponseGetassetreportbydivResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetassetreportbydivResponseGetassetreportbydivResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponseGetSensorOIL_TEMPHyperlinkResult getSensorOIL_TEMPHyperlink(java.lang.String IMEINO, java.lang.String DTTYPE) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetSensorOIL_TEMPHyperlink");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorOIL_TEMPHyperlink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IMEINO, DTTYPE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponseGetSensorOIL_TEMPHyperlinkResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponseGetSensorOIL_TEMPHyperlinkResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetSensorOIL_TEMPHyperlinkResponseGetSensorOIL_TEMPHyperlinkResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponseGetSensorR_TEMPHyperlinkResult getSensorR_TEMPHyperlink(java.lang.String IMEINO, java.lang.String DTTYPE) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetSensorR_TEMPHyperlink");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorR_TEMPHyperlink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IMEINO, DTTYPE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponseGetSensorR_TEMPHyperlinkResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponseGetSensorR_TEMPHyperlinkResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetSensorR_TEMPHyperlinkResponseGetSensorR_TEMPHyperlinkResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponseGetSensorY_TEMPHyperlinkResult getSensorY_TEMPHyperlink(java.lang.String IMEINO, java.lang.String DTTYPE) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetSensorY_TEMPHyperlink");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorY_TEMPHyperlink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IMEINO, DTTYPE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponseGetSensorY_TEMPHyperlinkResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponseGetSensorY_TEMPHyperlinkResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetSensorY_TEMPHyperlinkResponseGetSensorY_TEMPHyperlinkResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponseGetSensorB_TEMPHyperlinkResult getSensorB_TEMPHyperlink(java.lang.String IMEINO, java.lang.String DTTYPE) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetSensorB_TEMPHyperlink");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorB_TEMPHyperlink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IMEINO, DTTYPE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponseGetSensorB_TEMPHyperlinkResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponseGetSensorB_TEMPHyperlinkResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetSensorB_TEMPHyperlinkResponseGetSensorB_TEMPHyperlinkResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponseGetSensorN_TEMPHyperlinkResult getSensorN_TEMPHyperlink(java.lang.String IMEINO, java.lang.String DTTYPE) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetSensorN_TEMPHyperlink");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSensorN_TEMPHyperlink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IMEINO, DTTYPE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponseGetSensorN_TEMPHyperlinkResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponseGetSensorN_TEMPHyperlinkResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetSensorN_TEMPHyperlinkResponseGetSensorN_TEMPHyperlinkResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_EHVstatus_list_1ResponseGet_EHVstatus_list_1Result get_EHVstatus_list_1(java.lang.String gridid, java.lang.String feederkv, java.lang.String[] feederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_EHVstatus_list_1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVstatus_list_1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gridid, feederkv, feederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_EHVstatus_list_1ResponseGet_EHVstatus_list_1Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_EHVstatus_list_1ResponseGet_EHVstatus_list_1Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_EHVstatus_list_1ResponseGet_EHVstatus_list_1Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_EHV11Status_listResponseGet_EHV11Status_listResult get_EHV11Status_list(java.lang.String gridid, java.lang.String[] ptcd, java.lang.String feederkv, java.lang.String[] feederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_EHV11status_list");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHV11status_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gridid, ptcd, feederkv, feederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_EHV11Status_listResponseGet_EHV11Status_listResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_EHV11Status_listResponseGet_EHV11Status_listResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_EHV11Status_listResponseGet_EHV11Status_listResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String get_Areabypole(java.lang.String polestr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Areabypole");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Areabypole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {polestr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_PoleDetails_2ResponseGet_PoleDetails_2Result get_PoleDetails_2(java.lang.String gridid, java.lang.String feederid, java.lang.String sapfunctio, java.lang.String dtcode, java.lang.String ltfeeder) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_PoleDetails_2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_PoleDetails_2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gridid, feederid, sapfunctio, dtcode, ltfeeder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_PoleDetails_2ResponseGet_PoleDetails_2Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_PoleDetails_2ResponseGet_PoleDetails_2Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_PoleDetails_2ResponseGet_PoleDetails_2Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_poleDeatils_3ResponseGet_poleDeatils_3Result get_poleDeatils_3(java.lang.String dtcode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/get_poleDeatils_3");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "get_poleDeatils_3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dtcode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_poleDeatils_3ResponseGet_poleDeatils_3Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_poleDeatils_3ResponseGet_poleDeatils_3Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_poleDeatils_3ResponseGet_poleDeatils_3Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_ConsumerPoleDetails_2ResponseGet_ConsumerPoleDetails_2Result get_ConsumerPoleDetails_2(java.lang.String gridid, java.lang.String feederid, java.lang.String sapfunctio, java.lang.String dtcode, java.lang.String ltfeeder) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_ConsumerPoleDetails_2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ConsumerPoleDetails_2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gridid, feederid, sapfunctio, dtcode, ltfeeder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_ConsumerPoleDetails_2ResponseGet_ConsumerPoleDetails_2Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_ConsumerPoleDetails_2ResponseGet_ConsumerPoleDetails_2Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_ConsumerPoleDetails_2ResponseGet_ConsumerPoleDetails_2Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String get_Areabypole_2Consumer(java.lang.String polestr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Areabypole_2Consumer");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Areabypole_2Consumer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {polestr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] get_Areabypole_2(java.lang.String polestr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Areabypole_2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Areabypole_2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {polestr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] get_AreabyDT(java.lang.String polestr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_AreabyDT");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_AreabyDT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {polestr});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_status_listResponseGet_status_listResult get_status_list(java.lang.String gridid, java.lang.String feederid, java.lang.String[] subsid, java.lang.String[] dtid, java.lang.String[] ltfdrid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_status_list");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_status_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gridid, feederid, subsid, dtid, ltfdrid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_status_listResponseGet_status_listResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_status_listResponseGet_status_listResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_status_listResponseGet_status_listResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponseGet_AutoTrip_feederdetailsResult get_AutoTrip_feederdetails(java.lang.String switchid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_AutoTrip_feederdetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_AutoTrip_feederdetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {switchid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponseGet_AutoTrip_feederdetailsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponseGet_AutoTrip_feederdetailsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_AutoTrip_feederdetailsResponseGet_AutoTrip_feederdetailsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_HT_feederSection_varResponseGet_HT_feederSection_varResult get_HT_feederSection_var(java.lang.String feederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_HT_feederSection_var");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HT_feederSection_var"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_HT_feederSection_varResponseGet_HT_feederSection_varResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_HT_feederSection_varResponseGet_HT_feederSection_varResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_HT_feederSection_varResponseGet_HT_feederSection_varResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_HTgridlistResponseGet_HTgridlistResult get_HTgridlist(java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_HTgridlist");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HTgridlist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_HTgridlistResponseGet_HTgridlistResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_HTgridlistResponseGet_HTgridlistResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_HTgridlistResponseGet_HTgridlistResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_HTgridlist_varResponseGet_HTgridlist_varResult get_HTgridlist_var(java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_HTgridlist_var");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HTgridlist_var"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_HTgridlist_varResponseGet_HTgridlist_varResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_HTgridlist_varResponseGet_HTgridlist_varResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_HTgridlist_varResponseGet_HTgridlist_varResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_HTgridlist_varAllDivisionsResponseGet_HTgridlist_varAllDivisionsResult get_HTgridlist_varAllDivisions(java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_HTgridlist_varAllDivisions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HTgridlist_varAllDivisions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_HTgridlist_varAllDivisionsResponseGet_HTgridlist_varAllDivisionsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_HTgridlist_varAllDivisionsResponseGet_HTgridlist_varAllDivisionsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_HTgridlist_varAllDivisionsResponseGet_HTgridlist_varAllDivisionsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_HT_feederlist_varAllDivisionsResponseGet_HT_feederlist_varAllDivisionsResult get_HT_feederlist_varAllDivisions(java.lang.String stationfac, java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_HT_feederlist_varAllDivisions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HT_feederlist_varAllDivisions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stationfac, divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_HT_feederlist_varAllDivisionsResponseGet_HT_feederlist_varAllDivisionsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_HT_feederlist_varAllDivisionsResponseGet_HT_feederlist_varAllDivisionsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_HT_feederlist_varAllDivisionsResponseGet_HT_feederlist_varAllDivisionsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_PolelistResponseGet_PolelistResult get_Polelist(java.lang.String ltfeedercode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Polelist");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Polelist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ltfeedercode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_PolelistResponseGet_PolelistResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_PolelistResponseGet_PolelistResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_PolelistResponseGet_PolelistResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_backfeedlist_feederResponseGet_backfeedlist_feederResult get_backfeedlist_feeder(java.lang.String feederidz) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_backfeedlist_feeder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_backfeedlist_feeder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feederidz});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_backfeedlist_feederResponseGet_backfeedlist_feederResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_backfeedlist_feederResponseGet_backfeedlist_feederResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_backfeedlist_feederResponseGet_backfeedlist_feederResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Cable_sectionResponseGet_Cable_sectionResult get_Cable_section(java.lang.String feederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Cable_section");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_section"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Cable_sectionResponseGet_Cable_sectionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Cable_sectionResponseGet_Cable_sectionResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Cable_sectionResponseGet_Cable_sectionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Cable_section_CloseResponseGet_Cable_section_CloseResult get_Cable_section_Close(java.lang.String feederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Cable_section_Close");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_section_Close"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Cable_section_CloseResponseGet_Cable_section_CloseResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Cable_section_CloseResponseGet_Cable_section_CloseResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Cable_section_CloseResponseGet_Cable_section_CloseResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_EHVstatus_listResponseGet_EHVstatus_listResult get_EHVstatus_list(java.lang.String gridid, java.lang.String feederkv, java.lang.String[] feederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_EHVstatus_list");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVstatus_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gridid, feederkv, feederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_EHVstatus_listResponseGet_EHVstatus_listResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_EHVstatus_listResponseGet_EHVstatus_listResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_EHVstatus_listResponseGet_EHVstatus_listResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Area_Details_forconstituencyResponseGet_Area_Details_forconstituencyResult get_Area_Details_forconstituency(java.lang.String objectid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Area_Details_forconstituency");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_Details_forconstituency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objectid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Area_Details_forconstituencyResponseGet_Area_Details_forconstituencyResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Area_Details_forconstituencyResponseGet_Area_Details_forconstituencyResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Area_Details_forconstituencyResponseGet_Area_Details_forconstituencyResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetMidasDisc_dataResponseGetMidasDisc_dataResult getMidasDisc_data(java.lang.String div) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetMidasDisc_data");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMidasDisc_data"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {div});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetMidasDisc_dataResponseGetMidasDisc_dataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetMidasDisc_dataResponseGetMidasDisc_dataResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetMidasDisc_dataResponseGetMidasDisc_dataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponseGetSubstationDetailsPIsurveyResult getSubstationDetailsPIsurvey(java.lang.String facilityid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetSubstationDetailsPIsurvey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubstationDetailsPIsurvey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {facilityid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponseGetSubstationDetailsPIsurveyResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponseGetSubstationDetailsPIsurveyResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetSubstationDetailsPIsurveyResponseGetSubstationDetailsPIsurveyResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_ConsumerListMultipleResponseGet_ConsumerListMultipleResult get_ConsumerListMultiple(java.lang.String poleid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_ConsumerListMultiple");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ConsumerListMultiple"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {poleid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_ConsumerListMultipleResponseGet_ConsumerListMultipleResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_ConsumerListMultipleResponseGet_ConsumerListMultipleResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_ConsumerListMultipleResponseGet_ConsumerListMultipleResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Poles_From_SubstationsResponseGet_Poles_From_SubstationsResult get_Poles_From_Substations(java.lang.String ltfeederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Poles_From_Substations");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Poles_From_Substations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ltfeederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Poles_From_SubstationsResponseGet_Poles_From_SubstationsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Poles_From_SubstationsResponseGet_Poles_From_SubstationsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Poles_From_SubstationsResponseGet_Poles_From_SubstationsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetRMUDetailsPIResponseGetRMUDetailsPIResult getRMUDetailsPI(java.lang.String subsid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/getRMUDetailsPI");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "getRMUDetailsPI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subsid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetRMUDetailsPIResponseGetRMUDetailsPIResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetRMUDetailsPIResponseGetRMUDetailsPIResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetRMUDetailsPIResponseGetRMUDetailsPIResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponseGet_ComplaintCenter_ContactNoResult get_ComplaintCenter_ContactNo(java.lang.String ccId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_ComplaintCenter_ContactNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ComplaintCenter_ContactNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ccId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponseGet_ComplaintCenter_ContactNoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponseGet_ComplaintCenter_ContactNoResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_ComplaintCenter_ContactNoResponseGet_ComplaintCenter_ContactNoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_ConsumerLoadResponseGet_ConsumerLoadResult get_ConsumerLoad(java.lang.String[] ltFDRList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_ConsumerLoad");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ConsumerLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ltFDRList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_ConsumerLoadResponseGet_ConsumerLoadResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_ConsumerLoadResponseGet_ConsumerLoadResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_ConsumerLoadResponseGet_ConsumerLoadResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetPolesbyAreaResponseGetPolesbyAreaResult getPolesbyArea(java.lang.String areas) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/getPolesbyArea");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "getPolesbyArea"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {areas});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetPolesbyAreaResponseGetPolesbyAreaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetPolesbyAreaResponseGetPolesbyAreaResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetPolesbyAreaResponseGetPolesbyAreaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_dtAreaResponseGet_dtAreaResult get_dtArea(java.lang.String SAPFUNCTIO, java.lang.String poleno, java.lang.String CANumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_dtArea");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_dtArea"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {SAPFUNCTIO, poleno, CANumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_dtAreaResponseGet_dtAreaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_dtAreaResponseGet_dtAreaResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_dtAreaResponseGet_dtAreaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_AreaforCAResponseGet_AreaforCAResult get_AreaforCA(java.lang.String DT, java.lang.String SAPFUNCTIO, java.lang.String poleno, java.lang.String CANumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_AreaforCA");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_AreaforCA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {DT, SAPFUNCTIO, poleno, CANumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_AreaforCAResponseGet_AreaforCAResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_AreaforCAResponseGet_AreaforCAResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_AreaforCAResponseGet_AreaforCAResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Z_BAPI_DSS_ISU_CA_DISPLAYResponseZ_BAPI_DSS_ISU_CA_DISPLAYResult z_BAPI_DSS_ISU_CA_DISPLAY(java.lang.String strCANumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Z_BAPI_DSS_ISU_CA_DISPLAY");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Z_BAPI_DSS_ISU_CA_DISPLAY"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {strCANumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Z_BAPI_DSS_ISU_CA_DISPLAYResponseZ_BAPI_DSS_ISU_CA_DISPLAYResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Z_BAPI_DSS_ISU_CA_DISPLAYResponseZ_BAPI_DSS_ISU_CA_DISPLAYResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Z_BAPI_DSS_ISU_CA_DISPLAYResponseZ_BAPI_DSS_ISU_CA_DISPLAYResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_BD_DetailsResponseGet_BD_DetailsResult get_BD_Details(java.lang.String externalId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_BD_Details");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_BD_Details"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {externalId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_BD_DetailsResponseGet_BD_DetailsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_BD_DetailsResponseGet_BD_DetailsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_BD_DetailsResponseGet_BD_DetailsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Company_listResponseGet_Company_listResult get_Company_list() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Company_list");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Company_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Company_listResponseGet_Company_listResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Company_listResponseGet_Company_listResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Company_listResponseGet_Company_listResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Circle_listResponseGet_Circle_listResult get_Circle_list(java.lang.String company) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Circle_list");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Circle_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {company});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Circle_listResponseGet_Circle_listResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Circle_listResponseGet_Circle_listResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Circle_listResponseGet_Circle_listResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_CirclebyDivisionResponseGet_CirclebyDivisionResult get_CirclebyDivision(java.lang.String divisionName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_CirclebyDivision");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_CirclebyDivision"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divisionName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_CirclebyDivisionResponseGet_CirclebyDivisionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_CirclebyDivisionResponseGet_CirclebyDivisionResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_CirclebyDivisionResponseGet_CirclebyDivisionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Circle_DetailsResponseGet_Circle_DetailsResult get_Circle_Details(java.lang.String circle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Circle_Details");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Circle_Details"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {circle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Circle_DetailsResponseGet_Circle_DetailsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Circle_DetailsResponseGet_Circle_DetailsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Circle_DetailsResponseGet_Circle_DetailsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Division_listResponseGet_Division_listResult get_Division_list(java.lang.String circle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Division_list");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Division_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {circle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Division_listResponseGet_Division_listResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Division_listResponseGet_Division_listResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Division_listResponseGet_Division_listResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponseGet_Affected_ConsumerAndLoadResult get_Affected_ConsumerAndLoad(java.lang.String dtlist) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Affected_ConsumerAndLoad");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Affected_ConsumerAndLoad"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dtlist});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponseGet_Affected_ConsumerAndLoadResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponseGet_Affected_ConsumerAndLoadResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Affected_ConsumerAndLoadResponseGet_Affected_ConsumerAndLoadResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Division_detailsResponseGet_Division_detailsResult get_Division_details(java.lang.String division_code) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Division_details");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Division_details"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {division_code});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Division_detailsResponseGet_Division_detailsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Division_detailsResponseGet_Division_detailsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Division_detailsResponseGet_Division_detailsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Sub_Division_listResponseGet_Sub_Division_listResult get_Sub_Division_list(java.lang.String divsionCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Sub_Division_list");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Sub_Division_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divsionCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Sub_Division_listResponseGet_Sub_Division_listResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Sub_Division_listResponseGet_Sub_Division_listResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Sub_Division_listResponseGet_Sub_Division_listResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Sub_Division_detailsResponseGet_Sub_Division_detailsResult get_Sub_Division_details(java.lang.String subdivision_code) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Sub_Division_details");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Sub_Division_details"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subdivision_code});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Sub_Division_detailsResponseGet_Sub_Division_detailsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Sub_Division_detailsResponseGet_Sub_Division_detailsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Sub_Division_detailsResponseGet_Sub_Division_detailsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult get_Area_list(java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Area_list");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Area_listResponseGet_Area_listResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_ltfeederlistResponseGet_ltfeederlistResult get_ltfeederlist(java.lang.String DTequipmentcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_ltfeederlist");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ltfeederlist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {DTequipmentcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_ltfeederlistResponseGet_ltfeederlistResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_ltfeederlistResponseGet_ltfeederlistResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_ltfeederlistResponseGet_ltfeederlistResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Cable_sectionHTResponseGet_Cable_sectionHTResult get_Cable_sectionHT(java.lang.String feederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Cable_sectionHT");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_sectionHT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Cable_sectionHTResponseGet_Cable_sectionHTResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Cable_sectionHTResponseGet_Cable_sectionHTResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Cable_sectionHTResponseGet_Cable_sectionHTResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Cable_sectionltResponseGet_Cable_sectionltResult get_Cable_sectionlt(java.lang.String feederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Cable_sectionlt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_sectionlt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Cable_sectionltResponseGet_Cable_sectionltResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Cable_sectionltResponseGet_Cable_sectionltResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Cable_sectionltResponseGet_Cable_sectionltResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Complaint_Center_listResponseGet_Complaint_Center_listResult get_Complaint_Center_list(java.lang.String divisioncode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Complaint_Center_list");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Complaint_Center_list"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divisioncode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Complaint_Center_listResponseGet_Complaint_Center_listResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Complaint_Center_listResponseGet_Complaint_Center_listResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Complaint_Center_listResponseGet_Complaint_Center_listResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult get_area_details_Circle(java.lang.String objectid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/get_area_details_Circle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "get_area_details_Circle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objectid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_area_details_CircleResponseGet_area_details_CircleResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_EHVfeederName_1ResponseGet_EHVfeederName_1Result get_EHVfeederName_1(java.lang.String[] feederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_EHVfeederName_1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVfeederName_1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_EHVfeederName_1ResponseGet_EHVfeederName_1Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_EHVfeederName_1ResponseGet_EHVfeederName_1Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_EHVfeederName_1ResponseGet_EHVfeederName_1Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_EHVPTlistResponseGet_EHVPTlistResult get_EHVPTlist(java.lang.String gridid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_EHVPTlist");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVPTlist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gridid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_EHVPTlistResponseGet_EHVPTlistResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_EHVPTlistResponseGet_EHVPTlistResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_EHVPTlistResponseGet_EHVPTlistResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_EHVgridlistResponseGet_EHVgridlistResult get_EHVgridlist(java.lang.String circle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_EHVgridlist");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVgridlist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {circle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_EHVgridlistResponseGet_EHVgridlistResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_EHVgridlistResponseGet_EHVgridlistResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_EHVgridlistResponseGet_EHVgridlistResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponseGet_PoleDetailsbyltfeederResult get_PoleDetailsbyltfeeder(java.lang.String LTFeeder) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_PoleDetailsbyltfeeder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_PoleDetailsbyltfeeder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {LTFeeder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponseGet_PoleDetailsbyltfeederResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponseGet_PoleDetailsbyltfeederResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_PoleDetailsbyltfeederResponseGet_PoleDetailsbyltfeederResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Poles_From_LTFeedersResponseGet_Poles_From_LTFeedersResult get_Poles_From_LTFeeders(java.lang.String LTFeeders) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Poles_From_LTFeeders");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Poles_From_LTFeeders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {LTFeeders});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Poles_From_LTFeedersResponseGet_Poles_From_LTFeedersResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Poles_From_LTFeedersResponseGet_Poles_From_LTFeedersResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Poles_From_LTFeedersResponseGet_Poles_From_LTFeedersResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponseGet_Area_DetailsmultiplebydivResult get_Area_Detailsmultiplebydiv(java.lang.String objectid, java.lang.String division) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Area_Detailsmultiplebydiv");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_Detailsmultiplebydiv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objectid, division});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponseGet_Area_DetailsmultiplebydivResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponseGet_Area_DetailsmultiplebydivResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Area_DetailsmultiplebydivResponseGet_Area_DetailsmultiplebydivResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Subslist_varResponseGet_Subslist_varResult get_Subslist_var(java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Subslist_var");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Subslist_var"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Subslist_varResponseGet_Subslist_varResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Subslist_varResponseGet_Subslist_varResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Subslist_varResponseGet_Subslist_varResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Complaint_Center_DetailsResponseGet_Complaint_Center_DetailsResult get_Complaint_Center_Details(java.lang.String complaintCentre) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Complaint_Center_Details");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Complaint_Center_Details"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {complaintCentre});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Complaint_Center_DetailsResponseGet_Complaint_Center_DetailsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Complaint_Center_DetailsResponseGet_Complaint_Center_DetailsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Complaint_Center_DetailsResponseGet_Complaint_Center_DetailsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult complaintStatus(java.lang.String complaintNoOR_CANo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ComplaintStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {complaintNoOR_CANo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.ComplaintStatusResponseComplaintStatusResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.ComplaintStatusDetailsResponseComplaintStatusDetailsResult complaintStatusDetails(java.lang.String CA) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ComplaintStatusDetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintStatusDetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CA});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.ComplaintStatusDetailsResponseComplaintStatusDetailsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.ComplaintStatusDetailsResponseComplaintStatusDetailsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.ComplaintStatusDetailsResponseComplaintStatusDetailsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetFaultCatResponseGetFaultCatResult getFaultCat() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetFaultCat");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetFaultCat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetFaultCatResponseGetFaultCatResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetFaultCatResponseGetFaultCatResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetFaultCatResponseGetFaultCatResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult getSubFaultCat(java.lang.String category) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetSubFaultCat");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubFaultCat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {category});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetSubFaultCatResponseGetSubFaultCatResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.ComplaintRegistrationAppResponseComplaintRegistrationAppResult complaintRegistrationApp(java.lang.String key, java.lang.String callerName, java.lang.String phone, java.lang.String add, java.lang.String email, java.lang.String CA, java.lang.String area, java.lang.String faultCategoryCode, java.lang.String subFaultCategoryName, java.lang.String remarks, java.lang.String CODE) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ComplaintRegistrationApp");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintRegistrationApp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {key, callerName, phone, add, email, CA, area, faultCategoryCode, subFaultCategoryName, remarks, CODE});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.ComplaintRegistrationAppResponseComplaintRegistrationAppResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.ComplaintRegistrationAppResponseComplaintRegistrationAppResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.ComplaintRegistrationAppResponseComplaintRegistrationAppResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult complaintRegistrationWeb_Area(java.lang.String areaName, java.lang.String callerName, java.lang.String callerPhone, java.lang.String address, java.lang.String FAULT_CAT, java.lang.String FAULT_TYPE, java.lang.String comp_Center_Code, java.lang.String circle, java.lang.String division, java.lang.String AREA_OBJECTID, java.lang.String st_Light_Location, java.lang.String remarks, java.lang.String source) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ComplaintRegistrationWeb_Area");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintRegistrationWeb_Area"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {areaName, callerName, callerPhone, address, FAULT_CAT, FAULT_TYPE, comp_Center_Code, circle, division, AREA_OBJECTID, st_Light_Location, remarks, source});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.ComplaintRegistrationWeb_AreaResponseComplaintRegistrationWeb_AreaResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult complaintRegistrationWeb(java.lang.String key, java.lang.String callerName, java.lang.String phone, java.lang.String add, java.lang.String email, java.lang.String CA, java.lang.String area, java.lang.String faultCategoryCode, java.lang.String subFaultCategoryName, java.lang.String remarks, java.lang.String CODE, java.lang.String poleNum) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ComplaintRegistrationWeb");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ComplaintRegistrationWeb"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {key, callerName, phone, add, email, CA, area, faultCategoryCode, subFaultCategoryName, remarks, CODE, poleNum});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.ComplaintRegistrationWebResponseComplaintRegistrationWebResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.BRPL_OutletResponseBRPL_OutletResult BRPL_Outlet() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/BRPL_Outlet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "BRPL_Outlet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.BRPL_OutletResponseBRPL_OutletResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.BRPL_OutletResponseBRPL_OutletResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.BRPL_OutletResponseBRPL_OutletResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_substationindivResponseGet_substationindivResult get_substationindiv(java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_substationindiv");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_substationindiv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_substationindivResponseGet_substationindivResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_substationindivResponseGet_substationindivResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_substationindivResponseGet_substationindivResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetSubstationlistResponseGetSubstationlistResult getSubstationlist(java.lang.String subdivision) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetSubstationlist");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubstationlist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subdivision});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetSubstationlistResponseGetSubstationlistResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetSubstationlistResponseGetSubstationlistResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetSubstationlistResponseGetSubstationlistResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetSubstationDetailsforsurveyResponseGetSubstationDetailsforsurveyResult getSubstationDetailsforsurvey(java.lang.String facilityid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetSubstationDetailsforsurvey");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSubstationDetailsforsurvey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {facilityid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetSubstationDetailsforsurveyResponseGetSubstationDetailsforsurveyResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetSubstationDetailsforsurveyResponseGetSubstationDetailsforsurveyResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetSubstationDetailsforsurveyResponseGetSubstationDetailsforsurveyResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_SubstationDetailsby_divResponseGet_SubstationDetailsby_divResult get_SubstationDetailsby_div(java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_SubstationDetailsby_div");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_SubstationDetailsby_div"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_SubstationDetailsby_divResponseGet_SubstationDetailsby_divResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_SubstationDetailsby_divResponseGet_SubstationDetailsby_divResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_SubstationDetailsby_divResponseGet_SubstationDetailsby_divResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_substation_detailsResponseGet_substation_detailsResult get_substation_details(java.lang.String stationFacilityid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_substation_details");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_substation_details"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stationFacilityid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_substation_detailsResponseGet_substation_detailsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_substation_detailsResponseGet_substation_detailsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_substation_detailsResponseGet_substation_detailsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Poles_From_DTsResponseGet_Poles_From_DTsResult get_Poles_From_DTs(java.lang.String DTID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Poles_From_DTs");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Poles_From_DTs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {DTID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Poles_From_DTsResponseGet_Poles_From_DTsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Poles_From_DTsResponseGet_Poles_From_DTsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Poles_From_DTsResponseGet_Poles_From_DTsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String forFeedername(java.lang.String feederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ForFeedername");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ForFeedername"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Feeder_StatusResponseGet_Feeder_StatusResult get_Feeder_Status(java.lang.String swids) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Feeder_Status");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Feeder_Status"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {swids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Feeder_StatusResponseGet_Feeder_StatusResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Feeder_StatusResponseGet_Feeder_StatusResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Feeder_StatusResponseGet_Feeder_StatusResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_ltfeederlist1ResponseGet_ltfeederlist1Result get_ltfeederlist1(java.lang.String dtcode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_ltfeederlist1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_ltfeederlist1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dtcode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_ltfeederlist1ResponseGet_ltfeederlist1Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_ltfeederlist1ResponseGet_ltfeederlist1Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_ltfeederlist1ResponseGet_ltfeederlist1Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String get_cablesinltfdr(java.lang.String ltfdrcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_cablesinltfdr");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_cablesinltfdr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ltfdrcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Cable_sectionlt1ResponseGet_Cable_sectionlt1Result get_Cable_sectionlt1(java.lang.String ltfdrID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Cable_sectionlt1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_sectionlt1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ltfdrID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Cable_sectionlt1ResponseGet_Cable_sectionlt1Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Cable_sectionlt1ResponseGet_Cable_sectionlt1Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Cable_sectionlt1ResponseGet_Cable_sectionlt1Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_backfeedlist_dtResponseGet_backfeedlist_dtResult get_backfeedlist_dt(java.lang.String[] dtcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_backfeedlist_dt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_backfeedlist_dt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dtcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_backfeedlist_dtResponseGet_backfeedlist_dtResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_backfeedlist_dtResponseGet_backfeedlist_dtResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_backfeedlist_dtResponseGet_backfeedlist_dtResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Cable_section_detailResponseGet_Cable_section_detailResult get_Cable_section_detail(java.lang.String cblID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Cable_section_detail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_section_detail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cblID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Cable_section_detailResponseGet_Cable_section_detailResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Cable_section_detailResponseGet_Cable_section_detailResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Cable_section_detailResponseGet_Cable_section_detailResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Cable_section_detail1ResponseGet_Cable_section_detail1Result get_Cable_section_detail1(java.lang.String cblID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Cable_section_detail1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Cable_section_detail1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cblID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Cable_section_detail1ResponseGet_Cable_section_detail1Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Cable_section_detail1ResponseGet_Cable_section_detail1Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Cable_section_detail1ResponseGet_Cable_section_detail1Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetfeedernameResponseGetfeedernameResult getfeedername() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/getfeedername");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "getfeedername"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetfeedernameResponseGetfeedernameResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetfeedernameResponseGetfeedernameResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetfeedernameResponseGetfeedernameResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetfeederNMResponseGetfeederNMResult getfeederNM(java.lang.String feederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/getfeederNM");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "getfeederNM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetfeederNMResponseGetfeederNMResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetfeederNMResponseGetfeederNMResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetfeederNMResponseGetfeederNMResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetDTNameResponseGetDTNameResult getDTName(java.lang.String dt) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/getDTName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "getDTName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dt});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetDTNameResponseGetDTNameResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetDTNameResponseGetDTNameResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetDTNameResponseGetDTNameResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetCircuitBySubstationResponseGetCircuitBySubstationResult getCircuitBySubstation(java.lang.String substation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetCircuitBySubstation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCircuitBySubstation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {substation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetCircuitBySubstationResponseGetCircuitBySubstationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetCircuitBySubstationResponseGetCircuitBySubstationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetCircuitBySubstationResponseGetCircuitBySubstationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_dtlistResponseGet_dtlistResult get_dtlist(java.lang.String SAPFUNCTIO) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_dtlist");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_dtlist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {SAPFUNCTIO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_dtlistResponseGet_dtlistResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_dtlistResponseGet_dtlistResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_dtlistResponseGet_dtlistResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.For_DT_FirResponseFor_DT_FirResult for_DT_Fir(java.lang.String stationFacilityid, java.lang.String dtcode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/For_DT_Fir");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "For_DT_Fir"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stationFacilityid, dtcode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.For_DT_FirResponseFor_DT_FirResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.For_DT_FirResponseFor_DT_FirResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.For_DT_FirResponseFor_DT_FirResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetacbResponseGetacbResult getacb(java.lang.String subsid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/getacb");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "getacb"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subsid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetacbResponseGetacbResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetacbResponseGetacbResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetacbResponseGetacbResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.ValidatepoleResponseValidatepoleResult validatepole(java.lang.String poleno) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/validatepole");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "validatepole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {poleno});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.ValidatepoleResponseValidatepoleResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.ValidatepoleResponseValidatepoleResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.ValidatepoleResponseValidatepoleResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetCADetailsResponseGetCADetailsResult getCADetails(java.lang.String ca) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/getCADetails");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "getCADetails"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ca});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetCADetailsResponseGetCADetailsResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetCADetailsResponseGetCADetailsResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetCADetailsResponseGetCADetailsResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_feederpillarResponseGet_feederpillarResult get_feederpillar(java.lang.String ltfeederid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/get_feederpillar");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "get_feederpillar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ltfeederid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_feederpillarResponseGet_feederpillarResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_feederpillarResponseGet_feederpillarResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_feederpillarResponseGet_feederpillarResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_HT_feederlistResponseGet_HT_feederlistResult get_HT_feederlist(java.lang.String stationfac, java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_HT_feederlist");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HT_feederlist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stationfac, divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_HT_feederlistResponseGet_HT_feederlistResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_HT_feederlistResponseGet_HT_feederlistResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_HT_feederlistResponseGet_HT_feederlistResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_EHVfeederlist_1ResponseGet_EHVfeederlist_1Result get_EHVfeederlist_1(java.lang.String gridcd, java.lang.String feederkv) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_EHVfeederlist_1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVfeederlist_1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gridcd, feederkv});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_EHVfeederlist_1ResponseGet_EHVfeederlist_1Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_EHVfeederlist_1ResponseGet_EHVfeederlist_1Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_EHVfeederlist_1ResponseGet_EHVfeederlist_1Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_EHVfeederlist_TestResponseGet_EHVfeederlist_TestResult get_EHVfeederlist_Test() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_EHVfeederlist_Test");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVfeederlist_Test"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_EHVfeederlist_TestResponseGet_EHVfeederlist_TestResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_EHVfeederlist_TestResponseGet_EHVfeederlist_TestResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_EHVfeederlist_TestResponseGet_EHVfeederlist_TestResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_Area_list1ResponseGet_Area_list1Result get_Area_list1(java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_Area_list1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Area_list1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_Area_list1ResponseGet_Area_list1Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_Area_list1ResponseGet_Area_list1Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_Area_list1ResponseGet_Area_list1Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_EHV11FeederlistResponseGet_EHV11FeederlistResult get_EHV11Feederlist(java.lang.String ptcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_EHV11feederlist");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHV11feederlist"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ptcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_EHV11FeederlistResponseGet_EHV11FeederlistResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_EHV11FeederlistResponseGet_EHV11FeederlistResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_EHV11FeederlistResponseGet_EHV11FeederlistResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetgridnameResponseGetgridnameResult getgridname() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/getgridname");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "getgridname"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetgridnameResponseGetgridnameResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetgridnameResponseGetgridnameResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetgridnameResponseGetgridnameResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Getgridname1ResponseGetgridname1Result getgridname1() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/getgridname1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "getgridname1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Getgridname1ResponseGetgridname1Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Getgridname1ResponseGetgridname1Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Getgridname1ResponseGetgridname1Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetCCfromZoneResponseGetCCfromZoneResult getCCfromZone(java.lang.String zoneID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/getCCfromZone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "getCCfromZone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zoneID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetCCfromZoneResponseGetCCfromZoneResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetCCfromZoneResponseGetCCfromZoneResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetCCfromZoneResponseGetCCfromZoneResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_EHVfeederlist_2ResponseGet_EHVfeederlist_2Result get_EHVfeederlist_2(java.lang.String gridcd, java.lang.String feederkv) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_EHVfeederlist_2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_EHVfeederlist_2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {gridcd, feederkv});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_EHVfeederlist_2ResponseGet_EHVfeederlist_2Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_EHVfeederlist_2ResponseGet_EHVfeederlist_2Result) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_EHVfeederlist_2ResponseGet_EHVfeederlist_2Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_HT_feederlist_varResponseGet_HT_feederlist_varResult get_HT_feederlist_var(java.lang.String stationfac, java.lang.String divcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_HT_feederlist_var");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HT_feederlist_var"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {stationfac, divcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_HT_feederlist_varResponseGet_HT_feederlist_varResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_HT_feederlist_varResponseGet_HT_feederlist_varResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_HT_feederlist_varResponseGet_HT_feederlist_varResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetMidas_dataResponseGetMidas_dataResult getMidas_data(java.lang.String div) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetMidas_data");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMidas_data"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {div});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetMidas_dataResponseGetMidas_dataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetMidas_dataResponseGetMidas_dataResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetMidas_dataResponseGetMidas_dataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Midas_breakdownResponseMidas_breakdownResult midas_breakdown(java.lang.String sapid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Midas_breakdown");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Midas_breakdown"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sapid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Midas_breakdownResponseMidas_breakdownResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Midas_breakdownResponseMidas_breakdownResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Midas_breakdownResponseMidas_breakdownResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_backfeedlist_substationResponseGet_backfeedlist_substationResult get_backfeedlist_substation(java.lang.String[] sapfunction) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_backfeedlist_substation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_backfeedlist_substation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sapfunction});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_backfeedlist_substationResponseGet_backfeedlist_substationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_backfeedlist_substationResponseGet_backfeedlist_substationResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_backfeedlist_substationResponseGet_backfeedlist_substationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String get_cableslength(java.lang.String sectionid, java.lang.String type) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_cableslength");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_cableslength"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sectionid, type});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String get_FDRNames(java.lang.String ltfdrcd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_FDRNames");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_FDRNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ltfdrcd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.Get_HTFDRNamesResponseGet_HTFDRNamesResult get_HTFDRNames(java.lang.String feederID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Get_HTFDRNames");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_HTFDRNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {feederID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.Get_HTFDRNamesResponseGet_HTFDRNamesResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.Get_HTFDRNamesResponseGet_HTFDRNamesResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.Get_HTFDRNamesResponseGet_HTFDRNamesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.bses2.sap.ws.GetrmuResponseGetrmuResult getrmu(java.lang.String subsid) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/getrmu");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "getrmu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {subsid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bses2.sap.ws.GetrmuResponseGetrmuResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bses2.sap.ws.GetrmuResponseGetrmuResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.bses2.sap.ws.GetrmuResponseGetrmuResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
