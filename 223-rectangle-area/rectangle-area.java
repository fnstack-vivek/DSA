class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        
        int w1=ax2-ax1;
        int h1=ay2-ay1;
        int a1=w1*h1;
        int w2=bx2-bx1;
        int h2=by2-by1;
        int a2=w2*h2;
        int AWO=a1+a2;
        int m1=(Math.min(ax2,bx2)-Math.max(ax1,bx1));
        int m2=(Math.min(ay2,by2)-Math.max(ay1,by1));
        int OA=0;
        if(m1>0 && m2>0){
            OA=m1*m2;
        }
        int Area=AWO-OA;
        return Area;
    }
}