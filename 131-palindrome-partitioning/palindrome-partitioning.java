

class Solution {

    List<List<String>> ans = new ArrayList<>();

   
    boolean isPalindrome(String str) {

        int st = 0;
        int end = str.length() - 1;

        while (st < end) {

            if (str.charAt(st) != str.charAt(end)) {
                return false;
            }

            st++;
            end--;
        }

        return true;
    }

    // Backtracking helper function
    void helper(String s, List<String> temp, int index) {

        // Base case
        if (index == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        String palString = "";

        for (int i = index; i < s.length(); i++) {

            palString += s.charAt(i);

            if (isPalindrome(palString)) {

                temp.add(palString);

                helper(s, temp, i + 1);

                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {

        List<String> temp = new ArrayList<>();

        helper(s, temp, 0);

        return ans;
    }
}