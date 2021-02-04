package com.kinses38.OHDOC.day17.HackerRank;

public class NewYearChaos {

	static void minimumBribes(int[] q) {
		int bribes = 0;
		for(int i = 0; i < q.length; i++){
			if(q[i]-1 > i + 2){
				System.out.println("Too chaotic");
				return;
			}
			for(int j = Math.max(0, q[i] -2); j < i; j++){
				if(q[j] > q[i]) bribes++;
			}
		}
		System.out.println(bribes);
	}

	public static void main(String[] args) {
		int[] q = {1,2,5,3,7,8,6,4};
		minimumBribes(q);
	}
}
