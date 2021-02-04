package com.kinses38.OHDOC.day17.HackerRank;

import java.util.Arrays;

public class ArrayManip {

	static long arrayManipulation(int n, int[][] queries) {
		long[] arr = new long[n];
		for(int i = 0; i < queries.length; i++){
			arr[queries[i][0]-1] += queries[i][2];
			//if we do the below and one number ends on this index, and another starts on this index we get wrong answer so push the ending number one index further.
			//arr[queries[i][1]-1] += -(queries[i][2]);
			if(queries[i][1] < arr.length)
				arr[queries[i][1]] += -(queries[i][2]);
			//System.out.println(Arrays.toString(arr));
		}
		long current =0;
		long max = 0;
		for(int i = 0; i < arr.length; i++){
			current += arr[i];
			max = Math.max(max, current);

		}
		return max;
	}

	public static void main(String[] args) {
		int[][]queries = {{2,3,603},{1,1,286},{4,4,882}};
		System.out.println(arrayManipulation(4,queries));
	}
}
