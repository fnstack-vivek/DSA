class Solution {
    public int findPermutationDifference(String s, String t) {
        int count=0;
       for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int j = t.indexOf(ch);

            count += Math.abs(i - j);
        }

        return count;
    }
}

          

        
        
    