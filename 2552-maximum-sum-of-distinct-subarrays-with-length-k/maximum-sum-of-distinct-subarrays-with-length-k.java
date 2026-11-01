class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        long sum = 0;
        long mx = 0;

        int i = 0, j = 0;
        int n = nums.length;

        while (j < n) {

            while (set.contains(nums[j])) {
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            sum += nums[j];
            set.add(nums[j]);

            if (j - i + 1 == k) {

                mx = Math.max(mx, sum);

                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            j++;
        }

        return mx;
    }
}