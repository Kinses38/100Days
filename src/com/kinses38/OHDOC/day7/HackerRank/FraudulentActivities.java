package com.kinses38.OHDOC.day7.HackerRank;

import java.util.Arrays;
import java.util.OptionalInt;

public class FraudulentActivities {

    //https://www.hackerrank.com/challenges/fraudulent-activity-notifications/forum?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
    static int activityNotifications(int[] expenditure, int d) {
        //max expenditure value is 200, + 1 to offset against array 0 indexing;
        int[] countingArray = new int[200 + 1];
        //the max numbers we want to read in at any given time, equal to the trailing days
        int end = d;

        //counting
        for (int i = 0; i < end; i++) {
            countingArray[expenditure[i]] += 1;
        }
        int current = 0;
        int totalNotices = 0;

        int medianIndex;
        if (d % 2 == 0) {
            medianIndex = d / 2;
        } else {
            medianIndex = (d / 2) + 1;
        }
        int totalExpLength = expenditure.length;

        while (end < totalExpLength) {
            double median = getMedian(countingArray, d, medianIndex);
            if (expenditure[end] >= (median * 2)) {
                totalNotices += 1;
            }

            countingArray[expenditure[current]] -= 1;
            countingArray[expenditure[end]] += 1;
            current++;
            end++;
        }
        return totalNotices;
    }

    private static double getMedian(int[] countingArray, int d, int medianIndex) {
        int counter = 0, left = 0;
        while (counter < medianIndex) {
            counter += countingArray[left];
            left += 1;
        }
        int right = left;
        left -= 1;

        if (counter > medianIndex || d % 2 != 0) {
            return left;
        } else {
            while (countingArray[right] == 0) {
                right += 1;
            }
        }
        //avoid loss
        return (left + right) / 2.0;
    }

    static void countSort(int[] arr, int maxValue) {
        int[] count = new int[maxValue + 1];
        //get histogram of each value in original array
        for (int current : arr) {
            count[current]++;
        }
        System.out.println(Arrays.toString(count));
        //modify so that each index counts the sum of the previous count indexes;
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        //the modified count array indicates which index each element belongs in.
        //do in reverse for stable sort
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        arr = Arrays.stream(output).toArray();
        System.out.println(Arrays.toString(count));
        System.out.println(Arrays.toString(arr));
    }

}

