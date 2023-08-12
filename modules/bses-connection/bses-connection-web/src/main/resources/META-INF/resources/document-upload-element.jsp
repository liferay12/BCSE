<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@page
	import="com.bses.connection2.service.ConnectionDocumentLocalServiceUtil"%>
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
<%@page
	import="com.liferay.portal.kernel.security.auth.PrincipalThreadLocal"%>
<%@page
	import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page
	import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page
	import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>

<%@ include file="/init.jsp"%>

<%!private static final Log LOGGER = LogFactoryUtil
			.getLog("org.apache.jsp.components.document_upload_005felement_jsp");%>

<%
	long groupId = themeDisplay.getScopeGroupId();
	long repositoryId = groupId;

	long folderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;

	ServiceContext serviceContext = new ServiceContext();
	serviceContext.setScopeGroupId(groupId);

	long connectionDocumentId = ParamUtil.getLong(request, "connectionDocumentId", 0);
	String elementName = ParamUtil.getString(request, "elementName");
	String fileTypes = ParamUtil.getString(request, "fileTypes");
	String placeHolder = ParamUtil.getString(request, "placeHolder");
	String savedValue = ParamUtil.getString(request, elementName);
	String documentType = ParamUtil.getString(request, "documentType");
	String documentName = ParamUtil.getString(request, "documentName");
	boolean thumbnail = ParamUtil.getBoolean(request, "thumbnail", false);
	boolean readOnly = ParamUtil.getBoolean(request, "readOnly", false);
	boolean required = ParamUtil.getBoolean(request, "required", false);

	String requiredFunction = ParamUtil.getString(request, "requiredFunction");

	int width = ParamUtil.getInteger(request, "width", 0);
	int height = ParamUtil.getInteger(request, "height", 0);
	int maxFileSize = ParamUtil.getInteger(request, "maxFileSize", 0);
	String tooltip = ParamUtil.getString(request, "tooltip", "");
	String label = ParamUtil.getString(request, "label", "");
	String consumerType = ParamUtil.getString(request, "consumerType", "");

	String displayFileName = "";
	String fileName = "";
	ConnectionDocument connectionDocument = null;
	ConnectionRequest requestEntity = (ConnectionRequest) request
			.getAttribute(ConnectionRequest.class.getName());
	long connectionRequestId = requestEntity.getConnectionRequestId();

	try {
		if (connectionDocumentId > 0) {
			connectionDocument = ConnectionDocumentLocalServiceUtil.getConnectionDocument(connectionDocumentId);
			System.out.println("=====" + connectionDocument);
		} else {
			connectionDocument = ConnectionDocumentLocalServiceUtil
					.getConnectionDocumentByConnectionRequestIdAndDocumentType(
							requestEntity.getConnectionRequestId(), documentType);
			connectionDocumentId = connectionDocument.getConnectionDocumentId();
			System.out.println("=====" + connectionDocument);
		}
		fileName = connectionDocument.getClientFileName();
		//displayFileName="<span class=\"text-primary\">"+fileName+"</span> uploaded successfully";
		displayFileName = "<span class=\"text-primary\">" + fileName + "</span>";
	} catch (Exception e) {
		LOGGER.error(e.getMessage());
	}

	String progressBarId = elementName.concat("_progressbar");
	String style = "";

	if (thumbnail) {
		style = "justify-content: center; text-align:center;";
	}

	String acceptTypes = (StringUtils.isNotBlank(fileTypes) ? "accept=\"" + fileTypes + "\"" : "");
%>
<style>
#<
portlet:namespace /> <%=elementName%>_fileNameHelper {
	margin-top: 0px !important;
	margin-bottom: 0px !important;
}
</style>

