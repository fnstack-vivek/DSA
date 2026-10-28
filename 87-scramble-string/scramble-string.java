
class Solution {
    static Map<String, Boolean> mp = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        mp.clear();
        return solve(s1, s2);
    }

    public boolean solve(String a, String b) {

        if (a.equals(b)) {
            return true;
        }

        if (a.length() != b.length()) {
            return false;
        }

        if (a.length() <= 1) {
            return false;
        }

        String key = a + " " + b;

        if (mp.containsKey(key)) {
            return mp.get(key);
        }

        int n = a.length();
        boolean flag = false;

        for (int i = 1; i < n; i++) {

            // Swapped
            boolean cond1 =
                solve(a.substring(0, i), b.substring(n - i, n)) &&
                solve(a.substring(i, n), b.substring(0, n - i));

            // Not swapped
            boolean cond2 =
                solve(a.substring(0, i), b.substring(0, i)) &&
                solve(a.substring(i, n), b.substring(i, n));

            if (cond1 || cond2) {
                flag = true;
                break;
            }
        }

        mp.put(key, flag);
        return flag;
    }
}

