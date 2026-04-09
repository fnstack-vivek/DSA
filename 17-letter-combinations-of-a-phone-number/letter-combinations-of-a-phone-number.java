class Solution {
    static ArrayList<String> res = new ArrayList<>();
    static String[] mapping = {
        "",     
        "",     
        "abc",  
        "def",  
        "ghi",  
        "jkl",  
        "mno",  
        "pqrs", 
        "tuv",  
        "wxyz"  
    };

    public List<String> letterCombinations(String digits) {
        res.clear(); 
        if (digits.isEmpty()) return res;
        return pad("", digits);
    }

    static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            res.add(p);
            return res;
        }

        int digit = up.charAt(0) - '0';
        String letters = mapping[digit];

        for (char ch : letters.toCharArray()) {
            pad(p + ch, up.substring(1));
        }
        return res;
    }
}