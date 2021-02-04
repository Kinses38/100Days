package com.kinses38.OHDOC.day17.HackerRank;

public class TimeConversion {

	static String timeConversion(String s) {
		char aOrP = s.charAt(s.length() - 2);
		if (aOrP == 'P' && !s.startsWith("12"))
			return (Integer.parseInt(s.substring(0, 2)) + 12) + "" + s.substring(2, s.length() - 2);
		else if (aOrP == 'A' && s.startsWith("12")) {
			return "00" + s.substring(2, s.length() - 2);
		} else
			return s.substring(0, s.length() - 2);
	}

	public static void main(String[] args) {
		String s = "07:05:45AM";
		String s1 = "12:00:00AM";
		String s2 = "12:45:54PM";

		System.out.println(timeConversion(s));
		System.out.println(timeConversion(s1));
		System.out.println(timeConversion(s2));
	}
}
