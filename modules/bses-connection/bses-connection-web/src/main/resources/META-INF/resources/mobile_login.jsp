<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@ include file="/init.jsp"%>

<portlet:actionURL name="newConnectionLogin" var="newConnectionLoginURL" />

<%
	boolean otpValidation = true;
	String defaultMobileNo = "9871460369";
%>
<style>
.termAncher a {
	display: block;
	font-size: 14px;
	color: #666;
	margin-bottom: 10px;
}

.lexicon-icon-asterisk {
	color: red;
	width: 5px !important;
	height: 5px !important;
	display: inline-block !important;
	vertical-align: top !important;
}

.text-warning {
	color: #bf343c !important;
}

input::-webkit-outer-spin-button,
input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  margin: 0;
}

input[type=number] {
  -moz-appearance: textfield;
}
</style>


<div class="container-fluid">
	<div class="row">
		<div class="col-md-5">
			<div class="card">
				<div class="card-header bg-danger">
					<h5 class="font-weight-bold text-white">Mobile Login</h5>
				</div>
				<div class="card-body">
					<aui:form role="form" action="<%=newConnectionLoginURL.toString()%>" name="generateOtpForm">
						<div class="container-fluid">
							<%--<div class="row">
								
								<div class="col-md-12">
									<div class="form-group mb-4">
										<h5>Mobile Login</h5>
									</div>
								</div>
								</div>
								 --%>
							<div class="col-md-12">
								<div class="form-group mb-4">
									<aui:input type="text" class="form-control" name="mobileNo" label="otp-login-mobile-no" maxlength="10" oninput="javascript: this.value = this.value.replace(/[^0-9]/g, '');">
										<aui:validator name="required" errorMessage="Please enter 10 digit's valid mobile number!" />
										<aui:validator name="digits" errorMessage="Please enter 10 digit's valid mobile number!" />
										<aui:validator name="minLength" errorMessage="Please enter 10 digit's valid mobile number!">10</aui:validator>
										<aui:validator name="maxLength" errorMessage="Please enter 10 digit's valid mobile number!">10</aui:validator>
									</aui:input>
									<aui:input type="email" class="form-control" name="emailId" label="otp-login-email-id" maxlength="50">
										<aui:validator name="email" />
									</aui:input>

									<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.READ%>" />
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="btn-group btn-group-sm mt-2 float-right">
										<aui:button type="button" cssClass="btn-primary" id="generateOtp" value="Submit"></aui:button>
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
											<liferay-ui:message key="otp-login-otp-sent" />
										</p>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12">
									<div class="form-group mb-1">
										<aui:input type="text" class="form-control" name="otp" label="otp-login-otp" maxlength="7" oninput="javascript: this.value = this.value.replace(/[^0-9]/g, '');">
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
										<aui:button type="button" cssClass="btn-primary mr-3" id="resendOtp" value="Resend OTP"></aui:button>
										<!-- a href="typeConnection.html" class="btn btn-danger">Submit</a> -->
										<aui:button cssClass="btn-danger" id="validateOtp" value=" Submit " />
									</div>
								</div>
							</div>
						</div>
					</aui:form>
				</div>
			</div>
		</div>
		<div class="col-md-7">
			<liferay-portlet:runtime portletName="com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_gkSXnFw7NGwB1234" />
		</div>
	</div>
</div>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<liferay-util:include page="/guidelines.jsp" servletContext="<%=application%>" />
		</div>
	</div>
</div>

<aui:script use="aui-base liferay-form">
	var otpValidation = <%=otpValidation%>;
	$(document).ready(function() {
		$("#<portlet:namespace/>mobileNo").focus();
		$("#<portlet:namespace/>validateOtpForm").hide();
		$("#wrongotp").hide();
		$("#expireotp").hide();
	});
	function validateForm(formId) {

		var liferayForm = Liferay.Form.get(formId);
		//alert(liferayForm);
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
		if (validateForm('<portlet:namespace/>generateOtpForm')) {
			generateOtp();
		} else {
			return false;
		}

	});

	$('#<portlet:namespace />validateOtp').click(function() {

		if (!otpValidation) {
			$("#<portlet:namespace/>mobileNo").val("<%=defaultMobileNo%>");
			var detailsForm = $("#<portlet:namespace/>generateOtpForm");
			detailsForm.submit();
		} else {
			if (validateForm('<portlet:namespace/>validateOtpForm')) {
				validateOtp();
			} else {
				return false;
			}
		}
	});

	$('#<portlet:namespace />resendOtp').click(function() {
		reGenerateOtp();
	});
	function generateOtp() {
		let mobNo = $('#<portlet:namespace />mobileNo').val();
		var emailId = $('#<portlet:namespace />emailId').val();
		console.log(mobNo + "--------------" + emailId);
		if (!mobNo == "") {
			Liferay.Service('/bsesconn.otp/generate-otp', {
				mobileNo : mobNo,
				email : emailId
			}, function(obj) {
				if (obj != null) {
					console.log("obj----" + obj)
					$("#<portlet:namespace/>generateOtpForm").hide();
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
		let mobileNo = $('#<portlet:namespace />mobileNo').val();
		var otpNumber = $('#<portlet:namespace />otp').val();
		console.log(mobileNo + "--------------" + otpNumber);
		Liferay.Service('/bsesconn.otp/validate-otp', {
			mobileNo : mobileNo,
			otpNumber : otpNumber
		}, function(obj) {
			console.log(obj);
			if (obj == "valid") {
				var detailsForm = $("#<portlet:namespace/>generateOtpForm");
				detailsForm.submit();
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
			Liferay.Service('/bsesconn.otp/resend-otp', {
				mobileNo : mobNo,
				email : emailId
			}, function(obj) {
				console.log(obj);
			});
		}
	}

</aui:script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.runCounter.js"></script>