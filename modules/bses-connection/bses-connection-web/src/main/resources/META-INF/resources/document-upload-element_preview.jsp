<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page import="com.bses.connection2.service.ConnectionDocumentLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.ConnectionDocument"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.GroupThreadLocal"%>
<%@page import="com.liferay.portal.kernel.service.ServiceContext"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.portal.kernel.security.auth.PrincipalThreadLocal"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>

<%@ include file="/init.jsp"%>

<%!
	private static final Log LOGGER = LogFactoryUtil.getLog("org.apache.jsp.components.document_upload_005felement_jsp");
%>

<%
long groupId = themeDisplay.getScopeGroupId();
long repositoryId = groupId;

long folderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;

ServiceContext serviceContext = new ServiceContext();
serviceContext.setScopeGroupId(groupId);

long connectionDocumentId=ParamUtil.getLong(request, "connectionDocumentId", 0);
String elementName=ParamUtil.getString(request, "elementName");
String fileTypes=ParamUtil.getString(request, "fileTypes");
String savedValue=ParamUtil.getString(request, elementName);
String documentType=ParamUtil.getString(request, "documentType");
String documentName=ParamUtil.getString(request, "documentName");
String tooltip=ParamUtil.getString(request, "tooltip", "");

String displayFileName="";
String fileName="";
ConnectionDocument connectionDocument=null;
ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
long connectionRequestId=requestEntity.getConnectionRequestId();

try{
	if(connectionDocumentId>0){
		connectionDocument=ConnectionDocumentLocalServiceUtil.getConnectionDocument(connectionDocumentId);
		System.out.println("====="+connectionDocument);
	}else{
		connectionDocument=ConnectionDocumentLocalServiceUtil.getConnectionDocumentByConnectionRequestIdAndDocumentType(requestEntity.getConnectionRequestId(), documentType);
		connectionDocumentId=connectionDocument.getConnectionDocumentId();
		System.out.println(connectionDocument+" : ===== : "+connectionDocumentId);
	}
	fileName=connectionDocument.getClientFileName();
	//displayFileName="<span class=\"text-primary\">"+fileName+"</span> uploaded successfully";
	displayFileName="<span class=\"text-primary\">"+fileName+"</span>";
}catch(Exception e){
	LOGGER.error(e.getMessage());
}

String style="";

String acceptTypes=(StringUtils.isNotBlank(fileTypes)?"accept=\""+fileTypes+"\"":"");
%>
<style>
#<portlet:namespace/><%=elementName%>_fileNameHelper{
	margin-top:0px !important;
	margin-bottom:0px !important;
}
</style>

<portlet:resourceURL var="documentDownloadURL" id="documentDownload">
	<portlet:param name="cmd" value="download"/>
</portlet:resourceURL>

<portlet:renderURL var="documentViewerURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="mvcPath" value="/document_viewer.jsp" />
</portlet:renderURL>


<div class="input-group" id="<%=elementName%>_container" style="<%=style%>">
	<input type="hidden" name="<portlet:namespace/><%=elementName%>" id="<portlet:namespace/><%=elementName%>" value="<%=savedValue%>"/>
	<div class="float-right input-group">
	 	<button type="button" class="btn btn-link btn-sx ml-2 pl-2 pr-2 font-weight-bold" style="font-size: 14px !important" id="<portlet:namespace /><%=elementName+"_viewBtn"%>"  display:<%=connectionDocumentId>0?"block":"none" %>; padding:5px 12px 5px 12px!important;">
	 			<%=displayFileName %>
	 	</button>
	 </div>
</div>

<aui:script use="aui-base, liferay-preview, liferay-util-window">
	$(document).ready(function() {	
		$('#<portlet:namespace /><%=elementName%>_viewBtn').on('click', function(event) {
			var connectionDocumentId = "<%=connectionDocumentId%>";
			
			var viewerUrl='<%=documentDownloadURL.toString()%>&<portlet:namespace/>connectionDocumentId='+connectionDocumentId;
			
			var fileName='<%=fileName %>';
			
			if(!fileName.toString().toLowerCase().endsWith(".pdf")){
				window.open(viewerUrl);
			}else{
				$('#<portlet:namespace />document-viewer-iframe').attr("src", viewerUrl);
				$('#<portlet:namespace />document-viewer-modal').modal('show'); 
			}
			
		});

	});	
		
</aui:script>
