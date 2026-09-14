class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)){
                int freq=map.get(ele);
                map.put(ele,freq+1);
            }
            else{
                map.put(ele,1);
            }
        }
        int l=n/3;
        for(int x : map.keySet()){
         if(map.get(x) > l){
        ans.add(x);
         }
          }
    
        return ans;
        
    }
}