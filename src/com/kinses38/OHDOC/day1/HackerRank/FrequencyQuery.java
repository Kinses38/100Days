package com.kinses38.OHDOC.day1.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/frequency-queries/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
public class FrequencyQuery {

    static List<Integer> freqQueryInefficient(int[][] queries) {
        List<Integer> results = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int[] l : queries) {
            int action = l[0];
            int num = l[1];
            if (action == 1) {
                //minus 1 from old freq

                //freqMap.put(map.get(num), freqMap.merge(map.get(num), 0, Integer::sum));
                freqMap.put(map.get(num), freqMap.getOrDefault(map.get(num), 1) - 1);
                map.put(num, map.getOrDefault(num, 0) + 1);
                //plus 1 to new freq
                freqMap.put(map.get(num), freqMap.getOrDefault(map.get(num), 0) + 1);
            } else if (action == 2) {
                //minus 1 from old freq
                freqMap.put(map.get(num), freqMap.getOrDefault(map.get(num), 1) - 1);
                map.put(num, map.getOrDefault(num, 1) - 1);
                //plus 1 to new freq
                freqMap.put(map.get(num), freqMap.getOrDefault(map.get(num), 0) + 1);
            } else if (action == 3) {
                Integer i = freqMap.get(num);
                if (i != null && i > 0)
                    results.add(1);
                else
                    results.add(0);
            }
        }
        return results;
    }

    static List<Integer> freqQuery(int[][] queries) {
        List<Integer> results = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] histogram = new int[queries.length + 1];
        int num, freq;

        for (int[] query : queries) {
            num = query[1];
            switch (query[0]) {
                case 1:
                    //add
                    freq = map.getOrDefault(num, 0);
                    map.put(num, freq + 1);
                    histogram[freq]--;
                    histogram[freq + 1]++;
                    break;
                case 2:
                    //remove
                    freq = map.getOrDefault(num, 0);
                    if (freq == 0) break;
                    if (freq == 1) map.remove(num);
                    else map.put(num, freq - 1);
                    histogram[freq]--;
                    histogram[freq - 1]++;
                    break;
                case 3:
                    if (num >= histogram.length) results.add(0);
                    else results.add(histogram[num] > 0 ? 1 : 0);
                    break;
                //check
            }
        }
        return results;
    }

    public static void main(String[] args) {
        //[x][y] perform operation x on y where x can be "1 = insert y", "2 = delete y" or "3 = check if there is an integer with exactly y frequency"
        int[][] queries = {{1, 5}, {1, 6}, {3, 2}, {1, 10}, {1, 10}, {1, 6}, {2, 5}, {3, 2}};
        System.out.println(freqQuery(queries));
        //[0,1]
        int[][] secondQueries = {{3, 4}, {2, 1003}, {1, 16}, {3, 1}};
        System.out.println(freqQuery(secondQueries));
        //[0,1]
        int[][] thirdQueries = {{1, 3}, {2, 3}, {3, 2}, {1, 4}, {1, 5}, {1, 5}, {1, 4}, {3, 2}, {2, 4}, {3, 2}};
        System.out.println(freqQuery(thirdQueries));
        //[0,0,1]
    }
}
