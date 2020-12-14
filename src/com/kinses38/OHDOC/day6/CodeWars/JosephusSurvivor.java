package com.kinses38.OHDOC.day6.CodeWars;

public class JosephusSurvivor {

    public static int josephusSurvivor(final int n, final int k) {
        int winner;
        if(n == 1)
            return 1;
        else
           winner =  (k-1 + josephusSurvivor(n-1,k)) % n + 1;
        return winner;
    }

    public static void main(String[] args) {

        int n = 7;
        int k = 3;
        System.out.println(josephusSurvivor(n,k));
    }
}
