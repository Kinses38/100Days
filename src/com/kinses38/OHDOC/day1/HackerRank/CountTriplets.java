package com.kinses38.OHDOC.day1.HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/count-triplets-1/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
public class CountTriplets {

    static long countTriplets(List<Long> arr, long r) {
        long cnt = 0;
        Map<Long, Long> map = new HashMap<>();
        Map<Long, Long> rMap = new HashMap<>();
        for (long n : arr) {
            if (n % r == 0) {
                long prev = n / r;
                Long cnt2 = rMap.get(prev);
                if (cnt2 != null) cnt += cnt2;

                Long cnt1 = map.get(prev);
                if (cnt1 != null) rMap.put(n, rMap.getOrDefault(n, 0L) + cnt1);
            }
            map.put(n, map.getOrDefault(n, 0L) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Long[] arr = {1L, 2L, 2L, 4L};
        int r = 2;
        System.out.println(countTriplets(Arrays.asList(arr), r));

    }
}
