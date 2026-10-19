class Solution {
    public int minDistance(String word1, String word2) {
        char[] X=word1.toCharArray();
        char[] Y=word2.toCharArray();
        int m=word1.length();
        int n=word2.length();
           return (m+n)-2*LCS(X,Y,m,n);
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