package com.kinses38.OHDOC.day2.CodeWars;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {

    //Am I cheating here with the final int ?
    public static int sortDesc(final int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        int tmp = num;
        while (tmp > 0) {
            arr.add(tmp % 10);
            tmp = tmp / 10;
        }

        arr.sort(Collections.reverseOrder());
        //Mul a by 10 to get decimals in place
        return arr.stream().reduce(0 , (a, b) -> (a * 10) + b);
    }

    public static void main(String[] args) {

        int test = 1234;
        int test2 = 15;
        int test3 = 123456789;
        System.out.println(sortDesc(test));
        System.out.println(sortDesc(test2));
        System.out.println(sortDesc(test3));

    }
}
