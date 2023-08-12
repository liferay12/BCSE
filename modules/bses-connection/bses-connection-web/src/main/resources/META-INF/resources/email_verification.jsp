<%@page import="com.bses.connection2.service.ConnectionRequestLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>

<%
	long connectionRequestId = ParamUtil.getLong(request, "connectionRequestId", 0);
	ConnectionRequest requestEntity = ConnectionRequestLocalServiceUtil
			.getConnectionRequest(connectionRequestId);
%>


<portlet:actionURL name="verifyEmail" var="emailVarificationURL" />
<portlet:renderURL var="acknowledgementURL">
	<portlet:param name="mvcPath" value="/acknowledgement.jsp" />
	<portlet:param name="connectionRequestId" value="<%=String.valueOf(requestEntity.getConnectionRequestId())%>" />
</portlet:renderURL>

<style>
.lexicon-icon-asterisk {
	color: red;
	width: 5px !important;
	height: 5px !important;
	display: inline-block !important;
	vertical-align: top !important;
}

.btn-otp {
	color: #ffffff !important;
	font-size: 18px !important;
	font-family: "Helvetica Neue LT Std 67", Helvetica, sans-serif;
	font-weight: 300 !important;
	border: 0;
	background: linear-gradient(to bottom, #ec5f67, #b82d35);
}

.modal-header {
	background: linear-gradient(to bottom, #ec5f67, #b82d35) !important;
	display: block !important;
}

.modal-header .close {
	color: #fff !important;
	font-weight: 700 !important;
	padding: 1rem 1rem !important;
	margin: -1rem 0rem 1rem auto !important;
}
</style>

<%--<div class="container-fluid">
	<div class="row">
		<div class="col-md-3">
			
		</div>
		<div class="col-md-6"> --%>
<div class="card m-3 p-2" style="height:80% !important;">
	<div class="card-body" style="height:98% !important;">
		<aui:form role="form" action="<%=emailVarificationURL.toString()%>" class="" name="generateOtpForm">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12">
						<div class="form-group mb-4">
							<h4>
								To avail e-Bill Services(paperless) on email, Please verify your email - <%=requestEntity.getEServiceMailId()%>
							</h4>
							<aui:input type="hidden" class="form-control" name="emailId" label="otp-login-email-id" value="<%=requestEntity.getEServiceMailId()%>" />
						</div>
					</div>
					<div class="col-md-12 generateOtpForm_action">
						<div class="btn-group btn-group-sm mt-5 float-right">
							<aui:button type="button" cssClass="btn-primary btn-otp mr-3" id="generateOtp" value="Submit"></aui:button>
							<aui:button type="button" cssClass="btn-primary btn-otp" id="closeDialog" value="Cancel"></aui:button>
						</div>
					</div>
				</div>
			</div>
		</aui:form>

		<aui:form role="form" style="display:none;" name="validateOtpForm">
			<div class="container-fluid">
				<div class="row">
					<div class="col-md-12">
						<div class="form-group mb-4">
							<p class="help-text text-danger fs-13 my-3">
								<liferay-ui:message key="otp-email-otp-sent" />
							</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group mb-1">
							<aui:input type="text" class="form-control" name="otp" label="otp-login-otp">
								<aui:validator name="required" errorMessage="Please enter 7 digit's valid OTP!" />
								<aui:validator name="digits" errorMessage="Please enter 7 digit's valid OTP!" />
								<aui:validator name="minLength" errorMessage="Please enter 7 digit's valid OTP!">7</aui:validator>
								<aui:validator name="maxLength" errorMessage="Please enter 7 digit's valid OTP!">7</aui:validator>
							</aui:input>
							<p id="wrongotp" class="far fa-paper-plane fa-fw text-danger">
								<span>Invalid OTP.</span>
							</p>
							<p id="expireotp" class="far fa-paper-plane fa-fw text-danger">
								<span>OTP Expired.</span>
							</p>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="btn-group btn-group-sm mt-2 float-right">
							<aui:button type="button" cssClass="btn-primary mr-3 btn-otp" id="resendOtp" value="Resend OTP"></aui:button>
							<!-- a href="typeConnection.html" class="btn btn-danger">Submit</a> -->
							<aui:button cssClass="btn-danger btn-otp" id="validateOtp" value=" Submit " />
						</div>
					</div>
				</div>
			</div>
		</aui:form>

		<div class="container-fluid email-success" style="display: none;">
			<div class="row">
				<div class="col-md-12">
					<div class="form-group mb-1">
						<p class="far fa-paper-plane fa-fw fs-14 text-primary">
							<liferay-ui:message key="email-services-verified" />
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%--		</div>
		<div class="col-md-3">
			
		</div>
	</div>
</div> --%>

<aui:script use="aui-base liferay-form">
	$(document).ready(function() {
		$("#<portlet:namespace/>emailId").focus();
		$("#<portlet:namespace/>validateOtpForm").hide();
		$("#wrongotp").hide();
		$("#expireotp").hide();
	});
	function validateForm(formId) {

		var liferayForm = Liferay.Form.get(formId);

		if (liferayForm) {
			var validator = liferayForm.formValidator;

			//alert("A.instanceOf(validator, A.FormValidator): "+(A.instanceOf(validator, A.FormValidator)));
			//if (A.instanceOf(validator, A.FormValidator)) {
			validator.validate();

			var hasErrors = validator.hasErrors();

			if (hasErrors) {
				validator.focusInvalidField();

				return false;
			}
			//}
		}
		return true;
	}

	$('#<portlet:namespace />generateOtp').click(function() {
		generateOtp();
	});

	$('#<portlet:namespace />validateOtp').click(function() {
		validateOtp();
	});

	$('#<portlet:namespace />resendOtp').click(function() {
		reGenerateOtp();
	});
	function generateOtp() {
		let mobNo = <%=requestEntity.getMobileNo() %>;
		var emailId = $('#<portlet:namespace />emailId').val();
		console.log(mobNo + "--------------" + emailId);
		if (!mobNo == "") {
			Liferay.Service('/bsesconn.otp/generate-email-otp', {
				mobileNo : mobNo,
				email : emailId
			}, function(obj) {

				if (obj != null) {
					console.log("obj----" + obj)
					//$("#<portlet:namespace/>generateOtpForm").hide();
					$(".generateOtpForm_action").hide();
					$("#<portlet:namespace/>validateOtpForm").show();

					$('#counter').runCounter({
						start : 30,
						end : 0,
						duration : 30000
					});
				}
			});
		}
	}

	function validateOtp() {

		let mobileNo = <%=requestEntity.getMobileNo()%>;
		var otpNumber = $('#<portlet:namespace />otp').val();
		console.log(mobileNo + "--------------" + otpNumber);
		Liferay
				.Service(
						'/bsesconn.otp/validate-otp',
						{
							mobileNo : mobileNo,
							otpNumber : otpNumber
						},
						function(obj) {
							console.log(obj);
							if (obj == "valid") {
								//$("#<portlet:namespace />generateOtpForm").hide();
								$(".generateOtpForm_action").hide();

								$("#<portlet:namespace />validateOtpForm")
										.hide();
								$(".email-success").show();

								var dialog = Liferay.Util
										.getWindow('<portlet:namespace />emailVerificationDialog');
								dialog.destroy();
								Liferay.Util.getOpener().callSOAPService();
							} else if (obj == "invalid") {
								$("#wrongotp").show();
							} else {
								$("#expireotp").show();
							}
						});
	}

	function reGenerateOtp() {

		let mobNo = $('#<portlet:namespace />mobileNo').val();
		var emailId = $('#<portlet:namespace />emailId').val();
		console.log(mobNo + "--------------" + emailId);
		if (!mobNo == "") {
			Liferay.Service('/bsesconn.otp/resend-email-otp', {
				mobileNo : mobNo,
				email : emailId
			}, function(obj) {
				console.log(obj);
			});
		}
	}

	A.one('#<portlet:namespace/>closeDialog').on('click',
		function(event) {
			var dialog = Liferay.Util
					.getWindow('<portlet:namespace />emailVerificationDialog');
			dialog.destroy();
		}
	);
</aui:script>
	


