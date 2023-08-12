<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<style>
.document-viewer-modal {
	display: none;
}
</style>
<%--
	String connectionDocumentId=ParamUtil.getString(request, "connectionDocumentId","0");
--%>
<%--
<portlet:resourceURL var="documentDownloadURL" id="documentDownload">
	<portlet:param name="cmd" value="download"/>
	<portlet:param name="connectionDocumentId" value="<%=connectionDocumentId %>"/>
</portlet:resourceURL>
--%>

<div class="modal document-viewer-modal " id="<portlet:namespace />document-viewer-modal" style="width:1024px !important; height:800px !important;">
	<div class="modal-dialog modal-dialog-centered" style="width:100% !important;max-width: 100% !important;
    margin: none !important;">
		<div class="modal-content">
			<div class="modal-header" style="border-bottom: none;">
				<h6 class="modal-title">Document Viewer</h6>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<iframe id="<portlet:namespace />document-viewer-iframe" src="" width="1000" height="786"></iframe>
			</div>
		</div>
	</div>
</div>
