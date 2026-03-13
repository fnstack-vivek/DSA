class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(nums[i]<k){
                count++;
            }
        }
        return count;
        
    }
}