<%@ include file="/init.jsp"%>

<portlet:actionURL name="caNumberLogin" var="caNumberLoginURL" />
<%
	boolean otpValidation=true;
%>
<style>
.termAncher a{display: block; font-size: 14px; color: #666; margin-bottom: 10px;}
.lexicon-icon-asterisk {
	color:red;
	width:5px !important;
	height:5px !important;
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
					<h5 class="font-weight-bold text-white">Customer Login</h5>
				</div>
				<div class="card-body">
					<aui:form role="form" action="<%=caNumberLoginURL.toString()%>" class="" name="generateOtpForm">
						<div class="container-fluid">
							<div class="row">
								<div class="col-md-12">
										<p class="help-text text-danger fs-13 my-3">
											 OTP will be sent to your registered mobile number, please contact BSES if you want to update mobile number.
										</p>
								</div>
								<div class="col-md-12">
									<div class="form-group mb-4">
										<aui:input type="text" class="form-control" name="caNumber" label="otp-login-ca-number" maxlength="9" oninput="javascript: this.value = this.value.replace(/[^0-9]/g, '');">
											<aui:validator name="required" errorMessage="Please enter 9 digit's valid ca number!"/>
											<aui:validator name="digits" errorMessage="Please enter 9 digit's valid ca number!"/>
											<aui:validator name="minLength" errorMessage="Please enter 9 digit's valid ca number!">9</aui:validator>
											<aui:validator name="maxLength" errorMessage="Please enter 9 digit's valid ca number!">9</aui:validator>
										</aui:input>
										<aui:input type="hidden" name="mobileNo" ></aui:input>
										<aui:input type="text" name="loginMobile" label="otp-login-mobile-no" maxlength="10" oninput="javascript: this.value = this.value.replace(/[^0-9]/g, '');">
											<aui:validator name="required" errorMessage="Please enter 10 digit's valid mobile number!" />
											<aui:validator name="digits" errorMessage="Please enter 10 digit's valid mobile number!" />
											<aui:validator name="minLength" errorMessage="Please enter 10 digit's valid mobile number!">10</aui:validator>
											<aui:validator name="maxLength" errorMessage="Please enter 10 digit's valid mobile number!">10</aui:validator>
										</aui:input>
										<div class="form-validator-stack help-block" id="<portlet:namespace/>caNumberError" style="display:none;" >Please enter valid CA number</div>
									</div>
								</div>
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
											<aui:validator name="required" errorMessage="Please enter 7 digit's valid OTP!"/>
											<aui:validator name="digits" errorMessage="Please enter 7 digit's valid OTP!" />
											<aui:validator name="minLength" errorMessage="Please enter 7 digit's valid OTP!" >7</aui:validator>
											<aui:validator name="maxLength" errorMessage="Please enter 7 digit's valid OTP!" >7</aui:validator>
										</aui:input>
										<aui:input type="hidden" class="form-control" name="otpValidation" label="" value="<%=otpValidation %>" />
										<p id="wrontotp"
												class="far fa-paper-plane fa-fw text-danger">
												<span>Invalid OTP.</span>
											</p>
											<p id="expireotp"
												class="far fa-paper-plane fa-fw text-danger">
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
			<ul class="termAncher p-3 pl-4">
                <h6 class="mt-0 text-danger"><i class="icon-check"></i> Important Guidelines</h6>
                <li><a href="#">Identity Proof Documents required for new connection</a></li>
                <li><a href="#">Proof of ownership or occupancy of premises ( any one of the following ) in favour of applicant </a></li>
                <li><a href="#">Category wise ownership proof</a></li>
                <li><a href="#">The applicant is not the owner of premises</a></li>
                <li><a href="#">Connection for common services</a></li>
                <li><a href="#">Outdoor connections</a></li>
                <li><a href="#">Areas where registered ownership documents are not permitted</a></li>
                <li><a href="#"> Security deposit charges for permanent connections (refundable)</a></li>
                <li><a href="#">Service line cum development charge (non refundable)</a></li>
                <li><a href="#">Annexures</a></li>
             </ul>
		</div>
	</div>
</div>

<aui:script use="aui-base liferay-form">
var otpValidation=<%=otpValidation%>;
var mobileNo="";
$(document).ready(function(){
	$("#<portlet:namespace/>caNumber").focus();
	$("#<portlet:namespace/>validateOtpForm").hide();
	
	$("#wrontotp").hide();
	$("#expireotp").hide();
	$("#<portlet:namespace/>caNumberError").hide();
});
function validateForm(formId){
	
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
		if( validateForm('<portlet:namespace/>generateOtpForm')){
		 	generateOtpforCaNumber();
		 }else{
		 	return false;
		 }
		 
	});
	
$('#<portlet:namespace />validateOtp').click(function() {
	if(!otpValidation){
		var detailsForm = $("#<portlet:namespace/>generateOtpForm");
   		detailsForm.submit();
	}else{
		if( validateForm('<portlet:namespace/>validateOtpForm')){
		 	validateOtp();
		 }else{
		 	return false;
		 }
	}
});
	
$('#<portlet:namespace />resendOtp').click(function() {
	reGenerateOtp();
});
	
function generateOtpforCaNumber(){
	let caNumber = $('#<portlet:namespace />caNumber').val();
	let loginMobile = $('#<portlet:namespace />loginMobile').val();
	console.log(caNumber+"--------------");
	if(!caNumber==""){
	Liferay.Service(
  '/bsesconn.otp/generate-otp-for-ca-number',
  {
    caNumber: caNumber,
    loginMobile: loginMobile 
  },
  function(obj) {
    console.log(obj);
   if(obj == null || obj =="" || obj.toLowerCase().indexOf("error")!=-1){
   		$("#<portlet:namespace/>caNumberError").show();
   }else{
    	mobileNo = obj;
    	$("#<portlet:namespace/>mobileNo").val(mobileNo);
    	$("#<portlet:namespace/>generateOtpForm").hide();
		$("#<portlet:namespace/>validateOtpForm").show();
		$("#<portlet:namespace/>caNumberError").hide();
    }
  });
 }
}
	

function validateOtp(){
	var otpNumber = $('#<portlet:namespace />otp').val();
	console.log(mobileNo+"--------------"+otpNumber);
	Liferay.Service(
  '/bsesconn.otp/validate-otp',
  {
    mobileNo: mobileNo,
    otpNumber: otpNumber
  },
  function(obj) {
    console.log(obj);
    if(obj=="valid"){
   		console.log(obj);
   		var detailsForm = $("#<portlet:namespace/>generateOtpForm");
   		detailsForm.submit();
   }
   else if(obj=="invalid"){
    	$("#wrontotp").show();
    }
    else{
    	$("#expireotp").show();
    }
  }
);
}

function reGenerateOtp(){
	Liferay.Service(
  '/bsesconn.otp/resend-otp',
  {
    mobileNo: mobileNo,
    email: ''
  },
  function(obj) {
    console.log(obj);
  }
);

}
	
</aui:script>
