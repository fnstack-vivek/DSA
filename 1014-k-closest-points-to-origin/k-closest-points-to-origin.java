import java.util.*;
class Triplate implements Comparable<Triplate>{
    int dist;
    int x;
    int y;
    Triplate(int dist,int x, int y){
        this.dist=dist;
        this.x=x;
        this.y=y;}
        public int compareTo(Triplate T){
            return this.dist-T.dist;
        }}
class Solution {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplate> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int [] point:points){
            int x=point[0],y=point[1];
            int dist=x*x+y*y;
            pq.add(new Triplate(dist,x,y));
            if(pq.size()>k) pq.remove();
        }
        int [][] ans=new int [k][2];
        for(int i=0;i<k;i++){
            Triplate top=pq.remove();
            ans[i][0]=top.x;
            ans[i][1]=top.y;
        }
        return ans;
    }
}