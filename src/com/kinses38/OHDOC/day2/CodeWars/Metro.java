package com.kinses38.OHDOC.day2.CodeWars;

import java.util.ArrayList;

public class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        int result = 0;
        for (int[] query : stops) {
            result += query[0];
            result -= query[1];
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5}); //13, -5 7
        list.add(new int[]{2, 5}); //9

        System.out.println(countPassengers(list));
    }
}
