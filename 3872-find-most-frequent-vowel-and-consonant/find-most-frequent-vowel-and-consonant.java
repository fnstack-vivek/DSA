class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int sum1 = 0, sum2 = 0;

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        
        for (char c : freq.keySet()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                if(freq.get(c)>sum1){
                    sum1=freq.get(c);
                }
            } else {
                if(freq.get(c)>sum2){
                    sum2=freq.get(c);
                }
                
                
            }
        }

        return (sum1+sum2);
    }
}