package com.kinses38.OHDOC.day17.HackerRank;

public class ArraySum {

	static int simpleArraySum(int[] arr) {
		int result = 0;
		for (int i : arr) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		System.out.println(simpleArraySum(arr));
	}
}
