class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0,j=0;
        int size=nums.length;
        int sum=0;
        int mx=Integer.MIN_VALUE;
        while(j<size){
            sum+=nums[j];
            if(j-i+1<k){
                j++;}
            else if(j-i+1==k){
                mx=Math.max(mx,sum);
                sum=sum-nums[i];
                i++;
                j++;
            }
            
            

        }
        return (double)mx/k;
        
    }
}