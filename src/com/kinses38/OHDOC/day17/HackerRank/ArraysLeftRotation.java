package com.kinses38.OHDOC.day17.HackerRank;

import java.util.Arrays;

public class ArraysLeftRotation {

	//rotations will never be greater than length of array
	static int[] rotLeft(int[] a, int d){
		int[] newArr = new int[a.length];
		for(int i = 0; i < a.length; i++){
			int pos = (i + (a.length - d)) % a.length;
			newArr[pos] = a[i];
		}

		return newArr;
	}


	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int d = 3;
		System.out.println(Arrays.toString(rotLeft(arr, d)));
	}
}
