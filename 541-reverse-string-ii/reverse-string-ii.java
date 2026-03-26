class Solution {
    public String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();
        int n=arr.length;

        
        for (int i = 0; i<n; i+=2*k) {
            int c=i;
            int e=Math.min(c+k-1,n-1);
            while(c<e){
                char temp=arr[c];
                arr[c]=arr[e];
                arr[e]=temp;
                c++;
                e--;
            }
        }

       return new String(arr);
        
        
}}
