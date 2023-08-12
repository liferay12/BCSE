<%@page import="java.util.Map"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<%
ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
String colCssClass="col-md-6";

if(StringUtils.equals(requestEntity.getRequestType(), RequestTypeModeStatus.TYPE_NAME_CHANGE)){
	colCssClass="col-md-8";
}
%>
<div class="row">
	<div class="<%=colCssClass%>">
		<div class="form-group mb-1">
			<aui:select class="form-control" name="reasonForChange" label="reason-for-change" >
				<aui:option value="" label="-Select-" />
<%
		for(Map.Entry<String, String> entry:MasterData.getReasonsForChange().entrySet()){
%>	
			<aui:option value="<%=entry.getKey()%>" label="<%=entry.getValue()%>" selected="<%=StringUtils.equals(requestEntity.getPremisesType(), entry.getKey())%>"/>
<%
		}
%>
				<aui:validator name="required"/>			
			</aui:select>
			<%--aui:input type="text" class="form-control" name="reasonForChange" label="Reason for Change" value="<%=requestEntity.getReasonForChange()%>" maxlength="75">
				<aui:validator name="required" />
			</aui:input--%>
		</div>
	</div>
</div>
