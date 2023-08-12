package com.bses.connection2.web.portlet;

import com.bses.connection2.helper.DigitalSevaKendraServiceHelper;
import com.bses.connection2.model.ConnectionRequest;
import com.bses.connection2.model.LocalityDivision;
import com.bses.connection2.service.LocalityDivisionLocalServiceUtil;
import com.bses.connection2.util.RequestTypeModeStatus;
import com.bses.connection2.web.model.MasterData;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

public class ViewHelper {
	public static boolean canEditConsumerType(ConnectionRequest requestEntity){
		boolean canEdit = true;
		System.out.println("requestEntity.getRequestType() > "+requestEntity.getRequestType());
		if(requestEntity != null && StringUtils.equalsIgnoreCase(requestEntity.getRequestType(),RequestTypeModeStatus.TYPE_NAME_CHANGE)) {
			canEdit = false;
		}
		
		return canEdit;
		
	}
	
	public static String getFullName(ConnectionRequest req) {
		String fullName = Stream.of(getViewString(req.getFirstName()),getViewString(req.getMiddleName()),getViewString(req.getLastName()))
			 	.filter(s -> s != null && !s.isEmpty())
			 	.collect(Collectors.joining(" "));
		
		return fullName;
	}
	
	
	public static String getViewAddress(ConnectionRequest requestEntity) {
		return getViewAddress(requestEntity, "</br>");
	}
	
	public static String getViewAddress(ConnectionRequest requestEntity, String lineSeparator) {
		
		String viewAddress = Stream.of(getAddressFirstLine(requestEntity),getAddressSecondLine(requestEntity),getAddressThirdLine(requestEntity))
				 	.filter(s -> s != null && !s.isEmpty())
				 	.collect(Collectors.joining(lineSeparator));
		return viewAddress;
		
	}
	
	private static String getAddressThirdLine(ConnectionRequest re) {
		LocalityDivision localityDistrict = null;
		String districtName = null;
		try {
			localityDistrict = LocalityDivisionLocalServiceUtil.getLocalityDivisionByDivisionCode(re.getDistrict());
			districtName= localityDistrict.getDivisionName();
		}catch(Exception ex) {	}
		
		districtName =null; //No need to show
		
		String address =  Stream.of(getViewString(districtName),"New Delhi "+re.getPinCode())
							 .filter(s -> s != null && !s.isEmpty())
					         .collect(Collectors.joining(", "));
		return address;
	}
	
	private static String getAddressSecondLine(ConnectionRequest re) {
		String landMark = re.getLandmark();
		if(StringUtils.isBlank(landMark )) {
			landMark = "";
		}
		if(StringUtils.isNotBlank(re.getLandmarkDetails())) {
			landMark=landMark+re.getLandmarkDetails();
		}
		
		String address = Stream.of(getViewString(re.getStreet()),getViewString(re.getColonyArea()),getViewString(landMark))
				 			.filter(s -> s != null && !s.isEmpty())
				 			.collect(Collectors.joining(", "));
		return address;
	}
	private static String getAddressFirstLine(ConnectionRequest re) {
		String floor = "";
		if(StringUtils.isNotBlank(re.getFloor())) {
			floor = MasterData.getFloorValue(re.getFloor());
		}
		
		String address = Stream.of(getViewString(re.getHouseNo()),getViewString(floor), getViewString(re.getBuildingName()))
				          .filter(s -> s != null && !s.isEmpty())
				          .collect(Collectors.joining(", "));
		return address;
	}
	
	private static String getViewString(String str) {
		if(StringUtils.isBlank(str)) {
			return null;
		}
		str=str.trim();
		
		if(StringUtils.equals(str, ".") || StringUtils.equals(str, ",")){
			return null;
		}
		return str;
	}
	
	public static boolean isSameAddress(ConnectionRequest req) {
		String address1 = Stream.of(getViewString(req.getHouseNo()),getViewString(req.getFloor()),getViewString(req.getBuildingName()),getViewString(req.getStreet()),getViewString(req.getColonyArea()),getViewString(req.getLandmark()),getViewString(req.getLandmarkDetails()),getViewString(req.getPinCode()))
			 	.filter(s -> s != null && !s.isEmpty())
			 	.collect(Collectors.joining(" "));
		
		String address2 = Stream.of(getViewString(req.getHouseNo2()),getViewString(req.getFloor2()),getViewString(req.getBuildingName2()),getViewString(req.getStreet2()),getViewString(req.getColonyArea2()),getViewString(req.getLandmark2()),getViewString(req.getLandmarkDetails2()),getViewString(req.getPinCode2()))
			 	.filter(s -> s != null && !s.isEmpty())
			 	.collect(Collectors.joining(" "));
		
		if(address1.equalsIgnoreCase(address2)) {
			return true;
		}
		return false;

	}
	
