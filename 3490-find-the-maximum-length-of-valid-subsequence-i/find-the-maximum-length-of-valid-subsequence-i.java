
class Solution {
    public int maximumLength(int[] nums) {

        int even = 0;
        int odd = 0;
        int alternating = 0;

        int prev = -1;

        for (int num : nums) {

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            int parity = num % 2;

            if (prev == -1 || prev != parity) {
                alternating++;
                prev = parity;
            }
        }

        return Math.max(alternating, Math.max(even, odd));
    }
}
