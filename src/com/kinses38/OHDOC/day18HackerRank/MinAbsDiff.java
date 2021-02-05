package com.kinses38.OHDOC.day18HackerRank;

import java.util.Arrays;

public class MinAbsDiff {

	//No inner loop needed to compare distance values. If its sorted then no point?
	static int minimumAbsoluteDifference(int[] arr) {
		int current;
		int min = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
				current = Math.abs(arr[i] - arr[i+1]);
				min = (Math.min(current, min));
		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr = {3, -7, 0};
		System.out.println(minimumAbsoluteDifference(arr));
	}
}
