package com.kinses38.OHDOC.day7;

import java.util.Arrays;
import java.util.Collections;

public class NextSmallestNumber {

    /**
     * Return next smallest number, -1 if no smaller number or if new number begins with 0;
     * Improvements: Return -1 earlier if number cannot be made smaller.
     *               Get rid of unnecessary variables/casts
     *
     * @param n
     * @return
     */
    public static long nextSmaller(long n) {
        //start at right
        //find first number that has smaller numbers to its right. X
        //find largest number < X on the right. Y
        //Swap X and Y
        //Now sort all digits to right of the Y's new position in descending order to make number as big as possible.
        System.out.println("Before: " + n);
        char[] separated = Long.toString(n).toCharArray();
        int min = separated[separated.length - 1];
        int xIndex = 0;
        for (int i = separated.length - 1; i > 0; i--) {
            if (min >= separated[i]) {
                min = separated[i];
            } else {
                xIndex = i;
                break;
            }
        }
        int max = 0;
        int yIndex = 0;
        for (int i = xIndex; i < separated.length; i++) {
            if (separated[i] < separated[xIndex] && separated[i] > max) {
                max = separated[i];
                yIndex = i;
            }
        }
        swap(xIndex, yIndex, separated);

        String[] s = String.valueOf(separated).split("");
        Arrays.sort(s, xIndex+1, s.length, Collections.reverseOrder());
        long ans = Long.parseLong(String.join("", s));
        if(ans >= n || s[0].equals("0"))
            return -1;
        return ans;
    }

    static void swap(int i, int j, char[] arr) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static void main(String[] args) {
        Long n = 25L;
        System.out.println(nextSmaller(n));

    }
}
