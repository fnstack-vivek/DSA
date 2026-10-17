
class Solution {
    public int coinChange(int[] coins, int amount) {

        int l = coins.length;
        int[][] t = new int[l + 1][amount + 1];
        int INF = Integer.MAX_VALUE - 1;

        t[0][0] = 0;

        for (int j = 1; j <= amount; j++) {
            t[0][j] = INF;
        }

        for (int i = 1; i <= l; i++) {
            t[i][0] = 0;
        }

        for (int j = 1; j <= amount; j++) {
            if (j % coins[0] == 0) {
                t[1][j] = j / coins[0];
            } else {
                t[1][j] = INF;
            }
        }

        for (int i = 2; i <= l; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    t[i][j] = Math.min(
                        1 + t[i][j - coins[i - 1]],
                        t[i - 1][j]
                    );
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[l][amount] >= INF ? -1 : t[l][amount];
    }
}
