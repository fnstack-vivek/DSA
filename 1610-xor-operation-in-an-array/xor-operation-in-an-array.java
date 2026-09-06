class Solution {
    
    public int xorOperation(int n, int s) {
      
       int []ar=new int[n];
       for(int i=0;i<n;i++){
        ar[i]=s+2*i;
       }
      int ans=0;
       for(int i=0;i<n;i++){
           ans=ans^ar[i];
       }
       return ans;
    }
}
// class Solution {
//    public static int xor(int n){
//         if(n%4==0) return n;
//         else if(n%4==1) return 1;
//         else if(n%4==2) return n+1;
//         else 
//           return 0;
//     }
//     public static int findXOR(int l, int r) {
//         return xor(l-1)^xor(r);
        
//     }
// }