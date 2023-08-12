<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<%

boolean showPreview = ParamUtil.getBoolean(request, "showPreview", true);

%>

<div class="container-fluid p-3">
	<div class="row">
		<div class="col-md-12">
			<div class="float-right">
				<%--a  href="<previewURL.toString()>" class="btn btn-warning" id="portlet:namespacepreviewBtn" target="_blank">Preview</a> 
				<%--<a " data-toggle="modal" class="btn btn-primary">Save
					as Draft</a> --%> 
					<%if(showPreview == true) {%>
					<button type="button" class="btn btn-warning" id="<portlet:namespace/>previewBtn" value="Preview">Preview</button>
					<%} %>
					<button type="button" class="btn btn-danger" id="<portlet:namespace/>submitBtn" value="Submit">Submit</button>
			</div>
		</div>
	</div>
</div>
<%-- <aui:script position="inline" use="aui-base">
	$(document).ready(function(){
		$("#<portlet:namespace/>previewBtn").click(function(){
                                
					window.location.href= '<%=previewURL.toString()%>'
				}
			);
		});
</aui:script> --%>
