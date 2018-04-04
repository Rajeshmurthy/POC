package org.drools.scheduleassignment.model;

import java.text.Format;
import java.text.SimpleDateFormat;

public class MatchUtil {

	public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public MatchUtil() {

	}

	public boolean isValid(String ruleKey, Object recordValue, Object policyValue) {

		String recordValue1 = null;
		String policyValue1 = null;

		Format formatter = new SimpleDateFormat(DATE_FORMAT);

		if (recordValue instanceof String && policyValue instanceof String) {
			recordValue1 = (String) recordValue;
			policyValue1 = (String) policyValue;
		} else {
			recordValue1 = formatter.format(recordValue); // Effective date
															// value
			policyValue1 = formatter.format(policyValue);
		}

		if (ruleKey == Policy.Match.K.toString()) {
			if (recordValue1 == policyValue1 || recordValue1.equals(policyValue1)) {
				return true;
			}
		}

		if (ruleKey == Policy.Match.Y.toString()) {
			if (isNotEmpty(recordValue1))
				return true;
		}

		if (ruleKey == Policy.Match.S.toString()) {
			boolean isBlank = recordValue1 == null || recordValue1.trim().length() == 0;
			if (isBlank)
				return true;
		}
		return false;
	}

	public static boolean isNotEmpty(String s) {
		return (s != null && !s.equals(""));
	}

}
