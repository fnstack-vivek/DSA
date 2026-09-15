class Solution {
    public int firstMissingPositive(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n){
            
            if(arr[i]<=0 || arr[i]>n ||arr[i]==i+1||arr[i]==arr[arr[i]-1]) i++;

        
        else{
            int idx=arr[i]-1;
            int temp=arr[i];
                 arr[i]=arr[idx];
                 arr[idx]=temp;

        }}
        for(i=0;i<n;i++){
            if(arr[i]!=i+1){
            return i+1;}

        }
        return n+1;
        
    }
}