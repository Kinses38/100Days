package com.kinses38.OHDOC.day3.CodeWars;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target - numbers[i])){
                result[0] = map.get(target-numbers[i]);
                result[1] = i;
                break;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3}; //(0,2)
        int testTarget = 4;

        System.out.println(Arrays.toString(twoSum(test,testTarget)));
    }
}
