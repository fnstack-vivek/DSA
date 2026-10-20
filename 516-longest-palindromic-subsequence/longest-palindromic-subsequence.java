class Solution {
    public int longestPalindromeSubseq(String s) {
        String a=s;
        String b = new StringBuilder(s).reverse().toString();
        int m=b.length();
        char[] X=a.toCharArray();
        char[] Y=b.toCharArray();
        return LCS(X,Y,m,m);
        
    }
     public int LCS(char[] X, char[] Y,int m, int n){
            int [][]t=new int[m+1][n+1];
            for(int i=0;i<m+1;i++){
                for(int j=0;j<n+1;j++){
                    if(i==0||j==0){
                        t[i][j]=0;
                    }
                }
            }
            for(int i=1;i<m+1;i++){
                for(int j=1;j<n+1;j++){
                    if(X[i-1]==Y[j-1]){
                        t[i][j]=1+t[i-1][j-1];
                    }
                    else{
                        t[i][j]= Math.max(t[i][j-1],t[i-1][j]);
                    }
                    }
            }
            return t[m][n];

            
        }
}