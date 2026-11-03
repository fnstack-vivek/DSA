// class Solution {
//     public int[] maxSlidingWindow(int[] arr, int k) {
//           int n=arr.length;
//           int[]ans=new int[n-k+1];
//           int l=0;
//           PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
//           int i=0;
//           int j=0;
//           while(j<n){
//             while(!pq.isEmpty()&& pq.peek()<arr[j]){
//                 pq.remove();
//             }
//             pq.add(arr[j]);

//             if(j-i+1<k){
//                 j++;
//             }
//             if(j-i+1==k){
//                 ans[l++]=pq.peek();
//             }
//             if(pq.peek()==arr[i]){
//                 pq.remove();
//             }
//             i++;j++;
//           }
//           return ans;
        
//     }
// }
class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {

        int n = arr.length;
        int[] ans = new int[n-k+1];

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;
        int j = 0;
        int l = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();

        while(j < n) {

            pq.add(arr[j]);

            if(j-i+1 < k) {
                j++;
                continue;
            }

            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);

            ans[l++] = pq.peek();

            i++;
            j++;

            while(!pq.isEmpty() &&
                  mp.getOrDefault(pq.peek(), 0) > 0) {

                int x = pq.remove();
                mp.put(x, mp.get(x) - 1);
            }
        }

        return ans;
    }
}