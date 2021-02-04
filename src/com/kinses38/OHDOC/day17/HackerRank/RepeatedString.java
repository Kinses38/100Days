package com.kinses38.OHDOC.day17.HackerRank;

public class RepeatedString {

	static long repeatedString(String s, long n) {
		long ans = 0;
		for(char c : s.toCharArray()){
			if(c == 'a')
				ans++;
		}
		long leftover = n % s.length();
		ans = ans * (n / s.length());
		String leftoverString = s.substring(0, (int)leftover);
		for(char c : leftoverString.toCharArray()){
			if(c == 'a')
				ans++;
		}

		return ans;
	}

	static long repeatedString8(String s, long n){
		return ((s.chars().filter(ch -> ch == 'a').count()) * (n / s.length())) + (s.substring(0, Math.toIntExact(n % s.length())).chars().filter(ch -> ch == 'a')).count();
	}


	public static void main(String[] args) {
		String test = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
		long n = 736778906400L;
		System.out.println(repeatedString8(test,n));
	}
}
