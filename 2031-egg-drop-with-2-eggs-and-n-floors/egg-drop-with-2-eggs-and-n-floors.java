class Solution {
    int[][] t = new int[3][1001];

    public int twoEggDrop(int n) {
        int k=2;
        for (int i = 0; i <= 2; i++) {
            Arrays.fill(t[i], -1);
        }

        return solve(k, n);
    }

    public int solve(int e, int f) {
        if (f == 0 || f == 1) {
            return f;
        }

        if (e == 1) {
            return f;
        }

        if (t[e][f] != -1) {
            return t[e][f];
        }

        int low = 1;
        int high = f;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int breakCase = solve(e - 1, mid - 1);
            int surviveCase = solve(e, f - mid);

            int temp = 1 + Math.max(breakCase, surviveCase);

            ans = Math.min(ans, temp);

            if (breakCase < surviveCase) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return t[e][f] = ans;
    }
}
