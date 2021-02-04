package com.kinses38.OHDOC.day17.HackerRank;

public class VeryBigSum {

	static long aVeryBigSum(long[] ar) {
		long result = 0;
		for (long i : ar) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {
		long[] arr = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
		System.out.println(aVeryBigSum(arr));

	}
}
