package com.kinses38.OHDOC.day4.CodeWars;

public class IntToIP {

    //TODO start practicing bit operations to avoid this
    public static String longToIP(long ip) {
        StringBuilder tmp = new StringBuilder();
        StringBuilder result = new StringBuilder();
        while(ip > 0){
            if(ip % 2 == 1)
                tmp.append("1");
            else
                tmp.append("0");
            ip /= 2;
        }
        int padding = 32 - tmp.length();
        tmp = tmp.reverse();
        tmp.insert(0,"0".repeat(padding));
        for(int i = 8; i <= tmp.length(); i+=8){
           int test = 0;
           test = Integer.parseInt(tmp.substring(i-8,i),2);
           System.out.println(test);
           result.append(test).append(".");
        }

        return result.substring(0, result.length()-1);
    }

    public static void main(String[] args) {
        long ip = 0L;

        System.out.println(longToIP(ip));
    }
}
