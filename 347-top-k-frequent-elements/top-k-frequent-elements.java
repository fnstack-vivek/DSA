import java.util.*;

class Pair implements Comparable<Pair> {
    int ele;
    int freq;

    Pair(int ele, int freq) {
        this.ele = ele;
        this.freq = freq;
    }

    
    public int compareTo(Pair P) {
        if(this.freq==P.freq) return this.ele-P.ele;
        return this.freq-P.freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Pair> pq =new PriorityQueue<>();

        for (int ele :map.keySet()) {
            int freq =map.get(ele);

            pq.add(new Pair(ele,freq));

            if (pq.size() > k)
                pq.remove();
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            Pair top = pq.remove();
            ans[i]=top.ele;
        }

        return ans;
    }
}