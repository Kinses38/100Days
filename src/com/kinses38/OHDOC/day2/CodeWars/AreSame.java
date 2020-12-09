package com.kinses38.OHDOC.day2.CodeWars;

import java.util.Arrays;

public class AreSame {

//    public static boolean comp(int[] a, int[] b) {
//        //I tried being clever with sets but only understood the multiplicities after the fact
//        Set<Integer> setA = new HashSet<>();
//        Set<Integer> setB = new HashSet<>();
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//        if(a != null && a.length > 0 && b != null && b.length > 0){
//            for(int current : b){
//                setB.add(((int)Math.sqrt(current)));
//            }
//            for (int current : a) {
//                setA.add(current);
//            }
//            return setA.containsAll(setB) && setB.containsAll(setA);
//        }
//        else
//            return false;
//    }

    public static boolean comp(int[] a, int[] b) {

        if (a != null && b != null && a.length == b.length) {
            //cant sort first because of neg values
            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * a[i];
            }
            Arrays.sort(a);
            Arrays.sort(b);
            //return statements could be cleaner
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i])
                    return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a, b));

        int[] c = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] d = {121, 14641, 20736, 36100, 25921, 361, 20736, 361};

        System.out.println(comp(c, d));

        int[] e = {};
        int[] f = {1};

        System.out.println(comp(e, f));
    }
}