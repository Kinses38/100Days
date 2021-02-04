package com.kinses38.OHDOC.day17.HackerRank;

public class JumpingOnClouds {

	/**
	 * Avoid 1's, zeros are safe. Can jump 1 or 2. Always possible to win game
	 *
	 * @param c
	 * @return
	 */
	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		for (int i = 1; i < c.length; i++) {
			if (i + 1 < c.length && c[i + 1] != 1) {
				jumps++;
				i++;
			} else {
				jumps++;
			}
		}
		return jumps;
	}

	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 1, 0, 0};
		System.out.println(jumpingOnClouds(arr));
	}
}
