package com.bses.connection2.util;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RequestTypeModeStatus {
	public static String TYPE_NEW_CONNECTION="U01";
	public static String TYPE_NAME_CHANGE="U02";
	public static String TYPE_LOAD_INCREASE="U03";
	public static String TYPE_LOAD_DECREASE="U04";
	public static String TYPE_CATEGORY_CHANGE_LTH="U05";
	public static String TYPE_CATEGORY_CHANGE_HTL="U06";
	public static String TYPE_ADDRESS_CHANGE="U07";
	
	public static String TYPE_LOAD_CHANGE="U0304";
	public static String TYPE_CATEGORY_CHANGE="U0506";
	
	public static String MODE_ONLINE="Online";
	public static String MODE_APPOINTMENT="Appointment";
	
	public static String STATUS_DRAFT="Draft";
	public static String STATUS_SUBMITTED="Submitted";
	public static String STATUS_PENDING="Pending";
	public static String STATUS_ORDER_GENERATED="Order generated";
	
	private static List<String> tariffCategoriesOrder=new LinkedList<String>();
	private static Map<String, String> requestTypes=new LinkedHashMap<String, String> ();
	public static String getRequestType(String key) {
		if(requestTypes.isEmpty()) {
			requestTypes.put(TYPE_NEW_CONNECTION, "New Connection");
			requestTypes.put(TYPE_NAME_CHANGE, "Name Change");
			requestTypes.put(TYPE_LOAD_CHANGE, "Load Change");
			requestTypes.put(TYPE_CATEGORY_CHANGE, "Category Change");
			requestTypes.put(TYPE_ADDRESS_CHANGE, "Address Correction");
		}
		return requestTypes.get(key);
	}
	public static List<String> getTariffCategoriesOrder() {
		if(tariffCategoriesOrder.isEmpty()) {
			tariffCategoriesOrder.add("0100");
			tariffCategoriesOrder.add("0290");
			tariffCategoriesOrder.add("0320");
			tariffCategoriesOrder.add("0250");
			tariffCategoriesOrder.add("0280");
			tariffCategoriesOrder.add("0600");
			tariffCategoriesOrder.add("0700");
		}
		return tariffCategoriesOrder;
	}
	
	public static int getTariffCategoryOrder(String category) {
		if(tariffCategoriesOrder.isEmpty()) {
			getTariffCategoriesOrder();
		}
		return tariffCategoriesOrder.indexOf(category);
	}
}
