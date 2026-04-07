class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
       Stack<Long> st=new Stack<>();
       st.push((long)nums[0]);
       for(int i=1;i<nums.length;i++){
        long curr=nums[i];
        while(!st.isEmpty() && st.peek()==curr){   
            curr*=2;
            st.pop();
        }
           st.push(curr);
       }
       return new ArrayList<>(st);
       
    }
}