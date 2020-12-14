package com.kinses38.OHDOC.day6.CodeWars;

import java.util.HashSet;

public class FindOdd {

    public static int findIt(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : a){
            if(set.contains(i)){
                set.remove(i);
            }else{
                set.add(i);
            }
        }
        return(set.iterator().next());
    }
}
