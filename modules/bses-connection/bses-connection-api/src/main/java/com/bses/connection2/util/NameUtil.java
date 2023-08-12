package com.bses.connection2.util;

import com.bses.connection2.model.ConnectionRequest;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class NameUtil {
	public static boolean isTitle(String title) {
		List<String> titles = new ArrayList<String>();
		titles.add("MR");
		titles.add("MR.");
		titles.add("MS");
		titles.add("MS.");
		titles.add("MRS");
		titles.add("MRS.");
		titles.add("DR");
		titles.add("DR.");
		titles.add("PROF");
		titles.add("PROF.");

		return titles.contains(StringUtils.upperCase(title));
	}

	public static String getTitle(String name) {
		name = StringUtils.trim(name);
		if(StringUtils.isBlank(name)) {
			return "";
		}
		
		String[] part = name.split(" ");
		if (part.length > 0) {
			if (isTitle(part[0])) {
				return part[0];
			}
		} 
		
		return "";
	}

	public static String getFirstName(String name) {
		name = StringUtils.trim(name);
		if(StringUtils.isBlank(name)) {
			return "";
		}
		
		String[] part = name.split(" ");
		if (part.length == 1) {
			if (isTitle(part[0])) {
				return "";
			} else {
				return part[0];
			}
		} else if (part.length > 1) {
			if (isTitle(part[0])) {
				return part[1];
			} else {
				return part[0];
			}
		}
		return "";
	}

	public static String getMiddleName(String name) {
		name = StringUtils.trim(name);
		if(StringUtils.isBlank(name)) {
			return "";
		}
		
		String[] part = name.split(" ");
		if (part.length == 3) {
			if (isTitle(part[0])) {
				return "";
			} else {
				return part[1];
			}
		} else if (part.length > 3) {
			if (isTitle(part[0])) {
				String middleName = part[2];
				for (int i = 3; i < part.length - 1; i++) {
					middleName = middleName + " " + part[i];
				}
				return middleName;
			} else {
				String middleName = part[1];
				for (int i = 2; i < part.length - 1; i++) {
					middleName = middleName + " " + part[i];
				}
				return middleName;
			}
		} 
			
		return "";
	}

	public static String getLastName(String name) {
		name = StringUtils.trim(name);
		if(StringUtils.isBlank(name)) {
			return "";
		}
		
		String[] part = name.split(" ");
		if (part.length == 2) {
			if (isTitle(part[0])) {
				return "";
			} else {
				return part[1];
			}
		} else if (part.length > 2) {
			return part[part.length - 1];
		}
		return "";
	}
	
	public static String getFullName(ConnectionRequest req) {
		return null;
	}
}
