class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if(i==0 && j==0){
                ans[i][j]=grid[i][j];
              }
              else if(i==0){
                ans[i][j]=grid[i][j]+ans[i][j-1];
              } 
               else if(j==0){
                ans[i][j]=grid[i][j]+ans[i-1][j];
              }
              else{
                ans[i][j]=grid[i][j]+Math.min(ans[i][j-1],ans[i-1][j]);
              } 
            }
          
            
        }
       return ans[m-1][n-1];
        
    }
}