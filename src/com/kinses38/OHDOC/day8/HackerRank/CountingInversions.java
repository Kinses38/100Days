package com.kinses38.OHDOC.day8.HackerRank;

import java.util.Arrays;

public class CountingInversions {

    static long countInversions(int[] arr){
        return countandMergeSort(arr,0,arr.length-1);
    }

    static long countandMergeSort(int[] arr, int low, int high) {
        long inversions = 0;
        if (low < high) {
            //get mid point of array
            int mid = (low + high) / 2;
            //sort left and right
            inversions += countandMergeSort(arr, low, mid);
            inversions += countandMergeSort(arr, mid + 1, high);
            //merge sorted halves
            inversions += merge(arr, low, mid, high);
        }
        return inversions;
    }

    static long merge(int[] arr, int low, int mid, int high) {
        long inversions = 0;
        int leftArrSize = (mid - low) + 1;
        int rightArrSize = high - mid;

        int[] leftArr = new int[leftArrSize];
        int[] rightArr = new int[rightArrSize];
        //copy to tmp arrays. Can use array copy but :shrug
        for (int i = 0; i < leftArrSize; i++) {
            leftArr[i] = arr[low + i];
        }
        for (int j = 0; j < rightArrSize; j++) {
            rightArr[j] = arr[mid + j + 1];
        }

        //left index
        int i = 0;
        //right index
        int j = 0;
        //merged index
        int k = low;
        //compare element from left to right and insert smaller into array;
        while (i < leftArrSize && j < rightArrSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
                //if L[i] > R[j] then all remaining L[i] will be greater as L is already sorted.
                inversions += (mid + 1) - (low + i);
            }
            k++;
        }
        //copy any remaining elements of left arr if any
        while (i < leftArrSize) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        //copy any remaining elements of right arr if any
        while (j < rightArrSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        return inversions;
    }

    public static void main(String[] args) {
        int[] testArr = {5, 4, 3, 2, 1};
        System.out.println(countInversions(testArr));
        System.out.println(Arrays.toString(testArr));

    }
}
