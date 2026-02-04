class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while(nums[i]!=0){
                sum2=sum2+nums[i]%10;
                nums[i]/=10;
            }

        }
        int ans=sum-sum2;
        return ans;
        
    }
}