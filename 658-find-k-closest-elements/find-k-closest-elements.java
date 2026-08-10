import java.util.*;
class Pair implements Comparable<Pair>{
    int diff;
    int x;
    Pair(int diff , int x){
        this.diff=diff;
        this.x=x;

    }
    public int compareTo(Pair P){
       if (this.diff != P.diff) return this.diff - P.diff;
        return this.x - P.x; 
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int p) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x : arr){
            int diff=Math.abs(x-p);
            pq.add(new Pair(diff,x));
            if(pq.size()>k)pq.remove();
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            Pair top=pq.remove();
            ans.add(top.x);
        }
        Collections.sort(ans);
        return ans;
        
    }
}