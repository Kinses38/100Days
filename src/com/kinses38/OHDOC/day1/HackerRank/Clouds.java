public class Clouds {
    /**
     * There is a new mobile game that starts with consecutively numbered clouds.
     * Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus cloud having a number
     * that is equal to the number of the current cloud plus 1 or 2. The player must avoid the thunderheads.
     * Determine the minimum number of jumps it will take to jump from the starting position to the last cloud.
     * It is always possible to win the game.
     * <p>
     * For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.
     */

    //https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
    static int clouds(int[] c) {
        int count = -1;
        for (int i = 0; i < c.length; i++) {
            if ((i < c.length - 2) && (c[i + 2] == 0)) {
                i++;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] cArray = {0, 1, 0, 0, 0, 1, 0};
        System.out.println(clouds(cArray));

    }
}
