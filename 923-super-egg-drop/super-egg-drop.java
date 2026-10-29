// class Solution {
//     static int[][] t = new int[101][10001];
    
//     public int superEggDrop(int k, int n) {
//         for (int i = 0; i < t.length; i++) {
//         Arrays.fill(t[i], -1);
//       }
//         return solve(k,n);
        
//     }//this is a recursive code give TLE now recursive+memoization;
//     // public int solve(int e,int f){
//     //     if(f==0||f==1||e==0||e==1){
//     //         return f;

//     //     }
//     //     int min=Integer.MAX_VALUE;
//     //     for(int k=1;k<=f;k++){
//     //         int temp=1+Math.max(solve(e-1,k-1),solve(e,f-k));
//     //         min=Math.min(min,temp);
//     //     }
//     //     return min;
//     // }
//     //ottimised code:

//     public int solve(int e,int f){
//         if(f==0||f==1||e==0||e==1){
//             return f; 
//             }

//         if(t[e][f]!=-1){
//             return t[e][f];
//         }
//         int min=Integer.MAX_VALUE;
//         int low,high;
//         for(int k=1;k<=f;k++){
//             if(t[e-1][k-1]!=-1){
//                 low=t[e-1][k-1]; }
//             else{
//                 low=solve(e-k,k-1);
//                 t[e-k][k-1]=low;
//             }
//              if(t[e][f-k]!=-1){
//                 high=t[e][f-k]; }
//             else{
//                 high=solve(e,f-k);
//                 t[e][f-k]=high;
//             }
//             int temp=1+Math.max(low,high);
//             min=Math.min(min,temp);
//         }
//         return t[e][f]=min;
//     }

    
// 

// 



class Solution {
    int[][] t = new int[101][10001];

    public int superEggDrop(int k, int n) {
        for (int i = 0; i <= k; i++) {
            Arrays.fill(t[i], -1);
        }

        return solve(k, n);
    }

    public int solve(int e, int f) {
        if (f == 0 || f == 1) {
            return f;
        }

        if (e == 1) {
            return f;
        }

        if (t[e][f] != -1) {
            return t[e][f];
        }

        int low = 1;
        int high = f;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int breakCase = solve(e - 1, mid - 1);
            int surviveCase = solve(e, f - mid);

            int temp = 1 + Math.max(breakCase, surviveCase);

            ans = Math.min(ans, temp);

            if (breakCase < surviveCase) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return t[e][f] = ans;
    }
}
