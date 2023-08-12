<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="com.bses.connection2.web.portlet.ViewHelper"%>
<%@ include file="/init.jsp"%>

<portlet:renderURL var="baseURL" >
</portlet:renderURL>
<portlet:renderURL var="guidelinesURL" >
	<portlet:param name="mvcPath" value="/guidelines.jsp" />
</portlet:renderURL>
<portlet:actionURL name="requestListView" var="listActionURL" />

<%
ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
%>

<div class="container-fluid p-1">
	<div class="row">
		<div class="col-md-7">
			<h6 class="mt-3" style="font-weight: 700;">
<%
	if(requestEntity.getRequestType().equalsIgnoreCase(RequestTypeModeStatus.TYPE_NEW_CONNECTION)){
		if(requestEntity.getRequestMode().equalsIgnoreCase(RequestTypeModeStatus.MODE_ONLINE)){
%>
		<!-- Online Services / New Connection / Apply Online  -->
		Apply Online /
<%			
		}else{
%>
		<!-- Online Services / New Connection / Appointment for Visit -->
		Appointment for Visit /
<%			
		}
%>
		<%=MasterData.getRequestType(requestEntity.getRequestType())%>
<%		
	}else{
		String changeType=ViewHelper.getViewRequestType(requestEntity.getRequestType());
%>	
		Online Services / <%=changeType %>
<%
	}
%>			
		/ Request No: <%=requestEntity.getRequestNo() %></h6>
		</div>
		<div class="col-md-5">
			<div class="float-right">
				<a href="<%=listActionURL.toString() %>" class="btn btn-link text-danger"><i class="icon-list"></i> My Requests</a>
				<a href="<%=guidelinesURL.toString() %>" class="btn btn-link text-danger" target="_blank"><i class="icon-check"></i> <liferay-ui:message key="important-guidelines" /></a>
				<a href="<%=baseURL.toString() %>&rtsx=logout" class="btn btn-link text-danger"><i class="icon-signout"></i> Logout</a>
			</div>
			<%--div class="float-right">
				<a href="#" class="btn btn-link text-danger"><i class="fas fa-check-double" aria-hidden="true"></i> <liferay-ui:message key="important-guidelines" /></a>
			</div> --%>
		</div>
	</div>
</div>