<div class="input-group" id="<%=elementName%>_container"
	style="<%=style%>">
	<input type="hidden" name="<portlet:namespace/><%=elementName%>"
		id="<portlet:namespace/><%=elementName%>" value="<%=savedValue%>" />
	<input type="hidden"
		name="<portlet:namespace/><%=elementName%>_connectionDocumentId"
		id="<portlet:namespace/><%=elementName%>_connectionDocumentId"
		value="<%=connectionDocumentId%>" />

	<%
		if (!readOnly) {
	%>
	<input type="hidden"
		name="<portlet:namespace/><%=elementName%>_documentType"
		id="<portlet:namespace/><%=elementName%>_documentType"
		value="<%=documentType%>" /> <input type="hidden"
		name="<portlet:namespace/><%=elementName%>_documentName"
		id="<portlet:namespace/><%=elementName%>_documentName"
		value="<%=documentName%>" /> <input type="hidden"
		name="<portlet:namespace/><%=elementName%>_acceptTypes"
		id="<portlet:namespace/><%=elementName%>_acceptTypes"
		value="<%=fileTypes%>" /> <input type="file"
		name="<portlet:namespace/><%=elementName + "_file"%>"
		id="<portlet:namespace/><%=elementName%>_file" style="width: 0px;"
		<%=acceptTypes%>> <span class="text-danger font-weight-bold"
		id="<portlet:namespace /><%=elementName + "_errorMessage"%>"></span>

	<%
		} 
		if (!thumbnail) {
	%>
	<span id="<portlet:namespace /><%=elementName + "_displayFileName"%>"
		class="display:block;"><%=displayFileName%></span>
	<%
		if (!readOnly) {
	%>
	<button type="button" class="btn btn-primary btn-sx"
		id="<portlet:namespace /><%=elementName + "_uploadBtn"%>"
		style="font-size:1em;<%=(readOnly ? "display:none;" : "")%>"
		value="Choose File">
		<i class="icon-cloud-upload mr-2"></i>Upload File
	</button>
	<%
		}
		} else {
	%>
	<div
		style="width:<%=width + 2%>px;height:<%=height + 2%>px; border:1px solid #ced4da; text-align:center; padding:2px;"
		class="mb-2 mt-2">
		<img id="<portlet:namespace/><%=elementName%>_thumbnail"
			src="<%=placeHolder%>" style="width: 100%; height: 100%;" />
		<%
			if (!readOnly) {
		%>
		<button type="button" class="btn btn-primary btn-sx"
			id="<portlet:namespace /><%=elementName + "_uploadBtn"%>"
			style="font-size:1em;<%=(readOnly ? "display:none;" : "")%>margin-top: -<%=height * 0.4%>%;"
			value="Choose File">Upload File</button>
		<button type="button" class="btn btn-danger btn-sx ml-2 pl-2 pr-2"
			id="<portlet:namespace /><%=elementName + "_deleteBtn"%>"
			style="font-size: 1em; display: none; padding-left: 12px !important; padding-right: 12px !important; margin-top: 38px !important;">
			<i class="icon-trash"></i>
		</button>
		<%
			}
		%>
	</div>
	<%
		}
	%>

	<aui:input type="text" name="<%=elementName + "_fileName"%>"
		value="<%=fileName%>" label=""
		style="
    margin-top: -39px !important;
    height: 0px !important;
    padding-top: 0px !important;
    padding-bottom: 0px !important;
    border: none !important;"
		readonly="true">
		<%
			if (required) {
		%>
		<aui:validator name="required"
			errorMessage="*Uploading of the document is required!">
		function() {
			var isRequired = true;
			<%
			if (StringUtils.isNotBlank(requiredFunction)) {
		%>
				try{
					isRequired = <%=requiredFunction%>();
				}catch(err){
					isRequired =false;
				}
			<%
			} else {
		%>
				isRequired =  uploadRequired("<%=elementName%>","<%=consumerType%>");
			<%
			}
		%>
			return isRequired;
        }
	</aui:validator>
		<%
			}
		%>
	</aui:input>
	<p id="<portlet:namespace/><%=elementName%>_tooltip" class="text-muted"><%=connectionDocumentId == 0 ? tooltip : label%></p>
