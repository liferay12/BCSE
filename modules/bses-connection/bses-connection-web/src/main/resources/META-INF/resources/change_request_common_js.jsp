<%@page import="com.bses.connection2.util.RequestTypeModeStatus"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@ include file="/init.jsp"%>

<%	
	String	soapUrl="/bsesconn.connectionrequest/submit-change-request-to-soap";

	String autoSaveFlag = PropsUtil.get("connection.request.auto.save");
	long autoSaveFrequency=10;
	try{
		autoSaveFrequency=Integer.parseInt(PropsUtil.get("connection.request.auto.save.interval").trim());
	}catch(Exception e){}
	
	long maxDocumentSize=5350400;
	try{
		maxDocumentSize=Long.parseLong(PropsUtil.get("connection.request.document.max.size").trim());
	}catch(Exception e){}
	
	if(autoSaveFlag!=null){
		try{
			autoSaveFlag=String.valueOf(Boolean.parseBoolean(autoSaveFlag));
		}catch(Exception e){}
	}else{
		autoSaveFlag="true";
	}
	autoSaveFlag="false";
 %>	

<liferay-portlet:resourceURL id="searchLocality" var="searchLocalityURL" />

<portlet:renderURL var="previewURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>" >
	<portlet:param name="mvcPath" value="/preview_change_request.jsp" />
	<portlet:param name="connectionRequestId" value="<%=String.valueOf(connectionRequestId) %>" />
</portlet:renderURL>

<portlet:resourceURL var="documentUploadURL" id="documentUpload">
	<portlet:param name="cmd" value="upload"/>
</portlet:resourceURL>

<portlet:resourceURL var="documentDownloadURL" id="documentDownload">
	<portlet:param name="cmd" value="download"/>
</portlet:resourceURL>

<portlet:renderURL var="documentViewerURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="mvcPath" value="/document_viewer.jsp" />
</portlet:renderURL>

<portlet:renderURL var="emailVerificationURL">
	<portlet:param name="mvcPath" value="/email_verification.jsp" />
	<portlet:param name="connectionRequestId" value="<%=String.valueOf(connectionRequestId) %>" />
</portlet:renderURL>

<portlet:renderURL var="acknowledgementURL" >
	<portlet:param name="mvcPath" value="/acknowledgement.jsp" />
	<portlet:param name="connectionRequestId" value="<%=String.valueOf(requestEntity.getConnectionRequestId()) %>" />
	<portlet:param name="showHeader" value="true" />
</portlet:renderURL>

<portlet:renderURL var="emailPopupUrl" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
 <portlet:param name="mvcPath" value="/email_verification.jsp"/>
 <portlet:param name="connectionRequestId" value="<%=String.valueOf(requestEntity.getConnectionRequestId()) %>" />
</portlet:renderURL>

<aui:script use="aui-base,aui-modal,aui-overlay-manager,autocomplete-list,datasource-io">

var portletNamespace="<portlet:namespace/>";
var autoSaveFlag = <%=autoSaveFlag%>;
var autoSaveFrequency= <%=autoSaveFrequency%>;
var maxDocumentSize = <%=maxDocumentSize%>;
var soapUrl = "<%=soapUrl%>";

var localityDataSource;

function initLocalityDataSource(){
	var datasource = new A.DataSource.IO({
		source: '<%=searchLocalityURL%>'
	});
	
	var autoComplete = new A.AutoCompleteList({
		allowBrowserAutocomplete: false,
		activateFirstItem: true,
		inputNode: '#<portlet:namespace />localityName',
		maxResults: 500,
		on: {
			select: function(event) {
				var result = event.result.raw;
				$('#<portlet:namespace />districtName').val(result.value);
				$('#<portlet:namespace />district').val(result.code);
			}
		},
		render: true,
		source: datasource,
		requestTemplate: '&<portlet:namespace />keywords={query}',
		resultListLocator: function (response) {
			var responseData = A.JSON.parse(response[0].responseText);
			return responseData.response;
		},
		resultTextLocator: function (result) {
			//alert(result.value);
			return result.key;
		},
		width: 400
	}); 
}

$(document).ready(function() {
	
	documentOnload();

	showHideComponents();
});
	
