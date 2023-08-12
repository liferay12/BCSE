<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.bses.connection2.service.LocalityDivisionLocalServiceUtil"%>
<%@page import="com.bses.connection2.model.LocalityDivision"%>
<%@page import="java.util.Map"%>
<%@page import="com.bses.connection2.web.model.MasterData"%>
<%@page import="org.apache.commons.lang3.StringUtils"%>
<%@page import="com.bses.connection2.model.ConnectionRequest"%>
<%@ include file="/init.jsp"%>
<style>
th, td {
	padding: 5px 10px 5px 10px !important;
}
</style>
<%
ConnectionRequest requestEntity=(ConnectionRequest)request.getAttribute(ConnectionRequest.class.getName());
LocalityDivision appointmentDivision=LocalityDivisionLocalServiceUtil.getLocalityDivisionByDivisionCode(requestEntity.getAppointmentDistrict());
String appointmentDistrictName="";
if(appointmentDivision!=null){
	appointmentDistrictName=appointmentDivision.getDivisionName();
}
Calendar calendar=Calendar.getInstance();
calendar.add(Calendar.DAY_OF_MONTH, 1);

DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
String tomorrow=dateFormat.format(calendar.getTime());
calendar.add(Calendar.MONTH, 1);
String dateAfterMonth=dateFormat.format(calendar.getTime());
%>
<portlet:actionURL name="saveForm" var="saveFormActionURL">
	<portlet:param name="formAction" value="saveAppointmentSchedule" />
</portlet:actionURL>

<aui:form cssClass="custom-form form-auto-save" role="form" id ="appointmentForm" name="appointmentForm" section-attr="appointment-schedule">
	<div class="container-fluid bg-white shadow p-5 my-3">
		<div class="row">
			<div class="col-md-12">
				<h6 class="font-weight-bold text-uppercase bg-light p-3"><liferay-ui:message key="appointment-schedule-section-title" /></h6>
			</div>
		</div>

		<div class="row">
			<div class="form-group col-md-4">
				<aui:input type="date" class="form-control" name="appointmentDate" label="appointment-schedule-appointment-date"  min='2022-06-20' max='2022-07-19'>
					<aui:validator name="required"/>
<%--					<aui:validator name="custom" errorMessage="some-error">
				        function (val, fieldNode, ruleValue) {
				       		var todayDatetime=new Date();
				        	var selDatetime=new Date(val);
				        	var selDate=new Date(selDatetime.getFullYear(), selDatetime.getMonth(), selDatetime.getDate());
				       		var todayDate=new Date(todayDatetime.getFullYear(), todayDatetime.getMonth(), todayDatetime.getDate());
				       		var dateAfterMonth=new Date(todayDatetime.getFullYear(), todayDatetime.getMonth()+1, todayDatetime.getDate());
				       		var errorMessage="";
				       		if(selDate.getDay()==1 || selDate.getDay()==7){
				       			errorMessage="Appointment is not available on Saturday and Sunday.";
				       		}else if(selDate>todayDate && selDate<= dateAfterMonth){
				       			errorMessage="Appointment can be booked after today and within a month.";
				       		}
				       		
				       		if(errorMessage!=''){
					       		var myFormValidator = Liferay.Form.get('<portlet:namespace />appointmentForm').formValidator;
								var _ruleData = myFormValidator.get('fieldStrings')[fieldNode.get('name')];
									//console.log( myFormValidator.get('fieldStrings'));
									console.log(_ruleData);
								_ruleData.appointmentDate_custom = errorMessage;	
					            return false;
				            }else{
				            	return true;
				            }
				        }
				    </aui:validator>
 --%>				    
				</aui:input>
			</div>

			<div class="form-group col-md-4">
				<aui:input type="text" class="form-control" name="appointmentDistrictName" label="appointment-schedule-district"  readonly="true"/>
				<aui:input type="hidden" name="appointmentDistrict" label=""  />
			</div>	
					
			<div class="form-group col-md-4">
				<aui:select class="form-control select2" name="appointmentTime" label="appointment-schedule-appointment-time" >
					<aui:option value="" label="-Select-" />
<%
				if(StringUtils.isNotBlank(requestEntity.getAppointmentTime())){
%>				
						<aui:option  label="" />
<%
				}
%>
					<aui:validator name="required"/>
				</aui:select>
				<aui:input type="hidden" name="appointmentFinishTime" label="" value="<%=requestEntity.getAppointmentFinishTime()%>" />
			</div>
		</div>
	</div>
</aui:form>