</div>

<%
	if (!readOnly && !thumbnail) {
%>
<liferay-ui:upload-progress id="<%=progressBarId%>" message="uploading"
	height="0" />
<%
	}
	if (!thumbnail) {
%>
<div class="float-left">
	<button type="button" class="btn btn-success btn-sx ml-1 pl-1 pr-2"
		id="<portlet:namespace /><%=elementName + "_viewBtn"%>"
		style="font-size: 1em; display: none; padding: 3px 9px 3px 9px !important;">
		<i class="icon-picture"></i>
	</button>
	<button type="button" class="btn btn-danger btn-sx ml-1 pl-1 pr-2"
		id="<portlet:namespace /><%=elementName + "_deleteBtn"%>"
		style="font-size: 1em; display: none; padding: 3px 9px 3px 9px !important;">
		<i class="icon-trash"></i>
	</button>
</div>
<%
	}
%>
<portlet:resourceURL var="documentDownloadURL" id="documentDownload">
	<portlet:param name="cmd" value="download" />
</portlet:resourceURL>

<portlet:renderURL var="documentViewerURL"
	windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="mvcPath" value="/document_viewer.jsp" />
</portlet:renderURL>

<aui:script use="aui-base, liferay-preview, liferay-util-window">
	var <portlet:namespace /><%=elementName%>showProgress=<%=(!readOnly && !thumbnail)%>;

	var thumbnail=<%=thumbnail%>;