	public static String getViewRequestType(String requestType) {
		if(StringUtils.equals(requestType,"U0304") || StringUtils.equals(requestType,"U03") || StringUtils.equals(requestType,"U04")){
			return "Load Change";
		}else if(StringUtils.equals(requestType,"U0506")  || StringUtils.equals(requestType,"U05") || StringUtils.equals(requestType,"U06")){
			return "Category Change";
		}else{
			return MasterData.getRequestType(requestType);
		}
	}
	
	public static String getViewRequestType(ConnectionRequest cr) {
		String requestType =cr.getRequestType();
		if(StringUtils.equals(requestType,"U0304") || StringUtils.equals(requestType,"U03") || StringUtils.equals(requestType,"U04")){
			if(StringUtils.equals(cr.getChangeRequestType(),RequestTypeModeStatus.TYPE_LOAD_INCREASE)) {
				return "Load Enhancement";
			}else {
				return "Load Reduction";
			}
		}else if(StringUtils.equals(requestType,"U0506")  || StringUtils.equals(requestType,"U05") || StringUtils.equals(requestType,"U06")){
			return "Change of Category";
		}else{
			return MasterData.getRequestType(requestType);
		}
	}
	
	public static boolean isCategoryChangeRequest(String requestType) {
		if(StringUtils.isBlank(requestType)) {
			return false;
		}
		boolean isCategoryChangeRequest = false;
		
		if(StringUtils.equals(requestType,"U0506")  || StringUtils.equals(requestType,"U05") || StringUtils.equals(requestType,"U06")) {
			isCategoryChangeRequest = true;
		}
		return isCategoryChangeRequest;
	}
	
	public static boolean isNameChangeRequest(String requestType) {
		if(StringUtils.isBlank(requestType)) {
			return false;
		}
		boolean isNameChangeRequest = false;
		
		if(StringUtils.equalsIgnoreCase(RequestTypeModeStatus.TYPE_NAME_CHANGE, requestType)) {
			isNameChangeRequest = true;
		}
		return isNameChangeRequest;
	}
	
	public static boolean isLoadChangeRequest(String requestType) {
		if(StringUtils.isBlank(requestType)) {
			return false;
		}
		boolean isLoadChangeRequest = false;
		
		if(StringUtils.equals(requestType,"U0304") || StringUtils.equals(requestType,"U03") || StringUtils.equals(requestType,"U04")){
			isLoadChangeRequest = true;
		}
		return isLoadChangeRequest;
	}
	
	public static String getViewDate(Date date) {
			if(date == null) {
				return "";
			}
				
			DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
			String fDate=dateFormat.format(date);
		
		return fDate;
	}
	
	public static String getViewAppointmentTime(ConnectionRequest cr) {
		StringBuilder apptTime=new StringBuilder(StringPool.BLANK);
		if(StringUtils.isNotBlank(cr.getAppointmentTime())){
			String t=cr.getAppointmentTime();
			apptTime.append(t.substring(0, 5));
			if(t.startsWith("12:") || t.startsWith("01:") || t.startsWith("02:") || t.startsWith("03:")){
				apptTime.append(" PM").toString();
			}else{
				apptTime.append(" AM").toString();
			}
		}
		if(StringUtils.isNotBlank(cr.getAppointmentFinishTime())){
			String t=cr.getAppointmentFinishTime();
			apptTime.append(" - "+t.substring(0, 5));
			if(t.startsWith("12:") || t.startsWith("01:") || t.startsWith("02:") || t.startsWith("03:")){
				apptTime.append(" PM").toString();
			}else{
				apptTime.append(" AM").toString();
			}
		}
		return apptTime.toString();
	}
	
	public static long actionTime() {
		Date dt = new Date();
		return dt.getTime();
	}
	
	public static boolean isRequestAllowedNow() {
		return DigitalSevaKendraServiceHelper.isRequestAllowedNow();
	}
	
}
