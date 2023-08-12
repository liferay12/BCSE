package com.bses.connection2.web.model;

import com.bses.connection2.util.RequestTypeModeStatus;
import com.liferay.portal.kernel.util.StringPool;

import java.util.LinkedHashMap;
import java.util.Map;

public class MasterData {
	public static final String SUPPLY_TYPE_HT="HT";
	public static final String SUPPLY_TYPE_LT="LT";
	static final Map<String, String> floors=new LinkedHashMap<>();
	static final Map<String, String> landmarks=new LinkedHashMap<>();
	static final Map<String, String> titles=new LinkedHashMap<>();
	static final Map<String, String> tariffCategories=new LinkedHashMap<>();
	static final Map<String, String> premisesTypes=new LinkedHashMap<>();
	static final Map<String, String> idProofTypes=new LinkedHashMap<>();
	static final Map<String, String> firmIdProofTypes=new LinkedHashMap<>();
	static final Map<String, String> buildingTypes=new LinkedHashMap<>();
	
	static final Map<String, String> ownershipProofTypes=new LinkedHashMap<>();
	static final Map<String, String> firmOwnershipProofTypes=new LinkedHashMap<>();
	static final Map<String, String> firmDocumentTypes=new LinkedHashMap<>();
	static final Map<String, String> nameChangeDocumentTypes=new LinkedHashMap<>();
	static final Map<String, String> requestTypes=new LinkedHashMap<>();
	static final Map<String, String> timeSlots=new LinkedHashMap<>();
	static final Map<String, String> reasonsForChange=new LinkedHashMap<>();
	static final Map<String, String> evUsages=new LinkedHashMap<>();
	
	static final String strTimeSlots="09:15:00,10:30:00,10:31:00,11:30:00,11:31:00,12:30:00,12:31:00,01:30:00,02:00:00,03:00:00";
	
	
	public static Map<String, String> getEvUsages(){
		if(evUsages.isEmpty()) {
			evUsages.put("Public", "Public");
			evUsages.put("Private", "Private");
			evUsages.put("Semi public", "Semi Public");
		}
		return evUsages;
	}
	
	public static String getEvUseageValue(String key){
		if(evUsages.isEmpty()) {
			getEvUsages();
		}
		return evUsages.get(key);
	}
	
	public static Map<String, String> getRequestTypes(){
		if(requestTypes.isEmpty()) {
			requestTypes.put(RequestTypeModeStatus.TYPE_NEW_CONNECTION, "New Connection");
			requestTypes.put(RequestTypeModeStatus.TYPE_NAME_CHANGE, "Name Change");
			requestTypes.put(RequestTypeModeStatus.TYPE_ADDRESS_CHANGE, "Address Change");
			requestTypes.put(RequestTypeModeStatus.TYPE_LOAD_CHANGE, "Load Change");
			requestTypes.put(RequestTypeModeStatus.TYPE_CATEGORY_CHANGE, "Category Change");
		}
		return requestTypes;
	}
	
	public static String getRequestType(String key){
		if(requestTypes.isEmpty()) {
			getRequestTypes();
		}
		return requestTypes.get(key);
	}
	
	public static Map<String, String> getFloors(){
		if(floors.isEmpty()) {
			floors.put("0", "Ground");
			floors.put("-1", "Basement");
			for(int i=1; i<100; i++) {
				floors.put(String.valueOf(i), "Floor "+i);
			}
			//floors.put("100", "Terrace");
		}
		return floors;
	}
	
	public static String getFloorValue(String key) {
		if(floors.isEmpty()) {
			getFloors();
		}
		return floors.get(key);
	}
	
	public static Map<String, String> getLandmarks(){
		if(landmarks.isEmpty()) {
			landmarks.put("Above", "Above");
			landmarks.put("Behind", "Behind");
			landmarks.put("Below", "Below");
			landmarks.put("Near", "Near");
			landmarks.put("Opposite", "Opposite");
		}
		return landmarks;
	}
	
	public static String getLandmarkValue(String key) {
		if(landmarks.isEmpty()) {
			getLandmarks();
		}
		return landmarks.get(key);
	}
	
	public static Map<String, String> getTitles(){
		if(titles.isEmpty()) {
			titles.put("0002", "Mr.");
			titles.put("0001", "Ms");
			titles.put("OTHR", "Other");
			//titles.put("0003", "Dr");
			//titles.put("0004", "Prof.");
			//titles.put("0006", "M/s");
		}
		return titles;
	}
	
	public static String getTitleValue(String key) {
		if(titles.isEmpty()) {
			getTitles();
		}
		return titles.get(key);
	}
	
