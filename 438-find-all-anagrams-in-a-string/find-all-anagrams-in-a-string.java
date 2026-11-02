// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         ArrayList<Integer> ans=new ArrayList();
//         int l=s.length();
//         int k=p.length();
//         HashMap<String,Integer> mp=new HashMap<>();
//         for(int ele:p){
//            mp.put(ele, mp.getOrDefault(ele, 0) + 1);
//         }
//         int i=0,j=0;
//         int count=mp.size();
//         while(j<l){


//         }
        
        
//     }
// }

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> ans = new ArrayList<>();

        int l = s.length();
        int k = p.length();

        if (k > l) return ans;

        HashMap<Character, Integer> mp = new HashMap<>();

        for (char ele : p.toCharArray()) {
            mp.put(ele, mp.getOrDefault(ele, 0) + 1);
        }

        int i = 0, j = 0;
        int count = mp.size();

        while (j < l) {

            char ch = s.charAt(j);

            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) - 1);

                if (mp.get(ch) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < k) {
                j++;
            }

            else if (j - i + 1 == k) {

                if (count == 0) {
                    ans.add(i);
                }

                char left = s.charAt(i);

                if (mp.containsKey(left)) {

                    if (mp.get(left) == 0) {
                        count++;
                    }

                    mp.put(left, mp.get(left) + 1);
                }

                i++;
                j++;
            }
        }

        return ans;
    }
}