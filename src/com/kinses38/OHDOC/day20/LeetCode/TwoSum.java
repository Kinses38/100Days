package com.kinses38.OHDOC.day20.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int j = 0, k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				j = map.get(target - nums[i]);
				k = i;
				break;
			} else {
				map.put(nums[i], i);
			}
		}
		return new int[]{j, k};
	}

	public static void main(String[] args) {
		int[] arr = {6, 1, 7, 4, 9};
		int target = 5;

		System.out.println(Arrays.toString(twoSum(arr, target)));
	}
}
