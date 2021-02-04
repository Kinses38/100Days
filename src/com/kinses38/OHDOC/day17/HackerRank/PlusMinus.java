package com.kinses38.OHDOC.day17.HackerRank;

public class PlusMinus {

	static void plusMinus(int [] arr){
		int length = arr.length;
		int pos = 0, neg = 0, zero = 0;
		for(int i : arr){
			if(i > 0)
				pos++;
			else if(i < 0)
				neg++;
			else
				zero++;
		}
		System.out.printf("%.6f\n%.6f\n%.6f", (double)pos/length, (double)neg/length, (double)zero/length);
	}

	public static void main(String[] args) {
		int[] arr = {-4, 3, -9, 0, 4, 1};
		plusMinus(arr);
	}
}
