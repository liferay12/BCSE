<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.bses.connection2.service.ConnectionDocumentLocalServiceUtil"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="javax.portlet.PortletSessionUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp"%>
<%
//PortletSession portletSession = renderRequest.getPortletSession();
String newConnectionMode=(String)portletSession.getAttribute("newConnectionMode");
String mobileNo=(String)portletSession.getAttribute("mobileNo");
String emailId=(String)portletSession.getAttribute( "emailId");

System.out.println("newConnectionMode >> "+newConnectionMode);
if(newConnectionMode==null){
	
%>
<liferay-util:include page="/new_connection_option.jsp" servletContext="<%=application%>">
	
</liferay-util:include>
<%
}else if(newConnectionMode.equals(RequestTypeModeStatus.MODE_ONLINE)){
%>
	<liferay-util:include page="/apply_online.jsp" servletContext="<%=application%>">
		<liferay-util:param name="mobileNo" value="<%=mobileNo%>" />
		<liferay-util:param name="emailId" value="<%=emailId%>" />
	</liferay-util:include>
<%
}else{
%>
	<liferay-util:include page="/new_appointment.jsp" servletContext="<%=application%>">
		<liferay-util:param name="mobileNo" value="<%=mobileNo%>" />
		<liferay-util:param name="emailId" value="<%=emailId%>" />
	</liferay-util:include>
<%
}
%>
