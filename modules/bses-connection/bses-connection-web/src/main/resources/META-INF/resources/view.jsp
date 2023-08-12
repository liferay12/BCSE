<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/init.jsp"%>
<%@ include file="/mobile_login.jsp"%>


<%
    boolean noConfig = Validator.isNull(viewMode);
%>

<c:choose>
    <c:when test="<%= noConfig %>">
        <p>
            Please select use the portlet configuration to select a view mode.
        </p>
    </c:when>

    <c:otherwise>
        <p style="color: <%= viewMode %>">
            View Mode: <%= viewMode %>!
        </p>
    </c:otherwise>
</c:choose>