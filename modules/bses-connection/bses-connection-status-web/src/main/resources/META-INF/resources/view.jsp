<%@ include file="init.jsp" %>

<style>
.lexicon-icon-asterisk {
	color:red;
	width:5px !important;
	height:5px !important;
    display: inline-block !important;
    vertical-align: top !important;
}

.bg-danger {
    background-color: #dc3545!important;
}

.card-header {
    padding: 0.75rem 1.25rem;
    margin-bottom: 0;
    background-color: rgba(0,0,0,.03);
    border-bottom: 1px solid rgba(0,0,0,.125);
}

#wrapper h5, .bsesportal body #wrapper .x-18 {
    font-size: 18px;
    color: #fff!important;
}
</style>

<portlet:actionURL var="connectionStatusURL" name="getRequestStatus"/>

<liferay-ui:error key='error.message' message="${errorMessage}" />
<liferay-ui:error key='order.status.service.error' message="Web Service Error" />

<div>

	<div class="col-md-5">
		<div class="card">
			<div class="card-header bg-danger">
				<h5>Application Status</h5>
			</div>
			<div class="card-body">
				<aui:form action="<%=connectionStatusURL.toString()%>">
					<div class="container-fluid">
						<div class="col-md-12">
							<div class=" mb-4">
								<aui:input type="text" name="requestNumber"
									label="Application/Order No." maxlength="20">
									<aui:validator name="required"
										errorMessage="Please enter valid application number!" />
								</aui:input>
							</div>
							<div class="row mb-4">
							<div class="col-md-12 ">
								<div class="float-right m-5">
									<aui:button type="button" cssClass="btn-success" id="reset" value="Reset"></aui:button>
									<aui:button type="submit"  cssClass="btn-primary" id="checkStatus" value="Submit"></aui:button>
								</div>
							</div>
						</div>
						</div>
					</div>
				</aui:form>

			</div>
		</div>
	</div>
</div>


<c:if test="${viewStatus eq 'true'}">
<div class="col-md-7" id="status_view_div">
	<div class="card">
		<table class="table table-bordered table-striped">
			<tr>
				<td><strong>Application/ Order No</strong></td>
				<td><strong>Description</strong></td>
				<td><strong>Status</strong></td>
			</tr>
			<tr>
				<td>${orderNo}</td>
				<td>${description}</td>
				<td>${status}</td>
			</tr>
		</table>
	</div>
</div>
</c:if>


<aui:script use="aui-base liferay-form">

$('#<portlet:namespace />reset').click(function() {
		$("#<portlet:namespace/>requestNumber").val("");
		$("#status_view_div").hide();
	});

</aui:script>