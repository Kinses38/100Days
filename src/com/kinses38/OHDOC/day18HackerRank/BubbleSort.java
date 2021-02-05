package com.kinses38.OHDOC.day18HackerRank;

import java.util.Arrays;

public class BubbleSort {

	static void countSwaps(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					swap(arr, i, j);
					count++;
				}
			}
		}
		System.out.printf("Array is sorted in %d swaps.\n", count);
		System.out.printf("First Element: %d\n", arr[0]);
		System.out.printf("Last Element: %d\n", arr[arr.length-1]);
	}

	static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = {1,4,5,3,2};
		countSwaps(arr);

	}
}
