package com.tuibi.dianwan.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IdentityCodeUtil {
	private static final Pattern IDCARD_MATCH = Pattern.compile("(\\d{17}[0-9xX]|\\d{14}[0-9xX])");
	private static final Pattern IDCARD_BIRTHDAY_MATCH = Pattern.compile("\\d{6}(\\d{8}).*"); 
	private static final Pattern OTHER_MATCH = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})");

	public static boolean validateIdNumber(String idNumber) {
		if(!IDCARD_MATCH.matcher(idNumber).matches()) {
			return false;
		}
		Matcher matcher = IDCARD_BIRTHDAY_MATCH.matcher(idNumber);
		boolean bool=matcher.find();
		if(!bool){
			return false;
		}
		Matcher m = OTHER_MATCH.matcher(matcher.group(1));
		boolean mbool=m.find();
		if (!mbool) {
			return false;
		}
		String year = m.group(1);
		int month = Integer.parseInt(m.group(2));
		int day = Integer.parseInt(m.group(3));
		if (month < 1 || month > 12) {
			return false;
		}
		if (day > getDays(year, month) || day < 1) {
			return false;
		}
		return true;
	}

	public static int getDays(String year, int month) {
		int days = 0;
		switch (month) {
		case 1:
			days = 31;
			break;
		case 3:
			days = 31;
			break;
		case 5:
			days = 31;
			break;
		case 7:
			days = 31;
			break;
		case 8:
			days = 31;
			break;
		case 10:
			days = 31;
			break;
		case 12:
			days = 31;
			break;
		case 2:
			if (isLeapYear(year))
				days = 29;
			else
				days = 28;
			break;
		default:
			days = 30;
		}
		return days;
	}

	public static boolean isLeapYear(String year) {
		Long yearL = Long.parseLong(year);
		if ((yearL % 4 == 0) && (yearL % 100 != 0) || (yearL % 400 == 0)) {
			return true;
		}
		return false;
	}
	
	
}
