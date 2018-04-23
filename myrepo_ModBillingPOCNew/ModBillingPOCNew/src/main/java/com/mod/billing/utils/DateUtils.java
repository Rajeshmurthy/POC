package com.mod.billing.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DecimalFormat;

public class DateUtils {
	public static String convertDateToString(Date nextBillToDate) {

		DateFormat targetFormat = new SimpleDateFormat("dd-MMM-yyyy");
		String formattedDateStr = targetFormat.format(nextBillToDate);
		System.out.println("formattedDateStrL From DateUtils::"
				+ formattedDateStr);
		return formattedDateStr;
	}

	public static Date convertStringToDateFormat1(String nextBillToDateStr)
			throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date nextBillToDate = sdf.parse(nextBillToDateStr);
		System.out.println("nextBillToDate::" + nextBillToDate);
		return nextBillToDate;
	}

	public static Date convertStringToDateFormat2(String nextBillToDateStr)
			throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		Date nextBillToDate = sdf.parse(nextBillToDateStr);
		System.out.println("nextBillToDate::" + nextBillToDate);
		return nextBillToDate;
	}

	public static Date getNextBillToDate(Date dateAsObj, int nbMonths) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateAsObj);
		cal.add(Calendar.MONTH, nbMonths);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date dateAsObjAfterAMonth = cal.getTime();
		return dateAsObjAfterAMonth;
	}

	public static int countNumberOfMonths(Date subscriptionDate,
			Date nextBillDate) {
		System.out.println(" nextBillDate:: " + nextBillDate);
		System.out.println(" subscribedDate:: " + subscriptionDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(subscriptionDate);
		Calendar endBillDate = Calendar.getInstance();
		endBillDate.setTime(nextBillDate);
		int diffMonth = -1;
		int days = cal.getTime().getDate();
		int remainingSubscriptionDays = 31 - days;
		System.out.println("remainingSubscriptionDays::"
				+ remainingSubscriptionDays);
		int remainingSubscriptionMonth = cal.getTime().getMonth() + 1;
		System.out.println("remainingSubscriptionMonth::"
				+ remainingSubscriptionMonth);

		int diffYear = endBillDate.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
		diffMonth = diffYear * 12 + endBillDate.get(Calendar.MONTH)
				- cal.get(Calendar.MONTH);
		diffMonth = diffMonth - 1;
		// difInMonths = cal2.get(Calendar.MONTH) - cal.get(Calendar.MONTH);
		System.out.println("diffMonth######## ::" + diffMonth);
		return diffMonth;
	}

	public static int countNumberOfDays(Date subscriptionDate, Date nextBillDate) {
		System.out.println(" nextBillDate:: " + nextBillDate);
		System.out.println(" subscribedDate:: " + subscriptionDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(subscriptionDate);
		// Calendar endBillDate = Calendar.getInstance();
		// endBillDate.setTime(nextBillDate);
		int diffMonth = -1;
		int days = cal.getTime().getDate();
		int remainingSubscriptionDays = 31 - days;
		System.out.println("remainingSubscriptionDays::"
				+ remainingSubscriptionDays);
		int remainingSubscriptionMonth = cal.getTime().getMonth() + 1;
		System.out.println("remainingSubscriptionMonth::"
				+ remainingSubscriptionMonth);

		// int diffYear = endBillDate.get(Calendar.YEAR) -
		// cal.get(Calendar.YEAR);
		// diffMonth = diffYear * 12 + endBillDate.get(Calendar.MONTH) -
		// cal.get(Calendar.MONTH);
		// diffMonth=diffMonth-1;
		// difInMonths = cal2.get(Calendar.MONTH) - cal.get(Calendar.MONTH);
		// System.out.println("diffMonth######## ::"+diffMonth );

		cal.setTime(nextBillDate);
		int nextBillMonth = cal.getTime().getMonth();
		System.out.println(nextBillMonth);

		int noOfMonths = nextBillMonth - remainingSubscriptionMonth;
		/*
		 * if (remainingSubscriptionDays == 30) { noOfMonths++;
		 * remainingSubscriptionDays =0; }
		 */
		// return noOfMonths*30+remainingSubscriptionDays;
		return remainingSubscriptionDays;
	}

	public static double calculatePremium(int noOfDays, int noOfMonths,
			double basePremium, int calenderDays) {
		double totalPremium = (noOfMonths * basePremium) + noOfDays
				* (basePremium / calenderDays);
		System.out.println(totalPremium);
		return totalPremium;
	}

	public static double roundPremium2Digit(double d) {
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		String numberAsString = decimalFormat.format(d);
		System.out.println("Inside Dateutils Rounding value"+numberAsString);
		d = Double.valueOf(numberAsString);
		return d;
	}
	public DateUtils() {
	}
}
