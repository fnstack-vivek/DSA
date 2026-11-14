class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        int i = 0, j = 0;
        int size = s.length();
      
        int Max = 0;

        while (j < size) {
            char ele = s.charAt(j);

            mp.put(ele, mp.getOrDefault(ele, 0) + 1);

            if (mp.size() > j - i + 1) {
                j++;
            }
            else if (mp.size() == j - i + 1) {
                Max = Math.max(Max, j - i + 1);
                j++;
            }
            else if (mp.size() < j - i + 1) {

                while (mp.size() < j - i + 1) {
                    char ch = s.charAt(i);

                    mp.put(ch, mp.get(ch) - 1);

                    if (mp.get(ch) == 0) {
                        mp.remove(ch);
                    }

                    i++;
                }

                j++;
            }
        }

        return Max;
    }
}