// class Solution {
//     public int minimumDifference(int[] nums, int k) {
//         int n=nums.length;
//         int sum=0;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-1-i;j++){
//                 if(nums[j]>nums[j+1]){
//                     int temp=nums[j];
//                     nums[j]=nums[j+1];
//                     nums[j+1]=temp;
//                 }
//             }
//         }
        // Arrays.sort(nums);
        // for(int i=0;i<n;i++){
        //     if((i+1)%2!=0){
        //         sum-=nums[i];
        //     }
        // }

//          for (int i = 0; i <= nums.length - k; i++) {
//             int diff = nums[i + k - 1] - nums[i];
//             sum = Math.min(sum, diff);
//         }

//         return sum;
        
        
//     }
// 
 class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        // Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        int minDiff = Integer.MAX_VALUE;

        
        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i]; 
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

   
    }


