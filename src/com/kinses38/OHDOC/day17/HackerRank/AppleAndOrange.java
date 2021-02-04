package com.kinses38.OHDOC.day17.HackerRank;

public class AppleAndOrange {

	/**
	 *
	 * @param s start of house
	 * @param t end of house
	 * @param a location of apple tree
	 * @param b location of orange tree
	 * @param apples
	 * @param oranges
	 */
	public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges){
		int applesInRange = 0;
		int orangesInRange = 0;
		for(int i : apples){
			if(a+i >= s && a+i <= t)
				applesInRange++;
		}
		for(int i : oranges){
			if(b+i >= s && b+i <= t)
				orangesInRange++;
		}
		System.out.println(applesInRange);
		System.out.println(orangesInRange);
	}

	public static void main(String[] args) {

		countApplesAndOranges(7,11,5,15, new int[]{-2,2,1},new int[]{5,-6});
	}
}
