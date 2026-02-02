class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int [] arr=new int [2*n];
        int i=0;
        for(int j=0;j<n;j++){
            arr[i]=nums[j];
            i++;
        }
        for(int j=0;j<n;j++){
            arr[i]=nums[j];
            i++;
        }
         
         return arr;
        
    }
}