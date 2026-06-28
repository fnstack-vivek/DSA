class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int l= nums.length;
        Stack<Integer> st=new Stack<>();
        for(int i=l-1;i>=0;i--){
            st.push(nums[i]);
        }
        int [] res=new int[l];
        for(int i=l-1;i>=0;i--){
               while(st.size()>0 && nums[i]>=st.peek()){
                st.pop();
               }
               if(st.size()==0){
                res[i]=-1;}
                else
                res[i]=st.peek();
                st.push(nums[i]);
                 
        }
        return res;

        
    }
}