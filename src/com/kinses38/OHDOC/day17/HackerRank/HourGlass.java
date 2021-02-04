package com.kinses38.OHDOC.day17.HackerRank;

public class HourGlass {

	static int hourglassSum(int[][] arr) {
		int current = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				current = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j]
						+ arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
				if (current > max)
					max = current;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[][] arr = {{-1, -1, 0, -9, -2, -2}, {-2,-1,-6,-8,-2,-5}, {-1,-1,-1,-2,-3,-4}, {-1,-9,-2,-4,-4,-5}, {-7,-3,-3,-2,-9,-9}, {-1,-3,-1,-2,-4,-5}};
		System.out.println(hourglassSum(arr));
	}
}