	public static Map<String, String> getTariffCategories(){
		if(tariffCategories.isEmpty()) {
			tariffCategories.put("0100", "Domestic");
			tariffCategories.put("0290", "Non Domestic");
			tariffCategories.put("0320", "Industrial");
			tariffCategories.put("0250", "Agriculture");
			tariffCategories.put("0280", "Mushrooms");
			tariffCategories.put("0600", "Public Utility");
			tariffCategories.put("0700", "Charging Station e-Vehicles");
			tariffCategories.put("0800", "DJB");
			tariffCategories.put("0900", "DIAL");
			tariffCategories.put("0910", "DMRC");
			tariffCategories.put("0920", "Railway Traction");
			tariffCategories.put("0930", "Advertising");
		}
		return tariffCategories;
	}
	public static String getTariffCategoryValue(String key) {
		if(tariffCategories.isEmpty()) {
			getTariffCategories();
		}
		return tariffCategories.get(key);
	}
	
	public static Map<String, String> getPremisesTypes(){
		if(premisesTypes.isEmpty()) {
			premisesTypes.put("1", "Owned");
			premisesTypes.put("2", "Rented/Leased");
			premisesTypes.put("3", "Others");
		}
		return premisesTypes;
	}
	
	public static Map<String, String> getBuildingTypes(){
		if(buildingTypes.isEmpty()) {
			buildingTypes.put("Residential Building", "Residential Building");
			buildingTypes.put("Hotel/Guest House", "Hotel/Guest House");
			buildingTypes.put("Institutional Building", "Institutional Building");
			buildingTypes.put("Business Building", "Business Building");
			buildingTypes.put("Other", "Other");
		}
		return buildingTypes;
	}
	
	public static String getPremisesTypeValue(String key) {
		if(premisesTypes.isEmpty()) {
			getPremisesTypes();
		}
		return premisesTypes.get(key);
	}
	
	public static Map<String, String> getIDProofTypes(){
		if(idProofTypes.isEmpty()) {
			idProofTypes.put("DL", "Driving License");
			idProofTypes.put("Election", "Electoral Identity Card");
			idProofTypes.put("Aadhaar", "Aadhaar Card");
			idProofTypes.put("Govt Identity Card", "Photo Identity Card Issued By Any Govt. Agency");
			idProofTypes.put("Passport", "Passport");
			idProofTypes.put("PAN", "PAN Card");
			idProofTypes.put("Ration Card", "Ration Card having Photograph");
		}
		return idProofTypes;
	}
	
	public static String getIDProofTypeValue(String key) {
		if(idProofTypes.isEmpty()) {
			getIDProofTypes();
		}
		return idProofTypes.get(key);
	}
	
	public static Map<String, String> getFirmIDProofTypes(){
		if(firmIdProofTypes.isEmpty()) {
			firmIdProofTypes.put("DL", "Driving License");
			firmIdProofTypes.put("Election", "Electoral Identity Card");
			firmIdProofTypes.put("Aadhaar", "Aadhaar Card");
			firmIdProofTypes.put("Govt Identity Card", "Photo Identity Card Issued By Any Govt. Agency");
			firmIdProofTypes.put("Passport", "Passport");
			firmIdProofTypes.put("PAN", "PAN Card");
			firmIdProofTypes.put("Ration Card", "Ration Card having Photograph");
//			firmIdProofTypes.put("Authorization Letter", "Authorization Letter for Authorized Signatory");
		//	firmIdProofTypes.put("Self Attested ID Proof", "Self Attested Authorized Signatory ID Proof");
//			firmIdProofTypes.put("Certificate of incorporation", "Certificate of incorporation / Registration issued by Registrar / Resolution of Board");
		}
		return firmIdProofTypes;
	}
	
	public static String getFirmIDProofTypeValue(String key) {
		if(firmIdProofTypes.isEmpty()) {
			getFirmIDProofTypes();
		}
		return firmIdProofTypes.get(key);
	}
	
	public static Map<String, String> getOwnershipProofTypes(){
		if(ownershipProofTypes.isEmpty()) {
			//ownershipProofTypes.put("Title Deed", "Certified Copy of Title Deed");
			ownershipProofTypes.put("Sale Deed", "Sale Deed");
			ownershipProofTypes.put("Conveyance Deed", "Conveyance Deed");
			ownershipProofTypes.put("Allotment Letter", "Allotment Letter");
			ownershipProofTypes.put("Valid Lease agreement", "Valid Lease agreement");
			ownershipProofTypes.put("Mutation certificate issued by Govt","Mutation certificate issued by Govt");
			ownershipProofTypes.put("GPA (Last 5 Years Chain)","GPA (Last 5 Years Chain)");
		}
		return ownershipProofTypes;
	}
	
	public static String getOwnershipProofTypeValue(String key) {
		if(ownershipProofTypes.isEmpty()) {
			getOwnershipProofTypes();
		}
		return ownershipProofTypes.get(key);
	}
	
