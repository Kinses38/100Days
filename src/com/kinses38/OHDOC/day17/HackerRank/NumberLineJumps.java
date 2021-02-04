package com.kinses38.OHDOC.day17.HackerRank;

public class NumberLineJumps {

	//TODO review slope of a line in relation to this
	/**
	 * @param x1 starting position for k1
	 * @param v1 jump distance for k1
	 * @param x2 start position for k2
	 * @param v2 jump distance for k2
	 * @return
	 */
	static String kangaroo(int x1, int v1, int x2, int v2) {
		if(v1 > v2){
			if(((x1 - x2) % (v2 - v1)) == 0)
				return "YES";
		}
		return "NO";
	}


	public static void main(String[] args) {
		int x1 = 0, v1 = 2, x2 = 5, v2 = 1;
		System.out.println(kangaroo(x1, v1, x2, v2));
	}
}