function showHideComponents(){
		
	try{showHideConsumerTypeDiv();}catch(e){}
	try{showDistrict();}catch(e){}
	try{showHideUpicNoDiv();}catch(e){}
	try{showHideBuilding15_17();}catch(e){}
	try{showHideFccUpload();}catch(e){}
	try{showHideLiftUpload();}catch(e){}
	try{showHideWiringUpload();}catch(e){}
	try{showHideEmailServiceDiv();}catch(e){}
	try{handleTariffCategoryChange();}catch(e){}
	try{showHideBDOCertUpload();}catch(e){}
	try{
		setBuildingHeightChk();
	}catch(err){}
}
	


function documentOnload(){
	try{handleConsumerTypeChange();}catch(e){}
	
	try{handleLocalityChange();}catch(e){}
	try{tariffCategoryOnChange();}catch(e){}
	try{buildingTypeOnChange();}catch(e){}

	try{kvaOnChange();}catch(e){}
	try{kwOnChange();}catch(e){}
	try{connectionTypeOnChange();}catch(e){}
	
	try{ownershipProofTypeOnChange();}catch(e){}
	try{idProofTypeOnChange();}catch(e){}
	try{upicAvailableOnChange();}catch(e){}
		
	
	try{elcbOnChange();}catch(e){}
	try{stiltParkingOnChange();}catch(e){}
	try{building9OnChange();}catch(e){}
	try{building12OnChange();}catch(e){}
	try{building15OnChange();}catch(e){}
	try{building17OnChange();}catch(e){}
	try{fccOnChange();}catch(e){}
	try{liftInstalledOnChange();}catch(e){}
	try{liftCertOnChange();}catch(e){}
	try{wiringOnChange();}catch(e){}
	try{industrialLicenseOnChange();}catch(e){}
	try{dpccCertificateOnChange();}catch(e){}
	try{bdoCertOnChange();}catch(e){}
	try{emailServiceOnChange();}catch(e){}
	try{dpccClearanceRequiredOnChange();}catch(e){}
	try{nonConfirmingAreaOnChange();}catch(e){}
	try{tradeLicenseOnChange();}catch(e){}
	
	
	try{	
		$("#liftblink").hide();
		$("#bdocertblink").hide();
	}catch(e){}

	try{	
		autoSave();
	}catch(e){}
	
	try{
		handleSubmitBtnClick();
	}catch(e){}
	
	try{
		handlePreviewBtnClick();
	}catch(e){}
	
}

Liferay.provide(window,'showHideElement', function (element, showHide, docNameErrorClear) {
	try{
		if (showHide) {
			$(element).show();
		} else {
			$(element).hide();
		}
		if(docNameErrorClear!=''){
			clearDocumentError(docNameErrorClear);
		}
	}catch(err){}
});	

Liferay.provide(window,'blinkText', function () {	
	setInterval(function () {
		$(".blink").each(function( index ) {
			console.log($(this).css("opacity"));
            $(this).css("opacity", 
            ($(this).css("opacity") == 0 ? 1 : 0));
       
		});
	}, 1000);
});
	
Liferay.provide(window, 'uploadFile', function(connectionRequestId, connectionDocumentId, documentType, documentName, fileElement, currentMaxFileSize, acceptTypes, uploadProgressBar, onSuccess, onFailure) {

	var fileSelected=readFileUrl(fileElement);
	
	if(!fileSelected){
		onFailure("No file selected for uploading.");
		return false;
	}
	
    var mimeType=fileSelected.type;
    if(acceptTypes.indexOf(mimeType)<0){
    	//alert("The file type selected is not accepted for uploading.");
    	onFailure("The file type selected is not accepted for uploading.");
    	return;
    }
    if(currentMaxFileSize>0){
     	if(currentMaxFileSize<fileSelected.size){
	    	var showSize;
	    	var size=Math.round((currentMaxFileSize/1024)/1024);
	    	if(size>=1){
	    		showSize=size +" MB";
	    	}else{
	    		showSize=Math.round(currentMaxFileSize/1024)+" KB";
	    	}
	    	//alert("The file size must be less than or equals to "+showSize);
	    	onFailure("The file size must be less than or equals to "+showSize);
	    	return;
    	}
    }else if(maxDocumentSize>0 && maxDocumentSize < fileSelected.size){
    	var showSize;
    	var size=Math.round(maxDocumentSize/1024/1024);
    	if(size>=1){
    		showSize=size +" MB";
    	}else{
    		showSize=Math.round(maxDocumentSize/1024)+" KB";
    	}
    	//alert("The file size must be less than or equals to "+showSize);
    	onFailure("The file size must be less than or equals to "+showSize);
    	return;
    }
    var description="Uploaded file";
    var changeLog=description;
    
	if(uploadProgressBar){
		uploadProgressBar.startProgress();
	}
	
	addFileEntryWithFile(connectionRequestId, connectionDocumentId, documentType, documentName, fileSelected, acceptTypes, onSuccess, onFailure);
		//callback(fileElement, response);
	//});
	
	return fileSelected;
});