	public static Map<String, String> getFirmOwnershipProofTypes(){
		if(firmOwnershipProofTypes.isEmpty()) {
			//firmOwnershipProofTypes.put("GPA", "Board Resolution General Power of Attorney (GPA)");
			//firmOwnershipProofTypes.put("MOA", "Memorandum and Articles of Association");
			//firmOwnershipProofTypes.put("VIL/LDC", "Valid Industrial Certificate/Lal Dora Certificate ");
			firmOwnershipProofTypes.put("Sale Deed", "Sale Deed");
			firmOwnershipProofTypes.put("Conveyance Deed", "Conveyance Deed");
			firmOwnershipProofTypes.put("Allotment Letter", "Allotment Letter");
			firmOwnershipProofTypes.put("Valid Lease agreement", "Valid Lease agreement");
			firmOwnershipProofTypes.put("Mutation certificate issued by Govt","Mutation certificate issued by Govt");
			firmOwnershipProofTypes.put("GPA (Last 5 Years Chain)","GPA (Last 5 Years Chain)");
		}
		return firmOwnershipProofTypes;
	}
	
	public static String getFirmOwnershipProofTypeValue(String key) {
		if(firmOwnershipProofTypes.isEmpty()) {
			getFirmOwnershipProofTypes();
		}
		return firmOwnershipProofTypes.get(key);
	}
	

	public static Map<String, String> getFirmDocumentTypes(){
		if(firmDocumentTypes.isEmpty()) {
			firmDocumentTypes.put("Request_Letter", "Request on letter head signed by authorized signatory");
			firmDocumentTypes.put("Certificate_of_Incorporation", "Certificate of incorporation/ registration issued by the Registrar");
			firmDocumentTypes.put("Authorization_Letter", "Proof of authorization/ resolution of board for authorizing the person"); 
		}
		
		return firmDocumentTypes;
	}
	public static Map<String, String> getFirmDocumentTypes_bkp(){
		if(firmDocumentTypes.isEmpty()) {
			firmDocumentTypes.put("Auth_Letter", "Authorization Letter for Authorized Signatory");
			//firmDocumentTypes.put("Self Attested ID Proof", "Self Attested Authorized Signatory ID Proof");
			firmDocumentTypes.put("Cert_Inc", "Certificate of incorporation / Registration issued by Registrar / Resolution of Board");
			firmDocumentTypes.put("GPA", "Board Resolution General Power of Attorney (GPA)");
			firmDocumentTypes.put("MOA", "Memorandum and Articles of Association");
			//firmDocumentTypes.put("VIL_LDC", "Valid Industrial Certificate/Lal Dora Certificate ");
		}
		return firmDocumentTypes;
	}
	
	public static Map<String, String> getNameChangeDocumentTypes(){
		if(nameChangeDocumentTypes.isEmpty()) {
			nameChangeDocumentTypes.put("NOC", "NOC (Self Attested) ");
			//firmDocumentTypes.put("Self Attested ID Proof", "Self Attested Authorized Signatory ID Proof");
			nameChangeDocumentTypes.put("Cert_Inc", "Certificate of incorporation / Registration issued by Registrar / Resolution of Board");
			nameChangeDocumentTypes.put("GPA", "Board Resolution General Power of Attorney (GPA)");
			nameChangeDocumentTypes.put("MOA", "Memorandum and Articles of Association");
			//nameChangeDocumentTypes.put("VIL_LDC", "Valid Industrial Certificate/Lal Dora Certificate ");
		}
		return nameChangeDocumentTypes;
	}
	
	public static Map<String, String> getTimeSlots(){
		if(timeSlots.isEmpty()) {
			timeSlots.put("09:15:00", "09:15 AM - 10:30 AM");
			timeSlots.put("10:31:00", "10:31 AM - 11:30 AM");
			timeSlots.put("11:31:00", "11:31 AM - 12:30 PM");
			timeSlots.put("12:31:00", "12:31 PM - 01:30 PM");
			timeSlots.put("02:00:00", "02:00 PM - 03:00 PM");
		}
		return timeSlots;
	}
	
	public static String getTimeSlotValue(String key) {
		if(timeSlots.isEmpty()) {
			getTimeSlots();
		}
		return timeSlots.get(key);
	}
	
	public static String getTimeSlotsString() {
		if(timeSlots.isEmpty()) {
			getTimeSlots();
		}
		StringBuilder str=new StringBuilder("");
		for(String key:timeSlots.keySet()) {
			str.append(key).append(",");
		}
		return str.substring(0, str.length()-1);
	}
	
	public static Map<String, String> getReasonsForChange(){
		if(reasonsForChange.isEmpty()) {
			reasonsForChange.put("Purchase of property", "Purchase of property");
			reasonsForChange.put("Change in tenancy", "Change in tenancy");
			reasonsForChange.put("Legal Heir", "Legal Heir");
		
		}
		return reasonsForChange;
	}
	
	public static String getReasonForChangeValue(String key){
		if(reasonsForChange.isEmpty()) {
			getReasonsForChange();
		}
		return reasonsForChange.get(key);
	}
	
	
	public static String getConsumerTypeName(String type) {
		if(type.equals(ConsumerTypes.Individual.name())) {
			return ConsumerTypes.Individual.name();
		}else if(type.equals(ConsumerTypes.Firm.name())) {
			return ConsumerTypes.Firm.name();
		}else {
			return StringPool.BLANK;
		}
	}
	
	public enum ConsumerTypes{
		Individual, Firm
	}
}
