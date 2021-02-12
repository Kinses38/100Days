package com.kinses38.OHDOC.day21;

public class LongestSubString {

	public static int longestSubString(String s1, String s2) {
		int result = 0;
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		int c1Length = c1.length;
		int c2Length = c2.length;
		int[][] matrix = new int[c1Length][c2Length];

		//check if c1[i] = c2[j]
		//if so, get the previous "score from i-1 and j-1 and add one to it.
		//if not, put a zero in
		//check the which is max, current result or the current score

		for (int i = 0; i < c1Length; i++) {
			for (int j = 0; j < c2Length; j++) {
				if (c1[i] == c2[j]) {
					matrix[i][j] = matrix[Math.max(0, i - 1)][Math.max(0, j - 1)] + 1;
					result = Math.max(result, matrix[i][j]);
				}
			}
		}


		return result;
	}

	public static void main(String[] args) {
		String s1 = "ClownCar";
		String s2 = "Car";
		System.out.println(longestSubString(s1, s2));
	}
}
