class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        int c=0;
        if(k == 0){
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int ele : nums){
        map.put(ele, map.getOrDefault(ele, 0) + 1);
    }

    for(int freq : map.values()){
        if(freq >= 2){
            c++;
        }
    }

    return c;
}
        
        for(int ele:nums){
            set.add(ele); }
           
           
           for(int a:set){
            int rem=a-k;
           
            if(set.contains(rem)){
                count++;
            } }
            return count;
            
        
    }
}