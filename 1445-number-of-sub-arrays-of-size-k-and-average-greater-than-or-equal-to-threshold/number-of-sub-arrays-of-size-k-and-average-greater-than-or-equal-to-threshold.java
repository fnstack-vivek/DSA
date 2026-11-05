class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int size=arr.length;
        int i=0; int j=0;
        int sum=0;
        int count=0;
        while(j<size){
            sum+=arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(sum/k>=threshold){
                count++;}
                sum-=arr[i];
                
              i++;j++;   

            }
            // i++;j++;
        }
        return count;
        
    }
}