<div class="modal modal-lg" id="appointment-division-modal">
	<div class="modal-dialog modal-dialog-centered" style="max-width: 760px !important;min-height: 500px !important;">
		<div class="modal-content" style="max-width: 760px !important;min-height: 500px !important;">
			<div class="modal-header" style="border-bottom: none;">
				<h5 class="modal-title" style="font-weight: 600;">Division Wise Slots<span id="schedule-loopup-date"></span></h5>
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body align-items-center justify-content-center" style="padding:25px !important; width:100% !important;">
				<div style="width:100%; height:500px; overflow: scroll;">
					<h6 class="text-danger mb-2">Click on the division name to check the available time slots!</h6> 
					<table style="width:100%; min-height:300px; margin: auto;">
						<thead>
							<tr>
								<th>Name</th>
								<th>Address</th>
								<th>Slots Available</th>
							</tr>
						</thead>
						<tbody id="division-table-body">
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<aui:script use="aui-base  aui-modal,aui-overlay-manager">
	$("#<portlet:namespace/>appointmentDate").attr('min', "<%=tomorrow%>");
	$("#<portlet:namespace/>appointmentDate").attr('max', "<%=dateAfterMonth%>");
	$("#<portlet:namespace/>appointmentDate").change(function(){
		$("#<portlet:namespace/>appointmentTime").empty();

		loadDivisionSlots();
		$('#appointment-division-modal').modal('show');
		
		//getting the division from address.jsp district input
		
		
	})
	function loadDivisionSlots(){
		
		var tbdata=[];
    	tbdata[0]={districtCode:"S1ALN", district:"ALAKNANDA", address:"BLOCK C VISHWAKARMA COLONY PULPEHLADPUR", slotCount:"10"};
    	tbdata[1]={districtCode:"S1KHP", district:"KHANPUR", address:"BLOCK F VISHWAKARMA COLONY PULPEHLADPUR", slotCount:"8"};
    	tbdata[2]={districtCode:"W2MGN", district:"MOHAN GARDEN", address:"BLOCK-A BHAGWATI GARDEN", slotCount:"12"};
    	tbdata[3]={districtCode:"W1NJF", district:"NAJAFGARH", address:"NIRMAL VIHAR DICHAON KALAN", slotCount:"25"};
    	
		var appointmentDate=$("#<portlet:namespace/>appointmentDate").val();
		
		AUI().use('aui-base', function(A){
	        Liferay.Service(
	            '/bsesconn.localitydivision/get-available-division-slots', //call your service here
	            {
	            	appointmentDate:appointmentDate
	            },
	            function(obj) {
	            	console.log("Result from # /bsesconn.localitydivision/get-available-division-slots");
	            	console.log(obj);
	                try{
	                	populateDivisionSlots(obj);
	                }catch(e){
	                	console.log(e);
	                }
	            }
	        );
	    });
	}
	function loadTimeslots(){
		var division=$("#<portlet:namespace/>appointmentDistrict").val();
		var appointmentDate=$("#<portlet:namespace/>appointmentDate")
		/*var slots=[];
		slots[0]={value:"09:30:00", text:"09:30 AM - 10:15 AM"};
		slots[1]={value:"10:15:00", text:"10:15 AM - 11:00 AM"};
		slots[2]={value:"11:00:00", text:"11:00 AM - 11:45 AM"};
		slots[3]={value:"11:45:00", text:"11:45 AM - 12:30 PM"};
		populateAppointmentTimeSlots(slots);*/
		var appointmentTime=$("#<portlet:namespace/>appointmentTime");
		$(appointmentTime).empty();
		$(appointmentTime).append($('<option>', {value : ''}).text('-Select-'));
		
		AUI().use('aui-base', function(A){
	        Liferay.Service(
	            '/bsesconn.connectionrequest/get-available-time-slots', //call your service here
	            {
	            	appointmentDate:appointmentDate,
	            	appointmentDivision:division,
	            },
	            function(obj) {
	            	console.log("Result from # /bsesconn.connectionrequest/get-available-time-slots");
	            	console.log(obj);
	                try{
	                	populateAppointmentTimeSlots(obj);
	                }catch(e){
	                	console.log(e);
	                }
	            }
	        );
	    });
	}
	
	function populateDivisionSlots(divobj){
		$("#division-table-body").html('');
		if($(divobj).length==0){
			$("#division-table-body").append('<tr><td colspan="4" style="text-align:center;">No divisions or timeslots available for the selected date.</td></tr>');
			return;
		}
		$.each(divobj, function(i, e){
			var markup = "<tr><td><a onclick=\"selectDivisionSlot('"+e['districtCode']+"','"+e['district']+"')\"><strong>"+e['district']+"</strong></a></td><td>" + e['address'] + "</td><td>" + e['slotCount'] + "</td></tr>";
			$("#division-table-body").append(markup);
		});
	}
	Liferay.provide(window,'selectDivisionSlot', function (division, divisionName) {
		$("#<portlet:namespace/>appointmentDistrict").val(division);
		$("#<portlet:namespace/>appointmentDistrictName").val(divisionName);
		//alert($("#<portlet:namespace/>appointmentDistrict").val());
		//alert($("#<portlet:namespace/>appointmentDistrictName").val());
		
		loadTimeslots();
		$('#appointment-division-modal').modal('hide').data('bs.modal', null );
		
	});
	
	function populateAppointmentTimeSlots(slots){
		var appointmentTime=$("#<portlet:namespace/>appointmentTime");

		$.each(slots, function(i, e){
			$(appointmentTime).append($('<option>', {value : e['slot']}).text(e['time']));
		});
	}
	
	$("#<portlet:namespace/>appointmentTime").change(function(){
		var text=$("#<portlet:namespace/>appointmentTime option:selected" ).text();
		text=text.substring(text.indexOf("-")+1);
		text=text.substring(0, text.length-2).trim();
		console.log("appointmentFinishTime : "+text);
		$("#<portlet:namespace/>appointmentFinishTime").val(text+":00");
		
	});
	
</aui:script>