package com.kinses38.OHDOC.day17.HackerRank;
import java.util.*;
public class MinMaxSum {

	static void miniMaxSum(int[] arr) {
		long result = 0;
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++){
			result+= arr[i];
		}
		System.out.println((result-arr[arr.length-1]) + " " + (result-arr[0]));
	}

	public static void main(String[] args) {
		int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};

		miniMaxSum(arr);
	}
}
