class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int p:piles){
            high=Math.max(high,p);
        }
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;
            long th=0;

            for(int p: piles){
                th+=(p+mid-1L)/mid;
            }
            if(th<=h){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}