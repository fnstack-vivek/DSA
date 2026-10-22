
class Solution {
    public String shortestCommonSupersequence(String a, String b) {
        char[] X = a.toCharArray();
        char[] Y = b.toCharArray();

        int m = a.length();
        int n = b.length();

        StringBuilder ans = new StringBuilder();

        return LCS(X, Y, m, n, ans);
    }

    public String LCS(char[] X, char[] Y, int m, int n,
                      StringBuilder ans) {

        int[][] t = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X[i - 1] == Y[j - 1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j],
                                       t[i][j - 1]);
                }
            }
        }

        int i = m, j = n;

        while (i > 0 && j > 0) {
            if (X[i - 1] == Y[j - 1]) {
                ans.append(X[i - 1]);
                i--;
                j--;
            } else if (t[i][j - 1] > t[i - 1][j]) {
                ans.append(Y[j - 1]);
                j--;
            } else {
                ans.append(X[i - 1]);
                i--;
            }
        }

        while (i > 0) {
            ans.append(X[i - 1]);
            i--;
        }

        while (j > 0) {
            ans.append(Y[j - 1]);
            j--;
        }

        return ans.reverse().toString();
    }
}