<%--Liferay.provide(window,'readFileUrl', function (fileElement) {	--%>
	
function readFileUrl(fileElement){
	if(!$(fileElement) || !$(fileElement).prop('files') || $(fileElement).prop('files').length<1){
		return null;
	}

	var fileSelected = $(fileElement).prop('files')[0];

	if(fileSelected){	
		return fileSelected;
	}else{
		return null;
	}
}

<%--});--%>

Liferay.provide(window,'addFileEntryWithFile', function (connectionRequestId, connectionDocumentId, documentType, documentName, file, acceptTypes, onSuccess, onFailure) {	
	
	var form = new FormData();
	form.append("file", file, file.name);
	
	form.append("name", file.name);
	form.append("mimeType", file.type);
	form.append("connectionRequestId", connectionRequestId);
	form.append("connectionDocumentId", connectionDocumentId);
	form.append("documentType", documentType);
	form.append("documentName", documentName);
	form.append("description", documentName);
	form.append("changeLog", "Uploaded "+documentName+" on "+(new Date()));
	
	console.log(form);
	
	var settings = {
		"url": "<%=documentUploadURL.toString()%>",
		"method": "POST",
		"timeout": 0,
		"headers": {},
		"processData": false,
		"mimeType": "multipart/form-data",
		"contentType": false,
		"data": form
	};
	
	
	$.ajax(settings).done(function (response) {
		//console.log("addFileEntryWithFile");
		//console.log(response);
		onSuccess(JSON.parse(response));
	}).fail(function (jqXHR, exception) {
		onFailure(jqXHR.responseText);
	});
});

Liferay.provide(window,'funcOnSaveSuccess', function (obj) {	
	console.log(obj);
});

Liferay.provide(window,'funcOnSaveFailure', function (obj) {		
	console.log(obj);
});

Liferay.provide(window,'validateForm', function (formId) {	
	var liferayForm = Liferay.Form.get(formId);
	//var liferayForm = Liferay.Form.get('#'+formId);
    if (liferayForm) {
        var validator = liferayForm.formValidator;
        
		//alert("A.instanceOf(validator, A.FormValidator): "+(A.instanceOf(validator, A.FormValidator)));
		//if (A.instanceOf(validator, A.FormValidator)) {
            validator.validate();

            var hasErrors = validator.hasErrors();
			//alert(hasErrors);
			console.log(validator);
            if (hasErrors) {
                validator.focusInvalidField();

                return false;
            }
        //}
   	}
    return true;
});

	
Liferay.provide(window,'handleSubmitSuccess', function () {		
	window.location.href="<%=acknowledgementURL.toString() %>";
});

	
//************ Auto Save ****************

	
Liferay.provide(window,'submitFormDataJson', function (formDataJson, sectionPrefix, onSuccess, onFailure) {
    AUI().use('aui-base', function(A){
        Liferay.Service(
            '/bsesconn.connectionrequest/update-connection-request', //call your service here
            {
            	connectionRequestId:<%=connectionRequestId%>,
                params: formDataJson,
                sectionPrefix:sectionPrefix
            },
            function(obj) {
                try{
                    onSuccess(obj);
                }catch(e){}
            }
        );
    });	
});

//************ Auto Save End****************

Liferay.provide(window,'deleteConnectionDocument', function (connectionDocumentId, onSuccess) {
	AUI().use('aui-base', function(A){
        Liferay.Service(
            '/bsesconn.connectiondocument/remove-connection-document', //call your service here
            {
            	connectionDocumentId:connectionDocumentId
            },
            function(obj) {
            	
                try{
                    onSuccess(obj);
                }catch(e){}
            }
        );
    });	
});
	
Liferay.provide(window,'clearDocumentError', function (elementName) {	
	$("#<portlet:namespace/>"+elementName+"_errorMessage").html('');
});

