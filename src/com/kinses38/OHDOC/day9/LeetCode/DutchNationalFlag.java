package com.kinses38.OHDOC.day9.LeetCode;

import java.util.Arrays;

public class DutchNationalFlag {

    public static void sortColors(int[] nums) {
        int pivot = 1;
        int low = 0;
        int high = nums.length - 1;
        int current = 0;
        int tmp = 0;

        while (current <= high) {
            if (pivot > nums[current]) {
                tmp = nums[low];
                nums[low] = nums[current];
                nums[current] = tmp;
                low++;
                current++;
            } else if (pivot == nums[current]){
                current++;
            }else{
                tmp = nums[high];
                nums[high] = nums[current];
                nums[current] = tmp;
                high--;
            }
        }
    }


    public static void main(String[] args) {
        int[] colors = {2, 1, 1, 1, 0};
        sortColors(colors);
        System.out.println(Arrays.toString(colors));


    }
}
