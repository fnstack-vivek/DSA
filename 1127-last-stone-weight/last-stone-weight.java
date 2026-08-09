class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int a : stones){
            pq.add(a);
        }
        while(pq.size()>1){
            int x=pq.remove();
            int y=pq.remove();
            if(x>=y){ int b=x-y;
            pq.add(b);
             }
        }
        return pq.isEmpty() ? 0 :pq.peek();
    }

}