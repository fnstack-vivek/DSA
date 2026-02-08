class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        // Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if((i+1)%2!=0){
                sum+=nums[i];
            }
        }
        return sum;
        
    }
}