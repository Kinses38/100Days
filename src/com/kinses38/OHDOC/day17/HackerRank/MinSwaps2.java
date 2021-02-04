package com.kinses38.OHDOC.day17.HackerRank;

public class MinSwaps2 {

	static int minimumSwaps(int[] arr) {
		int swaps = 0;
		for(int i = 0; i < arr.length-1; i++){
			//{4,3,1,2} does 4 belong in "position" (index + 1)?
			if(arr[i] != i+1){
				for(int j = i+1; j < arr.length; j++){
					if(arr[j] == i+1){
						swap(arr, i,j);
						swaps++;
						//no need to keep comparing once this value is true.
						break;
					}
				}
			}
		}
		return swaps;
	}

	static void swap(int[]arr, int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = {4,3,1,2};
		System.out.println(minimumSwaps(arr));
	}
}
