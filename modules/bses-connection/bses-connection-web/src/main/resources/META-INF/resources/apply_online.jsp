<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="java.util.List"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@ include file="/init.jsp"%>
<%
String mobileNo=ParamUtil.getString(request, "mobileNo", "");
String emailId=ParamUtil.getString(request, "emailId", "");

System.out.println("*******************************apply_online***********************");

List<ConnectionRequest> connectionRequestList=ConnectionRequestLocalServiceUtil.getConnectionRequestsByMobileNoAndRequestStatus(mobileNo, RequestTypeModeStatus.STATUS_DRAFT);
if(connectionRequestList!=null && !connectionRequestList.isEmpty()){
	request.setAttribute(ConnectionRequest.class.getName()+"#list", connectionRequestList);

%>
<liferay-util:include page="/list_connections.jsp" servletContext="<%=application%>">
	<liferay-util:param name="mobileNo" value="<%=mobileNo%>" />
	<liferay-util:param name="emailId" value="<%=emailId%>" />
</liferay-util:include>
<%
}else{
%>
<liferay-util:include page="/new_connection.jsp" servletContext="<%=application%>">
	<liferay-util:param name="mobileNo" value="<%=mobileNo%>" />
	<liferay-util:param name="emailId" value="<%=emailId%>" />
</liferay-util:include>
<%
}
%>
