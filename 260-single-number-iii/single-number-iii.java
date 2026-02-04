class Solution {
    public int[] singleNumber(int[] nums) {
        int count=0;
        int [] arr=new int[2];
        int a=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }

            }
            if(count==1){
                arr[a]=nums[i];
                a++;
            }
            
        }
        return arr;
        
    }
}