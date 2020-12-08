public class minBribes {

    //https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
    static void minimumBribes(int[] q) {
        //Can we count the bribes by looking only at values that are higher in the queue
        // than they should be and counting their difference from index?
        //ie a[i] = 3, and i+1 - a[i] = -2 therefore maximum bribe?
        //if(a[i] > i+1 then count difference from starting position
        int count = 0;
        for (int i = 0; i < q.length; i++) {
            if ((q[i] - (i + 1)) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            //impossible for any number greater than q[i] to reach q[i]-2. So use max to cut cases
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i])
                    count++;
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] queue = {2, 1, 5, 3, 4};
        minimumBribes(queue);

        int[] chaoticQueue = {2, 5, 1, 3, 4};
        minimumBribes(chaoticQueue);
    }

}
