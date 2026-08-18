class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());
        int l=nums.length;
        for(int i=0;i<l;i++){
            pq.add(nums[i]);
        }
        for(int i=0;i<l;i++){
            pq2.add(nums[i]);
        }
        int n=pq.remove();
        int n2=pq2.remove();
        Set<Integer>set =new HashSet<>();
        for(int ele:nums) set.add(ele);
        for(int i=n;i<=n2;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;

        
    }
}