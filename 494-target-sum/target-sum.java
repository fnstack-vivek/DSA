class Solution {
    public int findTargetSumWays(int[] nums, int target) {
      

        int l = nums.length;
        int sum = 0;

        for (int i = 0; i < l; i++) {
            sum += nums[i];
        }

        if (Math.abs(target) > sum) {
            return 0;
        }

        if ((sum + target) % 2 != 0) {
            return 0;
        }

        int sumofs1 = (sum + target) / 2;

        int[][] t = new int[l + 1][sumofs1 + 1];

        t[0][0] = 1;

        for (int i = 1; i <= l; i++) {
            for (int j = 0; j <= sumofs1; j++) {
                if (nums[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - nums[i - 1]]
                            + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[l][sumofs1];
    }
}