Liferay.provide(window,'clearDocument', function (elementName) {	
	$("#<portlet:namespace/>"+elementName+"_errorMessage").html('');
	$("#<portlet:namespace/>"+elementName+"_connectionDocumentId").val('');
	$("#<portlet:namespace/>"+elementName+"_fileName").val('');
	$("#<portlet:namespace/>"+elementName+"_displayFileName").html('');
});

</aui:script>
<script>
var portletNamespace="<portlet:namespace/>";
var autoSaveFlag = <%=autoSaveFlag%>;
var submitFlag = false;
var autoSaveFrequency= <%=autoSaveFrequency%>;
var maxDocumentSize = <%=maxDocumentSize%>;
var soapUrl = "<%=soapUrl%>";

(function ($)
{
    $.fn.serializeFormJSON = function () {

        var o = {};
        var a = this.serializeArray();
        $.each(a, function () {
            if (o[this.name]) {
                if (!o[this.name].push) {
                    o[this.name] = [o[this.name]];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };
})(jQuery);


function handlePreviewBtnClick() {	
	
	if($("#<portlet:namespace/>previewBtn")){
		$("#<portlet:namespace/>previewBtn").click(function() {
			//alert("previewBtn clicked");
				submitForms(
						function (){
							window.open("<%=previewURL.toString() %>","_blank");
						}
				);
		});
	}
}


<%--
Liferay.provide(window,'handleSubmitBtnClick', function (validate) {
--%>

function handleSubmitBtnClick(validate) {	
	$("#<portlet:namespace/>submitBtn").click(function() {
		//alert("submitBtn clicked");
		
		if(!submitFlag){
			try{setConsumerform();}catch(err){}
			try{setConnectionForm();}catch(err){}
			try{setChecklist();}catch(err){}
			submitRequest();
		
		}else{
			//alert("Please wait, your request is in process");
		}
		
		setTimeout(function (){
			submitFlag=false;
		},7000);
	
	});
}

function setConsumerform () {	
	var consumerType=$('#'+portletNamespace+'consumerType').val();
	if (consumerType != 'Firm') {
		$("#<portlet:namespace/>firmName").val("");
		$("#<portlet:namespace/>signatoryName").val("");
		$("#<portlet:namespace/>signatoryDesignation").val("");
		$("#<portlet:namespace/>organizationType").val("");
		$("#<portlet:namespace/>incorporationDate").val("");
		$("#<portlet:namespace/>gstNo").val("");
		$("#<portlet:namespace/>panNo").val("");
		
	} else {
		$("#<portlet:namespace/>title").val(''); 
		$("#<portlet:namespace/>firstName").val("");
		$("#<portlet:namespace/>middleName").val("");
		$("#<portlet:namespace/>lastName").val("");
		$("#<portlet:namespace/>fatherOrHusbandName").val("");
		
	}
}

function setConnectionForm () {	
	try{
		var connectionType=$("input[name=<portlet:namespace/>connectionType]:checked").val();
		if (connectionType == "1") {
			$("#<portlet:namespace/>tempStartDate").val("");
			$("#<portlet:namespace/>tempEndDate").val("");
		}
	}catch(err){}
	
	if ($("#<portlet:namespace/>tariffCategory").val() != '0700'){
		$("#<portlet:namespace/>evUsage").val('');
	}
	
}

function setChecklist(){
	var loadKw=$("#<portlet:namespace/>loadKw").val();
	if(loadKw=="" || loadKw < "2" ){
		$("input[name=<portlet:namespace/>elcbInstalled][value=0]").prop('checked', true);
	}
	
	if($("#<portlet:namespace/>tariffCategory").val() != "0250"){
		$("input[name=<portlet:namespace/>hasBdoCertificate][value=0]").prop('checked', true);
	}
	
	if($("#<portlet:namespace/>tariffCategory").val() != "0100"){
		$("input[name=<portlet:namespace/>stiltParking][value=0]").prop('checked', true);
		$("input[name=<portlet:namespace/>height17Mtr][value=1]").prop('checked', true);
	}
	if($("#<portlet:namespace/>tariffCategory").val() != "0320"){
		$("input[name=<portlet:namespace/>industrialLicense][value=0]").prop('checked', true);
	}
	
	// remove extra documents 
	clearChkListDocs();
}


function saveChecklistForm(forms,currentIndex,successCallback) {	
	//alert("saveChecklistForm");
	console.log("In saveChecklistForm");
	var formDataJson={};
	formDataJson['<portlet:namespace/>wiringTest']=$("input[name=<portlet:namespace/>wiringTest]:checked").val();
	formDataJson['<portlet:namespace/>elcbInstalled']=$("input[name=<portlet:namespace/>elcbInstalled]:checked").val();
	formDataJson['<portlet:namespace/>stiltParking']=$("input[name=<portlet:namespace/>stiltParking]:checked").val();
	formDataJson['<portlet:namespace/>height9Mtr']=$("input[name=<portlet:namespace/>height9Mtr]:checked").val();
	formDataJson['<portlet:namespace/>height12Mtr']=$("input[name=<portlet:namespace/>height12Mtr]:checked").val();
	formDataJson['<portlet:namespace/>height15Mtr']=$("input[name=<portlet:namespace/>height15Mtr]:checked").val();
	formDataJson['<portlet:namespace/>height17Mtr']=$("input[name=<portlet:namespace/>height17Mtr]:checked").val();
	formDataJson['<portlet:namespace/>fcc']=$("input[name=<portlet:namespace/>fcc]:checked").val();
	formDataJson['<portlet:namespace/>industrialLicense']=$("input[name=<portlet:namespace/>industrialLicense]:checked").val();
	formDataJson['<portlet:namespace/>liftInstalled']=$("input[name=<portlet:namespace/>liftInstalled]:checked").val();
	formDataJson['<portlet:namespace/>hasLiftCertificate']=$("input[name=<portlet:namespace/>hasLiftCertificate]:checked").val();
	formDataJson['<portlet:namespace/>hasBdoCertificate']=$("input[name=<portlet:namespace/>hasBdoCertificate]:checked").val();
	formDataJson['<portlet:namespace/>dpccClearanceRequired']=$("input[name=<portlet:namespace/>dpccClearanceRequired]:checked").val();
	formDataJson['<portlet:namespace/>hasDpccCertificate']=$("input[name=<portlet:namespace/>hasDpccCertificate]:checked").val();
	
	formDataJson['<portlet:namespace/>nonConfirmingArea']=$("input[name=<portlet:namespace/>nonConfirmingArea]:checked").val();
	formDataJson['<portlet:namespace/>hasTradeLicense']=$("input[name=<portlet:namespace/>hasTradeLicense]:checked").val();
	
	formDataJson['<portlet:namespace/>hasPollutionCertificate']=$("input[name=<portlet:namespace/>hasPollutionCertificate]:checked").val();
	formDataJson['<portlet:namespace/>eServiceOnMail']=$("input[name=<portlet:namespace/>eServiceOnMail]:checked").val();
	formDataJson['<portlet:namespace/>eServiceMailId']=$("#<portlet:namespace/>eServiceMailId").val();
	formDataJson['<portlet:namespace/>optSubsidy']=$("input[name=<portlet:namespace/>optSubsidy]:checked").val();
	formDataJson['<portlet:namespace/>purchaseMeter']=$("input[name=<portlet:namespace/>purchaseMeter]:checked").val();
	formDataJson['namespace']='<portlet:namespace/>';
	
	AUI().use('aui-base', function(A){
        Liferay.Service(
            '/bsesconn.connectionrequest/update-connection-request', //call your service here
            {
            	connectionRequestId:<%=connectionRequestId%>,
                params: formDataJson,
                sectionPrefix:'checklist'
            },
            function(obj) {
                //console.log("saveChecklistForm : "+obj);
                try{
                	submitFormDetails(forms,currentIndex+1,successCallback);
                }catch(e){}
            }
        );
    });	
}


function saveDocumentForm(forms,currentIndex,successCallback) {
//	alert("saveDocumentForm");
	console.log("in saveDocumentForm");
	var formDataJson={};
	formDataJson['<portlet:namespace/>idProofType']=$("#<portlet:namespace/>idProofType").val();
	formDataJson['<portlet:namespace/>idProofNo']=$("#<portlet:namespace/>idProofNo").val();
	if($("#<portlet:namespace/>ownershipProofType")){
		formDataJson['<portlet:namespace/>ownershipProofType']=$("#<portlet:namespace/>ownershipProofType").val();
	}
	formDataJson['namespace']='<portlet:namespace/>';
	//console.log(formDataJson);
	AUI().use('aui-base', function(A){
        Liferay.Service(
            '/bsesconn.connectionrequest/update-connection-request', //call your service here
            {
            	connectionRequestId:<%=connectionRequestId%>,
                params: formDataJson,
                sectionPrefix:'document'
            },
            function(obj) {
                //console.log("saveDocumentForm : "+obj);
                submitFormDetails(forms,currentIndex+1,successCallback);
            }
        );
    });	
}


<%--
Liferay.provide(window,'submitRequest', function () {
--%>

function submitRequest() {		
	//alert("submitRequest called")

	if(validateForms()){
		submitFlag = true;		
		submitForms(
				function(){
					var isLoadReduction = false;
					try{
						if($("input[name=<portlet:namespace />changeRequestType]:checked").val()=="U04"){
							isLoadReduction=true;
						}
					}catch(err){}
					if($("input[name=<portlet:namespace />eServiceOnMail]:checked").val()==1 && $("input[name=<portlet:namespace/>eServiceMailId]").val() !="" && isLoadReduction==false){
						verifyEmailAndSubmitRequest();
					}else{
						callSOAPService();
					}
			}
		);
	}else{
		alert("Please enter all required fields...");
		submitFlag =false;
	}
		
}

function callSOAPService(){
	AUI().use('aui-base', function(A){
        Liferay.Service(soapUrl, //call your service here
            {
            	connectionRequestId:<%=connectionRequestId%>
            },
            function(obj) {
            	//alert("Submitted to soap...."+obj);
            	console.log("in submitSoap ============ ");
            	//console.log(obj)
                try{
                	if(obj=="success"){
                		//handleSubmitSuccess();
                		window.location.href="<%=acknowledgementURL.toString()%>";
                	}else if(obj.includes("Error")){
                		alert(obj);
                		submitFlag = false;
                	}else{
                		alert("Online service is not available currently, please try after some time");
                		submitFlag = false;
                	}
                    //onSuccess(obj);
                }catch(e){
                	console.log(e);
                }
            }
        );
    });	
}

function submitForms(successCallback) {		
	console.log("Calling saveForms");
	var forms = [];
	var  validForms = true;
	$(".form-auto-save").each(function( ) {
		forms.push(this);
	});
	
	var chkForm = $("#<portlet:namespace/>checklistForm");
	if(chkForm){
		forms.push(chkForm);
	}
	var documentForm = $("#<portlet:namespace/>documentForm");
	if(documentForm){
		forms.push(documentForm);
	}
	submitFormDetails(forms,0,successCallback);
}


function validateForms(){
	var  validForms = true;
	
	if(!validateFormForSubmit("<portlet:namespace/>checklistForm")){
		validForms=false;
	}
	
	if(!validateFormForSubmit("<portlet:namespace/>declarationForm")){
		validForms=false;
	}	
	
	if(!validateFormForSubmit("<portlet:namespace/>documentForm")){
		validForms=false;
	}
	
	$($(".form-auto-save").get().reverse()).each(function( ) {
		//alert($(this).attr('id'));
		if(!validateFormForSubmit($(this).attr('id'))){
		  console.log("form# "+$(this).attr('id') +" -- failed");
		  validForms = false;
	   }
	});
	
	return validForms;
}



function validateFormForSubmit(formId) {	
	var liferayForm = Liferay.Form.get(formId);
	//var liferayForm = Liferay.Form.get('#'+formId);
    if (liferayForm) {
        var validator = liferayForm.formValidator;
        
		//alert("A.instanceOf(validator, A.FormValidator): "+(A.instanceOf(validator, A.FormValidator)));
		//if (A.instanceOf(validator, A.FormValidator)) {
            validator.validate();

            var hasErrors = validator.hasErrors();
			
			console.log(validator);
            if (hasErrors) {
           	// alert(formId + "has error"+hasErrors);
                validator.focusInvalidField();

                return false;
            }
        //}
   	}
    return true;
}


function submitFormDetails(forms, currentIndex,successCallback) {		
	if(currentIndex <forms.length){
		var formItem =forms[currentIndex];
		var formId = $(formItem).attr('id');
		if(formId == "<portlet:namespace/>checklistForm"){
			saveChecklistForm(forms, currentIndex,successCallback);
		}else if(formId =="<portlet:namespace/>documentForm"){
			saveDocumentForm(forms,currentIndex,successCallback);
		}else{
			var sectionPrefixVal =  $(formItem).attr('section-attr');
			var formDataJson = $("#"+formId).serializeFormJSON();
			formDataJson['namespace']='<portlet:namespace/>';
			
			 AUI().use('aui-base', function(A){
			        Liferay.Service(
			            '/bsesconn.connectionrequest/update-connection-request', //call your service here
			            {
			            	connectionRequestId:<%=connectionRequestId%>,
			                params: formDataJson,
			                sectionPrefix:sectionPrefixVal
			            },
			            function(obj) {
			                try{
			                	submitFormDetails(forms,currentIndex+1,successCallback);
			                }catch(e){}
			            }
			        );
			    });	
		}
	}else if(successCallback !=null ){
		successCallback();
	}
}


<%--
Liferay.provide(window,'autoSaveForm', function (formId, sectionPrefix, validate) {
--%>
function autoSaveForm(formId, sectionPrefix, validate) {
	if(validate && !validateForm(formId)){
        return;
    }
    var formDataJson = $("#"+formId).serializeFormJSON();
    console.log(formId +" submitted ...........");
    console.log(formDataJson);
    formDataJson['namespace']='<portlet:namespace/>';
    
    submitFormDataJson(formDataJson, sectionPrefix, funcOnSaveSuccess, funcOnSaveFailure);
}

<%--
Liferay.provide(window,'submitSoap', function () {
--%>

function submitSoap() {	
	AUI().use('aui-base', function(A){
        Liferay.Service(soapUrl, //call your service here
            {
            	connectionRequestId:<%=connectionRequestId%>
            },
            function(obj) {
            	//alert("Submitted to soap...."+obj);
            	console.log("in submitSoap ============ ");
            	console.log(obj)
                try{
                	if(obj=="success"){
                		handleSubmitSuccess();
                	}else if(obj.includes("Error")){
	                		alert(obj);
	                		submitFlag = false;
                	}else{
                		alert("Online service is not available currently, please try after some time");
                		submitFlag = false;
                	}
                    //onSuccess(obj);
                }catch(e){
                	console.log(e);
                }
            }
        );
    });	
}

<%--
Liferay.provide(window,'autoSave', function () {	
--%>	
function autoSave() {
	setInterval(function () {
		if(autoSaveFlag){
			console.log("Auto save is called...");
			initAutoSaveForms(false);
		}
	}, autoSaveFrequency*1000);
}

<%--	
Liferay.provide(window,'initAutoSaveForms', function (validate) {	
--%>
function initAutoSaveForms(validate) {	
	console.log("Calling saveForms");
	
	var timeout=0;
	$(".form-auto-save").each(function( index, item ) {
		//console.log("Before submitting : "+index);
		console.log("Submitting "+$(item).attr('id') +" after "+timeout+" milli-seconds.");
		setTimeout(function (){
			autoSaveForm($(item).attr('id'), $(item).attr('section-attr'), validate);
		}, timeout); 
		timeout+=2000;
	}, timeout);
	
	setTimeout(function (){
		saveChecklistForm();
	},1000);
	
	setTimeout(function (){
		saveDocumentForm();
	},1000);
}

function between(date1, date2, date3){
	if(date1.getTime() > date2.getTime() && date1.getTime() < date3.getTime()){
		return true;
	}
}

function dateDiff(date1, date2){
	return (date1.getTime()-date2.getTime());
}

function yyyyMMddStrToDate(strDate){
	var parts =strDate.split('-');
	// Please pay attention to the month (parts[1]); JavaScript counts months from 0:
	// January - 0, February - 1, etc.
	return new Date(parts[0], parts[1] - 1, parts[2]); 
}

function onlyDate(dtDate2){
	return new Date(dtDate2.getFullYear(), dtDate2.getMonth(), dtDate2.getDate()); 
}

function uploadRequired(elementName,cType){
	
	if(elementName=="idProof" || elementName=="ownershipProof" || elementName=="applicantPhoto" || elementName=="applicantSignature"){
		return true;
	}
	
	var consumerType=AUI.$('#<portlet:namespace />consumerType').val();
	
	if(consumerType==cType && consumerType=="Firm"){
		return true;
	}
	return false;
}

function verifyEmailAndSubmitRequest(){

	Liferay.Util.openWindow({
	    dialog: {
		     centered: true,
		     height: 340,
		     modal: true,
		     width: 460,
		     destroyOnHide: true,
             resizable: false,
             on : {
					close : function(event) {
						submitFlag = false;
					},
					destroy : function(event) {
						submitFlag = false;
					}
				}
		  },
		  title: "Email Verification",
		  id: '<portlet:namespace />emailVerificationDialog',
		  uri: '<%= emailPopupUrl%>'
		});
}

</script>