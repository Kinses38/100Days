package com.kinses38.OHDOC.day20.LeetCode;

import java.util.Arrays;

public class SearchSortedMatrix {

	public static boolean searchMatrix(int[][] matrix, int target) {
		int row = 0;
		int column = matrix[0].length-1;
		while(row < matrix.length && column >= 0){
			if(target > matrix[row][column])
				row++;
			else if (target < matrix[row][column])
				column--;
			else if (target == matrix[row][column])
				return true;
		}
		return false;
	}

	public static int[] getMatrixIndices(int[][] matrix, int target) {
		int row = 0;
		int column = matrix[0].length-1;
		while(row < matrix.length && column >= 0){
			if(target > matrix[row][column])
				row++;
			else if (target < matrix[row][column])
				column--;
			else if (target == matrix[row][column])
				return new int[]{row,column};
		}
		return null;
	}

	public static void main(String[] args) {
		int[][] matrix = {{1,4,6,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

		System.out.println(searchMatrix(matrix,14));
		int[] result = getMatrixIndices(matrix,14);
		if(result != null){
			System.out.println(Arrays.toString(result) + " " + matrix[result[0]][result[1]]);
		}
	}
}
