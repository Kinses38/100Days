package com.kinses38.OHDOC.day18HackerRank;

import java.util.Arrays;
import java.util.Collections;

public class CakeWalk {

	// (2^j)*c j = number of cake, c = calories.
	static long marcsCakewalk(int[] calorie) {
		long result = 0;
		Arrays.sort(calorie);
		for (int i = calorie.length -1; i >= 0; i--) {
			result += (Math.pow(2, calorie.length - (i+1))) * calorie[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] cal = {5,7,10};
		System.out.println(marcsCakewalk(cal));
	}
}