<%--	A.one('#<portlet:namespace /><%=elementName%>_uploadBtn').on('click', function(event) {
	
		var el = document.getElementById("<portlet:namespace/><%=elementName%>_file");
	    if (el) {
	        el.click();  
	    }
		A.one('#<portlet:namespace/><%=elementName%>_file').trigger('click');
	}); --%>

	<%--$('#<portlet:namespace /><%=elementName%>_fileName').on('click', function(event) {
		$('#<portlet:namespace/><%=elementName%>_file').trigger('click');
	});--%>
	
	$('#<portlet:namespace /><%=elementName%>_file').on('change', function(event) {
		var connectionDocumentId=$('#<portlet:namespace /><%=elementName%>_connectionDocumentId').val();
		console.log('Uploading for '+'<%=connectionRequestId%>, '+connectionDocumentId+' , <%=documentType%> ' + $('#<portlet:namespace /><%=elementName%>_documentName').val());
		var successFunc=<portlet:namespace /><%=elementName%>_uploadFileOnSuccess;
		var failureFunc=<portlet:namespace /><%=elementName%>_uploadFileOnFailure;

		if(!thumbnail){
			$('#<portlet:namespace /><%=elementName%>_displayFileName').html('<span
		class="text-primary">Uploading is in progess.....</span>');
		}
		$('#<portlet:namespace /><%=elementName%>_uploadBtn').hide();
		uploadFile('<%=connectionRequestId%>', connectionDocumentId, '<%=documentType%>', $('#<portlet:namespace /><%=elementName%>_documentName').val(), $('#<portlet:namespace /><%=elementName%>_file'), <%=maxFileSize%>, $('#<portlet:namespace /><%=elementName%>_acceptTypes').val(), '', successFunc, failureFunc);
	});
	
	$('#<portlet:namespace /><%=elementName%>_deleteBtn').on('click', function(event) {
		var yn=confirm("Are you sure you want to remove the file?");
		if(yn){
			var successFunc=<portlet:namespace /><%=elementName%>_onDeleteSuccess;
			deleteConnectionDocument($('#<portlet:namespace /><%=elementName%>_connectionDocumentId').val(), successFunc);
		}
	});
	
	
	function <portlet:namespace /><%=elementName%>_onDeleteSuccess(obj){

		if(obj==true || obj=="true"){
			$('#<portlet:namespace /><%=elementName%>').val('');
			$('#<portlet:namespace /><%=elementName%>_fileName').val('');
			if(!thumbnail){
				$('#<portlet:namespace /><%=elementName%>_displayFileName').html('');
			}else{
				<portlet:namespace /><%=elementName%>_clearThumbnail();
			}
			$('#<portlet:namespace /><%=elementName%>_deleteBtn').hide();
			$('#<portlet:namespace /><%=elementName%>_viewBtn').hide();
			$('#<portlet:namespace /><%=elementName%>_uploadBtn').show();
			$('#<portlet:namespace /><%=elementName%>_tooltip').html("<%=tooltip%>");
			$('#<portlet:namespace /><%=elementName%>_connectionDocumentId').val(null);
			$('#<portlet:namespace /><%=elementName%>_file').val("");//set blank value to upload same file
		}
	}

	function <portlet:namespace /><%=elementName%>_uploadFileOnSuccess(response){
		$('#<portlet:namespace /><%=elementName%>').val(response.connectionDocumentId);
		$('#<portlet:namespace /><%=elementName%>_connectionDocumentId').val(response.connectionDocumentId);
		$('#<portlet:namespace /><%=elementName%>_errorMessage').html('');
		$('#<portlet:namespace /><%=elementName%>_uploadBtn').hide();
		$('#<portlet:namespace /><%=elementName%>_fileName').val(response.clientFileName);
		$('#<portlet:namespace /><%=elementName%>_tooltip').html("<%=label%>");
		$('#<portlet:namespace /><%=elementName%>_deleteBtn').show();

		if(!thumbnail){
			$('#<portlet:namespace /><%=elementName%>_displayFileName').html('<span
		class="text-primary">'+response.clientFileName+'</span>');
			$('#<portlet:namespace /><%=elementName%>_viewBtn').show();
		}else{
			<portlet:namespace /><%=elementName%>_showThumbnail(response.connectionDocumentId);
		}
		console.log(<%=progressBarId%>);
		var form = $("#<portlet:namespace /><%=elementName + "_fileName"%>").closest('form')[0];
		validateElement(form, "<portlet:namespace /><%=elementName + "_fileName"%>");
	}	
	
	function <portlet:namespace /><%=elementName%>_uploadFileOnFailure(response){
		if(response!=''){
			alert(response);
		}
		$('#<portlet:namespace /><%=elementName%>_uploadBtn').show();

		if(!thumbnail){
			$('#<portlet:namespace /><%=elementName%>_displayFileName').html('<span
		class="text-primary"></span>');
		}
		console.log(<%=progressBarId%>);
	}
	
	$('#<portlet:namespace /><%=elementName%>_viewBtn').on('click', function(event) {
		<portlet:namespace /><%=elementName%>_downloadDocument($('#<portlet:namespace /><%=elementName%>_connectionDocumentId').val());
	});
	
	$(document).ready(function() {
<%
			if (!readOnly) {
		%>	
		$('#<portlet:namespace /><%=elementName%>_uploadBtn').on('click', function(event) {
			$('#<portlet:namespace /><%=elementName%>_file').trigger('click');
		});
<%
				}
			%>
	<portlet:namespace /><%=elementName%>_init();
	});	
		
		
	function <portlet:namespace /><%=elementName%>_init(){
<%
		if (connectionDocumentId > 0) {
	%>
			if(!thumbnail){
<%
		if (!readOnly) {
	%>				
				$('#<portlet:namespace /><%=elementName%>_displayFileName').show();
				$('#<portlet:namespace /><%=elementName%>_viewBtn').show();
<%
									}
								%>				
			}else{
				<portlet:namespace /><%=elementName%>_showThumbnail($('#<portlet:namespace /><%=elementName%>_connectionDocumentId').val())
			}
			$('#<portlet:namespace /><%=elementName%>_uploadBtn').hide();
<%
									if (!readOnly) {
								%>
				$('#<portlet:namespace /><%=elementName%>_deleteBtn').show();
<%
					}
						}
				%>
	}

	function <portlet:namespace /><%=elementName%>_downloadDocument(connectionDocumentId){
		var viewerUrl='<%=documentDownloadURL.toString()%>&<portlet:namespace />connectionDocumentId='+connectionDocumentId;
		//alert(viewerUrl);
		
		var fileName=$("#<portlet:namespace /><%=elementName%>_fileName").val();
		//alert(viewerUrl);
		
		if(!fileName.toLowerCase().endsWith(".pdf")){
			window.open(viewerUrl);
		}else{
			$('#<portlet:namespace />document-viewer-iframe').attr("src", viewerUrl);
			$('#<portlet:namespace />document-viewer-modal').modal('show'); 
		}
		
	
		<%--
		
		//$('.modal').css('display:block;');
		var dialog=Liferay.Util.openWindow(
				{
					dialog: {
						cssClass: 'ui-dialog',
						destroyOnHide: true,
						resizable: true,
						width: 1524,
						height: 840,
						
					},
					dialogIframe: {
						//bodyCssClass: 'custom-css-class'
					},
					title: 'Document Viewer',
					uri: '<%=documentViewerURL.toString()%>&<portlet:namespace/>connectionDocumentId='+connectionDocumentId
				}
			);
		--%>
		
	}
	
	function <portlet:namespace /><%=elementName%>_showThumbnail(connectionDocumentId){
		var viewerUrl='<%=documentDownloadURL.toString()%>&<portlet:namespace />connectionDocumentId='+connectionDocumentId;
		$('#<portlet:namespace /><%=elementName%>_thumbnail').attr("src", viewerUrl);
		<%--
		$('#<portlet:namespace/><%=elementName%>_thumbnail').attr("height", 150);
		$('#<portlet:namespace/><%=elementName%>_thumbnail').attr("width", 120);
		--%>
	}
	
	function <portlet:namespace /><%=elementName%>_clearThumbnail(){
		$('#<portlet:namespace /><%=elementName%>_thumbnail').attr("src", '<%=placeHolder%>');
		<%--
		$('#<portlet:namespace/><%=elementName%>_thumbnail').attr("height", 0);
		$('#<portlet:namespace/><%=elementName%>_thumbnail').attr("width", 0);
		--%>
	}
	Liferay.provide(window,'<portlet:namespace /><%=elementName + "_deleteDoc"%>', function () {
		try{
			if($('#<portlet:namespace /><%=elementName%>_fileName').val() =="" && $('#<portlet:namespace /><%=elementName%>_connectionDocumentId').val()==""){
				return;
			}
			var successFunc=<portlet:namespace /><%=elementName%>_onDeleteSuccess;
			deleteConnectionDocument($('#<portlet:namespace /><%=elementName%>_connectionDocumentId').val(), successFunc);
		}catch(err){}
	});
</aui:script>
<script>

<%--
function <%=elementName%>_clearFile(){
	var yn=confirm("Are you sure you want to remove the file?");
	if(yn){
		$('#<portlet:namespace /><%=elementName%>_deleteBtn').trigger('click');
		$('#<%=elementName%>_fileViewContainer').css('display','none');
		$('#<%=elementName%>_container').css('display','block');
		$('.progress-bar').attr('style', "width: 0%");
	}
}--%>
</script>
<%--
<div class="custom-file">
	<input type="file" class="custom-file-input" onchange="uploadFile('<portlet:namespace/><%=elementName%>', <%=progressBarId%>)" name="<portlet:namespace/><%=elementName+"_file"%>" id="<portlet:namespace/><%=elementName+"_file"%>">
	<label class="custom-file-label" for="customFile">Upload a file</label>
	<input type="hidden" name="<portlet:namespace/><%=elementName%>" id="<portlet:namespace/><%=elementName%>">
</div> 
<liferay-ui:upload-progress id="<%=progressBarId%>" message="uploading" height="5" />
--%>
