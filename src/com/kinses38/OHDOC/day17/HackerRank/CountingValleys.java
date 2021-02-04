package com.kinses38.OHDOC.day17.HackerRank;

public class CountingValleys {

	public static int countingValleys(int steps, String path) {
		// Write your code here
		int result = 0;
		int height = 0;
		int current = 0;
		while (current < steps) {
			if (path.charAt(current) == 'U') {
				height++;
			} else {
				if (height == 0) {
					result++;
				}
				height--;
			}
			current++;
		}
		return result;
	}


	public static void main(String[] args) {
		int steps = 8;
		String path = "DDUUDDUDUUUD";
		System.out.println(countingValleys(steps, path));
	}
}
