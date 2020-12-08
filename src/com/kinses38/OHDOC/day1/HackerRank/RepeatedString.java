public class RepeatedString {

    /**
     * There is a string, s , of lowercase English letters that is repeated infinitely many times.
     * Given an integer, n , find and print the number of letter a's in the first n letters of the infinite string.
     */
    //https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
    static long repeatedString(String s, long n) {
        long ans = 0;
        long repeatedLength = n / s.length();
        long repeatedRemainder = n % s.length();
        ans = (s.replaceAll("[^a]", "").length() * repeatedLength) +
                (s.substring(0, (int) repeatedRemainder).replaceAll("[^a]", "").length());
        return ans;
    }


    public static void main(String[] args){
        String s = "aba";
        int n = 10;
        System.out.println(repeatedString(s,n));

    }
}
